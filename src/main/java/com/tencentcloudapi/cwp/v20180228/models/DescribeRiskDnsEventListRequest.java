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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskDnsEventListRequest extends AbstractModel {

    /**
    * <li>IpOrName - String - required: no - filter by host IP or alias</li>
<li>HostId - String - required: no - host ID</li>
<li>AgentId - String - required: no - client ID</li>
<li>PolicyType - String - required: no - policy type: 0 - system policy; 1 - user-defined policy</li>
<li>Domain - String - required: no - domain name (First convert the domain name into the urlencode format, and then encode it using base64.)</li>
<li>HandleStatus - String - required: no - filter by status: 0 - pending; 2 - trusted; 3 - untrusted</li>
<li>BeginTime - String - required: no - start time of last access</li>
<li>EndTime - String - required: no - end time of last access</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of items to be returned. It is 10 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which defaults to 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting method: sort by number of requests [asc: ascending order|desc: descending order]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field: [AccessCount: number of requests|LastTime: last request time]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <li>IpOrName - String - required: no - filter by host IP or alias</li>
<li>HostId - String - required: no - host ID</li>
<li>AgentId - String - required: no - client ID</li>
<li>PolicyType - String - required: no - policy type: 0 - system policy; 1 - user-defined policy</li>
<li>Domain - String - required: no - domain name (First convert the domain name into the urlencode format, and then encode it using base64.)</li>
<li>HandleStatus - String - required: no - filter by status: 0 - pending; 2 - trusted; 3 - untrusted</li>
<li>BeginTime - String - required: no - start time of last access</li>
<li>EndTime - String - required: no - end time of last access</li> 
     * @return Filters <li>IpOrName - String - required: no - filter by host IP or alias</li>
<li>HostId - String - required: no - host ID</li>
<li>AgentId - String - required: no - client ID</li>
<li>PolicyType - String - required: no - policy type: 0 - system policy; 1 - user-defined policy</li>
<li>Domain - String - required: no - domain name (First convert the domain name into the urlencode format, and then encode it using base64.)</li>
<li>HandleStatus - String - required: no - filter by status: 0 - pending; 2 - trusted; 3 - untrusted</li>
<li>BeginTime - String - required: no - start time of last access</li>
<li>EndTime - String - required: no - end time of last access</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>IpOrName - String - required: no - filter by host IP or alias</li>
<li>HostId - String - required: no - host ID</li>
<li>AgentId - String - required: no - client ID</li>
<li>PolicyType - String - required: no - policy type: 0 - system policy; 1 - user-defined policy</li>
<li>Domain - String - required: no - domain name (First convert the domain name into the urlencode format, and then encode it using base64.)</li>
<li>HandleStatus - String - required: no - filter by status: 0 - pending; 2 - trusted; 3 - untrusted</li>
<li>BeginTime - String - required: no - start time of last access</li>
<li>EndTime - String - required: no - end time of last access</li>
     * @param Filters <li>IpOrName - String - required: no - filter by host IP or alias</li>
<li>HostId - String - required: no - host ID</li>
<li>AgentId - String - required: no - client ID</li>
<li>PolicyType - String - required: no - policy type: 0 - system policy; 1 - user-defined policy</li>
<li>Domain - String - required: no - domain name (First convert the domain name into the urlencode format, and then encode it using base64.)</li>
<li>HandleStatus - String - required: no - filter by status: 0 - pending; 2 - trusted; 3 - untrusted</li>
<li>BeginTime - String - required: no - start time of last access</li>
<li>EndTime - String - required: no - end time of last access</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of items to be returned. It is 10 by default, and the maximum value is 100. 
     * @return Limit Number of items to be returned. It is 10 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be returned. It is 10 by default, and the maximum value is 100.
     * @param Limit Number of items to be returned. It is 10 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which defaults to 0 
     * @return Offset Offset, which defaults to 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which defaults to 0
     * @param Offset Offset, which defaults to 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting method: sort by number of requests [asc: ascending order|desc: descending order] 
     * @return Order Sorting method: sort by number of requests [asc: ascending order|desc: descending order]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: sort by number of requests [asc: ascending order|desc: descending order]
     * @param Order Sorting method: sort by number of requests [asc: ascending order|desc: descending order]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field: [AccessCount: number of requests|LastTime: last request time] 
     * @return By Sorting field: [AccessCount: number of requests|LastTime: last request time]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: [AccessCount: number of requests|LastTime: last request time]
     * @param By Sorting field: [AccessCount: number of requests|LastTime: last request time]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeRiskDnsEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskDnsEventListRequest(DescribeRiskDnsEventListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

