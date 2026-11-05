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

public class ExportQARequest extends AbstractModel {

    /**
    * <p>ID of the knowledge base it belongs to</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Filter conditions (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status-QA status, enumeration value, exact match; CategoryId-category ID, exact match; SourceType-QA source type, enumeration value, exact match; EffectiveDomain-application scope, exact match; DocId-associated document ID, exact match; CreateTime-creation time, Unix seconds, BETWEEN passes [start second, end second]; UpdateTime-update time, Unix seconds, BETWEEN passes [start second, end second]; QaId-QA ID list, exact match, supports multiple values</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Query condition (keyword + query scope), consistent with DescribeQASummaryList</p>
    */
    @SerializedName("Query")
    @Expose
    private QAQuery Query;

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
     * Get <p>Filter conditions (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status-QA status, enumeration value, exact match; CategoryId-category ID, exact match; SourceType-QA source type, enumeration value, exact match; EffectiveDomain-application scope, exact match; DocId-associated document ID, exact match; CreateTime-creation time, Unix seconds, BETWEEN passes [start second, end second]; UpdateTime-update time, Unix seconds, BETWEEN passes [start second, end second]; QaId-QA ID list, exact match, supports multiple values</p> 
     * @return FilterList <p>Filter conditions (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status-QA status, enumeration value, exact match; CategoryId-category ID, exact match; SourceType-QA source type, enumeration value, exact match; EffectiveDomain-application scope, exact match; DocId-associated document ID, exact match; CreateTime-creation time, Unix seconds, BETWEEN passes [start second, end second]; UpdateTime-update time, Unix seconds, BETWEEN passes [start second, end second]; QaId-QA ID list, exact match, supports multiple values</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Filter conditions (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status-QA status, enumeration value, exact match; CategoryId-category ID, exact match; SourceType-QA source type, enumeration value, exact match; EffectiveDomain-application scope, exact match; DocId-associated document ID, exact match; CreateTime-creation time, Unix seconds, BETWEEN passes [start second, end second]; UpdateTime-update time, Unix seconds, BETWEEN passes [start second, end second]; QaId-QA ID list, exact match, supports multiple values</p>
     * @param FilterList <p>Filter conditions (multiple Filters are in an AND relationship, and multiple Values of the same Filter are in an OR relationship): Status-QA status, enumeration value, exact match; CategoryId-category ID, exact match; SourceType-QA source type, enumeration value, exact match; EffectiveDomain-application scope, exact match; DocId-associated document ID, exact match; CreateTime-creation time, Unix seconds, BETWEEN passes [start second, end second]; UpdateTime-update time, Unix seconds, BETWEEN passes [start second, end second]; QaId-QA ID list, exact match, supports multiple values</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Query condition (keyword + query scope), consistent with DescribeQASummaryList</p> 
     * @return Query <p>Query condition (keyword + query scope), consistent with DescribeQASummaryList</p>
     */
    public QAQuery getQuery() {
        return this.Query;
    }

    /**
     * Set <p>Query condition (keyword + query scope), consistent with DescribeQASummaryList</p>
     * @param Query <p>Query condition (keyword + query scope), consistent with DescribeQASummaryList</p>
     */
    public void setQuery(QAQuery Query) {
        this.Query = Query;
    }

    public ExportQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportQARequest(ExportQARequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.Query != null) {
            this.Query = new QAQuery(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamObj(map, prefix + "Query.", this.Query);

    }
}

