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
    * Task ID 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task start time 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task type.

- FLOW_CREATE: "001" - Create an instance.
- FLOW_RESIZE: "002" - Change the configuration.
- FLOW_CLOSE: "003" - Close an instance.
- FLOW_CLEAN: "004" - Clear an instance.
- FLOW_STARTUP: "005" - Enable an instance.
- FLOW_DELETE: "006" - Delete an instance.
- FLOW_SETPWD: "007" - Reset the password.
- FLOW_EXPORTBACKUP: "009" - Export the backup file.
- FLOW_RESTOREBACKUP: "010" - Restore the backup.
- FLOW_BACKUPINSTANCE: "012" - Back up an instance.
- FLOW_MIGRATEINSTANCE: "013" - Migrate an instance.
- FLOW_DELBACKUP: "014" - Delete the backup.
- FLOW_EXCHANGEINSTANCE: "016" - Switch an instance.
- FLOW_AUTOBACKUP: "017" - Automatically backup an instance.
- FLOW_MIGRATECHECK: "022" - Verify migration parameters.
- FLOW_MIGRATETASK: "023" - Migrating data is in progress.
- FLOW_CLEANDB: "025" - Clear a database.
- FLOW_CLONEBACKUP: "026" - Clone the backup.
- FLOW_CHANGEVIP: "027" - Change the VIP.
- FLOW_EXPORSHR: "028" - Perform scaling.
- FLOW_ADDNODES: "029" - Add or remove a node.
- FLOW_CHANGENET: "031" - Change the network type.
- FLOW_MODIFYINSTACEREADONLY: "033" - Modify the read-only policy.
- FLOW_MODIFYINSTANCEPARAMS: "034" - Modify instance parameters.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035" - Set password-free access.
- FLOW_SWITCHINSTANCEVIP: "036" - Switch the instance VIP.
- FLOW_MODIFYINSTANCEACCOUNT: "037" - Modify the instance account.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038" - Modify the instance bandwidth.
- FLOW_ENABLEINSTANCE_REPLICATE: "039" - Enable read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040" - Disable read-only replica.
- FLOW_UpgradeArch: "041" - Upgrade the instance architecture from primary-secondary to cluster.
- FLOW_DowngradeArch: "042" - Downgrade the instance architecture from cluster to primary-secondary.
- FLOW_UpgradeVersion: "043" - Upgrade the version.
- FLOW_MODIFYCONNECTIONCONFIG: "044" - Modify the number of bandwidth connections.
- FLOW_CLEARNETWORK: "045" - Change the network.
- FLOW_REMOVE_BACKUP_FILE: "046" - Delete the backup.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047" - Upgrade an instance to support multiple AZs.
- FLOW_SHUTDOWN_MASTER: "048" - Simulate a fault.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049" - Manually promote the replica node to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050" - Add a replication group.
- FLOW_OPEN_WAN: "052" - Enable the public network.
- FLOW_CLOSE_WAN: "053" - Disable the public network. - FLOW_UPDATE_WAN: "054" - Update the public network.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055" - Unbind the replication group.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056" - Switch to the primary instance in the replication group.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057" - Change the roles of instances in the replication group.
- FLOW_MIGRATE_NODE: "058" - Migrate a node.
- FLOW_SWITCH_NODE: "059" - Switch a node.
- FLOW_UPGRADE_SMALL_VERSION: "060" - Upgrade the Redis version.
- FLOW_UPGRADE_PROXY_VERSION: "061" - Upgrade the Proxy version.
- FLOW_MODIFY_INSTANCE_NETWORK: "062" - Modify the instance network.
- FLOW_MIGRATE_PROXY_NODE: "063" - Migrate the Proxy node.
- FLOW_MIGRATION_INSTANCE_ZONE: "066" - Migrate the instance AZ in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrading the instance version is in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Instance name 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Project ID 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Task progress 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Task end time 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get Task ID 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task start time 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Task start time 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Task start time 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task type.

