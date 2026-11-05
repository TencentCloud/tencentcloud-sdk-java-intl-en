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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSkillSummaryListRequest extends AbstractModel {

    /**
    * Space ID. Required.
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * Query only the Skills favorited by the current user
    */
    @SerializedName("FavoriteOnly")
    @Expose
    private Boolean FavoriteOnly;

    /**
    * Filter criteria (multiple Filters are in an AND relationship, while multiple Values within the same Filter are in an OR relationship):
-SkillIdList: List of skill IDs, string array, exact match
- ProviderType: Skill provider type, enumerated value array, exact match
     (SKILL_PROVIDER_TYPE_OFFICIAL=1/SKILL_PROVIDER_TYPE_THIRD_PARTY=2/SKILL_PROVIDER_TYPE_CUSTOM=3/SKILL_PROVIDER_TYPE_CUSTOM_SHARED=4)
-CategoryKey: Category identifier, string array, exact match.
- AnalysisStatus: Security detection status, enumeration value array, exact match.
     (SKILL_ANALYSIS_PENDING=0/SKILL_ANALYSIS_RUNNING=1/SKILL_ANALYSIS_AVAILABLE=2/SKILL_ANALYSIS_UNAVAILABLE=3/SKILL_ANALYSIS_FAILED=4)
- RiskLevel: Risk level, enumerated value array, exact match
     (SKILL_RISK_NONE=0/SKILL_RISK_LOW=1/SKILL_RISK_MEDIUM=2/SKILL_RISK_HIGH=3)
- SkillStatus: Publishing status in the Skill dimension. Enumerated value array. Exact match. OR between multiple values. Only meaningful when Perspective is EDITOR or ALL.
(SKILL_STATUS_INITIALIZED=0/SKILL_STATUS_AUDITING=1/SKILL_STATUS_PENDING_RELEASE=2/SKILL_STATUS_RELEASED=3)
- ShareStatus: Shared status, enumeration value array, exact match. This parameter is valid only when ProviderType includes SKILL_PROVIDER_TYPE_CUSTOM/SKILL_PROVIDER_TYPE_CUSTOM_SHARED.
     (SHARE_STATUS_UNSHARED=0/SHARE_STATUS_SHARED=1/SHARE_STATUS_APPROVING=2)
-Perspective: Perspective enum, string single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM. Default if not passed: USER
(USER=User perspective. Only Skills with usage permissions are returned / EDITOR=Editor perspective. Only Skills with edit permission are returned / ALL=Full perspective. Skills with any permission bit are returned)
-Creator: Filter by creator. String single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM.
Currently, only the placeholder "$self" is supported, which means only Skills created by the current caller are returned.
To scale to a specified identity subsequently, add the agreement here if needed.
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * Page number, starting from 0
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page. Maximum value: 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Fuzzy search by name/display name
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get Space ID. Required. 
     * @return SpaceId Space ID. Required.
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Space ID. Required.
     * @param SpaceId Space ID. Required.
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get Query only the Skills favorited by the current user 
     * @return FavoriteOnly Query only the Skills favorited by the current user
     */
    public Boolean getFavoriteOnly() {
        return this.FavoriteOnly;
    }

    /**
     * Set Query only the Skills favorited by the current user
     * @param FavoriteOnly Query only the Skills favorited by the current user
     */
    public void setFavoriteOnly(Boolean FavoriteOnly) {
        this.FavoriteOnly = FavoriteOnly;
    }

    /**
     * Get Filter criteria (multiple Filters are in an AND relationship, while multiple Values within the same Filter are in an OR relationship):
-SkillIdList: List of skill IDs, string array, exact match
- ProviderType: Skill provider type, enumerated value array, exact match
     (SKILL_PROVIDER_TYPE_OFFICIAL=1/SKILL_PROVIDER_TYPE_THIRD_PARTY=2/SKILL_PROVIDER_TYPE_CUSTOM=3/SKILL_PROVIDER_TYPE_CUSTOM_SHARED=4)
-CategoryKey: Category identifier, string array, exact match.
- AnalysisStatus: Security detection status, enumeration value array, exact match.
     (SKILL_ANALYSIS_PENDING=0/SKILL_ANALYSIS_RUNNING=1/SKILL_ANALYSIS_AVAILABLE=2/SKILL_ANALYSIS_UNAVAILABLE=3/SKILL_ANALYSIS_FAILED=4)
- RiskLevel: Risk level, enumerated value array, exact match
     (SKILL_RISK_NONE=0/SKILL_RISK_LOW=1/SKILL_RISK_MEDIUM=2/SKILL_RISK_HIGH=3)
- SkillStatus: Publishing status in the Skill dimension. Enumerated value array. Exact match. OR between multiple values. Only meaningful when Perspective is EDITOR or ALL.
(SKILL_STATUS_INITIALIZED=0/SKILL_STATUS_AUDITING=1/SKILL_STATUS_PENDING_RELEASE=2/SKILL_STATUS_RELEASED=3)
- ShareStatus: Shared status, enumeration value array, exact match. This parameter is valid only when ProviderType includes SKILL_PROVIDER_TYPE_CUSTOM/SKILL_PROVIDER_TYPE_CUSTOM_SHARED.
     (SHARE_STATUS_UNSHARED=0/SHARE_STATUS_SHARED=1/SHARE_STATUS_APPROVING=2)
-Perspective: Perspective enum, string single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM. Default if not passed: USER
(USER=User perspective. Only Skills with usage permissions are returned / EDITOR=Editor perspective. Only Skills with edit permission are returned / ALL=Full perspective. Skills with any permission bit are returned)
-Creator: Filter by creator. String single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM.
Currently, only the placeholder "$self" is supported, which means only Skills created by the current caller are returned.
To scale to a specified identity subsequently, add the agreement here if needed. 
     * @return FilterList Filter criteria (multiple Filters are in an AND relationship, while multiple Values within the same Filter are in an OR relationship):
-SkillIdList: List of skill IDs, string array, exact match
- ProviderType: Skill provider type, enumerated value array, exact match
     (SKILL_PROVIDER_TYPE_OFFICIAL=1/SKILL_PROVIDER_TYPE_THIRD_PARTY=2/SKILL_PROVIDER_TYPE_CUSTOM=3/SKILL_PROVIDER_TYPE_CUSTOM_SHARED=4)
-CategoryKey: Category identifier, string array, exact match.
- AnalysisStatus: Security detection status, enumeration value array, exact match.
     (SKILL_ANALYSIS_PENDING=0/SKILL_ANALYSIS_RUNNING=1/SKILL_ANALYSIS_AVAILABLE=2/SKILL_ANALYSIS_UNAVAILABLE=3/SKILL_ANALYSIS_FAILED=4)
- RiskLevel: Risk level, enumerated value array, exact match
     (SKILL_RISK_NONE=0/SKILL_RISK_LOW=1/SKILL_RISK_MEDIUM=2/SKILL_RISK_HIGH=3)
- SkillStatus: Publishing status in the Skill dimension. Enumerated value array. Exact match. OR between multiple values. Only meaningful when Perspective is EDITOR or ALL.
(SKILL_STATUS_INITIALIZED=0/SKILL_STATUS_AUDITING=1/SKILL_STATUS_PENDING_RELEASE=2/SKILL_STATUS_RELEASED=3)
- ShareStatus: Shared status, enumeration value array, exact match. This parameter is valid only when ProviderType includes SKILL_PROVIDER_TYPE_CUSTOM/SKILL_PROVIDER_TYPE_CUSTOM_SHARED.
     (SHARE_STATUS_UNSHARED=0/SHARE_STATUS_SHARED=1/SHARE_STATUS_APPROVING=2)
-Perspective: Perspective enum, string single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM. Default if not passed: USER
(USER=User perspective. Only Skills with usage permissions are returned / EDITOR=Editor perspective. Only Skills with edit permission are returned / ALL=Full perspective. Skills with any permission bit are returned)
-Creator: Filter by creator. String single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM.
Currently, only the placeholder "$self" is supported, which means only Skills created by the current caller are returned.
To scale to a specified identity subsequently, add the agreement here if needed.
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set Filter criteria (multiple Filters are in an AND relationship, while multiple Values within the same Filter are in an OR relationship):
-SkillIdList: List of skill IDs, string array, exact match
- ProviderType: Skill provider type, enumerated value array, exact match
     (SKILL_PROVIDER_TYPE_OFFICIAL=1/SKILL_PROVIDER_TYPE_THIRD_PARTY=2/SKILL_PROVIDER_TYPE_CUSTOM=3/SKILL_PROVIDER_TYPE_CUSTOM_SHARED=4)
-CategoryKey: Category identifier, string array, exact match.
- AnalysisStatus: Security detection status, enumeration value array, exact match.
     (SKILL_ANALYSIS_PENDING=0/SKILL_ANALYSIS_RUNNING=1/SKILL_ANALYSIS_AVAILABLE=2/SKILL_ANALYSIS_UNAVAILABLE=3/SKILL_ANALYSIS_FAILED=4)
- RiskLevel: Risk level, enumerated value array, exact match
     (SKILL_RISK_NONE=0/SKILL_RISK_LOW=1/SKILL_RISK_MEDIUM=2/SKILL_RISK_HIGH=3)
- SkillStatus: Publishing status in the Skill dimension. Enumerated value array. Exact match. OR between multiple values. Only meaningful when Perspective is EDITOR or ALL.
(SKILL_STATUS_INITIALIZED=0/SKILL_STATUS_AUDITING=1/SKILL_STATUS_PENDING_RELEASE=2/SKILL_STATUS_RELEASED=3)
- ShareStatus: Shared status, enumeration value array, exact match. This parameter is valid only when ProviderType includes SKILL_PROVIDER_TYPE_CUSTOM/SKILL_PROVIDER_TYPE_CUSTOM_SHARED.
     (SHARE_STATUS_UNSHARED=0/SHARE_STATUS_SHARED=1/SHARE_STATUS_APPROVING=2)
-Perspective: Perspective enum, string single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM. Default if not passed: USER
(USER=User perspective. Only Skills with usage permissions are returned / EDITOR=Editor perspective. Only Skills with edit permission are returned / ALL=Full perspective. Skills with any permission bit are returned)
-Creator: Filter by creator. String single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM.
Currently, only the placeholder "$self" is supported, which means only Skills created by the current caller are returned.
To scale to a specified identity subsequently, add the agreement here if needed.
     * @param FilterList Filter criteria (multiple Filters are in an AND relationship, while multiple Values within the same Filter are in an OR relationship):
-SkillIdList: List of skill IDs, string array, exact match
- ProviderType: Skill provider type, enumerated value array, exact match
     (SKILL_PROVIDER_TYPE_OFFICIAL=1/SKILL_PROVIDER_TYPE_THIRD_PARTY=2/SKILL_PROVIDER_TYPE_CUSTOM=3/SKILL_PROVIDER_TYPE_CUSTOM_SHARED=4)
-CategoryKey: Category identifier, string array, exact match.
- AnalysisStatus: Security detection status, enumeration value array, exact match.
     (SKILL_ANALYSIS_PENDING=0/SKILL_ANALYSIS_RUNNING=1/SKILL_ANALYSIS_AVAILABLE=2/SKILL_ANALYSIS_UNAVAILABLE=3/SKILL_ANALYSIS_FAILED=4)
- RiskLevel: Risk level, enumerated value array, exact match
     (SKILL_RISK_NONE=0/SKILL_RISK_LOW=1/SKILL_RISK_MEDIUM=2/SKILL_RISK_HIGH=3)
- SkillStatus: Publishing status in the Skill dimension. Enumerated value array. Exact match. OR between multiple values. Only meaningful when Perspective is EDITOR or ALL.
(SKILL_STATUS_INITIALIZED=0/SKILL_STATUS_AUDITING=1/SKILL_STATUS_PENDING_RELEASE=2/SKILL_STATUS_RELEASED=3)
- ShareStatus: Shared status, enumeration value array, exact match. This parameter is valid only when ProviderType includes SKILL_PROVIDER_TYPE_CUSTOM/SKILL_PROVIDER_TYPE_CUSTOM_SHARED.
     (SHARE_STATUS_UNSHARED=0/SHARE_STATUS_SHARED=1/SHARE_STATUS_APPROVING=2)
-Perspective: Perspective enum, string single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM. Default if not passed: USER
(USER=User perspective. Only Skills with usage permissions are returned / EDITOR=Editor perspective. Only Skills with edit permission are returned / ALL=Full perspective. Skills with any permission bit are returned)
-Creator: Filter by creator. String single value. The length of Values must be 1. Multi-value is deemed as illegal. This parameter is valid only when ProviderType=SKILL_PROVIDER_TYPE_CUSTOM.
Currently, only the placeholder "$self" is supported, which means only Skills created by the current caller are returned.
To scale to a specified identity subsequently, add the agreement here if needed.
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get Page number, starting from 0 
     * @return PageNumber Page number, starting from 0
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, starting from 0
     * @param PageNumber Page number, starting from 0
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. Maximum value: 100. 
     * @return PageSize Number of items per page. Maximum value: 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. Maximum value: 100.
     * @param PageSize Number of items per page. Maximum value: 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Fuzzy search by name/display name 
     * @return Query Fuzzy search by name/display name
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Fuzzy search by name/display name
     * @param Query Fuzzy search by name/display name
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeSkillSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillSummaryListRequest(DescribeSkillSummaryListRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FavoriteOnly != null) {
            this.FavoriteOnly = new Boolean(source.FavoriteOnly);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "FavoriteOnly", this.FavoriteOnly);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

