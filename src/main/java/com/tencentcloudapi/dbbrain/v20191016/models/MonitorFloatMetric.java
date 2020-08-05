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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorFloatMetric extends AbstractModel{

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
    private Float [] Values;

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
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set Metric value.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Values Metric value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
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

