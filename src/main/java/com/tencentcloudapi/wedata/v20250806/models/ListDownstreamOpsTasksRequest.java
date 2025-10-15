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

public class ListDownstreamOpsTasksRequest extends AbstractModel {

    /**
    * Task ID		
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Project ID.
		
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * Pagination size.
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

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
     * Get Page number 
     * @return PageNumber Page number
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size. 
     * @return PageSize Pagination size.
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size.
     * @param PageSize Pagination size.
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    public ListDownstreamOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDownstreamOpsTasksRequest(ListDownstreamOpsTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new String(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

