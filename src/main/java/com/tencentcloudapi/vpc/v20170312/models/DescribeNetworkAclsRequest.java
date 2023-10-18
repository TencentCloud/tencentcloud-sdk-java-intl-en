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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkAclsRequest extends AbstractModel {

    /**
    * Array of network ACL instance IDs, such as [acl-12345678]. Up to 100 instances are allowed for each request. This parameter does not support specifying `NetworkAclIds` and `Filters` at the same time.
    */
    @SerializedName("NetworkAclIds")
    @Expose
    private String [] NetworkAclIds;

    /**
    * Filter condition. `NetworkAclIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as vpc-12345678.</li>
<li>network-acl-id - String - (Filter condition) Network ACL instance ID, such as acl-12345678.</li>
<li>network-acl-name - String - (Filter condition) Network ACL instance name.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default: 0.
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
     * Get Array of network ACL instance IDs, such as [acl-12345678]. Up to 100 instances are allowed for each request. This parameter does not support specifying `NetworkAclIds` and `Filters` at the same time. 
     * @return NetworkAclIds Array of network ACL instance IDs, such as [acl-12345678]. Up to 100 instances are allowed for each request. This parameter does not support specifying `NetworkAclIds` and `Filters` at the same time.
     */
    public String [] getNetworkAclIds() {
        return this.NetworkAclIds;
    }

    /**
     * Set Array of network ACL instance IDs, such as [acl-12345678]. Up to 100 instances are allowed for each request. This parameter does not support specifying `NetworkAclIds` and `Filters` at the same time.
     * @param NetworkAclIds Array of network ACL instance IDs, such as [acl-12345678]. Up to 100 instances are allowed for each request. This parameter does not support specifying `NetworkAclIds` and `Filters` at the same time.
     */
    public void setNetworkAclIds(String [] NetworkAclIds) {
        this.NetworkAclIds = NetworkAclIds;
    }

    /**
     * Get Filter condition. `NetworkAclIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as vpc-12345678.</li>
<li>network-acl-id - String - (Filter condition) Network ACL instance ID, such as acl-12345678.</li>
<li>network-acl-name - String - (Filter condition) Network ACL instance name.</li> 
     * @return Filters Filter condition. `NetworkAclIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as vpc-12345678.</li>
<li>network-acl-id - String - (Filter condition) Network ACL instance ID, such as acl-12345678.</li>
<li>network-acl-name - String - (Filter condition) Network ACL instance name.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition. `NetworkAclIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as vpc-12345678.</li>
<li>network-acl-id - String - (Filter condition) Network ACL instance ID, such as acl-12345678.</li>
<li>network-acl-name - String - (Filter condition) Network ACL instance name.</li>
     * @param Filters Filter condition. `NetworkAclIds` and `Filters` cannot be specified at the same time.
<li>vpc-id - String - (Filter condition) VPC instance ID, such as vpc-12345678.</li>
<li>network-acl-id - String - (Filter condition) Network ACL instance ID, such as acl-12345678.</li>
<li>network-acl-name - String - (Filter condition) Network ACL instance name.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default: 0. 
     * @return Offset Offset. Default: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default: 0.
     * @param Offset Offset. Default: 0.
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

    public DescribeNetworkAclsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkAclsRequest(DescribeNetworkAclsRequest source) {
        if (source.NetworkAclIds != null) {
            this.NetworkAclIds = new String[source.NetworkAclIds.length];
            for (int i = 0; i < source.NetworkAclIds.length; i++) {
                this.NetworkAclIds[i] = new String(source.NetworkAclIds[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetworkAclIds.", this.NetworkAclIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

