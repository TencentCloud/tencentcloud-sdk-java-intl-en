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

public class DescribeStreamLinkFlowRealtimeStatusRequest extends AbstractModel {

    /**
    * The flow ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * The IDs of the inputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried.
    */
    @SerializedName("InputIds")
    @Expose
    private String [] InputIds;

    /**
    * The IDs of the outputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried.
    */
    @SerializedName("OutputIds")
    @Expose
    private String [] OutputIds;

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
     * Get The IDs of the inputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried. 
     * @return InputIds The IDs of the inputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried.
     */
    public String [] getInputIds() {
        return this.InputIds;
    }

    /**
     * Set The IDs of the inputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried.
     * @param InputIds The IDs of the inputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried.
     */
    public void setInputIds(String [] InputIds) {
        this.InputIds = InputIds;
    }

    /**
     * Get The IDs of the outputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried. 
     * @return OutputIds The IDs of the outputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried.
     */
    public String [] getOutputIds() {
        return this.OutputIds;
    }

    /**
     * Set The IDs of the outputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried.
     * @param OutputIds The IDs of the outputs to query. If this parameter and `OutputIds` are both empty, all inputs and outputs are queried.
     */
    public void setOutputIds(String [] OutputIds) {
        this.OutputIds = OutputIds;
    }

    public DescribeStreamLinkFlowRealtimeStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowRealtimeStatusRequest(DescribeStreamLinkFlowRealtimeStatusRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.InputIds != null) {
            this.InputIds = new String[source.InputIds.length];
            for (int i = 0; i < source.InputIds.length; i++) {
                this.InputIds[i] = new String(source.InputIds[i]);
            }
        }
        if (source.OutputIds != null) {
            this.OutputIds = new String[source.OutputIds.length];
            for (int i = 0; i < source.OutputIds.length; i++) {
                this.OutputIds[i] = new String(source.OutputIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "InputIds.", this.InputIds);
        this.setParamArraySimple(map, prefix + "OutputIds.", this.OutputIds);

    }
}

