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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertRuleDetail extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule list
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertRule [] Rules;

    /**
    * Last modification time
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Alarm delivery methods
    */
    @SerializedName("Notification")
    @Expose
    private PrometheusNotification Notification;

    /**
    * Alarm rule ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * If the alarm is delivered via a template, the TemplateId is the template ID.
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Alarm interval
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

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
     * Get Rule list 
     * @return Rules Rule list
     */
    public PrometheusAlertRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Rule list
     * @param Rules Rule list
     */
    public void setRules(PrometheusAlertRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Last modification time 
     * @return UpdatedAt Last modification time
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Last modification time
     * @param UpdatedAt Last modification time
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Alarm delivery methods 
     * @return Notification Alarm delivery methods
     */
    public PrometheusNotification getNotification() {
        return this.Notification;
    }

    /**
     * Set Alarm delivery methods
     * @param Notification Alarm delivery methods
     */
    public void setNotification(PrometheusNotification Notification) {
        this.Notification = Notification;
    }

    /**
     * Get Alarm rule ID 
     * @return Id Alarm rule ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Alarm rule ID
     * @param Id Alarm rule ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get If the alarm is delivered via a template, the TemplateId is the template ID.
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return TemplateId If the alarm is delivered via a template, the TemplateId is the template ID.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set If the alarm is delivered via a template, the TemplateId is the template ID.
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param TemplateId If the alarm is delivered via a template, the TemplateId is the template ID.
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Alarm interval
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return Interval Alarm interval
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Alarm interval
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param Interval Alarm interval
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public PrometheusAlertRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertRuleDetail(PrometheusAlertRuleDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new PrometheusAlertRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PrometheusAlertRule(source.Rules[i]);
            }
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Notification != null) {
            this.Notification = new PrometheusNotification(source.Notification);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "Notification.", this.Notification);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

