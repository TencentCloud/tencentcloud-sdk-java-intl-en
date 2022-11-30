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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupsRequest extends AbstractModel{

    /**
    * Start name (yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time (yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Instance ID in the format of mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of results per page. Value range: 1-100. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter by backup name. If this parameter is left empty, backup name will not be used in filtering.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering.
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * Filter by backup mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup). Default value: `2`.
    */
    @SerializedName("BackupWay")
    @Expose
    private Long BackupWay;

    /**
    * Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering.
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Filter backups by the database name. If the parameter is left empty, this filter criteria will not take effect.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Whether to group backup files by backup task. Valid value: `0` (no), `1` (yes). Default value: `0`. This parameter is valid only for unarchived backup files.
    */
    @SerializedName("Group")
    @Expose
    private Long Group;

    /**
    * Backup type. Valid values: `1` (data backup), `2` (log backup). Default value: `1`.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Filter by backup file format. Valid values: `pkg` (archive file), `single` (Unarchived files).
    */
    @SerializedName("BackupFormat")
    @Expose
    private String BackupFormat;

    /**
     * Get Start name (yyyy-MM-dd HH:mm:ss) 
     * @return StartTime Start name (yyyy-MM-dd HH:mm:ss)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start name (yyyy-MM-dd HH:mm:ss)
     * @param StartTime Start name (yyyy-MM-dd HH:mm:ss)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time (yyyy-MM-dd HH:mm:ss) 
     * @return EndTime End time (yyyy-MM-dd HH:mm:ss)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time (yyyy-MM-dd HH:mm:ss)
     * @param EndTime End time (yyyy-MM-dd HH:mm:ss)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Instance ID in the format of mssql-njj2mtpl 
     * @return InstanceId Instance ID in the format of mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-njj2mtpl
     * @param InstanceId Instance ID in the format of mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of results per page. Value range: 1-100. Default value: 20 
     * @return Limit Number of results per page. Value range: 1-100. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page. Value range: 1-100. Default value: 20
     * @param Limit Number of results per page. Value range: 1-100. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. Default value: 0 
     * @return Offset Page number. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: 0
     * @param Offset Page number. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter by backup name. If this parameter is left empty, backup name will not be used in filtering. 
     * @return BackupName Filter by backup name. If this parameter is left empty, backup name will not be used in filtering.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Filter by backup name. If this parameter is left empty, backup name will not be used in filtering.
     * @param BackupName Filter by backup name. If this parameter is left empty, backup name will not be used in filtering.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering. 
     * @return Strategy Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering.
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering.
     * @param Strategy Filter by backup policy. Valid values: 0 (instance backup), 1 (multi-database backup). If this parameter is left empty, backup policy will not be used in filtering.
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Filter by backup mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup). Default value: `2`. 
     * @return BackupWay Filter by backup mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup). Default value: `2`.
     */
    public Long getBackupWay() {
        return this.BackupWay;
    }

    /**
     * Set Filter by backup mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup). Default value: `2`.
     * @param BackupWay Filter by backup mode. Valid values: `0` (scheduled backup); `1` (manual backup); `2` (archive backup). Default value: `2`.
     */
    public void setBackupWay(Long BackupWay) {
        this.BackupWay = BackupWay;
    }

    /**
     * Get Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering. 
     * @return BackupId Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering.
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering.
     * @param BackupId Filter by backup ID. If this parameter is left empty, backup ID will not be used in filtering.
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Filter backups by the database name. If the parameter is left empty, this filter criteria will not take effect. 
     * @return DatabaseName Filter backups by the database name. If the parameter is left empty, this filter criteria will not take effect.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Filter backups by the database name. If the parameter is left empty, this filter criteria will not take effect.
     * @param DatabaseName Filter backups by the database name. If the parameter is left empty, this filter criteria will not take effect.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Whether to group backup files by backup task. Valid value: `0` (no), `1` (yes). Default value: `0`. This parameter is valid only for unarchived backup files. 
     * @return Group Whether to group backup files by backup task. Valid value: `0` (no), `1` (yes). Default value: `0`. This parameter is valid only for unarchived backup files.
     */
    public Long getGroup() {
        return this.Group;
    }

    /**
     * Set Whether to group backup files by backup task. Valid value: `0` (no), `1` (yes). Default value: `0`. This parameter is valid only for unarchived backup files.
     * @param Group Whether to group backup files by backup task. Valid value: `0` (no), `1` (yes). Default value: `0`. This parameter is valid only for unarchived backup files.
     */
    public void setGroup(Long Group) {
        this.Group = Group;
    }

    /**
     * Get Backup type. Valid values: `1` (data backup), `2` (log backup). Default value: `1`. 
     * @return Type Backup type. Valid values: `1` (data backup), `2` (log backup). Default value: `1`.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Backup type. Valid values: `1` (data backup), `2` (log backup). Default value: `1`.
     * @param Type Backup type. Valid values: `1` (data backup), `2` (log backup). Default value: `1`.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Filter by backup file format. Valid values: `pkg` (archive file), `single` (Unarchived files). 
     * @return BackupFormat Filter by backup file format. Valid values: `pkg` (archive file), `single` (Unarchived files).
     */
    public String getBackupFormat() {
        return this.BackupFormat;
    }

    /**
     * Set Filter by backup file format. Valid values: `pkg` (archive file), `single` (Unarchived files).
     * @param BackupFormat Filter by backup file format. Valid values: `pkg` (archive file), `single` (Unarchived files).
     */
    public void setBackupFormat(String BackupFormat) {
        this.BackupFormat = BackupFormat;
    }

    public DescribeBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupsRequest(DescribeBackupsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.BackupWay != null) {
            this.BackupWay = new Long(source.BackupWay);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Group != null) {
            this.Group = new Long(source.Group);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.BackupFormat != null) {
            this.BackupFormat = new String(source.BackupFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "BackupWay", this.BackupWay);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BackupFormat", this.BackupFormat);

    }
}

