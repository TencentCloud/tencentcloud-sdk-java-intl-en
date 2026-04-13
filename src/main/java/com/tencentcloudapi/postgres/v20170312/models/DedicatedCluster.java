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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedCluster extends AbstractModel {

    /**
    * CDC ID.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * Dedicated cluster name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the AZ of the exclusive cluster.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Disaster recovery cluster.
    */
    @SerializedName("StandbyDedicatedClusterSet")
    @Expose
    private String [] StandbyDedicatedClusterSet;

    /**
    * Specifies the instance count.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Total number of cpus.
    */
    @SerializedName("CpuTotal")
    @Expose
    private Long CpuTotal;

    /**
    * Specifies the available amount of Cpu.
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Long CpuAvailable;

    /**
    * Total memory capacity in GB.
    */
    @SerializedName("MemTotal")
    @Expose
    private Long MemTotal;

    /**
    * Available memory in GB.
    */
    @SerializedName("MemAvailable")
    @Expose
    private Long MemAvailable;

    /**
    * Total disk capacity (unit: GB).
    */
    @SerializedName("DiskTotal")
    @Expose
    private Long DiskTotal;

    /**
    * Disk availability (unit: GB).
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Long DiskAvailable;

    /**
     * Get CDC ID. 
     * @return DedicatedClusterId CDC ID.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC ID.
     * @param DedicatedClusterId CDC ID.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get Dedicated cluster name. 
     * @return Name Dedicated cluster name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dedicated cluster name.
     * @param Name Dedicated cluster name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the AZ of the exclusive cluster. 
     * @return Zone Specifies the AZ of the exclusive cluster.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Specifies the AZ of the exclusive cluster.
     * @param Zone Specifies the AZ of the exclusive cluster.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Disaster recovery cluster. 
     * @return StandbyDedicatedClusterSet Disaster recovery cluster.
     */
    public String [] getStandbyDedicatedClusterSet() {
        return this.StandbyDedicatedClusterSet;
    }

    /**
     * Set Disaster recovery cluster.
     * @param StandbyDedicatedClusterSet Disaster recovery cluster.
     */
    public void setStandbyDedicatedClusterSet(String [] StandbyDedicatedClusterSet) {
        this.StandbyDedicatedClusterSet = StandbyDedicatedClusterSet;
    }

    /**
     * Get Specifies the instance count. 
     * @return InstanceCount Specifies the instance count.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Specifies the instance count.
     * @param InstanceCount Specifies the instance count.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Total number of cpus. 
     * @return CpuTotal Total number of cpus.
     */
    public Long getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set Total number of cpus.
     * @param CpuTotal Total number of cpus.
     */
    public void setCpuTotal(Long CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get Specifies the available amount of Cpu. 
     * @return CpuAvailable Specifies the available amount of Cpu.
     */
    public Long getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set Specifies the available amount of Cpu.
     * @param CpuAvailable Specifies the available amount of Cpu.
     */
    public void setCpuAvailable(Long CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get Total memory capacity in GB. 
     * @return MemTotal Total memory capacity in GB.
     */
    public Long getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set Total memory capacity in GB.
     * @param MemTotal Total memory capacity in GB.
     */
    public void setMemTotal(Long MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get Available memory in GB. 
     * @return MemAvailable Available memory in GB.
     */
    public Long getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set Available memory in GB.
     * @param MemAvailable Available memory in GB.
     */
    public void setMemAvailable(Long MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * Get Total disk capacity (unit: GB). 
     * @return DiskTotal Total disk capacity (unit: GB).
     */
    public Long getDiskTotal() {
        return this.DiskTotal;
    }

    /**
     * Set Total disk capacity (unit: GB).
     * @param DiskTotal Total disk capacity (unit: GB).
     */
    public void setDiskTotal(Long DiskTotal) {
        this.DiskTotal = DiskTotal;
    }

    /**
     * Get Disk availability (unit: GB). 
     * @return DiskAvailable Disk availability (unit: GB).
     */
    public Long getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * Set Disk availability (unit: GB).
     * @param DiskAvailable Disk availability (unit: GB).
     */
    public void setDiskAvailable(Long DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
    }

    public DedicatedCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedCluster(DedicatedCluster source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.StandbyDedicatedClusterSet != null) {
            this.StandbyDedicatedClusterSet = new String[source.StandbyDedicatedClusterSet.length];
            for (int i = 0; i < source.StandbyDedicatedClusterSet.length; i++) {
                this.StandbyDedicatedClusterSet[i] = new String(source.StandbyDedicatedClusterSet[i]);
            }
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.CpuTotal != null) {
            this.CpuTotal = new Long(source.CpuTotal);
        }
        if (source.CpuAvailable != null) {
            this.CpuAvailable = new Long(source.CpuAvailable);
        }
        if (source.MemTotal != null) {
            this.MemTotal = new Long(source.MemTotal);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new Long(source.MemAvailable);
        }
        if (source.DiskTotal != null) {
            this.DiskTotal = new Long(source.DiskTotal);
        }
        if (source.DiskAvailable != null) {
            this.DiskAvailable = new Long(source.DiskAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "StandbyDedicatedClusterSet.", this.StandbyDedicatedClusterSet);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);
        this.setParamSimple(map, prefix + "DiskTotal", this.DiskTotal);
        this.setParamSimple(map, prefix + "DiskAvailable", this.DiskAvailable);

    }
}

