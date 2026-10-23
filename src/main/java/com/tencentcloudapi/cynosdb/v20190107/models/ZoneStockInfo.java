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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneStockInfo extends AbstractModel {

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Whether there is inventory
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * Inventory quantity
    */
    @SerializedName("StockCount")
    @Expose
    private Long StockCount;

    /**
    * AZ inventory information
    */
    @SerializedName("SlaveZoneStockInfos")
    @Expose
    private SlaveZoneStockInfo [] SlaveZoneStockInfos;

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Whether there is inventory 
     * @return HasStock Whether there is inventory
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set Whether there is inventory
     * @param HasStock Whether there is inventory
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    /**
     * Get Inventory quantity 
     * @return StockCount Inventory quantity
     */
    public Long getStockCount() {
        return this.StockCount;
    }

    /**
     * Set Inventory quantity
     * @param StockCount Inventory quantity
     */
    public void setStockCount(Long StockCount) {
        this.StockCount = StockCount;
    }

    /**
     * Get AZ inventory information 
     * @return SlaveZoneStockInfos AZ inventory information
     */
    public SlaveZoneStockInfo [] getSlaveZoneStockInfos() {
        return this.SlaveZoneStockInfos;
    }

    /**
     * Set AZ inventory information
     * @param SlaveZoneStockInfos AZ inventory information
     */
    public void setSlaveZoneStockInfos(SlaveZoneStockInfo [] SlaveZoneStockInfos) {
        this.SlaveZoneStockInfos = SlaveZoneStockInfos;
    }

    public ZoneStockInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneStockInfo(ZoneStockInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
        if (source.StockCount != null) {
            this.StockCount = new Long(source.StockCount);
        }
        if (source.SlaveZoneStockInfos != null) {
            this.SlaveZoneStockInfos = new SlaveZoneStockInfo[source.SlaveZoneStockInfos.length];
            for (int i = 0; i < source.SlaveZoneStockInfos.length; i++) {
                this.SlaveZoneStockInfos[i] = new SlaveZoneStockInfo(source.SlaveZoneStockInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);
        this.setParamSimple(map, prefix + "StockCount", this.StockCount);
        this.setParamArrayObj(map, prefix + "SlaveZoneStockInfos.", this.SlaveZoneStockInfos);

    }
}

