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

public class ServerlessSpec extends AbstractModel {

    /**
    * <p>cpu minimum value</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>Maximum value of cpu</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>Maximum storage space</p>
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * <p>Is the default specification</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * <p>Whether there is inventory</p>
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * <p>Inventory quantity</p>
    */
    @SerializedName("StockCount")
    @Expose
    private Long StockCount;

    /**
    * <p>Availability zone inventory information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ServerlessZoneStockInfo [] ZoneStockInfos;

    /**
     * Get <p>cpu minimum value</p> 
     * @return MinCpu <p>cpu minimum value</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>cpu minimum value</p>
     * @param MinCpu <p>cpu minimum value</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>Maximum value of cpu</p> 
     * @return MaxCpu <p>Maximum value of cpu</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>Maximum value of cpu</p>
     * @param MaxCpu <p>Maximum value of cpu</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>Maximum storage space</p> 
     * @return MaxStorageSize <p>Maximum storage space</p>
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set <p>Maximum storage space</p>
     * @param MaxStorageSize <p>Maximum storage space</p>
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get <p>Is the default specification</p> 
     * @return IsDefault <p>Is the default specification</p>
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>Is the default specification</p>
     * @param IsDefault <p>Is the default specification</p>
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>Whether there is inventory</p> 
     * @return HasStock <p>Whether there is inventory</p>
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set <p>Whether there is inventory</p>
     * @param HasStock <p>Whether there is inventory</p>
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    /**
     * Get <p>Inventory quantity</p> 
     * @return StockCount <p>Inventory quantity</p>
     */
    public Long getStockCount() {
        return this.StockCount;
    }

    /**
     * Set <p>Inventory quantity</p>
     * @param StockCount <p>Inventory quantity</p>
     */
    public void setStockCount(Long StockCount) {
        this.StockCount = StockCount;
    }

    /**
     * Get <p>Availability zone inventory information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneStockInfos <p>Availability zone inventory information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServerlessZoneStockInfo [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set <p>Availability zone inventory information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneStockInfos <p>Availability zone inventory information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneStockInfos(ServerlessZoneStockInfo [] ZoneStockInfos) {
        this.ZoneStockInfos = ZoneStockInfos;
    }

    public ServerlessSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessSpec(ServerlessSpec source) {
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
        if (source.StockCount != null) {
            this.StockCount = new Long(source.StockCount);
        }
        if (source.ZoneStockInfos != null) {
            this.ZoneStockInfos = new ServerlessZoneStockInfo[source.ZoneStockInfos.length];
            for (int i = 0; i < source.ZoneStockInfos.length; i++) {
                this.ZoneStockInfos[i] = new ServerlessZoneStockInfo(source.ZoneStockInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);
        this.setParamSimple(map, prefix + "StockCount", this.StockCount);
        this.setParamArrayObj(map, prefix + "ZoneStockInfos.", this.ZoneStockInfos);

    }
}

