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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel{

    /**
    * List of instance IDs in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance type. Valid values: 0 (all instances), 1 (promoted), 2 (temp), 3 (read-only), -1 (promoted + read-only + disaster recovery)
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance), -1 (all instances)
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * Instance status. Valid values: `0` (to be initialized), `1` (executing task), `2` (running), `-2` (isolated monthly-subscribed instance), `-3` (isolated pay-as-you-go instance)
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * VPC ID. This parameter can be left empty for the basic network
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID of VPC. This parameter can be left empty for the basic network. If it is passed in as an input parameter, the corresponding VpcId must be set
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Billing type. Valid value: 0 (pay-as-you-go)
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Number of results to be returned for a single request. Valid values: 1-100. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort by field of the returned result set. Currently, supported values include "ProjectId", "InstanceName", and "CreateTime". The return results are sorted in ascending order by default.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting method of the return result set. Currently, "ASC" or "DESC" is supported
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Project ID
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Search keyword, which can be instance ID, instance name, or complete IP
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Tag information
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo Tags;

    /**
     * Get List of instance IDs in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page 
     * @return InstanceIds List of instance IDs in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of instance IDs in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page
     * @param InstanceIds List of instance IDs in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Instance type. Valid values: 0 (all instances), 1 (promoted), 2 (temp), 3 (read-only), -1 (promoted + read-only + disaster recovery) 
     * @return InstanceType Instance type. Valid values: 0 (all instances), 1 (promoted), 2 (temp), 3 (read-only), -1 (promoted + read-only + disaster recovery)
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values: 0 (all instances), 1 (promoted), 2 (temp), 3 (read-only), -1 (promoted + read-only + disaster recovery)
     * @param InstanceType Instance type. Valid values: 0 (all instances), 1 (promoted), 2 (temp), 3 (read-only), -1 (promoted + read-only + disaster recovery)
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance), -1 (all instances) 
     * @return ClusterType Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance), -1 (all instances)
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance), -1 (all instances)
     * @param ClusterType Cluster type. Valid values: 0 (replica set instance), 1 (sharding instance), -1 (all instances)
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Instance status. Valid values: `0` (to be initialized), `1` (executing task), `2` (running), `-2` (isolated monthly-subscribed instance), `-3` (isolated pay-as-you-go instance) 
     * @return Status Instance status. Valid values: `0` (to be initialized), `1` (executing task), `2` (running), `-2` (isolated monthly-subscribed instance), `-3` (isolated pay-as-you-go instance)
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: `0` (to be initialized), `1` (executing task), `2` (running), `-2` (isolated monthly-subscribed instance), `-3` (isolated pay-as-you-go instance)
     * @param Status Instance status. Valid values: `0` (to be initialized), `1` (executing task), `2` (running), `-2` (isolated monthly-subscribed instance), `-3` (isolated pay-as-you-go instance)
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get VPC ID. This parameter can be left empty for the basic network 
     * @return VpcId VPC ID. This parameter can be left empty for the basic network
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. This parameter can be left empty for the basic network
     * @param VpcId VPC ID. This parameter can be left empty for the basic network
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID of VPC. This parameter can be left empty for the basic network. If it is passed in as an input parameter, the corresponding VpcId must be set 
     * @return SubnetId Subnet ID of VPC. This parameter can be left empty for the basic network. If it is passed in as an input parameter, the corresponding VpcId must be set
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID of VPC. This parameter can be left empty for the basic network. If it is passed in as an input parameter, the corresponding VpcId must be set
     * @param SubnetId Subnet ID of VPC. This parameter can be left empty for the basic network. If it is passed in as an input parameter, the corresponding VpcId must be set
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Billing type. Valid value: 0 (pay-as-you-go) 
     * @return PayMode Billing type. Valid value: 0 (pay-as-you-go)
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing type. Valid value: 0 (pay-as-you-go)
     * @param PayMode Billing type. Valid value: 0 (pay-as-you-go)
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Number of results to be returned for a single request. Valid values: 1-100. Default value: 20 
     * @return Limit Number of results to be returned for a single request. Valid values: 1-100. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned for a single request. Valid values: 1-100. Default value: 20
     * @param Limit Number of results to be returned for a single request. Valid values: 1-100. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get Sort by field of the returned result set. Currently, supported values include "ProjectId", "InstanceName", and "CreateTime". The return results are sorted in ascending order by default. 
     * @return OrderBy Sort by field of the returned result set. Currently, supported values include "ProjectId", "InstanceName", and "CreateTime". The return results are sorted in ascending order by default.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sort by field of the returned result set. Currently, supported values include "ProjectId", "InstanceName", and "CreateTime". The return results are sorted in ascending order by default.
     * @param OrderBy Sort by field of the returned result set. Currently, supported values include "ProjectId", "InstanceName", and "CreateTime". The return results are sorted in ascending order by default.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting method of the return result set. Currently, "ASC" or "DESC" is supported 
     * @return OrderByType Sorting method of the return result set. Currently, "ASC" or "DESC" is supported
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting method of the return result set. Currently, "ASC" or "DESC" is supported
     * @param OrderByType Sorting method of the return result set. Currently, "ASC" or "DESC" is supported
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Project ID 
     * @return ProjectIds Project ID
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID
     * @param ProjectIds Project ID
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Search keyword, which can be instance ID, instance name, or complete IP 
     * @return SearchKey Search keyword, which can be instance ID, instance name, or complete IP
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search keyword, which can be instance ID, instance name, or complete IP
     * @param SearchKey Search keyword, which can be instance ID, instance name, or complete IP
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Tag information 
     * @return Tags Tag information
     */
    public TagInfo getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information
     * @param Tags Tag information
     */
    public void setTags(TagInfo Tags) {
        this.Tags = Tags;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamObj(map, prefix + "Tags.", this.Tags);

    }
}

