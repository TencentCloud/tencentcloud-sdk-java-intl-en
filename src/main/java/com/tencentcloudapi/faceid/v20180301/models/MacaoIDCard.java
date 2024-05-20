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

public class MacaoIDCard extends AbstractModel {

    /**
    * First name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Last name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Sex
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Age
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Issued country
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * MRZ1 on card
Note: This field may return null, indicating that no valid values can be obtained. 
    */
    @SerializedName("Field1")
    @Expose
    private String Field1;

    /**
    * MRZ2 on card
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Field2")
    @Expose
    private String Field2;

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
     * Get Expiration date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpirationDate Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpirationDate Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
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
     * Get Sex
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Sex
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Sex
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Sex
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Age
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Age Age
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set Age
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Age Age
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get Issued country
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedCountry Issued country
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set Issued country
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedCountry Issued country
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get MRZ1 on card
Note: This field may return null, indicating that no valid values can be obtained.  
     * @return Field1 MRZ1 on card
Note: This field may return null, indicating that no valid values can be obtained. 
     */
    public String getField1() {
        return this.Field1;
    }

    /**
     * Set MRZ1 on card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @param Field1 MRZ1 on card
Note: This field may return null, indicating that no valid values can be obtained. 
     */
    public void setField1(String Field1) {
        this.Field1 = Field1;
    }

    /**
     * Get MRZ2 on card
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Field2 MRZ2 on card
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getField2() {
        return this.Field2;
    }

    /**
     * Set MRZ2 on card
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Field2 MRZ2 on card
Note: This field may return null, indicating that no valid values can be obtained.
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

