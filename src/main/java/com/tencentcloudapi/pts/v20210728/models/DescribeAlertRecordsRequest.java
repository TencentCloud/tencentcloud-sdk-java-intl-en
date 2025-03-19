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

public class DescribeAlertRecordsRequest extends AbstractModel {

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
    * Array of Job ID.
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * Whether in ascending order.
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * Column for sorting.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Offset. Default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns. Default value is 20, maximum is 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter by Scenario names.
    */
    @SerializedName("ScenarioNames")
    @Expose
    private String [] ScenarioNames;

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
     * Get Array of Job ID. 
     * @return JobIds Array of Job ID.
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set Array of Job ID.
     * @param JobIds Array of Job ID.
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
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
     * Get Number of returns. Default value is 20, maximum is 100 
     * @return Limit Number of returns. Default value is 20, maximum is 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns. Default value is 20, maximum is 100
     * @param Limit Number of returns. Default value is 20, maximum is 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter by Scenario names. 
     * @return ScenarioNames Filter by Scenario names.
     */
    public String [] getScenarioNames() {
        return this.ScenarioNames;
    }

    /**
     * Set Filter by Scenario names.
     * @param ScenarioNames Filter by Scenario names.
     */
    public void setScenarioNames(String [] ScenarioNames) {
        this.ScenarioNames = ScenarioNames;
    }

    public DescribeAlertRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlertRecordsRequest(DescribeAlertRecordsRequest source) {
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
        if (source.JobIds != null) {
            this.JobIds = new String[source.JobIds.length];
            for (int i = 0; i < source.JobIds.length; i++) {
                this.JobIds[i] = new String(source.JobIds[i]);
            }
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ScenarioNames != null) {
            this.ScenarioNames = new String[source.ScenarioNames.length];
            for (int i = 0; i < source.ScenarioNames.length; i++) {
                this.ScenarioNames[i] = new String(source.ScenarioNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ScenarioIds.", this.ScenarioIds);
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ScenarioNames.", this.ScenarioNames);

    }
}

