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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyFleetRequest extends AbstractModel{

    /**
    * Server fleet ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Replica number. It should a value between 1 to the number of the remaining quota. It can be obtained through [Obtaining User Quota](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1).
    */
    @SerializedName("CopyNumber")
    @Expose
    private Long CopyNumber;

    /**
    * Asset package ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Description. The length is 0-100 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Network configuration
    */
    @SerializedName("InboundPermissions")
    @Expose
    private InboundPermission [] InboundPermissions;

    /**
    * Server type. It can be obtained through [Obtaining Server Instance Type List](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1).
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Server fleet type, which only supports “ON_DEMAND” type now.
    */
    @SerializedName("FleetType")
    @Expose
    private String FleetType;

    /**
    * Server fleet name. The length is 1-50 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Protection policy. Valid values: NoProtection·(no protection), FullProtection (full protection), TimeLimitProtection (time-limited protection)
    */
    @SerializedName("NewGameServerSessionProtectionPolicy")
    @Expose
    private String NewGameServerSessionProtectionPolicy;

    /**
    * Limit policy of resource creation
    */
    @SerializedName("ResourceCreationLimitPolicy")
    @Expose
    private ResourceCreationLimitPolicy ResourceCreationLimitPolicy;

    /**
    * Progress configuration
    */
    @SerializedName("RuntimeConfiguration")
    @Expose
    private RuntimeConfiguration RuntimeConfiguration;

    /**
    * Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes. This parameter is valid only when NewGameSessionProtectionPolicy is set as TimeLimitProtection.
    */
    @SerializedName("GameServerSessionProtectionTimeLimit")
    @Expose
    private Long GameServerSessionProtectionTimeLimit;

    /**
    * Whether to select scaling. Valid values: SCALING_SELECTED, SCALING_UNSELECTED. Default value: SCALING_UNSELECTED.
    */
    @SerializedName("SelectedScalingType")
    @Expose
    private String SelectedScalingType;

    /**
    * Whether to select CCN. Valid values: CCN_SELECTED, CCN_UNSELECTED. Default value: CCN_UNSELECTED.
    */
    @SerializedName("SelectedCcnType")
    @Expose
    private String SelectedCcnType;

    /**
    * Tag list. Up to 50 tags.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
    */
    @SerializedName("SystemDiskInfo")
    @Expose
    private DiskInfo SystemDiskInfo;

    /**
    * Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
    */
    @SerializedName("DataDiskInfo")
    @Expose
    private DiskInfo [] DataDiskInfo;

    /**
    * Whether to select to replicate the timer policy: TIMER_SELECTED or TIMER_UNSELECTED. The default value is TIMER_UNSELECTED.
    */
    @SerializedName("SelectedTimerType")
    @Expose
    private String SelectedTimerType;

    /**
     * Get Server fleet ID 
     * @return FleetId Server fleet ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set Server fleet ID
     * @param FleetId Server fleet ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Replica number. It should a value between 1 to the number of the remaining quota. It can be obtained through [Obtaining User Quota](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1). 
     * @return CopyNumber Replica number. It should a value between 1 to the number of the remaining quota. It can be obtained through [Obtaining User Quota](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1).
     */
    public Long getCopyNumber() {
        return this.CopyNumber;
    }

    /**
     * Set Replica number. It should a value between 1 to the number of the remaining quota. It can be obtained through [Obtaining User Quota](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1).
     * @param CopyNumber Replica number. It should a value between 1 to the number of the remaining quota. It can be obtained through [Obtaining User Quota](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1).
     */
    public void setCopyNumber(Long CopyNumber) {
        this.CopyNumber = CopyNumber;
    }

    /**
     * Get Asset package ID 
     * @return AssetId Asset package ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset package ID
     * @param AssetId Asset package ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Description. The length is 0-100 characters. 
     * @return Description Description. The length is 0-100 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description. The length is 0-100 characters.
     * @param Description Description. The length is 0-100 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Network configuration 
     * @return InboundPermissions Network configuration
     */
    public InboundPermission [] getInboundPermissions() {
        return this.InboundPermissions;
    }

    /**
     * Set Network configuration
     * @param InboundPermissions Network configuration
     */
    public void setInboundPermissions(InboundPermission [] InboundPermissions) {
        this.InboundPermissions = InboundPermissions;
    }

    /**
     * Get Server type. It can be obtained through [Obtaining Server Instance Type List](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1). 
     * @return InstanceType Server type. It can be obtained through [Obtaining Server Instance Type List](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1).
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Server type. It can be obtained through [Obtaining Server Instance Type List](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1).
     * @param InstanceType Server type. It can be obtained through [Obtaining Server Instance Type List](https://intl.cloud.tencent.com/document/product/1165/48732?from_cn_redirect=1).
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Server fleet type, which only supports “ON_DEMAND” type now. 
     * @return FleetType Server fleet type, which only supports “ON_DEMAND” type now.
     */
    public String getFleetType() {
        return this.FleetType;
    }

    /**
     * Set Server fleet type, which only supports “ON_DEMAND” type now.
     * @param FleetType Server fleet type, which only supports “ON_DEMAND” type now.
     */
    public void setFleetType(String FleetType) {
        this.FleetType = FleetType;
    }

    /**
     * Get Server fleet name. The length is 1-50 characters. 
     * @return Name Server fleet name. The length is 1-50 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Server fleet name. The length is 1-50 characters.
     * @param Name Server fleet name. The length is 1-50 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Protection policy. Valid values: NoProtection·(no protection), FullProtection (full protection), TimeLimitProtection (time-limited protection) 
     * @return NewGameServerSessionProtectionPolicy Protection policy. Valid values: NoProtection·(no protection), FullProtection (full protection), TimeLimitProtection (time-limited protection)
     */
    public String getNewGameServerSessionProtectionPolicy() {
        return this.NewGameServerSessionProtectionPolicy;
    }

    /**
     * Set Protection policy. Valid values: NoProtection·(no protection), FullProtection (full protection), TimeLimitProtection (time-limited protection)
     * @param NewGameServerSessionProtectionPolicy Protection policy. Valid values: NoProtection·(no protection), FullProtection (full protection), TimeLimitProtection (time-limited protection)
     */
    public void setNewGameServerSessionProtectionPolicy(String NewGameServerSessionProtectionPolicy) {
        this.NewGameServerSessionProtectionPolicy = NewGameServerSessionProtectionPolicy;
    }

    /**
     * Get Limit policy of resource creation 
     * @return ResourceCreationLimitPolicy Limit policy of resource creation
     */
    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.ResourceCreationLimitPolicy;
    }

    /**
     * Set Limit policy of resource creation
     * @param ResourceCreationLimitPolicy Limit policy of resource creation
     */
    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy ResourceCreationLimitPolicy) {
        this.ResourceCreationLimitPolicy = ResourceCreationLimitPolicy;
    }

    /**
     * Get Progress configuration 
     * @return RuntimeConfiguration Progress configuration
     */
    public RuntimeConfiguration getRuntimeConfiguration() {
        return this.RuntimeConfiguration;
    }

    /**
     * Set Progress configuration
     * @param RuntimeConfiguration Progress configuration
     */
    public void setRuntimeConfiguration(RuntimeConfiguration RuntimeConfiguration) {
        this.RuntimeConfiguration = RuntimeConfiguration;
    }

    /**
     * Get Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes. This parameter is valid only when NewGameSessionProtectionPolicy is set as TimeLimitProtection. 
     * @return GameServerSessionProtectionTimeLimit Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes. This parameter is valid only when NewGameSessionProtectionPolicy is set as TimeLimitProtection.
     */
    public Long getGameServerSessionProtectionTimeLimit() {
        return this.GameServerSessionProtectionTimeLimit;
    }

    /**
     * Set Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes. This parameter is valid only when NewGameSessionProtectionPolicy is set as TimeLimitProtection.
     * @param GameServerSessionProtectionTimeLimit Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes. This parameter is valid only when NewGameSessionProtectionPolicy is set as TimeLimitProtection.
     */
    public void setGameServerSessionProtectionTimeLimit(Long GameServerSessionProtectionTimeLimit) {
        this.GameServerSessionProtectionTimeLimit = GameServerSessionProtectionTimeLimit;
    }

    /**
     * Get Whether to select scaling. Valid values: SCALING_SELECTED, SCALING_UNSELECTED. Default value: SCALING_UNSELECTED. 
     * @return SelectedScalingType Whether to select scaling. Valid values: SCALING_SELECTED, SCALING_UNSELECTED. Default value: SCALING_UNSELECTED.
     */
    public String getSelectedScalingType() {
        return this.SelectedScalingType;
    }

    /**
     * Set Whether to select scaling. Valid values: SCALING_SELECTED, SCALING_UNSELECTED. Default value: SCALING_UNSELECTED.
     * @param SelectedScalingType Whether to select scaling. Valid values: SCALING_SELECTED, SCALING_UNSELECTED. Default value: SCALING_UNSELECTED.
     */
    public void setSelectedScalingType(String SelectedScalingType) {
        this.SelectedScalingType = SelectedScalingType;
    }

    /**
     * Get Whether to select CCN. Valid values: CCN_SELECTED, CCN_UNSELECTED. Default value: CCN_UNSELECTED. 
     * @return SelectedCcnType Whether to select CCN. Valid values: CCN_SELECTED, CCN_UNSELECTED. Default value: CCN_UNSELECTED.
     */
    public String getSelectedCcnType() {
        return this.SelectedCcnType;
    }

    /**
     * Set Whether to select CCN. Valid values: CCN_SELECTED, CCN_UNSELECTED. Default value: CCN_UNSELECTED.
     * @param SelectedCcnType Whether to select CCN. Valid values: CCN_SELECTED, CCN_UNSELECTED. Default value: CCN_UNSELECTED.
     */
    public void setSelectedCcnType(String SelectedCcnType) {
        this.SelectedCcnType = SelectedCcnType;
    }

    /**
     * Get Tag list. Up to 50 tags. 
     * @return Tags Tag list. Up to 50 tags.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list. Up to 50 tags.
     * @param Tags Tag list. Up to 50 tags.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1. 
     * @return SystemDiskInfo System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
     */
    public DiskInfo getSystemDiskInfo() {
        return this.SystemDiskInfo;
    }

    /**
     * Set System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
     * @param SystemDiskInfo System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
     */
    public void setSystemDiskInfo(DiskInfo SystemDiskInfo) {
        this.SystemDiskInfo = SystemDiskInfo;
    }

    /**
     * Get Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10.  
     * @return DataDiskInfo Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
     */
    public DiskInfo [] getDataDiskInfo() {
        return this.DataDiskInfo;
    }

    /**
     * Set Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
     * @param DataDiskInfo Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
     */
    public void setDataDiskInfo(DiskInfo [] DataDiskInfo) {
        this.DataDiskInfo = DataDiskInfo;
    }

    /**
     * Get Whether to select to replicate the timer policy: TIMER_SELECTED or TIMER_UNSELECTED. The default value is TIMER_UNSELECTED. 
     * @return SelectedTimerType Whether to select to replicate the timer policy: TIMER_SELECTED or TIMER_UNSELECTED. The default value is TIMER_UNSELECTED.
     */
    public String getSelectedTimerType() {
        return this.SelectedTimerType;
    }

    /**
     * Set Whether to select to replicate the timer policy: TIMER_SELECTED or TIMER_UNSELECTED. The default value is TIMER_UNSELECTED.
     * @param SelectedTimerType Whether to select to replicate the timer policy: TIMER_SELECTED or TIMER_UNSELECTED. The default value is TIMER_UNSELECTED.
     */
    public void setSelectedTimerType(String SelectedTimerType) {
        this.SelectedTimerType = SelectedTimerType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "CopyNumber", this.CopyNumber);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "InboundPermissions.", this.InboundPermissions);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "FleetType", this.FleetType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NewGameServerSessionProtectionPolicy", this.NewGameServerSessionProtectionPolicy);
        this.setParamObj(map, prefix + "ResourceCreationLimitPolicy.", this.ResourceCreationLimitPolicy);
        this.setParamObj(map, prefix + "RuntimeConfiguration.", this.RuntimeConfiguration);
        this.setParamSimple(map, prefix + "GameServerSessionProtectionTimeLimit", this.GameServerSessionProtectionTimeLimit);
        this.setParamSimple(map, prefix + "SelectedScalingType", this.SelectedScalingType);
        this.setParamSimple(map, prefix + "SelectedCcnType", this.SelectedCcnType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "SystemDiskInfo.", this.SystemDiskInfo);
        this.setParamArrayObj(map, prefix + "DataDiskInfo.", this.DataDiskInfo);
        this.setParamSimple(map, prefix + "SelectedTimerType", this.SelectedTimerType);

    }
}

