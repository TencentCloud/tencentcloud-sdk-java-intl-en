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

public class InstanceSpec extends AbstractModel {

    /**
    * Number of instance CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance memory in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Maximum instance storage capacity GB
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * Minimum instance storage capacity GB
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * Whether there is an inventory.
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * Machine type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Maximum IOPS
    */
    @SerializedName("MaxIops")
    @Expose
    private Long MaxIops;

    /**
    * Maximum bandwidth
    */
    @SerializedName("MaxIoBandWidth")
    @Expose
    private Long MaxIoBandWidth;

    /**
    * Regional inventory information.
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ZoneStockInfo [] ZoneStockInfos;

    /**
    * Inventory quantity.
    */
    @SerializedName("StockCount")
    @Expose
    private Long StockCount;

    /**
     * Get Number of instance CPU cores 
     * @return Cpu Number of instance CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of instance CPU cores
     * @param Cpu Number of instance CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance memory in GB 
     * @return Memory Instance memory in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory in GB
     * @param Memory Instance memory in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Maximum instance storage capacity GB 
     * @return MaxStorageSize Maximum instance storage capacity GB
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set Maximum instance storage capacity GB
     * @param MaxStorageSize Maximum instance storage capacity GB
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get Minimum instance storage capacity GB 
     * @return MinStorageSize Minimum instance storage capacity GB
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set Minimum instance storage capacity GB
     * @param MinStorageSize Minimum instance storage capacity GB
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get Whether there is an inventory. 
     * @return HasStock Whether there is an inventory.
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set Whether there is an inventory.
     * @param HasStock Whether there is an inventory.
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    /**
     * Get Machine type 
     * @return MachineType Machine type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine type
     * @param MachineType Machine type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Maximum IOPS 
     * @return MaxIops Maximum IOPS
     */
    public Long getMaxIops() {
        return this.MaxIops;
    }

    /**
     * Set Maximum IOPS
     * @param MaxIops Maximum IOPS
     */
    public void setMaxIops(Long MaxIops) {
        this.MaxIops = MaxIops;
    }

    /**
     * Get Maximum bandwidth 
     * @return MaxIoBandWidth Maximum bandwidth
     */
    public Long getMaxIoBandWidth() {
        return this.MaxIoBandWidth;
    }

    /**
     * Set Maximum bandwidth
     * @param MaxIoBandWidth Maximum bandwidth
     */
    public void setMaxIoBandWidth(Long MaxIoBandWidth) {
        this.MaxIoBandWidth = MaxIoBandWidth;
    }

    /**
     * Get Regional inventory information. 
     * @return ZoneStockInfos Regional inventory information.
     */
    public ZoneStockInfo [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set Regional inventory information.
     * @param ZoneStockInfos Regional inventory information.
     */
    public void setZoneStockInfos(ZoneStockInfo [] ZoneStockInfos) {
        this.ZoneStockInfos = ZoneStockInfos;
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

    public InstanceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceSpec(InstanceSpec source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MaxIops != null) {
            this.MaxIops = new Long(source.MaxIops);
        }
        if (source.MaxIoBandWidth != null) {
            this.MaxIoBandWidth = new Long(source.MaxIoBandWidth);
        }
        if (source.ZoneStockInfos != null) {
            this.ZoneStockInfos = new ZoneStockInfo[source.ZoneStockInfos.length];
            for (int i = 0; i < source.ZoneStockInfos.length; i++) {
                this.ZoneStockInfos[i] = new ZoneStockInfo(source.ZoneStockInfos[i]);
            }
        }
        if (source.StockCount != null) {
            this.StockCount = new Long(source.StockCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MaxIops", this.MaxIops);
        this.setParamSimple(map, prefix + "MaxIoBandWidth", this.MaxIoBandWidth);
        this.setParamArrayObj(map, prefix + "ZoneStockInfos.", this.ZoneStockInfos);
        this.setParamSimple(map, prefix + "StockCount", this.StockCount);

    }
}

