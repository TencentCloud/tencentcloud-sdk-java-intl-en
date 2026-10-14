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

public class FlowSRTInfo extends AbstractModel {

    /**
    * <p>Timestamp in seconds.</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>Packet loss rate on transmitting.</p>
    */
    @SerializedName("SendPacketLossRate")
    @Expose
    private Long SendPacketLossRate;

    /**
    * <p>Retransmission rate.</p>
    */
    @SerializedName("SendRetransmissionRate")
    @Expose
    private Long SendRetransmissionRate;

    /**
    * <p>Packet loss rate on receiving.</p>
    */
    @SerializedName("RecvPacketLossRate")
    @Expose
    private Long RecvPacketLossRate;

    /**
    * <p>Receiving retransmission rate.</p>
    */
    @SerializedName("RecvRetransmissionRate")
    @Expose
    private Long RecvRetransmissionRate;

    /**
    * <p>RTT latency to the peer.</p>
    */
    @SerializedName("RTT")
    @Expose
    private Long RTT;

    /**
    * <p>Flag the same streaming session.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Number of discarded packets on sending.</p>
    */
    @SerializedName("SendPacketDropNumber")
    @Expose
    private Long SendPacketDropNumber;

    /**
    * <p>Number of received dropped packets.</p>
    */
    @SerializedName("RecvPacketDropNumber")
    @Expose
    private Long RecvPacketDropNumber;

    /**
    * <p>Bandwidth.</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * <p>Transmit bandwidth</p>
    */
    @SerializedName("SendBandwidth")
    @Expose
    private Float SendBandwidth;

    /**
    * <p>Receiving bandwidth</p>
    */
    @SerializedName("RecvBandwidth")
    @Expose
    private Float RecvBandwidth;

    /**
    * <p>Sent packet count</p>
    */
    @SerializedName("SendPackets")
    @Expose
    private Long SendPackets;

    /**
    * <p>Number of received packets</p>
    */
    @SerializedName("RecvPackets")
    @Expose
    private Long RecvPackets;

    /**
    * <p>Sending lost packets</p>
    */
    @SerializedName("SendLostPackets")
    @Expose
    private Long SendLostPackets;

    /**
    * <p>Accept lost packets</p>
    */
    @SerializedName("RecvLostPackets")
    @Expose
    private Long RecvLostPackets;

    /**
    * <p>Sent retransmission packet count</p>
    */
    @SerializedName("SendRetransmitPackets")
    @Expose
    private Long SendRetransmitPackets;

    /**
    * <p>Number of received retransmission packets</p>
    */
    @SerializedName("RecvRetransmitPackets")
    @Expose
    private Long RecvRetransmitPackets;

    /**
    * <p>Flight window size</p>
    */
    @SerializedName("FlightSize")
    @Expose
    private Long FlightSize;

    /**
    * <p>Congestion window.</p>
    */
    @SerializedName("CongestionWindow")
    @Expose
    private Long CongestionWindow;

    /**
    * <p>Sending buffer (ms)</p>
    */
    @SerializedName("SendBuffer")
    @Expose
    private Long SendBuffer;

    /**
    * <p>Receive buffer (ms)</p>
    */
    @SerializedName("RecvBuffer")
    @Expose
    private Long RecvBuffer;

    /**
    * <p>Sending delay</p>
    */
    @SerializedName("SendLatency")
    @Expose
    private Long SendLatency;

    /**
    * <p>Receive latency</p>
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
    * <p>Sent NAK packet count</p>
    */
    @SerializedName("SendNAKPackets")
    @Expose
    private Long SendNAKPackets;

    /**
    * <p>Number of received NAK packets</p>
    */
    @SerializedName("RecvNAKPackets")
    @Expose
    private Long RecvNAKPackets;

    /**
     * Get <p>Timestamp in seconds.</p> 
     * @return Timestamp <p>Timestamp in seconds.</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>Timestamp in seconds.</p>
     * @param Timestamp <p>Timestamp in seconds.</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>Packet loss rate on transmitting.</p> 
     * @return SendPacketLossRate <p>Packet loss rate on transmitting.</p>
     */
    public Long getSendPacketLossRate() {
        return this.SendPacketLossRate;
    }

