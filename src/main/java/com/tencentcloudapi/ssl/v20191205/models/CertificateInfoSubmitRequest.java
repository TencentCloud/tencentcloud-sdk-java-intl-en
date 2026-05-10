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

public class CertificateInfoSubmitRequest extends AbstractModel {

    /**
    * Paid SSL certificate ID of materials to be submitted.	
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * This field is required. CSR generation method, value is:
-online: Tencent Cloud submits the filled parameter information to generate a CSR and private key, and by Tencent Cloud for encrypted storage.
-parse: Generate CSR and private key manually, and apply for a certificate by uploading CSR.
    */
    @SerializedName("GenCsrType")
    @Expose
    private String GenCsrType;

    /**
    * Common name for certificate binding. If an uploaded CSR is used, that domain name must match the common name resolved by the CSR.
    */
    @SerializedName("CertCommonName")
    @Expose
    private String CertCommonName;

    /**
    * Organization information type. Valid values:
1 (Personal): Only DV-type certificates can be set to 1. For personal-type certificates, organization information fields (Org, Admin, Tech) can be omitted.
2 (Company): All types of certificates can be set to 2. Pass organization information fields as needed.
    */
    @SerializedName("CompanyType")
    @Expose
    private Long CompanyType;

    /**
    * Company ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no company information is found, set this parameter to 0. If company information matching the current order exists, you can view the company ID via [DescribeCompanies](https://www.tencentcloud.com/document/product/400/90375?from_cn_redirect=1). If a company ID is provided, parameters starting with "Org" can be omitted.


    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certificates, not required for other types.
OTHERS
    */
    @SerializedName("OrgIdType")
    @Expose
    private String OrgIdType;

    /**
    * Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820

    */
    @SerializedName("OrgIdNumber")
    @Expose
    private String OrgIdNumber;

    /**
    * Document type of the manager. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types.
    */
    @SerializedName("AdminIdType")
    @Expose
    private String AdminIdType;

    /**
    * ID number of the manager. This field is required only for CFCA certificates, not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx
    */
    @SerializedName("AdminIdNumber")
    @Expose
    private String AdminIdNumber;

    /**
    * Contact person document type. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types.
    */
    @SerializedName("TechIdType")
    @Expose
    private String TechIdType;

    /**
    * ID number of the contact person. This field is required only for CFCA certs and not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx
    */
    @SerializedName("TechIdNumber")
    @Expose
    private String TechIdNumber;

    /**
    * Uploaded CSR content.
If GenCsrType is parse, this field is required.
    */
    @SerializedName("Csr")
    @Expose
    private String Csr;

    /**
    * Other domains bound to the certificate. No need to provide for single domain or wildcard certificates. Required for multi-domain names and multiple wildcard certificates.
    */
    @SerializedName("DnsNames")
    @Expose
    private String [] DnsNames;

    /**
    * Private key password. Currently used only when generating certs in jks or pfx format; private key certificates in other formats are unencrypted.	
    */
    @SerializedName("KeyPass")
    @Expose
    private String KeyPass;

    /**
    * Company name. This field is required if CompanyId or ManagerId is not provided.
    */
    @SerializedName("OrgOrganization")
    @Expose
    private String OrgOrganization;

    /**
    * Department name. If not passing CompanyId or ManagerId, this field is required.
    */
    @SerializedName("OrgDivision")
    @Expose
    private String OrgDivision;

    /**
    * Company detailed address. If not pass CompanyId or ManagerId, this field is required.
    */
    @SerializedName("OrgAddress")
    @Expose
    private String OrgAddress;

    /**
    * Country/region name, for example China: CN. If not passing CompanyId or ManagerId, this field is required.
    */
    @SerializedName("OrgCountry")
    @Expose
    private String OrgCountry;

    /**
    * Located city. If not pass CompanyId or ManagerId, this field is required.
    */
    @SerializedName("OrgCity")
    @Expose
    private String OrgCity;

    /**
    * Province where the company is located. If not passing CompanyId or ManagerId, this field is required.
    */
    @SerializedName("OrgRegion")
    @Expose
    private String OrgRegion;

    /**
    * Area code of the company. If not passing CompanyId or ManagerId, this field is required.
For example: 021. Pass 86 as the mobile number.
    */
    @SerializedName("OrgPhoneArea")
    @Expose
    private String OrgPhoneArea;

    /**
    * Company number. If CompanyId or ManagerId is not provided, this field is required.
    */
    @SerializedName("OrgPhoneNumber")
    @Expose
    private String OrgPhoneNumber;

    /**
    * Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual addition of domain name FILE verification. Users are advised to manually add a specified path FILE in the root directory of the domain site to perform FILE verification. Either http or https passing is sufficient. The domain site must be accessible by overseas certificate authorities. The specific access allowlist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * Manage name. If not passing ManagerId, this field is required.
    */
    @SerializedName("AdminFirstName")
    @Expose
    private String AdminFirstName;

    /**
    * Manager name. If not, this field is required when ManagerId is not passed.
    */
    @SerializedName("AdminLastName")
    @Expose
    private String AdminLastName;

