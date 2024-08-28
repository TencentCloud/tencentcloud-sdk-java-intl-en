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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetMachineDetail extends AbstractModel {

    /**
    * Server QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Server UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Private IP address of server
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Server name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Operating system name
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * CPU information
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * Memory capacity, in GB
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Memory utilization, in percentage
    */
    @SerializedName("MemLoad")
    @Expose
    private String MemLoad;

    /**
    * Hard disk capacity, in GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Hard disk usage, in percentage
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * Number of partitions
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * Host public IP address
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Number of CPU
    */
    @SerializedName("CpuSize")
    @Expose
    private Long CpuSize;

    /**
    * CPU load
    */
    @SerializedName("CpuLoad")
    @Expose
    private String CpuLoad;

    /**
    * Protection Level. 0 Basic Edition; 1 Professional Edition; 2 Premium Edition; 3 General Discount Edition
    */
    @SerializedName("ProtectLevel")
    @Expose
    private Long ProtectLevel;

    /**
    * Risk status: UNKNOW - unknown; RISK - risky; SAFT - Safe
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * Days protected
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

    /**
    * Professional edition activation time
    */
    @SerializedName("BuyTime")
    @Expose
    private String BuyTime;

    /**
    * Professional edition expiration time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Kernel version
    */
    @SerializedName("CoreVersion")
    @Expose
    private String CoreVersion;

    /**
    * linux/windows
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * Agent version
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * Installation time
    */
    @SerializedName("InstallTime")
    @Expose
    private String InstallTime;

    /**
    * System startup time
    */
    @SerializedName("BootTime")
    @Expose
    private String BootTime;

    /**
    * Last online time
    */
    @SerializedName("LastLiveTime")
    @Expose
    private String LastLiveTime;

    /**
    * Manufacturer
    */
    @SerializedName("Producer")
    @Expose
    private String Producer;

    /**
    * Serial number
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * Network interface

    */
    @SerializedName("NetCards")
    @Expose
    private AssetNetworkCardInfo [] NetCards;

    /**
    * Partition
    */
    @SerializedName("Disks")
    @Expose
    private AssetDiskPartitionInfo [] Disks;

    /**
    * 0: online; 1: offline
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Business group ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Server model
    */
    @SerializedName("DeviceVersion")
    @Expose
    private String DeviceVersion;

    /**
    * Offline time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Host ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Data update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * CpuLoadVul
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CpuLoadVul")
    @Expose
    private String CpuLoadVul;

    /**
    * Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
     * Get Server QUUID 
     * @return Quuid Server QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server QUUID
     * @param Quuid Server QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Server UUID 
     * @return Uuid Server UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
     * @param Uuid Server UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Private IP address of server 
     * @return MachineIp Private IP address of server
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP address of server
     * @param MachineIp Private IP address of server
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Server name 
     * @return MachineName Server name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name
     * @param MachineName Server name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Operating system name 
     * @return OsInfo Operating system name
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set Operating system name
     * @param OsInfo Operating system name
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get CPU information 
     * @return Cpu CPU information
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU information
     * @param Cpu CPU information
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory capacity, in GB 
     * @return MemSize Memory capacity, in GB
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory capacity, in GB
     * @param MemSize Memory capacity, in GB
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Memory utilization, in percentage 
     * @return MemLoad Memory utilization, in percentage
     */
    public String getMemLoad() {
        return this.MemLoad;
    }

    /**
     * Set Memory utilization, in percentage
     * @param MemLoad Memory utilization, in percentage
     */
    public void setMemLoad(String MemLoad) {
        this.MemLoad = MemLoad;
    }

    /**
     * Get Hard disk capacity, in GB 
     * @return DiskSize Hard disk capacity, in GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Hard disk capacity, in GB
     * @param DiskSize Hard disk capacity, in GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Hard disk usage, in percentage 
     * @return DiskLoad Hard disk usage, in percentage
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set Hard disk usage, in percentage
     * @param DiskLoad Hard disk usage, in percentage
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get Number of partitions 
     * @return PartitionCount Number of partitions
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set Number of partitions
     * @param PartitionCount Number of partitions
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get Host public IP address 
     * @return MachineWanIp Host public IP address
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Host public IP address
     * @param MachineWanIp Host public IP address
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Number of CPU 
     * @return CpuSize Number of CPU
     */
    public Long getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set Number of CPU
     * @param CpuSize Number of CPU
     */
    public void setCpuSize(Long CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get CPU load 
     * @return CpuLoad CPU load
     */
    public String getCpuLoad() {
        return this.CpuLoad;
    }

    /**
     * Set CPU load
     * @param CpuLoad CPU load
     */
    public void setCpuLoad(String CpuLoad) {
        this.CpuLoad = CpuLoad;
    }

    /**
     * Get Protection Level. 0 Basic Edition; 1 Professional Edition; 2 Premium Edition; 3 General Discount Edition 
     * @return ProtectLevel Protection Level. 0 Basic Edition; 1 Professional Edition; 2 Premium Edition; 3 General Discount Edition
     */
    public Long getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set Protection Level. 0 Basic Edition; 1 Professional Edition; 2 Premium Edition; 3 General Discount Edition
     * @param ProtectLevel Protection Level. 0 Basic Edition; 1 Professional Edition; 2 Premium Edition; 3 General Discount Edition
     */
    public void setProtectLevel(Long ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    /**
     * Get Risk status: UNKNOW - unknown; RISK - risky; SAFT - Safe 
     * @return RiskStatus Risk status: UNKNOW - unknown; RISK - risky; SAFT - Safe
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set Risk status: UNKNOW - unknown; RISK - risky; SAFT - Safe
     * @param RiskStatus Risk status: UNKNOW - unknown; RISK - risky; SAFT - Safe
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get Days protected 
     * @return ProtectDays Days protected
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set Days protected
     * @param ProtectDays Days protected
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * Get Professional edition activation time 
     * @return BuyTime Professional edition activation time
     */
    public String getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set Professional edition activation time
     * @param BuyTime Professional edition activation time
     */
    public void setBuyTime(String BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get Professional edition expiration time 
     * @return EndTime Professional edition expiration time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Professional edition expiration time
     * @param EndTime Professional edition expiration time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Kernel version 
     * @return CoreVersion Kernel version
     */
    public String getCoreVersion() {
        return this.CoreVersion;
    }

    /**
     * Set Kernel version
     * @param CoreVersion Kernel version
     */
    public void setCoreVersion(String CoreVersion) {
        this.CoreVersion = CoreVersion;
    }

    /**
     * Get linux/windows 
     * @return OsType linux/windows
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set linux/windows
     * @param OsType linux/windows
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get Agent version 
     * @return AgentVersion Agent version
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set Agent version
     * @param AgentVersion Agent version
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get Installation time 
     * @return InstallTime Installation time
     */
    public String getInstallTime() {
        return this.InstallTime;
    }

    /**
     * Set Installation time
     * @param InstallTime Installation time
     */
    public void setInstallTime(String InstallTime) {
        this.InstallTime = InstallTime;
    }

    /**
     * Get System startup time 
     * @return BootTime System startup time
     */
    public String getBootTime() {
        return this.BootTime;
    }

    /**
     * Set System startup time
     * @param BootTime System startup time
     */
    public void setBootTime(String BootTime) {
        this.BootTime = BootTime;
    }

    /**
     * Get Last online time 
     * @return LastLiveTime Last online time
     */
    public String getLastLiveTime() {
        return this.LastLiveTime;
    }

    /**
     * Set Last online time
     * @param LastLiveTime Last online time
     */
    public void setLastLiveTime(String LastLiveTime) {
        this.LastLiveTime = LastLiveTime;
    }

    /**
     * Get Manufacturer 
     * @return Producer Manufacturer
     */
    public String getProducer() {
        return this.Producer;
    }

    /**
     * Set Manufacturer
     * @param Producer Manufacturer
     */
    public void setProducer(String Producer) {
        this.Producer = Producer;
    }

    /**
     * Get Serial number 
     * @return SerialNumber Serial number
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set Serial number
     * @param SerialNumber Serial number
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get Network interface
 
     * @return NetCards Network interface

     */
    public AssetNetworkCardInfo [] getNetCards() {
        return this.NetCards;
    }

    /**
     * Set Network interface

     * @param NetCards Network interface

     */
    public void setNetCards(AssetNetworkCardInfo [] NetCards) {
        this.NetCards = NetCards;
    }

    /**
     * Get Partition 
     * @return Disks Partition
     */
    public AssetDiskPartitionInfo [] getDisks() {
        return this.Disks;
    }

    /**
     * Set Partition
     * @param Disks Partition
     */
    public void setDisks(AssetDiskPartitionInfo [] Disks) {
        this.Disks = Disks;
    }

    /**
     * Get 0: online; 1: offline 
     * @return Status 0: online; 1: offline
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: online; 1: offline
     * @param Status 0: online; 1: offline
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Business group ID 
     * @return ProjectId Business group ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Business group ID
     * @param ProjectId Business group ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Server model 
     * @return DeviceVersion Server model
     */
    public String getDeviceVersion() {
        return this.DeviceVersion;
    }

    /**
     * Set Server model
     * @param DeviceVersion Server model
     */
    public void setDeviceVersion(String DeviceVersion) {
        this.DeviceVersion = DeviceVersion;
    }

    /**
     * Get Offline time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OfflineTime Offline time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Offline time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OfflineTime Offline time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Host ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Host ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Host ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Host ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Data update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get CpuLoadVul
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CpuLoadVul CpuLoadVul
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCpuLoadVul() {
        return this.CpuLoadVul;
    }

    /**
     * Set CpuLoadVul
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CpuLoadVul CpuLoadVul
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpuLoadVul(String CpuLoadVul) {
        this.CpuLoadVul = CpuLoadVul;
    }

    /**
     * Get Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstTime Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstTime Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    public AssetMachineDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetMachineDetail(AssetMachineDetail source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemLoad != null) {
            this.MemLoad = new String(source.MemLoad);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskLoad != null) {
            this.DiskLoad = new String(source.DiskLoad);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Long(source.CpuSize);
        }
        if (source.CpuLoad != null) {
            this.CpuLoad = new String(source.CpuLoad);
        }
        if (source.ProtectLevel != null) {
            this.ProtectLevel = new Long(source.ProtectLevel);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new String(source.BuyTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CoreVersion != null) {
            this.CoreVersion = new String(source.CoreVersion);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.InstallTime != null) {
            this.InstallTime = new String(source.InstallTime);
        }
        if (source.BootTime != null) {
            this.BootTime = new String(source.BootTime);
        }
        if (source.LastLiveTime != null) {
            this.LastLiveTime = new String(source.LastLiveTime);
        }
        if (source.Producer != null) {
            this.Producer = new String(source.Producer);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.NetCards != null) {
            this.NetCards = new AssetNetworkCardInfo[source.NetCards.length];
            for (int i = 0; i < source.NetCards.length; i++) {
                this.NetCards[i] = new AssetNetworkCardInfo(source.NetCards[i]);
            }
        }
        if (source.Disks != null) {
            this.Disks = new AssetDiskPartitionInfo[source.Disks.length];
            for (int i = 0; i < source.Disks.length; i++) {
                this.Disks[i] = new AssetDiskPartitionInfo(source.Disks[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DeviceVersion != null) {
            this.DeviceVersion = new String(source.DeviceVersion);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.CpuLoadVul != null) {
            this.CpuLoadVul = new String(source.CpuLoadVul);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemLoad", this.MemLoad);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskLoad", this.DiskLoad);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "CpuLoad", this.CpuLoad);
        this.setParamSimple(map, prefix + "ProtectLevel", this.ProtectLevel);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CoreVersion", this.CoreVersion);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "InstallTime", this.InstallTime);
        this.setParamSimple(map, prefix + "BootTime", this.BootTime);
        this.setParamSimple(map, prefix + "LastLiveTime", this.LastLiveTime);
        this.setParamSimple(map, prefix + "Producer", this.Producer);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamArrayObj(map, prefix + "NetCards.", this.NetCards);
        this.setParamArrayObj(map, prefix + "Disks.", this.Disks);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceVersion", this.DeviceVersion);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "CpuLoadVul", this.CpuLoadVul);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);

    }
}

