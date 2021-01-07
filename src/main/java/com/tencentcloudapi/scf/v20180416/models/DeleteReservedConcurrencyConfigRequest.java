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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteReservedConcurrencyConfigRequest extends AbstractModel{

    /**
    * Name of the function for which to delete the provisioned concurrency
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
     * Get Name of the function for which to delete the provisioned concurrency 
     * @return FunctionName Name of the function for which to delete the provisioned concurrency
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the function for which to delete the provisioned concurrency
     * @param FunctionName Name of the function for which to delete the provisioned concurrency
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

