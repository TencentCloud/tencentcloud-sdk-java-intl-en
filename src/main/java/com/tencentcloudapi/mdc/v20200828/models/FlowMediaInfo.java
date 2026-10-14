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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowMediaInfo extends AbstractModel {

    /**
    * Timestamp in seconds.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Total bandwidth.
    */
    @SerializedName("Network")
    @Expose
    private Long Network;

    /**
    * Video data of the transport stream.
    */
    @SerializedName("Video")
    @Expose
    private FlowMediaVideo [] Video;

    /**
    * Audio data of the transport stream.
    */
    @SerializedName("Audio")
    @Expose
    private FlowMediaAudio [] Audio;

    /**
    * Flag of the same push.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Client IP.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
     * Get Timestamp in seconds. 
     * @return Timestamp Timestamp in seconds.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Timestamp in seconds.
     * @param Timestamp Timestamp in seconds.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Total bandwidth. 
     * @return Network Total bandwidth.
     */
    public Long getNetwork() {
        return this.Network;
    }

    /**
     * Set Total bandwidth.
     * @param Network Total bandwidth.
     */
    public void setNetwork(Long Network) {
        this.Network = Network;
    }

    /**
     * Get Video data of the transport stream. 
     * @return Video Video data of the transport stream.
     */
    public FlowMediaVideo [] getVideo() {
        return this.Video;
    }

    /**
     * Set Video data of the transport stream.
     * @param Video Video data of the transport stream.
     */
    public void setVideo(FlowMediaVideo [] Video) {
        this.Video = Video;
    }

    /**
     * Get Audio data of the transport stream. 
     * @return Audio Audio data of the transport stream.
     */
    public FlowMediaAudio [] getAudio() {
        return this.Audio;
    }

    /**
     * Set Audio data of the transport stream.
     * @param Audio Audio data of the transport stream.
     */
    public void setAudio(FlowMediaAudio [] Audio) {
        this.Audio = Audio;
    }

    /**
     * Get Flag of the same push. 
     * @return SessionId Flag of the same push.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Flag of the same push.
     * @param SessionId Flag of the same push.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

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

    public FlowMediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowMediaInfo(FlowMediaInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Network != null) {
            this.Network = new Long(source.Network);
        }
        if (source.Video != null) {
            this.Video = new FlowMediaVideo[source.Video.length];
            for (int i = 0; i < source.Video.length; i++) {
                this.Video[i] = new FlowMediaVideo(source.Video[i]);
            }
        }
        if (source.Audio != null) {
            this.Audio = new FlowMediaAudio[source.Audio.length];
            for (int i = 0; i < source.Audio.length; i++) {
                this.Audio[i] = new FlowMediaAudio(source.Audio[i]);
            }
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamArrayObj(map, prefix + "Video.", this.Video);
        this.setParamArrayObj(map, prefix + "Audio.", this.Audio);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);

    }
}

