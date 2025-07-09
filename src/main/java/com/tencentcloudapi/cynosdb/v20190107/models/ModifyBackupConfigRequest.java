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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupConfigRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Full backup start time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively
    */
    @SerializedName("BackupTimeBeg")
    @Expose
    private Long BackupTimeBeg;

    /**
    * Full backup end time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively.
    */
    @SerializedName("BackupTimeEnd")
    @Expose
    private Long BackupTimeEnd;

    /**
    * Backup retention period in seconds. Backups will be cleared after this period elapses. 7 days is represented by 3600*24*7 = 604800. Maximum value: 158112000.
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * Backup frequency. It is an array of 7 elements corresponding to Monday through Sunday. full: full backup; increment: incremental backup. This parameter cannot be modified currently and doesn't need to be entered.
    */
    @SerializedName("BackupFreq")
    @Expose
    private String [] BackupFreq;

    /**
    * Currently, this parameter does not support modification and is not required.
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 
    */
    @SerializedName("LogicBackupConfig")
    @Expose
    private LogicBackupConfigInfo LogicBackupConfig;

    /**
    * 
    */
    @SerializedName("DeleteAutoLogicBackup")
    @Expose
    private Boolean DeleteAutoLogicBackup;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Full backup start time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively 
     * @return BackupTimeBeg Full backup start time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively
     */
    public Long getBackupTimeBeg() {
        return this.BackupTimeBeg;
    }

    /**
     * Set Full backup start time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively
     * @param BackupTimeBeg Full backup start time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively
     */
    public void setBackupTimeBeg(Long BackupTimeBeg) {
        this.BackupTimeBeg = BackupTimeBeg;
    }

    /**
     * Get Full backup end time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively. 
     * @return BackupTimeEnd Full backup end time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively.
     */
    public Long getBackupTimeEnd() {
        return this.BackupTimeEnd;
    }

    /**
     * Set Full backup end time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively.
     * @param BackupTimeEnd Full backup end time. Value range: [0-24*3600]. For example, 0:00 AM, 1:00 AM, and 2:00 AM are represented by 0, 3600, and 7200, respectively.
     */
    public void setBackupTimeEnd(Long BackupTimeEnd) {
        this.BackupTimeEnd = BackupTimeEnd;
    }

    /**
     * Get Backup retention period in seconds. Backups will be cleared after this period elapses. 7 days is represented by 3600*24*7 = 604800. Maximum value: 158112000. 
     * @return ReserveDuration Backup retention period in seconds. Backups will be cleared after this period elapses. 7 days is represented by 3600*24*7 = 604800. Maximum value: 158112000.
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set Backup retention period in seconds. Backups will be cleared after this period elapses. 7 days is represented by 3600*24*7 = 604800. Maximum value: 158112000.
     * @param ReserveDuration Backup retention period in seconds. Backups will be cleared after this period elapses. 7 days is represented by 3600*24*7 = 604800. Maximum value: 158112000.
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get Backup frequency. It is an array of 7 elements corresponding to Monday through Sunday. full: full backup; increment: incremental backup. This parameter cannot be modified currently and doesn't need to be entered. 
     * @return BackupFreq Backup frequency. It is an array of 7 elements corresponding to Monday through Sunday. full: full backup; increment: incremental backup. This parameter cannot be modified currently and doesn't need to be entered.
     */
    public String [] getBackupFreq() {
        return this.BackupFreq;
    }

    /**
     * Set Backup frequency. It is an array of 7 elements corresponding to Monday through Sunday. full: full backup; increment: incremental backup. This parameter cannot be modified currently and doesn't need to be entered.
     * @param BackupFreq Backup frequency. It is an array of 7 elements corresponding to Monday through Sunday. full: full backup; increment: incremental backup. This parameter cannot be modified currently and doesn't need to be entered.
     */
    public void setBackupFreq(String [] BackupFreq) {
        this.BackupFreq = BackupFreq;
    }

    /**
     * Get Currently, this parameter does not support modification and is not required. 
     * @return BackupType Currently, this parameter does not support modification and is not required.
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set Currently, this parameter does not support modification and is not required.
     * @param BackupType Currently, this parameter does not support modification and is not required.
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get  
     * @return LogicBackupConfig 
     */
    public LogicBackupConfigInfo getLogicBackupConfig() {
        return this.LogicBackupConfig;
    }

    /**
     * Set 
     * @param LogicBackupConfig 
     */
    public void setLogicBackupConfig(LogicBackupConfigInfo LogicBackupConfig) {
        this.LogicBackupConfig = LogicBackupConfig;
    }

    /**
     * Get  
     * @return DeleteAutoLogicBackup 
     */
    public Boolean getDeleteAutoLogicBackup() {
        return this.DeleteAutoLogicBackup;
    }

    /**
     * Set 
     * @param DeleteAutoLogicBackup 
     */
    public void setDeleteAutoLogicBackup(Boolean DeleteAutoLogicBackup) {
        this.DeleteAutoLogicBackup = DeleteAutoLogicBackup;
    }

    public ModifyBackupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupConfigRequest(ModifyBackupConfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.BackupTimeBeg != null) {
            this.BackupTimeBeg = new Long(source.BackupTimeBeg);
        }
        if (source.BackupTimeEnd != null) {
            this.BackupTimeEnd = new Long(source.BackupTimeEnd);
        }
        if (source.ReserveDuration != null) {
            this.ReserveDuration = new Long(source.ReserveDuration);
        }
        if (source.BackupFreq != null) {
            this.BackupFreq = new String[source.BackupFreq.length];
            for (int i = 0; i < source.BackupFreq.length; i++) {
                this.BackupFreq[i] = new String(source.BackupFreq[i]);
            }
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
        if (source.LogicBackupConfig != null) {
            this.LogicBackupConfig = new LogicBackupConfigInfo(source.LogicBackupConfig);
        }
        if (source.DeleteAutoLogicBackup != null) {
            this.DeleteAutoLogicBackup = new Boolean(source.DeleteAutoLogicBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "BackupTimeBeg", this.BackupTimeBeg);
        this.setParamSimple(map, prefix + "BackupTimeEnd", this.BackupTimeEnd);
        this.setParamSimple(map, prefix + "ReserveDuration", this.ReserveDuration);
        this.setParamArraySimple(map, prefix + "BackupFreq.", this.BackupFreq);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamObj(map, prefix + "LogicBackupConfig.", this.LogicBackupConfig);
        this.setParamSimple(map, prefix + "DeleteAutoLogicBackup", this.DeleteAutoLogicBackup);

    }
}

