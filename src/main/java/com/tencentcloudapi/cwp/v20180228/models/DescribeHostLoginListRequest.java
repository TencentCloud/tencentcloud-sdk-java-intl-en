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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostLoginListRequest extends AbstractModel {

    /**
    * Number of items to be returned. The maximum value is 100.
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
    * Filter criteria
<li>Quuid - String - required: no - CVM UUID</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>MachineName - String - required: no - host alias</li>
<li>Ip - String - required: no - host IP</li>
<li>InstanceID - String - required: no - host instance ID</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>UserName - String - required: no - filter by username</li>
<li>Status - int - required: no - status filtering: 1: normal log-in; 5: whitelisted; 14: processed; 15: ignored</li>
<li>LoginTimeBegin - String - required: no - filter by modification time; start time</li>
<li>LoginTimeEnd - String - required: no - filter by modification time; end time</li>
<li>RiskLevel - int - required: no - status filtering: 0: high-risk; 1: suspicious</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting method: sort by number of requests: asc - ascending order/desc - descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field: LoginTime - occurrence time
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Number of items to be returned. The maximum value is 100. 
     * @return Limit Number of items to be returned. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be returned. The maximum value is 100.
     * @param Limit Number of items to be returned. The maximum value is 100.
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
     * Get Filter criteria
<li>Quuid - String - required: no - CVM UUID</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>MachineName - String - required: no - host alias</li>
<li>Ip - String - required: no - host IP</li>
<li>InstanceID - String - required: no - host instance ID</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>UserName - String - required: no - filter by username</li>
<li>Status - int - required: no - status filtering: 1: normal log-in; 5: whitelisted; 14: processed; 15: ignored</li>
<li>LoginTimeBegin - String - required: no - filter by modification time; start time</li>
<li>LoginTimeEnd - String - required: no - filter by modification time; end time</li>
<li>RiskLevel - int - required: no - status filtering: 0: high-risk; 1: suspicious</li> 
     * @return Filters Filter criteria
<li>Quuid - String - required: no - CVM UUID</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>MachineName - String - required: no - host alias</li>
<li>Ip - String - required: no - host IP</li>
<li>InstanceID - String - required: no - host instance ID</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>UserName - String - required: no - filter by username</li>
<li>Status - int - required: no - status filtering: 1: normal log-in; 5: whitelisted; 14: processed; 15: ignored</li>
<li>LoginTimeBegin - String - required: no - filter by modification time; start time</li>
<li>LoginTimeEnd - String - required: no - filter by modification time; end time</li>
<li>RiskLevel - int - required: no - status filtering: 0: high-risk; 1: suspicious</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Quuid - String - required: no - CVM UUID</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>MachineName - String - required: no - host alias</li>
<li>Ip - String - required: no - host IP</li>
<li>InstanceID - String - required: no - host instance ID</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>UserName - String - required: no - filter by username</li>
<li>Status - int - required: no - status filtering: 1: normal log-in; 5: whitelisted; 14: processed; 15: ignored</li>
<li>LoginTimeBegin - String - required: no - filter by modification time; start time</li>
<li>LoginTimeEnd - String - required: no - filter by modification time; end time</li>
<li>RiskLevel - int - required: no - status filtering: 0: high-risk; 1: suspicious</li>
     * @param Filters Filter criteria
<li>Quuid - String - required: no - CVM UUID</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>MachineName - String - required: no - host alias</li>
<li>Ip - String - required: no - host IP</li>
<li>InstanceID - String - required: no - host instance ID</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>UserName - String - required: no - filter by username</li>
<li>Status - int - required: no - status filtering: 1: normal log-in; 5: whitelisted; 14: processed; 15: ignored</li>
<li>LoginTimeBegin - String - required: no - filter by modification time; start time</li>
<li>LoginTimeEnd - String - required: no - filter by modification time; end time</li>
<li>RiskLevel - int - required: no - status filtering: 0: high-risk; 1: suspicious</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method: sort by number of requests: asc - ascending order/desc - descending order 
     * @return Order Sorting method: sort by number of requests: asc - ascending order/desc - descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: sort by number of requests: asc - ascending order/desc - descending order
     * @param Order Sorting method: sort by number of requests: asc - ascending order/desc - descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field: LoginTime - occurrence time 
     * @return By Sorting field: LoginTime - occurrence time
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: LoginTime - occurrence time
     * @param By Sorting field: LoginTime - occurrence time
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeHostLoginListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostLoginListRequest(DescribeHostLoginListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

