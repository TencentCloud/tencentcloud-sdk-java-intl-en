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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntlContactInfo extends AbstractModel {

    /**
    * The city name.
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * The country or region name.
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * The email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * The domain registrant.
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * The province or state name.
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * The name of the registrant.
    */
    @SerializedName("RegistrantName")
    @Expose
    private String RegistrantName;

    /**
    * The registrant type. Valid values: `I` (individual), `E` (organization).
    */
    @SerializedName("RegistrantType")
    @Expose
    private String RegistrantType;

    /**
    * The detailed address.
    */
    @SerializedName("Street")
    @Expose
    private String Street;

    /**
    * The mobile number.
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * The zip code.
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

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
    * The company name.
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

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
     * Get The country or region name. 
     * @return Country The country or region name.
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set The country or region name.
     * @param Country The country or region name.
     */
    public void setCountry(String Country) {
        this.Country = Country;
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
     * Get The domain registrant. 
     * @return OrganizationName The domain registrant.
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set The domain registrant.
     * @param OrganizationName The domain registrant.
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
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
     * Get The name of the registrant. 
     * @return RegistrantName The name of the registrant.
     */
    public String getRegistrantName() {
        return this.RegistrantName;
    }

    /**
     * Set The name of the registrant.
     * @param RegistrantName The name of the registrant.
     */
    public void setRegistrantName(String RegistrantName) {
        this.RegistrantName = RegistrantName;
    }

    /**
     * Get The registrant type. Valid values: `I` (individual), `E` (organization). 
     * @return RegistrantType The registrant type. Valid values: `I` (individual), `E` (organization).
     */
    public String getRegistrantType() {
        return this.RegistrantType;
    }

    /**
     * Set The registrant type. Valid values: `I` (individual), `E` (organization).
     * @param RegistrantType The registrant type. Valid values: `I` (individual), `E` (organization).
     */
    public void setRegistrantType(String RegistrantType) {
        this.RegistrantType = RegistrantType;
    }

    /**
     * Get The detailed address. 
     * @return Street The detailed address.
     */
    public String getStreet() {
        return this.Street;
    }

    /**
     * Set The detailed address.
     * @param Street The detailed address.
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * Get The mobile number. 
     * @return Telephone The mobile number.
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set The mobile number.
     * @param Telephone The mobile number.
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
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
     * Get The company name. 
     * @return CompanyName The company name.
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set The company name.
     * @param CompanyName The company name.
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public IntlContactInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntlContactInfo(IntlContactInfo source) {
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.RegistrantName != null) {
            this.RegistrantName = new String(source.RegistrantName);
        }
        if (source.RegistrantType != null) {
            this.RegistrantType = new String(source.RegistrantType);
        }
        if (source.Street != null) {
            this.Street = new String(source.Street);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.ZipCode != null) {
            this.ZipCode = new String(source.ZipCode);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "RegistrantName", this.RegistrantName);
        this.setParamSimple(map, prefix + "RegistrantType", this.RegistrantType);
        this.setParamSimple(map, prefix + "Street", this.Street);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "ZipCode", this.ZipCode);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);

    }
}

