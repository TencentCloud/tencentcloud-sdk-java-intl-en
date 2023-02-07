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

public class PrometheusRecordRuleYamlItem extends AbstractModel{

    /**
    * Instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Last update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * YAML content
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * If the recording rule comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * If the recording rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Instance name 
     * @return Name Instance name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name
     * @param Name Instance name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Last update time 
     * @return UpdateTime Last update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time
     * @param UpdateTime Last update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get YAML content 
     * @return TemplateId YAML content
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set YAML content
     * @param TemplateId YAML content
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get If the recording rule comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Content If the recording rule comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set If the recording rule comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Content If the recording rule comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get If the recording rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId If the recording rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set If the recording rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId If the recording rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public PrometheusRecordRuleYamlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusRecordRuleYamlItem(PrometheusRecordRuleYamlItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

