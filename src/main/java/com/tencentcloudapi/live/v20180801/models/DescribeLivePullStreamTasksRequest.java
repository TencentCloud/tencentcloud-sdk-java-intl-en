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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLivePullStreamTasksRequest extends AbstractModel {

    /**
    * The task ID. 
A task ID is returned by the `CreateLivePullStreamTask` API.
If you do not pass this parameter, all tasks will be returned, sorted by last updated time in descending order.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The number of page to start from. Default value: 1.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * The maximum number of records per page. Default value: 10.
Valid values: Any integer between 1 and 20.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get The task ID. 
A task ID is returned by the `CreateLivePullStreamTask` API.
If you do not pass this parameter, all tasks will be returned, sorted by last updated time in descending order. 
     * @return TaskId The task ID. 
A task ID is returned by the `CreateLivePullStreamTask` API.
If you do not pass this parameter, all tasks will be returned, sorted by last updated time in descending order.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID. 
A task ID is returned by the `CreateLivePullStreamTask` API.
If you do not pass this parameter, all tasks will be returned, sorted by last updated time in descending order.
     * @param TaskId The task ID. 
A task ID is returned by the `CreateLivePullStreamTask` API.
If you do not pass this parameter, all tasks will be returned, sorted by last updated time in descending order.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The number of page to start from. Default value: 1. 
     * @return PageNum The number of page to start from. Default value: 1.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set The number of page to start from. Default value: 1.
     * @param PageNum The number of page to start from. Default value: 1.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get The maximum number of records per page. Default value: 10.
Valid values: Any integer between 1 and 20. 
     * @return PageSize The maximum number of records per page. Default value: 10.
Valid values: Any integer between 1 and 20.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The maximum number of records per page. Default value: 10.
Valid values: Any integer between 1 and 20.
     * @param PageSize The maximum number of records per page. Default value: 10.
Valid values: Any integer between 1 and 20.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeLivePullStreamTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLivePullStreamTasksRequest(DescribeLivePullStreamTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

