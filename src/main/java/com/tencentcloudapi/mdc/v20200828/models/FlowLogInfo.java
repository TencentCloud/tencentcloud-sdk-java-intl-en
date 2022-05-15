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

public class FlowLogInfo extends AbstractModel{

    /**
    * The timestamp (seconds).
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Whether it is an input or output.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The input or output ID.
    */
    @SerializedName("InputOutputId")
    @Expose
    private String InputOutputId;

    /**
    * The protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The event code.
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * The event information.
    */
    @SerializedName("EventMessage")
    @Expose
    private String EventMessage;

    /**
    * The peer IP.
    */
    @SerializedName("RemoteIp")
    @Expose
    private String RemoteIp;

    /**
    * The peer port.
    */
    @SerializedName("RemotePort")
    @Expose
    private String RemotePort;

    /**
    * Whether it is a primary or backup pipeline. Valid values: 0 (primary), 1 (backup).
    */
    @SerializedName("Pipeline")
    @Expose
    private String Pipeline;

    /**
    * The input or output name.
    */
    @SerializedName("InputOutputName")
    @Expose
    private String InputOutputName;

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
     * Get Whether it is an input or output. 
     * @return Type Whether it is an input or output.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Whether it is an input or output.
     * @param Type Whether it is an input or output.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The input or output ID. 
     * @return InputOutputId The input or output ID.
     */
    public String getInputOutputId() {
        return this.InputOutputId;
    }

    /**
     * Set The input or output ID.
     * @param InputOutputId The input or output ID.
     */
    public void setInputOutputId(String InputOutputId) {
        this.InputOutputId = InputOutputId;
    }

    /**
     * Get The protocol. 
     * @return Protocol The protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol.
     * @param Protocol The protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The event code. 
     * @return EventCode The event code.
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set The event code.
     * @param EventCode The event code.
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get The event information. 
     * @return EventMessage The event information.
     */
    public String getEventMessage() {
        return this.EventMessage;
    }

    /**
     * Set The event information.
     * @param EventMessage The event information.
     */
    public void setEventMessage(String EventMessage) {
        this.EventMessage = EventMessage;
    }

    /**
     * Get The peer IP. 
     * @return RemoteIp The peer IP.
     */
    public String getRemoteIp() {
        return this.RemoteIp;
    }

    /**
     * Set The peer IP.
     * @param RemoteIp The peer IP.
     */
    public void setRemoteIp(String RemoteIp) {
        this.RemoteIp = RemoteIp;
    }

    /**
     * Get The peer port. 
     * @return RemotePort The peer port.
     */
    public String getRemotePort() {
        return this.RemotePort;
    }

    /**
     * Set The peer port.
     * @param RemotePort The peer port.
     */
    public void setRemotePort(String RemotePort) {
        this.RemotePort = RemotePort;
    }

    /**
     * Get Whether it is a primary or backup pipeline. Valid values: 0 (primary), 1 (backup). 
     * @return Pipeline Whether it is a primary or backup pipeline. Valid values: 0 (primary), 1 (backup).
     */
    public String getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set Whether it is a primary or backup pipeline. Valid values: 0 (primary), 1 (backup).
     * @param Pipeline Whether it is a primary or backup pipeline. Valid values: 0 (primary), 1 (backup).
     */
    public void setPipeline(String Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get The input or output name. 
     * @return InputOutputName The input or output name.
     */
    public String getInputOutputName() {
        return this.InputOutputName;
    }

    /**
     * Set The input or output name.
     * @param InputOutputName The input or output name.
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

