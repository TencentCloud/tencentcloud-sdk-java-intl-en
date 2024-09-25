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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateVerifyResultRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate.
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * When CertType is 1, this parameter is required, indicating the self-owned certificate chain
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform
    */
    @SerializedName("CertID")
    @Expose
    private String CertID;

    /**
    * When CertType=1, this parameter is required, indicating the private key of the self-owned certificate.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate. 
     * @return CertType Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate.
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate.
     * @param CertType Certificate type. 0: no certificate, with only the HTTP listening port configured; 1: self-owned certificate; 2: managed certificate.
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get When CertType is 1, this parameter is required, indicating the self-owned certificate chain 
     * @return Certificate When CertType is 1, this parameter is required, indicating the self-owned certificate chain
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set When CertType is 1, this parameter is required, indicating the self-owned certificate chain
     * @param Certificate When CertType is 1, this parameter is required, indicating the self-owned certificate chain
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform 
     * @return CertID When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform
     */
    public String getCertID() {
        return this.CertID;
    }

    /**
     * Set When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform
     * @param CertID When CertType is 2, this parameter must be filled, indicating the certificate ID hosted on Tencent Cloud's SSL platform
     */
    public void setCertID(String CertID) {
        this.CertID = CertID;
    }

    /**
     * Get When CertType=1, this parameter is required, indicating the private key of the self-owned certificate. 
     * @return PrivateKey When CertType=1, this parameter is required, indicating the private key of the self-owned certificate.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set When CertType=1, this parameter is required, indicating the private key of the self-owned certificate.
     * @param PrivateKey When CertType=1, this parameter is required, indicating the private key of the self-owned certificate.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    public DescribeCertificateVerifyResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateVerifyResultRequest(DescribeCertificateVerifyResultRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.Certificate != null) {
            this.Certificate = new String(source.Certificate);
        }
        if (source.CertID != null) {
            this.CertID = new String(source.CertID);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "CertID", this.CertID);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);

    }
}

