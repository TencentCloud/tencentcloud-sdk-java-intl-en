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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachedPluginInfo extends AbstractModel {

    /**
    * Plugin ID
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * Environment information
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Binding time
    */
    @SerializedName("AttachedTime")
    @Expose
    private String AttachedTime;

    /**
    * Plugin name
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * Plugin type
    */
    @SerializedName("PluginType")
    @Expose
    private String PluginType;

    /**
    * Plugin description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Plugin definition statement
    */
    @SerializedName("PluginData")
    @Expose
    private String PluginData;

    /**
     * Get Plugin ID 
     * @return PluginId Plugin ID
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set Plugin ID
     * @param PluginId Plugin ID
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get Environment information 
     * @return Environment Environment information
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Environment information
     * @param Environment Environment information
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Binding time 
     * @return AttachedTime Binding time
     */
    public String getAttachedTime() {
        return this.AttachedTime;
    }

    /**
     * Set Binding time
     * @param AttachedTime Binding time
     */
    public void setAttachedTime(String AttachedTime) {
        this.AttachedTime = AttachedTime;
    }

    /**
     * Get Plugin name 
     * @return PluginName Plugin name
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set Plugin name
     * @param PluginName Plugin name
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get Plugin type 
     * @return PluginType Plugin type
     */
    public String getPluginType() {
        return this.PluginType;
    }

    /**
     * Set Plugin type
     * @param PluginType Plugin type
     */
    public void setPluginType(String PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get Plugin description 
     * @return Description Plugin description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Plugin description
     * @param Description Plugin description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Plugin definition statement 
     * @return PluginData Plugin definition statement
     */
    public String getPluginData() {
        return this.PluginData;
    }

    /**
     * Set Plugin definition statement
     * @param PluginData Plugin definition statement
     */
    public void setPluginData(String PluginData) {
        this.PluginData = PluginData;
    }

    public AttachedPluginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedPluginInfo(AttachedPluginInfo source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.AttachedTime != null) {
            this.AttachedTime = new String(source.AttachedTime);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginType != null) {
            this.PluginType = new String(source.PluginType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PluginData != null) {
            this.PluginData = new String(source.PluginData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "AttachedTime", this.AttachedTime);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PluginData", this.PluginData);

    }
}

