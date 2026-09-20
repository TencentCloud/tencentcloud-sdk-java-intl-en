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

public class PakistanDrivingLicense extends AbstractModel {

    /**
    * Last name
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Name
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Identity card
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Age
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Birthday
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * City of issuance
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
     * Get Name 
     * @return FirstName Name
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set Name
     * @param FirstName Name
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get Identity card 
     * @return LicenseNumber Identity card
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set Identity card
     * @param LicenseNumber Identity card
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Age 
     * @return Age Age
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set Age
     * @param Age Age
     */
    public void setAge(String Age) {
        this.Age = Age;
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
     * Get City of issuance 
     * @return IssuedCountry City of issuance
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set City of issuance
     * @param IssuedCountry City of issuance
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    public PakistanDrivingLicense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PakistanDrivingLicense(PakistanDrivingLicense source) {
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

    }
}

