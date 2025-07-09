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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamInfo extends AbstractModel {

    /**
    * Client IP.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Video information of pushed streams.
    */
    @SerializedName("Video")
    @Expose
    private StreamVideoInfo [] Video;

    /**
    * Audio information of pushed streams.
    */
    @SerializedName("Audio")
    @Expose
    private StreamAudioInfo [] Audio;

    /**
    * SCTE-35 information of pushed streams.
    */
    @SerializedName("Scte35")
    @Expose
    private StreamScte35Info [] Scte35;

    /**
     * Get Client IP. 
     * @return ClientIp Client IP.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP.
     * @param ClientIp Client IP.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Video information of pushed streams. 
     * @return Video Video information of pushed streams.
     */
    public StreamVideoInfo [] getVideo() {
        return this.Video;
    }

    /**
     * Set Video information of pushed streams.
     * @param Video Video information of pushed streams.
     */
    public void setVideo(StreamVideoInfo [] Video) {
        this.Video = Video;
    }

    /**
     * Get Audio information of pushed streams. 
     * @return Audio Audio information of pushed streams.
     */
    public StreamAudioInfo [] getAudio() {
        return this.Audio;
    }

    /**
     * Set Audio information of pushed streams.
     * @param Audio Audio information of pushed streams.
     */
    public void setAudio(StreamAudioInfo [] Audio) {
        this.Audio = Audio;
    }

    /**
     * Get SCTE-35 information of pushed streams. 
     * @return Scte35 SCTE-35 information of pushed streams.
     */
    public StreamScte35Info [] getScte35() {
        return this.Scte35;
    }

    /**
     * Set SCTE-35 information of pushed streams.
     * @param Scte35 SCTE-35 information of pushed streams.
     */
    public void setScte35(StreamScte35Info [] Scte35) {
        this.Scte35 = Scte35;
    }

    public StreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamInfo(StreamInfo source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Video != null) {
            this.Video = new StreamVideoInfo[source.Video.length];
            for (int i = 0; i < source.Video.length; i++) {
                this.Video[i] = new StreamVideoInfo(source.Video[i]);
            }
        }
        if (source.Audio != null) {
            this.Audio = new StreamAudioInfo[source.Audio.length];
            for (int i = 0; i < source.Audio.length; i++) {
                this.Audio[i] = new StreamAudioInfo(source.Audio[i]);
            }
        }
        if (source.Scte35 != null) {
            this.Scte35 = new StreamScte35Info[source.Scte35.length];
            for (int i = 0; i < source.Scte35.length; i++) {
                this.Scte35[i] = new StreamScte35Info(source.Scte35[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamArrayObj(map, prefix + "Video.", this.Video);
        this.setParamArrayObj(map, prefix + "Audio.", this.Audio);
        this.setParamArrayObj(map, prefix + "Scte35.", this.Scte35);

    }
}

