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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralCard extends AbstractModel {

    /**
    * ID number
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Personal number. It is returned when the identity document type is a passport.
    */
    @SerializedName("PersonalNumber")
    @Expose
    private String PersonalNumber;

    /**
    * MRZ line 1 of the passport
    */
    @SerializedName("PassportCodeFirst")
    @Expose
    private String PassportCodeFirst;

    /**
    * MRZ line 2 of the passport
    */
    @SerializedName("PassportCodeSecond")
    @Expose
    private String PassportCodeSecond;

    /**
    * Expiration date in YYYY-MM-DD format
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * Expiration date in YYYY-MM-DD format
    */
    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    /**
    * Issue date in YYYY-MM-DD format
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Issuing authority
    */
    @SerializedName("IssuedAuthority")
    @Expose
    private String IssuedAuthority;

    /**
    * Issuing country. Return following the ISO 3166 country coding specification.
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * Name
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Name
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Last name
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Gender on the document
-M: male
-F: female
- X: Other gender identity
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Age. 0 indicates no valid info is obtained.
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Birth place
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * Document nationality. Return following the ISO 3166 country coding specification.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Registration number
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
    * Document address information
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * Localized name
    */
    @SerializedName("FullNameLocal")
    @Expose
    private String FullNameLocal;

    /**
    * Localized name
    */
    @SerializedName("FirstNameLocal")
    @Expose
    private String FirstNameLocal;

    /**
    * Localized last name
    */
    @SerializedName("LastNameLocal")
    @Expose
    private String LastNameLocal;

    /**
     * Get ID number 
     * @return LicenseNumber ID number
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set ID number
     * @param LicenseNumber ID number
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Personal number. It is returned when the identity document type is a passport. 
     * @return PersonalNumber Personal number. It is returned when the identity document type is a passport.
     */
    public String getPersonalNumber() {
        return this.PersonalNumber;
    }

    /**
     * Set Personal number. It is returned when the identity document type is a passport.
     * @param PersonalNumber Personal number. It is returned when the identity document type is a passport.
     */
    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    /**
     * Get MRZ line 1 of the passport 
     * @return PassportCodeFirst MRZ line 1 of the passport
     */
    public String getPassportCodeFirst() {
        return this.PassportCodeFirst;
    }

    /**
     * Set MRZ line 1 of the passport
     * @param PassportCodeFirst MRZ line 1 of the passport
     */
    public void setPassportCodeFirst(String PassportCodeFirst) {
        this.PassportCodeFirst = PassportCodeFirst;
    }

    /**
     * Get MRZ line 2 of the passport 
     * @return PassportCodeSecond MRZ line 2 of the passport
     */
    public String getPassportCodeSecond() {
        return this.PassportCodeSecond;
    }

    /**
     * Set MRZ line 2 of the passport
     * @param PassportCodeSecond MRZ line 2 of the passport
     */
    public void setPassportCodeSecond(String PassportCodeSecond) {
        this.PassportCodeSecond = PassportCodeSecond;
    }

    /**
     * Get Expiration date in YYYY-MM-DD format 
     * @return ExpirationDate Expiration date in YYYY-MM-DD format
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration date in YYYY-MM-DD format
     * @param ExpirationDate Expiration date in YYYY-MM-DD format
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get Expiration date in YYYY-MM-DD format 
     * @return DueDate Expiration date in YYYY-MM-DD format
     */
    public String getDueDate() {
        return this.DueDate;
    }

    /**
     * Set Expiration date in YYYY-MM-DD format
     * @param DueDate Expiration date in YYYY-MM-DD format
     */
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * Get Issue date in YYYY-MM-DD format 
     * @return IssuedDate Issue date in YYYY-MM-DD format
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Issue date in YYYY-MM-DD format
     * @param IssuedDate Issue date in YYYY-MM-DD format
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Issuing authority 
     * @return IssuedAuthority Issuing authority
     */
    public String getIssuedAuthority() {
        return this.IssuedAuthority;
    }

    /**
     * Set Issuing authority
     * @param IssuedAuthority Issuing authority
     */
    public void setIssuedAuthority(String IssuedAuthority) {
        this.IssuedAuthority = IssuedAuthority;
    }

    /**
     * Get Issuing country. Return following the ISO 3166 country coding specification. 
     * @return IssuedCountry Issuing country. Return following the ISO 3166 country coding specification.
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set Issuing country. Return following the ISO 3166 country coding specification.
     * @param IssuedCountry Issuing country. Return following the ISO 3166 country coding specification.
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get Name 
     * @return FullName Name
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Name
     * @param FullName Name
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Name 
     * @return FirstName Name
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set Name
     * @param FirstName Name
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get Last name 
     * @return LastName Last name
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set Last name
     * @param LastName Last name
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get Gender on the document
-M: male
-F: female
- X: Other gender identity 
     * @return Sex Gender on the document
-M: male
-F: female
- X: Other gender identity
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender on the document
-M: male
-F: female
- X: Other gender identity
     * @param Sex Gender on the document
-M: male
-F: female
- X: Other gender identity
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Age. 0 indicates no valid info is obtained. 
     * @return Age Age. 0 indicates no valid info is obtained.
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set Age. 0 indicates no valid info is obtained.
     * @param Age Age. 0 indicates no valid info is obtained.
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get Date of birth 
     * @return Birthday Date of birth
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth
     * @param Birthday Date of birth
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Birth place 
     * @return BirthPlace Birth place
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set Birth place
     * @param BirthPlace Birth place
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get Document nationality. Return following the ISO 3166 country coding specification. 
     * @return Nationality Document nationality. Return following the ISO 3166 country coding specification.
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Document nationality. Return following the ISO 3166 country coding specification.
     * @param Nationality Document nationality. Return following the ISO 3166 country coding specification.
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Registration number 
     * @return RegistrationNumber Registration number
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Registration number
     * @param RegistrationNumber Registration number
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * Get Document address information 
     * @return Address Document address information
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set Document address information
     * @param Address Document address information
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get Localized name 
     * @return FullNameLocal Localized name
     */
    public String getFullNameLocal() {
        return this.FullNameLocal;
    }

    /**
     * Set Localized name
     * @param FullNameLocal Localized name
     */
    public void setFullNameLocal(String FullNameLocal) {
        this.FullNameLocal = FullNameLocal;
    }

    /**
     * Get Localized name 
     * @return FirstNameLocal Localized name
     */
    public String getFirstNameLocal() {
        return this.FirstNameLocal;
    }

    /**
     * Set Localized name
     * @param FirstNameLocal Localized name
     */
    public void setFirstNameLocal(String FirstNameLocal) {
        this.FirstNameLocal = FirstNameLocal;
    }

    /**
     * Get Localized last name 
     * @return LastNameLocal Localized last name
     */
    public String getLastNameLocal() {
        return this.LastNameLocal;
    }

    /**
     * Set Localized last name
     * @param LastNameLocal Localized last name
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
            this.Address = new Address(source.Address);
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

