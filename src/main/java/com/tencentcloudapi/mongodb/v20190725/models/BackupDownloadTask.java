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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupDownloadTask extends AbstractModel{

    /**
    * Task creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Backup name
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * Shard name
    */
    @SerializedName("ReplicaSetId")
    @Expose
    private String ReplicaSetId;

    /**
    * Backup size in bytes
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * Task status. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task progress in percentage
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Task duration in seconds
    */
    @SerializedName("TimeSpend")
    @Expose
    private Long TimeSpend;

    /**
    * Backup download address
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Backup type of the backup file. Valid values: `0` (logical backup), `1` (physical backup)
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * Backup description you set when starting a backup task
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
     * Get Task creation time 
     * @return CreateTime Task creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time
     * @param CreateTime Task creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Backup name 
     * @return BackupName Backup name
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Backup name
     * @param BackupName Backup name
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get Shard name 
     * @return ReplicaSetId Shard name
     */
    public String getReplicaSetId() {
        return this.ReplicaSetId;
    }

    /**
     * Set Shard name
     * @param ReplicaSetId Shard name
     */
    public void setReplicaSetId(String ReplicaSetId) {
        this.ReplicaSetId = ReplicaSetId;
    }

    /**
     * Get Backup size in bytes 
     * @return BackupSize Backup size in bytes
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set Backup size in bytes
     * @param BackupSize Backup size in bytes
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get Task status. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry) 
     * @return Status Task status. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry)
     * @param Status Task status. Valid values: `0` (waiting for execution), `1` (downloading), `2` (downloaded), `3` (download failed), `4` (waiting for retry)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task progress in percentage 
     * @return Percent Task progress in percentage
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Task progress in percentage
     * @param Percent Task progress in percentage
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Task duration in seconds 
     * @return TimeSpend Task duration in seconds
     */
    public Long getTimeSpend() {
        return this.TimeSpend;
    }

    /**
     * Set Task duration in seconds
     * @param TimeSpend Task duration in seconds
     */
    public void setTimeSpend(Long TimeSpend) {
        this.TimeSpend = TimeSpend;
    }

    /**
     * Get Backup download address 
     * @return Url Backup download address
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Backup download address
     * @param Url Backup download address
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Backup type of the backup file. Valid values: `0` (logical backup), `1` (physical backup) 
     * @return BackupMethod Backup type of the backup file. Valid values: `0` (logical backup), `1` (physical backup)
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Backup type of the backup file. Valid values: `0` (logical backup), `1` (physical backup)
     * @param BackupMethod Backup type of the backup file. Valid values: `0` (logical backup), `1` (physical backup)
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Backup description you set when starting a backup task
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BackupDesc Backup description you set when starting a backup task
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set Backup description you set when starting a backup task
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BackupDesc Backup description you set when starting a backup task
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    public BackupDownloadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupDownloadTask(BackupDownloadTask source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.ReplicaSetId != null) {
            this.ReplicaSetId = new String(source.ReplicaSetId);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.TimeSpend != null) {
            this.TimeSpend = new Long(source.TimeSpend);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackupDesc != null) {
            this.BackupDesc = new String(source.BackupDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "ReplicaSetId", this.ReplicaSetId);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "TimeSpend", this.TimeSpend);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackupDesc", this.BackupDesc);

    }
}

