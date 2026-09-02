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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Place extends AbstractModel {

    /**
    * <p>City ID.</p>
    */
    @SerializedName("CityId")
    @Expose
    private Long CityId;

    /**
    * <p>Province ID.</p>
    */
    @SerializedName("ProvinceId")
    @Expose
    private Long ProvinceId;

    /**
    * <p>Country ID. Currently, only 1 is supported, indicating China.</p>
    */
    @SerializedName("CountryId")
    @Expose
    private Long CountryId;

    /**
    * <p>Location name.</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
     * Get <p>City ID.</p> 
     * @return CityId <p>City ID.</p>
     */
    public Long getCityId() {
        return this.CityId;
    }

    /**
     * Set <p>City ID.</p>
     * @param CityId <p>City ID.</p>
     */
    public void setCityId(Long CityId) {
        this.CityId = CityId;
    }

    /**
     * Get <p>Province ID.</p> 
     * @return ProvinceId <p>Province ID.</p>
     */
    public Long getProvinceId() {
        return this.ProvinceId;
    }

    /**
     * Set <p>Province ID.</p>
     * @param ProvinceId <p>Province ID.</p>
     */
    public void setProvinceId(Long ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    /**
     * Get <p>Country ID. Currently, only 1 is supported, indicating China.</p> 
     * @return CountryId <p>Country ID. Currently, only 1 is supported, indicating China.</p>
     */
    public Long getCountryId() {
        return this.CountryId;
    }

    /**
     * Set <p>Country ID. Currently, only 1 is supported, indicating China.</p>
     * @param CountryId <p>Country ID. Currently, only 1 is supported, indicating China.</p>
     */
    public void setCountryId(Long CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Get <p>Location name.</p> 
     * @return Location <p>Location name.</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>Location name.</p>
     * @param Location <p>Location name.</p>
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