- FLOW_CREATE: "001" - Create an instance.
- FLOW_RESIZE: "002" - Change the configuration.
- FLOW_CLOSE: "003" - Close an instance.
- FLOW_CLEAN: "004" - Clear an instance.
- FLOW_STARTUP: "005" - Enable an instance.
- FLOW_DELETE: "006" - Delete an instance.
- FLOW_SETPWD: "007" - Reset the password.
- FLOW_EXPORTBACKUP: "009" - Export the backup file.
- FLOW_RESTOREBACKUP: "010" - Restore the backup.
- FLOW_BACKUPINSTANCE: "012" - Back up an instance.
- FLOW_MIGRATEINSTANCE: "013" - Migrate an instance.
- FLOW_DELBACKUP: "014" - Delete the backup.
- FLOW_EXCHANGEINSTANCE: "016" - Switch an instance.
- FLOW_AUTOBACKUP: "017" - Automatically backup an instance.
- FLOW_MIGRATECHECK: "022" - Verify migration parameters.
- FLOW_MIGRATETASK: "023" - Migrating data is in progress.
- FLOW_CLEANDB: "025" - Clear a database.
- FLOW_CLONEBACKUP: "026" - Clone the backup.
- FLOW_CHANGEVIP: "027" - Change the VIP.
- FLOW_EXPORSHR: "028" - Perform scaling.
- FLOW_ADDNODES: "029" - Add or remove a node.
- FLOW_CHANGENET: "031" - Change the network type.
- FLOW_MODIFYINSTACEREADONLY: "033" - Modify the read-only policy.
- FLOW_MODIFYINSTANCEPARAMS: "034" - Modify instance parameters.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035" - Set password-free access.
- FLOW_SWITCHINSTANCEVIP: "036" - Switch the instance VIP.
- FLOW_MODIFYINSTANCEACCOUNT: "037" - Modify the instance account.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038" - Modify the instance bandwidth.
- FLOW_ENABLEINSTANCE_REPLICATE: "039" - Enable read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040" - Disable read-only replica.
- FLOW_UpgradeArch: "041" - Upgrade the instance architecture from primary-secondary to cluster.
- FLOW_DowngradeArch: "042" - Downgrade the instance architecture from cluster to primary-secondary.
- FLOW_UpgradeVersion: "043" - Upgrade the version.
- FLOW_MODIFYCONNECTIONCONFIG: "044" - Modify the number of bandwidth connections.
- FLOW_CLEARNETWORK: "045" - Change the network.
- FLOW_REMOVE_BACKUP_FILE: "046" - Delete the backup.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047" - Upgrade an instance to support multiple AZs.
- FLOW_SHUTDOWN_MASTER: "048" - Simulate a fault.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049" - Manually promote the replica node to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050" - Add a replication group.
- FLOW_OPEN_WAN: "052" - Enable the public network.
- FLOW_CLOSE_WAN: "053" - Disable the public network. - FLOW_UPDATE_WAN: "054" - Update the public network.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055" - Unbind the replication group.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056" - Switch to the primary instance in the replication group.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057" - Change the roles of instances in the replication group.
- FLOW_MIGRATE_NODE: "058" - Migrate a node.
- FLOW_SWITCH_NODE: "059" - Switch a node.
- FLOW_UPGRADE_SMALL_VERSION: "060" - Upgrade the Redis version.
- FLOW_UPGRADE_PROXY_VERSION: "061" - Upgrade the Proxy version.
- FLOW_MODIFY_INSTANCE_NETWORK: "062" - Modify the instance network.
- FLOW_MIGRATE_PROXY_NODE: "063" - Migrate the Proxy node.
- FLOW_MIGRATION_INSTANCE_ZONE: "066" - Migrate the instance AZ in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrading the instance version is in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskType Task type.

