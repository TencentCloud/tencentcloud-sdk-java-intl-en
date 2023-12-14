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

public class InternationalIDPassport extends AbstractModel {

    /**
    * Passport ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Full name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Last name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * First name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Gender (F-Female, M-Male)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * Issuing country
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * Nationality code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NationalityCode")
    @Expose
    private String NationalityCode;

    /**
    * The first line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassportCodeFirst")
    @Expose
    private String PassportCodeFirst;

    /**
    * The second line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PassportCodeSecond")
    @Expose
    private String PassportCodeSecond;

    /**
     * Get Passport ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseNumber Passport ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set Passport ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseNumber Passport ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Full name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName Full name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Full name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName Full name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Last name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Surname Last name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set Last name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Surname Last name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get First name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GivenName First name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set First name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GivenName First name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
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
     * Get Gender (F-Female, M-Male)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Gender (F-Female, M-Male)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender (F-Female, M-Male)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Gender (F-Female, M-Male)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Expiration date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DateOfExpiration Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DateOfExpiration Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get Issuing country
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuingCountry Issuing country
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set Issuing country
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuingCountry Issuing country
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get Nationality code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NationalityCode Nationality code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNationalityCode() {
        return this.NationalityCode;
    }

    /**
     * Set Nationality code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NationalityCode Nationality code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNationalityCode(String NationalityCode) {
        this.NationalityCode = NationalityCode;
    }

    /**
     * Get The first line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassportCodeFirst The first line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassportCodeFirst() {
        return this.PassportCodeFirst;
    }

    /**
     * Set The first line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassportCodeFirst The first line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPassportCodeFirst(String PassportCodeFirst) {
        this.PassportCodeFirst = PassportCodeFirst;
    }

    /**
     * Get The second line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PassportCodeSecond The second line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPassportCodeSecond() {
        return this.PassportCodeSecond;
    }

    /**
     * Set The second line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PassportCodeSecond The second line at the bottom, the MRZ Code sequence
Note: This field may return null, indicating that no valid values can be obtained.
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

