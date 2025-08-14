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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfoDetail extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task type.

- FLOW_CREATE: "001", indicating instance creation.
- FLOW_RESIZE: "002", indicating configuration modification.
- FLOW_CLOSE: "003", indicating instance disabling.
- FLOW_CLEAN: "004", indicating instance cleanup.
- FLOW_STARTUP: "005", indicating instance enabling.
- FLOW_DELETE: "006", indicating instance deletion.
- FLOW_SETPWD: "007", indicating password reset.
- FLOW_EXPORTBACKUP: "009", indicating backup file export.
- FLOW_RESTOREBACKUP: "010", indicating backup restoration.
- FLOW_BACKUPINSTANCE: "012", indicating instance backup.
- FLOW_MIGRATEINSTANCE: "013", indicating instance migration.
- FLOW_DELBACKUP: "014", indicating backup deletion.
- FLOW_EXCHANGEINSTANCE: "016", indicating instance switch.
- FLOW_AUTOBACKUP: "017", indicating automatic instance backup.
- FLOW_MIGRATECHECK: "022", indicating migration parameter verification.
- FLOW_MIGRATETASK: "023", indicating that data migration is in progress.
- FLOW_CLEANDB: "025", indicating database cleanup.
- FLOW_CLONEBACKUP: "026": indicating backup cloning.
- FLOW_CHANGEVIP: "027", indicating VIP address modification.
- FLOW_EXPORSHR: "028", indicating scaling.
- FLOW_ADDNODES: "029", indicating node addition (removal).
- FLOW_CHANGENET: "031", indicating network type modification.
- FLOW_MODIFYINSTACEREADONLY: "033": indicating read-only policy modification.
- FLOW_MODIFYINSTANCEPARAMS: "034", indicating instance parameter modification.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035", indicating password-free access settings.
- FLOW_SWITCHINSTANCEVIP: "036", indicating instance VIP address switch.
- FLOW_MODIFYINSTANCEACCOUNT: "037", indicating instance account modification.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038", indicating instance bandwidth modification.
- FLOW_ENABLEINSTANCE_REPLICATE: "039", indicating enabling of read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040", indicating disabling of read-only replica.
- FLOW_UpgradeArch: "041", indicating instance architecture upgrade from the standard architecture to the cluster architecture.
- FLOW_DowngradeArch: "042", indicating instance architecture downgrade from the cluster architecture to the standard architecture.
- FLOW_UpgradeVersion: "043", indicating version upgrade.
- FLOW_MODIFYCONNECTIONCONFIG: "044", indicating adjustment of the bandwidth and the number of connections.
- FLOW_CLEARNETWORK: "045", indicating network change.
- FLOW_REMOVE_BACKUP_FILE: "046", indicating backup deletion.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047", indicating instance upgrade to multi-AZ deployment.
- FLOW_SHUTDOWN_MASTER: "048", indicating fault simulation.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049", indicating manual promotion to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050", indicating replication group addition.
- FLOW_OPEN_WAN: "052", indicating enabling of public network access.
- FLOW_CLOSE_WAN: "053", indicating disabling of public network access.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055", indicating replication group unbinding.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056", indicating switching a replication group instance to the primary instance.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057", indicating modification of the replication group instance role.
- FLOW_MIGRATE_NODE: "058", indicating node migration.
- FLOW_SWITCH_NODE: "059", indicating node switch.
- FLOW_UPGRADE_SMALL_VERSION: "060", indicating Redis version upgrade.
- FLOW_UPGRADE_PROXY_VERSION: "061", indicating proxy version upgrade.
- FLOW_MODIFY_INSTANCE_NETWORK: "062", indicating instance network modification.
- FLOW_MIGRATE_PROXY_NODE: "063", indicating proxy node migration.
- FLOW_MIGRATION_INSTANCE_ZONE: "066", indicating that instance migration to another AZ is in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067", indicating that instance version upgrade is in progress.
- FLOW_MODIFY_PROXY_NUM: "069", indicating proxy node addition (removal).
- FLOW_MODIFYBACKUPMOD: "070", indicating instance backup mode modification.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Task progress.
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Task execution end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task execution status.



0: initializing the task.
1: executing.
2. completed.
4: failed.
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task start time. 
     * @return StartTime Task start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time.
     * @param StartTime Task start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task type.

