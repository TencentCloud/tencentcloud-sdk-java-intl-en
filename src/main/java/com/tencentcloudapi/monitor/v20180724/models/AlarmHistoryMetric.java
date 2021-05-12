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

public class AlarmHistoryMetric extends AbstractModel{

    /**
    * Namespace used to query data by Tencent Cloud service monitoring type
    */
    @SerializedName("QceNamespace")
    @Expose
    private String QceNamespace;

    /**
    * Metric name
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Statistical period
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Value triggering alarm
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Metric display name
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Namespace used to query data by Tencent Cloud service monitoring type 
     * @return QceNamespace Namespace used to query data by Tencent Cloud service monitoring type
     */
    public String getQceNamespace() {
        return this.QceNamespace;
    }

    /**
     * Set Namespace used to query data by Tencent Cloud service monitoring type
     * @param QceNamespace Namespace used to query data by Tencent Cloud service monitoring type
     */
    public void setQceNamespace(String QceNamespace) {
        this.QceNamespace = QceNamespace;
    }

    /**
     * Get Metric name 
     * @return MetricName Metric name
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name
     * @param MetricName Metric name
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Statistical period 
     * @return Period Statistical period
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical period
     * @param Period Statistical period
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Value triggering alarm 
     * @return Value Value triggering alarm
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value triggering alarm
     * @param Value Value triggering alarm
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Metric display name 
     * @return Description Metric display name
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Metric display name
     * @param Description Metric display name
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AlarmHistoryMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmHistoryMetric(AlarmHistoryMetric source) {
        if (source.QceNamespace != null) {
            this.QceNamespace = new String(source.QceNamespace);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QceNamespace", this.QceNamespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

