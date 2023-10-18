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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteFunctionRequest extends AbstractModel {

    /**
    * Name of called backend API.
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * API parameter. Parameter format will depend on the actual function definition.
    */
    @SerializedName("FunctionArg")
    @Expose
    private String FunctionArg;

    /**
     * Get Name of called backend API. 
     * @return FunctionName Name of called backend API.
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of called backend API.
     * @param FunctionName Name of called backend API.
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get API parameter. Parameter format will depend on the actual function definition. 
     * @return FunctionArg API parameter. Parameter format will depend on the actual function definition.
     */
    public String getFunctionArg() {
        return this.FunctionArg;
    }

    /**
     * Set API parameter. Parameter format will depend on the actual function definition.
     * @param FunctionArg API parameter. Parameter format will depend on the actual function definition.
     */
    public void setFunctionArg(String FunctionArg) {
        this.FunctionArg = FunctionArg;
    }

    public ExecuteFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteFunctionRequest(ExecuteFunctionRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionArg != null) {
            this.FunctionArg = new String(source.FunctionArg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionArg", this.FunctionArg);

    }
}

