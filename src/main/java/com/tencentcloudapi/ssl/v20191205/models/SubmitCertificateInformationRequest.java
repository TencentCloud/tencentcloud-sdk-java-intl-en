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

public class SubmitCertificateInformationRequest extends AbstractModel {

    /**
    * Paid certificate id of materials to be submitted.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * This field is required. Generation method of CSR, valid values are:
online: tencent cloud generates the CSR and private key based on the submitted parameter information and stores them encryptedly.
parse: generate the CSR and private key by itself, and apply for a certificate by uploading the CSR.
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * The content of the uploaded csr.
If CsrType is parse, this field is required.
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * The common name bound to the certificate. if a CSR is uploaded, the domain name must be consistent with the common name resolved from the CSR.
    */
    @SerializedName("CertificateDomain")
    @Expose
    private String CertificateDomain;

    /**
    * Other domain names bound to the certificate. not required for single domain and wildcard domain certificates. required for multiple domain names and multiple wildcard domain names.
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * Private key password, which is currently only used for the password when generating jks and pfx format certificates; other formats of private key certificates are not encrypted.	
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
    * This field is required. Company name.
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * This field is required.  Department name.
    */
    @SerializedName("OrganizationDivision")
    @Expose
    private String OrganizationDivision;

    /**
    * This field is required. Company's detailed address.
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * This field is required.Country name such as CN.
    */
    @SerializedName("OrganizationCountry")
    @Expose
    private String OrganizationCountry;

    /**
    * This field is required, which specifies the city where the company is located.
    */
    @SerializedName("OrganizationCity")
    @Expose
    private String OrganizationCity;

    /**
    * This field is required, specifying the province where the company is located.
    */
    @SerializedName("OrganizationRegion")
    @Expose
    private String OrganizationRegion;

    /**
    * Postal code of the organization
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * This field is required, the company's fixed-line phone area code.
    */
    @SerializedName("PhoneAreaCode")
    @Expose
    private String PhoneAreaCode;

    /**
    * This field is required, the company's landline number.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Certificate validation method. Validation types: DNS_AUTO = Automatic DNS validation (only supported for domains resolved by Tencent Cloud DNS with a normal resolution status), DNS = Manual DNS validation, FILE = File validation.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * This field is required, manager name.
    */
    @SerializedName("AdminFirstName")
    @Expose
    private String AdminFirstName;

    /**
    * This field is required, the manager's surname.
    */
    @SerializedName("AdminLastName")
    @Expose
    private String AdminLastName;

    /**
    * This field is required, the manager's mobile phone number.
    */
    @SerializedName("AdminPhoneNum")
    @Expose
    private String AdminPhoneNum;

    /**
    * This field is required, the manager's email address.
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * This field is required, the manager position.
    */
    @SerializedName("AdminPosition")
    @Expose
    private String AdminPosition;

    /**
    * This field is required, the contact person name.
    */
    @SerializedName("ContactFirstName")
    @Expose
    private String ContactFirstName;

    /**
    * This field is required, the contact person's surname.
    */
    @SerializedName("ContactLastName")
    @Expose
    private String ContactLastName;

    /**
    * This field is required, the contact person's email address.
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * This field is required, the contact person's mobile phone number.
    */
    @SerializedName("ContactNumber")
    @Expose
    private String ContactNumber;

    /**
    * This field is required, the contact person position.
    */
    @SerializedName("ContactPosition")
    @Expose
    private String ContactPosition;

    /**
    * Indicates whether it is a dv certificate. default value is false.
    */
    @SerializedName("IsDV")
    @Expose
    private Boolean IsDV;

    /**
     * Get Paid certificate id of materials to be submitted. 
     * @return CertificateId Paid certificate id of materials to be submitted.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Paid certificate id of materials to be submitted.
     * @param CertificateId Paid certificate id of materials to be submitted.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get This field is required. Generation method of CSR, valid values are:
online: tencent cloud generates the CSR and private key based on the submitted parameter information and stores them encryptedly.
parse: generate the CSR and private key by itself, and apply for a certificate by uploading the CSR. 
     * @return CsrType This field is required. Generation method of CSR, valid values are:
online: tencent cloud generates the CSR and private key based on the submitted parameter information and stores them encryptedly.
parse: generate the CSR and private key by itself, and apply for a certificate by uploading the CSR.
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set This field is required. Generation method of CSR, valid values are:
online: tencent cloud generates the CSR and private key based on the submitted parameter information and stores them encryptedly.
parse: generate the CSR and private key by itself, and apply for a certificate by uploading the CSR.
     * @param CsrType This field is required. Generation method of CSR, valid values are:
online: tencent cloud generates the CSR and private key based on the submitted parameter information and stores them encryptedly.
parse: generate the CSR and private key by itself, and apply for a certificate by uploading the CSR.
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get The content of the uploaded csr.
If CsrType is parse, this field is required. 
     * @return CsrContent The content of the uploaded csr.
If CsrType is parse, this field is required.
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set The content of the uploaded csr.
If CsrType is parse, this field is required.
     * @param CsrContent The content of the uploaded csr.
If CsrType is parse, this field is required.
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get The common name bound to the certificate. if a CSR is uploaded, the domain name must be consistent with the common name resolved from the CSR. 
     * @return CertificateDomain The common name bound to the certificate. if a CSR is uploaded, the domain name must be consistent with the common name resolved from the CSR.
     */
    public String getCertificateDomain() {
        return this.CertificateDomain;
    }

