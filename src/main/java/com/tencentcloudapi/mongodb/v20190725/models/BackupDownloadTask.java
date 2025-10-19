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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupDownloadTask extends AbstractModel {

    /**
    * Task creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Backup file name.
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * Shard name.
    */
    @SerializedName("ReplicaSetId")
    @Expose
    private String ReplicaSetId;

    /**
    * Backup data size, in bytes.
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * Task status.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task progress percentage.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * Duration, in seconds.
    */
    @SerializedName("TimeSpend")
    @Expose
    private Long TimeSpend;

    /**
    * Download link for backup data.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Backup method.
- 0: logical backup.
- 1: physical backup.
- 3: snapshot backup.
**Note**:
1. The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.
2. Physical backup is not supported when storage encryption is enabled for the instance.
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * Specified remarks for initiating backup tasks.
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
    * Region information.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Bucket information.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
     * Get Task creation time. 
     * @return CreateTime Task creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time.
     * @param CreateTime Task creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Backup file name. 
     * @return BackupName Backup file name.
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set Backup file name.
     * @param BackupName Backup file name.
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get Shard name. 
     * @return ReplicaSetId Shard name.
     */
    public String getReplicaSetId() {
        return this.ReplicaSetId;
    }

    /**
     * Set Shard name.
     * @param ReplicaSetId Shard name.
     */
    public void setReplicaSetId(String ReplicaSetId) {
        this.ReplicaSetId = ReplicaSetId;
    }

    /**
     * Get Backup data size, in bytes. 
     * @return BackupSize Backup data size, in bytes.
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set Backup data size, in bytes.
     * @param BackupSize Backup data size, in bytes.
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get Task status.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry. 
     * @return Status Task status.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry.
     * @param Status Task status.
- 0: wait for execution.
- 1: downloading.
- 2: download completed.
- 3: download failed.
- 4: wait for retry.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task progress percentage. 
     * @return Percent Task progress percentage.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Task progress percentage.
     * @param Percent Task progress percentage.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get Duration, in seconds. 
     * @return TimeSpend Duration, in seconds.
     */
    public Long getTimeSpend() {
        return this.TimeSpend;
    }

    /**
     * Set Duration, in seconds.
     * @param TimeSpend Duration, in seconds.
     */
    public void setTimeSpend(Long TimeSpend) {
        this.TimeSpend = TimeSpend;
    }

    /**
     * Get Download link for backup data. 
     * @return Url Download link for backup data.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Download link for backup data.
     * @param Url Download link for backup data.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Backup method.
- 0: logical backup.
- 1: physical backup.
- 3: snapshot backup.
**Note**:
1. The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.
2. Physical backup is not supported when storage encryption is enabled for the instance. 
     * @return BackupMethod Backup method.
- 0: logical backup.
- 1: physical backup.
- 3: snapshot backup.
**Note**:
1. The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.
2. Physical backup is not supported when storage encryption is enabled for the instance.
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set Backup method.
- 0: logical backup.
- 1: physical backup.
- 3: snapshot backup.
**Note**:
1. The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.
2. Physical backup is not supported when storage encryption is enabled for the instance.
     * @param BackupMethod Backup method.
- 0: logical backup.
- 1: physical backup.
- 3: snapshot backup.
**Note**:
1. The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.
2. Physical backup is not supported when storage encryption is enabled for the instance.
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get Specified remarks for initiating backup tasks. 
     * @return BackupDesc Specified remarks for initiating backup tasks.
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set Specified remarks for initiating backup tasks.
     * @param BackupDesc Specified remarks for initiating backup tasks.
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    /**
     * Get Region information. 
     * @return Region Region information.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information.
     * @param Region Region information.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Bucket information. 
     * @return Bucket Bucket information.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket information.
     * @param Bucket Bucket information.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
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
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);

    }
}

