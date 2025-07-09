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

public class DescribeInstanceListRequest extends AbstractModel {

    /**
    * Project/workspace ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page Number
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * Number of items displayed per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Cycle List (e.g., daily, one-time), optional
    */
    @SerializedName("CycleList")
    @Expose
    private String [] CycleList;

    /**
    * Person in Charge
    */
    @SerializedName("OwnerList")
    @Expose
    private String [] OwnerList;

    /**
    * Keep consistent with previous
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Sorting Order (asc, desc)
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp)
    */
    @SerializedName("SortCol")
    @Expose
    private String SortCol;

    /**
    * Type List (e.g., Python Task Type: 30
PySpark Task Type: 31
hivesql task type:34
shell task type:35
sparksql task type:36 jdbcsql task type:21 dlc task type:32), optional
    */
    @SerializedName("TaskTypeList")
    @Expose
    private Long [] TaskTypeList;

    /**
    * Status list (e.g., success 2, executing 1), optional
    */
    @SerializedName("StateList")
    @Expose
    private Long [] StateList;

    /**
    * Task Name
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get Project/workspace ID 
     * @return ProjectId Project/workspace ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project/workspace ID
     * @param ProjectId Project/workspace ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Page Number 
     * @return PageIndex Page Number
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set Page Number
     * @param PageIndex Page Number
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get Number of items displayed per page 
     * @return PageSize Number of items displayed per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items displayed per page
     * @param PageSize Number of items displayed per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Cycle List (e.g., daily, one-time), optional 
     * @return CycleList Cycle List (e.g., daily, one-time), optional
     */
    public String [] getCycleList() {
        return this.CycleList;
    }

    /**
     * Set Cycle List (e.g., daily, one-time), optional
     * @param CycleList Cycle List (e.g., daily, one-time), optional
     */
    public void setCycleList(String [] CycleList) {
        this.CycleList = CycleList;
    }

    /**
     * Get Person in Charge 
     * @return OwnerList Person in Charge
     */
    public String [] getOwnerList() {
        return this.OwnerList;
    }

    /**
     * Set Person in Charge
     * @param OwnerList Person in Charge
     */
    public void setOwnerList(String [] OwnerList) {
        this.OwnerList = OwnerList;
    }

    /**
     * Get Keep consistent with previous 
     * @return InstanceType Keep consistent with previous
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Keep consistent with previous
     * @param InstanceType Keep consistent with previous
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Sorting Order (asc, desc) 
     * @return Sort Sorting Order (asc, desc)
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting Order (asc, desc)
     * @param Sort Sorting Order (asc, desc)
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp) 
     * @return SortCol Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp)
     */
    public String getSortCol() {
        return this.SortCol;
    }

    /**
     * Set Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp)
     * @param SortCol Sort Column (costTime Runtime duration, startTime Start Time, state Instance status, curRunDate Data Timestamp)
     */
    public void setSortCol(String SortCol) {
        this.SortCol = SortCol;
    }

    /**
     * Get Type List (e.g., Python Task Type: 30
PySpark Task Type: 31
hivesql task type:34
shell task type:35
sparksql task type:36 jdbcsql task type:21 dlc task type:32), optional 
     * @return TaskTypeList Type List (e.g., Python Task Type: 30
PySpark Task Type: 31
hivesql task type:34
shell task type:35
sparksql task type:36 jdbcsql task type:21 dlc task type:32), optional
     */
    public Long [] getTaskTypeList() {
        return this.TaskTypeList;
    }

    /**
     * Set Type List (e.g., Python Task Type: 30
PySpark Task Type: 31
hivesql task type:34
shell task type:35
sparksql task type:36 jdbcsql task type:21 dlc task type:32), optional
     * @param TaskTypeList Type List (e.g., Python Task Type: 30
PySpark Task Type: 31
hivesql task type:34
shell task type:35
sparksql task type:36 jdbcsql task type:21 dlc task type:32), optional
     */
    public void setTaskTypeList(Long [] TaskTypeList) {
        this.TaskTypeList = TaskTypeList;
    }

    /**
     * Get Status list (e.g., success 2, executing 1), optional 
     * @return StateList Status list (e.g., success 2, executing 1), optional
     */
    public Long [] getStateList() {
        return this.StateList;
    }

    /**
     * Set Status list (e.g., success 2, executing 1), optional
     * @param StateList Status list (e.g., success 2, executing 1), optional
     */
    public void setStateList(Long [] StateList) {
        this.StateList = StateList;
    }

    /**
     * Get Task Name 
     * @return Keyword Task Name
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Task Name
     * @param Keyword Task Name
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceListRequest(DescribeInstanceListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.CycleList != null) {
            this.CycleList = new String[source.CycleList.length];
            for (int i = 0; i < source.CycleList.length; i++) {
                this.CycleList[i] = new String(source.CycleList[i]);
            }
        }
        if (source.OwnerList != null) {
            this.OwnerList = new String[source.OwnerList.length];
            for (int i = 0; i < source.OwnerList.length; i++) {
                this.OwnerList[i] = new String(source.OwnerList[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SortCol != null) {
            this.SortCol = new String(source.SortCol);
        }
        if (source.TaskTypeList != null) {
            this.TaskTypeList = new Long[source.TaskTypeList.length];
            for (int i = 0; i < source.TaskTypeList.length; i++) {
                this.TaskTypeList[i] = new Long(source.TaskTypeList[i]);
            }
        }
        if (source.StateList != null) {
            this.StateList = new Long[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new Long(source.StateList[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "CycleList.", this.CycleList);
        this.setParamArraySimple(map, prefix + "OwnerList.", this.OwnerList);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortCol", this.SortCol);
        this.setParamArraySimple(map, prefix + "TaskTypeList.", this.TaskTypeList);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

