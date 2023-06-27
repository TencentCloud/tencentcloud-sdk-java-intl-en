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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDCDBInstanceRequest extends AbstractModel{

    /**
    * AZs to deploy shard nodes. You can specify up to two AZs. When the shard specification is 1-source-2-replica, two of the nodes are deployed in the first AZ.
The current purchasable AZ needs be pulled through `DescribeDCDBSaleInfo` API.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Validity period in months
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Shard memory size in GB, which can be obtained 
 by querying the instance specification through `DescribeShardSpec` API.
    */
    @SerializedName("ShardMemory")
    @Expose
    private Long ShardMemory;

    /**
    * Shard storage size in GB, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API.
    */
    @SerializedName("ShardStorage")
    @Expose
    private Long ShardStorage;

    /**
    * Number of nodes in a single shard, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API.
    */
    @SerializedName("ShardNodeCount")
    @Expose
    private Long ShardNodeCount;

    /**
    * The number of shards in the instance. Value range: 2-8. You can increase up to 64 shards by upgrading your instance.
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * The number of instances to be purchased
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID, which is required when `VpcId` is specified.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
    */
    @SerializedName("DbVersionId")
    @Expose
    private String DbVersionId;

    /**
    * Whether to automatically use vouchers. This option is disabled by default.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * Voucher ID list. Currently, you can specify only one voucher.
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Custom name of the instance
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
    */
    @SerializedName("Ipv6Flag")
    @Expose
    private Long Ipv6Flag;

    /**
    * Array of tag key-value pairs
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync; default value: `2`).
    */
    @SerializedName("InitParams")
    @Expose
    private DBParamValue [] InitParams;

    /**
    * DCN source region
    */
    @SerializedName("DcnRegion")
    @Expose
    private String DcnRegion;

    /**
    * DCN source instance ID
    */
    @SerializedName("DcnInstanceId")
    @Expose
    private String DcnInstanceId;

    /**
    * Renewal mode. Valid values: `0` (manual renewal, which is the default mode), `1` (auto-renewal), `2` (manual renewal, which is specified by users).  If no renewal is required, set it to `0`.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Security group IDs in array. This parameter is compatible with the old parameter `SecurityGroupId`.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get AZs to deploy shard nodes. You can specify up to two AZs. When the shard specification is 1-source-2-replica, two of the nodes are deployed in the first AZ.
The current purchasable AZ needs be pulled through `DescribeDCDBSaleInfo` API. 
     * @return Zones AZs to deploy shard nodes. You can specify up to two AZs. When the shard specification is 1-source-2-replica, two of the nodes are deployed in the first AZ.
The current purchasable AZ needs be pulled through `DescribeDCDBSaleInfo` API.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set AZs to deploy shard nodes. You can specify up to two AZs. When the shard specification is 1-source-2-replica, two of the nodes are deployed in the first AZ.
The current purchasable AZ needs be pulled through `DescribeDCDBSaleInfo` API.
     * @param Zones AZs to deploy shard nodes. You can specify up to two AZs. When the shard specification is 1-source-2-replica, two of the nodes are deployed in the first AZ.
The current purchasable AZ needs be pulled through `DescribeDCDBSaleInfo` API.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Validity period in months 
     * @return Period Validity period in months
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Validity period in months
     * @param Period Validity period in months
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Shard memory size in GB, which can be obtained 
 by querying the instance specification through `DescribeShardSpec` API. 
     * @return ShardMemory Shard memory size in GB, which can be obtained 
 by querying the instance specification through `DescribeShardSpec` API.
     */
    public Long getShardMemory() {
        return this.ShardMemory;
    }

    /**
     * Set Shard memory size in GB, which can be obtained 
 by querying the instance specification through `DescribeShardSpec` API.
     * @param ShardMemory Shard memory size in GB, which can be obtained 
 by querying the instance specification through `DescribeShardSpec` API.
     */
    public void setShardMemory(Long ShardMemory) {
        this.ShardMemory = ShardMemory;
    }

    /**
     * Get Shard storage size in GB, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API. 
     * @return ShardStorage Shard storage size in GB, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API.
     */
    public Long getShardStorage() {
        return this.ShardStorage;
    }

    /**
     * Set Shard storage size in GB, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API.
     * @param ShardStorage Shard storage size in GB, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API.
     */
    public void setShardStorage(Long ShardStorage) {
        this.ShardStorage = ShardStorage;
    }

    /**
     * Get Number of nodes in a single shard, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API. 
     * @return ShardNodeCount Number of nodes in a single shard, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API.
     */
    public Long getShardNodeCount() {
        return this.ShardNodeCount;
    }

    /**
     * Set Number of nodes in a single shard, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API.
     * @param ShardNodeCount Number of nodes in a single shard, which can be obtained
 by querying the instance specification through `DescribeShardSpec` API.
     */
    public void setShardNodeCount(Long ShardNodeCount) {
        this.ShardNodeCount = ShardNodeCount;
    }

    /**
     * Get The number of shards in the instance. Value range: 2-8. You can increase up to 64 shards by upgrading your instance. 
     * @return ShardCount The number of shards in the instance. Value range: 2-8. You can increase up to 64 shards by upgrading your instance.
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set The number of shards in the instance. Value range: 2-8. You can increase up to 64 shards by upgrading your instance.
     * @param ShardCount The number of shards in the instance. Value range: 2-8. You can increase up to 64 shards by upgrading your instance.
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get The number of instances to be purchased 
     * @return Count The number of instances to be purchased
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set The number of instances to be purchased
     * @param Count The number of instances to be purchased
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project. 
     * @return ProjectId Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project.
     * @param ProjectId Project ID, which can be obtained through the `DescribeProjects` API. If this parameter is not passed in, the instance will be associated with the default project.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network. 
     * @return VpcId VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network.
     * @param VpcId VPC ID. If this parameter is left empty or not passed in, the instance will be created on the classic network.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID, which is required when `VpcId` is specified. 
     * @return SubnetId VPC subnet ID, which is required when `VpcId` is specified.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID, which is required when `VpcId` is specified.
     * @param SubnetId VPC subnet ID, which is required when `VpcId` is specified.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`. 
     * @return DbVersionId Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
     */
    public String getDbVersionId() {
        return this.DbVersionId;
    }

    /**
     * Set Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
     * @param DbVersionId Database engine version. Valid values: `5.7`, `8.0`, `10.0`, `10.1`.
     */
    public void setDbVersionId(String DbVersionId) {
        this.DbVersionId = DbVersionId;
    }

    /**
     * Get Whether to automatically use vouchers. This option is disabled by default. 
     * @return AutoVoucher Whether to automatically use vouchers. This option is disabled by default.
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers. This option is disabled by default.
     * @param AutoVoucher Whether to automatically use vouchers. This option is disabled by default.
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list. Currently, you can specify only one voucher. 
     * @return VoucherIds Voucher ID list. Currently, you can specify only one voucher.
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list. Currently, you can specify only one voucher.
     * @param VoucherIds Voucher ID list. Currently, you can specify only one voucher.
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupId Security group ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupId Security group ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Custom name of the instance 
     * @return InstanceName Custom name of the instance
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Custom name of the instance
     * @param InstanceName Custom name of the instance
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported). 
     * @return Ipv6Flag Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
     */
    public Long getIpv6Flag() {
        return this.Ipv6Flag;
    }

    /**
     * Set Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
     * @param Ipv6Flag Whether IPv6 is supported. Valid values: `0` (unsupported), `1` (supported).
     */
    public void setIpv6Flag(Long Ipv6Flag) {
        this.Ipv6Flag = Ipv6Flag;
    }

    /**
     * Get Array of tag key-value pairs 
     * @return ResourceTags Array of tag key-value pairs
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Array of tag key-value pairs
     * @param ResourceTags Array of tag key-value pairs
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync; default value: `2`). 
     * @return InitParams List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync; default value: `2`).
     */
    public DBParamValue [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync; default value: `2`).
     * @param InitParams List of parameters. Valid values: `character_set_server` (character set; required); `lower_case_table_names` (table name case sensitivity; required; `0`: case-sensitive; `1`: case-insensitive); `innodb_page_size` (InnoDB data page size; default size: 16 KB); `sync_mode` (sync mode; `0`: async; `1`: strong sync; `2`: downgradable strong sync; default value: `2`).
     */
    public void setInitParams(DBParamValue [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get DCN source region 
     * @return DcnRegion DCN source region
     */
    public String getDcnRegion() {
        return this.DcnRegion;
    }

    /**
     * Set DCN source region
     * @param DcnRegion DCN source region
     */
    public void setDcnRegion(String DcnRegion) {
        this.DcnRegion = DcnRegion;
    }

    /**
     * Get DCN source instance ID 
     * @return DcnInstanceId DCN source instance ID
     */
    public String getDcnInstanceId() {
        return this.DcnInstanceId;
    }

    /**
     * Set DCN source instance ID
     * @param DcnInstanceId DCN source instance ID
     */
    public void setDcnInstanceId(String DcnInstanceId) {
        this.DcnInstanceId = DcnInstanceId;
    }

    /**
     * Get Renewal mode. Valid values: `0` (manual renewal, which is the default mode), `1` (auto-renewal), `2` (manual renewal, which is specified by users).  If no renewal is required, set it to `0`. 
     * @return AutoRenewFlag Renewal mode. Valid values: `0` (manual renewal, which is the default mode), `1` (auto-renewal), `2` (manual renewal, which is specified by users).  If no renewal is required, set it to `0`.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal mode. Valid values: `0` (manual renewal, which is the default mode), `1` (auto-renewal), `2` (manual renewal, which is specified by users).  If no renewal is required, set it to `0`.
     * @param AutoRenewFlag Renewal mode. Valid values: `0` (manual renewal, which is the default mode), `1` (auto-renewal), `2` (manual renewal, which is specified by users).  If no renewal is required, set it to `0`.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Security group IDs in array. This parameter is compatible with the old parameter `SecurityGroupId`. 
     * @return SecurityGroupIds Security group IDs in array. This parameter is compatible with the old parameter `SecurityGroupId`.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group IDs in array. This parameter is compatible with the old parameter `SecurityGroupId`.
     * @param SecurityGroupIds Security group IDs in array. This parameter is compatible with the old parameter `SecurityGroupId`.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateDCDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDCDBInstanceRequest(CreateDCDBInstanceRequest source) {
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ShardMemory != null) {
            this.ShardMemory = new Long(source.ShardMemory);
        }
        if (source.ShardStorage != null) {
            this.ShardStorage = new Long(source.ShardStorage);
        }
        if (source.ShardNodeCount != null) {
            this.ShardNodeCount = new Long(source.ShardNodeCount);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DbVersionId != null) {
            this.DbVersionId = new String(source.DbVersionId);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Ipv6Flag != null) {
            this.Ipv6Flag = new Long(source.Ipv6Flag);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.InitParams != null) {
            this.InitParams = new DBParamValue[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new DBParamValue(source.InitParams[i]);
            }
        }
        if (source.DcnRegion != null) {
            this.DcnRegion = new String(source.DcnRegion);
        }
        if (source.DcnInstanceId != null) {
            this.DcnInstanceId = new String(source.DcnInstanceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ShardMemory", this.ShardMemory);
        this.setParamSimple(map, prefix + "ShardStorage", this.ShardStorage);
        this.setParamSimple(map, prefix + "ShardNodeCount", this.ShardNodeCount);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbVersionId", this.DbVersionId);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Ipv6Flag", this.Ipv6Flag);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "DcnRegion", this.DcnRegion);
        this.setParamSimple(map, prefix + "DcnInstanceId", this.DcnInstanceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

