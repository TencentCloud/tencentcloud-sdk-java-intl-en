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

public class TextToSpeechAsyncRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * 
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
    * 
    */
    @SerializedName("Output")
    @Expose
    private TextToSpeechAsyncOutputOption Output;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

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
     * @return SubAppId 
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return LanguageBoost 
     */
    public String getLanguageBoost() {
        return this.LanguageBoost;
    }

    /**
     * Set 
     * @param LanguageBoost 
     */
    public void setLanguageBoost(String LanguageBoost) {
        this.LanguageBoost = LanguageBoost;
    }

    /**
     * Get  
     * @return ExtParam 
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set 
     * @param ExtParam 
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    /**
     * Get  
     * @return Output 
     */
    public TextToSpeechAsyncOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set 
     * @param Output 
     */
    public void setOutput(TextToSpeechAsyncOutputOption Output) {
        this.Output = Output;
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

    public TextToSpeechAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToSpeechAsyncRequest(TextToSpeechAsyncRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
        if (source.Output != null) {
            this.Output = new TextToSpeechAsyncOutputOption(source.Output);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

