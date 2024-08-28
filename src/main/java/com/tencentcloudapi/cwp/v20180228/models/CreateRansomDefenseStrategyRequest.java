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

public class CreateRansomDefenseStrategyRequest extends AbstractModel {

    /**
    * Policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Scheduled snapshot execution time (0-23): 01:00; 23:00.
    */
    @SerializedName("Hour")
    @Expose
    private String Hour;

    /**
    * Policy ID: Modify the policy when filling in the ID. Otherwise, add a new policy.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Policy Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether to enable: 0 Off, 1 On.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Apply to all machines or not. 0: No; 1: Yes
    */
    @SerializedName("IsAll")
    @Expose
    private Long IsAll;

    /**
    * Include directories, separated by semicolons (;).
    */
    @SerializedName("IncludeDir")
    @Expose
    private String IncludeDir;

    /**
    * Exclude directories, separated by semicolons (;).
    */
    @SerializedName("ExcludeDir")
    @Expose
    private String ExcludeDir;

    /**
    * Backup pattern: 0 weekly, 1 daily.
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * Scheduled task execution days in a week (1-7): 1; 2; 7.
    */
    @SerializedName("Weekday")
    @Expose
    private String Weekday;

    /**
    * Retention Period: 0 Permanent.
    */
    @SerializedName("SaveDay")
    @Expose
    private Long SaveDay;

    /**
    * Bound Host List
    */
    @SerializedName("Machines")
    @Expose
    private RansomDefenseStrategyMachineInfo [] Machines;

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
     * Get Scheduled snapshot execution time (0-23): 01:00; 23:00. 
     * @return Hour Scheduled snapshot execution time (0-23): 01:00; 23:00.
     */
    public String getHour() {
        return this.Hour;
    }

    /**
     * Set Scheduled snapshot execution time (0-23): 01:00; 23:00.
     * @param Hour Scheduled snapshot execution time (0-23): 01:00; 23:00.
     */
    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    /**
     * Get Policy ID: Modify the policy when filling in the ID. Otherwise, add a new policy. 
     * @return Id Policy ID: Modify the policy when filling in the ID. Otherwise, add a new policy.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Policy ID: Modify the policy when filling in the ID. Otherwise, add a new policy.
     * @param Id Policy ID: Modify the policy when filling in the ID. Otherwise, add a new policy.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Policy Remarks 
     * @return Description Policy Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy Remarks
     * @param Description Policy Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether to enable: 0 Off, 1 On. 
     * @return Status Whether to enable: 0 Off, 1 On.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether to enable: 0 Off, 1 On.
     * @param Status Whether to enable: 0 Off, 1 On.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Apply to all machines or not. 0: No; 1: Yes 
     * @return IsAll Apply to all machines or not. 0: No; 1: Yes
     */
    public Long getIsAll() {
        return this.IsAll;
    }

    /**
     * Set Apply to all machines or not. 0: No; 1: Yes
     * @param IsAll Apply to all machines or not. 0: No; 1: Yes
     */
    public void setIsAll(Long IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get Include directories, separated by semicolons (;). 
     * @return IncludeDir Include directories, separated by semicolons (;).
     */
    public String getIncludeDir() {
        return this.IncludeDir;
    }

    /**
     * Set Include directories, separated by semicolons (;).
     * @param IncludeDir Include directories, separated by semicolons (;).
     */
    public void setIncludeDir(String IncludeDir) {
        this.IncludeDir = IncludeDir;
    }

    /**
     * Get Exclude directories, separated by semicolons (;). 
     * @return ExcludeDir Exclude directories, separated by semicolons (;).
     */
    public String getExcludeDir() {
        return this.ExcludeDir;
    }

    /**
     * Set Exclude directories, separated by semicolons (;).
     * @param ExcludeDir Exclude directories, separated by semicolons (;).
     */
    public void setExcludeDir(String ExcludeDir) {
        this.ExcludeDir = ExcludeDir;
    }

    /**
     * Get Backup pattern: 0 weekly, 1 daily. 
     * @return BackupType Backup pattern: 0 weekly, 1 daily.
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup pattern: 0 weekly, 1 daily.
     * @param BackupType Backup pattern: 0 weekly, 1 daily.
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Scheduled task execution days in a week (1-7): 1; 2; 7. 
     * @return Weekday Scheduled task execution days in a week (1-7): 1; 2; 7.
     */
    public String getWeekday() {
        return this.Weekday;
    }

    /**
     * Set Scheduled task execution days in a week (1-7): 1; 2; 7.
     * @param Weekday Scheduled task execution days in a week (1-7): 1; 2; 7.
     */
    public void setWeekday(String Weekday) {
        this.Weekday = Weekday;
    }

    /**
     * Get Retention Period: 0 Permanent. 
     * @return SaveDay Retention Period: 0 Permanent.
     */
    public Long getSaveDay() {
        return this.SaveDay;
    }

    /**
     * Set Retention Period: 0 Permanent.
     * @param SaveDay Retention Period: 0 Permanent.
     */
    public void setSaveDay(Long SaveDay) {
        this.SaveDay = SaveDay;
    }

    /**
     * Get Bound Host List 
     * @return Machines Bound Host List
     */
    public RansomDefenseStrategyMachineInfo [] getMachines() {
        return this.Machines;
    }

    /**
     * Set Bound Host List
     * @param Machines Bound Host List
     */
    public void setMachines(RansomDefenseStrategyMachineInfo [] Machines) {
        this.Machines = Machines;
    }

    public CreateRansomDefenseStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRansomDefenseStrategyRequest(CreateRansomDefenseStrategyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Hour != null) {
            this.Hour = new String(source.Hour);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.SaveDay != null) {
            this.SaveDay = new Long(source.SaveDay);
        }
        if (source.Machines != null) {
            this.Machines = new RansomDefenseStrategyMachineInfo[source.Machines.length];
            for (int i = 0; i < source.Machines.length; i++) {
                this.Machines[i] = new RansomDefenseStrategyMachineInfo(source.Machines[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "IncludeDir", this.IncludeDir);
        this.setParamSimple(map, prefix + "ExcludeDir", this.ExcludeDir);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Weekday", this.Weekday);
        this.setParamSimple(map, prefix + "SaveDay", this.SaveDay);
        this.setParamArrayObj(map, prefix + "Machines.", this.Machines);

    }
}

