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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntlDomainBatchDetailsRequest extends AbstractModel {

    /**
    * The log ID.
    */
    @SerializedName("LogId")
    @Expose
    private Long LogId;

    /**
    * The offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The sort key. Valid values: `Domain`, `UpdateOn`, `Status`
    */
    @SerializedName("OrderByKey")
    @Expose
    private String OrderByKey;

    /**
    * Valid values: `0` (ascending), `1` (descending).
    */
    @SerializedName("OrderBy")
    @Expose
    private Long OrderBy;

    /**
     * Get The log ID. 
     * @return LogId The log ID.
     */
    public Long getLogId() {
        return this.LogId;
    }

    /**
     * Set The log ID.
     * @param LogId The log ID.
     */
    public void setLogId(Long LogId) {
        this.LogId = LogId;
    }

    /**
     * Get The offset. Default value: 0 
     * @return Offset The offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default value: 0
     * @param Offset The offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit The number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit The number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The sort key. Valid values: `Domain`, `UpdateOn`, `Status` 
     * @return OrderByKey The sort key. Valid values: `Domain`, `UpdateOn`, `Status`
     */
    public String getOrderByKey() {
        return this.OrderByKey;
    }

    /**
     * Set The sort key. Valid values: `Domain`, `UpdateOn`, `Status`
     * @param OrderByKey The sort key. Valid values: `Domain`, `UpdateOn`, `Status`
     */
    public void setOrderByKey(String OrderByKey) {
        this.OrderByKey = OrderByKey;
    }

    /**
     * Get Valid values: `0` (ascending), `1` (descending). 
     * @return OrderBy Valid values: `0` (ascending), `1` (descending).
     */
    public Long getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Valid values: `0` (ascending), `1` (descending).
     * @param OrderBy Valid values: `0` (ascending), `1` (descending).
     */
    public void setOrderBy(Long OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeIntlDomainBatchDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntlDomainBatchDetailsRequest(DescribeIntlDomainBatchDetailsRequest source) {
        if (source.LogId != null) {
            this.LogId = new Long(source.LogId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderByKey != null) {
            this.OrderByKey = new String(source.OrderByKey);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new Long(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderByKey", this.OrderByKey);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

