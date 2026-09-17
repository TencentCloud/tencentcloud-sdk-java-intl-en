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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcCustomVoiceRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * 
    */
    @SerializedName("VoiceUrl")
    @Expose
    private String VoiceUrl;

    /**
    * 
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
    * 
    */
    @SerializedName("DisableModeration")
    @Expose
    private String DisableModeration;

    /**
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return VoiceName 
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set 
     * @param VoiceName 
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get  
     * @return VoiceUrl 
     */
    public String getVoiceUrl() {
        return this.VoiceUrl;
    }

    /**
     * Set 
     * @param VoiceUrl 
     */
    public void setVoiceUrl(String VoiceUrl) {
        this.VoiceUrl = VoiceUrl;
    }

    /**
     * Get  
     * @return VideoId 
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * Set 
     * @param VideoId 
     */
    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    /**
     * Get  
     * @return DisableModeration 
     */
    public String getDisableModeration() {
        return this.DisableModeration;
    }

    /**
     * Set 
     * @param DisableModeration 
     */
    public void setDisableModeration(String DisableModeration) {
        this.DisableModeration = DisableModeration;
    }

    /**
     * Get  
     * @return SessionId 
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 
     * @param SessionId 
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get  
     * @return SessionContext 
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 
     * @param SessionContext 
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get  
     * @return TasksPriority 
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 
     * @param TasksPriority 
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public CreateAigcCustomVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcCustomVoiceRequest(CreateAigcCustomVoiceRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.VoiceUrl != null) {
            this.VoiceUrl = new String(source.VoiceUrl);
        }
        if (source.VideoId != null) {
            this.VideoId = new String(source.VideoId);
        }
        if (source.DisableModeration != null) {
            this.DisableModeration = new String(source.DisableModeration);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "VoiceUrl", this.VoiceUrl);
        this.setParamSimple(map, prefix + "VideoId", this.VideoId);
        this.setParamSimple(map, prefix + "DisableModeration", this.DisableModeration);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

