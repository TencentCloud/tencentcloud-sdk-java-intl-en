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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersDetailRequest extends AbstractModel {

    /**
    * Return the number of Cloud Load Balancer (CLB) lists. Default is 20. Maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting offset for returning the list of CLB instances, with a default value of 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Select the Fields list to return. The system will only return the Fields filled in Fields. For fillable field details, see <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>. If a related field is not in Fields, this field returns null. The LoadBalancerId and LoadBalancerName Fields are added by default in Fields.
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the target group or a non-target group. Valid values: NODE, GROUP.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Query the detailed information list of Cloud Load Balancer. Detailed filter criteria:
<li> loadbalancer-id - String - Required: No - (Filter condition) Filter by CLB ID, for example: "lb-12345678".</li>
<li> project-id - String - Required: No - (Filter condition) Filter by project ID, for example: "0", "123".</li>
<li>network - String - Required: No - (Filter condition) Filter by CLB network type, such as "Public" or "Private".</li>
<li> vip - String - Required: No - (Filter condition) Filter by CLB vip, for example: "1.1.1.1", "2204::22:3".</li>
<li> target-ip - String - Required: No - (Filtering Conditions) Filter by private ip of the target real server, such as "1.1.1.1", "2203::214:4".</li>
<li> vpcid - String - Required: No - (Filter condition) Filter by the associated vpc ID of the Cloud Load Balancer (CLB), such as "vpc-12345678".</li>
<li> zone - String - Required: No - (Filtering Conditions) Filter by the availability zone the load balancing belongs to, such as "ap-guangzhou-1".</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key of Cloud Load Balancer, such as "name".</li>
<li> tag:* - String - Required: No - (Filter criteria) Filter by the tag of Cloud Load Balancer (CLB), where ':' is followed by the tag key. For example, to filter by tag key 'name' and tag values 'zhangsan' and 'lisi', use {"Name": "tag:name","Values": ["zhangsan", "lisi"]}.</li>
<li>fuzzy-search - String - required: no - (filter condition) fuzzy search by CLB Vip and CLB name, for example: "1.1".</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Return the number of Cloud Load Balancer (CLB) lists. Default is 20. Maximum value is 100. 
     * @return Limit Return the number of Cloud Load Balancer (CLB) lists. Default is 20. Maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Return the number of Cloud Load Balancer (CLB) lists. Default is 20. Maximum value is 100.
     * @param Limit Return the number of Cloud Load Balancer (CLB) lists. Default is 20. Maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Starting offset for returning the list of CLB instances, with a default value of 0. 
     * @return Offset Starting offset for returning the list of CLB instances, with a default value of 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset for returning the list of CLB instances, with a default value of 0.
     * @param Offset Starting offset for returning the list of CLB instances, with a default value of 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Select the Fields list to return. The system will only return the Fields filled in Fields. For fillable field details, see <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>. If a related field is not in Fields, this field returns null. The LoadBalancerId and LoadBalancerName Fields are added by default in Fields. 
     * @return Fields Select the Fields list to return. The system will only return the Fields filled in Fields. For fillable field details, see <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>. If a related field is not in Fields, this field returns null. The LoadBalancerId and LoadBalancerName Fields are added by default in Fields.
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set Select the Fields list to return. The system will only return the Fields filled in Fields. For fillable field details, see <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>. If a related field is not in Fields, this field returns null. The LoadBalancerId and LoadBalancerName Fields are added by default in Fields.
     * @param Fields Select the Fields list to return. The system will only return the Fields filled in Fields. For fillable field details, see <a href="https://www.tencentcloud.com/document/api/214/30694?from_cn_redirect=1#LoadBalancerDetail">LoadBalancerDetail</a>. If a related field is not in Fields, this field returns null. The LoadBalancerId and LoadBalancerName Fields are added by default in Fields.
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the target group or a non-target group. Valid values: NODE, GROUP. 
     * @return TargetType When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the target group or a non-target group. Valid values: NODE, GROUP.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the target group or a non-target group. Valid values: NODE, GROUP.
     * @param TargetType When the Fields include TargetId, TargetAddress, TargetPort, TargetWeight, ListenerId, Protocol, Port, LocationId, Domain, and Url, you must select exporting the Target of the target group or a non-target group. Valid values: NODE, GROUP.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Query the detailed information list of Cloud Load Balancer. Detailed filter criteria:
<li> loadbalancer-id - String - Required: No - (Filter condition) Filter by CLB ID, for example: "lb-12345678".</li>
<li> project-id - String - Required: No - (Filter condition) Filter by project ID, for example: "0", "123".</li>
<li>network - String - Required: No - (Filter condition) Filter by CLB network type, such as "Public" or "Private".</li>
<li> vip - String - Required: No - (Filter condition) Filter by CLB vip, for example: "1.1.1.1", "2204::22:3".</li>
<li> target-ip - String - Required: No - (Filtering Conditions) Filter by private ip of the target real server, such as "1.1.1.1", "2203::214:4".</li>
<li> vpcid - String - Required: No - (Filter condition) Filter by the associated vpc ID of the Cloud Load Balancer (CLB), such as "vpc-12345678".</li>
<li> zone - String - Required: No - (Filtering Conditions) Filter by the availability zone the load balancing belongs to, such as "ap-guangzhou-1".</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key of Cloud Load Balancer, such as "name".</li>
<li> tag:* - String - Required: No - (Filter criteria) Filter by the tag of Cloud Load Balancer (CLB), where ':' is followed by the tag key. For example, to filter by tag key 'name' and tag values 'zhangsan' and 'lisi', use {"Name": "tag:name","Values": ["zhangsan", "lisi"]}.</li>
<li>fuzzy-search - String - required: no - (filter condition) fuzzy search by CLB Vip and CLB name, for example: "1.1".</li> 
     * @return Filters Query the detailed information list of Cloud Load Balancer. Detailed filter criteria:
<li> loadbalancer-id - String - Required: No - (Filter condition) Filter by CLB ID, for example: "lb-12345678".</li>
<li> project-id - String - Required: No - (Filter condition) Filter by project ID, for example: "0", "123".</li>
<li>network - String - Required: No - (Filter condition) Filter by CLB network type, such as "Public" or "Private".</li>
<li> vip - String - Required: No - (Filter condition) Filter by CLB vip, for example: "1.1.1.1", "2204::22:3".</li>
<li> target-ip - String - Required: No - (Filtering Conditions) Filter by private ip of the target real server, such as "1.1.1.1", "2203::214:4".</li>
<li> vpcid - String - Required: No - (Filter condition) Filter by the associated vpc ID of the Cloud Load Balancer (CLB), such as "vpc-12345678".</li>
<li> zone - String - Required: No - (Filtering Conditions) Filter by the availability zone the load balancing belongs to, such as "ap-guangzhou-1".</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key of Cloud Load Balancer, such as "name".</li>
<li> tag:* - String - Required: No - (Filter criteria) Filter by the tag of Cloud Load Balancer (CLB), where ':' is followed by the tag key. For example, to filter by tag key 'name' and tag values 'zhangsan' and 'lisi', use {"Name": "tag:name","Values": ["zhangsan", "lisi"]}.</li>
<li>fuzzy-search - String - required: no - (filter condition) fuzzy search by CLB Vip and CLB name, for example: "1.1".</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Query the detailed information list of Cloud Load Balancer. Detailed filter criteria:
<li> loadbalancer-id - String - Required: No - (Filter condition) Filter by CLB ID, for example: "lb-12345678".</li>
<li> project-id - String - Required: No - (Filter condition) Filter by project ID, for example: "0", "123".</li>
<li>network - String - Required: No - (Filter condition) Filter by CLB network type, such as "Public" or "Private".</li>
<li> vip - String - Required: No - (Filter condition) Filter by CLB vip, for example: "1.1.1.1", "2204::22:3".</li>
<li> target-ip - String - Required: No - (Filtering Conditions) Filter by private ip of the target real server, such as "1.1.1.1", "2203::214:4".</li>
<li> vpcid - String - Required: No - (Filter condition) Filter by the associated vpc ID of the Cloud Load Balancer (CLB), such as "vpc-12345678".</li>
<li> zone - String - Required: No - (Filtering Conditions) Filter by the availability zone the load balancing belongs to, such as "ap-guangzhou-1".</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key of Cloud Load Balancer, such as "name".</li>
<li> tag:* - String - Required: No - (Filter criteria) Filter by the tag of Cloud Load Balancer (CLB), where ':' is followed by the tag key. For example, to filter by tag key 'name' and tag values 'zhangsan' and 'lisi', use {"Name": "tag:name","Values": ["zhangsan", "lisi"]}.</li>
<li>fuzzy-search - String - required: no - (filter condition) fuzzy search by CLB Vip and CLB name, for example: "1.1".</li>
     * @param Filters Query the detailed information list of Cloud Load Balancer. Detailed filter criteria:
<li> loadbalancer-id - String - Required: No - (Filter condition) Filter by CLB ID, for example: "lb-12345678".</li>
<li> project-id - String - Required: No - (Filter condition) Filter by project ID, for example: "0", "123".</li>
<li>network - String - Required: No - (Filter condition) Filter by CLB network type, such as "Public" or "Private".</li>
<li> vip - String - Required: No - (Filter condition) Filter by CLB vip, for example: "1.1.1.1", "2204::22:3".</li>
<li> target-ip - String - Required: No - (Filtering Conditions) Filter by private ip of the target real server, such as "1.1.1.1", "2203::214:4".</li>
<li> vpcid - String - Required: No - (Filter condition) Filter by the associated vpc ID of the Cloud Load Balancer (CLB), such as "vpc-12345678".</li>
<li> zone - String - Required: No - (Filtering Conditions) Filter by the availability zone the load balancing belongs to, such as "ap-guangzhou-1".</li>
<li>tag-key - String - required: no - (filter condition) filter by tag key of Cloud Load Balancer, such as "name".</li>
<li> tag:* - String - Required: No - (Filter criteria) Filter by the tag of Cloud Load Balancer (CLB), where ':' is followed by the tag key. For example, to filter by tag key 'name' and tag values 'zhangsan' and 'lisi', use {"Name": "tag:name","Values": ["zhangsan", "lisi"]}.</li>
<li>fuzzy-search - String - required: no - (filter condition) fuzzy search by CLB Vip and CLB name, for example: "1.1".</li>
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

