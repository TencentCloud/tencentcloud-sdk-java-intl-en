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
    * 
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * 
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * 
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * 
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * 
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * 
    */
    @SerializedName("Field1")
    @Expose
    private String Field1;

    /**
    * 
    */
    @SerializedName("Field2")
    @Expose
    private String Field2;

    /**
     * Get  
     * @return FirstName 
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set 
     * @param FirstName 
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get  
     * @return LastName 
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set 
     * @param LastName 
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get  
     * @return Birthday 
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 
     * @param Birthday 
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get  
     * @return ExpirationDate 
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 
     * @param ExpirationDate 
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get  
     * @return LicenseNumber 
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set 
     * @param LicenseNumber 
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get  
     * @return Sex 
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 
     * @param Sex 
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get  
     * @return Age 
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set 
     * @param Age 
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get  
     * @return IssuedCountry 
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set 
     * @param IssuedCountry 
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get  
     * @return Field1 
     */
    public String getField1() {
        return this.Field1;
    }

    /**
     * Set 
     * @param Field1 
     */
    public void setField1(String Field1) {
        this.Field1 = Field1;
    }

    /**
     * Get  
     * @return Field2 
     */
    public String getField2() {
        return this.Field2;
    }

    /**
     * Set 
     * @param Field2 
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

