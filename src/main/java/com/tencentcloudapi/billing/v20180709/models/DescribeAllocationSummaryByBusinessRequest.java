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

public class DescribeAllocationSummaryByBusinessRequest extends AbstractModel {

    /**
    * Quantity, with the maximum value of 1,000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset. If Offset is 0, it indicates the first page. If Limit is 100, then Offset is 100, and it indicates the second page. If Offset is 200, it indicates the third page, and so on.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Bill month, in the format of 2024-02, which is the current month by default if not provided


    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Statistical period, with the enumerated values as follows:
month - Month
day - Day
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
    * Unique identifier of a billing unit, used for filtering


    */
    @SerializedName("TreeNodeUniqKeys")
    @Expose
    private String [] TreeNodeUniqKeys;

    /**
    * Sorting type, with the enumerated values as follows:
asc - Ascending
desc - Descending
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * Sorting field, with the enumerated values as follows:
GatherCashPayAmount - Collected fees (cash)
GatherVoucherPayAmount - Collected fees (voucher)
GatherIncentivePayAmount - Collected fees (free credit)
GatherTransferPayAmount - Collected fees (royalty amount)
AllocateCashPayAmount - Allocated fees (cash)
AllocateVoucherPayAmount - Allocated fees (voucher)
AllocateIncentivePayAmount - Allocated fees (free credit)
AllocateTransferPayAmount - Allocated fees (royalty amount)
TotalCashPayAmount - Total fees (cash)
TotalVoucherPayAmount - Total fees (voucher)
TotalIncentivePayAmount - Total fees (free credit)
TotalTransferPayAmount - Total fees (royalty amount)
GatherRealCost - Collected fees (discounted total)
AllocateRealCost - Allocated fees (discounted total)
RealTotalCost - Total fees (discounted total)
BusinessCode - Product code
Ratio - Proportion (discounted total)
Trend - Month-on-month ratio (discounted total)
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Date, used for filtering and provided when PeriodType is set to day

    */
    @SerializedName("BillDates")
    @Expose
    private String [] BillDates;

    /**
    * Product code, used for filtering
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * Fuzzy search criteria
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get Quantity, with the maximum value of 1,000 
     * @return Limit Quantity, with the maximum value of 1,000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity, with the maximum value of 1,000
     * @param Limit Quantity, with the maximum value of 1,000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset. If Offset is 0, it indicates the first page. If Limit is 100, then Offset is 100, and it indicates the second page. If Offset is 200, it indicates the third page, and so on. 
     * @return Offset Pagination offset. If Offset is 0, it indicates the first page. If Limit is 100, then Offset is 100, and it indicates the second page. If Offset is 200, it indicates the third page, and so on.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. If Offset is 0, it indicates the first page. If Limit is 100, then Offset is 100, and it indicates the second page. If Offset is 200, it indicates the third page, and so on.
     * @param Offset Pagination offset. If Offset is 0, it indicates the first page. If Limit is 100, then Offset is 100, and it indicates the second page. If Offset is 200, it indicates the third page, and so on.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Bill month, in the format of 2024-02, which is the current month by default if not provided

 
     * @return Month Bill month, in the format of 2024-02, which is the current month by default if not provided


     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month, in the format of 2024-02, which is the current month by default if not provided


     * @param Month Bill month, in the format of 2024-02, which is the current month by default if not provided


     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Statistical period, with the enumerated values as follows:
month - Month
day - Day 
     * @return PeriodType Statistical period, with the enumerated values as follows:
month - Month
day - Day
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set Statistical period, with the enumerated values as follows:
month - Month
day - Day
     * @param PeriodType Statistical period, with the enumerated values as follows:
month - Month
day - Day
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    /**
     * Get Unique identifier of a billing unit, used for filtering

 
     * @return TreeNodeUniqKeys Unique identifier of a billing unit, used for filtering


     */
    public String [] getTreeNodeUniqKeys() {
        return this.TreeNodeUniqKeys;
    }

    /**
     * Set Unique identifier of a billing unit, used for filtering


     * @param TreeNodeUniqKeys Unique identifier of a billing unit, used for filtering


     */
    public void setTreeNodeUniqKeys(String [] TreeNodeUniqKeys) {
        this.TreeNodeUniqKeys = TreeNodeUniqKeys;
    }

