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

public class PushQualityData extends AbstractModel{

    /**
    * Data time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Push domain name.
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

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
    * Push start time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level.
    */
    @SerializedName("BeginPushTime")
    @Expose
    private String BeginPushTime;

    /**
    * Resolution information.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Video encoding format.
    */
    @SerializedName("VCodec")
    @Expose
    private String VCodec;

    /**
    * Audio encoding format.
    */
    @SerializedName("ACodec")
    @Expose
    private String ACodec;

    /**
    * Push serial number, which uniquely identifies a push.
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
    * Video frame rate.
    */
    @SerializedName("VideoFps")
    @Expose
    private Long VideoFps;

    /**
    * Video bitrate in bps.
    */
    @SerializedName("VideoRate")
    @Expose
    private Long VideoRate;

    /**
    * Audio frame rate.
    */
    @SerializedName("AudioFps")
    @Expose
    private Long AudioFps;

    /**
    * Audio bitrate in bps.
    */
    @SerializedName("AudioRate")
    @Expose
    private Long AudioRate;

    /**
    * Local elapsed time in milliseconds. The greater the difference between audio/video elapsed time and local elapsed time, the poorer the push quality and the more serious the upstream lag.
    */
    @SerializedName("LocalTs")
    @Expose
    private Long LocalTs;

    /**
    * Video elapsed time in milliseconds.
    */
    @SerializedName("VideoTs")
    @Expose
    private Long VideoTs;

    /**
    * Audio elapsed time in milliseconds.
    */
    @SerializedName("AudioTs")
    @Expose
    private Long AudioTs;

    /**
     * Get Data time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level. 
     * @return Time Data time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Data time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level.
     * @param Time Data time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level.
     */
    public void setTime(String Time) {
        this.Time = Time;
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
     * Get Push start time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level. 
     * @return BeginPushTime Push start time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level.
     */
    public String getBeginPushTime() {
        return this.BeginPushTime;
    }

    /**
     * Set Push start time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level.
     * @param BeginPushTime Push start time in the format of %Y-%m-%d %H:%M:%S.%ms and accurate down to the millisecond level.
     */
    public void setBeginPushTime(String BeginPushTime) {
        this.BeginPushTime = BeginPushTime;
    }

    /**
     * Get Resolution information. 
     * @return Resolution Resolution information.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution information.
     * @param Resolution Resolution information.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Video encoding format. 
     * @return VCodec Video encoding format.
     */
    public String getVCodec() {
        return this.VCodec;
    }

    /**
     * Set Video encoding format.
     * @param VCodec Video encoding format.
     */
    public void setVCodec(String VCodec) {
        this.VCodec = VCodec;
    }

    /**
     * Get Audio encoding format. 
     * @return ACodec Audio encoding format.
     */
    public String getACodec() {
        return this.ACodec;
    }

    /**
     * Set Audio encoding format.
     * @param ACodec Audio encoding format.
     */
    public void setACodec(String ACodec) {
        this.ACodec = ACodec;
    }

    /**
     * Get Push serial number, which uniquely identifies a push. 
     * @return Sequence Push serial number, which uniquely identifies a push.
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set Push serial number, which uniquely identifies a push.
     * @param Sequence Push serial number, which uniquely identifies a push.
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get Video frame rate. 
     * @return VideoFps Video frame rate.
     */
    public Long getVideoFps() {
        return this.VideoFps;
    }

    /**
     * Set Video frame rate.
     * @param VideoFps Video frame rate.
     */
    public void setVideoFps(Long VideoFps) {
        this.VideoFps = VideoFps;
    }

    /**
     * Get Video bitrate in bps. 
     * @return VideoRate Video bitrate in bps.
     */
    public Long getVideoRate() {
        return this.VideoRate;
    }

    /**
     * Set Video bitrate in bps.
     * @param VideoRate Video bitrate in bps.
     */
    public void setVideoRate(Long VideoRate) {
        this.VideoRate = VideoRate;
    }

    /**
     * Get Audio frame rate. 
     * @return AudioFps Audio frame rate.
     */
    public Long getAudioFps() {
        return this.AudioFps;
    }

    /**
     * Set Audio frame rate.
     * @param AudioFps Audio frame rate.
     */
    public void setAudioFps(Long AudioFps) {
        this.AudioFps = AudioFps;
    }

    /**
     * Get Audio bitrate in bps. 
     * @return AudioRate Audio bitrate in bps.
     */
    public Long getAudioRate() {
        return this.AudioRate;
    }

    /**
     * Set Audio bitrate in bps.
     * @param AudioRate Audio bitrate in bps.
     */
    public void setAudioRate(Long AudioRate) {
        this.AudioRate = AudioRate;
    }

    /**
     * Get Local elapsed time in milliseconds. The greater the difference between audio/video elapsed time and local elapsed time, the poorer the push quality and the more serious the upstream lag. 
     * @return LocalTs Local elapsed time in milliseconds. The greater the difference between audio/video elapsed time and local elapsed time, the poorer the push quality and the more serious the upstream lag.
     */
    public Long getLocalTs() {
        return this.LocalTs;
    }

    /**
     * Set Local elapsed time in milliseconds. The greater the difference between audio/video elapsed time and local elapsed time, the poorer the push quality and the more serious the upstream lag.
     * @param LocalTs Local elapsed time in milliseconds. The greater the difference between audio/video elapsed time and local elapsed time, the poorer the push quality and the more serious the upstream lag.
     */
    public void setLocalTs(Long LocalTs) {
        this.LocalTs = LocalTs;
    }

    /**
     * Get Video elapsed time in milliseconds. 
     * @return VideoTs Video elapsed time in milliseconds.
     */
    public Long getVideoTs() {
        return this.VideoTs;
    }

    /**
     * Set Video elapsed time in milliseconds.
     * @param VideoTs Video elapsed time in milliseconds.
     */
    public void setVideoTs(Long VideoTs) {
        this.VideoTs = VideoTs;
    }

    /**
     * Get Audio elapsed time in milliseconds. 
     * @return AudioTs Audio elapsed time in milliseconds.
     */
    public Long getAudioTs() {
        return this.AudioTs;
    }

    /**
     * Set Audio elapsed time in milliseconds.
     * @param AudioTs Audio elapsed time in milliseconds.
     */
    public void setAudioTs(Long AudioTs) {
        this.AudioTs = AudioTs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "BeginPushTime", this.BeginPushTime);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "VCodec", this.VCodec);
        this.setParamSimple(map, prefix + "ACodec", this.ACodec);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "VideoFps", this.VideoFps);
        this.setParamSimple(map, prefix + "VideoRate", this.VideoRate);
        this.setParamSimple(map, prefix + "AudioFps", this.AudioFps);
        this.setParamSimple(map, prefix + "AudioRate", this.AudioRate);
        this.setParamSimple(map, prefix + "LocalTs", this.LocalTs);
        this.setParamSimple(map, prefix + "VideoTs", this.VideoTs);
        this.setParamSimple(map, prefix + "AudioTs", this.AudioTs);

    }
}

