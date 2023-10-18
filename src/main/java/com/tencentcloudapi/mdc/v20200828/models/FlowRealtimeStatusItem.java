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

public class FlowRealtimeStatusItem extends AbstractModel {

    /**
    * Whether it is an input or output. Valid values: Input, Output.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The input ID, which is not empty if `Type` is `Input`.
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * The output ID, which is not empty if `Type` is `Output`.
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * The flow ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * The protocol used. Valid values: SRT, RTP, RTMP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The common status information.
    */
    @SerializedName("CommonStatus")
    @Expose
    private FlowRealtimeStatusCommon CommonStatus;

    /**
    * This parameter is returned if `Protocol` is `SRT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SRTStatus")
    @Expose
    private FlowRealtimeStatusSRT SRTStatus;

    /**
    * This parameter is returned if `Protocol` is `RTMP`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RTMPStatus")
    @Expose
    private FlowRealtimeStatusRTMP RTMPStatus;

    /**
    * The server IP.
    */
    @SerializedName("ConnectServerIP")
    @Expose
    private String ConnectServerIP;

    /**
    * This parameter is returned if the RTP protocol is used.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RTPStatus")
    @Expose
    private FlowRealtimeStatusRTP RTPStatus;

    /**
     * Get Whether it is an input or output. Valid values: Input, Output. 
     * @return Type Whether it is an input or output. Valid values: Input, Output.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Whether it is an input or output. Valid values: Input, Output.
     * @param Type Whether it is an input or output. Valid values: Input, Output.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The input ID, which is not empty if `Type` is `Input`. 
     * @return InputId The input ID, which is not empty if `Type` is `Input`.
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set The input ID, which is not empty if `Type` is `Input`.
     * @param InputId The input ID, which is not empty if `Type` is `Input`.
     */
    public void setInputId(String InputId) {
        this.InputId = InputId;
    }

    /**
     * Get The output ID, which is not empty if `Type` is `Output`. 
     * @return OutputId The output ID, which is not empty if `Type` is `Output`.
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set The output ID, which is not empty if `Type` is `Output`.
     * @param OutputId The output ID, which is not empty if `Type` is `Output`.
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

    /**
     * Get The flow ID. 
     * @return FlowId The flow ID.
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set The flow ID.
     * @param FlowId The flow ID.
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get The protocol used. Valid values: SRT, RTP, RTMP. 
     * @return Protocol The protocol used. Valid values: SRT, RTP, RTMP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol used. Valid values: SRT, RTP, RTMP.
     * @param Protocol The protocol used. Valid values: SRT, RTP, RTMP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The common status information. 
     * @return CommonStatus The common status information.
     */
    public FlowRealtimeStatusCommon getCommonStatus() {
        return this.CommonStatus;
    }

    /**
     * Set The common status information.
     * @param CommonStatus The common status information.
     */
    public void setCommonStatus(FlowRealtimeStatusCommon CommonStatus) {
        this.CommonStatus = CommonStatus;
    }

    /**
     * Get This parameter is returned if `Protocol` is `SRT`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SRTStatus This parameter is returned if `Protocol` is `SRT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public FlowRealtimeStatusSRT getSRTStatus() {
        return this.SRTStatus;
    }

    /**
     * Set This parameter is returned if `Protocol` is `SRT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SRTStatus This parameter is returned if `Protocol` is `SRT`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSRTStatus(FlowRealtimeStatusSRT SRTStatus) {
        this.SRTStatus = SRTStatus;
    }

    /**
     * Get This parameter is returned if `Protocol` is `RTMP`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RTMPStatus This parameter is returned if `Protocol` is `RTMP`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public FlowRealtimeStatusRTMP getRTMPStatus() {
        return this.RTMPStatus;
    }

    /**
     * Set This parameter is returned if `Protocol` is `RTMP`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RTMPStatus This parameter is returned if `Protocol` is `RTMP`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRTMPStatus(FlowRealtimeStatusRTMP RTMPStatus) {
        this.RTMPStatus = RTMPStatus;
    }

    /**
     * Get The server IP. 
     * @return ConnectServerIP The server IP.
     */
    public String getConnectServerIP() {
        return this.ConnectServerIP;
    }

    /**
     * Set The server IP.
     * @param ConnectServerIP The server IP.
     */
    public void setConnectServerIP(String ConnectServerIP) {
        this.ConnectServerIP = ConnectServerIP;
    }

    /**
     * Get This parameter is returned if the RTP protocol is used.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RTPStatus This parameter is returned if the RTP protocol is used.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public FlowRealtimeStatusRTP getRTPStatus() {
        return this.RTPStatus;
    }

    /**
     * Set This parameter is returned if the RTP protocol is used.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RTPStatus This parameter is returned if the RTP protocol is used.
Note: This field may return `null`, indicating that no valid value can be obtained.
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

