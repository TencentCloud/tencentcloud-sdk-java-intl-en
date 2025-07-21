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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleCommand extends AbstractModel {

    /**
    * Remote command ID. this item is required if you select to execute command.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * Custom parameter. field type is json encoded string, for example: {"varA": "222"}.
key specifies the custom parameter name, and value specifies the default. both are string type.
If the parameter value is not provided, the DefaultParameters of Command will be used to replace it.
Custom parameters support a maximum of 20 entries. the custom parameter name must meet the following standard: number of characters has a cap of 64, value range [a-zA-Z0-9-_].
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
     * Get Remote command ID. this item is required if you select to execute command. 
     * @return CommandId Remote command ID. this item is required if you select to execute command.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Remote command ID. this item is required if you select to execute command.
     * @param CommandId Remote command ID. this item is required if you select to execute command.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get Custom parameter. field type is json encoded string, for example: {"varA": "222"}.
key specifies the custom parameter name, and value specifies the default. both are string type.
If the parameter value is not provided, the DefaultParameters of Command will be used to replace it.
Custom parameters support a maximum of 20 entries. the custom parameter name must meet the following standard: number of characters has a cap of 64, value range [a-zA-Z0-9-_]. 
     * @return Parameters Custom parameter. field type is json encoded string, for example: {"varA": "222"}.
key specifies the custom parameter name, and value specifies the default. both are string type.
If the parameter value is not provided, the DefaultParameters of Command will be used to replace it.
Custom parameters support a maximum of 20 entries. the custom parameter name must meet the following standard: number of characters has a cap of 64, value range [a-zA-Z0-9-_].
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameter. field type is json encoded string, for example: {"varA": "222"}.
key specifies the custom parameter name, and value specifies the default. both are string type.
If the parameter value is not provided, the DefaultParameters of Command will be used to replace it.
Custom parameters support a maximum of 20 entries. the custom parameter name must meet the following standard: number of characters has a cap of 64, value range [a-zA-Z0-9-_].
     * @param Parameters Custom parameter. field type is json encoded string, for example: {"varA": "222"}.
key specifies the custom parameter name, and value specifies the default. both are string type.
If the parameter value is not provided, the DefaultParameters of Command will be used to replace it.
Custom parameters support a maximum of 20 entries. the custom parameter name must meet the following standard: number of characters has a cap of 64, value range [a-zA-Z0-9-_].
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    public LifecycleCommand() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleCommand(LifecycleCommand source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);

    }
}

