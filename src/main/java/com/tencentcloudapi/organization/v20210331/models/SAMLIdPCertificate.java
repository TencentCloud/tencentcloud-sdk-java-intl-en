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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SAMLIdPCertificate extends AbstractModel {

    /**
    * Certificate serial number.
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * Certificate issuer.
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * Certificate version.
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * Certificate ID.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Public key certificate in PEM format (Base64 encoded).
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Signature algorithm of the certificate.
    */
    @SerializedName("SignatureAlgorithm")
    @Expose
    private String SignatureAlgorithm;

    /**
    * Expiration time of the certificate.
    */
    @SerializedName("NotAfter")
    @Expose
    private String NotAfter;

    /**
    * Creation time of the certificate.
    */
    @SerializedName("NotBefore")
    @Expose
    private String NotBefore;

    /**
    * Certificate subject.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * X509 certificate in PEM format.
    */
    @SerializedName("X509Certificate")
    @Expose
    private String X509Certificate;

    /**
     * Get Certificate serial number. 
     * @return SerialNumber Certificate serial number.
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set Certificate serial number.
     * @param SerialNumber Certificate serial number.
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get Certificate issuer. 
     * @return Issuer Certificate issuer.
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set Certificate issuer.
     * @param Issuer Certificate issuer.
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get Certificate version. 
     * @return Version Certificate version.
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set Certificate version.
     * @param Version Certificate version.
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get Certificate ID. 
     * @return CertificateId Certificate ID.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID.
     * @param CertificateId Certificate ID.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Public key certificate in PEM format (Base64 encoded). 
     * @return PublicKey Public key certificate in PEM format (Base64 encoded).
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key certificate in PEM format (Base64 encoded).
     * @param PublicKey Public key certificate in PEM format (Base64 encoded).
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Signature algorithm of the certificate. 
     * @return SignatureAlgorithm Signature algorithm of the certificate.
     */
    public String getSignatureAlgorithm() {
        return this.SignatureAlgorithm;
    }

    /**
     * Set Signature algorithm of the certificate.
     * @param SignatureAlgorithm Signature algorithm of the certificate.
     */
    public void setSignatureAlgorithm(String SignatureAlgorithm) {
        this.SignatureAlgorithm = SignatureAlgorithm;
    }

    /**
     * Get Expiration time of the certificate. 
     * @return NotAfter Expiration time of the certificate.
     */
    public String getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set Expiration time of the certificate.
     * @param NotAfter Expiration time of the certificate.
     */
    public void setNotAfter(String NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get Creation time of the certificate. 
     * @return NotBefore Creation time of the certificate.
     */
    public String getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set Creation time of the certificate.
     * @param NotBefore Creation time of the certificate.
     */
    public void setNotBefore(String NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get Certificate subject. 
     * @return Subject Certificate subject.
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Certificate subject.
     * @param Subject Certificate subject.
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get X509 certificate in PEM format. 
     * @return X509Certificate X509 certificate in PEM format.
     */
    public String getX509Certificate() {
        return this.X509Certificate;
    }

    /**
     * Set X509 certificate in PEM format.
     * @param X509Certificate X509 certificate in PEM format.
     */
    public void setX509Certificate(String X509Certificate) {
        this.X509Certificate = X509Certificate;
    }

    public SAMLIdPCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SAMLIdPCertificate(SAMLIdPCertificate source) {
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.SignatureAlgorithm != null) {
            this.SignatureAlgorithm = new String(source.SignatureAlgorithm);
        }
        if (source.NotAfter != null) {
            this.NotAfter = new String(source.NotAfter);
        }
        if (source.NotBefore != null) {
            this.NotBefore = new String(source.NotBefore);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.X509Certificate != null) {
            this.X509Certificate = new String(source.X509Certificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "SignatureAlgorithm", this.SignatureAlgorithm);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamSimple(map, prefix + "NotBefore", this.NotBefore);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "X509Certificate", this.X509Certificate);

    }
}

