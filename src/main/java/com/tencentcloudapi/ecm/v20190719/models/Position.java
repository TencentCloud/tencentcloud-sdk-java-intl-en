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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Position extends AbstractModel {

    /**
    * Zone information of the instance.
    */
    @SerializedName("ZoneInfo")
    @Expose
    private ZoneInfo ZoneInfo;

    /**
    * Country/Region information of the instance.
    */
    @SerializedName("Country")
    @Expose
    private Country Country;

    /**
    * Area information of the instance.
    */
    @SerializedName("Area")
    @Expose
    private Area Area;

    /**
    * Province/State information of the instance.
    */
    @SerializedName("Province")
    @Expose
    private Province Province;

    /**
    * City information of the instance.
    */
    @SerializedName("City")
    @Expose
    private City City;

    /**
    * Region information of the instance.
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
     * Get Zone information of the instance. 
     * @return ZoneInfo Zone information of the instance.
     */
    public ZoneInfo getZoneInfo() {
        return this.ZoneInfo;
    }

    /**
     * Set Zone information of the instance.
     * @param ZoneInfo Zone information of the instance.
     */
    public void setZoneInfo(ZoneInfo ZoneInfo) {
        this.ZoneInfo = ZoneInfo;
    }

    /**
     * Get Country/Region information of the instance. 
     * @return Country Country/Region information of the instance.
     */
    public Country getCountry() {
        return this.Country;
    }

    /**
     * Set Country/Region information of the instance.
     * @param Country Country/Region information of the instance.
     */
    public void setCountry(Country Country) {
        this.Country = Country;
    }

    /**
     * Get Area information of the instance. 
     * @return Area Area information of the instance.
     */
    public Area getArea() {
        return this.Area;
    }

    /**
     * Set Area information of the instance.
     * @param Area Area information of the instance.
     */
    public void setArea(Area Area) {
        this.Area = Area;
    }

    /**
     * Get Province/State information of the instance. 
     * @return Province Province/State information of the instance.
     */
    public Province getProvince() {
        return this.Province;
    }

    /**
     * Set Province/State information of the instance.
     * @param Province Province/State information of the instance.
     */
    public void setProvince(Province Province) {
        this.Province = Province;
    }

    /**
     * Get City information of the instance. 
     * @return City City information of the instance.
     */
    public City getCity() {
        return this.City;
    }

    /**
     * Set City information of the instance.
     * @param City City information of the instance.
     */
    public void setCity(City City) {
        this.City = City;
    }

    /**
     * Get Region information of the instance. 
     * @return RegionInfo Region information of the instance.
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set Region information of the instance.
     * @param RegionInfo Region information of the instance.
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    public Position() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Position(Position source) {
        if (source.ZoneInfo != null) {
            this.ZoneInfo = new ZoneInfo(source.ZoneInfo);
        }
        if (source.Country != null) {
            this.Country = new Country(source.Country);
        }
        if (source.Area != null) {
            this.Area = new Area(source.Area);
        }
        if (source.Province != null) {
            this.Province = new Province(source.Province);
        }
        if (source.City != null) {
            this.City = new City(source.City);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ZoneInfo.", this.ZoneInfo);
        this.setParamObj(map, prefix + "Country.", this.Country);
        this.setParamObj(map, prefix + "Area.", this.Area);
        this.setParamObj(map, prefix + "Province.", this.Province);
        this.setParamObj(map, prefix + "City.", this.City);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);

    }
}

