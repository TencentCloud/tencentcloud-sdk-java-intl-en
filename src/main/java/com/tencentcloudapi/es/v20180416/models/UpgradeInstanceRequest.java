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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Target ES version. Valid values: "6.4.3", "6.8.2", "7.5.1", "7.10.1", and "7.14.2".
    */
    @SerializedName("EsVersion")
    @Expose
    private String EsVersion;

    /**
    * Whether to perform an upgrade check only. Default value: false.
    */
    @SerializedName("CheckOnly")
    @Expose
    private Boolean CheckOnly;

    /**
    * Target business feature version: <li>oss open source edition</li><li>basic edition</li>Currently used only when upgrading from 5.6.4 to 6.x. Default value: basic
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li>
    */
    @SerializedName("BasicSecurityType")
    @Expose
    private Long BasicSecurityType;

    /**
    * Upgrade method: <li>scale blue-green change</li><li>restart rolling restart</li>Default value: scale
    */
    @SerializedName("UpgradeMode")
    @Expose
    private String UpgradeMode;

    /**
    * Whether to back up the cluster before upgrading the version. By default, no backup is performed.
    */
    @SerializedName("CosBackup")
    @Expose
    private Boolean CosBackup;

    /**
    * In rolling mode, whether to skip the check and perform a forced reboot. Default value: false
    */
    @SerializedName("SkipCheckForceRestart")
    @Expose
    private Boolean SkipCheckForceRestart;

    /**
    * Parameter for delayed cvm launch
    */
    @SerializedName("CvmDelayOnlineTime")
    @Expose
    private Long CvmDelayOnlineTime;

    /**
    * Number of concurrent shard migrations
    */
    @SerializedName("ShardAllocationConcurrents")
    @Expose
    private Long ShardAllocationConcurrents;

    /**
    * Shard migration concurrency speed
    */
    @SerializedName("ShardAllocationBytes")
    @Expose
    private Long ShardAllocationBytes;

    /**
    * Whether to enable the placement group asynchronous task
    */
    @SerializedName("EnableScheduleRecoverGroup")
    @Expose
    private Boolean EnableScheduleRecoverGroup;

    /**
    * Time period of the async task for the placement group
    */
    @SerializedName("EnableScheduleOperationDuration")
    @Expose
    private EnableScheduleOperationDuration EnableScheduleOperationDuration;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Target ES version. Valid values: "6.4.3", "6.8.2", "7.5.1", "7.10.1", and "7.14.2". 
     * @return EsVersion Target ES version. Valid values: "6.4.3", "6.8.2", "7.5.1", "7.10.1", and "7.14.2".
     */
    public String getEsVersion() {
        return this.EsVersion;
    }

    /**
     * Set Target ES version. Valid values: "6.4.3", "6.8.2", "7.5.1", "7.10.1", and "7.14.2".
     * @param EsVersion Target ES version. Valid values: "6.4.3", "6.8.2", "7.5.1", "7.10.1", and "7.14.2".
     */
    public void setEsVersion(String EsVersion) {
        this.EsVersion = EsVersion;
    }

    /**
     * Get Whether to perform an upgrade check only. Default value: false. 
     * @return CheckOnly Whether to perform an upgrade check only. Default value: false.
     */
    public Boolean getCheckOnly() {
        return this.CheckOnly;
    }

    /**
     * Set Whether to perform an upgrade check only. Default value: false.
     * @param CheckOnly Whether to perform an upgrade check only. Default value: false.
     */
    public void setCheckOnly(Boolean CheckOnly) {
        this.CheckOnly = CheckOnly;
    }

    /**
     * Get Target business feature version: <li>oss open source edition</li><li>basic edition</li>Currently used only when upgrading from 5.6.4 to 6.x. Default value: basic 
     * @return LicenseType Target business feature version: <li>oss open source edition</li><li>basic edition</li>Currently used only when upgrading from 5.6.4 to 6.x. Default value: basic
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Target business feature version: <li>oss open source edition</li><li>basic edition</li>Currently used only when upgrading from 5.6.4 to 6.x. Default value: basic
     * @param LicenseType Target business feature version: <li>oss open source edition</li><li>basic edition</li>Currently used only when upgrading from 5.6.4 to 6.x. Default value: basic
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li> 
     * @return BasicSecurityType Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li>
     */
    public Long getBasicSecurityType() {
        return this.BasicSecurityType;
    }

    /**
     * Set Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li>
     * @param BasicSecurityType Whether xpack security authentication is enabled for basic version 6.8 (and above versions)<li>1: not enabled</li><li>2: enabled</li>
     */
    public void setBasicSecurityType(Long BasicSecurityType) {
        this.BasicSecurityType = BasicSecurityType;
    }

    /**
     * Get Upgrade method: <li>scale blue-green change</li><li>restart rolling restart</li>Default value: scale 
     * @return UpgradeMode Upgrade method: <li>scale blue-green change</li><li>restart rolling restart</li>Default value: scale
     */
    public String getUpgradeMode() {
        return this.UpgradeMode;
    }

    /**
     * Set Upgrade method: <li>scale blue-green change</li><li>restart rolling restart</li>Default value: scale
     * @param UpgradeMode Upgrade method: <li>scale blue-green change</li><li>restart rolling restart</li>Default value: scale
     */
    public void setUpgradeMode(String UpgradeMode) {
        this.UpgradeMode = UpgradeMode;
    }

    /**
     * Get Whether to back up the cluster before upgrading the version. By default, no backup is performed. 
     * @return CosBackup Whether to back up the cluster before upgrading the version. By default, no backup is performed.
     */
    public Boolean getCosBackup() {
        return this.CosBackup;
    }

    /**
     * Set Whether to back up the cluster before upgrading the version. By default, no backup is performed.
     * @param CosBackup Whether to back up the cluster before upgrading the version. By default, no backup is performed.
     */
    public void setCosBackup(Boolean CosBackup) {
        this.CosBackup = CosBackup;
    }

    /**
     * Get In rolling mode, whether to skip the check and perform a forced reboot. Default value: false 
     * @return SkipCheckForceRestart In rolling mode, whether to skip the check and perform a forced reboot. Default value: false
     */
    public Boolean getSkipCheckForceRestart() {
        return this.SkipCheckForceRestart;
    }

    /**
     * Set In rolling mode, whether to skip the check and perform a forced reboot. Default value: false
     * @param SkipCheckForceRestart In rolling mode, whether to skip the check and perform a forced reboot. Default value: false
     */
    public void setSkipCheckForceRestart(Boolean SkipCheckForceRestart) {
        this.SkipCheckForceRestart = SkipCheckForceRestart;
    }

    /**
     * Get Parameter for delayed cvm launch 
     * @return CvmDelayOnlineTime Parameter for delayed cvm launch
     */
    public Long getCvmDelayOnlineTime() {
        return this.CvmDelayOnlineTime;
    }

    /**
     * Set Parameter for delayed cvm launch
     * @param CvmDelayOnlineTime Parameter for delayed cvm launch
     */
    public void setCvmDelayOnlineTime(Long CvmDelayOnlineTime) {
        this.CvmDelayOnlineTime = CvmDelayOnlineTime;
    }

    /**
     * Get Number of concurrent shard migrations 
     * @return ShardAllocationConcurrents Number of concurrent shard migrations
     */
    public Long getShardAllocationConcurrents() {
        return this.ShardAllocationConcurrents;
    }

    /**
     * Set Number of concurrent shard migrations
     * @param ShardAllocationConcurrents Number of concurrent shard migrations
     */
    public void setShardAllocationConcurrents(Long ShardAllocationConcurrents) {
        this.ShardAllocationConcurrents = ShardAllocationConcurrents;
    }

    /**
     * Get Shard migration concurrency speed 
     * @return ShardAllocationBytes Shard migration concurrency speed
     */
    public Long getShardAllocationBytes() {
        return this.ShardAllocationBytes;
    }

    /**
     * Set Shard migration concurrency speed
     * @param ShardAllocationBytes Shard migration concurrency speed
     */
    public void setShardAllocationBytes(Long ShardAllocationBytes) {
        this.ShardAllocationBytes = ShardAllocationBytes;
    }

    /**
     * Get Whether to enable the placement group asynchronous task 
     * @return EnableScheduleRecoverGroup Whether to enable the placement group asynchronous task
     */
    public Boolean getEnableScheduleRecoverGroup() {
        return this.EnableScheduleRecoverGroup;
    }

    /**
     * Set Whether to enable the placement group asynchronous task
     * @param EnableScheduleRecoverGroup Whether to enable the placement group asynchronous task
     */
    public void setEnableScheduleRecoverGroup(Boolean EnableScheduleRecoverGroup) {
        this.EnableScheduleRecoverGroup = EnableScheduleRecoverGroup;
    }

    /**
     * Get Time period of the async task for the placement group 
     * @return EnableScheduleOperationDuration Time period of the async task for the placement group
     */
    public EnableScheduleOperationDuration getEnableScheduleOperationDuration() {
        return this.EnableScheduleOperationDuration;
    }

    /**
     * Set Time period of the async task for the placement group
     * @param EnableScheduleOperationDuration Time period of the async task for the placement group
     */
    public void setEnableScheduleOperationDuration(EnableScheduleOperationDuration EnableScheduleOperationDuration) {
        this.EnableScheduleOperationDuration = EnableScheduleOperationDuration;
    }

    public UpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceRequest(UpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EsVersion != null) {
            this.EsVersion = new String(source.EsVersion);
        }
        if (source.CheckOnly != null) {
            this.CheckOnly = new Boolean(source.CheckOnly);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.BasicSecurityType != null) {
            this.BasicSecurityType = new Long(source.BasicSecurityType);
        }
        if (source.UpgradeMode != null) {
            this.UpgradeMode = new String(source.UpgradeMode);
        }
        if (source.CosBackup != null) {
            this.CosBackup = new Boolean(source.CosBackup);
        }
        if (source.SkipCheckForceRestart != null) {
            this.SkipCheckForceRestart = new Boolean(source.SkipCheckForceRestart);
        }
        if (source.CvmDelayOnlineTime != null) {
            this.CvmDelayOnlineTime = new Long(source.CvmDelayOnlineTime);
        }
        if (source.ShardAllocationConcurrents != null) {
            this.ShardAllocationConcurrents = new Long(source.ShardAllocationConcurrents);
        }
        if (source.ShardAllocationBytes != null) {
            this.ShardAllocationBytes = new Long(source.ShardAllocationBytes);
        }
        if (source.EnableScheduleRecoverGroup != null) {
            this.EnableScheduleRecoverGroup = new Boolean(source.EnableScheduleRecoverGroup);
        }
        if (source.EnableScheduleOperationDuration != null) {
            this.EnableScheduleOperationDuration = new EnableScheduleOperationDuration(source.EnableScheduleOperationDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EsVersion", this.EsVersion);
        this.setParamSimple(map, prefix + "CheckOnly", this.CheckOnly);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "BasicSecurityType", this.BasicSecurityType);
        this.setParamSimple(map, prefix + "UpgradeMode", this.UpgradeMode);
        this.setParamSimple(map, prefix + "CosBackup", this.CosBackup);
        this.setParamSimple(map, prefix + "SkipCheckForceRestart", this.SkipCheckForceRestart);
        this.setParamSimple(map, prefix + "CvmDelayOnlineTime", this.CvmDelayOnlineTime);
        this.setParamSimple(map, prefix + "ShardAllocationConcurrents", this.ShardAllocationConcurrents);
        this.setParamSimple(map, prefix + "ShardAllocationBytes", this.ShardAllocationBytes);
        this.setParamSimple(map, prefix + "EnableScheduleRecoverGroup", this.EnableScheduleRecoverGroup);
        this.setParamObj(map, prefix + "EnableScheduleOperationDuration.", this.EnableScheduleOperationDuration);

    }
}

