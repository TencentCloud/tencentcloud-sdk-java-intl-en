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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackUpScheduleRequest extends AbstractModel {

    /**
    * Required to be uploaded when editing
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * Selected weeks, separated by commas.
Discarded: Use ScheduleInfo.
    */
    @SerializedName("WeekDays")
    @Expose
    private String WeekDays;

    /**
    * Hour for executing the backup taskDiscarded: Use ScheduleInfo.
    */
    @SerializedName("ExecuteHour")
    @Expose
    private Long ExecuteHour;

    /**
    * Backup table list
    */
    @SerializedName("BackUpTables")
    @Expose
    private BackupTableContent [] BackUpTables;

    /**
    * 0: default; 1: one-time backup for the remote Doris
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * Connection information of the remote doris cluster
    */
    @SerializedName("DorisSourceInfo")
    @Expose
    private DorisSourceInfo DorisSourceInfo;

    /**
    * 0: default; 1: one-time backup; 2: remote backup
    */
    @SerializedName("BackupTimeType")
    @Expose
    private Long BackupTimeType;

    /**
    * 0: default; 1: immediate recovery after the backup is completed.
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * 0: default; 1: connecting to COS using a custom key.
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * Cos certification information
    */
    @SerializedName("CosSourceInfo")
    @Expose
    private CosSourceInfo CosSourceInfo;

    /**
     * Get Required to be uploaded when editing 
     * @return ScheduleId Required to be uploaded when editing
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set Required to be uploaded when editing
     * @param ScheduleId Required to be uploaded when editing
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get Selected weeks, separated by commas.
Discarded: Use ScheduleInfo. 
     * @return WeekDays Selected weeks, separated by commas.
Discarded: Use ScheduleInfo.
     */
    public String getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set Selected weeks, separated by commas.
Discarded: Use ScheduleInfo.
     * @param WeekDays Selected weeks, separated by commas.
Discarded: Use ScheduleInfo.
     */
    public void setWeekDays(String WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get Hour for executing the backup taskDiscarded: Use ScheduleInfo. 
     * @return ExecuteHour Hour for executing the backup taskDiscarded: Use ScheduleInfo.
     */
    public Long getExecuteHour() {
        return this.ExecuteHour;
    }

    /**
     * Set Hour for executing the backup taskDiscarded: Use ScheduleInfo.
     * @param ExecuteHour Hour for executing the backup taskDiscarded: Use ScheduleInfo.
     */
    public void setExecuteHour(Long ExecuteHour) {
        this.ExecuteHour = ExecuteHour;
    }

    /**
     * Get Backup table list 
     * @return BackUpTables Backup table list
     */
    public BackupTableContent [] getBackUpTables() {
        return this.BackUpTables;
    }

    /**
     * Set Backup table list
     * @param BackUpTables Backup table list
     */
    public void setBackUpTables(BackupTableContent [] BackUpTables) {
        this.BackUpTables = BackUpTables;
    }

    /**
     * Get 0: default; 1: one-time backup for the remote Doris 
     * @return BackupType 0: default; 1: one-time backup for the remote Doris
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 0: default; 1: one-time backup for the remote Doris
     * @param BackupType 0: default; 1: one-time backup for the remote Doris
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Connection information of the remote doris cluster 
     * @return DorisSourceInfo Connection information of the remote doris cluster
     */
    public DorisSourceInfo getDorisSourceInfo() {
        return this.DorisSourceInfo;
    }

    /**
     * Set Connection information of the remote doris cluster
     * @param DorisSourceInfo Connection information of the remote doris cluster
     */
    public void setDorisSourceInfo(DorisSourceInfo DorisSourceInfo) {
        this.DorisSourceInfo = DorisSourceInfo;
    }

    /**
     * Get 0: default; 1: one-time backup; 2: remote backup 
     * @return BackupTimeType 0: default; 1: one-time backup; 2: remote backup
     */
    public Long getBackupTimeType() {
        return this.BackupTimeType;
    }

    /**
     * Set 0: default; 1: one-time backup; 2: remote backup
     * @param BackupTimeType 0: default; 1: one-time backup; 2: remote backup
     */
    public void setBackupTimeType(Long BackupTimeType) {
        this.BackupTimeType = BackupTimeType;
    }

    /**
     * Get 0: default; 1: immediate recovery after the backup is completed. 
     * @return RestoreType 0: default; 1: immediate recovery after the backup is completed.
     */
    public Long getRestoreType() {
        return this.RestoreType;
    }

    /**
     * Set 0: default; 1: immediate recovery after the backup is completed.
     * @param RestoreType 0: default; 1: immediate recovery after the backup is completed.
     */
    public void setRestoreType(Long RestoreType) {
        this.RestoreType = RestoreType;
    }

    /**
     * Get 0: default; 1: connecting to COS using a custom key. 
     * @return AuthType 0: default; 1: connecting to COS using a custom key.
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 0: default; 1: connecting to COS using a custom key.
     * @param AuthType 0: default; 1: connecting to COS using a custom key.
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Cos certification information 
     * @return CosSourceInfo Cos certification information
     */
    public CosSourceInfo getCosSourceInfo() {
        return this.CosSourceInfo;
    }

    /**
     * Set Cos certification information
     * @param CosSourceInfo Cos certification information
     */
    public void setCosSourceInfo(CosSourceInfo CosSourceInfo) {
        this.CosSourceInfo = CosSourceInfo;
    }

    public CreateBackUpScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackUpScheduleRequest(CreateBackUpScheduleRequest source) {
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String(source.WeekDays);
        }
        if (source.ExecuteHour != null) {
            this.ExecuteHour = new Long(source.ExecuteHour);
        }
        if (source.BackUpTables != null) {
            this.BackUpTables = new BackupTableContent[source.BackUpTables.length];
            for (int i = 0; i < source.BackUpTables.length; i++) {
                this.BackUpTables[i] = new BackupTableContent(source.BackUpTables[i]);
            }
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.DorisSourceInfo != null) {
            this.DorisSourceInfo = new DorisSourceInfo(source.DorisSourceInfo);
        }
        if (source.BackupTimeType != null) {
            this.BackupTimeType = new Long(source.BackupTimeType);
        }
        if (source.RestoreType != null) {
            this.RestoreType = new Long(source.RestoreType);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.CosSourceInfo != null) {
            this.CosSourceInfo = new CosSourceInfo(source.CosSourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "WeekDays", this.WeekDays);
        this.setParamSimple(map, prefix + "ExecuteHour", this.ExecuteHour);
        this.setParamArrayObj(map, prefix + "BackUpTables.", this.BackUpTables);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamObj(map, prefix + "DorisSourceInfo.", this.DorisSourceInfo);
        this.setParamSimple(map, prefix + "BackupTimeType", this.BackupTimeType);
        this.setParamSimple(map, prefix + "RestoreType", this.RestoreType);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "CosSourceInfo.", this.CosSourceInfo);

    }
}

