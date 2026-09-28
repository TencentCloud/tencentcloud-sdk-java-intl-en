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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersRequest extends AbstractModel {

    /**
    * <p>Query filter criteria, supporting the following fields</p><ul><li><strong>LoadBalancerId</strong>: Cloud Load Balancer instance ID</li><li><strong>LoadBalancerName</strong>: CLB name</li><li><strong>LoadBalancerStatus</strong>: load balancing status</li><li><strong>VpcId</strong>: VPC ID</li><li><strong>tag:tag-key</strong>: filter by tag key-value pair. Replace tag-key with the actual tag key. For example, <code>tag:env</code> means filtering by the tag key <code>env</code>.</li><li><strong>AddressType</strong>: network type<ul><li><strong>Intranet</strong>: private network</li><li><strong>Internet</strong>: public network</li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 address</li><li><strong>IPv6</strong>: IPv6 address</li></ul></li><li><strong>SecurityGroupId</strong>: security group ID</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Number of entries displayed each time during a batch query. Value range: <strong>1</strong>–<strong>100</strong>. Default value: <strong>20</strong>.</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>Whether there is a token for the next query. Value:</p><ul><li>Not required for the first query or when there is no next query.</li><li>If there is a next query, the value is the <strong>NextToken</strong> returned from the last API call.</li></ul>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get <p>Query filter criteria, supporting the following fields</p><ul><li><strong>LoadBalancerId</strong>: Cloud Load Balancer instance ID</li><li><strong>LoadBalancerName</strong>: CLB name</li><li><strong>LoadBalancerStatus</strong>: load balancing status</li><li><strong>VpcId</strong>: VPC ID</li><li><strong>tag:tag-key</strong>: filter by tag key-value pair. Replace tag-key with the actual tag key. For example, <code>tag:env</code> means filtering by the tag key <code>env</code>.</li><li><strong>AddressType</strong>: network type<ul><li><strong>Intranet</strong>: private network</li><li><strong>Internet</strong>: public network</li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 address</li><li><strong>IPv6</strong>: IPv6 address</li></ul></li><li><strong>SecurityGroupId</strong>: security group ID</li></ul> 
     * @return Filters <p>Query filter criteria, supporting the following fields</p><ul><li><strong>LoadBalancerId</strong>: Cloud Load Balancer instance ID</li><li><strong>LoadBalancerName</strong>: CLB name</li><li><strong>LoadBalancerStatus</strong>: load balancing status</li><li><strong>VpcId</strong>: VPC ID</li><li><strong>tag:tag-key</strong>: filter by tag key-value pair. Replace tag-key with the actual tag key. For example, <code>tag:env</code> means filtering by the tag key <code>env</code>.</li><li><strong>AddressType</strong>: network type<ul><li><strong>Intranet</strong>: private network</li><li><strong>Internet</strong>: public network</li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 address</li><li><strong>IPv6</strong>: IPv6 address</li></ul></li><li><strong>SecurityGroupId</strong>: security group ID</li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Query filter criteria, supporting the following fields</p><ul><li><strong>LoadBalancerId</strong>: Cloud Load Balancer instance ID</li><li><strong>LoadBalancerName</strong>: CLB name</li><li><strong>LoadBalancerStatus</strong>: load balancing status</li><li><strong>VpcId</strong>: VPC ID</li><li><strong>tag:tag-key</strong>: filter by tag key-value pair. Replace tag-key with the actual tag key. For example, <code>tag:env</code> means filtering by the tag key <code>env</code>.</li><li><strong>AddressType</strong>: network type<ul><li><strong>Intranet</strong>: private network</li><li><strong>Internet</strong>: public network</li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 address</li><li><strong>IPv6</strong>: IPv6 address</li></ul></li><li><strong>SecurityGroupId</strong>: security group ID</li></ul>
     * @param Filters <p>Query filter criteria, supporting the following fields</p><ul><li><strong>LoadBalancerId</strong>: Cloud Load Balancer instance ID</li><li><strong>LoadBalancerName</strong>: CLB name</li><li><strong>LoadBalancerStatus</strong>: load balancing status</li><li><strong>VpcId</strong>: VPC ID</li><li><strong>tag:tag-key</strong>: filter by tag key-value pair. Replace tag-key with the actual tag key. For example, <code>tag:env</code> means filtering by the tag key <code>env</code>.</li><li><strong>AddressType</strong>: network type<ul><li><strong>Intranet</strong>: private network</li><li><strong>Internet</strong>: public network</li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 address</li><li><strong>IPv6</strong>: IPv6 address</li></ul></li><li><strong>SecurityGroupId</strong>: security group ID</li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Number of entries displayed each time during a batch query. Value range: <strong>1</strong>–<strong>100</strong>. Default value: <strong>20</strong>.</p> 
     * @return MaxResults <p>Number of entries displayed each time during a batch query. Value range: <strong>1</strong>–<strong>100</strong>. Default value: <strong>20</strong>.</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>Number of entries displayed each time during a batch query. Value range: <strong>1</strong>–<strong>100</strong>. Default value: <strong>20</strong>.</p>
     * @param MaxResults <p>Number of entries displayed each time during a batch query. Value range: <strong>1</strong>–<strong>100</strong>. Default value: <strong>20</strong>.</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>Whether there is a token for the next query. Value:</p><ul><li>Not required for the first query or when there is no next query.</li><li>If there is a next query, the value is the <strong>NextToken</strong> returned from the last API call.</li></ul> 
     * @return NextToken <p>Whether there is a token for the next query. Value:</p><ul><li>Not required for the first query or when there is no next query.</li><li>If there is a next query, the value is the <strong>NextToken</strong> returned from the last API call.</li></ul>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>Whether there is a token for the next query. Value:</p><ul><li>Not required for the first query or when there is no next query.</li><li>If there is a next query, the value is the <strong>NextToken</strong> returned from the last API call.</li></ul>
     * @param NextToken <p>Whether there is a token for the next query. Value:</p><ul><li>Not required for the first query or when there is no next query.</li><li>If there is a next query, the value is the <strong>NextToken</strong> returned from the last API call.</li></ul>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersRequest(DescribeLoadBalancersRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

