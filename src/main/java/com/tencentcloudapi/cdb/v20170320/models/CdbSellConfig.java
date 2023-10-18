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

public class CdbSellConfig extends AbstractModel {

    /**
    * Memory size in MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * CPU core count
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Minimum disk size in GB
    */
    @SerializedName("VolumeMin")
    @Expose
    private Long VolumeMin;

    /**
    * Maximum disk size in GB
    */
    @SerializedName("VolumeMax")
    @Expose
    private Long VolumeMax;

    /**
    * Disk capacity increment in GB
    */
    @SerializedName("VolumeStep")
    @Expose
    private Long VolumeStep;

    /**
    * IO operations per second
    */
    @SerializedName("Iops")
    @Expose
    private Long Iops;

    /**
    * Application scenario description
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * Status. The value `0` indicates that this specification is available.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance), `BASIC_V2` (basic v2 instance).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Engine type description. Valid values: `Innodb`, `RocksDB`.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * Purchasable specifications ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Memory size in MB 
     * @return Memory Memory size in MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in MB
     * @param Memory Memory size in MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CPU core count 
     * @return Cpu CPU core count
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU core count
     * @param Cpu CPU core count
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Minimum disk size in GB 
     * @return VolumeMin Minimum disk size in GB
     */
    public Long getVolumeMin() {
        return this.VolumeMin;
    }

    /**
     * Set Minimum disk size in GB
     * @param VolumeMin Minimum disk size in GB
     */
    public void setVolumeMin(Long VolumeMin) {
        this.VolumeMin = VolumeMin;
    }

    /**
     * Get Maximum disk size in GB 
     * @return VolumeMax Maximum disk size in GB
     */
    public Long getVolumeMax() {
        return this.VolumeMax;
    }

    /**
     * Set Maximum disk size in GB
     * @param VolumeMax Maximum disk size in GB
     */
    public void setVolumeMax(Long VolumeMax) {
        this.VolumeMax = VolumeMax;
    }

    /**
     * Get Disk capacity increment in GB 
     * @return VolumeStep Disk capacity increment in GB
     */
    public Long getVolumeStep() {
        return this.VolumeStep;
    }

    /**
     * Set Disk capacity increment in GB
     * @param VolumeStep Disk capacity increment in GB
     */
    public void setVolumeStep(Long VolumeStep) {
        this.VolumeStep = VolumeStep;
    }

    /**
     * Get IO operations per second 
     * @return Iops IO operations per second
     */
    public Long getIops() {
        return this.Iops;
    }

    /**
     * Set IO operations per second
     * @param Iops IO operations per second
     */
    public void setIops(Long Iops) {
        this.Iops = Iops;
    }

    /**
     * Get Application scenario description 
     * @return Info Application scenario description
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Application scenario description
     * @param Info Application scenario description
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get Status. The value `0` indicates that this specification is available. 
     * @return Status Status. The value `0` indicates that this specification is available.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. The value `0` indicates that this specification is available.
     * @param Status Status. The value `0` indicates that this specification is available.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance), `BASIC_V2` (basic v2 instance).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeviceType Instance type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance), `BASIC_V2` (basic v2 instance).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance), `BASIC_V2` (basic v2 instance).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeviceType Instance type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance), `BASIC_V2` (basic v2 instance).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Engine type description. Valid values: `Innodb`, `RocksDB`. 
     * @return EngineType Engine type description. Valid values: `Innodb`, `RocksDB`.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Engine type description. Valid values: `Innodb`, `RocksDB`.
     * @param EngineType Engine type description. Valid values: `Innodb`, `RocksDB`.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Purchasable specifications ID 
     * @return Id Purchasable specifications ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Purchasable specifications ID
     * @param Id Purchasable specifications ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public CdbSellConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbSellConfig(CdbSellConfig source) {
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.VolumeMin != null) {
            this.VolumeMin = new Long(source.VolumeMin);
        }
        if (source.VolumeMax != null) {
            this.VolumeMax = new Long(source.VolumeMax);
        }
        if (source.VolumeStep != null) {
            this.VolumeStep = new Long(source.VolumeStep);
        }
        if (source.Iops != null) {
            this.Iops = new Long(source.Iops);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "VolumeMin", this.VolumeMin);
        this.setParamSimple(map, prefix + "VolumeMax", this.VolumeMax);
        this.setParamSimple(map, prefix + "VolumeStep", this.VolumeStep);
        this.setParamSimple(map, prefix + "Iops", this.Iops);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