    /**
     * Set <p>Packet loss rate on transmitting.</p>
     * @param SendPacketLossRate <p>Packet loss rate on transmitting.</p>
     */
    public void setSendPacketLossRate(Long SendPacketLossRate) {
        this.SendPacketLossRate = SendPacketLossRate;
    }

    /**
     * Get <p>Retransmission rate.</p> 
     * @return SendRetransmissionRate <p>Retransmission rate.</p>
     */
    public Long getSendRetransmissionRate() {
        return this.SendRetransmissionRate;
    }

    /**
     * Set <p>Retransmission rate.</p>
     * @param SendRetransmissionRate <p>Retransmission rate.</p>
     */
    public void setSendRetransmissionRate(Long SendRetransmissionRate) {
        this.SendRetransmissionRate = SendRetransmissionRate;
    }

    /**
     * Get <p>Packet loss rate on receiving.</p> 
     * @return RecvPacketLossRate <p>Packet loss rate on receiving.</p>
     */
    public Long getRecvPacketLossRate() {
        return this.RecvPacketLossRate;
    }

    /**
     * Set <p>Packet loss rate on receiving.</p>
     * @param RecvPacketLossRate <p>Packet loss rate on receiving.</p>
     */
    public void setRecvPacketLossRate(Long RecvPacketLossRate) {
        this.RecvPacketLossRate = RecvPacketLossRate;
    }

    /**
     * Get <p>Receiving retransmission rate.</p> 
     * @return RecvRetransmissionRate <p>Receiving retransmission rate.</p>
     */
    public Long getRecvRetransmissionRate() {
        return this.RecvRetransmissionRate;
    }

    /**
     * Set <p>Receiving retransmission rate.</p>
     * @param RecvRetransmissionRate <p>Receiving retransmission rate.</p>
     */
    public void setRecvRetransmissionRate(Long RecvRetransmissionRate) {
        this.RecvRetransmissionRate = RecvRetransmissionRate;
    }

    /**
     * Get <p>RTT latency to the peer.</p> 
     * @return RTT <p>RTT latency to the peer.</p>
     */
    public Long getRTT() {
        return this.RTT;
    }

    /**
     * Set <p>RTT latency to the peer.</p>
     * @param RTT <p>RTT latency to the peer.</p>
     */
    public void setRTT(Long RTT) {
        this.RTT = RTT;
    }

    /**
     * Get <p>Flag the same streaming session.</p> 
     * @return SessionId <p>Flag the same streaming session.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Flag the same streaming session.</p>
     * @param SessionId <p>Flag the same streaming session.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Number of discarded packets on sending.</p> 
     * @return SendPacketDropNumber <p>Number of discarded packets on sending.</p>
     */
    public Long getSendPacketDropNumber() {
        return this.SendPacketDropNumber;
    }

    /**
     * Set <p>Number of discarded packets on sending.</p>
     * @param SendPacketDropNumber <p>Number of discarded packets on sending.</p>
     */
    public void setSendPacketDropNumber(Long SendPacketDropNumber) {
        this.SendPacketDropNumber = SendPacketDropNumber;
    }

    /**
     * Get <p>Number of received dropped packets.</p> 
     * @return RecvPacketDropNumber <p>Number of received dropped packets.</p>
     */
    public Long getRecvPacketDropNumber() {
        return this.RecvPacketDropNumber;
    }

    /**
     * Set <p>Number of received dropped packets.</p>
     * @param RecvPacketDropNumber <p>Number of received dropped packets.</p>
     */
    public void setRecvPacketDropNumber(Long RecvPacketDropNumber) {
        this.RecvPacketDropNumber = RecvPacketDropNumber;
    }

    /**
     * Get <p>Bandwidth.</p> 
     * @return Bandwidth <p>Bandwidth.</p>
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>Bandwidth.</p>
     * @param Bandwidth <p>Bandwidth.</p>
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>Transmit bandwidth</p> 
     * @return SendBandwidth <p>Transmit bandwidth</p>
     */
    public Float getSendBandwidth() {
        return this.SendBandwidth;
    }

