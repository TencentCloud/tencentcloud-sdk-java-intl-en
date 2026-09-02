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

public class CreateBaselineAggregatedItemExportJobRequest extends AbstractModel {

    /**
    * <p>Baseline policy ID list (you can pass multiple entries at the same time for federated statistics).</p>
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
    * <p>Baseline subcategory ID.</p>
    */
    @SerializedName("CategoryID")
    @Expose
    private Long CategoryID;

    /**
    * <p>Export task name. If not specified, it will be automatically generated.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Export type. Default value: RISK.<br>Enumeration values:<br>STATISTIC: export statistics<br>RISK: export risk details</p>
    */
    @SerializedName("ExportType")
    @Expose
    private String ExportType;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status: PASS/NOT_PASS), Name (detection item name, fuzzy search), RiskLevel (risk level: CRITICAL/HIGH/MEDIUM/LOW), PolicyName (associated baseline/policy name, fuzzy search).</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Deprecated.</p>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
     * Get <p>Baseline policy ID list (you can pass multiple entries at the same time for federated statistics).</p> 
     * @return PolicyID <p>Baseline policy ID list (you can pass multiple entries at the same time for federated statistics).</p>
     */
    public Long [] getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>Baseline policy ID list (you can pass multiple entries at the same time for federated statistics).</p>
     * @param PolicyID <p>Baseline policy ID list (you can pass multiple entries at the same time for federated statistics).</p>
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
     * Get <p>Export task name. If not specified, it will be automatically generated.</p> 
     * @return Name <p>Export task name. If not specified, it will be automatically generated.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Export task name. If not specified, it will be automatically generated.</p>
     * @param Name <p>Export task name. If not specified, it will be automatically generated.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Export type. Default value: RISK.<br>Enumeration values:<br>STATISTIC: export statistics<br>RISK: export risk details</p> 
     * @return ExportType <p>Export type. Default value: RISK.<br>Enumeration values:<br>STATISTIC: export statistics<br>RISK: export risk details</p>
     */
    public String getExportType() {
        return this.ExportType;
    }

    /**
     * Set <p>Export type. Default value: RISK.<br>Enumeration values:<br>STATISTIC: export statistics<br>RISK: export risk details</p>
     * @param ExportType <p>Export type. Default value: RISK.<br>Enumeration values:<br>STATISTIC: export statistics<br>RISK: export risk details</p>
     */
    public void setExportType(String ExportType) {
        this.ExportType = ExportType;
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
     * Get <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status: PASS/NOT_PASS), Name (detection item name, fuzzy search), RiskLevel (risk level: CRITICAL/HIGH/MEDIUM/LOW), PolicyName (associated baseline/policy name, fuzzy search).</p> 
     * @return Filters <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status: PASS/NOT_PASS), Name (detection item name, fuzzy search), RiskLevel (risk level: CRITICAL/HIGH/MEDIUM/LOW), PolicyName (associated baseline/policy name, fuzzy search).</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status: PASS/NOT_PASS), Name (detection item name, fuzzy search), RiskLevel (risk level: CRITICAL/HIGH/MEDIUM/LOW), PolicyName (associated baseline/policy name, fuzzy search).</p>
     * @param Filters <p>Universal Filter Criteria. Supported Name: ResultStatus (pass status: PASS/NOT_PASS), Name (detection item name, fuzzy search), RiskLevel (risk level: CRITICAL/HIGH/MEDIUM/LOW), PolicyName (associated baseline/policy name, fuzzy search).</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Deprecated.</p> 
     * @return CheckAssetType <p>Deprecated.</p>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>Deprecated.</p>
     * @param CheckAssetType <p>Deprecated.</p>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    public CreateBaselineAggregatedItemExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBaselineAggregatedItemExportJobRequest(CreateBaselineAggregatedItemExportJobRequest source) {
        if (source.PolicyID != null) {
            this.PolicyID = new Long[source.PolicyID.length];
            for (int i = 0; i < source.PolicyID.length; i++) {
                this.PolicyID[i] = new Long(source.PolicyID[i]);
            }
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.CategoryID != null) {
            this.CategoryID = new Long(source.CategoryID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExportType != null) {
            this.ExportType = new String(source.ExportType);
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
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyID.", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExportType", this.ExportType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);

    }
}

