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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkInterfacesRequest extends AbstractModel{

    /**
    * Queries the ID of the ENI instance, such as `eni-pxir56ns`. Each request can have a maximum of 100 instances. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("NetworkInterfaceIds")
    @Expose
    private String [] NetworkInterfaceIds;

    /**
    * Filter condition. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>subnet-id - String - (Filter condition) Subnet instance ID, such as `subnet-f49l6u0z`.</li>
<li>network-interface-id - String - (Filter condition) ENI instance ID, such as `eni-5k56k7k7`.</li>
<li>attachment.instance-id - String - (Filter condition) ID of the bound CVM instance, such as `ins-3nqpdn3i`.</li>
<li>groups.security-group-id - String - (Filter condition) ID of the bound security group, such as `sg-f9ekbxeq`.</li>
<li>network-interface-name - String - (Filter condition) ENI instance name.</li>
<li>network-interface-description - String - (Filter condition) ENI instance description.</li>
<li>address-ip - String - (Filter condition) Private IPv4 address. A single IP will be fuzzily matched with the suffix, while multiple IPs will be exactly matched. It can be used with `ip-exact-match` to query and exactly match a single IP.</li>
<li>ip-exact-match - Boolean - (Filter condition) Exact match by private IPv4 address. The first value will be returned if multiple values are found.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key. See Example 2 for the detailed usage.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 3 for the detailed usage.</li>
<li>is-primary - Boolean - Required: no - (Filter condition) Filter based on whether it is a primary ENI. If the value is `true`, filter only the primary ENI. If the value is `false`, filter only the secondary ENI. If this parameter is not specified, filter the both.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Queries the ID of the ENI instance, such as `eni-pxir56ns`. Each request can have a maximum of 100 instances. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time. 
     * @return NetworkInterfaceIds Queries the ID of the ENI instance, such as `eni-pxir56ns`. Each request can have a maximum of 100 instances. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getNetworkInterfaceIds() {
        return this.NetworkInterfaceIds;
    }

    /**
     * Set Queries the ID of the ENI instance, such as `eni-pxir56ns`. Each request can have a maximum of 100 instances. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
     * @param NetworkInterfaceIds Queries the ID of the ENI instance, such as `eni-pxir56ns`. Each request can have a maximum of 100 instances. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
     */
    public void setNetworkInterfaceIds(String [] NetworkInterfaceIds) {
        this.NetworkInterfaceIds = NetworkInterfaceIds;
    }

    /**
     * Get Filter condition. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>subnet-id - String - (Filter condition) Subnet instance ID, such as `subnet-f49l6u0z`.</li>
<li>network-interface-id - String - (Filter condition) ENI instance ID, such as `eni-5k56k7k7`.</li>
<li>attachment.instance-id - String - (Filter condition) ID of the bound CVM instance, such as `ins-3nqpdn3i`.</li>
<li>groups.security-group-id - String - (Filter condition) ID of the bound security group, such as `sg-f9ekbxeq`.</li>
<li>network-interface-name - String - (Filter condition) ENI instance name.</li>
<li>network-interface-description - String - (Filter condition) ENI instance description.</li>
<li>address-ip - String - (Filter condition) Private IPv4 address. A single IP will be fuzzily matched with the suffix, while multiple IPs will be exactly matched. It can be used with `ip-exact-match` to query and exactly match a single IP.</li>
<li>ip-exact-match - Boolean - (Filter condition) Exact match by private IPv4 address. The first value will be returned if multiple values are found.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key. See Example 2 for the detailed usage.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 3 for the detailed usage.</li>
<li>is-primary - Boolean - Required: no - (Filter condition) Filter based on whether it is a primary ENI. If the value is `true`, filter only the primary ENI. If the value is `false`, filter only the secondary ENI. If this parameter is not specified, filter the both.</li> 
     * @return Filters Filter condition. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>subnet-id - String - (Filter condition) Subnet instance ID, such as `subnet-f49l6u0z`.</li>
<li>network-interface-id - String - (Filter condition) ENI instance ID, such as `eni-5k56k7k7`.</li>
<li>attachment.instance-id - String - (Filter condition) ID of the bound CVM instance, such as `ins-3nqpdn3i`.</li>
<li>groups.security-group-id - String - (Filter condition) ID of the bound security group, such as `sg-f9ekbxeq`.</li>
<li>network-interface-name - String - (Filter condition) ENI instance name.</li>
<li>network-interface-description - String - (Filter condition) ENI instance description.</li>
<li>address-ip - String - (Filter condition) Private IPv4 address. A single IP will be fuzzily matched with the suffix, while multiple IPs will be exactly matched. It can be used with `ip-exact-match` to query and exactly match a single IP.</li>
<li>ip-exact-match - Boolean - (Filter condition) Exact match by private IPv4 address. The first value will be returned if multiple values are found.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key. See Example 2 for the detailed usage.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 3 for the detailed usage.</li>
<li>is-primary - Boolean - Required: no - (Filter condition) Filter based on whether it is a primary ENI. If the value is `true`, filter only the primary ENI. If the value is `false`, filter only the secondary ENI. If this parameter is not specified, filter the both.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>subnet-id - String - (Filter condition) Subnet instance ID, such as `subnet-f49l6u0z`.</li>
<li>network-interface-id - String - (Filter condition) ENI instance ID, such as `eni-5k56k7k7`.</li>
<li>attachment.instance-id - String - (Filter condition) ID of the bound CVM instance, such as `ins-3nqpdn3i`.</li>
<li>groups.security-group-id - String - (Filter condition) ID of the bound security group, such as `sg-f9ekbxeq`.</li>
<li>network-interface-name - String - (Filter condition) ENI instance name.</li>
<li>network-interface-description - String - (Filter condition) ENI instance description.</li>
<li>address-ip - String - (Filter condition) Private IPv4 address. A single IP will be fuzzily matched with the suffix, while multiple IPs will be exactly matched. It can be used with `ip-exact-match` to query and exactly match a single IP.</li>
<li>ip-exact-match - Boolean - (Filter condition) Exact match by private IPv4 address. The first value will be returned if multiple values are found.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key. See Example 2 for the detailed usage.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 3 for the detailed usage.</li>
<li>is-primary - Boolean - Required: no - (Filter condition) Filter based on whether it is a primary ENI. If the value is `true`, filter only the primary ENI. If the value is `false`, filter only the secondary ENI. If this parameter is not specified, filter the both.</li>
     * @param Filters Filter condition. `NetworkInterfaceIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as `vpc-f49l6u0z`.</li>
<li>subnet-id - String - (Filter condition) Subnet instance ID, such as `subnet-f49l6u0z`.</li>
<li>network-interface-id - String - (Filter condition) ENI instance ID, such as `eni-5k56k7k7`.</li>
<li>attachment.instance-id - String - (Filter condition) ID of the bound CVM instance, such as `ins-3nqpdn3i`.</li>
<li>groups.security-group-id - String - (Filter condition) ID of the bound security group, such as `sg-f9ekbxeq`.</li>
<li>network-interface-name - String - (Filter condition) ENI instance name.</li>
<li>network-interface-description - String - (Filter condition) ENI instance description.</li>
<li>address-ip - String - (Filter condition) Private IPv4 address. A single IP will be fuzzily matched with the suffix, while multiple IPs will be exactly matched. It can be used with `ip-exact-match` to query and exactly match a single IP.</li>
<li>ip-exact-match - Boolean - (Filter condition) Exact match by private IPv4 address. The first value will be returned if multiple values are found.</li>
<li>tag-key - String - Required: no - (Filter condition) Filter by tag key. See Example 2 for the detailed usage.</li>
<li>tag:tag-key - String - Required: no - (Filter condition) Filter by tag key pair. Use a specific tag key to replace `tag-key`. See Example 3 for the detailed usage.</li>
<li>is-primary - Boolean - Required: no - (Filter condition) Filter based on whether it is a primary ENI. If the value is `true`, filter only the primary ENI. If the value is `false`, filter only the secondary ENI. If this parameter is not specified, filter the both.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetworkInterfaceIds.", this.NetworkInterfaceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

