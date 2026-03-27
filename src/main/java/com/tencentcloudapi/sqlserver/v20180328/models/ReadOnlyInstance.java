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

public class ReadOnlyInstance extends AbstractModel {

    /**
    * Read-Only Replica ID, in the format of: mssqlro-3l3fgqn7
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Read-Only Replica Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Read-Only Replica Unique UID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Read-Only Replica Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Read-Only Replica Status: 1: Creating, 2: Running, 3: Delayed Removal, 4: Isolated, 5: Recycling, 6: Recycled, 7: Task Executing, 8: Offline, 9: Instance Scaling, 10: Instance Migrating, 12: Restarting
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Read-Only Replica Creation Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Read-Only Replica Update Time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Read-Only Replica Memory Size (Unit: GB)
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Read-Only Replica Storage Space Size (Unit: GB)
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Read-Only Replica cpu Core Count
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Read-Only Replica Codenames
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Host Machine Code
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Read-Only Replica Mode, 2-Standalone
    */
    @SerializedName("Model")
    @Expose
    private Long Model;

    /**
    * Read-Only Replica Billing Mode, 1-yearly/monthly subscription, 0-pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Read-Only Replica Weight
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Read-Only Replica Latency Time (Unit: seconds)
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
    * Synchronization status between the read-only replica and the primary instance.

Init: Initializing

DeployReadOnlyInPorgress: Deploying replica in progress

DeployReadOnlySuccess: Replica deployment succeeded

DeployReadOnlyFail: Replica deployment failed

DeployMasterDBInPorgress: Adding replica database to primary node in progress

DeployMasterDBSuccess: Successfully added replica database to primary node

DeployMasterDBFail: Failed to add replica database to primary node

DeployReadOnlyDBInPorgress: Replica restoration and database joining started

DeployReadOnlyDBSuccess: Replica restoration and database joining succeeded

DeployReadOnlyDBFail: Replica restoration and database joining failed

SyncDelay: Synchronization delayed

SyncFail: Synchronization failed

SyncExcluded: Removed from read-only group

SyncNormal: Normal
    */
    @SerializedName("SynStatus")
    @Expose
    private String SynStatus;

    /**
    * Databases not synchronized between the read-only replica and the primary instance
    */
    @SerializedName("DatabaseDifference")
    @Expose
    private String DatabaseDifference;

    /**
    * Accounts not synchronized between the read-only replica and the primary instance
    */
    @SerializedName("AccountDifference")
    @Expose
    private String AccountDifference;

    /**
    * Read-Only Replica Billing Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Read-Only Replica Billing End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Read-Only Replica Isolation Time
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Read-Only Replica Region Location
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Read-Only Replica AZ Location
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
     * Get Read-Only Replica ID, in the format of: mssqlro-3l3fgqn7 
     * @return InstanceId Read-Only Replica ID, in the format of: mssqlro-3l3fgqn7
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Read-Only Replica ID, in the format of: mssqlro-3l3fgqn7
     * @param InstanceId Read-Only Replica ID, in the format of: mssqlro-3l3fgqn7
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Read-Only Replica Name 
     * @return Name Read-Only Replica Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Read-Only Replica Name
     * @param Name Read-Only Replica Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Read-Only Replica Unique UID 
     * @return Uid Read-Only Replica Unique UID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set Read-Only Replica Unique UID
     * @param Uid Read-Only Replica Unique UID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Read-Only Replica Project ID 
     * @return ProjectId Read-Only Replica Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Read-Only Replica Project ID
     * @param ProjectId Read-Only Replica Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Read-Only Replica Status: 1: Creating, 2: Running, 3: Delayed Removal, 4: Isolated, 5: Recycling, 6: Recycled, 7: Task Executing, 8: Offline, 9: Instance Scaling, 10: Instance Migrating, 12: Restarting 
     * @return Status Read-Only Replica Status: 1: Creating, 2: Running, 3: Delayed Removal, 4: Isolated, 5: Recycling, 6: Recycled, 7: Task Executing, 8: Offline, 9: Instance Scaling, 10: Instance Migrating, 12: Restarting
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Read-Only Replica Status: 1: Creating, 2: Running, 3: Delayed Removal, 4: Isolated, 5: Recycling, 6: Recycled, 7: Task Executing, 8: Offline, 9: Instance Scaling, 10: Instance Migrating, 12: Restarting
     * @param Status Read-Only Replica Status: 1: Creating, 2: Running, 3: Delayed Removal, 4: Isolated, 5: Recycling, 6: Recycled, 7: Task Executing, 8: Offline, 9: Instance Scaling, 10: Instance Migrating, 12: Restarting
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Read-Only Replica Creation Time 
     * @return CreateTime Read-Only Replica Creation Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Read-Only Replica Creation Time
     * @param CreateTime Read-Only Replica Creation Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Read-Only Replica Update Time 
     * @return UpdateTime Read-Only Replica Update Time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Read-Only Replica Update Time
     * @param UpdateTime Read-Only Replica Update Time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Read-Only Replica Memory Size (Unit: GB) 
     * @return Memory Read-Only Replica Memory Size (Unit: GB)
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Read-Only Replica Memory Size (Unit: GB)
     * @param Memory Read-Only Replica Memory Size (Unit: GB)
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Read-Only Replica Storage Space Size (Unit: GB) 
     * @return Storage Read-Only Replica Storage Space Size (Unit: GB)
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Read-Only Replica Storage Space Size (Unit: GB)
     * @param Storage Read-Only Replica Storage Space Size (Unit: GB)
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Read-Only Replica cpu Core Count 
     * @return Cpu Read-Only Replica cpu Core Count
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Read-Only Replica cpu Core Count
     * @param Cpu Read-Only Replica cpu Core Count
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Read-Only Replica Codenames 
     * @return Version Read-Only Replica Codenames
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Read-Only Replica Codenames
     * @param Version Read-Only Replica Codenames
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Host Machine Code 
     * @return Type Host Machine Code
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Host Machine Code
     * @param Type Host Machine Code
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Read-Only Replica Mode, 2-Standalone 
     * @return Model Read-Only Replica Mode, 2-Standalone
     */
    public Long getModel() {
        return this.Model;
    }

