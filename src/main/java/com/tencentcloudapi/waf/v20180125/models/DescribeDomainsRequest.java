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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainsRequest extends AbstractModel {

    /**
    * Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned domains
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter array. The filter fields are as follows. Edition: instance version, which can be set to sparta-waf or clb-waf; Domain: domain name; DomainId: domain name ID; InstanceName: instance name; InstanceId: instance ID; FlowMode: traffic access mode, which supports only CLB WAF; FlowCheckMode: traffic inspection mode, which supports only CLB WAF; ClsStatus: log switch; Status: WAF switch; BotStatus: BOT switch; ApiStatus: API security switch; Engine: engine mode; UpstreamIP: origin server IP address, which supports only SaaS WAF; UpstreamDomain: origin server domain name, which supports only SaaS WAF; DomainState: domain name status, which supports only SaaS WAF; SgState: security group status, which supports only SaaS WAF; Label: group tag, which supports the filtering of only one tag at a time.
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up. 
     * @return Offset Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up.
     * @param Offset Paging offset, a multiple of limit. The minimum value is 0, and the maximum value is Total/Limit rounded up.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned domains 
     * @return Limit Number of returned domains
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned domains
     * @param Limit Number of returned domains
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter array. The filter fields are as follows. Edition: instance version, which can be set to sparta-waf or clb-waf; Domain: domain name; DomainId: domain name ID; InstanceName: instance name; InstanceId: instance ID; FlowMode: traffic access mode, which supports only CLB WAF; FlowCheckMode: traffic inspection mode, which supports only CLB WAF; ClsStatus: log switch; Status: WAF switch; BotStatus: BOT switch; ApiStatus: API security switch; Engine: engine mode; UpstreamIP: origin server IP address, which supports only SaaS WAF; UpstreamDomain: origin server domain name, which supports only SaaS WAF; DomainState: domain name status, which supports only SaaS WAF; SgState: security group status, which supports only SaaS WAF; Label: group tag, which supports the filtering of only one tag at a time. 
     * @return Filters Filter array. The filter fields are as follows. Edition: instance version, which can be set to sparta-waf or clb-waf; Domain: domain name; DomainId: domain name ID; InstanceName: instance name; InstanceId: instance ID; FlowMode: traffic access mode, which supports only CLB WAF; FlowCheckMode: traffic inspection mode, which supports only CLB WAF; ClsStatus: log switch; Status: WAF switch; BotStatus: BOT switch; ApiStatus: API security switch; Engine: engine mode; UpstreamIP: origin server IP address, which supports only SaaS WAF; UpstreamDomain: origin server domain name, which supports only SaaS WAF; DomainState: domain name status, which supports only SaaS WAF; SgState: security group status, which supports only SaaS WAF; Label: group tag, which supports the filtering of only one tag at a time.
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter array. The filter fields are as follows. Edition: instance version, which can be set to sparta-waf or clb-waf; Domain: domain name; DomainId: domain name ID; InstanceName: instance name; InstanceId: instance ID; FlowMode: traffic access mode, which supports only CLB WAF; FlowCheckMode: traffic inspection mode, which supports only CLB WAF; ClsStatus: log switch; Status: WAF switch; BotStatus: BOT switch; ApiStatus: API security switch; Engine: engine mode; UpstreamIP: origin server IP address, which supports only SaaS WAF; UpstreamDomain: origin server domain name, which supports only SaaS WAF; DomainState: domain name status, which supports only SaaS WAF; SgState: security group status, which supports only SaaS WAF; Label: group tag, which supports the filtering of only one tag at a time.
     * @param Filters Filter array. The filter fields are as follows. Edition: instance version, which can be set to sparta-waf or clb-waf; Domain: domain name; DomainId: domain name ID; InstanceName: instance name; InstanceId: instance ID; FlowMode: traffic access mode, which supports only CLB WAF; FlowCheckMode: traffic inspection mode, which supports only CLB WAF; ClsStatus: log switch; Status: WAF switch; BotStatus: BOT switch; ApiStatus: API security switch; Engine: engine mode; UpstreamIP: origin server IP address, which supports only SaaS WAF; UpstreamDomain: origin server domain name, which supports only SaaS WAF; DomainState: domain name status, which supports only SaaS WAF; SgState: security group status, which supports only SaaS WAF; Label: group tag, which supports the filtering of only one tag at a time.
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainsRequest(DescribeDomainsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

