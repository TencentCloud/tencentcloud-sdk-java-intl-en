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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetHostListRequest extends AbstractModel{

    /**
    * Number of results to be returned. Default value: `10`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filters.
<li>`Status` - String - Optional - Agent status. Values: `ALL`; `UNINSTALL` (Not installed); `OFFLINE`, `ONLINE`. Default to `All` if it's not specified. </li>
<li>`HostName` - String - Optional - Server name</li>
<li>`Group - String - Optional - Server group</li>
<li>`HostIP` - String - Optional - Server IP</li>
<li>`HostID - String - Optional - Server ID</li>
<li>`DockerVersion` - String - Optional - Docker version</li>
<li>`MachineType` - String - Optional - Server type. Values: `ALL`; `CVM` (Cloud Virtual Machine); `ECM` (Edge Computing Machine); `LH` (Lighthouse), `BM` (Cloud Bare Metal); `Other` (non-Tencent Cloud server). Default to `ALL` if it's not specified.</li>
<li>`DockerStatus` - String - Optional - Docker installation status. Values: `ALL`; `INSTALL` (Installed); `UNINSTALL` (Not installed)</li>
<li>`ProjectID` - String - Optional - Project ID</li>
<li>`Tag:xxx(tag:key)` - String - Optional - Tag key-value pair; Example: `Filters":[{"Name":"tag:tke-kind","Values":["service"]}]`</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Sorting order. Valid values: `asc`, `desc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Number of results to be returned. Default value: `10`. Maximum value: `100`. 
     * @return Limit Number of results to be returned. Default value: `10`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: `10`. Maximum value: `100`.
     * @param Limit Number of results to be returned. Default value: `10`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filters.
<li>`Status` - String - Optional - Agent status. Values: `ALL`; `UNINSTALL` (Not installed); `OFFLINE`, `ONLINE`. Default to `All` if it's not specified. </li>
<li>`HostName` - String - Optional - Server name</li>
<li>`Group - String - Optional - Server group</li>
<li>`HostIP` - String - Optional - Server IP</li>
<li>`HostID - String - Optional - Server ID</li>
<li>`DockerVersion` - String - Optional - Docker version</li>
<li>`MachineType` - String - Optional - Server type. Values: `ALL`; `CVM` (Cloud Virtual Machine); `ECM` (Edge Computing Machine); `LH` (Lighthouse), `BM` (Cloud Bare Metal); `Other` (non-Tencent Cloud server). Default to `ALL` if it's not specified.</li>
<li>`DockerStatus` - String - Optional - Docker installation status. Values: `ALL`; `INSTALL` (Installed); `UNINSTALL` (Not installed)</li>
<li>`ProjectID` - String - Optional - Project ID</li>
<li>`Tag:xxx(tag:key)` - String - Optional - Tag key-value pair; Example: `Filters":[{"Name":"tag:tke-kind","Values":["service"]}]`</li> 
     * @return Filters Filters.
<li>`Status` - String - Optional - Agent status. Values: `ALL`; `UNINSTALL` (Not installed); `OFFLINE`, `ONLINE`. Default to `All` if it's not specified. </li>
<li>`HostName` - String - Optional - Server name</li>
<li>`Group - String - Optional - Server group</li>
<li>`HostIP` - String - Optional - Server IP</li>
<li>`HostID - String - Optional - Server ID</li>
<li>`DockerVersion` - String - Optional - Docker version</li>
<li>`MachineType` - String - Optional - Server type. Values: `ALL`; `CVM` (Cloud Virtual Machine); `ECM` (Edge Computing Machine); `LH` (Lighthouse), `BM` (Cloud Bare Metal); `Other` (non-Tencent Cloud server). Default to `ALL` if it's not specified.</li>
<li>`DockerStatus` - String - Optional - Docker installation status. Values: `ALL`; `INSTALL` (Installed); `UNINSTALL` (Not installed)</li>
<li>`ProjectID` - String - Optional - Project ID</li>
<li>`Tag:xxx(tag:key)` - String - Optional - Tag key-value pair; Example: `Filters":[{"Name":"tag:tke-kind","Values":["service"]}]`</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters.
<li>`Status` - String - Optional - Agent status. Values: `ALL`; `UNINSTALL` (Not installed); `OFFLINE`, `ONLINE`. Default to `All` if it's not specified. </li>
<li>`HostName` - String - Optional - Server name</li>
<li>`Group - String - Optional - Server group</li>
<li>`HostIP` - String - Optional - Server IP</li>
<li>`HostID - String - Optional - Server ID</li>
<li>`DockerVersion` - String - Optional - Docker version</li>
<li>`MachineType` - String - Optional - Server type. Values: `ALL`; `CVM` (Cloud Virtual Machine); `ECM` (Edge Computing Machine); `LH` (Lighthouse), `BM` (Cloud Bare Metal); `Other` (non-Tencent Cloud server). Default to `ALL` if it's not specified.</li>
<li>`DockerStatus` - String - Optional - Docker installation status. Values: `ALL`; `INSTALL` (Installed); `UNINSTALL` (Not installed)</li>
<li>`ProjectID` - String - Optional - Project ID</li>
<li>`Tag:xxx(tag:key)` - String - Optional - Tag key-value pair; Example: `Filters":[{"Name":"tag:tke-kind","Values":["service"]}]`</li>
     * @param Filters Filters.
<li>`Status` - String - Optional - Agent status. Values: `ALL`; `UNINSTALL` (Not installed); `OFFLINE`, `ONLINE`. Default to `All` if it's not specified. </li>
<li>`HostName` - String - Optional - Server name</li>
<li>`Group - String - Optional - Server group</li>
<li>`HostIP` - String - Optional - Server IP</li>
<li>`HostID - String - Optional - Server ID</li>
<li>`DockerVersion` - String - Optional - Docker version</li>
<li>`MachineType` - String - Optional - Server type. Values: `ALL`; `CVM` (Cloud Virtual Machine); `ECM` (Edge Computing Machine); `LH` (Lighthouse), `BM` (Cloud Bare Metal); `Other` (non-Tencent Cloud server). Default to `ALL` if it's not specified.</li>
<li>`DockerStatus` - String - Optional - Docker installation status. Values: `ALL`; `INSTALL` (Installed); `UNINSTALL` (Not installed)</li>
<li>`ProjectID` - String - Optional - Project ID</li>
<li>`Tag:xxx(tag:key)` - String - Optional - Tag key-value pair; Example: `Filters":[{"Name":"tag:tke-kind","Values":["service"]}]`</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field 
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Sorting order. Valid values: `asc`, `desc`. 
     * @return Order Sorting order. Valid values: `asc`, `desc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order. Valid values: `asc`, `desc`.
     * @param Order Sorting order. Valid values: `asc`, `desc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeAssetHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetHostListRequest(DescribeAssetHostListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
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

