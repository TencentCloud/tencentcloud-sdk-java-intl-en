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

public class DescribeCustomizedConfigListRequest extends AbstractModel {

    /**
    * Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs).
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * Pagination offset. defaults to 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results. default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies the name of configs to query. Fuzzy match is supported.
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Configuration ID, can be accessed through the [DescribeCustomizedConfigList](https://www.tencentcloud.com/document/api/214/60009?from_cn_redirect=1) api.
    */
    @SerializedName("UconfigIds")
    @Expose
    private String [] UconfigIds;

    /**
    * Filter criteria as follows:.
- loadbalancer-id
Filter by [cloud load balancer ID]. instance billing mode such as lb-9vxezxza.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- vip
Filter by [clb VIP]. network billing mode such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs). 
     * @return ConfigType Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs).
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs).
     * @param ConfigType Configuration type. Valid values: `CLB` (CLB-specific configs), `SERVER` (domain name-specific configs), and `LOCATION` (forwarding rule-specific configs).
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get Pagination offset. defaults to 0. 
     * @return Offset Pagination offset. defaults to 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. defaults to 0.
     * @param Offset Pagination offset. defaults to 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results. default value: 20. 
     * @return Limit Number of results. default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results. default value: 20.
     * @param Limit Number of results. default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies the name of configs to query. Fuzzy match is supported. 
     * @return ConfigName Specifies the name of configs to query. Fuzzy match is supported.
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Specifies the name of configs to query. Fuzzy match is supported.
     * @param ConfigName Specifies the name of configs to query. Fuzzy match is supported.
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get Configuration ID, can be accessed through the [DescribeCustomizedConfigList](https://www.tencentcloud.com/document/api/214/60009?from_cn_redirect=1) api. 
     * @return UconfigIds Configuration ID, can be accessed through the [DescribeCustomizedConfigList](https://www.tencentcloud.com/document/api/214/60009?from_cn_redirect=1) api.
     */
    public String [] getUconfigIds() {
        return this.UconfigIds;
    }

    /**
     * Set Configuration ID, can be accessed through the [DescribeCustomizedConfigList](https://www.tencentcloud.com/document/api/214/60009?from_cn_redirect=1) api.
     * @param UconfigIds Configuration ID, can be accessed through the [DescribeCustomizedConfigList](https://www.tencentcloud.com/document/api/214/60009?from_cn_redirect=1) api.
     */
    public void setUconfigIds(String [] UconfigIds) {
        this.UconfigIds = UconfigIds;
    }

    /**
     * Get Filter criteria as follows:.
- loadbalancer-id
Filter by [cloud load balancer ID]. instance billing mode such as lb-9vxezxza.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- vip
Filter by [clb VIP]. network billing mode such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1). 
     * @return Filters Filter criteria as follows:.
- loadbalancer-id
Filter by [cloud load balancer ID]. instance billing mode such as lb-9vxezxza.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- vip
Filter by [clb VIP]. network billing mode such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria as follows:.
- loadbalancer-id
Filter by [cloud load balancer ID]. instance billing mode such as lb-9vxezxza.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- vip
Filter by [clb VIP]. network billing mode such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
     * @param Filters Filter criteria as follows:.
- loadbalancer-id
Filter by [cloud load balancer ID]. instance billing mode such as lb-9vxezxza.
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
- vip
Filter by [clb VIP]. network billing mode such as "1.1.1.1", "2204::22:3".
Type: String.
Required: No
Method for obtaining: [DescribeLoadBalancers](https://www.tencentcloud.com/document/product/1108/48459?from_cn_redirect=1).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCustomizedConfigListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomizedConfigListRequest(DescribeCustomizedConfigListRequest source) {
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.UconfigIds != null) {
            this.UconfigIds = new String[source.UconfigIds.length];
            for (int i = 0; i < source.UconfigIds.length; i++) {
                this.UconfigIds[i] = new String(source.UconfigIds[i]);
            }
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
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamArraySimple(map, prefix + "UconfigIds.", this.UconfigIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

