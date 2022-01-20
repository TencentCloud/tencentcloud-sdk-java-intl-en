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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushDataInfo extends AbstractModel{

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Push path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Push client IP.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * IP of the server that receives the stream.
    */
    @SerializedName("ServerIp")
    @Expose
    private String ServerIp;

    /**
    * Pushed video frame rate in Hz.
    */
    @SerializedName("VideoFps")
    @Expose
    private Long VideoFps;

    /**
    * Video bitrate (Kbps) for publishing
    */
    @SerializedName("VideoSpeed")
    @Expose
    private Long VideoSpeed;

    /**
    * Pushed audio frame rate in Hz.
    */
    @SerializedName("AudioFps")
    @Expose
    private Long AudioFps;

    /**
    * Audio bitrate (Kbps) for publishing
    */
    @SerializedName("AudioSpeed")
    @Expose
    private Long AudioSpeed;

    /**
    * Push domain name.
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * Push start time.
    */
    @SerializedName("BeginPushTime")
    @Expose
    private String BeginPushTime;

    /**
    * Audio codec,
Example: AAC.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Video codec,
Example: H.264.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Resolution.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Sample rate.
    */
    @SerializedName("AsampleRate")
    @Expose
    private Long AsampleRate;

    /**
    * Audio bitrate in `metadata` in Kbps.
    */
    @SerializedName("MetaAudioSpeed")
    @Expose
    private Long MetaAudioSpeed;

    /**
    * Video bitrate in `metadata` in Kbps.
    */
    @SerializedName("MetaVideoSpeed")
    @Expose
    private Long MetaVideoSpeed;

    /**
    * Frame rate in `metadata`.
    */
    @SerializedName("MetaFps")
    @Expose
    private Long MetaFps;

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Push path. 
     * @return AppName Push path.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path.
     * @param AppName Push path.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Push client IP. 
     * @return ClientIp Push client IP.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Push client IP.
     * @param ClientIp Push client IP.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get IP of the server that receives the stream. 
     * @return ServerIp IP of the server that receives the stream.
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set IP of the server that receives the stream.
     * @param ServerIp IP of the server that receives the stream.
     */
    public void setServerIp(String ServerIp) {
        this.ServerIp = ServerIp;
    }

    /**
     * Get Pushed video frame rate in Hz. 
     * @return VideoFps Pushed video frame rate in Hz.
     */
    public Long getVideoFps() {
        return this.VideoFps;
    }

    /**
     * Set Pushed video frame rate in Hz.
     * @param VideoFps Pushed video frame rate in Hz.
     */
    public void setVideoFps(Long VideoFps) {
        this.VideoFps = VideoFps;
    }

    /**
     * Get Video bitrate (Kbps) for publishing 
     * @return VideoSpeed Video bitrate (Kbps) for publishing
     */
    public Long getVideoSpeed() {
        return this.VideoSpeed;
    }

    /**
     * Set Video bitrate (Kbps) for publishing
     * @param VideoSpeed Video bitrate (Kbps) for publishing
     */
    public void setVideoSpeed(Long VideoSpeed) {
        this.VideoSpeed = VideoSpeed;
    }

    /**
     * Get Pushed audio frame rate in Hz. 
     * @return AudioFps Pushed audio frame rate in Hz.
     */
    public Long getAudioFps() {
        return this.AudioFps;
    }

    /**
     * Set Pushed audio frame rate in Hz.
     * @param AudioFps Pushed audio frame rate in Hz.
     */
    public void setAudioFps(Long AudioFps) {
        this.AudioFps = AudioFps;
    }

    /**
     * Get Audio bitrate (Kbps) for publishing 
     * @return AudioSpeed Audio bitrate (Kbps) for publishing
     */
    public Long getAudioSpeed() {
        return this.AudioSpeed;
    }

    /**
     * Set Audio bitrate (Kbps) for publishing
     * @param AudioSpeed Audio bitrate (Kbps) for publishing
     */
    public void setAudioSpeed(Long AudioSpeed) {
        this.AudioSpeed = AudioSpeed;
    }

    /**
     * Get Push domain name. 
     * @return PushDomain Push domain name.
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set Push domain name.
     * @param PushDomain Push domain name.
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get Push start time. 
     * @return BeginPushTime Push start time.
     */
    public String getBeginPushTime() {
        return this.BeginPushTime;
    }

    /**
     * Set Push start time.
     * @param BeginPushTime Push start time.
     */
    public void setBeginPushTime(String BeginPushTime) {
        this.BeginPushTime = BeginPushTime;
    }

    /**
     * Get Audio codec,
Example: AAC. 
     * @return Acodec Audio codec,
Example: AAC.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio codec,
Example: AAC.
     * @param Acodec Audio codec,
Example: AAC.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Video codec,
Example: H.264. 
     * @return Vcodec Video codec,
Example: H.264.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video codec,
Example: H.264.
     * @param Vcodec Video codec,
Example: H.264.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Resolution. 
     * @return Resolution Resolution.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution.
     * @param Resolution Resolution.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Sample rate. 
     * @return AsampleRate Sample rate.
     */
    public Long getAsampleRate() {
        return this.AsampleRate;
    }

    /**
     * Set Sample rate.
     * @param AsampleRate Sample rate.
     */
    public void setAsampleRate(Long AsampleRate) {
        this.AsampleRate = AsampleRate;
    }

    /**
     * Get Audio bitrate in `metadata` in Kbps. 
     * @return MetaAudioSpeed Audio bitrate in `metadata` in Kbps.
     */
    public Long getMetaAudioSpeed() {
        return this.MetaAudioSpeed;
    }

    /**
     * Set Audio bitrate in `metadata` in Kbps.
     * @param MetaAudioSpeed Audio bitrate in `metadata` in Kbps.
     */
    public void setMetaAudioSpeed(Long MetaAudioSpeed) {
        this.MetaAudioSpeed = MetaAudioSpeed;
    }

    /**
     * Get Video bitrate in `metadata` in Kbps. 
     * @return MetaVideoSpeed Video bitrate in `metadata` in Kbps.
     */
    public Long getMetaVideoSpeed() {
        return this.MetaVideoSpeed;
    }

    /**
     * Set Video bitrate in `metadata` in Kbps.
     * @param MetaVideoSpeed Video bitrate in `metadata` in Kbps.
     */
    public void setMetaVideoSpeed(Long MetaVideoSpeed) {
        this.MetaVideoSpeed = MetaVideoSpeed;
    }

    /**
     * Get Frame rate in `metadata`. 
     * @return MetaFps Frame rate in `metadata`.
     */
    public Long getMetaFps() {
        return this.MetaFps;
    }

    /**
     * Set Frame rate in `metadata`.
     * @param MetaFps Frame rate in `metadata`.
     */
    public void setMetaFps(Long MetaFps) {
        this.MetaFps = MetaFps;
    }

    public PushDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushDataInfo(PushDataInfo source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ServerIp != null) {
            this.ServerIp = new String(source.ServerIp);
        }
        if (source.VideoFps != null) {
            this.VideoFps = new Long(source.VideoFps);
        }
        if (source.VideoSpeed != null) {
            this.VideoSpeed = new Long(source.VideoSpeed);
        }
        if (source.AudioFps != null) {
            this.AudioFps = new Long(source.AudioFps);
        }
        if (source.AudioSpeed != null) {
            this.AudioSpeed = new Long(source.AudioSpeed);
        }
        if (source.PushDomain != null) {
            this.PushDomain = new String(source.PushDomain);
        }
        if (source.BeginPushTime != null) {
            this.BeginPushTime = new String(source.BeginPushTime);
        }
        if (source.Acodec != null) {
            this.Acodec = new String(source.Acodec);
        }
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.AsampleRate != null) {
            this.AsampleRate = new Long(source.AsampleRate);
        }
        if (source.MetaAudioSpeed != null) {
            this.MetaAudioSpeed = new Long(source.MetaAudioSpeed);
        }
        if (source.MetaVideoSpeed != null) {
            this.MetaVideoSpeed = new Long(source.MetaVideoSpeed);
        }
        if (source.MetaFps != null) {
            this.MetaFps = new Long(source.MetaFps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ServerIp", this.ServerIp);
        this.setParamSimple(map, prefix + "VideoFps", this.VideoFps);
        this.setParamSimple(map, prefix + "VideoSpeed", this.VideoSpeed);
        this.setParamSimple(map, prefix + "AudioFps", this.AudioFps);
        this.setParamSimple(map, prefix + "AudioSpeed", this.AudioSpeed);
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "BeginPushTime", this.BeginPushTime);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "AsampleRate", this.AsampleRate);
        this.setParamSimple(map, prefix + "MetaAudioSpeed", this.MetaAudioSpeed);
        this.setParamSimple(map, prefix + "MetaVideoSpeed", this.MetaVideoSpeed);
        this.setParamSimple(map, prefix + "MetaFps", this.MetaFps);

    }
}

