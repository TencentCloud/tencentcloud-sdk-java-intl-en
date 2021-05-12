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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SellConfig extends AbstractModel{

    /**
    * (Disused) Device type
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * (Disused) Purchasable specification description 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * (Disused) Instance type 
    */
    @SerializedName("CdbType")
    @Expose
    private String CdbType;

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
    * Disk increment in GB
    */
    @SerializedName("VolumeStep")
    @Expose
    private Long VolumeStep;

    /**
    * Number of connections
    */
    @SerializedName("Connection")
    @Expose
    private Long Connection;

    /**
    * Queries per second
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * IOs per second
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
    * Status. Value `0` indicates that this specification is purchasable.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * (Disused) Tag value
    */
    @SerializedName("Tag")
    @Expose
    private Long Tag;

    /**
    * Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("DeviceTypeName")
    @Expose
    private String DeviceTypeName;

    /**
     * Get (Disused) Device type 
     * @return Device (Disused) Device type
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set (Disused) Device type
     * @param Device (Disused) Device type
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get (Disused) Purchasable specification description  
     * @return Type (Disused) Purchasable specification description 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set (Disused) Purchasable specification description 
     * @param Type (Disused) Purchasable specification description 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get (Disused) Instance type  
     * @return CdbType (Disused) Instance type 
     */
    public String getCdbType() {
        return this.CdbType;
    }

    /**
     * Set (Disused) Instance type 
     * @param CdbType (Disused) Instance type 
     */
    public void setCdbType(String CdbType) {
        this.CdbType = CdbType;
    }

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
     * Get Disk increment in GB 
     * @return VolumeStep Disk increment in GB
     */
    public Long getVolumeStep() {
        return this.VolumeStep;
    }

    /**
     * Set Disk increment in GB
     * @param VolumeStep Disk increment in GB
     */
    public void setVolumeStep(Long VolumeStep) {
        this.VolumeStep = VolumeStep;
    }

    /**
     * Get Number of connections 
     * @return Connection Number of connections
     */
    public Long getConnection() {
        return this.Connection;
    }

    /**
     * Set Number of connections
     * @param Connection Number of connections
     */
    public void setConnection(Long Connection) {
        this.Connection = Connection;
    }

    /**
     * Get Queries per second 
     * @return Qps Queries per second
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Queries per second
     * @param Qps Queries per second
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get IOs per second 
     * @return Iops IOs per second
     */
    public Long getIops() {
        return this.Iops;
    }

    /**
     * Set IOs per second
     * @param Iops IOs per second
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
     * Get Status. Value `0` indicates that this specification is purchasable. 
     * @return Status Status. Value `0` indicates that this specification is purchasable.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Value `0` indicates that this specification is purchasable.
     * @param Status Status. Value `0` indicates that this specification is purchasable.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get (Disused) Tag value 
     * @return Tag (Disused) Tag value
     */
    public Long getTag() {
        return this.Tag;
    }

    /**
     * Set (Disused) Tag value
     * @param Tag (Disused) Tag value
     */
    public void setTag(Long Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return DeviceType Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param DeviceType Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return DeviceTypeName Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getDeviceTypeName() {
        return this.DeviceTypeName;
    }

    /**
     * Set Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param DeviceTypeName Instance resource isolation type. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance).
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setDeviceTypeName(String DeviceTypeName) {
        this.DeviceTypeName = DeviceTypeName;
    }

    public SellConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SellConfig(SellConfig source) {
        if (source.Device != null) {
            this.Device = new String(source.Device);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CdbType != null) {
            this.CdbType = new String(source.CdbType);
        }
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
        if (source.Connection != null) {
            this.Connection = new Long(source.Connection);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
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
        if (source.Tag != null) {
            this.Tag = new Long(source.Tag);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.DeviceTypeName != null) {
            this.DeviceTypeName = new String(source.DeviceTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CdbType", this.CdbType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "VolumeMin", this.VolumeMin);
        this.setParamSimple(map, prefix + "VolumeMax", this.VolumeMax);
        this.setParamSimple(map, prefix + "VolumeStep", this.VolumeStep);
        this.setParamSimple(map, prefix + "Connection", this.Connection);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Iops", this.Iops);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "DeviceTypeName", this.DeviceTypeName);

    }
}

