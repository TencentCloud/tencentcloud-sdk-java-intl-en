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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessSpec extends AbstractModel {

    /**
    * Specifies the minimum value of the cpu.
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * Maximum value of cpu.
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * Maximum storage space.
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * Specifies whether it is the default specification.
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Whether there is inventory.
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * Inventory quantity.
    */
    @SerializedName("StockCount")
    @Expose
    private Long StockCount;

    /**
    * Availability zone inventory information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ServerlessZoneStockInfo [] ZoneStockInfos;

    /**
     * Get Specifies the minimum value of the cpu. 
     * @return MinCpu Specifies the minimum value of the cpu.
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set Specifies the minimum value of the cpu.
     * @param MinCpu Specifies the minimum value of the cpu.
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get Maximum value of cpu. 
     * @return MaxCpu Maximum value of cpu.
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set Maximum value of cpu.
     * @param MaxCpu Maximum value of cpu.
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get Maximum storage space. 
     * @return MaxStorageSize Maximum storage space.
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set Maximum storage space.
     * @param MaxStorageSize Maximum storage space.
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get Specifies whether it is the default specification. 
     * @return IsDefault Specifies whether it is the default specification.
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Specifies whether it is the default specification.
     * @param IsDefault Specifies whether it is the default specification.
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether there is inventory. 
     * @return HasStock Whether there is inventory.
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set Whether there is inventory.
     * @param HasStock Whether there is inventory.
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    /**
     * Get Inventory quantity. 
     * @return StockCount Inventory quantity.
     */
    public Long getStockCount() {
        return this.StockCount;
    }

    /**
     * Set Inventory quantity.
     * @param StockCount Inventory quantity.
     */
    public void setStockCount(Long StockCount) {
        this.StockCount = StockCount;
    }

    /**
     * Get Availability zone inventory information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneStockInfos Availability zone inventory information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServerlessZoneStockInfo [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set Availability zone inventory information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneStockInfos Availability zone inventory information.
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

