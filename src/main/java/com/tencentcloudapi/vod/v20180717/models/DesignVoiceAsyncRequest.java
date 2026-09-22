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

public class DesignVoiceAsyncRequest extends AbstractModel {

    /**
    * <p>Voice description.</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>VOD app ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * <p>Voice settings</p>
    */
    @SerializedName("VoiceSettings")
    @Expose
    private VoiceSettings VoiceSettings;

    /**
    * <p>Audition synthetic text, up to 500 characters</p>
    */
    @SerializedName("PreviewText")
    @Expose
    private String PreviewText;

    /**
    * <p>Extended parameters in the format of a JSON string.</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
    * <p>Identifies source context. This is used to pass through user request information. The callback and task flow status change callback return the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Identification Code for Task Deduplication. If a request with the same identification code within the past 3 days, an error will be returned for the current request. The longest is 50 characters. With empty string or not specified indicate no deduplication.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get <p>Voice description.</p> 
     * @return Prompt <p>Voice description.</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>Voice description.</p>
     * @param Prompt <p>Voice description.</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>VOD app ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</p> 
     * @return SubAppId <p>VOD app ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</p>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>VOD app ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</p>
     * @param SubAppId <p>VOD app ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</p>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Voice settings</p> 
     * @return VoiceSettings <p>Voice settings</p>
     */
    public VoiceSettings getVoiceSettings() {
        return this.VoiceSettings;
    }

    /**
     * Set <p>Voice settings</p>
     * @param VoiceSettings <p>Voice settings</p>
     */
    public void setVoiceSettings(VoiceSettings VoiceSettings) {
        this.VoiceSettings = VoiceSettings;
    }

    /**
     * Get <p>Audition synthetic text, up to 500 characters</p> 
     * @return PreviewText <p>Audition synthetic text, up to 500 characters</p>
     */
    public String getPreviewText() {
        return this.PreviewText;
    }

    /**
     * Set <p>Audition synthetic text, up to 500 characters</p>
     * @param PreviewText <p>Audition synthetic text, up to 500 characters</p>
     */
    public void setPreviewText(String PreviewText) {
        this.PreviewText = PreviewText;
    }

    /**
     * Get <p>Extended parameters in the format of a JSON string.</p> 
     * @return ExtParam <p>Extended parameters in the format of a JSON string.</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Extended parameters in the format of a JSON string.</p>
     * @param ExtParam <p>Extended parameters in the format of a JSON string.</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    /**
     * Get <p>Identifies source context. This is used to pass through user request information. The callback and task flow status change callback return the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Identifies source context. This is used to pass through user request information. The callback and task flow status change callback return the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Identifies source context. This is used to pass through user request information. The callback and task flow status change callback return the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Identifies source context. This is used to pass through user request information. The callback and task flow status change callback return the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Identification Code for Task Deduplication. If a request with the same identification code within the past 3 days, an error will be returned for the current request. The longest is 50 characters. With empty string or not specified indicate no deduplication.</p> 
     * @return SessionId <p>Identification Code for Task Deduplication. If a request with the same identification code within the past 3 days, an error will be returned for the current request. The longest is 50 characters. With empty string or not specified indicate no deduplication.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identification Code for Task Deduplication. If a request with the same identification code within the past 3 days, an error will be returned for the current request. The longest is 50 characters. With empty string or not specified indicate no deduplication.</p>
     * @param SessionId <p>Identification Code for Task Deduplication. If a request with the same identification code within the past 3 days, an error will be returned for the current request. The longest is 50 characters. With empty string or not specified indicate no deduplication.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public DesignVoiceAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesignVoiceAsyncRequest(DesignVoiceAsyncRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.VoiceSettings != null) {
            this.VoiceSettings = new VoiceSettings(source.VoiceSettings);
        }
        if (source.PreviewText != null) {
            this.PreviewText = new String(source.PreviewText);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
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
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "VoiceSettings.", this.VoiceSettings);
        this.setParamSimple(map, prefix + "PreviewText", this.PreviewText);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

