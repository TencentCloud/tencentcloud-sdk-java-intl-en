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

public class BackupInfo extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Backup method.</p><ul><li>0: Automatic backup.</li><li>1: Manual backup.</li></ul>
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * <p>Backup file name.</p>
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * <p>Backup task notes.</p>
    */
    @SerializedName("BackupDesc")
    @Expose
    private String BackupDesc;

    /**
    * <p>Backup file size, in KB.</p>
    */
    @SerializedName("BackupSize")
    @Expose
    private Long BackupSize;

    /**
    * <p>Backup start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Backup end time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Backup status.</p><ul><li>1: Backup in progress.</li><li>2: Backup successful.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Backup method.</p><ul><li>0: Logical backup.</li><li>1: Physical backup.</li><li>3: Snapshot backup.<br><strong>Description:</strong></li><li>The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.</li><li>If storage encryption is activated for the instance, physical backup is not supported.</li></ul>
    */
    @SerializedName("BackupMethod")
    @Expose
    private Long BackupMethod;

    /**
    * <p>Backup record ID.</p>
    */
    @SerializedName("BackId")
    @Expose
    private Long BackId;

    /**
    * <p>Backup deletion time.</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * <p>Backup region in a different location.</p>
    */
    @SerializedName("BackupRegion")
    @Expose
    private String BackupRegion;

    /**
    * <p>Rollback time supported by the backup.</p>
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Backup method.</p><ul><li>0: Automatic backup.</li><li>1: Manual backup.</li></ul> 
     * @return BackupType <p>Backup method.</p><ul><li>0: Automatic backup.</li><li>1: Manual backup.</li></ul>
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>Backup method.</p><ul><li>0: Automatic backup.</li><li>1: Manual backup.</li></ul>
     * @param BackupType <p>Backup method.</p><ul><li>0: Automatic backup.</li><li>1: Manual backup.</li></ul>
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>Backup file name.</p> 
     * @return BackupName <p>Backup file name.</p>
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set <p>Backup file name.</p>
     * @param BackupName <p>Backup file name.</p>
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Get <p>Backup task notes.</p> 
     * @return BackupDesc <p>Backup task notes.</p>
     */
    public String getBackupDesc() {
        return this.BackupDesc;
    }

    /**
     * Set <p>Backup task notes.</p>
     * @param BackupDesc <p>Backup task notes.</p>
     */
    public void setBackupDesc(String BackupDesc) {
        this.BackupDesc = BackupDesc;
    }

    /**
     * Get <p>Backup file size, in KB.</p> 
     * @return BackupSize <p>Backup file size, in KB.</p>
     */
    public Long getBackupSize() {
        return this.BackupSize;
    }

    /**
     * Set <p>Backup file size, in KB.</p>
     * @param BackupSize <p>Backup file size, in KB.</p>
     */
    public void setBackupSize(Long BackupSize) {
        this.BackupSize = BackupSize;
    }

    /**
     * Get <p>Backup start time.</p> 
     * @return StartTime <p>Backup start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Backup start time.</p>
     * @param StartTime <p>Backup start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Backup end time.</p> 
     * @return EndTime <p>Backup end time.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Backup end time.</p>
     * @param EndTime <p>Backup end time.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Backup status.</p><ul><li>1: Backup in progress.</li><li>2: Backup successful.</li></ul> 
     * @return Status <p>Backup status.</p><ul><li>1: Backup in progress.</li><li>2: Backup successful.</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Backup status.</p><ul><li>1: Backup in progress.</li><li>2: Backup successful.</li></ul>
     * @param Status <p>Backup status.</p><ul><li>1: Backup in progress.</li><li>2: Backup successful.</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Backup method.</p><ul><li>0: Logical backup.</li><li>1: Physical backup.</li><li>3: Snapshot backup.<br><strong>Description:</strong></li><li>The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.</li><li>If storage encryption is activated for the instance, physical backup is not supported.</li></ul> 
     * @return BackupMethod <p>Backup method.</p><ul><li>0: Logical backup.</li><li>1: Physical backup.</li><li>3: Snapshot backup.<br><strong>Description:</strong></li><li>The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.</li><li>If storage encryption is activated for the instance, physical backup is not supported.</li></ul>
     */
    public Long getBackupMethod() {
        return this.BackupMethod;
    }

    /**
     * Set <p>Backup method.</p><ul><li>0: Logical backup.</li><li>1: Physical backup.</li><li>3: Snapshot backup.<br><strong>Description:</strong></li><li>The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.</li><li>If storage encryption is activated for the instance, physical backup is not supported.</li></ul>
     * @param BackupMethod <p>Backup method.</p><ul><li>0: Logical backup.</li><li>1: Physical backup.</li><li>3: Snapshot backup.<br><strong>Description:</strong></li><li>The General Edition instance supports logical and physical backup. The Cloud Disk Edition instance supports physical and snapshot backup, but does not support logical backup currently.</li><li>If storage encryption is activated for the instance, physical backup is not supported.</li></ul>
     */
    public void setBackupMethod(Long BackupMethod) {
        this.BackupMethod = BackupMethod;
    }

    /**
     * Get <p>Backup record ID.</p> 
     * @return BackId <p>Backup record ID.</p>
     */
    public Long getBackId() {
        return this.BackId;
    }

    /**
     * Set <p>Backup record ID.</p>
     * @param BackId <p>Backup record ID.</p>
     */
    public void setBackId(Long BackId) {
        this.BackId = BackId;
    }

    /**
     * Get <p>Backup deletion time.</p> 
     * @return DeleteTime <p>Backup deletion time.</p>
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>Backup deletion time.</p>
     * @param DeleteTime <p>Backup deletion time.</p>
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <p>Backup region in a different location.</p> 
     * @return BackupRegion <p>Backup region in a different location.</p>
     */
    public String getBackupRegion() {
        return this.BackupRegion;
    }

    /**
     * Set <p>Backup region in a different location.</p>
     * @param BackupRegion <p>Backup region in a different location.</p>
     */
    public void setBackupRegion(String BackupRegion) {
        this.BackupRegion = BackupRegion;
    }

    /**
     * Get <p>Rollback time supported by the backup.</p> 
     * @return RestoreTime <p>Rollback time supported by the backup.</p>
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set <p>Rollback time supported by the backup.</p>
     * @param RestoreTime <p>Rollback time supported by the backup.</p>
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    public BackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupInfo(BackupInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupDesc != null) {
            this.BackupDesc = new String(source.BackupDesc);
        }
        if (source.BackupSize != null) {
            this.BackupSize = new Long(source.BackupSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BackupMethod != null) {
            this.BackupMethod = new Long(source.BackupMethod);
        }
        if (source.BackId != null) {
            this.BackId = new Long(source.BackId);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.BackupRegion != null) {
            this.BackupRegion = new String(source.BackupRegion);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "BackupDesc", this.BackupDesc);
        this.setParamSimple(map, prefix + "BackupSize", this.BackupSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BackupMethod", this.BackupMethod);
        this.setParamSimple(map, prefix + "BackId", this.BackId);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "BackupRegion", this.BackupRegion);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);

    }
}