    /**
     * Set The common name bound to the certificate. if a CSR is uploaded, the domain name must be consistent with the common name resolved from the CSR.
     * @param CertificateDomain The common name bound to the certificate. if a CSR is uploaded, the domain name must be consistent with the common name resolved from the CSR.
     */
    public void setCertificateDomain(String CertificateDomain) {
        this.CertificateDomain = CertificateDomain;
    }

    /**
     * Get Other domain names bound to the certificate. not required for single domain and wildcard domain certificates. required for multiple domain names and multiple wildcard domain names. 
     * @return DomainList Other domain names bound to the certificate. not required for single domain and wildcard domain certificates. required for multiple domain names and multiple wildcard domain names.
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set Other domain names bound to the certificate. not required for single domain and wildcard domain certificates. required for multiple domain names and multiple wildcard domain names.
     * @param DomainList Other domain names bound to the certificate. not required for single domain and wildcard domain certificates. required for multiple domain names and multiple wildcard domain names.
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get Private key password, which is currently only used for the password when generating jks and pfx format certificates; other formats of private key certificates are not encrypted.	 
     * @return KeyPassword Private key password, which is currently only used for the password when generating jks and pfx format certificates; other formats of private key certificates are not encrypted.	
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set Private key password, which is currently only used for the password when generating jks and pfx format certificates; other formats of private key certificates are not encrypted.	
     * @param KeyPassword Private key password, which is currently only used for the password when generating jks and pfx format certificates; other formats of private key certificates are not encrypted.	
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    /**
     * Get This field is required. Company name. 
     * @return OrganizationName This field is required. Company name.
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set This field is required. Company name.
     * @param OrganizationName This field is required. Company name.
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get This field is required.  Department name. 
     * @return OrganizationDivision This field is required.  Department name.
     */
    public String getOrganizationDivision() {
        return this.OrganizationDivision;
    }

    /**
     * Set This field is required.  Department name.
     * @param OrganizationDivision This field is required.  Department name.
     */
    public void setOrganizationDivision(String OrganizationDivision) {
        this.OrganizationDivision = OrganizationDivision;
    }

    /**
     * Get This field is required. Company's detailed address. 
     * @return OrganizationAddress This field is required. Company's detailed address.
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set This field is required. Company's detailed address.
     * @param OrganizationAddress This field is required. Company's detailed address.
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get This field is required.Country name such as CN. 
     * @return OrganizationCountry This field is required.Country name such as CN.
     */
    public String getOrganizationCountry() {
        return this.OrganizationCountry;
    }

    /**
     * Set This field is required.Country name such as CN.
     * @param OrganizationCountry This field is required.Country name such as CN.
     */
    public void setOrganizationCountry(String OrganizationCountry) {
        this.OrganizationCountry = OrganizationCountry;
    }

    /**
     * Get This field is required, which specifies the city where the company is located. 
     * @return OrganizationCity This field is required, which specifies the city where the company is located.
     */
    public String getOrganizationCity() {
        return this.OrganizationCity;
    }

    /**
     * Set This field is required, which specifies the city where the company is located.
     * @param OrganizationCity This field is required, which specifies the city where the company is located.
     */
    public void setOrganizationCity(String OrganizationCity) {
        this.OrganizationCity = OrganizationCity;
    }

    /**
     * Get This field is required, specifying the province where the company is located. 
     * @return OrganizationRegion This field is required, specifying the province where the company is located.
     */
    public String getOrganizationRegion() {
        return this.OrganizationRegion;
    }

    /**
     * Set This field is required, specifying the province where the company is located.
     * @param OrganizationRegion This field is required, specifying the province where the company is located.
     */
    public void setOrganizationRegion(String OrganizationRegion) {
        this.OrganizationRegion = OrganizationRegion;
    }

    /**
     * Get Postal code of the organization 
     * @return PostalCode Postal code of the organization
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set Postal code of the organization
     * @param PostalCode Postal code of the organization
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get This field is required, the company's fixed-line phone area code. 
     * @return PhoneAreaCode This field is required, the company's fixed-line phone area code.
     */
    public String getPhoneAreaCode() {
        return this.PhoneAreaCode;
    }