    /**
     * Set <p>Transmit bandwidth</p>
     * @param SendBandwidth <p>Transmit bandwidth</p>
     */
    public void setSendBandwidth(Float SendBandwidth) {
        this.SendBandwidth = SendBandwidth;
    }

    /**
     * Get <p>Receiving bandwidth</p> 
     * @return RecvBandwidth <p>Receiving bandwidth</p>
     */
    public Float getRecvBandwidth() {
        return this.RecvBandwidth;
    }

    /**
     * Set <p>Receiving bandwidth</p>
     * @param RecvBandwidth <p>Receiving bandwidth</p>
     */
    public void setRecvBandwidth(Float RecvBandwidth) {
        this.RecvBandwidth = RecvBandwidth;
    }

    /**
     * Get <p>Sent packet count</p> 
     * @return SendPackets <p>Sent packet count</p>
     */
    public Long getSendPackets() {
        return this.SendPackets;
    }

    /**
     * Set <p>Sent packet count</p>
     * @param SendPackets <p>Sent packet count</p>
     */
    public void setSendPackets(Long SendPackets) {
        this.SendPackets = SendPackets;
    }

    /**
     * Get <p>Number of received packets</p> 
     * @return RecvPackets <p>Number of received packets</p>
     */
    public Long getRecvPackets() {
        return this.RecvPackets;
    }

    /**
     * Set <p>Number of received packets</p>
     * @param RecvPackets <p>Number of received packets</p>
     */
    public void setRecvPackets(Long RecvPackets) {
        this.RecvPackets = RecvPackets;
    }

    /**
     * Get <p>Sending lost packets</p> 
     * @return SendLostPackets <p>Sending lost packets</p>
     */
    public Long getSendLostPackets() {
        return this.SendLostPackets;
    }

    /**
     * Set <p>Sending lost packets</p>
     * @param SendLostPackets <p>Sending lost packets</p>
     */
    public void setSendLostPackets(Long SendLostPackets) {
        this.SendLostPackets = SendLostPackets;
    }

    /**
     * Get <p>Accept lost packets</p> 
     * @return RecvLostPackets <p>Accept lost packets</p>
     */
    public Long getRecvLostPackets() {
        return this.RecvLostPackets;
    }

    /**
     * Set <p>Accept lost packets</p>
     * @param RecvLostPackets <p>Accept lost packets</p>
     */
    public void setRecvLostPackets(Long RecvLostPackets) {
        this.RecvLostPackets = RecvLostPackets;
    }

    /**
     * Get <p>Sent retransmission packet count</p> 
     * @return SendRetransmitPackets <p>Sent retransmission packet count</p>
     */
    public Long getSendRetransmitPackets() {
        return this.SendRetransmitPackets;
    }

    /**
     * Set <p>Sent retransmission packet count</p>
     * @param SendRetransmitPackets <p>Sent retransmission packet count</p>
     */
    public void setSendRetransmitPackets(Long SendRetransmitPackets) {
        this.SendRetransmitPackets = SendRetransmitPackets;
    }

    /**
     * Get <p>Number of received retransmission packets</p> 
     * @return RecvRetransmitPackets <p>Number of received retransmission packets</p>
     */
    public Long getRecvRetransmitPackets() {
        return this.RecvRetransmitPackets;
    }

    /**
     * Set <p>Number of received retransmission packets</p>
     * @param RecvRetransmitPackets <p>Number of received retransmission packets</p>
     */
    public void setRecvRetransmitPackets(Long RecvRetransmitPackets) {
        this.RecvRetransmitPackets = RecvRetransmitPackets;
    }

    /**
     * Get <p>Flight window size</p> 
     * @return FlightSize <p>Flight window size</p>
     */
    public Long getFlightSize() {
        return this.FlightSize;
    }

