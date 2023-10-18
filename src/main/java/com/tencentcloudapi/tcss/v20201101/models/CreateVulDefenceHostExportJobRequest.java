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

public class CreateVulDefenceHostExportJobRequest extends AbstractModel {

    /**
    * Filter
<li>Status- String - Required: No - Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENCE` (not defended).</li>
<li>KeyWords- string - Required: No - Server name/IP</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Number of results to be returned. Maximum value: `100000`.
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
    * Sorting order. Valid values: `asc`, `desc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field. Valid values: `ModifyTime` (update time); `CreateTime` (first enablement time).
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter
<li>Status- String - Required: No - Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENCE` (not defended).</li>
<li>KeyWords- string - Required: No - Server name/IP</li> 
     * @return Filters Filter
<li>Status- String - Required: No - Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENCE` (not defended).</li>
<li>KeyWords- string - Required: No - Server name/IP</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>Status- String - Required: No - Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENCE` (not defended).</li>
<li>KeyWords- string - Required: No - Server name/IP</li>
     * @param Filters Filter
<li>Status- String - Required: No - Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENCE` (not defended).</li>
<li>KeyWords- string - Required: No - Server name/IP</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of results to be returned. Maximum value: `100000`. 
     * @return Limit Number of results to be returned. Maximum value: `100000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Maximum value: `100000`.
     * @param Limit Number of results to be returned. Maximum value: `100000`.
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
     * Get Sorting field. Valid values: `ModifyTime` (update time); `CreateTime` (first enablement time). 
     * @return By Sorting field. Valid values: `ModifyTime` (update time); `CreateTime` (first enablement time).
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field. Valid values: `ModifyTime` (update time); `CreateTime` (first enablement time).
     * @param By Sorting field. Valid values: `ModifyTime` (update time); `CreateTime` (first enablement time).
     */
    public void setBy(String By) {
        this.By = By;
    }

    public CreateVulDefenceHostExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulDefenceHostExportJobRequest(CreateVulDefenceHostExportJobRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
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

