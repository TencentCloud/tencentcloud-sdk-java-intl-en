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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PushQualityData extends AbstractModel {

    /**
    * The time of the data in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond).
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * The push domain.
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * The push path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The IP address of the push client.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * The push start time in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond).
    */
    @SerializedName("BeginPushTime")
    @Expose
    private String BeginPushTime;

    /**
    * The resolution.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * The video codec.
    */
    @SerializedName("VCodec")
    @Expose
    private String VCodec;

    /**
    * The audio codec.
    */
    @SerializedName("ACodec")
    @Expose
    private String ACodec;

    /**
    * The push sequence number, which uniquely identifies a push.
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
    * The video frame rate.
    */
    @SerializedName("VideoFps")
    @Expose
    private Long VideoFps;

    /**
    * The video bitrate (bps).
    */
    @SerializedName("VideoRate")
    @Expose
    private Long VideoRate;

    /**
    * The audio frame rate.
    */
    @SerializedName("AudioFps")
    @Expose
    private Long AudioFps;

    /**
    * The audio bitrate (bps).
    */
    @SerializedName("AudioRate")
    @Expose
    private Long AudioRate;

    /**
    * The local elapsed time (milliseconds). The greater the difference between the local elapsed time and audio/video elapsed time, the poorer the push quality and the more severe the upstream lag.
    */
    @SerializedName("LocalTs")
    @Expose
    private Long LocalTs;

    /**
    * The video elapsed time (milliseconds).
    */
    @SerializedName("VideoTs")
    @Expose
    private Long VideoTs;

    /**
    * The audio elapsed time (milliseconds).
    */
    @SerializedName("AudioTs")
    @Expose
    private Long AudioTs;

    /**
    * The video bitrate (Kbps) in the metadata.
    */
    @SerializedName("MetaVideoRate")
    @Expose
    private Long MetaVideoRate;

    /**
    * The audio bitrate (Kbps) in the metadata.
    */
    @SerializedName("MetaAudioRate")
    @Expose
    private Long MetaAudioRate;

    /**
    * The frame rate in the metadata.
    */
    @SerializedName("MateFps")
    @Expose
    private Long MateFps;

    /**
    * The push parameter.
    */
    @SerializedName("StreamParam")
    @Expose
    private String StreamParam;

    /**
    * The bandwidth (Mbps).
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * The traffic (MB).
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * The IP address of the push client.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerIp")
    @Expose
    private String ServerIp;

    /**
     * Get The time of the data in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond). 
     * @return Time The time of the data in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond).
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set The time of the data in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond).
     * @param Time The time of the data in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond).
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get The push domain. 
     * @return PushDomain The push domain.
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set The push domain.
     * @param PushDomain The push domain.
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get The push path. 
     * @return AppName The push path.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The push path.
     * @param AppName The push path.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The IP address of the push client. 
     * @return ClientIp The IP address of the push client.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set The IP address of the push client.
     * @param ClientIp The IP address of the push client.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get The push start time in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond). 
     * @return BeginPushTime The push start time in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond).
     */
    public String getBeginPushTime() {
        return this.BeginPushTime;
    }

    /**
     * Set The push start time in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond).
     * @param BeginPushTime The push start time in the format of “%Y-%m-%d %H:%M:%S.%ms” (accurate to the millisecond).
     */
    public void setBeginPushTime(String BeginPushTime) {
        this.BeginPushTime = BeginPushTime;
    }

    /**
     * Get The resolution. 
     * @return Resolution The resolution.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set The resolution.
     * @param Resolution The resolution.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get The video codec. 
     * @return VCodec The video codec.
     */
    public String getVCodec() {
        return this.VCodec;
    }

    /**
     * Set The video codec.
     * @param VCodec The video codec.
     */
    public void setVCodec(String VCodec) {
        this.VCodec = VCodec;
    }

    /**
     * Get The audio codec. 
     * @return ACodec The audio codec.
     */
    public String getACodec() {
        return this.ACodec;
    }

    /**
     * Set The audio codec.
     * @param ACodec The audio codec.
     */
    public void setACodec(String ACodec) {
        this.ACodec = ACodec;
    }

    /**
     * Get The push sequence number, which uniquely identifies a push. 
     * @return Sequence The push sequence number, which uniquely identifies a push.
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set The push sequence number, which uniquely identifies a push.
     * @param Sequence The push sequence number, which uniquely identifies a push.
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get The video frame rate. 
     * @return VideoFps The video frame rate.
     */
    public Long getVideoFps() {
        return this.VideoFps;
    }

    /**
     * Set The video frame rate.
     * @param VideoFps The video frame rate.
     */
    public void setVideoFps(Long VideoFps) {
        this.VideoFps = VideoFps;
    }

    /**
     * Get The video bitrate (bps). 
     * @return VideoRate The video bitrate (bps).
     */
    public Long getVideoRate() {
        return this.VideoRate;
    }

    /**
     * Set The video bitrate (bps).
     * @param VideoRate The video bitrate (bps).
     */
    public void setVideoRate(Long VideoRate) {
        this.VideoRate = VideoRate;
    }

    /**
     * Get The audio frame rate. 
     * @return AudioFps The audio frame rate.
     */
    public Long getAudioFps() {
        return this.AudioFps;
    }

    /**
     * Set The audio frame rate.
     * @param AudioFps The audio frame rate.
     */
    public void setAudioFps(Long AudioFps) {
        this.AudioFps = AudioFps;
    }

    /**
     * Get The audio bitrate (bps). 
     * @return AudioRate The audio bitrate (bps).
     */
    public Long getAudioRate() {
        return this.AudioRate;
    }

    /**
     * Set The audio bitrate (bps).
     * @param AudioRate The audio bitrate (bps).
     */
    public void setAudioRate(Long AudioRate) {
        this.AudioRate = AudioRate;
    }

    /**
     * Get The local elapsed time (milliseconds). The greater the difference between the local elapsed time and audio/video elapsed time, the poorer the push quality and the more severe the upstream lag. 
     * @return LocalTs The local elapsed time (milliseconds). The greater the difference between the local elapsed time and audio/video elapsed time, the poorer the push quality and the more severe the upstream lag.
     */
    public Long getLocalTs() {
        return this.LocalTs;
    }

    /**
     * Set The local elapsed time (milliseconds). The greater the difference between the local elapsed time and audio/video elapsed time, the poorer the push quality and the more severe the upstream lag.
     * @param LocalTs The local elapsed time (milliseconds). The greater the difference between the local elapsed time and audio/video elapsed time, the poorer the push quality and the more severe the upstream lag.
     */
    public void setLocalTs(Long LocalTs) {
        this.LocalTs = LocalTs;
    }

    /**
     * Get The video elapsed time (milliseconds). 
     * @return VideoTs The video elapsed time (milliseconds).
     */
    public Long getVideoTs() {
        return this.VideoTs;
    }

    /**
     * Set The video elapsed time (milliseconds).
     * @param VideoTs The video elapsed time (milliseconds).
     */
    public void setVideoTs(Long VideoTs) {
        this.VideoTs = VideoTs;
    }

    /**
     * Get The audio elapsed time (milliseconds). 
     * @return AudioTs The audio elapsed time (milliseconds).
     */
    public Long getAudioTs() {
        return this.AudioTs;
    }

    /**
     * Set The audio elapsed time (milliseconds).
     * @param AudioTs The audio elapsed time (milliseconds).
     */
    public void setAudioTs(Long AudioTs) {
        this.AudioTs = AudioTs;
    }

    /**
     * Get The video bitrate (Kbps) in the metadata. 
     * @return MetaVideoRate The video bitrate (Kbps) in the metadata.
     */
    public Long getMetaVideoRate() {
        return this.MetaVideoRate;
    }

    /**
     * Set The video bitrate (Kbps) in the metadata.
     * @param MetaVideoRate The video bitrate (Kbps) in the metadata.
     */
    public void setMetaVideoRate(Long MetaVideoRate) {
        this.MetaVideoRate = MetaVideoRate;
    }

    /**
     * Get The audio bitrate (Kbps) in the metadata. 
     * @return MetaAudioRate The audio bitrate (Kbps) in the metadata.
     */
    public Long getMetaAudioRate() {
        return this.MetaAudioRate;
    }

    /**
     * Set The audio bitrate (Kbps) in the metadata.
     * @param MetaAudioRate The audio bitrate (Kbps) in the metadata.
     */
    public void setMetaAudioRate(Long MetaAudioRate) {
        this.MetaAudioRate = MetaAudioRate;
    }

    /**
     * Get The frame rate in the metadata. 
     * @return MateFps The frame rate in the metadata.
     */
    public Long getMateFps() {
        return this.MateFps;
    }

    /**
     * Set The frame rate in the metadata.
     * @param MateFps The frame rate in the metadata.
     */
    public void setMateFps(Long MateFps) {
        this.MateFps = MateFps;
    }

    /**
     * Get The push parameter. 
     * @return StreamParam The push parameter.
     */
    public String getStreamParam() {
        return this.StreamParam;
    }

    /**
     * Set The push parameter.
     * @param StreamParam The push parameter.
     */
    public void setStreamParam(String StreamParam) {
        this.StreamParam = StreamParam;
    }

    /**
     * Get The bandwidth (Mbps). 
     * @return Bandwidth The bandwidth (Mbps).
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set The bandwidth (Mbps).
     * @param Bandwidth The bandwidth (Mbps).
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get The traffic (MB). 
     * @return Flux The traffic (MB).
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * Set The traffic (MB).
     * @param Flux The traffic (MB).
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * Get The IP address of the push client.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerIp The IP address of the push client.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set The IP address of the push client.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerIp The IP address of the push client.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerIp(String ServerIp) {
        this.ServerIp = ServerIp;
    }

    public PushQualityData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PushQualityData(PushQualityData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.PushDomain != null) {
            this.PushDomain = new String(source.PushDomain);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.BeginPushTime != null) {
            this.BeginPushTime = new String(source.BeginPushTime);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.VCodec != null) {
            this.VCodec = new String(source.VCodec);
        }
        if (source.ACodec != null) {
            this.ACodec = new String(source.ACodec);
        }
        if (source.Sequence != null) {
            this.Sequence = new String(source.Sequence);
        }
        if (source.VideoFps != null) {
            this.VideoFps = new Long(source.VideoFps);
        }
        if (source.VideoRate != null) {
            this.VideoRate = new Long(source.VideoRate);
        }
        if (source.AudioFps != null) {
            this.AudioFps = new Long(source.AudioFps);
        }
        if (source.AudioRate != null) {
            this.AudioRate = new Long(source.AudioRate);
        }
        if (source.LocalTs != null) {
            this.LocalTs = new Long(source.LocalTs);
        }
        if (source.VideoTs != null) {
            this.VideoTs = new Long(source.VideoTs);
        }
        if (source.AudioTs != null) {
            this.AudioTs = new Long(source.AudioTs);
        }
        if (source.MetaVideoRate != null) {
            this.MetaVideoRate = new Long(source.MetaVideoRate);
        }
        if (source.MetaAudioRate != null) {
            this.MetaAudioRate = new Long(source.MetaAudioRate);
        }
        if (source.MateFps != null) {
            this.MateFps = new Long(source.MateFps);
        }
        if (source.StreamParam != null) {
            this.StreamParam = new String(source.StreamParam);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Float(source.Bandwidth);
        }
        if (source.Flux != null) {
            this.Flux = new Float(source.Flux);
        }
        if (source.ServerIp != null) {
            this.ServerIp = new String(source.ServerIp);
        }
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
        this.setParamSimple(map, prefix + "MetaVideoRate", this.MetaVideoRate);
        this.setParamSimple(map, prefix + "MetaAudioRate", this.MetaAudioRate);
        this.setParamSimple(map, prefix + "MateFps", this.MateFps);
        this.setParamSimple(map, prefix + "StreamParam", this.StreamParam);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "ServerIp", this.ServerIp);

    }
}

