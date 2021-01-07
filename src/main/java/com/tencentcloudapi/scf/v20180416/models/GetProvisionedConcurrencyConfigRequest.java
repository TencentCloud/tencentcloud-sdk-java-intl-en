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

public class GetProvisionedConcurrencyConfigRequest extends AbstractModel{

    /**
    * Name of the function for which to get the provisioned concurrency details.
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function namespace. Default value: default.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function version number. If this parameter is left empty, the provisioned concurrency information of all function versions will be returned.
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get Name of the function for which to get the provisioned concurrency details. 
     * @return FunctionName Name of the function for which to get the provisioned concurrency details.
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the function for which to get the provisioned concurrency details.
     * @param FunctionName Name of the function for which to get the provisioned concurrency details.
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function namespace. Default value: default. 
     * @return Namespace Function namespace. Default value: default.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace. Default value: default.
     * @param Namespace Function namespace. Default value: default.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function version number. If this parameter is left empty, the provisioned concurrency information of all function versions will be returned. 
     * @return Qualifier Function version number. If this parameter is left empty, the provisioned concurrency information of all function versions will be returned.
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version number. If this parameter is left empty, the provisioned concurrency information of all function versions will be returned.
     * @param Qualifier Function version number. If this parameter is left empty, the provisioned concurrency information of all function versions will be returned.
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

