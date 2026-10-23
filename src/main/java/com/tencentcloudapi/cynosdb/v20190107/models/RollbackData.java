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

public class RollbackData extends AbstractModel {

    /**
    * Instance CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance memory
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Cluster storage limit
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Source cluster id
    */
    @SerializedName("OriginalClusterId")
    @Expose
    private String OriginalClusterId;

    /**
    * Source cluster name
    */
    @SerializedName("OriginalClusterName")
    @Expose
    private String OriginalClusterName;

    /**
    * Rollback mode
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * Snapshot time
    */
    @SerializedName("SnapshotTime")
    @Expose
    private String SnapshotTime;

    /**
    * Minimum CPU for rollback to a Serverless cluster
    */
    @SerializedName("MinCpu")
    @Expose
    private Long MinCpu;

    /**
    * Maximum CPU when rolling back to a Serverless cluster
    */
    @SerializedName("MaxCpu")
    @Expose
    private Long MaxCpu;

    /**
    * Snapshot ID
    */
    @SerializedName("SnapShotId")
    @Expose
    private Long SnapShotId;

    /**
    * Rollback database
    */
    @SerializedName("RollbackDatabases")
    @Expose
    private RollbackDatabase [] RollbackDatabases;

    /**
    * Rollback data table
    */
    @SerializedName("RollbackTables")
    @Expose
    private RollbackTable [] RollbackTables;

    /**
    * Backup file name
    */
    @SerializedName("BackupFileName")
    @Expose
    private String BackupFileName;

    /**
    * Rollback process
    */
    @SerializedName("RollbackProcess")
    @Expose
    private RollbackProcessInfo RollbackProcess;

    /**
     * Get Instance CPU 
     * @return Cpu Instance CPU
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Instance CPU
     * @param Cpu Instance CPU
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance memory 
     * @return Memory Instance memory
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory
     * @param Memory Instance memory
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Cluster storage limit 
     * @return StorageLimit Cluster storage limit
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Cluster storage limit
     * @param StorageLimit Cluster storage limit
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Source cluster id 
     * @return OriginalClusterId Source cluster id
     */
    public String getOriginalClusterId() {
        return this.OriginalClusterId;
    }

    /**
     * Set Source cluster id
     * @param OriginalClusterId Source cluster id
     */
    public void setOriginalClusterId(String OriginalClusterId) {
        this.OriginalClusterId = OriginalClusterId;
    }

    /**
     * Get Source cluster name 
     * @return OriginalClusterName Source cluster name
     */
    public String getOriginalClusterName() {
        return this.OriginalClusterName;
    }

    /**
     * Set Source cluster name
     * @param OriginalClusterName Source cluster name
     */
    public void setOriginalClusterName(String OriginalClusterName) {
        this.OriginalClusterName = OriginalClusterName;
    }

    /**
     * Get Rollback mode 
     * @return RollbackStrategy Rollback mode
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set Rollback mode
     * @param RollbackStrategy Rollback mode
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get Snapshot time 
     * @return SnapshotTime Snapshot time
     */
    public String getSnapshotTime() {
        return this.SnapshotTime;
    }

    /**
     * Set Snapshot time
     * @param SnapshotTime Snapshot time
     */
    public void setSnapshotTime(String SnapshotTime) {
        this.SnapshotTime = SnapshotTime;
    }

