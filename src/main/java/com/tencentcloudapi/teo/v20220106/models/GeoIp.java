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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeoIp extends AbstractModel{

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Country name
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * Continent name
    */
    @SerializedName("Continent")
    @Expose
    private String Continent;

    /**
    * Country name in English
    */
    @SerializedName("CountryEn")
    @Expose
    private String CountryEn;

    /**
    * Continent name in English
    */
    @SerializedName("ContinentEn")
    @Expose
    private String ContinentEn;

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Country name 
     * @return Country Country name
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set Country name
     * @param Country Country name
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get Continent name 
     * @return Continent Continent name
     */
    public String getContinent() {
        return this.Continent;
    }

    /**
     * Set Continent name
     * @param Continent Continent name
     */
    public void setContinent(String Continent) {
        this.Continent = Continent;
    }

    /**
     * Get Country name in English 
     * @return CountryEn Country name in English
     */
    public String getCountryEn() {
        return this.CountryEn;
    }

    /**
     * Set Country name in English
     * @param CountryEn Country name in English
     */
    public void setCountryEn(String CountryEn) {
        this.CountryEn = CountryEn;
    }

    /**
     * Get Continent name in English 
     * @return ContinentEn Continent name in English
     */
    public String getContinentEn() {
        return this.ContinentEn;
    }

    /**
     * Set Continent name in English
     * @param ContinentEn Continent name in English
     */
    public void setContinentEn(String ContinentEn) {
        this.ContinentEn = ContinentEn;
    }

    public GeoIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeoIp(GeoIp source) {
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Continent != null) {
            this.Continent = new String(source.Continent);
        }
        if (source.CountryEn != null) {
            this.CountryEn = new String(source.CountryEn);
        }
        if (source.ContinentEn != null) {
            this.ContinentEn = new String(source.ContinentEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Continent", this.Continent);
        this.setParamSimple(map, prefix + "CountryEn", this.CountryEn);
        this.setParamSimple(map, prefix + "ContinentEn", this.ContinentEn);

    }
}

