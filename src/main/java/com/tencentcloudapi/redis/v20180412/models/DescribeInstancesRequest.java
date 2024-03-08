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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * Number of instances returned per page. Default value: `20`. Maximum value: `1000`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.


    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The instance list is sorted according to the following enumeration valid values:
- projectId: By project ID.- createtime: By the creation time of instances.- instancename: By the name of instances.- type: By the type of instances.- curDeadline: By the expiration time of instances.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * For instance sorting order, the default is descending order.
- 1: Descending order.
- 0: Ascending order.
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * Array of VPC IDs such as 47525. If this parameter is not passed in or the array is empty, the classic network will be selected by default. This parameter is retained and can be ignored. It is set based on `UniqVpcIds` parameter format.
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * Array of VPC subnet IDs such as 56854. This parameter is retained and can be ignored. It is set based on `UniqSubnetIds` parameter format.
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Setting keywords field for fuzzy query, only instance names support fuzzy query.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Array of project IDs
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Array of VPC IDs such as vpc-sad23jfdfk. If this parameter is not passed in or or the array is empty, the classic network will be selected by default.
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * Array of VPC subnet IDs such as subnet-fdj24n34j2
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * Array of region IDs (disused). The corresponding region can be queried through the common parameter `Region`.
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * Instance status.
- 0: To be initialized.
- 1: In process.
- 2: Running.
- -2: Isolated.
- -3: Pending Delete.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Instance architecture version.
- 1: Single-node edition.
- 2: Master-replica edition.- 3: Cluster edition.
    */
    @SerializedName("TypeVersion")
    @Expose
    private Long TypeVersion;

    /**
    * Storage engine information. Valid values: `Redis-2.8`, `Redis-4.0`, `Redis-5.0`, `Redis-6.0` or `CKV`.
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * Renewal pattern.
- 0: Manual renewal.
- 1: Automatic renewal.
- 2: No renewal after expiry.
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long [] AutoRenew;

    /**
    * Billing mode. Only pay-as-you-go billing is supported.
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * Instance type. Valid values:  - `2`: Redis 2.8 Memory Edition (Standard Architecture). - `3`: CKV 3.2 Memory Edition (Standard Architecture). - `4`: CKV 3.2 Memory Edition (Cluster Architecture). - `5`: Redis 2.8 Memory Edition (Standalone). - `6`: Redis 4.0 Memory Edition (Standard Architecture). - `7`: Redis 4.0 Memory Edition (Cluster Architecture). - `8`: Redis 5.0 Memory Edition (Standard Architecture). - `9`: Redis 5.0 Memory Edition (Cluster Architecture). - `15`: Redis 6.2 Memory Edition (Standard Architecture). - `16`: Redis 6.2 Memory Edition (Cluster Architecture).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * This parameter is of array type and supports the configuration of instance names, instance IDs, and IP addresses. Among these, the instance name is fuzzy matching while the instance ID and IP address are precise matching.
- Each element in the array is used for a union-based matching query.- When both **InstanceId** and **SearchKeys** are configured simultaneously, their intersection will be used for the matching query.
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * Internal parameter, which can be ignored.
    */
    @SerializedName("TypeList")
    @Expose
    private Long [] TypeList;

    /**
    * Internal parameter, which can be ignored.
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * Resources filter by tag key and value. If this parameter is not specified or is an empty array, resources will not be filtered.
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * Resources filter by tag key. If this parameter is not specified or is an empty array, resources will not be filtered.
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * The product version of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.
- local: local Disk Edition.- cdc: Cluster dedicated edition.

    */
    @SerializedName("ProductVersions")
    @Expose
    private String [] ProductVersions;

    /**
    * Batch query of the specified instances ID. The number of results returned is based on `Limit`.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Availability zone mode.
- singleaz: Single availability zone.- multiaz: Multiple availability zones.
    */
    @SerializedName("AzMode")
    @Expose
    private String AzMode;

    /**
     * Get Number of instances returned per page. Default value: `20`. Maximum value: `1000`. 
     * @return Limit Number of instances returned per page. Default value: `20`. Maximum value: `1000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of instances returned per page. Default value: `20`. Maximum value: `1000`.
     * @param Limit Number of instances returned per page. Default value: `20`. Maximum value: `1000`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1). 
     * @return Offset Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     * @param Offset Pagination offset, which is an integral multiple of `Limit`. Calculation formula:  `offset` = `limit` * (page number - 1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.

 
     * @return InstanceId ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.


     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.


     * @param InstanceId ID of a specified instance,  such as  "crs-xjhsdj****" Log in to the [Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.


     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The instance list is sorted according to the following enumeration valid values:
- projectId: By project ID.- createtime: By the creation time of instances.- instancename: By the name of instances.- type: By the type of instances.- curDeadline: By the expiration time of instances. 
     * @return OrderBy The instance list is sorted according to the following enumeration valid values:
- projectId: By project ID.- createtime: By the creation time of instances.- instancename: By the name of instances.- type: By the type of instances.- curDeadline: By the expiration time of instances.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set The instance list is sorted according to the following enumeration valid values:
- projectId: By project ID.- createtime: By the creation time of instances.- instancename: By the name of instances.- type: By the type of instances.- curDeadline: By the expiration time of instances.
     * @param OrderBy The instance list is sorted according to the following enumeration valid values:
- projectId: By project ID.- createtime: By the creation time of instances.- instancename: By the name of instances.- type: By the type of instances.- curDeadline: By the expiration time of instances.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get For instance sorting order, the default is descending order.
- 1: Descending order.
- 0: Ascending order. 
     * @return OrderType For instance sorting order, the default is descending order.
- 1: Descending order.
- 0: Ascending order.
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set For instance sorting order, the default is descending order.
- 1: Descending order.
- 0: Ascending order.
     * @param OrderType For instance sorting order, the default is descending order.
- 1: Descending order.
- 0: Ascending order.
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Array of VPC IDs such as 47525. If this parameter is not passed in or the array is empty, the classic network will be selected by default. This parameter is retained and can be ignored. It is set based on `UniqVpcIds` parameter format. 
     * @return VpcIds Array of VPC IDs such as 47525. If this parameter is not passed in or the array is empty, the classic network will be selected by default. This parameter is retained and can be ignored. It is set based on `UniqVpcIds` parameter format.
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set Array of VPC IDs such as 47525. If this parameter is not passed in or the array is empty, the classic network will be selected by default. This parameter is retained and can be ignored. It is set based on `UniqVpcIds` parameter format.
     * @param VpcIds Array of VPC IDs such as 47525. If this parameter is not passed in or the array is empty, the classic network will be selected by default. This parameter is retained and can be ignored. It is set based on `UniqVpcIds` parameter format.
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get Array of VPC subnet IDs such as 56854. This parameter is retained and can be ignored. It is set based on `UniqSubnetIds` parameter format. 
     * @return SubnetIds Array of VPC subnet IDs such as 56854. This parameter is retained and can be ignored. It is set based on `UniqSubnetIds` parameter format.
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set Array of VPC subnet IDs such as 56854. This parameter is retained and can be ignored. It is set based on `UniqSubnetIds` parameter format.
     * @param SubnetIds Array of VPC subnet IDs such as 56854. This parameter is retained and can be ignored. It is set based on `UniqSubnetIds` parameter format.
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Setting keywords field for fuzzy query, only instance names support fuzzy query. 
     * @return SearchKey Setting keywords field for fuzzy query, only instance names support fuzzy query.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Setting keywords field for fuzzy query, only instance names support fuzzy query.
     * @param SearchKey Setting keywords field for fuzzy query, only instance names support fuzzy query.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Array of project IDs 
     * @return ProjectIds Array of project IDs
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Array of project IDs
     * @param ProjectIds Array of project IDs
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Array of VPC IDs such as vpc-sad23jfdfk. If this parameter is not passed in or or the array is empty, the classic network will be selected by default. 
     * @return UniqVpcIds Array of VPC IDs such as vpc-sad23jfdfk. If this parameter is not passed in or or the array is empty, the classic network will be selected by default.
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set Array of VPC IDs such as vpc-sad23jfdfk. If this parameter is not passed in or or the array is empty, the classic network will be selected by default.
     * @param UniqVpcIds Array of VPC IDs such as vpc-sad23jfdfk. If this parameter is not passed in or or the array is empty, the classic network will be selected by default.
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get Array of VPC subnet IDs such as subnet-fdj24n34j2 
     * @return UniqSubnetIds Array of VPC subnet IDs such as subnet-fdj24n34j2
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set Array of VPC subnet IDs such as subnet-fdj24n34j2
     * @param UniqSubnetIds Array of VPC subnet IDs such as subnet-fdj24n34j2
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get Array of region IDs (disused). The corresponding region can be queried through the common parameter `Region`. 
     * @return RegionIds Array of region IDs (disused). The corresponding region can be queried through the common parameter `Region`.
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set Array of region IDs (disused). The corresponding region can be queried through the common parameter `Region`.
     * @param RegionIds Array of region IDs (disused). The corresponding region can be queried through the common parameter `Region`.
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get Instance status.
- 0: To be initialized.
- 1: In process.
- 2: Running.
- -2: Isolated.
- -3: Pending Delete. 
     * @return Status Instance status.
- 0: To be initialized.
- 1: In process.
- 2: Running.
- -2: Isolated.
- -3: Pending Delete.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status.
- 0: To be initialized.
- 1: In process.
- 2: Running.
- -2: Isolated.
- -3: Pending Delete.
     * @param Status Instance status.
- 0: To be initialized.
- 1: In process.
- 2: Running.
- -2: Isolated.
- -3: Pending Delete.
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Instance architecture version.
- 1: Single-node edition.
- 2: Master-replica edition.- 3: Cluster edition. 
     * @return TypeVersion Instance architecture version.
- 1: Single-node edition.
- 2: Master-replica edition.- 3: Cluster edition.
     */
    public Long getTypeVersion() {
        return this.TypeVersion;
    }

    /**
     * Set Instance architecture version.
- 1: Single-node edition.
- 2: Master-replica edition.- 3: Cluster edition.
     * @param TypeVersion Instance architecture version.
- 1: Single-node edition.
- 2: Master-replica edition.- 3: Cluster edition.
     */
    public void setTypeVersion(Long TypeVersion) {
        this.TypeVersion = TypeVersion;
    }

    /**
     * Get Storage engine information. Valid values: `Redis-2.8`, `Redis-4.0`, `Redis-5.0`, `Redis-6.0` or `CKV`. 
     * @return EngineName Storage engine information. Valid values: `Redis-2.8`, `Redis-4.0`, `Redis-5.0`, `Redis-6.0` or `CKV`.
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set Storage engine information. Valid values: `Redis-2.8`, `Redis-4.0`, `Redis-5.0`, `Redis-6.0` or `CKV`.
     * @param EngineName Storage engine information. Valid values: `Redis-2.8`, `Redis-4.0`, `Redis-5.0`, `Redis-6.0` or `CKV`.
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get Renewal pattern.
- 0: Manual renewal.
- 1: Automatic renewal.
- 2: No renewal after expiry. 
     * @return AutoRenew Renewal pattern.
- 0: Manual renewal.
- 1: Automatic renewal.
- 2: No renewal after expiry.
     */
    public Long [] getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Renewal pattern.
