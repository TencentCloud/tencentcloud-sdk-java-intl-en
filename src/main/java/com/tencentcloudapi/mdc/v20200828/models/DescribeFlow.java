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

public class DescribeFlow extends AbstractModel {

    /**
    * Stream Id.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Stream name.
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * Stream status. Valid values: IDLE, RUNNING.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Maximum bandwidth.
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * Input group.
    */
    @SerializedName("InputGroup")
    @Expose
    private DescribeInput [] InputGroup;

    /**
    * Output group.
    */
    @SerializedName("OutputGroup")
    @Expose
    private DescribeOutput [] OutputGroup;

    /**
    * EventId of the media transmission event associated with this Flow.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Creation time of the Flow in UTC format.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Input protocols that can be created for this Flow.
    */
    @SerializedName("AllowedInputProtocols")
    @Expose
    private String [] AllowedInputProtocols;

    /**
    * Output protocols allowed to be created by this Flow
    */
    @SerializedName("AllowedOutputProtocols")
    @Expose
    private String [] AllowedOutputProtocols;

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
     * Get Stream name. 
     * @return FlowName Stream name.
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set Stream name.
     * @param FlowName Stream name.
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get Stream status. Valid values: IDLE, RUNNING. 
     * @return State Stream status. Valid values: IDLE, RUNNING.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Stream status. Valid values: IDLE, RUNNING.
     * @param State Stream status. Valid values: IDLE, RUNNING.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Maximum bandwidth. 
     * @return MaxBandwidth Maximum bandwidth.
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set Maximum bandwidth.
     * @param MaxBandwidth Maximum bandwidth.
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get Input group. 
     * @return InputGroup Input group.
     */
    public DescribeInput [] getInputGroup() {
        return this.InputGroup;
    }

    /**
     * Set Input group.
     * @param InputGroup Input group.
     */
    public void setInputGroup(DescribeInput [] InputGroup) {
        this.InputGroup = InputGroup;
    }

    /**
     * Get Output group. 
     * @return OutputGroup Output group.
     */
    public DescribeOutput [] getOutputGroup() {
        return this.OutputGroup;
    }

    /**
     * Set Output group.
     * @param OutputGroup Output group.
     */
    public void setOutputGroup(DescribeOutput [] OutputGroup) {
        this.OutputGroup = OutputGroup;
    }

    /**
     * Get EventId of the media transmission event associated with this Flow. 
     * @return EventId EventId of the media transmission event associated with this Flow.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set EventId of the media transmission event associated with this Flow.
     * @param EventId EventId of the media transmission event associated with this Flow.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Creation time of the Flow in UTC format. 
     * @return CreateTime Creation time of the Flow in UTC format.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the Flow in UTC format.
     * @param CreateTime Creation time of the Flow in UTC format.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Input protocols that can be created for this Flow. 
     * @return AllowedInputProtocols Input protocols that can be created for this Flow.
     */
    public String [] getAllowedInputProtocols() {
        return this.AllowedInputProtocols;
    }

    /**
     * Set Input protocols that can be created for this Flow.
     * @param AllowedInputProtocols Input protocols that can be created for this Flow.
     */
    public void setAllowedInputProtocols(String [] AllowedInputProtocols) {
        this.AllowedInputProtocols = AllowedInputProtocols;
    }

    /**
     * Get Output protocols allowed to be created by this Flow 
     * @return AllowedOutputProtocols Output protocols allowed to be created by this Flow
     */
    public String [] getAllowedOutputProtocols() {
        return this.AllowedOutputProtocols;
    }

    /**
     * Set Output protocols allowed to be created by this Flow
     * @param AllowedOutputProtocols Output protocols allowed to be created by this Flow
     */
    public void setAllowedOutputProtocols(String [] AllowedOutputProtocols) {
        this.AllowedOutputProtocols = AllowedOutputProtocols;
    }

    public DescribeFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlow(DescribeFlow source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.InputGroup != null) {
            this.InputGroup = new DescribeInput[source.InputGroup.length];
            for (int i = 0; i < source.InputGroup.length; i++) {
                this.InputGroup[i] = new DescribeInput(source.InputGroup[i]);
            }
        }
        if (source.OutputGroup != null) {
            this.OutputGroup = new DescribeOutput[source.OutputGroup.length];
            for (int i = 0; i < source.OutputGroup.length; i++) {
                this.OutputGroup[i] = new DescribeOutput(source.OutputGroup[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AllowedInputProtocols != null) {
            this.AllowedInputProtocols = new String[source.AllowedInputProtocols.length];
            for (int i = 0; i < source.AllowedInputProtocols.length; i++) {
                this.AllowedInputProtocols[i] = new String(source.AllowedInputProtocols[i]);
            }
        }
        if (source.AllowedOutputProtocols != null) {
            this.AllowedOutputProtocols = new String[source.AllowedOutputProtocols.length];
            for (int i = 0; i < source.AllowedOutputProtocols.length; i++) {
                this.AllowedOutputProtocols[i] = new String(source.AllowedOutputProtocols[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamArrayObj(map, prefix + "InputGroup.", this.InputGroup);
        this.setParamArrayObj(map, prefix + "OutputGroup.", this.OutputGroup);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "AllowedInputProtocols.", this.AllowedInputProtocols);
        this.setParamArraySimple(map, prefix + "AllowedOutputProtocols.", this.AllowedOutputProtocols);

    }
}

