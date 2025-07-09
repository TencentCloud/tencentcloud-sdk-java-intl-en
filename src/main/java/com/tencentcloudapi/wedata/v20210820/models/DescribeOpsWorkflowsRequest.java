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

public class DescribeOpsWorkflowsRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task Product Type Name List, separated by ','
    */
    @SerializedName("ProductNameList")
    @Expose
    private String ProductNameList;

    /**
    * File ID list, separated by ','
    */
    @SerializedName("FolderIdList")
    @Expose
    private String FolderIdList;

    /**
    * Workflow ID, separated by ','
    */
    @SerializedName("WorkFlowIdList")
    @Expose
    private String WorkFlowIdList;

    /**
    * Workflow Name List, separated by ','
    */
    @SerializedName("WorkFlowNameList")
    @Expose
    private String WorkFlowNameList;

    /**
    * Task Name List, separated by ','
    */
    @SerializedName("TaskNameList")
    @Expose
    private String TaskNameList;

    /**
    * Task ID list, separated by ','
    */
    @SerializedName("TaskIdList")
    @Expose
    private String TaskIdList;

    /**
    * Status List, separated by ','
    */
    @SerializedName("StatusList")
    @Expose
    private String StatusList;

    /**
    * Person in Charge List, separated by ','
    */
    @SerializedName("InChargeList")
    @Expose
    private String InChargeList;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Sorting Item
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * Sort Method, DESC or ASC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

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
     * Get Task Product Type Name List, separated by ',' 
     * @return ProductNameList Task Product Type Name List, separated by ','
     */
    public String getProductNameList() {
        return this.ProductNameList;
    }

    /**
     * Set Task Product Type Name List, separated by ','
     * @param ProductNameList Task Product Type Name List, separated by ','
     */
    public void setProductNameList(String ProductNameList) {
        this.ProductNameList = ProductNameList;
    }

    /**
     * Get File ID list, separated by ',' 
     * @return FolderIdList File ID list, separated by ','
     */
    public String getFolderIdList() {
        return this.FolderIdList;
    }

    /**
     * Set File ID list, separated by ','
     * @param FolderIdList File ID list, separated by ','
     */
    public void setFolderIdList(String FolderIdList) {
        this.FolderIdList = FolderIdList;
    }

    /**
     * Get Workflow ID, separated by ',' 
     * @return WorkFlowIdList Workflow ID, separated by ','
     */
    public String getWorkFlowIdList() {
        return this.WorkFlowIdList;
    }

    /**
     * Set Workflow ID, separated by ','
     * @param WorkFlowIdList Workflow ID, separated by ','
     */
    public void setWorkFlowIdList(String WorkFlowIdList) {
        this.WorkFlowIdList = WorkFlowIdList;
    }

    /**
     * Get Workflow Name List, separated by ',' 
     * @return WorkFlowNameList Workflow Name List, separated by ','
     */
    public String getWorkFlowNameList() {
        return this.WorkFlowNameList;
    }

    /**
     * Set Workflow Name List, separated by ','
     * @param WorkFlowNameList Workflow Name List, separated by ','
     */
    public void setWorkFlowNameList(String WorkFlowNameList) {
        this.WorkFlowNameList = WorkFlowNameList;
    }

    /**
     * Get Task Name List, separated by ',' 
     * @return TaskNameList Task Name List, separated by ','
     */
    public String getTaskNameList() {
        return this.TaskNameList;
    }

    /**
     * Set Task Name List, separated by ','
     * @param TaskNameList Task Name List, separated by ','
     */
    public void setTaskNameList(String TaskNameList) {
        this.TaskNameList = TaskNameList;
    }

    /**
     * Get Task ID list, separated by ',' 
     * @return TaskIdList Task ID list, separated by ','
     */
    public String getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set Task ID list, separated by ','
     * @param TaskIdList Task ID list, separated by ','
     */
    public void setTaskIdList(String TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get Status List, separated by ',' 
     * @return StatusList Status List, separated by ','
     */
    public String getStatusList() {
        return this.StatusList;
    }

    /**
     * Set Status List, separated by ','
     * @param StatusList Status List, separated by ','
     */
    public void setStatusList(String StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get Person in Charge List, separated by ',' 
     * @return InChargeList Person in Charge List, separated by ','
     */
    public String getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set Person in Charge List, separated by ','
     * @param InChargeList Person in Charge List, separated by ','
     */
    public void setInChargeList(String InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page size 
     * @return PageSize Page size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
     * @param PageSize Page size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sorting Item 
     * @return SortItem Sorting Item
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set Sorting Item
     * @param SortItem Sorting Item
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get Sort Method, DESC or ASC 
     * @return SortType Sort Method, DESC or ASC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Sort Method, DESC or ASC
     * @param SortType Sort Method, DESC or ASC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    public DescribeOpsWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOpsWorkflowsRequest(DescribeOpsWorkflowsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProductNameList != null) {
            this.ProductNameList = new String(source.ProductNameList);
        }
        if (source.FolderIdList != null) {
            this.FolderIdList = new String(source.FolderIdList);
        }
        if (source.WorkFlowIdList != null) {
            this.WorkFlowIdList = new String(source.WorkFlowIdList);
        }
        if (source.WorkFlowNameList != null) {
            this.WorkFlowNameList = new String(source.WorkFlowNameList);
        }
        if (source.TaskNameList != null) {
            this.TaskNameList = new String(source.TaskNameList);
        }
        if (source.TaskIdList != null) {
            this.TaskIdList = new String(source.TaskIdList);
        }
        if (source.StatusList != null) {
            this.StatusList = new String(source.StatusList);
        }
        if (source.InChargeList != null) {
            this.InChargeList = new String(source.InChargeList);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProductNameList", this.ProductNameList);
        this.setParamSimple(map, prefix + "FolderIdList", this.FolderIdList);
        this.setParamSimple(map, prefix + "WorkFlowIdList", this.WorkFlowIdList);
        this.setParamSimple(map, prefix + "WorkFlowNameList", this.WorkFlowNameList);
        this.setParamSimple(map, prefix + "TaskNameList", this.TaskNameList);
        this.setParamSimple(map, prefix + "TaskIdList", this.TaskIdList);
        this.setParamSimple(map, prefix + "StatusList", this.StatusList);
        this.setParamSimple(map, prefix + "InChargeList", this.InChargeList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

