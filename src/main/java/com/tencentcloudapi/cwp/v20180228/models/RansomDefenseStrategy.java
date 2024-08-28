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

public class RansomDefenseStrategy extends AbstractModel {

    /**
    * Policy ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Operating UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Policy Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Enabling Status: 0 Disabled, 1 Enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether it takes effect for all hosts.
    */
    @SerializedName("IsAll")
    @Expose
    private Long IsAll;

    /**
    * Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncludeDir")
    @Expose
    private String IncludeDir;

    /**
    * Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExcludeDir")
    @Expose
    private String ExcludeDir;

    /**
    * Backup pattern: 0 weekly, 1 daily.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * Backup days in a week (1-7): 1; 2; 3; 4.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Weekday")
    @Expose
    private String Weekday;

    /**
    * Backup Execution Time Point (0-23): 11:00; 12:00
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * Storage Days, 0 for Permanent
    */
    @SerializedName("SaveDay")
    @Expose
    private Long SaveDay;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Number of Bound Machines
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineCount")
    @Expose
    private Long MachineCount;

    /**
     * Get Policy ID 
     * @return Id Policy ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Policy ID
     * @param Id Policy ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Operating UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin Operating UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Operating UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin Operating UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Policy name 
     * @return Name Policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name
     * @param Name Policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Policy Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Policy Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Policy Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Enabling Status: 0 Disabled, 1 Enabled. 
     * @return Status Enabling Status: 0 Disabled, 1 Enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Enabling Status: 0 Disabled, 1 Enabled.
     * @param Status Enabling Status: 0 Disabled, 1 Enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether it takes effect for all hosts. 
     * @return IsAll Whether it takes effect for all hosts.
     */
    public Long getIsAll() {
        return this.IsAll;
    }

    /**
     * Set Whether it takes effect for all hosts.
     * @param IsAll Whether it takes effect for all hosts.
     */
    public void setIsAll(Long IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IncludeDir Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIncludeDir() {
        return this.IncludeDir;
    }

    /**
     * Set Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IncludeDir Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIncludeDir(String IncludeDir) {
        this.IncludeDir = IncludeDir;
    }

    /**
     * Get Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExcludeDir Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExcludeDir() {
        return this.ExcludeDir;
    }

    /**
     * Set Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExcludeDir Includes directories, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExcludeDir(String ExcludeDir) {
        this.ExcludeDir = ExcludeDir;
    }

    /**
     * Get Backup pattern: 0 weekly, 1 daily.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupType Backup pattern: 0 weekly, 1 daily.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup pattern: 0 weekly, 1 daily.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupType Backup pattern: 0 weekly, 1 daily.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Backup days in a week (1-7): 1; 2; 3; 4.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Weekday Backup days in a week (1-7): 1; 2; 3; 4.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWeekday() {
        return this.Weekday;
    }

    /**
     * Set Backup days in a week (1-7): 1; 2; 3; 4.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Weekday Backup days in a week (1-7): 1; 2; 3; 4.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeekday(String Weekday) {
        this.Weekday = Weekday;
    }

    /**
     * Get Backup Execution Time Point (0-23): 11:00; 12:00 
     * @return Hour Backup Execution Time Point (0-23): 11:00; 12:00
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set Backup Execution Time Point (0-23): 11:00; 12:00
     * @param Hour Backup Execution Time Point (0-23): 11:00; 12:00
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Storage Days, 0 for Permanent 
     * @return SaveDay Storage Days, 0 for Permanent
     */
    public Long getSaveDay() {
        return this.SaveDay;
    }

    /**
     * Set Storage Days, 0 for Permanent
     * @param SaveDay Storage Days, 0 for Permanent
     */
    public void setSaveDay(Long SaveDay) {
        this.SaveDay = SaveDay;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Last modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last modification time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Last modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Number of Bound Machines
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineCount Number of Bound Machines
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMachineCount() {
        return this.MachineCount;
    }

    /**
     * Set Number of Bound Machines
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineCount Number of Bound Machines
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineCount(Long MachineCount) {
        this.MachineCount = MachineCount;
    }

    public RansomDefenseStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseStrategy(RansomDefenseStrategy source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsAll != null) {
            this.IsAll = new Long(source.IsAll);
        }
        if (source.IncludeDir != null) {
            this.IncludeDir = new String(source.IncludeDir);
        }
        if (source.ExcludeDir != null) {
            this.ExcludeDir = new String(source.ExcludeDir);
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.Weekday != null) {
            this.Weekday = new String(source.Weekday);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.SaveDay != null) {
            this.SaveDay = new Long(source.SaveDay);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.MachineCount != null) {
            this.MachineCount = new Long(source.MachineCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "IncludeDir", this.IncludeDir);
        this.setParamSimple(map, prefix + "ExcludeDir", this.ExcludeDir);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Weekday", this.Weekday);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "SaveDay", this.SaveDay);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "MachineCount", this.MachineCount);

    }
}

