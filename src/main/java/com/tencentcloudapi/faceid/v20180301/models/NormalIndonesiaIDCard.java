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
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Gender
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Blood type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BloodType")
    @Expose
    private String BloodType;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * Street
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Street")
    @Expose
    private String Street;

    /**
    * Village
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Village")
    @Expose
    private String Village;

    /**
    * Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Religion")
    @Expose
    private String Religion;

    /**
    * Marital status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaritalStatus")
    @Expose
    private String MaritalStatus;

    /**
    * Job
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Occupation")
    @Expose
    private String Occupation;

    /**
    * Nationality
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * ID card validity period
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DueDate")
    @Expose
    private String DueDate;

    /**
    * Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Province
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * City
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("City")
    @Expose
    private String City;

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
     * Get Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthday Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthday Birth place/Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
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
     * Get Blood type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BloodType Blood type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBloodType() {
        return this.BloodType;
    }

    /**
     * Set Blood type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BloodType Blood type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    /**
     * Get Address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FormattedAddress Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FormattedAddress Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get Street
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Street Street
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStreet() {
        return this.Street;
    }

    /**
     * Set Street
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Street Street
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * Get Village
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Village Village
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVillage() {
        return this.Village;
    }

    /**
     * Set Village
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Village Village
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVillage(String Village) {
        this.Village = Village;
    }

    /**
     * Get Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Area Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Area Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Religion Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReligion() {
        return this.Religion;
    }

    /**
     * Set Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Religion Religious beliefs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    /**
     * Get Marital status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaritalStatus Marital status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMaritalStatus() {
        return this.MaritalStatus;
    }

    /**
     * Set Marital status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaritalStatus Marital status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaritalStatus(String MaritalStatus) {
        this.MaritalStatus = MaritalStatus;
    }

    /**
     * Get Job
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Occupation Job
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOccupation() {
        return this.Occupation;
    }

    /**
     * Set Job
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Occupation Job
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
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
     * Get ID card validity period
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DueDate ID card validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDueDate() {
        return this.DueDate;
    }

    /**
     * Set ID card validity period
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DueDate ID card validity period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * Get Date of issue
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedDate Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedDate Date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Province
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Province Province
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Province Province
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get City
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return City City
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City
Note: This field may return null, indicating that no valid values can be obtained.
     * @param City City
Note: This field may return null, indicating that no valid values can be obtained.
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

