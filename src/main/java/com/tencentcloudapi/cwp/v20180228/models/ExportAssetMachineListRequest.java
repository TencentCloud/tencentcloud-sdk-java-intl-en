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

public class ExportAssetMachineListRequest extends AbstractModel {

    /**
    * Filter criteria
<li>IP - String - Required: No - Host IP</li>
<li>MachineName - String - Required: No - hostname</li>
<li>InstanceID - string - Required: No - Instance ID</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>DiskLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
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
    * Optional sorting method [FirstTime|PartitionCount]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter criteria
<li>IP - String - Required: No - Host IP</li>
<li>MachineName - String - Required: No - hostname</li>
<li>InstanceID - string - Required: No - Instance ID</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>DiskLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li> 
     * @return Filters Filter criteria
<li>IP - String - Required: No - Host IP</li>
<li>MachineName - String - Required: No - hostname</li>
<li>InstanceID - string - Required: No - Instance ID</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>DiskLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>IP - String - Required: No - Host IP</li>
<li>MachineName - String - Required: No - hostname</li>
<li>InstanceID - string - Required: No - Instance ID</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>DiskLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
     * @param Filters Filter criteria
<li>IP - String - Required: No - Host IP</li>
<li>MachineName - String - Required: No - hostname</li>
<li>InstanceID - string - Required: No - Instance ID</li>
<li>OsType - String - required: no - Windows or Linux</li>
<li>CpuLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>DiskLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
<li>MemLoad - Int - required: no - 
0: 0% or unknown; 1: 0% to 20%
2: 20%～50%  3: 50%～80%
4: 80%～100%</li>
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

    public ExportAssetMachineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetMachineListRequest(ExportAssetMachineListRequest source) {
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

