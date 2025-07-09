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
    * Flow ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Flow name.
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * Flow status. Valid values: `IDLE`, `RUNNING`
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Maximum bandwidth value.
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
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputGroup")
    @Expose
    private DescribeOutput [] OutputGroup;

    /**
    * EventId of the StreamLink event associated with this Flow.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get Flow ID. 
     * @return FlowId Flow ID.
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Flow ID.
     * @param FlowId Flow ID.
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Flow name. 
     * @return FlowName Flow name.
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set Flow name.
     * @param FlowName Flow name.
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get Flow status. Valid values: `IDLE`, `RUNNING` 
     * @return State Flow status. Valid values: `IDLE`, `RUNNING`
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Flow status. Valid values: `IDLE`, `RUNNING`
     * @param State Flow status. Valid values: `IDLE`, `RUNNING`
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Maximum bandwidth value. 
     * @return MaxBandwidth Maximum bandwidth value.
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set Maximum bandwidth value.
     * @param MaxBandwidth Maximum bandwidth value.
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
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OutputGroup Output group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DescribeOutput [] getOutputGroup() {
        return this.OutputGroup;
    }

    /**
     * Set Output group.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OutputGroup Output group.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputGroup(DescribeOutput [] OutputGroup) {
        this.OutputGroup = OutputGroup;
    }

    /**
     * Get EventId of the StreamLink event associated with this Flow. 
     * @return EventId EventId of the StreamLink event associated with this Flow.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set EventId of the StreamLink event associated with this Flow.
     * @param EventId EventId of the StreamLink event associated with this Flow.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
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

    }
}

