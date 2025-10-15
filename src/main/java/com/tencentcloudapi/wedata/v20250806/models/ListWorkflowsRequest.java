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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListWorkflowsRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the number of data records displayed per page. default: 10. value range: 10 to 200.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Search keywords.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Workflow folder.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Workflow type. valid values: cycle and manual.
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * bundleId item.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Owner ID
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Creator ID.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Modification time interval yyyy-MM-dd HH:MM:ss. fill in two times in the array.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String [] ModifyTime;

    /**
    * Creation time range yyyy-MM-dd HH:MM:ss. two times must be filled in the array.
    */
    @SerializedName("CreateTime")
    @Expose
    private String [] CreateTime;

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
     * Get Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1. 
     * @return PageNumber Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1.
     * @param PageNumber Specifies the data page number of the request. default value is 1. valid values: equal to or greater than 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the number of data records displayed per page. default: 10. value range: 10 to 200. 
     * @return PageSize Specifies the number of data records displayed per page. default: 10. value range: 10 to 200.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of data records displayed per page. default: 10. value range: 10 to 200.
     * @param PageSize Specifies the number of data records displayed per page. default: 10. value range: 10 to 200.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Search keywords. 
     * @return Keyword Search keywords.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search keywords.
     * @param Keyword Search keywords.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Workflow folder. 
     * @return ParentFolderPath Workflow folder.
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Workflow folder.
     * @param ParentFolderPath Workflow folder.
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Workflow type. valid values: cycle and manual. 
     * @return WorkflowType Workflow type. valid values: cycle and manual.
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set Workflow type. valid values: cycle and manual.
     * @param WorkflowType Workflow type. valid values: cycle and manual.
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get bundleId item. 
     * @return BundleId bundleId item.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set bundleId item.
     * @param BundleId bundleId item.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Owner ID 
     * @return OwnerUin Owner ID
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner ID
     * @param OwnerUin Owner ID
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Creator ID. 
     * @return CreateUserUin Creator ID.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator ID.
     * @param CreateUserUin Creator ID.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Modification time interval yyyy-MM-dd HH:MM:ss. fill in two times in the array. 
     * @return ModifyTime Modification time interval yyyy-MM-dd HH:MM:ss. fill in two times in the array.
     */
    public String [] getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time interval yyyy-MM-dd HH:MM:ss. fill in two times in the array.
     * @param ModifyTime Modification time interval yyyy-MM-dd HH:MM:ss. fill in two times in the array.
     */
    public void setModifyTime(String [] ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Creation time range yyyy-MM-dd HH:MM:ss. two times must be filled in the array. 
     * @return CreateTime Creation time range yyyy-MM-dd HH:MM:ss. two times must be filled in the array.
     */
    public String [] getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time range yyyy-MM-dd HH:MM:ss. two times must be filled in the array.
     * @param CreateTime Creation time range yyyy-MM-dd HH:MM:ss. two times must be filled in the array.
     */
    public void setCreateTime(String [] CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ListWorkflowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowsRequest(ListWorkflowsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String[source.ModifyTime.length];
            for (int i = 0; i < source.ModifyTime.length; i++) {
                this.ModifyTime[i] = new String(source.ModifyTime[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String[source.CreateTime.length];
            for (int i = 0; i < source.CreateTime.length; i++) {
                this.CreateTime[i] = new String(source.CreateTime[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamArraySimple(map, prefix + "ModifyTime.", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "CreateTime.", this.CreateTime);

    }
}

