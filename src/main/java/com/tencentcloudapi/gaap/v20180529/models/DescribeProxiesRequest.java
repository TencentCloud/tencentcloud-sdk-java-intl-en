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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesRequest extends AbstractModel {

    /**
    * Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s an old parameter, please switch to ProxyIds.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters   
The upper limit on Filters for each request is 10, and the upper limit on Filter.Values is 5. This parameter does not support specifying InstanceIds and Filters at the same time. 
ProjectId - String - Required: No - Filter by a project ID.   
AccessRegion - String - Required: No - Filter by an access region.    
RealServerRegion - String - Required: No - Filter by an origin server region.
GroupId - String - Required: No - Filter by a connection group ID.
IPAddressVersion - String - Required: No - Filter by IP version.
PackageType - String - Required: No - Filter by package type of connection groups.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s a new parameter, and replaces InstanceIds.
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connections tagged any of them will be pulled.
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * When this field is 1, only not-grouped connections are pulled.
When this field is 0, only grouped connections are pulled.
When this field does not exist, all connections are pulled, including both not-grouped and grouped connections.
    */
    @SerializedName("Independent")
    @Expose
    private Long Independent;

    /**
    * Specifies how connections are listed. Valid values:
`asc`: Ascending order
`desc`: Descending order
Default: `desc`
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field. Valid values:
`create_time`: Sort by creation time
`proxy_id`: Sort by connection ID
`bandwidth`:Sort by bandwidth limit
`concurrent_connections`: Sort by number of concurrent connections
Default: `create_time`
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s an old parameter, please switch to ProxyIds. 
     * @return InstanceIds Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s an old parameter, please switch to ProxyIds.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s an old parameter, please switch to ProxyIds.
     * @param InstanceIds Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s an old parameter, please switch to ProxyIds.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters   
The upper limit on Filters for each request is 10, and the upper limit on Filter.Values is 5. This parameter does not support specifying InstanceIds and Filters at the same time. 
ProjectId - String - Required: No - Filter by a project ID.   
AccessRegion - String - Required: No - Filter by an access region.    
RealServerRegion - String - Required: No - Filter by an origin server region.
GroupId - String - Required: No - Filter by a connection group ID.
IPAddressVersion - String - Required: No - Filter by IP version.
PackageType - String - Required: No - Filter by package type of connection groups. 
     * @return Filters Filters   
The upper limit on Filters for each request is 10, and the upper limit on Filter.Values is 5. This parameter does not support specifying InstanceIds and Filters at the same time. 
ProjectId - String - Required: No - Filter by a project ID.   
AccessRegion - String - Required: No - Filter by an access region.    
RealServerRegion - String - Required: No - Filter by an origin server region.
GroupId - String - Required: No - Filter by a connection group ID.
IPAddressVersion - String - Required: No - Filter by IP version.
PackageType - String - Required: No - Filter by package type of connection groups.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters   
The upper limit on Filters for each request is 10, and the upper limit on Filter.Values is 5. This parameter does not support specifying InstanceIds and Filters at the same time. 
ProjectId - String - Required: No - Filter by a project ID.   
AccessRegion - String - Required: No - Filter by an access region.    
RealServerRegion - String - Required: No - Filter by an origin server region.
GroupId - String - Required: No - Filter by a connection group ID.
IPAddressVersion - String - Required: No - Filter by IP version.
PackageType - String - Required: No - Filter by package type of connection groups.
     * @param Filters Filters   
The upper limit on Filters for each request is 10, and the upper limit on Filter.Values is 5. This parameter does not support specifying InstanceIds and Filters at the same time. 
ProjectId - String - Required: No - Filter by a project ID.   
AccessRegion - String - Required: No - Filter by an access region.    
RealServerRegion - String - Required: No - Filter by an origin server region.
GroupId - String - Required: No - Filter by a connection group ID.
IPAddressVersion - String - Required: No - Filter by IP version.
PackageType - String - Required: No - Filter by package type of connection groups.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s a new parameter, and replaces InstanceIds. 
     * @return ProxyIds Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s a new parameter, and replaces InstanceIds.
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s a new parameter, and replaces InstanceIds.
     * @param ProxyIds Queries by one or multiple instance IDs. The upper limit on the number of instances for each request is 100. This parameter does not support specifying InstanceIds and Filters at the same time. It’s a new parameter, and replaces InstanceIds.
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connections tagged any of them will be pulled. 
     * @return TagSet Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connections tagged any of them will be pulled.
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connections tagged any of them will be pulled.
     * @param TagSet Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connections tagged any of them will be pulled.
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get When this field is 1, only not-grouped connections are pulled.
When this field is 0, only grouped connections are pulled.
When this field does not exist, all connections are pulled, including both not-grouped and grouped connections. 
     * @return Independent When this field is 1, only not-grouped connections are pulled.
When this field is 0, only grouped connections are pulled.
When this field does not exist, all connections are pulled, including both not-grouped and grouped connections.
     */
    public Long getIndependent() {
        return this.Independent;
    }

    /**
     * Set When this field is 1, only not-grouped connections are pulled.
When this field is 0, only grouped connections are pulled.
When this field does not exist, all connections are pulled, including both not-grouped and grouped connections.
     * @param Independent When this field is 1, only not-grouped connections are pulled.
When this field is 0, only grouped connections are pulled.
When this field does not exist, all connections are pulled, including both not-grouped and grouped connections.
     */
    public void setIndependent(Long Independent) {
        this.Independent = Independent;
    }

    /**
     * Get Specifies how connections are listed. Valid values:
`asc`: Ascending order
`desc`: Descending order
Default: `desc` 
     * @return Order Specifies how connections are listed. Valid values:
`asc`: Ascending order
`desc`: Descending order
Default: `desc`
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Specifies how connections are listed. Valid values:
`asc`: Ascending order
`desc`: Descending order
Default: `desc`
     * @param Order Specifies how connections are listed. Valid values:
`asc`: Ascending order
`desc`: Descending order
Default: `desc`
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field. Valid values:
`create_time`: Sort by creation time
`proxy_id`: Sort by connection ID
`bandwidth`:Sort by bandwidth limit
`concurrent_connections`: Sort by number of concurrent connections
Default: `create_time` 
     * @return OrderField Sorting field. Valid values:
`create_time`: Sort by creation time
`proxy_id`: Sort by connection ID
`bandwidth`:Sort by bandwidth limit
`concurrent_connections`: Sort by number of concurrent connections
Default: `create_time`
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field. Valid values:
`create_time`: Sort by creation time
`proxy_id`: Sort by connection ID
`bandwidth`:Sort by bandwidth limit
`concurrent_connections`: Sort by number of concurrent connections
Default: `create_time`
     * @param OrderField Sorting field. Valid values:
`create_time`: Sort by creation time
`proxy_id`: Sort by connection ID
`bandwidth`:Sort by bandwidth limit
`concurrent_connections`: Sort by number of concurrent connections
Default: `create_time`
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeProxiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxiesRequest(DescribeProxiesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.Independent != null) {
            this.Independent = new Long(source.Independent);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Independent", this.Independent);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

