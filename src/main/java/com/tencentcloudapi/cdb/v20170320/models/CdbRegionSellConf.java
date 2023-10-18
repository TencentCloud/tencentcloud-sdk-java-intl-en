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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbRegionSellConf extends AbstractModel {

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
    * The purchasable configuration in an AZ in a region
    */
    @SerializedName("RegionConfig")
    @Expose
    private CdbZoneSellConf [] RegionConfig;

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
     * Get The purchasable configuration in an AZ in a region 
     * @return RegionConfig The purchasable configuration in an AZ in a region
     */
    public CdbZoneSellConf [] getRegionConfig() {
        return this.RegionConfig;
    }

    /**
     * Set The purchasable configuration in an AZ in a region
     * @param RegionConfig The purchasable configuration in an AZ in a region
     */
    public void setRegionConfig(CdbZoneSellConf [] RegionConfig) {
        this.RegionConfig = RegionConfig;
    }

    public CdbRegionSellConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbRegionSellConf(CdbRegionSellConf source) {
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.IsDefaultRegion != null) {
            this.IsDefaultRegion = new Long(source.IsDefaultRegion);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionConfig != null) {
            this.RegionConfig = new CdbZoneSellConf[source.RegionConfig.length];
            for (int i = 0; i < source.RegionConfig.length; i++) {
                this.RegionConfig[i] = new CdbZoneSellConf(source.RegionConfig[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "IsDefaultRegion", this.IsDefaultRegion);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "RegionConfig.", this.RegionConfig);

    }
}

