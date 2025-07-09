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

public class DescribeScenarioWithJobsRequest extends AbstractModel {

    /**
    * Offset. Default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns. Default value is 20, maximum is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Array of Project ID.
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * Array of Scenario ID.
    */
    @SerializedName("ScenarioIds")
    @Expose
    private String [] ScenarioIds;

    /**
    * Scenario Name.
    */
    @SerializedName("ScenarioName")
    @Expose
    private String ScenarioName;

    /**
    * Array of Scenario status.
    */
    @SerializedName("ScenarioStatus")
    @Expose
    private Long ScenarioStatus;

    /**
    * Column for sorting.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Whether in ascending order.
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * Parameters related to job.
    */
    @SerializedName("ScenarioRelatedJobsParams")
    @Expose
    private ScenarioRelatedJobsParams ScenarioRelatedJobsParams;

    /**
    * Whether to return the test script content of the scenario.
    */
    @SerializedName("IgnoreScript")
    @Expose
    private Boolean IgnoreScript;

    /**
    * Whether to return test data file information of the scenario.
    */
    @SerializedName("IgnoreDataset")
    @Expose
    private Boolean IgnoreDataset;

    /**
    * Scenario type, such as pts-http, pts-js, pts-jmeter.
    */
    @SerializedName("ScenarioType")
    @Expose
    private String ScenarioType;

    /**
    * Creator.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
     * Get Offset. Default value is 0. 
     * @return Offset Offset. Default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value is 0.
     * @param Offset Offset. Default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returns. Default value is 20, maximum is 100. 
     * @return Limit Number of returns. Default value is 20, maximum is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns. Default value is 20, maximum is 100.
     * @param Limit Number of returns. Default value is 20, maximum is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Array of Project ID. 
     * @return ProjectIds Array of Project ID.
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Array of Project ID.
     * @param ProjectIds Array of Project ID.
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Array of Scenario ID. 
     * @return ScenarioIds Array of Scenario ID.
     */
    public String [] getScenarioIds() {
        return this.ScenarioIds;
    }

    /**
     * Set Array of Scenario ID.
     * @param ScenarioIds Array of Scenario ID.
     */
    public void setScenarioIds(String [] ScenarioIds) {
        this.ScenarioIds = ScenarioIds;
    }

    /**
     * Get Scenario Name. 
     * @return ScenarioName Scenario Name.
     */
    public String getScenarioName() {
        return this.ScenarioName;
    }

    /**
     * Set Scenario Name.
     * @param ScenarioName Scenario Name.
     */
    public void setScenarioName(String ScenarioName) {
        this.ScenarioName = ScenarioName;
    }

    /**
     * Get Array of Scenario status. 
     * @return ScenarioStatus Array of Scenario status.
     */
    public Long getScenarioStatus() {
        return this.ScenarioStatus;
    }

    /**
     * Set Array of Scenario status.
     * @param ScenarioStatus Array of Scenario status.
     */
    public void setScenarioStatus(Long ScenarioStatus) {
        this.ScenarioStatus = ScenarioStatus;
    }

    /**
     * Get Column for sorting. 
     * @return OrderBy Column for sorting.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Column for sorting.
     * @param OrderBy Column for sorting.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Whether in ascending order. 
     * @return Ascend Whether in ascending order.
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set Whether in ascending order.
     * @param Ascend Whether in ascending order.
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    /**
     * Get Parameters related to job. 
     * @return ScenarioRelatedJobsParams Parameters related to job.
     */
    public ScenarioRelatedJobsParams getScenarioRelatedJobsParams() {
        return this.ScenarioRelatedJobsParams;
    }

    /**
     * Set Parameters related to job.
     * @param ScenarioRelatedJobsParams Parameters related to job.
     */
    public void setScenarioRelatedJobsParams(ScenarioRelatedJobsParams ScenarioRelatedJobsParams) {
        this.ScenarioRelatedJobsParams = ScenarioRelatedJobsParams;
    }

    /**
     * Get Whether to return the test script content of the scenario. 
     * @return IgnoreScript Whether to return the test script content of the scenario.
     */
    public Boolean getIgnoreScript() {
        return this.IgnoreScript;
    }

    /**
     * Set Whether to return the test script content of the scenario.
     * @param IgnoreScript Whether to return the test script content of the scenario.
     */
    public void setIgnoreScript(Boolean IgnoreScript) {
        this.IgnoreScript = IgnoreScript;
    }

    /**
     * Get Whether to return test data file information of the scenario. 
     * @return IgnoreDataset Whether to return test data file information of the scenario.
     */
    public Boolean getIgnoreDataset() {
        return this.IgnoreDataset;
    }

    /**
     * Set Whether to return test data file information of the scenario.
     * @param IgnoreDataset Whether to return test data file information of the scenario.
     */
    public void setIgnoreDataset(Boolean IgnoreDataset) {
        this.IgnoreDataset = IgnoreDataset;
    }

    /**
     * Get Scenario type, such as pts-http, pts-js, pts-jmeter. 
     * @return ScenarioType Scenario type, such as pts-http, pts-js, pts-jmeter.
     */
    public String getScenarioType() {
        return this.ScenarioType;
    }

    /**
     * Set Scenario type, such as pts-http, pts-js, pts-jmeter.
     * @param ScenarioType Scenario type, such as pts-http, pts-js, pts-jmeter.
     */
    public void setScenarioType(String ScenarioType) {
        this.ScenarioType = ScenarioType;
    }

    /**
     * Get Creator. 
     * @return Owner Creator.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Creator.
     * @param Owner Creator.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public DescribeScenarioWithJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScenarioWithJobsRequest(DescribeScenarioWithJobsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ScenarioIds != null) {
            this.ScenarioIds = new String[source.ScenarioIds.length];
            for (int i = 0; i < source.ScenarioIds.length; i++) {
                this.ScenarioIds[i] = new String(source.ScenarioIds[i]);
            }
        }
        if (source.ScenarioName != null) {
            this.ScenarioName = new String(source.ScenarioName);
        }
        if (source.ScenarioStatus != null) {
            this.ScenarioStatus = new Long(source.ScenarioStatus);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.ScenarioRelatedJobsParams != null) {
            this.ScenarioRelatedJobsParams = new ScenarioRelatedJobsParams(source.ScenarioRelatedJobsParams);
        }
        if (source.IgnoreScript != null) {
            this.IgnoreScript = new Boolean(source.IgnoreScript);
        }
        if (source.IgnoreDataset != null) {
            this.IgnoreDataset = new Boolean(source.IgnoreDataset);
        }
        if (source.ScenarioType != null) {
            this.ScenarioType = new String(source.ScenarioType);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);
        this.setParamSimple(map, prefix + "ScenarioName", this.ScenarioName);
        this.setParamSimple(map, prefix + "ScenarioStatus", this.ScenarioStatus);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamObj(map, prefix + "ScenarioRelatedJobsParams.", this.ScenarioRelatedJobsParams);
        this.setParamSimple(map, prefix + "IgnoreScript", this.IgnoreScript);
        this.setParamSimple(map, prefix + "IgnoreDataset", this.IgnoreDataset);
        this.setParamSimple(map, prefix + "ScenarioType", this.ScenarioType);
        this.setParamSimple(map, prefix + "Owner", this.Owner);

    }
}

