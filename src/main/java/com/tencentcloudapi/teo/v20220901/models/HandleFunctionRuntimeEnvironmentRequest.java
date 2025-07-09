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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleFunctionRuntimeEnvironmentRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Function ID.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Operation type. Valid values:
<li>setEnvironmentVariable: Set an environment variable. If the environment variable exists, it will be modified; otherwise, it will be added.</li>
<li>deleteEnvironmentVariable: Delete an environment variable.</li>
<li>clearEnvironmentVariable: Clear an environment variable.</li>
<li>resetEnvironmentVariable: Reset an environment variable.</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Environment variable list. The runtime environment of a function supports up to 64 variables. This parameter is required when the value of Operation is setEnvironmentVariable, deleteEnvironmentVariable, or resetEnvironmentVariable.
    */
    @SerializedName("EnvironmentVariables")
    @Expose
    private FunctionEnvironmentVariable [] EnvironmentVariables;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Function ID. 
     * @return FunctionId Function ID.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID.
     * @param FunctionId Function ID.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Operation type. Valid values:
<li>setEnvironmentVariable: Set an environment variable. If the environment variable exists, it will be modified; otherwise, it will be added.</li>
<li>deleteEnvironmentVariable: Delete an environment variable.</li>
<li>clearEnvironmentVariable: Clear an environment variable.</li>
<li>resetEnvironmentVariable: Reset an environment variable.</li> 
     * @return Operation Operation type. Valid values:
<li>setEnvironmentVariable: Set an environment variable. If the environment variable exists, it will be modified; otherwise, it will be added.</li>
<li>deleteEnvironmentVariable: Delete an environment variable.</li>
<li>clearEnvironmentVariable: Clear an environment variable.</li>
<li>resetEnvironmentVariable: Reset an environment variable.</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type. Valid values:
<li>setEnvironmentVariable: Set an environment variable. If the environment variable exists, it will be modified; otherwise, it will be added.</li>
<li>deleteEnvironmentVariable: Delete an environment variable.</li>
<li>clearEnvironmentVariable: Clear an environment variable.</li>
<li>resetEnvironmentVariable: Reset an environment variable.</li>
     * @param Operation Operation type. Valid values:
<li>setEnvironmentVariable: Set an environment variable. If the environment variable exists, it will be modified; otherwise, it will be added.</li>
<li>deleteEnvironmentVariable: Delete an environment variable.</li>
<li>clearEnvironmentVariable: Clear an environment variable.</li>
<li>resetEnvironmentVariable: Reset an environment variable.</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Environment variable list. The runtime environment of a function supports up to 64 variables. This parameter is required when the value of Operation is setEnvironmentVariable, deleteEnvironmentVariable, or resetEnvironmentVariable. 
     * @return EnvironmentVariables Environment variable list. The runtime environment of a function supports up to 64 variables. This parameter is required when the value of Operation is setEnvironmentVariable, deleteEnvironmentVariable, or resetEnvironmentVariable.
     */
    public FunctionEnvironmentVariable [] getEnvironmentVariables() {
        return this.EnvironmentVariables;
    }

    /**
     * Set Environment variable list. The runtime environment of a function supports up to 64 variables. This parameter is required when the value of Operation is setEnvironmentVariable, deleteEnvironmentVariable, or resetEnvironmentVariable.
     * @param EnvironmentVariables Environment variable list. The runtime environment of a function supports up to 64 variables. This parameter is required when the value of Operation is setEnvironmentVariable, deleteEnvironmentVariable, or resetEnvironmentVariable.
     */
    public void setEnvironmentVariables(FunctionEnvironmentVariable [] EnvironmentVariables) {
        this.EnvironmentVariables = EnvironmentVariables;
    }

    public HandleFunctionRuntimeEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleFunctionRuntimeEnvironmentRequest(HandleFunctionRuntimeEnvironmentRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.EnvironmentVariables != null) {
            this.EnvironmentVariables = new FunctionEnvironmentVariable[source.EnvironmentVariables.length];
            for (int i = 0; i < source.EnvironmentVariables.length; i++) {
                this.EnvironmentVariables[i] = new FunctionEnvironmentVariable(source.EnvironmentVariables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "EnvironmentVariables.", this.EnvironmentVariables);

    }
}

