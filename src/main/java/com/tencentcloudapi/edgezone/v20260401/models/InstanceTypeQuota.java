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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeQuota extends AbstractModel {

    /**
    * Availability zone code.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Model specifications.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Model family.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Number of CPU cores.
    */
    @SerializedName("CpuCores")
    @Expose
    private Long CpuCores;

    /**
    * CPU type.
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * Memory size (GB).
    */
    @SerializedName("MemoryGb")
    @Expose
    private Long MemoryGb;

    /**
    * System disk type.
    */
    @SerializedName("SystemDiskType")
    @Expose
    private String SystemDiskType;

    /**
    * System disk size (GB).
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * Number of system disks.
    */
    @SerializedName("SystemDiskCount")
    @Expose
    private Long SystemDiskCount;

    /**
    * Data disk type.
    */
    @SerializedName("DataDiskType")
    @Expose
    private String DataDiskType;

    /**
    * Data disk size (GB).
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

    /**
    * Number of data disks.
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Long DataDiskCount;

    /**
    * Disk description string (backward compatibility).
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Network interface type.
    */
    @SerializedName("NetworkInterfaceType")
    @Expose
    private String NetworkInterfaceType;

    /**
    * GPU type. Empty string if no GPU is available.
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * Quota quantity. 0 indicates no restriction.
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
     * Get Availability zone code. 
     * @return Zone Availability zone code.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone code.
     * @param Zone Availability zone code.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Model specifications. 
     * @return InstanceType Model specifications.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Model specifications.
     * @param InstanceType Model specifications.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Model family. 
     * @return InstanceFamily Model family.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Model family.
     * @param InstanceFamily Model family.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Number of CPU cores. 
     * @return CpuCores Number of CPU cores.
     */
    public Long getCpuCores() {
        return this.CpuCores;
    }

    /**
     * Set Number of CPU cores.
     * @param CpuCores Number of CPU cores.
     */
    public void setCpuCores(Long CpuCores) {
        this.CpuCores = CpuCores;
    }

    /**
     * Get CPU type. 
     * @return CpuType CPU type.
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set CPU type.
     * @param CpuType CPU type.
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get Memory size (GB). 
     * @return MemoryGb Memory size (GB).
     */
    public Long getMemoryGb() {
        return this.MemoryGb;
    }

    /**
     * Set Memory size (GB).
     * @param MemoryGb Memory size (GB).
     */
    public void setMemoryGb(Long MemoryGb) {
        this.MemoryGb = MemoryGb;
    }

    /**
     * Get System disk type. 
     * @return SystemDiskType System disk type.
     */
    public String getSystemDiskType() {
        return this.SystemDiskType;
    }

    /**
     * Set System disk type.
     * @param SystemDiskType System disk type.
     */
    public void setSystemDiskType(String SystemDiskType) {
        this.SystemDiskType = SystemDiskType;
    }

    /**
     * Get System disk size (GB). 
     * @return SystemDiskSize System disk size (GB).
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set System disk size (GB).
     * @param SystemDiskSize System disk size (GB).
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get Number of system disks. 
     * @return SystemDiskCount Number of system disks.
     */
    public Long getSystemDiskCount() {
        return this.SystemDiskCount;
    }

    /**
     * Set Number of system disks.
     * @param SystemDiskCount Number of system disks.
     */
    public void setSystemDiskCount(Long SystemDiskCount) {
        this.SystemDiskCount = SystemDiskCount;
    }

    /**
     * Get Data disk type. 
     * @return DataDiskType Data disk type.
     */
    public String getDataDiskType() {
        return this.DataDiskType;
    }

    /**
     * Set Data disk type.
     * @param DataDiskType Data disk type.
     */
    public void setDataDiskType(String DataDiskType) {
        this.DataDiskType = DataDiskType;
    }

    /**
     * Get Data disk size (GB). 
     * @return DataDiskSize Data disk size (GB).
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set Data disk size (GB).
     * @param DataDiskSize Data disk size (GB).
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get Number of data disks. 
     * @return DataDiskCount Number of data disks.
     */
    public Long getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * Set Number of data disks.
     * @param DataDiskCount Number of data disks.
     */
    public void setDataDiskCount(Long DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
    }

    /**
     * Get Disk description string (backward compatibility). 
     * @return DiskType Disk description string (backward compatibility).
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk description string (backward compatibility).
     * @param DiskType Disk description string (backward compatibility).
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Network interface type. 
     * @return NetworkInterfaceType Network interface type.
     */
    public String getNetworkInterfaceType() {
        return this.NetworkInterfaceType;
    }

    /**
     * Set Network interface type.
     * @param NetworkInterfaceType Network interface type.
     */
    public void setNetworkInterfaceType(String NetworkInterfaceType) {
        this.NetworkInterfaceType = NetworkInterfaceType;
    }

    /**
     * Get GPU type. Empty string if no GPU is available. 
     * @return GpuType GPU type. Empty string if no GPU is available.
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set GPU type. Empty string if no GPU is available.
     * @param GpuType GPU type. Empty string if no GPU is available.
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get Quota quantity. 0 indicates no restriction. 
     * @return Quota Quota quantity. 0 indicates no restriction.
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set Quota quantity. 0 indicates no restriction.
     * @param Quota Quota quantity. 0 indicates no restriction.
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    public InstanceTypeQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceTypeQuota(InstanceTypeQuota source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.CpuCores != null) {
            this.CpuCores = new Long(source.CpuCores);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.MemoryGb != null) {
            this.MemoryGb = new Long(source.MemoryGb);
        }
        if (source.SystemDiskType != null) {
            this.SystemDiskType = new String(source.SystemDiskType);
        }
        if (source.SystemDiskSize != null) {
            this.SystemDiskSize = new Long(source.SystemDiskSize);
        }
        if (source.SystemDiskCount != null) {
            this.SystemDiskCount = new Long(source.SystemDiskCount);
        }
        if (source.DataDiskType != null) {
            this.DataDiskType = new String(source.DataDiskType);
        }
        if (source.DataDiskSize != null) {
            this.DataDiskSize = new Long(source.DataDiskSize);
        }
        if (source.DataDiskCount != null) {
            this.DataDiskCount = new Long(source.DataDiskCount);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.NetworkInterfaceType != null) {
            this.NetworkInterfaceType = new String(source.NetworkInterfaceType);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "CpuCores", this.CpuCores);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "MemoryGb", this.MemoryGb);
        this.setParamSimple(map, prefix + "SystemDiskType", this.SystemDiskType);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "SystemDiskCount", this.SystemDiskCount);
        this.setParamSimple(map, prefix + "DataDiskType", this.DataDiskType);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamSimple(map, prefix + "DataDiskCount", this.DataDiskCount);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "NetworkInterfaceType", this.NetworkInterfaceType);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