- FLOW_CREATE: "001" - Create an instance.
- FLOW_RESIZE: "002" - Change the configuration.
- FLOW_CLOSE: "003" - Close an instance.
- FLOW_CLEAN: "004" - Clear an instance.
- FLOW_STARTUP: "005" - Enable an instance.
- FLOW_DELETE: "006" - Delete an instance.
- FLOW_SETPWD: "007" - Reset the password.
- FLOW_EXPORTBACKUP: "009" - Export the backup file.
- FLOW_RESTOREBACKUP: "010" - Restore the backup.
- FLOW_BACKUPINSTANCE: "012" - Back up an instance.
- FLOW_MIGRATEINSTANCE: "013" - Migrate an instance.
- FLOW_DELBACKUP: "014" - Delete the backup.
- FLOW_EXCHANGEINSTANCE: "016" - Switch an instance.
- FLOW_AUTOBACKUP: "017" - Automatically backup an instance.
- FLOW_MIGRATECHECK: "022" - Verify migration parameters.
- FLOW_MIGRATETASK: "023" - Migrating data is in progress.
- FLOW_CLEANDB: "025" - Clear a database.
- FLOW_CLONEBACKUP: "026" - Clone the backup.
- FLOW_CHANGEVIP: "027" - Change the VIP.
- FLOW_EXPORSHR: "028" - Perform scaling.
- FLOW_ADDNODES: "029" - Add or remove a node.
- FLOW_CHANGENET: "031" - Change the network type.
- FLOW_MODIFYINSTACEREADONLY: "033" - Modify the read-only policy.
- FLOW_MODIFYINSTANCEPARAMS: "034" - Modify instance parameters.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035" - Set password-free access.
- FLOW_SWITCHINSTANCEVIP: "036" - Switch the instance VIP.
- FLOW_MODIFYINSTANCEACCOUNT: "037" - Modify the instance account.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038" - Modify the instance bandwidth.
- FLOW_ENABLEINSTANCE_REPLICATE: "039" - Enable read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040" - Disable read-only replica.
- FLOW_UpgradeArch: "041" - Upgrade the instance architecture from primary-secondary to cluster.
- FLOW_DowngradeArch: "042" - Downgrade the instance architecture from cluster to primary-secondary.
- FLOW_UpgradeVersion: "043" - Upgrade the version.
- FLOW_MODIFYCONNECTIONCONFIG: "044" - Modify the number of bandwidth connections.
- FLOW_CLEARNETWORK: "045" - Change the network.
- FLOW_REMOVE_BACKUP_FILE: "046" - Delete the backup.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047" - Upgrade an instance to support multiple AZs.
- FLOW_SHUTDOWN_MASTER: "048" - Simulate a fault.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049" - Manually promote the replica node to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050" - Add a replication group.
- FLOW_OPEN_WAN: "052" - Enable the public network.
- FLOW_CLOSE_WAN: "053" - Disable the public network. - FLOW_UPDATE_WAN: "054" - Update the public network.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055" - Unbind the replication group.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056" - Switch to the primary instance in the replication group.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057" - Change the roles of instances in the replication group.
- FLOW_MIGRATE_NODE: "058" - Migrate a node.
- FLOW_SWITCH_NODE: "059" - Switch a node.
- FLOW_UPGRADE_SMALL_VERSION: "060" - Upgrade the Redis version.
- FLOW_UPGRADE_PROXY_VERSION: "061" - Upgrade the Proxy version.
- FLOW_MODIFY_INSTANCE_NETWORK: "062" - Modify the instance network.
- FLOW_MIGRATE_PROXY_NODE: "063" - Migrate the Proxy node.
- FLOW_MIGRATION_INSTANCE_ZONE: "066" - Migrate the instance AZ in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrading the instance version is in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type.

