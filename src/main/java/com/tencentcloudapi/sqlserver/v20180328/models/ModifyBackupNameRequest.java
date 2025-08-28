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

public class ModifyBackupNameRequest extends AbstractModel {

    /**
    * Instance ID, in the format of mssql-3l3fgqn7.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Modified backup name.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * The backup ID can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API. When the value of GroupId is null, BackupId is required.
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * Backup task group ID, which can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API in single-database backup file mode. BackupId and GroupId exist simultaneously, and are modified according to BackupId.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get Instance ID, in the format of mssql-3l3fgqn7. 
     * @return InstanceId Instance ID, in the format of mssql-3l3fgqn7.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of mssql-3l3fgqn7.
     * @param InstanceId Instance ID, in the format of mssql-3l3fgqn7.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Modified backup name. 
     * @return BackupName Modified backup name.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Modified backup name.
     * @param BackupName Modified backup name.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get The backup ID can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API. When the value of GroupId is null, BackupId is required. 
     * @return BackupId The backup ID can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API. When the value of GroupId is null, BackupId is required.
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set The backup ID can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API. When the value of GroupId is null, BackupId is required.
     * @param BackupId The backup ID can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API. When the value of GroupId is null, BackupId is required.
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get Backup task group ID, which can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API in single-database backup file mode. BackupId and GroupId exist simultaneously, and are modified according to BackupId. 
     * @return GroupId Backup task group ID, which can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API in single-database backup file mode. BackupId and GroupId exist simultaneously, and are modified according to BackupId.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Backup task group ID, which can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API in single-database backup file mode. BackupId and GroupId exist simultaneously, and are modified according to BackupId.
     * @param GroupId Backup task group ID, which can be obtained through the [DescribeBackups](https://cloud.tencent.com/document/product/238/19943) API in single-database backup file mode. BackupId and GroupId exist simultaneously, and are modified according to BackupId.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public ModifyBackupNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupNameRequest(ModifyBackupNameRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
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
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

