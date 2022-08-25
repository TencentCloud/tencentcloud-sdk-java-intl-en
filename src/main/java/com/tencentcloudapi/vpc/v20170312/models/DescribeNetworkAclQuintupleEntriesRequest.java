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

public class DescribeNetworkAclQuintupleEntriesRequest extends AbstractModel{

    /**
    * Network ACL instance ID, such as `acl-12345678`.
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Returned quantity. Default: 20. Value range: 1-100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>`protocol` - String - Such as `TCP`</li>
<li>`description` - String - Description</li>
<li>`destination-cidr` - String - Destination CIDR block, such as `192.168.0.0/24`</li>
<li>`source-cidr` - String - Source CIDR block, such as `192.168.0.0/24`</li>
<li>`action` - String - ·Values: `ACCEPT`, `DROP`</li>
<li>`network-acl-quintuple-entry-id` - String - Unique ID of the quintuple, such as `acli45-ahnu4rv5`</li>
<li>`network-acl-direction` - String - Direction of the policy. Values: `INGRESS` or `EGRESS`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Network ACL instance ID, such as `acl-12345678`. 
     * @return NetworkAclId Network ACL instance ID, such as `acl-12345678`.
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set Network ACL instance ID, such as `acl-12345678`.
     * @param NetworkAclId Network ACL instance ID, such as `acl-12345678`.
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
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
     * Get Returned quantity. Default: 20. Value range: 1-100. 
     * @return Limit Returned quantity. Default: 20. Value range: 1-100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Returned quantity. Default: 20. Value range: 1-100.
     * @param Limit Returned quantity. Default: 20. Value range: 1-100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>`protocol` - String - Such as `TCP`</li>
<li>`description` - String - Description</li>
<li>`destination-cidr` - String - Destination CIDR block, such as `192.168.0.0/24`</li>
<li>`source-cidr` - String - Source CIDR block, such as `192.168.0.0/24`</li>
<li>`action` - String - ·Values: `ACCEPT`, `DROP`</li>
<li>`network-acl-quintuple-entry-id` - String - Unique ID of the quintuple, such as `acli45-ahnu4rv5`</li>
<li>`network-acl-direction` - String - Direction of the policy. Values: `INGRESS` or `EGRESS`.</li> 
     * @return Filters Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>`protocol` - String - Such as `TCP`</li>
<li>`description` - String - Description</li>
<li>`destination-cidr` - String - Destination CIDR block, such as `192.168.0.0/24`</li>
<li>`source-cidr` - String - Source CIDR block, such as `192.168.0.0/24`</li>
<li>`action` - String - ·Values: `ACCEPT`, `DROP`</li>
<li>`network-acl-quintuple-entry-id` - String - Unique ID of the quintuple, such as `acli45-ahnu4rv5`</li>
<li>`network-acl-direction` - String - Direction of the policy. Values: `INGRESS` or `EGRESS`.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>`protocol` - String - Such as `TCP`</li>
<li>`description` - String - Description</li>
<li>`destination-cidr` - String - Destination CIDR block, such as `192.168.0.0/24`</li>
<li>`source-cidr` - String - Source CIDR block, such as `192.168.0.0/24`</li>
<li>`action` - String - ·Values: `ACCEPT`, `DROP`</li>
<li>`network-acl-quintuple-entry-id` - String - Unique ID of the quintuple, such as `acli45-ahnu4rv5`</li>
<li>`network-acl-direction` - String - Direction of the policy. Values: `INGRESS` or `EGRESS`.</li>
     * @param Filters Filter condition. `HaVipIds` and `Filters` cannot be specified at the same time.
<li>`protocol` - String - Such as `TCP`</li>
<li>`description` - String - Description</li>
<li>`destination-cidr` - String - Destination CIDR block, such as `192.168.0.0/24`</li>
<li>`source-cidr` - String - Source CIDR block, such as `192.168.0.0/24`</li>
<li>`action` - String - ·Values: `ACCEPT`, `DROP`</li>
<li>`network-acl-quintuple-entry-id` - String - Unique ID of the quintuple, such as `acli45-ahnu4rv5`</li>
<li>`network-acl-direction` - String - Direction of the policy. Values: `INGRESS` or `EGRESS`.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeNetworkAclQuintupleEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkAclQuintupleEntriesRequest(DescribeNetworkAclQuintupleEntriesRequest source) {
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

