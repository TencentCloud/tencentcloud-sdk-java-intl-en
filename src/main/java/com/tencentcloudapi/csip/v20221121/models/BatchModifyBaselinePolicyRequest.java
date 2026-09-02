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

public class BatchModifyBaselinePolicyRequest extends AbstractModel {

    /**
    * <p>List of baseline policy IDs that need modification. It cannot be empty and elements cannot be 0.</p>
    */
    @SerializedName("PolicyIDList")
    @Expose
    private Long [] PolicyIDList;

    /**
    * <p>Period scan configuration; can be omitted if not modified. When Enable=1, IntervalType and IntervalValueList must be simultaneously passed in.</p>
    */
    @SerializedName("CycleScanConf")
    @Expose
    private CycleScanConf CycleScanConf;

    /**
    * <p>Automatic synchronization switch for newly-added built-in detection items. true: automatically join; false: do not join.</p>
    */
    @SerializedName("AutoSyncItem")
    @Expose
    private Boolean AutoSyncItem;

    /**
    * <p>Categorization / subcategory / detection item hit configuration; can be omitted if not modified.</p>
    */
    @SerializedName("CategoryConf")
    @Expose
    private BaselinePolicySystemCategoryConf [] CategoryConf;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Configuration list of custom detection item values; can be omitted if not modified. In each element, RuleID and CustomItemID cannot both be 0.</p>
    */
    @SerializedName("CustomItemConf")
    @Expose
    private BaselineCustomItemConf [] CustomItemConf;

    /**
     * Get <p>List of baseline policy IDs that need modification. It cannot be empty and elements cannot be 0.</p> 
     * @return PolicyIDList <p>List of baseline policy IDs that need modification. It cannot be empty and elements cannot be 0.</p>
     */
    public Long [] getPolicyIDList() {
        return this.PolicyIDList;
    }

    /**
     * Set <p>List of baseline policy IDs that need modification. It cannot be empty and elements cannot be 0.</p>
     * @param PolicyIDList <p>List of baseline policy IDs that need modification. It cannot be empty and elements cannot be 0.</p>
     */
    public void setPolicyIDList(Long [] PolicyIDList) {
        this.PolicyIDList = PolicyIDList;
    }

    /**
     * Get <p>Period scan configuration; can be omitted if not modified. When Enable=1, IntervalType and IntervalValueList must be simultaneously passed in.</p> 
     * @return CycleScanConf <p>Period scan configuration; can be omitted if not modified. When Enable=1, IntervalType and IntervalValueList must be simultaneously passed in.</p>
     */
    public CycleScanConf getCycleScanConf() {
        return this.CycleScanConf;
    }

    /**
     * Set <p>Period scan configuration; can be omitted if not modified. When Enable=1, IntervalType and IntervalValueList must be simultaneously passed in.</p>
     * @param CycleScanConf <p>Period scan configuration; can be omitted if not modified. When Enable=1, IntervalType and IntervalValueList must be simultaneously passed in.</p>
     */
    public void setCycleScanConf(CycleScanConf CycleScanConf) {
        this.CycleScanConf = CycleScanConf;
    }

    /**
     * Get <p>Automatic synchronization switch for newly-added built-in detection items. true: automatically join; false: do not join.</p> 
     * @return AutoSyncItem <p>Automatic synchronization switch for newly-added built-in detection items. true: automatically join; false: do not join.</p>
     */
    public Boolean getAutoSyncItem() {
        return this.AutoSyncItem;
    }

    /**
     * Set <p>Automatic synchronization switch for newly-added built-in detection items. true: automatically join; false: do not join.</p>
     * @param AutoSyncItem <p>Automatic synchronization switch for newly-added built-in detection items. true: automatically join; false: do not join.</p>
     */
    public void setAutoSyncItem(Boolean AutoSyncItem) {
        this.AutoSyncItem = AutoSyncItem;
    }

    /**
     * Get <p>Categorization / subcategory / detection item hit configuration; can be omitted if not modified.</p> 
     * @return CategoryConf <p>Categorization / subcategory / detection item hit configuration; can be omitted if not modified.</p>
     */
    public BaselinePolicySystemCategoryConf [] getCategoryConf() {
        return this.CategoryConf;
    }

    /**
     * Set <p>Categorization / subcategory / detection item hit configuration; can be omitted if not modified.</p>
     * @param CategoryConf <p>Categorization / subcategory / detection item hit configuration; can be omitted if not modified.</p>
     */
    public void setCategoryConf(BaselinePolicySystemCategoryConf [] CategoryConf) {
        this.CategoryConf = CategoryConf;
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
     * Get <p>Configuration list of custom detection item values; can be omitted if not modified. In each element, RuleID and CustomItemID cannot both be 0.</p> 
     * @return CustomItemConf <p>Configuration list of custom detection item values; can be omitted if not modified. In each element, RuleID and CustomItemID cannot both be 0.</p>
     */
    public BaselineCustomItemConf [] getCustomItemConf() {
        return this.CustomItemConf;
    }

    /**
     * Set <p>Configuration list of custom detection item values; can be omitted if not modified. In each element, RuleID and CustomItemID cannot both be 0.</p>
     * @param CustomItemConf <p>Configuration list of custom detection item values; can be omitted if not modified. In each element, RuleID and CustomItemID cannot both be 0.</p>
     */
    public void setCustomItemConf(BaselineCustomItemConf [] CustomItemConf) {
        this.CustomItemConf = CustomItemConf;
    }

    public BatchModifyBaselinePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyBaselinePolicyRequest(BatchModifyBaselinePolicyRequest source) {
        if (source.PolicyIDList != null) {
            this.PolicyIDList = new Long[source.PolicyIDList.length];
            for (int i = 0; i < source.PolicyIDList.length; i++) {
                this.PolicyIDList[i] = new Long(source.PolicyIDList[i]);
            }
        }
        if (source.CycleScanConf != null) {
            this.CycleScanConf = new CycleScanConf(source.CycleScanConf);
        }
        if (source.AutoSyncItem != null) {
            this.AutoSyncItem = new Boolean(source.AutoSyncItem);
        }
        if (source.CategoryConf != null) {
            this.CategoryConf = new BaselinePolicySystemCategoryConf[source.CategoryConf.length];
            for (int i = 0; i < source.CategoryConf.length; i++) {
                this.CategoryConf[i] = new BaselinePolicySystemCategoryConf(source.CategoryConf[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.CustomItemConf != null) {
            this.CustomItemConf = new BaselineCustomItemConf[source.CustomItemConf.length];
            for (int i = 0; i < source.CustomItemConf.length; i++) {
                this.CustomItemConf[i] = new BaselineCustomItemConf(source.CustomItemConf[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyIDList.", this.PolicyIDList);
        this.setParamObj(map, prefix + "CycleScanConf.", this.CycleScanConf);
        this.setParamSimple(map, prefix + "AutoSyncItem", this.AutoSyncItem);
        this.setParamArrayObj(map, prefix + "CategoryConf.", this.CategoryConf);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "CustomItemConf.", this.CustomItemConf);

    }
}

