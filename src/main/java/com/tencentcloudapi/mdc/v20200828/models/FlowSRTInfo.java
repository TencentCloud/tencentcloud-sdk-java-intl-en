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

    }
}

