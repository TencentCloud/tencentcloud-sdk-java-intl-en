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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstanceTypeItem extends AbstractModel{

    /**
    * Instance type.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Number of CPU cores.
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
    * Number of GPU cores.
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * Number of FPGA cores.
    */
    @SerializedName("Fpga")
    @Expose
    private Long Fpga;

    /**
    * Number of storage blocks.
    */
    @SerializedName("StorageBlock")
    @Expose
    private Long StorageBlock;

    /**
    * Number of NICs.
    */
    @SerializedName("NetworkCard")
    @Expose
    private Long NetworkCard;

    /**
    * Maximum bandwidth.
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Float MaxBandwidth;

    /**
    * CPU frequency.
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * CPU type.
    */
    @SerializedName("CpuModelName")
    @Expose
    private String CpuModelName;

    /**
    * Packet forwarding rate.
    */
    @SerializedName("Pps")
    @Expose
    private Long Pps;

    /**
    * Other information.
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Price information about the reserved instance.
    */
    @SerializedName("Prices")
    @Expose
    private ReservedInstancePriceItem [] Prices;

    /**
     * Get Instance type. 
     * @return InstanceType Instance type.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type.
     * @param InstanceType Instance type.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Number of CPU cores. 
     * @return Cpu Number of CPU cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores.
     * @param Cpu Number of CPU cores.
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
     * Get Number of GPU cores. 
     * @return Gpu Number of GPU cores.
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set Number of GPU cores.
     * @param Gpu Number of GPU cores.
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get Number of FPGA cores. 
     * @return Fpga Number of FPGA cores.
     */
    public Long getFpga() {
        return this.Fpga;
    }

    /**
     * Set Number of FPGA cores.
     * @param Fpga Number of FPGA cores.
     */
    public void setFpga(Long Fpga) {
        this.Fpga = Fpga;
    }

    /**
     * Get Number of storage blocks. 
     * @return StorageBlock Number of storage blocks.
     */
    public Long getStorageBlock() {
        return this.StorageBlock;
    }

    /**
     * Set Number of storage blocks.
     * @param StorageBlock Number of storage blocks.
     */
    public void setStorageBlock(Long StorageBlock) {
        this.StorageBlock = StorageBlock;
    }

    /**
     * Get Number of NICs. 
     * @return NetworkCard Number of NICs.
     */
    public Long getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set Number of NICs.
     * @param NetworkCard Number of NICs.
     */
    public void setNetworkCard(Long NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Get Maximum bandwidth. 
     * @return MaxBandwidth Maximum bandwidth.
     */
    public Float getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set Maximum bandwidth.
     * @param MaxBandwidth Maximum bandwidth.
     */
    public void setMaxBandwidth(Float MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get CPU frequency. 
     * @return Frequency CPU frequency.
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set CPU frequency.
     * @param Frequency CPU frequency.
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get CPU type. 
     * @return CpuModelName CPU type.
     */
    public String getCpuModelName() {
        return this.CpuModelName;
    }

    /**
     * Set CPU type.
     * @param CpuModelName CPU type.
     */
    public void setCpuModelName(String CpuModelName) {
        this.CpuModelName = CpuModelName;
    }

    /**
     * Get Packet forwarding rate. 
     * @return Pps Packet forwarding rate.
     */
    public Long getPps() {
        return this.Pps;
    }

    /**
     * Set Packet forwarding rate.
     * @param Pps Packet forwarding rate.
     */
    public void setPps(Long Pps) {
        this.Pps = Pps;
    }

    /**
     * Get Other information. 
     * @return Externals Other information.
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set Other information.
     * @param Externals Other information.
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Price information about the reserved instance. 
     * @return Prices Price information about the reserved instance.
     */
    public ReservedInstancePriceItem [] getPrices() {
        return this.Prices;
    }

    /**
     * Set Price information about the reserved instance.
     * @param Prices Price information about the reserved instance.
     */
    public void setPrices(ReservedInstancePriceItem [] Prices) {
        this.Prices = Prices;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "Fpga", this.Fpga);
        this.setParamSimple(map, prefix + "StorageBlock", this.StorageBlock);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "CpuModelName", this.CpuModelName);
        this.setParamSimple(map, prefix + "Pps", this.Pps);
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Prices.", this.Prices);

    }
}

