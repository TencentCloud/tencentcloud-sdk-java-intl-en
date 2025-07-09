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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Place extends AbstractModel {

    /**
    * City ID
    */
    @SerializedName("CityId")
    @Expose
    private Long CityId;

    /**
    * Province ID
    */
    @SerializedName("ProvinceId")
    @Expose
    private Long ProvinceId;

    /**
    * Country ID. Currently, only 1 is supported, indicating China.
    */
    @SerializedName("CountryId")
    @Expose
    private Long CountryId;

    /**
    * Location name
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
     * Get City ID 
     * @return CityId City ID
     */
    public Long getCityId() {
        return this.CityId;
    }

    /**
     * Set City ID
     * @param CityId City ID
     */
    public void setCityId(Long CityId) {
        this.CityId = CityId;
    }

    /**
     * Get Province ID 
     * @return ProvinceId Province ID
     */
    public Long getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * Set Province ID
     * @param ProvinceId Province ID
     */
    public void setProvinceId(Long ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * Get Country ID. Currently, only 1 is supported, indicating China. 
     * @return CountryId Country ID. Currently, only 1 is supported, indicating China.
     */
    public Long getCountryId() {
        return this.CountryId;
    }

    /**
     * Set Country ID. Currently, only 1 is supported, indicating China.
     * @param CountryId Country ID. Currently, only 1 is supported, indicating China.
     */
    public void setCountryId(Long CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Get Location name 
     * @return Location Location name
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Location name
     * @param Location Location name
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Place() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Place(Place source) {
        if (source.CityId != null) {
            this.CityId = new Long(source.CityId);
        }
        if (source.ProvinceId != null) {
            this.ProvinceId = new Long(source.ProvinceId);
        }
        if (source.CountryId != null) {
            this.CountryId = new Long(source.CountryId);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "ProvinceId", this.ProvinceId);
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

