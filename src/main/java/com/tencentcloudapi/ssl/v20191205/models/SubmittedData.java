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

public class SubmittedData extends AbstractModel {

    /**
    * CSR type. `online`: CSR generated online; `parse`: CSR pasted
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * CSR content
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * Domain name information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertificateDomain")
    @Expose
    private String CertificateDomain;

    /**
    * DNS information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * Password of the private key
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyPassword")
    @Expose
    private String KeyPassword;

    /**
    * Enterprise or unit name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * Division
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrganizationDivision")
    @Expose
    private String OrganizationDivision;

    /**
    * Address
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * Country
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrganizationCountry")
    @Expose
    private String OrganizationCountry;

    /**
    * City
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrganizationCity")
    @Expose
    private String OrganizationCity;

    /**
    * Province
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrganizationRegion")
    @Expose
    private String OrganizationRegion;

    /**
    * Postal code
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * Area code of the fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneAreaCode")
    @Expose
    private String PhoneAreaCode;

    /**
    * Fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * First name of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminFirstName")
    @Expose
    private String AdminFirstName;

    /**
    * Last name of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminLastName")
    @Expose
    private String AdminLastName;

    /**
    * Phone number of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminPhoneNum")
    @Expose
    private String AdminPhoneNum;

    /**
    * Email of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminEmail")
    @Expose
    private String AdminEmail;

    /**
    * Position of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdminPosition")
    @Expose
    private String AdminPosition;

    /**
    * First name of the contact
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContactFirstName")
    @Expose
    private String ContactFirstName;

    /**
    * Last name of the contact
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContactLastName")
    @Expose
    private String ContactLastName;

    /**
    * Phone number of the contact
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContactNumber")
    @Expose
    private String ContactNumber;

    /**
    * Email of the contact
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContactEmail")
    @Expose
    private String ContactEmail;

    /**
    * Position of the contact
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContactPosition")
    @Expose
    private String ContactPosition;

    /**
    * Validation type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get CSR type. `online`: CSR generated online; `parse`: CSR pasted
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CsrType CSR type. `online`: CSR generated online; `parse`: CSR pasted
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set CSR type. `online`: CSR generated online; `parse`: CSR pasted
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CsrType CSR type. `online`: CSR generated online; `parse`: CSR pasted
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get CSR content
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CsrContent CSR content
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set CSR content
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CsrContent CSR content
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get Domain name information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertificateDomain Domain name information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCertificateDomain() {
        return this.CertificateDomain;
    }

    /**
     * Set Domain name information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertificateDomain Domain name information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertificateDomain(String CertificateDomain) {
        this.CertificateDomain = CertificateDomain;
    }

    /**
     * Get DNS information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DomainList DNS information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set DNS information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DomainList DNS information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get Password of the private key
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyPassword Password of the private key
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getKeyPassword() {
        return this.KeyPassword;
    }

    /**
     * Set Password of the private key
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyPassword Password of the private key
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyPassword(String KeyPassword) {
        this.KeyPassword = KeyPassword;
    }

    /**
     * Get Enterprise or unit name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrganizationName Enterprise or unit name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set Enterprise or unit name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrganizationName Enterprise or unit name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get Division
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrganizationDivision Division
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrganizationDivision() {
        return this.OrganizationDivision;
    }

    /**
     * Set Division
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrganizationDivision Division
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrganizationDivision(String OrganizationDivision) {
        this.OrganizationDivision = OrganizationDivision;
    }

    /**
     * Get Address
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrganizationAddress Address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set Address
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrganizationAddress Address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get Country
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrganizationCountry Country
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrganizationCountry() {
        return this.OrganizationCountry;
    }

    /**
     * Set Country
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrganizationCountry Country
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrganizationCountry(String OrganizationCountry) {
        this.OrganizationCountry = OrganizationCountry;
    }

    /**
     * Get City
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrganizationCity City
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrganizationCity() {
        return this.OrganizationCity;
    }

    /**
     * Set City
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrganizationCity City
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrganizationCity(String OrganizationCity) {
        this.OrganizationCity = OrganizationCity;
    }

    /**
     * Get Province
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OrganizationRegion Province
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOrganizationRegion() {
        return this.OrganizationRegion;
    }

    /**
     * Set Province
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OrganizationRegion Province
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOrganizationRegion(String OrganizationRegion) {
        this.OrganizationRegion = OrganizationRegion;
    }

    /**
     * Get Postal code
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PostalCode Postal code
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set Postal code
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PostalCode Postal code
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get Area code of the fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PhoneAreaCode Area code of the fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPhoneAreaCode() {
        return this.PhoneAreaCode;
    }

    /**
     * Set Area code of the fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PhoneAreaCode Area code of the fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneAreaCode(String PhoneAreaCode) {
        this.PhoneAreaCode = PhoneAreaCode;
    }

    /**
     * Get Fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PhoneNumber Fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PhoneNumber Fixed-line phone number
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get First name of the administrator
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdminFirstName First name of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminFirstName() {
        return this.AdminFirstName;
    }

    /**
     * Set First name of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdminFirstName First name of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminFirstName(String AdminFirstName) {
        this.AdminFirstName = AdminFirstName;
    }

    /**
     * Get Last name of the administrator
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdminLastName Last name of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminLastName() {
        return this.AdminLastName;
    }

    /**
     * Set Last name of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdminLastName Last name of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminLastName(String AdminLastName) {
        this.AdminLastName = AdminLastName;
    }

    /**
     * Get Phone number of the administrator
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdminPhoneNum Phone number of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminPhoneNum() {
        return this.AdminPhoneNum;
    }

    /**
     * Set Phone number of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdminPhoneNum Phone number of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminPhoneNum(String AdminPhoneNum) {
        this.AdminPhoneNum = AdminPhoneNum;
    }

    /**
     * Get Email of the administrator
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdminEmail Email of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminEmail() {
        return this.AdminEmail;
    }

    /**
     * Set Email of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdminEmail Email of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminEmail(String AdminEmail) {
        this.AdminEmail = AdminEmail;
    }

    /**
     * Get Position of the administrator
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdminPosition Position of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAdminPosition() {
        return this.AdminPosition;
    }

    /**
     * Set Position of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdminPosition Position of the administrator
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAdminPosition(String AdminPosition) {
        this.AdminPosition = AdminPosition;
    }

    /**
     * Get First name of the contact
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ContactFirstName First name of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getContactFirstName() {
        return this.ContactFirstName;
    }

    /**
     * Set First name of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ContactFirstName First name of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContactFirstName(String ContactFirstName) {
        this.ContactFirstName = ContactFirstName;
    }

    /**
     * Get Last name of the contact
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ContactLastName Last name of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getContactLastName() {
        return this.ContactLastName;
    }

    /**
     * Set Last name of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ContactLastName Last name of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContactLastName(String ContactLastName) {
        this.ContactLastName = ContactLastName;
    }

    /**
     * Get Phone number of the contact
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ContactNumber Phone number of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getContactNumber() {
        return this.ContactNumber;
    }

    /**
     * Set Phone number of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ContactNumber Phone number of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    /**
     * Get Email of the contact
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ContactEmail Email of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getContactEmail() {
        return this.ContactEmail;
    }

    /**
     * Set Email of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ContactEmail Email of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContactEmail(String ContactEmail) {
        this.ContactEmail = ContactEmail;
    }

    /**
     * Get Position of the contact
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ContactPosition Position of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getContactPosition() {
        return this.ContactPosition;
    }

    /**
     * Set Position of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ContactPosition Position of the contact
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContactPosition(String ContactPosition) {
        this.ContactPosition = ContactPosition;
    }

    /**
     * Get Validation type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VerifyType Validation type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Validation type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VerifyType Validation type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public SubmittedData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmittedData(SubmittedData source) {
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
        if (source.ContactNumber != null) {
            this.ContactNumber = new String(source.ContactNumber);
        }
        if (source.ContactEmail != null) {
            this.ContactEmail = new String(source.ContactEmail);
        }
        if (source.ContactPosition != null) {
            this.ContactPosition = new String(source.ContactPosition);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "AdminFirstName", this.AdminFirstName);
        this.setParamSimple(map, prefix + "AdminLastName", this.AdminLastName);
        this.setParamSimple(map, prefix + "AdminPhoneNum", this.AdminPhoneNum);
        this.setParamSimple(map, prefix + "AdminEmail", this.AdminEmail);
        this.setParamSimple(map, prefix + "AdminPosition", this.AdminPosition);
        this.setParamSimple(map, prefix + "ContactFirstName", this.ContactFirstName);
        this.setParamSimple(map, prefix + "ContactLastName", this.ContactLastName);
        this.setParamSimple(map, prefix + "ContactNumber", this.ContactNumber);
        this.setParamSimple(map, prefix + "ContactEmail", this.ContactEmail);
        this.setParamSimple(map, prefix + "ContactPosition", this.ContactPosition);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

