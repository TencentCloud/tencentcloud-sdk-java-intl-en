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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralCard extends AbstractModel {

    /**
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Personal number, which is returned when it is a passport
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PersonalNumber")
    @Expose
    private String PersonalNumber;

    /**
    * The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassportCodeFirst")
    @Expose
    private String PassportCodeFirst;

    /**
    * The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassportCodeSecond")
    @Expose
    private String PassportCodeSecond;

    /**
    * Date of expiry in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * Valid date in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    /**
    * Date of issue in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Issuing authority
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedAuthority")
    @Expose
    private String IssuedAuthority;

    /**
    * Issuing country, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: MYS
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * Full Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * First name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Last name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Gender on the license
- M: male
- F: female
- X: other gender
Note: This field may return null, indicating that no valid values can be obtained.
Example: M
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Age. 0 indicates that no valid information is obtained.
Example: 0
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Birth place
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * Nationality, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: IND
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Registration number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
     * Get License number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseNumber License number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set License number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseNumber License number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Personal number, which is returned when it is a passport
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PersonalNumber Personal number, which is returned when it is a passport
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPersonalNumber() {
        return this.PersonalNumber;
    }

    /**
     * Set Personal number, which is returned when it is a passport
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PersonalNumber Personal number, which is returned when it is a passport
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPersonalNumber(String PersonalNumber) {
        this.PersonalNumber = PersonalNumber;
    }

    /**
     * Get The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassportCodeFirst The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassportCodeFirst() {
        return this.PassportCodeFirst;
    }

    /**
     * Set The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassportCodeFirst The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassportCodeFirst(String PassportCodeFirst) {
        this.PassportCodeFirst = PassportCodeFirst;
    }

    /**
     * Get The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassportCodeSecond The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassportCodeSecond() {
        return this.PassportCodeSecond;
    }

    /**
     * Set The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassportCodeSecond The first line of passport machine reading code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassportCodeSecond(String PassportCodeSecond) {
        this.PassportCodeSecond = PassportCodeSecond;
    }

    /**
     * Get Date of expiry in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpirationDate Date of expiry in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Date of expiry in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpirationDate Date of expiry in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get Valid date in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DueDate Valid date in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDueDate() {
        return this.DueDate;
    }

    /**
     * Set Valid date in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DueDate Valid date in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * Get Date of issue in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedDate Date of issue in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Date of issue in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedDate Date of issue in the format of YYYY-MM-DD
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Issuing authority
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedAuthority Issuing authority
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedAuthority() {
        return this.IssuedAuthority;
    }

    /**
     * Set Issuing authority
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedAuthority Issuing authority
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedAuthority(String IssuedAuthority) {
        this.IssuedAuthority = IssuedAuthority;
    }

    /**
     * Get Issuing country, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: MYS 
     * @return IssuedCountry Issuing country, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: MYS
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set Issuing country, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: MYS
     * @param IssuedCountry Issuing country, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: MYS
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get Full Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get First name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstName First name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set First name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstName First name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get Last name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastName Last name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set Last name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastName Last name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get Gender on the license
- M: male
- F: female
- X: other gender
Note: This field may return null, indicating that no valid values can be obtained.
Example: M 
     * @return Sex Gender on the license
- M: male
- F: female
- X: other gender
Note: This field may return null, indicating that no valid values can be obtained.
Example: M
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender on the license
- M: male
- F: female
- X: other gender
Note: This field may return null, indicating that no valid values can be obtained.
Example: M
     * @param Sex Gender on the license
- M: male
- F: female
- X: other gender
Note: This field may return null, indicating that no valid values can be obtained.
Example: M
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Age. 0 indicates that no valid information is obtained.
Example: 0 
     * @return Age Age. 0 indicates that no valid information is obtained.
Example: 0
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set Age. 0 indicates that no valid information is obtained.
Example: 0
     * @param Age Age. 0 indicates that no valid information is obtained.
Example: 0
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get Birthday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthday Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthday Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Birth place
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BirthPlace Birth place
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set Birth place
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BirthPlace Birth place
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get Nationality, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: IND 
     * @return Nationality Nationality, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: IND
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Nationality, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: IND
     * @param Nationality Nationality, which is returned following the ISO 3166 country coding specification
Note: This field may return null, indicating that no valid values can be obtained.
Example: IND
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Registration number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistrationNumber Registration number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Registration number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistrationNumber Registration number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * Get Address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(Address Address) {
        this.Address = Address;
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

    }
}

