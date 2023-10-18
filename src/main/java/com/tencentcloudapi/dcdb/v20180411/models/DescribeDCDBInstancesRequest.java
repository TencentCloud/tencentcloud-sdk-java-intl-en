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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDCDBInstancesRequest extends AbstractModel {

    /**
    * Query by instance ID or IDs. Instance ID is in the format of dcdbt-2t4cf98d
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Search field name. Valid values: instancename (search by instance name); vip (search by private IP); all (search by instance ID, instance name, and private IP).
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
    * Query by project ID
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
    * Sort by field. Valid values: projectId; createtime; instancename
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sort by type. Valid values: desc; asc
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
    * Number of returned results. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 1: non-dedicated cluster; 2: dedicated cluster; 0: all
    */
    @SerializedName("ExclusterType")
    @Expose
    private Long ExclusterType;

    /**
    * Identifies whether to use the `ExclusterType` field. false: no; true: yes
    */
    @SerializedName("IsFilterExcluster")
    @Expose
    private Boolean IsFilterExcluster;

    /**
    * Dedicated cluster ID
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
    * Use this filter to include instances in specific statuses
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Use this filter to exclude instances in specific statuses
    */
    @SerializedName("ExcludeStatus")
    @Expose
    private Long [] ExcludeStatus;

    /**
     * Get Query by instance ID or IDs. Instance ID is in the format of dcdbt-2t4cf98d 
     * @return InstanceIds Query by instance ID or IDs. Instance ID is in the format of dcdbt-2t4cf98d
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Query by instance ID or IDs. Instance ID is in the format of dcdbt-2t4cf98d
     * @param InstanceIds Query by instance ID or IDs. Instance ID is in the format of dcdbt-2t4cf98d
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Search field name. Valid values: instancename (search by instance name); vip (search by private IP); all (search by instance ID, instance name, and private IP). 
     * @return SearchName Search field name. Valid values: instancename (search by instance name); vip (search by private IP); all (search by instance ID, instance name, and private IP).
     */
    public String getSearchName() {
        return this.SearchName;
    }

    /**
     * Set Search field name. Valid values: instancename (search by instance name); vip (search by private IP); all (search by instance ID, instance name, and private IP).
     * @param SearchName Search field name. Valid values: instancename (search by instance name); vip (search by private IP); all (search by instance ID, instance name, and private IP).
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
     * Get Query by project ID 
     * @return ProjectIds Query by project ID
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Query by project ID
     * @param ProjectIds Query by project ID
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
     * Get Sort by field. Valid values: projectId; createtime; instancename 
     * @return OrderBy Sort by field. Valid values: projectId; createtime; instancename
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort by field. Valid values: projectId; createtime; instancename
     * @param OrderBy Sort by field. Valid values: projectId; createtime; instancename
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sort by type. Valid values: desc; asc 
     * @return OrderByType Sort by type. Valid values: desc; asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sort by type. Valid values: desc; asc
     * @param OrderByType Sort by type. Valid values: desc; asc
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
     * Get Number of returned results. Default value: 10. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 10. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 1: non-dedicated cluster; 2: dedicated cluster; 0: all 
     * @return ExclusterType 1: non-dedicated cluster; 2: dedicated cluster; 0: all
     */
    public Long getExclusterType() {
        return this.ExclusterType;
    }

    /**
     * Set 1: non-dedicated cluster; 2: dedicated cluster; 0: all
     * @param ExclusterType 1: non-dedicated cluster; 2: dedicated cluster; 0: all
     */
    public void setExclusterType(Long ExclusterType) {
        this.ExclusterType = ExclusterType;
    }

    /**
     * Get Identifies whether to use the `ExclusterType` field. false: no; true: yes 
     * @return IsFilterExcluster Identifies whether to use the `ExclusterType` field. false: no; true: yes
     */
    public Boolean getIsFilterExcluster() {
        return this.IsFilterExcluster;
    }

    /**
     * Set Identifies whether to use the `ExclusterType` field. false: no; true: yes
     * @param IsFilterExcluster Identifies whether to use the `ExclusterType` field. false: no; true: yes
     */
    public void setIsFilterExcluster(Boolean IsFilterExcluster) {
        this.IsFilterExcluster = IsFilterExcluster;
    }

    /**
     * Get Dedicated cluster ID 
     * @return ExclusterIds Dedicated cluster ID
     */
    public String [] getExclusterIds() {
        return this.ExclusterIds;
    }

    /**
     * Set Dedicated cluster ID
     * @param ExclusterIds Dedicated cluster ID
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
     * Get Use this filter to include instances in specific statuses 
     * @return Status Use this filter to include instances in specific statuses
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Use this filter to include instances in specific statuses
     * @param Status Use this filter to include instances in specific statuses
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Use this filter to exclude instances in specific statuses 
     * @return ExcludeStatus Use this filter to exclude instances in specific statuses
     */
    public Long [] getExcludeStatus() {
        return this.ExcludeStatus;
    }

    /**
     * Set Use this filter to exclude instances in specific statuses
     * @param ExcludeStatus Use this filter to exclude instances in specific statuses
     */
    public void setExcludeStatus(Long [] ExcludeStatus) {
        this.ExcludeStatus = ExcludeStatus;
    }

    public DescribeDCDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDCDBInstancesRequest(DescribeDCDBInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.SearchName != null) {
            this.SearchName = new String(source.SearchName);
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
        if (source.IsFilterVpc != null) {
            this.IsFilterVpc = new Boolean(source.IsFilterVpc);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ExclusterType != null) {
            this.ExclusterType = new Long(source.ExclusterType);
        }
        if (source.IsFilterExcluster != null) {
            this.IsFilterExcluster = new Boolean(source.IsFilterExcluster);
        }
        if (source.ExclusterIds != null) {
            this.ExclusterIds = new String[source.ExclusterIds.length];
            for (int i = 0; i < source.ExclusterIds.length; i++) {
                this.ExclusterIds[i] = new String(source.ExclusterIds[i]);
            }
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.FilterInstanceType != null) {
            this.FilterInstanceType = new String(source.FilterInstanceType);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.ExcludeStatus != null) {
            this.ExcludeStatus = new Long[source.ExcludeStatus.length];
            for (int i = 0; i < source.ExcludeStatus.length; i++) {
                this.ExcludeStatus[i] = new Long(source.ExcludeStatus[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "ExclusterType", this.ExclusterType);
        this.setParamSimple(map, prefix + "IsFilterExcluster", this.IsFilterExcluster);
        this.setParamArraySimple(map, prefix + "ExclusterIds.", this.ExclusterIds);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "FilterInstanceType", this.FilterInstanceType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "ExcludeStatus.", this.ExcludeStatus);

    }
}

