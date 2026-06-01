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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupConfigRequest extends AbstractModel {

    /**
    * Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Retention time of the data backup file, in days.
1. MySQL two-node, three-node, and cloud disk edition data backup files can be retained for 7-1830 days.
2. MySQL single-node (cloud disk) data backup files can be retained for 7-30 days.
    */
    @SerializedName("ExpireDays")
    @Expose
    private Long ExpireDays;

    /**
    * (This parameter will be disused. The `BackupTimeWindow` parameter is recommended.) Backup time range in the format of 02:00-06:00, with the start time and end time on the hour. Valid values: 00:00-12:00, 02:00-06:00, 06:00-10:00, 10:00-14:00, 14:00-18:00, 18:00-22:00, 22:00-02:00.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Automatic backup mode. Only `physical` (physical cold backup) is supported
    */
    @SerializedName("BackupMethod")
    @Expose
    private String BackupMethod;

    /**
    * binlog retention time in days.
1. MySQL two-node, three-node, and cloud disk log backup files can be retained for 7 to 3650 days.
2. MySQL single-node (cloud disk) log backup files can be retained for 7-30 days.
    */
    @SerializedName("BinlogExpireDays")
    @Expose
    private Long BinlogExpireDays;

    /**
    * Backup time window; for example, to set up backup between 10:00 and 14:00 on every Tuesday and Sunday, you should set this parameter as follows: {"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"} (Note: You can set up backup on different days, but the backup time windows need to be the same. If this field is set, the `StartTime` field will be ignored)
    */
    @SerializedName("BackupTimeWindow")
    @Expose
    private CommonTimeWindow BackupTimeWindow;

    /**
    * Periodic backup retention switch. off - periodic backup retention policy is not enabled, on - periodic backup retention policy is enabled. Default is off.
    */
    @SerializedName("EnableBackupPeriodSave")
    @Expose
    private String EnableBackupPeriodSave;

    /**
    * Switch for long-term backup retention (This field can be ignored, for its feature hasn’t been launched). Valid values: `off` (disable), `on` (enable). Default value: `off`. Once enabled, the parameters (BackupPeriodSaveDays, BackupPeriodSaveInterval, and BackupPeriodSaveCount) will be invalid.
    */
    @SerializedName("EnableBackupPeriodLongTermSave")
    @Expose
    private String EnableBackupPeriodLongTermSave;

    /**
    * Maximum days of archive backup retention. Valid range: 90-3650. Default value: 1080.
    */
    @SerializedName("BackupPeriodSaveDays")
    @Expose
    private Long BackupPeriodSaveDays;

    /**
    * Archive backup retention period. Valid values: `weekly` (a week), `monthly` (a month), `quarterly` (a quarter), `yearly` (a year). Default value: `monthly`.
    */
    @SerializedName("BackupPeriodSaveInterval")
    @Expose
    private String BackupPeriodSaveInterval;

    /**
    * Number of archive backups. Minimum value: `1`, Maximum value: Number of non-archive backups in archive backup retention period. Default value: `1`.
    */
    @SerializedName("BackupPeriodSaveCount")
    @Expose
    private Long BackupPeriodSaveCount;

    /**
    * The start time in the format of yyyy-mm-dd HH:MM:SS, which is used to enable archive backup retention policy.
    */
    @SerializedName("StartBackupPeriodSaveDate")
    @Expose
    private String StartBackupPeriodSaveDate;

    /**
    * Whether the data backup/archive policy is enabled. off - disabled, on - enabled. If not specified, remain unchanged.
    */
    @SerializedName("EnableBackupArchive")
    @Expose
    private String EnableBackupArchive;

    /**
    * The period (in days) of how long a data backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires.
    */
    @SerializedName("BackupArchiveDays")
    @Expose
    private Long BackupArchiveDays;

    /**
    * The period (in days) of how long a log backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires.
    */
    @SerializedName("BinlogArchiveDays")
    @Expose
    private Long BinlogArchiveDays;

    /**
    * Whether to enable log backup archive strategy. off - off, on - on. If not specified, remain unchanged.
    */
    @SerializedName("EnableBinlogArchive")
    @Expose
    private String EnableBinlogArchive;

    /**
    * Whether to enable the standard storage policy for data backup. off - disabled, on - enabled. If not specified, it remains unchanged.
    */
    @SerializedName("EnableBackupStandby")
    @Expose
    private String EnableBackupStandby;

    /**
    * The period (in days) of how long a data backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period.
    */
    @SerializedName("BackupStandbyDays")
    @Expose
    private Long BackupStandbyDays;

    /**
    * Whether to enable log backup standard storage policy. off - off, on - on. If not specified, remain unchanged.
    */
    @SerializedName("EnableBinlogStandby")
    @Expose
    private String EnableBinlogStandby;

    /**
    * The period (in days) of how long a log backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period.
    */
    @SerializedName("BinlogStandbyDays")
    @Expose
    private Long BinlogStandbyDays;

    /**
     * Get Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. 
     * @return InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     * @param InstanceId Instance ID, in the format such as cdb-c1nl9rpv. This matches the instance ID displayed on the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Retention time of the data backup file, in days.
1. MySQL two-node, three-node, and cloud disk edition data backup files can be retained for 7-1830 days.
2. MySQL single-node (cloud disk) data backup files can be retained for 7-30 days. 
     * @return ExpireDays Retention time of the data backup file, in days.
1. MySQL two-node, three-node, and cloud disk edition data backup files can be retained for 7-1830 days.
2. MySQL single-node (cloud disk) data backup files can be retained for 7-30 days.
     */
    public Long getExpireDays() {
        return this.ExpireDays;
    }

    /**
     * Set Retention time of the data backup file, in days.
1. MySQL two-node, three-node, and cloud disk edition data backup files can be retained for 7-1830 days.
2. MySQL single-node (cloud disk) data backup files can be retained for 7-30 days.
     * @param ExpireDays Retention time of the data backup file, in days.
1. MySQL two-node, three-node, and cloud disk edition data backup files can be retained for 7-1830 days.
2. MySQL single-node (cloud disk) data backup files can be retained for 7-30 days.
     */
    public void setExpireDays(Long ExpireDays) {
        this.ExpireDays = ExpireDays;
    }

    /**
     * Get (This parameter will be disused. The `BackupTimeWindow` parameter is recommended.) Backup time range in the format of 02:00-06:00, with the start time and end time on the hour. Valid values: 00:00-12:00, 02:00-06:00, 06:00-10:00, 10:00-14:00, 14:00-18:00, 18:00-22:00, 22:00-02:00. 
     * @return StartTime (This parameter will be disused. The `BackupTimeWindow` parameter is recommended.) Backup time range in the format of 02:00-06:00, with the start time and end time on the hour. Valid values: 00:00-12:00, 02:00-06:00, 06:00-10:00, 10:00-14:00, 14:00-18:00, 18:00-22:00, 22:00-02:00.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set (This parameter will be disused. The `BackupTimeWindow` parameter is recommended.) Backup time range in the format of 02:00-06:00, with the start time and end time on the hour. Valid values: 00:00-12:00, 02:00-06:00, 06:00-10:00, 10:00-14:00, 14:00-18:00, 18:00-22:00, 22:00-02:00.
     * @param StartTime (This parameter will be disused. The `BackupTimeWindow` parameter is recommended.) Backup time range in the format of 02:00-06:00, with the start time and end time on the hour. Valid values: 00:00-12:00, 02:00-06:00, 06:00-10:00, 10:00-14:00, 14:00-18:00, 18:00-22:00, 22:00-02:00.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Automatic backup mode. Only `physical` (physical cold backup) is supported 
     * @return BackupMethod Automatic backup mode. Only `physical` (physical cold backup) is supported
     */
    public String getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Automatic backup mode. Only `physical` (physical cold backup) is supported
     * @param BackupMethod Automatic backup mode. Only `physical` (physical cold backup) is supported
     */
    public void setBackupMethod(String BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get binlog retention time in days.
1. MySQL two-node, three-node, and cloud disk log backup files can be retained for 7 to 3650 days.
2. MySQL single-node (cloud disk) log backup files can be retained for 7-30 days. 
     * @return BinlogExpireDays binlog retention time in days.
1. MySQL two-node, three-node, and cloud disk log backup files can be retained for 7 to 3650 days.
2. MySQL single-node (cloud disk) log backup files can be retained for 7-30 days.
     */
    public Long getBinlogExpireDays() {
        return this.BinlogExpireDays;
    }

    /**
     * Set binlog retention time in days.
1. MySQL two-node, three-node, and cloud disk log backup files can be retained for 7 to 3650 days.
2. MySQL single-node (cloud disk) log backup files can be retained for 7-30 days.
     * @param BinlogExpireDays binlog retention time in days.
1. MySQL two-node, three-node, and cloud disk log backup files can be retained for 7 to 3650 days.
2. MySQL single-node (cloud disk) log backup files can be retained for 7-30 days.
     */
    public void setBinlogExpireDays(Long BinlogExpireDays) {
        this.BinlogExpireDays = BinlogExpireDays;
    }

    /**
     * Get Backup time window; for example, to set up backup between 10:00 and 14:00 on every Tuesday and Sunday, you should set this parameter as follows: {"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"} (Note: You can set up backup on different days, but the backup time windows need to be the same. If this field is set, the `StartTime` field will be ignored) 
     * @return BackupTimeWindow Backup time window; for example, to set up backup between 10:00 and 14:00 on every Tuesday and Sunday, you should set this parameter as follows: {"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"} (Note: You can set up backup on different days, but the backup time windows need to be the same. If this field is set, the `StartTime` field will be ignored)
     */
    public CommonTimeWindow getBackupTimeWindow() {
        return this.BackupTimeWindow;
    }

    /**
     * Set Backup time window; for example, to set up backup between 10:00 and 14:00 on every Tuesday and Sunday, you should set this parameter as follows: {"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"} (Note: You can set up backup on different days, but the backup time windows need to be the same. If this field is set, the `StartTime` field will be ignored)
     * @param BackupTimeWindow Backup time window; for example, to set up backup between 10:00 and 14:00 on every Tuesday and Sunday, you should set this parameter as follows: {"Monday": "", "Tuesday": "10:00-14:00", "Wednesday": "", "Thursday": "", "Friday": "", "Saturday": "", "Sunday": "10:00-14:00"} (Note: You can set up backup on different days, but the backup time windows need to be the same. If this field is set, the `StartTime` field will be ignored)
     */
    public void setBackupTimeWindow(CommonTimeWindow BackupTimeWindow) {
        this.BackupTimeWindow = BackupTimeWindow;
    }

    /**
     * Get Periodic backup retention switch. off - periodic backup retention policy is not enabled, on - periodic backup retention policy is enabled. Default is off. 
     * @return EnableBackupPeriodSave Periodic backup retention switch. off - periodic backup retention policy is not enabled, on - periodic backup retention policy is enabled. Default is off.
     */
    public String getEnableBackupPeriodSave() {
        return this.EnableBackupPeriodSave;
    }

    /**
     * Set Periodic backup retention switch. off - periodic backup retention policy is not enabled, on - periodic backup retention policy is enabled. Default is off.
     * @param EnableBackupPeriodSave Periodic backup retention switch. off - periodic backup retention policy is not enabled, on - periodic backup retention policy is enabled. Default is off.
     */
    public void setEnableBackupPeriodSave(String EnableBackupPeriodSave) {
        this.EnableBackupPeriodSave = EnableBackupPeriodSave;
    }

    /**
     * Get Switch for long-term backup retention (This field can be ignored, for its feature hasn’t been launched). Valid values: `off` (disable), `on` (enable). Default value: `off`. Once enabled, the parameters (BackupPeriodSaveDays, BackupPeriodSaveInterval, and BackupPeriodSaveCount) will be invalid. 
     * @return EnableBackupPeriodLongTermSave Switch for long-term backup retention (This field can be ignored, for its feature hasn’t been launched). Valid values: `off` (disable), `on` (enable). Default value: `off`. Once enabled, the parameters (BackupPeriodSaveDays, BackupPeriodSaveInterval, and BackupPeriodSaveCount) will be invalid.
     */
    public String getEnableBackupPeriodLongTermSave() {
        return this.EnableBackupPeriodLongTermSave;
    }

    /**
     * Set Switch for long-term backup retention (This field can be ignored, for its feature hasn’t been launched). Valid values: `off` (disable), `on` (enable). Default value: `off`. Once enabled, the parameters (BackupPeriodSaveDays, BackupPeriodSaveInterval, and BackupPeriodSaveCount) will be invalid.
     * @param EnableBackupPeriodLongTermSave Switch for long-term backup retention (This field can be ignored, for its feature hasn’t been launched). Valid values: `off` (disable), `on` (enable). Default value: `off`. Once enabled, the parameters (BackupPeriodSaveDays, BackupPeriodSaveInterval, and BackupPeriodSaveCount) will be invalid.
     */
    public void setEnableBackupPeriodLongTermSave(String EnableBackupPeriodLongTermSave) {
        this.EnableBackupPeriodLongTermSave = EnableBackupPeriodLongTermSave;
    }

    /**
     * Get Maximum days of archive backup retention. Valid range: 90-3650. Default value: 1080. 
     * @return BackupPeriodSaveDays Maximum days of archive backup retention. Valid range: 90-3650. Default value: 1080.
     */
    public Long getBackupPeriodSaveDays() {
        return this.BackupPeriodSaveDays;
    }

    /**
     * Set Maximum days of archive backup retention. Valid range: 90-3650. Default value: 1080.
     * @param BackupPeriodSaveDays Maximum days of archive backup retention. Valid range: 90-3650. Default value: 1080.
     */
    public void setBackupPeriodSaveDays(Long BackupPeriodSaveDays) {
        this.BackupPeriodSaveDays = BackupPeriodSaveDays;
    }

    /**
     * Get Archive backup retention period. Valid values: `weekly` (a week), `monthly` (a month), `quarterly` (a quarter), `yearly` (a year). Default value: `monthly`. 
     * @return BackupPeriodSaveInterval Archive backup retention period. Valid values: `weekly` (a week), `monthly` (a month), `quarterly` (a quarter), `yearly` (a year). Default value: `monthly`.
     */
    public String getBackupPeriodSaveInterval() {
        return this.BackupPeriodSaveInterval;
    }

    /**
     * Set Archive backup retention period. Valid values: `weekly` (a week), `monthly` (a month), `quarterly` (a quarter), `yearly` (a year). Default value: `monthly`.
     * @param BackupPeriodSaveInterval Archive backup retention period. Valid values: `weekly` (a week), `monthly` (a month), `quarterly` (a quarter), `yearly` (a year). Default value: `monthly`.
     */
    public void setBackupPeriodSaveInterval(String BackupPeriodSaveInterval) {
        this.BackupPeriodSaveInterval = BackupPeriodSaveInterval;
    }

    /**
     * Get Number of archive backups. Minimum value: `1`, Maximum value: Number of non-archive backups in archive backup retention period. Default value: `1`. 
     * @return BackupPeriodSaveCount Number of archive backups. Minimum value: `1`, Maximum value: Number of non-archive backups in archive backup retention period. Default value: `1`.
     */
    public Long getBackupPeriodSaveCount() {
        return this.BackupPeriodSaveCount;
    }

    /**
     * Set Number of archive backups. Minimum value: `1`, Maximum value: Number of non-archive backups in archive backup retention period. Default value: `1`.
     * @param BackupPeriodSaveCount Number of archive backups. Minimum value: `1`, Maximum value: Number of non-archive backups in archive backup retention period. Default value: `1`.
     */
    public void setBackupPeriodSaveCount(Long BackupPeriodSaveCount) {
        this.BackupPeriodSaveCount = BackupPeriodSaveCount;
    }

    /**
     * Get The start time in the format of yyyy-mm-dd HH:MM:SS, which is used to enable archive backup retention policy. 
     * @return StartBackupPeriodSaveDate The start time in the format of yyyy-mm-dd HH:MM:SS, which is used to enable archive backup retention policy.
     */
    public String getStartBackupPeriodSaveDate() {
        return this.StartBackupPeriodSaveDate;
    }

    /**
     * Set The start time in the format of yyyy-mm-dd HH:MM:SS, which is used to enable archive backup retention policy.
     * @param StartBackupPeriodSaveDate The start time in the format of yyyy-mm-dd HH:MM:SS, which is used to enable archive backup retention policy.
     */
    public void setStartBackupPeriodSaveDate(String StartBackupPeriodSaveDate) {
        this.StartBackupPeriodSaveDate = StartBackupPeriodSaveDate;
    }

    /**
     * Get Whether the data backup/archive policy is enabled. off - disabled, on - enabled. If not specified, remain unchanged. 
     * @return EnableBackupArchive Whether the data backup/archive policy is enabled. off - disabled, on - enabled. If not specified, remain unchanged.
     */
    public String getEnableBackupArchive() {
        return this.EnableBackupArchive;
    }

    /**
     * Set Whether the data backup/archive policy is enabled. off - disabled, on - enabled. If not specified, remain unchanged.
     * @param EnableBackupArchive Whether the data backup/archive policy is enabled. off - disabled, on - enabled. If not specified, remain unchanged.
     */
    public void setEnableBackupArchive(String EnableBackupArchive) {
        this.EnableBackupArchive = EnableBackupArchive;
    }

    /**
     * Get The period (in days) of how long a data backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires. 
     * @return BackupArchiveDays The period (in days) of how long a data backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires.
     */
    public Long getBackupArchiveDays() {
        return this.BackupArchiveDays;
    }

    /**
     * Set The period (in days) of how long a data backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires.
     * @param BackupArchiveDays The period (in days) of how long a data backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires.
     */
    public void setBackupArchiveDays(Long BackupArchiveDays) {
        this.BackupArchiveDays = BackupArchiveDays;
    }

    /**
     * Get The period (in days) of how long a log backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires. 
     * @return BinlogArchiveDays The period (in days) of how long a log backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires.
     */
    public Long getBinlogArchiveDays() {
        return this.BinlogArchiveDays;
    }

    /**
     * Set The period (in days) of how long a log backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires.
     * @param BinlogArchiveDays The period (in days) of how long a log backup is retained before being archived, which falls between 180 days and the number of days from the time it is created until it expires.
     */
    public void setBinlogArchiveDays(Long BinlogArchiveDays) {
        this.BinlogArchiveDays = BinlogArchiveDays;
    }

    /**
     * Get Whether to enable log backup archive strategy. off - off, on - on. If not specified, remain unchanged. 
     * @return EnableBinlogArchive Whether to enable log backup archive strategy. off - off, on - on. If not specified, remain unchanged.
     */
    public String getEnableBinlogArchive() {
        return this.EnableBinlogArchive;
    }

    /**
     * Set Whether to enable log backup archive strategy. off - off, on - on. If not specified, remain unchanged.
     * @param EnableBinlogArchive Whether to enable log backup archive strategy. off - off, on - on. If not specified, remain unchanged.
     */
    public void setEnableBinlogArchive(String EnableBinlogArchive) {
        this.EnableBinlogArchive = EnableBinlogArchive;
    }

    /**
     * Get Whether to enable the standard storage policy for data backup. off - disabled, on - enabled. If not specified, it remains unchanged. 
     * @return EnableBackupStandby Whether to enable the standard storage policy for data backup. off - disabled, on - enabled. If not specified, it remains unchanged.
     */
    public String getEnableBackupStandby() {
        return this.EnableBackupStandby;
    }

    /**
     * Set Whether to enable the standard storage policy for data backup. off - disabled, on - enabled. If not specified, it remains unchanged.
     * @param EnableBackupStandby Whether to enable the standard storage policy for data backup. off - disabled, on - enabled. If not specified, it remains unchanged.
     */
    public void setEnableBackupStandby(String EnableBackupStandby) {
        this.EnableBackupStandby = EnableBackupStandby;
    }

    /**
     * Get The period (in days) of how long a data backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period. 
     * @return BackupStandbyDays The period (in days) of how long a data backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period.
     */
    public Long getBackupStandbyDays() {
        return this.BackupStandbyDays;
    }

    /**
     * Set The period (in days) of how long a data backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period.
     * @param BackupStandbyDays The period (in days) of how long a data backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period.
     */
    public void setBackupStandbyDays(Long BackupStandbyDays) {
        this.BackupStandbyDays = BackupStandbyDays;
    }

    /**
     * Get Whether to enable log backup standard storage policy. off - off, on - on. If not specified, remain unchanged. 
     * @return EnableBinlogStandby Whether to enable log backup standard storage policy. off - off, on - on. If not specified, remain unchanged.
     */
    public String getEnableBinlogStandby() {
        return this.EnableBinlogStandby;
    }

    /**
     * Set Whether to enable log backup standard storage policy. off - off, on - on. If not specified, remain unchanged.
     * @param EnableBinlogStandby Whether to enable log backup standard storage policy. off - off, on - on. If not specified, remain unchanged.
     */
    public void setEnableBinlogStandby(String EnableBinlogStandby) {
        this.EnableBinlogStandby = EnableBinlogStandby;
    }

    /**
     * Get The period (in days) of how long a log backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period. 
     * @return BinlogStandbyDays The period (in days) of how long a log backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period.
     */
    public Long getBinlogStandbyDays() {
        return this.BinlogStandbyDays;
    }

    /**
     * Set The period (in days) of how long a log backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period.
     * @param BinlogStandbyDays The period (in days) of how long a log backup is retained before switching to standard storage, which falls between 30 days and the number of days from the time it is created until it expires. If the archive backup is enabled, this period cannot be greater than archive backup period.
     */
    public void setBinlogStandbyDays(Long BinlogStandbyDays) {
        this.BinlogStandbyDays = BinlogStandbyDays;
    }

    public ModifyBackupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupConfigRequest(ModifyBackupConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExpireDays != null) {
            this.ExpireDays = new Long(source.ExpireDays);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new String(source.BackupMethod);
        }
        if (source.BinlogExpireDays != null) {
            this.BinlogExpireDays = new Long(source.BinlogExpireDays);
        }
        if (source.BackupTimeWindow != null) {
            this.BackupTimeWindow = new CommonTimeWindow(source.BackupTimeWindow);
        }
        if (source.EnableBackupPeriodSave != null) {
            this.EnableBackupPeriodSave = new String(source.EnableBackupPeriodSave);
        }
        if (source.EnableBackupPeriodLongTermSave != null) {
            this.EnableBackupPeriodLongTermSave = new String(source.EnableBackupPeriodLongTermSave);
        }
        if (source.BackupPeriodSaveDays != null) {
            this.BackupPeriodSaveDays = new Long(source.BackupPeriodSaveDays);
        }
        if (source.BackupPeriodSaveInterval != null) {
            this.BackupPeriodSaveInterval = new String(source.BackupPeriodSaveInterval);
        }
        if (source.BackupPeriodSaveCount != null) {
            this.BackupPeriodSaveCount = new Long(source.BackupPeriodSaveCount);
        }
        if (source.StartBackupPeriodSaveDate != null) {
            this.StartBackupPeriodSaveDate = new String(source.StartBackupPeriodSaveDate);
        }
        if (source.EnableBackupArchive != null) {
            this.EnableBackupArchive = new String(source.EnableBackupArchive);
        }
        if (source.BackupArchiveDays != null) {
            this.BackupArchiveDays = new Long(source.BackupArchiveDays);
        }
        if (source.BinlogArchiveDays != null) {
            this.BinlogArchiveDays = new Long(source.BinlogArchiveDays);
        }
        if (source.EnableBinlogArchive != null) {
            this.EnableBinlogArchive = new String(source.EnableBinlogArchive);
        }
        if (source.EnableBackupStandby != null) {
            this.EnableBackupStandby = new String(source.EnableBackupStandby);
        }
        if (source.BackupStandbyDays != null) {
            this.BackupStandbyDays = new Long(source.BackupStandbyDays);
        }
        if (source.EnableBinlogStandby != null) {
            this.EnableBinlogStandby = new String(source.EnableBinlogStandby);
        }
        if (source.BinlogStandbyDays != null) {
            this.BinlogStandbyDays = new Long(source.BinlogStandbyDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExpireDays", this.ExpireDays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BinlogExpireDays", this.BinlogExpireDays);
        this.setParamObj(map, prefix + "BackupTimeWindow.", this.BackupTimeWindow);
        this.setParamSimple(map, prefix + "EnableBackupPeriodSave", this.EnableBackupPeriodSave);
        this.setParamSimple(map, prefix + "EnableBackupPeriodLongTermSave", this.EnableBackupPeriodLongTermSave);
        this.setParamSimple(map, prefix + "BackupPeriodSaveDays", this.BackupPeriodSaveDays);
        this.setParamSimple(map, prefix + "BackupPeriodSaveInterval", this.BackupPeriodSaveInterval);
        this.setParamSimple(map, prefix + "BackupPeriodSaveCount", this.BackupPeriodSaveCount);
        this.setParamSimple(map, prefix + "StartBackupPeriodSaveDate", this.StartBackupPeriodSaveDate);
        this.setParamSimple(map, prefix + "EnableBackupArchive", this.EnableBackupArchive);
        this.setParamSimple(map, prefix + "BackupArchiveDays", this.BackupArchiveDays);
        this.setParamSimple(map, prefix + "BinlogArchiveDays", this.BinlogArchiveDays);
        this.setParamSimple(map, prefix + "EnableBinlogArchive", this.EnableBinlogArchive);
        this.setParamSimple(map, prefix + "EnableBackupStandby", this.EnableBackupStandby);
        this.setParamSimple(map, prefix + "BackupStandbyDays", this.BackupStandbyDays);
        this.setParamSimple(map, prefix + "EnableBinlogStandby", this.EnableBinlogStandby);
        this.setParamSimple(map, prefix + "BinlogStandbyDays", this.BinlogStandbyDays);

    }
}

