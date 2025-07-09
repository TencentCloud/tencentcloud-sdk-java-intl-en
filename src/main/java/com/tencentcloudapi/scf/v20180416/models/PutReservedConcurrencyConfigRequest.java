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

public class PutReservedConcurrencyConfigRequest extends AbstractModel {

    /**
    * Specifies the function of which you want to configure the reserved quota
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Reserved memory quota of the function. Note: the upper limit for the total reserved quota of the function is the user's total concurrency memory minus 12800
    */
    @SerializedName("ReservedConcurrencyMem")
    @Expose
    private Long ReservedConcurrencyMem;

    /**
    * Function namespace. Default value: `default`
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get Specifies the function of which you want to configure the reserved quota 
     * @return FunctionName Specifies the function of which you want to configure the reserved quota
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Specifies the function of which you want to configure the reserved quota
     * @param FunctionName Specifies the function of which you want to configure the reserved quota
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Reserved memory quota of the function. Note: the upper limit for the total reserved quota of the function is the user's total concurrency memory minus 12800 
     * @return ReservedConcurrencyMem Reserved memory quota of the function. Note: the upper limit for the total reserved quota of the function is the user's total concurrency memory minus 12800
     */
    public Long getReservedConcurrencyMem() {
        return this.ReservedConcurrencyMem;
    }

    /**
     * Set Reserved memory quota of the function. Note: the upper limit for the total reserved quota of the function is the user's total concurrency memory minus 12800
     * @param ReservedConcurrencyMem Reserved memory quota of the function. Note: the upper limit for the total reserved quota of the function is the user's total concurrency memory minus 12800
     */
    public void setReservedConcurrencyMem(Long ReservedConcurrencyMem) {
        this.ReservedConcurrencyMem = ReservedConcurrencyMem;
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

    public PutReservedConcurrencyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutReservedConcurrencyConfigRequest(PutReservedConcurrencyConfigRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.ReservedConcurrencyMem != null) {
            this.ReservedConcurrencyMem = new Long(source.ReservedConcurrencyMem);
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
        this.setParamSimple(map, prefix + "ReservedConcurrencyMem", this.ReservedConcurrencyMem);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

