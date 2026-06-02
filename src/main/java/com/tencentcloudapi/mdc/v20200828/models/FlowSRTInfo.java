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
    * The timestamp (seconds).
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * The packet loss rate for sending.
    */
    @SerializedName("SendPacketLossRate")
    @Expose
    private Long SendPacketLossRate;

    /**
    * The retry rate for sending.
    */
    @SerializedName("SendRetransmissionRate")
    @Expose
    private Long SendRetransmissionRate;

    /**
    * The packet loss rate for receiving.
    */
    @SerializedName("RecvPacketLossRate")
    @Expose
    private Long RecvPacketLossRate;

    /**
    * The retry rate for receiving.
    */
    @SerializedName("RecvRetransmissionRate")
    @Expose
    private Long RecvRetransmissionRate;

    /**
    * The peer RTT.
    */
    @SerializedName("RTT")
    @Expose
    private Long RTT;

    /**
    * The ID of a push session.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The number of dropped packets for sending.
    */
    @SerializedName("SendPacketDropNumber")
    @Expose
    private Long SendPacketDropNumber;

    /**
    * The number of dropped packets for receiving.
    */
    @SerializedName("RecvPacketDropNumber")
    @Expose
    private Long RecvPacketDropNumber;

    /**
    * bandwidth
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * Transmit bandwidth
    */
    @SerializedName("SendBandwidth")
    @Expose
    private Float SendBandwidth;

    /**
    * Receive bandwidth
    */
    @SerializedName("RecvBandwidth")
    @Expose
    private Float RecvBandwidth;

    /**
    * Number of packets sent
    */
    @SerializedName("SendPackets")
    @Expose
    private Long SendPackets;

    /**
    * Number of received packets
    */
    @SerializedName("RecvPackets")
    @Expose
    private Long RecvPackets;

    /**
    * Send lost package
    */
    @SerializedName("SendLostPackets")
    @Expose
    private Long SendLostPackets;

    /**
    * Accept lost packages
    */
    @SerializedName("RecvLostPackets")
    @Expose
    private Long RecvLostPackets;

    /**
    * Number of retransmission packets sent
    */
    @SerializedName("SendRetransmitPackets")
    @Expose
    private Long SendRetransmitPackets;

    /**
    * Number of received retransmission packets
    */
    @SerializedName("RecvRetransmitPackets")
    @Expose
    private Long RecvRetransmitPackets;

    /**
    * Flight window size
    */
    @SerializedName("FlightSize")
    @Expose
    private Long FlightSize;

    /**
    * congestion window
    */
    @SerializedName("CongestionWindow")
    @Expose
    private Long CongestionWindow;

    /**
    * Send buffer (ms)
    */
    @SerializedName("SendBuffer")
    @Expose
    private Long SendBuffer;

    /**
    * Receive buffer (ms)
    */
    @SerializedName("RecvBuffer")
    @Expose
    private Long RecvBuffer;

    /**
    * Sending delay
    */
    @SerializedName("SendLatency")
    @Expose
    private Long SendLatency;

    /**
    * Receiving delay
    */
    @SerializedName("RecvLatency")
    @Expose
    private Long RecvLatency;

    /**
     * Get The timestamp (seconds). 
     * @return Timestamp The timestamp (seconds).
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set The timestamp (seconds).
     * @param Timestamp The timestamp (seconds).
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get The packet loss rate for sending. 
     * @return SendPacketLossRate The packet loss rate for sending.
     */
    public Long getSendPacketLossRate() {
        return this.SendPacketLossRate;
    }

    /**
     * Set The packet loss rate for sending.
     * @param SendPacketLossRate The packet loss rate for sending.
     */
    public void setSendPacketLossRate(Long SendPacketLossRate) {
        this.SendPacketLossRate = SendPacketLossRate;
    }

    /**
     * Get The retry rate for sending. 
     * @return SendRetransmissionRate The retry rate for sending.
     */
    public Long getSendRetransmissionRate() {
        return this.SendRetransmissionRate;
    }

    /**
     * Set The retry rate for sending.
     * @param SendRetransmissionRate The retry rate for sending.
     */
    public void setSendRetransmissionRate(Long SendRetransmissionRate) {
        this.SendRetransmissionRate = SendRetransmissionRate;
    }

    /**
     * Get The packet loss rate for receiving. 
     * @return RecvPacketLossRate The packet loss rate for receiving.
     */
    public Long getRecvPacketLossRate() {
        return this.RecvPacketLossRate;
    }

    /**
     * Set The packet loss rate for receiving.
     * @param RecvPacketLossRate The packet loss rate for receiving.
     */
    public void setRecvPacketLossRate(Long RecvPacketLossRate) {
        this.RecvPacketLossRate = RecvPacketLossRate;
    }

    /**
     * Get The retry rate for receiving. 
     * @return RecvRetransmissionRate The retry rate for receiving.
     */
    public Long getRecvRetransmissionRate() {
        return this.RecvRetransmissionRate;
    }

    /**
     * Set The retry rate for receiving.
     * @param RecvRetransmissionRate The retry rate for receiving.
     */
    public void setRecvRetransmissionRate(Long RecvRetransmissionRate) {
        this.RecvRetransmissionRate = RecvRetransmissionRate;
    }

    /**
     * Get The peer RTT. 
     * @return RTT The peer RTT.
     */
    public Long getRTT() {
        return this.RTT;
    }

    /**
     * Set The peer RTT.
     * @param RTT The peer RTT.
     */
    public void setRTT(Long RTT) {
        this.RTT = RTT;
    }

    /**
     * Get The ID of a push session. 
     * @return SessionId The ID of a push session.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID of a push session.
     * @param SessionId The ID of a push session.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The number of dropped packets for sending. 
     * @return SendPacketDropNumber The number of dropped packets for sending.
     */
    public Long getSendPacketDropNumber() {
        return this.SendPacketDropNumber;
    }

    /**
     * Set The number of dropped packets for sending.
     * @param SendPacketDropNumber The number of dropped packets for sending.
     */
    public void setSendPacketDropNumber(Long SendPacketDropNumber) {
        this.SendPacketDropNumber = SendPacketDropNumber;
    }

    /**
     * Get The number of dropped packets for receiving. 
     * @return RecvPacketDropNumber The number of dropped packets for receiving.
     */
    public Long getRecvPacketDropNumber() {
        return this.RecvPacketDropNumber;
    }

    /**
     * Set The number of dropped packets for receiving.
     * @param RecvPacketDropNumber The number of dropped packets for receiving.
     */
    public void setRecvPacketDropNumber(Long RecvPacketDropNumber) {
        this.RecvPacketDropNumber = RecvPacketDropNumber;
    }

    /**
     * Get bandwidth 
     * @return Bandwidth bandwidth
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set bandwidth
     * @param Bandwidth bandwidth
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Transmit bandwidth 
     * @return SendBandwidth Transmit bandwidth
     */
    public Float getSendBandwidth() {
        return this.SendBandwidth;
    }

    /**
     * Set Transmit bandwidth
     * @param SendBandwidth Transmit bandwidth
     */
    public void setSendBandwidth(Float SendBandwidth) {
        this.SendBandwidth = SendBandwidth;
    }

    /**
     * Get Receive bandwidth 
     * @return RecvBandwidth Receive bandwidth
     */
    public Float getRecvBandwidth() {
        return this.RecvBandwidth;
    }

    /**
     * Set Receive bandwidth
     * @param RecvBandwidth Receive bandwidth
     */
    public void setRecvBandwidth(Float RecvBandwidth) {
        this.RecvBandwidth = RecvBandwidth;
    }

    /**
     * Get Number of packets sent 
     * @return SendPackets Number of packets sent
     */
    public Long getSendPackets() {
        return this.SendPackets;
    }

    /**
     * Set Number of packets sent
     * @param SendPackets Number of packets sent
     */
    public void setSendPackets(Long SendPackets) {
        this.SendPackets = SendPackets;
    }

    /**
     * Get Number of received packets 
     * @return RecvPackets Number of received packets
     */
    public Long getRecvPackets() {
        return this.RecvPackets;
    }

    /**
     * Set Number of received packets
     * @param RecvPackets Number of received packets
     */
    public void setRecvPackets(Long RecvPackets) {
        this.RecvPackets = RecvPackets;
    }

    /**
     * Get Send lost package 
     * @return SendLostPackets Send lost package
     */
    public Long getSendLostPackets() {
        return this.SendLostPackets;
    }

    /**
     * Set Send lost package
     * @param SendLostPackets Send lost package
     */
    public void setSendLostPackets(Long SendLostPackets) {
        this.SendLostPackets = SendLostPackets;
    }

    /**
     * Get Accept lost packages 
     * @return RecvLostPackets Accept lost packages
     */
    public Long getRecvLostPackets() {
        return this.RecvLostPackets;
    }

    /**
     * Set Accept lost packages
     * @param RecvLostPackets Accept lost packages
     */
    public void setRecvLostPackets(Long RecvLostPackets) {
        this.RecvLostPackets = RecvLostPackets;
    }

    /**
     * Get Number of retransmission packets sent 
     * @return SendRetransmitPackets Number of retransmission packets sent
     */
    public Long getSendRetransmitPackets() {
        return this.SendRetransmitPackets;
    }

    /**
     * Set Number of retransmission packets sent
     * @param SendRetransmitPackets Number of retransmission packets sent
     */
    public void setSendRetransmitPackets(Long SendRetransmitPackets) {
        this.SendRetransmitPackets = SendRetransmitPackets;
    }

    /**
     * Get Number of received retransmission packets 
     * @return RecvRetransmitPackets Number of received retransmission packets
     */
    public Long getRecvRetransmitPackets() {
        return this.RecvRetransmitPackets;
    }

    /**
     * Set Number of received retransmission packets
     * @param RecvRetransmitPackets Number of received retransmission packets
     */
    public void setRecvRetransmitPackets(Long RecvRetransmitPackets) {
        this.RecvRetransmitPackets = RecvRetransmitPackets;
    }

    /**
     * Get Flight window size 
     * @return FlightSize Flight window size
     */
    public Long getFlightSize() {
        return this.FlightSize;
    }

    /**
     * Set Flight window size
     * @param FlightSize Flight window size
     */
    public void setFlightSize(Long FlightSize) {
        this.FlightSize = FlightSize;
    }

    /**
     * Get congestion window 
     * @return CongestionWindow congestion window
     */
    public Long getCongestionWindow() {
        return this.CongestionWindow;
    }

    /**
     * Set congestion window
     * @param CongestionWindow congestion window
     */
    public void setCongestionWindow(Long CongestionWindow) {
        this.CongestionWindow = CongestionWindow;
    }

    /**
     * Get Send buffer (ms) 
     * @return SendBuffer Send buffer (ms)
     */
    public Long getSendBuffer() {
        return this.SendBuffer;
    }

    /**
     * Set Send buffer (ms)
     * @param SendBuffer Send buffer (ms)
     */
    public void setSendBuffer(Long SendBuffer) {
        this.SendBuffer = SendBuffer;
    }

    /**
     * Get Receive buffer (ms) 
     * @return RecvBuffer Receive buffer (ms)
     */
    public Long getRecvBuffer() {
        return this.RecvBuffer;
    }

    /**
     * Set Receive buffer (ms)
     * @param RecvBuffer Receive buffer (ms)
     */
    public void setRecvBuffer(Long RecvBuffer) {
        this.RecvBuffer = RecvBuffer;
    }

    /**
     * Get Sending delay 
     * @return SendLatency Sending delay
     */
    public Long getSendLatency() {
        return this.SendLatency;
    }

    /**
     * Set Sending delay
     * @param SendLatency Sending delay
     */
    public void setSendLatency(Long SendLatency) {
        this.SendLatency = SendLatency;
    }

    /**
     * Get Receiving delay 
     * @return RecvLatency Receiving delay
     */
    public Long getRecvLatency() {
        return this.RecvLatency;
    }

    /**
     * Set Receiving delay
     * @param RecvLatency Receiving delay
     */
    public void setRecvLatency(Long RecvLatency) {
        this.RecvLatency = RecvLatency;
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

    }
}

