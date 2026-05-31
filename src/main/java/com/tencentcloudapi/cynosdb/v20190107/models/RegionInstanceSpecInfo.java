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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Minimum storage size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinStorageSize")
    @Expose
    private Long MinStorageSize;

    /**
    * Maximum storage size
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxStorageSize")
    @Expose
    private Long MaxStorageSize;

    /**
    * Whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasStock")
    @Expose
    private Boolean HasStock;

    /**
    * Instance type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Storage type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * minimum replica count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinReplicaNum")
    @Expose
    private Long MinReplicaNum;

    /**
    * Maximum number of replicas
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxReplicaNum")
    @Expose
    private Long MaxReplicaNum;

    /**
    * Availability zone inventory information list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneStockInfos")
    @Expose
    private ZoneStockInfo4Libra [] ZoneStockInfos;

    /**
     * Get Number of CPU cores
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cpu Number of CPU cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cpu Number of CPU cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Memory Memory size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Memory Memory size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Minimum storage size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinStorageSize Minimum storage size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinStorageSize() {
        return this.MinStorageSize;
    }

    /**
     * Set Minimum storage size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinStorageSize Minimum storage size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinStorageSize(Long MinStorageSize) {
        this.MinStorageSize = MinStorageSize;
    }

    /**
     * Get Maximum storage size
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxStorageSize Maximum storage size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxStorageSize() {
        return this.MaxStorageSize;
    }

    /**
     * Set Maximum storage size
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxStorageSize Maximum storage size
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxStorageSize(Long MaxStorageSize) {
        this.MaxStorageSize = MaxStorageSize;
    }

    /**
     * Get Whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasStock Whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getHasStock() {
        return this.HasStock;
    }

    /**
     * Set Whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasStock Whether there is inventory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasStock(Boolean HasStock) {
        this.HasStock = HasStock;
    }

    /**
     * Get Instance type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Instance type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Instance type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Storage type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageType Storage type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageType Storage type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get minimum replica count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinReplicaNum minimum replica count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinReplicaNum() {
        return this.MinReplicaNum;
    }

    /**
     * Set minimum replica count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinReplicaNum minimum replica count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinReplicaNum(Long MinReplicaNum) {
        this.MinReplicaNum = MinReplicaNum;
    }

    /**
     * Get Maximum number of replicas
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxReplicaNum Maximum number of replicas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxReplicaNum() {
        return this.MaxReplicaNum;
    }

    /**
     * Set Maximum number of replicas
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxReplicaNum Maximum number of replicas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxReplicaNum(Long MaxReplicaNum) {
        this.MaxReplicaNum = MaxReplicaNum;
    }

    /**
     * Get Availability zone inventory information list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneStockInfos Availability zone inventory information list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ZoneStockInfo4Libra [] getZoneStockInfos() {
        return this.ZoneStockInfos;
    }

    /**
     * Set Availability zone inventory information list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneStockInfos Availability zone inventory information list
Note: This field may return null, indicating that no valid values can be obtained.
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

