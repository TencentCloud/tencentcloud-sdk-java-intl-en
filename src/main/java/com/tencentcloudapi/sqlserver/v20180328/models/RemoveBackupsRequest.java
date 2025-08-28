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

public class RemoveBackupsRequest extends AbstractModel {

    /**
    * Instance ID. For example, mssql-j8kv137v.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup names to be deleted. Backup names can be obtained through the FileName field of the DescribeBackups API. The number of backups for batch deletion in a single request should not exceed 10. This field is required when the values of StartTime and EndTime are null.
    */
    @SerializedName("BackupNames")
    @Expose
    private String [] BackupNames;

    /**
    * Start time for batch deletion of manual backups. This field is required when the value of BackupNames is null.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Deadline for batch deletion of manual backups. This field is required when the value of BackupNames is null.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Instance ID. For example, mssql-j8kv137v. 
     * @return InstanceId Instance ID. For example, mssql-j8kv137v.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. For example, mssql-j8kv137v.
     * @param InstanceId Instance ID. For example, mssql-j8kv137v.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup names to be deleted. Backup names can be obtained through the FileName field of the DescribeBackups API. The number of backups for batch deletion in a single request should not exceed 10. This field is required when the values of StartTime and EndTime are null. 
     * @return BackupNames Backup names to be deleted. Backup names can be obtained through the FileName field of the DescribeBackups API. The number of backups for batch deletion in a single request should not exceed 10. This field is required when the values of StartTime and EndTime are null.
     */
    public String [] getBackupNames() {
        return this.BackupNames;
    }

    /**
     * Set Backup names to be deleted. Backup names can be obtained through the FileName field of the DescribeBackups API. The number of backups for batch deletion in a single request should not exceed 10. This field is required when the values of StartTime and EndTime are null.
     * @param BackupNames Backup names to be deleted. Backup names can be obtained through the FileName field of the DescribeBackups API. The number of backups for batch deletion in a single request should not exceed 10. This field is required when the values of StartTime and EndTime are null.
     */
    public void setBackupNames(String [] BackupNames) {
        this.BackupNames = BackupNames;
    }

    /**
     * Get Start time for batch deletion of manual backups. This field is required when the value of BackupNames is null. 
     * @return StartTime Start time for batch deletion of manual backups. This field is required when the value of BackupNames is null.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for batch deletion of manual backups. This field is required when the value of BackupNames is null.
     * @param StartTime Start time for batch deletion of manual backups. This field is required when the value of BackupNames is null.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Deadline for batch deletion of manual backups. This field is required when the value of BackupNames is null. 
     * @return EndTime Deadline for batch deletion of manual backups. This field is required when the value of BackupNames is null.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Deadline for batch deletion of manual backups. This field is required when the value of BackupNames is null.
     * @param EndTime Deadline for batch deletion of manual backups. This field is required when the value of BackupNames is null.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public RemoveBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveBackupsRequest(RemoveBackupsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupNames != null) {
            this.BackupNames = new String[source.BackupNames.length];
            for (int i = 0; i < source.BackupNames.length; i++) {
                this.BackupNames[i] = new String(source.BackupNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "BackupNames.", this.BackupNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

