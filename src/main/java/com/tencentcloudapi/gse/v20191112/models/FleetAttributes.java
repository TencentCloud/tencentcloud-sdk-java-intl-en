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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FleetAttributes extends AbstractModel {

    /**
    * Asset package ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Server fleet creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Description
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Description of server fleet resource
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FleetArn")
    @Expose
    private String FleetArn;

    /**
    * Server fleet ID
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Server fleet type, which only supports ON_DEMAND now.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FleetType")
    @Expose
    private String FleetType;

    /**
    * Server type, such as S5.LARGE8
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Server fleet name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Game session protection policy
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("NewGameServerSessionProtectionPolicy")
    @Expose
    private String NewGameServerSessionProtectionPolicy;

    /**
    * Operating system type
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("OperatingSystem")
    @Expose
    private String OperatingSystem;

    /**
    * Limit policy of resource creation
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ResourceCreationLimitPolicy")
    @Expose
    private ResourceCreationLimitPolicy ResourceCreationLimitPolicy;

    /**
    * Statuses: “Create”, “Downloading”, “Verifying”, “Generating”, “Activating”, “Active”, “Exception”, “Deleting”, and “End”.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The status of server fleet when it stopped. If this field is left empty, it means automatic scaling.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("StoppedActions")
    @Expose
    private String [] StoppedActions;

    /**
    * Server fleet termination time
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("TerminationTime")
    @Expose
    private String TerminationTime;

    /**
    * Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("GameServerSessionProtectionTimeLimit")
    @Expose
    private Long GameServerSessionProtectionTimeLimit;

    /**
    * Billing status: Unactivated, Activated, Exception, Isolated due to arrears, Terminated, and Unfrozen.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("BillingStatus")
    @Expose
    private String BillingStatus;

    /**
    * Tag list. Up to 50 tags.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("DataDiskInfo")
    @Expose
    private DiskInfo [] DataDiskInfo;

    /**
    * System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("SystemDiskInfo")
    @Expose
    private DiskInfo SystemDiskInfo;

    /**
    * CCN instance information
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("RelatedCcnInfos")
    @Expose
    private RelatedCcnInfo [] RelatedCcnInfos;

    /**
    * Maximum outbound public network bandwidth of the server fleet. Value range: 1 - 200 Mbps. Default value: 100 Mbps.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

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
     * Get Server fleet creation time 
     * @return CreationTime Server fleet creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Server fleet creation time
     * @param CreationTime Server fleet creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Description
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Description Description
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Description Description
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Description of server fleet resource
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FleetArn Description of server fleet resource
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getFleetArn() {
        return this.FleetArn;
    }

    /**
     * Set Description of server fleet resource
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FleetArn Description of server fleet resource
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFleetArn(String FleetArn) {
        this.FleetArn = FleetArn;
    }

    /**
     * Get Server fleet ID
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FleetId Server fleet ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set Server fleet ID
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FleetId Server fleet ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Server fleet type, which only supports ON_DEMAND now.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FleetType Server fleet type, which only supports ON_DEMAND now.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getFleetType() {
        return this.FleetType;
    }

    /**
     * Set Server fleet type, which only supports ON_DEMAND now.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FleetType Server fleet type, which only supports ON_DEMAND now.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFleetType(String FleetType) {
        this.FleetType = FleetType;
    }

    /**
     * Get Server type, such as S5.LARGE8
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return InstanceType Server type, such as S5.LARGE8
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Server type, such as S5.LARGE8
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param InstanceType Server type, such as S5.LARGE8
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Server fleet name 
     * @return Name Server fleet name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Server fleet name
     * @param Name Server fleet name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Game session protection policy
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return NewGameServerSessionProtectionPolicy Game session protection policy
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getNewGameServerSessionProtectionPolicy() {
        return this.NewGameServerSessionProtectionPolicy;
    }

    /**
     * Set Game session protection policy
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param NewGameServerSessionProtectionPolicy Game session protection policy
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setNewGameServerSessionProtectionPolicy(String NewGameServerSessionProtectionPolicy) {
        this.NewGameServerSessionProtectionPolicy = NewGameServerSessionProtectionPolicy;
    }

    /**
     * Get Operating system type
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return OperatingSystem Operating system type
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getOperatingSystem() {
        return this.OperatingSystem;
    }

    /**
     * Set Operating system type
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param OperatingSystem Operating system type
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

    /**
     * Get Limit policy of resource creation
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ResourceCreationLimitPolicy Limit policy of resource creation
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.ResourceCreationLimitPolicy;
    }

    /**
     * Set Limit policy of resource creation
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ResourceCreationLimitPolicy Limit policy of resource creation
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy ResourceCreationLimitPolicy) {
        this.ResourceCreationLimitPolicy = ResourceCreationLimitPolicy;
    }

    /**
     * Get Statuses: “Create”, “Downloading”, “Verifying”, “Generating”, “Activating”, “Active”, “Exception”, “Deleting”, and “End”.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Status Statuses: “Create”, “Downloading”, “Verifying”, “Generating”, “Activating”, “Active”, “Exception”, “Deleting”, and “End”.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Statuses: “Create”, “Downloading”, “Verifying”, “Generating”, “Activating”, “Active”, “Exception”, “Deleting”, and “End”.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Status Statuses: “Create”, “Downloading”, “Verifying”, “Generating”, “Activating”, “Active”, “Exception”, “Deleting”, and “End”.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The status of server fleet when it stopped. If this field is left empty, it means automatic scaling.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return StoppedActions The status of server fleet when it stopped. If this field is left empty, it means automatic scaling.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String [] getStoppedActions() {
        return this.StoppedActions;
    }

    /**
     * Set The status of server fleet when it stopped. If this field is left empty, it means automatic scaling.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param StoppedActions The status of server fleet when it stopped. If this field is left empty, it means automatic scaling.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setStoppedActions(String [] StoppedActions) {
        this.StoppedActions = StoppedActions;
    }

    /**
     * Get Server fleet termination time
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return TerminationTime Server fleet termination time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getTerminationTime() {
        return this.TerminationTime;
    }

    /**
     * Set Server fleet termination time
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param TerminationTime Server fleet termination time
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setTerminationTime(String TerminationTime) {
        this.TerminationTime = TerminationTime;
    }

    /**
     * Get Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return GameServerSessionProtectionTimeLimit Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getGameServerSessionProtectionTimeLimit() {
        return this.GameServerSessionProtectionTimeLimit;
    }

    /**
     * Set Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param GameServerSessionProtectionTimeLimit Timeout period of time-limited protection. Value range: 5-1440 minutes. Default value: 60 minutes.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setGameServerSessionProtectionTimeLimit(Long GameServerSessionProtectionTimeLimit) {
        this.GameServerSessionProtectionTimeLimit = GameServerSessionProtectionTimeLimit;
    }

    /**
     * Get Billing status: Unactivated, Activated, Exception, Isolated due to arrears, Terminated, and Unfrozen.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return BillingStatus Billing status: Unactivated, Activated, Exception, Isolated due to arrears, Terminated, and Unfrozen.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getBillingStatus() {
        return this.BillingStatus;
    }

    /**
     * Set Billing status: Unactivated, Activated, Exception, Isolated due to arrears, Terminated, and Unfrozen.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param BillingStatus Billing status: Unactivated, Activated, Exception, Isolated due to arrears, Terminated, and Unfrozen.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setBillingStatus(String BillingStatus) {
        this.BillingStatus = BillingStatus;
    }

    /**
     * Get Tag list. Up to 50 tags.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Tags Tag list. Up to 50 tags.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list. Up to 50 tags.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Tags Tag list. Up to 50 tags.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return DataDiskInfo Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public DiskInfo [] getDataDiskInfo() {
        return this.DataDiskInfo;
    }

    /**
     * Set Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param DataDiskInfo Data disk. It can be SSD disks (CLOUD_SSD) with 100-32000 GB capacity or Premium Cloud Storage disks (CLOUD_PREMIUM) with 10-32000 GB capacity. The increment is 10. 
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setDataDiskInfo(DiskInfo [] DataDiskInfo) {
        this.DataDiskInfo = DataDiskInfo;
    }

    /**
     * Get System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return SystemDiskInfo System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public DiskInfo getSystemDiskInfo() {
        return this.SystemDiskInfo;
    }

    /**
     * Set System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param SystemDiskInfo System disk. It can be a SSD (CLOUD_SSD) with 100-500 GB capacity or a Premium Cloud Storage disk (CLOUD_PREMIUM) with 50-500 GB capacity. The increment is 1.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setSystemDiskInfo(DiskInfo SystemDiskInfo) {
        this.SystemDiskInfo = SystemDiskInfo;
    }

    /**
     * Get CCN instance information
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return RelatedCcnInfos CCN instance information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public RelatedCcnInfo [] getRelatedCcnInfos() {
        return this.RelatedCcnInfos;
    }

    /**
     * Set CCN instance information
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param RelatedCcnInfos CCN instance information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRelatedCcnInfos(RelatedCcnInfo [] RelatedCcnInfos) {
        this.RelatedCcnInfos = RelatedCcnInfos;
    }

    /**
     * Get Maximum outbound public network bandwidth of the server fleet. Value range: 1 - 200 Mbps. Default value: 100 Mbps.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return InternetMaxBandwidthOut Maximum outbound public network bandwidth of the server fleet. Value range: 1 - 200 Mbps. Default value: 100 Mbps.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Maximum outbound public network bandwidth of the server fleet. Value range: 1 - 200 Mbps. Default value: 100 Mbps.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param InternetMaxBandwidthOut Maximum outbound public network bandwidth of the server fleet. Value range: 1 - 200 Mbps. Default value: 100 Mbps.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    public FleetAttributes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FleetAttributes(FleetAttributes source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FleetArn != null) {
            this.FleetArn = new String(source.FleetArn);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.FleetType != null) {
            this.FleetType = new String(source.FleetType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NewGameServerSessionProtectionPolicy != null) {
            this.NewGameServerSessionProtectionPolicy = new String(source.NewGameServerSessionProtectionPolicy);
        }
        if (source.OperatingSystem != null) {
            this.OperatingSystem = new String(source.OperatingSystem);
        }
        if (source.ResourceCreationLimitPolicy != null) {
            this.ResourceCreationLimitPolicy = new ResourceCreationLimitPolicy(source.ResourceCreationLimitPolicy);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StoppedActions != null) {
            this.StoppedActions = new String[source.StoppedActions.length];
            for (int i = 0; i < source.StoppedActions.length; i++) {
                this.StoppedActions[i] = new String(source.StoppedActions[i]);
            }
        }
        if (source.TerminationTime != null) {
            this.TerminationTime = new String(source.TerminationTime);
        }
        if (source.GameServerSessionProtectionTimeLimit != null) {
            this.GameServerSessionProtectionTimeLimit = new Long(source.GameServerSessionProtectionTimeLimit);
        }
        if (source.BillingStatus != null) {
            this.BillingStatus = new String(source.BillingStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DataDiskInfo != null) {
            this.DataDiskInfo = new DiskInfo[source.DataDiskInfo.length];
            for (int i = 0; i < source.DataDiskInfo.length; i++) {
                this.DataDiskInfo[i] = new DiskInfo(source.DataDiskInfo[i]);
            }
        }
        if (source.SystemDiskInfo != null) {
            this.SystemDiskInfo = new DiskInfo(source.SystemDiskInfo);
        }
        if (source.RelatedCcnInfos != null) {
            this.RelatedCcnInfos = new RelatedCcnInfo[source.RelatedCcnInfos.length];
            for (int i = 0; i < source.RelatedCcnInfos.length; i++) {
                this.RelatedCcnInfos[i] = new RelatedCcnInfo(source.RelatedCcnInfos[i]);
            }
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FleetArn", this.FleetArn);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "FleetType", this.FleetType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NewGameServerSessionProtectionPolicy", this.NewGameServerSessionProtectionPolicy);
        this.setParamSimple(map, prefix + "OperatingSystem", this.OperatingSystem);
        this.setParamObj(map, prefix + "ResourceCreationLimitPolicy.", this.ResourceCreationLimitPolicy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "StoppedActions.", this.StoppedActions);
        this.setParamSimple(map, prefix + "TerminationTime", this.TerminationTime);
        this.setParamSimple(map, prefix + "GameServerSessionProtectionTimeLimit", this.GameServerSessionProtectionTimeLimit);
        this.setParamSimple(map, prefix + "BillingStatus", this.BillingStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "DataDiskInfo.", this.DataDiskInfo);
        this.setParamObj(map, prefix + "SystemDiskInfo.", this.SystemDiskInfo);
        this.setParamArrayObj(map, prefix + "RelatedCcnInfos.", this.RelatedCcnInfos);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);

    }
}

