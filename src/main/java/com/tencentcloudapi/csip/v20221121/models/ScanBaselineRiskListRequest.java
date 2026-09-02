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

public class ScanBaselineRiskListRequest extends AbstractModel {

    /**
    * <p>Baseline policy type. Valid values:</p><ul><li>SYSTEM: system policy (built-in in CSIP)</li><li>SELF: user-defined policy</li></ul>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>Target baseline policy ID. It must be greater than 0.</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * <p>Baseline system parent category ID.</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>List of RiskIDs of risk records pending rescan. It cannot be empty and elements cannot be empty strings.</p>
    */
    @SerializedName("RiskIDList")
    @Expose
    private String [] RiskIDList;

    /**
    * <p>Check item ID</p>
    */
    @SerializedName("ItemID")
    @Expose
    private Long ItemID;

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
     * Get <p>Baseline policy type. Valid values:</p><ul><li>SYSTEM: system policy (built-in in CSIP)</li><li>SELF: user-defined policy</li></ul> 
     * @return PolicyType <p>Baseline policy type. Valid values:</p><ul><li>SYSTEM: system policy (built-in in CSIP)</li><li>SELF: user-defined policy</li></ul>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>Baseline policy type. Valid values:</p><ul><li>SYSTEM: system policy (built-in in CSIP)</li><li>SELF: user-defined policy</li></ul>
     * @param PolicyType <p>Baseline policy type. Valid values:</p><ul><li>SYSTEM: system policy (built-in in CSIP)</li><li>SELF: user-defined policy</li></ul>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>Target baseline policy ID. It must be greater than 0.</p> 
     * @return PolicyID <p>Target baseline policy ID. It must be greater than 0.</p>
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>Target baseline policy ID. It must be greater than 0.</p>
     * @param PolicyID <p>Target baseline policy ID. It must be greater than 0.</p>
     */
    public void setPolicyID(Long PolicyID) {
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
     * Get <p>List of RiskIDs of risk records pending rescan. It cannot be empty and elements cannot be empty strings.</p> 
     * @return RiskIDList <p>List of RiskIDs of risk records pending rescan. It cannot be empty and elements cannot be empty strings.</p>
     */
    public String [] getRiskIDList() {
        return this.RiskIDList;
    }

    /**
     * Set <p>List of RiskIDs of risk records pending rescan. It cannot be empty and elements cannot be empty strings.</p>
     * @param RiskIDList <p>List of RiskIDs of risk records pending rescan. It cannot be empty and elements cannot be empty strings.</p>
     */
    public void setRiskIDList(String [] RiskIDList) {
        this.RiskIDList = RiskIDList;
    }

    /**
     * Get <p>Check item ID</p> 
     * @return ItemID <p>Check item ID</p>
     */
    public Long getItemID() {
        return this.ItemID;
    }

    /**
     * Set <p>Check item ID</p>
     * @param ItemID <p>Check item ID</p>
     */
    public void setItemID(Long ItemID) {
        this.ItemID = ItemID;
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

    public ScanBaselineRiskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanBaselineRiskListRequest(ScanBaselineRiskListRequest source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.RiskIDList != null) {
            this.RiskIDList = new String[source.RiskIDList.length];
            for (int i = 0; i < source.RiskIDList.length; i++) {
                this.RiskIDList[i] = new String(source.RiskIDList[i]);
            }
        }
        if (source.ItemID != null) {
            this.ItemID = new Long(source.ItemID);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamArraySimple(map, prefix + "RiskIDList.", this.RiskIDList);
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

