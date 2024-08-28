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

public class DescribeAttackEventsRequest extends AbstractModel {

    /**
    * Number of returns. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    *  Filter criteria
<li>Type - String attack status. 0: attempted attack; 1: attack succeeded - required: no</li>
<li>Status - String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted - required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>Uuids - String CWPP UUID - required: no</li>
<li>Quuids - String CVM UUID - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>AttackTimeBegin - String attack start time - required: no</li>
<li>AttackTimeEnd - String attack end time - required: no</li>
<li>VulSupportDefense - String: whether the vulnerability can be defended: 0: no;1: yes - required: no</li>

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sort
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting method: ASC, DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Number of returns. The maximum value is 100. 
     * @return Limit Number of returns. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns. The maximum value is 100.
     * @param Limit Number of returns. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get  Filter criteria
<li>Type - String attack status. 0: attempted attack; 1: attack succeeded - required: no</li>
<li>Status - String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted - required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>Uuids - String CWPP UUID - required: no</li>
<li>Quuids - String CVM UUID - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>AttackTimeBegin - String attack start time - required: no</li>
<li>AttackTimeEnd - String attack end time - required: no</li>
<li>VulSupportDefense - String: whether the vulnerability can be defended: 0: no;1: yes - required: no</li>
 
     * @return Filters  Filter criteria
<li>Type - String attack status. 0: attempted attack; 1: attack succeeded - required: no</li>
<li>Status - String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted - required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>Uuids - String CWPP UUID - required: no</li>
<li>Quuids - String CVM UUID - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>AttackTimeBegin - String attack start time - required: no</li>
<li>AttackTimeEnd - String attack end time - required: no</li>
<li>VulSupportDefense - String: whether the vulnerability can be defended: 0: no;1: yes - required: no</li>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set  Filter criteria
<li>Type - String attack status. 0: attempted attack; 1: attack succeeded - required: no</li>
<li>Status - String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted - required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>Uuids - String CWPP UUID - required: no</li>
<li>Quuids - String CVM UUID - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>AttackTimeBegin - String attack start time - required: no</li>
<li>AttackTimeEnd - String attack end time - required: no</li>
<li>VulSupportDefense - String: whether the vulnerability can be defended: 0: no;1: yes - required: no</li>

     * @param Filters  Filter criteria
<li>Type - String attack status. 0: attempted attack; 1: attack succeeded - required: no</li>
<li>Status - String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted - required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>Uuids - String CWPP UUID - required: no</li>
<li>Quuids - String CVM UUID - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>AttackTimeBegin - String attack start time - required: no</li>
<li>AttackTimeEnd - String attack end time - required: no</li>
<li>VulSupportDefense - String: whether the vulnerability can be defended: 0: no;1: yes - required: no</li>

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sort 
     * @return By Sort
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sort
     * @param By Sort
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting method: ASC, DESC 
     * @return Order Sorting method: ASC, DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: ASC, DESC
     * @param Order Sorting method: ASC, DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAttackEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttackEventsRequest(DescribeAttackEventsRequest source) {
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
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

