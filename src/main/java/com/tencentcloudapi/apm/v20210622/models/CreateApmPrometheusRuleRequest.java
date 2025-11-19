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

public class CreateApmPrometheusRuleRequest extends AbstractModel {

    /**
    * Metric match rule name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Applications where the rule takes effect. input an empty string for all applications.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
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
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Metric match rule name. 
     * @return Name Metric match rule name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Metric match rule name.
     * @param Name Metric match rule name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Applications where the rule takes effect. input an empty string for all applications. 
     * @return ServiceName Applications where the rule takes effect. input an empty string for all applications.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Applications where the rule takes effect. input an empty string for all applications.
     * @param ServiceName Applications where the rule takes effect. input an empty string for all applications.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Match type: 0 - precision match, 1 - prefix match, 2 - suffix match. 
     * @return MetricMatchType Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
     */
    public Long getMetricMatchType() {
        return this.MetricMatchType;
    }

    /**
     * Set Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
     * @param MetricMatchType Match type: 0 - precision match, 1 - prefix match, 2 - suffix match.
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

    public CreateApmPrometheusRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApmPrometheusRuleRequest(CreateApmPrometheusRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "MetricMatchType", this.MetricMatchType);
        this.setParamSimple(map, prefix + "MetricNameRule", this.MetricNameRule);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

