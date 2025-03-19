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
    * Certificate domain validation methods:

DNS_AUTO: Automatically add domain DNS validation. Requires the user's domain to be hosted on 'Cloud DNS' and associated with the same Tencent Cloud account as the certificate application.

DNS: Manually add domain DNS validation. Requires the user to manually add the validation value at their domain's DNS service provider.

FILE: Manually add domain file validation. Requires the user to manually add a specified path file in the root directory of the domain site for file validation. Either HTTP or HTTPS validation will suffice; the domain site must be accessible by overseas CA institutions. The specific access whitelist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
    */
    @SerializedName("DvAuthMethod")
    @Expose
    private String DvAuthMethod;

    /**
    * The domain bound to the certificate.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The project ID associated with the certificate. Default is 0 (default project)
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Certificate type, optional, currently only type 83 is supported. 83 = trustasia c1 dv free.
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * The email associated with the certificate order, By default, it uses the Tencent Cloud account email. If it does not exist, a fixed email address will be used.
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * The mobile phone number associated with the certificate. If it does not exist, a fixed mobile phone number will be used.
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
    * Certificate valid period, 3 months by default, currently only 3 months is supported.
    */
    @SerializedName("ValidityPeriod")
    @Expose
    private String ValidityPeriod;

    /**
    * Encryption algorithm, values can be ECC or RSA, default is RSA.
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
    * Private key password, currently only used when generating jks, pfx format certificates; private key certificates of other formats are not encrypted.
    */
    @SerializedName("CsrKeyPassword")
    @Expose
    private String CsrKeyPassword;

    /**
    * Certificate alias.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Old certificate id, used for certificate renewal (the certificate valid period is within 30 days and not expired), a renewal relationship will be established, which can be hosted; not providing it means applying for a new certificate.
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * Benefit package ID, used for free certificate expansion package, the free certificate expansion package has been discontinued.
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Whether to delete the automatic domain name verification record after issuance, which is fasle by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type.
    */
    @SerializedName("DeleteDnsAutoRecord")
    @Expose
    private Boolean DeleteDnsAutoRecord;

    /**
    * Other domains bound to the certificate, to be opened. This parameter is not currently supported.
    */
    @SerializedName("DnsNames")
    @Expose
    private String [] DnsNames;

    /**
     * Get Certificate domain validation methods:

DNS_AUTO: Automatically add domain DNS validation. Requires the user's domain to be hosted on 'Cloud DNS' and associated with the same Tencent Cloud account as the certificate application.

DNS: Manually add domain DNS validation. Requires the user to manually add the validation value at their domain's DNS service provider.

FILE: Manually add domain file validation. Requires the user to manually add a specified path file in the root directory of the domain site for file validation. Either HTTP or HTTPS validation will suffice; the domain site must be accessible by overseas CA institutions. The specific access whitelist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217. 
     * @return DvAuthMethod Certificate domain validation methods:

DNS_AUTO: Automatically add domain DNS validation. Requires the user's domain to be hosted on 'Cloud DNS' and associated with the same Tencent Cloud account as the certificate application.

DNS: Manually add domain DNS validation. Requires the user to manually add the validation value at their domain's DNS service provider.

FILE: Manually add domain file validation. Requires the user to manually add a specified path file in the root directory of the domain site for file validation. Either HTTP or HTTPS validation will suffice; the domain site must be accessible by overseas CA institutions. The specific access whitelist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     */
    public String getDvAuthMethod() {
        return this.DvAuthMethod;
    }

    /**
     * Set Certificate domain validation methods:

DNS_AUTO: Automatically add domain DNS validation. Requires the user's domain to be hosted on 'Cloud DNS' and associated with the same Tencent Cloud account as the certificate application.

DNS: Manually add domain DNS validation. Requires the user to manually add the validation value at their domain's DNS service provider.

FILE: Manually add domain file validation. Requires the user to manually add a specified path file in the root directory of the domain site for file validation. Either HTTP or HTTPS validation will suffice; the domain site must be accessible by overseas CA institutions. The specific access whitelist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     * @param DvAuthMethod Certificate domain validation methods:

DNS_AUTO: Automatically add domain DNS validation. Requires the user's domain to be hosted on 'Cloud DNS' and associated with the same Tencent Cloud account as the certificate application.

DNS: Manually add domain DNS validation. Requires the user to manually add the validation value at their domain's DNS service provider.

FILE: Manually add domain file validation. Requires the user to manually add a specified path file in the root directory of the domain site for file validation. Either HTTP or HTTPS validation will suffice; the domain site must be accessible by overseas CA institutions. The specific access whitelist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     */
    public void setDvAuthMethod(String DvAuthMethod) {
        this.DvAuthMethod = DvAuthMethod;
    }

    /**
     * Get The domain bound to the certificate. 
     * @return DomainName The domain bound to the certificate.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The domain bound to the certificate.
     * @param DomainName The domain bound to the certificate.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The project ID associated with the certificate. Default is 0 (default project) 
     * @return ProjectId The project ID associated with the certificate. Default is 0 (default project)
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The project ID associated with the certificate. Default is 0 (default project)
     * @param ProjectId The project ID associated with the certificate. Default is 0 (default project)
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Certificate type, optional, currently only type 83 is supported. 83 = trustasia c1 dv free. 
     * @return PackageType Certificate type, optional, currently only type 83 is supported. 83 = trustasia c1 dv free.
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Certificate type, optional, currently only type 83 is supported. 83 = trustasia c1 dv free.
     * @param PackageType Certificate type, optional, currently only type 83 is supported. 83 = trustasia c1 dv free.
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get The email associated with the certificate order, By default, it uses the Tencent Cloud account email. If it does not exist, a fixed email address will be used. 
     * @return ContactEmail The email associated with the certificate order, By default, it uses the Tencent Cloud account email. If it does not exist, a fixed email address will be used.
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set The email associated with the certificate order, By default, it uses the Tencent Cloud account email. If it does not exist, a fixed email address will be used.
     * @param ContactEmail The email associated with the certificate order, By default, it uses the Tencent Cloud account email. If it does not exist, a fixed email address will be used.
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get The mobile phone number associated with the certificate. If it does not exist, a fixed mobile phone number will be used. 
     * @return ContactPhone The mobile phone number associated with the certificate. If it does not exist, a fixed mobile phone number will be used.
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set The mobile phone number associated with the certificate. If it does not exist, a fixed mobile phone number will be used.
     * @param ContactPhone The mobile phone number associated with the certificate. If it does not exist, a fixed mobile phone number will be used.
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    /**
     * Get Certificate valid period, 3 months by default, currently only 3 months is supported. 
     * @return ValidityPeriod Certificate valid period, 3 months by default, currently only 3 months is supported.
     */
    public String getValidityPeriod() {
        return this.ValidityPeriod;
    }

    /**
     * Set Certificate valid period, 3 months by default, currently only 3 months is supported.
     * @param ValidityPeriod Certificate valid period, 3 months by default, currently only 3 months is supported.
     */
    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    /**
     * Get Encryption algorithm, values can be ECC or RSA, default is RSA. 
     * @return CsrEncryptAlgo Encryption algorithm, values can be ECC or RSA, default is RSA.
     */
    public String getCsrEncryptAlgo() {
        return this.CsrEncryptAlgo;
    }

    /**
     * Set Encryption algorithm, values can be ECC or RSA, default is RSA.
     * @param CsrEncryptAlgo Encryption algorithm, values can be ECC or RSA, default is RSA.
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
     * Get Private key password, currently only used when generating jks, pfx format certificates; private key certificates of other formats are not encrypted. 
     * @return CsrKeyPassword Private key password, currently only used when generating jks, pfx format certificates; private key certificates of other formats are not encrypted.
     */
    public String getCsrKeyPassword() {
        return this.CsrKeyPassword;
    }

    /**
     * Set Private key password, currently only used when generating jks, pfx format certificates; private key certificates of other formats are not encrypted.
     * @param CsrKeyPassword Private key password, currently only used when generating jks, pfx format certificates; private key certificates of other formats are not encrypted.
     */
    public void setCsrKeyPassword(String CsrKeyPassword) {
        this.CsrKeyPassword = CsrKeyPassword;
    }

    /**
     * Get Certificate alias. 
     * @return Alias Certificate alias.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Certificate alias.
     * @param Alias Certificate alias.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Old certificate id, used for certificate renewal (the certificate valid period is within 30 days and not expired), a renewal relationship will be established, which can be hosted; not providing it means applying for a new certificate. 
     * @return OldCertificateId Old certificate id, used for certificate renewal (the certificate valid period is within 30 days and not expired), a renewal relationship will be established, which can be hosted; not providing it means applying for a new certificate.
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set Old certificate id, used for certificate renewal (the certificate valid period is within 30 days and not expired), a renewal relationship will be established, which can be hosted; not providing it means applying for a new certificate.
     * @param OldCertificateId Old certificate id, used for certificate renewal (the certificate valid period is within 30 days and not expired), a renewal relationship will be established, which can be hosted; not providing it means applying for a new certificate.
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get Benefit package ID, used for free certificate expansion package, the free certificate expansion package has been discontinued. 
     * @return PackageId Benefit package ID, used for free certificate expansion package, the free certificate expansion package has been discontinued.
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Benefit package ID, used for free certificate expansion package, the free certificate expansion package has been discontinued.
     * @param PackageId Benefit package ID, used for free certificate expansion package, the free certificate expansion package has been discontinued.
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Whether to delete the automatic domain name verification record after issuance, which is fasle by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type. 
     * @return DeleteDnsAutoRecord Whether to delete the automatic domain name verification record after issuance, which is fasle by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type.
     */
    public Boolean getDeleteDnsAutoRecord() {
        return this.DeleteDnsAutoRecord;
    }

    /**
     * Set Whether to delete the automatic domain name verification record after issuance, which is fasle by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type.
     * @param DeleteDnsAutoRecord Whether to delete the automatic domain name verification record after issuance, which is fasle by default. This parameter can be passed in only for domain names of the DNS_AUTO verification type.
     */
    public void setDeleteDnsAutoRecord(Boolean DeleteDnsAutoRecord) {
        this.DeleteDnsAutoRecord = DeleteDnsAutoRecord;
    }

    /**
     * Get Other domains bound to the certificate, to be opened. This parameter is not currently supported. 
     * @return DnsNames Other domains bound to the certificate, to be opened. This parameter is not currently supported.
     */
    public String [] getDnsNames() {
        return this.DnsNames;
    }

    /**
     * Set Other domains bound to the certificate, to be opened. This parameter is not currently supported.
     * @param DnsNames Other domains bound to the certificate, to be opened. This parameter is not currently supported.
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

