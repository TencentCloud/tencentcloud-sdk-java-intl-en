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

public class CreateOutputSrtSettings extends AbstractModel {

    /**
    * Target address for push. Required when Mode is CALLER. Only 1 group can be filled in.
    */
    @SerializedName("Destinations")
    @Expose
    private CreateOutputSrtSettingsDestinations [] Destinations;

    /**
    * SRT mode. Valid values: `LISTENER` and `CALLER`. Default value: `CALLER`.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Stream Id for SRT retransmission. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Total delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000]. This parameter simultaneously sets the sender and recipient delays (recvlatency and peerlatency) to the same value. Recommended configuration: at least 3 times the RTT to ensure effective handling of packet retransmission and confirmation during network congestion.
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Receive latency for SRT relay. Default value: 120. Unit: ms. Range: [0, 3000].
This parameter indicates the time length for the recipient to cache data packets.
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * Peer delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000].
This parameter is set by the sender to inform the recipient of the expected buffer time for delay.
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * Idle timeout for SRT relay. Default value: 5000 ms. Range: [1000, 10000].
If there is no activity on a connection within the set timeout period, it will be closed.
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * Encryption key for SRT retweet. It is empty by default, indicating not encrypted. Only ascii characters are allowed, with a length of [10, 79].
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * Key length for SRT retransmission. Default value: 0. Options: [0|16|24|32].
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
    * SRT FEC settings
    */
    @SerializedName("FEC")
    @Expose
    private SRTFECFullOptions FEC;

    /**
     * Get Target address for push. Required when Mode is CALLER. Only 1 group can be filled in. 
     * @return Destinations Target address for push. Required when Mode is CALLER. Only 1 group can be filled in.
     */
    public CreateOutputSrtSettingsDestinations [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Target address for push. Required when Mode is CALLER. Only 1 group can be filled in.
     * @param Destinations Target address for push. Required when Mode is CALLER. Only 1 group can be filled in.
     */
    public void setDestinations(CreateOutputSrtSettingsDestinations [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get SRT mode. Valid values: `LISTENER` and `CALLER`. Default value: `CALLER`. 
     * @return Mode SRT mode. Valid values: `LISTENER` and `CALLER`. Default value: `CALLER`.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set SRT mode. Valid values: `LISTENER` and `CALLER`. Default value: `CALLER`.
     * @param Mode SRT mode. Valid values: `LISTENER` and `CALLER`. Default value: `CALLER`.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Stream Id for SRT retransmission. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512. 
     * @return StreamId Stream Id for SRT retransmission. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream Id for SRT retransmission. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512.
     * @param StreamId Stream Id for SRT retransmission. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Total delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000]. This parameter simultaneously sets the sender and recipient delays (recvlatency and peerlatency) to the same value. Recommended configuration: at least 3 times the RTT to ensure effective handling of packet retransmission and confirmation during network congestion. 
     * @return Latency Total delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000]. This parameter simultaneously sets the sender and recipient delays (recvlatency and peerlatency) to the same value. Recommended configuration: at least 3 times the RTT to ensure effective handling of packet retransmission and confirmation during network congestion.
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Total delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000]. This parameter simultaneously sets the sender and recipient delays (recvlatency and peerlatency) to the same value. Recommended configuration: at least 3 times the RTT to ensure effective handling of packet retransmission and confirmation during network congestion.
     * @param Latency Total delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000]. This parameter simultaneously sets the sender and recipient delays (recvlatency and peerlatency) to the same value. Recommended configuration: at least 3 times the RTT to ensure effective handling of packet retransmission and confirmation during network congestion.
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Receive latency for SRT relay. Default value: 120. Unit: ms. Range: [0, 3000].
This parameter indicates the time length for the recipient to cache data packets. 
     * @return RecvLatency Receive latency for SRT relay. Default value: 120. Unit: ms. Range: [0, 3000].
This parameter indicates the time length for the recipient to cache data packets.
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receive latency for SRT relay. Default value: 120. Unit: ms. Range: [0, 3000].
This parameter indicates the time length for the recipient to cache data packets.
     * @param RecvLatency Receive latency for SRT relay. Default value: 120. Unit: ms. Range: [0, 3000].
This parameter indicates the time length for the recipient to cache data packets.
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get Peer delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000].
This parameter is set by the sender to inform the recipient of the expected buffer time for delay. 
     * @return PeerLatency Peer delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000].
This parameter is set by the sender to inform the recipient of the expected buffer time for delay.
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set Peer delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000].
This parameter is set by the sender to inform the recipient of the expected buffer time for delay.
     * @param PeerLatency Peer delay for SRT retransmission. Default value: 0. Unit: ms. Range: [0, 3000].
This parameter is set by the sender to inform the recipient of the expected buffer time for delay.
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get Idle timeout for SRT relay. Default value: 5000 ms. Range: [1000, 10000].
If there is no activity on a connection within the set timeout period, it will be closed. 
     * @return PeerIdleTimeout Idle timeout for SRT relay. Default value: 5000 ms. Range: [1000, 10000].
If there is no activity on a connection within the set timeout period, it will be closed.
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set Idle timeout for SRT relay. Default value: 5000 ms. Range: [1000, 10000].
If there is no activity on a connection within the set timeout period, it will be closed.
     * @param PeerIdleTimeout Idle timeout for SRT relay. Default value: 5000 ms. Range: [1000, 10000].
If there is no activity on a connection within the set timeout period, it will be closed.
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get Encryption key for SRT retweet. It is empty by default, indicating not encrypted. Only ascii characters are allowed, with a length of [10, 79]. 
     * @return Passphrase Encryption key for SRT retweet. It is empty by default, indicating not encrypted. Only ascii characters are allowed, with a length of [10, 79].
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set Encryption key for SRT retweet. It is empty by default, indicating not encrypted. Only ascii characters are allowed, with a length of [10, 79].
     * @param Passphrase Encryption key for SRT retweet. It is empty by default, indicating not encrypted. Only ascii characters are allowed, with a length of [10, 79].
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get Key length for SRT retransmission. Default value: 0. Options: [0|16|24|32]. 
     * @return PbKeyLen Key length for SRT retransmission. Default value: 0. Options: [0|16|24|32].
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set Key length for SRT retransmission. Default value: 0. Options: [0|16|24|32].
     * @param PbKeyLen Key length for SRT retransmission. Default value: 0. Options: [0|16|24|32].
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    /**
     * Get SRT FEC settings 
     * @return FEC SRT FEC settings
     */
    public SRTFECFullOptions getFEC() {
        return this.FEC;
    }

    /**
     * Set SRT FEC settings
     * @param FEC SRT FEC settings
     */
    public void setFEC(SRTFECFullOptions FEC) {
        this.FEC = FEC;
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
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
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
        if (source.FEC != null) {
            this.FEC = new SRTFECFullOptions(source.FEC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RecvLatency", this.RecvLatency);
        this.setParamSimple(map, prefix + "PeerLatency", this.PeerLatency);
        this.setParamSimple(map, prefix + "PeerIdleTimeout", this.PeerIdleTimeout);
        this.setParamSimple(map, prefix + "Passphrase", this.Passphrase);
        this.setParamSimple(map, prefix + "PbKeyLen", this.PbKeyLen);
        this.setParamObj(map, prefix + "FEC.", this.FEC);

    }
}

