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

public class DescribeCategoryListRequest extends AbstractModel {

    /**
    * <p>Associated knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): CategoryType - classification type, enumeration value, exact match (CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId - parent category ID, exact match</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Pagination page number, starting from 0</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page. Default: 10. Maximum: 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Keyword search</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>Switch configuration</p>
    */
    @SerializedName("SummaryListSwitch")
    @Expose
    private SummaryListSwitch SummaryListSwitch;

    /**
     * Get <p>Associated knowledge base ID</p> 
     * @return KbId <p>Associated knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Associated knowledge base ID</p>
     * @param KbId <p>Associated knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): CategoryType - classification type, enumeration value, exact match (CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId - parent category ID, exact match</p> 
     * @return FilterList <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): CategoryType - classification type, enumeration value, exact match (CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId - parent category ID, exact match</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): CategoryType - classification type, enumeration value, exact match (CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId - parent category ID, exact match</p>
     * @param FilterList <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): CategoryType - classification type, enumeration value, exact match (CATEGORY_TYPE_DOC=1/CATEGORY_TYPE_QA=2); ParentCategoryId - parent category ID, exact match</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Pagination page number, starting from 0</p> 
     * @return PageNumber <p>Pagination page number, starting from 0</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Pagination page number, starting from 0</p>
     * @param PageNumber <p>Pagination page number, starting from 0</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page. Default: 10. Maximum: 100</p> 
     * @return PageSize <p>Number of items per page. Default: 10. Maximum: 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page. Default: 10. Maximum: 100</p>
     * @param PageSize <p>Number of items per page. Default: 10. Maximum: 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Keyword search</p> 
     * @return Query <p>Keyword search</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Keyword search</p>
     * @param Query <p>Keyword search</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>Switch configuration</p> 
     * @return SummaryListSwitch <p>Switch configuration</p>
     */
    public SummaryListSwitch getSummaryListSwitch() {
        return this.SummaryListSwitch;
    }

    /**
     * Set <p>Switch configuration</p>
     * @param SummaryListSwitch <p>Switch configuration</p>
     */
    public void setSummaryListSwitch(SummaryListSwitch SummaryListSwitch) {
        this.SummaryListSwitch = SummaryListSwitch;
    }

    public DescribeCategoryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCategoryListRequest(DescribeCategoryListRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
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
        if (source.SummaryListSwitch != null) {
            this.SummaryListSwitch = new SummaryListSwitch(source.SummaryListSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamObj(map, prefix + "SummaryListSwitch.", this.SummaryListSwitch);

    }
}

