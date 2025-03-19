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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricInfo extends AbstractModel {

    /**
    * Metric name in backend.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Metric name displayed in frontend.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Metric description.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Metric type.
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * Default metric unit.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Aggregation functions supported by the metric.
    */
    @SerializedName("Aggregations")
    @Expose
    private AggregationLegend [] Aggregations;

    /**
    * Whether it is an internal metric, internal metrics cannot be freely selected by users on the frontend.
    */
    @SerializedName("InnerMetric")
    @Expose
    private Boolean InnerMetric;

    /**
     * Get Metric name in backend. 
     * @return Metric Metric name in backend.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric name in backend.
     * @param Metric Metric name in backend.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Metric name displayed in frontend. 
     * @return Alias Metric name displayed in frontend.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Metric name displayed in frontend.
     * @param Alias Metric name displayed in frontend.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Metric description.

Note: This field may return null, indicating that no valid value is found. 
     * @return Description Metric description.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Metric description.

Note: This field may return null, indicating that no valid value is found.
     * @param Description Metric description.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Metric type. 
     * @return MetricType Metric type.
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set Metric type.
     * @param MetricType Metric type.
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get Default metric unit. 
     * @return Unit Default metric unit.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Default metric unit.
     * @param Unit Default metric unit.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Aggregation functions supported by the metric. 
     * @return Aggregations Aggregation functions supported by the metric.
     */
    public AggregationLegend [] getAggregations() {
        return this.Aggregations;
    }

    /**
     * Set Aggregation functions supported by the metric.
     * @param Aggregations Aggregation functions supported by the metric.
     */
    public void setAggregations(AggregationLegend [] Aggregations) {
        this.Aggregations = Aggregations;
    }

    /**
     * Get Whether it is an internal metric, internal metrics cannot be freely selected by users on the frontend. 
     * @return InnerMetric Whether it is an internal metric, internal metrics cannot be freely selected by users on the frontend.
     */
    public Boolean getInnerMetric() {
        return this.InnerMetric;
    }

    /**
     * Set Whether it is an internal metric, internal metrics cannot be freely selected by users on the frontend.
     * @param InnerMetric Whether it is an internal metric, internal metrics cannot be freely selected by users on the frontend.
     */
    public void setInnerMetric(Boolean InnerMetric) {
        this.InnerMetric = InnerMetric;
    }

    public MetricInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricInfo(MetricInfo source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Aggregations != null) {
            this.Aggregations = new AggregationLegend[source.Aggregations.length];
            for (int i = 0; i < source.Aggregations.length; i++) {
                this.Aggregations[i] = new AggregationLegend(source.Aggregations[i]);
            }
        }
        if (source.InnerMetric != null) {
            this.InnerMetric = new Boolean(source.InnerMetric);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "Aggregations.", this.Aggregations);
        this.setParamSimple(map, prefix + "InnerMetric", this.InnerMetric);

    }
}

