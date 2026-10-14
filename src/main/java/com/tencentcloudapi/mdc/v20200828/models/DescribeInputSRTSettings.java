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

public class DescribeInputSRTSettings extends AbstractModel {

    /**
    * SRT mode.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Stream Id.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Delay.
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Receive delay.
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * Peer delay.
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * Idle timeout period of the peer.
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * Decryption key.
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * Key length.
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
    * SRT peer address.
    */
    @SerializedName("SourceAddresses")
    @Expose
    private SRTSourceAddressResp [] SourceAddresses;

    /**
    * FEC settings
    */
    @SerializedName("FEC")
    @Expose
    private SRTFECSimpleOptions FEC;

    /**
     * Get SRT mode. 
     * @return Mode SRT mode.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set SRT mode.
     * @param Mode SRT mode.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Stream Id. 
     * @return StreamId Stream Id.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream Id.
     * @param StreamId Stream Id.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Delay. 
     * @return Latency Delay.
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Delay.
     * @param Latency Delay.
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Receive delay. 
     * @return RecvLatency Receive delay.
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receive delay.
     * @param RecvLatency Receive delay.
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get Peer delay. 
     * @return PeerLatency Peer delay.
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set Peer delay.
     * @param PeerLatency Peer delay.
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get Idle timeout period of the peer. 
     * @return PeerIdleTimeout Idle timeout period of the peer.
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set Idle timeout period of the peer.
     * @param PeerIdleTimeout Idle timeout period of the peer.
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get Decryption key. 
     * @return Passphrase Decryption key.
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set Decryption key.
     * @param Passphrase Decryption key.
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get Key length. 
     * @return PbKeyLen Key length.
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set Key length.
     * @param PbKeyLen Key length.
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    /**
     * Get SRT peer address. 
     * @return SourceAddresses SRT peer address.
     */
    public SRTSourceAddressResp [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set SRT peer address.
     * @param SourceAddresses SRT peer address.
     */
    public void setSourceAddresses(SRTSourceAddressResp [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    /**
     * Get FEC settings 
     * @return FEC FEC settings
     */
    public SRTFECSimpleOptions getFEC() {
        return this.FEC;
    }

    /**
     * Set FEC settings
     * @param FEC FEC settings
     */
    public void setFEC(SRTFECSimpleOptions FEC) {
        this.FEC = FEC;
    }

    public DescribeInputSRTSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInputSRTSettings(DescribeInputSRTSettings source) {
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
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new SRTSourceAddressResp[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new SRTSourceAddressResp(source.SourceAddresses[i]);
            }
        }
        if (source.FEC != null) {
            this.FEC = new SRTFECSimpleOptions(source.FEC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RecvLatency", this.RecvLatency);
        this.setParamSimple(map, prefix + "PeerLatency", this.PeerLatency);
        this.setParamSimple(map, prefix + "PeerIdleTimeout", this.PeerIdleTimeout);
        this.setParamSimple(map, prefix + "Passphrase", this.Passphrase);
        this.setParamSimple(map, prefix + "PbKeyLen", this.PbKeyLen);
        this.setParamArrayObj(map, prefix + "SourceAddresses.", this.SourceAddresses);
        this.setParamObj(map, prefix + "FEC.", this.FEC);

    }
}

