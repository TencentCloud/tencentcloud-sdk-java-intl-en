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

public class PrometheusTemp extends AbstractModel{

    /**
    * Template name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template dimension. Valid values:
`instance`
`cluster`
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Template description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * This parameter is valid if `Level` is `instance`.
List of recording rules in the template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordRules")
    @Expose
    private PrometheusConfigItem [] RecordRules;

    /**
    * This parameter is valid if `Level` is `cluster`.
List of ServiceMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private PrometheusConfigItem [] ServiceMonitors;

    /**
    * This parameter is valid if `Level` is `cluster`.
List of PodMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodMonitors")
    @Expose
    private PrometheusConfigItem [] PodMonitors;

    /**
    * This parameter is valid if `Level` is `cluster`.
List of RawJob rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RawJobs")
    @Expose
    private PrometheusConfigItem [] RawJobs;

    /**
    * Template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Last update time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The current version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Whether it is the default template provided by the system, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * This parameter is valid if `Level` is `instance`.
List of alert configurations in the template
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlertDetailRules")
    @Expose
    private PrometheusAlertPolicyItem [] AlertDetailRules;

    /**
    * Number of associated instances
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetsTotal")
    @Expose
    private Long TargetsTotal;

    /**
     * Get Template name 
     * @return Name Template name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name
     * @param Name Template name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template dimension. Valid values:
`instance`
`cluster` 
     * @return Level Template dimension. Valid values:
`instance`
`cluster`
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Template dimension. Valid values:
`instance`
`cluster`
     * @param Level Template dimension. Valid values:
`instance`
`cluster`
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Template description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Describe Template description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Template description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Describe Template description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get This parameter is valid if `Level` is `instance`.
List of recording rules in the template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordRules This parameter is valid if `Level` is `instance`.
List of recording rules in the template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusConfigItem [] getRecordRules() {
        return this.RecordRules;
    }

    /**
     * Set This parameter is valid if `Level` is `instance`.
List of recording rules in the template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordRules This parameter is valid if `Level` is `instance`.
List of recording rules in the template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordRules(PrometheusConfigItem [] RecordRules) {
        this.RecordRules = RecordRules;
    }

    /**
     * Get This parameter is valid if `Level` is `cluster`.
List of ServiceMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceMonitors This parameter is valid if `Level` is `cluster`.
List of ServiceMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusConfigItem [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set This parameter is valid if `Level` is `cluster`.
List of ServiceMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceMonitors This parameter is valid if `Level` is `cluster`.
List of ServiceMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceMonitors(PrometheusConfigItem [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get This parameter is valid if `Level` is `cluster`.
List of PodMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PodMonitors This parameter is valid if `Level` is `cluster`.
List of PodMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusConfigItem [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set This parameter is valid if `Level` is `cluster`.
List of PodMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PodMonitors This parameter is valid if `Level` is `cluster`.
List of PodMonitor rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPodMonitors(PrometheusConfigItem [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get This parameter is valid if `Level` is `cluster`.
List of RawJob rules in the template.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RawJobs This parameter is valid if `Level` is `cluster`.
List of RawJob rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusConfigItem [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set This parameter is valid if `Level` is `cluster`.
List of RawJob rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RawJobs This parameter is valid if `Level` is `cluster`.
List of RawJob rules in the template.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRawJobs(PrometheusConfigItem [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    /**
     * Get Template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateId Template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateId Template ID, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Last update time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Last update time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Last update time, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The current version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version The current version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set The current version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version The current version, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Whether it is the default template provided by the system, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDefault Whether it is the default template provided by the system, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default template provided by the system, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDefault Whether it is the default template provided by the system, which is used as an output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get This parameter is valid if `Level` is `instance`.
List of alert configurations in the template
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlertDetailRules This parameter is valid if `Level` is `instance`.
List of alert configurations in the template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusAlertPolicyItem [] getAlertDetailRules() {
        return this.AlertDetailRules;
    }

    /**
     * Set This parameter is valid if `Level` is `instance`.
List of alert configurations in the template
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlertDetailRules This parameter is valid if `Level` is `instance`.
List of alert configurations in the template
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlertDetailRules(PrometheusAlertPolicyItem [] AlertDetailRules) {
        this.AlertDetailRules = AlertDetailRules;
    }

    /**
     * Get Number of associated instances
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetsTotal Number of associated instances
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTargetsTotal() {
        return this.TargetsTotal;
    }

    /**
     * Set Number of associated instances
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetsTotal Number of associated instances
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetsTotal(Long TargetsTotal) {
        this.TargetsTotal = TargetsTotal;
    }

    public PrometheusTemp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusTemp(PrometheusTemp source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.RecordRules != null) {
            this.RecordRules = new PrometheusConfigItem[source.RecordRules.length];
            for (int i = 0; i < source.RecordRules.length; i++) {
                this.RecordRules[i] = new PrometheusConfigItem(source.RecordRules[i]);
            }
        }
        if (source.ServiceMonitors != null) {
            this.ServiceMonitors = new PrometheusConfigItem[source.ServiceMonitors.length];
            for (int i = 0; i < source.ServiceMonitors.length; i++) {
                this.ServiceMonitors[i] = new PrometheusConfigItem(source.ServiceMonitors[i]);
            }
        }
        if (source.PodMonitors != null) {
            this.PodMonitors = new PrometheusConfigItem[source.PodMonitors.length];
            for (int i = 0; i < source.PodMonitors.length; i++) {
                this.PodMonitors[i] = new PrometheusConfigItem(source.PodMonitors[i]);
            }
        }
        if (source.RawJobs != null) {
            this.RawJobs = new PrometheusConfigItem[source.RawJobs.length];
            for (int i = 0; i < source.RawJobs.length; i++) {
                this.RawJobs[i] = new PrometheusConfigItem(source.RawJobs[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.AlertDetailRules != null) {
            this.AlertDetailRules = new PrometheusAlertPolicyItem[source.AlertDetailRules.length];
            for (int i = 0; i < source.AlertDetailRules.length; i++) {
                this.AlertDetailRules[i] = new PrometheusAlertPolicyItem(source.AlertDetailRules[i]);
            }
        }
        if (source.TargetsTotal != null) {
            this.TargetsTotal = new Long(source.TargetsTotal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamArrayObj(map, prefix + "RecordRules.", this.RecordRules);
        this.setParamArrayObj(map, prefix + "ServiceMonitors.", this.ServiceMonitors);
        this.setParamArrayObj(map, prefix + "PodMonitors.", this.PodMonitors);
        this.setParamArrayObj(map, prefix + "RawJobs.", this.RawJobs);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamArrayObj(map, prefix + "AlertDetailRules.", this.AlertDetailRules);
        this.setParamSimple(map, prefix + "TargetsTotal", this.TargetsTotal);

    }
}

