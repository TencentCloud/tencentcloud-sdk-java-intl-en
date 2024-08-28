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

public class ExportAssetPortInfoListRequest extends AbstractModel {

    /**
    * Query information of a specified QUUID host
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filter criteria
<li>Port - uint64 - required: no - port</li>
<li>Ip - String - required: no - bound IP address</li>
<li>ProcessName - String - required: no - process name</li>
<li>Pid - uint64 - required: no - PID</li>
<li>User - String - required: no - running user</li>
<li>Group - String - required: no - user group</li>
<li>Ppid - uint64 - required: no - PPID</li>
<li>Proto - string - required: no - tcp/udp or "" (empty string to filter unknown status)</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting method: asc for ascending order or desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting method: [FirstTime|StartTime]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Query information of a specified QUUID host 
     * @return Quuid Query information of a specified QUUID host
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Query information of a specified QUUID host
     * @param Quuid Query information of a specified QUUID host
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Filter criteria
<li>Port - uint64 - required: no - port</li>
<li>Ip - String - required: no - bound IP address</li>
<li>ProcessName - String - required: no - process name</li>
<li>Pid - uint64 - required: no - PID</li>
<li>User - String - required: no - running user</li>
<li>Group - String - required: no - user group</li>
<li>Ppid - uint64 - required: no - PPID</li>
<li>Proto - string - required: no - tcp/udp or "" (empty string to filter unknown status)</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li> 
     * @return Filters Filter criteria
<li>Port - uint64 - required: no - port</li>
<li>Ip - String - required: no - bound IP address</li>
<li>ProcessName - String - required: no - process name</li>
<li>Pid - uint64 - required: no - PID</li>
<li>User - String - required: no - running user</li>
<li>Group - String - required: no - user group</li>
<li>Ppid - uint64 - required: no - PPID</li>
<li>Proto - string - required: no - tcp/udp or "" (empty string to filter unknown status)</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Port - uint64 - required: no - port</li>
<li>Ip - String - required: no - bound IP address</li>
<li>ProcessName - String - required: no - process name</li>
<li>Pid - uint64 - required: no - PID</li>
<li>User - String - required: no - running user</li>
<li>Group - String - required: no - user group</li>
<li>Ppid - uint64 - required: no - PPID</li>
<li>Proto - string - required: no - tcp/udp or "" (empty string to filter unknown status)</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
     * @param Filters Filter criteria
<li>Port - uint64 - required: no - port</li>
<li>Ip - String - required: no - bound IP address</li>
<li>ProcessName - String - required: no - process name</li>
<li>Pid - uint64 - required: no - PID</li>
<li>User - String - required: no - running user</li>
<li>Group - String - required: no - user group</li>
<li>Ppid - uint64 - required: no - PPID</li>
<li>Proto - string - required: no - tcp/udp or "" (empty string to filter unknown status)</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method: asc for ascending order or desc for descending order 
     * @return Order Sorting method: asc for ascending order or desc for descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: asc for ascending order or desc for descending order
     * @param Order Sorting method: asc for ascending order or desc for descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting method: [FirstTime|StartTime] 
     * @return By Sorting method: [FirstTime|StartTime]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting method: [FirstTime|StartTime]
     * @param By Sorting method: [FirstTime|StartTime]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportAssetPortInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetPortInfoListRequest(ExportAssetPortInfoListRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

