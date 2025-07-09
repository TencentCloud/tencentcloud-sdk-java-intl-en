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

public class ChcHost extends AbstractModel {

    /**
    * CHC host ID
    */
    @SerializedName("ChcId")
    @Expose
    private String ChcId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Server serial number
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * CHC host status<br/>
<ul>
<li>REGISTERED: The CHC host is registered, but the out-of-band network and deployment network are not configured.</li>
<li>VPC_READY: The out-of-band network and deployment network are configured.</li>
<li>PREPARED: It’s ready and can be associated with a CVM.</li>
<li>ONLINE: It’s already associated with a CVM.</li>
</ul>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Device type
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * Availability zone
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BmcVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud BmcVirtualPrivateCloud;

    /**
    * Out-of-band network IP
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BmcIp")
    @Expose
    private String BmcIp;

    /**
    * Out-of-band network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BmcSecurityGroupIds")
    @Expose
    private String [] BmcSecurityGroupIds;

    /**
    * Deployment network
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud DeployVirtualPrivateCloud;

    /**
    * Deployment network IP
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployIp")
    @Expose
    private String DeployIp;

    /**
    * Deployment network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeploySecurityGroupIds")
    @Expose
    private String [] DeploySecurityGroupIds;

    /**
    * ID of the associated CVM
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * Server creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Instance hardware description, including CPU cores, memory capacity and disk capacity.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("HardwareDescription")
    @Expose
    private String HardwareDescription;

    /**
    * CPU cores of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Memory capacity of the CHC host (unit: GB)
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk capacity of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Disk")
    @Expose
    private String Disk;

    /**
    * MAC address assigned under the out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BmcMAC")
    @Expose
    private String BmcMAC;

    /**
    * MAC address assigned under the deployment network
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployMAC")
    @Expose
    private String DeployMAC;

    /**
    * Management type
HOSTING: Hosting
TENANT: Leasing
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TenantType")
    @Expose
    private String TenantType;

    /**
    * CHC DHCP option, which is used for MiniOS debugging.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("DeployExtraConfig")
    @Expose
    private ChcDeployExtraConfig DeployExtraConfig;

    /**
     * Get CHC host ID 
     * @return ChcId CHC host ID
     */
    public String getChcId() {
        return this.ChcId;
    }

