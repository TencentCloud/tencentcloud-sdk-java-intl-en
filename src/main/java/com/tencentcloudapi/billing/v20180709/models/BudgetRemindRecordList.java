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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetRemindRecordList extends AbstractModel {

    /**
    * Optimize COUNT SQL automatically if encounter unresolved jSqlParser case, set the parameter to false
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OptimizeCountSql")
    @Expose
    private Boolean OptimizeCountSql;

    /**
    * Pagination
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * Sorting field information. When allowing frontend input, be aware of SQL injection issue. Use SqlInjectionUtils.check(...) to check the text.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Orders")
    @Expose
    private OrderDto [] Orders;

    /**
    * The statementId for a custom count query in xml can also be set without specifying it. Just add _mpCount after the pagination statementId. For example, for the pagination selectPageById, set the count query statementId to selectPageById_mpCount. The SQL execution can then be found by default.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CountId")
    @Expose
    private String CountId;

    /**
    * Pagination size.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * total amount
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of items per page limit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxLimit")
    @Expose
    private String MaxLimit;

    /**
    * Querying the data list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Records")
    @Expose
    private BudgetRemindRecords [] Records;

    /**
    * Current Page
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
    * Whether to perform a count query. If you only want to query the list and do not query the total record count, set the parameter to false.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SearchCount")
    @Expose
    private Boolean SearchCount;

    /**
     * Get Optimize COUNT SQL automatically if encounter unresolved jSqlParser case, set the parameter to false
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OptimizeCountSql Optimize COUNT SQL automatically if encounter unresolved jSqlParser case, set the parameter to false
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getOptimizeCountSql() {
        return this.OptimizeCountSql;
    }

    /**
     * Set Optimize COUNT SQL automatically if encounter unresolved jSqlParser case, set the parameter to false
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OptimizeCountSql Optimize COUNT SQL automatically if encounter unresolved jSqlParser case, set the parameter to false
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOptimizeCountSql(Boolean OptimizeCountSql) {
        this.OptimizeCountSql = OptimizeCountSql;
    }

    /**
     * Get Pagination
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pages Pagination
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set Pagination
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pages Pagination
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get Sorting field information. When allowing frontend input, be aware of SQL injection issue. Use SqlInjectionUtils.check(...) to check the text.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Orders Sorting field information. When allowing frontend input, be aware of SQL injection issue. Use SqlInjectionUtils.check(...) to check the text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OrderDto [] getOrders() {
        return this.Orders;
    }

    /**
     * Set Sorting field information. When allowing frontend input, be aware of SQL injection issue. Use SqlInjectionUtils.check(...) to check the text.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Orders Sorting field information. When allowing frontend input, be aware of SQL injection issue. Use SqlInjectionUtils.check(...) to check the text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrders(OrderDto [] Orders) {
        this.Orders = Orders;
    }

    /**
     * Get The statementId for a custom count query in xml can also be set without specifying it. Just add _mpCount after the pagination statementId. For example, for the pagination selectPageById, set the count query statementId to selectPageById_mpCount. The SQL execution can then be found by default.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CountId The statementId for a custom count query in xml can also be set without specifying it. Just add _mpCount after the pagination statementId. For example, for the pagination selectPageById, set the count query statementId to selectPageById_mpCount. The SQL execution can then be found by default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCountId() {
        return this.CountId;
    }

    /**
     * Set The statementId for a custom count query in xml can also be set without specifying it. Just add _mpCount after the pagination statementId. For example, for the pagination selectPageById, set the count query statementId to selectPageById_mpCount. The SQL execution can then be found by default.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CountId The statementId for a custom count query in xml can also be set without specifying it. Just add _mpCount after the pagination statementId. For example, for the pagination selectPageById, set the count query statementId to selectPageById_mpCount. The SQL execution can then be found by default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCountId(String CountId) {
        this.CountId = CountId;
    }

    /**
     * Get Pagination size.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Size Pagination size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Pagination size.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Size Pagination size.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get total amount
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total total amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set total amount
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total total amount
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of items per page limit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxLimit Number of items per page limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMaxLimit() {
        return this.MaxLimit;
    }

    /**
     * Set Number of items per page limit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxLimit Number of items per page limit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxLimit(String MaxLimit) {
        this.MaxLimit = MaxLimit;
    }

    /**
     * Get Querying the data list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Records Querying the data list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BudgetRemindRecords [] getRecords() {
        return this.Records;
    }

    /**
     * Set Querying the data list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Records Querying the data list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecords(BudgetRemindRecords [] Records) {
        this.Records = Records;
    }

    /**
     * Get Current Page
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Current Current Page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set Current Page
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Current Current Page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    /**
     * Get Whether to perform a count query. If you only want to query the list and do not query the total record count, set the parameter to false.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SearchCount Whether to perform a count query. If you only want to query the list and do not query the total record count, set the parameter to false.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSearchCount() {
        return this.SearchCount;
    }

    /**
     * Set Whether to perform a count query. If you only want to query the list and do not query the total record count, set the parameter to false.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SearchCount Whether to perform a count query. If you only want to query the list and do not query the total record count, set the parameter to false.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSearchCount(Boolean SearchCount) {
        this.SearchCount = SearchCount;
    }

    public BudgetRemindRecordList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetRemindRecordList(BudgetRemindRecordList source) {
        if (source.OptimizeCountSql != null) {
            this.OptimizeCountSql = new Boolean(source.OptimizeCountSql);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.Orders != null) {
            this.Orders = new OrderDto[source.Orders.length];
            for (int i = 0; i < source.Orders.length; i++) {
                this.Orders[i] = new OrderDto(source.Orders[i]);
            }
        }
        if (source.CountId != null) {
            this.CountId = new String(source.CountId);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.MaxLimit != null) {
            this.MaxLimit = new String(source.MaxLimit);
        }
        if (source.Records != null) {
            this.Records = new BudgetRemindRecords[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new BudgetRemindRecords(source.Records[i]);
            }
        }
        if (source.Current != null) {
            this.Current = new Long(source.Current);
        }
        if (source.SearchCount != null) {
            this.SearchCount = new Boolean(source.SearchCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OptimizeCountSql", this.OptimizeCountSql);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamArrayObj(map, prefix + "Orders.", this.Orders);
        this.setParamSimple(map, prefix + "CountId", this.CountId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "MaxLimit", this.MaxLimit);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "Current", this.Current);
        this.setParamSimple(map, prefix + "SearchCount", this.SearchCount);

    }
}

