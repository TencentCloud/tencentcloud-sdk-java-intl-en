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

public class ModifyBackupStrategyRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup mode, which supports daily backup only. Valid value: daily.
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
     * Get Backup mode, which supports daily backup only. Valid value: daily. 
     * @return BackupType Backup mode, which supports daily backup only. Valid value: daily.
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Backup mode, which supports daily backup only. Valid value: daily.
     * @param BackupType Backup mode, which supports daily backup only. Valid value: daily.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupTime", this.BackupTime);
        this.setParamSimple(map, prefix + "BackupDay", this.BackupDay);

    }
}

