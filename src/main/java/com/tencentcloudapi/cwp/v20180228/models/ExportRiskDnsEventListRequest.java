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

public class ExportRiskDnsEventListRequest extends AbstractModel {

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
    * Sorting method: [ASC: ascending order|DESC: descending order]
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
     * Get Sorting method: [ASC: ascending order|DESC: descending order] 
     * @return Order Sorting method: [ASC: ascending order|DESC: descending order]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: [ASC: ascending order|DESC: descending order]
     * @param Order Sorting method: [ASC: ascending order|DESC: descending order]
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

    public ExportRiskDnsEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRiskDnsEventListRequest(ExportRiskDnsEventListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

