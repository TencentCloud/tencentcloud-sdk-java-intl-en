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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditInstanceListRequest extends AbstractModel {

    /**
    * Enabling status of instance audit. 1 - enabled; 0 - not enabled.
    */
    @SerializedName("AuditSwitch")
    @Expose
    private Long AuditSwitch;

    /**
    * Filtering conditions for querying the instance list.
    */
    @SerializedName("Filters")
    @Expose
    private AuditInstanceFilters [] Filters;

    /**
    * Instance audit rule mode. 1 - rule-based audit; 0 - full audit.
    */
    @SerializedName("AuditMode")
    @Expose
    private Long AuditMode;

    /**
    * Number of entries returned per request. The default value is 30, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Enabling status of instance audit. 1 - enabled; 0 - not enabled. 
     * @return AuditSwitch Enabling status of instance audit. 1 - enabled; 0 - not enabled.
     */
    public Long getAuditSwitch() {
        return this.AuditSwitch;
    }

    /**
     * Set Enabling status of instance audit. 1 - enabled; 0 - not enabled.
     * @param AuditSwitch Enabling status of instance audit. 1 - enabled; 0 - not enabled.
     */
    public void setAuditSwitch(Long AuditSwitch) {
        this.AuditSwitch = AuditSwitch;
    }

    /**
     * Get Filtering conditions for querying the instance list. 
     * @return Filters Filtering conditions for querying the instance list.
     */
    public AuditInstanceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering conditions for querying the instance list.
     * @param Filters Filtering conditions for querying the instance list.
     */
    public void setFilters(AuditInstanceFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Instance audit rule mode. 1 - rule-based audit; 0 - full audit. 
     * @return AuditMode Instance audit rule mode. 1 - rule-based audit; 0 - full audit.
     */
    public Long getAuditMode() {
        return this.AuditMode;
    }

    /**
     * Set Instance audit rule mode. 1 - rule-based audit; 0 - full audit.
     * @param AuditMode Instance audit rule mode. 1 - rule-based audit; 0 - full audit.
     */
    public void setAuditMode(Long AuditMode) {
        this.AuditMode = AuditMode;
    }

    /**
     * Get Number of entries returned per request. The default value is 30, and the maximum value is 100. 
     * @return Limit Number of entries returned per request. The default value is 30, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries returned per request. The default value is 30, and the maximum value is 100.
     * @param Limit Number of entries returned per request. The default value is 30, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. The default value is 0. 
     * @return Offset Offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0.
     * @param Offset Offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAuditInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditInstanceListRequest(DescribeAuditInstanceListRequest source) {
        if (source.AuditSwitch != null) {
            this.AuditSwitch = new Long(source.AuditSwitch);
        }
        if (source.Filters != null) {
            this.Filters = new AuditInstanceFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AuditInstanceFilters(source.Filters[i]);
            }
        }
        if (source.AuditMode != null) {
            this.AuditMode = new Long(source.AuditMode);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditSwitch", this.AuditSwitch);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "AuditMode", this.AuditMode);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

