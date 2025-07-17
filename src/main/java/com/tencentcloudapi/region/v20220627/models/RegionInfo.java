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
package com.tencentcloudapi.region.v20220627.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * Region name, such as ap-guangzhou.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region description, for example, South China (Guangzhou).
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Whether the region is in an available state.
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
    * Console type. defaults to null when called via api.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionTypeMC")
    @Expose
    private Long RegionTypeMC;

    /**
    * Region for different languages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocationMC")
    @Expose
    private String LocationMC;

    /**
    * Region description on console display.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionNameMC")
    @Expose
    private String RegionNameMC;

    /**
    * 1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionIdMC")
    @Expose
    private String RegionIdMC;

    /**
     * Get Region name, such as ap-guangzhou. 
     * @return Region Region name, such as ap-guangzhou.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region name, such as ap-guangzhou.
     * @param Region Region name, such as ap-guangzhou.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region description, for example, South China (Guangzhou). 
     * @return RegionName Region description, for example, South China (Guangzhou).
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region description, for example, South China (Guangzhou).
     * @param RegionName Region description, for example, South China (Guangzhou).
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Whether the region is in an available state. 
     * @return RegionState Whether the region is in an available state.
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * Set Whether the region is in an available state.
     * @param RegionState Whether the region is in an available state.
     */
    public void setRegionState(String RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Get Console type. defaults to null when called via api.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionTypeMC Console type. defaults to null when called via api.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionTypeMC() {
        return this.RegionTypeMC;
    }

    /**
     * Set Console type. defaults to null when called via api.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionTypeMC Console type. defaults to null when called via api.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionTypeMC(Long RegionTypeMC) {
        this.RegionTypeMC = RegionTypeMC;
    }

    /**
     * Get Region for different languages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocationMC Region for different languages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocationMC() {
        return this.LocationMC;
    }

    /**
     * Set Region for different languages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocationMC Region for different languages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocationMC(String LocationMC) {
        this.LocationMC = LocationMC;
    }

    /**
     * Get Region description on console display.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionNameMC Region description on console display.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionNameMC() {
        return this.RegionNameMC;
    }

    /**
     * Set Region description on console display.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionNameMC Region description on console display.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionNameMC(String RegionNameMC) {
        this.RegionNameMC = RegionNameMC;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionIdMC 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionIdMC() {
        return this.RegionIdMC;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionIdMC 1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionIdMC(String RegionIdMC) {
        this.RegionIdMC = RegionIdMC;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionState != null) {
            this.RegionState = new String(source.RegionState);
        }
        if (source.RegionTypeMC != null) {
            this.RegionTypeMC = new Long(source.RegionTypeMC);
        }
        if (source.LocationMC != null) {
            this.LocationMC = new String(source.LocationMC);
        }
        if (source.RegionNameMC != null) {
            this.RegionNameMC = new String(source.RegionNameMC);
        }
        if (source.RegionIdMC != null) {
            this.RegionIdMC = new String(source.RegionIdMC);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);
        this.setParamSimple(map, prefix + "RegionTypeMC", this.RegionTypeMC);
        this.setParamSimple(map, prefix + "LocationMC", this.LocationMC);
        this.setParamSimple(map, prefix + "RegionNameMC", this.RegionNameMC);
        this.setParamSimple(map, prefix + "RegionIdMC", this.RegionIdMC);

    }
}

