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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceRequest extends AbstractModel {

    /**
    * <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Memory size after upgrade, unit: MB. To ensure the validity of the imported Memory value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable memory specifications.<br>Note: If you perform business migration, fill in the instance specification (CPU, memory), otherwise the system will use the minimum allowed specification by default.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Disk size after upgrade, unit: GB. To ensure the validity of the imported Volume value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable disk range.</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>Data replication method. Supported values include: 0 - async replication, 1 - semi-sync replication, 2 - strong sync replication. Specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>Deployment mode, defaults to 0. Supported values include: 0 - single-AZ deployment, 1 - multi-AZ deployment. You can specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>The availability zone information of standby database 1 matches the Zone parameter of the instance by default. You can specify this parameter when upgrading the primary instance to multi-AZ deployment. This parameter is invalid when upgrading a read-only instance or disaster recovery instance. You can query the supported availability zones via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.</p>
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * <p>Database engine version of the primary instance. Supported values include 5.5, 5.6, 5.7, and 8.0.<br>Note: Please use the <a href="https://www.tencentcloud.com/document/api/236/15870?from_cn_redirect=1">UpgradeDBInstanceEngineVersion</a> API to upgrade the database version.</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch within a time window. When the value is 1, during the upgrade, the process to switch to a new instance will be performed within the time window, or the user can actively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">Switch to a New Instance</a> to trigger the process.</p>
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * <p>The availability zone information of standby 2 is empty by default. You can specify this parameter when upgrading the primary instance, but it is invalid when upgrading a read-only instance or disaster recovery instance. Query the supported AZs via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.<br>Remark: To downgrade a three-node instance to a two-node one, set this parameter to empty to achieve it.</p>
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * <p>Instance type, defaults to master. Supported values include: master - refers to the primary instance, dr - refers to the disaster recovery instance, ro - refers to the read-only instance.</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC" - BASIC edition instance.</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>Number of cpu cores of the instance after upgrade. If not provided, the system will automatically fill in the minimum allowed specification based on the Memory size specified by Memory.<br>Description: If you need to migrate business, make sure to fill in the instance specification (cpu, Memory). Otherwise, the system will use the minimum allowed specification by default.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>Whether to perform Rapid Configuration Change. 0-Normal upgrade, 1-Rapid Configuration Change, 2-Precedence to rapid change. Selecting Rapid Configuration Change will validate whether it is possible to perform ultra-fast reconfiguration based on resource status. If conditions are met, ultra-fast reconfiguration will be performed; otherwise, error information will be returned.</p>
    */
    @SerializedName("FastUpgrade")
    @Expose
    private Long FastUpgrade;

    /**
    * <p>Delay threshold. Value ranges from 1 to 10, default value is 10.</p>
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
    * <p>Whether to perform cross-region migration. 0 - ordinary migration, 1 - cross-region migration, default value is 0. When set to 1, it supports changes to the primary node availability zone of the instance.</p>
    */
    @SerializedName("CrossCluster")
    @Expose
    private Long CrossCluster;

    /**
    * <p>Primary node availability zone. This parameter is valid only when cross-AZ migration. You can only migrate in the same region.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>For cross-cluster migration scenarios, select the processing logic for intra-AZ read-only instances. together-intra-AZ read-only instances migrate with the primary instance to the target availability zone (default option), severally-intra-AZ read-only instances maintain the original deployment mode and do not move to the target availability zone.</p>
    */
    @SerializedName("RoTransType")
    @Expose
    private String RoTransType;

    /**
    * <p>Topology configuration of cloud disk edition nodes.</p>
    */
    @SerializedName("ClusterTopology")
    @Expose
    private ClusterTopology ClusterTopology;

    /**
    * <p>Check whether in-place upgrade requires restart. 1-Check, 0-Do not check. If the value is 1 and the check shows that in-place upgrade must be restarted, the upgrade will be stopped and a notification will be returned. If in-place upgrade does not require restart, the upgrade process will proceed normally.</p>
    */
    @SerializedName("CheckFastUpgradeReboot")
    @Expose
    private Long CheckFastUpgradeReboot;

    /**
    * <p>Data validation sensitivity. This parameter is used for non-Rapid Configuration Change scenarios. Sensitivity is calculated based on current instance specifications to determine cpu resource usage for data comparison during the migration process. Corresponding options are: "high", "normal", "low", empty by default. Parameter explanation: "high": Corresponds to high in the console, not recommended when database load is too high. "normal": Corresponds to standard in the console. "low": Corresponds to low in the console.</p>
    */
    @SerializedName("DataCheckSensitive")
    @Expose
    private String DataCheckSensitive;

    /**
    * <p>AZ information of standby database 3 is empty by default. You can specify this parameter when you proceed to purchase a four-node primary instance.</p>
    */
    @SerializedName("FourthZone")
    @Expose
    private String FourthZone;

    /**
     * Get <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p> 
     * @return InstanceId <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p>
     * @param InstanceId <p>Instance ID, in the format such as cdb-c1nl9rpv or cdbro-c1nl9rpv. This matches the instance ID displayed on the TencentDB console. You can obtain it through the <a href="https://www.tencentcloud.com/document/api/236/15872?from_cn_redirect=1">Query Instance List</a> API, with its value being the InstanceId field in the output parameter.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Memory size after upgrade, unit: MB. To ensure the validity of the imported Memory value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable memory specifications.<br>Note: If you perform business migration, fill in the instance specification (CPU, memory), otherwise the system will use the minimum allowed specification by default.</p> 
     * @return Memory <p>Memory size after upgrade, unit: MB. To ensure the validity of the imported Memory value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable memory specifications.<br>Note: If you perform business migration, fill in the instance specification (CPU, memory), otherwise the system will use the minimum allowed specification by default.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory size after upgrade, unit: MB. To ensure the validity of the imported Memory value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable memory specifications.<br>Note: If you perform business migration, fill in the instance specification (CPU, memory), otherwise the system will use the minimum allowed specification by default.</p>
     * @param Memory <p>Memory size after upgrade, unit: MB. To ensure the validity of the imported Memory value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable memory specifications.<br>Note: If you perform business migration, fill in the instance specification (CPU, memory), otherwise the system will use the minimum allowed specification by default.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Disk size after upgrade, unit: GB. To ensure the validity of the imported Volume value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable disk range.</p> 
     * @return Volume <p>Disk size after upgrade, unit: GB. To ensure the validity of the imported Volume value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable disk range.</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Disk size after upgrade, unit: GB. To ensure the validity of the imported Volume value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable disk range.</p>
     * @param Volume <p>Disk size after upgrade, unit: GB. To ensure the validity of the imported Volume value, please use the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API to get the upgradeable disk range.</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>Data replication method. Supported values include: 0 - async replication, 1 - semi-sync replication, 2 - strong sync replication. Specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p> 
     * @return ProtectMode <p>Data replication method. Supported values include: 0 - async replication, 1 - semi-sync replication, 2 - strong sync replication. Specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>Data replication method. Supported values include: 0 - async replication, 1 - semi-sync replication, 2 - strong sync replication. Specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p>
     * @param ProtectMode <p>Data replication method. Supported values include: 0 - async replication, 1 - semi-sync replication, 2 - strong sync replication. Specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>Deployment mode, defaults to 0. Supported values include: 0 - single-AZ deployment, 1 - multi-AZ deployment. You can specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p> 
     * @return DeployMode <p>Deployment mode, defaults to 0. Supported values include: 0 - single-AZ deployment, 1 - multi-AZ deployment. You can specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>Deployment mode, defaults to 0. Supported values include: 0 - single-AZ deployment, 1 - multi-AZ deployment. You can specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p>
     * @param DeployMode <p>Deployment mode, defaults to 0. Supported values include: 0 - single-AZ deployment, 1 - multi-AZ deployment. You can specify this parameter when upgrading the primary instance. This parameter is invalid when upgrading a read-only instance or disaster recovery instance.</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>The availability zone information of standby database 1 matches the Zone parameter of the instance by default. You can specify this parameter when upgrading the primary instance to multi-AZ deployment. This parameter is invalid when upgrading a read-only instance or disaster recovery instance. You can query the supported availability zones via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.</p> 
     * @return SlaveZone <p>The availability zone information of standby database 1 matches the Zone parameter of the instance by default. You can specify this parameter when upgrading the primary instance to multi-AZ deployment. This parameter is invalid when upgrading a read-only instance or disaster recovery instance. You can query the supported availability zones via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.</p>
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set <p>The availability zone information of standby database 1 matches the Zone parameter of the instance by default. You can specify this parameter when upgrading the primary instance to multi-AZ deployment. This parameter is invalid when upgrading a read-only instance or disaster recovery instance. You can query the supported availability zones via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.</p>
     * @param SlaveZone <p>The availability zone information of standby database 1 matches the Zone parameter of the instance by default. You can specify this parameter when upgrading the primary instance to multi-AZ deployment. This parameter is invalid when upgrading a read-only instance or disaster recovery instance. You can query the supported availability zones via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.</p>
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get <p>Database engine version of the primary instance. Supported values include 5.5, 5.6, 5.7, and 8.0.<br>Note: Please use the <a href="https://www.tencentcloud.com/document/api/236/15870?from_cn_redirect=1">UpgradeDBInstanceEngineVersion</a> API to upgrade the database version.</p> 
     * @return EngineVersion <p>Database engine version of the primary instance. Supported values include 5.5, 5.6, 5.7, and 8.0.<br>Note: Please use the <a href="https://www.tencentcloud.com/document/api/236/15870?from_cn_redirect=1">UpgradeDBInstanceEngineVersion</a> API to upgrade the database version.</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>Database engine version of the primary instance. Supported values include 5.5, 5.6, 5.7, and 8.0.<br>Note: Please use the <a href="https://www.tencentcloud.com/document/api/236/15870?from_cn_redirect=1">UpgradeDBInstanceEngineVersion</a> API to upgrade the database version.</p>
     * @param EngineVersion <p>Database engine version of the primary instance. Supported values include 5.5, 5.6, 5.7, and 8.0.<br>Note: Please use the <a href="https://www.tencentcloud.com/document/api/236/15870?from_cn_redirect=1">UpgradeDBInstanceEngineVersion</a> API to upgrade the database version.</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch within a time window. When the value is 1, during the upgrade, the process to switch to a new instance will be performed within the time window, or the user can actively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">Switch to a New Instance</a> to trigger the process.</p> 
     * @return WaitSwitch <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch within a time window. When the value is 1, during the upgrade, the process to switch to a new instance will be performed within the time window, or the user can actively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">Switch to a New Instance</a> to trigger the process.</p>
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch within a time window. When the value is 1, during the upgrade, the process to switch to a new instance will be performed within the time window, or the user can actively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">Switch to a New Instance</a> to trigger the process.</p>
     * @param WaitSwitch <p>The way to switch to a new instance defaults to 0. Supported values include: 0 - switch immediately, 1 - switch within a time window. When the value is 1, during the upgrade, the process to switch to a new instance will be performed within the time window, or the user can actively call the API <a href="https://www.tencentcloud.com/document/product/236/15864?from_cn_redirect=1">Switch to a New Instance</a> to trigger the process.</p>
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get <p>The availability zone information of standby 2 is empty by default. You can specify this parameter when upgrading the primary instance, but it is invalid when upgrading a read-only instance or disaster recovery instance. Query the supported AZs via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.<br>Remark: To downgrade a three-node instance to a two-node one, set this parameter to empty to achieve it.</p> 
     * @return BackupZone <p>The availability zone information of standby 2 is empty by default. You can specify this parameter when upgrading the primary instance, but it is invalid when upgrading a read-only instance or disaster recovery instance. Query the supported AZs via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.<br>Remark: To downgrade a three-node instance to a two-node one, set this parameter to empty to achieve it.</p>
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set <p>The availability zone information of standby 2 is empty by default. You can specify this parameter when upgrading the primary instance, but it is invalid when upgrading a read-only instance or disaster recovery instance. Query the supported AZs via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.<br>Remark: To downgrade a three-node instance to a two-node one, set this parameter to empty to achieve it.</p>
     * @param BackupZone <p>The availability zone information of standby 2 is empty by default. You can specify this parameter when upgrading the primary instance, but it is invalid when upgrading a read-only instance or disaster recovery instance. Query the supported AZs via the <a href="https://www.tencentcloud.com/document/product/236/17229?from_cn_redirect=1">obtain the purchasable specifications of cloud databases</a> API.<br>Remark: To downgrade a three-node instance to a two-node one, set this parameter to empty to achieve it.</p>
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get <p>Instance type, defaults to master. Supported values include: master - refers to the primary instance, dr - refers to the disaster recovery instance, ro - refers to the read-only instance.</p> 
     * @return InstanceRole <p>Instance type, defaults to master. Supported values include: master - refers to the primary instance, dr - refers to the disaster recovery instance, ro - refers to the read-only instance.</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>Instance type, defaults to master. Supported values include: master - refers to the primary instance, dr - refers to the disaster recovery instance, ro - refers to the read-only instance.</p>
     * @param InstanceRole <p>Instance type, defaults to master. Supported values include: master - refers to the primary instance, dr - refers to the disaster recovery instance, ro - refers to the read-only instance.</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC" - BASIC edition instance.</p> 
     * @return DeviceType <p>Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC" - BASIC edition instance.</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC" - BASIC edition instance.</p>
     * @param DeviceType <p>Instance isolation type. Supported values include "UNIVERSAL" - general-purpose instance, "EXCLUSIVE" - dedicated instance, "BASIC" - BASIC edition instance.</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>Number of cpu cores of the instance after upgrade. If not provided, the system will automatically fill in the minimum allowed specification based on the Memory size specified by Memory.<br>Description: If you need to migrate business, make sure to fill in the instance specification (cpu, Memory). Otherwise, the system will use the minimum allowed specification by default.</p> 
     * @return Cpu <p>Number of cpu cores of the instance after upgrade. If not provided, the system will automatically fill in the minimum allowed specification based on the Memory size specified by Memory.<br>Description: If you need to migrate business, make sure to fill in the instance specification (cpu, Memory). Otherwise, the system will use the minimum allowed specification by default.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Number of cpu cores of the instance after upgrade. If not provided, the system will automatically fill in the minimum allowed specification based on the Memory size specified by Memory.<br>Description: If you need to migrate business, make sure to fill in the instance specification (cpu, Memory). Otherwise, the system will use the minimum allowed specification by default.</p>
     * @param Cpu <p>Number of cpu cores of the instance after upgrade. If not provided, the system will automatically fill in the minimum allowed specification based on the Memory size specified by Memory.<br>Description: If you need to migrate business, make sure to fill in the instance specification (cpu, Memory). Otherwise, the system will use the minimum allowed specification by default.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Whether to perform Rapid Configuration Change. 0-Normal upgrade, 1-Rapid Configuration Change, 2-Precedence to rapid change. Selecting Rapid Configuration Change will validate whether it is possible to perform ultra-fast reconfiguration based on resource status. If conditions are met, ultra-fast reconfiguration will be performed; otherwise, error information will be returned.</p> 
     * @return FastUpgrade <p>Whether to perform Rapid Configuration Change. 0-Normal upgrade, 1-Rapid Configuration Change, 2-Precedence to rapid change. Selecting Rapid Configuration Change will validate whether it is possible to perform ultra-fast reconfiguration based on resource status. If conditions are met, ultra-fast reconfiguration will be performed; otherwise, error information will be returned.</p>
     */
    public Long getFastUpgrade() {
        return this.FastUpgrade;
    }

    /**
     * Set <p>Whether to perform Rapid Configuration Change. 0-Normal upgrade, 1-Rapid Configuration Change, 2-Precedence to rapid change. Selecting Rapid Configuration Change will validate whether it is possible to perform ultra-fast reconfiguration based on resource status. If conditions are met, ultra-fast reconfiguration will be performed; otherwise, error information will be returned.</p>
     * @param FastUpgrade <p>Whether to perform Rapid Configuration Change. 0-Normal upgrade, 1-Rapid Configuration Change, 2-Precedence to rapid change. Selecting Rapid Configuration Change will validate whether it is possible to perform ultra-fast reconfiguration based on resource status. If conditions are met, ultra-fast reconfiguration will be performed; otherwise, error information will be returned.</p>
     */
    public void setFastUpgrade(Long FastUpgrade) {
        this.FastUpgrade = FastUpgrade;
    }

    /**
     * Get <p>Delay threshold. Value ranges from 1 to 10, default value is 10.</p> 
     * @return MaxDelayTime <p>Delay threshold. Value ranges from 1 to 10, default value is 10.</p>
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set <p>Delay threshold. Value ranges from 1 to 10, default value is 10.</p>
     * @param MaxDelayTime <p>Delay threshold. Value ranges from 1 to 10, default value is 10.</p>
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    /**
     * Get <p>Whether to perform cross-region migration. 0 - ordinary migration, 1 - cross-region migration, default value is 0. When set to 1, it supports changes to the primary node availability zone of the instance.</p> 
     * @return CrossCluster <p>Whether to perform cross-region migration. 0 - ordinary migration, 1 - cross-region migration, default value is 0. When set to 1, it supports changes to the primary node availability zone of the instance.</p>
     */
    public Long getCrossCluster() {
        return this.CrossCluster;
    }

    /**
     * Set <p>Whether to perform cross-region migration. 0 - ordinary migration, 1 - cross-region migration, default value is 0. When set to 1, it supports changes to the primary node availability zone of the instance.</p>
     * @param CrossCluster <p>Whether to perform cross-region migration. 0 - ordinary migration, 1 - cross-region migration, default value is 0. When set to 1, it supports changes to the primary node availability zone of the instance.</p>
     */
    public void setCrossCluster(Long CrossCluster) {
        this.CrossCluster = CrossCluster;
    }

    /**
     * Get <p>Primary node availability zone. This parameter is valid only when cross-AZ migration. You can only migrate in the same region.</p> 
     * @return ZoneId <p>Primary node availability zone. This parameter is valid only when cross-AZ migration. You can only migrate in the same region.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Primary node availability zone. This parameter is valid only when cross-AZ migration. You can only migrate in the same region.</p>
     * @param ZoneId <p>Primary node availability zone. This parameter is valid only when cross-AZ migration. You can only migrate in the same region.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>For cross-cluster migration scenarios, select the processing logic for intra-AZ read-only instances. together-intra-AZ read-only instances migrate with the primary instance to the target availability zone (default option), severally-intra-AZ read-only instances maintain the original deployment mode and do not move to the target availability zone.</p> 
     * @return RoTransType <p>For cross-cluster migration scenarios, select the processing logic for intra-AZ read-only instances. together-intra-AZ read-only instances migrate with the primary instance to the target availability zone (default option), severally-intra-AZ read-only instances maintain the original deployment mode and do not move to the target availability zone.</p>
     */
    public String getRoTransType() {
        return this.RoTransType;
    }

    /**
     * Set <p>For cross-cluster migration scenarios, select the processing logic for intra-AZ read-only instances. together-intra-AZ read-only instances migrate with the primary instance to the target availability zone (default option), severally-intra-AZ read-only instances maintain the original deployment mode and do not move to the target availability zone.</p>
     * @param RoTransType <p>For cross-cluster migration scenarios, select the processing logic for intra-AZ read-only instances. together-intra-AZ read-only instances migrate with the primary instance to the target availability zone (default option), severally-intra-AZ read-only instances maintain the original deployment mode and do not move to the target availability zone.</p>
     */
    public void setRoTransType(String RoTransType) {
        this.RoTransType = RoTransType;
    }

    /**
     * Get <p>Topology configuration of cloud disk edition nodes.</p> 
     * @return ClusterTopology <p>Topology configuration of cloud disk edition nodes.</p>
     */
    public ClusterTopology getClusterTopology() {
        return this.ClusterTopology;
    }

    /**
     * Set <p>Topology configuration of cloud disk edition nodes.</p>
     * @param ClusterTopology <p>Topology configuration of cloud disk edition nodes.</p>
     */
    public void setClusterTopology(ClusterTopology ClusterTopology) {
        this.ClusterTopology = ClusterTopology;
    }

    /**
     * Get <p>Check whether in-place upgrade requires restart. 1-Check, 0-Do not check. If the value is 1 and the check shows that in-place upgrade must be restarted, the upgrade will be stopped and a notification will be returned. If in-place upgrade does not require restart, the upgrade process will proceed normally.</p> 
     * @return CheckFastUpgradeReboot <p>Check whether in-place upgrade requires restart. 1-Check, 0-Do not check. If the value is 1 and the check shows that in-place upgrade must be restarted, the upgrade will be stopped and a notification will be returned. If in-place upgrade does not require restart, the upgrade process will proceed normally.</p>
     */
    public Long getCheckFastUpgradeReboot() {
        return this.CheckFastUpgradeReboot;
    }

    /**
     * Set <p>Check whether in-place upgrade requires restart. 1-Check, 0-Do not check. If the value is 1 and the check shows that in-place upgrade must be restarted, the upgrade will be stopped and a notification will be returned. If in-place upgrade does not require restart, the upgrade process will proceed normally.</p>
     * @param CheckFastUpgradeReboot <p>Check whether in-place upgrade requires restart. 1-Check, 0-Do not check. If the value is 1 and the check shows that in-place upgrade must be restarted, the upgrade will be stopped and a notification will be returned. If in-place upgrade does not require restart, the upgrade process will proceed normally.</p>
     */
    public void setCheckFastUpgradeReboot(Long CheckFastUpgradeReboot) {
        this.CheckFastUpgradeReboot = CheckFastUpgradeReboot;
    }

    /**
     * Get <p>Data validation sensitivity. This parameter is used for non-Rapid Configuration Change scenarios. Sensitivity is calculated based on current instance specifications to determine cpu resource usage for data comparison during the migration process. Corresponding options are: "high", "normal", "low", empty by default. Parameter explanation: "high": Corresponds to high in the console, not recommended when database load is too high. "normal": Corresponds to standard in the console. "low": Corresponds to low in the console.</p> 
     * @return DataCheckSensitive <p>Data validation sensitivity. This parameter is used for non-Rapid Configuration Change scenarios. Sensitivity is calculated based on current instance specifications to determine cpu resource usage for data comparison during the migration process. Corresponding options are: "high", "normal", "low", empty by default. Parameter explanation: "high": Corresponds to high in the console, not recommended when database load is too high. "normal": Corresponds to standard in the console. "low": Corresponds to low in the console.</p>
     */
    public String getDataCheckSensitive() {
        return this.DataCheckSensitive;
    }

    /**
     * Set <p>Data validation sensitivity. This parameter is used for non-Rapid Configuration Change scenarios. Sensitivity is calculated based on current instance specifications to determine cpu resource usage for data comparison during the migration process. Corresponding options are: "high", "normal", "low", empty by default. Parameter explanation: "high": Corresponds to high in the console, not recommended when database load is too high. "normal": Corresponds to standard in the console. "low": Corresponds to low in the console.</p>
     * @param DataCheckSensitive <p>Data validation sensitivity. This parameter is used for non-Rapid Configuration Change scenarios. Sensitivity is calculated based on current instance specifications to determine cpu resource usage for data comparison during the migration process. Corresponding options are: "high", "normal", "low", empty by default. Parameter explanation: "high": Corresponds to high in the console, not recommended when database load is too high. "normal": Corresponds to standard in the console. "low": Corresponds to low in the console.</p>
     */
    public void setDataCheckSensitive(String DataCheckSensitive) {
        this.DataCheckSensitive = DataCheckSensitive;
    }

    /**
     * Get <p>AZ information of standby database 3 is empty by default. You can specify this parameter when you proceed to purchase a four-node primary instance.</p> 
     * @return FourthZone <p>AZ information of standby database 3 is empty by default. You can specify this parameter when you proceed to purchase a four-node primary instance.</p>
     */
    public String getFourthZone() {
        return this.FourthZone;
    }

    /**
     * Set <p>AZ information of standby database 3 is empty by default. You can specify this parameter when you proceed to purchase a four-node primary instance.</p>
     * @param FourthZone <p>AZ information of standby database 3 is empty by default. You can specify this parameter when you proceed to purchase a four-node primary instance.</p>
     */
    public void setFourthZone(String FourthZone) {
        this.FourthZone = FourthZone;
    }

    public UpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceRequest(UpgradeDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.BackupZone != null) {
            this.BackupZone = new String(source.BackupZone);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.FastUpgrade != null) {
            this.FastUpgrade = new Long(source.FastUpgrade);
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
        if (source.CrossCluster != null) {
            this.CrossCluster = new Long(source.CrossCluster);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RoTransType != null) {
            this.RoTransType = new String(source.RoTransType);
        }
        if (source.ClusterTopology != null) {
            this.ClusterTopology = new ClusterTopology(source.ClusterTopology);
        }
        if (source.CheckFastUpgradeReboot != null) {
            this.CheckFastUpgradeReboot = new Long(source.CheckFastUpgradeReboot);
        }
        if (source.DataCheckSensitive != null) {
            this.DataCheckSensitive = new String(source.DataCheckSensitive);
        }
        if (source.FourthZone != null) {
            this.FourthZone = new String(source.FourthZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "BackupZone", this.BackupZone);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "FastUpgrade", this.FastUpgrade);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);
        this.setParamSimple(map, prefix + "CrossCluster", this.CrossCluster);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RoTransType", this.RoTransType);
        this.setParamObj(map, prefix + "ClusterTopology.", this.ClusterTopology);
        this.setParamSimple(map, prefix + "CheckFastUpgradeReboot", this.CheckFastUpgradeReboot);
        this.setParamSimple(map, prefix + "DataCheckSensitive", this.DataCheckSensitive);
        this.setParamSimple(map, prefix + "FourthZone", this.FourthZone);

    }
}

