/**
 * Copyright (C) 2011 Flamingo Project (http://www.cloudine.io).
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.opencloudengine.flamingo2.mapreduce.etl.sequence;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.LineRecordReader;
import org.opencloudengine.flamingo2.mapreduce.util.HdfsUtils;

import java.io.IOException;

public class FullTextFileReader extends RecordReader<Text, Text> {

    private final LineRecordReader lineRecordReader;

    private Text key = new Text();

    private Text value = new Text();

    public FullTextFileReader() throws IOException {
        lineRecordReader = new LineRecordReader();
    }

    public void initialize(InputSplit inputSplit, TaskAttemptContext context) throws IOException {
        lineRecordReader.initialize(inputSplit, context);
        key.set(HdfsUtils.getFilename(inputSplit));
    }

    public synchronized boolean nextKeyValue() throws IOException {
        StringBuilder builder = new StringBuilder();
        while (lineRecordReader.nextKeyValue()) {
            Text text = lineRecordReader.getCurrentValue();
            builder.append(text.toString());
            System.out.println(text.toString());
        }
        value.set(builder.toString());
        return true;
    }

    public Text getCurrentKey() {
        return key;
    }

    public Text getCurrentValue() {
        return value;
    }

    public float getProgress() throws IOException {
        return lineRecordReader.getProgress();
    }

    public synchronized void close() throws IOException {
        lineRecordReader.close();
    }
}