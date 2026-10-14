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

public class CreateStreamLinkFlowRequest extends AbstractModel {

    /**
    * Stream name.
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * Maximum bandwidth in bps. Options: [10000000, 20000000].
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * Input group of a stream.
    */
    @SerializedName("InputGroup")
    @Expose
    private CreateInput [] InputGroup;

    /**
    * Media transmission Event ID associated with the Flow. Each Flow can only be associated with one Event.
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Output group of the stream.
    */
    @SerializedName("OutputGroup")
    @Expose
    private CreateOutputInfo [] OutputGroup;

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
     * Get Maximum bandwidth in bps. Options: [10000000, 20000000]. 
     * @return MaxBandwidth Maximum bandwidth in bps. Options: [10000000, 20000000].
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set Maximum bandwidth in bps. Options: [10000000, 20000000].
     * @param MaxBandwidth Maximum bandwidth in bps. Options: [10000000, 20000000].
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get Input group of a stream. 
     * @return InputGroup Input group of a stream.
     */
    public CreateInput [] getInputGroup() {
        return this.InputGroup;
    }

    /**
     * Set Input group of a stream.
     * @param InputGroup Input group of a stream.
     */
    public void setInputGroup(CreateInput [] InputGroup) {
        this.InputGroup = InputGroup;
    }

    /**
     * Get Media transmission Event ID associated with the Flow. Each Flow can only be associated with one Event. 
     * @return EventId Media transmission Event ID associated with the Flow. Each Flow can only be associated with one Event.
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Media transmission Event ID associated with the Flow. Each Flow can only be associated with one Event.
     * @param EventId Media transmission Event ID associated with the Flow. Each Flow can only be associated with one Event.
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Output group of the stream. 
     * @return OutputGroup Output group of the stream.
     */
    public CreateOutputInfo [] getOutputGroup() {
        return this.OutputGroup;
    }

    /**
     * Set Output group of the stream.
     * @param OutputGroup Output group of the stream.
     */
    public void setOutputGroup(CreateOutputInfo [] OutputGroup) {
        this.OutputGroup = OutputGroup;
    }

    public CreateStreamLinkFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLinkFlowRequest(CreateStreamLinkFlowRequest source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.InputGroup != null) {
            this.InputGroup = new CreateInput[source.InputGroup.length];
            for (int i = 0; i < source.InputGroup.length; i++) {
                this.InputGroup[i] = new CreateInput(source.InputGroup[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.OutputGroup != null) {
            this.OutputGroup = new CreateOutputInfo[source.OutputGroup.length];
            for (int i = 0; i < source.OutputGroup.length; i++) {
                this.OutputGroup[i] = new CreateOutputInfo(source.OutputGroup[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamArrayObj(map, prefix + "InputGroup.", this.InputGroup);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamArrayObj(map, prefix + "OutputGroup.", this.OutputGroup);

    }
}

