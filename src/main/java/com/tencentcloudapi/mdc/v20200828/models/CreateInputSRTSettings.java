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

public class CreateInputSRTSettings extends AbstractModel {

    /**
    * SRT mode. Options: [LISTENER|CALLER]. Default value: LISTENER.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Stream Id. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512. For the specific format, see: https://github.com/Haivision/srt/blob/master/docs/features/access-control.md#standard-keys.	
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Delay. Default value: 0. Unit: ms. Range: [0, 3000].
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Receive latency. Default value: 120. Unit: ms. Range: [0, 3000].
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * Peer delay. Default value: 0. Unit: ms. Range: [0, 3000].
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * Peer timeout. Default value: 5000 ms. Range: [1000, 10000].
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * Decryption key. Empty by default, which means not encrypted. Only ascii characters are supported. Length range: [10, 79].
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * Key length. Default value: 0. Options: [0|16|24|32].
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
    * SRT peer address. Required when Mode is CALLER, and can only contain 1 group.
    */
    @SerializedName("SourceAddresses")
    @Expose
    private SRTSourceAddressReq [] SourceAddresses;

    /**
    * SRT FEC settings
    */
    @SerializedName("FEC")
    @Expose
    private SRTFECSimpleOptions FEC;

    /**
     * Get SRT mode. Options: [LISTENER|CALLER]. Default value: LISTENER. 
     * @return Mode SRT mode. Options: [LISTENER|CALLER]. Default value: LISTENER.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set SRT mode. Options: [LISTENER|CALLER]. Default value: LISTENER.
     * @param Mode SRT mode. Options: [LISTENER|CALLER]. Default value: LISTENER.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Stream Id. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512. For the specific format, see: https://github.com/Haivision/srt/blob/master/docs/features/access-control.md#standard-keys.	 
     * @return StreamId Stream Id. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512. For the specific format, see: https://github.com/Haivision/srt/blob/master/docs/features/access-control.md#standard-keys.	
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream Id. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512. For the specific format, see: https://github.com/Haivision/srt/blob/master/docs/features/access-control.md#standard-keys.	
     * @param StreamId Stream Id. It can contain upper- and lower-case letters, digits, and special characters (.#!:&,=_-), with a length of 0 to 512. For the specific format, see: https://github.com/Haivision/srt/blob/master/docs/features/access-control.md#standard-keys.	
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Delay. Default value: 0. Unit: ms. Range: [0, 3000]. 
     * @return Latency Delay. Default value: 0. Unit: ms. Range: [0, 3000].
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Delay. Default value: 0. Unit: ms. Range: [0, 3000].
     * @param Latency Delay. Default value: 0. Unit: ms. Range: [0, 3000].
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Receive latency. Default value: 120. Unit: ms. Range: [0, 3000]. 
     * @return RecvLatency Receive latency. Default value: 120. Unit: ms. Range: [0, 3000].
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receive latency. Default value: 120. Unit: ms. Range: [0, 3000].
     * @param RecvLatency Receive latency. Default value: 120. Unit: ms. Range: [0, 3000].
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get Peer delay. Default value: 0. Unit: ms. Range: [0, 3000]. 
     * @return PeerLatency Peer delay. Default value: 0. Unit: ms. Range: [0, 3000].
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set Peer delay. Default value: 0. Unit: ms. Range: [0, 3000].
     * @param PeerLatency Peer delay. Default value: 0. Unit: ms. Range: [0, 3000].
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get Peer timeout. Default value: 5000 ms. Range: [1000, 10000]. 
     * @return PeerIdleTimeout Peer timeout. Default value: 5000 ms. Range: [1000, 10000].
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set Peer timeout. Default value: 5000 ms. Range: [1000, 10000].
     * @param PeerIdleTimeout Peer timeout. Default value: 5000 ms. Range: [1000, 10000].
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get Decryption key. Empty by default, which means not encrypted. Only ascii characters are supported. Length range: [10, 79]. 
     * @return Passphrase Decryption key. Empty by default, which means not encrypted. Only ascii characters are supported. Length range: [10, 79].
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set Decryption key. Empty by default, which means not encrypted. Only ascii characters are supported. Length range: [10, 79].
     * @param Passphrase Decryption key. Empty by default, which means not encrypted. Only ascii characters are supported. Length range: [10, 79].
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get Key length. Default value: 0. Options: [0|16|24|32]. 
     * @return PbKeyLen Key length. Default value: 0. Options: [0|16|24|32].
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set Key length. Default value: 0. Options: [0|16|24|32].
     * @param PbKeyLen Key length. Default value: 0. Options: [0|16|24|32].
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    /**
     * Get SRT peer address. Required when Mode is CALLER, and can only contain 1 group. 
     * @return SourceAddresses SRT peer address. Required when Mode is CALLER, and can only contain 1 group.
     */
    public SRTSourceAddressReq [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set SRT peer address. Required when Mode is CALLER, and can only contain 1 group.
     * @param SourceAddresses SRT peer address. Required when Mode is CALLER, and can only contain 1 group.
     */
    public void setSourceAddresses(SRTSourceAddressReq [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    /**
     * Get SRT FEC settings 
     * @return FEC SRT FEC settings
     */
    public SRTFECSimpleOptions getFEC() {
        return this.FEC;
    }

    /**
     * Set SRT FEC settings
     * @param FEC SRT FEC settings
     */
    public void setFEC(SRTFECSimpleOptions FEC) {
        this.FEC = FEC;
    }

    public CreateInputSRTSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInputSRTSettings(CreateInputSRTSettings source) {
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
            this.SourceAddresses = new SRTSourceAddressReq[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new SRTSourceAddressReq(source.SourceAddresses[i]);
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

