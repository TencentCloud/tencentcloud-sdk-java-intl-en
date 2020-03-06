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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableRegion extends AbstractModel{

    /**
    * Region name, such as "ap-beijing"
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region name, such as "bj"
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region availability. If a region has at least one AZ where resources are purchasable, this value will be `AVAILABLE`; otherwise, it will be `UNAVAILABLE`
    */
    @SerializedName("RegionStatus")
    @Expose
    private String RegionStatus;

    /**
    * Array of AZs
    */
    @SerializedName("Zones")
    @Expose
    private AvailableZone [] Zones;

    /**
    * Region name, such as "Guangzhou"
    */
    @SerializedName("RegionCnName")
    @Expose
    private String RegionCnName;

    /**
     * Get Region name, such as "ap-beijing" 
     * @return Region Region name, such as "ap-beijing"
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region name, such as "ap-beijing"
     * @param Region Region name, such as "ap-beijing"
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region name, such as "bj" 
     * @return RegionName Region name, such as "bj"
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name, such as "bj"
     * @param RegionName Region name, such as "bj"
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region availability. If a region has at least one AZ where resources are purchasable, this value will be `AVAILABLE`; otherwise, it will be `UNAVAILABLE` 
     * @return RegionStatus Region availability. If a region has at least one AZ where resources are purchasable, this value will be `AVAILABLE`; otherwise, it will be `UNAVAILABLE`
     */
    public String getRegionStatus() {
        return this.RegionStatus;
    }

    /**
     * Set Region availability. If a region has at least one AZ where resources are purchasable, this value will be `AVAILABLE`; otherwise, it will be `UNAVAILABLE`
     * @param RegionStatus Region availability. If a region has at least one AZ where resources are purchasable, this value will be `AVAILABLE`; otherwise, it will be `UNAVAILABLE`
     */
    public void setRegionStatus(String RegionStatus) {
        this.RegionStatus = RegionStatus;
    }

    /**
     * Get Array of AZs 
     * @return Zones Array of AZs
     */
    public AvailableZone [] getZones() {
        return this.Zones;
    }

    /**
     * Set Array of AZs
     * @param Zones Array of AZs
     */
    public void setZones(AvailableZone [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Region name, such as "Guangzhou" 
     * @return RegionCnName Region name, such as "Guangzhou"
     */
    public String getRegionCnName() {
        return this.RegionCnName;
    }

    /**
     * Set Region name, such as "Guangzhou"
     * @param RegionCnName Region name, such as "Guangzhou"
     */
    public void setRegionCnName(String RegionCnName) {
        this.RegionCnName = RegionCnName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionStatus", this.RegionStatus);
        this.setParamArrayObj(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "RegionCnName", this.RegionCnName);

    }
}