    /**
     * Set Read-Only Replica Mode, 2-Standalone
     * @param Model Read-Only Replica Mode, 2-Standalone
     */
    public void setModel(Long Model) {
        this.Model = Model;
    }

    /**
     * Get Read-Only Replica Billing Mode, 1-yearly/monthly subscription, 0-pay-as-you-go 
     * @return PayMode Read-Only Replica Billing Mode, 1-yearly/monthly subscription, 0-pay-as-you-go
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Read-Only Replica Billing Mode, 1-yearly/monthly subscription, 0-pay-as-you-go
     * @param PayMode Read-Only Replica Billing Mode, 1-yearly/monthly subscription, 0-pay-as-you-go
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Read-Only Replica Weight 
     * @return Weight Read-Only Replica Weight
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Read-Only Replica Weight
     * @param Weight Read-Only Replica Weight
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Read-Only Replica Latency Time (Unit: seconds) 
     * @return DelayTime Read-Only Replica Latency Time (Unit: seconds)
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Read-Only Replica Latency Time (Unit: seconds)
     * @param DelayTime Read-Only Replica Latency Time (Unit: seconds)
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Synchronization status between the read-only replica and the primary instance.

Init: Initializing

DeployReadOnlyInPorgress: Deploying replica in progress

DeployReadOnlySuccess: Replica deployment succeeded

DeployReadOnlyFail: Replica deployment failed

DeployMasterDBInPorgress: Adding replica database to primary node in progress

DeployMasterDBSuccess: Successfully added replica database to primary node

DeployMasterDBFail: Failed to add replica database to primary node

DeployReadOnlyDBInPorgress: Replica restoration and database joining started

DeployReadOnlyDBSuccess: Replica restoration and database joining succeeded

DeployReadOnlyDBFail: Replica restoration and database joining failed

SyncDelay: Synchronization delayed

SyncFail: Synchronization failed

SyncExcluded: Removed from read-only group

SyncNormal: Normal 
     * @return SynStatus Synchronization status between the read-only replica and the primary instance.

Init: Initializing

DeployReadOnlyInPorgress: Deploying replica in progress

DeployReadOnlySuccess: Replica deployment succeeded

DeployReadOnlyFail: Replica deployment failed

DeployMasterDBInPorgress: Adding replica database to primary node in progress

DeployMasterDBSuccess: Successfully added replica database to primary node

DeployMasterDBFail: Failed to add replica database to primary node

DeployReadOnlyDBInPorgress: Replica restoration and database joining started

DeployReadOnlyDBSuccess: Replica restoration and database joining succeeded

DeployReadOnlyDBFail: Replica restoration and database joining failed

SyncDelay: Synchronization delayed

SyncFail: Synchronization failed

SyncExcluded: Removed from read-only group

SyncNormal: Normal
     */
    public String getSynStatus() {
        return this.SynStatus;
    }

