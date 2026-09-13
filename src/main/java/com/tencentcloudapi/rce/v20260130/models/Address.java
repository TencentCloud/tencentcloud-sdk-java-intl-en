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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel {

    /**
    * <p>Country</p><p>Parameter format: Compliant with the ISO 3166 standard</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>Province</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>City</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>Region</p>
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * <p>Detailed address</p>
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * <p>Postal code</p>
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

    /**
     * Get <p>Country</p><p>Parameter format: Compliant with the ISO 3166 standard</p> 
     * @return Country <p>Country</p><p>Parameter format: Compliant with the ISO 3166 standard</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>Country</p><p>Parameter format: Compliant with the ISO 3166 standard</p>
     * @param Country <p>Country</p><p>Parameter format: Compliant with the ISO 3166 standard</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>Province</p> 
     * @return Region <p>Province</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Province</p>
     * @param Region <p>Province</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>City</p> 
     * @return City <p>City</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>City</p>
     * @param City <p>City</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>Region</p> 
     * @return District <p>Region</p>
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set <p>Region</p>
     * @param District <p>Region</p>
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get <p>Detailed address</p> 
     * @return Detail <p>Detailed address</p>
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>Detailed address</p>
     * @param Detail <p>Detailed address</p>
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>Postal code</p> 
     * @return ZipCode <p>Postal code</p>
     */
    public String getZipCode() {
        return this.ZipCode;
    }

    /**
     * Set <p>Postal code</p>
     * @param ZipCode <p>Postal code</p>
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.ZipCode != null) {
            this.ZipCode = new String(source.ZipCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "ZipCode", this.ZipCode);

    }
}

