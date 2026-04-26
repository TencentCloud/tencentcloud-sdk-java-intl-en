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

public class DescribeGatherResourceRequest extends AbstractModel {

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
    * Bill month, in the format of 2024-02, which is the current month by default if not provided.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Unique identifier of a billing unit, used for filtering
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * Resource directory category, with the enumerated values as follows:
all - All 
none - Not collected
    */
    @SerializedName("GatherType")
    @Expose
    private String GatherType;

    /**
    * Sorting field, with the enumerated values as follows:
realCost - Discounted total
cashPayAmount - Cash amount
voucherPayAmount - Amount of promo voucher
incentivePayAmount - Amount of free credit
transferPayAmount - Royalty amount
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
    * Subproduct code, used for filtering
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * Component name code, used for filtering
    */
    @SerializedName("ItemCodes")
    @Expose
    private String [] ItemCodes;

    /**
    * Region ID, used for filtering
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * Instance type code, used for filtering
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Billing mode code, used for filtering
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * Operator UIN, used for filtering
    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * User UIN, used for filtering
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * Fuzzy search: supports tag, resource ID, and resource alias.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Tag, used for filtering
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * Project ID, used for filtering
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * Transaction type code, used for filtering
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

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
     * Get Bill month, in the format of 2024-02, which is the current month by default if not provided. 
     * @return Month Bill month, in the format of 2024-02, which is the current month by default if not provided.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month, in the format of 2024-02, which is the current month by default if not provided.
     * @param Month Bill month, in the format of 2024-02, which is the current month by default if not provided.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Unique identifier of a billing unit, used for filtering 
     * @return TreeNodeUniqKey Unique identifier of a billing unit, used for filtering
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set Unique identifier of a billing unit, used for filtering
     * @param TreeNodeUniqKey Unique identifier of a billing unit, used for filtering
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get Resource directory category, with the enumerated values as follows:
all - All 
none - Not collected 
     * @return GatherType Resource directory category, with the enumerated values as follows:
all - All 
none - Not collected
     */
    public String getGatherType() {
        return this.GatherType;
    }

    /**
     * Set Resource directory category, with the enumerated values as follows:
all - All 
none - Not collected
     * @param GatherType Resource directory category, with the enumerated values as follows:
all - All 
none - Not collected
     */
    public void setGatherType(String GatherType) {
        this.GatherType = GatherType;
    }

    /**
     * Get Sorting field, with the enumerated values as follows:
realCost - Discounted total
cashPayAmount - Cash amount
voucherPayAmount - Amount of promo voucher
incentivePayAmount - Amount of free credit
transferPayAmount - Royalty amount 
     * @return Sort Sorting field, with the enumerated values as follows:
realCost - Discounted total
cashPayAmount - Cash amount
voucherPayAmount - Amount of promo voucher
incentivePayAmount - Amount of free credit
transferPayAmount - Royalty amount
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting field, with the enumerated values as follows:
realCost - Discounted total
cashPayAmount - Cash amount
voucherPayAmount - Amount of promo voucher
incentivePayAmount - Amount of free credit
transferPayAmount - Royalty amount
     * @param Sort Sorting field, with the enumerated values as follows:
realCost - Discounted total
cashPayAmount - Cash amount
voucherPayAmount - Amount of promo voucher
incentivePayAmount - Amount of free credit
transferPayAmount - Royalty amount
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
     * Get Region ID, used for filtering 
     * @return RegionIds Region ID, used for filtering
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set Region ID, used for filtering
     * @param RegionIds Region ID, used for filtering
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
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
     * Get Project ID, used for filtering 
     * @return ProjectIds Project ID, used for filtering
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID, used for filtering
     * @param ProjectIds Project ID, used for filtering
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
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

    public DescribeGatherResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatherResourceRequest(DescribeGatherResourceRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.GatherType != null) {
            this.GatherType = new String(source.GatherType);
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
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
        if (source.ItemCodes != null) {
            this.ItemCodes = new String[source.ItemCodes.length];
            for (int i = 0; i < source.ItemCodes.length; i++) {
                this.ItemCodes[i] = new String(source.ItemCodes[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.PayModes != null) {
            this.PayModes = new String[source.PayModes.length];
            for (int i = 0; i < source.PayModes.length; i++) {
                this.PayModes[i] = new String(source.PayModes[i]);
            }
        }
        if (source.OperateUins != null) {
            this.OperateUins = new String[source.OperateUins.length];
            for (int i = 0; i < source.OperateUins.length; i++) {
                this.OperateUins[i] = new String(source.OperateUins[i]);
            }
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String[source.OwnerUins.length];
            for (int i = 0; i < source.OwnerUins.length; i++) {
                this.OwnerUins[i] = new String(source.OwnerUins[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String[source.ActionTypes.length];
            for (int i = 0; i < source.ActionTypes.length; i++) {
                this.ActionTypes[i] = new String(source.ActionTypes[i]);
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
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "GatherType", this.GatherType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamArraySimple(map, prefix + "BusinessCodes.", this.BusinessCodes);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);
        this.setParamArraySimple(map, prefix + "ItemCodes.", this.ItemCodes);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArraySimple(map, prefix + "PayModes.", this.PayModes);
        this.setParamArraySimple(map, prefix + "OperateUins.", this.OperateUins);
        this.setParamArraySimple(map, prefix + "OwnerUins.", this.OwnerUins);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ActionTypes.", this.ActionTypes);

    }
}

