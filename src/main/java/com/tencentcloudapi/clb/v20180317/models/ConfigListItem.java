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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigListItem extends AbstractModel {

    /**
    * Configuration ID.
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * Configuration type.
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * Configuration name.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Configuration content.
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * Creates configuration time.
    */
    @SerializedName("CreateTimestamp")
    @Expose
    private String CreateTimestamp;

    /**
    * Modifies configuration time.
    */
    @SerializedName("UpdateTimestamp")
    @Expose
    private String UpdateTimestamp;

    /**
     * Get Configuration ID. 
     * @return UconfigId Configuration ID.
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set Configuration ID.
     * @param UconfigId Configuration ID.
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get Configuration type. 
     * @return ConfigType Configuration type.
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set Configuration type.
     * @param ConfigType Configuration type.
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get Configuration name.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ConfigName Configuration name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Configuration name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ConfigName Configuration name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get Configuration content. 
     * @return ConfigContent Configuration content.
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set Configuration content.
     * @param ConfigContent Configuration content.
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get Creates configuration time. 
     * @return CreateTimestamp Creates configuration time.
     */
    public String getCreateTimestamp() {
        return this.CreateTimestamp;
    }

    /**
     * Set Creates configuration time.
     * @param CreateTimestamp Creates configuration time.
     */
    public void setCreateTimestamp(String CreateTimestamp) {
        this.CreateTimestamp = CreateTimestamp;
    }

    /**
     * Get Modifies configuration time. 
     * @return UpdateTimestamp Modifies configuration time.
     */
    public String getUpdateTimestamp() {
        return this.UpdateTimestamp;
    }

    /**
     * Set Modifies configuration time.
     * @param UpdateTimestamp Modifies configuration time.
     */
    public void setUpdateTimestamp(String UpdateTimestamp) {
        this.UpdateTimestamp = UpdateTimestamp;
    }

    public ConfigListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigListItem(ConfigListItem source) {
        if (source.UconfigId != null) {
            this.UconfigId = new String(source.UconfigId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UconfigId", this.UconfigId);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamSimple(map, prefix + "CreateTimestamp", this.CreateTimestamp);
        this.setParamSimple(map, prefix + "UpdateTimestamp", this.UpdateTimestamp);

    }
}

