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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceConfigInfo extends AbstractModel {

    /**
    * Role. For example, PS, WORKER, DRIVER, and EXECUTOR.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Number of CPU cores, which is required to be configured when resource groups are used. Unit: 1/1000, where 1000 represents 1 core.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size, in MB. This parameter needs to be configured when resource groups are used.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * GPU card type, which is required to be configured when resource groups are used.
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * Number of GPU cards, which is required to be configured when resource groups are used. Unit: 1/100, where 100 represents 1 card.
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * CVM instance specification ID.
CVM instance specification (for postpaid billing). Valid values:
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Number of compute nodes.
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * CVM instance specification name.
CVM instance specification (for postpaid billing). Valid values:
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32
    */
    @SerializedName("InstanceTypeAlias")
    @Expose
    private String InstanceTypeAlias;

    /**
    * RDMA configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RDMAConfig")
    @Expose
    private RDMAConfig RDMAConfig;

    /**
     * Get Role. For example, PS, WORKER, DRIVER, and EXECUTOR. 
     * @return Role Role. For example, PS, WORKER, DRIVER, and EXECUTOR.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role. For example, PS, WORKER, DRIVER, and EXECUTOR.
     * @param Role Role. For example, PS, WORKER, DRIVER, and EXECUTOR.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Number of CPU cores, which is required to be configured when resource groups are used. Unit: 1/1000, where 1000 represents 1 core. 
     * @return Cpu Number of CPU cores, which is required to be configured when resource groups are used. Unit: 1/1000, where 1000 represents 1 core.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores, which is required to be configured when resource groups are used. Unit: 1/1000, where 1000 represents 1 core.
     * @param Cpu Number of CPU cores, which is required to be configured when resource groups are used. Unit: 1/1000, where 1000 represents 1 core.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size, in MB. This parameter needs to be configured when resource groups are used. 
     * @return Memory Memory size, in MB. This parameter needs to be configured when resource groups are used.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size, in MB. This parameter needs to be configured when resource groups are used.
     * @param Memory Memory size, in MB. This parameter needs to be configured when resource groups are used.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get GPU card type, which is required to be configured when resource groups are used. 
     * @return GpuType GPU card type, which is required to be configured when resource groups are used.
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU card type, which is required to be configured when resource groups are used.
     * @param GpuType GPU card type, which is required to be configured when resource groups are used.
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get Number of GPU cards, which is required to be configured when resource groups are used. Unit: 1/100, where 100 represents 1 card. 
     * @return Gpu Number of GPU cards, which is required to be configured when resource groups are used. Unit: 1/100, where 100 represents 1 card.
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set Number of GPU cards, which is required to be configured when resource groups are used. Unit: 1/100, where 100 represents 1 card.
     * @param Gpu Number of GPU cards, which is required to be configured when resource groups are used. Unit: 1/100, where 100 represents 1 card.
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get CVM instance specification ID.
CVM instance specification (for postpaid billing). Valid values:
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32 
     * @return InstanceType CVM instance specification ID.
CVM instance specification (for postpaid billing). Valid values:
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set CVM instance specification ID.
CVM instance specification (for postpaid billing). Valid values:
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32
     * @param InstanceType CVM instance specification ID.
CVM instance specification (for postpaid billing). Valid values:
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Number of compute nodes. 
     * @return InstanceNum Number of compute nodes.
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set Number of compute nodes.
     * @param InstanceNum Number of compute nodes.
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get CVM instance specification name.
CVM instance specification (for postpaid billing). Valid values:
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32 
     * @return InstanceTypeAlias CVM instance specification name.
CVM instance specification (for postpaid billing). Valid values:
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32
     */
    public String getInstanceTypeAlias() {
        return this.InstanceTypeAlias;
    }

    /**
     * Set CVM instance specification name.
CVM instance specification (for postpaid billing). Valid values:
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32
     * @param InstanceTypeAlias CVM instance specification name.
CVM instance specification (for postpaid billing). Valid values:
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32
     */
    public void setInstanceTypeAlias(String InstanceTypeAlias) {
        this.InstanceTypeAlias = InstanceTypeAlias;
    }

    /**
     * Get RDMA configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RDMAConfig RDMA configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RDMAConfig getRDMAConfig() {
        return this.RDMAConfig;
    }

    /**
     * Set RDMA configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RDMAConfig RDMA configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRDMAConfig(RDMAConfig RDMAConfig) {
        this.RDMAConfig = RDMAConfig;
    }

    public ResourceConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceConfigInfo(ResourceConfigInfo source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.InstanceTypeAlias != null) {
            this.InstanceTypeAlias = new String(source.InstanceTypeAlias);
        }
        if (source.RDMAConfig != null) {
            this.RDMAConfig = new RDMAConfig(source.RDMAConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "InstanceTypeAlias", this.InstanceTypeAlias);
        this.setParamObj(map, prefix + "RDMAConfig.", this.RDMAConfig);

    }
}

