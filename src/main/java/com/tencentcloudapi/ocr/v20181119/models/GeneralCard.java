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
    * <p>ID number</p>
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * <p>Personal number, returned when the identity document type is passport</p>
    */
    @SerializedName("PersonalNumber")
    @Expose
    private String PersonalNumber;

    /**
    * <p>Name</p>
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * <p>Localized name</p>
    */
    @SerializedName("FullNameLocal")
    @Expose
    private String FullNameLocal;

    /**
    * <p>Name</p>
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * <p>Localized name</p>
    */
    @SerializedName("FirstNameLocal")
    @Expose
    private String FirstNameLocal;

    /**
    * <p>Middle name</p>
    */
    @SerializedName("MiddleName")
    @Expose
    private String MiddleName;

    /**
    * <p>Localized middle name</p>
    */
    @SerializedName("MiddleNameLocal")
    @Expose
    private String MiddleNameLocal;

    /**
    * <p>Last name</p>
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * <p>Localized last name</p>
    */
    @SerializedName("LastNameLocal")
    @Expose
    private String LastNameLocal;

    /**
    * <p>Gender on the document</p><ul><li>M: man</li><li>F: woman</li><li>X: other gender identity</li></ul>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>Date of birth</p>
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * <p>Birth place</p>
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * <p>Issue date, in YYYY-MM-DD format</p>
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * <p>Issuing authority</p>
    */
    @SerializedName("IssuedAuthority")
    @Expose
    private String IssuedAuthority;

    /**
    * <p>Place where the specified file is issued</p>
    */
    @SerializedName("IssuedPlace")
    @Expose
    private String IssuedPlace;

    /**
    * <p>Issuing country</p>
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * <p>Country code of the country that issued the file, ISO ALPHA-3 country/region code</p>
    */
    @SerializedName("IssuedCountryCode")
    @Expose
    private String IssuedCountryCode;

    /**
    * <p>Expiration date, in YYYY-MM-DD format</p>
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the order in which the line appears in the MRZ</p>
    */
    @SerializedName("MRZLine1")
    @Expose
    private String MRZLine1;

    /**
    * <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the line count in the order of the MRZ</p>
    */
    @SerializedName("MRZLine2")
    @Expose
    private String MRZLine2;

    /**
    * <p>Document nationality, returned following the ISO 3166 country coding specification</p>
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * <p>Address information on the document</p>
    */
    @SerializedName("Address")
    @Expose
    private AddressInfo Address;

    /**
    * <p>Religious belief</p>
    */
    @SerializedName("Religion")
    @Expose
    private String Religion;

    /**
    * <p>Document type</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Blood type</p>
    */
    @SerializedName("BloodType")
    @Expose
    private String BloodType;

    /**
    * <p>Height</p>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * <p>Weight</p>
    */
    @SerializedName("Weight")
    @Expose
    private String Weight;

    /**
    * <p>Driver's license vehicle type (for example, A/B/C)</p>
    */
    @SerializedName("VehicleClass")
    @Expose
    private String VehicleClass;

    /**
    * <p>Driver's license restriction condition</p>
    */
    @SerializedName("Restrictions")
    @Expose
    private String Restrictions;

    /**
    * <p>Driver's license extra records</p>
    */
    @SerializedName("Endorsement")
    @Expose
    private String Endorsement;

    /**
    * <p>Additional field</p>
    */
    @SerializedName("Others")
    @Expose
    private String Others;

    /**
    * <p>MRZ line 1 of the passport</p>
    */
    @SerializedName("PassportCodeFirst")
    @Expose
    private String PassportCodeFirst;

    /**
    * <p>MRZ line 2 of the passport</p>
    */
    @SerializedName("PassportCodeSecond")
    @Expose
    private String PassportCodeSecond;

    /**
    * <p>Validity date, in YYYY-MM-DD format</p>
    */
    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    /**
    * <p>Age. 0 means no valid info is obtained</p>
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * <p>Registration number</p>
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
     * Get <p>ID number</p> 
     * @return LicenseNumber <p>ID number</p>
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set <p>ID number</p>
     * @param LicenseNumber <p>ID number</p>
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get <p>Personal number, returned when the identity document type is passport</p> 
     * @return PersonalNumber <p>Personal number, returned when the identity document type is passport</p>
     */
    public String getPersonalNumber() {
        return this.PersonalNumber;
    }

    /**
     * Set <p>Personal number, returned when the identity document type is passport</p>
     * @param PersonalNumber <p>Personal number, returned when the identity document type is passport</p>
     */
    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    /**
     * Get <p>Name</p> 
     * @return FullName <p>Name</p>
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set <p>Name</p>
     * @param FullName <p>Name</p>
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get <p>Localized name</p> 
     * @return FullNameLocal <p>Localized name</p>
     */
    public String getFullNameLocal() {
        return this.FullNameLocal;
    }

    /**
     * Set <p>Localized name</p>
     * @param FullNameLocal <p>Localized name</p>
     */
    public void setFullNameLocal(String FullNameLocal) {
        this.FullNameLocal = FullNameLocal;
    }

    /**
     * Get <p>Name</p> 
     * @return FirstName <p>Name</p>
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set <p>Name</p>
     * @param FirstName <p>Name</p>
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get <p>Localized name</p> 
     * @return FirstNameLocal <p>Localized name</p>
     */
    public String getFirstNameLocal() {
        return this.FirstNameLocal;
    }

    /**
     * Set <p>Localized name</p>
     * @param FirstNameLocal <p>Localized name</p>
     */
    public void setFirstNameLocal(String FirstNameLocal) {
        this.FirstNameLocal = FirstNameLocal;
    }

    /**
     * Get <p>Middle name</p> 
     * @return MiddleName <p>Middle name</p>
     */
    public String getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set <p>Middle name</p>
     * @param MiddleName <p>Middle name</p>
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get <p>Localized middle name</p> 
     * @return MiddleNameLocal <p>Localized middle name</p>
     */
    public String getMiddleNameLocal() {
        return this.MiddleNameLocal;
    }

    /**
     * Set <p>Localized middle name</p>
     * @param MiddleNameLocal <p>Localized middle name</p>
     */
    public void setMiddleNameLocal(String MiddleNameLocal) {
        this.MiddleNameLocal = MiddleNameLocal;
    }

    /**
     * Get <p>Last name</p> 
     * @return LastName <p>Last name</p>
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set <p>Last name</p>
     * @param LastName <p>Last name</p>
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get <p>Localized last name</p> 
     * @return LastNameLocal <p>Localized last name</p>
     */
    public String getLastNameLocal() {
        return this.LastNameLocal;
    }

    /**
     * Set <p>Localized last name</p>
     * @param LastNameLocal <p>Localized last name</p>
     */
    public void setLastNameLocal(String LastNameLocal) {
        this.LastNameLocal = LastNameLocal;
    }

    /**
     * Get <p>Gender on the document</p><ul><li>M: man</li><li>F: woman</li><li>X: other gender identity</li></ul> 
     * @return Sex <p>Gender on the document</p><ul><li>M: man</li><li>F: woman</li><li>X: other gender identity</li></ul>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>Gender on the document</p><ul><li>M: man</li><li>F: woman</li><li>X: other gender identity</li></ul>
     * @param Sex <p>Gender on the document</p><ul><li>M: man</li><li>F: woman</li><li>X: other gender identity</li></ul>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>Date of birth</p> 
     * @return Birthday <p>Date of birth</p>
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set <p>Date of birth</p>
     * @param Birthday <p>Date of birth</p>
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get <p>Birth place</p> 
     * @return BirthPlace <p>Birth place</p>
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set <p>Birth place</p>
     * @param BirthPlace <p>Birth place</p>
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get <p>Issue date, in YYYY-MM-DD format</p> 
     * @return IssuedDate <p>Issue date, in YYYY-MM-DD format</p>
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set <p>Issue date, in YYYY-MM-DD format</p>
     * @param IssuedDate <p>Issue date, in YYYY-MM-DD format</p>
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get <p>Issuing authority</p> 
     * @return IssuedAuthority <p>Issuing authority</p>
     */
    public String getIssuedAuthority() {
        return this.IssuedAuthority;
    }

    /**
     * Set <p>Issuing authority</p>
     * @param IssuedAuthority <p>Issuing authority</p>
     */
    public void setIssuedAuthority(String IssuedAuthority) {
        this.IssuedAuthority = IssuedAuthority;
    }

    /**
     * Get <p>Place where the specified file is issued</p> 
     * @return IssuedPlace <p>Place where the specified file is issued</p>
     */
    public String getIssuedPlace() {
        return this.IssuedPlace;
    }

    /**
     * Set <p>Place where the specified file is issued</p>
     * @param IssuedPlace <p>Place where the specified file is issued</p>
     */
    public void setIssuedPlace(String IssuedPlace) {
        this.IssuedPlace = IssuedPlace;
    }

    /**
     * Get <p>Issuing country</p> 
     * @return IssuedCountry <p>Issuing country</p>
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set <p>Issuing country</p>
     * @param IssuedCountry <p>Issuing country</p>
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get <p>Country code of the country that issued the file, ISO ALPHA-3 country/region code</p> 
     * @return IssuedCountryCode <p>Country code of the country that issued the file, ISO ALPHA-3 country/region code</p>
     */
    public String getIssuedCountryCode() {
        return this.IssuedCountryCode;
    }

    /**
     * Set <p>Country code of the country that issued the file, ISO ALPHA-3 country/region code</p>
     * @param IssuedCountryCode <p>Country code of the country that issued the file, ISO ALPHA-3 country/region code</p>
     */
    public void setIssuedCountryCode(String IssuedCountryCode) {
        this.IssuedCountryCode = IssuedCountryCode;
    }

    /**
     * Get <p>Expiration date, in YYYY-MM-DD format</p> 
     * @return ExpirationDate <p>Expiration date, in YYYY-MM-DD format</p>
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set <p>Expiration date, in YYYY-MM-DD format</p>
     * @param ExpirationDate <p>Expiration date, in YYYY-MM-DD format</p>
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the order in which the line appears in the MRZ</p> 
     * @return MRZLine1 <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the order in which the line appears in the MRZ</p>
     */
    public String getMRZLine1() {
        return this.MRZLine1;
    }

    /**
     * Set <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the order in which the line appears in the MRZ</p>
     * @param MRZLine1 <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the order in which the line appears in the MRZ</p>
     */
    public void setMRZLine1(String MRZLine1) {
        this.MRZLine1 = MRZLine1;
    }

    /**
     * Get <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the line count in the order of the MRZ</p> 
     * @return MRZLine2 <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the line count in the order of the MRZ</p>
     */
    public String getMRZLine2() {
        return this.MRZLine2;
    }

    /**
     * Set <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the line count in the order of the MRZ</p>
     * @param MRZLine2 <p>Content of the single-line machine-readable zone (MRZ) on the document. The number represents the line count in the order of the MRZ</p>
     */
    public void setMRZLine2(String MRZLine2) {
        this.MRZLine2 = MRZLine2;
    }

    /**
     * Get <p>Document nationality, returned following the ISO 3166 country coding specification</p> 
     * @return Nationality <p>Document nationality, returned following the ISO 3166 country coding specification</p>
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set <p>Document nationality, returned following the ISO 3166 country coding specification</p>
     * @param Nationality <p>Document nationality, returned following the ISO 3166 country coding specification</p>
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get <p>Address information on the document</p> 
     * @return Address <p>Address information on the document</p>
     */
    public AddressInfo getAddress() {
        return this.Address;
    }

    /**
     * Set <p>Address information on the document</p>
     * @param Address <p>Address information on the document</p>
     */
    public void setAddress(AddressInfo Address) {
        this.Address = Address;
    }

    /**
     * Get <p>Religious belief</p> 
     * @return Religion <p>Religious belief</p>
     */
    public String getReligion() {
        return this.Religion;
    }

    /**
     * Set <p>Religious belief</p>
     * @param Religion <p>Religious belief</p>
     */
    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    /**
     * Get <p>Document type</p> 
     * @return Type <p>Document type</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Document type</p>
     * @param Type <p>Document type</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Blood type</p> 
     * @return BloodType <p>Blood type</p>
     */
    public String getBloodType() {
        return this.BloodType;
    }

    /**
     * Set <p>Blood type</p>
     * @param BloodType <p>Blood type</p>
     */
    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    /**
     * Get <p>Height</p> 
     * @return Height <p>Height</p>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Height</p>
     * @param Height <p>Height</p>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Weight</p> 
     * @return Weight <p>Weight</p>
     */
    public String getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>Weight</p>
     * @param Weight <p>Weight</p>
     */
    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>Driver's license vehicle type (for example, A/B/C)</p> 
     * @return VehicleClass <p>Driver's license vehicle type (for example, A/B/C)</p>
     */
    public String getVehicleClass() {
        return this.VehicleClass;
    }

    /**
     * Set <p>Driver's license vehicle type (for example, A/B/C)</p>
     * @param VehicleClass <p>Driver's license vehicle type (for example, A/B/C)</p>
     */
    public void setVehicleClass(String VehicleClass) {
        this.VehicleClass = VehicleClass;
    }

    /**
     * Get <p>Driver's license restriction condition</p> 
     * @return Restrictions <p>Driver's license restriction condition</p>
     */
    public String getRestrictions() {
        return this.Restrictions;
    }

    /**
     * Set <p>Driver's license restriction condition</p>
     * @param Restrictions <p>Driver's license restriction condition</p>
     */
    public void setRestrictions(String Restrictions) {
        this.Restrictions = Restrictions;
    }

    /**
     * Get <p>Driver's license extra records</p> 
     * @return Endorsement <p>Driver's license extra records</p>
     */
    public String getEndorsement() {
        return this.Endorsement;
    }

    /**
     * Set <p>Driver's license extra records</p>
     * @param Endorsement <p>Driver's license extra records</p>
     */
    public void setEndorsement(String Endorsement) {
        this.Endorsement = Endorsement;
    }

    /**
     * Get <p>Additional field</p> 
     * @return Others <p>Additional field</p>
     */
    public String getOthers() {
        return this.Others;
    }

    /**
     * Set <p>Additional field</p>
     * @param Others <p>Additional field</p>
     */
    public void setOthers(String Others) {
        this.Others = Others;
    }

    /**
     * Get <p>MRZ line 1 of the passport</p> 
     * @return PassportCodeFirst <p>MRZ line 1 of the passport</p>
     * @deprecated
     */
    @Deprecated
    public String getPassportCodeFirst() {
        return this.PassportCodeFirst;
    }

    /**
     * Set <p>MRZ line 1 of the passport</p>
     * @param PassportCodeFirst <p>MRZ line 1 of the passport</p>
     * @deprecated
     */
    @Deprecated
    public void setPassportCodeFirst(String PassportCodeFirst) {
        this.PassportCodeFirst = PassportCodeFirst;
    }

    /**
     * Get <p>MRZ line 2 of the passport</p> 
     * @return PassportCodeSecond <p>MRZ line 2 of the passport</p>
     * @deprecated
     */
    @Deprecated
    public String getPassportCodeSecond() {
        return this.PassportCodeSecond;
    }

    /**
     * Set <p>MRZ line 2 of the passport</p>
     * @param PassportCodeSecond <p>MRZ line 2 of the passport</p>
     * @deprecated
     */
    @Deprecated
    public void setPassportCodeSecond(String PassportCodeSecond) {
        this.PassportCodeSecond = PassportCodeSecond;
    }

    /**
     * Get <p>Validity date, in YYYY-MM-DD format</p> 
     * @return DueDate <p>Validity date, in YYYY-MM-DD format</p>
     * @deprecated
     */
    @Deprecated
    public String getDueDate() {
        return this.DueDate;
    }

    /**
     * Set <p>Validity date, in YYYY-MM-DD format</p>
     * @param DueDate <p>Validity date, in YYYY-MM-DD format</p>
     * @deprecated
     */
    @Deprecated
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * Get <p>Age. 0 means no valid info is obtained</p> 
     * @return Age <p>Age. 0 means no valid info is obtained</p>
     * @deprecated
     */
    @Deprecated
    public String getAge() {
        return this.Age;
    }

    /**
     * Set <p>Age. 0 means no valid info is obtained</p>
     * @param Age <p>Age. 0 means no valid info is obtained</p>
     * @deprecated
     */
    @Deprecated
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get <p>Registration number</p> 
     * @return RegistrationNumber <p>Registration number</p>
     * @deprecated
     */
    @Deprecated
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set <p>Registration number</p>
     * @param RegistrationNumber <p>Registration number</p>
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

