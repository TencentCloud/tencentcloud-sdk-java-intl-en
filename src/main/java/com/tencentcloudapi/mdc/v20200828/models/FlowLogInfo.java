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

public class FlowLogInfo extends AbstractModel {

    /**
    * Timestamp in seconds.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Input/output type. Valid values: `input`, `output`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Input or output Id.
    */
    @SerializedName("InputOutputId")
    @Expose
    private String InputOutputId;

    /**
    * Protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Event code.
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * Event information.
    */
    @SerializedName("EventMessage")
    @Expose
    private String EventMessage;

    /**
    * Peer IP.
    */
    @SerializedName("RemoteIp")
    @Expose
    private String RemoteIp;

    /**
    * Peer port.
    */
    @SerializedName("RemotePort")
    @Expose
    private String RemotePort;

    /**
    * Primary/secondary tunnel. 0: primary, 1: backup.
    */
    @SerializedName("Pipeline")
    @Expose
    private String Pipeline;

    /**
    * Input or output name.
    */
    @SerializedName("InputOutputName")
    @Expose
    private String InputOutputName;

    /**
     * Get Timestamp in seconds. 
     * @return Timestamp Timestamp in seconds.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Timestamp in seconds.
     * @param Timestamp Timestamp in seconds.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Input/output type. Valid values: `input`, `output`. 
     * @return Type Input/output type. Valid values: `input`, `output`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Input/output type. Valid values: `input`, `output`.
     * @param Type Input/output type. Valid values: `input`, `output`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Input or output Id. 
     * @return InputOutputId Input or output Id.
     */
    public String getInputOutputId() {
        return this.InputOutputId;
    }

    /**
     * Set Input or output Id.
     * @param InputOutputId Input or output Id.
     */
    public void setInputOutputId(String InputOutputId) {
        this.InputOutputId = InputOutputId;
    }

    /**
     * Get Protocol. 
     * @return Protocol Protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol.
     * @param Protocol Protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Event code. 
     * @return EventCode Event code.
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set Event code.
     * @param EventCode Event code.
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get Event information. 
     * @return EventMessage Event information.
     */
    public String getEventMessage() {
        return this.EventMessage;
    }

    /**
     * Set Event information.
     * @param EventMessage Event information.
     */
    public void setEventMessage(String EventMessage) {
        this.EventMessage = EventMessage;
    }

    /**
     * Get Peer IP. 
     * @return RemoteIp Peer IP.
     */
    public String getRemoteIp() {
        return this.RemoteIp;
    }

    /**
     * Set Peer IP.
     * @param RemoteIp Peer IP.
     */
    public void setRemoteIp(String RemoteIp) {
        this.RemoteIp = RemoteIp;
    }

    /**
     * Get Peer port. 
     * @return RemotePort Peer port.
     */
    public String getRemotePort() {
        return this.RemotePort;
    }

    /**
     * Set Peer port.
     * @param RemotePort Peer port.
     */
    public void setRemotePort(String RemotePort) {
        this.RemotePort = RemotePort;
    }

    /**
     * Get Primary/secondary tunnel. 0: primary, 1: backup. 
     * @return Pipeline Primary/secondary tunnel. 0: primary, 1: backup.
     */
    public String getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set Primary/secondary tunnel. 0: primary, 1: backup.
     * @param Pipeline Primary/secondary tunnel. 0: primary, 1: backup.
     */
    public void setPipeline(String Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get Input or output name. 
     * @return InputOutputName Input or output name.
     */
    public String getInputOutputName() {
        return this.InputOutputName;
    }

    /**
     * Set Input or output name.
     * @param InputOutputName Input or output name.
     */
    public void setInputOutputName(String InputOutputName) {
        this.InputOutputName = InputOutputName;
    }

    public FlowLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowLogInfo(FlowLogInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputOutputId != null) {
            this.InputOutputId = new String(source.InputOutputId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.EventMessage != null) {
            this.EventMessage = new String(source.EventMessage);
        }
        if (source.RemoteIp != null) {
            this.RemoteIp = new String(source.RemoteIp);
        }
        if (source.RemotePort != null) {
            this.RemotePort = new String(source.RemotePort);
        }
        if (source.Pipeline != null) {
            this.Pipeline = new String(source.Pipeline);
        }
        if (source.InputOutputName != null) {
            this.InputOutputName = new String(source.InputOutputName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InputOutputId", this.InputOutputId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "EventMessage", this.EventMessage);
        this.setParamSimple(map, prefix + "RemoteIp", this.RemoteIp);
        this.setParamSimple(map, prefix + "RemotePort", this.RemotePort);
        this.setParamSimple(map, prefix + "Pipeline", this.Pipeline);
        this.setParamSimple(map, prefix + "InputOutputName", this.InputOutputName);

    }
}

