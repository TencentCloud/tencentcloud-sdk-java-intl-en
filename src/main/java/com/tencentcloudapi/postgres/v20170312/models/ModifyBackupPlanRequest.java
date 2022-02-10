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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupPlanRequest extends AbstractModel{

    /**
    * Instance ID
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
    * Backup retention period in days. Value range: 3-7
    */
    @SerializedName("BaseBackupRetentionPeriod")
    @Expose
    private Long BaseBackupRetentionPeriod;

    /**
    * Backup cycle, which means on which days each week the instance will be backed up. The parameter value should be the lowercase names of the days of the week.
    */
    @SerializedName("BackupPeriod")
    @Expose
    private String [] BackupPeriod;

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
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
     * Get Backup retention period in days. Value range: 3-7 
     * @return BaseBackupRetentionPeriod Backup retention period in days. Value range: 3-7
     */
    public Long getBaseBackupRetentionPeriod() {
        return this.BaseBackupRetentionPeriod;
    }

    /**
     * Set Backup retention period in days. Value range: 3-7
     * @param BaseBackupRetentionPeriod Backup retention period in days. Value range: 3-7
     */
    public void setBaseBackupRetentionPeriod(Long BaseBackupRetentionPeriod) {
        this.BaseBackupRetentionPeriod = BaseBackupRetentionPeriod;
    }

    /**
     * Get Backup cycle, which means on which days each week the instance will be backed up. The parameter value should be the lowercase names of the days of the week. 
     * @return BackupPeriod Backup cycle, which means on which days each week the instance will be backed up. The parameter value should be the lowercase names of the days of the week.
     */
    public String [] getBackupPeriod() {
        return this.BackupPeriod;
    }

    /**
     * Set Backup cycle, which means on which days each week the instance will be backed up. The parameter value should be the lowercase names of the days of the week.
     * @param BackupPeriod Backup cycle, which means on which days each week the instance will be backed up. The parameter value should be the lowercase names of the days of the week.
     */
    public void setBackupPeriod(String [] BackupPeriod) {
        this.BackupPeriod = BackupPeriod;
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

    }
}

