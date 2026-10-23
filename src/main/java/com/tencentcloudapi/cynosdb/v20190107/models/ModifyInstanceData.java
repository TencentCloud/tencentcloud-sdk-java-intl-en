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

public class ModifyInstanceData extends AbstractModel {

    /**
    * CPU after configuration change
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory after configuration change
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage limit after configuration change
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * CPU before specification adjustment
    */
    @SerializedName("OldCpu")
    @Expose
    private Long OldCpu;

    /**
    * Memory before specification modification
    */
    @SerializedName("OldMemory")
    @Expose
    private Long OldMemory;

    /**
    * Storage limit before configuration change
    */
    @SerializedName("OldStorageLimit")
    @Expose
    private Long OldStorageLimit;

    /**
    * Instance machine type before scaling
1. common: universal type.
2. exclusive: dedicated.
    */
    @SerializedName("OldDeviceType")
    @Expose
    private String OldDeviceType;

    /**
    * Instance machine type after scaling
1. common: universal type.
2. exclusive: dedicated.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Upgrade method. Switch after the upgrade is completed or switch during the maintenance window.
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * Number of libra nodes
    */
    @SerializedName("LibraNodeCount")
    @Expose
    private Long LibraNodeCount;

    /**
    * Original libra node count
    */
    @SerializedName("OldLibraNodeCount")
    @Expose
    private Long OldLibraNodeCount;

    /**
     * Get CPU after configuration change 
     * @return Cpu CPU after configuration change
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU after configuration change
     * @param Cpu CPU after configuration change
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory after configuration change 
     * @return Memory Memory after configuration change
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory after configuration change
     * @param Memory Memory after configuration change
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage limit after configuration change 
     * @return StorageLimit Storage limit after configuration change
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage limit after configuration change
     * @param StorageLimit Storage limit after configuration change
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get CPU before specification adjustment 
     * @return OldCpu CPU before specification adjustment
     */
    public Long getOldCpu() {
        return this.OldCpu;
    }

    /**
     * Set CPU before specification adjustment
     * @param OldCpu CPU before specification adjustment
     */
    public void setOldCpu(Long OldCpu) {
        this.OldCpu = OldCpu;
    }

    /**
     * Get Memory before specification modification 
     * @return OldMemory Memory before specification modification
     */
    public Long getOldMemory() {
        return this.OldMemory;
    }

    /**
     * Set Memory before specification modification
     * @param OldMemory Memory before specification modification
     */
    public void setOldMemory(Long OldMemory) {
        this.OldMemory = OldMemory;
    }

    /**
     * Get Storage limit before configuration change 
     * @return OldStorageLimit Storage limit before configuration change
     */
    public Long getOldStorageLimit() {
        return this.OldStorageLimit;
    }

    /**
     * Set Storage limit before configuration change
     * @param OldStorageLimit Storage limit before configuration change
     */
    public void setOldStorageLimit(Long OldStorageLimit) {
        this.OldStorageLimit = OldStorageLimit;
    }

    /**
     * Get Instance machine type before scaling
1. common: universal type.
2. exclusive: dedicated. 
     * @return OldDeviceType Instance machine type before scaling
1. common: universal type.
2. exclusive: dedicated.
     */
    public String getOldDeviceType() {
        return this.OldDeviceType;
    }

    /**
     * Set Instance machine type before scaling
1. common: universal type.
2. exclusive: dedicated.
     * @param OldDeviceType Instance machine type before scaling
1. common: universal type.
2. exclusive: dedicated.
     */
    public void setOldDeviceType(String OldDeviceType) {
        this.OldDeviceType = OldDeviceType;
    }

    /**
     * Get Instance machine type after scaling
1. common: universal type.
2. exclusive: dedicated. 
     * @return DeviceType Instance machine type after scaling
1. common: universal type.
2. exclusive: dedicated.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance machine type after scaling
1. common: universal type.
2. exclusive: dedicated.
     * @param DeviceType Instance machine type after scaling
1. common: universal type.
2. exclusive: dedicated.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Upgrade method. Switch after the upgrade is completed or switch during the maintenance window. 
     * @return UpgradeType Upgrade method. Switch after the upgrade is completed or switch during the maintenance window.
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set Upgrade method. Switch after the upgrade is completed or switch during the maintenance window.
     * @param UpgradeType Upgrade method. Switch after the upgrade is completed or switch during the maintenance window.
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get Number of libra nodes 
     * @return LibraNodeCount Number of libra nodes
     */
    public Long getLibraNodeCount() {
        return this.LibraNodeCount;
    }

    /**
     * Set Number of libra nodes
     * @param LibraNodeCount Number of libra nodes
     */
    public void setLibraNodeCount(Long LibraNodeCount) {
        this.LibraNodeCount = LibraNodeCount;
    }

    /**
     * Get Original libra node count 
     * @return OldLibraNodeCount Original libra node count
     */
    public Long getOldLibraNodeCount() {
        return this.OldLibraNodeCount;
    }

    /**
     * Set Original libra node count
     * @param OldLibraNodeCount Original libra node count
     */
    public void setOldLibraNodeCount(Long OldLibraNodeCount) {
        this.OldLibraNodeCount = OldLibraNodeCount;
    }

    public ModifyInstanceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceData(ModifyInstanceData source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.OldCpu != null) {
            this.OldCpu = new Long(source.OldCpu);
        }
        if (source.OldMemory != null) {
            this.OldMemory = new Long(source.OldMemory);
        }
        if (source.OldStorageLimit != null) {
            this.OldStorageLimit = new Long(source.OldStorageLimit);
        }
        if (source.OldDeviceType != null) {
            this.OldDeviceType = new String(source.OldDeviceType);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.LibraNodeCount != null) {
            this.LibraNodeCount = new Long(source.LibraNodeCount);
        }
        if (source.OldLibraNodeCount != null) {
            this.OldLibraNodeCount = new Long(source.OldLibraNodeCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "OldCpu", this.OldCpu);
        this.setParamSimple(map, prefix + "OldMemory", this.OldMemory);
        this.setParamSimple(map, prefix + "OldStorageLimit", this.OldStorageLimit);
        this.setParamSimple(map, prefix + "OldDeviceType", this.OldDeviceType);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "LibraNodeCount", this.LibraNodeCount);
        this.setParamSimple(map, prefix + "OldLibraNodeCount", this.OldLibraNodeCount);

    }
}

