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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomSample extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Aggregation condition.
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * Label filter.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Value obtained from the query.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * Time is the number of milliseconds since the epoch (1970-01-01 00:00 UTC) excluding leap seconds.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Unit corresponding to the metric, including s(second), bytes, bytes/s, reqs, reqs/s, checks, checks/s, iters, iters/s, VUs, %.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Metric name in PTS.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Metric name. 
     * @return Metric Metric name.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric name.
     * @param Metric Metric name.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Aggregation condition. 
     * @return Aggregation Aggregation condition.
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set Aggregation condition.
     * @param Aggregation Aggregation condition.
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get Label filter.

Note: This field may return null, indicating that no valid value is found. 
     * @return Labels Label filter.

Note: This field may return null, indicating that no valid value is found.
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Label filter.

Note: This field may return null, indicating that no valid value is found.
     * @param Labels Label filter.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Value obtained from the query. 
     * @return Value Value obtained from the query.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Value obtained from the query.
     * @param Value Value obtained from the query.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get Time is the number of milliseconds since the epoch (1970-01-01 00:00 UTC) excluding leap seconds. 
     * @return Timestamp Time is the number of milliseconds since the epoch (1970-01-01 00:00 UTC) excluding leap seconds.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Time is the number of milliseconds since the epoch (1970-01-01 00:00 UTC) excluding leap seconds.
     * @param Timestamp Time is the number of milliseconds since the epoch (1970-01-01 00:00 UTC) excluding leap seconds.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Unit corresponding to the metric, including s(second), bytes, bytes/s, reqs, reqs/s, checks, checks/s, iters, iters/s, VUs, %. 
     * @return Unit Unit corresponding to the metric, including s(second), bytes, bytes/s, reqs, reqs/s, checks, checks/s, iters, iters/s, VUs, %.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit corresponding to the metric, including s(second), bytes, bytes/s, reqs, reqs/s, checks, checks/s, iters, iters/s, VUs, %.
     * @param Unit Unit corresponding to the metric, including s(second), bytes, bytes/s, reqs, reqs/s, checks, checks/s, iters, iters/s, VUs, %.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Metric name in PTS.

Note: This field may return null, indicating that no valid value is found. 
     * @return Name Metric name in PTS.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Metric name in PTS.

Note: This field may return null, indicating that no valid value is found.
     * @param Name Metric name in PTS.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CustomSample() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomSample(CustomSample source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

