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

public class DescribeFlow extends AbstractModel{

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
    * Flow status.
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
     * Get Flow status. 
     * @return State Flow status.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Flow status.
     * @param State Flow status.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamArrayObj(map, prefix + "InputGroup.", this.InputGroup);
        this.setParamArrayObj(map, prefix + "OutputGroup.", this.OutputGroup);

    }
}

