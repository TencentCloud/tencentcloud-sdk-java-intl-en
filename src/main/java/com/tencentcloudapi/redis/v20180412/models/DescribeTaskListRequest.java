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

public class DescribeTaskListRequest extends AbstractModel {

    /**
    * ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Number of taskss returned per page.  Default value: `20`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Project ID Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), go to the account information menu in the top-right corner, and select **Project Management** to query the project ID.
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

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
- FLOW_MIGRATETASK: "023" - Migrate data in progress.
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
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrade the instance version in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
    * Start time of the task, for example, in the format of 2021-12-30 00:00:00. Data in the last 30 days can be queried.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time of the task, for example, in the format of 2021-12-30 20:59:35. Data in the last 30 days can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * This parameter is only for internal use and can be ignored.
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed)
    */
    @SerializedName("Result")
    @Expose
    private Long [] Result;

    /**
    * The field `OperatorUin` has been disused and replaced by `OperateUin`.
    */
    @SerializedName("OperatorUin")
    @Expose
    private Long [] OperatorUin;

    /**
    * Operator account ID or UIN
    */
    @SerializedName("OperateUin")
    @Expose
    private String [] OperateUin;

    /**
     * Get ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list. 
     * @return InstanceId ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     * @param InstanceId ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Number of taskss returned per page.  Default value: `20`. Maximum value: `100`. 
     * @return Limit Number of taskss returned per page.  Default value: `20`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of taskss returned per page.  Default value: `20`. Maximum value: `100`.
     * @param Limit Number of taskss returned per page.  Default value: `20`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1). 
     * @return Offset Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     * @param Offset Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Project ID Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), go to the account information menu in the top-right corner, and select **Project Management** to query the project ID. 
     * @return ProjectIds Project ID Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), go to the account information menu in the top-right corner, and select **Project Management** to query the project ID.
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), go to the account information menu in the top-right corner, and select **Project Management** to query the project ID.
     * @param ProjectIds Project ID Log in to the [Redis console](https://console.cloud.tencent.com/redis#/), go to the account information menu in the top-right corner, and select **Project Management** to query the project ID.
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
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
- FLOW_MIGRATETASK: "023" - Migrate data in progress.
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
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrade the instance version in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode. 
     * @return TaskTypes Task type.



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
- FLOW_MIGRATETASK: "023" - Migrate data in progress.
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
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrade the instance version in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
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
- FLOW_MIGRATETASK: "023" - Migrate data in progress.
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
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrade the instance version in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
     * @param TaskTypes Task type.



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
- FLOW_MIGRATETASK: "023" - Migrate data in progress.
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
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY: "067" - Upgrade the instance version in progress.
- FLOW_MODIFY_PROXY_NUM: "069" - Add or remove a Proxy node.
- FLOW_MODIFYBACKUPMOD: "070" - Change the instance backup mode.
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get Start time of the task, for example, in the format of 2021-12-30 00:00:00. Data in the last 30 days can be queried. 
     * @return BeginTime Start time of the task, for example, in the format of 2021-12-30 00:00:00. Data in the last 30 days can be queried.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of the task, for example, in the format of 2021-12-30 00:00:00. Data in the last 30 days can be queried.
     * @param BeginTime Start time of the task, for example, in the format of 2021-12-30 00:00:00. Data in the last 30 days can be queried.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time of the task, for example, in the format of 2021-12-30 20:59:35. Data in the last 30 days can be queried. 
     * @return EndTime End time of the task, for example, in the format of 2021-12-30 20:59:35. Data in the last 30 days can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the task, for example, in the format of 2021-12-30 20:59:35. Data in the last 30 days can be queried.
     * @param EndTime End time of the task, for example, in the format of 2021-12-30 20:59:35. Data in the last 30 days can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get This parameter is only for internal use and can be ignored. 
     * @return TaskStatus This parameter is only for internal use and can be ignored.
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set This parameter is only for internal use and can be ignored.
     * @param TaskStatus This parameter is only for internal use and can be ignored.
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
     * @return Result Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed)
     */
    public Long [] getResult() {
        return this.Result;
    }

    /**
     * Set Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed)
     * @param Result Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed)
     */
    public void setResult(Long [] Result) {
        this.Result = Result;
    }

    /**
     * Get The field `OperatorUin` has been disused and replaced by `OperateUin`. 
     * @return OperatorUin The field `OperatorUin` has been disused and replaced by `OperateUin`.
     * @deprecated
     */
    @Deprecated
    public Long [] getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set The field `OperatorUin` has been disused and replaced by `OperateUin`.
     * @param OperatorUin The field `OperatorUin` has been disused and replaced by `OperateUin`.
     * @deprecated
     */
    @Deprecated
    public void setOperatorUin(Long [] OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get Operator account ID or UIN 
     * @return OperateUin Operator account ID or UIN
     */
    public String [] getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator account ID or UIN
     * @param OperateUin Operator account ID or UIN
     */
    public void setOperateUin(String [] OperateUin) {
        this.OperateUin = OperateUin;
    }

    public DescribeTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskListRequest(DescribeTaskListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new Long(source.TaskStatus[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new Long[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new Long(source.Result[i]);
            }
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new Long[source.OperatorUin.length];
            for (int i = 0; i < source.OperatorUin.length; i++) {
                this.OperatorUin[i] = new Long(source.OperatorUin[i]);
            }
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String[source.OperateUin.length];
            for (int i = 0; i < source.OperateUin.length; i++) {
                this.OperateUin[i] = new String(source.OperateUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "Result.", this.Result);
        this.setParamArraySimple(map, prefix + "OperatorUin.", this.OperatorUin);
        this.setParamArraySimple(map, prefix + "OperateUin.", this.OperateUin);

    }
}