- FLOW_CREATE: "001", indicating instance creation.
- FLOW_RESIZE: "002", indicating configuration modification.
- FLOW_CLOSE: "003", indicating instance disabling.
- FLOW_CLEAN: "004", indicating instance cleanup.
- FLOW_STARTUP: "005", indicating instance enabling.
- FLOW_DELETE: "006", indicating instance deletion.
- FLOW_SETPWD: "007", indicating password reset.
- FLOW_EXPORTBACKUP: "009", indicating backup file export.
- FLOW_RESTOREBACKUP: "010", indicating backup restoration.
- FLOW_BACKUPINSTANCE: "012", indicating instance backup.
- FLOW_MIGRATEINSTANCE: "013", indicating instance migration.
- FLOW_DELBACKUP: "014", indicating backup deletion.
- FLOW_EXCHANGEINSTANCE: "016", indicating instance switch.
- FLOW_AUTOBACKUP: "017", indicating automatic instance backup.
- FLOW_MIGRATECHECK: "022", indicating migration parameter verification.
- FLOW_MIGRATETASK: "023", indicating that data migration is in progress.
- FLOW_CLEANDB: "025", indicating database cleanup.
- FLOW_CLONEBACKUP: "026": indicating backup cloning.
- FLOW_CHANGEVIP: "027", indicating VIP address modification.
- FLOW_EXPORSHR: "028", indicating scaling.
- FLOW_ADDNODES: "029", indicating node addition (removal).
- FLOW_CHANGENET: "031", indicating network type modification.
- FLOW_MODIFYINSTACEREADONLY: "033": indicating read-only policy modification.
- FLOW_MODIFYINSTANCEPARAMS: "034", indicating instance parameter modification.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035", indicating password-free access settings.
- FLOW_SWITCHINSTANCEVIP: "036", indicating instance VIP address switch.
- FLOW_MODIFYINSTANCEACCOUNT: "037", indicating instance account modification.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038", indicating instance bandwidth modification.
- FLOW_ENABLEINSTANCE_REPLICATE: "039", indicating enabling of read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040", indicating disabling of read-only replica.
- FLOW_UpgradeArch: "041", indicating instance architecture upgrade from the standard architecture to the cluster architecture.
- FLOW_DowngradeArch: "042", indicating instance architecture downgrade from the cluster architecture to the standard architecture.
- FLOW_UpgradeVersion: "043", indicating version upgrade.
- FLOW_MODIFYCONNECTIONCONFIG: "044", indicating adjustment of the bandwidth and the number of connections.
- FLOW_CLEARNETWORK: "045", indicating network change.
- FLOW_REMOVE_BACKUP_FILE: "046", indicating backup deletion.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047", indicating instance upgrade to multi-AZ deployment.
- FLOW_SHUTDOWN_MASTER: "048", indicating fault simulation.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049", indicating manual promotion to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050", indicating replication group addition.
- FLOW_OPEN_WAN: "052", indicating enabling of public network access.
- FLOW_CLOSE_WAN: "053", indicating disabling of public network access.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055", indicating replication group unbinding.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056", indicating switching a replication group instance to the primary instance.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057", indicating modification of the replication group instance role.
- FLOW_MIGRATE_NODE: "058", indicating node migration.
- FLOW_SWITCH_NODE: "059", indicating node switch.
- FLOW_UPGRADE_SMALL_VERSION: "060", indicating Redis version upgrade.
- FLOW_UPGRADE_PROXY_VERSION: "061", indicating proxy version upgrade.
- FLOW_MODIFY_INSTANCE_NETWORK: "062", indicating instance network modification.
- FLOW_MIGRATE_PROXY_NODE: "063", indicating proxy node migration.
- FLOW_MIGRATION_INSTANCE_ZONE: "066", indicating that instance migration to another AZ is in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067", indicating that instance version upgrade is in progress.
- FLOW_MODIFY_PROXY_NUM: "069", indicating proxy node addition (removal).
- FLOW_MODIFYBACKUPMOD: "070", indicating instance backup mode modification. 
     * @return TaskType Task type.

