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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigListItem extends AbstractModel {

    /**
    * Configuration ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Configuration type
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * Configuration name
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Configuration content
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * Configuration creation time
    */
    @SerializedName("CreateTimestamp")
    @Expose
    private String CreateTimestamp;

    /**
    * Configuration modification time
    */
    @SerializedName("UpdateTimestamp")
    @Expose
    private String UpdateTimestamp;

    /**
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private TagInfo [] Tag;

    /**
     * Get Configuration ID 
     * @return ConfigId Configuration ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Configuration ID
     * @param ConfigId Configuration ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Configuration type 
     * @return ConfigType Configuration type
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set Configuration type
     * @param ConfigType Configuration type
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get Configuration name 
     * @return ConfigName Configuration name
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Configuration name
     * @param ConfigName Configuration name
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get Configuration content 
     * @return ConfigContent Configuration content
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set Configuration content
     * @param ConfigContent Configuration content
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get Configuration creation time 
     * @return CreateTimestamp Configuration creation time
     */
    public String getCreateTimestamp() {
        return this.CreateTimestamp;
    }

    /**
     * Set Configuration creation time
     * @param CreateTimestamp Configuration creation time
     */
    public void setCreateTimestamp(String CreateTimestamp) {
        this.CreateTimestamp = CreateTimestamp;
    }

    /**
     * Get Configuration modification time 
     * @return UpdateTimestamp Configuration modification time
     */
    public String getUpdateTimestamp() {
        return this.UpdateTimestamp;
    }

    /**
     * Set Configuration modification time
     * @param UpdateTimestamp Configuration modification time
     */
    public void setUpdateTimestamp(String UpdateTimestamp) {
        this.UpdateTimestamp = UpdateTimestamp;
    }

    /**
     * Get Tag. 
     * @return Tag Tag.
     */
    public TagInfo [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag.
     * @param Tag Tag.
     */
    public void setTag(TagInfo [] Tag) {
        this.Tag = Tag;
    }

    public ConfigListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigListItem(ConfigListItem source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
        if (source.CreateTimestamp != null) {
            this.CreateTimestamp = new String(source.CreateTimestamp);
        }
        if (source.UpdateTimestamp != null) {
            this.UpdateTimestamp = new String(source.UpdateTimestamp);
        }
        if (source.Tag != null) {
            this.Tag = new TagInfo[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new TagInfo(source.Tag[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamSimple(map, prefix + "CreateTimestamp", this.CreateTimestamp);
        this.setParamSimple(map, prefix + "UpdateTimestamp", this.UpdateTimestamp);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);

    }
}