    /**
     * Get Minimum CPU for rollback to a Serverless cluster 
     * @return MinCpu Minimum CPU for rollback to a Serverless cluster
     */
    public Long getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set Minimum CPU for rollback to a Serverless cluster
     * @param MinCpu Minimum CPU for rollback to a Serverless cluster
     */
    public void setMinCpu(Long MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get Maximum CPU when rolling back to a Serverless cluster 
     * @return MaxCpu Maximum CPU when rolling back to a Serverless cluster
     */
    public Long getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set Maximum CPU when rolling back to a Serverless cluster
     * @param MaxCpu Maximum CPU when rolling back to a Serverless cluster
     */
    public void setMaxCpu(Long MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get Snapshot ID 
     * @return SnapShotId Snapshot ID
     */
    public Long getSnapShotId() {
        return this.SnapShotId;
    }

    /**
     * Set Snapshot ID
     * @param SnapShotId Snapshot ID
     */
    public void setSnapShotId(Long SnapShotId) {
        this.SnapShotId = SnapShotId;
    }

    /**
     * Get Rollback database 
     * @return RollbackDatabases Rollback database
     */
    public RollbackDatabase [] getRollbackDatabases() {
        return this.RollbackDatabases;
    }

    /**
     * Set Rollback database
     * @param RollbackDatabases Rollback database
     */
    public void setRollbackDatabases(RollbackDatabase [] RollbackDatabases) {
        this.RollbackDatabases = RollbackDatabases;
    }

    /**
     * Get Rollback data table 
     * @return RollbackTables Rollback data table
     */
    public RollbackTable [] getRollbackTables() {
        return this.RollbackTables;
    }

    /**
     * Set Rollback data table
     * @param RollbackTables Rollback data table
     */
    public void setRollbackTables(RollbackTable [] RollbackTables) {
        this.RollbackTables = RollbackTables;
    }

    /**
     * Get Backup file name 
     * @return BackupFileName Backup file name
     */
    public String getBackupFileName() {
        return this.BackupFileName;
    }

    /**
     * Set Backup file name
     * @param BackupFileName Backup file name
     */
    public void setBackupFileName(String BackupFileName) {
        this.BackupFileName = BackupFileName;
    }

    /**
     * Get Rollback process 
     * @return RollbackProcess Rollback process
     */
    public RollbackProcessInfo getRollbackProcess() {
        return this.RollbackProcess;
    }

    /**
     * Set Rollback process
     * @param RollbackProcess Rollback process
     */
    public void setRollbackProcess(RollbackProcessInfo RollbackProcess) {
        this.RollbackProcess = RollbackProcess;
    }

    public RollbackData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackData(RollbackData source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.OriginalClusterId != null) {
            this.OriginalClusterId = new String(source.OriginalClusterId);
        }
        if (source.OriginalClusterName != null) {
            this.OriginalClusterName = new String(source.OriginalClusterName);
        }
        if (source.RollbackStrategy != null) {
            this.RollbackStrategy = new String(source.RollbackStrategy);
        }
        if (source.SnapshotTime != null) {
            this.SnapshotTime = new String(source.SnapshotTime);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Long(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Long(source.MaxCpu);
        }
        if (source.SnapShotId != null) {
            this.SnapShotId = new Long(source.SnapShotId);
        }
        if (source.RollbackDatabases != null) {
            this.RollbackDatabases = new RollbackDatabase[source.RollbackDatabases.length];
            for (int i = 0; i < source.RollbackDatabases.length; i++) {
                this.RollbackDatabases[i] = new RollbackDatabase(source.RollbackDatabases[i]);
            }
        }
        if (source.RollbackTables != null) {
            this.RollbackTables = new RollbackTable[source.RollbackTables.length];
            for (int i = 0; i < source.RollbackTables.length; i++) {
                this.RollbackTables[i] = new RollbackTable(source.RollbackTables[i]);
            }
        }
        if (source.BackupFileName != null) {
            this.BackupFileName = new String(source.BackupFileName);
        }
        if (source.RollbackProcess != null) {
            this.RollbackProcess = new RollbackProcessInfo(source.RollbackProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "OriginalClusterId", this.OriginalClusterId);
        this.setParamSimple(map, prefix + "OriginalClusterName", this.OriginalClusterName);
        this.setParamSimple(map, prefix + "RollbackStrategy", this.RollbackStrategy);
        this.setParamSimple(map, prefix + "SnapshotTime", this.SnapshotTime);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "SnapShotId", this.SnapShotId);
        this.setParamArrayObj(map, prefix + "RollbackDatabases.", this.RollbackDatabases);
        this.setParamArrayObj(map, prefix + "RollbackTables.", this.RollbackTables);
        this.setParamSimple(map, prefix + "BackupFileName", this.BackupFileName);
        this.setParamObj(map, prefix + "RollbackProcess.", this.RollbackProcess);

    }
}

