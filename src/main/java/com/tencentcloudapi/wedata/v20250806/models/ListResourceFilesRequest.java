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

public class ListResourceFilesRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Data page number, equal to or greater than 1. default 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the number of data records displayed per page. valid values: 10 to 200. default: 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Resource file name (fuzzy search keyword).
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Specifies the path of the file's parent folder (for example /a/b/c, querying resource files under the folder c).
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Creator ID. obtain through the DescribeCurrentUserInfo API.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Update time range. specifies the start time in yyyy-MM-dd HH:MM:ss format.
    */
    @SerializedName("ModifyTimeStart")
    @Expose
    private String ModifyTimeStart;

    /**
    * Update time range. specifies the end time in yyyy-MM-dd HH:MM:ss format.
    */
    @SerializedName("ModifyTimeEnd")
    @Expose
    private String ModifyTimeEnd;

    /**
    * Create time range. specifies the start time in yyyy-MM-dd HH:MM:ss format.
    */
    @SerializedName("CreateTimeStart")
    @Expose
    private String CreateTimeStart;

    /**
    * Create time range. specifies the termination time in yyyy-MM-dd HH:MM:ss format.
    */
    @SerializedName("CreateTimeEnd")
    @Expose
    private String CreateTimeEnd;

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
     * Get Data page number, equal to or greater than 1. default 1. 
     * @return PageNumber Data page number, equal to or greater than 1. default 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Data page number, equal to or greater than 1. default 1.
     * @param PageNumber Data page number, equal to or greater than 1. default 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the number of data records displayed per page. valid values: 10 to 200. default: 10. 
     * @return PageSize Specifies the number of data records displayed per page. valid values: 10 to 200. default: 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of data records displayed per page. valid values: 10 to 200. default: 10.
     * @param PageSize Specifies the number of data records displayed per page. valid values: 10 to 200. default: 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Resource file name (fuzzy search keyword). 
     * @return ResourceName Resource file name (fuzzy search keyword).
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource file name (fuzzy search keyword).
     * @param ResourceName Resource file name (fuzzy search keyword).
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Specifies the path of the file's parent folder (for example /a/b/c, querying resource files under the folder c). 
     * @return ParentFolderPath Specifies the path of the file's parent folder (for example /a/b/c, querying resource files under the folder c).
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Specifies the path of the file's parent folder (for example /a/b/c, querying resource files under the folder c).
     * @param ParentFolderPath Specifies the path of the file's parent folder (for example /a/b/c, querying resource files under the folder c).
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Creator ID. obtain through the DescribeCurrentUserInfo API. 
     * @return CreateUserUin Creator ID. obtain through the DescribeCurrentUserInfo API.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator ID. obtain through the DescribeCurrentUserInfo API.
     * @param CreateUserUin Creator ID. obtain through the DescribeCurrentUserInfo API.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Update time range. specifies the start time in yyyy-MM-dd HH:MM:ss format. 
     * @return ModifyTimeStart Update time range. specifies the start time in yyyy-MM-dd HH:MM:ss format.
     */
    public String getModifyTimeStart() {
        return this.ModifyTimeStart;
    }

    /**
     * Set Update time range. specifies the start time in yyyy-MM-dd HH:MM:ss format.
     * @param ModifyTimeStart Update time range. specifies the start time in yyyy-MM-dd HH:MM:ss format.
     */
    public void setModifyTimeStart(String ModifyTimeStart) {
        this.ModifyTimeStart = ModifyTimeStart;
    }

    /**
     * Get Update time range. specifies the end time in yyyy-MM-dd HH:MM:ss format. 
     * @return ModifyTimeEnd Update time range. specifies the end time in yyyy-MM-dd HH:MM:ss format.
     */
    public String getModifyTimeEnd() {
        return this.ModifyTimeEnd;
    }

    /**
     * Set Update time range. specifies the end time in yyyy-MM-dd HH:MM:ss format.
     * @param ModifyTimeEnd Update time range. specifies the end time in yyyy-MM-dd HH:MM:ss format.
     */
    public void setModifyTimeEnd(String ModifyTimeEnd) {
        this.ModifyTimeEnd = ModifyTimeEnd;
    }

    /**
     * Get Create time range. specifies the start time in yyyy-MM-dd HH:MM:ss format. 
     * @return CreateTimeStart Create time range. specifies the start time in yyyy-MM-dd HH:MM:ss format.
     */
    public String getCreateTimeStart() {
        return this.CreateTimeStart;
    }

    /**
     * Set Create time range. specifies the start time in yyyy-MM-dd HH:MM:ss format.
     * @param CreateTimeStart Create time range. specifies the start time in yyyy-MM-dd HH:MM:ss format.
     */
    public void setCreateTimeStart(String CreateTimeStart) {
        this.CreateTimeStart = CreateTimeStart;
    }

    /**
     * Get Create time range. specifies the termination time in yyyy-MM-dd HH:MM:ss format. 
     * @return CreateTimeEnd Create time range. specifies the termination time in yyyy-MM-dd HH:MM:ss format.
     */
    public String getCreateTimeEnd() {
        return this.CreateTimeEnd;
    }

    /**
     * Set Create time range. specifies the termination time in yyyy-MM-dd HH:MM:ss format.
     * @param CreateTimeEnd Create time range. specifies the termination time in yyyy-MM-dd HH:MM:ss format.
     */
    public void setCreateTimeEnd(String CreateTimeEnd) {
        this.CreateTimeEnd = CreateTimeEnd;
    }

    public ListResourceFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListResourceFilesRequest(ListResourceFilesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.ModifyTimeStart != null) {
            this.ModifyTimeStart = new String(source.ModifyTimeStart);
        }
        if (source.ModifyTimeEnd != null) {
            this.ModifyTimeEnd = new String(source.ModifyTimeEnd);
        }
        if (source.CreateTimeStart != null) {
            this.CreateTimeStart = new String(source.CreateTimeStart);
        }
        if (source.CreateTimeEnd != null) {
            this.CreateTimeEnd = new String(source.CreateTimeEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "ModifyTimeStart", this.ModifyTimeStart);
        this.setParamSimple(map, prefix + "ModifyTimeEnd", this.ModifyTimeEnd);
        this.setParamSimple(map, prefix + "CreateTimeStart", this.CreateTimeStart);
        this.setParamSimple(map, prefix + "CreateTimeEnd", this.CreateTimeEnd);

    }
}

