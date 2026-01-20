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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditInstanceListRequest extends AbstractModel {

    /**
    * Whether audit is enabled for the instance. Valid values: 1 - Enabled; 0 - Disabled.
    */
    @SerializedName("AuditSwitch")
    @Expose
    private Long AuditSwitch;

    /**
    * Filter conditions for querying the instance list.
    */
    @SerializedName("Filters")
    @Expose
    private AuditInstanceFilters [] Filters;

    /**
    * Audit rule mode for the instance. Valid values: 1 - Rule-based audit; 0 - Full audit.
    */
    @SerializedName("AuditMode")
    @Expose
    private Long AuditMode;

    /**
    * Number of entries to return per request. Default value: 30. Maximum value: 20000.
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
     * Get Whether audit is enabled for the instance. Valid values: 1 - Enabled; 0 - Disabled. 
     * @return AuditSwitch Whether audit is enabled for the instance. Valid values: 1 - Enabled; 0 - Disabled.
     */
    public Long getAuditSwitch() {
        return this.AuditSwitch;
    }

    /**
     * Set Whether audit is enabled for the instance. Valid values: 1 - Enabled; 0 - Disabled.
     * @param AuditSwitch Whether audit is enabled for the instance. Valid values: 1 - Enabled; 0 - Disabled.
     */
    public void setAuditSwitch(Long AuditSwitch) {
        this.AuditSwitch = AuditSwitch;
    }

    /**
     * Get Filter conditions for querying the instance list. 
     * @return Filters Filter conditions for querying the instance list.
     */
    public AuditInstanceFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions for querying the instance list.
     * @param Filters Filter conditions for querying the instance list.
     */
    public void setFilters(AuditInstanceFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Audit rule mode for the instance. Valid values: 1 - Rule-based audit; 0 - Full audit. 
     * @return AuditMode Audit rule mode for the instance. Valid values: 1 - Rule-based audit; 0 - Full audit.
     */
    public Long getAuditMode() {
        return this.AuditMode;
    }

    /**
     * Set Audit rule mode for the instance. Valid values: 1 - Rule-based audit; 0 - Full audit.
     * @param AuditMode Audit rule mode for the instance. Valid values: 1 - Rule-based audit; 0 - Full audit.
     */
    public void setAuditMode(Long AuditMode) {
        this.AuditMode = AuditMode;
    }

    /**
     * Get Number of entries to return per request. Default value: 30. Maximum value: 20000. 
     * @return Limit Number of entries to return per request. Default value: 30. Maximum value: 20000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to return per request. Default value: 30. Maximum value: 20000.
     * @param Limit Number of entries to return per request. Default value: 30. Maximum value: 20000.
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

