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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupPlan extends AbstractModel {

    /**
    * Backup cycle
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String BackupPeriod;

    /**
    * Specifies the data backup retention duration in days.
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
    * The earliest time to start a backup
    */
    @SerializedName("MinBackupStartTime")
    @Expose
    private String MinBackupStartTime;

    /**
    * The latest time to start a backup
    */
    @SerializedName("MaxBackupStartTime")
    @Expose
    private String MaxBackupStartTime;

    /**
    * Backup plan ID.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Specifies the custom name of the backup plan.
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Specifies the log backup retention period in days.
    */
    @SerializedName("LogBackupRetentionPeriod")
    @Expose
    private Long LogBackupRetentionPeriod;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last modification time.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Backup plan type. valid values: default (created by system), custom.
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * Backup cycle type. valid values: week, month.
    */
    @SerializedName("BackupPeriodType")
    @Expose
    private String BackupPeriodType;

    /**
     * Get Backup cycle 
     * @return BackupPeriod Backup cycle
     */
    public String getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set Backup cycle
     * @param BackupPeriod Backup cycle
     */
    public void setBackupPeriod(String BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get Specifies the data backup retention duration in days. 
     * @return BaseBackupRetentionPeriod Specifies the data backup retention duration in days.
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set Specifies the data backup retention duration in days.
     * @param BaseBackupRetentionPeriod Specifies the data backup retention duration in days.
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    /**
     * Get The earliest time to start a backup 
     * @return MinBackupStartTime The earliest time to start a backup
     */
    public String getMinBackupStartTime() {
        return this.MinBackupStartTime;
    }

    /**
     * Set The earliest time to start a backup
     * @param MinBackupStartTime The earliest time to start a backup
     */
    public void setMinBackupStartTime(String MinBackupStartTime) {
        this.MinBackupStartTime = MinBackupStartTime;
    }

    /**
     * Get The latest time to start a backup 
     * @return MaxBackupStartTime The latest time to start a backup
     */
    public String getMaxBackupStartTime() {
        return this.MaxBackupStartTime;
    }

    /**
     * Set The latest time to start a backup
     * @param MaxBackupStartTime The latest time to start a backup
     */
    public void setMaxBackupStartTime(String MaxBackupStartTime) {
        this.MaxBackupStartTime = MaxBackupStartTime;
    }

    /**
     * Get Backup plan ID. 
     * @return PlanId Backup plan ID.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Backup plan ID.
     * @param PlanId Backup plan ID.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Specifies the custom name of the backup plan. 
     * @return PlanName Specifies the custom name of the backup plan.
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Specifies the custom name of the backup plan.
     * @param PlanName Specifies the custom name of the backup plan.
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Specifies the log backup retention period in days. 
     * @return LogBackupRetentionPeriod Specifies the log backup retention period in days.
     */
    public Long getLogBackupRetentionPeriod() {
        return this.LogBackupRetentionPeriod;
    }

    /**
     * Set Specifies the log backup retention period in days.
     * @param LogBackupRetentionPeriod Specifies the log backup retention period in days.
     */
    public void setLogBackupRetentionPeriod(Long LogBackupRetentionPeriod) {
        this.LogBackupRetentionPeriod = LogBackupRetentionPeriod;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Last modification time. 
     * @return UpdatedTime Last modification time.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Last modification time.
     * @param UpdatedTime Last modification time.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Backup plan type. valid values: default (created by system), custom. 
     * @return PlanType Backup plan type. valid values: default (created by system), custom.
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set Backup plan type. valid values: default (created by system), custom.
     * @param PlanType Backup plan type. valid values: default (created by system), custom.
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get Backup cycle type. valid values: week, month. 
     * @return BackupPeriodType Backup cycle type. valid values: week, month.
     */
    public String getBackupPeriodType() {
        return this.BackupPeriodType;
    }

    /**
     * Set Backup cycle type. valid values: week, month.
     * @param BackupPeriodType Backup cycle type. valid values: week, month.
     */
    public void setBackupPeriodType(String BackupPeriodType) {
        this.BackupPeriodType = BackupPeriodType;
    }

    public BackupPlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupPlan(BackupPlan source) {
        if (source.BackupPeriod != null) {
            this.BackupPeriod = new String(source.BackupPeriod);
        }
        if (source.BaseBackupRetentionPeriod != null) {
            this.BaseBackupRetentionPeriod = new Long(source.BaseBackupRetentionPeriod);
        }
        if (source.MinBackupStartTime != null) {
            this.MinBackupStartTime = new String(source.MinBackupStartTime);
        }
        if (source.MaxBackupStartTime != null) {
            this.MaxBackupStartTime = new String(source.MaxBackupStartTime);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.LogBackupRetentionPeriod != null) {
            this.LogBackupRetentionPeriod = new Long(source.LogBackupRetentionPeriod);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.BackupPeriodType != null) {
            this.BackupPeriodType = new String(source.BackupPeriodType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupPeriod", this.BackupPeriod);
        this.setParamSimple(map, prefix + "BaseBackupRetentionPeriod", this.BaseBackupRetentionPeriod);
        this.setParamSimple(map, prefix + "MinBackupStartTime", this.MinBackupStartTime);
        this.setParamSimple(map, prefix + "MaxBackupStartTime", this.MaxBackupStartTime);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "LogBackupRetentionPeriod", this.LogBackupRetentionPeriod);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamSimple(map, prefix + "BackupPeriodType", this.BackupPeriodType);

    }
}

