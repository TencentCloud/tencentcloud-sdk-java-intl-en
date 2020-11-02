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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel{

    /**
    * Queries by instance ID or IDs. Instance ID is in the format of `tdsql-ow728lmc`. Up to 100 instances can be queried in one request.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Search field name. Valid values: instancename (search by instance name), vip (search by private IP), all (search by instance ID, instance name, and private IP).
    */
    @SerializedName("SearchName")
    @Expose
    private String SearchName;

    /**
    * Search keyword. Fuzzy search is supported. Multiple keywords should be separated by line breaks (`\n`).
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Queries by project ID
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Whether to search by VPC
    */
    @SerializedName("IsFilterVpc")
    @Expose
    private Boolean IsFilterVpc;

    /**
    * VPC ID, which is valid when `IsFilterVpc` is 1
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID, which is valid when `IsFilterVpc` is 1
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Sort by field. Valid values: projectId, createtime, instancename
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: desc, asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Queries by `OriginSerialId`
    */
    @SerializedName("OriginSerialIds")
    @Expose
    private String [] OriginSerialIds;

    /**
    * Identifies whether to use the `ExclusterType` field. false: no, true: yes
    */
    @SerializedName("IsFilterExcluster")
    @Expose
    private Boolean IsFilterExcluster;

    /**
    * Instance cluster type. 1: non-dedicated cluster, 2: dedicated cluster, 0: all
    */
    @SerializedName("ExclusterType")
    @Expose
    private Long ExclusterType;

    /**
    * Filters instances by dedicated cluster ID in the format of `dbdc-4ih6uct9`
    */
    @SerializedName("ExclusterIds")
    @Expose
    private String [] ExclusterIds;

    /**
    * Tag key used in queries
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * Instance types used in filtering. Valid values: 1 (dedicated instance), 2 (primary instance), 3 (disaster recovery instance). Multiple values should be separated by commas.
    */
    @SerializedName("FilterInstanceType")
    @Expose
    private String FilterInstanceType;

    /**
     * Get Queries by instance ID or IDs. Instance ID is in the format of `tdsql-ow728lmc`. Up to 100 instances can be queried in one request. 
     * @return InstanceIds Queries by instance ID or IDs. Instance ID is in the format of `tdsql-ow728lmc`. Up to 100 instances can be queried in one request.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Queries by instance ID or IDs. Instance ID is in the format of `tdsql-ow728lmc`. Up to 100 instances can be queried in one request.
     * @param InstanceIds Queries by instance ID or IDs. Instance ID is in the format of `tdsql-ow728lmc`. Up to 100 instances can be queried in one request.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Search field name. Valid values: instancename (search by instance name), vip (search by private IP), all (search by instance ID, instance name, and private IP). 
     * @return SearchName Search field name. Valid values: instancename (search by instance name), vip (search by private IP), all (search by instance ID, instance name, and private IP).
     */
    public String getSearchName() {
        return this.SearchName;
    }

    /**
     * Set Search field name. Valid values: instancename (search by instance name), vip (search by private IP), all (search by instance ID, instance name, and private IP).
     * @param SearchName Search field name. Valid values: instancename (search by instance name), vip (search by private IP), all (search by instance ID, instance name, and private IP).
     */
    public void setSearchName(String SearchName) {
        this.SearchName = SearchName;
    }

    /**
     * Get Search keyword. Fuzzy search is supported. Multiple keywords should be separated by line breaks (`\n`). 
     * @return SearchKey Search keyword. Fuzzy search is supported. Multiple keywords should be separated by line breaks (`\n`).
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search keyword. Fuzzy search is supported. Multiple keywords should be separated by line breaks (`\n`).
     * @param SearchKey Search keyword. Fuzzy search is supported. Multiple keywords should be separated by line breaks (`\n`).
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Queries by project ID 
     * @return ProjectIds Queries by project ID
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Queries by project ID
     * @param ProjectIds Queries by project ID
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Whether to search by VPC 
     * @return IsFilterVpc Whether to search by VPC
     */
    public Boolean getIsFilterVpc() {
        return this.IsFilterVpc;
    }

    /**
     * Set Whether to search by VPC
     * @param IsFilterVpc Whether to search by VPC
     */
    public void setIsFilterVpc(Boolean IsFilterVpc) {
        this.IsFilterVpc = IsFilterVpc;
    }

    /**
     * Get VPC ID, which is valid when `IsFilterVpc` is 1 
     * @return VpcId VPC ID, which is valid when `IsFilterVpc` is 1
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, which is valid when `IsFilterVpc` is 1
     * @param VpcId VPC ID, which is valid when `IsFilterVpc` is 1
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID, which is valid when `IsFilterVpc` is 1 
     * @return SubnetId VPC subnet ID, which is valid when `IsFilterVpc` is 1
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID, which is valid when `IsFilterVpc` is 1
     * @param SubnetId VPC subnet ID, which is valid when `IsFilterVpc` is 1
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Sort by field. Valid values: projectId, createtime, instancename 
     * @return OrderBy Sort by field. Valid values: projectId, createtime, instancename
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort by field. Valid values: projectId, createtime, instancename
     * @param OrderBy Sort by field. Valid values: projectId, createtime, instancename
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: desc, asc 
     * @return OrderByType Sorting order. Valid values: desc, asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: desc, asc
     * @param OrderByType Sorting order. Valid values: desc, asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned. Default value: 20. Maximum value: 100. 
     * @return Limit Number of results to be returned. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: 20. Maximum value: 100.
     * @param Limit Number of results to be returned. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Queries by `OriginSerialId` 
     * @return OriginSerialIds Queries by `OriginSerialId`
     */
    public String [] getOriginSerialIds() {
        return this.OriginSerialIds;
    }

    /**
     * Set Queries by `OriginSerialId`
     * @param OriginSerialIds Queries by `OriginSerialId`
     */
    public void setOriginSerialIds(String [] OriginSerialIds) {
        this.OriginSerialIds = OriginSerialIds;
    }

    /**
     * Get Identifies whether to use the `ExclusterType` field. false: no, true: yes 
     * @return IsFilterExcluster Identifies whether to use the `ExclusterType` field. false: no, true: yes
     */
    public Boolean getIsFilterExcluster() {
        return this.IsFilterExcluster;
    }

    /**
     * Set Identifies whether to use the `ExclusterType` field. false: no, true: yes
     * @param IsFilterExcluster Identifies whether to use the `ExclusterType` field. false: no, true: yes
     */
    public void setIsFilterExcluster(Boolean IsFilterExcluster) {
        this.IsFilterExcluster = IsFilterExcluster;
    }

    /**
     * Get Instance cluster type. 1: non-dedicated cluster, 2: dedicated cluster, 0: all 
     * @return ExclusterType Instance cluster type. 1: non-dedicated cluster, 2: dedicated cluster, 0: all
     */
    public Long getExclusterType() {
        return this.ExclusterType;
    }

    /**
     * Set Instance cluster type. 1: non-dedicated cluster, 2: dedicated cluster, 0: all
     * @param ExclusterType Instance cluster type. 1: non-dedicated cluster, 2: dedicated cluster, 0: all
     */
    public void setExclusterType(Long ExclusterType) {
        this.ExclusterType = ExclusterType;
    }

    /**
     * Get Filters instances by dedicated cluster ID in the format of `dbdc-4ih6uct9` 
     * @return ExclusterIds Filters instances by dedicated cluster ID in the format of `dbdc-4ih6uct9`
     */
    public String [] getExclusterIds() {
        return this.ExclusterIds;
    }

    /**
     * Set Filters instances by dedicated cluster ID in the format of `dbdc-4ih6uct9`
     * @param ExclusterIds Filters instances by dedicated cluster ID in the format of `dbdc-4ih6uct9`
     */
    public void setExclusterIds(String [] ExclusterIds) {
        this.ExclusterIds = ExclusterIds;
    }

    /**
     * Get Tag key used in queries 
     * @return TagKeys Tag key used in queries
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set Tag key used in queries
     * @param TagKeys Tag key used in queries
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get Instance types used in filtering. Valid values: 1 (dedicated instance), 2 (primary instance), 3 (disaster recovery instance). Multiple values should be separated by commas. 
     * @return FilterInstanceType Instance types used in filtering. Valid values: 1 (dedicated instance), 2 (primary instance), 3 (disaster recovery instance). Multiple values should be separated by commas.
     */
    public String getFilterInstanceType() {
        return this.FilterInstanceType;
    }

    /**
     * Set Instance types used in filtering. Valid values: 1 (dedicated instance), 2 (primary instance), 3 (disaster recovery instance). Multiple values should be separated by commas.
     * @param FilterInstanceType Instance types used in filtering. Valid values: 1 (dedicated instance), 2 (primary instance), 3 (disaster recovery instance). Multiple values should be separated by commas.
     */
    public void setFilterInstanceType(String FilterInstanceType) {
        this.FilterInstanceType = FilterInstanceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "SearchName", this.SearchName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "IsFilterVpc", this.IsFilterVpc);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "OriginSerialIds.", this.OriginSerialIds);
        this.setParamSimple(map, prefix + "IsFilterExcluster", this.IsFilterExcluster);
        this.setParamSimple(map, prefix + "ExclusterType", this.ExclusterType);
        this.setParamArraySimple(map, prefix + "ExclusterIds.", this.ExclusterIds);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "FilterInstanceType", this.FilterInstanceType);

    }
}

