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

public class BaselineAggregatedPolicy extends AbstractModel {

    /**
    * <p>Parent category ID of the system policy (only for aggregation when PolicyType=SYSTEM; 0 for custom policy).</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>List of baseline policy IDs involved in this aggregation.</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long [] PolicyID;

    /**
    * <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Policy description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Number of detection items configured in the policy.</p>
    */
    @SerializedName("ConfItemCount")
    @Expose
    private Long ConfItemCount;

    /**
    * <p>Number of detection items with a result of PASS under this policy.</p>
    */
    @SerializedName("PassItemCount")
    @Expose
    private Long PassItemCount;

    /**
    * <p>Number of detection items with result NOT_PASS under this policy.</p>
    */
    @SerializedName("NotPassItemCount")
    @Expose
    private Long NotPassItemCount;

    /**
    * <p>Distribution statistics of detection failed items by risk level (LOW/MEDIUM/HIGH/CRITICAL).</p>
    */
    @SerializedName("NotPassItemRiskLevelStatistic")
    @Expose
    private BaselineRiskLevelStatistic [] NotPassItemRiskLevelStatistic;

    /**
    * <p>Passing rate of the last scan of this policy, unit: percentage (0-100), rounded to two decimal places.</p>
    */
    @SerializedName("PassRate")
    @Expose
    private Float PassRate;

    /**
    * <p>Scanning result statistics details of each subcategory under this policy.</p>
    */
    @SerializedName("CategoryStatistic")
    @Expose
    private BaselineAggregatedCategory [] CategoryStatistic;

    /**
    * <p>Baseline policy type. Values:</p><ul><li>SYSTEM: system policy (CSIP built-in)</li><li>SELF: user-defined policy</li></ul>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>Whether the baseline category has been scanned</p>
    */
    @SerializedName("Scanned")
    @Expose
    private Boolean Scanned;

