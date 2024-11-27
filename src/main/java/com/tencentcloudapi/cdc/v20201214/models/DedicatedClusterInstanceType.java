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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterInstanceType extends AbstractModel {

    /**
    * AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Type name
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * NIC type, e.g., 25 represents a 25 GB NIC.
    */
    @SerializedName("NetworkCard")
    @Expose
    private Long NetworkCard;

    /**
    * Number of CPU cores of instance, in cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory capacity of instance, in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance family
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Type name
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Local storage block count
    */
    @SerializedName("StorageBlockAmount")
    @Expose
    private Long StorageBlockAmount;

    /**
    * LAN bandwidth, in GB/s
    */
    @SerializedName("InstanceBandwidth")
    @Expose
    private Float InstanceBandwidth;

    /**
    * Network packet receiving/sending capacity, in 10,000 PPS
    */
    @SerializedName("InstancePps")
    @Expose
    private Long InstancePps;

    /**
    * Processor type
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * Number of GPUs of instance
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * Number of FPGAs of instance.
    */
    @SerializedName("Fpga")
    @Expose
    private Long Fpga;

    /**
    * Type description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether the instance is for sale? Value values: <br><li>SELL: Indicates that the instance is for sale. <br><li>SOLD_OUT: Indicates that the instance has been sold out.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get AZ 
     * @return Zone AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ
     * @param Zone AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Type name 
     * @return InstanceType Type name
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Type name
     * @param InstanceType Type name
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get NIC type, e.g., 25 represents a 25 GB NIC. 
     * @return NetworkCard NIC type, e.g., 25 represents a 25 GB NIC.
     */
    public Long getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set NIC type, e.g., 25 represents a 25 GB NIC.
     * @param NetworkCard NIC type, e.g., 25 represents a 25 GB NIC.
     */
    public void setNetworkCard(Long NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Get Number of CPU cores of instance, in cores 
     * @return Cpu Number of CPU cores of instance, in cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores of instance, in cores
     * @param Cpu Number of CPU cores of instance, in cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory capacity of instance, in GB 
     * @return Memory Memory capacity of instance, in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory capacity of instance, in GB
     * @param Memory Memory capacity of instance, in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance family 
     * @return InstanceFamily Instance family
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Instance family
     * @param InstanceFamily Instance family
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Type name 
     * @return TypeName Type name
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Type name
     * @param TypeName Type name
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Local storage block count 
     * @return StorageBlockAmount Local storage block count
     */
    public Long getStorageBlockAmount() {
        return this.StorageBlockAmount;
    }

    /**
     * Set Local storage block count
     * @param StorageBlockAmount Local storage block count
     */
    public void setStorageBlockAmount(Long StorageBlockAmount) {
        this.StorageBlockAmount = StorageBlockAmount;
    }

    /**
     * Get LAN bandwidth, in GB/s 
     * @return InstanceBandwidth LAN bandwidth, in GB/s
     */
    public Float getInstanceBandwidth() {
        return this.InstanceBandwidth;
    }

    /**
     * Set LAN bandwidth, in GB/s
     * @param InstanceBandwidth LAN bandwidth, in GB/s
     */
    public void setInstanceBandwidth(Float InstanceBandwidth) {
        this.InstanceBandwidth = InstanceBandwidth;
    }

    /**
     * Get Network packet receiving/sending capacity, in 10,000 PPS 
     * @return InstancePps Network packet receiving/sending capacity, in 10,000 PPS
     */
    public Long getInstancePps() {
        return this.InstancePps;
    }

    /**
     * Set Network packet receiving/sending capacity, in 10,000 PPS
     * @param InstancePps Network packet receiving/sending capacity, in 10,000 PPS
     */
    public void setInstancePps(Long InstancePps) {
        this.InstancePps = InstancePps;
    }

    /**
     * Get Processor type 
     * @return CpuType Processor type
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set Processor type
     * @param CpuType Processor type
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get Number of GPUs of instance 
     * @return Gpu Number of GPUs of instance
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set Number of GPUs of instance
     * @param Gpu Number of GPUs of instance
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get Number of FPGAs of instance. 
     * @return Fpga Number of FPGAs of instance.
     */
    public Long getFpga() {
        return this.Fpga;
    }

    /**
     * Set Number of FPGAs of instance.
     * @param Fpga Number of FPGAs of instance.
     */
    public void setFpga(Long Fpga) {
        this.Fpga = Fpga;
    }

    /**
     * Get Type description 
     * @return Remark Type description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Type description
     * @param Remark Type description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether the instance is for sale? Value values: <br><li>SELL: Indicates that the instance is for sale. <br><li>SOLD_OUT: Indicates that the instance has been sold out. 
     * @return Status Whether the instance is for sale? Value values: <br><li>SELL: Indicates that the instance is for sale. <br><li>SOLD_OUT: Indicates that the instance has been sold out.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether the instance is for sale? Value values: <br><li>SELL: Indicates that the instance is for sale. <br><li>SOLD_OUT: Indicates that the instance has been sold out.
     * @param Status Whether the instance is for sale? Value values: <br><li>SELL: Indicates that the instance is for sale. <br><li>SOLD_OUT: Indicates that the instance has been sold out.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DedicatedClusterInstanceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterInstanceType(DedicatedClusterInstanceType source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.NetworkCard != null) {
            this.NetworkCard = new Long(source.NetworkCard);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.StorageBlockAmount != null) {
            this.StorageBlockAmount = new Long(source.StorageBlockAmount);
        }
        if (source.InstanceBandwidth != null) {
            this.InstanceBandwidth = new Float(source.InstanceBandwidth);
        }
        if (source.InstancePps != null) {
            this.InstancePps = new Long(source.InstancePps);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.Fpga != null) {
            this.Fpga = new Long(source.Fpga);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "StorageBlockAmount", this.StorageBlockAmount);
        this.setParamSimple(map, prefix + "InstanceBandwidth", this.InstanceBandwidth);
        this.setParamSimple(map, prefix + "InstancePps", this.InstancePps);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "Fpga", this.Fpga);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