- 0: Manual renewal.
- 1: Automatic renewal.
- 2: No renewal after expiry.
     * @param AutoRenew Renewal pattern.
- 0: Manual renewal.
- 1: Automatic renewal.
- 2: No renewal after expiry.
     */
    public void setAutoRenew(Long [] AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Billing mode. Only pay-as-you-go billing is supported. 
     * @return BillingMode Billing mode. Only pay-as-you-go billing is supported.
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing mode. Only pay-as-you-go billing is supported.
     * @param BillingMode Billing mode. Only pay-as-you-go billing is supported.
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Instance type. Valid values:  - `2`: Redis 2.8 Memory Edition (Standard Architecture). - `3`: CKV 3.2 Memory Edition (Standard Architecture). - `4`: CKV 3.2 Memory Edition (Cluster Architecture). - `5`: Redis 2.8 Memory Edition (Standalone). - `6`: Redis 4.0 Memory Edition (Standard Architecture). - `7`: Redis 4.0 Memory Edition (Cluster Architecture). - `8`: Redis 5.0 Memory Edition (Standard Architecture). - `9`: Redis 5.0 Memory Edition (Cluster Architecture). - `15`: Redis 6.2 Memory Edition (Standard Architecture). - `16`: Redis 6.2 Memory Edition (Cluster Architecture). 
     * @return Type Instance type. Valid values:  - `2`: Redis 2.8 Memory Edition (Standard Architecture). - `3`: CKV 3.2 Memory Edition (Standard Architecture). - `4`: CKV 3.2 Memory Edition (Cluster Architecture). - `5`: Redis 2.8 Memory Edition (Standalone). - `6`: Redis 4.0 Memory Edition (Standard Architecture). - `7`: Redis 4.0 Memory Edition (Cluster Architecture). - `8`: Redis 5.0 Memory Edition (Standard Architecture). - `9`: Redis 5.0 Memory Edition (Cluster Architecture). - `15`: Redis 6.2 Memory Edition (Standard Architecture). - `16`: Redis 6.2 Memory Edition (Cluster Architecture).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Instance type. Valid values:  - `2`: Redis 2.8 Memory Edition (Standard Architecture). - `3`: CKV 3.2 Memory Edition (Standard Architecture). - `4`: CKV 3.2 Memory Edition (Cluster Architecture). - `5`: Redis 2.8 Memory Edition (Standalone). - `6`: Redis 4.0 Memory Edition (Standard Architecture). - `7`: Redis 4.0 Memory Edition (Cluster Architecture). - `8`: Redis 5.0 Memory Edition (Standard Architecture). - `9`: Redis 5.0 Memory Edition (Cluster Architecture). - `15`: Redis 6.2 Memory Edition (Standard Architecture). - `16`: Redis 6.2 Memory Edition (Cluster Architecture).
     * @param Type Instance type. Valid values:  - `2`: Redis 2.8 Memory Edition (Standard Architecture). - `3`: CKV 3.2 Memory Edition (Standard Architecture). - `4`: CKV 3.2 Memory Edition (Cluster Architecture). - `5`: Redis 2.8 Memory Edition (Standalone). - `6`: Redis 4.0 Memory Edition (Standard Architecture). - `7`: Redis 4.0 Memory Edition (Cluster Architecture). - `8`: Redis 5.0 Memory Edition (Standard Architecture). - `9`: Redis 5.0 Memory Edition (Cluster Architecture). - `15`: Redis 6.2 Memory Edition (Standard Architecture). - `16`: Redis 6.2 Memory Edition (Cluster Architecture).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get This parameter is of array type and supports the configuration of instance names, instance IDs, and IP addresses. Among these, the instance name is fuzzy matching while the instance ID and IP address are precise matching.
- Each element in the array is used for a union-based matching query.- When both **InstanceId** and **SearchKeys** are configured simultaneously, their intersection will be used for the matching query. 
     * @return SearchKeys This parameter is of array type and supports the configuration of instance names, instance IDs, and IP addresses. Among these, the instance name is fuzzy matching while the instance ID and IP address are precise matching.
- Each element in the array is used for a union-based matching query.- When both **InstanceId** and **SearchKeys** are configured simultaneously, their intersection will be used for the matching query.
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set This parameter is of array type and supports the configuration of instance names, instance IDs, and IP addresses. Among these, the instance name is fuzzy matching while the instance ID and IP address are precise matching.
- Each element in the array is used for a union-based matching query.- When both **InstanceId** and **SearchKeys** are configured simultaneously, their intersection will be used for the matching query.
     * @param SearchKeys This parameter is of array type and supports the configuration of instance names, instance IDs, and IP addresses. Among these, the instance name is fuzzy matching while the instance ID and IP address are precise matching.
- Each element in the array is used for a union-based matching query.- When both **InstanceId** and **SearchKeys** are configured simultaneously, their intersection will be used for the matching query.
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get Internal parameter, which can be ignored. 
     * @return TypeList Internal parameter, which can be ignored.
     */
    public Long [] getTypeList() {
        return this.TypeList;
    }

    /**
     * Set Internal parameter, which can be ignored.
     * @param TypeList Internal parameter, which can be ignored.
     */
    public void setTypeList(Long [] TypeList) {
        this.TypeList = TypeList;
    }

    /**
     * Get Internal parameter, which can be ignored. 
     * @return MonitorVersion Internal parameter, which can be ignored.
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set Internal parameter, which can be ignored.
     * @param MonitorVersion Internal parameter, which can be ignored.
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get Resources filter by tag key and value. If this parameter is not specified or is an empty array, resources will not be filtered. 
     * @return InstanceTags Resources filter by tag key and value. If this parameter is not specified or is an empty array, resources will not be filtered.
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set Resources filter by tag key and value. If this parameter is not specified or is an empty array, resources will not be filtered.
     * @param InstanceTags Resources filter by tag key and value. If this parameter is not specified or is an empty array, resources will not be filtered.
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get Resources filter by tag key. If this parameter is not specified or is an empty array, resources will not be filtered. 
     * @return TagKeys Resources filter by tag key. If this parameter is not specified or is an empty array, resources will not be filtered.
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set Resources filter by tag key. If this parameter is not specified or is an empty array, resources will not be filtered.
     * @param TagKeys Resources filter by tag key. If this parameter is not specified or is an empty array, resources will not be filtered.
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get The product version of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.
- local: local Disk Edition.- cdc: Cluster dedicated edition.
 
     * @return ProductVersions The product version of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.
- local: local Disk Edition.- cdc: Cluster dedicated edition.

     */
    public String [] getProductVersions() {
        return this.ProductVersions;
    }

    /**
     * Set The product version of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.
- local: local Disk Edition.- cdc: Cluster dedicated edition.

     * @param ProductVersions The product version of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.
- local: local Disk Edition.- cdc: Cluster dedicated edition.

     */
    public void setProductVersions(String [] ProductVersions) {
        this.ProductVersions = ProductVersions;
    }

    /**
     * Get Batch query of the specified instances ID. The number of results returned is based on `Limit`. 
     * @return InstanceIds Batch query of the specified instances ID. The number of results returned is based on `Limit`.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Batch query of the specified instances ID. The number of results returned is based on `Limit`.
     * @param InstanceIds Batch query of the specified instances ID. The number of results returned is based on `Limit`.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Availability zone mode.
- singleaz: Single availability zone.- multiaz: Multiple availability zones. 
     * @return AzMode Availability zone mode.
- singleaz: Single availability zone.- multiaz: Multiple availability zones.
     */
    public String getAzMode() {
        return this.AzMode;
    }

    /**
     * Set Availability zone mode.
- singleaz: Single availability zone.- multiaz: Multiple availability zones.
     * @param AzMode Availability zone mode.
- singleaz: Single availability zone.- multiaz: Multiple availability zones.
     */
    public void setAzMode(String AzMode) {
        this.AzMode = AzMode;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.UniqVpcIds != null) {
            this.UniqVpcIds = new String[source.UniqVpcIds.length];
            for (int i = 0; i < source.UniqVpcIds.length; i++) {
                this.UniqVpcIds[i] = new String(source.UniqVpcIds[i]);
            }
        }
        if (source.UniqSubnetIds != null) {
            this.UniqSubnetIds = new String[source.UniqSubnetIds.length];
            for (int i = 0; i < source.UniqSubnetIds.length; i++) {
                this.UniqSubnetIds[i] = new String(source.UniqSubnetIds[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.TypeVersion != null) {
            this.TypeVersion = new Long(source.TypeVersion);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long[source.AutoRenew.length];
            for (int i = 0; i < source.AutoRenew.length; i++) {
                this.AutoRenew[i] = new Long(source.AutoRenew[i]);
            }
        }
        if (source.BillingMode != null) {
            this.BillingMode = new String(source.BillingMode);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SearchKeys != null) {
            this.SearchKeys = new String[source.SearchKeys.length];
            for (int i = 0; i < source.SearchKeys.length; i++) {
                this.SearchKeys[i] = new String(source.SearchKeys[i]);
            }
        }
        if (source.TypeList != null) {
            this.TypeList = new Long[source.TypeList.length];
            for (int i = 0; i < source.TypeList.length; i++) {
                this.TypeList[i] = new Long(source.TypeList[i]);
            }
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.ProductVersions != null) {
            this.ProductVersions = new String[source.ProductVersions.length];
            for (int i = 0; i < source.ProductVersions.length; i++) {
                this.ProductVersions[i] = new String(source.ProductVersions[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.AzMode != null) {
            this.AzMode = new String(source.AzMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "TypeVersion", this.TypeVersion);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamArraySimple(map, prefix + "AutoRenew.", this.AutoRenew);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamArraySimple(map, prefix + "TypeList.", this.TypeList);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamArraySimple(map, prefix + "ProductVersions.", this.ProductVersions);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "AzMode", this.AzMode);

    }
}

