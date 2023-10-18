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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorStreamPlayInfo extends AbstractModel {

    /**
    * The playback domain.
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * The stream ID.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The playback bitrate. `0` indicates the original bitrate.
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * The playback protocol. Valid values: `Unknown`, `Flv`, `Hls`, `Rtmp`, `Huyap2p`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The bandwidth (Mbps).
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * The number of online users, which is represented by the number of TCP connections (data collected every minute).
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * The number of requests.
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
     * Get The playback domain. 
     * @return PlayDomain The playback domain.
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set The playback domain.
     * @param PlayDomain The playback domain.
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get The stream ID. 
     * @return StreamName The stream ID.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The stream ID.
     * @param StreamName The stream ID.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The playback bitrate. `0` indicates the original bitrate. 
     * @return Rate The playback bitrate. `0` indicates the original bitrate.
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set The playback bitrate. `0` indicates the original bitrate.
     * @param Rate The playback bitrate. `0` indicates the original bitrate.
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get The playback protocol. Valid values: `Unknown`, `Flv`, `Hls`, `Rtmp`, `Huyap2p`. 
     * @return Protocol The playback protocol. Valid values: `Unknown`, `Flv`, `Hls`, `Rtmp`, `Huyap2p`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The playback protocol. Valid values: `Unknown`, `Flv`, `Hls`, `Rtmp`, `Huyap2p`.
     * @param Protocol The playback protocol. Valid values: `Unknown`, `Flv`, `Hls`, `Rtmp`, `Huyap2p`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
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
     * Get The number of online users, which is represented by the number of TCP connections (data collected every minute). 
     * @return Online The number of online users, which is represented by the number of TCP connections (data collected every minute).
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set The number of online users, which is represented by the number of TCP connections (data collected every minute).
     * @param Online The number of online users, which is represented by the number of TCP connections (data collected every minute).
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get The number of requests. 
     * @return Request The number of requests.
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set The number of requests.
     * @param Request The number of requests.
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

