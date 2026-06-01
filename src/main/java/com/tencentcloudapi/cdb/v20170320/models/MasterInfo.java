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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MasterInfo extends AbstractModel {

    /**
    * <p>Regional information</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Region ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>Availability zone ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>AZ information</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance long ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Instance status</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance type</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>Task status.</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>Memory capacity</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Disk capacity</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>Instance model</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Queries per second.</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>subnet ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>Dedicated cluster ID</p>
    */
    @SerializedName("ExClusterId")
    @Expose
    private String ExClusterId;

    /**
    * <p>Dedicated cluster name</p>
    */
    @SerializedName("ExClusterName")
    @Expose
    private String ExClusterName;

    /**
     * Get <p>Regional information</p> 
     * @return Region <p>Regional information</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Regional information</p>
     * @param Region <p>Regional information</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Region ID</p> 
     * @return RegionId <p>Region ID</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>Region ID</p>
     * @param RegionId <p>Region ID</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>Availability zone ID.</p> 
     * @return ZoneId <p>Availability zone ID.</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Availability zone ID.</p>
     * @param ZoneId <p>Availability zone ID.</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>AZ information</p> 
     * @return Zone <p>AZ information</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ information</p>
     * @param Zone <p>AZ information</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance long ID</p> 
     * @return ResourceId <p>Instance long ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Instance long ID</p>
     * @param ResourceId <p>Instance long ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Instance status</p> 
     * @return Status <p>Instance status</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status</p>
     * @param Status <p>Instance status</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Instance type</p> 
     * @return InstanceType <p>Instance type</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance type</p>
     * @param InstanceType <p>Instance type</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Task status.</p> 
     * @return TaskStatus <p>Task status.</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Task status.</p>
     * @param TaskStatus <p>Task status.</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Memory capacity</p> 
     * @return Memory <p>Memory capacity</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory capacity</p>
     * @param Memory <p>Memory capacity</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Disk capacity</p> 
     * @return Volume <p>Disk capacity</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Disk capacity</p>
     * @param Volume <p>Disk capacity</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>Instance model</p> 
     * @return DeviceType <p>Instance model</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance model</p>
     * @param DeviceType <p>Instance model</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Queries per second.</p> 
     * @return Qps <p>Queries per second.</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>Queries per second.</p>
     * @param Qps <p>Queries per second.</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>subnet ID</p> 
     * @return SubnetId <p>subnet ID</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>subnet ID</p>
     * @param SubnetId <p>subnet ID</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Dedicated cluster ID</p> 
     * @return ExClusterId <p>Dedicated cluster ID</p>
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * Set <p>Dedicated cluster ID</p>
     * @param ExClusterId <p>Dedicated cluster ID</p>
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * Get <p>Dedicated cluster name</p> 
     * @return ExClusterName <p>Dedicated cluster name</p>
     */
    public String getExClusterName() {
        return this.ExClusterName;
    }

    /**
     * Set <p>Dedicated cluster name</p>
     * @param ExClusterName <p>Dedicated cluster name</p>
     */
    public void setExClusterName(String ExClusterName) {
        this.ExClusterName = ExClusterName;
    }

    public MasterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MasterInfo(MasterInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.ExClusterId != null) {
            this.ExClusterId = new String(source.ExClusterId);
        }
        if (source.ExClusterName != null) {
            this.ExClusterName = new String(source.ExClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ExClusterId", this.ExClusterId);
        this.setParamSimple(map, prefix + "ExClusterName", this.ExClusterName);

    }
}

