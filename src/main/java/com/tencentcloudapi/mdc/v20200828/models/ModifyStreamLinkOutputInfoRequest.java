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

public class ModifyStreamLinkOutputInfoRequest extends AbstractModel {

    /**
    * 01937702ecc509dc0f3269ca3420
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * Output configuration that needs to be modified.
    */
    @SerializedName("Output")
    @Expose
    private ModifyOutputInfo Output;

    /**
     * Get 01937702ecc509dc0f3269ca3420 
     * @return FlowId 01937702ecc509dc0f3269ca3420
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 01937702ecc509dc0f3269ca3420
     * @param FlowId 01937702ecc509dc0f3269ca3420
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get Output configuration that needs to be modified. 
     * @return Output Output configuration that needs to be modified.
     */
    public ModifyOutputInfo getOutput() {
        return this.Output;
    }

    /**
     * Set Output configuration that needs to be modified.
     * @param Output Output configuration that needs to be modified.
     */
    public void setOutput(ModifyOutputInfo Output) {
        this.Output = Output;
    }

    public ModifyStreamLinkOutputInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamLinkOutputInfoRequest(ModifyStreamLinkOutputInfoRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Output != null) {
            this.Output = new ModifyOutputInfo(source.Output);
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

