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

public class CreateAigcAudioCloneRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("AudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo AudioFileInfo;

    /**
    * 
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 
    */
    @SerializedName("PromptAudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo PromptAudioFileInfo;

    /**
    * 
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
    * 
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

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
    * 
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

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
     * @return AudioFileInfo 
     */
    public AigcAudioCloneInputFileInfo getAudioFileInfo() {
        return this.AudioFileInfo;
    }

    /**
     * Set 
     * @param AudioFileInfo 
     */
    public void setAudioFileInfo(AigcAudioCloneInputFileInfo AudioFileInfo) {
        this.AudioFileInfo = AudioFileInfo;
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
     * @return Text 
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 
     * @param Text 
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get  
     * @return PromptAudioFileInfo 
     */
    public AigcAudioCloneInputFileInfo getPromptAudioFileInfo() {
        return this.PromptAudioFileInfo;
    }

    /**
     * Set 
     * @param PromptAudioFileInfo 
     */
    public void setPromptAudioFileInfo(AigcAudioCloneInputFileInfo PromptAudioFileInfo) {
        this.PromptAudioFileInfo = PromptAudioFileInfo;
    }

    /**
     * Get  
     * @return PromptText 
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set 
     * @param PromptText 
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    /**
     * Get  
     * @return Payload 
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 
     * @param Payload 
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
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

    /**
     * Get  
     * @return ExtInfo 
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 
     * @param ExtInfo 
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcAudioCloneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioCloneRequest(CreateAigcAudioCloneRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.AudioFileInfo != null) {
            this.AudioFileInfo = new AigcAudioCloneInputFileInfo(source.AudioFileInfo);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.PromptAudioFileInfo != null) {
            this.PromptAudioFileInfo = new AigcAudioCloneInputFileInfo(source.PromptAudioFileInfo);
        }
        if (source.PromptText != null) {
            this.PromptText = new String(source.PromptText);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
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
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "AudioFileInfo.", this.AudioFileInfo);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "PromptAudioFileInfo.", this.PromptAudioFileInfo);
        this.setParamSimple(map, prefix + "PromptText", this.PromptText);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

