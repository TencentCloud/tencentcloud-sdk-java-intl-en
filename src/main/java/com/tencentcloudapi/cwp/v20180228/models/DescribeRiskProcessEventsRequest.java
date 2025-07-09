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

public class DescribeRiskProcessEventsRequest extends AbstractModel {

    /**
    * Filtering criteria
<li>HostId - String - required: no - host ID</li>
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>ProcessId - String - required: no - process ID</li>
<li>FilePath - String - required: no - process path</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - status for filtering: 0: pending; 1: scanning; 2: scanned; 3: exited; 4: trusted</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of results to be returned. Default value: 10. Maximum value: 100.
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
    * Sorting order: [ASC|DESC]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * [StartTime: Process start time | DetectTime: Last detection time]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filtering criteria
<li>HostId - String - required: no - host ID</li>
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>ProcessId - String - required: no - process ID</li>
<li>FilePath - String - required: no - process path</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - status for filtering: 0: pending; 1: scanning; 2: scanned; 3: exited; 4: trusted</li> 
     * @return Filters Filtering criteria
<li>HostId - String - required: no - host ID</li>
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>ProcessId - String - required: no - process ID</li>
<li>FilePath - String - required: no - process path</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - status for filtering: 0: pending; 1: scanning; 2: scanned; 3: exited; 4: trusted</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>HostId - String - required: no - host ID</li>
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>ProcessId - String - required: no - process ID</li>
<li>FilePath - String - required: no - process path</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - status for filtering: 0: pending; 1: scanning; 2: scanned; 3: exited; 4: trusted</li>
     * @param Filters Filtering criteria
<li>HostId - String - required: no - host ID</li>
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>ProcessId - String - required: no - process ID</li>
<li>FilePath - String - required: no - process path</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - status for filtering: 0: pending; 1: scanning; 2: scanned; 3: exited; 4: trusted</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of results to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of results to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of results to be returned. Default value: 10. Maximum value: 100.
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
     * Get Sorting order: [ASC|DESC] 
     * @return Order Sorting order: [ASC|DESC]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order: [ASC|DESC]
     * @param Order Sorting order: [ASC|DESC]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get [StartTime: Process start time | DetectTime: Last detection time] 
     * @return By [StartTime: Process start time | DetectTime: Last detection time]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set [StartTime: Process start time | DetectTime: Last detection time]
     * @param By [StartTime: Process start time | DetectTime: Last detection time]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeRiskProcessEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskProcessEventsRequest(DescribeRiskProcessEventsRequest source) {
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

