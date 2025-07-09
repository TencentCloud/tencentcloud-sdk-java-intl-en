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

public class NigeriaDrivingLicense extends AbstractModel {

    /**
    * Last name.
Note: This field may return null, indicating that no valid values can be obtained.

    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * First name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * License number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Age.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Birthday.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Issued country.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * Expiration date.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * Issued date.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Gender.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
     * Get Last name.
Note: This field may return null, indicating that no valid values can be obtained.
 
     * @return LastName Last name.
Note: This field may return null, indicating that no valid values can be obtained.

     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set Last name.
Note: This field may return null, indicating that no valid values can be obtained.

     * @param LastName Last name.
Note: This field may return null, indicating that no valid values can be obtained.

     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get First name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstName First name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set First name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstName First name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get License number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseNumber License number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set License number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseNumber License number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Age.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Age Age.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set Age.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Age Age.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get Birthday.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthday Birthday.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthday Birthday.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Issued country.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedCountry Issued country.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set Issued country.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedCountry Issued country.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get Expiration date.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpirationDate Expiration date.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration date.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpirationDate Expiration date.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get Issued date.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedDate Issued date.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Issued date.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedDate Issued date.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Gender.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Gender.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Gender.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public NigeriaDrivingLicense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NigeriaDrivingLicense(NigeriaDrivingLicense source) {
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.IssuedCountry != null) {
            this.IssuedCountry = new String(source.IssuedCountry);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "IssuedCountry", this.IssuedCountry);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "Sex", this.Sex);

    }
}

