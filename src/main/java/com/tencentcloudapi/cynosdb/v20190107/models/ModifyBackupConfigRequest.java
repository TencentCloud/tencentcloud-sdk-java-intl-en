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
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
    */
    @SerializedName("BackupTimeBeg")
    @Expose
    private Long BackupTimeBeg;

    /**
    * <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
    */
    @SerializedName("BackupTimeEnd")
    @Expose
    private Long BackupTimeEnd;

    /**
    * <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. Seven days is represented as 3600<em>24</em>7=604800. The maximum value is 158112000.</p>
    */
    @SerializedName("ReserveDuration")
    @Expose
    private Long ReserveDuration;

    /**
    * <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to Monday to Sunday backup method, full-full backup, increment-incremental backup.</p>
    */
    @SerializedName("BackupFreq")
    @Expose
    private String [] BackupFreq;

    /**
    * <p>This parameter currently does not support modification. No need to specify.</p>
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * <p>Logical backup configuration</p>
    */
    @SerializedName("LogicBackupConfig")
    @Expose
    private LogicBackupConfigInfo LogicBackupConfig;

    /**
    * <p>Whether to delete automatic logical backup</p>
    */
    @SerializedName("DeleteAutoLogicBackup")
    @Expose
    private Boolean DeleteAutoLogicBackup;

    /**
    * <p>Second-level snapshot backup parameter</p>
    */
    @SerializedName("SnapshotSecondaryBackupConfig")
    @Expose
    private SnapshotBackupConfig SnapshotSecondaryBackupConfig;

    /**
    * <p>Sparse backup configuration</p>
    */
    @SerializedName("SparseBackupConfig")
    @Expose
    private SparseBackupConfig SparseBackupConfig;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p> 
     * @return BackupTimeBeg <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     */
    public Long getBackupTimeBeg() {
        return this.BackupTimeBeg;
    }

    /**
     * Set <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     * @param BackupTimeBeg <p>Indicates the full backup start time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     */
    public void setBackupTimeBeg(Long BackupTimeBeg) {
        this.BackupTimeBeg = BackupTimeBeg;
    }

    /**
     * Get <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p> 
     * @return BackupTimeEnd <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     */
    public Long getBackupTimeEnd() {
        return this.BackupTimeEnd;
    }

    /**
     * Set <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     * @param BackupTimeEnd <p>Indicates the full backup end time, [0-24*3600]. For example, 0:00, 1:00, and 2:00 are 0, 3600, and 7200 respectively.</p>
     */
    public void setBackupTimeEnd(Long BackupTimeEnd) {
        this.BackupTimeEnd = BackupTimeEnd;
    }

    /**
     * Get <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. Seven days is represented as 3600<em>24</em>7=604800. The maximum value is 158112000.</p> 
     * @return ReserveDuration <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. Seven days is represented as 3600<em>24</em>7=604800. The maximum value is 158112000.</p>
     */
    public Long getReserveDuration() {
        return this.ReserveDuration;
    }

    /**
     * Set <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. Seven days is represented as 3600<em>24</em>7=604800. The maximum value is 158112000.</p>
     * @param ReserveDuration <p>Indicates the backup retention period in seconds. Backups will be cleaned up longer than this time. Seven days is represented as 3600<em>24</em>7=604800. The maximum value is 158112000.</p>
     */
    public void setReserveDuration(Long ReserveDuration) {
        this.ReserveDuration = ReserveDuration;
    }

    /**
     * Get <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to Monday to Sunday backup method, full-full backup, increment-incremental backup.</p> 
     * @return BackupFreq <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to Monday to Sunday backup method, full-full backup, increment-incremental backup.</p>
     */
    public String [] getBackupFreq() {
        return this.BackupFreq;
    }

    /**
     * Set <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to Monday to Sunday backup method, full-full backup, increment-incremental backup.</p>
     * @param BackupFreq <p>This parameter currently does not support modification and is not required. Backup frequency is an array of length 7, corresponding to Monday to Sunday backup method, full-full backup, increment-incremental backup.</p>
     */
    public void setBackupFreq(String [] BackupFreq) {
        this.BackupFreq = BackupFreq;
    }

    /**
     * Get <p>This parameter currently does not support modification. No need to specify.</p> 
     * @return BackupType <p>This parameter currently does not support modification. No need to specify.</p>
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set <p>This parameter currently does not support modification. No need to specify.</p>
     * @param BackupType <p>This parameter currently does not support modification. No need to specify.</p>
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get <p>Logical backup configuration</p> 
     * @return LogicBackupConfig <p>Logical backup configuration</p>
     */
    public LogicBackupConfigInfo getLogicBackupConfig() {
        return this.LogicBackupConfig;
    }

    /**
     * Set <p>Logical backup configuration</p>
     * @param LogicBackupConfig <p>Logical backup configuration</p>
     */
    public void setLogicBackupConfig(LogicBackupConfigInfo LogicBackupConfig) {
        this.LogicBackupConfig = LogicBackupConfig;
    }

    /**
     * Get <p>Whether to delete automatic logical backup</p> 
     * @return DeleteAutoLogicBackup <p>Whether to delete automatic logical backup</p>
     */
    public Boolean getDeleteAutoLogicBackup() {
        return this.DeleteAutoLogicBackup;
    }

    /**
     * Set <p>Whether to delete automatic logical backup</p>
     * @param DeleteAutoLogicBackup <p>Whether to delete automatic logical backup</p>
     */
    public void setDeleteAutoLogicBackup(Boolean DeleteAutoLogicBackup) {
        this.DeleteAutoLogicBackup = DeleteAutoLogicBackup;
    }

    /**
     * Get <p>Second-level snapshot backup parameter</p> 
     * @return SnapshotSecondaryBackupConfig <p>Second-level snapshot backup parameter</p>
     */
    public SnapshotBackupConfig getSnapshotSecondaryBackupConfig() {
        return this.SnapshotSecondaryBackupConfig;
    }

    /**
     * Set <p>Second-level snapshot backup parameter</p>
     * @param SnapshotSecondaryBackupConfig <p>Second-level snapshot backup parameter</p>
     */
    public void setSnapshotSecondaryBackupConfig(SnapshotBackupConfig SnapshotSecondaryBackupConfig) {
        this.SnapshotSecondaryBackupConfig = SnapshotSecondaryBackupConfig;
    }

    /**
     * Get <p>Sparse backup configuration</p> 
     * @return SparseBackupConfig <p>Sparse backup configuration</p>
     */
    public SparseBackupConfig getSparseBackupConfig() {
        return this.SparseBackupConfig;
    }

    /**
     * Set <p>Sparse backup configuration</p>
     * @param SparseBackupConfig <p>Sparse backup configuration</p>
     */
    public void setSparseBackupConfig(SparseBackupConfig SparseBackupConfig) {
        this.SparseBackupConfig = SparseBackupConfig;
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
        if (source.SnapshotSecondaryBackupConfig != null) {
            this.SnapshotSecondaryBackupConfig = new SnapshotBackupConfig(source.SnapshotSecondaryBackupConfig);
        }
        if (source.SparseBackupConfig != null) {
            this.SparseBackupConfig = new SparseBackupConfig(source.SparseBackupConfig);
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
        this.setParamObj(map, prefix + "SnapshotSecondaryBackupConfig.", this.SnapshotSecondaryBackupConfig);
        this.setParamObj(map, prefix + "SparseBackupConfig.", this.SparseBackupConfig);

    }
}

