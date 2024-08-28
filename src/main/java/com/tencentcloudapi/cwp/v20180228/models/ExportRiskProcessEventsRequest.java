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

public class ExportRiskProcessEventsRequest extends AbstractModel {

    /**
    * Filter criteria
<li>HostId - String - Required: No - Host ID</li>
<li>IpOrName - String - whether required: no - host IP or host name</li>
<li>VirusName - String - whether required: no - virus name</li>
<li>ProcessId - String - whether required: no - process ID</li>
<li>ProcessPath - String - whether required: no - process path</li>
<li>BeginTime - String - whether required: no - process startup time - begin</li>
<li>BeginTime - String - whether required: no - process startup time - end</li>
<li>Status - String - whether required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li>
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
    * [StartTime: Process start time | DetectTime: Last detection time]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter criteria
<li>HostId - String - Required: No - Host ID</li>
<li>IpOrName - String - whether required: no - host IP or host name</li>
<li>VirusName - String - whether required: no - virus name</li>
<li>ProcessId - String - whether required: no - process ID</li>
<li>ProcessPath - String - whether required: no - process path</li>
<li>BeginTime - String - whether required: no - process startup time - begin</li>
<li>BeginTime - String - whether required: no - process startup time - end</li>
<li>Status - String - whether required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li> 
     * @return Filters Filter criteria
<li>HostId - String - Required: No - Host ID</li>
<li>IpOrName - String - whether required: no - host IP or host name</li>
<li>VirusName - String - whether required: no - virus name</li>
<li>ProcessId - String - whether required: no - process ID</li>
<li>ProcessPath - String - whether required: no - process path</li>
<li>BeginTime - String - whether required: no - process startup time - begin</li>
<li>BeginTime - String - whether required: no - process startup time - end</li>
<li>Status - String - whether required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>HostId - String - Required: No - Host ID</li>
<li>IpOrName - String - whether required: no - host IP or host name</li>
<li>VirusName - String - whether required: no - virus name</li>
<li>ProcessId - String - whether required: no - process ID</li>
<li>ProcessPath - String - whether required: no - process path</li>
<li>BeginTime - String - whether required: no - process startup time - begin</li>
<li>BeginTime - String - whether required: no - process startup time - end</li>
<li>Status - String - whether required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li>
     * @param Filters Filter criteria
<li>HostId - String - Required: No - Host ID</li>
<li>IpOrName - String - whether required: no - host IP or host name</li>
<li>VirusName - String - whether required: no - virus name</li>
<li>ProcessId - String - whether required: no - process ID</li>
<li>ProcessPath - String - whether required: no - process path</li>
<li>BeginTime - String - whether required: no - process startup time - begin</li>
<li>BeginTime - String - whether required: no - process startup time - end</li>
<li>Status - String - whether required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li>
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

    public ExportRiskProcessEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRiskProcessEventsRequest(ExportRiskProcessEventsRequest source) {
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

