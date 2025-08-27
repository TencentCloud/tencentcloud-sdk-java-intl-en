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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceTradeParameterRequest extends AbstractModel {

    /**
    * Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the `DescribeZones` API.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Number of CPU cores.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance memory size in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance storage capacity in GB.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Type of purchased instances. HA: high-availability edition (including dual-server high-availability edition and Always On cluster edition); RO: read-only replica edition; SI: single-node edition; BI: business intelligence edition; cvmHA: new high-availability edition; cvmRO: new read-only replica edition; MultiHA: multi-node edition; cvmMultiHA: multi-node cloud disk edition.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Host disk type of purchased instances. CLOUD_HSSD - Enhanced SSD for CVMs, CLOUD_TSSD - Tremendous SSD for CVMs, CLOUD_BSSD - Balanced SSD for CVMs. 
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Billing mode. Valid value: POSTPAID (pay-as-you-go).
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Number of instances purchased this time. Default value: 1. Maximum value: 10.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * SQL Server version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), 201402 (SQL Server 2014 Standard), `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The available version varies by region, and you can pull the version information by calling the `DescribeProductConfig` API.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * VPC subnet ID in the format of subnet-bdoe83fa. `SubnetId` and `VpcId` should be set or ignored simultaneously.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC ID in the format of vpc-dsp338hz. `SubnetId` and `VpcId` should be set or ignored simultaneously.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Length of purchase of instance. The default value is 1, indicating one month. The value cannot exceed 48.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Security group list, which contains security group IDs in the format of sg-xxx.
    */
    @SerializedName("SecurityGroupList")
    @Expose
    private String [] SecurityGroupList;

    /**
    * Auto-renewal flag. 0: normal renewal, 1: auto-renewal. Default value: 1.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: 1 (Monday), 2 (Tuesday), 3 (Wednesday), 4 (Thursday), 5 (Friday), 6 (Saturday), 7 (Sunday).
    */
    @SerializedName("Weekly")
    @Expose
    private Long [] Weekly;

    /**
    * Configuration of the maintenance window, which specifies the start time of daily maintenance.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Configuration of the maintenance window, which specifies the maintenance duration in hours.
    */
    @SerializedName("Span")
    @Expose
    private Long Span;

    /**
    * Whether to deploy across availability zones. Default value: false.
    */
    @SerializedName("MultiZones")
    @Expose
    private Boolean MultiZones;

    /**
    * Tags associated with the instances to be created.
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * System time zone. Default value: `China Standard Time`.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * Collation of system character sets. Default value: `Chinese_PRC_CI_AS`.
    */
    @SerializedName("Collation")
    @Expose
    private String Collation;

    /**
    * Whether it is a multi-node architecture instance. Default value: `false`.
    */
    @SerializedName("MultiNodes")
    @Expose
    private Boolean MultiNodes;

    /**
    * The zone in which the standby node is available. Default is empty. If it is a multi-node architecture, it must be transmitted. When MultiNodes = true, the availability zones of the primary and standby nodes cannot all be the same. The minimum number of availability zones for the standby nodes is 2, and the maximum is 5.
    */
    @SerializedName("DrZones")
    @Expose
    private String [] DrZones;

    /**
     * Get Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the `DescribeZones` API. 
     * @return Zone Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the `DescribeZones` API.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the `DescribeZones` API.
     * @param Zone Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the `DescribeZones` API.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Number of CPU cores. 
     * @return Cpu Number of CPU cores.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores.
     * @param Cpu Number of CPU cores.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance memory size in GB. 
     * @return Memory Instance memory size in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB.
     * @param Memory Instance memory size in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance storage capacity in GB. 
     * @return Storage Instance storage capacity in GB.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance storage capacity in GB.
     * @param Storage Instance storage capacity in GB.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Type of purchased instances. HA: high-availability edition (including dual-server high-availability edition and Always On cluster edition); RO: read-only replica edition; SI: single-node edition; BI: business intelligence edition; cvmHA: new high-availability edition; cvmRO: new read-only replica edition; MultiHA: multi-node edition; cvmMultiHA: multi-node cloud disk edition. 
     * @return InstanceType Type of purchased instances. HA: high-availability edition (including dual-server high-availability edition and Always On cluster edition); RO: read-only replica edition; SI: single-node edition; BI: business intelligence edition; cvmHA: new high-availability edition; cvmRO: new read-only replica edition; MultiHA: multi-node edition; cvmMultiHA: multi-node cloud disk edition.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Type of purchased instances. HA: high-availability edition (including dual-server high-availability edition and Always On cluster edition); RO: read-only replica edition; SI: single-node edition; BI: business intelligence edition; cvmHA: new high-availability edition; cvmRO: new read-only replica edition; MultiHA: multi-node edition; cvmMultiHA: multi-node cloud disk edition.
     * @param InstanceType Type of purchased instances. HA: high-availability edition (including dual-server high-availability edition and Always On cluster edition); RO: read-only replica edition; SI: single-node edition; BI: business intelligence edition; cvmHA: new high-availability edition; cvmRO: new read-only replica edition; MultiHA: multi-node edition; cvmMultiHA: multi-node cloud disk edition.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Host disk type of purchased instances. CLOUD_HSSD - Enhanced SSD for CVMs, CLOUD_TSSD - Tremendous SSD for CVMs, CLOUD_BSSD - Balanced SSD for CVMs.  
     * @return MachineType Host disk type of purchased instances. CLOUD_HSSD - Enhanced SSD for CVMs, CLOUD_TSSD - Tremendous SSD for CVMs, CLOUD_BSSD - Balanced SSD for CVMs. 
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Host disk type of purchased instances. CLOUD_HSSD - Enhanced SSD for CVMs, CLOUD_TSSD - Tremendous SSD for CVMs, CLOUD_BSSD - Balanced SSD for CVMs. 
     * @param MachineType Host disk type of purchased instances. CLOUD_HSSD - Enhanced SSD for CVMs, CLOUD_TSSD - Tremendous SSD for CVMs, CLOUD_BSSD - Balanced SSD for CVMs. 
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Billing mode. Valid value: POSTPAID (pay-as-you-go). 
     * @return InstanceChargeType Billing mode. Valid value: POSTPAID (pay-as-you-go).
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Billing mode. Valid value: POSTPAID (pay-as-you-go).
     * @param InstanceChargeType Billing mode. Valid value: POSTPAID (pay-as-you-go).
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Number of instances purchased this time. Default value: 1. Maximum value: 10. 
     * @return GoodsNum Number of instances purchased this time. Default value: 1. Maximum value: 10.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances purchased this time. Default value: 1. Maximum value: 10.
     * @param GoodsNum Number of instances purchased this time. Default value: 1. Maximum value: 10.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get SQL Server version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), 201402 (SQL Server 2014 Standard), `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The available version varies by region, and you can pull the version information by calling the `DescribeProductConfig` API. 
     * @return DBVersion SQL Server version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), 201402 (SQL Server 2014 Standard), `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The available version varies by region, and you can pull the version information by calling the `DescribeProductConfig` API.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set SQL Server version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), 201402 (SQL Server 2014 Standard), `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The available version varies by region, and you can pull the version information by calling the `DescribeProductConfig` API.
     * @param DBVersion SQL Server version. Valid values: `2008R2` (SQL Server 2008 R2 Enterprise), `2012SP3` (SQL Server 2012 Enterprise), `201202` (SQL Server 2012 Standard), `2014SP2` (SQL Server 2014 Enterprise), 201402 (SQL Server 2014 Standard), `2016SP1` (SQL Server 2016 Enterprise), `201602` (SQL Server 2016 Standard), `2017` (SQL Server 2017 Enterprise), `201702` (SQL Server 2017 Standard), `2019` (SQL Server 2019 Enterprise), `201902` (SQL Server 2019 Standard). Default value: `2008R2`. The available version varies by region, and you can pull the version information by calling the `DescribeProductConfig` API.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get VPC subnet ID in the format of subnet-bdoe83fa. `SubnetId` and `VpcId` should be set or ignored simultaneously. 
     * @return SubnetId VPC subnet ID in the format of subnet-bdoe83fa. `SubnetId` and `VpcId` should be set or ignored simultaneously.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID in the format of subnet-bdoe83fa. `SubnetId` and `VpcId` should be set or ignored simultaneously.
     * @param SubnetId VPC subnet ID in the format of subnet-bdoe83fa. `SubnetId` and `VpcId` should be set or ignored simultaneously.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC ID in the format of vpc-dsp338hz. `SubnetId` and `VpcId` should be set or ignored simultaneously. 
     * @return VpcId VPC ID in the format of vpc-dsp338hz. `SubnetId` and `VpcId` should be set or ignored simultaneously.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of vpc-dsp338hz. `SubnetId` and `VpcId` should be set or ignored simultaneously.
     * @param VpcId VPC ID in the format of vpc-dsp338hz. `SubnetId` and `VpcId` should be set or ignored simultaneously.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Length of purchase of instance. The default value is 1, indicating one month. The value cannot exceed 48. 
     * @return Period Length of purchase of instance. The default value is 1, indicating one month. The value cannot exceed 48.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Length of purchase of instance. The default value is 1, indicating one month. The value cannot exceed 48.
     * @param Period Length of purchase of instance. The default value is 1, indicating one month. The value cannot exceed 48.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Security group list, which contains security group IDs in the format of sg-xxx. 
     * @return SecurityGroupList Security group list, which contains security group IDs in the format of sg-xxx.
     */
    public String [] getSecurityGroupList() {
        return this.SecurityGroupList;
    }

    /**
     * Set Security group list, which contains security group IDs in the format of sg-xxx.
     * @param SecurityGroupList Security group list, which contains security group IDs in the format of sg-xxx.
     */
    public void setSecurityGroupList(String [] SecurityGroupList) {
        this.SecurityGroupList = SecurityGroupList;
    }

    /**
     * Get Auto-renewal flag. 0: normal renewal, 1: auto-renewal. Default value: 1. 
     * @return AutoRenewFlag Auto-renewal flag. 0: normal renewal, 1: auto-renewal. Default value: 1.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. 0: normal renewal, 1: auto-renewal. Default value: 1.
     * @param AutoRenewFlag Auto-renewal flag. 0: normal renewal, 1: auto-renewal. Default value: 1.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: 1 (Monday), 2 (Tuesday), 3 (Wednesday), 4 (Thursday), 5 (Friday), 6 (Saturday), 7 (Sunday). 
     * @return Weekly Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: 1 (Monday), 2 (Tuesday), 3 (Wednesday), 4 (Thursday), 5 (Friday), 6 (Saturday), 7 (Sunday).
     */
    public Long [] getWeekly() {
        return this.Weekly;
    }

    /**
     * Set Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: 1 (Monday), 2 (Tuesday), 3 (Wednesday), 4 (Thursday), 5 (Friday), 6 (Saturday), 7 (Sunday).
     * @param Weekly Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: 1 (Monday), 2 (Tuesday), 3 (Wednesday), 4 (Thursday), 5 (Friday), 6 (Saturday), 7 (Sunday).
     */
    public void setWeekly(Long [] Weekly) {
        this.Weekly = Weekly;
    }

    /**
     * Get Configuration of the maintenance window, which specifies the start time of daily maintenance. 
     * @return StartTime Configuration of the maintenance window, which specifies the start time of daily maintenance.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Configuration of the maintenance window, which specifies the start time of daily maintenance.
     * @param StartTime Configuration of the maintenance window, which specifies the start time of daily maintenance.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Configuration of the maintenance window, which specifies the maintenance duration in hours. 
     * @return Span Configuration of the maintenance window, which specifies the maintenance duration in hours.
     */
    public Long getSpan() {
        return this.Span;
    }

    /**
     * Set Configuration of the maintenance window, which specifies the maintenance duration in hours.
     * @param Span Configuration of the maintenance window, which specifies the maintenance duration in hours.
     */
    public void setSpan(Long Span) {
        this.Span = Span;
    }

    /**
     * Get Whether to deploy across availability zones. Default value: false. 
     * @return MultiZones Whether to deploy across availability zones. Default value: false.
     */
    public Boolean getMultiZones() {
        return this.MultiZones;
    }

    /**
     * Set Whether to deploy across availability zones. Default value: false.
     * @param MultiZones Whether to deploy across availability zones. Default value: false.
     */
    public void setMultiZones(Boolean MultiZones) {
        this.MultiZones = MultiZones;
    }

    /**
     * Get Tags associated with the instances to be created. 
     * @return ResourceTags Tags associated with the instances to be created.
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Tags associated with the instances to be created.
     * @param ResourceTags Tags associated with the instances to be created.
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get System time zone. Default value: `China Standard Time`. 
     * @return TimeZone System time zone. Default value: `China Standard Time`.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set System time zone. Default value: `China Standard Time`.
     * @param TimeZone System time zone. Default value: `China Standard Time`.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get Collation of system character sets. Default value: `Chinese_PRC_CI_AS`. 
     * @return Collation Collation of system character sets. Default value: `Chinese_PRC_CI_AS`.
     */
    public String getCollation() {
        return this.Collation;
    }

    /**
     * Set Collation of system character sets. Default value: `Chinese_PRC_CI_AS`.
     * @param Collation Collation of system character sets. Default value: `Chinese_PRC_CI_AS`.
     */
    public void setCollation(String Collation) {
        this.Collation = Collation;
    }

    /**
     * Get Whether it is a multi-node architecture instance. Default value: `false`. 
     * @return MultiNodes Whether it is a multi-node architecture instance. Default value: `false`.
     */
    public Boolean getMultiNodes() {
        return this.MultiNodes;
    }

    /**
     * Set Whether it is a multi-node architecture instance. Default value: `false`.
     * @param MultiNodes Whether it is a multi-node architecture instance. Default value: `false`.
     */
    public void setMultiNodes(Boolean MultiNodes) {
        this.MultiNodes = MultiNodes;
    }

    /**
     * Get The zone in which the standby node is available. Default is empty. If it is a multi-node architecture, it must be transmitted. When MultiNodes = true, the availability zones of the primary and standby nodes cannot all be the same. The minimum number of availability zones for the standby nodes is 2, and the maximum is 5. 
     * @return DrZones The zone in which the standby node is available. Default is empty. If it is a multi-node architecture, it must be transmitted. When MultiNodes = true, the availability zones of the primary and standby nodes cannot all be the same. The minimum number of availability zones for the standby nodes is 2, and the maximum is 5.
     */
    public String [] getDrZones() {
        return this.DrZones;
    }

    /**
     * Set The zone in which the standby node is available. Default is empty. If it is a multi-node architecture, it must be transmitted. When MultiNodes = true, the availability zones of the primary and standby nodes cannot all be the same. The minimum number of availability zones for the standby nodes is 2, and the maximum is 5.
     * @param DrZones The zone in which the standby node is available. Default is empty. If it is a multi-node architecture, it must be transmitted. When MultiNodes = true, the availability zones of the primary and standby nodes cannot all be the same. The minimum number of availability zones for the standby nodes is 2, and the maximum is 5.
     */
    public void setDrZones(String [] DrZones) {
        this.DrZones = DrZones;
    }

    public DescribeInstanceTradeParameterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceTradeParameterRequest(DescribeInstanceTradeParameterRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
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
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Weekly != null) {
            this.Weekly = new Long[source.Weekly.length];
            for (int i = 0; i < source.Weekly.length; i++) {
                this.Weekly[i] = new Long(source.Weekly[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Span != null) {
            this.Span = new Long(source.Span);
        }
        if (source.MultiZones != null) {
            this.MultiZones = new Boolean(source.MultiZones);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.Collation != null) {
            this.Collation = new String(source.Collation);
        }
        if (source.MultiNodes != null) {
            this.MultiNodes = new Boolean(source.MultiNodes);
        }
        if (source.DrZones != null) {
            this.DrZones = new String[source.DrZones.length];
            for (int i = 0; i < source.DrZones.length; i++) {
                this.DrZones[i] = new String(source.DrZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "SecurityGroupList.", this.SecurityGroupList);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamArraySimple(map, prefix + "Weekly.", this.Weekly);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Span", this.Span);
        this.setParamSimple(map, prefix + "MultiZones", this.MultiZones);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "Collation", this.Collation);
        this.setParamSimple(map, prefix + "MultiNodes", this.MultiNodes);
        this.setParamArraySimple(map, prefix + "DrZones.", this.DrZones);

    }
}

