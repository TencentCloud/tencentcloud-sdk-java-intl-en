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

public class DescribeBruteAttackListRequest extends AbstractModel {

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
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>Quuid - String - required: no - CVM UUID</li>
<li>Status - String - required: no - filter by status: failed - FAILED; succeeded - SUCCESS</li>
<li>UserName - String - required: no - filter by UserName</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>CreateBeginTime - String - required: no - filter by first attack time, start time</li>
<li>CreateEndTime - String - required: no - filter by first attack time, end time</li>
<li>ModifyBeginTime - String - required: no - filter by last attack time, start time</li>
<li>ModifyEndTime - String - required: no - filter by last attack time, end time</li>
<li>Banned - String - required: no - filter by blocking status (separate multiple items with commas): 0 - not blocked (global ZK switch is off); 82 - not blocked (Non-Pro Edition); 83 - not blocked (allowlisted); 1 - blocked; 2 - not blocked (abnormal program); 3 - not blocked (private network attacks cannot be blocked); 4 - not blocked (Anping is not supported)</li>
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
    * Sorting field: CreateTime - first attack time
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
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>Quuid - String - required: no - CVM UUID</li>
<li>Status - String - required: no - filter by status: failed - FAILED; succeeded - SUCCESS</li>
<li>UserName - String - required: no - filter by UserName</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>CreateBeginTime - String - required: no - filter by first attack time, start time</li>
<li>CreateEndTime - String - required: no - filter by first attack time, end time</li>
<li>ModifyBeginTime - String - required: no - filter by last attack time, start time</li>
<li>ModifyEndTime - String - required: no - filter by last attack time, end time</li>
<li>Banned - String - required: no - filter by blocking status (separate multiple items with commas): 0 - not blocked (global ZK switch is off); 82 - not blocked (Non-Pro Edition); 83 - not blocked (allowlisted); 1 - blocked; 2 - not blocked (abnormal program); 3 - not blocked (private network attacks cannot be blocked); 4 - not blocked (Anping is not supported)</li> 
     * @return Filters Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>Quuid - String - required: no - CVM UUID</li>
<li>Status - String - required: no - filter by status: failed - FAILED; succeeded - SUCCESS</li>
<li>UserName - String - required: no - filter by UserName</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>CreateBeginTime - String - required: no - filter by first attack time, start time</li>
<li>CreateEndTime - String - required: no - filter by first attack time, end time</li>
<li>ModifyBeginTime - String - required: no - filter by last attack time, start time</li>
<li>ModifyEndTime - String - required: no - filter by last attack time, end time</li>
<li>Banned - String - required: no - filter by blocking status (separate multiple items with commas): 0 - not blocked (global ZK switch is off); 82 - not blocked (Non-Pro Edition); 83 - not blocked (allowlisted); 1 - blocked; 2 - not blocked (abnormal program); 3 - not blocked (private network attacks cannot be blocked); 4 - not blocked (Anping is not supported)</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>Quuid - String - required: no - CVM UUID</li>
<li>Status - String - required: no - filter by status: failed - FAILED; succeeded - SUCCESS</li>
<li>UserName - String - required: no - filter by UserName</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>CreateBeginTime - String - required: no - filter by first attack time, start time</li>
<li>CreateEndTime - String - required: no - filter by first attack time, end time</li>
<li>ModifyBeginTime - String - required: no - filter by last attack time, start time</li>
<li>ModifyEndTime - String - required: no - filter by last attack time, end time</li>
<li>Banned - String - required: no - filter by blocking status (separate multiple items with commas): 0 - not blocked (global ZK switch is off); 82 - not blocked (Non-Pro Edition); 83 - not blocked (allowlisted); 1 - blocked; 2 - not blocked (abnormal program); 3 - not blocked (private network attacks cannot be blocked); 4 - not blocked (Anping is not supported)</li>
     * @param Filters Filter criteria
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>Uuid - String - required: no - CWPP unique UUID</li>
<li>Quuid - String - required: no - CVM UUID</li>
<li>Status - String - required: no - filter by status: failed - FAILED; succeeded - SUCCESS</li>
<li>UserName - String - required: no - filter by UserName</li>
<li>SrcIp - String - required: no - filter by source IP</li>
<li>CreateBeginTime - String - required: no - filter by first attack time, start time</li>
<li>CreateEndTime - String - required: no - filter by first attack time, end time</li>
<li>ModifyBeginTime - String - required: no - filter by last attack time, start time</li>
<li>ModifyEndTime - String - required: no - filter by last attack time, end time</li>
<li>Banned - String - required: no - filter by blocking status (separate multiple items with commas): 0 - not blocked (global ZK switch is off); 82 - not blocked (Non-Pro Edition); 83 - not blocked (allowlisted); 1 - blocked; 2 - not blocked (abnormal program); 3 - not blocked (private network attacks cannot be blocked); 4 - not blocked (Anping is not supported)</li>
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
     * Get Sorting field: CreateTime - first attack time 
     * @return By Sorting field: CreateTime - first attack time
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: CreateTime - first attack time
     * @param By Sorting field: CreateTime - first attack time
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBruteAttackListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBruteAttackListRequest(DescribeBruteAttackListRequest source) {
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

