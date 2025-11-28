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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddCustomizedConfigRequest extends AbstractModel {

    /**
    * Configuration name
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Configuration type. valid values: ["CLB", "SERVER", "LOCATION"], respectively indicating CLB configuration, SERVER configuration, and LOCATION configuration.
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * Specifies the configuration content.
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

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
     * Get Configuration type. valid values: ["CLB", "SERVER", "LOCATION"], respectively indicating CLB configuration, SERVER configuration, and LOCATION configuration. 
     * @return ConfigType Configuration type. valid values: ["CLB", "SERVER", "LOCATION"], respectively indicating CLB configuration, SERVER configuration, and LOCATION configuration.
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set Configuration type. valid values: ["CLB", "SERVER", "LOCATION"], respectively indicating CLB configuration, SERVER configuration, and LOCATION configuration.
     * @param ConfigType Configuration type. valid values: ["CLB", "SERVER", "LOCATION"], respectively indicating CLB configuration, SERVER configuration, and LOCATION configuration.
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get Specifies the configuration content. 
     * @return ConfigContent Specifies the configuration content.
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set Specifies the configuration content.
     * @param ConfigContent Specifies the configuration content.
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public AddCustomizedConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomizedConfigRequest(AddCustomizedConfigRequest source) {
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