    /**
     * Set <p>Flight window size</p>
     * @param FlightSize <p>Flight window size</p>
     */
    public void setFlightSize(Long FlightSize) {
        this.FlightSize = FlightSize;
    }

    /**
     * Get <p>Congestion window.</p> 
     * @return CongestionWindow <p>Congestion window.</p>
     */
    public Long getCongestionWindow() {
        return this.CongestionWindow;
    }

    /**
     * Set <p>Congestion window.</p>
     * @param CongestionWindow <p>Congestion window.</p>
     */
    public void setCongestionWindow(Long CongestionWindow) {
        this.CongestionWindow = CongestionWindow;
    }

    /**
     * Get <p>Sending buffer (ms)</p> 
     * @return SendBuffer <p>Sending buffer (ms)</p>
     */
    public Long getSendBuffer() {
        return this.SendBuffer;
    }

    /**
     * Set <p>Sending buffer (ms)</p>
     * @param SendBuffer <p>Sending buffer (ms)</p>
     */
    public void setSendBuffer(Long SendBuffer) {
        this.SendBuffer = SendBuffer;
    }

    /**
     * Get <p>Receive buffer (ms)</p> 
     * @return RecvBuffer <p>Receive buffer (ms)</p>
     */
    public Long getRecvBuffer() {
        return this.RecvBuffer;
    }

    /**
     * Set <p>Receive buffer (ms)</p>
     * @param RecvBuffer <p>Receive buffer (ms)</p>
     */
    public void setRecvBuffer(Long RecvBuffer) {
        this.RecvBuffer = RecvBuffer;
    }

    /**
     * Get <p>Sending delay</p> 
     * @return SendLatency <p>Sending delay</p>
     */
    public Long getSendLatency() {
        return this.SendLatency;
    }

    /**
     * Set <p>Sending delay</p>
     * @param SendLatency <p>Sending delay</p>
     */
    public void setSendLatency(Long SendLatency) {
        this.SendLatency = SendLatency;
    }

    /**
     * Get <p>Receive latency</p> 
     * @return RecvLatency <p>Receive latency</p>
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set <p>Receive latency</p>
     * @param RecvLatency <p>Receive latency</p>
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
    }

    /**
     * Get <p>Sent NAK packet count</p> 
     * @return SendNAKPackets <p>Sent NAK packet count</p>
     */
    public Long getSendNAKPackets() {
        return this.SendNAKPackets;
    }

    /**
     * Set <p>Sent NAK packet count</p>
     * @param SendNAKPackets <p>Sent NAK packet count</p>
     */
    public void setSendNAKPackets(Long SendNAKPackets) {
        this.SendNAKPackets = SendNAKPackets;
    }

    /**
     * Get <p>Number of received NAK packets</p> 
     * @return RecvNAKPackets <p>Number of received NAK packets</p>
     */
    public Long getRecvNAKPackets() {
        return this.RecvNAKPackets;
    }

    /**
     * Set <p>Number of received NAK packets</p>
     * @param RecvNAKPackets <p>Number of received NAK packets</p>
     */
    public void setRecvNAKPackets(Long RecvNAKPackets) {
        this.RecvNAKPackets = RecvNAKPackets;
    }

