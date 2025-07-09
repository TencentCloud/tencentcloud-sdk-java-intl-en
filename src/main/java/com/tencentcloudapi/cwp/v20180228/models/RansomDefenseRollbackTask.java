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

public class RansomDefenseRollbackTask extends AbstractModel {

    /**
    * Task ID
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
    * Rollback Task Status: 0 - In Progress, 1 - Succeeded, 2 - Failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Hard drive ID list, separated by semicolons (;)
    */
    @SerializedName("Disks")
    @Expose
    private String Disks;

    /**
    * Operation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Snapshot time
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * Status!=0 indicates the completion time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Availability zone information
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
     * Get Task ID 
     * @return Id Task ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Task ID
     * @param Id Task ID
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
     * Get Rollback Task Status: 0 - In Progress, 1 - Succeeded, 2 - Failed 
     * @return Status Rollback Task Status: 0 - In Progress, 1 - Succeeded, 2 - Failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rollback Task Status: 0 - In Progress, 1 - Succeeded, 2 - Failed
     * @param Status Rollback Task Status: 0 - In Progress, 1 - Succeeded, 2 - Failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Hard drive ID list, separated by semicolons (;) 
     * @return Disks Hard drive ID list, separated by semicolons (;)
     */
    public String getDisks() {
        return this.Disks;
    }

    /**
     * Set Hard drive ID list, separated by semicolons (;)
     * @param Disks Hard drive ID list, separated by semicolons (;)
     */
    public void setDisks(String Disks) {
        this.Disks = Disks;
    }

    /**
     * Get Operation time 
     * @return CreateTime Operation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Operation time
     * @param CreateTime Operation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Snapshot time 
     * @return BackupTime Snapshot time
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Snapshot time
     * @param BackupTime Snapshot time
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Status!=0 indicates the completion time. 
     * @return ModifyTime Status!=0 indicates the completion time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Status!=0 indicates the completion time.
     * @param ModifyTime Status!=0 indicates the completion time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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

    public RansomDefenseRollbackTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseRollbackTask(RansomDefenseRollbackTask source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Disks != null) {
            this.Disks = new String(source.Disks);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Disks", this.Disks);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);

    }
}

