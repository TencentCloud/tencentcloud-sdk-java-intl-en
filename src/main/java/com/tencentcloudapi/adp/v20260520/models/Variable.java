/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Variable extends AbstractModel {

    /**
    * <p>Default file name.</p>
    */
    @SerializedName("DefaultFileName")
    @Expose
    private String DefaultFileName;

    /**
    * <p>Default value.</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>Variable description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Variable module type</p><p>Enumeration values:</p><ul><li>0: API parameter</li><li>1: environment parameter</li><li>2: application parameter</li><li>3: system parameter</li></ul>
    */
    @SerializedName("ModuleType")
    @Expose
    private Long ModuleType;

    /**
    * <p>Variable name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Variable type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>3: boolean value</li><li>4: object</li><li>5: array of strings</li><li>6: array of integers</li><li>7: array of floating-point numbers</li><li>8: array of boolean values</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: array of arrays</li><li>21: key</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Variable ID</p>
    */
    @SerializedName("VariableId")
    @Expose
    private String VariableId;

    /**
    * <p>Whether to enable network policy (only effective for environment variables)</p>
    */
    @SerializedName("EnableEndpoints")
    @Expose
    private Boolean EnableEndpoints;

    /**
    * <p>Network policy list (Supported: precise domain name, *.wildcard domain, with optional protocol/port/path prefix)</p>
    */
    @SerializedName("EndpointList")
    @Expose
    private String [] EndpointList;

    /**
    * <p>Whether it is a built-in variable.</p>
    */
    @SerializedName("IsBuiltin")
    @Expose
    private Boolean IsBuiltin;

    /**
    * <p>Whether it can be injected into the sandbox environment.</p>
    */
    @SerializedName("EnableSandbox")
    @Expose
    private Boolean EnableSandbox;

    /**
     * Get <p>Default file name.</p> 
     * @return DefaultFileName <p>Default file name.</p>
     */
    public String getDefaultFileName() {
        return this.DefaultFileName;
    }

    /**
     * Set <p>Default file name.</p>
     * @param DefaultFileName <p>Default file name.</p>
     */
    public void setDefaultFileName(String DefaultFileName) {
        this.DefaultFileName = DefaultFileName;
    }

    /**
     * Get <p>Default value.</p> 
     * @return DefaultValue <p>Default value.</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>Default value.</p>
     * @param DefaultValue <p>Default value.</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>Variable description</p> 
     * @return Description <p>Variable description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Variable description</p>
     * @param Description <p>Variable description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Variable module type</p><p>Enumeration values:</p><ul><li>0: API parameter</li><li>1: environment parameter</li><li>2: application parameter</li><li>3: system parameter</li></ul> 
     * @return ModuleType <p>Variable module type</p><p>Enumeration values:</p><ul><li>0: API parameter</li><li>1: environment parameter</li><li>2: application parameter</li><li>3: system parameter</li></ul>
     */
    public Long getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set <p>Variable module type</p><p>Enumeration values:</p><ul><li>0: API parameter</li><li>1: environment parameter</li><li>2: application parameter</li><li>3: system parameter</li></ul>
     * @param ModuleType <p>Variable module type</p><p>Enumeration values:</p><ul><li>0: API parameter</li><li>1: environment parameter</li><li>2: application parameter</li><li>3: system parameter</li></ul>
     */
    public void setModuleType(Long ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get <p>Variable name</p> 
     * @return Name <p>Variable name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Variable name</p>
     * @param Name <p>Variable name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Variable type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>3: boolean value</li><li>4: object</li><li>5: array of strings</li><li>6: array of integers</li><li>7: array of floating-point numbers</li><li>8: array of boolean values</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: array of arrays</li><li>21: key</li></ul> 
     * @return Type <p>Variable type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>3: boolean value</li><li>4: object</li><li>5: array of strings</li><li>6: array of integers</li><li>7: array of floating-point numbers</li><li>8: array of boolean values</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: array of arrays</li><li>21: key</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Variable type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>3: boolean value</li><li>4: object</li><li>5: array of strings</li><li>6: array of integers</li><li>7: array of floating-point numbers</li><li>8: array of boolean values</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: array of arrays</li><li>21: key</li></ul>
     * @param Type <p>Variable type</p><p>Enumeration values:</p><ul><li>0: string</li><li>1: integer</li><li>2: floating-point number</li><li>3: boolean value</li><li>4: object</li><li>5: array of strings</li><li>6: array of integers</li><li>7: array of floating-point numbers</li><li>8: array of boolean values</li><li>9: object array</li><li>10: file</li><li>11: document</li><li>12: image</li><li>13: audio</li><li>14: video</li><li>15: file array</li><li>16: document array</li><li>17: image array</li><li>18: audio array</li><li>19: video array</li><li>20: array of arrays</li><li>21: key</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Variable ID</p> 
     * @return VariableId <p>Variable ID</p>
     */
    public String getVariableId() {
        return this.VariableId;
    }

    /**
     * Set <p>Variable ID</p>
     * @param VariableId <p>Variable ID</p>
     */
    public void setVariableId(String VariableId) {
        this.VariableId = VariableId;
    }

    /**
     * Get <p>Whether to enable network policy (only effective for environment variables)</p> 
     * @return EnableEndpoints <p>Whether to enable network policy (only effective for environment variables)</p>
     */
    public Boolean getEnableEndpoints() {
        return this.EnableEndpoints;
    }

    /**
     * Set <p>Whether to enable network policy (only effective for environment variables)</p>
     * @param EnableEndpoints <p>Whether to enable network policy (only effective for environment variables)</p>
     */
    public void setEnableEndpoints(Boolean EnableEndpoints) {
        this.EnableEndpoints = EnableEndpoints;
    }

    /**
     * Get <p>Network policy list (Supported: precise domain name, *.wildcard domain, with optional protocol/port/path prefix)</p> 
     * @return EndpointList <p>Network policy list (Supported: precise domain name, *.wildcard domain, with optional protocol/port/path prefix)</p>
     */
    public String [] getEndpointList() {
        return this.EndpointList;
    }

    /**
     * Set <p>Network policy list (Supported: precise domain name, *.wildcard domain, with optional protocol/port/path prefix)</p>
     * @param EndpointList <p>Network policy list (Supported: precise domain name, *.wildcard domain, with optional protocol/port/path prefix)</p>
     */
    public void setEndpointList(String [] EndpointList) {
        this.EndpointList = EndpointList;
    }

    /**
     * Get <p>Whether it is a built-in variable.</p> 
     * @return IsBuiltin <p>Whether it is a built-in variable.</p>
     */
    public Boolean getIsBuiltin() {
        return this.IsBuiltin;
    }

    /**
     * Set <p>Whether it is a built-in variable.</p>
     * @param IsBuiltin <p>Whether it is a built-in variable.</p>
     */
    public void setIsBuiltin(Boolean IsBuiltin) {
        this.IsBuiltin = IsBuiltin;
    }

    /**
     * Get <p>Whether it can be injected into the sandbox environment.</p> 
     * @return EnableSandbox <p>Whether it can be injected into the sandbox environment.</p>
     */
    public Boolean getEnableSandbox() {
        return this.EnableSandbox;
    }

    /**
     * Set <p>Whether it can be injected into the sandbox environment.</p>
     * @param EnableSandbox <p>Whether it can be injected into the sandbox environment.</p>
     */
    public void setEnableSandbox(Boolean EnableSandbox) {
        this.EnableSandbox = EnableSandbox;
    }

    public Variable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Variable(Variable source) {
        if (source.DefaultFileName != null) {
            this.DefaultFileName = new String(source.DefaultFileName);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModuleType != null) {
            this.ModuleType = new Long(source.ModuleType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.VariableId != null) {
            this.VariableId = new String(source.VariableId);
        }
        if (source.EnableEndpoints != null) {
            this.EnableEndpoints = new Boolean(source.EnableEndpoints);
        }
        if (source.EndpointList != null) {
            this.EndpointList = new String[source.EndpointList.length];
            for (int i = 0; i < source.EndpointList.length; i++) {
                this.EndpointList[i] = new String(source.EndpointList[i]);
            }
        }
        if (source.IsBuiltin != null) {
            this.IsBuiltin = new Boolean(source.IsBuiltin);
        }
        if (source.EnableSandbox != null) {
            this.EnableSandbox = new Boolean(source.EnableSandbox);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultFileName", this.DefaultFileName);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VariableId", this.VariableId);
        this.setParamSimple(map, prefix + "EnableEndpoints", this.EnableEndpoints);
        this.setParamArraySimple(map, prefix + "EndpointList.", this.EndpointList);
        this.setParamSimple(map, prefix + "IsBuiltin", this.IsBuiltin);
        this.setParamSimple(map, prefix + "EnableSandbox", this.EnableSandbox);

    }
}

