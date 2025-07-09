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

public class RansomDefenseBackup extends AbstractModel {

    /**
    * Backup time
    */
    @SerializedName("BackupTime")
    @Expose
    private String BackupTime;

    /**
    * Ransom Status: 0 - No Alarm, 1 - Alarm Present
    */
    @SerializedName("EventStatus")
    @Expose
    private Long EventStatus;

    /**
    * Backup Status: 0 - Backing up, 1 - Normal, 2, 3 - Failed, 4 - Snapshot expired, 9 - Snapshot deleted
    */
    @SerializedName("BackupStatus")
    @Expose
    private Long BackupStatus;

    /**
    * Number of backup disk
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
    * Hard Disk Information, separated by semicolons (;).
    */
    @SerializedName("Disks")
    @Expose
    private String Disks;

    /**
    * Snapshot List, separated by semicolons (;)
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String SnapshotIds;

    /**
    * Policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Policy Status: 0 Disabled, 1 Enabled, 9 Deleted
    */
    @SerializedName("StrategyStatus")
    @Expose
    private Long StrategyStatus;

    /**
    * Policy name
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
     * Get Backup time 
     * @return BackupTime Backup time
     */
    public String getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Backup time
     * @param BackupTime Backup time
     */
    public void setBackupTime(String BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Ransom Status: 0 - No Alarm, 1 - Alarm Present 
     * @return EventStatus Ransom Status: 0 - No Alarm, 1 - Alarm Present
     */
    public Long getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set Ransom Status: 0 - No Alarm, 1 - Alarm Present
     * @param EventStatus Ransom Status: 0 - No Alarm, 1 - Alarm Present
     */
    public void setEventStatus(Long EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get Backup Status: 0 - Backing up, 1 - Normal, 2, 3 - Failed, 4 - Snapshot expired, 9 - Snapshot deleted 
     * @return BackupStatus Backup Status: 0 - Backing up, 1 - Normal, 2, 3 - Failed, 4 - Snapshot expired, 9 - Snapshot deleted
     */
    public Long getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set Backup Status: 0 - Backing up, 1 - Normal, 2, 3 - Failed, 4 - Snapshot expired, 9 - Snapshot deleted
     * @param BackupStatus Backup Status: 0 - Backing up, 1 - Normal, 2, 3 - Failed, 4 - Snapshot expired, 9 - Snapshot deleted
     */
    public void setBackupStatus(Long BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get Number of backup disk 
     * @return DiskCount Number of backup disk
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set Number of backup disk
     * @param DiskCount Number of backup disk
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * Get Hard Disk Information, separated by semicolons (;). 
     * @return Disks Hard Disk Information, separated by semicolons (;).
     */
    public String getDisks() {
        return this.Disks;
    }

    /**
     * Set Hard Disk Information, separated by semicolons (;).
     * @param Disks Hard Disk Information, separated by semicolons (;).
     */
    public void setDisks(String Disks) {
        this.Disks = Disks;
    }

    /**
     * Get Snapshot List, separated by semicolons (;) 
     * @return SnapshotIds Snapshot List, separated by semicolons (;)
     */
    public String getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set Snapshot List, separated by semicolons (;)
     * @param SnapshotIds Snapshot List, separated by semicolons (;)
     */
    public void setSnapshotIds(String SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
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
     * Get Policy Status: 0 Disabled, 1 Enabled, 9 Deleted 
     * @return StrategyStatus Policy Status: 0 Disabled, 1 Enabled, 9 Deleted
     */
    public Long getStrategyStatus() {
        return this.StrategyStatus;
    }

    /**
     * Set Policy Status: 0 Disabled, 1 Enabled, 9 Deleted
     * @param StrategyStatus Policy Status: 0 Disabled, 1 Enabled, 9 Deleted
     */
    public void setStrategyStatus(Long StrategyStatus) {
        this.StrategyStatus = StrategyStatus;
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

    public RansomDefenseBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseBackup(RansomDefenseBackup source) {
        if (source.BackupTime != null) {
            this.BackupTime = new String(source.BackupTime);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long(source.EventStatus);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new Long(source.BackupStatus);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
        if (source.Disks != null) {
            this.Disks = new String(source.Disks);
        }
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String(source.SnapshotIds);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyStatus != null) {
            this.StrategyStatus = new Long(source.StrategyStatus);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "Disks", this.Disks);
        this.setParamSimple(map, prefix + "SnapshotIds", this.SnapshotIds);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyStatus", this.StrategyStatus);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);

    }
}

