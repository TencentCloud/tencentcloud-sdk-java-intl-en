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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackUpJobDisplay extends AbstractModel {

    /**
    * Backup instance ID
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * Backup instance name
    */
    @SerializedName("Snapshot")
    @Expose
    private String Snapshot;

    /**
    * Backup data volume
    */
    @SerializedName("BackUpSize")
    @Expose
    private Long BackUpSize;

    /**
    * Backup single replica data volume
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackUpSingleSize")
    @Expose
    private Long BackUpSingleSize;

    /**
    * Instance creation time
    */
    @SerializedName("BackUpTime")
    @Expose
    private String BackUpTime;

    /**
    * Instance expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Instance status
    */
    @SerializedName("JobStatus")
    @Expose
    private String JobStatus;

    /**
    * 0: default; 1: one-time backup for the remote Doris
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 0: default; 1: immediate backup; 2: migration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupTimeType")
    @Expose
    private Long BackupTimeType;

    /**
    * Connection information of the remote Doris
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DorisSourceInfo")
    @Expose
    private DorisSourceInfo DorisSourceInfo;

    /**
    * The value corresponding to the instance status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobStatusNum")
    @Expose
    private Long JobStatusNum;

    /**
    * Information about cos in the backup instance	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupCosInfo")
    @Expose
    private BackupCosInfo BackupCosInfo;

    /**
     * Get Backup instance ID 
     * @return JobId Backup instance ID
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set Backup instance ID
     * @param JobId Backup instance ID
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Backup instance name 
     * @return Snapshot Backup instance name
     */
    public String getSnapshot() {
        return this.Snapshot;
    }

    /**
     * Set Backup instance name
     * @param Snapshot Backup instance name
     */
    public void setSnapshot(String Snapshot) {
        this.Snapshot = Snapshot;
    }

    /**
     * Get Backup data volume 
     * @return BackUpSize Backup data volume
     */
    public Long getBackUpSize() {
        return this.BackUpSize;
    }

    /**
     * Set Backup data volume
     * @param BackUpSize Backup data volume
     */
    public void setBackUpSize(Long BackUpSize) {
        this.BackUpSize = BackUpSize;
    }

    /**
     * Get Backup single replica data volume
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackUpSingleSize Backup single replica data volume
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackUpSingleSize() {
        return this.BackUpSingleSize;
    }

    /**
     * Set Backup single replica data volume
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackUpSingleSize Backup single replica data volume
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackUpSingleSize(Long BackUpSingleSize) {
        this.BackUpSingleSize = BackUpSingleSize;
    }

    /**
     * Get Instance creation time 
     * @return BackUpTime Instance creation time
     */
    public String getBackUpTime() {
        return this.BackUpTime;
    }

    /**
     * Set Instance creation time
     * @param BackUpTime Instance creation time
     */
    public void setBackUpTime(String BackUpTime) {
        this.BackUpTime = BackUpTime;
    }

    /**
     * Get Instance expiration time 
     * @return ExpireTime Instance expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Instance expiration time
     * @param ExpireTime Instance expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Instance status 
     * @return JobStatus Instance status
     */
    public String getJobStatus() {
        return this.JobStatus;
    }

    /**
     * Set Instance status
     * @param JobStatus Instance status
     */
    public void setJobStatus(String JobStatus) {
        this.JobStatus = JobStatus;
    }

    /**
     * Get 0: default; 1: one-time backup for the remote Doris
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupType 0: default; 1: one-time backup for the remote Doris
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 0: default; 1: one-time backup for the remote Doris
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupType 0: default; 1: one-time backup for the remote Doris
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 0: default; 1: immediate backup; 2: migration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupTimeType 0: default; 1: immediate backup; 2: migration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBackupTimeType() {
        return this.BackupTimeType;
    }

    /**
     * Set 0: default; 1: immediate backup; 2: migration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupTimeType 0: default; 1: immediate backup; 2: migration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupTimeType(Long BackupTimeType) {
        this.BackupTimeType = BackupTimeType;
    }

    /**
     * Get Connection information of the remote Doris
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DorisSourceInfo Connection information of the remote Doris
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DorisSourceInfo getDorisSourceInfo() {
        return this.DorisSourceInfo;
    }

    /**
     * Set Connection information of the remote Doris
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DorisSourceInfo Connection information of the remote Doris
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDorisSourceInfo(DorisSourceInfo DorisSourceInfo) {
        this.DorisSourceInfo = DorisSourceInfo;
    }

    /**
     * Get The value corresponding to the instance status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobStatusNum The value corresponding to the instance status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJobStatusNum() {
        return this.JobStatusNum;
    }

    /**
     * Set The value corresponding to the instance status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobStatusNum The value corresponding to the instance status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobStatusNum(Long JobStatusNum) {
        this.JobStatusNum = JobStatusNum;
    }

    /**
     * Get Information about cos in the backup instance	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupCosInfo Information about cos in the backup instance	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BackupCosInfo getBackupCosInfo() {
        return this.BackupCosInfo;
    }

    /**
     * Set Information about cos in the backup instance	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupCosInfo Information about cos in the backup instance	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupCosInfo(BackupCosInfo BackupCosInfo) {
        this.BackupCosInfo = BackupCosInfo;
    }

    public BackUpJobDisplay() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackUpJobDisplay(BackUpJobDisplay source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.Snapshot != null) {
            this.Snapshot = new String(source.Snapshot);
        }
        if (source.BackUpSize != null) {
            this.BackUpSize = new Long(source.BackUpSize);
        }
        if (source.BackUpSingleSize != null) {
            this.BackUpSingleSize = new Long(source.BackUpSingleSize);
        }
        if (source.BackUpTime != null) {
            this.BackUpTime = new String(source.BackUpTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.JobStatus != null) {
            this.JobStatus = new String(source.JobStatus);
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.BackupTimeType != null) {
            this.BackupTimeType = new Long(source.BackupTimeType);
        }
        if (source.DorisSourceInfo != null) {
            this.DorisSourceInfo = new DorisSourceInfo(source.DorisSourceInfo);
        }
        if (source.JobStatusNum != null) {
            this.JobStatusNum = new Long(source.JobStatusNum);
        }
        if (source.BackupCosInfo != null) {
            this.BackupCosInfo = new BackupCosInfo(source.BackupCosInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Snapshot", this.Snapshot);
        this.setParamSimple(map, prefix + "BackUpSize", this.BackUpSize);
        this.setParamSimple(map, prefix + "BackUpSingleSize", this.BackUpSingleSize);
        this.setParamSimple(map, prefix + "BackUpTime", this.BackUpTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "JobStatus", this.JobStatus);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupTimeType", this.BackupTimeType);
        this.setParamObj(map, prefix + "DorisSourceInfo.", this.DorisSourceInfo);
        this.setParamSimple(map, prefix + "JobStatusNum", this.JobStatusNum);
        this.setParamObj(map, prefix + "BackupCosInfo.", this.BackupCosInfo);

    }
}