- FLOW_CREATE: "001", indicating instance creation.
- FLOW_RESIZE: "002", indicating configuration modification.
- FLOW_CLOSE: "003", indicating instance disabling.
- FLOW_CLEAN: "004", indicating instance cleanup.
- FLOW_STARTUP: "005", indicating instance enabling.
- FLOW_DELETE: "006", indicating instance deletion.
- FLOW_SETPWD: "007", indicating password reset.
- FLOW_EXPORTBACKUP: "009", indicating backup file export.
- FLOW_RESTOREBACKUP: "010", indicating backup restoration.
- FLOW_BACKUPINSTANCE: "012", indicating instance backup.
- FLOW_MIGRATEINSTANCE: "013", indicating instance migration.
- FLOW_DELBACKUP: "014", indicating backup deletion.
- FLOW_EXCHANGEINSTANCE: "016", indicating instance switch.
- FLOW_AUTOBACKUP: "017", indicating automatic instance backup.
- FLOW_MIGRATECHECK: "022", indicating migration parameter verification.
- FLOW_MIGRATETASK: "023", indicating that data migration is in progress.
- FLOW_CLEANDB: "025", indicating database cleanup.
- FLOW_CLONEBACKUP: "026": indicating backup cloning.
- FLOW_CHANGEVIP: "027", indicating VIP address modification.
- FLOW_EXPORSHR: "028", indicating scaling.
- FLOW_ADDNODES: "029", indicating node addition (removal).
- FLOW_CHANGENET: "031", indicating network type modification.
- FLOW_MODIFYINSTACEREADONLY: "033": indicating read-only policy modification.
- FLOW_MODIFYINSTANCEPARAMS: "034", indicating instance parameter modification.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035", indicating password-free access settings.
- FLOW_SWITCHINSTANCEVIP: "036", indicating instance VIP address switch.
- FLOW_MODIFYINSTANCEACCOUNT: "037", indicating instance account modification.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038", indicating instance bandwidth modification.
- FLOW_ENABLEINSTANCE_REPLICATE: "039", indicating enabling of read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040", indicating disabling of read-only replica.
- FLOW_UpgradeArch: "041", indicating instance architecture upgrade from the standard architecture to the cluster architecture.
- FLOW_DowngradeArch: "042", indicating instance architecture downgrade from the cluster architecture to the standard architecture.
- FLOW_UpgradeVersion: "043", indicating version upgrade.
- FLOW_MODIFYCONNECTIONCONFIG: "044", indicating adjustment of the bandwidth and the number of connections.
- FLOW_CLEARNETWORK: "045", indicating network change.
- FLOW_REMOVE_BACKUP_FILE: "046", indicating backup deletion.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047", indicating instance upgrade to multi-AZ deployment.
- FLOW_SHUTDOWN_MASTER: "048", indicating fault simulation.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049", indicating manual promotion to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050", indicating replication group addition.
- FLOW_OPEN_WAN: "052", indicating enabling of public network access.
- FLOW_CLOSE_WAN: "053", indicating disabling of public network access.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055", indicating replication group unbinding.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056", indicating switching a replication group instance to the primary instance.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057", indicating modification of the replication group instance role.
- FLOW_MIGRATE_NODE: "058", indicating node migration.
- FLOW_SWITCH_NODE: "059", indicating node switch.
- FLOW_UPGRADE_SMALL_VERSION: "060", indicating Redis version upgrade.
- FLOW_UPGRADE_PROXY_VERSION: "061", indicating proxy version upgrade.
- FLOW_MODIFY_INSTANCE_NETWORK: "062", indicating instance network modification.
- FLOW_MIGRATE_PROXY_NODE: "063", indicating proxy node migration.
- FLOW_MIGRATION_INSTANCE_ZONE: "066", indicating that instance migration to another AZ is in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067", indicating that instance version upgrade is in progress.
- FLOW_MODIFY_PROXY_NUM: "069", indicating proxy node addition (removal).
- FLOW_MODIFYBACKUPMOD: "070", indicating instance backup mode modification.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type.

