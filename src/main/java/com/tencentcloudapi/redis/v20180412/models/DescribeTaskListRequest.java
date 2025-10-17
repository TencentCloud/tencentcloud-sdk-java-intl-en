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
    * Instance name. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
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
    * Pagination offset, which is an integer multiple of Limit. Offset = Limit x (Page number – 1). The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Project ID. This field has been deprecated. Please ignore it.
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

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
 - FLOW_UPDATE_WAN: "054", indicating update of the public network access configuration.
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
     * Get Instance name. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list. 
     * @return InstanceName Instance name. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
     * @param InstanceName Instance name. Log in to the [Redis console](https://console.cloud.tencent.com/redis/instance/list), and copy it from the instance list.
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
     * Get Pagination offset, which is an integer multiple of Limit. Offset = Limit x (Page number – 1). The default value is 0. 
     * @return Offset Pagination offset, which is an integer multiple of Limit. Offset = Limit x (Page number – 1). The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, which is an integer multiple of Limit. Offset = Limit x (Page number – 1). The default value is 0.
     * @param Offset Pagination offset, which is an integer multiple of Limit. Offset = Limit x (Page number – 1). The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Project ID. This field has been deprecated. Please ignore it. 
     * @return ProjectIds Project ID. This field has been deprecated. Please ignore it.
     * @deprecated
     */
    @Deprecated
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID. This field has been deprecated. Please ignore it.
     * @param ProjectIds Project ID. This field has been deprecated. Please ignore it.
     * @deprecated
     */
    @Deprecated
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
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
 - FLOW_UPDATE_WAN: "054", indicating update of the public network access configuration.
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
     * @return TaskTypes Task type.



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
 - FLOW_UPDATE_WAN: "054", indicating update of the public network access configuration.
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
    public String [] getTaskTypes() {
        return this.TaskTypes;
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
 - FLOW_UPDATE_WAN: "054", indicating update of the public network access configuration.
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
     * @param TaskTypes Task type.



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
 - FLOW_UPDATE_WAN: "054", indicating update of the public network access configuration.
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

