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

public class RansomDefenseEvent extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * cvm uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Event Status: 0-Pending, 1-Processed, 2-Trusted, 3-In Process, 4-Backup Resumed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Tampered File Path
    */
    @SerializedName("BaitFilePath")
    @Expose
    private String BaitFilePath;

    /**
    * Malicious File Path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Malicious Process ID
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Malicious Process Parameters
    */
    @SerializedName("PidParam")
    @Expose
    private String PidParam;

    /**
    * Malicious File Size
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Malicious File MD5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * Event Type: 0 Encrypted Ransom, 1 File Tampering
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Event Sending Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * CVM Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Event Modification Event
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Policy name
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Host public IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Host Intranet IP
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Process Tree Base64 Json
    */
    @SerializedName("PsTree")
    @Expose
    private String PsTree;

    /**
    * Process startup time
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private String ProcessStartTime;

    /**
    * Number of Snapshot Backups Owned by the Host
    */
    @SerializedName("SnapshotNum")
    @Expose
    private Long SnapshotNum;

    /**
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get cvm uuid 
     * @return Quuid cvm uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm uuid
     * @param Quuid cvm uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Event Status: 0-Pending, 1-Processed, 2-Trusted, 3-In Process, 4-Backup Resumed 
     * @return Status Event Status: 0-Pending, 1-Processed, 2-Trusted, 3-In Process, 4-Backup Resumed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Event Status: 0-Pending, 1-Processed, 2-Trusted, 3-In Process, 4-Backup Resumed
     * @param Status Event Status: 0-Pending, 1-Processed, 2-Trusted, 3-In Process, 4-Backup Resumed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Tampered File Path 
     * @return BaitFilePath Tampered File Path
     */
    public String getBaitFilePath() {
        return this.BaitFilePath;
    }

    /**
     * Set Tampered File Path
     * @param BaitFilePath Tampered File Path
     */
    public void setBaitFilePath(String BaitFilePath) {
        this.BaitFilePath = BaitFilePath;
    }

    /**
     * Get Malicious File Path 
     * @return FilePath Malicious File Path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set Malicious File Path
     * @param FilePath Malicious File Path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get Malicious Process ID 
     * @return Pid Malicious Process ID
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Malicious Process ID
     * @param Pid Malicious Process ID
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Malicious Process Parameters 
     * @return PidParam Malicious Process Parameters
     */
    public String getPidParam() {
        return this.PidParam;
    }

    /**
     * Set Malicious Process Parameters
     * @param PidParam Malicious Process Parameters
     */
    public void setPidParam(String PidParam) {
        this.PidParam = PidParam;
    }

    /**
     * Get Malicious File Size 
     * @return FileSize Malicious File Size
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Malicious File Size
     * @param FileSize Malicious File Size
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Malicious File MD5 
     * @return FileMd5 Malicious File MD5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set Malicious File MD5
     * @param FileMd5 Malicious File MD5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get Event Type: 0 Encrypted Ransom, 1 File Tampering 
     * @return Type Event Type: 0 Encrypted Ransom, 1 File Tampering
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Event Type: 0 Encrypted Ransom, 1 File Tampering
     * @param Type Event Type: 0 Encrypted Ransom, 1 File Tampering
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Event Sending Time 
     * @return CreateTime Event Sending Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Event Sending Time
     * @param CreateTime Event Sending Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get CVM Instance ID 
     * @return InstanceId CVM Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM Instance ID
     * @param InstanceId CVM Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Event Modification Event 
     * @return ModifyTime Event Modification Event
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Event Modification Event
     * @param ModifyTime Event Modification Event
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Policy ID 
     * @return StrategyId Policy ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
     * @param StrategyId Policy ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
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
     * Get Host public IP address 
     * @return HostIp Host public IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host public IP address
     * @param HostIp Host public IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Host Intranet IP 
     * @return WanIp Host Intranet IP
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Host Intranet IP
     * @param WanIp Host Intranet IP
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Process Tree Base64 Json 
     * @return PsTree Process Tree Base64 Json
     */
    public String getPsTree() {
        return this.PsTree;
    }

    /**
     * Set Process Tree Base64 Json
     * @param PsTree Process Tree Base64 Json
     */
    public void setPsTree(String PsTree) {
        this.PsTree = PsTree;
    }

    /**
     * Get Process startup time 
     * @return ProcessStartTime Process startup time
     */
    public String getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set Process startup time
     * @param ProcessStartTime Process startup time
     */
    public void setProcessStartTime(String ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get Number of Snapshot Backups Owned by the Host 
     * @return SnapshotNum Number of Snapshot Backups Owned by the Host
     */
    public Long getSnapshotNum() {
        return this.SnapshotNum;
    }

    /**
     * Set Number of Snapshot Backups Owned by the Host
     * @param SnapshotNum Number of Snapshot Backups Owned by the Host
     */
    public void setSnapshotNum(Long SnapshotNum) {
        this.SnapshotNum = SnapshotNum;
    }

    public RansomDefenseEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseEvent(RansomDefenseEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BaitFilePath != null) {
            this.BaitFilePath = new String(source.BaitFilePath);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.PidParam != null) {
            this.PidParam = new String(source.PidParam);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.PsTree != null) {
            this.PsTree = new String(source.PsTree);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new String(source.ProcessStartTime);
        }
        if (source.SnapshotNum != null) {
            this.SnapshotNum = new Long(source.SnapshotNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BaitFilePath", this.BaitFilePath);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "PidParam", this.PidParam);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "PsTree", this.PsTree);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "SnapshotNum", this.SnapshotNum);

    }
}

