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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MasterInfo extends AbstractModel {

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * AZ ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * AZ information
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Long instance ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Instance status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Task status
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Memory capacity
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk capacity
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Instance model
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Queries per second
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Dedicated cluster ID
    */
    @SerializedName("ExClusterId")
    @Expose
    private String ExClusterId;

    /**
    * Dedicated cluster name
    */
    @SerializedName("ExClusterName")
    @Expose
    private String ExClusterName;

    /**
     * Get Region information 
     * @return Region Region information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information
     * @param Region Region information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get AZ ID 
     * @return ZoneId AZ ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set AZ ID
     * @param ZoneId AZ ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get AZ information 
     * @return Zone AZ information
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ information
     * @param Zone AZ information
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Long instance ID 
     * @return ResourceId Long instance ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Long instance ID
     * @param ResourceId Long instance ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Instance status 
     * @return Status Instance status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status
     * @param Status Instance status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Task status 
     * @return TaskStatus Task status
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status
     * @param TaskStatus Task status
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Memory capacity 
     * @return Memory Memory capacity
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory capacity
     * @param Memory Memory capacity
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk capacity 
     * @return Volume Disk capacity
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Disk capacity
     * @param Volume Disk capacity
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Instance model 
     * @return DeviceType Instance model
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Instance model
     * @param DeviceType Instance model
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
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
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Dedicated cluster ID 
     * @return ExClusterId Dedicated cluster ID
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * Set Dedicated cluster ID
     * @param ExClusterId Dedicated cluster ID
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * Get Dedicated cluster name 
     * @return ExClusterName Dedicated cluster name
     */
    public String getExClusterName() {
        return this.ExClusterName;
    }

    /**
     * Set Dedicated cluster name
     * @param ExClusterName Dedicated cluster name
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

