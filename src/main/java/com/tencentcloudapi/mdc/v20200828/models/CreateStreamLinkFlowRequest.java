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

public class CreateStreamLinkFlowRequest extends AbstractModel {

    /**
    * Flow name
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * Maximum bandwidth in bps. Valid values: `10000000`, `20000000`, `50000000`
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * Flow input group
    */
    @SerializedName("InputGroup")
    @Expose
    private CreateInput [] InputGroup;

    /**
     * Get Flow name 
     * @return FlowName Flow name
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set Flow name
     * @param FlowName Flow name
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get Maximum bandwidth in bps. Valid values: `10000000`, `20000000`, `50000000` 
     * @return MaxBandwidth Maximum bandwidth in bps. Valid values: `10000000`, `20000000`, `50000000`
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set Maximum bandwidth in bps. Valid values: `10000000`, `20000000`, `50000000`
     * @param MaxBandwidth Maximum bandwidth in bps. Valid values: `10000000`, `20000000`, `50000000`
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get Flow input group 
     * @return InputGroup Flow input group
     */
    public CreateInput [] getInputGroup() {
        return this.InputGroup;
    }

    /**
     * Set Flow input group
     * @param InputGroup Flow input group
     */
    public void setInputGroup(CreateInput [] InputGroup) {
        this.InputGroup = InputGroup;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamArrayObj(map, prefix + "InputGroup.", this.InputGroup);

    }
}

