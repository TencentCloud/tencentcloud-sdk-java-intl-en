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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutputSrtSettings extends AbstractModel{

    /**
    * Push destination address. Please configure one or two addresses.
    */
    @SerializedName("Destinations")
    @Expose
    private CreateOutputSrtSettingsDestinations [] Destinations;

    /**
    * Stream ID of SRT push.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Total latency of SRT push.
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Receive latency of SRT push.
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * Peer latency of SRT push.
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * Peer idle timeout period of SRT push.
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * Encryption key of SRT push.
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * Key length of SRT push.
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
     * Get Push destination address. Please configure one or two addresses. 
     * @return Destinations Push destination address. Please configure one or two addresses.
     */
    public CreateOutputSrtSettingsDestinations [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Push destination address. Please configure one or two addresses.
     * @param Destinations Push destination address. Please configure one or two addresses.
     */
    public void setDestinations(CreateOutputSrtSettingsDestinations [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get Stream ID of SRT push. 
     * @return StreamId Stream ID of SRT push.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream ID of SRT push.
     * @param StreamId Stream ID of SRT push.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Total latency of SRT push. 
     * @return Latency Total latency of SRT push.
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Total latency of SRT push.
     * @param Latency Total latency of SRT push.
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Receive latency of SRT push. 
     * @return RecvLatency Receive latency of SRT push.
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receive latency of SRT push.
     * @param RecvLatency Receive latency of SRT push.
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get Peer latency of SRT push. 
     * @return PeerLatency Peer latency of SRT push.
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set Peer latency of SRT push.
     * @param PeerLatency Peer latency of SRT push.
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get Peer idle timeout period of SRT push. 
     * @return PeerIdleTimeout Peer idle timeout period of SRT push.
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set Peer idle timeout period of SRT push.
     * @param PeerIdleTimeout Peer idle timeout period of SRT push.
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get Encryption key of SRT push. 
     * @return Passphrase Encryption key of SRT push.
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set Encryption key of SRT push.
     * @param Passphrase Encryption key of SRT push.
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get Key length of SRT push. 
     * @return PbKeyLen Key length of SRT push.
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set Key length of SRT push.
     * @param PbKeyLen Key length of SRT push.
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    public CreateOutputSrtSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOutputSrtSettings(CreateOutputSrtSettings source) {
        if (source.Destinations != null) {
            this.Destinations = new CreateOutputSrtSettingsDestinations[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new CreateOutputSrtSettingsDestinations(source.Destinations[i]);
            }
        }
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
        if (source.RecvLatency != null) {
            this.RecvLatency = new Long(source.RecvLatency);
        }
        if (source.PeerLatency != null) {
            this.PeerLatency = new Long(source.PeerLatency);
        }
        if (source.PeerIdleTimeout != null) {
            this.PeerIdleTimeout = new Long(source.PeerIdleTimeout);
        }
        if (source.Passphrase != null) {
            this.Passphrase = new String(source.Passphrase);
        }
        if (source.PbKeyLen != null) {
            this.PbKeyLen = new Long(source.PbKeyLen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RecvLatency", this.RecvLatency);
        this.setParamSimple(map, prefix + "PeerLatency", this.PeerLatency);
        this.setParamSimple(map, prefix + "PeerIdleTimeout", this.PeerIdleTimeout);
        this.setParamSimple(map, prefix + "Passphrase", this.Passphrase);
        this.setParamSimple(map, prefix + "PbKeyLen", this.PbKeyLen);

    }
}