- FLOW_CREATE: "001", indicating instance creation.
- FLOW_RESIZE: "002", indicating configuration modification.
- FLOW_CLOSE: "003", indicating instance disabling.
- FLOW_CLEAN: "004", indicating instance cleanup.
- FLOW_STARTUP: "005", indicating instance enabling.
- FLOW_DELETE: "006", indicating instance deletion.
- FLOW_SETPWD: "007", indicating password reset.
- FLOW_EXPORTBACKUP: "009", indicating backup file export.
- FLOW_RESTOREBACKUP: "010", indicating backup restoration.
- FLOW_BACKUPINSTANCE: "012", indicating instance backup.
- FLOW_MIGRATEINSTANCE: "013", indicating instance migration.
- FLOW_DELBACKUP: "014", indicating backup deletion.
- FLOW_EXCHANGEINSTANCE: "016", indicating instance switch.
- FLOW_AUTOBACKUP: "017", indicating automatic instance backup.
- FLOW_MIGRATECHECK: "022", indicating migration parameter verification.
- FLOW_MIGRATETASK: "023", indicating that data migration is in progress.
- FLOW_CLEANDB: "025", indicating database cleanup.
- FLOW_CLONEBACKUP: "026": indicating backup cloning.
- FLOW_CHANGEVIP: "027", indicating VIP address modification.
- FLOW_EXPORSHR: "028", indicating scaling.
- FLOW_ADDNODES: "029", indicating node addition (removal).
- FLOW_CHANGENET: "031", indicating network type modification.
- FLOW_MODIFYINSTACEREADONLY: "033": indicating read-only policy modification.
- FLOW_MODIFYINSTANCEPARAMS: "034", indicating instance parameter modification.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035", indicating password-free access settings.
- FLOW_SWITCHINSTANCEVIP: "036", indicating instance VIP address switch.
- FLOW_MODIFYINSTANCEACCOUNT: "037", indicating instance account modification.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038", indicating instance bandwidth modification.
- FLOW_ENABLEINSTANCE_REPLICATE: "039", indicating enabling of read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040", indicating disabling of read-only replica.
- FLOW_UpgradeArch: "041", indicating instance architecture upgrade from the standard architecture to the cluster architecture.
- FLOW_DowngradeArch: "042", indicating instance architecture downgrade from the cluster architecture to the standard architecture.
- FLOW_UpgradeVersion: "043", indicating version upgrade.
- FLOW_MODIFYCONNECTIONCONFIG: "044", indicating adjustment of the bandwidth and the number of connections.
- FLOW_CLEARNETWORK: "045", indicating network change.
- FLOW_REMOVE_BACKUP_FILE: "046", indicating backup deletion.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047", indicating instance upgrade to multi-AZ deployment.
- FLOW_SHUTDOWN_MASTER: "048", indicating fault simulation.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049", indicating manual promotion to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050", indicating replication group addition.
- FLOW_OPEN_WAN: "052", indicating enabling of public network access.
- FLOW_CLOSE_WAN: "053", indicating disabling of public network access.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055", indicating replication group unbinding.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056", indicating switching a replication group instance to the primary instance.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057", indicating modification of the replication group instance role.
- FLOW_MIGRATE_NODE: "058", indicating node migration.
- FLOW_SWITCH_NODE: "059", indicating node switch.
- FLOW_UPGRADE_SMALL_VERSION: "060", indicating Redis version upgrade.
- FLOW_UPGRADE_PROXY_VERSION: "061", indicating proxy version upgrade.
- FLOW_MODIFY_INSTANCE_NETWORK: "062", indicating instance network modification.
- FLOW_MIGRATE_PROXY_NODE: "063", indicating proxy node migration.
- FLOW_MIGRATION_INSTANCE_ZONE: "066", indicating that instance migration to another AZ is in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067", indicating that instance version upgrade is in progress.
- FLOW_MODIFY_PROXY_NUM: "069", indicating proxy node addition (removal).
- FLOW_MODIFYBACKUPMOD: "070", indicating instance backup mode modification.
     * @param TaskType Task type.

