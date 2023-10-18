/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRulesResponse extends AbstractModel {

    /**
    * Rule information list
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("RuleInfoList")
    @Expose
    private RuleBriefInfo [] RuleInfoList;

    /**
    * Total number of results
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The current page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of rules per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Query type (optional). Valid values: matchName (query by match name), matchCode (query by matchCode), ruleName (query by rule name), and tag (query by tag key/value)
    */
    @SerializedName("SearchType")
    @Expose
    private String SearchType;

    /**
    * Keyword for querying (optional)
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Rule information list
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return RuleInfoList Rule information list
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public RuleBriefInfo [] getRuleInfoList() {
        return this.RuleInfoList;
    }

    /**
     * Set Rule information list
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param RuleInfoList Rule information list
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRuleInfoList(RuleBriefInfo [] RuleInfoList) {
        this.RuleInfoList = RuleInfoList;
    }

    /**
     * Get Total number of results 
     * @return TotalCount Total number of results
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of results
     * @param TotalCount Total number of results
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The current page number 
     * @return PageNumber The current page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set The current page number
     * @param PageNumber The current page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of rules per page 
     * @return PageSize Number of rules per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of rules per page
     * @param PageSize Number of rules per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Query type (optional). Valid values: matchName (query by match name), matchCode (query by matchCode), ruleName (query by rule name), and tag (query by tag key/value) 
     * @return SearchType Query type (optional). Valid values: matchName (query by match name), matchCode (query by matchCode), ruleName (query by rule name), and tag (query by tag key/value)
     */
    public String getSearchType() {
        return this.SearchType;
    }

    /**
     * Set Query type (optional). Valid values: matchName (query by match name), matchCode (query by matchCode), ruleName (query by rule name), and tag (query by tag key/value)
     * @param SearchType Query type (optional). Valid values: matchName (query by match name), matchCode (query by matchCode), ruleName (query by rule name), and tag (query by tag key/value)
     */
    public void setSearchType(String SearchType) {
        this.SearchType = SearchType;
    }

    /**
     * Get Keyword for querying (optional) 
     * @return Keyword Keyword for querying (optional)
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword for querying (optional)
     * @param Keyword Keyword for querying (optional)
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRulesResponse(DescribeRulesResponse source) {
        if (source.RuleInfoList != null) {
            this.RuleInfoList = new RuleBriefInfo[source.RuleInfoList.length];
            for (int i = 0; i < source.RuleInfoList.length; i++) {
                this.RuleInfoList[i] = new RuleBriefInfo(source.RuleInfoList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SearchType != null) {
            this.SearchType = new String(source.SearchType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleInfoList.", this.RuleInfoList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SearchType", this.SearchType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

