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

public class HostResource extends AbstractModel{

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
    * Total memory of the CDH instance; unit: GiB
    */
    @SerializedName("MemTotal")
    @Expose
    private Float MemTotal;

    /**
    * Available memory of the CDH instance; unit: GiB
    */
    @SerializedName("MemAvailable")
    @Expose
    private Float MemAvailable;

    /**
    * Total disk size of the CDH instance; unit: GiB
    */
    @SerializedName("DiskTotal")
    @Expose
    private Long DiskTotal;

    /**
    * Avilable disk size of the CDH instance; unit: GiB
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Long DiskAvailable;

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
     * Get Total memory of the CDH instance; unit: GiB 
     * @return MemTotal Total memory of the CDH instance; unit: GiB
     */
    public Float getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set Total memory of the CDH instance; unit: GiB
     * @param MemTotal Total memory of the CDH instance; unit: GiB
     */
    public void setMemTotal(Float MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get Available memory of the CDH instance; unit: GiB 
     * @return MemAvailable Available memory of the CDH instance; unit: GiB
     */
    public Float getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set Available memory of the CDH instance; unit: GiB
     * @param MemAvailable Available memory of the CDH instance; unit: GiB
     */
    public void setMemAvailable(Float MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * Get Total disk size of the CDH instance; unit: GiB 
     * @return DiskTotal Total disk size of the CDH instance; unit: GiB
     */
    public Long getDiskTotal() {
        return this.DiskTotal;
    }

    /**
     * Set Total disk size of the CDH instance; unit: GiB
     * @param DiskTotal Total disk size of the CDH instance; unit: GiB
     */
    public void setDiskTotal(Long DiskTotal) {
        this.DiskTotal = DiskTotal;
    }

    /**
     * Get Avilable disk size of the CDH instance; unit: GiB 
     * @return DiskAvailable Avilable disk size of the CDH instance; unit: GiB
     */
    public Long getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * Set Avilable disk size of the CDH instance; unit: GiB
     * @param DiskAvailable Avilable disk size of the CDH instance; unit: GiB
     */
    public void setDiskAvailable(Long DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
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

    }
}

