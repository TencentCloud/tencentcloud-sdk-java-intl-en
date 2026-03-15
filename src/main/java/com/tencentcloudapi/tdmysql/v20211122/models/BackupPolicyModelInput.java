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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPolicyModelInput extends AbstractModel {

    /**
    * <P>Backup end time.</p>
    */
    @SerializedName("BackupEndTime")
    @Expose
    private String BackupEndTime;

    /**
    * <P>Backup method: physical physical backup, snapshot snapshot backup</p>
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <P>Backup start time</p>
    */
    @SerializedName("BackupStartTime")
    @Expose
    private String BackupStartTime;

    /**
    * <P>Whether full backup is enabled</p>
    */
    @SerializedName("EnableFull")
    @Expose
    private Long EnableFull;

    /**
    * <P>Whether to enable log backup</p>
    */
    @SerializedName("EnableLog")
    @Expose
    private Long EnableLog;

    /**
    * <P>Full backup retention time can currently only be set to 7 days.</p>
    */
    @SerializedName("FullRetentionPeriod")
    @Expose
    private Long FullRetentionPeriod;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <P>Log retention days. currently, can only set retention to 7 days.</p>
    */
    @SerializedName("LogRetentionPeriod")
    @Expose
    private Long LogRetentionPeriod;

    /**
    * <P>Days of the week to perform backup.</p>
    */
    @SerializedName("PeriodTime")
    @Expose
    private String PeriodTime;

    /**
    * <p>Storage type: COS, SNAPSHOT</p>valid values: <ul><li> COS: COS storage</li><li> SNAPSHOT: cloud disk SNAPSHOT</li></ul>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <P>Backup end time.</p> 
     * @return BackupEndTime <P>Backup end time.</p>
     */
    public String getBackupEndTime() {
        return this.BackupEndTime;
    }

    /**
     * Set <P>Backup end time.</p>
     * @param BackupEndTime <P>Backup end time.</p>
     */
    public void setBackupEndTime(String BackupEndTime) {
        this.BackupEndTime = BackupEndTime;
    }

    /**
     * Get <P>Backup method: physical physical backup, snapshot snapshot backup</p> 
     * @return BackupMethod <P>Backup method: physical physical backup, snapshot snapshot backup</p>
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <P>Backup method: physical physical backup, snapshot snapshot backup</p>
     * @param BackupMethod <P>Backup method: physical physical backup, snapshot snapshot backup</p>
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <P>Backup start time</p> 
     * @return BackupStartTime <P>Backup start time</p>
     */
    public String getBackupStartTime() {
        return this.BackupStartTime;
    }

    /**
     * Set <P>Backup start time</p>
     * @param BackupStartTime <P>Backup start time</p>
     */
    public void setBackupStartTime(String BackupStartTime) {
        this.BackupStartTime = BackupStartTime;
    }

    /**
     * Get <P>Whether full backup is enabled</p> 
     * @return EnableFull <P>Whether full backup is enabled</p>
     */
    public Long getEnableFull() {
        return this.EnableFull;
    }

    /**
     * Set <P>Whether full backup is enabled</p>
     * @param EnableFull <P>Whether full backup is enabled</p>
     */
    public void setEnableFull(Long EnableFull) {
        this.EnableFull = EnableFull;
    }

    /**
     * Get <P>Whether to enable log backup</p> 
     * @return EnableLog <P>Whether to enable log backup</p>
     */
    public Long getEnableLog() {
        return this.EnableLog;
    }

    /**
     * Set <P>Whether to enable log backup</p>
     * @param EnableLog <P>Whether to enable log backup</p>
     */
    public void setEnableLog(Long EnableLog) {
        this.EnableLog = EnableLog;
    }

    /**
     * Get <P>Full backup retention time can currently only be set to 7 days.</p> 
     * @return FullRetentionPeriod <P>Full backup retention time can currently only be set to 7 days.</p>
     */
    public Long getFullRetentionPeriod() {
        return this.FullRetentionPeriod;
    }

    /**
     * Set <P>Full backup retention time can currently only be set to 7 days.</p>
     * @param FullRetentionPeriod <P>Full backup retention time can currently only be set to 7 days.</p>
     */
    public void setFullRetentionPeriod(Long FullRetentionPeriod) {
        this.FullRetentionPeriod = FullRetentionPeriod;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <P>Log retention days. currently, can only set retention to 7 days.</p> 
     * @return LogRetentionPeriod <P>Log retention days. currently, can only set retention to 7 days.</p>
     */
    public Long getLogRetentionPeriod() {
        return this.LogRetentionPeriod;
    }

    /**
     * Set <P>Log retention days. currently, can only set retention to 7 days.</p>
     * @param LogRetentionPeriod <P>Log retention days. currently, can only set retention to 7 days.</p>
     */
    public void setLogRetentionPeriod(Long LogRetentionPeriod) {
        this.LogRetentionPeriod = LogRetentionPeriod;
    }

    /**
     * Get <P>Days of the week to perform backup.</p> 
     * @return PeriodTime <P>Days of the week to perform backup.</p>
     */
    public String getPeriodTime() {
        return this.PeriodTime;
    }

    /**
     * Set <P>Days of the week to perform backup.</p>
     * @param PeriodTime <P>Days of the week to perform backup.</p>
     */
    public void setPeriodTime(String PeriodTime) {
        this.PeriodTime = PeriodTime;
    }

    /**
     * Get <p>Storage type: COS, SNAPSHOT</p>valid values: <ul><li> COS: COS storage</li><li> SNAPSHOT: cloud disk SNAPSHOT</li></ul> 
     * @return StorageType <p>Storage type: COS, SNAPSHOT</p>valid values: <ul><li> COS: COS storage</li><li> SNAPSHOT: cloud disk SNAPSHOT</li></ul>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type: COS, SNAPSHOT</p>valid values: <ul><li> COS: COS storage</li><li> SNAPSHOT: cloud disk SNAPSHOT</li></ul>
     * @param StorageType <p>Storage type: COS, SNAPSHOT</p>valid values: <ul><li> COS: COS storage</li><li> SNAPSHOT: cloud disk SNAPSHOT</li></ul>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public BackupPolicyModelInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPolicyModelInput(BackupPolicyModelInput source) {
        if (source.BackupEndTime != null) {
            this.BackupEndTime = new String(source.BackupEndTime);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStartTime != null) {
            this.BackupStartTime = new String(source.BackupStartTime);
        }
        if (source.EnableFull != null) {
            this.EnableFull = new Long(source.EnableFull);
        }
        if (source.EnableLog != null) {
            this.EnableLog = new Long(source.EnableLog);
        }
        if (source.FullRetentionPeriod != null) {
            this.FullRetentionPeriod = new Long(source.FullRetentionPeriod);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogRetentionPeriod != null) {
            this.LogRetentionPeriod = new Long(source.LogRetentionPeriod);
        }
        if (source.PeriodTime != null) {
            this.PeriodTime = new String(source.PeriodTime);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupEndTime", this.BackupEndTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStartTime", this.BackupStartTime);
        this.setParamSimple(map, prefix + "EnableFull", this.EnableFull);
        this.setParamSimple(map, prefix + "EnableLog", this.EnableLog);
        this.setParamSimple(map, prefix + "FullRetentionPeriod", this.FullRetentionPeriod);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogRetentionPeriod", this.LogRetentionPeriod);
        this.setParamSimple(map, prefix + "PeriodTime", this.PeriodTime);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

