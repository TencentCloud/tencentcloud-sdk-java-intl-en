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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostResource extends AbstractModel {

    /**
    * Total number of CPU cores in the CDH instance
    */
    @SerializedName("CpuTotal")
    @Expose
    private Long CpuTotal;

    /**
    * Number of available CPU cores in the CDH instance
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Long CpuAvailable;

    /**
    * Total memory size of the CDH instance (unit: GiB)
    */
    @SerializedName("MemTotal")
    @Expose
    private Float MemTotal;

    /**
    * Available memory size of the CDH instance (unit: GiB)
    */
    @SerializedName("MemAvailable")
    @Expose
    private Float MemAvailable;

    /**
    * Total disk size of the CDH instance (unit: GiB)
    */
    @SerializedName("DiskTotal")
    @Expose
    private Long DiskTotal;

    /**
    * Available disk size of the CDH instance (unit: GiB)
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Long DiskAvailable;

    /**
    * Disk type of the CDH instance
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Total number of GPU cards in the CDH instance
    */
    @SerializedName("GpuTotal")
    @Expose
    private Long GpuTotal;

    /**
    * Number of available GPU cards in the CDH instance
    */
    @SerializedName("GpuAvailable")
    @Expose
    private Long GpuAvailable;

    /**
     * Get Total number of CPU cores in the CDH instance 
     * @return CpuTotal Total number of CPU cores in the CDH instance
     */
    public Long getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set Total number of CPU cores in the CDH instance
     * @param CpuTotal Total number of CPU cores in the CDH instance
     */
    public void setCpuTotal(Long CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get Number of available CPU cores in the CDH instance 
     * @return CpuAvailable Number of available CPU cores in the CDH instance
     */
    public Long getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set Number of available CPU cores in the CDH instance
     * @param CpuAvailable Number of available CPU cores in the CDH instance
     */
    public void setCpuAvailable(Long CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get Total memory size of the CDH instance (unit: GiB) 
     * @return MemTotal Total memory size of the CDH instance (unit: GiB)
     */
    public Float getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set Total memory size of the CDH instance (unit: GiB)
     * @param MemTotal Total memory size of the CDH instance (unit: GiB)
     */
    public void setMemTotal(Float MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get Available memory size of the CDH instance (unit: GiB) 
     * @return MemAvailable Available memory size of the CDH instance (unit: GiB)
     */
    public Float getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set Available memory size of the CDH instance (unit: GiB)
     * @param MemAvailable Available memory size of the CDH instance (unit: GiB)
     */
    public void setMemAvailable(Float MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * Get Total disk size of the CDH instance (unit: GiB) 
     * @return DiskTotal Total disk size of the CDH instance (unit: GiB)
     */
    public Long getDiskTotal() {
        return this.DiskTotal;
    }

    /**
     * Set Total disk size of the CDH instance (unit: GiB)
     * @param DiskTotal Total disk size of the CDH instance (unit: GiB)
     */
    public void setDiskTotal(Long DiskTotal) {
        this.DiskTotal = DiskTotal;
    }

    /**
     * Get Available disk size of the CDH instance (unit: GiB) 
     * @return DiskAvailable Available disk size of the CDH instance (unit: GiB)
     */
    public Long getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * Set Available disk size of the CDH instance (unit: GiB)
     * @param DiskAvailable Available disk size of the CDH instance (unit: GiB)
     */
    public void setDiskAvailable(Long DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
    }

    /**
     * Get Disk type of the CDH instance 
     * @return DiskType Disk type of the CDH instance
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk type of the CDH instance
     * @param DiskType Disk type of the CDH instance
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Total number of GPU cards in the CDH instance 
     * @return GpuTotal Total number of GPU cards in the CDH instance
     */
    public Long getGpuTotal() {
        return this.GpuTotal;
    }

    /**
     * Set Total number of GPU cards in the CDH instance
     * @param GpuTotal Total number of GPU cards in the CDH instance
     */
    public void setGpuTotal(Long GpuTotal) {
        this.GpuTotal = GpuTotal;
    }

    /**
     * Get Number of available GPU cards in the CDH instance 
     * @return GpuAvailable Number of available GPU cards in the CDH instance
     */
    public Long getGpuAvailable() {
        return this.GpuAvailable;
    }

    /**
     * Set Number of available GPU cards in the CDH instance
     * @param GpuAvailable Number of available GPU cards in the CDH instance
     */
    public void setGpuAvailable(Long GpuAvailable) {
        this.GpuAvailable = GpuAvailable;
    }

    public HostResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostResource(HostResource source) {
        if (source.CpuTotal != null) {
            this.CpuTotal = new Long(source.CpuTotal);
        }
        if (source.CpuAvailable != null) {
            this.CpuAvailable = new Long(source.CpuAvailable);
        }
        if (source.MemTotal != null) {
            this.MemTotal = new Float(source.MemTotal);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new Float(source.MemAvailable);
        }
        if (source.DiskTotal != null) {
            this.DiskTotal = new Long(source.DiskTotal);
        }
        if (source.DiskAvailable != null) {
            this.DiskAvailable = new Long(source.DiskAvailable);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.GpuTotal != null) {
            this.GpuTotal = new Long(source.GpuTotal);
        }
        if (source.GpuAvailable != null) {
            this.GpuAvailable = new Long(source.GpuAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);
        this.setParamSimple(map, prefix + "DiskTotal", this.DiskTotal);
        this.setParamSimple(map, prefix + "DiskAvailable", this.DiskAvailable);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "GpuTotal", this.GpuTotal);
        this.setParamSimple(map, prefix + "GpuAvailable", this.GpuAvailable);

    }
}

