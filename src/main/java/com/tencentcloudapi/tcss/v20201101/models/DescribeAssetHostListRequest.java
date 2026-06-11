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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetHostListRequest extends AbstractModel {

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
    * Filter criteria. <li>Status-String-Required: No-agent Status filtering, "ALL": "ALL" (or omit this field), "UNINSTALL": "not installed", "OFFLINE": "OFFLINE", "ONLINE": "under protection"</li> <li>HostName-String-Required: No-HostName filtering</li> <li>Group-String-Required: No-host Group search</li> <li>HostIP-String-Required: No-search by host ip</li> <li>HostID-String-Required: No-search by host id</li> <li>DockerVersion-String-Required: No-docker version search</li> <li>MachineType-String-Required: No-host origin MachineType search, "ALL": "ALL" (or omit this field), host source: one of ["CVM", "ECM", "LH", "BM"] for Tencent Cloud server; one of ["Other"] for non-Tencent Cloud server</li> <li>DockerStatus-String-Required: No-docker installation Status, "ALL": "ALL" (or omit this field), "INSTALL": "installed", "UNINSTALL": "not installed"</li> <li>ProjectID-String-Required: No-project id search</li> <li>Tag:(Tag: key)-String-Required: No-Tag key-value search example filter":[{"Name":"Tag: tke-kind","Values":["service"]}]</li> <li>NonClusterNode: whether to query non-cluster nodes (true: yes, false: no)</li>
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
     * Get Filter criteria. <li>Status-String-Required: No-agent Status filtering, "ALL": "ALL" (or omit this field), "UNINSTALL": "not installed", "OFFLINE": "OFFLINE", "ONLINE": "under protection"</li> <li>HostName-String-Required: No-HostName filtering</li> <li>Group-String-Required: No-host Group search</li> <li>HostIP-String-Required: No-search by host ip</li> <li>HostID-String-Required: No-search by host id</li> <li>DockerVersion-String-Required: No-docker version search</li> <li>MachineType-String-Required: No-host origin MachineType search, "ALL": "ALL" (or omit this field), host source: one of ["CVM", "ECM", "LH", "BM"] for Tencent Cloud server; one of ["Other"] for non-Tencent Cloud server</li> <li>DockerStatus-String-Required: No-docker installation Status, "ALL": "ALL" (or omit this field), "INSTALL": "installed", "UNINSTALL": "not installed"</li> <li>ProjectID-String-Required: No-project id search</li> <li>Tag:(Tag: key)-String-Required: No-Tag key-value search example filter":[{"Name":"Tag: tke-kind","Values":["service"]}]</li> <li>NonClusterNode: whether to query non-cluster nodes (true: yes, false: no)</li> 
     * @return Filters Filter criteria. <li>Status-String-Required: No-agent Status filtering, "ALL": "ALL" (or omit this field), "UNINSTALL": "not installed", "OFFLINE": "OFFLINE", "ONLINE": "under protection"</li> <li>HostName-String-Required: No-HostName filtering</li> <li>Group-String-Required: No-host Group search</li> <li>HostIP-String-Required: No-search by host ip</li> <li>HostID-String-Required: No-search by host id</li> <li>DockerVersion-String-Required: No-docker version search</li> <li>MachineType-String-Required: No-host origin MachineType search, "ALL": "ALL" (or omit this field), host source: one of ["CVM", "ECM", "LH", "BM"] for Tencent Cloud server; one of ["Other"] for non-Tencent Cloud server</li> <li>DockerStatus-String-Required: No-docker installation Status, "ALL": "ALL" (or omit this field), "INSTALL": "installed", "UNINSTALL": "not installed"</li> <li>ProjectID-String-Required: No-project id search</li> <li>Tag:(Tag: key)-String-Required: No-Tag key-value search example filter":[{"Name":"Tag: tke-kind","Values":["service"]}]</li> <li>NonClusterNode: whether to query non-cluster nodes (true: yes, false: no)</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. <li>Status-String-Required: No-agent Status filtering, "ALL": "ALL" (or omit this field), "UNINSTALL": "not installed", "OFFLINE": "OFFLINE", "ONLINE": "under protection"</li> <li>HostName-String-Required: No-HostName filtering</li> <li>Group-String-Required: No-host Group search</li> <li>HostIP-String-Required: No-search by host ip</li> <li>HostID-String-Required: No-search by host id</li> <li>DockerVersion-String-Required: No-docker version search</li> <li>MachineType-String-Required: No-host origin MachineType search, "ALL": "ALL" (or omit this field), host source: one of ["CVM", "ECM", "LH", "BM"] for Tencent Cloud server; one of ["Other"] for non-Tencent Cloud server</li> <li>DockerStatus-String-Required: No-docker installation Status, "ALL": "ALL" (or omit this field), "INSTALL": "installed", "UNINSTALL": "not installed"</li> <li>ProjectID-String-Required: No-project id search</li> <li>Tag:(Tag: key)-String-Required: No-Tag key-value search example filter":[{"Name":"Tag: tke-kind","Values":["service"]}]</li> <li>NonClusterNode: whether to query non-cluster nodes (true: yes, false: no)</li>
     * @param Filters Filter criteria. <li>Status-String-Required: No-agent Status filtering, "ALL": "ALL" (or omit this field), "UNINSTALL": "not installed", "OFFLINE": "OFFLINE", "ONLINE": "under protection"</li> <li>HostName-String-Required: No-HostName filtering</li> <li>Group-String-Required: No-host Group search</li> <li>HostIP-String-Required: No-search by host ip</li> <li>HostID-String-Required: No-search by host id</li> <li>DockerVersion-String-Required: No-docker version search</li> <li>MachineType-String-Required: No-host origin MachineType search, "ALL": "ALL" (or omit this field), host source: one of ["CVM", "ECM", "LH", "BM"] for Tencent Cloud server; one of ["Other"] for non-Tencent Cloud server</li> <li>DockerStatus-String-Required: No-docker installation Status, "ALL": "ALL" (or omit this field), "INSTALL": "installed", "UNINSTALL": "not installed"</li> <li>ProjectID-String-Required: No-project id search</li> <li>Tag:(Tag: key)-String-Required: No-Tag key-value search example filter":[{"Name":"Tag: tke-kind","Values":["service"]}]</li> <li>NonClusterNode: whether to query non-cluster nodes (true: yes, false: no)</li>
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

