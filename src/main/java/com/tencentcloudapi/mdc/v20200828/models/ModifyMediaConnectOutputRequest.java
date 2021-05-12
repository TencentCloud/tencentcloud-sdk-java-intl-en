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

public class ModifyMediaConnectOutputRequest extends AbstractModel{

    /**
    * Flow ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Configuration of the output to be modified.
    */
    @SerializedName("Output")
    @Expose
    private ModifyOutput Output;

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
     * Get Configuration of the output to be modified. 
     * @return Output Configuration of the output to be modified.
     */
    public ModifyOutput getOutput() {
        return this.Output;
    }

    /**
     * Set Configuration of the output to be modified.
     * @param Output Configuration of the output to be modified.
     */
    public void setOutput(ModifyOutput Output) {
        this.Output = Output;
    }

    public ModifyMediaConnectOutputRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaConnectOutputRequest(ModifyMediaConnectOutputRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Output != null) {
            this.Output = new ModifyOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

