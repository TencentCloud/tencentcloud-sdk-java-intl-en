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

public class DescribeAssetProcessInfoListRequest extends AbstractModel {

    /**
    * Query the information on the host with the specified QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filtering criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name - String - required: no - process name</li>
<li>User - String - required: no - process user</li>
<li>Group - String - required: no - process user group</li>
<li>Pid - uint64 - required: no - process ID</li>
<li>Ppid - uint64 - required: no - parent process ID</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Status - string - required: no - process status:
1: R, runnable
2: S, interruptible
3: D, uninterruptible
4: T, stopped or traced
5: Z, zombie
6: X, to be terminated</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
<li>InstallByPackage - uint64 - required: no - whether to install by package: 0: no; 1: yes</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
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
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get Query the information on the host with the specified QUUID 
     * @return Quuid Query the information on the host with the specified QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Query the information on the host with the specified QUUID
     * @param Quuid Query the information on the host with the specified QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Filtering criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name - String - required: no - process name</li>
<li>User - String - required: no - process user</li>
<li>Group - String - required: no - process user group</li>
<li>Pid - uint64 - required: no - process ID</li>
<li>Ppid - uint64 - required: no - parent process ID</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Status - string - required: no - process status:
1: R, runnable
2: S, interruptible
3: D, uninterruptible
4: T, stopped or traced
5: Z, zombie
6: X, to be terminated</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
<li>InstallByPackage - uint64 - required: no - whether to install by package: 0: no; 1: yes</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li> 
     * @return Filters Filtering criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name - String - required: no - process name</li>
<li>User - String - required: no - process user</li>
<li>Group - String - required: no - process user group</li>
<li>Pid - uint64 - required: no - process ID</li>
<li>Ppid - uint64 - required: no - parent process ID</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Status - string - required: no - process status:
1: R, runnable
2: S, interruptible
3: D, uninterruptible
4: T, stopped or traced
5: Z, zombie
6: X, to be terminated</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
<li>InstallByPackage - uint64 - required: no - whether to install by package: 0: no; 1: yes</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name - String - required: no - process name</li>
<li>User - String - required: no - process user</li>
<li>Group - String - required: no - process user group</li>
<li>Pid - uint64 - required: no - process ID</li>
<li>Ppid - uint64 - required: no - parent process ID</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Status - string - required: no - process status:
1: R, runnable
2: S, interruptible
3: D, uninterruptible
4: T, stopped or traced
5: Z, zombie
6: X, to be terminated</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
<li>InstallByPackage - uint64 - required: no - whether to install by package: 0: no; 1: yes</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
     * @param Filters Filtering criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name - String - required: no - process name</li>
<li>User - String - required: no - process user</li>
<li>Group - String - required: no - process user group</li>
<li>Pid - uint64 - required: no - process ID</li>
<li>Ppid - uint64 - required: no - parent process ID</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Status - string - required: no - process status:
1: R, runnable
2: S, interruptible
3: D, uninterruptible
4: T, stopped or traced
5: Z, zombie
6: X, to be terminated</li>
<li>RunTimeStart - String - required: no - running start time</li>
<li>RunTimeEnd - String - required: no - running end time</li>
<li>InstallByPackage - uint64 - required: no - whether to install by package: 0: no; 1: yes</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
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

    public DescribeAssetProcessInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetProcessInfoListRequest(DescribeAssetProcessInfoListRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

