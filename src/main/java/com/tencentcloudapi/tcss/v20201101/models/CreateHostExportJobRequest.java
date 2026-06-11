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

public class CreateHostExportJobRequest extends AbstractModel {

    /**
    * Filter conditions.<li>Status-String-Required: No-Filter by agent Status. "ALL": "ALL" (or leave this field blank), "UNINSTALL": "Not installed", "OFFLINE": "OFFLINE", "ONLINE": "Under protection"</li><li>HostName-String-Required: No-HostName Filtering</li><li>Group-String-Required: No-Host Group search</li><li>HostIP-String-Required: No-Search by host ip</li><li>HostID-String-Required: No-Search by host id</li><li>DockerVersion-String-Required: No-docker version search</li><li>MachineType-String-Required: No-Host origin MachineType search. "ALL": "ALL" (or leave this field blank). Host source: One of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server.</li><li>DockerStatus-String-Required: No-docker installation Status. "ALL": "ALL" (or leave this field blank), "INSTALL": "Installed", "UNINSTALL": "Not installed"</li><li>ProjectID-String-Required: No-Project id search</li><li>Tag:(Tag: key)-String-Required: No-Tag key-value search. Example Filters":[{"Name":"Tag: tke-kind","Values":["service"]}]</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The number of results to return. Default value: 10. Maximum value: 10,000.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Valid values: `asc`, `desc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Export field
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
     * Get Filter conditions.<li>Status-String-Required: No-Filter by agent Status. "ALL": "ALL" (or leave this field blank), "UNINSTALL": "Not installed", "OFFLINE": "OFFLINE", "ONLINE": "Under protection"</li><li>HostName-String-Required: No-HostName Filtering</li><li>Group-String-Required: No-Host Group search</li><li>HostIP-String-Required: No-Search by host ip</li><li>HostID-String-Required: No-Search by host id</li><li>DockerVersion-String-Required: No-docker version search</li><li>MachineType-String-Required: No-Host origin MachineType search. "ALL": "ALL" (or leave this field blank). Host source: One of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server.</li><li>DockerStatus-String-Required: No-docker installation Status. "ALL": "ALL" (or leave this field blank), "INSTALL": "Installed", "UNINSTALL": "Not installed"</li><li>ProjectID-String-Required: No-Project id search</li><li>Tag:(Tag: key)-String-Required: No-Tag key-value search. Example Filters":[{"Name":"Tag: tke-kind","Values":["service"]}]</li> 
     * @return Filters Filter conditions.<li>Status-String-Required: No-Filter by agent Status. "ALL": "ALL" (or leave this field blank), "UNINSTALL": "Not installed", "OFFLINE": "OFFLINE", "ONLINE": "Under protection"</li><li>HostName-String-Required: No-HostName Filtering</li><li>Group-String-Required: No-Host Group search</li><li>HostIP-String-Required: No-Search by host ip</li><li>HostID-String-Required: No-Search by host id</li><li>DockerVersion-String-Required: No-docker version search</li><li>MachineType-String-Required: No-Host origin MachineType search. "ALL": "ALL" (or leave this field blank). Host source: One of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server.</li><li>DockerStatus-String-Required: No-docker installation Status. "ALL": "ALL" (or leave this field blank), "INSTALL": "Installed", "UNINSTALL": "Not installed"</li><li>ProjectID-String-Required: No-Project id search</li><li>Tag:(Tag: key)-String-Required: No-Tag key-value search. Example Filters":[{"Name":"Tag: tke-kind","Values":["service"]}]</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions.<li>Status-String-Required: No-Filter by agent Status. "ALL": "ALL" (or leave this field blank), "UNINSTALL": "Not installed", "OFFLINE": "OFFLINE", "ONLINE": "Under protection"</li><li>HostName-String-Required: No-HostName Filtering</li><li>Group-String-Required: No-Host Group search</li><li>HostIP-String-Required: No-Search by host ip</li><li>HostID-String-Required: No-Search by host id</li><li>DockerVersion-String-Required: No-docker version search</li><li>MachineType-String-Required: No-Host origin MachineType search. "ALL": "ALL" (or leave this field blank). Host source: One of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server.</li><li>DockerStatus-String-Required: No-docker installation Status. "ALL": "ALL" (or leave this field blank), "INSTALL": "Installed", "UNINSTALL": "Not installed"</li><li>ProjectID-String-Required: No-Project id search</li><li>Tag:(Tag: key)-String-Required: No-Tag key-value search. Example Filters":[{"Name":"Tag: tke-kind","Values":["service"]}]</li>
     * @param Filters Filter conditions.<li>Status-String-Required: No-Filter by agent Status. "ALL": "ALL" (or leave this field blank), "UNINSTALL": "Not installed", "OFFLINE": "OFFLINE", "ONLINE": "Under protection"</li><li>HostName-String-Required: No-HostName Filtering</li><li>Group-String-Required: No-Host Group search</li><li>HostIP-String-Required: No-Search by host ip</li><li>HostID-String-Required: No-Search by host id</li><li>DockerVersion-String-Required: No-docker version search</li><li>MachineType-String-Required: No-Host origin MachineType search. "ALL": "ALL" (or leave this field blank). Host source: One of ["CVM", "ECM", "LH", "BM"] is a Tencent Cloud server; one of ["Other"] is a non-Tencent Cloud server.</li><li>DockerStatus-String-Required: No-docker installation Status. "ALL": "ALL" (or leave this field blank), "INSTALL": "Installed", "UNINSTALL": "Not installed"</li><li>ProjectID-String-Required: No-Project id search</li><li>Tag:(Tag: key)-String-Required: No-Tag key-value search. Example Filters":[{"Name":"Tag: tke-kind","Values":["service"]}]</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Limit Offset. Default value: `0`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Limit Offset. Default value: `0`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The number of results to return. Default value: 10. Maximum value: 10,000. 
     * @return Offset The number of results to return. Default value: 10. Maximum value: 10,000.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The number of results to return. Default value: 10. Maximum value: 10,000.
     * @param Offset The number of results to return. Default value: 10. Maximum value: 10,000.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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
     * Get Valid values: `asc`, `desc`. 
     * @return Order Valid values: `asc`, `desc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Valid values: `asc`, `desc`.
     * @param Order Valid values: `asc`, `desc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Export field 
     * @return ExportField Export field
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set Export field
     * @param ExportField Export field
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    public CreateHostExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHostExportJobRequest(CreateHostExportJobRequest source) {
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);

    }
}

