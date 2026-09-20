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

public class ThailandIDCard extends AbstractModel {

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
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * Expiration date
    */
    @SerializedName("DateOfExpiry")
    @Expose
    private String DateOfExpiry;

    /**
    * Issue date
    */
    @SerializedName("DateOfIssue")
    @Expose
    private String DateOfIssue;

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
     * @return DateOfBirth Date of birth
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set Date of birth
     * @param DateOfBirth Date of birth
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get Expiration date 
     * @return DateOfExpiry Expiration date
     */
    public String getDateOfExpiry() {
        return this.DateOfExpiry;
    }

    /**
     * Set Expiration date
     * @param DateOfExpiry Expiration date
     */
    public void setDateOfExpiry(String DateOfExpiry) {
        this.DateOfExpiry = DateOfExpiry;
    }

    /**
     * Get Issue date 
     * @return DateOfIssue Issue date
     */
    public String getDateOfIssue() {
        return this.DateOfIssue;
    }

    /**
     * Set Issue date
     * @param DateOfIssue Issue date
     */
    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
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

    public ThailandIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThailandIDCard(ThailandIDCard source) {
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.DateOfBirth != null) {
            this.DateOfBirth = new String(source.DateOfBirth);
        }
        if (source.DateOfExpiry != null) {
            this.DateOfExpiry = new String(source.DateOfExpiry);
        }
        if (source.DateOfIssue != null) {
            this.DateOfIssue = new String(source.DateOfIssue);
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
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "DateOfExpiry", this.DateOfExpiry);
        this.setParamSimple(map, prefix + "DateOfIssue", this.DateOfIssue);
        this.setParamSimple(map, prefix + "IssuedCountry", this.IssuedCountry);

    }
}

