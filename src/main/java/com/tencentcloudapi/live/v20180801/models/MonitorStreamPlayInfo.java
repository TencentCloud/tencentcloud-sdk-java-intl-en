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

public class MonitorStreamPlayInfo extends AbstractModel{

    /**
    * Playback domain name.
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * Stream ID.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Playback bitrate. 0 indicates the original bitrate.
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * Playback protocol. Valid values: Unknown, Flv, Hls, Rtmp, Huyap2p.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Bandwidth in Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * Number of online viewers. A data point is sampled per minute, and the number of TCP connections across the sample points is calculated.
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * Number of requests.
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
     * Get Playback domain name. 
     * @return PlayDomain Playback domain name.
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set Playback domain name.
     * @param PlayDomain Playback domain name.
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get Stream ID. 
     * @return StreamName Stream ID.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream ID.
     * @param StreamName Stream ID.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Playback bitrate. 0 indicates the original bitrate. 
     * @return Rate Playback bitrate. 0 indicates the original bitrate.
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set Playback bitrate. 0 indicates the original bitrate.
     * @param Rate Playback bitrate. 0 indicates the original bitrate.
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Playback protocol. Valid values: Unknown, Flv, Hls, Rtmp, Huyap2p. 
     * @return Protocol Playback protocol. Valid values: Unknown, Flv, Hls, Rtmp, Huyap2p.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Playback protocol. Valid values: Unknown, Flv, Hls, Rtmp, Huyap2p.
     * @param Protocol Playback protocol. Valid values: Unknown, Flv, Hls, Rtmp, Huyap2p.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Bandwidth in Mbps. 
     * @return Bandwidth Bandwidth in Mbps.
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth in Mbps.
     * @param Bandwidth Bandwidth in Mbps.
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Number of online viewers. A data point is sampled per minute, and the number of TCP connections across the sample points is calculated. 
     * @return Online Number of online viewers. A data point is sampled per minute, and the number of TCP connections across the sample points is calculated.
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set Number of online viewers. A data point is sampled per minute, and the number of TCP connections across the sample points is calculated.
     * @param Online Number of online viewers. A data point is sampled per minute, and the number of TCP connections across the sample points is calculated.
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get Number of requests. 
     * @return Request Number of requests.
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set Number of requests.
     * @param Request Number of requests.
     */
    public void setRequest(Long Request) {
        this.Request = Request;
    }

    public MonitorStreamPlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorStreamPlayInfo(MonitorStreamPlayInfo source) {
        if (source.PlayDomain != null) {
            this.PlayDomain = new String(source.PlayDomain);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.Rate != null) {
            this.Rate = new Long(source.Rate);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Float(source.Bandwidth);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
        if (source.Request != null) {
            this.Request = new Long(source.Request);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "Request", this.Request);

    }
}

