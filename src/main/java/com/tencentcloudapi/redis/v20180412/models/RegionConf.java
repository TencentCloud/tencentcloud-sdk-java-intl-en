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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionConf extends AbstractModel{

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region abbreviation
    */
    @SerializedName("RegionShortName")
    @Expose
    private String RegionShortName;

    /**
    * Name of the area where a region is located
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * AZ information
    */
    @SerializedName("ZoneSet")
    @Expose
    private ZoneCapacityConf [] ZoneSet;

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name 
     * @return RegionName Region name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
     * @param RegionName Region name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region abbreviation 
     * @return RegionShortName Region abbreviation
     */
    public String getRegionShortName() {
        return this.RegionShortName;
    }

    /**
     * Set Region abbreviation
     * @param RegionShortName Region abbreviation
     */
    public void setRegionShortName(String RegionShortName) {
        this.RegionShortName = RegionShortName;
    }

    /**
     * Get Name of the area where a region is located 
     * @return Area Name of the area where a region is located
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Name of the area where a region is located
     * @param Area Name of the area where a region is located
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get AZ information 
     * @return ZoneSet AZ information
     */
    public ZoneCapacityConf [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set AZ information
     * @param ZoneSet AZ information
     */
    public void setZoneSet(ZoneCapacityConf [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionShortName", this.RegionShortName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "ZoneSet.", this.ZoneSet);

    }
}

