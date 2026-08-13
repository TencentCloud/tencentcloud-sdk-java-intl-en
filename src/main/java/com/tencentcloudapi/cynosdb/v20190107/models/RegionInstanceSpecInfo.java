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

public class RegionInstanceSpecInfo extends AbstractModel {

    /**
    * Number of CPU cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Minimum storage size
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * Maximum storage size
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * Whether there is inventory
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Storage type
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Minimum replica count
    */
    @SerializedName("MinReplicaNum")
    @Expose
    private Long MinReplicaNum;

    /**
    * Maximum number of replicas
    */
    @SerializedName("MaxReplicaNum")
    @Expose
    private Long MaxReplicaNum;

    /**
    * Availability zone inventory information list
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ZoneStockInfo4Libra [] ZoneStockInfos;

    /**
     * Get Number of CPU cores 
     * @return Cpu Number of CPU cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
     * @param Cpu Number of CPU cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size. 
     * @return Memory Memory size.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size.
     * @param Memory Memory size.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Minimum storage size 
     * @return MinStorageSize Minimum storage size
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set Minimum storage size
     * @param MinStorageSize Minimum storage size
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get Maximum storage size 
     * @return MaxStorageSize Maximum storage size
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set Maximum storage size
     * @param MaxStorageSize Maximum storage size
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
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
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Storage type 
     * @return StorageType Storage type
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type
     * @param StorageType Storage type
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Minimum replica count 
     * @return MinReplicaNum Minimum replica count
     */
    public Long getMinReplicaNum() {
        return this.MinReplicaNum;
    }

    /**
     * Set Minimum replica count
     * @param MinReplicaNum Minimum replica count
     */
    public void setMinReplicaNum(Long MinReplicaNum) {
        this.MinReplicaNum = MinReplicaNum;
    }

    /**
     * Get Maximum number of replicas 
     * @return MaxReplicaNum Maximum number of replicas
     */
    public Long getMaxReplicaNum() {
        return this.MaxReplicaNum;
    }

    /**
     * Set Maximum number of replicas
     * @param MaxReplicaNum Maximum number of replicas
     */
    public void setMaxReplicaNum(Long MaxReplicaNum) {
        this.MaxReplicaNum = MaxReplicaNum;
    }

    /**
     * Get Availability zone inventory information list 
     * @return ZoneStockInfos Availability zone inventory information list
     */
    public ZoneStockInfo4Libra [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set Availability zone inventory information list
     * @param ZoneStockInfos Availability zone inventory information list
     */
    public void setZoneStockInfos(ZoneStockInfo4Libra [] ZoneStockInfos) {
        this.ZoneStockInfos = ZoneStockInfos;
    }

    public RegionInstanceSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInstanceSpecInfo(RegionInstanceSpecInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.MinStorageSize != null) {
            this.MinStorageSize = new Long(source.MinStorageSize);
        }
        if (source.MaxStorageSize != null) {
            this.MaxStorageSize = new Long(source.MaxStorageSize);
        }
        if (source.HasStock != null) {
            this.HasStock = new Boolean(source.HasStock);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.MinReplicaNum != null) {
            this.MinReplicaNum = new Long(source.MinReplicaNum);
        }
        if (source.MaxReplicaNum != null) {
            this.MaxReplicaNum = new Long(source.MaxReplicaNum);
        }
        if (source.ZoneStockInfos != null) {
            this.ZoneStockInfos = new ZoneStockInfo4Libra[source.ZoneStockInfos.length];
            for (int i = 0; i < source.ZoneStockInfos.length; i++) {
                this.ZoneStockInfos[i] = new ZoneStockInfo4Libra(source.ZoneStockInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MinStorageSize", this.MinStorageSize);
        this.setParamSimple(map, prefix + "MaxStorageSize", this.MaxStorageSize);
        this.setParamSimple(map, prefix + "HasStock", this.HasStock);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "MinReplicaNum", this.MinReplicaNum);
        this.setParamSimple(map, prefix + "MaxReplicaNum", this.MaxReplicaNum);
        this.setParamArrayObj(map, prefix + "ZoneStockInfos.", this.ZoneStockInfos);

    }
}

