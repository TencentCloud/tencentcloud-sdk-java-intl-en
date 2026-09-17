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

public class CreateAigcSubjectRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("SubjectName")
    @Expose
    private String SubjectName;

    /**
    * 
    */
    @SerializedName("SubjectImages")
    @Expose
    private String [] SubjectImages;

    /**
    * 
    */
    @SerializedName("SubjectVideos")
    @Expose
    private String [] SubjectVideos;

    /**
    * 
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

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
     * @return SubjectName 
     */
    public String getSubjectName() {
        return this.SubjectName;
    }

    /**
     * Set 
     * @param SubjectName 
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * Get  
     * @return SubjectImages 
     */
    public String [] getSubjectImages() {
        return this.SubjectImages;
    }

    /**
     * Set 
     * @param SubjectImages 
     */
    public void setSubjectImages(String [] SubjectImages) {
        this.SubjectImages = SubjectImages;
    }

    /**
     * Get  
     * @return SubjectVideos 
     */
    public String [] getSubjectVideos() {
        return this.SubjectVideos;
    }

    /**
     * Set 
     * @param SubjectVideos 
     */
    public void setSubjectVideos(String [] SubjectVideos) {
        this.SubjectVideos = SubjectVideos;
    }

    /**
     * Get  
     * @return VoiceId 
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 
     * @param VoiceId 
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
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

    public CreateAigcSubjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcSubjectRequest(CreateAigcSubjectRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SubjectName != null) {
            this.SubjectName = new String(source.SubjectName);
        }
        if (source.SubjectImages != null) {
            this.SubjectImages = new String[source.SubjectImages.length];
            for (int i = 0; i < source.SubjectImages.length; i++) {
                this.SubjectImages[i] = new String(source.SubjectImages[i]);
            }
        }
        if (source.SubjectVideos != null) {
            this.SubjectVideos = new String[source.SubjectVideos.length];
            for (int i = 0; i < source.SubjectVideos.length; i++) {
                this.SubjectVideos[i] = new String(source.SubjectVideos[i]);
            }
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
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
        this.setParamSimple(map, prefix + "SubjectName", this.SubjectName);
        this.setParamArraySimple(map, prefix + "SubjectImages.", this.SubjectImages);
        this.setParamArraySimple(map, prefix + "SubjectVideos.", this.SubjectVideos);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

