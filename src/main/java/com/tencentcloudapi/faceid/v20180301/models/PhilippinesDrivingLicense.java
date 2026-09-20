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

public class PhilippinesDrivingLicense extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Last name

    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * First name
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Middle name
    */
    @SerializedName("MiddleName")
    @Expose
    private String MiddleName;

    /**
    * Nationality
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Sex
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * ID number
    */
    @SerializedName("LicenseNo")
    @Expose
    private String LicenseNo;

    /**
    * Validity period.
    */
    @SerializedName("ExpiresDate")
    @Expose
    private String ExpiresDate;

    /**
    * Organization code
    */
    @SerializedName("AgencyCode")
    @Expose
    private String AgencyCode;

    /**
    * Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get First name 
     * @return FirstName First name
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set First name
     * @param FirstName First name
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get Middle name 
     * @return MiddleName Middle name
     */
    public String getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set Middle name
     * @param MiddleName Middle name
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
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
     * Get Address. 
     * @return Address Address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address.
     * @param Address Address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get ID number 
     * @return LicenseNo ID number
     */
    public String getLicenseNo() {
        return this.LicenseNo;
    }

    /**
     * Set ID number
     * @param LicenseNo ID number
     */
    public void setLicenseNo(String LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    /**
     * Get Validity period. 
     * @return ExpiresDate Validity period.
     */
    public String getExpiresDate() {
        return this.ExpiresDate;
    }

    /**
     * Set Validity period.
     * @param ExpiresDate Validity period.
     */
    public void setExpiresDate(String ExpiresDate) {
        this.ExpiresDate = ExpiresDate;
    }

    /**
     * Get Organization code 
     * @return AgencyCode Organization code
     */
    public String getAgencyCode() {
        return this.AgencyCode;
    }

    /**
     * Set Organization code
     * @param AgencyCode Organization code
     */
    public void setAgencyCode(String AgencyCode) {
        this.AgencyCode = AgencyCode;
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

    public PhilippinesDrivingLicense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhilippinesDrivingLicense(PhilippinesDrivingLicense source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new String(source.MiddleName);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.LicenseNo != null) {
            this.LicenseNo = new String(source.LicenseNo);
        }
        if (source.ExpiresDate != null) {
            this.ExpiresDate = new String(source.ExpiresDate);
        }
        if (source.AgencyCode != null) {
            this.AgencyCode = new String(source.AgencyCode);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "MiddleName", this.MiddleName);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "LicenseNo", this.LicenseNo);
        this.setParamSimple(map, prefix + "ExpiresDate", this.ExpiresDate);
        this.setParamSimple(map, prefix + "AgencyCode", this.AgencyCode);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);

    }
}