- FLOW_CREATE: "001" - Create an instance.
- FLOW_RESIZE: "002" - Change the configuration.
- FLOW_CLOSE: "003" - Close an instance.
- FLOW_CLEAN: "004" - Clear an instance.
- FLOW_STARTUP: "005" - Enable an instance.
- FLOW_DELETE: "006" - Delete an instance.
- FLOW_SETPWD: "007" - Reset the password.
- FLOW_EXPORTBACKUP: "009" - Export the backup file.
- FLOW_RESTOREBACKUP: "010" - Restore the backup.
- FLOW_BACKUPINSTANCE: "012" - Back up an instance.
- FLOW_MIGRATEINSTANCE: "013" - Migrate an instance.
- FLOW_DELBACKUP: "014" - Delete the backup.
- FLOW_EXCHANGEINSTANCE: "016" - Switch an instance.
- FLOW_AUTOBACKUP: "017" - Automatically backup an instance.
- FLOW_MIGRATECHECK: "022" - Verify migration parameters.
- FLOW_MIGRATETASK: "023" - Migrating data is in progress.
- FLOW_CLEANDB: "025" - Clear a database.
- FLOW_CLONEBACKUP: "026" - Clone the backup.
- FLOW_CHANGEVIP: "027" - Change the VIP.
- FLOW_EXPORSHR: "028" - Perform scaling.
- FLOW_ADDNODES: "029" - Add or remove a node.
- FLOW_CHANGENET: "031" - Change the network type.
- FLOW_MODIFYINSTACEREADONLY: "033" - Modify the read-only policy.
- FLOW_MODIFYINSTANCEPARAMS: "034" - Modify instance parameters.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035" - Set password-free access.
- FLOW_SWITCHINSTANCEVIP: "036" - Switch the instance VIP.
- FLOW_MODIFYINSTANCEACCOUNT: "037" - Modify the instance account.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038" - Modify the instance bandwidth.
- FLOW_ENABLEINSTANCE_REPLICATE: "039" - Enable read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040" - Disable read-only replica.
- FLOW_UpgradeArch: "041" - Upgrade the instance architecture from primary-secondary to cluster.
- FLOW_DowngradeArch: "042" - Downgrade the instance architecture from cluster to primary-secondary.
- FLOW_UpgradeVersion: "043" - Upgrade the version.
- FLOW_MODIFYCONNECTIONCONFIG: "044" - Modify the number of bandwidth connections.
- FLOW_CLEARNETWORK: "045" - Change the network.
- FLOW_REMOVE_BACKUP_FILE: "046" - Delete the backup.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047" - Upgrade an instance to support multiple AZs.
- FLOW_SHUTDOWN_MASTER: "048" - Simulate a fault.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049" - Manually promote the replica node to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050" - Add a replication group.
- FLOW_OPEN_WAN: "052" - Enable the public network.
- FLOW_CLOSE_WAN: "053" - Disable the public network. - FLOW_UPDATE_WAN: "054" - Update the public network.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055" - Unbind the replication group.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056" - Switch to the primary instance in the replication group.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057" - Change the roles of instances in the replication group.
- FLOW_MIGRATE_NODE: "058" - Migrate a node.
- FLOW_SWITCH_NODE: "059" - Switch a node.
- FLOW_UPGRADE_SMALL_VERSION: "060" - Upgrade the Redis version.
- FLOW_UPGRADE_PROXY_VERSION: "061" - Upgrade the Proxy version.
- FLOW_MODIFY_INSTANCE_NETWORK: "062" - Modify the instance network.
- FLOW_MIGRATE_PROXY_NODE: "063" - Migrate the Proxy node.
- FLOW_MIGRATION_INSTANCE_ZONE: "066" - Migrate the instance AZ in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrading the instance version is in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskType Task type.