- FLOW_CREATE: "001", indicating instance creation.
- FLOW_RESIZE: "002", indicating configuration modification.
- FLOW_CLOSE: "003", indicating instance disabling.
- FLOW_CLEAN: "004", indicating instance cleanup.
- FLOW_STARTUP: "005", indicating instance enabling.
- FLOW_DELETE: "006", indicating instance deletion.
- FLOW_SETPWD: "007", indicating password reset.
- FLOW_EXPORTBACKUP: "009", indicating backup file export.
- FLOW_RESTOREBACKUP: "010", indicating backup restoration.
- FLOW_BACKUPINSTANCE: "012", indicating instance backup.
- FLOW_MIGRATEINSTANCE: "013", indicating instance migration.
- FLOW_DELBACKUP: "014", indicating backup deletion.
- FLOW_EXCHANGEINSTANCE: "016", indicating instance switch.
- FLOW_AUTOBACKUP: "017", indicating automatic instance backup.
- FLOW_MIGRATECHECK: "022", indicating migration parameter verification.
- FLOW_MIGRATETASK: "023", indicating that data migration is in progress.
- FLOW_CLEANDB: "025", indicating database cleanup.
- FLOW_CLONEBACKUP: "026": indicating backup cloning.
- FLOW_CHANGEVIP: "027", indicating VIP address modification.
- FLOW_EXPORSHR: "028", indicating scaling.
- FLOW_ADDNODES: "029", indicating node addition (removal).
- FLOW_CHANGENET: "031", indicating network type modification.
- FLOW_MODIFYINSTACEREADONLY: "033": indicating read-only policy modification.
- FLOW_MODIFYINSTANCEPARAMS: "034", indicating instance parameter modification.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035", indicating password-free access settings.
- FLOW_SWITCHINSTANCEVIP: "036", indicating instance VIP address switch.
- FLOW_MODIFYINSTANCEACCOUNT: "037", indicating instance account modification.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038", indicating instance bandwidth modification.
- FLOW_ENABLEINSTANCE_REPLICATE: "039", indicating enabling of read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040", indicating disabling of read-only replica.
- FLOW_UpgradeArch: "041", indicating instance architecture upgrade from the standard architecture to the cluster architecture.
- FLOW_DowngradeArch: "042", indicating instance architecture downgrade from the cluster architecture to the standard architecture.
- FLOW_UpgradeVersion: "043", indicating version upgrade.
- FLOW_MODIFYCONNECTIONCONFIG: "044", indicating adjustment of the bandwidth and the number of connections.
- FLOW_CLEARNETWORK: "045", indicating network change.
- FLOW_REMOVE_BACKUP_FILE: "046", indicating backup deletion.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047", indicating instance upgrade to multi-AZ deployment.
- FLOW_SHUTDOWN_MASTER: "048", indicating fault simulation.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049", indicating manual promotion to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050", indicating replication group addition.
- FLOW_OPEN_WAN: "052", indicating enabling of public network access.
- FLOW_CLOSE_WAN: "053", indicating disabling of public network access.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055", indicating replication group unbinding.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056", indicating switching a replication group instance to the primary instance.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057", indicating modification of the replication group instance role.
- FLOW_MIGRATE_NODE: "058", indicating node migration.
- FLOW_SWITCH_NODE: "059", indicating node switch.
- FLOW_UPGRADE_SMALL_VERSION: "060", indicating Redis version upgrade.
- FLOW_UPGRADE_PROXY_VERSION: "061", indicating proxy version upgrade.
- FLOW_MODIFY_INSTANCE_NETWORK: "062", indicating instance network modification.
- FLOW_MIGRATE_PROXY_NODE: "063", indicating proxy node migration.
- FLOW_MIGRATION_INSTANCE_ZONE: "066", indicating that instance migration to another AZ is in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067", indicating that instance version upgrade is in progress.
- FLOW_MODIFY_PROXY_NUM: "069", indicating proxy node addition (removal).
- FLOW_MODIFYBACKUPMOD: "070", indicating instance backup mode modification.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task progress. 
     * @return Progress Task progress.
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress.
     * @param Progress Task progress.
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Task execution end time. 
     * @return EndTime Task execution end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task execution end time.
     * @param EndTime Task execution end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task execution status.



0: initializing the task.
1: executing.
2. completed.
4: failed. 
     * @return Result Task execution status.



0: initializing the task.
1: executing.
2. completed.
4: failed.
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set Task execution status.



0: initializing the task.
1: executing.
2. completed.
4: failed.
     * @param Result Task execution status.



0: initializing the task.
1: executing.
2. completed.
4: failed.
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    public TaskInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoDetail(TaskInfoDetail source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

