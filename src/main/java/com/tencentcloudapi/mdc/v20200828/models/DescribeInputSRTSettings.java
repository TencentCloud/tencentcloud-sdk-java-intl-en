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
    * The SRT mode.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Stream ID.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Latency.
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Receive latency.
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * Peer latency.
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * Peer idle timeout period.
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
    * The SRT peer address.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceAddresses")
    @Expose
    private SRTSourceAddressResp [] SourceAddresses;

    /**
     * Get The SRT mode.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Mode The SRT mode.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The SRT mode.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Mode The SRT mode.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Stream ID. 
     * @return StreamId Stream ID.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream ID.
     * @param StreamId Stream ID.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Latency. 
     * @return Latency Latency.
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Latency.
     * @param Latency Latency.
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Receive latency. 
     * @return RecvLatency Receive latency.
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receive latency.
     * @param RecvLatency Receive latency.
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get Peer latency. 
     * @return PeerLatency Peer latency.
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set Peer latency.
     * @param PeerLatency Peer latency.
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get Peer idle timeout period. 
     * @return PeerIdleTimeout Peer idle timeout period.
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set Peer idle timeout period.
     * @param PeerIdleTimeout Peer idle timeout period.
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
     * Get The SRT peer address.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SourceAddresses The SRT peer address.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SRTSourceAddressResp [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set The SRT peer address.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SourceAddresses The SRT peer address.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSourceAddresses(SRTSourceAddressResp [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
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

    }
}