    /**
     * Set This field is required, the company's fixed-line phone area code.
     * @param PhoneAreaCode This field is required, the company's fixed-line phone area code.
     */
    public void setPhoneAreaCode(String PhoneAreaCode) {
        this.PhoneAreaCode = PhoneAreaCode;
    }

    /**
     * Get This field is required, the company's landline number. 
     * @return PhoneNumber This field is required, the company's landline number.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set This field is required, the company's landline number.
     * @param PhoneNumber This field is required, the company's landline number.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Certificate validation method. Validation types: DNS_AUTO = Automatic DNS validation (only supported for domains resolved by Tencent Cloud DNS with a normal resolution status), DNS = Manual DNS validation, FILE = File validation. 
     * @return VerifyType Certificate validation method. Validation types: DNS_AUTO = Automatic DNS validation (only supported for domains resolved by Tencent Cloud DNS with a normal resolution status), DNS = Manual DNS validation, FILE = File validation.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Certificate validation method. Validation types: DNS_AUTO = Automatic DNS validation (only supported for domains resolved by Tencent Cloud DNS with a normal resolution status), DNS = Manual DNS validation, FILE = File validation.
     * @param VerifyType Certificate validation method. Validation types: DNS_AUTO = Automatic DNS validation (only supported for domains resolved by Tencent Cloud DNS with a normal resolution status), DNS = Manual DNS validation, FILE = File validation.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get This field is required, manager name. 
     * @return AdminFirstName This field is required, manager name.
     */
    public String getAdminFirstName() {
        return this.AdminFirstName;
    }

    /**
     * Set This field is required, manager name.
     * @param AdminFirstName This field is required, manager name.
     */
    public void setAdminFirstName(String AdminFirstName) {
        this.AdminFirstName = AdminFirstName;
    }

    /**
     * Get This field is required, the manager's surname. 
     * @return AdminLastName This field is required, the manager's surname.
     */
    public String getAdminLastName() {
        return this.AdminLastName;
    }

    /**
     * Set This field is required, the manager's surname.
     * @param AdminLastName This field is required, the manager's surname.
     */
    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    /**
     * Get This field is required, the manager's mobile phone number. 
     * @return AdminPhoneNum This field is required, the manager's mobile phone number.
     */
    public String getAdminPhoneNum() {
        return this.AdminPhoneNum;
    }

    /**
     * Set This field is required, the manager's mobile phone number.
     * @param AdminPhoneNum This field is required, the manager's mobile phone number.
     */
    public void setAdminPhoneNum(String AdminPhoneNum) {
        this.AdminPhoneNum = AdminPhoneNum;
    }

    /**
     * Get This field is required, the manager's email address. 
     * @return AdminEmail This field is required, the manager's email address.
     */
    public String getAdminEmail() {
        return this.AdminEmail;
    }

    /**
     * Set This field is required, the manager's email address.
     * @param AdminEmail This field is required, the manager's email address.
     */
    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    /**
     * Get This field is required, the manager position. 
     * @return AdminPosition This field is required, the manager position.
     */
    public String getAdminPosition() {
        return this.AdminPosition;
    }

    /**
     * Set This field is required, the manager position.
     * @param AdminPosition This field is required, the manager position.
     */
    public void setAdminPosition(String AdminPosition) {
        this.AdminPosition = AdminPosition;
    }

    /**
     * Get This field is required, the contact person name. 
     * @return ContactFirstName This field is required, the contact person name.
     */
    public String getContactFirstName() {
        return this.ContactFirstName;
    }

    /**
     * Set This field is required, the contact person name.
     * @param ContactFirstName This field is required, the contact person name.
     */
    public void setContactFirstName(String ContactFirstName) {
        this.ContactFirstName = ContactFirstName;
    }

    /**
     * Get This field is required, the contact person's surname. 
     * @return ContactLastName This field is required, the contact person's surname.
     */
    public String getContactLastName() {
        return this.ContactLastName;
    }

    /**
     * Set This field is required, the contact person's surname.
     * @param ContactLastName This field is required, the contact person's surname.
     */
    public void setContactLastName(String ContactLastName) {
        this.ContactLastName = ContactLastName;
    }

    /**
     * Get This field is required, the contact person's email address. 
     * @return ContactEmail This field is required, the contact person's email address.
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set This field is required, the contact person's email address.
     * @param ContactEmail This field is required, the contact person's email address.
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get This field is required, the contact person's mobile phone number. 
     * @return ContactNumber This field is required, the contact person's mobile phone number.
     */
    public String getContactNumber() {
        return this.ContactNumber;
    }

