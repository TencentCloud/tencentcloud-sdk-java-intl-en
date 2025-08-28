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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBRestoreTimeRequest extends AbstractModel {

    /**
    * Original instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ID of the target instance for rollback. If this parameter is left unspecified, roll back to the original instance by default.
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * Queries databases that can be rolled back by time point, with the time format of YYYY-MM-DD HH:MM:SS. Either BackupId or Time should be specified, as they cannot be empty simultaneously.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Queries databases that can be rolled back by backup set ID, which can be obtained through the DescribeBackups API. Either BackupId or Time should be specified, as they cannot be empty simultaneously.
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Database name.
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
     * Get Original instance ID. 
     * @return InstanceId Original instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Original instance ID.
     * @param InstanceId Original instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ID of the target instance for rollback. If this parameter is left unspecified, roll back to the original instance by default. 
     * @return TargetInstanceId ID of the target instance for rollback. If this parameter is left unspecified, roll back to the original instance by default.
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set ID of the target instance for rollback. If this parameter is left unspecified, roll back to the original instance by default.
     * @param TargetInstanceId ID of the target instance for rollback. If this parameter is left unspecified, roll back to the original instance by default.
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get Queries databases that can be rolled back by time point, with the time format of YYYY-MM-DD HH:MM:SS. Either BackupId or Time should be specified, as they cannot be empty simultaneously. 
     * @return Time Queries databases that can be rolled back by time point, with the time format of YYYY-MM-DD HH:MM:SS. Either BackupId or Time should be specified, as they cannot be empty simultaneously.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Queries databases that can be rolled back by time point, with the time format of YYYY-MM-DD HH:MM:SS. Either BackupId or Time should be specified, as they cannot be empty simultaneously.
     * @param Time Queries databases that can be rolled back by time point, with the time format of YYYY-MM-DD HH:MM:SS. Either BackupId or Time should be specified, as they cannot be empty simultaneously.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Queries databases that can be rolled back by backup set ID, which can be obtained through the DescribeBackups API. Either BackupId or Time should be specified, as they cannot be empty simultaneously. 
     * @return BackupId Queries databases that can be rolled back by backup set ID, which can be obtained through the DescribeBackups API. Either BackupId or Time should be specified, as they cannot be empty simultaneously.
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Queries databases that can be rolled back by backup set ID, which can be obtained through the DescribeBackups API. Either BackupId or Time should be specified, as they cannot be empty simultaneously.
     * @param BackupId Queries databases that can be rolled back by backup set ID, which can be obtained through the DescribeBackups API. Either BackupId or Time should be specified, as they cannot be empty simultaneously.
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Database name. 
     * @return DBName Database name.
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set Database name.
     * @param DBName Database name.
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    public DescribeDBRestoreTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBRestoreTimeRequest(DescribeDBRestoreTimeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "DBName", this.DBName);

    }
}

