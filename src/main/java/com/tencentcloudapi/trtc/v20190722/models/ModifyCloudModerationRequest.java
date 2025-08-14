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

public class ModifyCloudModerationRequest extends AbstractModel {

    /**
    * SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the TRTC room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Unique ID of the moderation task, which is returned after the task is started.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Specifies the allowlist or blocklist for the subscription stream.
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeStreamUserIds SubscribeStreamUserIds;

    /**
     * Get SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the TRTC room. 
     * @return SdkAppId SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the TRTC room.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the TRTC room.
     * @param SdkAppId SDKAppId of TRTC, which is the same as the SDKAppId corresponding to the TRTC room.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Unique ID of the moderation task, which is returned after the task is started. 
     * @return TaskId Unique ID of the moderation task, which is returned after the task is started.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique ID of the moderation task, which is returned after the task is started.
     * @param TaskId Unique ID of the moderation task, which is returned after the task is started.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Specifies the allowlist or blocklist for the subscription stream. 
     * @return SubscribeStreamUserIds Specifies the allowlist or blocklist for the subscription stream.
     */
    public SubscribeStreamUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set Specifies the allowlist or blocklist for the subscription stream.
     * @param SubscribeStreamUserIds Specifies the allowlist or blocklist for the subscription stream.
     */
    public void setSubscribeStreamUserIds(SubscribeStreamUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    public ModifyCloudModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudModerationRequest(ModifyCloudModerationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SubscribeStreamUserIds != null) {
            this.SubscribeStreamUserIds = new SubscribeStreamUserIds(source.SubscribeStreamUserIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);

    }
}

