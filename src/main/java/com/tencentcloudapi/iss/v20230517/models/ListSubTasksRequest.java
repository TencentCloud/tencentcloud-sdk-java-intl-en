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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSubTasksRequest extends AbstractModel {

    /**
    * Complex task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Page number, which is 1 by default.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page. Default: 10.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Default: no filtering on this field. Otherwise, filter by task status. Status code: 1-NEW, 2-RUNNING, 3-COMPLETED, 4-FAILED.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Complex task ID 
     * @return TaskId Complex task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Complex task ID
     * @param TaskId Complex task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Page number, which is 1 by default. 
     * @return PageNumber Page number, which is 1 by default.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, which is 1 by default.
     * @param PageNumber Page number, which is 1 by default.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. Default: 10. 
     * @return PageSize Number of items per page. Default: 10.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. Default: 10.
     * @param PageSize Number of items per page. Default: 10.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Default: no filtering on this field. Otherwise, filter by task status. Status code: 1-NEW, 2-RUNNING, 3-COMPLETED, 4-FAILED. 
     * @return Status Default: no filtering on this field. Otherwise, filter by task status. Status code: 1-NEW, 2-RUNNING, 3-COMPLETED, 4-FAILED.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Default: no filtering on this field. Otherwise, filter by task status. Status code: 1-NEW, 2-RUNNING, 3-COMPLETED, 4-FAILED.
     * @param Status Default: no filtering on this field. Otherwise, filter by task status. Status code: 1-NEW, 2-RUNNING, 3-COMPLETED, 4-FAILED.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ListSubTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSubTasksRequest(ListSubTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

