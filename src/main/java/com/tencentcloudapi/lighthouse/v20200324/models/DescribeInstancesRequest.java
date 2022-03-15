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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * Instance ID list. Each request can contain up to 100 instances at a time.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter list
<li>instance-name</li>Filter by the instance name
Type: String
Required: no
<li>private-ip-address</li>Filter by the private IP of instance primary ENI
Type: String
Required: no
<li>public-ip-address</li>Filter by the public IP of instance primary ENI
Type: String
Required: no
<li>zone</li>Filter by the availability zone
Type: String
Required: no
<li>instance-state</li>Filter by **instance status**.
Type: String
Required: no
Each request can contain up to 10 filters, each of which can have 100 values. You cannot specify both `InstanceIds` and `Filters` at the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID list. Each request can contain up to 100 instances at a time. 
     * @return InstanceIds Instance ID list. Each request can contain up to 100 instances at a time.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list. Each request can contain up to 100 instances at a time.
     * @param InstanceIds Instance ID list. Each request can contain up to 100 instances at a time.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Filter list
<li>instance-name</li>Filter by the instance name
Type: String
Required: no
<li>private-ip-address</li>Filter by the private IP of instance primary ENI
Type: String
Required: no
<li>public-ip-address</li>Filter by the public IP of instance primary ENI
Type: String
Required: no
<li>zone</li>Filter by the availability zone
Type: String
Required: no
<li>instance-state</li>Filter by **instance status**.
Type: String
Required: no
Each request can contain up to 10 filters, each of which can have 100 values. You cannot specify both `InstanceIds` and `Filters` at the same time. 
     * @return Filters Filter list
<li>instance-name</li>Filter by the instance name
Type: String
Required: no
<li>private-ip-address</li>Filter by the private IP of instance primary ENI
Type: String
Required: no
<li>public-ip-address</li>Filter by the public IP of instance primary ENI
Type: String
Required: no
<li>zone</li>Filter by the availability zone
Type: String
Required: no
<li>instance-state</li>Filter by **instance status**.
Type: String
Required: no
Each request can contain up to 10 filters, each of which can have 100 values. You cannot specify both `InstanceIds` and `Filters` at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter list
<li>instance-name</li>Filter by the instance name
Type: String
Required: no
<li>private-ip-address</li>Filter by the private IP of instance primary ENI
Type: String
Required: no
<li>public-ip-address</li>Filter by the public IP of instance primary ENI
Type: String
Required: no
<li>zone</li>Filter by the availability zone
Type: String
Required: no
<li>instance-state</li>Filter by **instance status**.
Type: String
Required: no
Each request can contain up to 10 filters, each of which can have 100 values. You cannot specify both `InstanceIds` and `Filters` at the same time.
     * @param Filters Filter list
<li>instance-name</li>Filter by the instance name
Type: String
Required: no
<li>private-ip-address</li>Filter by the private IP of instance primary ENI
Type: String
Required: no
<li>public-ip-address</li>Filter by the public IP of instance primary ENI
Type: String
Required: no
<li>zone</li>Filter by the availability zone
Type: String
Required: no
<li>instance-state</li>Filter by **instance status**.
Type: String
Required: no
Each request can contain up to 10 filters, each of which can have 100 values. You cannot specify both `InstanceIds` and `Filters` at the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, please see the relevant section in [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, please see the relevant section in the API [Overview](https://intl.cloud.tencent.com/document/product/1207/47578?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

