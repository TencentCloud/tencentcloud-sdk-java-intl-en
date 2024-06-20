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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceMajorVersionRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Target kernel version number, where upgradeable target kernel version numbers can be acquired through API DescribeDBVersions.
    */
    @SerializedName("TargetDBKernelVersion")
    @Expose
    private String TargetDBKernelVersion;

    /**
    * Whether it is verification mode: if UpgradeCheck is True, it means only kernel version compatibility check will be conducted, without actual upgrade operations, and there will be no affect on the original instance. The check results can be viewed through the upgrade logs.
    */
    @SerializedName("UpgradeCheck")
    @Expose
    private Boolean UpgradeCheck;

    /**
    * Pre-upgrade backup option: True means a full backup is required before upgrade, and False means a full backup is not required before upgrade. If there is an existing backup set that can restore the instance to its pre-upgrade state, False can be selected; otherwise, True should be specified. This parameter is invalid when UpgradeCheck is True.
    */
    @SerializedName("BackupBeforeUpgrade")
    @Expose
    private Boolean BackupBeforeUpgrade;

    /**
    * Statistics collection option, which is used to run ANALYZE on the primary instance to update system statistics after the upgrade. Valid values include:
0: No statistics collection required;
1: Collect statistics before instance recovery write;
3: Collect statistics after instance recovery write.
This parameter is invalid when UpgradeCheck is True.
    */
    @SerializedName("StatisticsRefreshOption")
    @Expose
    private Long StatisticsRefreshOption;

    /**
    * Plugin upgrade option. pg_upgrade does not upgrade any plugins, and "ALTER EXTENSION UPDATE" needs to be executed on the database where the plugins were created after the upgrade. When initiating a major version upgrade of an instance, you can specify whether the upgrade task automatically upgrades the plugin version before/after the instance recovery write. Valid values include:
0: No automatic plugin upgrade required;
1: Upgrade plugins before recovery write;
2: Upgrade plugins after recovery write.
This parameter is invalid when UpgradeCheck is True.
    */
    @SerializedName("ExtensionUpgradeOption")
    @Expose
    private Long ExtensionUpgradeOption;

    /**
    * Upgrade time option. During the upgrade process, there will be a period when the instance is read-only, and there will be a second-level flash disconnection. When initiating an upgrade, you need to choose the time window for this impact. Valid values include:
0: Execute automatically, no specific time window required;
1: Specify the time window for this upgrade task, which is set via UpgradeTimeBegin and UpgradeTimeEnd parameters;
2: Execute during the instance operation and maintenance time window.
This parameter is invalid when UpgradeCheck is True.
    */
    @SerializedName("UpgradeTimeOption")
    @Expose
    private Long UpgradeTimeOption;

    /**
    * Upgrade window start time, and the time format is HH:MM:SS, for example: 01:00:00. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True.
    */
    @SerializedName("UpgradeTimeBegin")
    @Expose
    private String UpgradeTimeBegin;

    /**
    * Upgrade window end time, and the time format is HH:MM:SS, for example: 2:00:00 AM. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True.
    */
    @SerializedName("UpgradeTimeEnd")
    @Expose
    private String UpgradeTimeEnd;

    /**
     * Get Instance ID. 
     * @return DBInstanceId Instance ID.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID.
     * @param DBInstanceId Instance ID.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Target kernel version number, where upgradeable target kernel version numbers can be acquired through API DescribeDBVersions. 
     * @return TargetDBKernelVersion Target kernel version number, where upgradeable target kernel version numbers can be acquired through API DescribeDBVersions.
     */
    public String getTargetDBKernelVersion() {
        return this.TargetDBKernelVersion;
    }

    /**
     * Set Target kernel version number, where upgradeable target kernel version numbers can be acquired through API DescribeDBVersions.
     * @param TargetDBKernelVersion Target kernel version number, where upgradeable target kernel version numbers can be acquired through API DescribeDBVersions.
     */
    public void setTargetDBKernelVersion(String TargetDBKernelVersion) {
        this.TargetDBKernelVersion = TargetDBKernelVersion;
    }

    /**
     * Get Whether it is verification mode: if UpgradeCheck is True, it means only kernel version compatibility check will be conducted, without actual upgrade operations, and there will be no affect on the original instance. The check results can be viewed through the upgrade logs. 
     * @return UpgradeCheck Whether it is verification mode: if UpgradeCheck is True, it means only kernel version compatibility check will be conducted, without actual upgrade operations, and there will be no affect on the original instance. The check results can be viewed through the upgrade logs.
     */
    public Boolean getUpgradeCheck() {
        return this.UpgradeCheck;
    }

    /**
     * Set Whether it is verification mode: if UpgradeCheck is True, it means only kernel version compatibility check will be conducted, without actual upgrade operations, and there will be no affect on the original instance. The check results can be viewed through the upgrade logs.
     * @param UpgradeCheck Whether it is verification mode: if UpgradeCheck is True, it means only kernel version compatibility check will be conducted, without actual upgrade operations, and there will be no affect on the original instance. The check results can be viewed through the upgrade logs.
     */
    public void setUpgradeCheck(Boolean UpgradeCheck) {
        this.UpgradeCheck = UpgradeCheck;
    }

    /**
     * Get Pre-upgrade backup option: True means a full backup is required before upgrade, and False means a full backup is not required before upgrade. If there is an existing backup set that can restore the instance to its pre-upgrade state, False can be selected; otherwise, True should be specified. This parameter is invalid when UpgradeCheck is True. 
     * @return BackupBeforeUpgrade Pre-upgrade backup option: True means a full backup is required before upgrade, and False means a full backup is not required before upgrade. If there is an existing backup set that can restore the instance to its pre-upgrade state, False can be selected; otherwise, True should be specified. This parameter is invalid when UpgradeCheck is True.
     */
    public Boolean getBackupBeforeUpgrade() {
        return this.BackupBeforeUpgrade;
    }

    /**
     * Set Pre-upgrade backup option: True means a full backup is required before upgrade, and False means a full backup is not required before upgrade. If there is an existing backup set that can restore the instance to its pre-upgrade state, False can be selected; otherwise, True should be specified. This parameter is invalid when UpgradeCheck is True.
     * @param BackupBeforeUpgrade Pre-upgrade backup option: True means a full backup is required before upgrade, and False means a full backup is not required before upgrade. If there is an existing backup set that can restore the instance to its pre-upgrade state, False can be selected; otherwise, True should be specified. This parameter is invalid when UpgradeCheck is True.
     */
    public void setBackupBeforeUpgrade(Boolean BackupBeforeUpgrade) {
        this.BackupBeforeUpgrade = BackupBeforeUpgrade;
    }

    /**
     * Get Statistics collection option, which is used to run ANALYZE on the primary instance to update system statistics after the upgrade. Valid values include:
0: No statistics collection required;
1: Collect statistics before instance recovery write;
3: Collect statistics after instance recovery write.
This parameter is invalid when UpgradeCheck is True. 
     * @return StatisticsRefreshOption Statistics collection option, which is used to run ANALYZE on the primary instance to update system statistics after the upgrade. Valid values include:
0: No statistics collection required;
1: Collect statistics before instance recovery write;
3: Collect statistics after instance recovery write.
This parameter is invalid when UpgradeCheck is True.
     */
    public Long getStatisticsRefreshOption() {
        return this.StatisticsRefreshOption;
    }

    /**
     * Set Statistics collection option, which is used to run ANALYZE on the primary instance to update system statistics after the upgrade. Valid values include:
0: No statistics collection required;
1: Collect statistics before instance recovery write;
3: Collect statistics after instance recovery write.
This parameter is invalid when UpgradeCheck is True.
     * @param StatisticsRefreshOption Statistics collection option, which is used to run ANALYZE on the primary instance to update system statistics after the upgrade. Valid values include:
0: No statistics collection required;
1: Collect statistics before instance recovery write;
3: Collect statistics after instance recovery write.
This parameter is invalid when UpgradeCheck is True.
     */
    public void setStatisticsRefreshOption(Long StatisticsRefreshOption) {
        this.StatisticsRefreshOption = StatisticsRefreshOption;
    }

    /**
     * Get Plugin upgrade option. pg_upgrade does not upgrade any plugins, and "ALTER EXTENSION UPDATE" needs to be executed on the database where the plugins were created after the upgrade. When initiating a major version upgrade of an instance, you can specify whether the upgrade task automatically upgrades the plugin version before/after the instance recovery write. Valid values include:
0: No automatic plugin upgrade required;
1: Upgrade plugins before recovery write;
2: Upgrade plugins after recovery write.
This parameter is invalid when UpgradeCheck is True. 
     * @return ExtensionUpgradeOption Plugin upgrade option. pg_upgrade does not upgrade any plugins, and "ALTER EXTENSION UPDATE" needs to be executed on the database where the plugins were created after the upgrade. When initiating a major version upgrade of an instance, you can specify whether the upgrade task automatically upgrades the plugin version before/after the instance recovery write. Valid values include:
0: No automatic plugin upgrade required;
1: Upgrade plugins before recovery write;
2: Upgrade plugins after recovery write.
This parameter is invalid when UpgradeCheck is True.
     */
    public Long getExtensionUpgradeOption() {
        return this.ExtensionUpgradeOption;
    }

    /**
     * Set Plugin upgrade option. pg_upgrade does not upgrade any plugins, and "ALTER EXTENSION UPDATE" needs to be executed on the database where the plugins were created after the upgrade. When initiating a major version upgrade of an instance, you can specify whether the upgrade task automatically upgrades the plugin version before/after the instance recovery write. Valid values include:
0: No automatic plugin upgrade required;
1: Upgrade plugins before recovery write;
2: Upgrade plugins after recovery write.
This parameter is invalid when UpgradeCheck is True.
     * @param ExtensionUpgradeOption Plugin upgrade option. pg_upgrade does not upgrade any plugins, and "ALTER EXTENSION UPDATE" needs to be executed on the database where the plugins were created after the upgrade. When initiating a major version upgrade of an instance, you can specify whether the upgrade task automatically upgrades the plugin version before/after the instance recovery write. Valid values include:
0: No automatic plugin upgrade required;
1: Upgrade plugins before recovery write;
2: Upgrade plugins after recovery write.
This parameter is invalid when UpgradeCheck is True.
     */
    public void setExtensionUpgradeOption(Long ExtensionUpgradeOption) {
        this.ExtensionUpgradeOption = ExtensionUpgradeOption;
    }

    /**
     * Get Upgrade time option. During the upgrade process, there will be a period when the instance is read-only, and there will be a second-level flash disconnection. When initiating an upgrade, you need to choose the time window for this impact. Valid values include:
0: Execute automatically, no specific time window required;
1: Specify the time window for this upgrade task, which is set via UpgradeTimeBegin and UpgradeTimeEnd parameters;
2: Execute during the instance operation and maintenance time window.
This parameter is invalid when UpgradeCheck is True. 
     * @return UpgradeTimeOption Upgrade time option. During the upgrade process, there will be a period when the instance is read-only, and there will be a second-level flash disconnection. When initiating an upgrade, you need to choose the time window for this impact. Valid values include:
0: Execute automatically, no specific time window required;
1: Specify the time window for this upgrade task, which is set via UpgradeTimeBegin and UpgradeTimeEnd parameters;
2: Execute during the instance operation and maintenance time window.
This parameter is invalid when UpgradeCheck is True.
     */
    public Long getUpgradeTimeOption() {
        return this.UpgradeTimeOption;
    }

    /**
     * Set Upgrade time option. During the upgrade process, there will be a period when the instance is read-only, and there will be a second-level flash disconnection. When initiating an upgrade, you need to choose the time window for this impact. Valid values include:
0: Execute automatically, no specific time window required;
1: Specify the time window for this upgrade task, which is set via UpgradeTimeBegin and UpgradeTimeEnd parameters;
2: Execute during the instance operation and maintenance time window.
This parameter is invalid when UpgradeCheck is True.
     * @param UpgradeTimeOption Upgrade time option. During the upgrade process, there will be a period when the instance is read-only, and there will be a second-level flash disconnection. When initiating an upgrade, you need to choose the time window for this impact. Valid values include:
0: Execute automatically, no specific time window required;
1: Specify the time window for this upgrade task, which is set via UpgradeTimeBegin and UpgradeTimeEnd parameters;
2: Execute during the instance operation and maintenance time window.
This parameter is invalid when UpgradeCheck is True.
     */
    public void setUpgradeTimeOption(Long UpgradeTimeOption) {
        this.UpgradeTimeOption = UpgradeTimeOption;
    }

    /**
     * Get Upgrade window start time, and the time format is HH:MM:SS, for example: 01:00:00. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True. 
     * @return UpgradeTimeBegin Upgrade window start time, and the time format is HH:MM:SS, for example: 01:00:00. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True.
     */
    public String getUpgradeTimeBegin() {
        return this.UpgradeTimeBegin;
    }

    /**
     * Set Upgrade window start time, and the time format is HH:MM:SS, for example: 01:00:00. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True.
     * @param UpgradeTimeBegin Upgrade window start time, and the time format is HH:MM:SS, for example: 01:00:00. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True.
     */
    public void setUpgradeTimeBegin(String UpgradeTimeBegin) {
        this.UpgradeTimeBegin = UpgradeTimeBegin;
    }

    /**
     * Get Upgrade window end time, and the time format is HH:MM:SS, for example: 2:00:00 AM. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True. 
     * @return UpgradeTimeEnd Upgrade window end time, and the time format is HH:MM:SS, for example: 2:00:00 AM. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True.
     */
    public String getUpgradeTimeEnd() {
        return this.UpgradeTimeEnd;
    }

    /**
     * Set Upgrade window end time, and the time format is HH:MM:SS, for example: 2:00:00 AM. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True.
     * @param UpgradeTimeEnd Upgrade window end time, and the time format is HH:MM:SS, for example: 2:00:00 AM. This parameter is valid when UpgradeTimeOption is set to `1`.
This parameter is invalid when UpgradeCheck is True.
     */
    public void setUpgradeTimeEnd(String UpgradeTimeEnd) {
        this.UpgradeTimeEnd = UpgradeTimeEnd;
    }

    public UpgradeDBInstanceMajorVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceMajorVersionRequest(UpgradeDBInstanceMajorVersionRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.TargetDBKernelVersion != null) {
            this.TargetDBKernelVersion = new String(source.TargetDBKernelVersion);
        }
        if (source.UpgradeCheck != null) {
            this.UpgradeCheck = new Boolean(source.UpgradeCheck);
        }
        if (source.BackupBeforeUpgrade != null) {
            this.BackupBeforeUpgrade = new Boolean(source.BackupBeforeUpgrade);
        }
        if (source.StatisticsRefreshOption != null) {
            this.StatisticsRefreshOption = new Long(source.StatisticsRefreshOption);
        }
        if (source.ExtensionUpgradeOption != null) {
            this.ExtensionUpgradeOption = new Long(source.ExtensionUpgradeOption);
        }
        if (source.UpgradeTimeOption != null) {
            this.UpgradeTimeOption = new Long(source.UpgradeTimeOption);
        }
        if (source.UpgradeTimeBegin != null) {
            this.UpgradeTimeBegin = new String(source.UpgradeTimeBegin);
        }
        if (source.UpgradeTimeEnd != null) {
            this.UpgradeTimeEnd = new String(source.UpgradeTimeEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "TargetDBKernelVersion", this.TargetDBKernelVersion);
        this.setParamSimple(map, prefix + "UpgradeCheck", this.UpgradeCheck);
        this.setParamSimple(map, prefix + "BackupBeforeUpgrade", this.BackupBeforeUpgrade);
        this.setParamSimple(map, prefix + "StatisticsRefreshOption", this.StatisticsRefreshOption);
        this.setParamSimple(map, prefix + "ExtensionUpgradeOption", this.ExtensionUpgradeOption);
        this.setParamSimple(map, prefix + "UpgradeTimeOption", this.UpgradeTimeOption);
        this.setParamSimple(map, prefix + "UpgradeTimeBegin", this.UpgradeTimeBegin);
        this.setParamSimple(map, prefix + "UpgradeTimeEnd", this.UpgradeTimeEnd);

    }
}

