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

public class BackupPolicyModelOutPut extends AbstractModel {

    /**
    * <p>Backup end time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupEndTime")
    @Expose
    private String BackupEndTime;

    /**
    * <p>Backup method</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * <p>Backup start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupStartTime")
    @Expose
    private String BackupStartTime;

    /**
    * <p>Engine type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBType")
    @Expose
    private String DBType;

    /**
    * <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>Whether full backup is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableFull")
    @Expose
    private Long EnableFull;

    /**
    * <p>Whether to enable log backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableLog")
    @Expose
    private Long EnableLog;

    /**
    * <p>Expected next backup time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpectedNextBackupPeriod")
    @Expose
    private String ExpectedNextBackupPeriod;

    /**
    * <p>Full backup retention time</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullRetentionPeriod")
    @Expose
    private Long FullRetentionPeriod;

    /**
    * <p>Policy ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Log retention days</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogRetentionPeriod")
    @Expose
    private Long LogRetentionPeriod;

    /**
    * <p>Days of the week to perform backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeriodTime")
    @Expose
    private String PeriodTime;

    /**
    * <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Backup cycle type 0:Weekly</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeriodType")
    @Expose
    private Long PeriodType;

    /**
     * Get <p>Backup end time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupEndTime <p>Backup end time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupEndTime() {
        return this.BackupEndTime;
    }

    /**
     * Set <p>Backup end time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupEndTime <p>Backup end time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupEndTime(String BackupEndTime) {
        this.BackupEndTime = BackupEndTime;
    }

    /**
     * Get <p>Backup method</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupMethod <p>Backup method</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>Backup method</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupMethod <p>Backup method</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>Backup start time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupStartTime <p>Backup start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupStartTime() {
        return this.BackupStartTime;
    }

    /**
     * Set <p>Backup start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupStartTime <p>Backup start time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupStartTime(String BackupStartTime) {
        this.BackupStartTime = BackupStartTime;
    }

    /**
     * Get <p>Engine type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBType <p>Engine type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * Set <p>Engine type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBType <p>Engine type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBType(String DBType) {
        this.DBType = DBType;
    }

    /**
     * Get <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBVersion <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBVersion <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>Whether full backup is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableFull <p>Whether full backup is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnableFull() {
        return this.EnableFull;
    }

    /**
     * Set <p>Whether full backup is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableFull <p>Whether full backup is enabled</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableFull(Long EnableFull) {
        this.EnableFull = EnableFull;
    }

    /**
     * Get <p>Whether to enable log backup</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableLog <p>Whether to enable log backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnableLog() {
        return this.EnableLog;
    }

    /**
     * Set <p>Whether to enable log backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableLog <p>Whether to enable log backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableLog(Long EnableLog) {
        this.EnableLog = EnableLog;
    }

    /**
     * Get <p>Expected next backup time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpectedNextBackupPeriod <p>Expected next backup time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpectedNextBackupPeriod() {
        return this.ExpectedNextBackupPeriod;
    }

    /**
     * Set <p>Expected next backup time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpectedNextBackupPeriod <p>Expected next backup time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpectedNextBackupPeriod(String ExpectedNextBackupPeriod) {
        this.ExpectedNextBackupPeriod = ExpectedNextBackupPeriod;
    }

    /**
     * Get <p>Full backup retention time</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullRetentionPeriod <p>Full backup retention time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFullRetentionPeriod() {
        return this.FullRetentionPeriod;
    }

    /**
     * Set <p>Full backup retention time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullRetentionPeriod <p>Full backup retention time</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullRetentionPeriod(Long FullRetentionPeriod) {
        this.FullRetentionPeriod = FullRetentionPeriod;
    }

    /**
     * Get <p>Policy ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID <p>Policy ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Policy ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID <p>Policy ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId <p>Instance ID.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Log retention days</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogRetentionPeriod <p>Log retention days</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLogRetentionPeriod() {
        return this.LogRetentionPeriod;
    }

    /**
     * Set <p>Log retention days</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogRetentionPeriod <p>Log retention days</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogRetentionPeriod(Long LogRetentionPeriod) {
        this.LogRetentionPeriod = LogRetentionPeriod;
    }

    /**
     * Get <p>Days of the week to perform backup</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeriodTime <p>Days of the week to perform backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPeriodTime() {
        return this.PeriodTime;
    }

    /**
     * Set <p>Days of the week to perform backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeriodTime <p>Days of the week to perform backup</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriodTime(String PeriodTime) {
        this.PeriodTime = PeriodTime;
    }

    /**
     * Get <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region <p>Region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Backup cycle type 0:Weekly</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PeriodType <p>Backup cycle type 0:Weekly</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>Backup cycle type 0:Weekly</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PeriodType <p>Backup cycle type 0:Weekly</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriodType(Long PeriodType) {
        this.PeriodType = PeriodType;
    }

    public BackupPolicyModelOutPut() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPolicyModelOutPut(BackupPolicyModelOutPut source) {
        if (source.BackupEndTime != null) {
            this.BackupEndTime = new String(source.BackupEndTime);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BackupStartTime != null) {
            this.BackupStartTime = new String(source.BackupStartTime);
        }
        if (source.DBType != null) {
            this.DBType = new String(source.DBType);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.EnableFull != null) {
            this.EnableFull = new Long(source.EnableFull);
        }
        if (source.EnableLog != null) {
            this.EnableLog = new Long(source.EnableLog);
        }
        if (source.ExpectedNextBackupPeriod != null) {
            this.ExpectedNextBackupPeriod = new String(source.ExpectedNextBackupPeriod);
        }
        if (source.FullRetentionPeriod != null) {
            this.FullRetentionPeriod = new Long(source.FullRetentionPeriod);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new Long(source.PeriodType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupEndTime", this.BackupEndTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupStartTime", this.BackupStartTime);
        this.setParamSimple(map, prefix + "DBType", this.DBType);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "EnableFull", this.EnableFull);
        this.setParamSimple(map, prefix + "EnableLog", this.EnableLog);
        this.setParamSimple(map, prefix + "ExpectedNextBackupPeriod", this.ExpectedNextBackupPeriod);
        this.setParamSimple(map, prefix + "FullRetentionPeriod", this.FullRetentionPeriod);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogRetentionPeriod", this.LogRetentionPeriod);
        this.setParamSimple(map, prefix + "PeriodTime", this.PeriodTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);

    }
}

