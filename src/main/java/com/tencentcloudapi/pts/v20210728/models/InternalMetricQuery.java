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

public class InternalMetricQuery extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Aggregation Function, optional value including Rate, Count, Avg, P90, P95, P99, Gauge.
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * Deprecated, please use 'Filters'.
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Use label filter rules to filter metrics. Rules include LabelName, LabelValue, and Operator (0 means equal, 1 means not equal).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Metric group.
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

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
     * Get Aggregation Function, optional value including Rate, Count, Avg, P90, P95, P99, Gauge. 
     * @return Aggregation Aggregation Function, optional value including Rate, Count, Avg, P90, P95, P99, Gauge.
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set Aggregation Function, optional value including Rate, Count, Avg, P90, P95, P99, Gauge.
     * @param Aggregation Aggregation Function, optional value including Rate, Count, Avg, P90, P95, P99, Gauge.
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get Deprecated, please use 'Filters'. 
     * @return Labels Deprecated, please use 'Filters'.
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Deprecated, please use 'Filters'.
     * @param Labels Deprecated, please use 'Filters'.
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Use label filter rules to filter metrics. Rules include LabelName, LabelValue, and Operator (0 means equal, 1 means not equal). 
     * @return Filters Use label filter rules to filter metrics. Rules include LabelName, LabelValue, and Operator (0 means equal, 1 means not equal).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Use label filter rules to filter metrics. Rules include LabelName, LabelValue, and Operator (0 means equal, 1 means not equal).
     * @param Filters Use label filter rules to filter metrics. Rules include LabelName, LabelValue, and Operator (0 means equal, 1 means not equal).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Metric group. 
     * @return GroupBy Metric group.
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set Metric group.
     * @param GroupBy Metric group.
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    public InternalMetricQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternalMetricQuery(InternalMetricQuery source) {
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
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);

    }
}

