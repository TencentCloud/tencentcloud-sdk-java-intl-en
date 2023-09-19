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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudReadOnlyDBInstancesRequest extends AbstractModel{

    /**
    * Instance ID in the format of  `mssql-3l3fgqn7`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance AZ, such as `ap-guangzhou-1` (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Read-only group types. Valid values: `1` (each read-only replica is placed in one auto-created read-only group), `2` (all read-only replicas are placed in one auto-created read-only group), `3` (all read-only replicas are placed in one existing read-only group).
    */
    @SerializedName("ReadOnlyGroupType")
    @Expose
    private Long ReadOnlyGroupType;

    /**
    * Instance memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Number of instance cores
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * The host type of purchased instance. Valid values: `CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD).
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Valid values: `0` (not upgrade the primary instance by default), `1` (upgrade the primary instance to complete the RO deployment).  You need to pass in `1` for this parameter and upgrade the primary instance to cluster edition.
    */
    @SerializedName("ReadOnlyGroupForcedUpgrade")
    @Expose
    private Long ReadOnlyGroupForcedUpgrade;

    /**
    * Existing read-only group ID, which is required when `ReadOnlyGroupType` is `3`.
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * New read-only group ID, which is required when `ReadOnlyGroupType` is `2`.
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * Whether delayed read-only instance removal is enabled in a new read-only group, which is required when `ReadOnlyGroupType` is `2`. Valid values: `1` (enabled), `0` (disabled).  The read-only replica will be automatically removed when the delay between it and the primary instance exceeds the threshold.
    */
    @SerializedName("ReadOnlyGroupIsOfflineDelay")
    @Expose
    private Long ReadOnlyGroupIsOfflineDelay;

    /**
    * The delay threshold for a new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`.
    */
    @SerializedName("ReadOnlyGroupMaxDelayTime")
    @Expose
    private Long ReadOnlyGroupMaxDelayTime;

    /**
    * Minimum number of reserved read-only replicas when the delayed removal is enabled for the new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`.
    */
    @SerializedName("ReadOnlyGroupMinInGroup")
    @Expose
    private Long ReadOnlyGroupMinInGroup;

    /**
    * Billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID` (pay-as-you-go).
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Number of read-only instances to be purchased this time. Default value: `2`.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * VPC subnet ID in the format of `subnet-bdoe83fa`. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC ID in the format of `vpc-dsp338hz`. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The purchase period of an instance. Default value: `1` (one month).  Maximum value: `48`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Security group list, which contains security group IDs in the format of `sg-xxx`.
    */
    @SerializedName("SecurityGroupList")
    @Expose
    private String [] SecurityGroupList;

    /**
    * Whether to automatically use voucher. Valid values: `0` (no, default), `1` (yes).
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Array of voucher IDs (currently, only one voucher can be used per order)
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Tags associated with the instances to be created
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * Collation of system character sets. Default value:  Chinese_PRC_CI_AS
    */
    @SerializedName("Collation")
    @Expose
    private String Collation;

    /**
    * System time zone. Default value:  `China Standard Time`
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Instance ID in the format of  `mssql-3l3fgqn7`. 
     * @return InstanceId Instance ID in the format of  `mssql-3l3fgqn7`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of  `mssql-3l3fgqn7`.
     * @param InstanceId Instance ID in the format of  `mssql-3l3fgqn7`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance AZ, such as `ap-guangzhou-1` (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API. 
     * @return Zone Instance AZ, such as `ap-guangzhou-1` (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ, such as `ap-guangzhou-1` (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API.
     * @param Zone Instance AZ, such as `ap-guangzhou-1` (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Read-only group types. Valid values: `1` (each read-only replica is placed in one auto-created read-only group), `2` (all read-only replicas are placed in one auto-created read-only group), `3` (all read-only replicas are placed in one existing read-only group). 
     * @return ReadOnlyGroupType Read-only group types. Valid values: `1` (each read-only replica is placed in one auto-created read-only group), `2` (all read-only replicas are placed in one auto-created read-only group), `3` (all read-only replicas are placed in one existing read-only group).
     */
    public Long getReadOnlyGroupType() {
        return this.ReadOnlyGroupType;
    }

    /**
     * Set Read-only group types. Valid values: `1` (each read-only replica is placed in one auto-created read-only group), `2` (all read-only replicas are placed in one auto-created read-only group), `3` (all read-only replicas are placed in one existing read-only group).
     * @param ReadOnlyGroupType Read-only group types. Valid values: `1` (each read-only replica is placed in one auto-created read-only group), `2` (all read-only replicas are placed in one auto-created read-only group), `3` (all read-only replicas are placed in one existing read-only group).
     */
    public void setReadOnlyGroupType(Long ReadOnlyGroupType) {
        this.ReadOnlyGroupType = ReadOnlyGroupType;
    }

    /**
     * Get Instance memory size in GB 
     * @return Memory Instance memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB
     * @param Memory Instance memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GB 
     * @return Storage Instance disk size in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance disk size in GB
     * @param Storage Instance disk size in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Number of instance cores 
     * @return Cpu Number of instance cores
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of instance cores
     * @param Cpu Number of instance cores
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get The host type of purchased instance. Valid values: `CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD). 
     * @return MachineType The host type of purchased instance. Valid values: `CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD).
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set The host type of purchased instance. Valid values: `CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD).
     * @param MachineType The host type of purchased instance. Valid values: `CLOUD_HSSD` (virtual machine with enhanced SSD), `CLOUD_TSSD` (virtual machine with ulTra SSD), `CLOUD_BSSD` (virtual machine with balanced SSD).
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Valid values: `0` (not upgrade the primary instance by default), `1` (upgrade the primary instance to complete the RO deployment).  You need to pass in `1` for this parameter and upgrade the primary instance to cluster edition. 
     * @return ReadOnlyGroupForcedUpgrade Valid values: `0` (not upgrade the primary instance by default), `1` (upgrade the primary instance to complete the RO deployment).  You need to pass in `1` for this parameter and upgrade the primary instance to cluster edition.
     */
    public Long getReadOnlyGroupForcedUpgrade() {
        return this.ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Set Valid values: `0` (not upgrade the primary instance by default), `1` (upgrade the primary instance to complete the RO deployment).  You need to pass in `1` for this parameter and upgrade the primary instance to cluster edition.
     * @param ReadOnlyGroupForcedUpgrade Valid values: `0` (not upgrade the primary instance by default), `1` (upgrade the primary instance to complete the RO deployment).  You need to pass in `1` for this parameter and upgrade the primary instance to cluster edition.
     */
    public void setReadOnlyGroupForcedUpgrade(Long ReadOnlyGroupForcedUpgrade) {
        this.ReadOnlyGroupForcedUpgrade = ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Get Existing read-only group ID, which is required when `ReadOnlyGroupType` is `3`. 
     * @return ReadOnlyGroupId Existing read-only group ID, which is required when `ReadOnlyGroupType` is `3`.
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set Existing read-only group ID, which is required when `ReadOnlyGroupType` is `3`.
     * @param ReadOnlyGroupId Existing read-only group ID, which is required when `ReadOnlyGroupType` is `3`.
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get New read-only group ID, which is required when `ReadOnlyGroupType` is `2`. 
     * @return ReadOnlyGroupName New read-only group ID, which is required when `ReadOnlyGroupType` is `2`.
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set New read-only group ID, which is required when `ReadOnlyGroupType` is `2`.
     * @param ReadOnlyGroupName New read-only group ID, which is required when `ReadOnlyGroupType` is `2`.
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get Whether delayed read-only instance removal is enabled in a new read-only group, which is required when `ReadOnlyGroupType` is `2`. Valid values: `1` (enabled), `0` (disabled).  The read-only replica will be automatically removed when the delay between it and the primary instance exceeds the threshold. 
     * @return ReadOnlyGroupIsOfflineDelay Whether delayed read-only instance removal is enabled in a new read-only group, which is required when `ReadOnlyGroupType` is `2`. Valid values: `1` (enabled), `0` (disabled).  The read-only replica will be automatically removed when the delay between it and the primary instance exceeds the threshold.
     */
    public Long getReadOnlyGroupIsOfflineDelay() {
        return this.ReadOnlyGroupIsOfflineDelay;
    }

    /**
     * Set Whether delayed read-only instance removal is enabled in a new read-only group, which is required when `ReadOnlyGroupType` is `2`. Valid values: `1` (enabled), `0` (disabled).  The read-only replica will be automatically removed when the delay between it and the primary instance exceeds the threshold.
     * @param ReadOnlyGroupIsOfflineDelay Whether delayed read-only instance removal is enabled in a new read-only group, which is required when `ReadOnlyGroupType` is `2`. Valid values: `1` (enabled), `0` (disabled).  The read-only replica will be automatically removed when the delay between it and the primary instance exceeds the threshold.
     */
    public void setReadOnlyGroupIsOfflineDelay(Long ReadOnlyGroupIsOfflineDelay) {
        this.ReadOnlyGroupIsOfflineDelay = ReadOnlyGroupIsOfflineDelay;
    }

    /**
     * Get The delay threshold for a new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`. 
     * @return ReadOnlyGroupMaxDelayTime The delay threshold for a new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`.
     */
    public Long getReadOnlyGroupMaxDelayTime() {
        return this.ReadOnlyGroupMaxDelayTime;
    }

    /**
     * Set The delay threshold for a new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`.
     * @param ReadOnlyGroupMaxDelayTime The delay threshold for a new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`.
     */
    public void setReadOnlyGroupMaxDelayTime(Long ReadOnlyGroupMaxDelayTime) {
        this.ReadOnlyGroupMaxDelayTime = ReadOnlyGroupMaxDelayTime;
    }

    /**
     * Get Minimum number of reserved read-only replicas when the delayed removal is enabled for the new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`. 
     * @return ReadOnlyGroupMinInGroup Minimum number of reserved read-only replicas when the delayed removal is enabled for the new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`.
     */
    public Long getReadOnlyGroupMinInGroup() {
        return this.ReadOnlyGroupMinInGroup;
    }

    /**
     * Set Minimum number of reserved read-only replicas when the delayed removal is enabled for the new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`.
     * @param ReadOnlyGroupMinInGroup Minimum number of reserved read-only replicas when the delayed removal is enabled for the new read-only group, which is required when `ReadOnlyGroupType` is `2` and `ReadOnlyGroupIsOfflineDelay` is `1`.
     */
    public void setReadOnlyGroupMinInGroup(Long ReadOnlyGroupMinInGroup) {
        this.ReadOnlyGroupMinInGroup = ReadOnlyGroupMinInGroup;
    }

    /**
     * Get Billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID` (pay-as-you-go). 
     * @return InstanceChargeType Billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID` (pay-as-you-go).
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID` (pay-as-you-go).
     * @param InstanceChargeType Billing mode. Valid values: `PREPAID` (monthly subscription), `POSTPAID` (pay-as-you-go).
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Number of read-only instances to be purchased this time. Default value: `2`. 
     * @return GoodsNum Number of read-only instances to be purchased this time. Default value: `2`.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of read-only instances to be purchased this time. Default value: `2`.
     * @param GoodsNum Number of read-only instances to be purchased this time. Default value: `2`.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get VPC subnet ID in the format of `subnet-bdoe83fa`. Both `SubnetId` and `VpcId` need to be set or unset at the same time. 
     * @return SubnetId VPC subnet ID in the format of `subnet-bdoe83fa`. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID in the format of `subnet-bdoe83fa`. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     * @param SubnetId VPC subnet ID in the format of `subnet-bdoe83fa`. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC ID in the format of `vpc-dsp338hz`. Both `SubnetId` and `VpcId` need to be set or unset at the same time. 
     * @return VpcId VPC ID in the format of `vpc-dsp338hz`. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of `vpc-dsp338hz`. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     * @param VpcId VPC ID in the format of `vpc-dsp338hz`. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The purchase period of an instance. Default value: `1` (one month).  Maximum value: `48`. 
     * @return Period The purchase period of an instance. Default value: `1` (one month).  Maximum value: `48`.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set The purchase period of an instance. Default value: `1` (one month).  Maximum value: `48`.
     * @param Period The purchase period of an instance. Default value: `1` (one month).  Maximum value: `48`.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Security group list, which contains security group IDs in the format of `sg-xxx`. 
     * @return SecurityGroupList Security group list, which contains security group IDs in the format of `sg-xxx`.
     */
    public String [] getSecurityGroupList() {
        return this.SecurityGroupList;
    }

    /**
     * Set Security group list, which contains security group IDs in the format of `sg-xxx`.
     * @param SecurityGroupList Security group list, which contains security group IDs in the format of `sg-xxx`.
     */
    public void setSecurityGroupList(String [] SecurityGroupList) {
        this.SecurityGroupList = SecurityGroupList;
    }

    /**
     * Get Whether to automatically use voucher. Valid values: `0` (no, default), `1` (yes). 
     * @return AutoVoucher Whether to automatically use voucher. Valid values: `0` (no, default), `1` (yes).
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use voucher. Valid values: `0` (no, default), `1` (yes).
     * @param AutoVoucher Whether to automatically use voucher. Valid values: `0` (no, default), `1` (yes).
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Array of voucher IDs (currently, only one voucher can be used per order) 
     * @return VoucherIds Array of voucher IDs (currently, only one voucher can be used per order)
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Array of voucher IDs (currently, only one voucher can be used per order)
     * @param VoucherIds Array of voucher IDs (currently, only one voucher can be used per order)
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Tags associated with the instances to be created 
     * @return ResourceTags Tags associated with the instances to be created
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Tags associated with the instances to be created
     * @param ResourceTags Tags associated with the instances to be created
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Collation of system character sets. Default value:  Chinese_PRC_CI_AS 
     * @return Collation Collation of system character sets. Default value:  Chinese_PRC_CI_AS
     */
    public String getCollation() {
        return this.Collation;
    }

    /**
     * Set Collation of system character sets. Default value:  Chinese_PRC_CI_AS
     * @param Collation Collation of system character sets. Default value:  Chinese_PRC_CI_AS
     */
    public void setCollation(String Collation) {
        this.Collation = Collation;
    }

    /**
     * Get System time zone. Default value:  `China Standard Time` 
     * @return TimeZone System time zone. Default value:  `China Standard Time`
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set System time zone. Default value:  `China Standard Time`
     * @param TimeZone System time zone. Default value:  `China Standard Time`
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public CreateCloudReadOnlyDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudReadOnlyDBInstancesRequest(CreateCloudReadOnlyDBInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ReadOnlyGroupType != null) {
            this.ReadOnlyGroupType = new Long(source.ReadOnlyGroupType);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.ReadOnlyGroupForcedUpgrade != null) {
            this.ReadOnlyGroupForcedUpgrade = new Long(source.ReadOnlyGroupForcedUpgrade);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.ReadOnlyGroupIsOfflineDelay != null) {
            this.ReadOnlyGroupIsOfflineDelay = new Long(source.ReadOnlyGroupIsOfflineDelay);
        }
        if (source.ReadOnlyGroupMaxDelayTime != null) {
            this.ReadOnlyGroupMaxDelayTime = new Long(source.ReadOnlyGroupMaxDelayTime);
        }
        if (source.ReadOnlyGroupMinInGroup != null) {
            this.ReadOnlyGroupMinInGroup = new Long(source.ReadOnlyGroupMinInGroup);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.SecurityGroupList != null) {
            this.SecurityGroupList = new String[source.SecurityGroupList.length];
            for (int i = 0; i < source.SecurityGroupList.length; i++) {
                this.SecurityGroupList[i] = new String(source.SecurityGroupList[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.Collation != null) {
            this.Collation = new String(source.Collation);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ReadOnlyGroupType", this.ReadOnlyGroupType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "ReadOnlyGroupForcedUpgrade", this.ReadOnlyGroupForcedUpgrade);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "ReadOnlyGroupIsOfflineDelay", this.ReadOnlyGroupIsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyGroupMaxDelayTime", this.ReadOnlyGroupMaxDelayTime);
        this.setParamSimple(map, prefix + "ReadOnlyGroupMinInGroup", this.ReadOnlyGroupMinInGroup);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "SecurityGroupList.", this.SecurityGroupList);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Collation", this.Collation);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

