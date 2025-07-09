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

public class DescribeCheckItemListRequest extends AbstractModel {

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of records per query
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Name. Valid values: `risk_level` (risk level); `risk_target` (check target and risky target); `risk_type` (risk type); `risk_attri` (risk type of the check item).
    */
    @SerializedName("Filters")
    @Expose
    private ComplianceFilters [] Filters;

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of records per query 
     * @return Limit Maximum number of records per query
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of records per query
     * @param Limit Maximum number of records per query
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Name. Valid values: `risk_level` (risk level); `risk_target` (check target and risky target); `risk_type` (risk type); `risk_attri` (risk type of the check item). 
     * @return Filters Name. Valid values: `risk_level` (risk level); `risk_target` (check target and risky target); `risk_type` (risk type); `risk_attri` (risk type of the check item).
     */
    public ComplianceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Name. Valid values: `risk_level` (risk level); `risk_target` (check target and risky target); `risk_type` (risk type); `risk_attri` (risk type of the check item).
     * @param Filters Name. Valid values: `risk_level` (risk level); `risk_target` (check target and risky target); `risk_type` (risk type); `risk_attri` (risk type of the check item).
     */
    public void setFilters(ComplianceFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCheckItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCheckItemListRequest(DescribeCheckItemListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ComplianceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ComplianceFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

