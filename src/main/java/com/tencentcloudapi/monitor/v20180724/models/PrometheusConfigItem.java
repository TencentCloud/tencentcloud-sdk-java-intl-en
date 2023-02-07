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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusConfigItem extends AbstractModel{

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Configuration content
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * If the configuration comes from a template, this parameter is the template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Configuration content 
     * @return Config Configuration content
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration content
     * @param Config Configuration content
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get If the configuration comes from a template, this parameter is the template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateId If the configuration comes from a template, this parameter is the template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set If the configuration comes from a template, this parameter is the template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateId If the configuration comes from a template, this parameter is the template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public PrometheusConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusConfigItem(PrometheusConfigItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

