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

public class MacaoIDCard extends AbstractModel {

    /**
    * First name
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Last name
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Birthday
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Expiration date
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

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
    * Age
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Issuing country
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * mrz field 1
    */
    @SerializedName("Field1")
    @Expose
    private String Field1;

    /**
    * mrz field 2
    */
    @SerializedName("Field2")
    @Expose
    private String Field2;

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

    /**
     * Get mrz field 1 
     * @return Field1 mrz field 1
     */
    public String getField1() {
        return this.Field1;
    }

    /**
     * Set mrz field 1
     * @param Field1 mrz field 1
     */
    public void setField1(String Field1) {
        this.Field1 = Field1;
    }

    /**
     * Get mrz field 2 
     * @return Field2 mrz field 2
     */
    public String getField2() {
        return this.Field2;
    }

    /**
     * Set mrz field 2
     * @param Field2 mrz field 2
     */
    public void setField2(String Field2) {
        this.Field2 = Field2;
    }

    public MacaoIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MacaoIDCard(MacaoIDCard source) {
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.IssuedCountry != null) {
            this.IssuedCountry = new String(source.IssuedCountry);
        }
        if (source.Field1 != null) {
            this.Field1 = new String(source.Field1);
        }
        if (source.Field2 != null) {
            this.Field2 = new String(source.Field2);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "IssuedCountry", this.IssuedCountry);
        this.setParamSimple(map, prefix + "Field1", this.Field1);
        this.setParamSimple(map, prefix + "Field2", this.Field2);

    }
}

