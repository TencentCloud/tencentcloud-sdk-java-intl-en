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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaleRegion extends AbstractModel{

    /**
    * Region name
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Numeric ID of a region
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region name
    */
    @SerializedName("RegionZh")
    @Expose
    private String RegionZh;

    /**
    * List of purchasable AZs
    */
    @SerializedName("ZoneSet")
    @Expose
    private SaleZone [] ZoneSet;

    /**
    * Engine type
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Supported modules in a region
    */
    @SerializedName("Modules")
    @Expose
    private Module [] Modules;

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
     * Get Numeric ID of a region 
     * @return RegionId Numeric ID of a region
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Numeric ID of a region
     * @param RegionId Numeric ID of a region
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name 
     * @return RegionZh Region name
     */
    public String getRegionZh() {
        return this.RegionZh;
    }

    /**
     * Set Region name
     * @param RegionZh Region name
     */
    public void setRegionZh(String RegionZh) {
        this.RegionZh = RegionZh;
    }

    /**
     * Get List of purchasable AZs 
     * @return ZoneSet List of purchasable AZs
     */
    public SaleZone [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set List of purchasable AZs
     * @param ZoneSet List of purchasable AZs
     */
    public void setZoneSet(SaleZone [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Get Engine type 
     * @return DbType Engine type
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Engine type
     * @param DbType Engine type
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Supported modules in a region 
     * @return Modules Supported modules in a region
     */
    public Module [] getModules() {
        return this.Modules;
    }

    /**
     * Set Supported modules in a region
     * @param Modules Supported modules in a region
     */
    public void setModules(Module [] Modules) {
        this.Modules = Modules;
    }

    public SaleRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaleRegion(SaleRegion source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionZh != null) {
            this.RegionZh = new String(source.RegionZh);
        }
        if (source.ZoneSet != null) {
            this.ZoneSet = new SaleZone[source.ZoneSet.length];
            for (int i = 0; i < source.ZoneSet.length; i++) {
                this.ZoneSet[i] = new SaleZone(source.ZoneSet[i]);
            }
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Modules != null) {
            this.Modules = new Module[source.Modules.length];
            for (int i = 0; i < source.Modules.length; i++) {
                this.Modules[i] = new Module(source.Modules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionZh", this.RegionZh);
        this.setParamArrayObj(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArrayObj(map, prefix + "Modules.", this.Modules);

    }
}

