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

public class Company extends AbstractModel {

    /**
    * <p>Enterprise name (required)</p>
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * <p>Enterprise registration number / unified social credit code (Option)</p>
    */
    @SerializedName("CompanyCertNumber")
    @Expose
    private String CompanyCertNumber;

    /**
    * <p>Enterprise registration country, ISO 3166-1 alpha-2 country code (Option)</p>
    */
    @SerializedName("CompanyCountry")
    @Expose
    private String CompanyCountry;

    /**
    * <p>Company address (optional)</p>
    */
    @SerializedName("CompanyAddress")
    @Expose
    private String CompanyAddress;

    /**
     * Get <p>Enterprise name (required)</p> 
     * @return CompanyName <p>Enterprise name (required)</p>
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set <p>Enterprise name (required)</p>
     * @param CompanyName <p>Enterprise name (required)</p>
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get <p>Enterprise registration number / unified social credit code (Option)</p> 
     * @return CompanyCertNumber <p>Enterprise registration number / unified social credit code (Option)</p>
     */
    public String getCompanyCertNumber() {
        return this.CompanyCertNumber;
    }

    /**
     * Set <p>Enterprise registration number / unified social credit code (Option)</p>
     * @param CompanyCertNumber <p>Enterprise registration number / unified social credit code (Option)</p>
     */
    public void setCompanyCertNumber(String CompanyCertNumber) {
        this.CompanyCertNumber = CompanyCertNumber;
    }

    /**
     * Get <p>Enterprise registration country, ISO 3166-1 alpha-2 country code (Option)</p> 
     * @return CompanyCountry <p>Enterprise registration country, ISO 3166-1 alpha-2 country code (Option)</p>
     */
    public String getCompanyCountry() {
        return this.CompanyCountry;
    }

    /**
     * Set <p>Enterprise registration country, ISO 3166-1 alpha-2 country code (Option)</p>
     * @param CompanyCountry <p>Enterprise registration country, ISO 3166-1 alpha-2 country code (Option)</p>
     */
    public void setCompanyCountry(String CompanyCountry) {
        this.CompanyCountry = CompanyCountry;
    }

    /**
     * Get <p>Company address (optional)</p> 
     * @return CompanyAddress <p>Company address (optional)</p>
     */
    public String getCompanyAddress() {
        return this.CompanyAddress;
    }

    /**
     * Set <p>Company address (optional)</p>
     * @param CompanyAddress <p>Company address (optional)</p>
     */
    public void setCompanyAddress(String CompanyAddress) {
        this.CompanyAddress = CompanyAddress;
    }

    public Company() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Company(Company source) {
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CompanyCertNumber != null) {
            this.CompanyCertNumber = new String(source.CompanyCertNumber);
        }
        if (source.CompanyCountry != null) {
            this.CompanyCountry = new String(source.CompanyCountry);
        }
        if (source.CompanyAddress != null) {
            this.CompanyAddress = new String(source.CompanyAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CompanyCertNumber", this.CompanyCertNumber);
        this.setParamSimple(map, prefix + "CompanyCountry", this.CompanyCountry);
        this.setParamSimple(map, prefix + "CompanyAddress", this.CompanyAddress);

    }
}

