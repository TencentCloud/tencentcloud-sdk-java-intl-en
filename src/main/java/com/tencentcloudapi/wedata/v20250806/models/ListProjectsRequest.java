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

public class ListProjectsRequest extends AbstractModel {

    /**
    * Project ID List
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * Project name or unique id, supports fuzzy search.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Project status, available values: 0 (disabled), 1 (normal).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Project mode. available values: SIMPLE, STANDARD.
    */
    @SerializedName("ProjectModel")
    @Expose
    private String ProjectModel;

    /**
    * Number of requested data pages for pagination.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page. default value is `10`.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Project ID List 
     * @return ProjectIds Project ID List
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID List
     * @param ProjectIds Project ID List
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Project name or unique id, supports fuzzy search. 
     * @return ProjectName Project name or unique id, supports fuzzy search.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name or unique id, supports fuzzy search.
     * @param ProjectName Project name or unique id, supports fuzzy search.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Project status, available values: 0 (disabled), 1 (normal). 
     * @return Status Project status, available values: 0 (disabled), 1 (normal).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Project status, available values: 0 (disabled), 1 (normal).
     * @param Status Project status, available values: 0 (disabled), 1 (normal).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Project mode. available values: SIMPLE, STANDARD. 
     * @return ProjectModel Project mode. available values: SIMPLE, STANDARD.
     */
    public String getProjectModel() {
        return this.ProjectModel;
    }

    /**
     * Set Project mode. available values: SIMPLE, STANDARD.
     * @param ProjectModel Project mode. available values: SIMPLE, STANDARD.
     */
    public void setProjectModel(String ProjectModel) {
        this.ProjectModel = ProjectModel;
    }

    /**
     * Get Number of requested data pages for pagination. 
     * @return PageNumber Number of requested data pages for pagination.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Number of requested data pages for pagination.
     * @param PageNumber Number of requested data pages for pagination.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. default value is `10`. 
     * @return PageSize Number of items per page. default value is `10`.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. default value is `10`.
     * @param PageSize Number of items per page. default value is `10`.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListProjectsRequest(ListProjectsRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectModel != null) {
            this.ProjectModel = new String(source.ProjectModel);
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
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectModel", this.ProjectModel);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

