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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceCertificateRequest extends AbstractModel {

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
    * Type. `Original`: original certificate CSR; `Upload`: uploaded manually; `Online`: generated online. The default value is original.
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * CSR content, required when uploading manually.
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
    * The CSR encryption algorithm. Valid values: `RSA` (default), `ECC1`, and `SM2`.
This parameter is available for selection only when the value of `CsrType` is `Online`.
    */
    @SerializedName("CertCSREncryptAlgo")
    @Expose
    private String CertCSREncryptAlgo;

    /**
    * The CSR encryption parameters. When `CsrEncryptAlgo` is set to `RSA`, `2048` (default) and `4096` are available for selection; and when`CsrEncryptAlgo` is set to `ECC`, `prime256v1` (default) and `secp384r1` are available for selection. 
    */
    @SerializedName("CertCSRKeyParameter")
    @Expose
    private String CertCSRKeyParameter;

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
     * Get Type. `Original`: original certificate CSR; `Upload`: uploaded manually; `Online`: generated online. The default value is original. 
     * @return CsrType Type. `Original`: original certificate CSR; `Upload`: uploaded manually; `Online`: generated online. The default value is original.
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set Type. `Original`: original certificate CSR; `Upload`: uploaded manually; `Online`: generated online. The default value is original.
     * @param CsrType Type. `Original`: original certificate CSR; `Upload`: uploaded manually; `Online`: generated online. The default value is original.
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get CSR content, required when uploading manually. 
     * @return CsrContent CSR content, required when uploading manually.
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set CSR content, required when uploading manually.
     * @param CsrContent CSR content, required when uploading manually.
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
     * Get The CSR encryption algorithm. Valid values: `RSA` (default), `ECC1`, and `SM2`.
This parameter is available for selection only when the value of `CsrType` is `Online`. 
     * @return CertCSREncryptAlgo The CSR encryption algorithm. Valid values: `RSA` (default), `ECC1`, and `SM2`.
This parameter is available for selection only when the value of `CsrType` is `Online`.
     */
    public String getCertCSREncryptAlgo() {
        return this.CertCSREncryptAlgo;
    }

    /**
     * Set The CSR encryption algorithm. Valid values: `RSA` (default), `ECC1`, and `SM2`.
This parameter is available for selection only when the value of `CsrType` is `Online`.
     * @param CertCSREncryptAlgo The CSR encryption algorithm. Valid values: `RSA` (default), `ECC1`, and `SM2`.
This parameter is available for selection only when the value of `CsrType` is `Online`.
     */
    public void setCertCSREncryptAlgo(String CertCSREncryptAlgo) {
        this.CertCSREncryptAlgo = CertCSREncryptAlgo;
    }

    /**
     * Get The CSR encryption parameters. When `CsrEncryptAlgo` is set to `RSA`, `2048` (default) and `4096` are available for selection; and when`CsrEncryptAlgo` is set to `ECC`, `prime256v1` (default) and `secp384r1` are available for selection.  
     * @return CertCSRKeyParameter The CSR encryption parameters. When `CsrEncryptAlgo` is set to `RSA`, `2048` (default) and `4096` are available for selection; and when`CsrEncryptAlgo` is set to `ECC`, `prime256v1` (default) and `secp384r1` are available for selection. 
     */
    public String getCertCSRKeyParameter() {
        return this.CertCSRKeyParameter;
    }

    /**
     * Set The CSR encryption parameters. When `CsrEncryptAlgo` is set to `RSA`, `2048` (default) and `4096` are available for selection; and when`CsrEncryptAlgo` is set to `ECC`, `prime256v1` (default) and `secp384r1` are available for selection. 
     * @param CertCSRKeyParameter The CSR encryption parameters. When `CsrEncryptAlgo` is set to `RSA`, `2048` (default) and `4096` are available for selection; and when`CsrEncryptAlgo` is set to `ECC`, `prime256v1` (default) and `secp384r1` are available for selection. 
     */
    public void setCertCSRKeyParameter(String CertCSRKeyParameter) {
        this.CertCSRKeyParameter = CertCSRKeyParameter;
    }

    public ReplaceCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceCertificateRequest(ReplaceCertificateRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ValidType != null) {
            this.ValidType = new String(source.ValidType);
        }
        if (source.CsrType != null) {
            this.CsrType = new String(source.CsrType);
        }
        if (source.CsrContent != null) {
            this.CsrContent = new String(source.CsrContent);
        }
        if (source.CsrkeyPassword != null) {
            this.CsrkeyPassword = new String(source.CsrkeyPassword);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.CertCSREncryptAlgo != null) {
            this.CertCSREncryptAlgo = new String(source.CertCSREncryptAlgo);
        }
        if (source.CertCSRKeyParameter != null) {
            this.CertCSRKeyParameter = new String(source.CertCSRKeyParameter);
        }
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
        this.setParamSimple(map, prefix + "CertCSREncryptAlgo", this.CertCSREncryptAlgo);
        this.setParamSimple(map, prefix + "CertCSRKeyParameter", this.CertCSRKeyParameter);

    }
}

