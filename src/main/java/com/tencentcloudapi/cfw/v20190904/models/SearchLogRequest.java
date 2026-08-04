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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchLogRequest extends AbstractModel {

    /**
    * <p>Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>The retrieval and analysis statement has a maximum length of 12 KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and the SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>Search syntax rules. Default value is 0. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (dedicated retrieval syntax for CLS, also the default syntax rule used in the console).</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieval condition syntax rules</a></p>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * <ul><li>Log topic ID to be retrieved and analyzed. Only one log topic can be specified.</li><li>If needed, use the Topics parameter to retrieve multiple log topics.</li><li>The TopicId and Topics parameters cannot be used simultaneously. Only one can be selected in a single request.<br>The log topic IDs are as follows:<br>Access control - Internet boundary: cfw_rule_acl<br>Access control - NAT boundary: cfw_rule_nat_acl<br>Access control - VPC boundary: cfw_rule_vpc_acl<br>Access control - DNS switch: cfw_rule_dns_acl<br>Intrusion defense: cfw_rule_threatinfo<br>Full traffic detection and response logs - Traffic analysis: cfw_netflow_nta<br>Full traffic detection and response logs - Traffic alarm: cfw_rule_ndr_threatinfo<br>Zero trust operations and maintenance - Database logon: cfw_operate_db<br>Zero trust operations and maintenance - Server access: operate_remote_om<br>Zero trust operations and maintenance - Web service access: operate_web_access<br>Zero trust operations and maintenance - Behavioral audit: remoteom_commands<br>Traffic log - Internet boundary: cfw_netflow_border<br>Traffic log - NAT boundary: cfw_netflow_nat<br>Traffic log - VPC boundary: cfw_netflow_vpc<br>Traffic log - DNS switch: cfw_netflow_dns<br>Traffic log - Private network traffic: cfw_netflow_fl<br>Operation log: operate_log_all</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <ul><li>Log topic list for retrieval and analysis, supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul>
    */
    @SerializedName("Topics")
    @Expose
    private MultiTopicSearchInformation [] Topics;

    /**
    * <p>Whether raw logs are returned in time sequence; value range: asc (ascending), desc (descending), default is desc<br>Note:</p><ul><li>Valid only when the search and analysis statement (Query) does not contain SQL</li><li>For SQL result sorting, refer to <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a></li></ul>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>Number of raw logs returned in a single query. Default value: 100. Maximum value: 1000.<br>Note:</p><ul><li>This parameter is valid only when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>You can retrieve more logs in two ways:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. You can retrieve up to 10,000 entries of raw logs in total.</li><li>Offset: The offset indicates the line number from which to start returning raw logs. There is no log entry limit.</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Query the offset of raw logs, indicating the line number from which to start returning raw logs. Default value is 0.<br>Note:</p><ul><li>Applicable only when the retrieval and analysis statement (Query) does not contain SQL.</li><li>Cannot be used with the Context parameter.</li><li>Applicable only for single log topic retrieval.</li></ul>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be obtained is up to 10,000 entries. The expiration time is 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>This is valid only when the search and analysis statement (Query) does not contain SQL. For obtaining subsequent results with SQL, refer to <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>When performing statistical analysis (SQL included in Query), whether to sample raw logs first and then perform statistical analysis.<br>0: Automatic sampling;<br>0–1: Sample at the specified sampling rate, for example 0.02;<br>1: Indicates no sampling, that is, precision analysis.<br>Default value: 1</p>
    */
    @SerializedName("SamplingRate")
    @Expose
    private Float SamplingRate;

    /**
    * <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output parameters AnalysisResults and ColNames are valid.<br>The two return methods have a slight difference in encoding format. It is recommended to use true.</p>
    */
    @SerializedName("UseNewAnalysis")
    @Expose
    private Boolean UseNewAnalysis;

    /**
     * Get <p>Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p> 
     * @return From <p>Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p>
     * @param From <p>Start time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p> 
     * @return To <p>End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p>
     * @param To <p>End time for logs to be searched and analyzed, which is a Unix timestamp in milliseconds</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>The retrieval and analysis statement has a maximum length of 12 KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and the SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p> 
     * @return Query <p>The retrieval and analysis statement has a maximum length of 12 KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and the SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>The retrieval and analysis statement has a maximum length of 12 KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and the SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p>
     * @param Query <p>The retrieval and analysis statement has a maximum length of 12 KB.<br>The statement consists of <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1" target="_blank">[retrieval condition]</a> | <a href="https://www.tencentcloud.com/document/product/614/44061?from_cn_redirect=1" target="_blank">[SQL statement]</a>. When there is no need to perform statistical analysis on logs, the pipe character <code> | </code> and the SQL statement can be omitted.<br>Use * or an empty string to search all logs.</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>Search syntax rules. Default value is 0. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (dedicated retrieval syntax for CLS, also the default syntax rule used in the console).</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieval condition syntax rules</a></p> 
     * @return SyntaxRule <p>Search syntax rules. Default value is 0. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (dedicated retrieval syntax for CLS, also the default syntax rule used in the console).</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieval condition syntax rules</a></p>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p>Search syntax rules. Default value is 0. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (dedicated retrieval syntax for CLS, also the default syntax rule used in the console).</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieval condition syntax rules</a></p>
     * @param SyntaxRule <p>Search syntax rules. Default value is 0. Recommended for use is 1.</p><ul><li>0: Lucene syntax</li><li>1: CQL syntax (dedicated retrieval syntax for CLS, also the default syntax rule used in the console).</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieval condition syntax rules</a></p>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get <ul><li>Log topic ID to be retrieved and analyzed. Only one log topic can be specified.</li><li>If needed, use the Topics parameter to retrieve multiple log topics.</li><li>The TopicId and Topics parameters cannot be used simultaneously. Only one can be selected in a single request.<br>The log topic IDs are as follows:<br>Access control - Internet boundary: cfw_rule_acl<br>Access control - NAT boundary: cfw_rule_nat_acl<br>Access control - VPC boundary: cfw_rule_vpc_acl<br>Access control - DNS switch: cfw_rule_dns_acl<br>Intrusion defense: cfw_rule_threatinfo<br>Full traffic detection and response logs - Traffic analysis: cfw_netflow_nta<br>Full traffic detection and response logs - Traffic alarm: cfw_rule_ndr_threatinfo<br>Zero trust operations and maintenance - Database logon: cfw_operate_db<br>Zero trust operations and maintenance - Server access: operate_remote_om<br>Zero trust operations and maintenance - Web service access: operate_web_access<br>Zero trust operations and maintenance - Behavioral audit: remoteom_commands<br>Traffic log - Internet boundary: cfw_netflow_border<br>Traffic log - NAT boundary: cfw_netflow_nat<br>Traffic log - VPC boundary: cfw_netflow_vpc<br>Traffic log - DNS switch: cfw_netflow_dns<br>Traffic log - Private network traffic: cfw_netflow_fl<br>Operation log: operate_log_all</li></ul> 
     * @return TopicId <ul><li>Log topic ID to be retrieved and analyzed. Only one log topic can be specified.</li><li>If needed, use the Topics parameter to retrieve multiple log topics.</li><li>The TopicId and Topics parameters cannot be used simultaneously. Only one can be selected in a single request.<br>The log topic IDs are as follows:<br>Access control - Internet boundary: cfw_rule_acl<br>Access control - NAT boundary: cfw_rule_nat_acl<br>Access control - VPC boundary: cfw_rule_vpc_acl<br>Access control - DNS switch: cfw_rule_dns_acl<br>Intrusion defense: cfw_rule_threatinfo<br>Full traffic detection and response logs - Traffic analysis: cfw_netflow_nta<br>Full traffic detection and response logs - Traffic alarm: cfw_rule_ndr_threatinfo<br>Zero trust operations and maintenance - Database logon: cfw_operate_db<br>Zero trust operations and maintenance - Server access: operate_remote_om<br>Zero trust operations and maintenance - Web service access: operate_web_access<br>Zero trust operations and maintenance - Behavioral audit: remoteom_commands<br>Traffic log - Internet boundary: cfw_netflow_border<br>Traffic log - NAT boundary: cfw_netflow_nat<br>Traffic log - VPC boundary: cfw_netflow_vpc<br>Traffic log - DNS switch: cfw_netflow_dns<br>Traffic log - Private network traffic: cfw_netflow_fl<br>Operation log: operate_log_all</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <ul><li>Log topic ID to be retrieved and analyzed. Only one log topic can be specified.</li><li>If needed, use the Topics parameter to retrieve multiple log topics.</li><li>The TopicId and Topics parameters cannot be used simultaneously. Only one can be selected in a single request.<br>The log topic IDs are as follows:<br>Access control - Internet boundary: cfw_rule_acl<br>Access control - NAT boundary: cfw_rule_nat_acl<br>Access control - VPC boundary: cfw_rule_vpc_acl<br>Access control - DNS switch: cfw_rule_dns_acl<br>Intrusion defense: cfw_rule_threatinfo<br>Full traffic detection and response logs - Traffic analysis: cfw_netflow_nta<br>Full traffic detection and response logs - Traffic alarm: cfw_rule_ndr_threatinfo<br>Zero trust operations and maintenance - Database logon: cfw_operate_db<br>Zero trust operations and maintenance - Server access: operate_remote_om<br>Zero trust operations and maintenance - Web service access: operate_web_access<br>Zero trust operations and maintenance - Behavioral audit: remoteom_commands<br>Traffic log - Internet boundary: cfw_netflow_border<br>Traffic log - NAT boundary: cfw_netflow_nat<br>Traffic log - VPC boundary: cfw_netflow_vpc<br>Traffic log - DNS switch: cfw_netflow_dns<br>Traffic log - Private network traffic: cfw_netflow_fl<br>Operation log: operate_log_all</li></ul>
     * @param TopicId <ul><li>Log topic ID to be retrieved and analyzed. Only one log topic can be specified.</li><li>If needed, use the Topics parameter to retrieve multiple log topics.</li><li>The TopicId and Topics parameters cannot be used simultaneously. Only one can be selected in a single request.<br>The log topic IDs are as follows:<br>Access control - Internet boundary: cfw_rule_acl<br>Access control - NAT boundary: cfw_rule_nat_acl<br>Access control - VPC boundary: cfw_rule_vpc_acl<br>Access control - DNS switch: cfw_rule_dns_acl<br>Intrusion defense: cfw_rule_threatinfo<br>Full traffic detection and response logs - Traffic analysis: cfw_netflow_nta<br>Full traffic detection and response logs - Traffic alarm: cfw_rule_ndr_threatinfo<br>Zero trust operations and maintenance - Database logon: cfw_operate_db<br>Zero trust operations and maintenance - Server access: operate_remote_om<br>Zero trust operations and maintenance - Web service access: operate_web_access<br>Zero trust operations and maintenance - Behavioral audit: remoteom_commands<br>Traffic log - Internet boundary: cfw_netflow_border<br>Traffic log - NAT boundary: cfw_netflow_nat<br>Traffic log - VPC boundary: cfw_netflow_vpc<br>Traffic log - DNS switch: cfw_netflow_dns<br>Traffic log - Private network traffic: cfw_netflow_fl<br>Operation log: operate_log_all</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <ul><li>Log topic list for retrieval and analysis, supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul> 
     * @return Topics <ul><li>Log topic list for retrieval and analysis, supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul>
     */
    public MultiTopicSearchInformation [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <ul><li>Log topic list for retrieval and analysis, supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul>
     * @param Topics <ul><li>Log topic list for retrieval and analysis, supports a maximum of 50 log topics.</li><li>Use TopicId to retrieve a single log topic.</li><li>TopicId and Topics cannot be used simultaneously. Only select one in a single request.</li></ul>
     */
    public void setTopics(MultiTopicSearchInformation [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>Whether raw logs are returned in time sequence; value range: asc (ascending), desc (descending), default is desc<br>Note:</p><ul><li>Valid only when the search and analysis statement (Query) does not contain SQL</li><li>For SQL result sorting, refer to <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a></li></ul> 
     * @return Sort <p>Whether raw logs are returned in time sequence; value range: asc (ascending), desc (descending), default is desc<br>Note:</p><ul><li>Valid only when the search and analysis statement (Query) does not contain SQL</li><li>For SQL result sorting, refer to <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a></li></ul>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Whether raw logs are returned in time sequence; value range: asc (ascending), desc (descending), default is desc<br>Note:</p><ul><li>Valid only when the search and analysis statement (Query) does not contain SQL</li><li>For SQL result sorting, refer to <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a></li></ul>
     * @param Sort <p>Whether raw logs are returned in time sequence; value range: asc (ascending), desc (descending), default is desc<br>Note:</p><ul><li>Valid only when the search and analysis statement (Query) does not contain SQL</li><li>For SQL result sorting, refer to <a href="https://www.tencentcloud.com/document/product/614/58978?from_cn_redirect=1" target="_blank">SQL ORDER BY syntax</a></li></ul>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>Number of raw logs returned in a single query. Default value: 100. Maximum value: 1000.<br>Note:</p><ul><li>This parameter is valid only when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>You can retrieve more logs in two ways:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. You can retrieve up to 10,000 entries of raw logs in total.</li><li>Offset: The offset indicates the line number from which to start returning raw logs. There is no log entry limit.</li></ul> 
     * @return Limit <p>Number of raw logs returned in a single query. Default value: 100. Maximum value: 1000.<br>Note:</p><ul><li>This parameter is valid only when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>You can retrieve more logs in two ways:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. You can retrieve up to 10,000 entries of raw logs in total.</li><li>Offset: The offset indicates the line number from which to start returning raw logs. There is no log entry limit.</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of raw logs returned in a single query. Default value: 100. Maximum value: 1000.<br>Note:</p><ul><li>This parameter is valid only when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>You can retrieve more logs in two ways:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. You can retrieve up to 10,000 entries of raw logs in total.</li><li>Offset: The offset indicates the line number from which to start returning raw logs. There is no log entry limit.</li></ul>
     * @param Limit <p>Number of raw logs returned in a single query. Default value: 100. Maximum value: 1000.<br>Note:</p><ul><li>This parameter is valid only when the search and analysis statement (Query) does not contain SQL.</li><li>For the method for specifying SQL result count, see <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul><p>You can retrieve more logs in two ways:</p><ul><li>Context: Pass the Context value returned by the last API call to retrieve more logs. You can retrieve up to 10,000 entries of raw logs in total.</li><li>Offset: The offset indicates the line number from which to start returning raw logs. There is no log entry limit.</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Query the offset of raw logs, indicating the line number from which to start returning raw logs. Default value is 0.<br>Note:</p><ul><li>Applicable only when the retrieval and analysis statement (Query) does not contain SQL.</li><li>Cannot be used with the Context parameter.</li><li>Applicable only for single log topic retrieval.</li></ul> 
     * @return Offset <p>Query the offset of raw logs, indicating the line number from which to start returning raw logs. Default value is 0.<br>Note:</p><ul><li>Applicable only when the retrieval and analysis statement (Query) does not contain SQL.</li><li>Cannot be used with the Context parameter.</li><li>Applicable only for single log topic retrieval.</li></ul>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Query the offset of raw logs, indicating the line number from which to start returning raw logs. Default value is 0.<br>Note:</p><ul><li>Applicable only when the retrieval and analysis statement (Query) does not contain SQL.</li><li>Cannot be used with the Context parameter.</li><li>Applicable only for single log topic retrieval.</li></ul>
     * @param Offset <p>Query the offset of raw logs, indicating the line number from which to start returning raw logs. Default value is 0.<br>Note:</p><ul><li>Applicable only when the retrieval and analysis statement (Query) does not contain SQL.</li><li>Cannot be used with the Context parameter.</li><li>Applicable only for single log topic retrieval.</li></ul>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be obtained is up to 10,000 entries. The expiration time is 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>This is valid only when the search and analysis statement (Query) does not contain SQL. For obtaining subsequent results with SQL, refer to <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul> 
     * @return Context <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be obtained is up to 10,000 entries. The expiration time is 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>This is valid only when the search and analysis statement (Query) does not contain SQL. For obtaining subsequent results with SQL, refer to <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be obtained is up to 10,000 entries. The expiration time is 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>This is valid only when the search and analysis statement (Query) does not contain SQL. For obtaining subsequent results with SQL, refer to <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul>
     * @param Context <p>Pass the Context value returned by the last API call to obtain more logs later. The total number of raw logs that can be obtained is up to 10,000 entries. The expiration time is 1 hour.<br>Note:</p><ul><li>When passing this parameter, do not modify other parameters.</li><li>Applicable only for single log topic retrieval. To retrieve multiple log topics, use the Context in Topics.</li><li>This is valid only when the search and analysis statement (Query) does not contain SQL. For obtaining subsequent results with SQL, refer to <a href="https://www.tencentcloud.com/document/product/614/58977?from_cn_redirect=1" target="_blank">SQL LIMIT syntax</a>.</li></ul>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>When performing statistical analysis (SQL included in Query), whether to sample raw logs first and then perform statistical analysis.<br>0: Automatic sampling;<br>0–1: Sample at the specified sampling rate, for example 0.02;<br>1: Indicates no sampling, that is, precision analysis.<br>Default value: 1</p> 
     * @return SamplingRate <p>When performing statistical analysis (SQL included in Query), whether to sample raw logs first and then perform statistical analysis.<br>0: Automatic sampling;<br>0–1: Sample at the specified sampling rate, for example 0.02;<br>1: Indicates no sampling, that is, precision analysis.<br>Default value: 1</p>
     */
    public Float getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set <p>When performing statistical analysis (SQL included in Query), whether to sample raw logs first and then perform statistical analysis.<br>0: Automatic sampling;<br>0–1: Sample at the specified sampling rate, for example 0.02;<br>1: Indicates no sampling, that is, precision analysis.<br>Default value: 1</p>
     * @param SamplingRate <p>When performing statistical analysis (SQL included in Query), whether to sample raw logs first and then perform statistical analysis.<br>0: Automatic sampling;<br>0–1: Sample at the specified sampling rate, for example 0.02;<br>1: Indicates no sampling, that is, precision analysis.<br>Default value: 1</p>
     */
    public void setSamplingRate(Float SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output parameters AnalysisResults and ColNames are valid.<br>The two return methods have a slight difference in encoding format. It is recommended to use true.</p> 
     * @return UseNewAnalysis <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output parameters AnalysisResults and ColNames are valid.<br>The two return methods have a slight difference in encoding format. It is recommended to use true.</p>
     */
    public Boolean getUseNewAnalysis() {
        return this.UseNewAnalysis;
    }

    /**
     * Set <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output parameters AnalysisResults and ColNames are valid.<br>The two return methods have a slight difference in encoding format. It is recommended to use true.</p>
     * @param UseNewAnalysis <p>true means using the new retrieval result return method, and output parameters AnalysisRecords and Columns are valid.<br>false means using the old retrieval result return method, and output parameters AnalysisResults and ColNames are valid.<br>The two return methods have a slight difference in encoding format. It is recommended to use true.</p>
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
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "UseNewAnalysis", this.UseNewAnalysis);

    }
}

