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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceCertificateRequest extends AbstractModel{

    /**
    * Certificate ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation
    */
    @SerializedName("ValidType")
    @Expose
    private String ValidType;

    /**
    * Type. `original`: original certificate CSR; `upload`: uploaded manually; `online`: generated online. The default value is original.
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * CSR content
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * Password of the key
    */
    @SerializedName("CsrkeyPassword")
    @Expose
    private String CsrkeyPassword;

    /**
    * Reissue reason
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Certificate ID 
     * @return CertificateId Certificate ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID
     * @param CertificateId Certificate ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation 
     * @return ValidType Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation
     */
    public String getValidType() {
        return this.ValidType;
    }

    /**
     * Set Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation
     * @param ValidType Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation
     */
    public void setValidType(String ValidType) {
        this.ValidType = ValidType;
    }

    /**
     * Get Type. `original`: original certificate CSR; `upload`: uploaded manually; `online`: generated online. The default value is original. 
     * @return CsrType Type. `original`: original certificate CSR; `upload`: uploaded manually; `online`: generated online. The default value is original.
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set Type. `original`: original certificate CSR; `upload`: uploaded manually; `online`: generated online. The default value is original.
     * @param CsrType Type. `original`: original certificate CSR; `upload`: uploaded manually; `online`: generated online. The default value is original.
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get CSR content 
     * @return CsrContent CSR content
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set CSR content
     * @param CsrContent CSR content
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get Password of the key 
     * @return CsrkeyPassword Password of the key
     */
    public String getCsrkeyPassword() {
        return this.CsrkeyPassword;
    }

    /**
     * Set Password of the key
     * @param CsrkeyPassword Password of the key
     */
    public void setCsrkeyPassword(String CsrkeyPassword) {
        this.CsrkeyPassword = CsrkeyPassword;
    }

    /**
     * Get Reissue reason 
     * @return Reason Reissue reason
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reissue reason
     * @param Reason Reissue reason
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ValidType", this.ValidType);
        this.setParamSimple(map, prefix + "CsrType", this.CsrType);
        this.setParamSimple(map, prefix + "CsrContent", this.CsrContent);
        this.setParamSimple(map, prefix + "CsrkeyPassword", this.CsrkeyPassword);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

