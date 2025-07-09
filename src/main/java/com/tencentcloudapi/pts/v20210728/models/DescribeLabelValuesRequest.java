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

public class DescribeLabelValuesRequest extends AbstractModel {

    /**
    * Job ID.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

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
    * Label name. For the value range, refer to the metrics and label names returned by the DescribeMetricLabelWithValues API.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
     * Get Label name. For the value range, refer to the metrics and label names returned by the DescribeMetricLabelWithValues API. 
     * @return LabelName Label name. For the value range, refer to the metrics and label names returned by the DescribeMetricLabelWithValues API.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set Label name. For the value range, refer to the metrics and label names returned by the DescribeMetricLabelWithValues API.
     * @param LabelName Label name. For the value range, refer to the metrics and label names returned by the DescribeMetricLabelWithValues API.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
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

    public DescribeLabelValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLabelValuesRequest(DescribeLabelValuesRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

