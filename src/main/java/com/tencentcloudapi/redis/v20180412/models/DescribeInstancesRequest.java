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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * <p>Number of instances output per page. Default parameter value: 20. Maximum value: 1000.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Pagination offset, which is an integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance list sorting criteria. Enumeration values are as follows:</p><ul><li>projectId: by project ID.</li><li>createtime: sort by instance creation time.</li><li>instancename: by instance name sorting.</li><li>type: by instance type.</li><li>curDeadline: by instance expiration time.</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>Instance sorting order, with a default value of reverse sorting.</p><ul><li>1: Reverse order.</li><li>0: Sequential order.</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default. For example: 47525. This parameter is temporarily reserved and can be ignored. Set the VPC ID array according to the format of the UniqVpcIds parameter.</p>
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * <p>Array of subnet IDs belonging to the private network, for example: 56854. This parameter is temporarily reserved and can be ignored. Set the private network subnet ID array according to the format of the UniqSubnetIds parameter.</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>Set the key field for fuzzy query. Only instance names support fuzzy query.</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>Array of project IDs.</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default, for example: vpc-sad23jfdfk.</p>
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * <p>Subnet ID array belonging to the private network, for example: subnet-fdj24n34j2.</p>
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * <p>Region ID array. This parameter has been deprecated. Use the common parameter Region to query the corresponding region.</p>
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * <p>Instance status.</p><ul><li>0: pending initialization.</li><li>1: in process.</li><li>2: running.</li><li>-2: isolated.</li><li>-3: pending deletion.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>Instance architecture version.</p><ul><li>1: standalone edition.</li><li>2: primary/secondary edition.</li><li>3: cluster version.</li></ul>
    */
    @SerializedName("TypeVersion")
    @Expose
    private Long TypeVersion;

    /**
    * <p>Storage engine info. It can be set to Redis-2.8, Redis-4.0, Redis-5.0, Redis-6.0, or CKV.</p>
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * <p>Renewal mode.</p><ul><li>0: Manual renewal.</li><li>1: Automatic renewal.</li><li>2: No renewal after expiry.</li></ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long [] AutoRenew;

    /**
    * <p>Billing mode.</p><ul><li>postpaid: pay-as-you-go billing.</li><li>prepaid: annual/monthly subscription.</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>This parameter is an array type and supports configuring instance name, instance ID, and IP address. Among them, instance name uses fuzzy matching, while instance ID and IP address use exact matching.</p><ul><li>Each element in the array uses union for match query.</li><li>If <strong>InstanceId</strong> and <strong>SearchKeys</strong> are configured concurrently, their intersection is used for matching query.</li></ul>
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * <p>Internal parameter, which can be ignored.</p>
    */
    @SerializedName("TypeList")
    @Expose
    private Long [] TypeList;

    /**
    * <p>Internal parameter, which can be ignored.</p>
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * <p>Filter resources by tag Key and Value. If this parameter is not configured or the array is set to empty, no tag-based filtering is applied.</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * <p>Filter resources by tag Key. If this parameter is not configured or the array is set to empty, no filtering by tag Key is performed.</p>
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * <p>Deployment type of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.</p><p>Enumeration values:</p><ul><li>local: Common I.</li><li>localv2: Common II.</li><li>cdc: Dedicated cluster.</li></ul>
    */
    @SerializedName("ProductVersions")
    @Expose
    private String [] ProductVersions;

    /**
    * <p>Batch query the specified instance IDs. The returned results are mainly limited by Limit.</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Availability zone mode.</p><ul><li>singleaz: single availability zone.</li><li>multiaz: multi-availability zone.</li></ul>
    */
    @SerializedName("AzMode")
    @Expose
    private String AzMode;

    /**
     * Get <p>Number of instances output per page. Default parameter value: 20. Maximum value: 1000.</p> 
     * @return Limit <p>Number of instances output per page. Default parameter value: 20. Maximum value: 1000.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of instances output per page. Default parameter value: 20. Maximum value: 1000.</p>
     * @param Limit <p>Number of instances output per page. Default parameter value: 20. Maximum value: 1000.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Pagination offset, which is an integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p> 
     * @return Offset <p>Pagination offset, which is an integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset, which is an integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     * @param Offset <p>Pagination offset, which is an integer multiple of Limit. Calculation formula: offset=limit*(page number-1).</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance list sorting criteria. Enumeration values are as follows:</p><ul><li>projectId: by project ID.</li><li>createtime: sort by instance creation time.</li><li>instancename: by instance name sorting.</li><li>type: by instance type.</li><li>curDeadline: by instance expiration time.</li></ul> 
     * @return OrderBy <p>Instance list sorting criteria. Enumeration values are as follows:</p><ul><li>projectId: by project ID.</li><li>createtime: sort by instance creation time.</li><li>instancename: by instance name sorting.</li><li>type: by instance type.</li><li>curDeadline: by instance expiration time.</li></ul>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>Instance list sorting criteria. Enumeration values are as follows:</p><ul><li>projectId: by project ID.</li><li>createtime: sort by instance creation time.</li><li>instancename: by instance name sorting.</li><li>type: by instance type.</li><li>curDeadline: by instance expiration time.</li></ul>
     * @param OrderBy <p>Instance list sorting criteria. Enumeration values are as follows:</p><ul><li>projectId: by project ID.</li><li>createtime: sort by instance creation time.</li><li>instancename: by instance name sorting.</li><li>type: by instance type.</li><li>curDeadline: by instance expiration time.</li></ul>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>Instance sorting order, with a default value of reverse sorting.</p><ul><li>1: Reverse order.</li><li>0: Sequential order.</li></ul> 
     * @return OrderType <p>Instance sorting order, with a default value of reverse sorting.</p><ul><li>1: Reverse order.</li><li>0: Sequential order.</li></ul>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>Instance sorting order, with a default value of reverse sorting.</p><ul><li>1: Reverse order.</li><li>0: Sequential order.</li></ul>
     * @param OrderType <p>Instance sorting order, with a default value of reverse sorting.</p><ul><li>1: Reverse order.</li><li>0: Sequential order.</li></ul>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default. For example: 47525. This parameter is temporarily reserved and can be ignored. Set the VPC ID array according to the format of the UniqVpcIds parameter.</p> 
     * @return VpcIds <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default. For example: 47525. This parameter is temporarily reserved and can be ignored. Set the VPC ID array according to the format of the UniqVpcIds parameter.</p>
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default. For example: 47525. This parameter is temporarily reserved and can be ignored. Set the VPC ID array according to the format of the UniqVpcIds parameter.</p>
     * @param VpcIds <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default. For example: 47525. This parameter is temporarily reserved and can be ignored. Set the VPC ID array according to the format of the UniqVpcIds parameter.</p>
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get <p>Array of subnet IDs belonging to the private network, for example: 56854. This parameter is temporarily reserved and can be ignored. Set the private network subnet ID array according to the format of the UniqSubnetIds parameter.</p> 
     * @return SubnetIds <p>Array of subnet IDs belonging to the private network, for example: 56854. This parameter is temporarily reserved and can be ignored. Set the private network subnet ID array according to the format of the UniqSubnetIds parameter.</p>
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>Array of subnet IDs belonging to the private network, for example: 56854. This parameter is temporarily reserved and can be ignored. Set the private network subnet ID array according to the format of the UniqSubnetIds parameter.</p>
     * @param SubnetIds <p>Array of subnet IDs belonging to the private network, for example: 56854. This parameter is temporarily reserved and can be ignored. Set the private network subnet ID array according to the format of the UniqSubnetIds parameter.</p>
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>Set the key field for fuzzy query. Only instance names support fuzzy query.</p> 
     * @return SearchKey <p>Set the key field for fuzzy query. Only instance names support fuzzy query.</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>Set the key field for fuzzy query. Only instance names support fuzzy query.</p>
     * @param SearchKey <p>Set the key field for fuzzy query. Only instance names support fuzzy query.</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>Array of project IDs.</p> 
     * @return ProjectIds <p>Array of project IDs.</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>Array of project IDs.</p>
     * @param ProjectIds <p>Array of project IDs.</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default, for example: vpc-sad23jfdfk.</p> 
     * @return UniqVpcIds <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default, for example: vpc-sad23jfdfk.</p>
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default, for example: vpc-sad23jfdfk.</p>
     * @param UniqVpcIds <p>VPC ID array. If this parameter is not configured or the array is empty, the basic network is selected by default, for example: vpc-sad23jfdfk.</p>
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get <p>Subnet ID array belonging to the private network, for example: subnet-fdj24n34j2.</p> 
     * @return UniqSubnetIds <p>Subnet ID array belonging to the private network, for example: subnet-fdj24n34j2.</p>
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set <p>Subnet ID array belonging to the private network, for example: subnet-fdj24n34j2.</p>
     * @param UniqSubnetIds <p>Subnet ID array belonging to the private network, for example: subnet-fdj24n34j2.</p>
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get <p>Region ID array. This parameter has been deprecated. Use the common parameter Region to query the corresponding region.</p> 
     * @return RegionIds <p>Region ID array. This parameter has been deprecated. Use the common parameter Region to query the corresponding region.</p>
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>Region ID array. This parameter has been deprecated. Use the common parameter Region to query the corresponding region.</p>
     * @param RegionIds <p>Region ID array. This parameter has been deprecated. Use the common parameter Region to query the corresponding region.</p>
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get <p>Instance status.</p><ul><li>0: pending initialization.</li><li>1: in process.</li><li>2: running.</li><li>-2: isolated.</li><li>-3: pending deletion.</li></ul> 
     * @return Status <p>Instance status.</p><ul><li>0: pending initialization.</li><li>1: in process.</li><li>2: running.</li><li>-2: isolated.</li><li>-3: pending deletion.</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Instance status.</p><ul><li>0: pending initialization.</li><li>1: in process.</li><li>2: running.</li><li>-2: isolated.</li><li>-3: pending deletion.</li></ul>
     * @param Status <p>Instance status.</p><ul><li>0: pending initialization.</li><li>1: in process.</li><li>2: running.</li><li>-2: isolated.</li><li>-3: pending deletion.</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Instance architecture version.</p><ul><li>1: standalone edition.</li><li>2: primary/secondary edition.</li><li>3: cluster version.</li></ul> 
     * @return TypeVersion <p>Instance architecture version.</p><ul><li>1: standalone edition.</li><li>2: primary/secondary edition.</li><li>3: cluster version.</li></ul>
     */
    public Long getTypeVersion() {
        return this.TypeVersion;
    }

    /**
     * Set <p>Instance architecture version.</p><ul><li>1: standalone edition.</li><li>2: primary/secondary edition.</li><li>3: cluster version.</li></ul>
     * @param TypeVersion <p>Instance architecture version.</p><ul><li>1: standalone edition.</li><li>2: primary/secondary edition.</li><li>3: cluster version.</li></ul>
     */
    public void setTypeVersion(Long TypeVersion) {
        this.TypeVersion = TypeVersion;
    }

    /**
     * Get <p>Storage engine info. It can be set to Redis-2.8, Redis-4.0, Redis-5.0, Redis-6.0, or CKV.</p> 
     * @return EngineName <p>Storage engine info. It can be set to Redis-2.8, Redis-4.0, Redis-5.0, Redis-6.0, or CKV.</p>
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set <p>Storage engine info. It can be set to Redis-2.8, Redis-4.0, Redis-5.0, Redis-6.0, or CKV.</p>
     * @param EngineName <p>Storage engine info. It can be set to Redis-2.8, Redis-4.0, Redis-5.0, Redis-6.0, or CKV.</p>
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get <p>Renewal mode.</p><ul><li>0: Manual renewal.</li><li>1: Automatic renewal.</li><li>2: No renewal after expiry.</li></ul> 
     * @return AutoRenew <p>Renewal mode.</p><ul><li>0: Manual renewal.</li><li>1: Automatic renewal.</li><li>2: No renewal after expiry.</li></ul>
     */
    public Long [] getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>Renewal mode.</p><ul><li>0: Manual renewal.</li><li>1: Automatic renewal.</li><li>2: No renewal after expiry.</li></ul>
     * @param AutoRenew <p>Renewal mode.</p><ul><li>0: Manual renewal.</li><li>1: Automatic renewal.</li><li>2: No renewal after expiry.</li></ul>
     */
    public void setAutoRenew(Long [] AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>Billing mode.</p><ul><li>postpaid: pay-as-you-go billing.</li><li>prepaid: annual/monthly subscription.</li></ul> 
     * @return BillingMode <p>Billing mode.</p><ul><li>postpaid: pay-as-you-go billing.</li><li>prepaid: annual/monthly subscription.</li></ul>
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Billing mode.</p><ul><li>postpaid: pay-as-you-go billing.</li><li>prepaid: annual/monthly subscription.</li></ul>
     * @param BillingMode <p>Billing mode.</p><ul><li>postpaid: pay-as-you-go billing.</li><li>prepaid: annual/monthly subscription.</li></ul>
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul> 
     * @return Type <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul>
     * @param Type <p>Instance type.</p><ul><li>2: Redis 2.8 memory edition (standard architecture).</li><li>3: CKV 3.2 memory edition (standard architecture).</li><li>4: CKV 3.2 memory edition (cluster architecture).</li><li>5: Redis 2.8 memory edition (standalone).</li><li>6: Redis 4.0 memory edition (standard architecture).</li><li>7: Redis 4.0 memory edition (cluster architecture).</li><li>8: Redis 5.0 memory edition (standard architecture).</li><li>9: Redis 5.0 memory edition (cluster architecture).</li><li>15: Redis 6.2 memory edition (standard architecture).</li><li>16: Redis 6.2 memory edition (cluster architecture).</li><li>17: Redis 7.0 memory edition (standard architecture).</li><li>18: Redis 7.0 memory edition (cluster architecture).</li><li>200: Memcached 1.6 memory edition (cluster architecture).</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>This parameter is an array type and supports configuring instance name, instance ID, and IP address. Among them, instance name uses fuzzy matching, while instance ID and IP address use exact matching.</p><ul><li>Each element in the array uses union for match query.</li><li>If <strong>InstanceId</strong> and <strong>SearchKeys</strong> are configured concurrently, their intersection is used for matching query.</li></ul> 
     * @return SearchKeys <p>This parameter is an array type and supports configuring instance name, instance ID, and IP address. Among them, instance name uses fuzzy matching, while instance ID and IP address use exact matching.</p><ul><li>Each element in the array uses union for match query.</li><li>If <strong>InstanceId</strong> and <strong>SearchKeys</strong> are configured concurrently, their intersection is used for matching query.</li></ul>
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set <p>This parameter is an array type and supports configuring instance name, instance ID, and IP address. Among them, instance name uses fuzzy matching, while instance ID and IP address use exact matching.</p><ul><li>Each element in the array uses union for match query.</li><li>If <strong>InstanceId</strong> and <strong>SearchKeys</strong> are configured concurrently, their intersection is used for matching query.</li></ul>
     * @param SearchKeys <p>This parameter is an array type and supports configuring instance name, instance ID, and IP address. Among them, instance name uses fuzzy matching, while instance ID and IP address use exact matching.</p><ul><li>Each element in the array uses union for match query.</li><li>If <strong>InstanceId</strong> and <strong>SearchKeys</strong> are configured concurrently, their intersection is used for matching query.</li></ul>
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get <p>Internal parameter, which can be ignored.</p> 
     * @return TypeList <p>Internal parameter, which can be ignored.</p>
     */
    public Long [] getTypeList() {
        return this.TypeList;
    }

    /**
     * Set <p>Internal parameter, which can be ignored.</p>
     * @param TypeList <p>Internal parameter, which can be ignored.</p>
     */
    public void setTypeList(Long [] TypeList) {
        this.TypeList = TypeList;
    }

    /**
     * Get <p>Internal parameter, which can be ignored.</p> 
     * @return MonitorVersion <p>Internal parameter, which can be ignored.</p>
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set <p>Internal parameter, which can be ignored.</p>
     * @param MonitorVersion <p>Internal parameter, which can be ignored.</p>
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get <p>Filter resources by tag Key and Value. If this parameter is not configured or the array is set to empty, no tag-based filtering is applied.</p> 
     * @return InstanceTags <p>Filter resources by tag Key and Value. If this parameter is not configured or the array is set to empty, no tag-based filtering is applied.</p>
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>Filter resources by tag Key and Value. If this parameter is not configured or the array is set to empty, no tag-based filtering is applied.</p>
     * @param InstanceTags <p>Filter resources by tag Key and Value. If this parameter is not configured or the array is set to empty, no tag-based filtering is applied.</p>
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>Filter resources by tag Key. If this parameter is not configured or the array is set to empty, no filtering by tag Key is performed.</p> 
     * @return TagKeys <p>Filter resources by tag Key. If this parameter is not configured or the array is set to empty, no filtering by tag Key is performed.</p>
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set <p>Filter resources by tag Key. If this parameter is not configured or the array is set to empty, no filtering by tag Key is performed.</p>
     * @param TagKeys <p>Filter resources by tag Key. If this parameter is not configured or the array is set to empty, no filtering by tag Key is performed.</p>
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get <p>Deployment type of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.</p><p>Enumeration values:</p><ul><li>local: Common I.</li><li>localv2: Common II.</li><li>cdc: Dedicated cluster.</li></ul> 
     * @return ProductVersions <p>Deployment type of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.</p><p>Enumeration values:</p><ul><li>local: Common I.</li><li>localv2: Common II.</li><li>cdc: Dedicated cluster.</li></ul>
     */
    public String [] getProductVersions() {
        return this.ProductVersions;
    }

    /**
     * Set <p>Deployment type of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.</p><p>Enumeration values:</p><ul><li>local: Common I.</li><li>localv2: Common II.</li><li>cdc: Dedicated cluster.</li></ul>
     * @param ProductVersions <p>Deployment type of the instance. If this parameter is not configured or the array is set to empty, instances will not be filtered based on this parameter by default.</p><p>Enumeration values:</p><ul><li>local: Common I.</li><li>localv2: Common II.</li><li>cdc: Dedicated cluster.</li></ul>
     */
    public void setProductVersions(String [] ProductVersions) {
        this.ProductVersions = ProductVersions;
    }

    /**
     * Get <p>Batch query the specified instance IDs. The returned results are mainly limited by Limit.</p> 
     * @return InstanceIds <p>Batch query the specified instance IDs. The returned results are mainly limited by Limit.</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Batch query the specified instance IDs. The returned results are mainly limited by Limit.</p>
     * @param InstanceIds <p>Batch query the specified instance IDs. The returned results are mainly limited by Limit.</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Availability zone mode.</p><ul><li>singleaz: single availability zone.</li><li>multiaz: multi-availability zone.</li></ul> 
     * @return AzMode <p>Availability zone mode.</p><ul><li>singleaz: single availability zone.</li><li>multiaz: multi-availability zone.</li></ul>
     */
    public String getAzMode() {
        return this.AzMode;
    }

    /**
     * Set <p>Availability zone mode.</p><ul><li>singleaz: single availability zone.</li><li>multiaz: multi-availability zone.</li></ul>
     * @param AzMode <p>Availability zone mode.</p><ul><li>singleaz: single availability zone.</li><li>multiaz: multi-availability zone.</li></ul>
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

