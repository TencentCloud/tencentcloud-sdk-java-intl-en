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

public class IPLocation extends AbstractModel {

    /**
    * <p>The country of the IP address</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * <p>The region of the IP address</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>The city of the IP address</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>The district of the IP address</p>
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * <p>The longitude of the IP address</p>
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * <p>The latitude of the IP address</p>
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * <p>The timezone of the IP address</p>
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * <p>The zip code of the IP address</p>
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

    /**
     * Get <p>The country of the IP address</p> 
     * @return Country <p>The country of the IP address</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>The country of the IP address</p>
     * @param Country <p>The country of the IP address</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get <p>The region of the IP address</p> 
     * @return Region <p>The region of the IP address</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>The region of the IP address</p>
     * @param Region <p>The region of the IP address</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>The city of the IP address</p> 
     * @return City <p>The city of the IP address</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>The city of the IP address</p>
     * @param City <p>The city of the IP address</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>The district of the IP address</p> 
     * @return District <p>The district of the IP address</p>
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set <p>The district of the IP address</p>
     * @param District <p>The district of the IP address</p>
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get <p>The longitude of the IP address</p> 
     * @return Longitude <p>The longitude of the IP address</p>
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set <p>The longitude of the IP address</p>
     * @param Longitude <p>The longitude of the IP address</p>
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get <p>The latitude of the IP address</p> 
     * @return Latitude <p>The latitude of the IP address</p>
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set <p>The latitude of the IP address</p>
     * @param Latitude <p>The latitude of the IP address</p>
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get <p>The timezone of the IP address</p> 
     * @return Timezone <p>The timezone of the IP address</p>
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set <p>The timezone of the IP address</p>
     * @param Timezone <p>The timezone of the IP address</p>
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get <p>The zip code of the IP address</p> 
     * @return ZipCode <p>The zip code of the IP address</p>
     */
    public String getZipCode() {
        return this.ZipCode;
    }

    /**
     * Set <p>The zip code of the IP address</p>
     * @param ZipCode <p>The zip code of the IP address</p>
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public IPLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPLocation(IPLocation source) {
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
        if (source.Longitude != null) {
            this.Longitude = new String(source.Longitude);
        }
        if (source.Latitude != null) {
            this.Latitude = new String(source.Latitude);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
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
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamSimple(map, prefix + "ZipCode", this.ZipCode);

    }
}

