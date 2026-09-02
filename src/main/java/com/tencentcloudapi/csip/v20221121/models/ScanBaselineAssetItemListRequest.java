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

public class ScanBaselineAssetItemListRequest extends AbstractModel {

    /**
    * <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>Target baseline policy ID, must be greater than 0.</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * <p>ID of the parent category in the baseline system.</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>List of detection item IDs to rescan. It is only applicable to this asset.</p>
    */
    @SerializedName("ItemIDList")
    @Expose
    private Long [] ItemIDList;

    /**
    * <p>Target asset ID (Instance ID for AssetType=HOST; CLUSTER ID for AssetType=CLUSTER).</p>
    */
    @SerializedName("AssetID")
    @Expose
    private String AssetID;

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
    * <p>Asset type of the hit asset. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Cluster</li><li>POD: Pod</li><li>CONTAINER: Container</li><li>IMAGE: Mirror</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
     * Get <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul> 
     * @return PolicyType <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     * @param PolicyType <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>Target baseline policy ID, must be greater than 0.</p> 
     * @return PolicyID <p>Target baseline policy ID, must be greater than 0.</p>
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>Target baseline policy ID, must be greater than 0.</p>
     * @param PolicyID <p>Target baseline policy ID, must be greater than 0.</p>
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>ID of the parent category in the baseline system.</p> 
     * @return ParentCategoryID <p>ID of the parent category in the baseline system.</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>ID of the parent category in the baseline system.</p>
     * @param ParentCategoryID <p>ID of the parent category in the baseline system.</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>List of detection item IDs to rescan. It is only applicable to this asset.</p> 
     * @return ItemIDList <p>List of detection item IDs to rescan. It is only applicable to this asset.</p>
     */
    public Long [] getItemIDList() {
        return this.ItemIDList;
    }

    /**
     * Set <p>List of detection item IDs to rescan. It is only applicable to this asset.</p>
     * @param ItemIDList <p>List of detection item IDs to rescan. It is only applicable to this asset.</p>
     */
    public void setItemIDList(Long [] ItemIDList) {
        this.ItemIDList = ItemIDList;
    }

    /**
     * Get <p>Target asset ID (Instance ID for AssetType=HOST; CLUSTER ID for AssetType=CLUSTER).</p> 
     * @return AssetID <p>Target asset ID (Instance ID for AssetType=HOST; CLUSTER ID for AssetType=CLUSTER).</p>
     */
    public String getAssetID() {
        return this.AssetID;
    }

    /**
     * Set <p>Target asset ID (Instance ID for AssetType=HOST; CLUSTER ID for AssetType=CLUSTER).</p>
     * @param AssetID <p>Target asset ID (Instance ID for AssetType=HOST; CLUSTER ID for AssetType=CLUSTER).</p>
     */
    public void setAssetID(String AssetID) {
        this.AssetID = AssetID;
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
     * Get <p>Asset type of the hit asset. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Cluster</li><li>POD: Pod</li><li>CONTAINER: Container</li><li>IMAGE: Mirror</li></ul> 
     * @return AssetType <p>Asset type of the hit asset. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Cluster</li><li>POD: Pod</li><li>CONTAINER: Container</li><li>IMAGE: Mirror</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type of the hit asset. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Cluster</li><li>POD: Pod</li><li>CONTAINER: Container</li><li>IMAGE: Mirror</li></ul>
     * @param AssetType <p>Asset type of the hit asset. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Cluster</li><li>POD: Pod</li><li>CONTAINER: Container</li><li>IMAGE: Mirror</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    public ScanBaselineAssetItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanBaselineAssetItemListRequest(ScanBaselineAssetItemListRequest source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.ItemIDList != null) {
            this.ItemIDList = new Long[source.ItemIDList.length];
            for (int i = 0; i < source.ItemIDList.length; i++) {
                this.ItemIDList[i] = new Long(source.ItemIDList[i]);
            }
        }
        if (source.AssetID != null) {
            this.AssetID = new String(source.AssetID);
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
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamArraySimple(map, prefix + "ItemIDList.", this.ItemIDList);
        this.setParamSimple(map, prefix + "AssetID", this.AssetID);
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

