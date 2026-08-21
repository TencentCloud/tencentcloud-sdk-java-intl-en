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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAIMessageListRequest extends AbstractModel {

    /**
    * The TRTC SdkAppId.Example value: 1600000000
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Uniquely identifies a single task.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get The TRTC SdkAppId.Example value: 1600000000 
     * @return SdkAppId The TRTC SdkAppId.Example value: 1600000000
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The TRTC SdkAppId.Example value: 1600000000
     * @param SdkAppId The TRTC SdkAppId.Example value: 1600000000
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Uniquely identifies a single task. 
     * @return TaskId Uniquely identifies a single task.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Uniquely identifies a single task.
     * @param TaskId Uniquely identifies a single task.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public QueryAIMessageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAIMessageListRequest(QueryAIMessageListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

