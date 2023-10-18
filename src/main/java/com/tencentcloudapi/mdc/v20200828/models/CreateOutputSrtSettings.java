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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOutputSrtSettings extends AbstractModel {

    /**
    * The relay destination address, which is required if `Mode` is `CALLER`. Only one address is allowed.
    */
    @SerializedName("Destinations")
    @Expose
    private CreateOutputSrtSettingsDestinations [] Destinations;

    /**
    * The stream ID for relay, which can contain 0 to 512 letters, digits, and special characters (.#!:&,=_-).
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * The total latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0.
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * The receive latency (ms) of SRT relay. Value range: [0, 3000]. Default: 120.
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * The peer-to-peer latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0.
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * The timeout period (ms) for the SRT relay peer. Value range: [1000, 10000]. Default: 5000.
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * The encryption key for SRT relay, which is empty by default, indicating not to encrypt. Only ASCII codes are allowed. Length: [10, 79].
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * The key length for SRT relay. Valid values: 0 (default), 16, 24, 32.
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
    * The SRT mode. Valid values: LISTENER, CALLER (default).
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get The relay destination address, which is required if `Mode` is `CALLER`. Only one address is allowed. 
     * @return Destinations The relay destination address, which is required if `Mode` is `CALLER`. Only one address is allowed.
     */
    public CreateOutputSrtSettingsDestinations [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set The relay destination address, which is required if `Mode` is `CALLER`. Only one address is allowed.
     * @param Destinations The relay destination address, which is required if `Mode` is `CALLER`. Only one address is allowed.
     */
    public void setDestinations(CreateOutputSrtSettingsDestinations [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get The stream ID for relay, which can contain 0 to 512 letters, digits, and special characters (.#!:&,=_-). 
     * @return StreamId The stream ID for relay, which can contain 0 to 512 letters, digits, and special characters (.#!:&,=_-).
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set The stream ID for relay, which can contain 0 to 512 letters, digits, and special characters (.#!:&,=_-).
     * @param StreamId The stream ID for relay, which can contain 0 to 512 letters, digits, and special characters (.#!:&,=_-).
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get The total latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0. 
     * @return Latency The total latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0.
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set The total latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0.
     * @param Latency The total latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0.
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get The receive latency (ms) of SRT relay. Value range: [0, 3000]. Default: 120. 
     * @return RecvLatency The receive latency (ms) of SRT relay. Value range: [0, 3000]. Default: 120.
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set The receive latency (ms) of SRT relay. Value range: [0, 3000]. Default: 120.
     * @param RecvLatency The receive latency (ms) of SRT relay. Value range: [0, 3000]. Default: 120.
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get The peer-to-peer latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0. 
     * @return PeerLatency The peer-to-peer latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0.
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set The peer-to-peer latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0.
     * @param PeerLatency The peer-to-peer latency (ms) of SRT relay. Value range: [0, 3000]. Default: 0.
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get The timeout period (ms) for the SRT relay peer. Value range: [1000, 10000]. Default: 5000. 
     * @return PeerIdleTimeout The timeout period (ms) for the SRT relay peer. Value range: [1000, 10000]. Default: 5000.
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set The timeout period (ms) for the SRT relay peer. Value range: [1000, 10000]. Default: 5000.
     * @param PeerIdleTimeout The timeout period (ms) for the SRT relay peer. Value range: [1000, 10000]. Default: 5000.
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get The encryption key for SRT relay, which is empty by default, indicating not to encrypt. Only ASCII codes are allowed. Length: [10, 79]. 
     * @return Passphrase The encryption key for SRT relay, which is empty by default, indicating not to encrypt. Only ASCII codes are allowed. Length: [10, 79].
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set The encryption key for SRT relay, which is empty by default, indicating not to encrypt. Only ASCII codes are allowed. Length: [10, 79].
     * @param Passphrase The encryption key for SRT relay, which is empty by default, indicating not to encrypt. Only ASCII codes are allowed. Length: [10, 79].
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get The key length for SRT relay. Valid values: 0 (default), 16, 24, 32. 
     * @return PbKeyLen The key length for SRT relay. Valid values: 0 (default), 16, 24, 32.
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set The key length for SRT relay. Valid values: 0 (default), 16, 24, 32.
     * @param PbKeyLen The key length for SRT relay. Valid values: 0 (default), 16, 24, 32.
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    /**
     * Get The SRT mode. Valid values: LISTENER, CALLER (default). 
     * @return Mode The SRT mode. Valid values: LISTENER, CALLER (default).
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The SRT mode. Valid values: LISTENER, CALLER (default).
     * @param Mode The SRT mode. Valid values: LISTENER, CALLER (default).
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
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
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
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

    }
}

