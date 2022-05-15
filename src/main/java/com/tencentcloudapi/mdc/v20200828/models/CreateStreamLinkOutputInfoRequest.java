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

public class CreateStreamLinkOutputInfoRequest extends AbstractModel{

    /**
    * The flow ID.
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * The output configuration of the flow.
    */
    @SerializedName("Output")
    @Expose
    private CreateOutputInfo Output;

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
     * Get The output configuration of the flow. 
     * @return Output The output configuration of the flow.
     */
    public CreateOutputInfo getOutput() {
        return this.Output;
    }

    /**
     * Set The output configuration of the flow.
     * @param Output The output configuration of the flow.
     */
    public void setOutput(CreateOutputInfo Output) {
        this.Output = Output;
    }

    public CreateStreamLinkOutputInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLinkOutputInfoRequest(CreateStreamLinkOutputInfoRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Output != null) {
            this.Output = new CreateOutputInfo(source.Output);
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

