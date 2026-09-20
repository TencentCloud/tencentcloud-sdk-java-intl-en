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

public class IndonesiaDrivingLicense extends AbstractModel {

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
    * No.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Expiration date
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * Issue date
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Issuing country
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

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
     * Get No. 
     * @return LicenseNumber No.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set No.
     * @param LicenseNumber No.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
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
     * Get Expiration date 
     * @return ExpirationDate Expiration date
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration date
     * @param ExpirationDate Expiration date
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
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
     * Get Issuing country 
     * @return IssuedCountry Issuing country
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set Issuing country
     * @param IssuedCountry Issuing country
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    public IndonesiaDrivingLicense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndonesiaDrivingLicense(IndonesiaDrivingLicense source) {
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.IssuedCountry != null) {
            this.IssuedCountry = new String(source.IssuedCountry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "IssuedCountry", this.IssuedCountry);

    }
}

