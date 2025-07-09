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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalanceTaskStatusRequest extends AbstractModel {

    /**
    * Request ID, i.e., the `RequestId` parameter returned by the API
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get Request ID, i.e., the `RequestId` parameter returned by the API 
     * @return TaskId Request ID, i.e., the `RequestId` parameter returned by the API
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Request ID, i.e., the `RequestId` parameter returned by the API
     * @param TaskId Request ID, i.e., the `RequestId` parameter returned by the API
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeLoadBalanceTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalanceTaskStatusRequest(DescribeLoadBalanceTaskStatusRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

