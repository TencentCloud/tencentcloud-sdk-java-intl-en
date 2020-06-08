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

public class SubmitCertificateInformationRequest extends AbstractModel{

    /**
    * Certificate ID.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * CSR generation mode. Online: generated online; parse: uploaded manually.
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * Uploaded CSR content.
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * Domain name bound with the certificate.
    */
    @SerializedName("CertificateDomain")
    @Expose
    private String CertificateDomain;

    /**
    * Uploaded domain name array (can be uploaded for a multi-domain certificate).
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * Password of the private key.
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
    * Organization name.
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * Division name.
    */
    @SerializedName("OrganizationDivision")
    @Expose
    private String OrganizationDivision;

    /**
    * Detailed address of the organization.
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * Country where the organization is located. For example, CN (China).
    */
    @SerializedName("OrganizationCountry")
    @Expose
    private String OrganizationCountry;

    /**
    * City where the organization is located.
    */
    @SerializedName("OrganizationCity")
    @Expose
    private String OrganizationCity;

    /**
    * Province where the organization is located.
    */
    @SerializedName("OrganizationRegion")
    @Expose
    private String OrganizationRegion;

    /**
    * Postal code of the organization.
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * Area code of the fixed-line phone number of the organization.
    */
    @SerializedName("PhoneAreaCode")
    @Expose
    private String PhoneAreaCode;

    /**
    * Fixed-line phone number of the organization.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Certificate verification method.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * Last name of the admin.
    */
    @SerializedName("AdminFirstName")
    @Expose
    private String AdminFirstName;

    /**
    * First name of the admin.
    */
    @SerializedName("AdminLastName")
    @Expose
    private String AdminLastName;

    /**
    * Mobile number of the admin.
    */
    @SerializedName("AdminPhoneNum")
    @Expose
    private String AdminPhoneNum;

    /**
    * Email of the admin.
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * Position of the admin.
    */
    @SerializedName("AdminPosition")
    @Expose
    private String AdminPosition;

    /**
    * Last name of the contact.
    */
    @SerializedName("ContactFirstName")
    @Expose
    private String ContactFirstName;

    /**
    * First name of the contact.
    */
    @SerializedName("ContactLastName")
    @Expose
    private String ContactLastName;

    /**
    * Email of the contact.
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * Mobile number of the contact.
    */
    @SerializedName("ContactNumber")
    @Expose
    private String ContactNumber;

    /**
    * Position of the contact.
    */
    @SerializedName("ContactPosition")
    @Expose
    private String ContactPosition;

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
     * Get CSR generation mode. Online: generated online; parse: uploaded manually. 
     * @return CsrType CSR generation mode. Online: generated online; parse: uploaded manually.
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set CSR generation mode. Online: generated online; parse: uploaded manually.
     * @param CsrType CSR generation mode. Online: generated online; parse: uploaded manually.
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get Uploaded CSR content. 
     * @return CsrContent Uploaded CSR content.
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set Uploaded CSR content.
     * @param CsrContent Uploaded CSR content.
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get Domain name bound with the certificate. 
     * @return CertificateDomain Domain name bound with the certificate.
     */
    public String getCertificateDomain() {
        return this.CertificateDomain;
    }

    /**
     * Set Domain name bound with the certificate.
     * @param CertificateDomain Domain name bound with the certificate.
     */
    public void setCertificateDomain(String CertificateDomain) {
        this.CertificateDomain = CertificateDomain;
    }

    /**
     * Get Uploaded domain name array (can be uploaded for a multi-domain certificate). 
     * @return DomainList Uploaded domain name array (can be uploaded for a multi-domain certificate).
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set Uploaded domain name array (can be uploaded for a multi-domain certificate).
     * @param DomainList Uploaded domain name array (can be uploaded for a multi-domain certificate).
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get Password of the private key. 
     * @return KeyPassword Password of the private key.
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set Password of the private key.
     * @param KeyPassword Password of the private key.
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    /**
     * Get Organization name. 
     * @return OrganizationName Organization name.
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set Organization name.
     * @param OrganizationName Organization name.
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get Division name. 
     * @return OrganizationDivision Division name.
     */
    public String getOrganizationDivision() {
        return this.OrganizationDivision;
    }

    /**
     * Set Division name.
     * @param OrganizationDivision Division name.
     */
    public void setOrganizationDivision(String OrganizationDivision) {
        this.OrganizationDivision = OrganizationDivision;
    }

    /**
     * Get Detailed address of the organization. 
     * @return OrganizationAddress Detailed address of the organization.
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set Detailed address of the organization.
     * @param OrganizationAddress Detailed address of the organization.
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get Country where the organization is located. For example, CN (China). 
     * @return OrganizationCountry Country where the organization is located. For example, CN (China).
     */
    public String getOrganizationCountry() {
        return this.OrganizationCountry;
    }

    /**
     * Set Country where the organization is located. For example, CN (China).
     * @param OrganizationCountry Country where the organization is located. For example, CN (China).
     */
    public void setOrganizationCountry(String OrganizationCountry) {
        this.OrganizationCountry = OrganizationCountry;
    }

