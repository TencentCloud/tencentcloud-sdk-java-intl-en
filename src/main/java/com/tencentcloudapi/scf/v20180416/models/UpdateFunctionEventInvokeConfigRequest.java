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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFunctionEventInvokeConfigRequest extends AbstractModel {

    /**
    * Async retry configuration information
    */
    @SerializedName("AsyncTriggerConfig")
    @Expose
    private AsyncTriggerConfig AsyncTriggerConfig;

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function namespace. Default value: default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get Async retry configuration information 
     * @return AsyncTriggerConfig Async retry configuration information
     */
    public AsyncTriggerConfig getAsyncTriggerConfig() {
        return this.AsyncTriggerConfig;
    }

    /**
     * Set Async retry configuration information
     * @param AsyncTriggerConfig Async retry configuration information
     */
    public void setAsyncTriggerConfig(AsyncTriggerConfig AsyncTriggerConfig) {
        this.AsyncTriggerConfig = AsyncTriggerConfig;
    }

    /**
     * Get Function name 
     * @return FunctionName Function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name
     * @param FunctionName Function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function namespace. Default value: default 
     * @return Namespace Function namespace. Default value: default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace. Default value: default
     * @param Namespace Function namespace. Default value: default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public UpdateFunctionEventInvokeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFunctionEventInvokeConfigRequest(UpdateFunctionEventInvokeConfigRequest source) {
        if (source.AsyncTriggerConfig != null) {
            this.AsyncTriggerConfig = new AsyncTriggerConfig(source.AsyncTriggerConfig);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AsyncTriggerConfig.", this.AsyncTriggerConfig);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