    public FlowSRTInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowSRTInfo(FlowSRTInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.SendPacketLossRate != null) {
            this.SendPacketLossRate = new Long(source.SendPacketLossRate);
        }
        if (source.SendRetransmissionRate != null) {
            this.SendRetransmissionRate = new Long(source.SendRetransmissionRate);
        }
        if (source.RecvPacketLossRate != null) {
            this.RecvPacketLossRate = new Long(source.RecvPacketLossRate);
        }
        if (source.RecvRetransmissionRate != null) {
            this.RecvRetransmissionRate = new Long(source.RecvRetransmissionRate);
        }
        if (source.RTT != null) {
            this.RTT = new Long(source.RTT);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SendPacketDropNumber != null) {
            this.SendPacketDropNumber = new Long(source.SendPacketDropNumber);
        }
        if (source.RecvPacketDropNumber != null) {
            this.RecvPacketDropNumber = new Long(source.RecvPacketDropNumber);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Float(source.Bandwidth);
        }
        if (source.SendBandwidth != null) {
            this.SendBandwidth = new Float(source.SendBandwidth);
        }
        if (source.RecvBandwidth != null) {
            this.RecvBandwidth = new Float(source.RecvBandwidth);
        }
        if (source.SendPackets != null) {
            this.SendPackets = new Long(source.SendPackets);
        }
        if (source.RecvPackets != null) {
            this.RecvPackets = new Long(source.RecvPackets);
        }
        if (source.SendLostPackets != null) {
            this.SendLostPackets = new Long(source.SendLostPackets);
        }
        if (source.RecvLostPackets != null) {
            this.RecvLostPackets = new Long(source.RecvLostPackets);
        }
        if (source.SendRetransmitPackets != null) {
            this.SendRetransmitPackets = new Long(source.SendRetransmitPackets);
        }
        if (source.RecvRetransmitPackets != null) {
            this.RecvRetransmitPackets = new Long(source.RecvRetransmitPackets);
        }
        if (source.FlightSize != null) {
            this.FlightSize = new Long(source.FlightSize);
        }
        if (source.CongestionWindow != null) {
            this.CongestionWindow = new Long(source.CongestionWindow);
        }
        if (source.SendBuffer != null) {
            this.SendBuffer = new Long(source.SendBuffer);
        }
        if (source.RecvBuffer != null) {
            this.RecvBuffer = new Long(source.RecvBuffer);
        }
        if (source.SendLatency != null) {
            this.SendLatency = new Long(source.SendLatency);
        }
        if (source.RecvLatency != null) {
            this.RecvLatency = new Long(source.RecvLatency);
        }
        if (source.SendNAKPackets != null) {
            this.SendNAKPackets = new Long(source.SendNAKPackets);
        }
        if (source.RecvNAKPackets != null) {
            this.RecvNAKPackets = new Long(source.RecvNAKPackets);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "SendPacketLossRate", this.SendPacketLossRate);
        this.setParamSimple(map, prefix + "SendRetransmissionRate", this.SendRetransmissionRate);
        this.setParamSimple(map, prefix + "RecvPacketLossRate", this.RecvPacketLossRate);
        this.setParamSimple(map, prefix + "RecvRetransmissionRate", this.RecvRetransmissionRate);
        this.setParamSimple(map, prefix + "RTT", this.RTT);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SendPacketDropNumber", this.SendPacketDropNumber);
        this.setParamSimple(map, prefix + "RecvPacketDropNumber", this.RecvPacketDropNumber);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "SendBandwidth", this.SendBandwidth);
        this.setParamSimple(map, prefix + "RecvBandwidth", this.RecvBandwidth);
        this.setParamSimple(map, prefix + "SendPackets", this.SendPackets);
        this.setParamSimple(map, prefix + "RecvPackets", this.RecvPackets);
        this.setParamSimple(map, prefix + "SendLostPackets", this.SendLostPackets);
        this.setParamSimple(map, prefix + "RecvLostPackets", this.RecvLostPackets);
        this.setParamSimple(map, prefix + "SendRetransmitPackets", this.SendRetransmitPackets);
        this.setParamSimple(map, prefix + "RecvRetransmitPackets", this.RecvRetransmitPackets);
        this.setParamSimple(map, prefix + "FlightSize", this.FlightSize);
        this.setParamSimple(map, prefix + "CongestionWindow", this.CongestionWindow);
        this.setParamSimple(map, prefix + "SendBuffer", this.SendBuffer);
        this.setParamSimple(map, prefix + "RecvBuffer", this.RecvBuffer);
        this.setParamSimple(map, prefix + "SendLatency", this.SendLatency);
        this.setParamSimple(map, prefix + "RecvLatency", this.RecvLatency);
        this.setParamSimple(map, prefix + "SendNAKPackets", this.SendNAKPackets);
        this.setParamSimple(map, prefix + "RecvNAKPackets", this.RecvNAKPackets);

    }
}