    /**
     * Get <p>Parent category ID of the system policy (only for aggregation when PolicyType=SYSTEM; 0 for custom policy).</p> 
     * @return ParentCategoryID <p>Parent category ID of the system policy (only for aggregation when PolicyType=SYSTEM; 0 for custom policy).</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>Parent category ID of the system policy (only for aggregation when PolicyType=SYSTEM; 0 for custom policy).</p>
     * @param ParentCategoryID <p>Parent category ID of the system policy (only for aggregation when PolicyType=SYSTEM; 0 for custom policy).</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>List of baseline policy IDs involved in this aggregation.</p> 
     * @return PolicyID <p>List of baseline policy IDs involved in this aggregation.</p>
     */
    public Long [] getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>List of baseline policy IDs involved in this aggregation.</p>
     * @param PolicyID <p>List of baseline policy IDs involved in this aggregation.</p>
     */
    public void setPolicyID(Long [] PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p> 
     * @return Name <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p>
     * @param Name <p>Policy Name (custom policy is user input, and system policy is a built-in classification name).</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Policy description.</p> 
     * @return Description <p>Policy description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Policy description.</p>
     * @param Description <p>Policy description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Number of detection items configured in the policy.</p> 
     * @return ConfItemCount <p>Number of detection items configured in the policy.</p>
     */
    public Long getConfItemCount() {
        return this.ConfItemCount;
    }

    /**
     * Set <p>Number of detection items configured in the policy.</p>
     * @param ConfItemCount <p>Number of detection items configured in the policy.</p>
     */
    public void setConfItemCount(Long ConfItemCount) {
        this.ConfItemCount = ConfItemCount;
    }

    /**
     * Get <p>Number of detection items with a result of PASS under this policy.</p> 
     * @return PassItemCount <p>Number of detection items with a result of PASS under this policy.</p>
     */
    public Long getPassItemCount() {
        return this.PassItemCount;
    }

    /**
     * Set <p>Number of detection items with a result of PASS under this policy.</p>
     * @param PassItemCount <p>Number of detection items with a result of PASS under this policy.</p>
     */
    public void setPassItemCount(Long PassItemCount) {
        this.PassItemCount = PassItemCount;
    }

    /**
     * Get <p>Number of detection items with result NOT_PASS under this policy.</p> 
     * @return NotPassItemCount <p>Number of detection items with result NOT_PASS under this policy.</p>
     */
    public Long getNotPassItemCount() {
        return this.NotPassItemCount;
    }

    /**
     * Set <p>Number of detection items with result NOT_PASS under this policy.</p>
     * @param NotPassItemCount <p>Number of detection items with result NOT_PASS under this policy.</p>
     */
    public void setNotPassItemCount(Long NotPassItemCount) {
        this.NotPassItemCount = NotPassItemCount;
    }

    /**
     * Get <p>Distribution statistics of detection failed items by risk level (LOW/MEDIUM/HIGH/CRITICAL).</p> 
     * @return NotPassItemRiskLevelStatistic <p>Distribution statistics of detection failed items by risk level (LOW/MEDIUM/HIGH/CRITICAL).</p>
     */
    public BaselineRiskLevelStatistic [] getNotPassItemRiskLevelStatistic() {
        return this.NotPassItemRiskLevelStatistic;
    }

    /**
     * Set <p>Distribution statistics of detection failed items by risk level (LOW/MEDIUM/HIGH/CRITICAL).</p>
     * @param NotPassItemRiskLevelStatistic <p>Distribution statistics of detection failed items by risk level (LOW/MEDIUM/HIGH/CRITICAL).</p>
     */
    public void setNotPassItemRiskLevelStatistic(BaselineRiskLevelStatistic [] NotPassItemRiskLevelStatistic) {
        this.NotPassItemRiskLevelStatistic = NotPassItemRiskLevelStatistic;
    }

    /**
     * Get <p>Passing rate of the last scan of this policy, unit: percentage (0-100), rounded to two decimal places.</p> 
     * @return PassRate <p>Passing rate of the last scan of this policy, unit: percentage (0-100), rounded to two decimal places.</p>
     */
    public Float getPassRate() {
        return this.PassRate;
    }

    /**
     * Set <p>Passing rate of the last scan of this policy, unit: percentage (0-100), rounded to two decimal places.</p>
     * @param PassRate <p>Passing rate of the last scan of this policy, unit: percentage (0-100), rounded to two decimal places.</p>
     */
    public void setPassRate(Float PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get <p>Scanning result statistics details of each subcategory under this policy.</p> 
     * @return CategoryStatistic <p>Scanning result statistics details of each subcategory under this policy.</p>
     */
    public BaselineAggregatedCategory [] getCategoryStatistic() {
        return this.CategoryStatistic;
    }

    /**
     * Set <p>Scanning result statistics details of each subcategory under this policy.</p>
     * @param CategoryStatistic <p>Scanning result statistics details of each subcategory under this policy.</p>
     */
    public void setCategoryStatistic(BaselineAggregatedCategory [] CategoryStatistic) {
        this.CategoryStatistic = CategoryStatistic;
    }

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
     * Get <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul> 
     * @return CheckAssetType <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     * @param CheckAssetType <p>Detect asset major category, case-sensitive host baseline and container cluster baseline. Parameter values:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>Whether the baseline category has been scanned</p> 
     * @return Scanned <p>Whether the baseline category has been scanned</p>
     */
    public Boolean getScanned() {
        return this.Scanned;
    }

    /**
     * Set <p>Whether the baseline category has been scanned</p>
     * @param Scanned <p>Whether the baseline category has been scanned</p>
     */
    public void setScanned(Boolean Scanned) {
        this.Scanned = Scanned;
    }

    public BaselineAggregatedPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineAggregatedPolicy(BaselineAggregatedPolicy source) {
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.PolicyID != null) {
            this.PolicyID = new Long[source.PolicyID.length];
            for (int i = 0; i < source.PolicyID.length; i++) {
                this.PolicyID[i] = new Long(source.PolicyID[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConfItemCount != null) {
            this.ConfItemCount = new Long(source.ConfItemCount);
        }
        if (source.PassItemCount != null) {
            this.PassItemCount = new Long(source.PassItemCount);
        }
        if (source.NotPassItemCount != null) {
            this.NotPassItemCount = new Long(source.NotPassItemCount);
        }
        if (source.NotPassItemRiskLevelStatistic != null) {
            this.NotPassItemRiskLevelStatistic = new BaselineRiskLevelStatistic[source.NotPassItemRiskLevelStatistic.length];
            for (int i = 0; i < source.NotPassItemRiskLevelStatistic.length; i++) {
                this.NotPassItemRiskLevelStatistic[i] = new BaselineRiskLevelStatistic(source.NotPassItemRiskLevelStatistic[i]);
            }
        }
        if (source.PassRate != null) {
            this.PassRate = new Float(source.PassRate);
        }
        if (source.CategoryStatistic != null) {
            this.CategoryStatistic = new BaselineAggregatedCategory[source.CategoryStatistic.length];
            for (int i = 0; i < source.CategoryStatistic.length; i++) {
                this.CategoryStatistic[i] = new BaselineAggregatedCategory(source.CategoryStatistic[i]);
            }
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.Scanned != null) {
            this.Scanned = new Boolean(source.Scanned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamArraySimple(map, prefix + "PolicyID.", this.PolicyID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConfItemCount", this.ConfItemCount);
        this.setParamSimple(map, prefix + "PassItemCount", this.PassItemCount);
        this.setParamSimple(map, prefix + "NotPassItemCount", this.NotPassItemCount);
        this.setParamArrayObj(map, prefix + "NotPassItemRiskLevelStatistic.", this.NotPassItemRiskLevelStatistic);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamArrayObj(map, prefix + "CategoryStatistic.", this.CategoryStatistic);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "Scanned", this.Scanned);

    }
}

