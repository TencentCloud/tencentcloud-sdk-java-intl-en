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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRealtimeLogDeliveryTaskRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Data delivery area. Valid values:</p><ul><li>`mainland`: Chinese mainland;</li><li>`overseas`: Global (excluding the Chinese mainland).</li></ul>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs.</li></ul><p>The following log types have been merged into `l7-access-logs`, and no new tasks can be added for them:</p><ul><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint. This task type is not supported when `LogType` = `web-attack`;</li><li>`aws_s3`: deliver to an AWS S3 bucket. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis. This is supported only when `LogType` = `l7-access-logs` or `web-attack`.</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>List of entities that the real-time log delivery task applies to. Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`</li><li>Edge Function instance: `test-zone-2mxigizoh9l9-1257626257`</li></ul>For valid values, see <a href="https://www.tencentcloud.com/document/product/1145/59024">DescribeL4Proxy</a>.
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * <p>List of preset fields to deliver. For valid values, see:</p><ul><li><a href="https://www.tencentcloud.com/document/product/1145/61300">Layer 7 access logs (site acceleration logs)</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/61301">Layer 4 proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/67840">Edge Function execution logs</a></li></ul>For valid values, see also `DescribeLogFields`.
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>List of custom fields to deliver. You can extract specified content from HTTP request headers, response headers, cookies, and request bodies.</p><p>Custom field names must be unique. Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * <p>List of custom expression fields to deliver. By defining the field name and value expression for log delivery, you can deliver personalized real-time log content. For details, see <a href="https://www.tencentcloud.com/document/product/1145/61302">Custom Log Field Expressions</a>.</p><p>Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p><p><strong>Note</strong>: If a field in `CustomExpressionFields` has the same name as a field in `Fields` or `CustomFields`, the value in `CustomExpressionFields` takes precedence.</p>
    */
    @SerializedName("CustomExpressionFields")
    @Expose
    private CustomExpressionField [] CustomExpressionFields;

    /**
    * <p>Filter conditions for log delivery. If left empty, all logs are delivered.</p>
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * <p>Sampling ratio, in per mille. Value range: 1-1000. For example, 605 means a sampling ratio of 60.5%. If left empty, the sampling ratio is 100%.</p>
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1145/64485">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3` or `aws_s3`, the default format is JSON Lines;</li></ul><p>Particularly, when `TaskType` is `cls` or `log_analysis`, the only allowed value for `LogFormat.FormatType` is `json`, and other parameters in `LogFormat` will be ignored. It is recommended not to transfer `LogFormat`.</p>
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * <p>CLS configuration. This parameter is required when `TaskType` is `cls`.</p>
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * <p>Configuration of the custom HTTP service. This parameter is required when `TaskType` is `custom_endpoint`.</p>
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage. This parameter is required when `TaskType` is `s3`.</p>
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

    /**
    * <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3. This parameter is required when `TaskType` is `aws_s3`.</p>
    */
    @SerializedName("AWSS3")
    @Expose
    private AWSS3 AWSS3;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Data delivery area. Valid values:</p><ul><li>`mainland`: Chinese mainland;</li><li>`overseas`: Global (excluding the Chinese mainland).</li></ul> 
     * @return Area <p>Data delivery area. Valid values:</p><ul><li>`mainland`: Chinese mainland;</li><li>`overseas`: Global (excluding the Chinese mainland).</li></ul>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Data delivery area. Valid values:</p><ul><li>`mainland`: Chinese mainland;</li><li>`overseas`: Global (excluding the Chinese mainland).</li></ul>
     * @param Area <p>Data delivery area. Valid values:</p><ul><li>`mainland`: Chinese mainland;</li><li>`overseas`: Global (excluding the Chinese mainland).</li></ul>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs.</li></ul><p>The following log types have been merged into `l7-access-logs`, and no new tasks can be added for them:</p><ul><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul> 
     * @return LogType <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs.</li></ul><p>The following log types have been merged into `l7-access-logs`, and no new tasks can be added for them:</p><ul><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs.</li></ul><p>The following log types have been merged into `l7-access-logs`, and no new tasks can be added for them:</p><ul><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul>
     * @param LogType <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs.</li></ul><p>The following log types have been merged into `l7-access-logs`, and no new tasks can be added for them:</p><ul><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).</p> 
     * @return TaskName <p>Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).</p>
     * @param TaskName <p>Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint. This task type is not supported when `LogType` = `web-attack`;</li><li>`aws_s3`: deliver to an AWS S3 bucket. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis. This is supported only when `LogType` = `l7-access-logs` or `web-attack`.</li></ul> 
     * @return TaskType <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint. This task type is not supported when `LogType` = `web-attack`;</li><li>`aws_s3`: deliver to an AWS S3 bucket. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis. This is supported only when `LogType` = `l7-access-logs` or `web-attack`.</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint. This task type is not supported when `LogType` = `web-attack`;</li><li>`aws_s3`: deliver to an AWS S3 bucket. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis. This is supported only when `LogType` = `l7-access-logs` or `web-attack`.</li></ul>
     * @param TaskType <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint. This task type is not supported when `LogType` = `web-attack`;</li><li>`aws_s3`: deliver to an AWS S3 bucket. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis. This is supported only when `LogType` = `l7-access-logs` or `web-attack`.</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>List of entities that the real-time log delivery task applies to. Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`</li><li>Edge Function instance: `test-zone-2mxigizoh9l9-1257626257`</li></ul>For valid values, see <a href="https://www.tencentcloud.com/document/product/1145/59024">DescribeL4Proxy</a>. 
     * @return EntityList <p>List of entities that the real-time log delivery task applies to. Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`</li><li>Edge Function instance: `test-zone-2mxigizoh9l9-1257626257`</li></ul>For valid values, see <a href="https://www.tencentcloud.com/document/product/1145/59024">DescribeL4Proxy</a>.
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set <p>List of entities that the real-time log delivery task applies to. Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`</li><li>Edge Function instance: `test-zone-2mxigizoh9l9-1257626257`</li></ul>For valid values, see <a href="https://www.tencentcloud.com/document/product/1145/59024">DescribeL4Proxy</a>.
     * @param EntityList <p>List of entities that the real-time log delivery task applies to. Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`</li><li>Edge Function instance: `test-zone-2mxigizoh9l9-1257626257`</li></ul>For valid values, see <a href="https://www.tencentcloud.com/document/product/1145/59024">DescribeL4Proxy</a>.
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get <p>List of preset fields to deliver. For valid values, see:</p><ul><li><a href="https://www.tencentcloud.com/document/product/1145/61300">Layer 7 access logs (site acceleration logs)</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/61301">Layer 4 proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/67840">Edge Function execution logs</a></li></ul>For valid values, see also `DescribeLogFields`. 
     * @return Fields <p>List of preset fields to deliver. For valid values, see:</p><ul><li><a href="https://www.tencentcloud.com/document/product/1145/61300">Layer 7 access logs (site acceleration logs)</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/61301">Layer 4 proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/67840">Edge Function execution logs</a></li></ul>For valid values, see also `DescribeLogFields`.
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>List of preset fields to deliver. For valid values, see:</p><ul><li><a href="https://www.tencentcloud.com/document/product/1145/61300">Layer 7 access logs (site acceleration logs)</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/61301">Layer 4 proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/67840">Edge Function execution logs</a></li></ul>For valid values, see also `DescribeLogFields`.
     * @param Fields <p>List of preset fields to deliver. For valid values, see:</p><ul><li><a href="https://www.tencentcloud.com/document/product/1145/61300">Layer 7 access logs (site acceleration logs)</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/61301">Layer 4 proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1145/67840">Edge Function execution logs</a></li></ul>For valid values, see also `DescribeLogFields`.
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>List of custom fields to deliver. You can extract specified content from HTTP request headers, response headers, cookies, and request bodies.</p><p>Custom field names must be unique. Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p> 
     * @return CustomFields <p>List of custom fields to deliver. You can extract specified content from HTTP request headers, response headers, cookies, and request bodies.</p><p>Custom field names must be unique. Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p>
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>List of custom fields to deliver. You can extract specified content from HTTP request headers, response headers, cookies, and request bodies.</p><p>Custom field names must be unique. Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p>
     * @param CustomFields <p>List of custom fields to deliver. You can extract specified content from HTTP request headers, response headers, cookies, and request bodies.</p><p>Custom field names must be unique. Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p>
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>List of custom expression fields to deliver. By defining the field name and value expression for log delivery, you can deliver personalized real-time log content. For details, see <a href="https://www.tencentcloud.com/document/product/1145/61302">Custom Log Field Expressions</a>.</p><p>Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p><p><strong>Note</strong>: If a field in `CustomExpressionFields` has the same name as a field in `Fields` or `CustomFields`, the value in `CustomExpressionFields` takes precedence.</p> 
     * @return CustomExpressionFields <p>List of custom expression fields to deliver. By defining the field name and value expression for log delivery, you can deliver personalized real-time log content. For details, see <a href="https://www.tencentcloud.com/document/product/1145/61302">Custom Log Field Expressions</a>.</p><p>Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p><p><strong>Note</strong>: If a field in `CustomExpressionFields` has the same name as a field in `Fields` or `CustomFields`, the value in `CustomExpressionFields` takes precedence.</p>
     */
    public CustomExpressionField [] getCustomExpressionFields() {
        return this.CustomExpressionFields;
    }

    /**
     * Set <p>List of custom expression fields to deliver. By defining the field name and value expression for log delivery, you can deliver personalized real-time log content. For details, see <a href="https://www.tencentcloud.com/document/product/1145/61302">Custom Log Field Expressions</a>.</p><p>Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p><p><strong>Note</strong>: If a field in `CustomExpressionFields` has the same name as a field in `Fields` or `CustomFields`, the value in `CustomExpressionFields` takes precedence.</p>
     * @param CustomExpressionFields <p>List of custom expression fields to deliver. By defining the field name and value expression for log delivery, you can deliver personalized real-time log content. For details, see <a href="https://www.tencentcloud.com/document/product/1145/61302">Custom Log Field Expressions</a>.</p><p>Custom fields can be added only for Layer 7 access logs (`LogType` = `l7-access-logs` or `domain`).</p><p>The number of custom fields you can configure is subject to a quota. If the quota is insufficient, <a href="https://www.tencentcloud.com/contact-us">contact us</a>.</p><p><strong>Note</strong>: If a field in `CustomExpressionFields` has the same name as a field in `Fields` or `CustomFields`, the value in `CustomExpressionFields` takes precedence.</p>
     */
    public void setCustomExpressionFields(CustomExpressionField [] CustomExpressionFields) {
        this.CustomExpressionFields = CustomExpressionFields;
    }

    /**
     * Get <p>Filter conditions for log delivery. If left empty, all logs are delivered.</p> 
     * @return DeliveryConditions <p>Filter conditions for log delivery. If left empty, all logs are delivered.</p>
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set <p>Filter conditions for log delivery. If left empty, all logs are delivered.</p>
     * @param DeliveryConditions <p>Filter conditions for log delivery. If left empty, all logs are delivered.</p>
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get <p>Sampling ratio, in per mille. Value range: 1-1000. For example, 605 means a sampling ratio of 60.5%. If left empty, the sampling ratio is 100%.</p> 
     * @return Sample <p>Sampling ratio, in per mille. Value range: 1-1000. For example, 605 means a sampling ratio of 60.5%. If left empty, the sampling ratio is 100%.</p>
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set <p>Sampling ratio, in per mille. Value range: 1-1000. For example, 605 means a sampling ratio of 60.5%. If left empty, the sampling ratio is 100%.</p>
     * @param Sample <p>Sampling ratio, in per mille. Value range: 1-1000. For example, 605 means a sampling ratio of 60.5%. If left empty, the sampling ratio is 100%.</p>
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1145/64485">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3` or `aws_s3`, the default format is JSON Lines;</li></ul><p>Particularly, when `TaskType` is `cls` or `log_analysis`, the only allowed value for `LogFormat.FormatType` is `json`, and other parameters in `LogFormat` will be ignored. It is recommended not to transfer `LogFormat`.</p> 
     * @return LogFormat <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1145/64485">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3` or `aws_s3`, the default format is JSON Lines;</li></ul><p>Particularly, when `TaskType` is `cls` or `log_analysis`, the only allowed value for `LogFormat.FormatType` is `json`, and other parameters in `LogFormat` will be ignored. It is recommended not to transfer `LogFormat`.</p>
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1145/64485">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3` or `aws_s3`, the default format is JSON Lines;</li></ul><p>Particularly, when `TaskType` is `cls` or `log_analysis`, the only allowed value for `LogFormat.FormatType` is `json`, and other parameters in `LogFormat` will be ignored. It is recommended not to transfer `LogFormat`.</p>
     * @param LogFormat <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1145/64485">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3` or `aws_s3`, the default format is JSON Lines;</li></ul><p>Particularly, when `TaskType` is `cls` or `log_analysis`, the only allowed value for `LogFormat.FormatType` is `json`, and other parameters in `LogFormat` will be ignored. It is recommended not to transfer `LogFormat`.</p>
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get <p>CLS configuration. This parameter is required when `TaskType` is `cls`.</p> 
     * @return CLS <p>CLS configuration. This parameter is required when `TaskType` is `cls`.</p>
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set <p>CLS configuration. This parameter is required when `TaskType` is `cls`.</p>
     * @param CLS <p>CLS configuration. This parameter is required when `TaskType` is `cls`.</p>
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get <p>Configuration of the custom HTTP service. This parameter is required when `TaskType` is `custom_endpoint`.</p> 
     * @return CustomEndpoint <p>Configuration of the custom HTTP service. This parameter is required when `TaskType` is `custom_endpoint`.</p>
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set <p>Configuration of the custom HTTP service. This parameter is required when `TaskType` is `custom_endpoint`.</p>
     * @param CustomEndpoint <p>Configuration of the custom HTTP service. This parameter is required when `TaskType` is `custom_endpoint`.</p>
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage. This parameter is required when `TaskType` is `s3`.</p> 
     * @return S3 <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage. This parameter is required when `TaskType` is `s3`.</p>
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage. This parameter is required when `TaskType` is `s3`.</p>
     * @param S3 <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage. This parameter is required when `TaskType` is `s3`.</p>
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
    }

    /**
     * Get <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3. This parameter is required when `TaskType` is `aws_s3`.</p> 
     * @return AWSS3 <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3. This parameter is required when `TaskType` is `aws_s3`.</p>
     */
    public AWSS3 getAWSS3() {
        return this.AWSS3;
    }

    /**
     * Set <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3. This parameter is required when `TaskType` is `aws_s3`.</p>
     * @param AWSS3 <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3. This parameter is required when `TaskType` is `aws_s3`.</p>
     */
    public void setAWSS3(AWSS3 AWSS3) {
        this.AWSS3 = AWSS3;
    }

    public CreateRealtimeLogDeliveryTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRealtimeLogDeliveryTaskRequest(CreateRealtimeLogDeliveryTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.EntityList != null) {
            this.EntityList = new String[source.EntityList.length];
            for (int i = 0; i < source.EntityList.length; i++) {
                this.EntityList[i] = new String(source.EntityList[i]);
            }
        }
        if (source.Fields != null) {
            this.Fields = new String[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new String(source.Fields[i]);
            }
        }
        if (source.CustomFields != null) {
            this.CustomFields = new CustomField[source.CustomFields.length];
            for (int i = 0; i < source.CustomFields.length; i++) {
                this.CustomFields[i] = new CustomField(source.CustomFields[i]);
            }
        }
        if (source.CustomExpressionFields != null) {
            this.CustomExpressionFields = new CustomExpressionField[source.CustomExpressionFields.length];
            for (int i = 0; i < source.CustomExpressionFields.length; i++) {
                this.CustomExpressionFields[i] = new CustomExpressionField(source.CustomExpressionFields[i]);
            }
        }
        if (source.DeliveryConditions != null) {
            this.DeliveryConditions = new DeliveryCondition[source.DeliveryConditions.length];
            for (int i = 0; i < source.DeliveryConditions.length; i++) {
                this.DeliveryConditions[i] = new DeliveryCondition(source.DeliveryConditions[i]);
            }
        }
        if (source.Sample != null) {
            this.Sample = new Long(source.Sample);
        }
        if (source.LogFormat != null) {
            this.LogFormat = new LogFormat(source.LogFormat);
        }
        if (source.CLS != null) {
            this.CLS = new CLSTopic(source.CLS);
        }
        if (source.CustomEndpoint != null) {
            this.CustomEndpoint = new CustomEndpoint(source.CustomEndpoint);
        }
        if (source.S3 != null) {
            this.S3 = new S3(source.S3);
        }
        if (source.AWSS3 != null) {
            this.AWSS3 = new AWSS3(source.AWSS3);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamArrayObj(map, prefix + "CustomExpressionFields.", this.CustomExpressionFields);
        this.setParamArrayObj(map, prefix + "DeliveryConditions.", this.DeliveryConditions);
        this.setParamSimple(map, prefix + "Sample", this.Sample);
        this.setParamObj(map, prefix + "LogFormat.", this.LogFormat);
        this.setParamObj(map, prefix + "CLS.", this.CLS);
        this.setParamObj(map, prefix + "CustomEndpoint.", this.CustomEndpoint);
        this.setParamObj(map, prefix + "S3.", this.S3);
        this.setParamObj(map, prefix + "AWSS3.", this.AWSS3);

    }
}

