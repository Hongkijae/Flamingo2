/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.30 at 02:11:34 오후 KST 
//


package org.opencloudengine.flamingo2.model.workflow;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openflamingo.org/schema/workflow}prepare" minOccurs="0"/>
 *         &lt;element ref="{http://www.openflamingo.org/schema/workflow}clusterName" minOccurs="0"/>
 *         &lt;element ref="{http://www.openflamingo.org/schema/workflow}variables" minOccurs="0"/>
 *         &lt;element name="script" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="override" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prepare",
    "clusterName",
    "variables",
    "script"
})
@XmlRootElement(name = "hive")
public class Hive {

    protected Prepare prepare;
    protected ClusterName clusterName;
    protected Variables variables;
    @XmlElement(required = true)
    protected String script;
    @XmlAttribute(name = "override")
    protected Boolean override;

    /**
     * Gets the value of the prepare property.
     * 
     * @return
     *     possible object is
     *     {@link Prepare }
     *     
     */
    public Prepare getPrepare() {
        return prepare;
    }

    /**
     * Sets the value of the prepare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prepare }
     *     
     */
    public void setPrepare(Prepare value) {
        this.prepare = value;
    }

    /**
     * Gets the value of the clusterName property.
     * 
     * @return
     *     possible object is
     *     {@link ClusterName }
     *     
     */
    public ClusterName getClusterName() {
        return clusterName;
    }

    /**
     * Sets the value of the clusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClusterName }
     *     
     */
    public void setClusterName(ClusterName value) {
        this.clusterName = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link Variables }
     *     
     */
    public Variables getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variables }
     *     
     */
    public void setVariables(Variables value) {
        this.variables = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverride() {
        if (override == null) {
            return true;
        } else {
            return override;
        }
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

}
