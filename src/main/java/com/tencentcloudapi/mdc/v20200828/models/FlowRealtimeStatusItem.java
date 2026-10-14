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

public class FlowRealtimeStatusItem extends AbstractModel {

    /**
    * Type. Valid values: `Input`, `Output`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Input Id. If Type is Input, this field is not empty.
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * Output Id. If Type is Output, this field is not empty.
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * Stream Id.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Protocol. SRT | RTMP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Common status information.
    */
    @SerializedName("CommonStatus")
    @Expose
    private FlowRealtimeStatusCommon CommonStatus;

    /**
    * If it is the SRT Protocol, this field will be present.
    */
    @SerializedName("SRTStatus")
    @Expose
    private FlowRealtimeStatusSRT SRTStatus;

    /**
    * If it is the RTMP protocol, this field exists.
    */
    @SerializedName("RTMPStatus")
    @Expose
    private FlowRealtimeStatusRTMP RTMPStatus;

    /**
    * Server IP address.
    */
    @SerializedName("ConnectServerIP")
    @Expose
    private String ConnectServerIP;

    /**
    * If it is the RTP protocol, this field exists.
    */
    @SerializedName("RTPStatus")
    @Expose
    private FlowRealtimeStatusRTP RTPStatus;

    /**
     * Get Type. Valid values: `Input`, `Output`. 
     * @return Type Type. Valid values: `Input`, `Output`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type. Valid values: `Input`, `Output`.
     * @param Type Type. Valid values: `Input`, `Output`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Input Id. If Type is Input, this field is not empty. 
     * @return InputId Input Id. If Type is Input, this field is not empty.
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set Input Id. If Type is Input, this field is not empty.
     * @param InputId Input Id. If Type is Input, this field is not empty.
     */
    public void setInputId(String InputId) {
        this.InputId = InputId;
    }

    /**
     * Get Output Id. If Type is Output, this field is not empty. 
     * @return OutputId Output Id. If Type is Output, this field is not empty.
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set Output Id. If Type is Output, this field is not empty.
     * @param OutputId Output Id. If Type is Output, this field is not empty.
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

    /**
     * Get Stream Id. 
     * @return FlowId Stream Id.
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Stream Id.
     * @param FlowId Stream Id.
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Protocol. SRT | RTMP. 
     * @return Protocol Protocol. SRT | RTMP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. SRT | RTMP.
     * @param Protocol Protocol. SRT | RTMP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Common status information. 
     * @return CommonStatus Common status information.
     */
    public FlowRealtimeStatusCommon getCommonStatus() {
        return this.CommonStatus;
    }

    /**
     * Set Common status information.
     * @param CommonStatus Common status information.
     */
    public void setCommonStatus(FlowRealtimeStatusCommon CommonStatus) {
        this.CommonStatus = CommonStatus;
    }

    /**
     * Get If it is the SRT Protocol, this field will be present. 
     * @return SRTStatus If it is the SRT Protocol, this field will be present.
     */
    public FlowRealtimeStatusSRT getSRTStatus() {
        return this.SRTStatus;
    }

    /**
     * Set If it is the SRT Protocol, this field will be present.
     * @param SRTStatus If it is the SRT Protocol, this field will be present.
     */
    public void setSRTStatus(FlowRealtimeStatusSRT SRTStatus) {
        this.SRTStatus = SRTStatus;
    }

    /**
     * Get If it is the RTMP protocol, this field exists. 
     * @return RTMPStatus If it is the RTMP protocol, this field exists.
     */
    public FlowRealtimeStatusRTMP getRTMPStatus() {
        return this.RTMPStatus;
    }

    /**
     * Set If it is the RTMP protocol, this field exists.
     * @param RTMPStatus If it is the RTMP protocol, this field exists.
     */
    public void setRTMPStatus(FlowRealtimeStatusRTMP RTMPStatus) {
        this.RTMPStatus = RTMPStatus;
    }

    /**
     * Get Server IP address. 
     * @return ConnectServerIP Server IP address.
     */
    public String getConnectServerIP() {
        return this.ConnectServerIP;
    }

    /**
     * Set Server IP address.
     * @param ConnectServerIP Server IP address.
     */
    public void setConnectServerIP(String ConnectServerIP) {
        this.ConnectServerIP = ConnectServerIP;
    }

    /**
     * Get If it is the RTP protocol, this field exists. 
     * @return RTPStatus If it is the RTP protocol, this field exists.
     */
    public FlowRealtimeStatusRTP getRTPStatus() {
        return this.RTPStatus;
    }

    /**
     * Set If it is the RTP protocol, this field exists.
     * @param RTPStatus If it is the RTP protocol, this field exists.
     */
    public void setRTPStatus(FlowRealtimeStatusRTP RTPStatus) {
        this.RTPStatus = RTPStatus;
    }

    public FlowRealtimeStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRealtimeStatusItem(FlowRealtimeStatusItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputId != null) {
            this.InputId = new String(source.InputId);
        }
        if (source.OutputId != null) {
            this.OutputId = new String(source.OutputId);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CommonStatus != null) {
            this.CommonStatus = new FlowRealtimeStatusCommon(source.CommonStatus);
        }
        if (source.SRTStatus != null) {
            this.SRTStatus = new FlowRealtimeStatusSRT(source.SRTStatus);
        }
        if (source.RTMPStatus != null) {
            this.RTMPStatus = new FlowRealtimeStatusRTMP(source.RTMPStatus);
        }
        if (source.ConnectServerIP != null) {
            this.ConnectServerIP = new String(source.ConnectServerIP);
        }
        if (source.RTPStatus != null) {
            this.RTPStatus = new FlowRealtimeStatusRTP(source.RTPStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InputId", this.InputId);
        this.setParamSimple(map, prefix + "OutputId", this.OutputId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "CommonStatus.", this.CommonStatus);
        this.setParamObj(map, prefix + "SRTStatus.", this.SRTStatus);
        this.setParamObj(map, prefix + "RTMPStatus.", this.RTMPStatus);
        this.setParamSimple(map, prefix + "ConnectServerIP", this.ConnectServerIP);
        this.setParamObj(map, prefix + "RTPStatus.", this.RTPStatus);

    }
}

