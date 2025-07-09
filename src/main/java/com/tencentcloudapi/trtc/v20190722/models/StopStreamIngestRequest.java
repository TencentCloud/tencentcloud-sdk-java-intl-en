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

public class StopStreamIngestRequest extends AbstractModel {

    /**
    * The SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the task's room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The unique Task ID, which will be returned after the task is successfully started.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get The SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the task's room. 
     * @return SdkAppId The SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the task's room.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the task's room.
     * @param SdkAppId The SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the task's room.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The unique Task ID, which will be returned after the task is successfully started. 
     * @return TaskId The unique Task ID, which will be returned after the task is successfully started.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The unique Task ID, which will be returned after the task is successfully started.
     * @param TaskId The unique Task ID, which will be returned after the task is successfully started.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public StopStreamIngestRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopStreamIngestRequest(StopStreamIngestRequest source) {
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

