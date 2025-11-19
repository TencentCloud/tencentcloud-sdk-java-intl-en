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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmPrometheusRules extends AbstractModel {

    /**
    * Metric match rule ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Metric match rule name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Applications where the rule takes effect. input an empty string for all applications.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Specifies the metric match rule status: 1 (enabled), 2 (disabled).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Specifies the metric match rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricNameRule")
    @Expose
    private String MetricNameRule;

    /**
    * Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricMatchType")
    @Expose
    private Long MetricMatchType;

    /**
     * Get Metric match rule ID. 
     * @return Id Metric match rule ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Metric match rule ID.
     * @param Id Metric match rule ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Metric match rule name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Metric match rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Metric match rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Metric match rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Applications where the rule takes effect. input an empty string for all applications.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceName Applications where the rule takes effect. input an empty string for all applications.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Applications where the rule takes effect. input an empty string for all applications.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceName Applications where the rule takes effect. input an empty string for all applications.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Specifies the metric match rule status: 1 (enabled), 2 (disabled).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Specifies the metric match rule status: 1 (enabled), 2 (disabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Specifies the metric match rule status: 1 (enabled), 2 (disabled).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Specifies the metric match rule status: 1 (enabled), 2 (disabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies the metric match rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricNameRule Specifies the metric match rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMetricNameRule() {
        return this.MetricNameRule;
    }

    /**
     * Set Specifies the metric match rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricNameRule Specifies the metric match rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricNameRule(String MetricNameRule) {
        this.MetricNameRule = MetricNameRule;
    }

    /**
     * Get Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricMatchType Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMetricMatchType() {
        return this.MetricMatchType;
    }

    /**
     * Set Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricMatchType Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricMatchType(Long MetricMatchType) {
        this.MetricMatchType = MetricMatchType;
    }

    public ApmPrometheusRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmPrometheusRules(ApmPrometheusRules source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MetricNameRule != null) {
            this.MetricNameRule = new String(source.MetricNameRule);
        }
        if (source.MetricMatchType != null) {
            this.MetricMatchType = new Long(source.MetricMatchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MetricNameRule", this.MetricNameRule);
        this.setParamSimple(map, prefix + "MetricMatchType", this.MetricMatchType);

    }
}

