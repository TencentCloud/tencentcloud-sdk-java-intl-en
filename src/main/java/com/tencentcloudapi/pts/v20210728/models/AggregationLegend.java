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

public class AggregationLegend extends AbstractModel {

    /**
    * Aggregation functions supported by the metric.
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * Description after the aggregation function is applied to the metric.
    */
    @SerializedName("Legend")
    @Expose
    private String Legend;

    /**
    * Metric unit after aggregation.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get Aggregation functions supported by the metric. 
     * @return Aggregation Aggregation functions supported by the metric.
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set Aggregation functions supported by the metric.
     * @param Aggregation Aggregation functions supported by the metric.
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get Description after the aggregation function is applied to the metric. 
     * @return Legend Description after the aggregation function is applied to the metric.
     */
    public String getLegend() {
        return this.Legend;
    }

    /**
     * Set Description after the aggregation function is applied to the metric.
     * @param Legend Description after the aggregation function is applied to the metric.
     */
    public void setLegend(String Legend) {
        this.Legend = Legend;
    }

    /**
     * Get Metric unit after aggregation. 
     * @return Unit Metric unit after aggregation.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Metric unit after aggregation.
     * @param Unit Metric unit after aggregation.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public AggregationLegend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggregationLegend(AggregationLegend source) {
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
        }
        if (source.Legend != null) {
            this.Legend = new String(source.Legend);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamSimple(map, prefix + "Legend", this.Legend);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

