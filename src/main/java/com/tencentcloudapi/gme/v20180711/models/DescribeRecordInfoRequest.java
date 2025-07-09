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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordInfoRequest extends AbstractModel {

    /**
    * ID of the ongoing task, which is returned from the `StartRecord` API.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Application ID.
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
     * Get ID of the ongoing task, which is returned from the `StartRecord` API. 
     * @return TaskId ID of the ongoing task, which is returned from the `StartRecord` API.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the ongoing task, which is returned from the `StartRecord` API.
     * @param TaskId ID of the ongoing task, which is returned from the `StartRecord` API.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Application ID. 
     * @return BizId Application ID.
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID.
     * @param BizId Application ID.
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    public DescribeRecordInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordInfoRequest(DescribeRecordInfoRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BizId", this.BizId);

    }
}

