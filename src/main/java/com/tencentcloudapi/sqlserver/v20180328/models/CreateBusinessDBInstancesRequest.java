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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBusinessDBInstancesRequest extends AbstractModel {

    /**
    * Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

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
    * The number of CPU cores of the instance you want to purchase.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * The host type of purchased instance. Valid values: `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD).
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Number of instances purchased this time. Default value: `1`.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * VPC subnet ID in the format of subnet-bdoe83fa. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC ID in the format of vpc-dsp338hz. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * - Supported versions of business intelligence server. Valid values: `201603` (SQL Server 2016 Integration Services), `201703` (SQL Server 2017 Integration Services), `201903` (SQL Server 2019 Integration Services). Default value: `201903`. As the purchasable versions are region-specific, you can use the `DescribeProductConfig` API to query the information of purchasable versions in each region.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Security group list, which contains security group IDs in the format of sg-xxx.
    */
    @SerializedName("SecurityGroupList")
    @Expose
    private String [] SecurityGroupList;

    /**
    * Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday).
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
    * Tags associated with the instances to be created
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
     * Get Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API. 
     * @return Zone Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API.
     * @param Zone Instance AZ, such as ap-guangzhou-1 (Guangzhou Zone 1). Purchasable AZs for an instance can be obtained through the`DescribeZones` API.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
     * Get The number of CPU cores of the instance you want to purchase. 
     * @return Cpu The number of CPU cores of the instance you want to purchase.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set The number of CPU cores of the instance you want to purchase.
     * @param Cpu The number of CPU cores of the instance you want to purchase.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get The host type of purchased instance. Valid values: `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD). 
     * @return MachineType The host type of purchased instance. Valid values: `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD).
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set The host type of purchased instance. Valid values: `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD).
     * @param MachineType The host type of purchased instance. Valid values: `CLOUD_PREMIUM` (virtual machine with premium cloud disk), `CLOUD_SSD` (virtual machine with SSD).
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Number of instances purchased this time. Default value: `1`. 
     * @return GoodsNum Number of instances purchased this time. Default value: `1`.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances purchased this time. Default value: `1`.
     * @param GoodsNum Number of instances purchased this time. Default value: `1`.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get VPC subnet ID in the format of subnet-bdoe83fa. Both `SubnetId` and `VpcId` need to be set or unset at the same time. 
     * @return SubnetId VPC subnet ID in the format of subnet-bdoe83fa. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID in the format of subnet-bdoe83fa. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     * @param SubnetId VPC subnet ID in the format of subnet-bdoe83fa. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC ID in the format of vpc-dsp338hz. Both `SubnetId` and `VpcId` need to be set or unset at the same time. 
     * @return VpcId VPC ID in the format of vpc-dsp338hz. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of vpc-dsp338hz. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     * @param VpcId VPC ID in the format of vpc-dsp338hz. Both `SubnetId` and `VpcId` need to be set or unset at the same time.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get - Supported versions of business intelligence server. Valid values: `201603` (SQL Server 2016 Integration Services), `201703` (SQL Server 2017 Integration Services), `201903` (SQL Server 2019 Integration Services). Default value: `201903`. As the purchasable versions are region-specific, you can use the `DescribeProductConfig` API to query the information of purchasable versions in each region. 
     * @return DBVersion - Supported versions of business intelligence server. Valid values: `201603` (SQL Server 2016 Integration Services), `201703` (SQL Server 2017 Integration Services), `201903` (SQL Server 2019 Integration Services). Default value: `201903`. As the purchasable versions are region-specific, you can use the `DescribeProductConfig` API to query the information of purchasable versions in each region.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set - Supported versions of business intelligence server. Valid values: `201603` (SQL Server 2016 Integration Services), `201703` (SQL Server 2017 Integration Services), `201903` (SQL Server 2019 Integration Services). Default value: `201903`. As the purchasable versions are region-specific, you can use the `DescribeProductConfig` API to query the information of purchasable versions in each region.
     * @param DBVersion - Supported versions of business intelligence server. Valid values: `201603` (SQL Server 2016 Integration Services), `201703` (SQL Server 2017 Integration Services), `201903` (SQL Server 2019 Integration Services). Default value: `201903`. As the purchasable versions are region-specific, you can use the `DescribeProductConfig` API to query the information of purchasable versions in each region.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
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
     * Get Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday). 
     * @return Weekly Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday).
     */
    public Long [] getWeekly() {
        return this.Weekly;
    }

    /**
     * Set Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday).
     * @param Weekly Configuration of the maintenance window, which specifies the day of the week when maintenance can be performed. Valid values: `1` (Monday), `2` (Tuesday), `3` (Wednesday), `4` (Thursday), `5` (Friday), `6` (Saturday), `7` (Sunday).
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

    public CreateBusinessDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBusinessDBInstancesRequest(CreateBusinessDBInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.SecurityGroupList != null) {
            this.SecurityGroupList = new String[source.SecurityGroupList.length];
            for (int i = 0; i < source.SecurityGroupList.length; i++) {
                this.SecurityGroupList[i] = new String(source.SecurityGroupList[i]);
            }
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
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamArraySimple(map, prefix + "SecurityGroupList.", this.SecurityGroupList);
        this.setParamArraySimple(map, prefix + "Weekly.", this.Weekly);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Span", this.Span);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

