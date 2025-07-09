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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogRequest extends AbstractModel {

    /**
    * Start time of the log to be searched, which is a Unix timestamp in milliseconds
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of the log to be searched, which is a Unix timestamp in milliseconds
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Search and analysis statement. Maximum length: 12 KB
A statement is in the format of <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[search criteria]</a> | <a href="https://intl.cloud.tencent.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. You can omit the pipe symbol <code> | </code> and SQL statement when log analysis is not required.
Queries all logs using * or an empty string
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Retrieval syntax rule, default is 0, recommended to use 1 (CQL syntax).0: Lucene syntax, 1: CQL syntax.
For detailed explanation, refer to <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * - The ID of the log topic to be searched for. Only one log topic can be specified.
- To search for multiple log topics at a time, use the `Topics` parameter.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * - The IDs of the log topics (up to 20) to be searched for.
- To search for a single log topic, use the `TopicId` parameter.
- You cannot use both `TopicId` and `Topics`.
    */
    @SerializedName("Topics")
    @Expose
    private MultiTopicSearchInformation [] Topics;

    /**
    * Specifies the number of raw logs returned in a single query, default is 100, maximum is 1000. To obtain subsequent logs, use the Context parameter.Note:* This is only valid when the search and analysis statement (Query) does not contain SQL* Method for specifying SQL result count refers to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Time order of the logs returned. Valid values: `asc` (ascending); `desc`: (descending). Default value: `desc`
Notes:
* This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
* To sort the analysis results, see <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>.
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* Only applicable for single log topic retrieval. When retrieving multiple log topics, use the Context in Topics.* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * Indicates whether to sample raw logs before statistical analysis (`Query` includes SQL statements).
`0`: Auto-sample.
`0-1`: Sample by the specified sample rate, such as `0.02`.
`1`: Precise analysis without sampling.
Default value: `1`
    */
    @SerializedName("SamplingRate")
    @Expose
    private Float SamplingRate;

    /**
    * If the value is `true`, the new response method will be used, and the output parameters `AnalysisRecords` and `Columns` will be valid.
If the value is `false`, the old response method will be used, and the output parameters `AnalysisResults` and `ColNames` will be valid.
The two response methods differ slightly in terms of encoding format. You are advised to use the new method (`true`).
    */
    @SerializedName("UseNewAnalysis")
    @Expose
    private Boolean UseNewAnalysis;

    /**
     * Get Start time of the log to be searched, which is a Unix timestamp in milliseconds 
     * @return From Start time of the log to be searched, which is a Unix timestamp in milliseconds
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time of the log to be searched, which is a Unix timestamp in milliseconds
     * @param From Start time of the log to be searched, which is a Unix timestamp in milliseconds
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of the log to be searched, which is a Unix timestamp in milliseconds 
     * @return To End time of the log to be searched, which is a Unix timestamp in milliseconds
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of the log to be searched, which is a Unix timestamp in milliseconds
     * @param To End time of the log to be searched, which is a Unix timestamp in milliseconds
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Search and analysis statement. Maximum length: 12 KB
A statement is in the format of <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[search criteria]</a> | <a href="https://intl.cloud.tencent.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. You can omit the pipe symbol <code> | </code> and SQL statement when log analysis is not required.
Queries all logs using * or an empty string 
     * @return Query Search and analysis statement. Maximum length: 12 KB
A statement is in the format of <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[search criteria]</a> | <a href="https://intl.cloud.tencent.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. You can omit the pipe symbol <code> | </code> and SQL statement when log analysis is not required.
Queries all logs using * or an empty string
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Search and analysis statement. Maximum length: 12 KB
A statement is in the format of <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[search criteria]</a> | <a href="https://intl.cloud.tencent.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. You can omit the pipe symbol <code> | </code> and SQL statement when log analysis is not required.
Queries all logs using * or an empty string
     * @param Query Search and analysis statement. Maximum length: 12 KB
A statement is in the format of <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[search criteria]</a> | <a href="https://intl.cloud.tencent.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. You can omit the pipe symbol <code> | </code> and SQL statement when log analysis is not required.
Queries all logs using * or an empty string
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Retrieval syntax rule, default is 0, recommended to use 1 (CQL syntax).0: Lucene syntax, 1: CQL syntax.
For detailed explanation, refer to <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a> 
     * @return SyntaxRule Retrieval syntax rule, default is 0, recommended to use 1 (CQL syntax).0: Lucene syntax, 1: CQL syntax.
For detailed explanation, refer to <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set Retrieval syntax rule, default is 0, recommended to use 1 (CQL syntax).0: Lucene syntax, 1: CQL syntax.
For detailed explanation, refer to <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a>
     * @param SyntaxRule Retrieval syntax rule, default is 0, recommended to use 1 (CQL syntax).0: Lucene syntax, 1: CQL syntax.
For detailed explanation, refer to <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get - The ID of the log topic to be searched for. Only one log topic can be specified.
- To search for multiple log topics at a time, use the `Topics` parameter. 
     * @return TopicId - The ID of the log topic to be searched for. Only one log topic can be specified.
- To search for multiple log topics at a time, use the `Topics` parameter.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set - The ID of the log topic to be searched for. Only one log topic can be specified.
- To search for multiple log topics at a time, use the `Topics` parameter.
     * @param TopicId - The ID of the log topic to be searched for. Only one log topic can be specified.
- To search for multiple log topics at a time, use the `Topics` parameter.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get - The IDs of the log topics (up to 20) to be searched for.
- To search for a single log topic, use the `TopicId` parameter.
- You cannot use both `TopicId` and `Topics`. 
     * @return Topics - The IDs of the log topics (up to 20) to be searched for.
- To search for a single log topic, use the `TopicId` parameter.
- You cannot use both `TopicId` and `Topics`.
     */
    public MultiTopicSearchInformation [] getTopics() {
        return this.Topics;
    }

    /**
     * Set - The IDs of the log topics (up to 20) to be searched for.
- To search for a single log topic, use the `TopicId` parameter.
- You cannot use both `TopicId` and `Topics`.
     * @param Topics - The IDs of the log topics (up to 20) to be searched for.
- To search for a single log topic, use the `TopicId` parameter.
- You cannot use both `TopicId` and `Topics`.
     */
    public void setTopics(MultiTopicSearchInformation [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get Specifies the number of raw logs returned in a single query, default is 100, maximum is 1000. To obtain subsequent logs, use the Context parameter.Note:* This is only valid when the search and analysis statement (Query) does not contain SQL* Method for specifying SQL result count refers to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a> 
     * @return Limit Specifies the number of raw logs returned in a single query, default is 100, maximum is 1000. To obtain subsequent logs, use the Context parameter.Note:* This is only valid when the search and analysis statement (Query) does not contain SQL* Method for specifying SQL result count refers to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Specifies the number of raw logs returned in a single query, default is 100, maximum is 1000. To obtain subsequent logs, use the Context parameter.Note:* This is only valid when the search and analysis statement (Query) does not contain SQL* Method for specifying SQL result count refers to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     * @param Limit Specifies the number of raw logs returned in a single query, default is 100, maximum is 1000. To obtain subsequent logs, use the Context parameter.Note:* This is only valid when the search and analysis statement (Query) does not contain SQL* Method for specifying SQL result count refers to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Time order of the logs returned. Valid values: `asc` (ascending); `desc`: (descending). Default value: `desc`
Notes:
* This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
* To sort the analysis results, see <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>. 
     * @return Sort Time order of the logs returned. Valid values: `asc` (ascending); `desc`: (descending). Default value: `desc`
Notes:
* This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
* To sort the analysis results, see <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>.
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Time order of the logs returned. Valid values: `asc` (ascending); `desc`: (descending). Default value: `desc`
Notes:
* This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
* To sort the analysis results, see <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>.
     * @param Sort Time order of the logs returned. Valid values: `asc` (ascending); `desc`: (descending). Default value: `desc`
Notes:
* This parameter is valid only when the query statement (`Query`) does not contain an SQL statement.
* To sort the analysis results, see <a href="https://intl.cloud.tencent.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY Syntax</a>.
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* Only applicable for single log topic retrieval. When retrieving multiple log topics, use the Context in Topics.* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a> 
     * @return Context Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* Only applicable for single log topic retrieval. When retrieving multiple log topics, use the Context in Topics.* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* Only applicable for single log topic retrieval. When retrieving multiple log topics, use the Context in Topics.* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     * @param Context Pass the Context value returned by the last API call to retrieve more subsequent logs. A total of up to 10,000 raw logs can be obtained, with an expiration time of 1 hour.Note:* When passing this parameter, do not modify any other parameters except for this one* Only applicable for single log topic retrieval. When retrieving multiple log topics, use the Context in Topics.* This is only valid when the retrieval analysis statement (Query) does not contain SQL. For obtaining subsequent SQL results, refer to <a href="https://intl.cloud.tencent.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT Syntax</a>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get Indicates whether to sample raw logs before statistical analysis (`Query` includes SQL statements).
`0`: Auto-sample.
`0-1`: Sample by the specified sample rate, such as `0.02`.
`1`: Precise analysis without sampling.
Default value: `1` 
     * @return SamplingRate Indicates whether to sample raw logs before statistical analysis (`Query` includes SQL statements).
`0`: Auto-sample.
`0-1`: Sample by the specified sample rate, such as `0.02`.
`1`: Precise analysis without sampling.
Default value: `1`
     */
    public Float getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set Indicates whether to sample raw logs before statistical analysis (`Query` includes SQL statements).
`0`: Auto-sample.
`0-1`: Sample by the specified sample rate, such as `0.02`.
`1`: Precise analysis without sampling.
Default value: `1`
     * @param SamplingRate Indicates whether to sample raw logs before statistical analysis (`Query` includes SQL statements).
`0`: Auto-sample.
`0-1`: Sample by the specified sample rate, such as `0.02`.
`1`: Precise analysis without sampling.
Default value: `1`
     */
    public void setSamplingRate(Float SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get If the value is `true`, the new response method will be used, and the output parameters `AnalysisRecords` and `Columns` will be valid.
If the value is `false`, the old response method will be used, and the output parameters `AnalysisResults` and `ColNames` will be valid.
The two response methods differ slightly in terms of encoding format. You are advised to use the new method (`true`). 
     * @return UseNewAnalysis If the value is `true`, the new response method will be used, and the output parameters `AnalysisRecords` and `Columns` will be valid.
If the value is `false`, the old response method will be used, and the output parameters `AnalysisResults` and `ColNames` will be valid.
The two response methods differ slightly in terms of encoding format. You are advised to use the new method (`true`).
     */
    public Boolean getUseNewAnalysis() {
        return this.UseNewAnalysis;
    }

    /**
     * Set If the value is `true`, the new response method will be used, and the output parameters `AnalysisRecords` and `Columns` will be valid.
If the value is `false`, the old response method will be used, and the output parameters `AnalysisResults` and `ColNames` will be valid.
The two response methods differ slightly in terms of encoding format. You are advised to use the new method (`true`).
     * @param UseNewAnalysis If the value is `true`, the new response method will be used, and the output parameters `AnalysisRecords` and `Columns` will be valid.
If the value is `false`, the old response method will be used, and the output parameters `AnalysisResults` and `ColNames` will be valid.
The two response methods differ slightly in terms of encoding format. You are advised to use the new method (`true`).
     */
    public void setUseNewAnalysis(Boolean UseNewAnalysis) {
        this.UseNewAnalysis = UseNewAnalysis;
    }

    public SearchLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchLogRequest(SearchLogRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Topics != null) {
            this.Topics = new MultiTopicSearchInformation[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new MultiTopicSearchInformation(source.Topics[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.SamplingRate != null) {
            this.SamplingRate = new Float(source.SamplingRate);
        }
        if (source.UseNewAnalysis != null) {
            this.UseNewAnalysis = new Boolean(source.UseNewAnalysis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "UseNewAnalysis", this.UseNewAnalysis);

    }
}

