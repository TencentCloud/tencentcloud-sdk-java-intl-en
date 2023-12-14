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

public class PhilippinesDrivingLicense extends AbstractModel {

    /**
    * Full Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Last name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * First name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Middle name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiddleName")
    @Expose
    private String MiddleName;

    /**
    * Nationality
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Gender
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNo")
    @Expose
    private String LicenseNo;

    /**
    * Date of expiry
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiresDate")
    @Expose
    private String ExpiresDate;

    /**
    * Agency code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AgencyCode")
    @Expose
    private String AgencyCode;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
     * Get Full Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Middle name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MiddleName Middle name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set Middle name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MiddleName Middle name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
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
     * Get Address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get License number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseNo License number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseNo() {
        return this.LicenseNo;
    }

    /**
     * Set License number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseNo License number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseNo(String LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    /**
     * Get Date of expiry
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpiresDate Date of expiry
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiresDate() {
        return this.ExpiresDate;
    }

    /**
     * Set Date of expiry
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpiresDate Date of expiry
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiresDate(String ExpiresDate) {
        this.ExpiresDate = ExpiresDate;
    }

    /**
     * Get Agency code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AgencyCode Agency code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAgencyCode() {
        return this.AgencyCode;
    }

    /**
     * Set Agency code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AgencyCode Agency code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAgencyCode(String AgencyCode) {
        this.AgencyCode = AgencyCode;
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

