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

public class DescribeEmergencyVulListRequest extends AbstractModel {

    /**
    * Quantity of returns. The maximum value is 100.
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
<li>Status - String - required: Yes - vulnerability status filter: 0: not detected; 1: at risk; 2: no risk; 3: show progress while detecting</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - vulnerability name search</li>
<li>Uuids- String - required: no - host uuid</li>
<li>IsSupportDefense - int- required: no - whether to support defense: 0: no; 1: yes</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting method: desc and asc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field PublishDate  LastScanTime HostCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Whether hot spot vulnerabilities
    */
    @SerializedName("HotspotAttack")
    @Expose
    private Boolean HotspotAttack;

    /**
     * Get Quantity of returns. The maximum value is 100. 
     * @return Limit Quantity of returns. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. The maximum value is 100.
     * @param Limit Quantity of returns. The maximum value is 100.
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
<li>Status - String - required: Yes - vulnerability status filter: 0: not detected; 1: at risk; 2: no risk; 3: show progress while detecting</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - vulnerability name search</li>
<li>Uuids- String - required: no - host uuid</li>
<li>IsSupportDefense - int- required: no - whether to support defense: 0: no; 1: yes</li> 
     * @return Filters Filter criteria
<li>Status - String - required: Yes - vulnerability status filter: 0: not detected; 1: at risk; 2: no risk; 3: show progress while detecting</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - vulnerability name search</li>
<li>Uuids- String - required: no - host uuid</li>
<li>IsSupportDefense - int- required: no - whether to support defense: 0: no; 1: yes</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Status - String - required: Yes - vulnerability status filter: 0: not detected; 1: at risk; 2: no risk; 3: show progress while detecting</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - vulnerability name search</li>
<li>Uuids- String - required: no - host uuid</li>
<li>IsSupportDefense - int- required: no - whether to support defense: 0: no; 1: yes</li>
     * @param Filters Filter criteria
<li>Status - String - required: Yes - vulnerability status filter: 0: not detected; 1: at risk; 2: no risk; 3: show progress while detecting</li>
<li>Level - String - required: no - filter by vulnerability level: 1 - low; 2 - medium; 3 - high; 4 - prompt</li>
<li>VulName - String - required: no - vulnerability name search</li>
<li>Uuids- String - required: no - host uuid</li>
<li>IsSupportDefense - int- required: no - whether to support defense: 0: no; 1: yes</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method: desc and asc 
     * @return Order Sorting method: desc and asc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: desc and asc
     * @param Order Sorting method: desc and asc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field PublishDate  LastScanTime HostCount 
     * @return By Sorting field PublishDate  LastScanTime HostCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field PublishDate  LastScanTime HostCount
     * @param By Sorting field PublishDate  LastScanTime HostCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Whether hot spot vulnerabilities 
     * @return HotspotAttack Whether hot spot vulnerabilities
     */
    public Boolean getHotspotAttack() {
        return this.HotspotAttack;
    }

    /**
     * Set Whether hot spot vulnerabilities
     * @param HotspotAttack Whether hot spot vulnerabilities
     */
    public void setHotspotAttack(Boolean HotspotAttack) {
        this.HotspotAttack = HotspotAttack;
    }

    public DescribeEmergencyVulListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmergencyVulListRequest(DescribeEmergencyVulListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.HotspotAttack != null) {
            this.HotspotAttack = new Boolean(source.HotspotAttack);
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
        this.setParamSimple(map, prefix + "HotspotAttack", this.HotspotAttack);

    }
}

