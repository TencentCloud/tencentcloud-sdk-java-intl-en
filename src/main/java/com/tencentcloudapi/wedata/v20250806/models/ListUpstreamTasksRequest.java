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

public class ListUpstreamTasksRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1.
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
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1. 
     * @return PageNumber Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1.
     * @param PageNumber Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1. 
     * @return PageSize Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1.
     * @param PageSize Specifies the data page number of the request. Default value is 1. Valid values: equal to or greater than 1.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListUpstreamTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUpstreamTasksRequest(ListUpstreamTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

