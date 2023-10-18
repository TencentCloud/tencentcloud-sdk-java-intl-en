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

public class DescribeRulesRequest extends AbstractModel {

    /**
    * The current page number. The first page will be returned if this parameter is left empty.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * The number of rules per page. If this parameter is left empty, 30 rules are displayed per page by default. Maximum value: 30
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Query type (optional). Valid values: match (query by matchCode or matchName), rule (query by ruleCode or ruleName), and other types (not filtered)
    */
    @SerializedName("SearchType")
    @Expose
    private String SearchType;

    /**
    * Keyword. Enter a keyword about SearchType to query.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Tags. Enter a tag for querying.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get The current page number. The first page will be returned if this parameter is left empty. 
     * @return PageNumber The current page number. The first page will be returned if this parameter is left empty.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set The current page number. The first page will be returned if this parameter is left empty.
     * @param PageNumber The current page number. The first page will be returned if this parameter is left empty.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get The number of rules per page. If this parameter is left empty, 30 rules are displayed per page by default. Maximum value: 30 
     * @return PageSize The number of rules per page. If this parameter is left empty, 30 rules are displayed per page by default. Maximum value: 30
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The number of rules per page. If this parameter is left empty, 30 rules are displayed per page by default. Maximum value: 30
     * @param PageSize The number of rules per page. If this parameter is left empty, 30 rules are displayed per page by default. Maximum value: 30
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Query type (optional). Valid values: match (query by matchCode or matchName), rule (query by ruleCode or ruleName), and other types (not filtered) 
     * @return SearchType Query type (optional). Valid values: match (query by matchCode or matchName), rule (query by ruleCode or ruleName), and other types (not filtered)
     */
    public String getSearchType() {
        return this.SearchType;
    }

    /**
     * Set Query type (optional). Valid values: match (query by matchCode or matchName), rule (query by ruleCode or ruleName), and other types (not filtered)
     * @param SearchType Query type (optional). Valid values: match (query by matchCode or matchName), rule (query by ruleCode or ruleName), and other types (not filtered)
     */
    public void setSearchType(String SearchType) {
        this.SearchType = SearchType;
    }

    /**
     * Get Keyword. Enter a keyword about SearchType to query. 
     * @return Keyword Keyword. Enter a keyword about SearchType to query.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword. Enter a keyword about SearchType to query.
     * @param Keyword Keyword. Enter a keyword about SearchType to query.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Tags. Enter a tag for querying. 
     * @return Tags Tags. Enter a tag for querying.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags. Enter a tag for querying.
     * @param Tags Tags. Enter a tag for querying.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public DescribeRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRulesRequest(DescribeRulesRequest source) {
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SearchType", this.SearchType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

