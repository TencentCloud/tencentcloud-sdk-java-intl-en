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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeColumnsMetaRequest extends AbstractModel {

    /**
    * Table ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Page Number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page Size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Filter
    */
    @SerializedName("FilterSet")
    @Expose
    private Filter [] FilterSet;

    /**
    * Sort Fields
    */
    @SerializedName("OrderFieldSet")
    @Expose
    private OrderField [] OrderFieldSet;

    /**
    * Whether to Query Partition Field, Default false
    */
    @SerializedName("IsPartitionQuery")
    @Expose
    private Boolean IsPartitionQuery;

    /**
    * Compliance Group ID
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
     * Get Table ID 
     * @return TableId Table ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table ID
     * @param TableId Table ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Page Number 
     * @return PageNumber Page Number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page Number
     * @param PageNumber Page Number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page Size 
     * @return PageSize Page Size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page Size
     * @param PageSize Page Size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Filter 
     * @return FilterSet Filter
     */
    public Filter [] getFilterSet() {
        return this.FilterSet;
    }

    /**
     * Set Filter
     * @param FilterSet Filter
     */
    public void setFilterSet(Filter [] FilterSet) {
        this.FilterSet = FilterSet;
    }

    /**
     * Get Sort Fields 
     * @return OrderFieldSet Sort Fields
     */
    public OrderField [] getOrderFieldSet() {
        return this.OrderFieldSet;
    }

    /**
     * Set Sort Fields
     * @param OrderFieldSet Sort Fields
     */
    public void setOrderFieldSet(OrderField [] OrderFieldSet) {
        this.OrderFieldSet = OrderFieldSet;
    }

    /**
     * Get Whether to Query Partition Field, Default false 
     * @return IsPartitionQuery Whether to Query Partition Field, Default false
     */
    public Boolean getIsPartitionQuery() {
        return this.IsPartitionQuery;
    }

    /**
     * Set Whether to Query Partition Field, Default false
     * @param IsPartitionQuery Whether to Query Partition Field, Default false
     */
    public void setIsPartitionQuery(Boolean IsPartitionQuery) {
        this.IsPartitionQuery = IsPartitionQuery;
    }

    /**
     * Get Compliance Group ID 
     * @return ComplianceId Compliance Group ID
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set Compliance Group ID
     * @param ComplianceId Compliance Group ID
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    public DescribeColumnsMetaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeColumnsMetaRequest(DescribeColumnsMetaRequest source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FilterSet != null) {
            this.FilterSet = new Filter[source.FilterSet.length];
            for (int i = 0; i < source.FilterSet.length; i++) {
                this.FilterSet[i] = new Filter(source.FilterSet[i]);
            }
        }
        if (source.OrderFieldSet != null) {
            this.OrderFieldSet = new OrderField[source.OrderFieldSet.length];
            for (int i = 0; i < source.OrderFieldSet.length; i++) {
                this.OrderFieldSet[i] = new OrderField(source.OrderFieldSet[i]);
            }
        }
        if (source.IsPartitionQuery != null) {
            this.IsPartitionQuery = new Boolean(source.IsPartitionQuery);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "FilterSet.", this.FilterSet);
        this.setParamArrayObj(map, prefix + "OrderFieldSet.", this.OrderFieldSet);
        this.setParamSimple(map, prefix + "IsPartitionQuery", this.IsPartitionQuery);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);

    }
}