    /**
     * Set Synchronization status between the read-only replica and the primary instance.

Init: Initializing

DeployReadOnlyInPorgress: Deploying replica in progress

DeployReadOnlySuccess: Replica deployment succeeded

DeployReadOnlyFail: Replica deployment failed

DeployMasterDBInPorgress: Adding replica database to primary node in progress

DeployMasterDBSuccess: Successfully added replica database to primary node

DeployMasterDBFail: Failed to add replica database to primary node

DeployReadOnlyDBInPorgress: Replica restoration and database joining started

DeployReadOnlyDBSuccess: Replica restoration and database joining succeeded

DeployReadOnlyDBFail: Replica restoration and database joining failed

SyncDelay: Synchronization delayed

SyncFail: Synchronization failed

SyncExcluded: Removed from read-only group

SyncNormal: Normal
     * @param SynStatus Synchronization status between the read-only replica and the primary instance.

Init: Initializing

DeployReadOnlyInPorgress: Deploying replica in progress

DeployReadOnlySuccess: Replica deployment succeeded

DeployReadOnlyFail: Replica deployment failed

DeployMasterDBInPorgress: Adding replica database to primary node in progress

DeployMasterDBSuccess: Successfully added replica database to primary node

DeployMasterDBFail: Failed to add replica database to primary node

DeployReadOnlyDBInPorgress: Replica restoration and database joining started

DeployReadOnlyDBSuccess: Replica restoration and database joining succeeded

DeployReadOnlyDBFail: Replica restoration and database joining failed

SyncDelay: Synchronization delayed

SyncFail: Synchronization failed

SyncExcluded: Removed from read-only group

SyncNormal: Normal
     */
    public void setSynStatus(String SynStatus) {
        this.SynStatus = SynStatus;
    }

    /**
     * Get Databases not synchronized between the read-only replica and the primary instance 
     * @return DatabaseDifference Databases not synchronized between the read-only replica and the primary instance
     */
    public String getDatabaseDifference() {
        return this.DatabaseDifference;
    }

    /**
     * Set Databases not synchronized between the read-only replica and the primary instance
     * @param DatabaseDifference Databases not synchronized between the read-only replica and the primary instance
     */
    public void setDatabaseDifference(String DatabaseDifference) {
        this.DatabaseDifference = DatabaseDifference;
    }

    /**
     * Get Accounts not synchronized between the read-only replica and the primary instance 
     * @return AccountDifference Accounts not synchronized between the read-only replica and the primary instance
     */
    public String getAccountDifference() {
        return this.AccountDifference;
    }

    /**
     * Set Accounts not synchronized between the read-only replica and the primary instance
     * @param AccountDifference Accounts not synchronized between the read-only replica and the primary instance
     */
    public void setAccountDifference(String AccountDifference) {
        this.AccountDifference = AccountDifference;
    }

    /**
     * Get Read-Only Replica Billing Start Time 
     * @return StartTime Read-Only Replica Billing Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Read-Only Replica Billing Start Time
     * @param StartTime Read-Only Replica Billing Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Read-Only Replica Billing End Time 
     * @return EndTime Read-Only Replica Billing End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Read-Only Replica Billing End Time
     * @param EndTime Read-Only Replica Billing End Time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Read-Only Replica Isolation Time 
     * @return IsolateTime Read-Only Replica Isolation Time
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Read-Only Replica Isolation Time
     * @param IsolateTime Read-Only Replica Isolation Time
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Read-Only Replica Region Location 
     * @return RegionId Read-Only Replica Region Location
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Read-Only Replica Region Location
     * @param RegionId Read-Only Replica Region Location
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Read-Only Replica AZ Location 
     * @return ZoneId Read-Only Replica AZ Location
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Read-Only Replica AZ Location
     * @param ZoneId Read-Only Replica AZ Location
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    public ReadOnlyInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadOnlyInstance(ReadOnlyInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Model != null) {
            this.Model = new Long(source.Model);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new String(source.DelayTime);
        }
        if (source.SynStatus != null) {
            this.SynStatus = new String(source.SynStatus);
        }
        if (source.DatabaseDifference != null) {
            this.DatabaseDifference = new String(source.DatabaseDifference);
        }
        if (source.AccountDifference != null) {
            this.AccountDifference = new String(source.AccountDifference);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "SynStatus", this.SynStatus);
        this.setParamSimple(map, prefix + "DatabaseDifference", this.DatabaseDifference);
        this.setParamSimple(map, prefix + "AccountDifference", this.AccountDifference);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

