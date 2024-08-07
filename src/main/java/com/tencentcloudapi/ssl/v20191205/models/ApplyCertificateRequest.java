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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyCertificateRequest extends AbstractModel {

    /**
    * Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation.
    */
    @SerializedName("DvAuthMethod")
    @Expose
    private String DvAuthMethod;

    /**
    * Domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Certificate type. Currently, the only supported value is 2, which indicates TrustAsia TLS RSA CA.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Email address
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * Mobile number
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
    * Validity period. The default value is 12 months, which is the only supported value currently.
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * Encryption algorithm. RSA and ECC are supported.
    */
    @SerializedName("CsrEncryptAlgo")
    @Expose
    private String CsrEncryptAlgo;

    /**
    * Key pair parameters. RSA supports only 2048. ECC supports only prime256v1. When the encryption algorithm is set to ECC, this parameter is mandatory.
    */
    @SerializedName("CsrKeyParameter")
    @Expose
    private String CsrKeyParameter;

    /**
    * CSR encryption password
    */
    @SerializedName("CsrKeyPassword")
    @Expose
    private String CsrKeyPassword;

    /**
    * Alias
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Original certificate ID, which is used to apply for a new certificate.
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * Benefit package ID, which is used to expand the free certificate package
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Whether to delete the automatic domain name verification record after issuance, which is no by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type.
    */
    @SerializedName("DeleteDnsAutoRecord")
    @Expose
    private Boolean DeleteDnsAutoRecord;

    /**
    * 
    */
    @SerializedName("DnsNames")
    @Expose
    private String [] DnsNames;

    /**
     * Get Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation. 
     * @return DvAuthMethod Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation.
     */
    public String getDvAuthMethod() {
        return this.DvAuthMethod;
    }

    /**
     * Set Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation.
     * @param DvAuthMethod Validation type. `DNS_AUTO`: automatic DNS validation; `DNS`: manual DNS validation; `FILE`: file validation.
     */
    public void setDvAuthMethod(String DvAuthMethod) {
        this.DvAuthMethod = DvAuthMethod;
    }

    /**
     * Get Domain name 
     * @return DomainName Domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name
     * @param DomainName Domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Certificate type. Currently, the only supported value is 2, which indicates TrustAsia TLS RSA CA. 
     * @return PackageType Certificate type. Currently, the only supported value is 2, which indicates TrustAsia TLS RSA CA.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Certificate type. Currently, the only supported value is 2, which indicates TrustAsia TLS RSA CA.
     * @param PackageType Certificate type. Currently, the only supported value is 2, which indicates TrustAsia TLS RSA CA.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Email address 
     * @return ContactEmail Email address
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set Email address
     * @param ContactEmail Email address
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get Mobile number 
     * @return ContactPhone Mobile number
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set Mobile number
     * @param ContactPhone Mobile number
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    /**
     * Get Validity period. The default value is 12 months, which is the only supported value currently. 
     * @return ValidityPeriod Validity period. The default value is 12 months, which is the only supported value currently.
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set Validity period. The default value is 12 months, which is the only supported value currently.
     * @param ValidityPeriod Validity period. The default value is 12 months, which is the only supported value currently.
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get Encryption algorithm. RSA and ECC are supported. 
     * @return CsrEncryptAlgo Encryption algorithm. RSA and ECC are supported.
     */
    public String getCsrEncryptAlgo() {
        return this.CsrEncryptAlgo;
    }

    /**
     * Set Encryption algorithm. RSA and ECC are supported.
     * @param CsrEncryptAlgo Encryption algorithm. RSA and ECC are supported.
     */
    public void setCsrEncryptAlgo(String CsrEncryptAlgo) {
        this.CsrEncryptAlgo = CsrEncryptAlgo;
    }

    /**
     * Get Key pair parameters. RSA supports only 2048. ECC supports only prime256v1. When the encryption algorithm is set to ECC, this parameter is mandatory. 
     * @return CsrKeyParameter Key pair parameters. RSA supports only 2048. ECC supports only prime256v1. When the encryption algorithm is set to ECC, this parameter is mandatory.
     */
    public String getCsrKeyParameter() {
        return this.CsrKeyParameter;
    }

    /**
     * Set Key pair parameters. RSA supports only 2048. ECC supports only prime256v1. When the encryption algorithm is set to ECC, this parameter is mandatory.
     * @param CsrKeyParameter Key pair parameters. RSA supports only 2048. ECC supports only prime256v1. When the encryption algorithm is set to ECC, this parameter is mandatory.
     */
    public void setCsrKeyParameter(String CsrKeyParameter) {
        this.CsrKeyParameter = CsrKeyParameter;
    }

    /**
     * Get CSR encryption password 
     * @return CsrKeyPassword CSR encryption password
     */
    public String getCsrKeyPassword() {
        return this.CsrKeyPassword;
    }

    /**
     * Set CSR encryption password
     * @param CsrKeyPassword CSR encryption password
     */
    public void setCsrKeyPassword(String CsrKeyPassword) {
        this.CsrKeyPassword = CsrKeyPassword;
    }

    /**
     * Get Alias 
     * @return Alias Alias
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias
     * @param Alias Alias
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Original certificate ID, which is used to apply for a new certificate. 
     * @return OldCertificateId Original certificate ID, which is used to apply for a new certificate.
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set Original certificate ID, which is used to apply for a new certificate.
     * @param OldCertificateId Original certificate ID, which is used to apply for a new certificate.
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get Benefit package ID, which is used to expand the free certificate package 
     * @return PackageId Benefit package ID, which is used to expand the free certificate package
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Benefit package ID, which is used to expand the free certificate package
     * @param PackageId Benefit package ID, which is used to expand the free certificate package
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Whether to delete the automatic domain name verification record after issuance, which is no by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type. 
     * @return DeleteDnsAutoRecord Whether to delete the automatic domain name verification record after issuance, which is no by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type.
     */
    public Boolean getDeleteDnsAutoRecord() {
        return this.DeleteDnsAutoRecord;
    }

    /**
     * Set Whether to delete the automatic domain name verification record after issuance, which is no by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type.
     * @param DeleteDnsAutoRecord Whether to delete the automatic domain name verification record after issuance, which is no by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type.
     */
    public void setDeleteDnsAutoRecord(Boolean DeleteDnsAutoRecord) {
        this.DeleteDnsAutoRecord = DeleteDnsAutoRecord;
    }

    /**
     * Get  
     * @return DnsNames 
     */
    public String [] getDnsNames() {
        return this.DnsNames;
    }

    /**
     * Set 
     * @param DnsNames 
     */
    public void setDnsNames(String [] DnsNames) {
        this.DnsNames = DnsNames;
    }

    public ApplyCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyCertificateRequest(ApplyCertificateRequest source) {
        if (source.DvAuthMethod != null) {
            this.DvAuthMethod = new String(source.DvAuthMethod);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.ContactEmail != null) {
            this.ContactEmail = new String(source.ContactEmail);
        }
        if (source.ContactPhone != null) {
            this.ContactPhone = new String(source.ContactPhone);
        }
        if (source.ValidityPeriod != null) {
            this.ValidityPeriod = new String(source.ValidityPeriod);
        }
        if (source.CsrEncryptAlgo != null) {
            this.CsrEncryptAlgo = new String(source.CsrEncryptAlgo);
        }
        if (source.CsrKeyParameter != null) {
            this.CsrKeyParameter = new String(source.CsrKeyParameter);
        }
        if (source.CsrKeyPassword != null) {
            this.CsrKeyPassword = new String(source.CsrKeyPassword);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.DeleteDnsAutoRecord != null) {
            this.DeleteDnsAutoRecord = new Boolean(source.DeleteDnsAutoRecord);
        }
        if (source.DnsNames != null) {
            this.DnsNames = new String[source.DnsNames.length];
            for (int i = 0; i < source.DnsNames.length; i++) {
                this.DnsNames[i] = new String(source.DnsNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DvAuthMethod", this.DvAuthMethod);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ContactEmail", this.ContactEmail);
        this.setParamSimple(map, prefix + "ContactPhone", this.ContactPhone);
        this.setParamSimple(map, prefix + "ValidityPeriod", this.ValidityPeriod);
        this.setParamSimple(map, prefix + "CsrEncryptAlgo", this.CsrEncryptAlgo);
        this.setParamSimple(map, prefix + "CsrKeyParameter", this.CsrKeyParameter);
        this.setParamSimple(map, prefix + "CsrKeyPassword", this.CsrKeyPassword);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "DeleteDnsAutoRecord", this.DeleteDnsAutoRecord);
        this.setParamArraySimple(map, prefix + "DnsNames.", this.DnsNames);

    }
}

