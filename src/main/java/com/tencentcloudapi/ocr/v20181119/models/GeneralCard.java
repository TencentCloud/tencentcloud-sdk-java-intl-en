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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralCard extends AbstractModel {

    /**
    * ID number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Personal number. returned when the identity document type is passport.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersonalNumber")
    @Expose
    private String PersonalNumber;

    /**
    * Passport mrz line 1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassportCodeFirst")
    @Expose
    private String PassportCodeFirst;

    /**
    * Passport mrz line 2.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassportCodeSecond")
    @Expose
    private String PassportCodeSecond;

    /**
    * Expiration date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * Expiration date in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    /**
    * Issue date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Issuing authority.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedAuthority")
    @Expose
    private String IssuedAuthority;

    /**
    * Issuing country, following the ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * Specifies the name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Gender on the document.
-M: man.
-F: woman.
-X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Date of birth.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Birth place.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * Document nationality, following ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Registration number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
    * Specifies the address information of the document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private AddressInfo Address;

    /**
    * Localized name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullNameLocal")
    @Expose
    private String FullNameLocal;

    /**
    * Localization name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstNameLocal")
    @Expose
    private String FirstNameLocal;

    /**
    * Localized surname.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastNameLocal")
    @Expose
    private String LastNameLocal;

    /**
     * Get ID number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseNumber ID number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set ID number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseNumber ID number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Personal number. returned when the identity document type is passport.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PersonalNumber Personal number. returned when the identity document type is passport.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPersonalNumber() {
        return this.PersonalNumber;
    }

    /**
     * Set Personal number. returned when the identity document type is passport.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PersonalNumber Personal number. returned when the identity document type is passport.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    /**
     * Get Passport mrz line 1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassportCodeFirst Passport mrz line 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassportCodeFirst() {
        return this.PassportCodeFirst;
    }

    /**
     * Set Passport mrz line 1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassportCodeFirst Passport mrz line 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassportCodeFirst(String PassportCodeFirst) {
        this.PassportCodeFirst = PassportCodeFirst;
    }

    /**
     * Get Passport mrz line 2.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassportCodeSecond Passport mrz line 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassportCodeSecond() {
        return this.PassportCodeSecond;
    }

    /**
     * Set Passport mrz line 2.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassportCodeSecond Passport mrz line 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassportCodeSecond(String PassportCodeSecond) {
        this.PassportCodeSecond = PassportCodeSecond;
    }

    /**
     * Get Expiration date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpirationDate Expiration date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpirationDate Expiration date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get Expiration date in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DueDate Expiration date in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDueDate() {
        return this.DueDate;
    }

    /**
     * Set Expiration date in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DueDate Expiration date in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * Get Issue date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedDate Issue date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Issue date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedDate Issue date, in YYYY-MM-DD format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Issuing authority.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedAuthority Issuing authority.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedAuthority() {
        return this.IssuedAuthority;
    }

    /**
     * Set Issuing authority.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedAuthority Issuing authority.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedAuthority(String IssuedAuthority) {
        this.IssuedAuthority = IssuedAuthority;
    }

    /**
     * Get Issuing country, following the ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedCountry Issuing country, following the ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set Issuing country, following the ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedCountry Issuing country, following the ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get Specifies the name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName Specifies the name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Specifies the name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName Specifies the name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstName Name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set Name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstName Name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get Name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastName Name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set Name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastName Name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get Gender on the document.
-M: man.
-F: woman.
-X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Gender on the document.
-M: man.
-F: woman.
-X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender on the document.
-M: man.
-F: woman.
-X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Gender on the document.
-M: man.
-F: woman.
-X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Age Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Age Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get Date of birth.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthday Date of birth.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthday Date of birth.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Birth place.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BirthPlace Birth place.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set Birth place.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BirthPlace Birth place.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get Document nationality, following ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nationality Document nationality, following ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Document nationality, following ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nationality Document nationality, following ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Registration number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistrationNumber Registration number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Registration number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistrationNumber Registration number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * Get Specifies the address information of the document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Specifies the address information of the document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AddressInfo getAddress() {
        return this.Address;
    }

    /**
     * Set Specifies the address information of the document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Specifies the address information of the document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(AddressInfo Address) {
        this.Address = Address;
    }

    /**
     * Get Localized name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullNameLocal Localized name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullNameLocal() {
        return this.FullNameLocal;
    }

    /**
     * Set Localized name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullNameLocal Localized name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullNameLocal(String FullNameLocal) {
        this.FullNameLocal = FullNameLocal;
    }

    /**
     * Get Localization name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstNameLocal Localization name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstNameLocal() {
        return this.FirstNameLocal;
    }

    /**
     * Set Localization name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstNameLocal Localization name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstNameLocal(String FirstNameLocal) {
        this.FirstNameLocal = FirstNameLocal;
    }

    /**
     * Get Localized surname.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastNameLocal Localized surname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastNameLocal() {
        return this.LastNameLocal;
    }

    /**
     * Set Localized surname.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastNameLocal Localized surname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastNameLocal(String LastNameLocal) {
        this.LastNameLocal = LastNameLocal;
    }

    public GeneralCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralCard(GeneralCard source) {
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.PersonalNumber != null) {
            this.PersonalNumber = new String(source.PersonalNumber);
        }
        if (source.PassportCodeFirst != null) {
            this.PassportCodeFirst = new String(source.PassportCodeFirst);
        }
        if (source.PassportCodeSecond != null) {
            this.PassportCodeSecond = new String(source.PassportCodeSecond);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.DueDate != null) {
            this.DueDate = new String(source.DueDate);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.IssuedAuthority != null) {
            this.IssuedAuthority = new String(source.IssuedAuthority);
        }
        if (source.IssuedCountry != null) {
            this.IssuedCountry = new String(source.IssuedCountry);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.RegistrationNumber != null) {
            this.RegistrationNumber = new String(source.RegistrationNumber);
        }
        if (source.Address != null) {
            this.Address = new AddressInfo(source.Address);
        }
        if (source.FullNameLocal != null) {
            this.FullNameLocal = new String(source.FullNameLocal);
        }
        if (source.FirstNameLocal != null) {
            this.FirstNameLocal = new String(source.FirstNameLocal);
        }
        if (source.LastNameLocal != null) {
            this.LastNameLocal = new String(source.LastNameLocal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "PersonalNumber", this.PersonalNumber);
        this.setParamSimple(map, prefix + "PassportCodeFirst", this.PassportCodeFirst);
        this.setParamSimple(map, prefix + "PassportCodeSecond", this.PassportCodeSecond);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "DueDate", this.DueDate);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "IssuedAuthority", this.IssuedAuthority);
        this.setParamSimple(map, prefix + "IssuedCountry", this.IssuedCountry);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "RegistrationNumber", this.RegistrationNumber);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamSimple(map, prefix + "FullNameLocal", this.FullNameLocal);
        this.setParamSimple(map, prefix + "FirstNameLocal", this.FirstNameLocal);
        this.setParamSimple(map, prefix + "LastNameLocal", this.LastNameLocal);

    }
}

