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

public class FlowRealtimeStatusSRT extends AbstractModel{

    /**
    * The latency (ms).
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
    * RTT (ms).
    */
    @SerializedName("RTT")
    @Expose
    private Long RTT;

    /**
    * The number of packets sent or received.
    */
    @SerializedName("Packets")
    @Expose
    private Long Packets;

    /**
    * The packet loss rate.
    */
    @SerializedName("PacketLossRate")
    @Expose
    private Float PacketLossRate;

    /**
    * The retransmission rate.
    */
    @SerializedName("RetransmitRate")
    @Expose
    private Float RetransmitRate;

    /**
    * The number of packets dropped.
    */
    @SerializedName("DroppedPackets")
    @Expose
    private Long DroppedPackets;

    /**
    * Whether to encrypt the stream. Valid values: On, Off.
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
     * Get The latency (ms). 
     * @return Latency The latency (ms).
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set The latency (ms).
     * @param Latency The latency (ms).
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    /**
     * Get RTT (ms). 
     * @return RTT RTT (ms).
     */
    public Long getRTT() {
        return this.RTT;
    }

    /**
     * Set RTT (ms).
     * @param RTT RTT (ms).
     */
    public void setRTT(Long RTT) {
        this.RTT = RTT;
    }

    /**
     * Get The number of packets sent or received. 
     * @return Packets The number of packets sent or received.
     */
    public Long getPackets() {
        return this.Packets;
    }

    /**
     * Set The number of packets sent or received.
     * @param Packets The number of packets sent or received.
     */
    public void setPackets(Long Packets) {
        this.Packets = Packets;
    }

    /**
     * Get The packet loss rate. 
     * @return PacketLossRate The packet loss rate.
     */
    public Float getPacketLossRate() {
        return this.PacketLossRate;
    }

    /**
     * Set The packet loss rate.
     * @param PacketLossRate The packet loss rate.
     */
    public void setPacketLossRate(Float PacketLossRate) {
        this.PacketLossRate = PacketLossRate;
    }

    /**
     * Get The retransmission rate. 
     * @return RetransmitRate The retransmission rate.
     */
    public Float getRetransmitRate() {
        return this.RetransmitRate;
    }

    /**
     * Set The retransmission rate.
     * @param RetransmitRate The retransmission rate.
     */
    public void setRetransmitRate(Float RetransmitRate) {
        this.RetransmitRate = RetransmitRate;
    }

    /**
     * Get The number of packets dropped. 
     * @return DroppedPackets The number of packets dropped.
     */
    public Long getDroppedPackets() {
        return this.DroppedPackets;
    }

    /**
     * Set The number of packets dropped.
     * @param DroppedPackets The number of packets dropped.
     */
    public void setDroppedPackets(Long DroppedPackets) {
        this.DroppedPackets = DroppedPackets;
    }

    /**
     * Get Whether to encrypt the stream. Valid values: On, Off. 
     * @return Encryption Whether to encrypt the stream. Valid values: On, Off.
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set Whether to encrypt the stream. Valid values: On, Off.
     * @param Encryption Whether to encrypt the stream. Valid values: On, Off.
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

