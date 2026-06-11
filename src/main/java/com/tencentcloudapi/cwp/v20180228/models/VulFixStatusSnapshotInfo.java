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

public class VulFixStatusSnapshotInfo extends AbstractModel {

    /**
    * cvm id
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
    * Host IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Snapshot name
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * Snapshot creation time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Snapshot ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Unique record ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Snapshot status. 0: initial; 1: created successfully; 2: creation failed; 10: unsupported; 11: no need to create.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Snapshot creation failure reason
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * Host type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
     * Get cvm id 
     * @return Quuid cvm id
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm id
     * @param Quuid cvm id
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
     * Get Host IP address 
     * @return HostIp Host IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP address
     * @param HostIp Host IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Snapshot name 
     * @return SnapshotName Snapshot name
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name
     * @param SnapshotName Snapshot name
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get Snapshot creation time 
     * @return ModifyTime Snapshot creation time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Snapshot creation time
     * @param ModifyTime Snapshot creation time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Snapshot ID 
     * @return SnapshotId Snapshot ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID
     * @param SnapshotId Snapshot ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Unique record ID 
     * @return Id Unique record ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique record ID
     * @param Id Unique record ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Snapshot status. 0: initial; 1: created successfully; 2: creation failed; 10: unsupported; 11: no need to create. 
     * @return Status Snapshot status. 0: initial; 1: created successfully; 2: creation failed; 10: unsupported; 11: no need to create.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Snapshot status. 0: initial; 1: created successfully; 2: creation failed; 10: unsupported; 11: no need to create.
     * @param Status Snapshot status. 0: initial; 1: created successfully; 2: creation failed; 10: unsupported; 11: no need to create.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Snapshot creation failure reason 
     * @return FailReason Snapshot creation failure reason
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set Snapshot creation failure reason
     * @param FailReason Snapshot creation failure reason
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get Host type 
     * @return MachineType Host type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Host type
     * @param MachineType Host type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public VulFixStatusSnapshotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixStatusSnapshotInfo(VulFixStatusSnapshotInfo source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

