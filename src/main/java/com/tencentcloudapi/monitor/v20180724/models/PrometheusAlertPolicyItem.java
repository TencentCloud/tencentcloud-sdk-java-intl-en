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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertPolicyItem extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of rules
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertRule [] Rules;

    /**
    * Alerting rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * If the alert comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Alert channel, which may be returned as null if used in a template.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Notification")
    @Expose
    private PrometheusNotificationItem Notification;

    /**
    * Last modification time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * If the alerting rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Rule name 
     * @return Name Rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
     * @param Name Rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of rules 
     * @return Rules List of rules
     */
    public PrometheusAlertRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of rules
     * @param Rules List of rules
     */
    public void setRules(PrometheusAlertRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Alerting rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Alerting rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Alerting rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Alerting rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get If the alert comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateId If the alert comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set If the alert comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateId If the alert comes from a template, `TemplateId` is the template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Alert channel, which may be returned as null if used in a template.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Notification Alert channel, which may be returned as null if used in a template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusNotificationItem getNotification() {
        return this.Notification;
    }

    /**
     * Set Alert channel, which may be returned as null if used in a template.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Notification Alert channel, which may be returned as null if used in a template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNotification(PrometheusNotificationItem Notification) {
        this.Notification = Notification;
    }

    /**
     * Get Last modification time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Last modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Last modification time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Last modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get If the alerting rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId If the alerting rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set If the alerting rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId If the alerting rule comes from the user cluster CRD resource definition, `ClusterId` is the cluster ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public PrometheusAlertPolicyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertPolicyItem(PrometheusAlertPolicyItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new PrometheusAlertRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PrometheusAlertRule(source.Rules[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Notification != null) {
            this.Notification = new PrometheusNotificationItem(source.Notification);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
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
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamObj(map, prefix + "Notification.", this.Notification);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

