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

public class ModifyApmPrometheusRuleRequest extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the rule name to modify.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule status: 1 (enabled), 2 (disabled), 3 (deleted).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Applications where the rule takes effect. input an empty string for all applications. if this is not modified, pass the old rule.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Match type: 0 - precision match, 1 - prefix match, 2 - suffix match (if not modified, the old rule must be passed).
    */
    @SerializedName("MetricMatchType")
    @Expose
    private Long MetricMatchType;

    /**
    * Specifies the rule for customer-defined metric names with cache hit.
    */
    @SerializedName("MetricNameRule")
    @Expose
    private String MetricNameRule;

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Business system ID 
     * @return InstanceId Business system ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system ID
     * @param InstanceId Business system ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the rule name to modify. 
     * @return Name Specifies the rule name to modify.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the rule name to modify.
     * @param Name Specifies the rule name to modify.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule status: 1 (enabled), 2 (disabled), 3 (deleted). 
     * @return Status Rule status: 1 (enabled), 2 (disabled), 3 (deleted).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status: 1 (enabled), 2 (disabled), 3 (deleted).
     * @param Status Rule status: 1 (enabled), 2 (disabled), 3 (deleted).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Applications where the rule takes effect. input an empty string for all applications. if this is not modified, pass the old rule. 
     * @return ServiceName Applications where the rule takes effect. input an empty string for all applications. if this is not modified, pass the old rule.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Applications where the rule takes effect. input an empty string for all applications. if this is not modified, pass the old rule.
     * @param ServiceName Applications where the rule takes effect. input an empty string for all applications. if this is not modified, pass the old rule.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Match type: 0 - precision match, 1 - prefix match, 2 - suffix match (if not modified, the old rule must be passed). 
     * @return MetricMatchType Match type: 0 - precision match, 1 - prefix match, 2 - suffix match (if not modified, the old rule must be passed).
     */
    public Long getMetricMatchType() {
        return this.MetricMatchType;
    }

    /**
     * Set Match type: 0 - precision match, 1 - prefix match, 2 - suffix match (if not modified, the old rule must be passed).
     * @param MetricMatchType Match type: 0 - precision match, 1 - prefix match, 2 - suffix match (if not modified, the old rule must be passed).
     */
    public void setMetricMatchType(Long MetricMatchType) {
        this.MetricMatchType = MetricMatchType;
    }

    /**
     * Get Specifies the rule for customer-defined metric names with cache hit. 
     * @return MetricNameRule Specifies the rule for customer-defined metric names with cache hit.
     */
    public String getMetricNameRule() {
        return this.MetricNameRule;
    }

    /**
     * Set Specifies the rule for customer-defined metric names with cache hit.
     * @param MetricNameRule Specifies the rule for customer-defined metric names with cache hit.
     */
    public void setMetricNameRule(String MetricNameRule) {
        this.MetricNameRule = MetricNameRule;
    }

    public ModifyApmPrometheusRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmPrometheusRuleRequest(ModifyApmPrometheusRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.MetricMatchType != null) {
            this.MetricMatchType = new Long(source.MetricMatchType);
        }
        if (source.MetricNameRule != null) {
            this.MetricNameRule = new String(source.MetricNameRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "MetricMatchType", this.MetricMatchType);
        this.setParamSimple(map, prefix + "MetricNameRule", this.MetricNameRule);

    }
}

