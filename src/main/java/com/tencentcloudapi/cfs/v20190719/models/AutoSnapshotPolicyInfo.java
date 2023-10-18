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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoSnapshotPolicyInfo extends AbstractModel {

    /**
    * Snapshot policy ID
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * Snapshot policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Snapshot policy creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Number of bound file systems
    */
    @SerializedName("FileSystemNums")
    @Expose
    private Long FileSystemNums;

    /**
    * The specific day of the week on which to create a snapshot. This parameter is mutually exclusive with `DayOfMonth` and `IntervalDays`.
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * The hour of a day at which to regularly back up the snapshot
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * Whether to activate the scheduled snapshot feature
    */
    @SerializedName("IsActivated")
    @Expose
    private Long IsActivated;

    /**
    * Next time to trigger snapshot
    */
    @SerializedName("NextActiveTime")
    @Expose
    private String NextActiveTime;

    /**
    * Snapshot policy status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Account ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Retention period
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
    * Region
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * File system information
    */
    @SerializedName("FileSystems")
    @Expose
    private FileSystemByPolicy [] FileSystems;

    /**
    * The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek` and `IntervalDays`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * The snapshot interval (1 to 365 days). This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntervalDays")
    @Expose
    private Long IntervalDays;

    /**
     * Get Snapshot policy ID 
     * @return AutoSnapshotPolicyId Snapshot policy ID
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Snapshot policy ID
     * @param AutoSnapshotPolicyId Snapshot policy ID
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get Snapshot policy name 
     * @return PolicyName Snapshot policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Snapshot policy name
     * @param PolicyName Snapshot policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Snapshot policy creation time 
     * @return CreationTime Snapshot policy creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Snapshot policy creation time
     * @param CreationTime Snapshot policy creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Number of bound file systems 
     * @return FileSystemNums Number of bound file systems
     */
    public Long getFileSystemNums() {
        return this.FileSystemNums;
    }

    /**
     * Set Number of bound file systems
     * @param FileSystemNums Number of bound file systems
     */
    public void setFileSystemNums(Long FileSystemNums) {
        this.FileSystemNums = FileSystemNums;
    }

    /**
     * Get The specific day of the week on which to create a snapshot. This parameter is mutually exclusive with `DayOfMonth` and `IntervalDays`. 
     * @return DayOfWeek The specific day of the week on which to create a snapshot. This parameter is mutually exclusive with `DayOfMonth` and `IntervalDays`.
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set The specific day of the week on which to create a snapshot. This parameter is mutually exclusive with `DayOfMonth` and `IntervalDays`.
     * @param DayOfWeek The specific day of the week on which to create a snapshot. This parameter is mutually exclusive with `DayOfMonth` and `IntervalDays`.
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get The hour of a day at which to regularly back up the snapshot 
     * @return Hour The hour of a day at which to regularly back up the snapshot
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set The hour of a day at which to regularly back up the snapshot
     * @param Hour The hour of a day at which to regularly back up the snapshot
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Whether to activate the scheduled snapshot feature 
     * @return IsActivated Whether to activate the scheduled snapshot feature
     */
    public Long getIsActivated() {
        return this.IsActivated;
    }

    /**
     * Set Whether to activate the scheduled snapshot feature
     * @param IsActivated Whether to activate the scheduled snapshot feature
     */
    public void setIsActivated(Long IsActivated) {
        this.IsActivated = IsActivated;
    }

    /**
     * Get Next time to trigger snapshot 
     * @return NextActiveTime Next time to trigger snapshot
     */
    public String getNextActiveTime() {
        return this.NextActiveTime;
    }

    /**
     * Set Next time to trigger snapshot
     * @param NextActiveTime Next time to trigger snapshot
     */
    public void setNextActiveTime(String NextActiveTime) {
        this.NextActiveTime = NextActiveTime;
    }

    /**
     * Get Snapshot policy status 
     * @return Status Snapshot policy status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Snapshot policy status
     * @param Status Snapshot policy status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Account ID 
     * @return AppId Account ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Account ID
     * @param AppId Account ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Retention period 
     * @return AliveDays Retention period
     */
    public Long getAliveDays() {
        return this.AliveDays;
    }

    /**
     * Set Retention period
     * @param AliveDays Retention period
     */
    public void setAliveDays(Long AliveDays) {
        this.AliveDays = AliveDays;
    }

    /**
     * Get Region 
     * @return RegionName Region
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region
     * @param RegionName Region
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get File system information 
     * @return FileSystems File system information
     */
    public FileSystemByPolicy [] getFileSystems() {
        return this.FileSystems;
    }

    /**
     * Set File system information
     * @param FileSystems File system information
     */
    public void setFileSystems(FileSystemByPolicy [] FileSystems) {
        this.FileSystems = FileSystems;
    }

    /**
     * Get The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek` and `IntervalDays`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DayOfMonth The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek` and `IntervalDays`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek` and `IntervalDays`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DayOfMonth The specific day of the month on which to create a snapshot. This parameter is mutually exclusive with `DayOfWeek` and `IntervalDays`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get The snapshot interval (1 to 365 days). This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntervalDays The snapshot interval (1 to 365 days). This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntervalDays() {
        return this.IntervalDays;
    }

    /**
     * Set The snapshot interval (1 to 365 days). This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntervalDays The snapshot interval (1 to 365 days). This parameter is mutually exclusive with `DayOfWeek` and `DayOfMonth`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntervalDays(Long IntervalDays) {
        this.IntervalDays = IntervalDays;
    }

    public AutoSnapshotPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoSnapshotPolicyInfo(AutoSnapshotPolicyInfo source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.FileSystemNums != null) {
            this.FileSystemNums = new Long(source.FileSystemNums);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.IsActivated != null) {
            this.IsActivated = new Long(source.IsActivated);
        }
        if (source.NextActiveTime != null) {
            this.NextActiveTime = new String(source.NextActiveTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AliveDays != null) {
            this.AliveDays = new Long(source.AliveDays);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.FileSystems != null) {
            this.FileSystems = new FileSystemByPolicy[source.FileSystems.length];
            for (int i = 0; i < source.FileSystems.length; i++) {
                this.FileSystems[i] = new FileSystemByPolicy(source.FileSystems[i]);
            }
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.IntervalDays != null) {
            this.IntervalDays = new Long(source.IntervalDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "FileSystemNums", this.FileSystemNums);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "IsActivated", this.IsActivated);
        this.setParamSimple(map, prefix + "NextActiveTime", this.NextActiveTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AliveDays", this.AliveDays);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArrayObj(map, prefix + "FileSystems.", this.FileSystems);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "IntervalDays", this.IntervalDays);

    }
}

