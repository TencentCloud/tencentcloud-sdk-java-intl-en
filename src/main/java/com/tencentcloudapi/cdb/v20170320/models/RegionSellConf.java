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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionSellConf extends AbstractModel{

    /**
    * Region name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Area
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Whether it is a default region
    */
    @SerializedName("IsDefaultRegion")
    @Expose
    private Long IsDefaultRegion;

    /**
    * Region name
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Sale configuration of the AZ
    */
    @SerializedName("ZonesConf")
    @Expose
    private ZoneSellConf [] ZonesConf;

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
     * Get Area 
     * @return Area Area
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Area
     * @param Area Area
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Whether it is a default region 
     * @return IsDefaultRegion Whether it is a default region
     */
    public Long getIsDefaultRegion() {
        return this.IsDefaultRegion;
    }

    /**
     * Set Whether it is a default region
     * @param IsDefaultRegion Whether it is a default region
     */
    public void setIsDefaultRegion(Long IsDefaultRegion) {
        this.IsDefaultRegion = IsDefaultRegion;
    }

    /**
     * Get Region name 
     * @return Region Region name
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region name
     * @param Region Region name
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Sale configuration of the AZ 
     * @return ZonesConf Sale configuration of the AZ
     */
    public ZoneSellConf [] getZonesConf() {
        return this.ZonesConf;
    }

    /**
     * Set Sale configuration of the AZ
     * @param ZonesConf Sale configuration of the AZ
     */
    public void setZonesConf(ZoneSellConf [] ZonesConf) {
        this.ZonesConf = ZonesConf;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "IsDefaultRegion", this.IsDefaultRegion);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "ZonesConf.", this.ZonesConf);

    }
}

