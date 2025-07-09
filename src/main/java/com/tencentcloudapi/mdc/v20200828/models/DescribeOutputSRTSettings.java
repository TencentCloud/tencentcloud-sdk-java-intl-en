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

public class DescribeOutputSRTSettings extends AbstractModel {

    /**
    * A list of the destination addresses for relay. This parameter is valid if `Mode` is `CALLER`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Destinations")
    @Expose
    private SRTAddressDestination [] Destinations;

    /**
    * Stream ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Latency.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Receive latency.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * Peer latency.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * Peer idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * Encryption key.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * Encryption key length.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
    * The SRT mode.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The server’s listen address, which is valid if `Mode` is `LISTENER`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceAddresses")
    @Expose
    private OutputSRTSourceAddressResp [] SourceAddresses;

    /**
     * Get A list of the destination addresses for relay. This parameter is valid if `Mode` is `CALLER`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Destinations A list of the destination addresses for relay. This parameter is valid if `Mode` is `CALLER`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SRTAddressDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set A list of the destination addresses for relay. This parameter is valid if `Mode` is `CALLER`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Destinations A list of the destination addresses for relay. This parameter is valid if `Mode` is `CALLER`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDestinations(SRTAddressDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get Stream ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StreamId Stream ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StreamId Stream ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Latency.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Latency Latency.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Latency.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Latency Latency.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Receive latency.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RecvLatency Receive latency.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receive latency.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RecvLatency Receive latency.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get Peer latency.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PeerLatency Peer latency.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set Peer latency.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PeerLatency Peer latency.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get Peer idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PeerIdleTimeout Peer idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set Peer idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PeerIdleTimeout Peer idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get Encryption key.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Passphrase Encryption key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set Encryption key.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Passphrase Encryption key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get Encryption key length.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PbKeyLen Encryption key length.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set Encryption key length.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PbKeyLen Encryption key length.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

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
     * Get The server’s listen address, which is valid if `Mode` is `LISTENER`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SourceAddresses The server’s listen address, which is valid if `Mode` is `LISTENER`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public OutputSRTSourceAddressResp [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set The server’s listen address, which is valid if `Mode` is `LISTENER`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SourceAddresses The server’s listen address, which is valid if `Mode` is `LISTENER`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSourceAddresses(OutputSRTSourceAddressResp [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    public DescribeOutputSRTSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputSRTSettings(DescribeOutputSRTSettings source) {
        if (source.Destinations != null) {
            this.Destinations = new SRTAddressDestination[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new SRTAddressDestination(source.Destinations[i]);
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
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new OutputSRTSourceAddressResp[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new OutputSRTSourceAddressResp(source.SourceAddresses[i]);
            }
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
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "SourceAddresses.", this.SourceAddresses);

    }
}

