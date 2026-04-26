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

public class DescribeAllocationBillConditionsRequest extends AbstractModel {

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
    * Date
    */
    @SerializedName("BillDates")
    @Expose
    private String [] BillDates;

    /**
    * Product code
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * User UIN
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * Operator UIN
    */
    @SerializedName("OperateUins")
    @Expose
    private String [] OperateUins;

    /**
    * Billing mode code
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * Transaction type code
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * Subproduct code
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * Region ID
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
    * AZ ID
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Instance type code
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Tag
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * Component type code
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * Component name code
    */
    @SerializedName("ItemCodes")
    @Expose
    private String [] ItemCodes;

    /**
    * Fuzzy search criteria
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Project ID
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Cost collection type
    */
    @SerializedName("AllocationType")
    @Expose
    private Long [] AllocationType;

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
     * Get Date 
     * @return BillDates Date
     */
    public String [] getBillDates() {
        return this.BillDates;
    }

    /**
     * Set Date
     * @param BillDates Date
     */
    public void setBillDates(String [] BillDates) {
        this.BillDates = BillDates;
    }

    /**
     * Get Product code 
     * @return BusinessCodes Product code
     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set Product code
     * @param BusinessCodes Product code
     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get User UIN 
     * @return OwnerUins User UIN
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set User UIN
     * @param OwnerUins User UIN
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get Operator UIN 
     * @return OperateUins Operator UIN
     */
    public String [] getOperateUins() {
        return this.OperateUins;
    }

    /**
     * Set Operator UIN
     * @param OperateUins Operator UIN
     */
    public void setOperateUins(String [] OperateUins) {
        this.OperateUins = OperateUins;
    }

    /**
     * Get Billing mode code 
     * @return PayModes Billing mode code
     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set Billing mode code
     * @param PayModes Billing mode code
     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get Transaction type code 
     * @return ActionTypes Transaction type code
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set Transaction type code
     * @param ActionTypes Transaction type code
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get Subproduct code 
     * @return ProductCodes Subproduct code
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set Subproduct code
     * @param ProductCodes Subproduct code
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get Region ID 
     * @return RegionIds Region ID
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set Region ID
     * @param RegionIds Region ID
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get AZ ID 
     * @return ZoneIds AZ ID
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set AZ ID
     * @param ZoneIds AZ ID
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Instance type code 
     * @return InstanceTypes Instance type code
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set Instance type code
     * @param InstanceTypes Instance type code
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get Tag 
     * @return Tag Tag
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag
     * @param Tag Tag
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Component type code 
     * @return ComponentCodes Component type code
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set Component type code
     * @param ComponentCodes Component type code
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get Component name code 
     * @return ItemCodes Component name code
     */
    public String [] getItemCodes() {
        return this.ItemCodes;
    }

    /**
     * Set Component name code
     * @param ItemCodes Component name code
     */
    public void setItemCodes(String [] ItemCodes) {
        this.ItemCodes = ItemCodes;
    }

    /**
     * Get Fuzzy search criteria 
     * @return SearchKey Fuzzy search criteria
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Fuzzy search criteria
     * @param SearchKey Fuzzy search criteria
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Project ID 
     * @return ProjectIds Project ID
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID
     * @param ProjectIds Project ID
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Cost collection type 
     * @return AllocationType Cost collection type
     */
    public Long [] getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set Cost collection type
     * @param AllocationType Cost collection type
     */
    public void setAllocationType(Long [] AllocationType) {
        this.AllocationType = AllocationType;
    }

    public DescribeAllocationBillConditionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationBillConditionsRequest(DescribeAllocationBillConditionsRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TreeNodeUniqKeys != null) {
            this.TreeNodeUniqKeys = new String[source.TreeNodeUniqKeys.length];
            for (int i = 0; i < source.TreeNodeUniqKeys.length; i++) {
                this.TreeNodeUniqKeys[i] = new String(source.TreeNodeUniqKeys[i]);
            }
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
        if (source.AllocationType != null) {
            this.AllocationType = new Long[source.AllocationType.length];
            for (int i = 0; i < source.AllocationType.length; i++) {
                this.AllocationType[i] = new Long(source.AllocationType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamArraySimple(map, prefix + "TreeNodeUniqKeys.", this.TreeNodeUniqKeys);
        this.setParamArraySimple(map, prefix + "BillDates.", this.BillDates);
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
        this.setParamArraySimple(map, prefix + "AllocationType.", this.AllocationType);

    }
}

