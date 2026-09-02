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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaselineItemRiskListRequest extends AbstractModel {

    /**
    * <p>Baseline policy ID list.</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long [] PolicyID;

    /**
    * <p>Baseline system parent category ID.</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>Baseline detection item ID.</p>
    */
    @SerializedName("ItemID")
    @Expose
    private Long ItemID;

    /**
    * <p>List of asset types to detect. Element value is HOST or CLUSTER.</p>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String [] CheckAssetType;

    /**
    * <p>Baseline subcategory ID.</p>
    */
    @SerializedName("CategoryID")
    @Expose
    private Long CategoryID;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status, Values: PASS/NOT_PASS), AssetName (asset name/ID, fuzzy search), IP (IP address, fuzzy search), Tag (asset tag, fuzzy search).</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Starting offset amount for paging query. It starts from 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sort field name, an optional field defined by the specific API.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Baseline policy ID list.</p> 
     * @return PolicyID <p>Baseline policy ID list.</p>
     */
    public Long [] getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>Baseline policy ID list.</p>
     * @param PolicyID <p>Baseline policy ID list.</p>
     */
    public void setPolicyID(Long [] PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>Baseline system parent category ID.</p> 
     * @return ParentCategoryID <p>Baseline system parent category ID.</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>Baseline system parent category ID.</p>
     * @param ParentCategoryID <p>Baseline system parent category ID.</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>Baseline detection item ID.</p> 
     * @return ItemID <p>Baseline detection item ID.</p>
     */
    public Long getItemID() {
        return this.ItemID;
    }

    /**
     * Set <p>Baseline detection item ID.</p>
     * @param ItemID <p>Baseline detection item ID.</p>
     */
    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get <p>List of asset types to detect. Element value is HOST or CLUSTER.</p> 
     * @return CheckAssetType <p>List of asset types to detect. Element value is HOST or CLUSTER.</p>
     */
    public String [] getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>List of asset types to detect. Element value is HOST or CLUSTER.</p>
     * @param CheckAssetType <p>List of asset types to detect. Element value is HOST or CLUSTER.</p>
     */
    public void setCheckAssetType(String [] CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>Baseline subcategory ID.</p> 
     * @return CategoryID <p>Baseline subcategory ID.</p>
     */
    public Long getCategoryID() {
        return this.CategoryID;
    }

    /**
     * Set <p>Baseline subcategory ID.</p>
     * @param CategoryID <p>Baseline subcategory ID.</p>
     */
    public void setCategoryID(Long CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status, Values: PASS/NOT_PASS), AssetName (asset name/ID, fuzzy search), IP (IP address, fuzzy search), Tag (asset tag, fuzzy search).</p> 
     * @return Filters <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status, Values: PASS/NOT_PASS), AssetName (asset name/ID, fuzzy search), IP (IP address, fuzzy search), Tag (asset tag, fuzzy search).</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status, Values: PASS/NOT_PASS), AssetName (asset name/ID, fuzzy search), IP (IP address, fuzzy search), Tag (asset tag, fuzzy search).</p>
     * @param Filters <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status, Values: PASS/NOT_PASS), AssetName (asset name/ID, fuzzy search), IP (IP address, fuzzy search), Tag (asset tag, fuzzy search).</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p> 
     * @return Limit <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p>
     * @param Limit <p>Number of items per page for paging query. Maximum value: 100. If exceeded, the server will automatically roll back to the default value 10.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Starting offset amount for paging query. It starts from 0.</p> 
     * @return Offset <p>Starting offset amount for paging query. It starts from 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Starting offset amount for paging query. It starts from 0.</p>
     * @param Offset <p>Starting offset amount for paging query. It starts from 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p> 
     * @return Order <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p>
     * @param Order <p>Sorting order. Valid values: asc (ascending) and desc (descending). Default value: desc.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sort field name, an optional field defined by the specific API.</p> 
     * @return By <p>Sort field name, an optional field defined by the specific API.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sort field name, an optional field defined by the specific API.</p>
     * @param By <p>Sort field name, an optional field defined by the specific API.</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBaselineItemRiskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineItemRiskListRequest(DescribeBaselineItemRiskListRequest source) {
        if (source.PolicyID != null) {
            this.PolicyID = new Long[source.PolicyID.length];
            for (int i = 0; i < source.PolicyID.length; i++) {
                this.PolicyID[i] = new Long(source.PolicyID[i]);
            }
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.ItemID != null) {
            this.ItemID = new Long(source.ItemID);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String[source.CheckAssetType.length];
            for (int i = 0; i < source.CheckAssetType.length; i++) {
                this.CheckAssetType[i] = new String(source.CheckAssetType[i]);
            }
        }
        if (source.CategoryID != null) {
            this.CategoryID = new Long(source.CategoryID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyID.", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamArraySimple(map, prefix + "CheckAssetType.", this.CheckAssetType);
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

