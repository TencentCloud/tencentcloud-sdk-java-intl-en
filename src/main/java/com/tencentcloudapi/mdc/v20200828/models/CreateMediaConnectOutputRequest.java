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

public class CreateMediaConnectOutputRequest extends AbstractModel{

    /**
    * Flow ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Output configuration of flow.
    */
    @SerializedName("Output")
    @Expose
    private CreateOutput Output;

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
     * Get Output configuration of flow. 
     * @return Output Output configuration of flow.
     */
    public CreateOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Output configuration of flow.
     * @param Output Output configuration of flow.
     */
    public void setOutput(CreateOutput Output) {
        this.Output = Output;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

