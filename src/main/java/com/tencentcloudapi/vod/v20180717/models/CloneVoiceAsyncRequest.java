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

public class CloneVoiceAsyncRequest extends AbstractModel {

    /**
    * <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be filled in with the app ID to access resources in VOD applications, whether in the default or a newly created application.</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * <p>Base64-encoded audio for cloning.</p>
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * <p>Cloning audio URL. Valid when AudioData is empty.</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p>
    */
    @SerializedName("AudioFileId")
    @Expose
    private String AudioFileId;

    /**
    * <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * <p>Timbre clone expansion parameters. Supported fields of <code>ExtParam</code>: </p><ul><li><code>text</code> (string): Text for audition synthesis, up to 1000 characters; do not return the audition audio when empty or not passed.</li></ul>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
    * <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be filled in with the app ID to access resources in VOD applications, whether in the default or a newly created application.</p> 
     * @return SubAppId <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be filled in with the app ID to access resources in VOD applications, whether in the default or a newly created application.</p>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be filled in with the app ID to access resources in VOD applications, whether in the default or a newly created application.</p>
     * @param SubAppId <p>VOD application ID. For customers who activate on-demand services on or after December 25, 2023, this field must be filled in with the app ID to access resources in VOD applications, whether in the default or a newly created application.</p>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Base64-encoded audio for cloning.</p> 
     * @return AudioData <p>Base64-encoded audio for cloning.</p>
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set <p>Base64-encoded audio for cloning.</p>
     * @param AudioData <p>Base64-encoded audio for cloning.</p>
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get <p>Cloning audio URL. Valid when AudioData is empty.</p> 
     * @return AudioUrl <p>Cloning audio URL. Valid when AudioData is empty.</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>Cloning audio URL. Valid when AudioData is empty.</p>
     * @param AudioUrl <p>Cloning audio URL. Valid when AudioData is empty.</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p> 
     * @return AudioFileId <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p>
     */
    public String getAudioFileId() {
        return this.AudioFileId;
    }

    /**
     * Set <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p>
     * @param AudioFileId <p>Clone file FileID. Valid when AudioData and AudioUrl are empty</p>
     */
    public void setAudioFileId(String AudioFileId) {
        this.AudioFileId = AudioFileId;
    }

    /**
     * Get <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p> 
     * @return LanguageBoost <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
     */
    public String getLanguageBoost() {
        return this.LanguageBoost;
    }

    /**
     * Set <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
     * @param LanguageBoost <p>Language enhancement, such as "zh" "en" "auto", default "auto"</p>
     */
    public void setLanguageBoost(String LanguageBoost) {
        this.LanguageBoost = LanguageBoost;
    }

    /**
     * Get <p>Timbre clone expansion parameters. Supported fields of <code>ExtParam</code>: </p><ul><li><code>text</code> (string): Text for audition synthesis, up to 1000 characters; do not return the audition audio when empty or not passed.</li></ul> 
     * @return ExtParam <p>Timbre clone expansion parameters. Supported fields of <code>ExtParam</code>: </p><ul><li><code>text</code> (string): Text for audition synthesis, up to 1000 characters; do not return the audition audio when empty or not passed.</li></ul>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>Timbre clone expansion parameters. Supported fields of <code>ExtParam</code>: </p><ul><li><code>text</code> (string): Text for audition synthesis, up to 1000 characters; do not return the audition audio when empty or not passed.</li></ul>
     * @param ExtParam <p>Timbre clone expansion parameters. Supported fields of <code>ExtParam</code>: </p><ul><li><code>text</code> (string): Text for audition synthesis, up to 1000 characters; do not return the audition audio when empty or not passed.</li></ul>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    /**
     * Get <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Identifies the source context. This is used to pass user request information. The value of this field will be returned in callbacks and task flow status change callbacks. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p> 
     * @return SessionId <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p>
     * @param SessionId <p>Identification Code for Task Deduplication. If a request with the same identification code has been sent within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, it indicates no deduplication.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public CloneVoiceAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneVoiceAsyncRequest(CloneVoiceAsyncRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioFileId != null) {
            this.AudioFileId = new String(source.AudioFileId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "AudioFileId", this.AudioFileId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

