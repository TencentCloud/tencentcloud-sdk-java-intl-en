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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Node extends AbstractModel {

    /**
    * Zone information.
    */
    @SerializedName("ZoneInfo")
    @Expose
    private ZoneInfo ZoneInfo;

    /**
    * Country/Region information.
    */
    @SerializedName("Country")
    @Expose
    private Country Country;

    /**
    * Region information.
    */
    @SerializedName("Area")
    @Expose
    private Area Area;

    /**
    * Province/State information.
    */
    @SerializedName("Province")
    @Expose
    private Province Province;

    /**
    * City information.
    */
    @SerializedName("City")
    @Expose
    private City City;

    /**
    * Region information.
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * List of ISPs.
    */
    @SerializedName("ISPSet")
    @Expose
    private ISP [] ISPSet;

    /**
    * Number of ISPs.
    */
    @SerializedName("ISPNum")
    @Expose
    private Long ISPNum;

    /**
     * Get Zone information. 
     * @return ZoneInfo Zone information.
     */
    public ZoneInfo getZoneInfo() {
        return this.ZoneInfo;
    }

    /**
     * Set Zone information.
     * @param ZoneInfo Zone information.
     */
    public void setZoneInfo(ZoneInfo ZoneInfo) {
        this.ZoneInfo = ZoneInfo;
    }

    /**
     * Get Country/Region information. 
     * @return Country Country/Region information.
     */
    public Country getCountry() {
        return this.Country;
    }

    /**
     * Set Country/Region information.
     * @param Country Country/Region information.
     */
    public void setCountry(Country Country) {
        this.Country = Country;
    }

    /**
     * Get Region information. 
     * @return Area Region information.
     */
    public Area getArea() {
        return this.Area;
    }

    /**
     * Set Region information.
     * @param Area Region information.
     */
    public void setArea(Area Area) {
        this.Area = Area;
    }

    /**
     * Get Province/State information. 
     * @return Province Province/State information.
     */
    public Province getProvince() {
        return this.Province;
    }

    /**
     * Set Province/State information.
     * @param Province Province/State information.
     */
    public void setProvince(Province Province) {
        this.Province = Province;
    }

    /**
     * Get City information. 
     * @return City City information.
     */
    public City getCity() {
        return this.City;
    }

    /**
     * Set City information.
     * @param City City information.
     */
    public void setCity(City City) {
        this.City = City;
    }

    /**
     * Get Region information. 
     * @return RegionInfo Region information.
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set Region information.
     * @param RegionInfo Region information.
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get List of ISPs. 
     * @return ISPSet List of ISPs.
     */
    public ISP [] getISPSet() {
        return this.ISPSet;
    }

    /**
     * Set List of ISPs.
     * @param ISPSet List of ISPs.
     */
    public void setISPSet(ISP [] ISPSet) {
        this.ISPSet = ISPSet;
    }

    /**
     * Get Number of ISPs. 
     * @return ISPNum Number of ISPs.
     */
    public Long getISPNum() {
        return this.ISPNum;
    }

    /**
     * Set Number of ISPs.
     * @param ISPNum Number of ISPs.
     */
    public void setISPNum(Long ISPNum) {
        this.ISPNum = ISPNum;
    }

    public Node() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Node(Node source) {
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
        if (source.ISPSet != null) {
            this.ISPSet = new ISP[source.ISPSet.length];
            for (int i = 0; i < source.ISPSet.length; i++) {
                this.ISPSet[i] = new ISP(source.ISPSet[i]);
            }
        }
        if (source.ISPNum != null) {
            this.ISPNum = new Long(source.ISPNum);
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
        this.setParamArrayObj(map, prefix + "ISPSet.", this.ISPSet);
        this.setParamSimple(map, prefix + "ISPNum", this.ISPNum);

    }
}

