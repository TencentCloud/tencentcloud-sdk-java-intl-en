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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlaySoundCallRequest extends AbstractModel {

    /**
    * App ID (required). you can view it at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Session ID.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Audio file ID. please refer to the management console - telephone customer service - audio file management.
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * Number of playbacks. default 1.
    */
    @SerializedName("PlayTimes")
    @Expose
    private Long PlayTimes;

    /**
     * Get App ID (required). you can view it at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId App ID (required). you can view it at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set App ID (required). you can view it at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId App ID (required). you can view it at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Session ID. 
     * @return SessionId Session ID.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session ID.
     * @param SessionId Session ID.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Audio file ID. please refer to the management console - telephone customer service - audio file management. 
     * @return FileId Audio file ID. please refer to the management console - telephone customer service - audio file management.
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * Set Audio file ID. please refer to the management console - telephone customer service - audio file management.
     * @param FileId Audio file ID. please refer to the management console - telephone customer service - audio file management.
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Number of playbacks. default 1. 
     * @return PlayTimes Number of playbacks. default 1.
     */
    public Long getPlayTimes() {
        return this.PlayTimes;
    }

    /**
     * Set Number of playbacks. default 1.
     * @param PlayTimes Number of playbacks. default 1.
     */
    public void setPlayTimes(Long PlayTimes) {
        this.PlayTimes = PlayTimes;
    }

    public PlaySoundCallRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlaySoundCallRequest(PlaySoundCallRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.FileId != null) {
            this.FileId = new Long(source.FileId);
        }
        if (source.PlayTimes != null) {
            this.PlayTimes = new Long(source.PlayTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "PlayTimes", this.PlayTimes);

    }
}

