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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHBaseTableOverviewRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Pagination query number offset, starting from 0.	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page size for pagination query. The minimum value is 1, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Table name, supporting fuzzy matching
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Field for sorting, with a default value
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * asc: Ascending; desc: Descending (default)
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Pagination query number offset, starting from 0.	 
     * @return Offset Pagination query number offset, starting from 0.	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination query number offset, starting from 0.	
     * @param Offset Pagination query number offset, starting from 0.	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page size for pagination query. The minimum value is 1, and the maximum value is 100. 
     * @return Limit Page size for pagination query. The minimum value is 1, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size for pagination query. The minimum value is 1, and the maximum value is 100.
     * @param Limit Page size for pagination query. The minimum value is 1, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Table name, supporting fuzzy matching 
     * @return Table Table name, supporting fuzzy matching
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Table name, supporting fuzzy matching
     * @param Table Table name, supporting fuzzy matching
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Field for sorting, with a default value 
     * @return OrderField Field for sorting, with a default value
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Field for sorting, with a default value
     * @param OrderField Field for sorting, with a default value
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get asc: Ascending; desc: Descending (default) 
     * @return OrderType asc: Ascending; desc: Descending (default)
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set asc: Ascending; desc: Descending (default)
     * @param OrderType asc: Ascending; desc: Descending (default)
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public DescribeHBaseTableOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHBaseTableOverviewRequest(DescribeHBaseTableOverviewRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

