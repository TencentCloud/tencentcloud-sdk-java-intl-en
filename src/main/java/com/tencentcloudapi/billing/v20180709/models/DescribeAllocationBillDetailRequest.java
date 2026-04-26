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

public class DescribeAllocationBillDetailRequest extends AbstractModel {

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
    * Unique identifier of a billing unit, used for filtering
    */
    @SerializedName("TreeNodeUniqKeys")
    @Expose
    private String [] TreeNodeUniqKeys;

    /**
    * Sorting field, with the enumerated values as follows:
RiTimeSpan - Deduction duration of a reserved instance
ExtendPayAmount1 - Original price for the deduction duration of a reserved instance
RealCost - Discounted total
CashPayAmount - Cash amount
VoucherPayAmount - Amount of promo voucher
IncentivePayAmount - Amount of free credit
TransferPayAmount - Royalty amount
Cost - Original price of a component
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Sorting type, with the enumerated values as follows:
asc - Ascending
desc - Descending
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * Product code, used for filtering
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * User UIN, used for filtering
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * Operator UIN, used for filtering
    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * Billing mode code, used for filtering
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * Transaction type code, used for filtering
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * Subproduct code, used for filtering
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * Region ID, used for filtering
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
    * AZ ID, used for filtering
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Instance type code, used for filtering
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Tag, used for filtering
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * Component type code, used for filtering
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * Component name code, used for filtering
    */
    @SerializedName("ItemCodes")
    @Expose
    private String [] ItemCodes;

    /**
    * Fuzzy search: supports tag, resource ID, and resource alias.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Project ID, used for filtering
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

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
     * Get Sorting field, with the enumerated values as follows:
RiTimeSpan - Deduction duration of a reserved instance
ExtendPayAmount1 - Original price for the deduction duration of a reserved instance
RealCost - Discounted total
CashPayAmount - Cash amount
VoucherPayAmount - Amount of promo voucher
IncentivePayAmount - Amount of free credit
TransferPayAmount - Royalty amount
Cost - Original price of a component 
     * @return Sort Sorting field, with the enumerated values as follows:
RiTimeSpan - Deduction duration of a reserved instance
ExtendPayAmount1 - Original price for the deduction duration of a reserved instance
RealCost - Discounted total
CashPayAmount - Cash amount
VoucherPayAmount - Amount of promo voucher
IncentivePayAmount - Amount of free credit
TransferPayAmount - Royalty amount
Cost - Original price of a component
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting field, with the enumerated values as follows:
RiTimeSpan - Deduction duration of a reserved instance
ExtendPayAmount1 - Original price for the deduction duration of a reserved instance
RealCost - Discounted total
CashPayAmount - Cash amount
VoucherPayAmount - Amount of promo voucher
IncentivePayAmount - Amount of free credit
TransferPayAmount - Royalty amount
Cost - Original price of a component
     * @param Sort Sorting field, with the enumerated values as follows:
RiTimeSpan - Deduction duration of a reserved instance
ExtendPayAmount1 - Original price for the deduction duration of a reserved instance
RealCost - Discounted total
CashPayAmount - Cash amount
VoucherPayAmount - Amount of promo voucher
IncentivePayAmount - Amount of free credit
TransferPayAmount - Royalty amount
Cost - Original price of a component
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
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
     * Get User UIN, used for filtering 
     * @return OwnerUins User UIN, used for filtering
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set User UIN, used for filtering
     * @param OwnerUins User UIN, used for filtering
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get Operator UIN, used for filtering 
     * @return OperateUins Operator UIN, used for filtering
     */
    public String [] getOperateUins() {
        return this.OperateUins;
    }

    /**
     * Set Operator UIN, used for filtering
     * @param OperateUins Operator UIN, used for filtering
     */
    public void setOperateUins(String [] OperateUins) {
        this.OperateUins = OperateUins;
    }

