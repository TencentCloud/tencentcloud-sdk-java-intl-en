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

public class DescribeAssetMachineListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>MachineName  Host name</li>
<li>InstanceID  Instance ID  </li>
<li>IP   Private or public IP address</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
	0: unknown; 1: low load;
	2: medium load; 3: high load</li>
<li>DiskLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>Quuid: Host QUUID</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
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
    * Sorting method: asc for ascending order or desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Optional sorting method [FirstTime|PartitionCount]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter criteria
<li>MachineName  Host name</li>
<li>InstanceID  Instance ID  </li>
<li>IP   Private or public IP address</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
	0: unknown; 1: low load;
	2: medium load; 3: high load</li>
<li>DiskLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>Quuid: Host QUUID</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li> 
     * @return Filters Filter criteria
<li>MachineName  Host name</li>
<li>InstanceID  Instance ID  </li>
<li>IP   Private or public IP address</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
	0: unknown; 1: low load;
	2: medium load; 3: high load</li>
<li>DiskLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>Quuid: Host QUUID</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>MachineName  Host name</li>
<li>InstanceID  Instance ID  </li>
<li>IP   Private or public IP address</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
	0: unknown; 1: low load;
	2: medium load; 3: high load</li>
<li>DiskLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>Quuid: Host QUUID</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
     * @param Filters Filter criteria
<li>MachineName  Host name</li>
<li>InstanceID  Instance ID  </li>
<li>IP   Private or public IP address</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
	0: unknown; 1: low load;
	2: medium load; 3: high load</li>
<li>DiskLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
	0: 0% or unknown; 1: 0%-20%;
	2: 20%～50%  3: 50%～80%
	4: 80%～100%</li>
<li>Quuid: Host QUUID</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
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
     * Get Optional sorting method [FirstTime|PartitionCount] 
     * @return By Optional sorting method [FirstTime|PartitionCount]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Optional sorting method [FirstTime|PartitionCount]
     * @param By Optional sorting method [FirstTime|PartitionCount]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeAssetMachineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetMachineListRequest(DescribeAssetMachineListRequest source) {
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