    /**
    * Manager mobile number. If not passing ManagerId, this field is required.
    */
    @SerializedName("AdminPhone")
    @Expose
    private String AdminPhone;

    /**
    * Manager email address. If not passing ManagerId, this field is required.
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * Manager position. If not passing ManagerId, this field is required.
    */
    @SerializedName("AdminTitle")
    @Expose
    private String AdminTitle;

    /**
    * Contact name. If not passing ManagerId, this field is required.
    */
    @SerializedName("TechFirstName")
    @Expose
    private String TechFirstName;

    /**
    * Last name of the contact. If not, this field is required when ManagerId is not passed.
    */
    @SerializedName("TechLastName")
    @Expose
    private String TechLastName;

    /**
    * Contact email address. This field is required when CompanyType is 1.
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * Whether to enable auto-renewal: 0, not enabled; 1, enabled; defaults to 0.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Key pair parameters. RSA supports 2048 and 4096. ECC is only supported for prime256v1. This parameter is required when the CSR generation method is online.

    */
    @SerializedName("CsrKeyParameter")
    @Expose
    private String CsrKeyParameter;

    /**
    * Encryption algorithm, value is ECC or RSA, defaults to RSA. This parameter is required when CSR generation method is online.
    */
    @SerializedName("CsrEncryptAlgo")
    @Expose
    private String CsrEncryptAlgo;

    /**
    * Manager ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no administrator information is found, pass 0 for this parameter. If administrator information exists that meets the current order, the manager ID can be selected based on [DescribeManagers](https://www.tencentcloud.com/document/product/400/52672?from_cn_redirect=1). If the manager ID is passed, parameters beginning with Org, Admin, or Tech can be omitted. The manager ID includes company information.

    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
    * Contact phone. If not passing ManagerId, this field is required.
    */
    @SerializedName("TechPhone")
    @Expose
    private String TechPhone;

    /**
    * contact email
    */
    @SerializedName("TechEmail")
    @Expose
    private String TechEmail;

    /**
    * Contact person position. If not passing ManagerId, this field is required.
    */
    @SerializedName("TechTitle")
    @Expose
    private String TechTitle;

    /**
    * Certificate type
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Valid only for Dnspod series certs. ca organization kind can be sectigo and digicert.
    */
    @SerializedName("CaType")
    @Expose
    private String CaType;

    /**
    * signature algorithm
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
    * Whether to use intersect root certificate
    */
    @SerializedName("UseCrossSignRoot")
    @Expose
    private Boolean UseCrossSignRoot;

    /**
     * Get Paid SSL certificate ID of materials to be submitted.	 
     * @return CertId Paid SSL certificate ID of materials to be submitted.	
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Paid SSL certificate ID of materials to be submitted.	
     * @param CertId Paid SSL certificate ID of materials to be submitted.	
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get This field is required. CSR generation method, value is:
-online: Tencent Cloud submits the filled parameter information to generate a CSR and private key, and by Tencent Cloud for encrypted storage.
-parse: Generate CSR and private key manually, and apply for a certificate by uploading CSR. 
     * @return GenCsrType This field is required. CSR generation method, value is:
-online: Tencent Cloud submits the filled parameter information to generate a CSR and private key, and by Tencent Cloud for encrypted storage.
-parse: Generate CSR and private key manually, and apply for a certificate by uploading CSR.
     */
    public String getGenCsrType() {
        return this.GenCsrType;
    }

    /**
     * Set This field is required. CSR generation method, value is:
-online: Tencent Cloud submits the filled parameter information to generate a CSR and private key, and by Tencent Cloud for encrypted storage.
-parse: Generate CSR and private key manually, and apply for a certificate by uploading CSR.
     * @param GenCsrType This field is required. CSR generation method, value is:
-online: Tencent Cloud submits the filled parameter information to generate a CSR and private key, and by Tencent Cloud for encrypted storage.
-parse: Generate CSR and private key manually, and apply for a certificate by uploading CSR.
     */
    public void setGenCsrType(String GenCsrType) {
        this.GenCsrType = GenCsrType;
    }

    /**
     * Get Common name for certificate binding. If an uploaded CSR is used, that domain name must match the common name resolved by the CSR. 
     * @return CertCommonName Common name for certificate binding. If an uploaded CSR is used, that domain name must match the common name resolved by the CSR.
     */
    public String getCertCommonName() {
        return this.CertCommonName;
    }

    /**
     * Set Common name for certificate binding. If an uploaded CSR is used, that domain name must match the common name resolved by the CSR.
     * @param CertCommonName Common name for certificate binding. If an uploaded CSR is used, that domain name must match the common name resolved by the CSR.
     */
    public void setCertCommonName(String CertCommonName) {
        this.CertCommonName = CertCommonName;
    }

