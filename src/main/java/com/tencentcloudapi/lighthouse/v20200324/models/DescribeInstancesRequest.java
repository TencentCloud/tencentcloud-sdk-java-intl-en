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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * List of instance IDs. The maximum number of instances in each request is 100. You can obtain the instance IDs from the `InstanceId` field in the response of the [DescribeInstances](https://www.tencentcloud.com/document/api/1207/47573?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * List of filters.
<li>instance-name</li>Filters by instance name.
Type: String
Required: No
<li>private-ip-address</li>Filters by the private IP of the primary ENI of the instance.
Type: String
Required: No
<li>public-ip-address</li>Filters by the public IP of the primary ENI of the instance.
Type: String
Required: No
<li>zone</li>Filters by AZ.
Type: String
Required: No
<li>instance-state</li>Filters by instance state.
Type: String
Required: No
<li>tag-key</li>Filters by tag key.
Type: String
Required: No
<li>tag-value</li>Filters by tag value.
Type: String
Required: No
<li> tag:tag-key</li>Filters by tag key-value pair. Replace tag-key with the specific tag key.
Type: String
Required: No
<li>bundle-id</li>Filters by bundle ID.
Type: String
Required: No

The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 100. You cannot specify both InstanceIds and Filters at the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies the field by which to sort. Valid values: "EXPIRED_TIME": Sorts by the expiration time of the instance. 
 If this field is not passed in, instances with the status of "pending reclamation" are returned first, and the remaining instances are returned in descending order by creation time.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * The order in which the output instance list is sorted. Valid values:
"ASC": Sorts in ascending order.
"DESC": Sorts in descending order.
By default, the list is sorted in ascending order. If this field is passed in, OrderField must be specified.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get List of instance IDs. The maximum number of instances in each request is 100. You can obtain the instance IDs from the `InstanceId` field in the response of the [DescribeInstances](https://www.tencentcloud.com/document/api/1207/47573?from_cn_redirect=1) API. 
     * @return InstanceIds List of instance IDs. The maximum number of instances in each request is 100. You can obtain the instance IDs from the `InstanceId` field in the response of the [DescribeInstances](https://www.tencentcloud.com/document/api/1207/47573?from_cn_redirect=1) API.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of instance IDs. The maximum number of instances in each request is 100. You can obtain the instance IDs from the `InstanceId` field in the response of the [DescribeInstances](https://www.tencentcloud.com/document/api/1207/47573?from_cn_redirect=1) API.
     * @param InstanceIds List of instance IDs. The maximum number of instances in each request is 100. You can obtain the instance IDs from the `InstanceId` field in the response of the [DescribeInstances](https://www.tencentcloud.com/document/api/1207/47573?from_cn_redirect=1) API.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get List of filters.
<li>instance-name</li>Filters by instance name.
Type: String
Required: No
<li>private-ip-address</li>Filters by the private IP of the primary ENI of the instance.
Type: String
Required: No
<li>public-ip-address</li>Filters by the public IP of the primary ENI of the instance.
Type: String
Required: No
<li>zone</li>Filters by AZ.
Type: String
Required: No
<li>instance-state</li>Filters by instance state.
Type: String
Required: No
<li>tag-key</li>Filters by tag key.
Type: String
Required: No
<li>tag-value</li>Filters by tag value.
Type: String
Required: No
<li> tag:tag-key</li>Filters by tag key-value pair. Replace tag-key with the specific tag key.
Type: String
Required: No
<li>bundle-id</li>Filters by bundle ID.
Type: String
Required: No

The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 100. You cannot specify both InstanceIds and Filters at the same time. 
     * @return Filters List of filters.
<li>instance-name</li>Filters by instance name.
Type: String
Required: No
<li>private-ip-address</li>Filters by the private IP of the primary ENI of the instance.
Type: String
Required: No
<li>public-ip-address</li>Filters by the public IP of the primary ENI of the instance.
Type: String
Required: No
<li>zone</li>Filters by AZ.
Type: String
Required: No
<li>instance-state</li>Filters by instance state.
Type: String
Required: No
<li>tag-key</li>Filters by tag key.
Type: String
Required: No
<li>tag-value</li>Filters by tag value.
Type: String
Required: No
<li> tag:tag-key</li>Filters by tag key-value pair. Replace tag-key with the specific tag key.
Type: String
Required: No
<li>bundle-id</li>Filters by bundle ID.
Type: String
Required: No

The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 100. You cannot specify both InstanceIds and Filters at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set List of filters.
<li>instance-name</li>Filters by instance name.
Type: String
Required: No
<li>private-ip-address</li>Filters by the private IP of the primary ENI of the instance.
Type: String
Required: No
<li>public-ip-address</li>Filters by the public IP of the primary ENI of the instance.
Type: String
Required: No
<li>zone</li>Filters by AZ.
Type: String
Required: No
<li>instance-state</li>Filters by instance state.
Type: String
Required: No
<li>tag-key</li>Filters by tag key.
Type: String
Required: No
<li>tag-value</li>Filters by tag value.
Type: String
Required: No
<li> tag:tag-key</li>Filters by tag key-value pair. Replace tag-key with the specific tag key.
Type: String
Required: No
<li>bundle-id</li>Filters by bundle ID.
Type: String
Required: No

The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 100. You cannot specify both InstanceIds and Filters at the same time.
     * @param Filters List of filters.
<li>instance-name</li>Filters by instance name.
Type: String
Required: No
<li>private-ip-address</li>Filters by the private IP of the primary ENI of the instance.
Type: String
Required: No
<li>public-ip-address</li>Filters by the public IP of the primary ENI of the instance.
Type: String
Required: No
<li>zone</li>Filters by AZ.
Type: String
Required: No
<li>instance-state</li>Filters by instance state.
Type: String
Required: No
<li>tag-key</li>Filters by tag key.
Type: String
Required: No
<li>tag-value</li>Filters by tag value.
Type: String
Required: No
<li> tag:tag-key</li>Filters by tag key-value pair. Replace tag-key with the specific tag key.
Type: String
Required: No
<li>bundle-id</li>Filters by bundle ID.
Type: String
Required: No

The maximum number of Filters per request is 10, and the maximum number of Filter.Values is 100. You cannot specify both InstanceIds and Filters at the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [Introduction](https://www.tencentcloud.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies the field by which to sort. Valid values: "EXPIRED_TIME": Sorts by the expiration time of the instance. 
 If this field is not passed in, instances with the status of "pending reclamation" are returned first, and the remaining instances are returned in descending order by creation time. 
     * @return OrderField Specifies the field by which to sort. Valid values: "EXPIRED_TIME": Sorts by the expiration time of the instance. 
 If this field is not passed in, instances with the status of "pending reclamation" are returned first, and the remaining instances are returned in descending order by creation time.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Specifies the field by which to sort. Valid values: "EXPIRED_TIME": Sorts by the expiration time of the instance. 
 If this field is not passed in, instances with the status of "pending reclamation" are returned first, and the remaining instances are returned in descending order by creation time.
     * @param OrderField Specifies the field by which to sort. Valid values: "EXPIRED_TIME": Sorts by the expiration time of the instance. 
 If this field is not passed in, instances with the status of "pending reclamation" are returned first, and the remaining instances are returned in descending order by creation time.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get The order in which the output instance list is sorted. Valid values:
"ASC": Sorts in ascending order.
"DESC": Sorts in descending order.
By default, the list is sorted in ascending order. If this field is passed in, OrderField must be specified. 
     * @return Order The order in which the output instance list is sorted. Valid values:
"ASC": Sorts in ascending order.
"DESC": Sorts in descending order.
By default, the list is sorted in ascending order. If this field is passed in, OrderField must be specified.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set The order in which the output instance list is sorted. Valid values:
"ASC": Sorts in ascending order.
"DESC": Sorts in descending order.
By default, the list is sorted in ascending order. If this field is passed in, OrderField must be specified.
     * @param Order The order in which the output instance list is sorted. Valid values:
"ASC": Sorts in ascending order.
"DESC": Sorts in descending order.
By default, the list is sorted in ascending order. If this field is passed in, OrderField must be specified.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

