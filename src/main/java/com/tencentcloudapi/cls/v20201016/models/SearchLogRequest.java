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
    * <p>Start time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>End time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>The retrieval analysis statement has a maximum length of 12KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p><p>Default value: empty string</p>
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * <p>Search syntax rules. Default value is 1. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, dedicated retrieval syntax for log service)</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">retrieval condition syntax rules</a>.</p><p>Default value: 1</p>
    */
    @SerializedName("QuerySyntax")
    @Expose
    private Long QuerySyntax;

    /**
    * <ul><li>Log topic ID to be retrieved and analyzed. Only one can be specified.</li><li>If needed to retrieve multiple log topics at the same time, please use the Topics parameter.</li><li>TopicId and Topics cannot include both. Only select one in a single request.</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <ul><li>Log topic list for retrieval and analysis supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul>
    */
    @SerializedName("Topics")
    @Expose
    private MultiTopicSearchInformation [] Topics;

    /**
    * <p>Whether raw logs are returned in time sequence. Value range: asc (ascending), desc (descending). Default is desc.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For SQL result sorting, see <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a>.</li></ul>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>Number of raw logs returned in a single query. Default is 100, maximum value is 1000.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>There are two methods to retrieve more logs:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. The total number of raw logs that can be obtained is up to 10,000 entries.</li><li>Offset: The offset refers to the line number from which raw logs start to return. There is no log entry limit.</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset of the raw log Query, indicating the line number from which the raw log starts to return, defaults to 0.<br>Note:</p><ul><li>Valid only when the retrieval statement (Query) does not contain SQL</li><li>Cannot be used with Context parameter simultaneously</li><li>Applicable only for single log topic retrieval</li></ul>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be retrieved is up to 10,000 entries, with an expiration time of 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters except this one.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>Valid only when the search and analysis statement (Query) does not contain SQL. For SQL to obtain follow-up results, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>Whether to sample raw logs first and then perform statistical analysis when executing statistical analysis (SQL included in Query).<br>0: auto-sample;<br>0–1: sample at the specified sampling rate, such as 0.02;<br>1: indicates no sampling, that is, precise analysis.<br>The default value is 1.</p>
    */
    @SerializedName("SamplingRate")
    @Expose
    private Float SamplingRate;

    /**
    * <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output AnalysisResults and ColNames are valid.<br>There is a slight difference in encoding format between the two return methods. Recommend using true.</p>
    */
    @SerializedName("UseNewAnalysis")
    @Expose
    private Boolean UseNewAnalysis;

    /**
    * <p>Whether to highlight keywords that meet retrieval criteria, generally used for highlighting. Only key-value retrieval is supported, full-text retrieval is not supported.</p>
    */
    @SerializedName("HighLight")
    @Expose
    private Boolean HighLight;

    /**
    * <p><strong>The Query field is deprecated. Please use the QueryString field.</strong><br>Field differences: When the syntax rule is not specified, Query uses Lucene syntax by default, while QueryString uses CQL syntax. For syntax differences, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules">Syntax Rule</a>.</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p><strong>The SyntaxRule field is deprecated. Please use the QuerySyntax field.</strong></p><p>Field differences:</p><ul><li>SyntaxRule is used in conjunction with the Query field and uses Lucene syntax by default.</li><li>QuerySyntax is used in conjunction with the QueryString field and uses CQL syntax by default.</li></ul><p>SyntaxRule parameter description:</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, a dedicated retrieval syntax for log service)</li></ul>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get <p>Start time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p> 
     * @return From <p>Start time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>Start time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p>
     * @param From <p>Start time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>End time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p> 
     * @return To <p>End time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>End time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p>
     * @param To <p>End time for logs to be searched and analyzed, <strong>Unix timestamp (ms)</strong></p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>The retrieval analysis statement has a maximum length of 12KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p><p>Default value: empty string</p> 
     * @return QueryString <p>The retrieval analysis statement has a maximum length of 12KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p><p>Default value: empty string</p>
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set <p>The retrieval analysis statement has a maximum length of 12KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p><p>Default value: empty string</p>
     * @param QueryString <p>The retrieval analysis statement has a maximum length of 12KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p><p>Default value: empty string</p>
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get <p>Search syntax rules. Default value is 1. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, dedicated retrieval syntax for log service)</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">retrieval condition syntax rules</a>.</p><p>Default value: 1</p> 
     * @return QuerySyntax <p>Search syntax rules. Default value is 1. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, dedicated retrieval syntax for log service)</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">retrieval condition syntax rules</a>.</p><p>Default value: 1</p>
     */
    public Long getQuerySyntax() {
        return this.QuerySyntax;
    }

    /**
     * Set <p>Search syntax rules. Default value is 1. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, dedicated retrieval syntax for log service)</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">retrieval condition syntax rules</a>.</p><p>Default value: 1</p>
     * @param QuerySyntax <p>Search syntax rules. Default value is 1. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, dedicated retrieval syntax for log service)</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">retrieval condition syntax rules</a>.</p><p>Default value: 1</p>
     */
    public void setQuerySyntax(Long QuerySyntax) {
        this.QuerySyntax = QuerySyntax;
    }

    /**
     * Get <ul><li>Log topic ID to be retrieved and analyzed. Only one can be specified.</li><li>If needed to retrieve multiple log topics at the same time, please use the Topics parameter.</li><li>TopicId and Topics cannot include both. Only select one in a single request.</li></ul> 
     * @return TopicId <ul><li>Log topic ID to be retrieved and analyzed. Only one can be specified.</li><li>If needed to retrieve multiple log topics at the same time, please use the Topics parameter.</li><li>TopicId and Topics cannot include both. Only select one in a single request.</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <ul><li>Log topic ID to be retrieved and analyzed. Only one can be specified.</li><li>If needed to retrieve multiple log topics at the same time, please use the Topics parameter.</li><li>TopicId and Topics cannot include both. Only select one in a single request.</li></ul>
     * @param TopicId <ul><li>Log topic ID to be retrieved and analyzed. Only one can be specified.</li><li>If needed to retrieve multiple log topics at the same time, please use the Topics parameter.</li><li>TopicId and Topics cannot include both. Only select one in a single request.</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <ul><li>Log topic list for retrieval and analysis supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul> 
     * @return Topics <ul><li>Log topic list for retrieval and analysis supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul>
     */
    public MultiTopicSearchInformation [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <ul><li>Log topic list for retrieval and analysis supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul>
     * @param Topics <ul><li>Log topic list for retrieval and analysis supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul>
     */
    public void setTopics(MultiTopicSearchInformation [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>Whether raw logs are returned in time sequence. Value range: asc (ascending), desc (descending). Default is desc.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For SQL result sorting, see <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a>.</li></ul> 
     * @return Sort <p>Whether raw logs are returned in time sequence. Value range: asc (ascending), desc (descending). Default is desc.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For SQL result sorting, see <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a>.</li></ul>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Whether raw logs are returned in time sequence. Value range: asc (ascending), desc (descending). Default is desc.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For SQL result sorting, see <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a>.</li></ul>
     * @param Sort <p>Whether raw logs are returned in time sequence. Value range: asc (ascending), desc (descending). Default is desc.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For SQL result sorting, see <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a>.</li></ul>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>Number of raw logs returned in a single query. Default is 100, maximum value is 1000.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>There are two methods to retrieve more logs:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. The total number of raw logs that can be obtained is up to 10,000 entries.</li><li>Offset: The offset refers to the line number from which raw logs start to return. There is no log entry limit.</li></ul> 
     * @return Limit <p>Number of raw logs returned in a single query. Default is 100, maximum value is 1000.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>There are two methods to retrieve more logs:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. The total number of raw logs that can be obtained is up to 10,000 entries.</li><li>Offset: The offset refers to the line number from which raw logs start to return. There is no log entry limit.</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of raw logs returned in a single query. Default is 100, maximum value is 1000.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>There are two methods to retrieve more logs:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. The total number of raw logs that can be obtained is up to 10,000 entries.</li><li>Offset: The offset refers to the line number from which raw logs start to return. There is no log entry limit.</li></ul>
     * @param Limit <p>Number of raw logs returned in a single query. Default is 100, maximum value is 1000.<br>Note:</p><ul><li>Only valid when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>There are two methods to retrieve more logs:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. The total number of raw logs that can be obtained is up to 10,000 entries.</li><li>Offset: The offset refers to the line number from which raw logs start to return. There is no log entry limit.</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset of the raw log Query, indicating the line number from which the raw log starts to return, defaults to 0.<br>Note:</p><ul><li>Valid only when the retrieval statement (Query) does not contain SQL</li><li>Cannot be used with Context parameter simultaneously</li><li>Applicable only for single log topic retrieval</li></ul> 
     * @return Offset <p>Offset of the raw log Query, indicating the line number from which the raw log starts to return, defaults to 0.<br>Note:</p><ul><li>Valid only when the retrieval statement (Query) does not contain SQL</li><li>Cannot be used with Context parameter simultaneously</li><li>Applicable only for single log topic retrieval</li></ul>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset of the raw log Query, indicating the line number from which the raw log starts to return, defaults to 0.<br>Note:</p><ul><li>Valid only when the retrieval statement (Query) does not contain SQL</li><li>Cannot be used with Context parameter simultaneously</li><li>Applicable only for single log topic retrieval</li></ul>
     * @param Offset <p>Offset of the raw log Query, indicating the line number from which the raw log starts to return, defaults to 0.<br>Note:</p><ul><li>Valid only when the retrieval statement (Query) does not contain SQL</li><li>Cannot be used with Context parameter simultaneously</li><li>Applicable only for single log topic retrieval</li></ul>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be retrieved is up to 10,000 entries, with an expiration time of 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters except this one.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>Valid only when the search and analysis statement (Query) does not contain SQL. For SQL to obtain follow-up results, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul> 
     * @return Context <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be retrieved is up to 10,000 entries, with an expiration time of 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters except this one.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>Valid only when the search and analysis statement (Query) does not contain SQL. For SQL to obtain follow-up results, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be retrieved is up to 10,000 entries, with an expiration time of 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters except this one.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>Valid only when the search and analysis statement (Query) does not contain SQL. For SQL to obtain follow-up results, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul>
     * @param Context <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be retrieved is up to 10,000 entries, with an expiration time of 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters except this one.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>Valid only when the search and analysis statement (Query) does not contain SQL. For SQL to obtain follow-up results, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>Whether to sample raw logs first and then perform statistical analysis when executing statistical analysis (SQL included in Query).<br>0: auto-sample;<br>0–1: sample at the specified sampling rate, such as 0.02;<br>1: indicates no sampling, that is, precise analysis.<br>The default value is 1.</p> 
     * @return SamplingRate <p>Whether to sample raw logs first and then perform statistical analysis when executing statistical analysis (SQL included in Query).<br>0: auto-sample;<br>0–1: sample at the specified sampling rate, such as 0.02;<br>1: indicates no sampling, that is, precise analysis.<br>The default value is 1.</p>
     */
    public Float getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set <p>Whether to sample raw logs first and then perform statistical analysis when executing statistical analysis (SQL included in Query).<br>0: auto-sample;<br>0–1: sample at the specified sampling rate, such as 0.02;<br>1: indicates no sampling, that is, precise analysis.<br>The default value is 1.</p>
     * @param SamplingRate <p>Whether to sample raw logs first and then perform statistical analysis when executing statistical analysis (SQL included in Query).<br>0: auto-sample;<br>0–1: sample at the specified sampling rate, such as 0.02;<br>1: indicates no sampling, that is, precise analysis.<br>The default value is 1.</p>
     */
    public void setSamplingRate(Float SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output AnalysisResults and ColNames are valid.<br>There is a slight difference in encoding format between the two return methods. Recommend using true.</p> 
     * @return UseNewAnalysis <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output AnalysisResults and ColNames are valid.<br>There is a slight difference in encoding format between the two return methods. Recommend using true.</p>
     */
    public Boolean getUseNewAnalysis() {
        return this.UseNewAnalysis;
    }

    /**
     * Set <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output AnalysisResults and ColNames are valid.<br>There is a slight difference in encoding format between the two return methods. Recommend using true.</p>
     * @param UseNewAnalysis <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output AnalysisResults and ColNames are valid.<br>There is a slight difference in encoding format between the two return methods. Recommend using true.</p>
     */
    public void setUseNewAnalysis(Boolean UseNewAnalysis) {
        this.UseNewAnalysis = UseNewAnalysis;
    }

    /**
     * Get <p>Whether to highlight keywords that meet retrieval criteria, generally used for highlighting. Only key-value retrieval is supported, full-text retrieval is not supported.</p> 
     * @return HighLight <p>Whether to highlight keywords that meet retrieval criteria, generally used for highlighting. Only key-value retrieval is supported, full-text retrieval is not supported.</p>
     */
    public Boolean getHighLight() {
        return this.HighLight;
    }

    /**
     * Set <p>Whether to highlight keywords that meet retrieval criteria, generally used for highlighting. Only key-value retrieval is supported, full-text retrieval is not supported.</p>
     * @param HighLight <p>Whether to highlight keywords that meet retrieval criteria, generally used for highlighting. Only key-value retrieval is supported, full-text retrieval is not supported.</p>
     */
    public void setHighLight(Boolean HighLight) {
        this.HighLight = HighLight;
    }

    /**
     * Get <p><strong>The Query field is deprecated. Please use the QueryString field.</strong><br>Field differences: When the syntax rule is not specified, Query uses Lucene syntax by default, while QueryString uses CQL syntax. For syntax differences, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules">Syntax Rule</a>.</p> 
     * @return Query <p><strong>The Query field is deprecated. Please use the QueryString field.</strong><br>Field differences: When the syntax rule is not specified, Query uses Lucene syntax by default, while QueryString uses CQL syntax. For syntax differences, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules">Syntax Rule</a>.</p>
     * @deprecated
     */
    @Deprecated
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p><strong>The Query field is deprecated. Please use the QueryString field.</strong><br>Field differences: When the syntax rule is not specified, Query uses Lucene syntax by default, while QueryString uses CQL syntax. For syntax differences, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules">Syntax Rule</a>.</p>
     * @param Query <p><strong>The Query field is deprecated. Please use the QueryString field.</strong><br>Field differences: When the syntax rule is not specified, Query uses Lucene syntax by default, while QueryString uses CQL syntax. For syntax differences, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules">Syntax Rule</a>.</p>
     * @deprecated
     */
    @Deprecated
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p><strong>The SyntaxRule field is deprecated. Please use the QuerySyntax field.</strong></p><p>Field differences:</p><ul><li>SyntaxRule is used in conjunction with the Query field and uses Lucene syntax by default.</li><li>QuerySyntax is used in conjunction with the QueryString field and uses CQL syntax by default.</li></ul><p>SyntaxRule parameter description:</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, a dedicated retrieval syntax for log service)</li></ul> 
     * @return SyntaxRule <p><strong>The SyntaxRule field is deprecated. Please use the QuerySyntax field.</strong></p><p>Field differences:</p><ul><li>SyntaxRule is used in conjunction with the Query field and uses Lucene syntax by default.</li><li>QuerySyntax is used in conjunction with the QueryString field and uses CQL syntax by default.</li></ul><p>SyntaxRule parameter description:</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, a dedicated retrieval syntax for log service)</li></ul>
     * @deprecated
     */
    @Deprecated
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p><strong>The SyntaxRule field is deprecated. Please use the QuerySyntax field.</strong></p><p>Field differences:</p><ul><li>SyntaxRule is used in conjunction with the Query field and uses Lucene syntax by default.</li><li>QuerySyntax is used in conjunction with the QueryString field and uses CQL syntax by default.</li></ul><p>SyntaxRule parameter description:</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, a dedicated retrieval syntax for log service)</li></ul>
     * @param SyntaxRule <p><strong>The SyntaxRule field is deprecated. Please use the QuerySyntax field.</strong></p><p>Field differences:</p><ul><li>SyntaxRule is used in conjunction with the Query field and uses Lucene syntax by default.</li><li>QuerySyntax is used in conjunction with the QueryString field and uses CQL syntax by default.</li></ul><p>SyntaxRule parameter description:</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (CLS Query Language, a dedicated retrieval syntax for log service)</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
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
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.QuerySyntax != null) {
            this.QuerySyntax = new Long(source.QuerySyntax);
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
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        if (source.HighLight != null) {
            this.HighLight = new Boolean(source.HighLight);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "QuerySyntax", this.QuerySyntax);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "UseNewAnalysis", this.UseNewAnalysis);
        this.setParamSimple(map, prefix + "HighLight", this.HighLight);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);

    }
}

