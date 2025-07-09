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
    * The timestamp (seconds).
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * The total bandwidth.
    */
    @SerializedName("Network")
    @Expose
    private Long Network;

    /**
    * The video data of the flow.
    */
    @SerializedName("Video")
    @Expose
    private FlowMediaVideo [] Video;

    /**
    * The audio data of the flow.
    */
    @SerializedName("Audio")
    @Expose
    private FlowMediaAudio [] Audio;

    /**
    * The ID of a push session.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The client IP.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
     * Get The timestamp (seconds). 
     * @return Timestamp The timestamp (seconds).
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set The timestamp (seconds).
     * @param Timestamp The timestamp (seconds).
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get The total bandwidth. 
     * @return Network The total bandwidth.
     */
    public Long getNetwork() {
        return this.Network;
    }

    /**
     * Set The total bandwidth.
     * @param Network The total bandwidth.
     */
    public void setNetwork(Long Network) {
        this.Network = Network;
    }

    /**
     * Get The video data of the flow. 
     * @return Video The video data of the flow.
     */
    public FlowMediaVideo [] getVideo() {
        return this.Video;
    }

    /**
     * Set The video data of the flow.
     * @param Video The video data of the flow.
     */
    public void setVideo(FlowMediaVideo [] Video) {
        this.Video = Video;
    }

    /**
     * Get The audio data of the flow. 
     * @return Audio The audio data of the flow.
     */
    public FlowMediaAudio [] getAudio() {
        return this.Audio;
    }

    /**
     * Set The audio data of the flow.
     * @param Audio The audio data of the flow.
     */
    public void setAudio(FlowMediaAudio [] Audio) {
        this.Audio = Audio;
    }

    /**
     * Get The ID of a push session. 
     * @return SessionId The ID of a push session.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID of a push session.
     * @param SessionId The ID of a push session.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The client IP. 
     * @return ClientIp The client IP.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set The client IP.
     * @param ClientIp The client IP.
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

