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

public class Instance extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Bound Physical Machine ID</p>
    */
    @SerializedName("MachineId")
    @Expose
    private String MachineId;

    /**
    * <p>Model specifications</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Availability zone code</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Image version number</p>
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * <p>Instance status, value range: allocating, running, isolating, isolated, terminating, error.</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Operation status: normal, starting, stopping, stopped, rebooting.</p>
    */
    @SerializedName("OperateStatus")
    @Expose
    private String OperateStatus;

    /**
    * <p>VPC ID.</p>
    */
    @SerializedName("PrivateNetworkId")
    @Expose
    private String PrivateNetworkId;

    /**
    * <p>Private IPv4 address</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>Private IPv6 address</p>
    */
    @SerializedName("PrivateIpV6")
    @Expose
    private String PrivateIpV6;

    /**
    * <p>Public network ID.</p>
    */
    @SerializedName("PublicNetworkId")
    @Expose
    private String PublicNetworkId;

    /**
    * <p>Public IPv4 address</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Public IPv6 address</p>
    */
    @SerializedName("PublicIpV6")
    @Expose
    private String PublicIpV6;

    /**
    * <p>File System Type</p>
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
    * <p>Creation time, in the ISO 8601 standard format, using UTC time. Format: YYYY-MM-DDThh:mm:ssZ.</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Instance family flag</p>
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * <p>Model Family Name</p>
    */
    @SerializedName("InstanceFamilyName")
    @Expose
    private String InstanceFamilyName;

    /**
    * <p>CPU Model</p>
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * <p>CPU cores.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Memory size.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

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
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Bound Physical Machine ID</p> 
     * @return MachineId <p>Bound Physical Machine ID</p>
     */
    public String getMachineId() {
        return this.MachineId;
    }

    /**
     * Set <p>Bound Physical Machine ID</p>
     * @param MachineId <p>Bound Physical Machine ID</p>
     */
    public void setMachineId(String MachineId) {
        this.MachineId = MachineId;
    }

    /**
     * Get <p>Model specifications</p> 
     * @return InstanceType <p>Model specifications</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Model specifications</p>
     * @param InstanceType <p>Model specifications</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Availability zone code</p> 
     * @return Zone <p>Availability zone code</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Availability zone code</p>
     * @param Zone <p>Availability zone code</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageId <p>Image ID.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageId <p>Image ID.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Image version number</p> 
     * @return VersionNumber <p>Image version number</p>
     * @deprecated
     */
    @Deprecated
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set <p>Image version number</p>
     * @param VersionNumber <p>Image version number</p>
     * @deprecated
     */
    @Deprecated
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get <p>Instance status, value range: allocating, running, isolating, isolated, terminating, error.</p> 
     * @return InstanceStatus <p>Instance status, value range: allocating, running, isolating, isolated, terminating, error.</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status, value range: allocating, running, isolating, isolated, terminating, error.</p>
     * @param InstanceStatus <p>Instance status, value range: allocating, running, isolating, isolated, terminating, error.</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Operation status: normal, starting, stopping, stopped, rebooting.</p> 
     * @return OperateStatus <p>Operation status: normal, starting, stopping, stopped, rebooting.</p>
     */
    public String getOperateStatus() {
        return this.OperateStatus;
    }

    /**
     * Set <p>Operation status: normal, starting, stopping, stopped, rebooting.</p>
     * @param OperateStatus <p>Operation status: normal, starting, stopping, stopped, rebooting.</p>
     */
    public void setOperateStatus(String OperateStatus) {
        this.OperateStatus = OperateStatus;
    }

    /**
     * Get <p>VPC ID.</p> 
     * @return PrivateNetworkId <p>VPC ID.</p>
     */
    public String getPrivateNetworkId() {
        return this.PrivateNetworkId;
    }

    /**
     * Set <p>VPC ID.</p>
     * @param PrivateNetworkId <p>VPC ID.</p>
     */
    public void setPrivateNetworkId(String PrivateNetworkId) {
        this.PrivateNetworkId = PrivateNetworkId;
    }

    /**
     * Get <p>Private IPv4 address</p> 
     * @return PrivateIp <p>Private IPv4 address</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>Private IPv4 address</p>
     * @param PrivateIp <p>Private IPv4 address</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>Private IPv6 address</p> 
     * @return PrivateIpV6 <p>Private IPv6 address</p>
     */
    public String getPrivateIpV6() {
        return this.PrivateIpV6;
    }

    /**
     * Set <p>Private IPv6 address</p>
     * @param PrivateIpV6 <p>Private IPv6 address</p>
     */
    public void setPrivateIpV6(String PrivateIpV6) {
        this.PrivateIpV6 = PrivateIpV6;
    }

    /**
     * Get <p>Public network ID.</p> 
     * @return PublicNetworkId <p>Public network ID.</p>
     */
    public String getPublicNetworkId() {
        return this.PublicNetworkId;
    }

    /**
     * Set <p>Public network ID.</p>
     * @param PublicNetworkId <p>Public network ID.</p>
     */
    public void setPublicNetworkId(String PublicNetworkId) {
        this.PublicNetworkId = PublicNetworkId;
    }

    /**
     * Get <p>Public IPv4 address</p> 
     * @return PublicIp <p>Public IPv4 address</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public IPv4 address</p>
     * @param PublicIp <p>Public IPv4 address</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Public IPv6 address</p> 
     * @return PublicIpV6 <p>Public IPv6 address</p>
     */
    public String getPublicIpV6() {
        return this.PublicIpV6;
    }

    /**
     * Set <p>Public IPv6 address</p>
     * @param PublicIpV6 <p>Public IPv6 address</p>
     */
    public void setPublicIpV6(String PublicIpV6) {
        this.PublicIpV6 = PublicIpV6;
    }

    /**
     * Get <p>File System Type</p> 
     * @return FileSystemType <p>File System Type</p>
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set <p>File System Type</p>
     * @param FileSystemType <p>File System Type</p>
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    /**
     * Get <p>Creation time, in the ISO 8601 standard format, using UTC time. Format: YYYY-MM-DDThh:mm:ssZ.</p> 
     * @return CreatedTime <p>Creation time, in the ISO 8601 standard format, using UTC time. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>Creation time, in the ISO 8601 standard format, using UTC time. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * @param CreatedTime <p>Creation time, in the ISO 8601 standard format, using UTC time. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Instance family flag</p> 
     * @return InstanceFamily <p>Instance family flag</p>
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set <p>Instance family flag</p>
     * @param InstanceFamily <p>Instance family flag</p>
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get <p>Model Family Name</p> 
     * @return InstanceFamilyName <p>Model Family Name</p>
     */
    public String getInstanceFamilyName() {
        return this.InstanceFamilyName;
    }

    /**
     * Set <p>Model Family Name</p>
     * @param InstanceFamilyName <p>Model Family Name</p>
     */
    public void setInstanceFamilyName(String InstanceFamilyName) {
        this.InstanceFamilyName = InstanceFamilyName;
    }

    /**
     * Get <p>CPU Model</p> 
     * @return CpuType <p>CPU Model</p>
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set <p>CPU Model</p>
     * @param CpuType <p>CPU Model</p>
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get <p>CPU cores.</p> 
     * @return Cpu <p>CPU cores.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU cores.</p>
     * @param Cpu <p>CPU cores.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Memory size.</p> 
     * @return Memory <p>Memory size.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory size.</p>
     * @param Memory <p>Memory size.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MachineId != null) {
            this.MachineId = new String(source.MachineId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.OperateStatus != null) {
            this.OperateStatus = new String(source.OperateStatus);
        }
        if (source.PrivateNetworkId != null) {
            this.PrivateNetworkId = new String(source.PrivateNetworkId);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PrivateIpV6 != null) {
            this.PrivateIpV6 = new String(source.PrivateIpV6);
        }
        if (source.PublicNetworkId != null) {
            this.PublicNetworkId = new String(source.PublicNetworkId);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PublicIpV6 != null) {
            this.PublicIpV6 = new String(source.PublicIpV6);
        }
        if (source.FileSystemType != null) {
            this.FileSystemType = new String(source.FileSystemType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.InstanceFamilyName != null) {
            this.InstanceFamilyName = new String(source.InstanceFamilyName);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "MachineId", this.MachineId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "OperateStatus", this.OperateStatus);
        this.setParamSimple(map, prefix + "PrivateNetworkId", this.PrivateNetworkId);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PrivateIpV6", this.PrivateIpV6);
        this.setParamSimple(map, prefix + "PublicNetworkId", this.PublicNetworkId);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PublicIpV6", this.PublicIpV6);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "InstanceFamilyName", this.InstanceFamilyName);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

