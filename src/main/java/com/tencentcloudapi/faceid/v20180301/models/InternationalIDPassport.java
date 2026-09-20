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

public class InternationalIDPassport extends AbstractModel {

    /**
    * Passport ID
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Name
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Last name
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * Name
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Gender (F: female, M: male).
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Validity period.
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * Issuing country
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * Country region code
    */
    @SerializedName("NationalityCode")
    @Expose
    private String NationalityCode;

    /**
    * MRZ Code sequence in the first row at the bottom
    */
    @SerializedName("PassportCodeFirst")
    @Expose
    private String PassportCodeFirst;

    /**
    * MRZ Code sequence in the second line from the bottom
    */
    @SerializedName("PassportCodeSecond")
    @Expose
    private String PassportCodeSecond;

    /**
     * Get Passport ID 
     * @return LicenseNumber Passport ID
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set Passport ID
     * @param LicenseNumber Passport ID
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
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
     * Get Last name 
     * @return Surname Last name
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set Last name
     * @param Surname Last name
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get Name 
     * @return GivenName Name
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set Name
     * @param GivenName Name
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
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
     * Get Gender (F: female, M: male). 
     * @return Sex Gender (F: female, M: male).
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender (F: female, M: male).
     * @param Sex Gender (F: female, M: male).
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Validity period. 
     * @return DateOfExpiration Validity period.
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set Validity period.
     * @param DateOfExpiration Validity period.
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get Issuing country 
     * @return IssuingCountry Issuing country
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set Issuing country
     * @param IssuingCountry Issuing country
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get Country region code 
     * @return NationalityCode Country region code
     */
    public String getNationalityCode() {
        return this.NationalityCode;
    }

    /**
     * Set Country region code
     * @param NationalityCode Country region code
     */
    public void setNationalityCode(String NationalityCode) {
        this.NationalityCode = NationalityCode;
    }

    /**
     * Get MRZ Code sequence in the first row at the bottom 
     * @return PassportCodeFirst MRZ Code sequence in the first row at the bottom
     */
    public String getPassportCodeFirst() {
        return this.PassportCodeFirst;
    }

    /**
     * Set MRZ Code sequence in the first row at the bottom
     * @param PassportCodeFirst MRZ Code sequence in the first row at the bottom
     */
    public void setPassportCodeFirst(String PassportCodeFirst) {
        this.PassportCodeFirst = PassportCodeFirst;
    }

    /**
     * Get MRZ Code sequence in the second line from the bottom 
     * @return PassportCodeSecond MRZ Code sequence in the second line from the bottom
     */
    public String getPassportCodeSecond() {
        return this.PassportCodeSecond;
    }

    /**
     * Set MRZ Code sequence in the second line from the bottom
     * @param PassportCodeSecond MRZ Code sequence in the second line from the bottom
     */
    public void setPassportCodeSecond(String PassportCodeSecond) {
        this.PassportCodeSecond = PassportCodeSecond;
    }

    public InternationalIDPassport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InternationalIDPassport(InternationalIDPassport source) {
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.Surname != null) {
            this.Surname = new String(source.Surname);
        }
        if (source.GivenName != null) {
            this.GivenName = new String(source.GivenName);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.DateOfExpiration != null) {
            this.DateOfExpiration = new String(source.DateOfExpiration);
        }
        if (source.IssuingCountry != null) {
            this.IssuingCountry = new String(source.IssuingCountry);
        }
        if (source.NationalityCode != null) {
            this.NationalityCode = new String(source.NationalityCode);
        }
        if (source.PassportCodeFirst != null) {
            this.PassportCodeFirst = new String(source.PassportCodeFirst);
        }
        if (source.PassportCodeSecond != null) {
            this.PassportCodeSecond = new String(source.PassportCodeSecond);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Surname", this.Surname);
        this.setParamSimple(map, prefix + "GivenName", this.GivenName);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "DateOfExpiration", this.DateOfExpiration);
        this.setParamSimple(map, prefix + "IssuingCountry", this.IssuingCountry);
        this.setParamSimple(map, prefix + "NationalityCode", this.NationalityCode);
        this.setParamSimple(map, prefix + "PassportCodeFirst", this.PassportCodeFirst);
        this.setParamSimple(map, prefix + "PassportCodeSecond", this.PassportCodeSecond);

    }
}

