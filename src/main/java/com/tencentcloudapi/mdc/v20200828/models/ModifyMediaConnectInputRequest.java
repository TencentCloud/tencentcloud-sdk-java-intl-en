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

public class ModifyMediaConnectInputRequest extends AbstractModel{

    /**
    * Flow ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Information of the input to be modified.
    */
    @SerializedName("Input")
    @Expose
    private ModifyInput Input;

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
     * Get Information of the input to be modified. 
     * @return Input Information of the input to be modified.
     */
    public ModifyInput getInput() {
        return this.Input;
    }

    /**
     * Set Information of the input to be modified.
     * @param Input Information of the input to be modified.
     */
    public void setInput(ModifyInput Input) {
        this.Input = Input;
    }

    public ModifyMediaConnectInputRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaConnectInputRequest(ModifyMediaConnectInputRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Input != null) {
            this.Input = new ModifyInput(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}

