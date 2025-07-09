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

public class FlowStatistics extends AbstractModel {

    /**
    * The session ID.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The peer IP.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * The total bandwidth.
    */
    @SerializedName("Network")
    @Expose
    private Long Network;

    /**
    * The video data.
    */
    @SerializedName("Video")
    @Expose
    private FlowVideo [] Video;

    /**
    * The audio data.
    */
    @SerializedName("Audio")
    @Expose
    private FlowAudio [] Audio;

    /**
     * Get The session ID. 
     * @return SessionId The session ID.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The session ID.
     * @param SessionId The session ID.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The peer IP. 
     * @return ClientIp The peer IP.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set The peer IP.
     * @param ClientIp The peer IP.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
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
     * Get The video data. 
     * @return Video The video data.
     */
    public FlowVideo [] getVideo() {
        return this.Video;
    }

    /**
     * Set The video data.
     * @param Video The video data.
     */
    public void setVideo(FlowVideo [] Video) {
        this.Video = Video;
    }

    /**
     * Get The audio data. 
     * @return Audio The audio data.
     */
    public FlowAudio [] getAudio() {
        return this.Audio;
    }

    /**
     * Set The audio data.
     * @param Audio The audio data.
     */
    public void setAudio(FlowAudio [] Audio) {
        this.Audio = Audio;
    }

    public FlowStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowStatistics(FlowStatistics source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Network != null) {
            this.Network = new Long(source.Network);
        }
        if (source.Video != null) {
            this.Video = new FlowVideo[source.Video.length];
            for (int i = 0; i < source.Video.length; i++) {
                this.Video[i] = new FlowVideo(source.Video[i]);
            }
        }
        if (source.Audio != null) {
            this.Audio = new FlowAudio[source.Audio.length];
            for (int i = 0; i < source.Audio.length; i++) {
                this.Audio[i] = new FlowAudio(source.Audio[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamArrayObj(map, prefix + "Video.", this.Video);
        this.setParamArrayObj(map, prefix + "Audio.", this.Audio);

    }
}

