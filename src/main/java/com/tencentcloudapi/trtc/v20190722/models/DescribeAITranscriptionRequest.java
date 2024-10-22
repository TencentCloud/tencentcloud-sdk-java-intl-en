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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAITranscriptionRequest extends AbstractModel {

    /**
    * Query the task status. If not in use, pass in an empty string. There are two query methods: 1. Fill in only TaskId. This method uses TaskId to query tasks. 2. TaskId is an empty string. Fill in SdkAppId and SessionId. This method does not require TaskId to query tasks.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * TRTC's SdkAppId is used together with SessionId.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The SessionId passed in when starting the transcription task is used together with the SdkAppId.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get Query the task status. If not in use, pass in an empty string. There are two query methods: 1. Fill in only TaskId. This method uses TaskId to query tasks. 2. TaskId is an empty string. Fill in SdkAppId and SessionId. This method does not require TaskId to query tasks. 
     * @return TaskId Query the task status. If not in use, pass in an empty string. There are two query methods: 1. Fill in only TaskId. This method uses TaskId to query tasks. 2. TaskId is an empty string. Fill in SdkAppId and SessionId. This method does not require TaskId to query tasks.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Query the task status. If not in use, pass in an empty string. There are two query methods: 1. Fill in only TaskId. This method uses TaskId to query tasks. 2. TaskId is an empty string. Fill in SdkAppId and SessionId. This method does not require TaskId to query tasks.
     * @param TaskId Query the task status. If not in use, pass in an empty string. There are two query methods: 1. Fill in only TaskId. This method uses TaskId to query tasks. 2. TaskId is an empty string. Fill in SdkAppId and SessionId. This method does not require TaskId to query tasks.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get TRTC's SdkAppId is used together with SessionId. 
     * @return SdkAppId TRTC's SdkAppId is used together with SessionId.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC's SdkAppId is used together with SessionId.
     * @param SdkAppId TRTC's SdkAppId is used together with SessionId.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The SessionId passed in when starting the transcription task is used together with the SdkAppId. 
     * @return SessionId The SessionId passed in when starting the transcription task is used together with the SdkAppId.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The SessionId passed in when starting the transcription task is used together with the SdkAppId.
     * @param SessionId The SessionId passed in when starting the transcription task is used together with the SdkAppId.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public DescribeAITranscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAITranscriptionRequest(DescribeAITranscriptionRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

