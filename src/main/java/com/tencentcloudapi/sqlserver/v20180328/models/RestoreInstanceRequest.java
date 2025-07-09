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

public class RestoreInstanceRequest extends AbstractModel {

    /**
    * Instance ID in the format of mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup file ID, which can be obtained through the `Id` field in the returned value of the `DescribeBackups` API
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * ID of the target instance to which the backup is restored. The target instance should be under the same `APPID`. If this parameter is left empty, ID of the source instance will be used.
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * Restore the databases listed in `ReNameRestoreDatabase` and rename them after restoration. If this parameter is left empty, all databases will be restored and renamed in the default format.
    */
    @SerializedName("RenameRestore")
    @Expose
    private RenameRestoreDatabase [] RenameRestore;

    /**
    * Rollback type. Valid values: `0` (overwriting), `1` (renaming).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Database to be overwritten, which is required when overwriting a rollback database.
    */
    @SerializedName("DBList")
    @Expose
    private String [] DBList;

    /**
    * Group ID of unarchived backup files grouped by backup task
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Instance ID in the format of mssql-j8kv137v 
     * @return InstanceId Instance ID in the format of mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of mssql-j8kv137v
     * @param InstanceId Instance ID in the format of mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup file ID, which can be obtained through the `Id` field in the returned value of the `DescribeBackups` API 
     * @return BackupId Backup file ID, which can be obtained through the `Id` field in the returned value of the `DescribeBackups` API
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set Backup file ID, which can be obtained through the `Id` field in the returned value of the `DescribeBackups` API
     * @param BackupId Backup file ID, which can be obtained through the `Id` field in the returned value of the `DescribeBackups` API
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get ID of the target instance to which the backup is restored. The target instance should be under the same `APPID`. If this parameter is left empty, ID of the source instance will be used. 
     * @return TargetInstanceId ID of the target instance to which the backup is restored. The target instance should be under the same `APPID`. If this parameter is left empty, ID of the source instance will be used.
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set ID of the target instance to which the backup is restored. The target instance should be under the same `APPID`. If this parameter is left empty, ID of the source instance will be used.
     * @param TargetInstanceId ID of the target instance to which the backup is restored. The target instance should be under the same `APPID`. If this parameter is left empty, ID of the source instance will be used.
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get Restore the databases listed in `ReNameRestoreDatabase` and rename them after restoration. If this parameter is left empty, all databases will be restored and renamed in the default format. 
     * @return RenameRestore Restore the databases listed in `ReNameRestoreDatabase` and rename them after restoration. If this parameter is left empty, all databases will be restored and renamed in the default format.
     */
    public RenameRestoreDatabase [] getRenameRestore() {
        return this.RenameRestore;
    }

    /**
     * Set Restore the databases listed in `ReNameRestoreDatabase` and rename them after restoration. If this parameter is left empty, all databases will be restored and renamed in the default format.
     * @param RenameRestore Restore the databases listed in `ReNameRestoreDatabase` and rename them after restoration. If this parameter is left empty, all databases will be restored and renamed in the default format.
     */
    public void setRenameRestore(RenameRestoreDatabase [] RenameRestore) {
        this.RenameRestore = RenameRestore;
    }

    /**
     * Get Rollback type. Valid values: `0` (overwriting), `1` (renaming). 
     * @return Type Rollback type. Valid values: `0` (overwriting), `1` (renaming).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Rollback type. Valid values: `0` (overwriting), `1` (renaming).
     * @param Type Rollback type. Valid values: `0` (overwriting), `1` (renaming).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Database to be overwritten, which is required when overwriting a rollback database. 
     * @return DBList Database to be overwritten, which is required when overwriting a rollback database.
     */
    public String [] getDBList() {
        return this.DBList;
    }

    /**
     * Set Database to be overwritten, which is required when overwriting a rollback database.
     * @param DBList Database to be overwritten, which is required when overwriting a rollback database.
     */
    public void setDBList(String [] DBList) {
        this.DBList = DBList;
    }

    /**
     * Get Group ID of unarchived backup files grouped by backup task 
     * @return GroupId Group ID of unarchived backup files grouped by backup task
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID of unarchived backup files grouped by backup task
     * @param GroupId Group ID of unarchived backup files grouped by backup task
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public RestoreInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreInstanceRequest(RestoreInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
        if (source.RenameRestore != null) {
            this.RenameRestore = new RenameRestoreDatabase[source.RenameRestore.length];
            for (int i = 0; i < source.RenameRestore.length; i++) {
                this.RenameRestore[i] = new RenameRestoreDatabase(source.RenameRestore[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DBList != null) {
            this.DBList = new String[source.DBList.length];
            for (int i = 0; i < source.DBList.length; i++) {
                this.DBList[i] = new String(source.DBList[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamArrayObj(map, prefix + "RenameRestore.", this.RenameRestore);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "DBList.", this.DBList);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

