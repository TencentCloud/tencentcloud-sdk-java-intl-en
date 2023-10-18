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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloneDBInstanceSpecRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Basic backup set ID. Either this parameter or `RecoveryTargetTime` must be passed in. If both are passed in, only this parameter takes effect.
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * Restoration time (UTC+8). Either this parameter or `BackupSetId` must be passed in.
    */
    @SerializedName("RecoveryTargetTime")
    @Expose
    private String RecoveryTargetTime;

    /**
     * Get Instance ID. 
     * @return DBInstanceId Instance ID.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID.
     * @param DBInstanceId Instance ID.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Basic backup set ID. Either this parameter or `RecoveryTargetTime` must be passed in. If both are passed in, only this parameter takes effect. 
     * @return BackupSetId Basic backup set ID. Either this parameter or `RecoveryTargetTime` must be passed in. If both are passed in, only this parameter takes effect.
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set Basic backup set ID. Either this parameter or `RecoveryTargetTime` must be passed in. If both are passed in, only this parameter takes effect.
     * @param BackupSetId Basic backup set ID. Either this parameter or `RecoveryTargetTime` must be passed in. If both are passed in, only this parameter takes effect.
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get Restoration time (UTC+8). Either this parameter or `BackupSetId` must be passed in. 
     * @return RecoveryTargetTime Restoration time (UTC+8). Either this parameter or `BackupSetId` must be passed in.
     */
    public String getRecoveryTargetTime() {
        return this.RecoveryTargetTime;
    }

    /**
     * Set Restoration time (UTC+8). Either this parameter or `BackupSetId` must be passed in.
     * @param RecoveryTargetTime Restoration time (UTC+8). Either this parameter or `BackupSetId` must be passed in.
     */
    public void setRecoveryTargetTime(String RecoveryTargetTime) {
        this.RecoveryTargetTime = RecoveryTargetTime;
    }

    public DescribeCloneDBInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloneDBInstanceSpecRequest(DescribeCloneDBInstanceSpecRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.RecoveryTargetTime != null) {
            this.RecoveryTargetTime = new String(source.RecoveryTargetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "RecoveryTargetTime", this.RecoveryTargetTime);

    }
}

