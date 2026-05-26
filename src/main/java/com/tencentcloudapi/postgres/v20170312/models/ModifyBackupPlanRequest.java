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

public class ModifyBackupPlanRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

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
    * Backup retention period in days. Value range: 7-1830
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
    * Instance backup period. if by week, format is lowercase english word of week and set at least two days for backup. if by month, format is digits such as ["1","2"].
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String [] BackupPeriod;

    /**
    * Instance log backup retention duration, with a value range of 7-1830 and a unit of day
    */
    @SerializedName("LogBackupRetentionPeriod")
    @Expose
    private Long LogBackupRetentionPeriod;

    /**
    * Backup plan ID. specifies which backup plan to modify. if left empty, the default backup plan will be modified.
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Specifies the name of the backup plan to modify.
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
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
     * Get Backup retention period in days. Value range: 7-1830 
     * @return BaseBackupRetentionPeriod Backup retention period in days. Value range: 7-1830
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set Backup retention period in days. Value range: 7-1830
     * @param BaseBackupRetentionPeriod Backup retention period in days. Value range: 7-1830
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    /**
     * Get Instance backup period. if by week, format is lowercase english word of week and set at least two days for backup. if by month, format is digits such as ["1","2"]. 
     * @return BackupPeriod Instance backup period. if by week, format is lowercase english word of week and set at least two days for backup. if by month, format is digits such as ["1","2"].
     */
    public String [] getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set Instance backup period. if by week, format is lowercase english word of week and set at least two days for backup. if by month, format is digits such as ["1","2"].
     * @param BackupPeriod Instance backup period. if by week, format is lowercase english word of week and set at least two days for backup. if by month, format is digits such as ["1","2"].
     */
    public void setBackupPeriod(String [] BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get Instance log backup retention duration, with a value range of 7-1830 and a unit of day 
     * @return LogBackupRetentionPeriod Instance log backup retention duration, with a value range of 7-1830 and a unit of day
     */
    public Long getLogBackupRetentionPeriod() {
        return this.LogBackupRetentionPeriod;
    }

    /**
     * Set Instance log backup retention duration, with a value range of 7-1830 and a unit of day
     * @param LogBackupRetentionPeriod Instance log backup retention duration, with a value range of 7-1830 and a unit of day
     */
    public void setLogBackupRetentionPeriod(Long LogBackupRetentionPeriod) {
        this.LogBackupRetentionPeriod = LogBackupRetentionPeriod;
    }

    /**
     * Get Backup plan ID. specifies which backup plan to modify. if left empty, the default backup plan will be modified. 
     * @return PlanId Backup plan ID. specifies which backup plan to modify. if left empty, the default backup plan will be modified.
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Backup plan ID. specifies which backup plan to modify. if left empty, the default backup plan will be modified.
     * @param PlanId Backup plan ID. specifies which backup plan to modify. if left empty, the default backup plan will be modified.
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Specifies the name of the backup plan to modify. 
     * @return PlanName Specifies the name of the backup plan to modify.
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Specifies the name of the backup plan to modify.
     * @param PlanName Specifies the name of the backup plan to modify.
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    public ModifyBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupPlanRequest(ModifyBackupPlanRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.MinBackupStartTime != null) {
            this.MinBackupStartTime = new String(source.MinBackupStartTime);
        }
        if (source.MaxBackupStartTime != null) {
            this.MaxBackupStartTime = new String(source.MaxBackupStartTime);
        }
        if (source.BaseBackupRetentionPeriod != null) {
            this.BaseBackupRetentionPeriod = new Long(source.BaseBackupRetentionPeriod);
        }
        if (source.BackupPeriod != null) {
            this.BackupPeriod = new String[source.BackupPeriod.length];
            for (int i = 0; i < source.BackupPeriod.length; i++) {
                this.BackupPeriod[i] = new String(source.BackupPeriod[i]);
            }
        }
        if (source.LogBackupRetentionPeriod != null) {
            this.LogBackupRetentionPeriod = new Long(source.LogBackupRetentionPeriod);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "MinBackupStartTime", this.MinBackupStartTime);
        this.setParamSimple(map, prefix + "MaxBackupStartTime", this.MaxBackupStartTime);
        this.setParamSimple(map, prefix + "BaseBackupRetentionPeriod", this.BaseBackupRetentionPeriod);
        this.setParamArraySimple(map, prefix + "BackupPeriod.", this.BackupPeriod);
        this.setParamSimple(map, prefix + "LogBackupRetentionPeriod", this.LogBackupRetentionPeriod);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);

    }
}

