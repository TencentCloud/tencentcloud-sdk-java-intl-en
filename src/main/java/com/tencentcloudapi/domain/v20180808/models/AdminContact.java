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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdminContact extends AbstractModel{

    /**
    * The first name.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * The last name.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * The country or region name, such as `CN`.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * The province or state name.
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * The city name.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * The address line 1.
    */
    @SerializedName("AddressLine")
    @Expose
    private String AddressLine;

    /**
    * The zip code.
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

    /**
    * The email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * The mobile number, such as `+86.13600000000`.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * The company or organization name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * The job title.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobTitle")
    @Expose
    private String JobTitle;

    /**
    * The address line 2.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressLineTwo")
    @Expose
    private String AddressLineTwo;

    /**
    * The fax number.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fax")
    @Expose
    private String Fax;

    /**
     * Get The first name. 
     * @return FirstName The first name.
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set The first name.
     * @param FirstName The first name.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get The last name. 
     * @return LastName The last name.
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set The last name.
     * @param LastName The last name.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get The country or region name, such as `CN`. 
     * @return Country The country or region name, such as `CN`.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set The country or region name, such as `CN`.
     * @param Country The country or region name, such as `CN`.
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get The province or state name. 
     * @return Province The province or state name.
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set The province or state name.
     * @param Province The province or state name.
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get The city name. 
     * @return City The city name.
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set The city name.
     * @param City The city name.
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get The address line 1. 
     * @return AddressLine The address line 1.
     */
    public String getAddressLine() {
        return this.AddressLine;
    }

    /**
     * Set The address line 1.
     * @param AddressLine The address line 1.
     */
    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    /**
     * Get The zip code. 
     * @return ZipCode The zip code.
     */
    public String getZipCode() {
        return this.ZipCode;
    }

    /**
     * Set The zip code.
     * @param ZipCode The zip code.
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    /**
     * Get The email address. 
     * @return Email The email address.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set The email address.
     * @param Email The email address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get The mobile number, such as `+86.13600000000`. 
     * @return Phone The mobile number, such as `+86.13600000000`.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set The mobile number, such as `+86.13600000000`.
     * @param Phone The mobile number, such as `+86.13600000000`.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get The company or organization name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompanyName The company or organization name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set The company or organization name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompanyName The company or organization name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get The job title.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobTitle The job title.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobTitle() {
        return this.JobTitle;
    }

    /**
     * Set The job title.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobTitle The job title.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    /**
     * Get The address line 2.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddressLineTwo The address line 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddressLineTwo() {
        return this.AddressLineTwo;
    }

    /**
     * Set The address line 2.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddressLineTwo The address line 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressLineTwo(String AddressLineTwo) {
        this.AddressLineTwo = AddressLineTwo;
    }

    /**
     * Get The fax number.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fax The fax number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFax() {
        return this.Fax;
    }

    /**
     * Set The fax number.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fax The fax number.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public AdminContact() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdminContact(AdminContact source) {
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.AddressLine != null) {
            this.AddressLine = new String(source.AddressLine);
        }
        if (source.ZipCode != null) {
            this.ZipCode = new String(source.ZipCode);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.JobTitle != null) {
            this.JobTitle = new String(source.JobTitle);
        }
        if (source.AddressLineTwo != null) {
            this.AddressLineTwo = new String(source.AddressLineTwo);
        }
        if (source.Fax != null) {
            this.Fax = new String(source.Fax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "AddressLine", this.AddressLine);
        this.setParamSimple(map, prefix + "ZipCode", this.ZipCode);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "JobTitle", this.JobTitle);
        this.setParamSimple(map, prefix + "AddressLineTwo", this.AddressLineTwo);
        this.setParamSimple(map, prefix + "Fax", this.Fax);

    }
}

