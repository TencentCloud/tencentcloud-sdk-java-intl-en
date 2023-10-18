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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageExportJobRequest extends AbstractModel {

    /**
    * Filter
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus - String - Required: No - Image scanning status. Valid values: `notScan`, `scanning`, `scanned`, `scanErr`.</li>
<li>ImageID- String - Required: No - Image ID</li>
<li>SecurityRisk- String - Required: No - Security risks. Valid values: `VulCnt`, `VirusCnt`, `RiskCnt`, `IsTrustImage`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned. Default value: `10`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
    * Export field
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

    /**
     * Get Filter
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus - String - Required: No - Image scanning status. Valid values: `notScan`, `scanning`, `scanned`, `scanErr`.</li>
<li>ImageID- String - Required: No - Image ID</li>
<li>SecurityRisk- String - Required: No - Security risks. Valid values: `VulCnt`, `VirusCnt`, `RiskCnt`, `IsTrustImage`.</li> 
     * @return Filters Filter
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus - String - Required: No - Image scanning status. Valid values: `notScan`, `scanning`, `scanned`, `scanErr`.</li>
<li>ImageID- String - Required: No - Image ID</li>
<li>SecurityRisk- String - Required: No - Security risks. Valid values: `VulCnt`, `VirusCnt`, `RiskCnt`, `IsTrustImage`.</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus - String - Required: No - Image scanning status. Valid values: `notScan`, `scanning`, `scanned`, `scanErr`.</li>
<li>ImageID- String - Required: No - Image ID</li>
<li>SecurityRisk- String - Required: No - Security risks. Valid values: `VulCnt`, `VirusCnt`, `RiskCnt`, `IsTrustImage`.</li>
     * @param Filters Filter
<li>ImageName- String - Required: No - Image name</li>
<li>ScanStatus - String - Required: No - Image scanning status. Valid values: `notScan`, `scanning`, `scanned`, `scanErr`.</li>
<li>ImageID- String - Required: No - Image ID</li>
<li>SecurityRisk- String - Required: No - Security risks. Valid values: `VulCnt`, `VirusCnt`, `RiskCnt`, `IsTrustImage`.</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
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

    public CreateImageExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageExportJobRequest(CreateImageExportJobRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);

    }
}

