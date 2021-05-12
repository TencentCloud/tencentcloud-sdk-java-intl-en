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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupInfo extends AbstractModel{

    /**
    * Backup filename
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Backup file size in bytes
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Download address on the private network
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * Download address on the public network
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Backup subtask ID, which is used when backup files are deleted
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Backup task completion time
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value).
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Backup task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Backup method. Valid values: `full` (full backup), `partial` (partial backup).
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup).
    */
    @SerializedName("Way")
    @Expose
    private String Way;

    /**
     * Get Backup filename 
     * @return Name Backup filename
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Backup filename
     * @param Name Backup filename
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Backup file size in bytes 
     * @return Size Backup file size in bytes
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Backup file size in bytes
     * @param Size Backup file size in bytes
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37 
     * @return Date Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37
     * @param Date Backup snapshot time in the format of yyyy-MM-dd HH:mm:ss, such as 2016-03-17 02:10:37
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Download address on the private network 
     * @return IntranetUrl Download address on the private network
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set Download address on the private network
     * @param IntranetUrl Download address on the private network
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get Download address on the public network 
     * @return InternetUrl Download address on the public network
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set Download address on the public network
     * @param InternetUrl Download address on the public network
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup). 
     * @return Type Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup).
     * @param Type Log type. Valid values: `logical` (logical cold backup), `physical` (physical cold backup).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Backup subtask ID, which is used when backup files are deleted 
     * @return BackupId Backup subtask ID, which is used when backup files are deleted
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup subtask ID, which is used when backup files are deleted
     * @param BackupId Backup subtask ID, which is used when backup files are deleted
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress). 
     * @return Status Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     * @param Status Backup task status. Valid values: `SUCCESS` (backup succeeded), `FAILED` (backup failed), `RUNNING` (backup is in progress).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Backup task completion time 
     * @return FinishTime Backup task completion time
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Backup task completion time
     * @param FinishTime Backup task completion time
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value). 
     * @return Creator (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value).
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value).
     * @param Creator (This field will be disused and is thus not recommended) backup creator. Valid values: `SYSTEM` (created by system), `Uin` (initiator's `Uin` value).
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Backup task start time 
     * @return StartTime Backup task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Backup task start time
     * @param StartTime Backup task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Backup method. Valid values: `full` (full backup), `partial` (partial backup). 
     * @return Method Backup method. Valid values: `full` (full backup), `partial` (partial backup).
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Backup method. Valid values: `full` (full backup), `partial` (partial backup).
     * @param Method Backup method. Valid values: `full` (full backup), `partial` (partial backup).
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup). 
     * @return Way Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup).
     */
    public String getWay() {
        return this.Way;
    }

    /**
     * Set Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup).
     * @param Way Backup mode. Valid values: `manual` (manual backup), `automatic` (automatic backup).
     */
    public void setWay(String Way) {
        this.Way = Way;
    }

    public BackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInfo(BackupInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.IntranetUrl != null) {
            this.IntranetUrl = new String(source.IntranetUrl);
        }
        if (source.InternetUrl != null) {
            this.InternetUrl = new String(source.InternetUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Way != null) {
            this.Way = new String(source.Way);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "IntranetUrl", this.IntranetUrl);
        this.setParamSimple(map, prefix + "InternetUrl", this.InternetUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Way", this.Way);

    }
}