    /**
     * Get Sorting type, with the enumerated values as follows:
asc - Ascending
desc - Descending 
     * @return SortType Sorting type, with the enumerated values as follows:
asc - Ascending
desc - Descending
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Sorting type, with the enumerated values as follows:
asc - Ascending
desc - Descending
     * @param SortType Sorting type, with the enumerated values as follows:
asc - Ascending
desc - Descending
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get Sorting field, with the enumerated values as follows:
GatherCashPayAmount - Collected fees (cash)
GatherVoucherPayAmount - Collected fees (voucher)
GatherIncentivePayAmount - Collected fees (free credit)
GatherTransferPayAmount - Collected fees (royalty amount)
AllocateCashPayAmount - Allocated fees (cash)
AllocateVoucherPayAmount - Allocated fees (voucher)
AllocateIncentivePayAmount - Allocated fees (free credit)
AllocateTransferPayAmount - Allocated fees (royalty amount)
TotalCashPayAmount - Total fees (cash)
TotalVoucherPayAmount - Total fees (voucher)
TotalIncentivePayAmount - Total fees (free credit)
TotalTransferPayAmount - Total fees (royalty amount)
GatherRealCost - Collected fees (discounted total)
AllocateRealCost - Allocated fees (discounted total)
RealTotalCost - Total fees (discounted total)
BusinessCode - Product code
Ratio - Proportion (discounted total)
Trend - Month-on-month ratio (discounted total) 
     * @return Sort Sorting field, with the enumerated values as follows:
GatherCashPayAmount - Collected fees (cash)
GatherVoucherPayAmount - Collected fees (voucher)
GatherIncentivePayAmount - Collected fees (free credit)
GatherTransferPayAmount - Collected fees (royalty amount)
AllocateCashPayAmount - Allocated fees (cash)
AllocateVoucherPayAmount - Allocated fees (voucher)
AllocateIncentivePayAmount - Allocated fees (free credit)
AllocateTransferPayAmount - Allocated fees (royalty amount)
TotalCashPayAmount - Total fees (cash)
TotalVoucherPayAmount - Total fees (voucher)
TotalIncentivePayAmount - Total fees (free credit)
TotalTransferPayAmount - Total fees (royalty amount)
GatherRealCost - Collected fees (discounted total)
AllocateRealCost - Allocated fees (discounted total)
RealTotalCost - Total fees (discounted total)
BusinessCode - Product code
Ratio - Proportion (discounted total)
Trend - Month-on-month ratio (discounted total)
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting field, with the enumerated values as follows:
GatherCashPayAmount - Collected fees (cash)
GatherVoucherPayAmount - Collected fees (voucher)
GatherIncentivePayAmount - Collected fees (free credit)
GatherTransferPayAmount - Collected fees (royalty amount)
AllocateCashPayAmount - Allocated fees (cash)
AllocateVoucherPayAmount - Allocated fees (voucher)
AllocateIncentivePayAmount - Allocated fees (free credit)
AllocateTransferPayAmount - Allocated fees (royalty amount)
TotalCashPayAmount - Total fees (cash)
TotalVoucherPayAmount - Total fees (voucher)
TotalIncentivePayAmount - Total fees (free credit)
TotalTransferPayAmount - Total fees (royalty amount)
GatherRealCost - Collected fees (discounted total)
AllocateRealCost - Allocated fees (discounted total)
RealTotalCost - Total fees (discounted total)
BusinessCode - Product code
Ratio - Proportion (discounted total)
Trend - Month-on-month ratio (discounted total)
     * @param Sort Sorting field, with the enumerated values as follows:
GatherCashPayAmount - Collected fees (cash)
GatherVoucherPayAmount - Collected fees (voucher)
GatherIncentivePayAmount - Collected fees (free credit)
GatherTransferPayAmount - Collected fees (royalty amount)
AllocateCashPayAmount - Allocated fees (cash)
AllocateVoucherPayAmount - Allocated fees (voucher)
AllocateIncentivePayAmount - Allocated fees (free credit)
AllocateTransferPayAmount - Allocated fees (royalty amount)
TotalCashPayAmount - Total fees (cash)
TotalVoucherPayAmount - Total fees (voucher)
TotalIncentivePayAmount - Total fees (free credit)
TotalTransferPayAmount - Total fees (royalty amount)
GatherRealCost - Collected fees (discounted total)
AllocateRealCost - Allocated fees (discounted total)
RealTotalCost - Total fees (discounted total)
BusinessCode - Product code
Ratio - Proportion (discounted total)
Trend - Month-on-month ratio (discounted total)
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Date, used for filtering and provided when PeriodType is set to day
 
     * @return BillDates Date, used for filtering and provided when PeriodType is set to day

     */
    public String [] getBillDates() {
        return this.BillDates;
    }

    /**
     * Set Date, used for filtering and provided when PeriodType is set to day

     * @param BillDates Date, used for filtering and provided when PeriodType is set to day

     */
    public void setBillDates(String [] BillDates) {
        this.BillDates = BillDates;
    }

    /**
     * Get Product code, used for filtering 
     * @return BusinessCodes Product code, used for filtering
     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set Product code, used for filtering
     * @param BusinessCodes Product code, used for filtering
     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get Fuzzy search criteria 
     * @return SearchKey Fuzzy search criteria
     * @deprecated
     */
    @Deprecated
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Fuzzy search criteria
     * @param SearchKey Fuzzy search criteria
     * @deprecated
     */
    @Deprecated
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeAllocationSummaryByBusinessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationSummaryByBusinessRequest(DescribeAllocationSummaryByBusinessRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
        if (source.TreeNodeUniqKeys != null) {
            this.TreeNodeUniqKeys = new String[source.TreeNodeUniqKeys.length];
            for (int i = 0; i < source.TreeNodeUniqKeys.length; i++) {
                this.TreeNodeUniqKeys[i] = new String(source.TreeNodeUniqKeys[i]);
            }
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.BillDates != null) {
            this.BillDates = new String[source.BillDates.length];
            for (int i = 0; i < source.BillDates.length; i++) {
                this.BillDates[i] = new String(source.BillDates[i]);
            }
        }
        if (source.BusinessCodes != null) {
            this.BusinessCodes = new String[source.BusinessCodes.length];
            for (int i = 0; i < source.BusinessCodes.length; i++) {
                this.BusinessCodes[i] = new String(source.BusinessCodes[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);
        this.setParamArraySimple(map, prefix + "TreeNodeUniqKeys.", this.TreeNodeUniqKeys);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamArraySimple(map, prefix + "BillDates.", this.BillDates);
        this.setParamArraySimple(map, prefix + "BusinessCodes.", this.BusinessCodes);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

