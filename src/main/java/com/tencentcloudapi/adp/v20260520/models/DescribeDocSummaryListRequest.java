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

public class DescribeDocSummaryListRequest extends AbstractModel {

    /**
    * <p>ID of the knowledge base it belongs to</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status - document status, enumeration value, exact match; CategoryId - category ID, exact match; SourceType - document source type, enumeration value, exact match; EffectiveDomain - application scope, exact match; CreateTime - creation time, Unix seconds, BETWEEN with [start second, end second]; UpdateTime - update time, Unix seconds, BETWEEN with [start second, end second]</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Page number, starting from 0.</p>
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
    * <p>Query condition (keyword + query scope)</p>
    */
    @SerializedName("Query")
    @Expose
    private DocQuery Query;

    /**
    * <p>Switch configuration</p>
    */
    @SerializedName("SummaryListSwitch")
    @Expose
    private SummaryListSwitch SummaryListSwitch;

    /**
     * Get <p>ID of the knowledge base it belongs to</p> 
     * @return KbId <p>ID of the knowledge base it belongs to</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>ID of the knowledge base it belongs to</p>
     * @param KbId <p>ID of the knowledge base it belongs to</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status - document status, enumeration value, exact match; CategoryId - category ID, exact match; SourceType - document source type, enumeration value, exact match; EffectiveDomain - application scope, exact match; CreateTime - creation time, Unix seconds, BETWEEN with [start second, end second]; UpdateTime - update time, Unix seconds, BETWEEN with [start second, end second]</p> 
     * @return FilterList <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status - document status, enumeration value, exact match; CategoryId - category ID, exact match; SourceType - document source type, enumeration value, exact match; EffectiveDomain - application scope, exact match; CreateTime - creation time, Unix seconds, BETWEEN with [start second, end second]; UpdateTime - update time, Unix seconds, BETWEEN with [start second, end second]</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status - document status, enumeration value, exact match; CategoryId - category ID, exact match; SourceType - document source type, enumeration value, exact match; EffectiveDomain - application scope, exact match; CreateTime - creation time, Unix seconds, BETWEEN with [start second, end second]; UpdateTime - update time, Unix seconds, BETWEEN with [start second, end second]</p>
     * @param FilterList <p>Filter criteria (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status - document status, enumeration value, exact match; CategoryId - category ID, exact match; SourceType - document source type, enumeration value, exact match; EffectiveDomain - application scope, exact match; CreateTime - creation time, Unix seconds, BETWEEN with [start second, end second]; UpdateTime - update time, Unix seconds, BETWEEN with [start second, end second]</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Page number, starting from 0.</p> 
     * @return PageNumber <p>Page number, starting from 0.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number, starting from 0.</p>
     * @param PageNumber <p>Page number, starting from 0.</p>
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
     * Get <p>Query condition (keyword + query scope)</p> 
     * @return Query <p>Query condition (keyword + query scope)</p>
     */
    public DocQuery getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Query condition (keyword + query scope)</p>
     * @param Query <p>Query condition (keyword + query scope)</p>
     */
    public void setQuery(DocQuery Query) {
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

    public DescribeDocSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocSummaryListRequest(DescribeDocSummaryListRequest source) {
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
            this.Query = new DocQuery(source.Query);
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
        this.setParamObj(map, prefix + "Query.", this.Query);
        this.setParamObj(map, prefix + "SummaryListSwitch.", this.SummaryListSwitch);

    }
}

