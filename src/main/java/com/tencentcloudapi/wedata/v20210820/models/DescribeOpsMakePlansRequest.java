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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOpsMakePlansRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Pagination number, default value: 1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page size, default value 10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Supplemental Plan ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Supplemental Plan Name
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Supplementary Task Name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Supplementary Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Supplementary Plan Creator
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Minimum Creation Time of Supplementary Plan
    */
    @SerializedName("MinCreateTime")
    @Expose
    private String MinCreateTime;

    /**
    * Maximum Creation Time of Supplementary Plan
    */
    @SerializedName("MaxCreateTime")
    @Expose
    private String MaxCreateTime;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Pagination number, default value: 1 
     * @return PageNumber Pagination number, default value: 1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Pagination number, default value: 1
     * @param PageNumber Pagination number, default value: 1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page size, default value 10 
     * @return PageSize Page size, default value 10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size, default value 10
     * @param PageSize Page size, default value 10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Supplemental Plan ID 
     * @return PlanId Supplemental Plan ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Supplemental Plan ID
     * @param PlanId Supplemental Plan ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Supplemental Plan Name 
     * @return PlanName Supplemental Plan Name
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Supplemental Plan Name
     * @param PlanName Supplemental Plan Name
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Supplementary Task Name 
     * @return TaskName Supplementary Task Name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Supplementary Task Name
     * @param TaskName Supplementary Task Name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Supplementary Task ID 
     * @return TaskId Supplementary Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Supplementary Task ID
     * @param TaskId Supplementary Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Supplementary Plan Creator 
     * @return Creator Supplementary Plan Creator
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Supplementary Plan Creator
     * @param Creator Supplementary Plan Creator
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Minimum Creation Time of Supplementary Plan 
     * @return MinCreateTime Minimum Creation Time of Supplementary Plan
     */
    public String getMinCreateTime() {
        return this.MinCreateTime;
    }

    /**
     * Set Minimum Creation Time of Supplementary Plan
     * @param MinCreateTime Minimum Creation Time of Supplementary Plan
     */
    public void setMinCreateTime(String MinCreateTime) {
        this.MinCreateTime = MinCreateTime;
    }

    /**
     * Get Maximum Creation Time of Supplementary Plan 
     * @return MaxCreateTime Maximum Creation Time of Supplementary Plan
     */
    public String getMaxCreateTime() {
        return this.MaxCreateTime;
    }

    /**
     * Set Maximum Creation Time of Supplementary Plan
     * @param MaxCreateTime Maximum Creation Time of Supplementary Plan
     */
    public void setMaxCreateTime(String MaxCreateTime) {
        this.MaxCreateTime = MaxCreateTime;
    }

    public DescribeOpsMakePlansRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOpsMakePlansRequest(DescribeOpsMakePlansRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.MinCreateTime != null) {
            this.MinCreateTime = new String(source.MinCreateTime);
        }
        if (source.MaxCreateTime != null) {
            this.MaxCreateTime = new String(source.MaxCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "MinCreateTime", this.MinCreateTime);
        this.setParamSimple(map, prefix + "MaxCreateTime", this.MaxCreateTime);

    }
}

