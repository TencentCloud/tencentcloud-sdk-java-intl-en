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

public class DescribeSampleMatrixQueryRequest extends AbstractModel {

    /**
    * Job ID.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Scenario ID.
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * Metric name. For the value range, refer to all metric names returned by the DescribeMetricLabelWithValues API.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Aggregation function. Range of values: Rate, Count, Avg, P90, P95, P99, Gauge.
    */
    @SerializedName("Aggregation")
    @Expose
    private String Aggregation;

    /**
    * Use label rules to filter metrics. Rules include label name, label value, and operator (0 means equal, 1 means not equal).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Labels used for grouping, similar to group by in PromQL.


    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
     * Get Job ID. 
     * @return JobId Job ID.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Job ID.
     * @param JobId Job ID.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Scenario ID. 
     * @return ScenarioId Scenario ID.
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set Scenario ID.
     * @param ScenarioId Scenario ID.
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get Metric name. For the value range, refer to all metric names returned by the DescribeMetricLabelWithValues API. 
     * @return Metric Metric name. For the value range, refer to all metric names returned by the DescribeMetricLabelWithValues API.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric name. For the value range, refer to all metric names returned by the DescribeMetricLabelWithValues API.
     * @param Metric Metric name. For the value range, refer to all metric names returned by the DescribeMetricLabelWithValues API.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Aggregation function. Range of values: Rate, Count, Avg, P90, P95, P99, Gauge. 
     * @return Aggregation Aggregation function. Range of values: Rate, Count, Avg, P90, P95, P99, Gauge.
     */
    public String getAggregation() {
        return this.Aggregation;
    }

    /**
     * Set Aggregation function. Range of values: Rate, Count, Avg, P90, P95, P99, Gauge.
     * @param Aggregation Aggregation function. Range of values: Rate, Count, Avg, P90, P95, P99, Gauge.
     */
    public void setAggregation(String Aggregation) {
        this.Aggregation = Aggregation;
    }

    /**
     * Get Use label rules to filter metrics. Rules include label name, label value, and operator (0 means equal, 1 means not equal). 
     * @return Filters Use label rules to filter metrics. Rules include label name, label value, and operator (0 means equal, 1 means not equal).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Use label rules to filter metrics. Rules include label name, label value, and operator (0 means equal, 1 means not equal).
     * @param Filters Use label rules to filter metrics. Rules include label name, label value, and operator (0 means equal, 1 means not equal).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Labels used for grouping, similar to group by in PromQL.

 
     * @return GroupBy Labels used for grouping, similar to group by in PromQL.


     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set Labels used for grouping, similar to group by in PromQL.


     * @param GroupBy Labels used for grouping, similar to group by in PromQL.


     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    public DescribeSampleMatrixQueryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSampleMatrixQueryRequest(DescribeSampleMatrixQueryRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Aggregation != null) {
            this.Aggregation = new String(source.Aggregation);
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Aggregation", this.Aggregation);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);

    }
}

