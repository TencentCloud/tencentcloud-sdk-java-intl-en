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

public class CustomSampleMatrix extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Aggregation function.
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * Metric unit.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Metric sequence array.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Streams")
    @Expose
    private SampleStream [] Streams;

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
     * Get Aggregation function. 
     * @return Aggregation Aggregation function.
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set Aggregation function.
     * @param Aggregation Aggregation function.
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get Metric unit.

Note: This field may return null, indicating that no valid value is found. 
     * @return Unit Metric unit.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Metric unit.

Note: This field may return null, indicating that no valid value is found.
     * @param Unit Metric unit.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Metric sequence array.

Note: This field may return null, indicating that no valid value is found. 
     * @return Streams Metric sequence array.

Note: This field may return null, indicating that no valid value is found.
     */
    public SampleStream [] getStreams() {
        return this.Streams;
    }

    /**
     * Set Metric sequence array.

Note: This field may return null, indicating that no valid value is found.
     * @param Streams Metric sequence array.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStreams(SampleStream [] Streams) {
        this.Streams = Streams;
    }

    public CustomSampleMatrix() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomSampleMatrix(CustomSampleMatrix source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Streams != null) {
            this.Streams = new SampleStream[source.Streams.length];
            for (int i = 0; i < source.Streams.length; i++) {
                this.Streams[i] = new SampleStream(source.Streams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "Streams.", this.Streams);

    }
}