    /**
     * Get City where the organization is located. 
     * @return OrganizationCity City where the organization is located.
     */
    public String getOrganizationCity() {
        return this.OrganizationCity;
    }

    /**
     * Set City where the organization is located.
     * @param OrganizationCity City where the organization is located.
     */
    public void setOrganizationCity(String OrganizationCity) {
        this.OrganizationCity = OrganizationCity;
    }

    /**
     * Get Province where the organization is located. 
     * @return OrganizationRegion Province where the organization is located.
     */
    public String getOrganizationRegion() {
        return this.OrganizationRegion;
    }

    /**
     * Set Province where the organization is located.
     * @param OrganizationRegion Province where the organization is located.
     */
    public void setOrganizationRegion(String OrganizationRegion) {
        this.OrganizationRegion = OrganizationRegion;
    }

    /**
     * Get Postal code of the organization. 
     * @return PostalCode Postal code of the organization.
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set Postal code of the organization.
     * @param PostalCode Postal code of the organization.
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get Area code of the fixed-line phone number of the organization. 
     * @return PhoneAreaCode Area code of the fixed-line phone number of the organization.
     */
    public String getPhoneAreaCode() {
        return this.PhoneAreaCode;
    }

    /**
     * Set Area code of the fixed-line phone number of the organization.
     * @param PhoneAreaCode Area code of the fixed-line phone number of the organization.
     */
    public void setPhoneAreaCode(String PhoneAreaCode) {
        this.PhoneAreaCode = PhoneAreaCode;
    }

    /**
     * Get Fixed-line phone number of the organization. 
     * @return PhoneNumber Fixed-line phone number of the organization.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Fixed-line phone number of the organization.
     * @param PhoneNumber Fixed-line phone number of the organization.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Certificate verification method. 
     * @return VerifyType Certificate verification method.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Certificate verification method.
     * @param VerifyType Certificate verification method.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get Last name of the admin. 
     * @return AdminFirstName Last name of the admin.
     */
    public String getAdminFirstName() {
        return this.AdminFirstName;
    }

    /**
     * Set Last name of the admin.
     * @param AdminFirstName Last name of the admin.
     */
    public void setAdminFirstName(String AdminFirstName) {
        this.AdminFirstName = AdminFirstName;
    }

    /**
     * Get First name of the admin. 
     * @return AdminLastName First name of the admin.
     */
    public String getAdminLastName() {
        return this.AdminLastName;
    }

    /**
     * Set First name of the admin.
     * @param AdminLastName First name of the admin.
     */
    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    /**
     * Get Mobile number of the admin. 
     * @return AdminPhoneNum Mobile number of the admin.
     */
    public String getAdminPhoneNum() {
        return this.AdminPhoneNum;
    }

    /**
     * Set Mobile number of the admin.
     * @param AdminPhoneNum Mobile number of the admin.
     */
    public void setAdminPhoneNum(String AdminPhoneNum) {
        this.AdminPhoneNum = AdminPhoneNum;
    }

    /**
     * Get Email of the admin. 
     * @return AdminEmail Email of the admin.
     */
    public String getAdminEmail() {
        return this.AdminEmail;
    }

    /**
     * Set Email of the admin.
     * @param AdminEmail Email of the admin.
     */
    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    /**
     * Get Position of the admin. 
     * @return AdminPosition Position of the admin.
     */
    public String getAdminPosition() {
        return this.AdminPosition;
    }

    /**
     * Set Position of the admin.
     * @param AdminPosition Position of the admin.
     */
    public void setAdminPosition(String AdminPosition) {
        this.AdminPosition = AdminPosition;
    }

    /**
     * Get Last name of the contact. 
     * @return ContactFirstName Last name of the contact.
     */
    public String getContactFirstName() {
        return this.ContactFirstName;
    }

    /**
     * Set Last name of the contact.
     * @param ContactFirstName Last name of the contact.
     */
    public void setContactFirstName(String ContactFirstName) {
        this.ContactFirstName = ContactFirstName;
    }

    /**
     * Get First name of the contact. 
     * @return ContactLastName First name of the contact.
     */
    public String getContactLastName() {
        return this.ContactLastName;
    }

    /**
     * Set First name of the contact.
     * @param ContactLastName First name of the contact.
     */
    public void setContactLastName(String ContactLastName) {
        this.ContactLastName = ContactLastName;
    }

    /**
     * Get Email of the contact. 
     * @return ContactEmail Email of the contact.
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set Email of the contact.
     * @param ContactEmail Email of the contact.
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get Mobile number of the contact. 
     * @return ContactNumber Mobile number of the contact.
     */
    public String getContactNumber() {
        return this.ContactNumber;
    }

    /**
     * Set Mobile number of the contact.
     * @param ContactNumber Mobile number of the contact.
     */
    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    /**
     * Get Position of the contact. 
     * @return ContactPosition Position of the contact.
     */
    public String getContactPosition() {
        return this.ContactPosition;
    }

    /**
     * Set Position of the contact.
     * @param ContactPosition Position of the contact.
     */
    public void setContactPosition(String ContactPosition) {
        this.ContactPosition = ContactPosition;
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

    }
}

