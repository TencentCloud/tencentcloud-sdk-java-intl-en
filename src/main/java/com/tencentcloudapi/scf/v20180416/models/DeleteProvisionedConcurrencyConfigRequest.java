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

public class DeleteProvisionedConcurrencyConfigRequest extends AbstractModel {

    /**
    * Name of the function for which to delete the provisioned concurrency
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function version number
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Function namespace. Default value: `default`
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
     * Get Function version number 
     * @return Qualifier Function version number
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version number
     * @param Qualifier Function version number
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Function namespace. Default value: `default` 
     * @return Namespace Function namespace. Default value: `default`
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace. Default value: `default`
     * @param Namespace Function namespace. Default value: `default`
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public DeleteProvisionedConcurrencyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteProvisionedConcurrencyConfigRequest(DeleteProvisionedConcurrencyConfigRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