    /**
     * Set CHC host ID
     * @param ChcId CHC host ID
     */
    public void setChcId(String ChcId) {
        this.ChcId = ChcId;
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
     * Get Server serial number 
     * @return SerialNumber Server serial number
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set Server serial number
     * @param SerialNumber Server serial number
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get CHC host status<br/>
<ul>
<li>REGISTERED: The CHC host is registered, but the out-of-band network and deployment network are not configured.</li>
<li>VPC_READY: The out-of-band network and deployment network are configured.</li>
<li>PREPARED: It’s ready and can be associated with a CVM.</li>
<li>ONLINE: It’s already associated with a CVM.</li>
</ul> 
     * @return InstanceState CHC host status<br/>
<ul>
<li>REGISTERED: The CHC host is registered, but the out-of-band network and deployment network are not configured.</li>
<li>VPC_READY: The out-of-band network and deployment network are configured.</li>
<li>PREPARED: It’s ready and can be associated with a CVM.</li>
<li>ONLINE: It’s already associated with a CVM.</li>
</ul>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set CHC host status<br/>
<ul>
<li>REGISTERED: The CHC host is registered, but the out-of-band network and deployment network are not configured.</li>
<li>VPC_READY: The out-of-band network and deployment network are configured.</li>
<li>PREPARED: It’s ready and can be associated with a CVM.</li>
<li>ONLINE: It’s already associated with a CVM.</li>
</ul>
     * @param InstanceState CHC host status<br/>
<ul>
<li>REGISTERED: The CHC host is registered, but the out-of-band network and deployment network are not configured.</li>
<li>VPC_READY: The out-of-band network and deployment network are configured.</li>
<li>PREPARED: It’s ready and can be associated with a CVM.</li>
<li>ONLINE: It’s already associated with a CVM.</li>
</ul>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Device type
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DeviceType Device type
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Device type
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DeviceType Device type
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get Availability zone 
     * @return Placement Availability zone
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Availability zone
     * @param Placement Availability zone
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BmcVirtualPrivateCloud Out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public VirtualPrivateCloud getBmcVirtualPrivateCloud() {
        return this.BmcVirtualPrivateCloud;
    }

    /**
     * Set Out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BmcVirtualPrivateCloud Out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBmcVirtualPrivateCloud(VirtualPrivateCloud BmcVirtualPrivateCloud) {
        this.BmcVirtualPrivateCloud = BmcVirtualPrivateCloud;
    }

    /**
     * Get Out-of-band network IP
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BmcIp Out-of-band network IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBmcIp() {
        return this.BmcIp;
    }

    /**
     * Set Out-of-band network IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BmcIp Out-of-band network IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBmcIp(String BmcIp) {
        this.BmcIp = BmcIp;
    }

    /**
     * Get Out-of-band network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BmcSecurityGroupIds Out-of-band network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getBmcSecurityGroupIds() {
        return this.BmcSecurityGroupIds;
    }

    /**
     * Set Out-of-band network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BmcSecurityGroupIds Out-of-band network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBmcSecurityGroupIds(String [] BmcSecurityGroupIds) {
        this.BmcSecurityGroupIds = BmcSecurityGroupIds;
    }

    /**
     * Get Deployment network
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DeployVirtualPrivateCloud Deployment network
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public VirtualPrivateCloud getDeployVirtualPrivateCloud() {
        return this.DeployVirtualPrivateCloud;
    }

    /**
     * Set Deployment network
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DeployVirtualPrivateCloud Deployment network
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeployVirtualPrivateCloud(VirtualPrivateCloud DeployVirtualPrivateCloud) {
        this.DeployVirtualPrivateCloud = DeployVirtualPrivateCloud;
    }

    /**
     * Get Deployment network IP
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DeployIp Deployment network IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDeployIp() {
        return this.DeployIp;
    }

    /**
     * Set Deployment network IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DeployIp Deployment network IP
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeployIp(String DeployIp) {
        this.DeployIp = DeployIp;
    }

    /**
     * Get Deployment network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DeploySecurityGroupIds Deployment network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getDeploySecurityGroupIds() {
        return this.DeploySecurityGroupIds;
    }

    /**
     * Set Deployment network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DeploySecurityGroupIds Deployment network security group ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeploySecurityGroupIds(String [] DeploySecurityGroupIds) {
        this.DeploySecurityGroupIds = DeploySecurityGroupIds;
    }

    /**
     * Get ID of the associated CVM
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CvmInstanceId ID of the associated CVM
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set ID of the associated CVM
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CvmInstanceId ID of the associated CVM
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get Server creation time 
     * @return CreatedTime Server creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Server creation time
     * @param CreatedTime Server creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Instance hardware description, including CPU cores, memory capacity and disk capacity.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return HardwareDescription Instance hardware description, including CPU cores, memory capacity and disk capacity.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getHardwareDescription() {
        return this.HardwareDescription;
    }

    /**
     * Set Instance hardware description, including CPU cores, memory capacity and disk capacity.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param HardwareDescription Instance hardware description, including CPU cores, memory capacity and disk capacity.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHardwareDescription(String HardwareDescription) {
        this.HardwareDescription = HardwareDescription;
    }

    /**
     * Get CPU cores of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CPU CPU cores of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU cores of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CPU CPU cores of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Memory capacity of the CHC host (unit: GB)
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Memory Memory capacity of the CHC host (unit: GB)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory capacity of the CHC host (unit: GB)
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Memory Memory capacity of the CHC host (unit: GB)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk capacity of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Disk Disk capacity of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDisk() {
        return this.Disk;
    }

    /**
     * Set Disk capacity of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Disk Disk capacity of the CHC host
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDisk(String Disk) {
        this.Disk = Disk;
    }

    /**
     * Get MAC address assigned under the out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BmcMAC MAC address assigned under the out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBmcMAC() {
        return this.BmcMAC;
    }

    /**
     * Set MAC address assigned under the out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BmcMAC MAC address assigned under the out-of-band network
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBmcMAC(String BmcMAC) {
        this.BmcMAC = BmcMAC;
    }

    /**
     * Get MAC address assigned under the deployment network
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DeployMAC MAC address assigned under the deployment network
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDeployMAC() {
        return this.DeployMAC;
    }

    /**
     * Set MAC address assigned under the deployment network
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DeployMAC MAC address assigned under the deployment network
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeployMAC(String DeployMAC) {
        this.DeployMAC = DeployMAC;
    }

    /**
     * Get Management type
HOSTING: Hosting
TENANT: Leasing
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TenantType Management type
HOSTING: Hosting
TENANT: Leasing
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTenantType() {
        return this.TenantType;
    }

    /**
     * Set Management type
HOSTING: Hosting
TENANT: Leasing
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TenantType Management type
HOSTING: Hosting
TENANT: Leasing
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTenantType(String TenantType) {
        this.TenantType = TenantType;
    }

    /**
     * Get CHC DHCP option, which is used for MiniOS debugging.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return DeployExtraConfig CHC DHCP option, which is used for MiniOS debugging.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ChcDeployExtraConfig getDeployExtraConfig() {
        return this.DeployExtraConfig;
    }

    /**
     * Set CHC DHCP option, which is used for MiniOS debugging.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param DeployExtraConfig CHC DHCP option, which is used for MiniOS debugging.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDeployExtraConfig(ChcDeployExtraConfig DeployExtraConfig) {
        this.DeployExtraConfig = DeployExtraConfig;
    }

    public ChcHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChcHost(ChcHost source) {
        if (source.ChcId != null) {
            this.ChcId = new String(source.ChcId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.BmcVirtualPrivateCloud != null) {
            this.BmcVirtualPrivateCloud = new VirtualPrivateCloud(source.BmcVirtualPrivateCloud);
        }
        if (source.BmcIp != null) {
            this.BmcIp = new String(source.BmcIp);
        }
        if (source.BmcSecurityGroupIds != null) {
            this.BmcSecurityGroupIds = new String[source.BmcSecurityGroupIds.length];
            for (int i = 0; i < source.BmcSecurityGroupIds.length; i++) {
                this.BmcSecurityGroupIds[i] = new String(source.BmcSecurityGroupIds[i]);
            }
        }
        if (source.DeployVirtualPrivateCloud != null) {
            this.DeployVirtualPrivateCloud = new VirtualPrivateCloud(source.DeployVirtualPrivateCloud);
        }
        if (source.DeployIp != null) {
            this.DeployIp = new String(source.DeployIp);
        }
        if (source.DeploySecurityGroupIds != null) {
            this.DeploySecurityGroupIds = new String[source.DeploySecurityGroupIds.length];
            for (int i = 0; i < source.DeploySecurityGroupIds.length; i++) {
                this.DeploySecurityGroupIds[i] = new String(source.DeploySecurityGroupIds[i]);
            }
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.HardwareDescription != null) {
            this.HardwareDescription = new String(source.HardwareDescription);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Disk != null) {
            this.Disk = new String(source.Disk);
        }
        if (source.BmcMAC != null) {
            this.BmcMAC = new String(source.BmcMAC);
        }
        if (source.DeployMAC != null) {
            this.DeployMAC = new String(source.DeployMAC);
        }
        if (source.TenantType != null) {
            this.TenantType = new String(source.TenantType);
        }
        if (source.DeployExtraConfig != null) {
            this.DeployExtraConfig = new ChcDeployExtraConfig(source.DeployExtraConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChcId", this.ChcId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "BmcVirtualPrivateCloud.", this.BmcVirtualPrivateCloud);
        this.setParamSimple(map, prefix + "BmcIp", this.BmcIp);
        this.setParamArraySimple(map, prefix + "BmcSecurityGroupIds.", this.BmcSecurityGroupIds);
        this.setParamObj(map, prefix + "DeployVirtualPrivateCloud.", this.DeployVirtualPrivateCloud);
        this.setParamSimple(map, prefix + "DeployIp", this.DeployIp);
        this.setParamArraySimple(map, prefix + "DeploySecurityGroupIds.", this.DeploySecurityGroupIds);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "HardwareDescription", this.HardwareDescription);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "BmcMAC", this.BmcMAC);
        this.setParamSimple(map, prefix + "DeployMAC", this.DeployMAC);
        this.setParamSimple(map, prefix + "TenantType", this.TenantType);
        this.setParamObj(map, prefix + "DeployExtraConfig.", this.DeployExtraConfig);

    }
}

