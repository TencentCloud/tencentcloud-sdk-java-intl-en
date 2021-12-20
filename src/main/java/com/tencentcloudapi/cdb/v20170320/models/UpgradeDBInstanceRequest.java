/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceRequest extends AbstractModel{

    /**
    * Instance ID in the format of `cdb-c1nl9rpv` or `cdbro-c1nl9rpv`. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID, whose value is the `InstanceId` value in output parameters.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Memory size in MB after upgrade. To ensure that the `Memory` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the memory that can be upgraded to.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk size in GB after upgrade. To ensure that the `Volume` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the disk that can be upgraded to.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * Deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * AZ information of secondary database 1, which is the `Zone` value of the instance by default. This parameter can be specified when upgrading primary instances in multi-AZ mode and is meaningless for read-only or disaster recovery instances. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the supported AZs.
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * Version of primary instance database engine. Valid values: 5.5, 5.6, 5.7.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * Mode of switch to new instance. Valid values: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [SwitchForUpgrade](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) API to trigger the process.
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * AZ information of secondary database 2, which is empty by default. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
    */
    @SerializedName("BackupZone")
    @Expose
    private String BackupZone;

    /**
    * Instance type. Valid values: master (primary instance), dr (disaster recovery instance), ro (read-only instance). Default value: master.
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * The resource isolation type after the instance is upgraded. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). If this parameter is left empty, the resource isolation type will be the same as the original one.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * The number of CPU cores after the instance is upgraded. If this parameter is left empty, the number of CPU cores will be automatically filled in according to the `Memory` value.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Whether to enable QuickChange. Valid values: `0` (no), `1` (yes). After QuickChange is enabled, the required resources will be checked. QuickChange is performed only when the required resources support the feature; otherwise, an error message will be returned.
    */
    @SerializedName("FastUpgrade")
    @Expose
    private Long FastUpgrade;

    /**
    * Delay threshold. Value range: 1-10. Default value: `10`.
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
     * Get Instance ID in the format of `cdb-c1nl9rpv` or `cdbro-c1nl9rpv`. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID, whose value is the `InstanceId` value in output parameters. 
     * @return InstanceId Instance ID in the format of `cdb-c1nl9rpv` or `cdbro-c1nl9rpv`. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID, whose value is the `InstanceId` value in output parameters.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of `cdb-c1nl9rpv` or `cdbro-c1nl9rpv`. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID, whose value is the `InstanceId` value in output parameters.
     * @param InstanceId Instance ID in the format of `cdb-c1nl9rpv` or `cdbro-c1nl9rpv`. It is the same as the instance ID displayed on the TencentDB Console page. You can use the [DescribeDBInstances](https://intl.cloud.tencent.com/document/api/236/15872?from_cn_redirect=1) API to query the ID, whose value is the `InstanceId` value in output parameters.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Memory size in MB after upgrade. To ensure that the `Memory` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the memory that can be upgraded to. 
     * @return Memory Memory size in MB after upgrade. To ensure that the `Memory` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the memory that can be upgraded to.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in MB after upgrade. To ensure that the `Memory` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the memory that can be upgraded to.
     * @param Memory Memory size in MB after upgrade. To ensure that the `Memory` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the memory that can be upgraded to.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk size in GB after upgrade. To ensure that the `Volume` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the disk that can be upgraded to. 
     * @return Volume Disk size in GB after upgrade. To ensure that the `Volume` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the disk that can be upgraded to.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Disk size in GB after upgrade. To ensure that the `Volume` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the disk that can be upgraded to.
     * @param Volume Disk size in GB after upgrade. To ensure that the `Volume` value to be passed in is valid, please use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the specifications of the disk that can be upgraded to.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances. 
     * @return ProtectMode Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     * @param ProtectMode Data replication mode. Valid values: 0 (async), 1 (semi-sync), 2 (strong sync). This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get Deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances. 
     * @return DeployMode Deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set Deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     * @param DeployMode Deployment mode. Valid values: 0 (single-AZ), 1 (multi-AZ). Default value: 0. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get AZ information of secondary database 1, which is the `Zone` value of the instance by default. This parameter can be specified when upgrading primary instances in multi-AZ mode and is meaningless for read-only or disaster recovery instances. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the supported AZs. 
     * @return SlaveZone AZ information of secondary database 1, which is the `Zone` value of the instance by default. This parameter can be specified when upgrading primary instances in multi-AZ mode and is meaningless for read-only or disaster recovery instances. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the supported AZs.
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set AZ information of secondary database 1, which is the `Zone` value of the instance by default. This parameter can be specified when upgrading primary instances in multi-AZ mode and is meaningless for read-only or disaster recovery instances. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the supported AZs.
     * @param SlaveZone AZ information of secondary database 1, which is the `Zone` value of the instance by default. This parameter can be specified when upgrading primary instances in multi-AZ mode and is meaningless for read-only or disaster recovery instances. You can use the [DescribeDBZoneConfig](https://intl.cloud.tencent.com/document/product/236/17229?from_cn_redirect=1) API to query the supported AZs.
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get Version of primary instance database engine. Valid values: 5.5, 5.6, 5.7. 
     * @return EngineVersion Version of primary instance database engine. Valid values: 5.5, 5.6, 5.7.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Version of primary instance database engine. Valid values: 5.5, 5.6, 5.7.
     * @param EngineVersion Version of primary instance database engine. Valid values: 5.5, 5.6, 5.7.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Mode of switch to new instance. Valid values: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [SwitchForUpgrade](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) API to trigger the process. 
     * @return WaitSwitch Mode of switch to new instance. Valid values: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [SwitchForUpgrade](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) API to trigger the process.
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set Mode of switch to new instance. Valid values: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [SwitchForUpgrade](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) API to trigger the process.
     * @param WaitSwitch Mode of switch to new instance. Valid values: 0 (switch immediately), 1 (switch within a time window). Default value: 0. If the value is 1, the switch process will be performed within a time window. Or, you can call the [SwitchForUpgrade](https://intl.cloud.tencent.com/document/product/236/15864?from_cn_redirect=1) API to trigger the process.
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get AZ information of secondary database 2, which is empty by default. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances. 
     * @return BackupZone AZ information of secondary database 2, which is empty by default. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     */
    public String getBackupZone() {
        return this.BackupZone;
    }

    /**
     * Set AZ information of secondary database 2, which is empty by default. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     * @param BackupZone AZ information of secondary database 2, which is empty by default. This parameter can be specified when upgrading primary instances and is meaningless for read-only or disaster recovery instances.
     */
    public void setBackupZone(String BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * Get Instance type. Valid values: master (primary instance), dr (disaster recovery instance), ro (read-only instance). Default value: master. 
     * @return InstanceRole Instance type. Valid values: master (primary instance), dr (disaster recovery instance), ro (read-only instance). Default value: master.
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Instance type. Valid values: master (primary instance), dr (disaster recovery instance), ro (read-only instance). Default value: master.
     * @param InstanceRole Instance type. Valid values: master (primary instance), dr (disaster recovery instance), ro (read-only instance). Default value: master.
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get The resource isolation type after the instance is upgraded. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). If this parameter is left empty, the resource isolation type will be the same as the original one. 
     * @return DeviceType The resource isolation type after the instance is upgraded. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). If this parameter is left empty, the resource isolation type will be the same as the original one.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set The resource isolation type after the instance is upgraded. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). If this parameter is left empty, the resource isolation type will be the same as the original one.
     * @param DeviceType The resource isolation type after the instance is upgraded. Valid values: `UNIVERSAL` (general instance), `EXCLUSIVE` (dedicated instance), `BASIC` (basic instance). If this parameter is left empty, the resource isolation type will be the same as the original one.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get The number of CPU cores after the instance is upgraded. If this parameter is left empty, the number of CPU cores will be automatically filled in according to the `Memory` value. 
     * @return Cpu The number of CPU cores after the instance is upgraded. If this parameter is left empty, the number of CPU cores will be automatically filled in according to the `Memory` value.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of CPU cores after the instance is upgraded. If this parameter is left empty, the number of CPU cores will be automatically filled in according to the `Memory` value.
     * @param Cpu The number of CPU cores after the instance is upgraded. If this parameter is left empty, the number of CPU cores will be automatically filled in according to the `Memory` value.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Whether to enable QuickChange. Valid values: `0` (no), `1` (yes). After QuickChange is enabled, the required resources will be checked. QuickChange is performed only when the required resources support the feature; otherwise, an error message will be returned. 
     * @return FastUpgrade Whether to enable QuickChange. Valid values: `0` (no), `1` (yes). After QuickChange is enabled, the required resources will be checked. QuickChange is performed only when the required resources support the feature; otherwise, an error message will be returned.
     */
    public Long getFastUpgrade() {
        return this.FastUpgrade;
    }

    /**
     * Set Whether to enable QuickChange. Valid values: `0` (no), `1` (yes). After QuickChange is enabled, the required resources will be checked. QuickChange is performed only when the required resources support the feature; otherwise, an error message will be returned.
     * @param FastUpgrade Whether to enable QuickChange. Valid values: `0` (no), `1` (yes). After QuickChange is enabled, the required resources will be checked. QuickChange is performed only when the required resources support the feature; otherwise, an error message will be returned.
     */
    public void setFastUpgrade(Long FastUpgrade) {
        this.FastUpgrade = FastUpgrade;
    }

    /**
     * Get Delay threshold. Value range: 1-10. Default value: `10`. 
     * @return MaxDelayTime Delay threshold. Value range: 1-10. Default value: `10`.
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set Delay threshold. Value range: 1-10. Default value: `10`.
     * @param MaxDelayTime Delay threshold. Value range: 1-10. Default value: `10`.
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
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

    }
}

