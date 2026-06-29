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
    * Personal number. 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersonalNumber")
    @Expose
    private String PersonalNumber;

    /**
    * Full name on the document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Full name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullNameLocal")
    @Expose
    private String FullNameLocal;

    /**
    * First name or given name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * First name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstNameLocal")
    @Expose
    private String FirstNameLocal;

    /**
    * Middle name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiddleName")
    @Expose
    private String MiddleName;

    /**
    * Middle name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiddleNameLocal")
    @Expose
    private String MiddleNameLocal;

    /**
    * Last name or surname.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Last name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastNameLocal")
    @Expose
    private String LastNameLocal;

    /**
    * Gender on the document.
- M: man.
- F: woman.
- X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

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
    * Issue date.
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
    * Place of issue.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedPlace")
    @Expose
    private String IssuedPlace;

    /**
    * Issuing country.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * Country code of issue, ISO Alpha-3 format.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedCountryCode")
    @Expose
    private String IssuedCountryCode;

    /**
    * Expiry date.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * First line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MRZLine1")
    @Expose
    private String MRZLine1;

    /**
    * Second line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MRZLine2")
    @Expose
    private String MRZLine2;

    /**
    * Document nationality, following ISO 3166 country coding specification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Address information on the document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private AddressInfo Address;

    /**
    * Religion (if displayed on the document).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Religion")
    @Expose
    private String Religion;

    /**
    * Type of document.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Blood type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BloodType")
    @Expose
    private String BloodType;

    /**
    * Height.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * Weight.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weight")
    @Expose
    private String Weight;

    /**
    * Vehicle class authorized on the driver license (e.g., A, B, C).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VehicleClass")
    @Expose
    private String VehicleClass;

    /**
    * Restrictions on the driver license.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Restrictions")
    @Expose
    private String Restrictions;

    /**
    * Endorsements or additional records on the driver license.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Endorsement")
    @Expose
    private String Endorsement;

    /**
    * Supplementary fields (varies by document type).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Others")
    @Expose
    private String Others;

    /**
    * First line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassportCodeFirst")
    @Expose
    private String PassportCodeFirst;

    /**
    * Second line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassportCodeSecond")
    @Expose
    private String PassportCodeSecond;

    /**
    * Expiry date.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    /**
    * Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Registration number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

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
     * Get Personal number. 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PersonalNumber Personal number. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPersonalNumber() {
        return this.PersonalNumber;
    }

    /**
     * Set Personal number. 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PersonalNumber Personal number. 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    /**
     * Get Full name on the document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName Full name on the document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Full name on the document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName Full name on the document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Full name in local language.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullNameLocal Full name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullNameLocal() {
        return this.FullNameLocal;
    }

    /**
     * Set Full name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullNameLocal Full name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullNameLocal(String FullNameLocal) {
        this.FullNameLocal = FullNameLocal;
    }

    /**
     * Get First name or given name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstName First name or given name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set First name or given name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstName First name or given name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get First name in local language.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstNameLocal First name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstNameLocal() {
        return this.FirstNameLocal;
    }

    /**
     * Set First name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstNameLocal First name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstNameLocal(String FirstNameLocal) {
        this.FirstNameLocal = FirstNameLocal;
    }

    /**
     * Get Middle name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MiddleName Middle name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set Middle name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MiddleName Middle name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get Middle name in local language.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MiddleNameLocal Middle name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMiddleNameLocal() {
        return this.MiddleNameLocal;
    }

    /**
     * Set Middle name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MiddleNameLocal Middle name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMiddleNameLocal(String MiddleNameLocal) {
        this.MiddleNameLocal = MiddleNameLocal;
    }

    /**
     * Get Last name or surname.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastName Last name or surname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set Last name or surname.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastName Last name or surname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get Last name in local language.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastNameLocal Last name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastNameLocal() {
        return this.LastNameLocal;
    }

    /**
     * Set Last name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastNameLocal Last name in local language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastNameLocal(String LastNameLocal) {
        this.LastNameLocal = LastNameLocal;
    }

    /**
     * Get Gender on the document.
- M: man.
- F: woman.
- X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Gender on the document.
- M: man.
- F: woman.
- X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender on the document.
- M: man.
- F: woman.
- X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Gender on the document.
- M: man.
- F: woman.
- X: other gender identity.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
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
     * Get Issue date.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedDate Issue date.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Issue date.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedDate Issue date.
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
     * Get Place of issue.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedPlace Place of issue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedPlace() {
        return this.IssuedPlace;
    }

    /**
     * Set Place of issue.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedPlace Place of issue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedPlace(String IssuedPlace) {
        this.IssuedPlace = IssuedPlace;
    }

    /**
     * Get Issuing country.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedCountry Issuing country.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set Issuing country.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedCountry Issuing country.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get Country code of issue, ISO Alpha-3 format.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedCountryCode Country code of issue, ISO Alpha-3 format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedCountryCode() {
        return this.IssuedCountryCode;
    }

    /**
     * Set Country code of issue, ISO Alpha-3 format.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedCountryCode Country code of issue, ISO Alpha-3 format.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedCountryCode(String IssuedCountryCode) {
        this.IssuedCountryCode = IssuedCountryCode;
    }

    /**
     * Get Expiry date.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpirationDate Expiry date.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiry date.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpirationDate Expiry date.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get First line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MRZLine1 First line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMRZLine1() {
        return this.MRZLine1;
    }

    /**
     * Set First line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MRZLine1 First line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMRZLine1(String MRZLine1) {
        this.MRZLine1 = MRZLine1;
    }

    /**
     * Get Second line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MRZLine2 Second line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMRZLine2() {
        return this.MRZLine2;
    }

    /**
     * Set Second line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MRZLine2 Second line of the Machine Readable Zone (MRZ).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMRZLine2(String MRZLine2) {
        this.MRZLine2 = MRZLine2;
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
     * Get Address information on the document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Address information on the document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AddressInfo getAddress() {
        return this.Address;
    }

    /**
     * Set Address information on the document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address information on the document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(AddressInfo Address) {
        this.Address = Address;
    }

    /**
     * Get Religion (if displayed on the document).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Religion Religion (if displayed on the document).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReligion() {
        return this.Religion;
    }

    /**
     * Set Religion (if displayed on the document).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Religion Religion (if displayed on the document).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    /**
     * Get Type of document.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type of document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of document.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type of document.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Blood type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BloodType Blood type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBloodType() {
        return this.BloodType;
    }

    /**
     * Set Blood type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BloodType Blood type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    /**
     * Get Height.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Height Height.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set Height.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Height Height.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get Weight.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weight Weight.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weight Weight.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Vehicle class authorized on the driver license (e.g., A, B, C).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VehicleClass Vehicle class authorized on the driver license (e.g., A, B, C).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVehicleClass() {
        return this.VehicleClass;
    }

    /**
     * Set Vehicle class authorized on the driver license (e.g., A, B, C).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VehicleClass Vehicle class authorized on the driver license (e.g., A, B, C).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVehicleClass(String VehicleClass) {
        this.VehicleClass = VehicleClass;
    }

    /**
     * Get Restrictions on the driver license.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Restrictions Restrictions on the driver license.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRestrictions() {
        return this.Restrictions;
    }

    /**
     * Set Restrictions on the driver license.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Restrictions Restrictions on the driver license.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRestrictions(String Restrictions) {
        this.Restrictions = Restrictions;
    }

    /**
     * Get Endorsements or additional records on the driver license.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Endorsement Endorsements or additional records on the driver license.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndorsement() {
        return this.Endorsement;
    }

    /**
     * Set Endorsements or additional records on the driver license.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Endorsement Endorsements or additional records on the driver license.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndorsement(String Endorsement) {
        this.Endorsement = Endorsement;
    }

    /**
     * Get Supplementary fields (varies by document type).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Others Supplementary fields (varies by document type).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOthers() {
        return this.Others;
    }

    /**
     * Set Supplementary fields (varies by document type).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Others Supplementary fields (varies by document type).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOthers(String Others) {
        this.Others = Others;
    }

    /**
     * Get First line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassportCodeFirst First line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getPassportCodeFirst() {
        return this.PassportCodeFirst;
    }

    /**
     * Set First line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassportCodeFirst First line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setPassportCodeFirst(String PassportCodeFirst) {
        this.PassportCodeFirst = PassportCodeFirst;
    }

    /**
     * Get Second line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassportCodeSecond Second line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getPassportCodeSecond() {
        return this.PassportCodeSecond;
    }

    /**
     * Set Second line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassportCodeSecond Second line of the passport MRZ (Machine Readable Zone).
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setPassportCodeSecond(String PassportCodeSecond) {
        this.PassportCodeSecond = PassportCodeSecond;
    }

    /**
     * Get Expiry date.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DueDate Expiry date.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getDueDate() {
        return this.DueDate;
    }

    /**
     * Set Expiry date.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DueDate Expiry date.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * Get Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Age Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getAge() {
        return this.Age;
    }

    /**
     * Set Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Age Age. 0 means no valid info.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get Registration number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistrationNumber Registration number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Registration number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistrationNumber Registration number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
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
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.FullNameLocal != null) {
            this.FullNameLocal = new String(source.FullNameLocal);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.FirstNameLocal != null) {
            this.FirstNameLocal = new String(source.FirstNameLocal);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new String(source.MiddleName);
        }
        if (source.MiddleNameLocal != null) {
            this.MiddleNameLocal = new String(source.MiddleNameLocal);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.LastNameLocal != null) {
            this.LastNameLocal = new String(source.LastNameLocal);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.IssuedAuthority != null) {
            this.IssuedAuthority = new String(source.IssuedAuthority);
        }
        if (source.IssuedPlace != null) {
            this.IssuedPlace = new String(source.IssuedPlace);
        }
        if (source.IssuedCountry != null) {
            this.IssuedCountry = new String(source.IssuedCountry);
        }
        if (source.IssuedCountryCode != null) {
            this.IssuedCountryCode = new String(source.IssuedCountryCode);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.MRZLine1 != null) {
            this.MRZLine1 = new String(source.MRZLine1);
        }
        if (source.MRZLine2 != null) {
            this.MRZLine2 = new String(source.MRZLine2);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Address != null) {
            this.Address = new AddressInfo(source.Address);
        }
        if (source.Religion != null) {
            this.Religion = new String(source.Religion);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.BloodType != null) {
            this.BloodType = new String(source.BloodType);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.Weight != null) {
            this.Weight = new String(source.Weight);
        }
        if (source.VehicleClass != null) {
            this.VehicleClass = new String(source.VehicleClass);
        }
        if (source.Restrictions != null) {
            this.Restrictions = new String(source.Restrictions);
        }
        if (source.Endorsement != null) {
            this.Endorsement = new String(source.Endorsement);
        }
        if (source.Others != null) {
            this.Others = new String(source.Others);
        }
        if (source.PassportCodeFirst != null) {
            this.PassportCodeFirst = new String(source.PassportCodeFirst);
        }
        if (source.PassportCodeSecond != null) {
            this.PassportCodeSecond = new String(source.PassportCodeSecond);
        }
        if (source.DueDate != null) {
            this.DueDate = new String(source.DueDate);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.RegistrationNumber != null) {
            this.RegistrationNumber = new String(source.RegistrationNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "PersonalNumber", this.PersonalNumber);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "FullNameLocal", this.FullNameLocal);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "FirstNameLocal", this.FirstNameLocal);
        this.setParamSimple(map, prefix + "MiddleName", this.MiddleName);
        this.setParamSimple(map, prefix + "MiddleNameLocal", this.MiddleNameLocal);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "LastNameLocal", this.LastNameLocal);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "IssuedAuthority", this.IssuedAuthority);
        this.setParamSimple(map, prefix + "IssuedPlace", this.IssuedPlace);
        this.setParamSimple(map, prefix + "IssuedCountry", this.IssuedCountry);
        this.setParamSimple(map, prefix + "IssuedCountryCode", this.IssuedCountryCode);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "MRZLine1", this.MRZLine1);
        this.setParamSimple(map, prefix + "MRZLine2", this.MRZLine2);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamSimple(map, prefix + "Religion", this.Religion);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BloodType", this.BloodType);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "VehicleClass", this.VehicleClass);
        this.setParamSimple(map, prefix + "Restrictions", this.Restrictions);
        this.setParamSimple(map, prefix + "Endorsement", this.Endorsement);
        this.setParamSimple(map, prefix + "Others", this.Others);
        this.setParamSimple(map, prefix + "PassportCodeFirst", this.PassportCodeFirst);
        this.setParamSimple(map, prefix + "PassportCodeSecond", this.PassportCodeSecond);
        this.setParamSimple(map, prefix + "DueDate", this.DueDate);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "RegistrationNumber", this.RegistrationNumber);

    }
}

