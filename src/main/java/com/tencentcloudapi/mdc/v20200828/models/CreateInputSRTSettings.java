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

public class CreateInputSRTSettings extends AbstractModel{

    /**
    * Stream ID, which can contain 0–512 letters, digits, and special symbols (.#!:&,=_-).
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Latency in ms. Default value: 0. Value range: [0, 3000].
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * Receipt latency in ms. Default value: 120. Value range: [0, 3000].
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * Peer latency in ms. Default value: 0. Value range: [0, 3000].
    */
    @SerializedName("PeerLatency")
    @Expose
    private Long PeerLatency;

    /**
    * Peer timeout period in ms. Default value: 5000. Value range: [1000, 10000].
    */
    @SerializedName("PeerIdleTimeout")
    @Expose
    private Long PeerIdleTimeout;

    /**
    * Decryption key, which is empty by default, indicating not to encrypt. Only ASCII codes can be filled. Length: [10, 79].
    */
    @SerializedName("Passphrase")
    @Expose
    private String Passphrase;

    /**
    * Key length. Default value: 0. Valid values: [0|16|24|32].
    */
    @SerializedName("PbKeyLen")
    @Expose
    private Long PbKeyLen;

    /**
     * Get Stream ID, which can contain 0–512 letters, digits, and special symbols (.#!:&,=_-). 
     * @return StreamId Stream ID, which can contain 0–512 letters, digits, and special symbols (.#!:&,=_-).
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Stream ID, which can contain 0–512 letters, digits, and special symbols (.#!:&,=_-).
     * @param StreamId Stream ID, which can contain 0–512 letters, digits, and special symbols (.#!:&,=_-).
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Latency in ms. Default value: 0. Value range: [0, 3000]. 
     * @return Latency Latency in ms. Default value: 0. Value range: [0, 3000].
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Latency in ms. Default value: 0. Value range: [0, 3000].
     * @param Latency Latency in ms. Default value: 0. Value range: [0, 3000].
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get Receipt latency in ms. Default value: 120. Value range: [0, 3000]. 
     * @return RecvLatency Receipt latency in ms. Default value: 120. Value range: [0, 3000].
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receipt latency in ms. Default value: 120. Value range: [0, 3000].
     * @param RecvLatency Receipt latency in ms. Default value: 120. Value range: [0, 3000].
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get Peer latency in ms. Default value: 0. Value range: [0, 3000]. 
     * @return PeerLatency Peer latency in ms. Default value: 0. Value range: [0, 3000].
     */
    public Long getPeerLatency() {
        return this.PeerLatency;
    }

    /**
     * Set Peer latency in ms. Default value: 0. Value range: [0, 3000].
     * @param PeerLatency Peer latency in ms. Default value: 0. Value range: [0, 3000].
     */
    public void setPeerLatency(Long PeerLatency) {
        this.PeerLatency = PeerLatency;
    }

    /**
     * Get Peer timeout period in ms. Default value: 5000. Value range: [1000, 10000]. 
     * @return PeerIdleTimeout Peer timeout period in ms. Default value: 5000. Value range: [1000, 10000].
     */
    public Long getPeerIdleTimeout() {
        return this.PeerIdleTimeout;
    }

    /**
     * Set Peer timeout period in ms. Default value: 5000. Value range: [1000, 10000].
     * @param PeerIdleTimeout Peer timeout period in ms. Default value: 5000. Value range: [1000, 10000].
     */
    public void setPeerIdleTimeout(Long PeerIdleTimeout) {
        this.PeerIdleTimeout = PeerIdleTimeout;
    }

    /**
     * Get Decryption key, which is empty by default, indicating not to encrypt. Only ASCII codes can be filled. Length: [10, 79]. 
     * @return Passphrase Decryption key, which is empty by default, indicating not to encrypt. Only ASCII codes can be filled. Length: [10, 79].
     */
    public String getPassphrase() {
        return this.Passphrase;
    }

    /**
     * Set Decryption key, which is empty by default, indicating not to encrypt. Only ASCII codes can be filled. Length: [10, 79].
     * @param Passphrase Decryption key, which is empty by default, indicating not to encrypt. Only ASCII codes can be filled. Length: [10, 79].
     */
    public void setPassphrase(String Passphrase) {
        this.Passphrase = Passphrase;
    }

    /**
     * Get Key length. Default value: 0. Valid values: [0|16|24|32]. 
     * @return PbKeyLen Key length. Default value: 0. Valid values: [0|16|24|32].
     */
    public Long getPbKeyLen() {
        return this.PbKeyLen;
    }

    /**
     * Set Key length. Default value: 0. Valid values: [0|16|24|32].
     * @param PbKeyLen Key length. Default value: 0. Valid values: [0|16|24|32].
     */
    public void setPbKeyLen(Long PbKeyLen) {
        this.PbKeyLen = PbKeyLen;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RecvLatency", this.RecvLatency);
        this.setParamSimple(map, prefix + "PeerLatency", this.PeerLatency);
        this.setParamSimple(map, prefix + "PeerIdleTimeout", this.PeerIdleTimeout);
        this.setParamSimple(map, prefix + "Passphrase", this.Passphrase);
        this.setParamSimple(map, prefix + "PbKeyLen", this.PbKeyLen);

    }
}

