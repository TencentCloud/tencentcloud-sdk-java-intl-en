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

public class CreateStreamLinkInputRequest extends AbstractModel {

    /**
    * StreamLink stream ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * The input group of the Flow.
    */
    @SerializedName("InputGroup")
    @Expose
    private CreateInput [] InputGroup;

    /**
     * Get StreamLink stream ID. 
     * @return FlowId StreamLink stream ID.
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set StreamLink stream ID.
     * @param FlowId StreamLink stream ID.
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get The input group of the Flow. 
     * @return InputGroup The input group of the Flow.
     */
    public CreateInput [] getInputGroup() {
        return this.InputGroup;
    }

    /**
     * Set The input group of the Flow.
     * @param InputGroup The input group of the Flow.
     */
    public void setInputGroup(CreateInput [] InputGroup) {
        this.InputGroup = InputGroup;
    }

    public CreateStreamLinkInputRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLinkInputRequest(CreateStreamLinkInputRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
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
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "InputGroup.", this.InputGroup);

    }
}

