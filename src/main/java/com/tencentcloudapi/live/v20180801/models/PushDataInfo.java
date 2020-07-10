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
    * Push receiving server IP.
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
    * Pushed video bitrate in bps.
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
    * Pushed audio bitrate in bps.
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
    * Audio encoding format.
Example: AAC.
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Video encoding format.
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
    * 
    */
    @SerializedName("AsampleRate")
    @Expose
    private Long AsampleRate;

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
     * Get Push receiving server IP. 
     * @return ServerIp Push receiving server IP.
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set Push receiving server IP.
     * @param ServerIp Push receiving server IP.
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
     * Get Pushed video bitrate in bps. 
     * @return VideoSpeed Pushed video bitrate in bps.
     */
    public Long getVideoSpeed() {
        return this.VideoSpeed;
    }

    /**
     * Set Pushed video bitrate in bps.
     * @param VideoSpeed Pushed video bitrate in bps.
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
     * Get Pushed audio bitrate in bps. 
     * @return AudioSpeed Pushed audio bitrate in bps.
     */
    public Long getAudioSpeed() {
        return this.AudioSpeed;
    }

    /**
     * Set Pushed audio bitrate in bps.
     * @param AudioSpeed Pushed audio bitrate in bps.
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
     * Get Audio encoding format.
Example: AAC. 
     * @return Acodec Audio encoding format.
Example: AAC.
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio encoding format.
Example: AAC.
     * @param Acodec Audio encoding format.
Example: AAC.
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Video encoding format.
Example: H.264. 
     * @return Vcodec Video encoding format.
Example: H.264.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video encoding format.
Example: H.264.
     * @param Vcodec Video encoding format.
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
     * Get  
     * @return AsampleRate 
     */
    public Long getAsampleRate() {
        return this.AsampleRate;
    }

    /**
     * Set 
     * @param AsampleRate 
     */
    public void setAsampleRate(Long AsampleRate) {
        this.AsampleRate = AsampleRate;
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

    }
}

