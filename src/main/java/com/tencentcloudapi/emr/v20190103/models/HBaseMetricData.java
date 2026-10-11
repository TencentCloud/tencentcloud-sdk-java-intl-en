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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HBaseMetricData extends AbstractModel {

    /**
    * Metric name, for example, read_request_rate.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Metric description, for example, read request rate.
    */
    @SerializedName("MetricDesc")
    @Expose
    private String MetricDesc;

    /**
    * Timestamp array.
    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * Numeric array.
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
     * Get Metric name, for example, read_request_rate. 
     * @return MetricName Metric name, for example, read_request_rate.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name, for example, read_request_rate.
     * @param MetricName Metric name, for example, read_request_rate.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Metric description, for example, read request rate. 
     * @return MetricDesc Metric description, for example, read request rate.
     */
    public String getMetricDesc() {
        return this.MetricDesc;
    }

    /**
     * Set Metric description, for example, read request rate.
     * @param MetricDesc Metric description, for example, read request rate.
     */
    public void setMetricDesc(String MetricDesc) {
        this.MetricDesc = MetricDesc;
    }

    /**
     * Get Timestamp array. 
     * @return Timestamps Timestamp array.
     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set Timestamp array.
     * @param Timestamps Timestamp array.
     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get Numeric array. 
     * @return Values Numeric array.
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set Numeric array.
     * @param Values Numeric array.
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    public HBaseMetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HBaseMetricData(HBaseMetricData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricDesc != null) {
            this.MetricDesc = new String(source.MetricDesc);
        }
        if (source.Timestamps != null) {
            this.Timestamps = new Long[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Long(source.Timestamps[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricDesc", this.MetricDesc);
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

