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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunNodeInfo extends AbstractModel {

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node type.
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * Node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Input..
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * Output.
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * Task output.
    */
    @SerializedName("TaskOutput")
    @Expose
    private String TaskOutput;

    /**
    * Error message.
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * Time consumption.
    */
    @SerializedName("CostMilliSeconds")
    @Expose
    private Long CostMilliSeconds;

    /**
    * Large model output information.
    */
    @SerializedName("StatisticInfos")
    @Expose
    private StatisticInfo [] StatisticInfos;

    /**
     * Get Node ID. 
     * @return NodeId Node ID.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
     * @param NodeId Node ID.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node type. 
     * @return NodeType Node type.
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type.
     * @param NodeType Node type.
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node name. 
     * @return NodeName Node name.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name.
     * @param NodeName Node name.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Input.. 
     * @return Input Input..
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set Input..
     * @param Input Input..
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get Output. 
     * @return Output Output.
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Output.
     * @param Output Output.
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get Task output. 
     * @return TaskOutput Task output.
     */
    public String getTaskOutput() {
        return this.TaskOutput;
    }

    /**
     * Set Task output.
     * @param TaskOutput Task output.
     */
    public void setTaskOutput(String TaskOutput) {
        this.TaskOutput = TaskOutput;
    }

    /**
     * Get Error message. 
     * @return FailMessage Error message.
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set Error message.
     * @param FailMessage Error message.
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get Time consumption. 
     * @return CostMilliSeconds Time consumption.
     */
    public Long getCostMilliSeconds() {
        return this.CostMilliSeconds;
    }

    /**
     * Set Time consumption.
     * @param CostMilliSeconds Time consumption.
     */
    public void setCostMilliSeconds(Long CostMilliSeconds) {
        this.CostMilliSeconds = CostMilliSeconds;
    }

    /**
     * Get Large model output information. 
     * @return StatisticInfos Large model output information.
     */
    public StatisticInfo [] getStatisticInfos() {
        return this.StatisticInfos;
    }

    /**
     * Set Large model output information.
     * @param StatisticInfos Large model output information.
     */
    public void setStatisticInfos(StatisticInfo [] StatisticInfos) {
        this.StatisticInfos = StatisticInfos;
    }

    public WorkflowRunNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunNodeInfo(WorkflowRunNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.TaskOutput != null) {
            this.TaskOutput = new String(source.TaskOutput);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.CostMilliSeconds != null) {
            this.CostMilliSeconds = new Long(source.CostMilliSeconds);
        }
        if (source.StatisticInfos != null) {
            this.StatisticInfos = new StatisticInfo[source.StatisticInfos.length];
            for (int i = 0; i < source.StatisticInfos.length; i++) {
                this.StatisticInfos[i] = new StatisticInfo(source.StatisticInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "TaskOutput", this.TaskOutput);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "CostMilliSeconds", this.CostMilliSeconds);
        this.setParamArrayObj(map, prefix + "StatisticInfos.", this.StatisticInfos);

    }
}

