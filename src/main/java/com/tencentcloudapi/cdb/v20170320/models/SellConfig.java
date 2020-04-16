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
    * Device type
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * Purchasable specification description
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Instance type
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
    * Status value
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Tag value
    */
    @SerializedName("Tag")
    @Expose
    private Long Tag;

    /**
     * Get Device type 
     * @return Device Device type
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set Device type
     * @param Device Device type
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get Purchasable specification description 
     * @return Type Purchasable specification description
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Purchasable specification description
     * @param Type Purchasable specification description
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Instance type 
     * @return CdbType Instance type
     */
    public String getCdbType() {
        return this.CdbType;
    }

    /**
     * Set Instance type
     * @param CdbType Instance type
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
     * Get Status value 
     * @return Status Status value
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status value
     * @param Status Status value
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Tag value 
     * @return Tag Tag value
     */
    public Long getTag() {
        return this.Tag;
    }

    /**
     * Set Tag value
     * @param Tag Tag value
     */
    public void setTag(Long Tag) {
        this.Tag = Tag;
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

    }
}

