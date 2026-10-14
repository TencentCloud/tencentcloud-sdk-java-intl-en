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

public class FlowRealtimeStatusSRT extends AbstractModel {

    /**
    * Delay in ms.
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * RTT in ms.
    */
    @SerializedName("RTT")
    @Expose
    private Long RTT;

    /**
    * Number of packets sent or received in real time.
    */
    @SerializedName("Packets")
    @Expose
    private Long Packets;

    /**
    * Packet loss rate.
    */
    @SerializedName("PacketLossRate")
    @Expose
    private Float PacketLossRate;

    /**
    * Retransmission rate.
    */
    @SerializedName("RetransmitRate")
    @Expose
    private Float RetransmitRate;

    /**
    * Real-time packet loss count.
    */
    @SerializedName("DroppedPackets")
    @Expose
    private Long DroppedPackets;

    /**
    * Whether to encrypt. On | Off.
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
     * Get Delay in ms. 
     * @return Latency Delay in ms.
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set Delay in ms.
     * @param Latency Delay in ms.
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get RTT in ms. 
     * @return RTT RTT in ms.
     */
    public Long getRTT() {
        return this.RTT;
    }

    /**
     * Set RTT in ms.
     * @param RTT RTT in ms.
     */
    public void setRTT(Long RTT) {
        this.RTT = RTT;
    }

    /**
     * Get Number of packets sent or received in real time. 
     * @return Packets Number of packets sent or received in real time.
     */
    public Long getPackets() {
        return this.Packets;
    }

    /**
     * Set Number of packets sent or received in real time.
     * @param Packets Number of packets sent or received in real time.
     */
    public void setPackets(Long Packets) {
        this.Packets = Packets;
    }

    /**
     * Get Packet loss rate. 
     * @return PacketLossRate Packet loss rate.
     */
    public Float getPacketLossRate() {
        return this.PacketLossRate;
    }

    /**
     * Set Packet loss rate.
     * @param PacketLossRate Packet loss rate.
     */
    public void setPacketLossRate(Float PacketLossRate) {
        this.PacketLossRate = PacketLossRate;
    }

    /**
     * Get Retransmission rate. 
     * @return RetransmitRate Retransmission rate.
     */
    public Float getRetransmitRate() {
        return this.RetransmitRate;
    }

    /**
     * Set Retransmission rate.
     * @param RetransmitRate Retransmission rate.
     */
    public void setRetransmitRate(Float RetransmitRate) {
        this.RetransmitRate = RetransmitRate;
    }

    /**
     * Get Real-time packet loss count. 
     * @return DroppedPackets Real-time packet loss count.
     */
    public Long getDroppedPackets() {
        return this.DroppedPackets;
    }

    /**
     * Set Real-time packet loss count.
     * @param DroppedPackets Real-time packet loss count.
     */
    public void setDroppedPackets(Long DroppedPackets) {
        this.DroppedPackets = DroppedPackets;
    }

    /**
     * Get Whether to encrypt. On | Off. 
     * @return Encryption Whether to encrypt. On | Off.
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Whether to encrypt. On | Off.
     * @param Encryption Whether to encrypt. On | Off.
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    public FlowRealtimeStatusSRT() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRealtimeStatusSRT(FlowRealtimeStatusSRT source) {
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
        if (source.RTT != null) {
            this.RTT = new Long(source.RTT);
        }
        if (source.Packets != null) {
            this.Packets = new Long(source.Packets);
        }
        if (source.PacketLossRate != null) {
            this.PacketLossRate = new Float(source.PacketLossRate);
        }
        if (source.RetransmitRate != null) {
            this.RetransmitRate = new Float(source.RetransmitRate);
        }
        if (source.DroppedPackets != null) {
            this.DroppedPackets = new Long(source.DroppedPackets);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Latency", this.Latency);
        this.setParamSimple(map, prefix + "RTT", this.RTT);
        this.setParamSimple(map, prefix + "Packets", this.Packets);
        this.setParamSimple(map, prefix + "PacketLossRate", this.PacketLossRate);
        this.setParamSimple(map, prefix + "RetransmitRate", this.RetransmitRate);
        this.setParamSimple(map, prefix + "DroppedPackets", this.DroppedPackets);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);

    }
}

