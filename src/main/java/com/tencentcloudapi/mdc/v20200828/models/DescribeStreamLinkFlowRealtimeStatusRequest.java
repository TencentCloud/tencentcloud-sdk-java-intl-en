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
    * <p>Stream ID.</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>Input an id array. If both the input and output arrays are empty, it signifies a full query.</p>
    */
    @SerializedName("InputIds")
    @Expose
    private String [] InputIds;

    /**
    * <p>Output id array. If both input and output arrays are empty, it signifies a full query.</p>
    */
    @SerializedName("OutputIds")
    @Expose
    private String [] OutputIds;

    /**
     * Get <p>Stream ID.</p> 
     * @return FlowId <p>Stream ID.</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>Stream ID.</p>
     * @param FlowId <p>Stream ID.</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>Input an id array. If both the input and output arrays are empty, it signifies a full query.</p> 
     * @return InputIds <p>Input an id array. If both the input and output arrays are empty, it signifies a full query.</p>
     */
    public String [] getInputIds() {
        return this.InputIds;
    }

    /**
     * Set <p>Input an id array. If both the input and output arrays are empty, it signifies a full query.</p>
     * @param InputIds <p>Input an id array. If both the input and output arrays are empty, it signifies a full query.</p>
     */
    public void setInputIds(String [] InputIds) {
        this.InputIds = InputIds;
    }

    /**
     * Get <p>Output id array. If both input and output arrays are empty, it signifies a full query.</p> 
     * @return OutputIds <p>Output id array. If both input and output arrays are empty, it signifies a full query.</p>
     */
    public String [] getOutputIds() {
        return this.OutputIds;
    }

    /**
     * Set <p>Output id array. If both input and output arrays are empty, it signifies a full query.</p>
     * @param OutputIds <p>Output id array. If both input and output arrays are empty, it signifies a full query.</p>
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