    /**
     * Set This field is required, the contact person's mobile phone number.
     * @param ContactNumber This field is required, the contact person's mobile phone number.
     */
    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    /**
     * Get This field is required, the contact person position. 
     * @return ContactPosition This field is required, the contact person position.
     */
    public String getContactPosition() {
        return this.ContactPosition;
    }

    /**
     * Set This field is required, the contact person position.
     * @param ContactPosition This field is required, the contact person position.
     */
    public void setContactPosition(String ContactPosition) {
        this.ContactPosition = ContactPosition;
    }

    /**
     * Get Indicates whether it is a dv certificate. default value is false. 
     * @return IsDV Indicates whether it is a dv certificate. default value is false.
     */
    public Boolean getIsDV() {
        return this.IsDV;
    }

    /**
     * Set Indicates whether it is a dv certificate. default value is false.
     * @param IsDV Indicates whether it is a dv certificate. default value is false.
     */
    public void setIsDV(Boolean IsDV) {
        this.IsDV = IsDV;
    }

    public SubmitCertificateInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitCertificateInformationRequest(SubmitCertificateInformationRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.CsrType != null) {
            this.CsrType = new String(source.CsrType);
        }
        if (source.CsrContent != null) {
            this.CsrContent = new String(source.CsrContent);
        }
        if (source.CertificateDomain != null) {
            this.CertificateDomain = new String(source.CertificateDomain);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
        if (source.KeyPassword != null) {
            this.KeyPassword = new String(source.KeyPassword);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.OrganizationDivision != null) {
            this.OrganizationDivision = new String(source.OrganizationDivision);
        }
        if (source.OrganizationAddress != null) {
            this.OrganizationAddress = new String(source.OrganizationAddress);
        }
        if (source.OrganizationCountry != null) {
            this.OrganizationCountry = new String(source.OrganizationCountry);
        }
        if (source.OrganizationCity != null) {
            this.OrganizationCity = new String(source.OrganizationCity);
        }
        if (source.OrganizationRegion != null) {
            this.OrganizationRegion = new String(source.OrganizationRegion);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new String(source.PostalCode);
        }
        if (source.PhoneAreaCode != null) {
            this.PhoneAreaCode = new String(source.PhoneAreaCode);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
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
        if (source.AdminPhoneNum != null) {
            this.AdminPhoneNum = new String(source.AdminPhoneNum);
        }
        if (source.AdminEmail != null) {
            this.AdminEmail = new String(source.AdminEmail);
        }
        if (source.AdminPosition != null) {
            this.AdminPosition = new String(source.AdminPosition);
        }
        if (source.ContactFirstName != null) {
            this.ContactFirstName = new String(source.ContactFirstName);
        }
        if (source.ContactLastName != null) {
            this.ContactLastName = new String(source.ContactLastName);
        }
        if (source.ContactEmail != null) {
            this.ContactEmail = new String(source.ContactEmail);
        }
        if (source.ContactNumber != null) {
            this.ContactNumber = new String(source.ContactNumber);
        }
        if (source.ContactPosition != null) {
            this.ContactPosition = new String(source.ContactPosition);
        }
        if (source.IsDV != null) {
            this.IsDV = new Boolean(source.IsDV);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "CsrType", this.CsrType);
        this.setParamSimple(map, prefix + "CsrContent", this.CsrContent);
        this.setParamSimple(map, prefix + "CertificateDomain", this.CertificateDomain);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "KeyPassword", this.KeyPassword);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "OrganizationDivision", this.OrganizationDivision);
        this.setParamSimple(map, prefix + "OrganizationAddress", this.OrganizationAddress);
        this.setParamSimple(map, prefix + "OrganizationCountry", this.OrganizationCountry);
        this.setParamSimple(map, prefix + "OrganizationCity", this.OrganizationCity);
        this.setParamSimple(map, prefix + "OrganizationRegion", this.OrganizationRegion);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "PhoneAreaCode", this.PhoneAreaCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamSimple(map, prefix + "AdminFirstName", this.AdminFirstName);
        this.setParamSimple(map, prefix + "AdminLastName", this.AdminLastName);
        this.setParamSimple(map, prefix + "AdminPhoneNum", this.AdminPhoneNum);
        this.setParamSimple(map, prefix + "AdminEmail", this.AdminEmail);
        this.setParamSimple(map, prefix + "AdminPosition", this.AdminPosition);
        this.setParamSimple(map, prefix + "ContactFirstName", this.ContactFirstName);
        this.setParamSimple(map, prefix + "ContactLastName", this.ContactLastName);
        this.setParamSimple(map, prefix + "ContactEmail", this.ContactEmail);
        this.setParamSimple(map, prefix + "ContactNumber", this.ContactNumber);
        this.setParamSimple(map, prefix + "ContactPosition", this.ContactPosition);
        this.setParamSimple(map, prefix + "IsDV", this.IsDV);

    }
}

