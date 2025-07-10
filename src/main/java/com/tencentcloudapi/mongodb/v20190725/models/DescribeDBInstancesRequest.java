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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel {

    /**
    * Instance ID list. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Specifies the instance type for querying.<ul><li>0: all instances.</li><li>1: formal instance.</li><li>3: read-only instance.</li><li>4: disaster recovery instance.</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Specifies the cluster type of the queried instance.<ul><li>0: replica set instance.</li><li>1: sharded cluster instance.</li><li>-1: replica set and sharded cluster instance.</li></ul>
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * Specify the current status of the queried instance.<ul><li>0: pending initialization.</li><li>1: processing, such as modifying specifications or modifying parameters.</li><li>2: instance running normally.</li><li>-2: instance expired.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * VPC ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the ID on the **VPC** page.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the subnet ID on the **VPC** page.
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
    * Number of results returned per request. Default value: `20`. Value range: [1,100].
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Configures the field for sorting returned results. Currently, "ProjectId", "InstanceName", and "CreateTime" are supported for sorting.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Configures the method for sorting returned results.
 - ASC: ascending order.
 - DESC: descending order.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Project ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and select Project Management in the account information drop-down menu at the top right corner to query projects.
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Specifies the keyword for search. Specific instance IDs, instance names, or private IP addresses are supported.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Tag information, including the tag key and tag value.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get Instance ID list. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list. 
     * @return InstanceIds Instance ID list. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.
     * @param InstanceIds Instance ID list. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Specifies the instance type for querying.<ul><li>0: all instances.</li><li>1: formal instance.</li><li>3: read-only instance.</li><li>4: disaster recovery instance.</li></ul> 
     * @return InstanceType Specifies the instance type for querying.<ul><li>0: all instances.</li><li>1: formal instance.</li><li>3: read-only instance.</li><li>4: disaster recovery instance.</li></ul>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifies the instance type for querying.<ul><li>0: all instances.</li><li>1: formal instance.</li><li>3: read-only instance.</li><li>4: disaster recovery instance.</li></ul>
     * @param InstanceType Specifies the instance type for querying.<ul><li>0: all instances.</li><li>1: formal instance.</li><li>3: read-only instance.</li><li>4: disaster recovery instance.</li></ul>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Specifies the cluster type of the queried instance.<ul><li>0: replica set instance.</li><li>1: sharded cluster instance.</li><li>-1: replica set and sharded cluster instance.</li></ul> 
     * @return ClusterType Specifies the cluster type of the queried instance.<ul><li>0: replica set instance.</li><li>1: sharded cluster instance.</li><li>-1: replica set and sharded cluster instance.</li></ul>
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Specifies the cluster type of the queried instance.<ul><li>0: replica set instance.</li><li>1: sharded cluster instance.</li><li>-1: replica set and sharded cluster instance.</li></ul>
     * @param ClusterType Specifies the cluster type of the queried instance.<ul><li>0: replica set instance.</li><li>1: sharded cluster instance.</li><li>-1: replica set and sharded cluster instance.</li></ul>
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Specify the current status of the queried instance.<ul><li>0: pending initialization.</li><li>1: processing, such as modifying specifications or modifying parameters.</li><li>2: instance running normally.</li><li>-2: instance expired.</li></ul> 
     * @return Status Specify the current status of the queried instance.<ul><li>0: pending initialization.</li><li>1: processing, such as modifying specifications or modifying parameters.</li><li>2: instance running normally.</li><li>-2: instance expired.</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Specify the current status of the queried instance.<ul><li>0: pending initialization.</li><li>1: processing, such as modifying specifications or modifying parameters.</li><li>2: instance running normally.</li><li>-2: instance expired.</li></ul>
     * @param Status Specify the current status of the queried instance.<ul><li>0: pending initialization.</li><li>1: processing, such as modifying specifications or modifying parameters.</li><li>2: instance running normally.</li><li>-2: instance expired.</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get VPC ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the ID on the **VPC** page. 
     * @return VpcId VPC ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the ID on the **VPC** page.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the ID on the **VPC** page.
     * @param VpcId VPC ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the ID on the **VPC** page.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the subnet ID on the **VPC** page. 
     * @return SubnetId VPC subnet ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the subnet ID on the **VPC** page.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the subnet ID on the **VPC** page.
     * @param SubnetId VPC subnet ID.
 - You do not need to specify this parameter for basic networks.
 - Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB), click a VPC name in the instance list, and obtain the subnet ID on the **VPC** page.
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
     * Get Number of results returned per request. Default value: `20`. Value range: [1,100]. 
     * @return Limit Number of results returned per request. Default value: `20`. Value range: [1,100].
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results returned per request. Default value: `20`. Value range: [1,100].
     * @param Limit Number of results returned per request. Default value: `20`. Value range: [1,100].
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Configures the field for sorting returned results. Currently, "ProjectId", "InstanceName", and "CreateTime" are supported for sorting. 
     * @return OrderBy Configures the field for sorting returned results. Currently, "ProjectId", "InstanceName", and "CreateTime" are supported for sorting.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Configures the field for sorting returned results. Currently, "ProjectId", "InstanceName", and "CreateTime" are supported for sorting.
     * @param OrderBy Configures the field for sorting returned results. Currently, "ProjectId", "InstanceName", and "CreateTime" are supported for sorting.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Configures the method for sorting returned results.
 - ASC: ascending order.
 - DESC: descending order. 
     * @return OrderByType Configures the method for sorting returned results.
 - ASC: ascending order.
 - DESC: descending order.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Configures the method for sorting returned results.
 - ASC: ascending order.
 - DESC: descending order.
     * @param OrderByType Configures the method for sorting returned results.
 - ASC: ascending order.
 - DESC: descending order.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Project ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and select Project Management in the account information drop-down menu at the top right corner to query projects. 
     * @return ProjectIds Project ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and select Project Management in the account information drop-down menu at the top right corner to query projects.
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and select Project Management in the account information drop-down menu at the top right corner to query projects.
     * @param ProjectIds Project ID. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and select Project Management in the account information drop-down menu at the top right corner to query projects.
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Specifies the keyword for search. Specific instance IDs, instance names, or private IP addresses are supported. 
     * @return SearchKey Specifies the keyword for search. Specific instance IDs, instance names, or private IP addresses are supported.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Specifies the keyword for search. Specific instance IDs, instance names, or private IP addresses are supported.
     * @param SearchKey Specifies the keyword for search. Specific instance IDs, instance names, or private IP addresses are supported.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Tag information, including the tag key and tag value. 
     * @return Tags Tag information, including the tag key and tag value.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information, including the tag key and tag value.
     * @param Tags Tag information, including the tag key and tag value.
     */
    public void setTags(TagInfo [] Tags) {
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
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