- FLOW_CREATE: "001" - Create an instance.
- FLOW_RESIZE: "002" - Change the configuration.
- FLOW_CLOSE: "003" - Close an instance.
- FLOW_CLEAN: "004" - Clear an instance.
- FLOW_STARTUP: "005" - Enable an instance.
- FLOW_DELETE: "006" - Delete an instance.
- FLOW_SETPWD: "007" - Reset the password.
- FLOW_EXPORTBACKUP: "009" - Export the backup file.
- FLOW_RESTOREBACKUP: "010" - Restore the backup.
- FLOW_BACKUPINSTANCE: "012" - Back up an instance.
- FLOW_MIGRATEINSTANCE: "013" - Migrate an instance.
- FLOW_DELBACKUP: "014" - Delete the backup.
- FLOW_EXCHANGEINSTANCE: "016" - Switch an instance.
- FLOW_AUTOBACKUP: "017" - Automatically backup an instance.
- FLOW_MIGRATECHECK: "022" - Verify migration parameters.
- FLOW_MIGRATETASK: "023" - Migrating data is in progress.
- FLOW_CLEANDB: "025" - Clear a database.
- FLOW_CLONEBACKUP: "026" - Clone the backup.
- FLOW_CHANGEVIP: "027" - Change the VIP.
- FLOW_EXPORSHR: "028" - Perform scaling.
- FLOW_ADDNODES: "029" - Add or remove a node.
- FLOW_CHANGENET: "031" - Change the network type.
- FLOW_MODIFYINSTACEREADONLY: "033" - Modify the read-only policy.
- FLOW_MODIFYINSTANCEPARAMS: "034" - Modify instance parameters.
- FLOW_MODIFYINSTANCEPASSWORDFREE: "035" - Set password-free access.
- FLOW_SWITCHINSTANCEVIP: "036" - Switch the instance VIP.
- FLOW_MODIFYINSTANCEACCOUNT: "037" - Modify the instance account.
- FLOW_MODIFYINSTANCEBANDWIDTH: "038" - Modify the instance bandwidth.
- FLOW_ENABLEINSTANCE_REPLICATE: "039" - Enable read-only replica.
- FLOW_DISABLEINSTANCE_REPLICATE: "040" - Disable read-only replica.
- FLOW_UpgradeArch: "041" - Upgrade the instance architecture from primary-secondary to cluster.
- FLOW_DowngradeArch: "042" - Downgrade the instance architecture from cluster to primary-secondary.
- FLOW_UpgradeVersion: "043" - Upgrade the version.
- FLOW_MODIFYCONNECTIONCONFIG: "044" - Modify the number of bandwidth connections.
- FLOW_CLEARNETWORK: "045" - Change the network.
- FLOW_REMOVE_BACKUP_FILE: "046" - Delete the backup.
- FLOW_UPGRADE_SUPPORT_MULTI_AZ: "047" - Upgrade an instance to support multiple AZs.
- FLOW_SHUTDOWN_MASTER: "048" - Simulate a fault.
- FLOW_CHANGE_REPLICA_TO_MASTER: "049" - Manually promote the replica node to the primary node.
- FLOW_CODE_ADD_REPLICATION_INSTANCE: "050" - Add a replication group.
- FLOW_OPEN_WAN: "052" - Enable the public network.
- FLOW_CLOSE_WAN: "053" - Disable the public network. - FLOW_UPDATE_WAN: "054" - Update the public network.
- FLOW_CODE_DELETE_REPLICATION_INSTANCE: "055" - Unbind the replication group.
- FLOW_CODE_CHANGE_MASTER_INSTANCE: "056" - Switch to the primary instance in the replication group.
- FLOW_CODE_CHANGE_INSTANCE_ROLE: "057" - Change the roles of instances in the replication group.
- FLOW_MIGRATE_NODE: "058" - Migrate a node.
- FLOW_SWITCH_NODE: "059" - Switch a node.
- FLOW_UPGRADE_SMALL_VERSION: "060" - Upgrade the Redis version.
- FLOW_UPGRADE_PROXY_VERSION: "061" - Upgrade the Proxy version.
- FLOW_MODIFY_INSTANCE_NETWORK: "062" - Modify the instance network.
- FLOW_MIGRATE_PROXY_NODE: "063" - Migrate the Proxy node.
- FLOW_MIGRATION_INSTANCE_ZONE: "066" - Migrate the instance AZ in progress.
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrading the instance version is in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Instance name 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Project ID 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task progress 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Task progress 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param Progress Task progress 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Task end time 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Task end time 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Task end time 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return Result Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param Result Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained.
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

