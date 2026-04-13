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

public class CreateBackupPlanRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Specifies the name of the backup plan.
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Specifies the schedule type of the backup created. currently only support month.
    */
    @SerializedName("BackupPeriodType")
    @Expose
    private String BackupPeriodType;

    /**
    * Backup date. example: enable backup on the 2nd of every month.
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String [] BackupPeriod;

    /**
    * Specifies the backup start time. if not passed, it follows the default backup plan.
    */
    @SerializedName("MinBackupStartTime")
    @Expose
    private String MinBackupStartTime;

    /**
    * Backup end time. follows the default plan if not specified.
    */
    @SerializedName("MaxBackupStartTime")
    @Expose
    private String MaxBackupStartTime;

    /**
    * Specifies the data backup retention duration in days. value range: [0,30000).
BackupPeriodType defaults to 7 when set to week and 31 when set to month.
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/product/409/16773?lang=en).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Specifies the name of the backup plan. 
     * @return PlanName Specifies the name of the backup plan.
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Specifies the name of the backup plan.
     * @param PlanName Specifies the name of the backup plan.
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Specifies the schedule type of the backup created. currently only support month. 
     * @return BackupPeriodType Specifies the schedule type of the backup created. currently only support month.
     */
    public String getBackupPeriodType() {
        return this.BackupPeriodType;
    }

    /**
     * Set Specifies the schedule type of the backup created. currently only support month.
     * @param BackupPeriodType Specifies the schedule type of the backup created. currently only support month.
     */
    public void setBackupPeriodType(String BackupPeriodType) {
        this.BackupPeriodType = BackupPeriodType;
    }

    /**
     * Get Backup date. example: enable backup on the 2nd of every month. 
     * @return BackupPeriod Backup date. example: enable backup on the 2nd of every month.
     */
    public String [] getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set Backup date. example: enable backup on the 2nd of every month.
     * @param BackupPeriod Backup date. example: enable backup on the 2nd of every month.
     */
    public void setBackupPeriod(String [] BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
    }

    /**
     * Get Specifies the backup start time. if not passed, it follows the default backup plan. 
     * @return MinBackupStartTime Specifies the backup start time. if not passed, it follows the default backup plan.
     */
    public String getMinBackupStartTime() {
        return this.MinBackupStartTime;
    }

    /**
     * Set Specifies the backup start time. if not passed, it follows the default backup plan.
     * @param MinBackupStartTime Specifies the backup start time. if not passed, it follows the default backup plan.
     */
    public void setMinBackupStartTime(String MinBackupStartTime) {
        this.MinBackupStartTime = MinBackupStartTime;
    }

    /**
     * Get Backup end time. follows the default plan if not specified. 
     * @return MaxBackupStartTime Backup end time. follows the default plan if not specified.
     */
    public String getMaxBackupStartTime() {
        return this.MaxBackupStartTime;
    }

    /**
     * Set Backup end time. follows the default plan if not specified.
     * @param MaxBackupStartTime Backup end time. follows the default plan if not specified.
     */
    public void setMaxBackupStartTime(String MaxBackupStartTime) {
        this.MaxBackupStartTime = MaxBackupStartTime;
    }

    /**
     * Get Specifies the data backup retention duration in days. value range: [0,30000).
BackupPeriodType defaults to 7 when set to week and 31 when set to month. 
     * @return BaseBackupRetentionPeriod Specifies the data backup retention duration in days. value range: [0,30000).
BackupPeriodType defaults to 7 when set to week and 31 when set to month.
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set Specifies the data backup retention duration in days. value range: [0,30000).
BackupPeriodType defaults to 7 when set to week and 31 when set to month.
     * @param BaseBackupRetentionPeriod Specifies the data backup retention duration in days. value range: [0,30000).
BackupPeriodType defaults to 7 when set to week and 31 when set to month.
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    public CreateBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupPlanRequest(CreateBackupPlanRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.BackupPeriodType != null) {
            this.BackupPeriodType = new String(source.BackupPeriodType);
        }
        if (source.BackupPeriod != null) {
            this.BackupPeriod = new String[source.BackupPeriod.length];
            for (int i = 0; i < source.BackupPeriod.length; i++) {
                this.BackupPeriod[i] = new String(source.BackupPeriod[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "BackupPeriodType", this.BackupPeriodType);
        this.setParamArraySimple(map, prefix + "BackupPeriod.", this.BackupPeriod);
        this.setParamSimple(map, prefix + "MinBackupStartTime", this.MinBackupStartTime);
        this.setParamSimple(map, prefix + "MaxBackupStartTime", this.MaxBackupStartTime);
        this.setParamSimple(map, prefix + "BaseBackupRetentionPeriod", this.BaseBackupRetentionPeriod);

    }
}