    /**
     * Get Billing mode code, used for filtering 
     * @return PayModes Billing mode code, used for filtering
     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set Billing mode code, used for filtering
     * @param PayModes Billing mode code, used for filtering
     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get Transaction type code, used for filtering 
     * @return ActionTypes Transaction type code, used for filtering
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set Transaction type code, used for filtering
     * @param ActionTypes Transaction type code, used for filtering
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get Subproduct code, used for filtering 
     * @return ProductCodes Subproduct code, used for filtering
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set Subproduct code, used for filtering
     * @param ProductCodes Subproduct code, used for filtering
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get Region ID, used for filtering 
     * @return RegionIds Region ID, used for filtering
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set Region ID, used for filtering
     * @param RegionIds Region ID, used for filtering
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get AZ ID, used for filtering 
     * @return ZoneIds AZ ID, used for filtering
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set AZ ID, used for filtering
     * @param ZoneIds AZ ID, used for filtering
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Instance type code, used for filtering 
     * @return InstanceTypes Instance type code, used for filtering
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set Instance type code, used for filtering
     * @param InstanceTypes Instance type code, used for filtering
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get Tag, used for filtering 
     * @return Tag Tag, used for filtering
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag, used for filtering
     * @param Tag Tag, used for filtering
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Component type code, used for filtering 
     * @return ComponentCodes Component type code, used for filtering
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set Component type code, used for filtering
     * @param ComponentCodes Component type code, used for filtering
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get Component name code, used for filtering 
     * @return ItemCodes Component name code, used for filtering
     */
    public String [] getItemCodes() {
        return this.ItemCodes;
    }

    /**
     * Set Component name code, used for filtering
     * @param ItemCodes Component name code, used for filtering
     */
    public void setItemCodes(String [] ItemCodes) {
        this.ItemCodes = ItemCodes;
    }

    /**
     * Get Fuzzy search: supports tag, resource ID, and resource alias. 
     * @return SearchKey Fuzzy search: supports tag, resource ID, and resource alias.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Fuzzy search: supports tag, resource ID, and resource alias.
     * @param SearchKey Fuzzy search: supports tag, resource ID, and resource alias.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Project ID, used for filtering 
     * @return ProjectIds Project ID, used for filtering
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID, used for filtering
     * @param ProjectIds Project ID, used for filtering
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    public DescribeAllocationBillDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationBillDetailRequest(DescribeAllocationBillDetailRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TreeNodeUniqKeys != null) {
            this.TreeNodeUniqKeys = new String[source.TreeNodeUniqKeys.length];
            for (int i = 0; i < source.TreeNodeUniqKeys.length; i++) {
                this.TreeNodeUniqKeys[i] = new String(source.TreeNodeUniqKeys[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.BusinessCodes != null) {
            this.BusinessCodes = new String[source.BusinessCodes.length];
            for (int i = 0; i < source.BusinessCodes.length; i++) {
                this.BusinessCodes[i] = new String(source.BusinessCodes[i]);
            }
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String[source.OwnerUins.length];
            for (int i = 0; i < source.OwnerUins.length; i++) {
                this.OwnerUins[i] = new String(source.OwnerUins[i]);
            }
        }
        if (source.OperateUins != null) {
            this.OperateUins = new String[source.OperateUins.length];
            for (int i = 0; i < source.OperateUins.length; i++) {
                this.OperateUins[i] = new String(source.OperateUins[i]);
            }
        }
        if (source.PayModes != null) {
            this.PayModes = new String[source.PayModes.length];
            for (int i = 0; i < source.PayModes.length; i++) {
                this.PayModes[i] = new String(source.PayModes[i]);
            }
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String[source.ActionTypes.length];
            for (int i = 0; i < source.ActionTypes.length; i++) {
                this.ActionTypes[i] = new String(source.ActionTypes[i]);
            }
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new String[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new String(source.RegionIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.ComponentCodes != null) {
            this.ComponentCodes = new String[source.ComponentCodes.length];
            for (int i = 0; i < source.ComponentCodes.length; i++) {
                this.ComponentCodes[i] = new String(source.ComponentCodes[i]);
            }
        }
        if (source.ItemCodes != null) {
            this.ItemCodes = new String[source.ItemCodes.length];
            for (int i = 0; i < source.ItemCodes.length; i++) {
                this.ItemCodes[i] = new String(source.ItemCodes[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamArraySimple(map, prefix + "TreeNodeUniqKeys.", this.TreeNodeUniqKeys);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamArraySimple(map, prefix + "BusinessCodes.", this.BusinessCodes);
        this.setParamArraySimple(map, prefix + "OwnerUins.", this.OwnerUins);
        this.setParamArraySimple(map, prefix + "OperateUins.", this.OperateUins);
        this.setParamArraySimple(map, prefix + "PayModes.", this.PayModes);
        this.setParamArraySimple(map, prefix + "ActionTypes.", this.ActionTypes);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamArraySimple(map, prefix + "ComponentCodes.", this.ComponentCodes);
        this.setParamArraySimple(map, prefix + "ItemCodes.", this.ItemCodes);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);

    }
}

