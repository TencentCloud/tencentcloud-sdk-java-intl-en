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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupTableContent extends AbstractModel {

    /**
    * Database
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Total number of bytes in the table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalBytes")
    @Expose
    private Long TotalBytes;

    /**
    * Size of a single replica
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SingleReplicaBytes")
    @Expose
    private String SingleReplicaBytes;

    /**
    * Backup status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupStatus")
    @Expose
    private Long BackupStatus;

    /**
    * Error message of the backup
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupErrorMsg")
    @Expose
    private String BackupErrorMsg;

    /**
    * Whether to bind the cold storage policy to the database and table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsOpenCoolDown")
    @Expose
    private Boolean IsOpenCoolDown;

    /**
     * Get Database
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Database Database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Database Database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Table Table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Table Table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Total number of bytes in the table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalBytes Total number of bytes in the table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalBytes() {
        return this.TotalBytes;
    }

    /**
     * Set Total number of bytes in the table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalBytes Total number of bytes in the table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalBytes(Long TotalBytes) {
        this.TotalBytes = TotalBytes;
    }

    /**
     * Get Size of a single replica
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SingleReplicaBytes Size of a single replica
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSingleReplicaBytes() {
        return this.SingleReplicaBytes;
    }

    /**
     * Set Size of a single replica
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SingleReplicaBytes Size of a single replica
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSingleReplicaBytes(String SingleReplicaBytes) {
        this.SingleReplicaBytes = SingleReplicaBytes;
    }

    /**
     * Get Backup status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupStatus Backup status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupStatus() {
        return this.BackupStatus;
    }

    /**
     * Set Backup status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupStatus Backup status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupStatus(Long BackupStatus) {
        this.BackupStatus = BackupStatus;
    }

    /**
     * Get Error message of the backup
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupErrorMsg Error message of the backup
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupErrorMsg() {
        return this.BackupErrorMsg;
    }

    /**
     * Set Error message of the backup
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupErrorMsg Error message of the backup
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupErrorMsg(String BackupErrorMsg) {
        this.BackupErrorMsg = BackupErrorMsg;
    }

    /**
     * Get Whether to bind the cold storage policy to the database and table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsOpenCoolDown Whether to bind the cold storage policy to the database and table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsOpenCoolDown() {
        return this.IsOpenCoolDown;
    }

    /**
     * Set Whether to bind the cold storage policy to the database and table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsOpenCoolDown Whether to bind the cold storage policy to the database and table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsOpenCoolDown(Boolean IsOpenCoolDown) {
        this.IsOpenCoolDown = IsOpenCoolDown;
    }

    public BackupTableContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupTableContent(BackupTableContent source) {
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.TotalBytes != null) {
            this.TotalBytes = new Long(source.TotalBytes);
        }
        if (source.SingleReplicaBytes != null) {
            this.SingleReplicaBytes = new String(source.SingleReplicaBytes);
        }
        if (source.BackupStatus != null) {
            this.BackupStatus = new Long(source.BackupStatus);
        }
        if (source.BackupErrorMsg != null) {
            this.BackupErrorMsg = new String(source.BackupErrorMsg);
        }
        if (source.IsOpenCoolDown != null) {
            this.IsOpenCoolDown = new Boolean(source.IsOpenCoolDown);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "TotalBytes", this.TotalBytes);
        this.setParamSimple(map, prefix + "SingleReplicaBytes", this.SingleReplicaBytes);
        this.setParamSimple(map, prefix + "BackupStatus", this.BackupStatus);
        this.setParamSimple(map, prefix + "BackupErrorMsg", this.BackupErrorMsg);
        this.setParamSimple(map, prefix + "IsOpenCoolDown", this.IsOpenCoolDown);

    }
}

