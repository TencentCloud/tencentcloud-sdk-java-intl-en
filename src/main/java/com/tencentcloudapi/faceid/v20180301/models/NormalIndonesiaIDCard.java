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

public class NormalIndonesiaIDCard extends AbstractModel {

    /**
    * ID number
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
    * Birthplace/Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Sex
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Blood type
    */
    @SerializedName("BloodType")
    @Expose
    private String BloodType;

    /**
    * Address.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * Street
    */
    @SerializedName("Street")
    @Expose
    private String Street;

    /**
    * Village
    */
    @SerializedName("Village")
    @Expose
    private String Village;

    /**
    * Region.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Religious belief
    */
    @SerializedName("Religion")
    @Expose
    private String Religion;

    /**
    * Marital status
    */
    @SerializedName("MaritalStatus")
    @Expose
    private String MaritalStatus;

    /**
    * Occupation
    */
    @SerializedName("Occupation")
    @Expose
    private String Occupation;

    /**
    * Nationality
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Validity period of the ID card
    */
    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    /**
    * Issue date
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Province
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * city
    */
    @SerializedName("City")
    @Expose
    private String City;

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
     * Get Birthplace/Date of birth 
     * @return Birthday Birthplace/Date of birth
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthplace/Date of birth
     * @param Birthday Birthplace/Date of birth
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
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
     * Get Blood type 
     * @return BloodType Blood type
     */
    public String getBloodType() {
        return this.BloodType;
    }

    /**
     * Set Blood type
     * @param BloodType Blood type
     */
    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    /**
     * Get Address. 
     * @return FormattedAddress Address.
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set Address.
     * @param FormattedAddress Address.
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get Street 
     * @return Street Street
     */
    public String getStreet() {
        return this.Street;
    }

    /**
     * Set Street
     * @param Street Street
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * Get Village 
     * @return Village Village
     */
    public String getVillage() {
        return this.Village;
    }

    /**
     * Set Village
     * @param Village Village
     */
    public void setVillage(String Village) {
        this.Village = Village;
    }

    /**
     * Get Region. 
     * @return Area Region.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region.
     * @param Area Region.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Religious belief 
     * @return Religion Religious belief
     */
    public String getReligion() {
        return this.Religion;
    }

    /**
     * Set Religious belief
     * @param Religion Religious belief
     */
    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    /**
     * Get Marital status 
     * @return MaritalStatus Marital status
     */
    public String getMaritalStatus() {
        return this.MaritalStatus;
    }

    /**
     * Set Marital status
     * @param MaritalStatus Marital status
     */
    public void setMaritalStatus(String MaritalStatus) {
        this.MaritalStatus = MaritalStatus;
    }

    /**
     * Get Occupation 
     * @return Occupation Occupation
     */
    public String getOccupation() {
        return this.Occupation;
    }

    /**
     * Set Occupation
     * @param Occupation Occupation
     */
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    /**
     * Get Nationality 
     * @return Nationality Nationality
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Nationality
     * @param Nationality Nationality
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Validity period of the ID card 
     * @return DueDate Validity period of the ID card
     */
    public String getDueDate() {
        return this.DueDate;
    }

    /**
     * Set Validity period of the ID card
     * @param DueDate Validity period of the ID card
     */
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * Get Issue date 
     * @return IssuedDate Issue date
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Issue date
     * @param IssuedDate Issue date
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Province 
     * @return Province Province
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province
     * @param Province Province
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get city 
     * @return City city
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set city
     * @param City city
     */
    public void setCity(String City) {
        this.City = City;
    }

    public NormalIndonesiaIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalIndonesiaIDCard(NormalIndonesiaIDCard source) {
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.BloodType != null) {
            this.BloodType = new String(source.BloodType);
        }
        if (source.FormattedAddress != null) {
            this.FormattedAddress = new String(source.FormattedAddress);
        }
        if (source.Street != null) {
            this.Street = new String(source.Street);
        }
        if (source.Village != null) {
            this.Village = new String(source.Village);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Religion != null) {
            this.Religion = new String(source.Religion);
        }
        if (source.MaritalStatus != null) {
            this.MaritalStatus = new String(source.MaritalStatus);
        }
        if (source.Occupation != null) {
            this.Occupation = new String(source.Occupation);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.DueDate != null) {
            this.DueDate = new String(source.DueDate);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "BloodType", this.BloodType);
        this.setParamSimple(map, prefix + "FormattedAddress", this.FormattedAddress);
        this.setParamSimple(map, prefix + "Street", this.Street);
        this.setParamSimple(map, prefix + "Village", this.Village);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Religion", this.Religion);
        this.setParamSimple(map, prefix + "MaritalStatus", this.MaritalStatus);
        this.setParamSimple(map, prefix + "Occupation", this.Occupation);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "DueDate", this.DueDate);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);

    }
}

