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
    * Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChName")
    @Expose
    private String ChName;

    /**
    * Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * English name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * English name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Gender
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Country of birth
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CountryOfBirth")
    @Expose
    private String CountryOfBirth;

    /**
    * Nationality
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Address (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Race (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Race")
    @Expose
    private String Race;

    /**
    *  NRIC number (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NRICCode")
    @Expose
    private String NRICCode;

    /**
    * Post number (on the front)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PostCode")
    @Expose
    private String PostCode;

    /**
    * Date of expiry (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * Date of issue (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DateOfIssue")
    @Expose
    private String DateOfIssue;

    /**
     * Get Chinese name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getChName() {
        return this.ChName;
    }

    /**
     * Set Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setChName(String ChName) {
        this.ChName = ChName;
    }

    /**
     * Get Chinese name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChineseName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChineseName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get English name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnName English name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set English name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnName English name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get English name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName English name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set English name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName English name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get License number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID License number
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getID() {
        return this.ID;
    }

    /**
     * Set License number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID License number
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setID(String ID) {
        this.ID = ID;
    }

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
     * Get Gender
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Gender
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Gender
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Country of birth
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CountryOfBirth Country of birth
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getCountryOfBirth() {
        return this.CountryOfBirth;
    }

    /**
     * Set Country of birth
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CountryOfBirth Country of birth
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setCountryOfBirth(String CountryOfBirth) {
        this.CountryOfBirth = CountryOfBirth;
    }

    /**
     * Get Nationality
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nationality Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nationality Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
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
     * Get Address (on the back)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Address (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Race (on the back)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Race Race (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRace() {
        return this.Race;
    }

    /**
     * Set Race (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Race Race (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRace(String Race) {
        this.Race = Race;
    }

    /**
     * Get  NRIC number (on the back)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NRICCode  NRIC number (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNRICCode() {
        return this.NRICCode;
    }

    /**
     * Set  NRIC number (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NRICCode  NRIC number (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNRICCode(String NRICCode) {
        this.NRICCode = NRICCode;
    }

    /**
     * Get Post number (on the front)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PostCode Post number (on the front)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPostCode() {
        return this.PostCode;
    }

    /**
     * Set Post number (on the front)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PostCode Post number (on the front)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

    /**
     * Get Date of expiry (on the back)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DateOfExpiration Date of expiry (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set Date of expiry (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DateOfExpiration Date of expiry (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get Date of issue (on the back)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DateOfIssue Date of issue (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDateOfIssue() {
        return this.DateOfIssue;
    }

    /**
     * Set Date of issue (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DateOfIssue Date of issue (on the back)
Note: This field may return null, indicating that no valid values can be obtained.
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

