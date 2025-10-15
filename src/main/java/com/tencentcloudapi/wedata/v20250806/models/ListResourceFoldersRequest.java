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

public class ListResourceFoldersRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Resource folder absolute path. value example.
/wedata/test
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

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
     * Get Resource folder absolute path. value example.
/wedata/test 
     * @return ParentFolderPath Resource folder absolute path. value example.
/wedata/test
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Resource folder absolute path. value example.
/wedata/test
     * @param ParentFolderPath Resource folder absolute path. value example.
/wedata/test
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
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

    public ListResourceFoldersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListResourceFoldersRequest(ListResourceFoldersRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

