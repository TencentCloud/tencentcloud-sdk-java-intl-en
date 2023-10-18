/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRefreshTaskResponse extends AbstractModel {

    /**
    * Refresh task status. Valid values: `Task_New`, `Task_Running`, `Task_Finish`, `Task_Error`, `Task_NoExist`.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Refresh task status. Valid values: `Task_New`, `Task_Running`, `Task_Finish`, `Task_Error`, `Task_NoExist`. 
     * @return TaskStatus Refresh task status. Valid values: `Task_New`, `Task_Running`, `Task_Finish`, `Task_Error`, `Task_NoExist`.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Refresh task status. Valid values: `Task_New`, `Task_Running`, `Task_Finish`, `Task_Error`, `Task_NoExist`.
     * @param TaskStatus Refresh task status. Valid values: `Task_New`, `Task_Running`, `Task_Finish`, `Task_Error`, `Task_NoExist`.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRefreshTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRefreshTaskResponse(DescribeRefreshTaskResponse source) {
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

