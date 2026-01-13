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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersDetailRequest extends AbstractModel {

    /**
    * Number of CLB instance lists returned. Default value: 20; maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting offset of the CLB instance list returned. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * List of fields. Only fields specified will be returned. If it’s left blank, `null` is returned. The fields `LoadBalancerId` and `LoadBalancerName` are added by default. For details about fields, see <a href="https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>.
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the Target GROUP or a non-Target GROUP. valid values: NODE, GROUP.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Querying conditions for cloud load balancer detailed information list. detailed filter criteria.
- loadbalancer-id
Filter by [clb ID], for example: lb-rbw5skde.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- project-id
Filters by [project ID]. for example: "0", "123".
Type: String.
Required: No
Method for obtaining: [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
- network
Filters by [clb network type]. for example: Public.
Type: String.
Required: No
Valid values: Private (Private network), Public (Public network).
- vip
Filter by [cloud load balancer VIP], such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
- vpcid
Filter by the vpc to which the cloud load balancer belongs, such as "vpc-12345678".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- target-ip
Filters by the private network IP of the backend destination. for example: "1.1.1.1", "2203::214:4".
Type: String.
Required: No
- zone
Filter by [availability zone of the cloud load balancer]. for example: "ap-guangzhou-1".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- tag-key
Filters by [tag key of the cloud load balancer tag], for example: "name".
Type: String.
Required: No
Method for obtaining: [DescribeTags](https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1).
- tag:*
Filter by [cloud load balancer tag], where ':' is followed by the tag key. for example, to filter by tag key 'name' with tag Values 'zhangsan' and 'lisi', use {"name": "tag:name","Values": ["zhangsan", "lisi"]}.
Type: String.
Required: No
Method for obtaining: [DescribeTagKeys](https://www.tencentcloud.com/document/api/651/35318?from_cn_redirect=1).
- fuzzy-search
Searches by [clb VIP, clb name] using fuzzy search, for example: "1.1".
Type: String.
Required: No
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Number of CLB instance lists returned. Default value: 20; maximum value: 100. 
     * @return Limit Number of CLB instance lists returned. Default value: 20; maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of CLB instance lists returned. Default value: 20; maximum value: 100.
     * @param Limit Number of CLB instance lists returned. Default value: 20; maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Starting offset of the CLB instance list returned. Default value: 0. 
     * @return Offset Starting offset of the CLB instance list returned. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of the CLB instance list returned. Default value: 0.
     * @param Offset Starting offset of the CLB instance list returned. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get List of fields. Only fields specified will be returned. If it’s left blank, `null` is returned. The fields `LoadBalancerId` and `LoadBalancerName` are added by default. For details about fields, see <a href="https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>. 
     * @return Fields List of fields. Only fields specified will be returned. If it’s left blank, `null` is returned. The fields `LoadBalancerId` and `LoadBalancerName` are added by default. For details about fields, see <a href="https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>.
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set List of fields. Only fields specified will be returned. If it’s left blank, `null` is returned. The fields `LoadBalancerId` and `LoadBalancerName` are added by default. For details about fields, see <a href="https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>.
     * @param Fields List of fields. Only fields specified will be returned. If it’s left blank, `null` is returned. The fields `LoadBalancerId` and `LoadBalancerName` are added by default. For details about fields, see <a href="https://intl.cloud.tencent.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>.
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the Target GROUP or a non-Target GROUP. valid values: NODE, GROUP. 
     * @return TargetType When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the Target GROUP or a non-Target GROUP. valid values: NODE, GROUP.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the Target GROUP or a non-Target GROUP. valid values: NODE, GROUP.
     * @param TargetType When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the Target GROUP or a non-Target GROUP. valid values: NODE, GROUP.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Querying conditions for cloud load balancer detailed information list. detailed filter criteria.
- loadbalancer-id
Filter by [clb ID], for example: lb-rbw5skde.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- project-id
Filters by [project ID]. for example: "0", "123".
Type: String.
Required: No
Method for obtaining: [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
- network
Filters by [clb network type]. for example: Public.
Type: String.
Required: No
Valid values: Private (Private network), Public (Public network).
- vip
Filter by [cloud load balancer VIP], such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
- vpcid
Filter by the vpc to which the cloud load balancer belongs, such as "vpc-12345678".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- target-ip
Filters by the private network IP of the backend destination. for example: "1.1.1.1", "2203::214:4".
Type: String.
Required: No
- zone
Filter by [availability zone of the cloud load balancer]. for example: "ap-guangzhou-1".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- tag-key
Filters by [tag key of the cloud load balancer tag], for example: "name".
Type: String.
Required: No
Method for obtaining: [DescribeTags](https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1).
- tag:*
Filter by [cloud load balancer tag], where ':' is followed by the tag key. for example, to filter by tag key 'name' with tag Values 'zhangsan' and 'lisi', use {"name": "tag:name","Values": ["zhangsan", "lisi"]}.
Type: String.
Required: No
Method for obtaining: [DescribeTagKeys](https://www.tencentcloud.com/document/api/651/35318?from_cn_redirect=1).
- fuzzy-search
Searches by [clb VIP, clb name] using fuzzy search, for example: "1.1".
Type: String.
Required: No 
     * @return Filters Querying conditions for cloud load balancer detailed information list. detailed filter criteria.
- loadbalancer-id
Filter by [clb ID], for example: lb-rbw5skde.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- project-id
Filters by [project ID]. for example: "0", "123".
Type: String.
Required: No
Method for obtaining: [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
- network
Filters by [clb network type]. for example: Public.
Type: String.
Required: No
Valid values: Private (Private network), Public (Public network).
- vip
Filter by [cloud load balancer VIP], such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
- vpcid
Filter by the vpc to which the cloud load balancer belongs, such as "vpc-12345678".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- target-ip
Filters by the private network IP of the backend destination. for example: "1.1.1.1", "2203::214:4".
Type: String.
Required: No
- zone
Filter by [availability zone of the cloud load balancer]. for example: "ap-guangzhou-1".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- tag-key
Filters by [tag key of the cloud load balancer tag], for example: "name".
Type: String.
Required: No
Method for obtaining: [DescribeTags](https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1).
- tag:*
Filter by [cloud load balancer tag], where ':' is followed by the tag key. for example, to filter by tag key 'name' with tag Values 'zhangsan' and 'lisi', use {"name": "tag:name","Values": ["zhangsan", "lisi"]}.
Type: String.
Required: No
Method for obtaining: [DescribeTagKeys](https://www.tencentcloud.com/document/api/651/35318?from_cn_redirect=1).
- fuzzy-search
Searches by [clb VIP, clb name] using fuzzy search, for example: "1.1".
Type: String.
Required: No
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Querying conditions for cloud load balancer detailed information list. detailed filter criteria.
- loadbalancer-id
Filter by [clb ID], for example: lb-rbw5skde.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- project-id
Filters by [project ID]. for example: "0", "123".
Type: String.
Required: No
Method for obtaining: [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
- network
Filters by [clb network type]. for example: Public.
Type: String.
Required: No
Valid values: Private (Private network), Public (Public network).
- vip
Filter by [cloud load balancer VIP], such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
- vpcid
Filter by the vpc to which the cloud load balancer belongs, such as "vpc-12345678".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- target-ip
Filters by the private network IP of the backend destination. for example: "1.1.1.1", "2203::214:4".
Type: String.
Required: No
- zone
Filter by [availability zone of the cloud load balancer]. for example: "ap-guangzhou-1".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- tag-key
Filters by [tag key of the cloud load balancer tag], for example: "name".
Type: String.
Required: No
Method for obtaining: [DescribeTags](https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1).
- tag:*
Filter by [cloud load balancer tag], where ':' is followed by the tag key. for example, to filter by tag key 'name' with tag Values 'zhangsan' and 'lisi', use {"name": "tag:name","Values": ["zhangsan", "lisi"]}.
Type: String.
Required: No
Method for obtaining: [DescribeTagKeys](https://www.tencentcloud.com/document/api/651/35318?from_cn_redirect=1).
- fuzzy-search
Searches by [clb VIP, clb name] using fuzzy search, for example: "1.1".
Type: String.
Required: No
     * @param Filters Querying conditions for cloud load balancer detailed information list. detailed filter criteria.
- loadbalancer-id
Filter by [clb ID], for example: lb-rbw5skde.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- project-id
Filters by [project ID]. for example: "0", "123".
Type: String.
Required: No
Method for obtaining: [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
- network
Filters by [clb network type]. for example: Public.
Type: String.
Required: No
Valid values: Private (Private network), Public (Public network).
- vip
Filter by [cloud load balancer VIP], such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
- vpcid
Filter by the vpc to which the cloud load balancer belongs, such as "vpc-12345678".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- target-ip
Filters by the private network IP of the backend destination. for example: "1.1.1.1", "2203::214:4".
Type: String.
Required: No
- zone
Filter by [availability zone of the cloud load balancer]. for example: "ap-guangzhou-1".
Type: String.
Required: No
Method for obtaining: [DescribeZones](https://www.tencentcloud.com/document/product/213/15707?from_cn_redirect=1).
- tag-key
Filters by [tag key of the cloud load balancer tag], for example: "name".
Type: String.
Required: No
Method for obtaining: [DescribeTags](https://www.tencentcloud.com/document/api/651/35316?from_cn_redirect=1).
- tag:*
Filter by [cloud load balancer tag], where ':' is followed by the tag key. for example, to filter by tag key 'name' with tag Values 'zhangsan' and 'lisi', use {"name": "tag:name","Values": ["zhangsan", "lisi"]}.
Type: String.
Required: No
Method for obtaining: [DescribeTagKeys](https://www.tencentcloud.com/document/api/651/35318?from_cn_redirect=1).
- fuzzy-search
Searches by [clb VIP, clb name] using fuzzy search, for example: "1.1".
Type: String.
Required: No
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLoadBalancersDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersDetailRequest(DescribeLoadBalancersDetailRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

