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
package com.tencentcloudapi.tts.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToVoiceResponse extends AbstractModel {

    /**
    * Base64-encoded WAV/MP3 audio data
    */
    @SerializedName("Audio")
    @Expose
    private String Audio;

    /**
    * The `SessionId` of a request
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Timestamp information. If the timestamp feature is not enabled, an empty array will be returned.
    */
    @SerializedName("Subtitles")
    @Expose
    private Subtitle [] Subtitles;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Base64-encoded WAV/MP3 audio data 
     * @return Audio Base64-encoded WAV/MP3 audio data
     */
    public String getAudio() {
        return this.Audio;
    }

    /**
     * Set Base64-encoded WAV/MP3 audio data
     * @param Audio Base64-encoded WAV/MP3 audio data
     */
    public void setAudio(String Audio) {
        this.Audio = Audio;
    }

    /**
     * Get The `SessionId` of a request 
     * @return SessionId The `SessionId` of a request
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The `SessionId` of a request
     * @param SessionId The `SessionId` of a request
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Timestamp information. If the timestamp feature is not enabled, an empty array will be returned. 
     * @return Subtitles Timestamp information. If the timestamp feature is not enabled, an empty array will be returned.
     */
    public Subtitle [] getSubtitles() {
        return this.Subtitles;
    }

    /**
     * Set Timestamp information. If the timestamp feature is not enabled, an empty array will be returned.
     * @param Subtitles Timestamp information. If the timestamp feature is not enabled, an empty array will be returned.
     */
    public void setSubtitles(Subtitle [] Subtitles) {
        this.Subtitles = Subtitles;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public TextToVoiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToVoiceResponse(TextToVoiceResponse source) {
        if (source.Audio != null) {
            this.Audio = new String(source.Audio);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Subtitles != null) {
            this.Subtitles = new Subtitle[source.Subtitles.length];
            for (int i = 0; i < source.Subtitles.length; i++) {
                this.Subtitles[i] = new Subtitle(source.Subtitles[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Audio", this.Audio);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArrayObj(map, prefix + "Subtitles.", this.Subtitles);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

