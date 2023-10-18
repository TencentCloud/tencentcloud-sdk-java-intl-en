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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupStrategyRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup type. Valid values: `weekly` (when length(BackupDay) <=7 && length(BackupDay) >=2), `daily` (when length(BackupDay)=1). Default value: `daily`.
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * Backup time. Value range: an integer from 0 to 23.
    */
    @SerializedName("BackupTime")
    @Expose
    private Long BackupTime;

    /**
    * Backup interval in days when the `BackupType` is `daily`. Valid value: 1.
    */
    @SerializedName("BackupDay")
    @Expose
    private Long BackupDay;

    /**
    * Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node), `slave_no_pkg` (do not archive the backup files of the replica node). Backup files of the replica node are supported only when Always On disaster recovery is enabled.
    */
    @SerializedName("BackupModel")
    @Expose
    private String BackupModel;

    /**
    * The days of the week on which backup will be performed when “BackupType” is `weekly`. If data backup retention period is less than 7 days, the values will be 1-7, indicating that backup will be performed everyday by default; if data backup retention period is greater than or equal to 7 days, the values will be at least any two days, indicating that backup will be performed at least twice in a week by default.
    */
    @SerializedName("BackupCycle")
    @Expose
    private Long [] BackupCycle;

    /**
    * Data (log) backup retention period. Value range: 3-1830 days, default value: 7 days.
    */
    @SerializedName("BackupSaveDays")
    @Expose
    private Long BackupSaveDays;

    /**
    * Archive backup status. Valid values: `enable` (enabled); `disable` (disabled). Default value: `disable`.
    */
    @SerializedName("RegularBackupEnable")
    @Expose
    private String RegularBackupEnable;

    /**
    * Archive backup retention days. Value range: 90–3650 days. Default value: 365 days.
    */
    @SerializedName("RegularBackupSaveDays")
    @Expose
    private Long RegularBackupSaveDays;

    /**
    * Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly); Default value: `months`.
    */
    @SerializedName("RegularBackupStrategy")
    @Expose
    private String RegularBackupStrategy;

    /**
    * The number of retained archive backups. Default value: `1`.
    */
    @SerializedName("RegularBackupCounts")
    @Expose
    private Long RegularBackupCounts;

    /**
    * Archive backup start date in YYYY-MM-DD format, which is the current time by default.
    */
    @SerializedName("RegularBackupStartTime")
    @Expose
    private String RegularBackupStartTime;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup type. Valid values: `weekly` (when length(BackupDay) <=7 && length(BackupDay) >=2), `daily` (when length(BackupDay)=1). Default value: `daily`. 
     * @return BackupType Backup type. Valid values: `weekly` (when length(BackupDay) <=7 && length(BackupDay) >=2), `daily` (when length(BackupDay)=1). Default value: `daily`.
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup type. Valid values: `weekly` (when length(BackupDay) <=7 && length(BackupDay) >=2), `daily` (when length(BackupDay)=1). Default value: `daily`.
     * @param BackupType Backup type. Valid values: `weekly` (when length(BackupDay) <=7 && length(BackupDay) >=2), `daily` (when length(BackupDay)=1). Default value: `daily`.
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get Backup time. Value range: an integer from 0 to 23. 
     * @return BackupTime Backup time. Value range: an integer from 0 to 23.
     */
    public Long getBackupTime() {
        return this.BackupTime;
    }

    /**
     * Set Backup time. Value range: an integer from 0 to 23.
     * @param BackupTime Backup time. Value range: an integer from 0 to 23.
     */
    public void setBackupTime(Long BackupTime) {
        this.BackupTime = BackupTime;
    }

    /**
     * Get Backup interval in days when the `BackupType` is `daily`. Valid value: 1. 
     * @return BackupDay Backup interval in days when the `BackupType` is `daily`. Valid value: 1.
     */
    public Long getBackupDay() {
        return this.BackupDay;
    }

    /**
     * Set Backup interval in days when the `BackupType` is `daily`. Valid value: 1.
     * @param BackupDay Backup interval in days when the `BackupType` is `daily`. Valid value: 1.
     */
    public void setBackupDay(Long BackupDay) {
        this.BackupDay = BackupDay;
    }

    /**
     * Get Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node), `slave_no_pkg` (do not archive the backup files of the replica node). Backup files of the replica node are supported only when Always On disaster recovery is enabled. 
     * @return BackupModel Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node), `slave_no_pkg` (do not archive the backup files of the replica node). Backup files of the replica node are supported only when Always On disaster recovery is enabled.
     */
    public String getBackupModel() {
        return this.BackupModel;
    }

    /**
     * Set Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node), `slave_no_pkg` (do not archive the backup files of the replica node). Backup files of the replica node are supported only when Always On disaster recovery is enabled.
     * @param BackupModel Backup mode. Valid values: `master_pkg` (archive the backup files of the primary node), `master_no_pkg` (do not archive the backup files of the primary node), `slave_pkg` (archive the backup files of the replica node), `slave_no_pkg` (do not archive the backup files of the replica node). Backup files of the replica node are supported only when Always On disaster recovery is enabled.
     */
    public void setBackupModel(String BackupModel) {
        this.BackupModel = BackupModel;
    }

    /**
     * Get The days of the week on which backup will be performed when “BackupType” is `weekly`. If data backup retention period is less than 7 days, the values will be 1-7, indicating that backup will be performed everyday by default; if data backup retention period is greater than or equal to 7 days, the values will be at least any two days, indicating that backup will be performed at least twice in a week by default. 
     * @return BackupCycle The days of the week on which backup will be performed when “BackupType” is `weekly`. If data backup retention period is less than 7 days, the values will be 1-7, indicating that backup will be performed everyday by default; if data backup retention period is greater than or equal to 7 days, the values will be at least any two days, indicating that backup will be performed at least twice in a week by default.
     */
    public Long [] getBackupCycle() {
        return this.BackupCycle;
    }

    /**
     * Set The days of the week on which backup will be performed when “BackupType” is `weekly`. If data backup retention period is less than 7 days, the values will be 1-7, indicating that backup will be performed everyday by default; if data backup retention period is greater than or equal to 7 days, the values will be at least any two days, indicating that backup will be performed at least twice in a week by default.
     * @param BackupCycle The days of the week on which backup will be performed when “BackupType” is `weekly`. If data backup retention period is less than 7 days, the values will be 1-7, indicating that backup will be performed everyday by default; if data backup retention period is greater than or equal to 7 days, the values will be at least any two days, indicating that backup will be performed at least twice in a week by default.
     */
    public void setBackupCycle(Long [] BackupCycle) {
        this.BackupCycle = BackupCycle;
    }

    /**
     * Get Data (log) backup retention period. Value range: 3-1830 days, default value: 7 days. 
     * @return BackupSaveDays Data (log) backup retention period. Value range: 3-1830 days, default value: 7 days.
     */
    public Long getBackupSaveDays() {
        return this.BackupSaveDays;
    }

    /**
     * Set Data (log) backup retention period. Value range: 3-1830 days, default value: 7 days.
     * @param BackupSaveDays Data (log) backup retention period. Value range: 3-1830 days, default value: 7 days.
     */
    public void setBackupSaveDays(Long BackupSaveDays) {
        this.BackupSaveDays = BackupSaveDays;
    }

    /**
     * Get Archive backup status. Valid values: `enable` (enabled); `disable` (disabled). Default value: `disable`. 
     * @return RegularBackupEnable Archive backup status. Valid values: `enable` (enabled); `disable` (disabled). Default value: `disable`.
     */
    public String getRegularBackupEnable() {
        return this.RegularBackupEnable;
    }

    /**
     * Set Archive backup status. Valid values: `enable` (enabled); `disable` (disabled). Default value: `disable`.
     * @param RegularBackupEnable Archive backup status. Valid values: `enable` (enabled); `disable` (disabled). Default value: `disable`.
     */
    public void setRegularBackupEnable(String RegularBackupEnable) {
        this.RegularBackupEnable = RegularBackupEnable;
    }

    /**
     * Get Archive backup retention days. Value range: 90–3650 days. Default value: 365 days. 
     * @return RegularBackupSaveDays Archive backup retention days. Value range: 90–3650 days. Default value: 365 days.
     */
    public Long getRegularBackupSaveDays() {
        return this.RegularBackupSaveDays;
    }

    /**
     * Set Archive backup retention days. Value range: 90–3650 days. Default value: 365 days.
     * @param RegularBackupSaveDays Archive backup retention days. Value range: 90–3650 days. Default value: 365 days.
     */
    public void setRegularBackupSaveDays(Long RegularBackupSaveDays) {
        this.RegularBackupSaveDays = RegularBackupSaveDays;
    }

    /**
     * Get Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly); Default value: `months`. 
     * @return RegularBackupStrategy Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly); Default value: `months`.
     */
    public String getRegularBackupStrategy() {
        return this.RegularBackupStrategy;
    }

    /**
     * Set Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly); Default value: `months`.
     * @param RegularBackupStrategy Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly); Default value: `months`.
     */
    public void setRegularBackupStrategy(String RegularBackupStrategy) {
        this.RegularBackupStrategy = RegularBackupStrategy;
    }

    /**
     * Get The number of retained archive backups. Default value: `1`. 
     * @return RegularBackupCounts The number of retained archive backups. Default value: `1`.
     */
    public Long getRegularBackupCounts() {
        return this.RegularBackupCounts;
    }

    /**
     * Set The number of retained archive backups. Default value: `1`.
     * @param RegularBackupCounts The number of retained archive backups. Default value: `1`.
     */
    public void setRegularBackupCounts(Long RegularBackupCounts) {
        this.RegularBackupCounts = RegularBackupCounts;
    }

    /**
     * Get Archive backup start date in YYYY-MM-DD format, which is the current time by default. 
     * @return RegularBackupStartTime Archive backup start date in YYYY-MM-DD format, which is the current time by default.
     */
    public String getRegularBackupStartTime() {
        return this.RegularBackupStartTime;
    }

    /**
     * Set Archive backup start date in YYYY-MM-DD format, which is the current time by default.
     * @param RegularBackupStartTime Archive backup start date in YYYY-MM-DD format, which is the current time by default.
     */
    public void setRegularBackupStartTime(String RegularBackupStartTime) {
        this.RegularBackupStartTime = RegularBackupStartTime;
    }

    public ModifyBackupStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupStrategyRequest(ModifyBackupStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.BackupTime != null) {
            this.BackupTime = new Long(source.BackupTime);
        }
        if (source.BackupDay != null) {
            this.BackupDay = new Long(source.BackupDay);
        }
        if (source.BackupModel != null) {
            this.BackupModel = new String(source.BackupModel);
        }
        if (source.BackupCycle != null) {
            this.BackupCycle = new Long[source.BackupCycle.length];
            for (int i = 0; i < source.BackupCycle.length; i++) {
                this.BackupCycle[i] = new Long(source.BackupCycle[i]);
            }
        }
        if (source.BackupSaveDays != null) {
            this.BackupSaveDays = new Long(source.BackupSaveDays);
        }
        if (source.RegularBackupEnable != null) {
            this.RegularBackupEnable = new String(source.RegularBackupEnable);
        }
        if (source.RegularBackupSaveDays != null) {
            this.RegularBackupSaveDays = new Long(source.RegularBackupSaveDays);
        }
        if (source.RegularBackupStrategy != null) {
            this.RegularBackupStrategy = new String(source.RegularBackupStrategy);
        }
        if (source.RegularBackupCounts != null) {
            this.RegularBackupCounts = new Long(source.RegularBackupCounts);
        }
        if (source.RegularBackupStartTime != null) {
            this.RegularBackupStartTime = new String(source.RegularBackupStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "BackupDay", this.BackupDay);
        this.setParamSimple(map, prefix + "BackupModel", this.BackupModel);
        this.setParamArraySimple(map, prefix + "BackupCycle.", this.BackupCycle);
        this.setParamSimple(map, prefix + "BackupSaveDays", this.BackupSaveDays);
        this.setParamSimple(map, prefix + "RegularBackupEnable", this.RegularBackupEnable);
        this.setParamSimple(map, prefix + "RegularBackupSaveDays", this.RegularBackupSaveDays);
        this.setParamSimple(map, prefix + "RegularBackupStrategy", this.RegularBackupStrategy);
        this.setParamSimple(map, prefix + "RegularBackupCounts", this.RegularBackupCounts);
        this.setParamSimple(map, prefix + "RegularBackupStartTime", this.RegularBackupStartTime);

    }
}

