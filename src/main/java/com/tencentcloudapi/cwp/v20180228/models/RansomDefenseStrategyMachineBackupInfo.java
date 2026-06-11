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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RansomDefenseStrategyMachineBackupInfo extends AbstractModel {

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Host Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Private IP address
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Public IP address
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Cloud Tag
    */
    @SerializedName("CloudTags")
    @Expose
    private Tag [] CloudTags;

    /**
    * Availability zone information
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * Host security tag
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * Protection status: 0 Disabled, 1 Enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Policy ID. 0 indicates no binding to any policy.
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Hard disk information, all hard disks take effect when left blank:
Separate diskId1|diskName1;diskId2|diskName2
    */
    @SerializedName("DiskInfo")
    @Expose
    private String DiskInfo;

    /**
    * Policy name
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Number of Backups
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * Latest Backup Status: 0 - Backing Up, 1 - Normal, 2 - Failed, 9 - No Backup Yet
    */
    @SerializedName("LastBackupStatus")
    @Expose
    private Long LastBackupStatus;

    /**
    * Reason for the Last Backup Failure
    */
    @SerializedName("LastBackupMessage")
    @Expose
    private String LastBackupMessage;

    /**
    * Last Backup Time
    */
    @SerializedName("LastBackupTime")
    @Expose
    private String LastBackupTime;

    /**
    * Latest Rollback Progress Percentage
    */
    @SerializedName("RollBackPercent")
    @Expose
    private Long RollBackPercent;

    /**
    * Latest Rollback Status: 0 - In Progress, 1 - Succeeded, 2 - Failed
    */
    @SerializedName("RollBackStatus")
    @Expose
    private Long RollBackStatus;

    /**
    * Backup Success Count
    */
    @SerializedName("BackupSuccessCount")
    @Expose
    private Long BackupSuccessCount;

    /**
    * Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition
    */
    @SerializedName("HostVersion")
    @Expose
    private Long HostVersion;

    /**
    * Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host name 
     * @return MachineName Host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name
     * @param MachineName Host name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Host Instance ID 
     * @return InstanceId Host Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Host Instance ID
     * @param InstanceId Host Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Private IP address 
     * @return MachineIp Private IP address
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP address
     * @param MachineIp Private IP address
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Public IP address 
     * @return MachineWanIp Public IP address
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP address
     * @param MachineWanIp Public IP address
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Cloud Tag 
     * @return CloudTags Cloud Tag
     */
    public Tag [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set Cloud Tag
     * @param CloudTags Cloud Tag
     */
    public void setCloudTags(Tag [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get Availability zone information 
     * @return RegionInfo Availability zone information
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set Availability zone information
     * @param RegionInfo Availability zone information
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get Host security tag 
     * @return Tag Host security tag
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Host security tag
     * @param Tag Host security tag
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Protection status: 0 Disabled, 1 Enabled. 
     * @return Status Protection status: 0 Disabled, 1 Enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Protection status: 0 Disabled, 1 Enabled.
     * @param Status Protection status: 0 Disabled, 1 Enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Policy ID. 0 indicates no binding to any policy. 
     * @return StrategyId Policy ID. 0 indicates no binding to any policy.
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID. 0 indicates no binding to any policy.
     * @param StrategyId Policy ID. 0 indicates no binding to any policy.
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Hard disk information, all hard disks take effect when left blank:
Separate diskId1|diskName1;diskId2|diskName2 
     * @return DiskInfo Hard disk information, all hard disks take effect when left blank:
Separate diskId1|diskName1;diskId2|diskName2
     */
    public String getDiskInfo() {
        return this.DiskInfo;
    }

    /**
     * Set Hard disk information, all hard disks take effect when left blank:
Separate diskId1|diskName1;diskId2|diskName2
     * @param DiskInfo Hard disk information, all hard disks take effect when left blank:
Separate diskId1|diskName1;diskId2|diskName2
     */
    public void setDiskInfo(String DiskInfo) {
        this.DiskInfo = DiskInfo;
    }

    /**
     * Get Policy name 
     * @return StrategyName Policy name
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name
     * @param StrategyName Policy name
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Number of Backups 
     * @return BackupCount Number of Backups
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set Number of Backups
     * @param BackupCount Number of Backups
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get Latest Backup Status: 0 - Backing Up, 1 - Normal, 2 - Failed, 9 - No Backup Yet 
     * @return LastBackupStatus Latest Backup Status: 0 - Backing Up, 1 - Normal, 2 - Failed, 9 - No Backup Yet
     */
    public Long getLastBackupStatus() {
        return this.LastBackupStatus;
    }

    /**
     * Set Latest Backup Status: 0 - Backing Up, 1 - Normal, 2 - Failed, 9 - No Backup Yet
     * @param LastBackupStatus Latest Backup Status: 0 - Backing Up, 1 - Normal, 2 - Failed, 9 - No Backup Yet
     */
    public void setLastBackupStatus(Long LastBackupStatus) {
        this.LastBackupStatus = LastBackupStatus;
    }

    /**
     * Get Reason for the Last Backup Failure 
     * @return LastBackupMessage Reason for the Last Backup Failure
     */
    public String getLastBackupMessage() {
        return this.LastBackupMessage;
    }

    /**
     * Set Reason for the Last Backup Failure
     * @param LastBackupMessage Reason for the Last Backup Failure
     */
    public void setLastBackupMessage(String LastBackupMessage) {
        this.LastBackupMessage = LastBackupMessage;
    }

    /**
     * Get Last Backup Time 
     * @return LastBackupTime Last Backup Time
     */
    public String getLastBackupTime() {
        return this.LastBackupTime;
    }

    /**
     * Set Last Backup Time
     * @param LastBackupTime Last Backup Time
     */
    public void setLastBackupTime(String LastBackupTime) {
        this.LastBackupTime = LastBackupTime;
    }

    /**
     * Get Latest Rollback Progress Percentage 
     * @return RollBackPercent Latest Rollback Progress Percentage
     */
    public Long getRollBackPercent() {
        return this.RollBackPercent;
    }

    /**
     * Set Latest Rollback Progress Percentage
     * @param RollBackPercent Latest Rollback Progress Percentage
     */
    public void setRollBackPercent(Long RollBackPercent) {
        this.RollBackPercent = RollBackPercent;
    }

    /**
     * Get Latest Rollback Status: 0 - In Progress, 1 - Succeeded, 2 - Failed 
     * @return RollBackStatus Latest Rollback Status: 0 - In Progress, 1 - Succeeded, 2 - Failed
     */
    public Long getRollBackStatus() {
        return this.RollBackStatus;
    }

    /**
     * Set Latest Rollback Status: 0 - In Progress, 1 - Succeeded, 2 - Failed
     * @param RollBackStatus Latest Rollback Status: 0 - In Progress, 1 - Succeeded, 2 - Failed
     */
    public void setRollBackStatus(Long RollBackStatus) {
        this.RollBackStatus = RollBackStatus;
    }

    /**
     * Get Backup Success Count 
     * @return BackupSuccessCount Backup Success Count
     */
    public Long getBackupSuccessCount() {
        return this.BackupSuccessCount;
    }

    /**
     * Set Backup Success Count
     * @param BackupSuccessCount Backup Success Count
     */
    public void setBackupSuccessCount(Long BackupSuccessCount) {
        this.BackupSuccessCount = BackupSuccessCount;
    }

    /**
     * Get Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition 
     * @return HostVersion Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition
     */
    public Long getHostVersion() {
        return this.HostVersion;
    }

    /**
     * Set Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition
     * @param HostVersion Version information: 0-Basic version, 1-Pro edition, 2-Flagship edition, 3-Lightweight edition
     */
    public void setHostVersion(Long HostVersion) {
        this.HostVersion = HostVersion;
    }

    /**
     * Get Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone 
     * @return MachineType Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     * @param MachineType Machine Zone Type. CVM - Cloud Virtual Machine; BM: Bare Metal; ECM: Edge Computing Machine; LH: Lightweight Application Server; Other: Hybrid Cloud Zone
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public RansomDefenseStrategyMachineBackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseStrategyMachineBackupInfo(RansomDefenseStrategyMachineBackupInfo source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tag[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tag(source.CloudTags[i]);
            }
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.DiskInfo != null) {
            this.DiskInfo = new String(source.DiskInfo);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.BackupCount != null) {
            this.BackupCount = new Long(source.BackupCount);
        }
        if (source.LastBackupStatus != null) {
            this.LastBackupStatus = new Long(source.LastBackupStatus);
        }
        if (source.LastBackupMessage != null) {
            this.LastBackupMessage = new String(source.LastBackupMessage);
        }
        if (source.LastBackupTime != null) {
            this.LastBackupTime = new String(source.LastBackupTime);
        }
        if (source.RollBackPercent != null) {
            this.RollBackPercent = new Long(source.RollBackPercent);
        }
        if (source.RollBackStatus != null) {
            this.RollBackStatus = new Long(source.RollBackStatus);
        }
        if (source.BackupSuccessCount != null) {
            this.BackupSuccessCount = new Long(source.BackupSuccessCount);
        }
        if (source.HostVersion != null) {
            this.HostVersion = new Long(source.HostVersion);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "DiskInfo", this.DiskInfo);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);
        this.setParamSimple(map, prefix + "LastBackupStatus", this.LastBackupStatus);
        this.setParamSimple(map, prefix + "LastBackupMessage", this.LastBackupMessage);
        this.setParamSimple(map, prefix + "LastBackupTime", this.LastBackupTime);
        this.setParamSimple(map, prefix + "RollBackPercent", this.RollBackPercent);
        this.setParamSimple(map, prefix + "RollBackStatus", this.RollBackStatus);
        this.setParamSimple(map, prefix + "BackupSuccessCount", this.BackupSuccessCount);
        this.setParamSimple(map, prefix + "HostVersion", this.HostVersion);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

