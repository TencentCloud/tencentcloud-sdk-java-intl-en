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

public class SingaporeIDCard extends AbstractModel {

    /**
    * Chinese Name
    */
    @SerializedName("ChName")
    @Expose
    private String ChName;

    /**
    * Chinese Name
    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * English name
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * English name
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Identity card number
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Identity number
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Sex
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Country of birth
    */
    @SerializedName("CountryOfBirth")
    @Expose
    private String CountryOfBirth;

    /**
    * Country of birth
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Birthday
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Address (back field)
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Nationality (back field)
    */
    @SerializedName("Race")
    @Expose
    private String Race;

    /**
    * Nric number (back field)
    */
    @SerializedName("NRICCode")
    @Expose
    private String NRICCode;

    /**
    * Post number (back field)
    */
    @SerializedName("PostCode")
    @Expose
    private String PostCode;

    /**
    * Expires on (back field)
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * Issue date (field on the back)
    */
    @SerializedName("DateOfIssue")
    @Expose
    private String DateOfIssue;

    /**
     * Get Chinese Name 
     * @return ChName Chinese Name
     * @deprecated
     */
    @Deprecated
    public String getChName() {
        return this.ChName;
    }

    /**
     * Set Chinese Name
     * @param ChName Chinese Name
     * @deprecated
     */
    @Deprecated
    public void setChName(String ChName) {
        this.ChName = ChName;
    }

    /**
     * Get Chinese Name 
     * @return ChineseName Chinese Name
     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set Chinese Name
     * @param ChineseName Chinese Name
     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get English name 
     * @return EnName English name
     * @deprecated
     */
    @Deprecated
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set English name
     * @param EnName English name
     * @deprecated
     */
    @Deprecated
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get English name 
     * @return FullName English name
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set English name
     * @param FullName English name
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Identity card number 
     * @return ID Identity card number
     * @deprecated
     */
    @Deprecated
    public String getID() {
        return this.ID;
    }

    /**
     * Set Identity card number
     * @param ID Identity card number
     * @deprecated
     */
    @Deprecated
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Identity number 
     * @return LicenseNumber Identity number
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set Identity number
     * @param LicenseNumber Identity number
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Sex 
     * @return Sex Sex
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Sex
     * @param Sex Sex
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Country of birth 
     * @return CountryOfBirth Country of birth
     * @deprecated
     */
    @Deprecated
    public String getCountryOfBirth() {
        return this.CountryOfBirth;
    }

    /**
     * Set Country of birth
     * @param CountryOfBirth Country of birth
     * @deprecated
     */
    @Deprecated
    public void setCountryOfBirth(String CountryOfBirth) {
        this.CountryOfBirth = CountryOfBirth;
    }

    /**
     * Get Country of birth 
     * @return Nationality Country of birth
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Country of birth
     * @param Nationality Country of birth
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Birthday 
     * @return Birthday Birthday
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday
     * @param Birthday Birthday
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Address (back field) 
     * @return Address Address (back field)
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address (back field)
     * @param Address Address (back field)
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Nationality (back field) 
     * @return Race Nationality (back field)
     */
    public String getRace() {
        return this.Race;
    }

    /**
     * Set Nationality (back field)
     * @param Race Nationality (back field)
     */
    public void setRace(String Race) {
        this.Race = Race;
    }

    /**
     * Get Nric number (back field) 
     * @return NRICCode Nric number (back field)
     */
    public String getNRICCode() {
        return this.NRICCode;
    }

    /**
     * Set Nric number (back field)
     * @param NRICCode Nric number (back field)
     */
    public void setNRICCode(String NRICCode) {
        this.NRICCode = NRICCode;
    }

    /**
     * Get Post number (back field) 
     * @return PostCode Post number (back field)
     */
    public String getPostCode() {
        return this.PostCode;
    }

    /**
     * Set Post number (back field)
     * @param PostCode Post number (back field)
     */
    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

    /**
     * Get Expires on (back field) 
     * @return DateOfExpiration Expires on (back field)
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set Expires on (back field)
     * @param DateOfExpiration Expires on (back field)
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get Issue date (field on the back) 
     * @return DateOfIssue Issue date (field on the back)
     */
    public String getDateOfIssue() {
        return this.DateOfIssue;
    }

    /**
     * Set Issue date (field on the back)
     * @param DateOfIssue Issue date (field on the back)
     */
    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    public SingaporeIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingaporeIDCard(SingaporeIDCard source) {
        if (source.ChName != null) {
            this.ChName = new String(source.ChName);
        }
        if (source.ChineseName != null) {
            this.ChineseName = new String(source.ChineseName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.CountryOfBirth != null) {
            this.CountryOfBirth = new String(source.CountryOfBirth);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Race != null) {
            this.Race = new String(source.Race);
        }
        if (source.NRICCode != null) {
            this.NRICCode = new String(source.NRICCode);
        }
        if (source.PostCode != null) {
            this.PostCode = new String(source.PostCode);
        }
        if (source.DateOfExpiration != null) {
            this.DateOfExpiration = new String(source.DateOfExpiration);
        }
        if (source.DateOfIssue != null) {
            this.DateOfIssue = new String(source.DateOfIssue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChName", this.ChName);
        this.setParamSimple(map, prefix + "ChineseName", this.ChineseName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "CountryOfBirth", this.CountryOfBirth);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Race", this.Race);
        this.setParamSimple(map, prefix + "NRICCode", this.NRICCode);
        this.setParamSimple(map, prefix + "PostCode", this.PostCode);
        this.setParamSimple(map, prefix + "DateOfExpiration", this.DateOfExpiration);
        this.setParamSimple(map, prefix + "DateOfIssue", this.DateOfIssue);

    }
}

