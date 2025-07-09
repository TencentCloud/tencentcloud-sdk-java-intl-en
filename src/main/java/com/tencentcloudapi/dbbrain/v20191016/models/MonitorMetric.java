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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorMetric extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Metric unit.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Metric value.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Values")
    @Expose
    private Long [] Values;

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
     * Get Metric unit. 
     * @return Unit Metric unit.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Metric unit.
     * @param Unit Metric unit.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Metric value.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Values Metric value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getValues() {
        return this.Values;
    }

    /**
     * Set Metric value.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Values Metric value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValues(Long [] Values) {
        this.Values = Values;
    }

    public MonitorMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorMetric(MonitorMetric source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Values != null) {
            this.Values = new Long[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Long(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

