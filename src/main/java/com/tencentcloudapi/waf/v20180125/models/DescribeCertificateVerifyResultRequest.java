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
    * Certificate type. 0: Do not check international standard certificates; 1: The certificate is a self-owned certificate; 2: The certificate is a managed certificate.
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
    * SM certificate type. 0: Do not check SM certificates; 1: The certificate is a self-owned SM certificate; 2: The certificate is a managed SM certificate.
    */
    @SerializedName("GmCertType")
    @Expose
    private Long GmCertType;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
    */
    @SerializedName("GmCert")
    @Expose
    private String GmCert;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
    */
    @SerializedName("GmPrivateKey")
    @Expose
    private String GmPrivateKey;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
    */
    @SerializedName("GmEncCert")
    @Expose
    private String GmEncCert;

    /**
    * When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
    */
    @SerializedName("GmEncPrivateKey")
    @Expose
    private String GmEncPrivateKey;

    /**
    * When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
    */
    @SerializedName("GmSSLId")
    @Expose
    private String GmSSLId;

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
     * Get Certificate type. 0: Do not check international standard certificates; 1: The certificate is a self-owned certificate; 2: The certificate is a managed certificate. 
     * @return CertType Certificate type. 0: Do not check international standard certificates; 1: The certificate is a self-owned certificate; 2: The certificate is a managed certificate.
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set Certificate type. 0: Do not check international standard certificates; 1: The certificate is a self-owned certificate; 2: The certificate is a managed certificate.
     * @param CertType Certificate type. 0: Do not check international standard certificates; 1: The certificate is a self-owned certificate; 2: The certificate is a managed certificate.
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

    /**
     * Get SM certificate type. 0: Do not check SM certificates; 1: The certificate is a self-owned SM certificate; 2: The certificate is a managed SM certificate. 
     * @return GmCertType SM certificate type. 0: Do not check SM certificates; 1: The certificate is a self-owned SM certificate; 2: The certificate is a managed SM certificate.
     */
    public Long getGmCertType() {
        return this.GmCertType;
    }

    /**
     * Set SM certificate type. 0: Do not check SM certificates; 1: The certificate is a self-owned SM certificate; 2: The certificate is a managed SM certificate.
     * @param GmCertType SM certificate type. 0: Do not check SM certificates; 1: The certificate is a self-owned SM certificate; 2: The certificate is a managed SM certificate.
     */
    public void setGmCertType(Long GmCertType) {
        this.GmCertType = GmCertType;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate. 
     * @return GmCert When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
     */
    public String getGmCert() {
        return this.GmCert;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
     * @param GmCert When GmCertType is 1, this parameter needs to be set, indicating the certificate chain of the self-owned SM certificate.
     */
    public void setGmCert(String GmCert) {
        this.GmCert = GmCert;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate. 
     * @return GmPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
     */
    public String getGmPrivateKey() {
        return this.GmPrivateKey;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
     * @param GmPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the self-owned SM certificate.
     */
    public void setGmPrivateKey(String GmPrivateKey) {
        this.GmPrivateKey = GmPrivateKey;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate. 
     * @return GmEncCert When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
     */
    public String getGmEncCert() {
        return this.GmEncCert;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
     * @param GmEncCert When GmCertType is 1, this parameter needs to be set, indicating the encryption certificate of the self-owned SM certificate.
     */
    public void setGmEncCert(String GmEncCert) {
        this.GmEncCert = GmEncCert;
    }

    /**
     * Get When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate. 
     * @return GmEncPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
     */
    public String getGmEncPrivateKey() {
        return this.GmEncPrivateKey;
    }

    /**
     * Set When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
     * @param GmEncPrivateKey When GmCertType is 1, this parameter needs to be set, indicating the private key of the encryption certificate for the self-owned SM certificate.
     */
    public void setGmEncPrivateKey(String GmEncPrivateKey) {
        this.GmEncPrivateKey = GmEncPrivateKey;
    }

    /**
     * Get When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform. 
     * @return GmSSLId When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
     */
    public String getGmSSLId() {
        return this.GmSSLId;
    }

    /**
     * Set When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
     * @param GmSSLId When GmCertType is 2, this parameter needs to be set, indicating the ID of the certificate managed by the Tencent Cloud SSL platform.
     */
    public void setGmSSLId(String GmSSLId) {
        this.GmSSLId = GmSSLId;
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
        if (source.GmCertType != null) {
            this.GmCertType = new Long(source.GmCertType);
        }
        if (source.GmCert != null) {
            this.GmCert = new String(source.GmCert);
        }
        if (source.GmPrivateKey != null) {
            this.GmPrivateKey = new String(source.GmPrivateKey);
        }
        if (source.GmEncCert != null) {
            this.GmEncCert = new String(source.GmEncCert);
        }
        if (source.GmEncPrivateKey != null) {
            this.GmEncPrivateKey = new String(source.GmEncPrivateKey);
        }
        if (source.GmSSLId != null) {
            this.GmSSLId = new String(source.GmSSLId);
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
        this.setParamSimple(map, prefix + "GmCertType", this.GmCertType);
        this.setParamSimple(map, prefix + "GmCert", this.GmCert);
        this.setParamSimple(map, prefix + "GmPrivateKey", this.GmPrivateKey);
        this.setParamSimple(map, prefix + "GmEncCert", this.GmEncCert);
        this.setParamSimple(map, prefix + "GmEncPrivateKey", this.GmEncPrivateKey);
        this.setParamSimple(map, prefix + "GmSSLId", this.GmSSLId);

    }
}

