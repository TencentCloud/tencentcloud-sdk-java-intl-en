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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoutePolicyEntriesRequest extends AbstractModel {

    /**
    * Filter criteria. RoutePolicyEntryIds and Filters cannot be specified at the same time.
<li>route-policy-id - String - (filter condition) specifies the instance id of the route reception policy, such as rrp-f49l6u0z.</li>.
<li>cidr-block - String - (filter condition) cidr (subnet part before the mask), such as 10.0.0.0/8.</li>.
<li>priority - Integer - filter condition. specifies the priority, such as 20.</li>.
<li>gateway-type - String - (filter criteria) next hop type, such as CVM.</li>.
<li>GatewayId - String - specifies the unique id of the next hop instance, such as ccn-f49l6u0z.</li>.
<li>route-type - String - (filter condition) routing type. valid values: USER (USER route), NETD (route issued by network probe), CCN (CCN route).</li>.
<li>action - String - (filter condition) specifies the action. valid values: DROP (DROP), DISABLE (receive and DISABLE), ACCEPT (receive and enable).</li>.
<li>description - String - specifies the filter condition description, such as TEST.</li>.
<li>route-policy-item-id - String - (filter condition) specifies the entry unique id of the route reception policy, such as rrpi-dq782kw7.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of request objects.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting field. currently only supports the priority field.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Specifies the sorting order.
ASC: ascending order.
DESC: descending order.
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * Specifies the routing strategy entry ID.
    */
    @SerializedName("RoutePolicyEntryIds")
    @Expose
    private String [] RoutePolicyEntryIds;

    /**
     * Get Filter criteria. RoutePolicyEntryIds and Filters cannot be specified at the same time.
<li>route-policy-id - String - (filter condition) specifies the instance id of the route reception policy, such as rrp-f49l6u0z.</li>.
<li>cidr-block - String - (filter condition) cidr (subnet part before the mask), such as 10.0.0.0/8.</li>.
<li>priority - Integer - filter condition. specifies the priority, such as 20.</li>.
<li>gateway-type - String - (filter criteria) next hop type, such as CVM.</li>.
<li>GatewayId - String - specifies the unique id of the next hop instance, such as ccn-f49l6u0z.</li>.
<li>route-type - String - (filter condition) routing type. valid values: USER (USER route), NETD (route issued by network probe), CCN (CCN route).</li>.
<li>action - String - (filter condition) specifies the action. valid values: DROP (DROP), DISABLE (receive and DISABLE), ACCEPT (receive and enable).</li>.
<li>description - String - specifies the filter condition description, such as TEST.</li>.
<li>route-policy-item-id - String - (filter condition) specifies the entry unique id of the route reception policy, such as rrpi-dq782kw7.</li>. 
     * @return Filters Filter criteria. RoutePolicyEntryIds and Filters cannot be specified at the same time.
<li>route-policy-id - String - (filter condition) specifies the instance id of the route reception policy, such as rrp-f49l6u0z.</li>.
<li>cidr-block - String - (filter condition) cidr (subnet part before the mask), such as 10.0.0.0/8.</li>.
<li>priority - Integer - filter condition. specifies the priority, such as 20.</li>.
<li>gateway-type - String - (filter criteria) next hop type, such as CVM.</li>.
<li>GatewayId - String - specifies the unique id of the next hop instance, such as ccn-f49l6u0z.</li>.
<li>route-type - String - (filter condition) routing type. valid values: USER (USER route), NETD (route issued by network probe), CCN (CCN route).</li>.
<li>action - String - (filter condition) specifies the action. valid values: DROP (DROP), DISABLE (receive and DISABLE), ACCEPT (receive and enable).</li>.
<li>description - String - specifies the filter condition description, such as TEST.</li>.
<li>route-policy-item-id - String - (filter condition) specifies the entry unique id of the route reception policy, such as rrpi-dq782kw7.</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. RoutePolicyEntryIds and Filters cannot be specified at the same time.
<li>route-policy-id - String - (filter condition) specifies the instance id of the route reception policy, such as rrp-f49l6u0z.</li>.
<li>cidr-block - String - (filter condition) cidr (subnet part before the mask), such as 10.0.0.0/8.</li>.
<li>priority - Integer - filter condition. specifies the priority, such as 20.</li>.
<li>gateway-type - String - (filter criteria) next hop type, such as CVM.</li>.
<li>GatewayId - String - specifies the unique id of the next hop instance, such as ccn-f49l6u0z.</li>.
<li>route-type - String - (filter condition) routing type. valid values: USER (USER route), NETD (route issued by network probe), CCN (CCN route).</li>.
<li>action - String - (filter condition) specifies the action. valid values: DROP (DROP), DISABLE (receive and DISABLE), ACCEPT (receive and enable).</li>.
<li>description - String - specifies the filter condition description, such as TEST.</li>.
<li>route-policy-item-id - String - (filter condition) specifies the entry unique id of the route reception policy, such as rrpi-dq782kw7.</li>.
     * @param Filters Filter criteria. RoutePolicyEntryIds and Filters cannot be specified at the same time.
<li>route-policy-id - String - (filter condition) specifies the instance id of the route reception policy, such as rrp-f49l6u0z.</li>.
<li>cidr-block - String - (filter condition) cidr (subnet part before the mask), such as 10.0.0.0/8.</li>.
<li>priority - Integer - filter condition. specifies the priority, such as 20.</li>.
<li>gateway-type - String - (filter criteria) next hop type, such as CVM.</li>.
<li>GatewayId - String - specifies the unique id of the next hop instance, such as ccn-f49l6u0z.</li>.
<li>route-type - String - (filter condition) routing type. valid values: USER (USER route), NETD (route issued by network probe), CCN (CCN route).</li>.
<li>action - String - (filter condition) specifies the action. valid values: DROP (DROP), DISABLE (receive and DISABLE), ACCEPT (receive and enable).</li>.
<li>description - String - specifies the filter condition description, such as TEST.</li>.
<li>route-policy-item-id - String - (filter condition) specifies the entry unique id of the route reception policy, such as rrpi-dq782kw7.</li>.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of request objects. 
     * @return Limit Number of request objects.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of request objects.
     * @param Limit Number of request objects.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting field. currently only supports the priority field. 
     * @return OrderField Sorting field. currently only supports the priority field.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field. currently only supports the priority field.
     * @param OrderField Sorting field. currently only supports the priority field.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Specifies the sorting order.
ASC: ascending order.
DESC: descending order. 
     * @return OrderDirection Specifies the sorting order.
ASC: ascending order.
DESC: descending order.
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set Specifies the sorting order.
ASC: ascending order.
DESC: descending order.
     * @param OrderDirection Specifies the sorting order.
ASC: ascending order.
DESC: descending order.
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get Specifies the routing strategy entry ID. 
     * @return RoutePolicyEntryIds Specifies the routing strategy entry ID.
     */
    public String [] getRoutePolicyEntryIds() {
        return this.RoutePolicyEntryIds;
    }

    /**
     * Set Specifies the routing strategy entry ID.
     * @param RoutePolicyEntryIds Specifies the routing strategy entry ID.
     */
    public void setRoutePolicyEntryIds(String [] RoutePolicyEntryIds) {
        this.RoutePolicyEntryIds = RoutePolicyEntryIds;
    }

    public DescribeRoutePolicyEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoutePolicyEntriesRequest(DescribeRoutePolicyEntriesRequest source) {
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
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.RoutePolicyEntryIds != null) {
            this.RoutePolicyEntryIds = new String[source.RoutePolicyEntryIds.length];
            for (int i = 0; i < source.RoutePolicyEntryIds.length; i++) {
                this.RoutePolicyEntryIds[i] = new String(source.RoutePolicyEntryIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamArraySimple(map, prefix + "RoutePolicyEntryIds.", this.RoutePolicyEntryIds);

    }
}

