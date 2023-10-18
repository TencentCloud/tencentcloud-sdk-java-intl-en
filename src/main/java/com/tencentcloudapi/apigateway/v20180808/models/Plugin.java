/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class Plugin extends AbstractModel {

    /**
    * Plugin ID
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

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
    * Plugin definition statement
    */
    @SerializedName("PluginData")
    @Expose
    private String PluginData;

    /**
    * Plugin description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Plugin creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Plugin modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * Total number of APIs bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttachedApiTotalCount")
    @Expose
    private Long AttachedApiTotalCount;

    /**
    * Information of the API bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttachedApis")
    @Expose
    private AttachedApiInfo [] AttachedApis;

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

    /**
     * Get Plugin description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Plugin description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Plugin description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Plugin description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Plugin creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used. 
     * @return CreatedTime Plugin creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Plugin creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     * @param CreatedTime Plugin creation time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Plugin modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used 
     * @return ModifiedTime Plugin modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set Plugin modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
     * @param ModifiedTime Plugin modification time in the format of YYYY-MM-DDThh:mm:ssZ according to ISO 8601 standard. UTC time is used
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get Total number of APIs bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AttachedApiTotalCount Total number of APIs bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttachedApiTotalCount() {
        return this.AttachedApiTotalCount;
    }

    /**
     * Set Total number of APIs bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AttachedApiTotalCount Total number of APIs bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAttachedApiTotalCount(Long AttachedApiTotalCount) {
        this.AttachedApiTotalCount = AttachedApiTotalCount;
    }

    /**
     * Get Information of the API bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AttachedApis Information of the API bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AttachedApiInfo [] getAttachedApis() {
        return this.AttachedApis;
    }

    /**
     * Set Information of the API bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AttachedApis Information of the API bound with the plugin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAttachedApis(AttachedApiInfo [] AttachedApis) {
        this.AttachedApis = AttachedApis;
    }

    public Plugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Plugin(Plugin source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginType != null) {
            this.PluginType = new String(source.PluginType);
        }
        if (source.PluginData != null) {
            this.PluginData = new String(source.PluginData);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.AttachedApiTotalCount != null) {
            this.AttachedApiTotalCount = new Long(source.AttachedApiTotalCount);
        }
        if (source.AttachedApis != null) {
            this.AttachedApis = new AttachedApiInfo[source.AttachedApis.length];
            for (int i = 0; i < source.AttachedApis.length; i++) {
                this.AttachedApis[i] = new AttachedApiInfo(source.AttachedApis[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "PluginData", this.PluginData);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "AttachedApiTotalCount", this.AttachedApiTotalCount);
        this.setParamArrayObj(map, prefix + "AttachedApis.", this.AttachedApis);

    }
}

