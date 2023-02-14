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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCredentialRequest extends AbstractModel{

    /**
    * A parameter set. For details, see the example.
    */
    @SerializedName("FunctionArg")
    @Expose
    private FunctionArg FunctionArg;

    /**
    * A parameter set. For details, see the example.
    */
    @SerializedName("TransactionArg")
    @Expose
    private TransactionArg TransactionArg;

    /**
    * The version.
    */
    @SerializedName("VersionCredential")
    @Expose
    private String VersionCredential;

    /**
    * Whether the credential is unsigned.
    */
    @SerializedName("UnSigned")
    @Expose
    private Boolean UnSigned;

    /**
     * Get A parameter set. For details, see the example. 
     * @return FunctionArg A parameter set. For details, see the example.
     */
    public FunctionArg getFunctionArg() {
        return this.FunctionArg;
    }

    /**
     * Set A parameter set. For details, see the example.
     * @param FunctionArg A parameter set. For details, see the example.
     */
    public void setFunctionArg(FunctionArg FunctionArg) {
        this.FunctionArg = FunctionArg;
    }

    /**
     * Get A parameter set. For details, see the example. 
     * @return TransactionArg A parameter set. For details, see the example.
     */
    public TransactionArg getTransactionArg() {
        return this.TransactionArg;
    }

    /**
     * Set A parameter set. For details, see the example.
     * @param TransactionArg A parameter set. For details, see the example.
     */
    public void setTransactionArg(TransactionArg TransactionArg) {
        this.TransactionArg = TransactionArg;
    }

    /**
     * Get The version. 
     * @return VersionCredential The version.
     */
    public String getVersionCredential() {
        return this.VersionCredential;
    }

    /**
     * Set The version.
     * @param VersionCredential The version.
     */
    public void setVersionCredential(String VersionCredential) {
        this.VersionCredential = VersionCredential;
    }

    /**
     * Get Whether the credential is unsigned. 
     * @return UnSigned Whether the credential is unsigned.
     */
    public Boolean getUnSigned() {
        return this.UnSigned;
    }

    /**
     * Set Whether the credential is unsigned.
     * @param UnSigned Whether the credential is unsigned.
     */
    public void setUnSigned(Boolean UnSigned) {
        this.UnSigned = UnSigned;
    }

    public CreateCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCredentialRequest(CreateCredentialRequest source) {
        if (source.FunctionArg != null) {
            this.FunctionArg = new FunctionArg(source.FunctionArg);
        }
        if (source.TransactionArg != null) {
            this.TransactionArg = new TransactionArg(source.TransactionArg);
        }
        if (source.VersionCredential != null) {
            this.VersionCredential = new String(source.VersionCredential);
        }
        if (source.UnSigned != null) {
            this.UnSigned = new Boolean(source.UnSigned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FunctionArg.", this.FunctionArg);
        this.setParamObj(map, prefix + "TransactionArg.", this.TransactionArg);
        this.setParamSimple(map, prefix + "VersionCredential", this.VersionCredential);
        this.setParamSimple(map, prefix + "UnSigned", this.UnSigned);

    }
}