    /**
     * Get Organization information type. Valid values:
1 (Personal): Only DV-type certificates can be set to 1. For personal-type certificates, organization information fields (Org, Admin, Tech) can be omitted.
2 (Company): All types of certificates can be set to 2. Pass organization information fields as needed. 
     * @return CompanyType Organization information type. Valid values:
1 (Personal): Only DV-type certificates can be set to 1. For personal-type certificates, organization information fields (Org, Admin, Tech) can be omitted.
2 (Company): All types of certificates can be set to 2. Pass organization information fields as needed.
     */
    public Long getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set Organization information type. Valid values:
1 (Personal): Only DV-type certificates can be set to 1. For personal-type certificates, organization information fields (Org, Admin, Tech) can be omitted.
2 (Company): All types of certificates can be set to 2. Pass organization information fields as needed.
     * @param CompanyType Organization information type. Valid values:
1 (Personal): Only DV-type certificates can be set to 1. For personal-type certificates, organization information fields (Org, Admin, Tech) can be omitted.
2 (Company): All types of certificates can be set to 2. Pass organization information fields as needed.
     */
    public void setCompanyType(Long CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get Company ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no company information is found, set this parameter to 0. If company information matching the current order exists, you can view the company ID via [DescribeCompanies](https://www.tencentcloud.com/document/product/400/90375?from_cn_redirect=1). If a company ID is provided, parameters starting with "Org" can be omitted.

 
     * @return CompanyId Company ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no company information is found, set this parameter to 0. If company information matching the current order exists, you can view the company ID via [DescribeCompanies](https://www.tencentcloud.com/document/product/400/90375?from_cn_redirect=1). If a company ID is provided, parameters starting with "Org" can be omitted.


     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set Company ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no company information is found, set this parameter to 0. If company information matching the current order exists, you can view the company ID via [DescribeCompanies](https://www.tencentcloud.com/document/product/400/90375?from_cn_redirect=1). If a company ID is provided, parameters starting with "Org" can be omitted.


     * @param CompanyId Company ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no company information is found, set this parameter to 0. If company information matching the current order exists, you can view the company ID via [DescribeCompanies](https://www.tencentcloud.com/document/product/400/90375?from_cn_redirect=1). If a company ID is provided, parameters starting with "Org" can be omitted.


     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certificates, not required for other types.
OTHERS 
     * @return OrgIdType Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certificates, not required for other types.
OTHERS
     */
    public String getOrgIdType() {
        return this.OrgIdType;
    }

    /**
     * Set Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certificates, not required for other types.
OTHERS
     * @param OrgIdType Company document type. Valid values:
TYDMZ (unified social credit code): This field is required only for CFCA certificates, not required for other types.
OTHERS
     */
    public void setOrgIdType(String OrgIdType) {
        this.OrgIdType = OrgIdType;
    }

    /**
     * Get Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820
 
     * @return OrgIdNumber Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820

     */
    public String getOrgIdNumber() {
        return this.OrgIdNumber;
    }

    /**
     * Set Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820

     * @param OrgIdNumber Company identification number, value ranges from...to...
TYDMZ (unified social credit code): 11532xxxxxxxx24820

     */
    public void setOrgIdNumber(String OrgIdNumber) {
        this.OrgIdNumber = OrgIdNumber;
    }

    /**
     * Get Document type of the manager. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types. 
     * @return AdminIdType Document type of the manager. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types.
     */
    public String getAdminIdType() {
        return this.AdminIdType;
    }

    /**
     * Set Document type of the manager. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types.
     * @param AdminIdType Document type of the manager. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types.
     */
    public void setAdminIdType(String AdminIdType) {
        this.AdminIdType = AdminIdType;
    }

    /**
     * Get ID number of the manager. This field is required only for CFCA certificates, not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx 
     * @return AdminIdNumber ID number of the manager. This field is required only for CFCA certificates, not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx
     */
    public String getAdminIdNumber() {
        return this.AdminIdNumber;
    }

    /**
     * Set ID number of the manager. This field is required only for CFCA certificates, not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx
     * @param AdminIdNumber ID number of the manager. This field is required only for CFCA certificates, not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx
     */
    public void setAdminIdNumber(String AdminIdNumber) {
        this.AdminIdNumber = AdminIdNumber;
    }

    /**
     * Get Contact person document type. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types. 
     * @return TechIdType Contact person document type. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types.
     */
    public String getTechIdType() {
        return this.TechIdType;
    }

    /**
     * Set Contact person document type. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types.
     * @param TechIdType Contact person document type. Valid values:
SFZ (ID card): This field is required only for CFCA certs, not required for other types.
HZ (passport): This field is required only for CFCA certs and not required for other types.
     */
    public void setTechIdType(String TechIdType) {
        this.TechIdType = TechIdType;
    }

    /**
     * Get ID number of the contact person. This field is required only for CFCA certs and not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx 
     * @return TechIdNumber ID number of the contact person. This field is required only for CFCA certs and not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx
     */
    public String getTechIdNumber() {
        return this.TechIdNumber;
    }

    /**
     * Set ID number of the contact person. This field is required only for CFCA certs and not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx
     * @param TechIdNumber ID number of the contact person. This field is required only for CFCA certs and not required for other types. Value ranges from...to...
ID card: 110000xxxxxxxx1242
HZ (Passport): EFxxxxxxx
     */
    public void setTechIdNumber(String TechIdNumber) {
        this.TechIdNumber = TechIdNumber;
    }

    /**
     * Get Uploaded CSR content.
If GenCsrType is parse, this field is required. 
     * @return Csr Uploaded CSR content.
If GenCsrType is parse, this field is required.
     */
    public String getCsr() {
        return this.Csr;
    }

    /**
     * Set Uploaded CSR content.
If GenCsrType is parse, this field is required.
     * @param Csr Uploaded CSR content.
If GenCsrType is parse, this field is required.
     */
    public void setCsr(String Csr) {
        this.Csr = Csr;
    }

    /**
     * Get Other domains bound to the certificate. No need to provide for single domain or wildcard certificates. Required for multi-domain names and multiple wildcard certificates. 
     * @return DnsNames Other domains bound to the certificate. No need to provide for single domain or wildcard certificates. Required for multi-domain names and multiple wildcard certificates.
     */
    public String [] getDnsNames() {
        return this.DnsNames;
    }

    /**
     * Set Other domains bound to the certificate. No need to provide for single domain or wildcard certificates. Required for multi-domain names and multiple wildcard certificates.
     * @param DnsNames Other domains bound to the certificate. No need to provide for single domain or wildcard certificates. Required for multi-domain names and multiple wildcard certificates.
     */
    public void setDnsNames(String [] DnsNames) {
        this.DnsNames = DnsNames;
    }

    /**
     * Get Private key password. Currently used only when generating certs in jks or pfx format; private key certificates in other formats are unencrypted.	 
     * @return KeyPass Private key password. Currently used only when generating certs in jks or pfx format; private key certificates in other formats are unencrypted.	
     */
    public String getKeyPass() {
        return this.KeyPass;
    }

    /**
     * Set Private key password. Currently used only when generating certs in jks or pfx format; private key certificates in other formats are unencrypted.	
     * @param KeyPass Private key password. Currently used only when generating certs in jks or pfx format; private key certificates in other formats are unencrypted.	
     */
    public void setKeyPass(String KeyPass) {
        this.KeyPass = KeyPass;
    }

    /**
     * Get Company name. This field is required if CompanyId or ManagerId is not provided. 
     * @return OrgOrganization Company name. This field is required if CompanyId or ManagerId is not provided.
     */
    public String getOrgOrganization() {
        return this.OrgOrganization;
    }

    /**
     * Set Company name. This field is required if CompanyId or ManagerId is not provided.
     * @param OrgOrganization Company name. This field is required if CompanyId or ManagerId is not provided.
     */
    public void setOrgOrganization(String OrgOrganization) {
        this.OrgOrganization = OrgOrganization;
    }

    /**
     * Get Department name. If not passing CompanyId or ManagerId, this field is required. 
     * @return OrgDivision Department name. If not passing CompanyId or ManagerId, this field is required.
     */
    public String getOrgDivision() {
        return this.OrgDivision;
    }

    /**
     * Set Department name. If not passing CompanyId or ManagerId, this field is required.
     * @param OrgDivision Department name. If not passing CompanyId or ManagerId, this field is required.
     */
    public void setOrgDivision(String OrgDivision) {
        this.OrgDivision = OrgDivision;
    }

    /**
     * Get Company detailed address. If not pass CompanyId or ManagerId, this field is required. 
     * @return OrgAddress Company detailed address. If not pass CompanyId or ManagerId, this field is required.
     */
    public String getOrgAddress() {
        return this.OrgAddress;
    }

    /**
     * Set Company detailed address. If not pass CompanyId or ManagerId, this field is required.
     * @param OrgAddress Company detailed address. If not pass CompanyId or ManagerId, this field is required.
     */
    public void setOrgAddress(String OrgAddress) {
        this.OrgAddress = OrgAddress;
    }

    /**
     * Get Country/region name, for example China: CN. If not passing CompanyId or ManagerId, this field is required. 
     * @return OrgCountry Country/region name, for example China: CN. If not passing CompanyId or ManagerId, this field is required.
     */
    public String getOrgCountry() {
        return this.OrgCountry;
    }

    /**
     * Set Country/region name, for example China: CN. If not passing CompanyId or ManagerId, this field is required.
     * @param OrgCountry Country/region name, for example China: CN. If not passing CompanyId or ManagerId, this field is required.
     */
    public void setOrgCountry(String OrgCountry) {
        this.OrgCountry = OrgCountry;
    }

    /**
     * Get Located city. If not pass CompanyId or ManagerId, this field is required. 
     * @return OrgCity Located city. If not pass CompanyId or ManagerId, this field is required.
     */
    public String getOrgCity() {
        return this.OrgCity;
    }

    /**
     * Set Located city. If not pass CompanyId or ManagerId, this field is required.
     * @param OrgCity Located city. If not pass CompanyId or ManagerId, this field is required.
     */
    public void setOrgCity(String OrgCity) {
        this.OrgCity = OrgCity;
    }

    /**
     * Get Province where the company is located. If not passing CompanyId or ManagerId, this field is required. 
     * @return OrgRegion Province where the company is located. If not passing CompanyId or ManagerId, this field is required.
     */
    public String getOrgRegion() {
        return this.OrgRegion;
    }

    /**
     * Set Province where the company is located. If not passing CompanyId or ManagerId, this field is required.
     * @param OrgRegion Province where the company is located. If not passing CompanyId or ManagerId, this field is required.
     */
    public void setOrgRegion(String OrgRegion) {
        this.OrgRegion = OrgRegion;
    }

    /**
     * Get Area code of the company. If not passing CompanyId or ManagerId, this field is required.
For example: 021. Pass 86 as the mobile number. 
     * @return OrgPhoneArea Area code of the company. If not passing CompanyId or ManagerId, this field is required.
For example: 021. Pass 86 as the mobile number.
     */
    public String getOrgPhoneArea() {
        return this.OrgPhoneArea;
    }

    /**
     * Set Area code of the company. If not passing CompanyId or ManagerId, this field is required.
For example: 021. Pass 86 as the mobile number.
     * @param OrgPhoneArea Area code of the company. If not passing CompanyId or ManagerId, this field is required.
For example: 021. Pass 86 as the mobile number.
     */
    public void setOrgPhoneArea(String OrgPhoneArea) {
        this.OrgPhoneArea = OrgPhoneArea;
    }

    /**
     * Get Company number. If CompanyId or ManagerId is not provided, this field is required. 
     * @return OrgPhoneNumber Company number. If CompanyId or ManagerId is not provided, this field is required.
     */
    public String getOrgPhoneNumber() {
        return this.OrgPhoneNumber;
    }

    /**
     * Set Company number. If CompanyId or ManagerId is not provided, this field is required.
     * @param OrgPhoneNumber Company number. If CompanyId or ManagerId is not provided, this field is required.
     */
    public void setOrgPhoneNumber(String OrgPhoneNumber) {
        this.OrgPhoneNumber = OrgPhoneNumber;
    }

    /**
     * Get Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual addition of domain name FILE verification. Users are advised to manually add a specified path FILE in the root directory of the domain site to perform FILE verification. Either http or https passing is sufficient. The domain site must be accessible by overseas certificate authorities. The specific access allowlist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217. 
     * @return VerifyType Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual addition of domain name FILE verification. Users are advised to manually add a specified path FILE in the root directory of the domain site to perform FILE verification. Either http or https passing is sufficient. The domain site must be accessible by overseas certificate authorities. The specific access allowlist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual addition of domain name FILE verification. Users are advised to manually add a specified path FILE in the root directory of the domain site to perform FILE verification. Either http or https passing is sufficient. The domain site must be accessible by overseas certificate authorities. The specific access allowlist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     * @param VerifyType Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual addition of domain name FILE verification. Users are advised to manually add a specified path FILE in the root directory of the domain site to perform FILE verification. Either http or https passing is sufficient. The domain site must be accessible by overseas certificate authorities. The specific access allowlist is: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get Manage name. If not passing ManagerId, this field is required. 
     * @return AdminFirstName Manage name. If not passing ManagerId, this field is required.
     */
    public String getAdminFirstName() {
        return this.AdminFirstName;
    }

    /**
     * Set Manage name. If not passing ManagerId, this field is required.
     * @param AdminFirstName Manage name. If not passing ManagerId, this field is required.
     */
    public void setAdminFirstName(String AdminFirstName) {
        this.AdminFirstName = AdminFirstName;
    }

    /**
     * Get Manager name. If not, this field is required when ManagerId is not passed. 
     * @return AdminLastName Manager name. If not, this field is required when ManagerId is not passed.
     */
    public String getAdminLastName() {
        return this.AdminLastName;
    }

    /**
     * Set Manager name. If not, this field is required when ManagerId is not passed.
     * @param AdminLastName Manager name. If not, this field is required when ManagerId is not passed.
     */
    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    /**
     * Get Manager mobile number. If not passing ManagerId, this field is required. 
     * @return AdminPhone Manager mobile number. If not passing ManagerId, this field is required.
     */
    public String getAdminPhone() {
        return this.AdminPhone;
    }

    /**
     * Set Manager mobile number. If not passing ManagerId, this field is required.
     * @param AdminPhone Manager mobile number. If not passing ManagerId, this field is required.
     */
    public void setAdminPhone(String AdminPhone) {
        this.AdminPhone = AdminPhone;
    }

    /**
     * Get Manager email address. If not passing ManagerId, this field is required. 
     * @return AdminEmail Manager email address. If not passing ManagerId, this field is required.
     */
    public String getAdminEmail() {
        return this.AdminEmail;
    }

    /**
     * Set Manager email address. If not passing ManagerId, this field is required.
     * @param AdminEmail Manager email address. If not passing ManagerId, this field is required.
     */
    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    /**
     * Get Manager position. If not passing ManagerId, this field is required. 
     * @return AdminTitle Manager position. If not passing ManagerId, this field is required.
     */
    public String getAdminTitle() {
        return this.AdminTitle;
    }

    /**
     * Set Manager position. If not passing ManagerId, this field is required.
     * @param AdminTitle Manager position. If not passing ManagerId, this field is required.
     */
    public void setAdminTitle(String AdminTitle) {
        this.AdminTitle = AdminTitle;
    }

    /**
     * Get Contact name. If not passing ManagerId, this field is required. 
     * @return TechFirstName Contact name. If not passing ManagerId, this field is required.
     */
    public String getTechFirstName() {
        return this.TechFirstName;
    }

    /**
     * Set Contact name. If not passing ManagerId, this field is required.
     * @param TechFirstName Contact name. If not passing ManagerId, this field is required.
     */
    public void setTechFirstName(String TechFirstName) {
        this.TechFirstName = TechFirstName;
    }

    /**
     * Get Last name of the contact. If not, this field is required when ManagerId is not passed. 
     * @return TechLastName Last name of the contact. If not, this field is required when ManagerId is not passed.
     */
    public String getTechLastName() {
        return this.TechLastName;
    }

    /**
     * Set Last name of the contact. If not, this field is required when ManagerId is not passed.
     * @param TechLastName Last name of the contact. If not, this field is required when ManagerId is not passed.
     */
    public void setTechLastName(String TechLastName) {
        this.TechLastName = TechLastName;
    }

    /**
     * Get Contact email address. This field is required when CompanyType is 1. 
     * @return ContactEmail Contact email address. This field is required when CompanyType is 1.
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set Contact email address. This field is required when CompanyType is 1.
     * @param ContactEmail Contact email address. This field is required when CompanyType is 1.
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get Whether to enable auto-renewal: 0, not enabled; 1, enabled; defaults to 0. 
     * @return AutoRenewFlag Whether to enable auto-renewal: 0, not enabled; 1, enabled; defaults to 0.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether to enable auto-renewal: 0, not enabled; 1, enabled; defaults to 0.
     * @param AutoRenewFlag Whether to enable auto-renewal: 0, not enabled; 1, enabled; defaults to 0.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Key pair parameters. RSA supports 2048 and 4096. ECC is only supported for prime256v1. This parameter is required when the CSR generation method is online.
 
     * @return CsrKeyParameter Key pair parameters. RSA supports 2048 and 4096. ECC is only supported for prime256v1. This parameter is required when the CSR generation method is online.

     */
    public String getCsrKeyParameter() {
        return this.CsrKeyParameter;
    }

    /**
     * Set Key pair parameters. RSA supports 2048 and 4096. ECC is only supported for prime256v1. This parameter is required when the CSR generation method is online.

     * @param CsrKeyParameter Key pair parameters. RSA supports 2048 and 4096. ECC is only supported for prime256v1. This parameter is required when the CSR generation method is online.

     */
    public void setCsrKeyParameter(String CsrKeyParameter) {
        this.CsrKeyParameter = CsrKeyParameter;
    }

    /**
     * Get Encryption algorithm, value is ECC or RSA, defaults to RSA. This parameter is required when CSR generation method is online. 
     * @return CsrEncryptAlgo Encryption algorithm, value is ECC or RSA, defaults to RSA. This parameter is required when CSR generation method is online.
     */
    public String getCsrEncryptAlgo() {
        return this.CsrEncryptAlgo;
    }

    /**
     * Set Encryption algorithm, value is ECC or RSA, defaults to RSA. This parameter is required when CSR generation method is online.
     * @param CsrEncryptAlgo Encryption algorithm, value is ECC or RSA, defaults to RSA. This parameter is required when CSR generation method is online.
     */
    public void setCsrEncryptAlgo(String CsrEncryptAlgo) {
        this.CsrEncryptAlgo = CsrEncryptAlgo;
    }

    /**
     * Get Manager ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no administrator information is found, pass 0 for this parameter. If administrator information exists that meets the current order, the manager ID can be selected based on [DescribeManagers](https://www.tencentcloud.com/document/product/400/52672?from_cn_redirect=1). If the manager ID is passed, parameters beginning with Org, Admin, or Tech can be omitted. The manager ID includes company information.
 
     * @return ManagerId Manager ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no administrator information is found, pass 0 for this parameter. If administrator information exists that meets the current order, the manager ID can be selected based on [DescribeManagers](https://www.tencentcloud.com/document/product/400/52672?from_cn_redirect=1). If the manager ID is passed, parameters beginning with Org, Admin, or Tech can be omitted. The manager ID includes company information.

     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set Manager ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no administrator information is found, pass 0 for this parameter. If administrator information exists that meets the current order, the manager ID can be selected based on [DescribeManagers](https://www.tencentcloud.com/document/product/400/52672?from_cn_redirect=1). If the manager ID is passed, parameters beginning with Org, Admin, or Tech can be omitted. The manager ID includes company information.

     * @param ManagerId Manager ID can be viewed in the [Tencent Cloud Console](https://console.cloud.tencent.com/ssl/info). If no administrator information is found, pass 0 for this parameter. If administrator information exists that meets the current order, the manager ID can be selected based on [DescribeManagers](https://www.tencentcloud.com/document/product/400/52672?from_cn_redirect=1). If the manager ID is passed, parameters beginning with Org, Admin, or Tech can be omitted. The manager ID includes company information.

     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get Contact phone. If not passing ManagerId, this field is required. 
     * @return TechPhone Contact phone. If not passing ManagerId, this field is required.
     */
    public String getTechPhone() {
        return this.TechPhone;
    }

    /**
     * Set Contact phone. If not passing ManagerId, this field is required.
     * @param TechPhone Contact phone. If not passing ManagerId, this field is required.
     */
    public void setTechPhone(String TechPhone) {
        this.TechPhone = TechPhone;
    }

    /**
     * Get contact email 
     * @return TechEmail contact email
     */
    public String getTechEmail() {
        return this.TechEmail;
    }

    /**
     * Set contact email
     * @param TechEmail contact email
     */
    public void setTechEmail(String TechEmail) {
        this.TechEmail = TechEmail;
    }

    /**
     * Get Contact person position. If not passing ManagerId, this field is required. 
     * @return TechTitle Contact person position. If not passing ManagerId, this field is required.
     */
    public String getTechTitle() {
        return this.TechTitle;
    }

    /**
     * Set Contact person position. If not passing ManagerId, this field is required.
     * @param TechTitle Contact person position. If not passing ManagerId, this field is required.
     */
    public void setTechTitle(String TechTitle) {
        this.TechTitle = TechTitle;
    }

    /**
     * Get Certificate type 
     * @return Type Certificate type
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Certificate type
     * @param Type Certificate type
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Valid only for Dnspod series certs. ca organization kind can be sectigo and digicert. 
     * @return CaType Valid only for Dnspod series certs. ca organization kind can be sectigo and digicert.
     */
    public String getCaType() {
        return this.CaType;
    }

    /**
     * Set Valid only for Dnspod series certs. ca organization kind can be sectigo and digicert.
     * @param CaType Valid only for Dnspod series certs. ca organization kind can be sectigo and digicert.
     */
    public void setCaType(String CaType) {
        this.CaType = CaType;
    }

    /**
     * Get signature algorithm 
     * @return SignAlgo signature algorithm
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set signature algorithm
     * @param SignAlgo signature algorithm
     */
    public void setSignAlgo(String SignAlgo) {
        this.SignAlgo = SignAlgo;
    }

    /**
     * Get Whether to use intersect root certificate 
     * @return UseCrossSignRoot Whether to use intersect root certificate
     */
    public Boolean getUseCrossSignRoot() {
        return this.UseCrossSignRoot;
    }

    /**
     * Set Whether to use intersect root certificate
     * @param UseCrossSignRoot Whether to use intersect root certificate
     */
    public void setUseCrossSignRoot(Boolean UseCrossSignRoot) {
        this.UseCrossSignRoot = UseCrossSignRoot;
    }

    public CertificateInfoSubmitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfoSubmitRequest(CertificateInfoSubmitRequest source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.GenCsrType != null) {
            this.GenCsrType = new String(source.GenCsrType);
        }
        if (source.CertCommonName != null) {
            this.CertCommonName = new String(source.CertCommonName);
        }
        if (source.CompanyType != null) {
            this.CompanyType = new Long(source.CompanyType);
        }
        if (source.CompanyId != null) {
            this.CompanyId = new String(source.CompanyId);
        }
        if (source.OrgIdType != null) {
            this.OrgIdType = new String(source.OrgIdType);
        }
        if (source.OrgIdNumber != null) {
            this.OrgIdNumber = new String(source.OrgIdNumber);
        }
        if (source.AdminIdType != null) {
            this.AdminIdType = new String(source.AdminIdType);
        }
        if (source.AdminIdNumber != null) {
            this.AdminIdNumber = new String(source.AdminIdNumber);
        }
        if (source.TechIdType != null) {
            this.TechIdType = new String(source.TechIdType);
        }
        if (source.TechIdNumber != null) {
            this.TechIdNumber = new String(source.TechIdNumber);
        }
        if (source.Csr != null) {
            this.Csr = new String(source.Csr);
        }
        if (source.DnsNames != null) {
            this.DnsNames = new String[source.DnsNames.length];
            for (int i = 0; i < source.DnsNames.length; i++) {
                this.DnsNames[i] = new String(source.DnsNames[i]);
            }
        }
        if (source.KeyPass != null) {
            this.KeyPass = new String(source.KeyPass);
        }
        if (source.OrgOrganization != null) {
            this.OrgOrganization = new String(source.OrgOrganization);
        }
        if (source.OrgDivision != null) {
            this.OrgDivision = new String(source.OrgDivision);
        }
        if (source.OrgAddress != null) {
            this.OrgAddress = new String(source.OrgAddress);
        }
        if (source.OrgCountry != null) {
            this.OrgCountry = new String(source.OrgCountry);
        }
        if (source.OrgCity != null) {
            this.OrgCity = new String(source.OrgCity);
        }
        if (source.OrgRegion != null) {
            this.OrgRegion = new String(source.OrgRegion);
        }
        if (source.OrgPhoneArea != null) {
            this.OrgPhoneArea = new String(source.OrgPhoneArea);
        }
        if (source.OrgPhoneNumber != null) {
            this.OrgPhoneNumber = new String(source.OrgPhoneNumber);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.AdminFirstName != null) {
            this.AdminFirstName = new String(source.AdminFirstName);
        }
        if (source.AdminLastName != null) {
            this.AdminLastName = new String(source.AdminLastName);
        }
        if (source.AdminPhone != null) {
            this.AdminPhone = new String(source.AdminPhone);
        }
        if (source.AdminEmail != null) {
            this.AdminEmail = new String(source.AdminEmail);
        }
        if (source.AdminTitle != null) {
            this.AdminTitle = new String(source.AdminTitle);
        }
        if (source.TechFirstName != null) {
            this.TechFirstName = new String(source.TechFirstName);
        }
        if (source.TechLastName != null) {
            this.TechLastName = new String(source.TechLastName);
        }
        if (source.ContactEmail != null) {
            this.ContactEmail = new String(source.ContactEmail);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.CsrKeyParameter != null) {
            this.CsrKeyParameter = new String(source.CsrKeyParameter);
        }
        if (source.CsrEncryptAlgo != null) {
            this.CsrEncryptAlgo = new String(source.CsrEncryptAlgo);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new String(source.ManagerId);
        }
        if (source.TechPhone != null) {
            this.TechPhone = new String(source.TechPhone);
        }
        if (source.TechEmail != null) {
            this.TechEmail = new String(source.TechEmail);
        }
        if (source.TechTitle != null) {
            this.TechTitle = new String(source.TechTitle);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CaType != null) {
            this.CaType = new String(source.CaType);
        }
        if (source.SignAlgo != null) {
            this.SignAlgo = new String(source.SignAlgo);
        }
        if (source.UseCrossSignRoot != null) {
            this.UseCrossSignRoot = new Boolean(source.UseCrossSignRoot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "GenCsrType", this.GenCsrType);
        this.setParamSimple(map, prefix + "CertCommonName", this.CertCommonName);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "OrgIdType", this.OrgIdType);
        this.setParamSimple(map, prefix + "OrgIdNumber", this.OrgIdNumber);
        this.setParamSimple(map, prefix + "AdminIdType", this.AdminIdType);
        this.setParamSimple(map, prefix + "AdminIdNumber", this.AdminIdNumber);
        this.setParamSimple(map, prefix + "TechIdType", this.TechIdType);
        this.setParamSimple(map, prefix + "TechIdNumber", this.TechIdNumber);
        this.setParamSimple(map, prefix + "Csr", this.Csr);
        this.setParamArraySimple(map, prefix + "DnsNames.", this.DnsNames);
        this.setParamSimple(map, prefix + "KeyPass", this.KeyPass);
        this.setParamSimple(map, prefix + "OrgOrganization", this.OrgOrganization);
        this.setParamSimple(map, prefix + "OrgDivision", this.OrgDivision);
        this.setParamSimple(map, prefix + "OrgAddress", this.OrgAddress);
        this.setParamSimple(map, prefix + "OrgCountry", this.OrgCountry);
        this.setParamSimple(map, prefix + "OrgCity", this.OrgCity);
        this.setParamSimple(map, prefix + "OrgRegion", this.OrgRegion);
        this.setParamSimple(map, prefix + "OrgPhoneArea", this.OrgPhoneArea);
        this.setParamSimple(map, prefix + "OrgPhoneNumber", this.OrgPhoneNumber);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "AdminFirstName", this.AdminFirstName);
        this.setParamSimple(map, prefix + "AdminLastName", this.AdminLastName);
        this.setParamSimple(map, prefix + "AdminPhone", this.AdminPhone);
        this.setParamSimple(map, prefix + "AdminEmail", this.AdminEmail);
        this.setParamSimple(map, prefix + "AdminTitle", this.AdminTitle);
        this.setParamSimple(map, prefix + "TechFirstName", this.TechFirstName);
        this.setParamSimple(map, prefix + "TechLastName", this.TechLastName);
        this.setParamSimple(map, prefix + "ContactEmail", this.ContactEmail);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CsrKeyParameter", this.CsrKeyParameter);
        this.setParamSimple(map, prefix + "CsrEncryptAlgo", this.CsrEncryptAlgo);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "TechPhone", this.TechPhone);
        this.setParamSimple(map, prefix + "TechEmail", this.TechEmail);
        this.setParamSimple(map, prefix + "TechTitle", this.TechTitle);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CaType", this.CaType);
        this.setParamSimple(map, prefix + "SignAlgo", this.SignAlgo);
        this.setParamSimple(map, prefix + "UseCrossSignRoot", this.UseCrossSignRoot);

    }
}

