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
    * <p>Data shipping area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Data delivery type. Available values:</p><ul><li>l7-access-logs: Layer 7 Access Logs;</li><li>application: Layer 4 Proxy Logs;</li><li>function: Function Logs;</li><li>web-attack: Managed Rule Logs.</li></ul><p>The following types of logs are merged into l7-access-logs and no longer support adding:</p><ul><li>domain: Site Acceleration Logs;</li><li>web-rateLiming: Rate Limit and CC Attack Defense Logs;</li><li>web-rule: Custom Rule Logs;</li><li>web-bot: Bot Management Logs.</li></ul>
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
    * <p>Type of a real-time log shipping task. Valid values:<ul><li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address;</li><li>log_analysis: push to EdgeOne log analytics. This is supported only when LogType = l7-access-logs or web-attack.</li></ul></p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>List of entities corresponding to real-time log delivery tasks. Example values:</p><ul><li>Layer 7 domain: domain.example.com</li><li>Layer 4 proxy instance: sid-2s69eb5wcms7</li><li>Edge function instance: test-zone-2mxigizoh9l9-1257626257</li></ul><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1">DescribeL4Proxy</a></p>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * <p>Predefined fields for delivery. For reference: <ul><li><a href="https://www.tencentcloud.com/document/product/1552/105791?from_cn_redirect=1">Layer 7 Access Logs (site acceleration log)</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/105792?from_cn_redirect=1">four-layer proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/115585?from_cn_redirect=1">edge function logs</a></li></ul></p><p>For reference: DescribeLogFields</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>Custom fields for delivery support extracting specified content from HTTP request headers, response headers, cookies, and request bodies.<br>Custom field name must be unique. Only Layer 7 access logs (LogType= l7-access-logs or domain) support adding custom fields.<br>The count of custom fields allowed to be configured has a quota limit. If the quota is insufficient, please contact us (https://www.tencentcloud.com/contact-us).</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * <p>The list of custom expression fields for submission can be used to implement personalized real-time log content push through custom log push field names and value expressions. For usage details, refer to [Custom Log Field Expressions]().<br>Only Layer 7 Access Logs (LogType= l7-access-logs or domain) support  adding custom fields.<br>There is a quota limit on the count of custom fields that can be configured. If the quota is insufficient, please [contact us](https://www.tencentcloud.com/contact-us).<br>**Note**: If a field named in CustomExpressionFields has the same name as a field in Fields and CustomFields, the value in CustomExpressionFields takes precedence.</p>
    */
    @SerializedName("CustomExpressionFields")
    @Expose
    private CustomExpressionField [] CustomExpressionFields;

    /**
    * <p>Filter criteria of log shipping. If this parameter is not input, all logs will be shipped.</p>
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not input, the sampling ratio is 100%.</p>
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1552/110448?from_cn_redirect=1">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:<ul><li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When TaskType is 's3', the default format is JSON Lines;</li></ul>Particularly, when TaskType is 'cls' or 'log_analysis', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.</p>
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * <p>Configuration information of CLS. This parameter is required when TaskType is cls.</p>
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * <p>Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.</p>
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * <p>Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.</p>
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

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
     * Get <p>Data shipping area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p> 
     * @return Area <p>Data shipping area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Data shipping area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p>
     * @param Area <p>Data shipping area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></ul></p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Data delivery type. Available values:</p><ul><li>l7-access-logs: Layer 7 Access Logs;</li><li>application: Layer 4 Proxy Logs;</li><li>function: Function Logs;</li><li>web-attack: Managed Rule Logs.</li></ul><p>The following types of logs are merged into l7-access-logs and no longer support adding:</p><ul><li>domain: Site Acceleration Logs;</li><li>web-rateLiming: Rate Limit and CC Attack Defense Logs;</li><li>web-rule: Custom Rule Logs;</li><li>web-bot: Bot Management Logs.</li></ul> 
     * @return LogType <p>Data delivery type. Available values:</p><ul><li>l7-access-logs: Layer 7 Access Logs;</li><li>application: Layer 4 Proxy Logs;</li><li>function: Function Logs;</li><li>web-attack: Managed Rule Logs.</li></ul><p>The following types of logs are merged into l7-access-logs and no longer support adding:</p><ul><li>domain: Site Acceleration Logs;</li><li>web-rateLiming: Rate Limit and CC Attack Defense Logs;</li><li>web-rule: Custom Rule Logs;</li><li>web-bot: Bot Management Logs.</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Data delivery type. Available values:</p><ul><li>l7-access-logs: Layer 7 Access Logs;</li><li>application: Layer 4 Proxy Logs;</li><li>function: Function Logs;</li><li>web-attack: Managed Rule Logs.</li></ul><p>The following types of logs are merged into l7-access-logs and no longer support adding:</p><ul><li>domain: Site Acceleration Logs;</li><li>web-rateLiming: Rate Limit and CC Attack Defense Logs;</li><li>web-rule: Custom Rule Logs;</li><li>web-bot: Bot Management Logs.</li></ul>
     * @param LogType <p>Data delivery type. Available values:</p><ul><li>l7-access-logs: Layer 7 Access Logs;</li><li>application: Layer 4 Proxy Logs;</li><li>function: Function Logs;</li><li>web-attack: Managed Rule Logs.</li></ul><p>The following types of logs are merged into l7-access-logs and no longer support adding:</p><ul><li>domain: Site Acceleration Logs;</li><li>web-rateLiming: Rate Limit and CC Attack Defense Logs;</li><li>web-rule: Custom Rule Logs;</li><li>web-bot: Bot Management Logs.</li></ul>
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
     * Get <p>Type of a real-time log shipping task. Valid values:<ul><li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address;</li><li>log_analysis: push to EdgeOne log analytics. This is supported only when LogType = l7-access-logs or web-attack.</li></ul></p> 
     * @return TaskType <p>Type of a real-time log shipping task. Valid values:<ul><li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address;</li><li>log_analysis: push to EdgeOne log analytics. This is supported only when LogType = l7-access-logs or web-attack.</li></ul></p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Type of a real-time log shipping task. Valid values:<ul><li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address;</li><li>log_analysis: push to EdgeOne log analytics. This is supported only when LogType = l7-access-logs or web-attack.</li></ul></p>
     * @param TaskType <p>Type of a real-time log shipping task. Valid values:<ul><li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address;</li><li>log_analysis: push to EdgeOne log analytics. This is supported only when LogType = l7-access-logs or web-attack.</li></ul></p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>List of entities corresponding to real-time log delivery tasks. Example values:</p><ul><li>Layer 7 domain: domain.example.com</li><li>Layer 4 proxy instance: sid-2s69eb5wcms7</li><li>Edge function instance: test-zone-2mxigizoh9l9-1257626257</li></ul><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1">DescribeL4Proxy</a></p> 
     * @return EntityList <p>List of entities corresponding to real-time log delivery tasks. Example values:</p><ul><li>Layer 7 domain: domain.example.com</li><li>Layer 4 proxy instance: sid-2s69eb5wcms7</li><li>Edge function instance: test-zone-2mxigizoh9l9-1257626257</li></ul><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1">DescribeL4Proxy</a></p>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set <p>List of entities corresponding to real-time log delivery tasks. Example values:</p><ul><li>Layer 7 domain: domain.example.com</li><li>Layer 4 proxy instance: sid-2s69eb5wcms7</li><li>Edge function instance: test-zone-2mxigizoh9l9-1257626257</li></ul><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1">DescribeL4Proxy</a></p>
     * @param EntityList <p>List of entities corresponding to real-time log delivery tasks. Example values:</p><ul><li>Layer 7 domain: domain.example.com</li><li>Layer 4 proxy instance: sid-2s69eb5wcms7</li><li>Edge function instance: test-zone-2mxigizoh9l9-1257626257</li></ul><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/103413?from_cn_redirect=1">DescribeL4Proxy</a></p>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get <p>Predefined fields for delivery. For reference: <ul><li><a href="https://www.tencentcloud.com/document/product/1552/105791?from_cn_redirect=1">Layer 7 Access Logs (site acceleration log)</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/105792?from_cn_redirect=1">four-layer proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/115585?from_cn_redirect=1">edge function logs</a></li></ul></p><p>For reference: DescribeLogFields</p> 
     * @return Fields <p>Predefined fields for delivery. For reference: <ul><li><a href="https://www.tencentcloud.com/document/product/1552/105791?from_cn_redirect=1">Layer 7 Access Logs (site acceleration log)</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/105792?from_cn_redirect=1">four-layer proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/115585?from_cn_redirect=1">edge function logs</a></li></ul></p><p>For reference: DescribeLogFields</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>Predefined fields for delivery. For reference: <ul><li><a href="https://www.tencentcloud.com/document/product/1552/105791?from_cn_redirect=1">Layer 7 Access Logs (site acceleration log)</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/105792?from_cn_redirect=1">four-layer proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/115585?from_cn_redirect=1">edge function logs</a></li></ul></p><p>For reference: DescribeLogFields</p>
     * @param Fields <p>Predefined fields for delivery. For reference: <ul><li><a href="https://www.tencentcloud.com/document/product/1552/105791?from_cn_redirect=1">Layer 7 Access Logs (site acceleration log)</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/105792?from_cn_redirect=1">four-layer proxy logs</a></li><li><a href="https://www.tencentcloud.com/document/product/1552/115585?from_cn_redirect=1">edge function logs</a></li></ul></p><p>For reference: DescribeLogFields</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>Custom fields for delivery support extracting specified content from HTTP request headers, response headers, cookies, and request bodies.<br>Custom field name must be unique. Only Layer 7 access logs (LogType= l7-access-logs or domain) support adding custom fields.<br>The count of custom fields allowed to be configured has a quota limit. If the quota is insufficient, please contact us (https://www.tencentcloud.com/contact-us).</p> 
     * @return CustomFields <p>Custom fields for delivery support extracting specified content from HTTP request headers, response headers, cookies, and request bodies.<br>Custom field name must be unique. Only Layer 7 access logs (LogType= l7-access-logs or domain) support adding custom fields.<br>The count of custom fields allowed to be configured has a quota limit. If the quota is insufficient, please contact us (https://www.tencentcloud.com/contact-us).</p>
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>Custom fields for delivery support extracting specified content from HTTP request headers, response headers, cookies, and request bodies.<br>Custom field name must be unique. Only Layer 7 access logs (LogType= l7-access-logs or domain) support adding custom fields.<br>The count of custom fields allowed to be configured has a quota limit. If the quota is insufficient, please contact us (https://www.tencentcloud.com/contact-us).</p>
     * @param CustomFields <p>Custom fields for delivery support extracting specified content from HTTP request headers, response headers, cookies, and request bodies.<br>Custom field name must be unique. Only Layer 7 access logs (LogType= l7-access-logs or domain) support adding custom fields.<br>The count of custom fields allowed to be configured has a quota limit. If the quota is insufficient, please contact us (https://www.tencentcloud.com/contact-us).</p>
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>The list of custom expression fields for submission can be used to implement personalized real-time log content push through custom log push field names and value expressions. For usage details, refer to [Custom Log Field Expressions]().<br>Only Layer 7 Access Logs (LogType= l7-access-logs or domain) support  adding custom fields.<br>There is a quota limit on the count of custom fields that can be configured. If the quota is insufficient, please [contact us](https://www.tencentcloud.com/contact-us).<br>**Note**: If a field named in CustomExpressionFields has the same name as a field in Fields and CustomFields, the value in CustomExpressionFields takes precedence.</p> 
     * @return CustomExpressionFields <p>The list of custom expression fields for submission can be used to implement personalized real-time log content push through custom log push field names and value expressions. For usage details, refer to [Custom Log Field Expressions]().<br>Only Layer 7 Access Logs (LogType= l7-access-logs or domain) support  adding custom fields.<br>There is a quota limit on the count of custom fields that can be configured. If the quota is insufficient, please [contact us](https://www.tencentcloud.com/contact-us).<br>**Note**: If a field named in CustomExpressionFields has the same name as a field in Fields and CustomFields, the value in CustomExpressionFields takes precedence.</p>
     */
    public CustomExpressionField [] getCustomExpressionFields() {
        return this.CustomExpressionFields;
    }

    /**
     * Set <p>The list of custom expression fields for submission can be used to implement personalized real-time log content push through custom log push field names and value expressions. For usage details, refer to [Custom Log Field Expressions]().<br>Only Layer 7 Access Logs (LogType= l7-access-logs or domain) support  adding custom fields.<br>There is a quota limit on the count of custom fields that can be configured. If the quota is insufficient, please [contact us](https://www.tencentcloud.com/contact-us).<br>**Note**: If a field named in CustomExpressionFields has the same name as a field in Fields and CustomFields, the value in CustomExpressionFields takes precedence.</p>
     * @param CustomExpressionFields <p>The list of custom expression fields for submission can be used to implement personalized real-time log content push through custom log push field names and value expressions. For usage details, refer to [Custom Log Field Expressions]().<br>Only Layer 7 Access Logs (LogType= l7-access-logs or domain) support  adding custom fields.<br>There is a quota limit on the count of custom fields that can be configured. If the quota is insufficient, please [contact us](https://www.tencentcloud.com/contact-us).<br>**Note**: If a field named in CustomExpressionFields has the same name as a field in Fields and CustomFields, the value in CustomExpressionFields takes precedence.</p>
     */
    public void setCustomExpressionFields(CustomExpressionField [] CustomExpressionFields) {
        this.CustomExpressionFields = CustomExpressionFields;
    }

    /**
     * Get <p>Filter criteria of log shipping. If this parameter is not input, all logs will be shipped.</p> 
     * @return DeliveryConditions <p>Filter criteria of log shipping. If this parameter is not input, all logs will be shipped.</p>
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set <p>Filter criteria of log shipping. If this parameter is not input, all logs will be shipped.</p>
     * @param DeliveryConditions <p>Filter criteria of log shipping. If this parameter is not input, all logs will be shipped.</p>
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not input, the sampling ratio is 100%.</p> 
     * @return Sample <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not input, the sampling ratio is 100%.</p>
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not input, the sampling ratio is 100%.</p>
     * @param Sample <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not input, the sampling ratio is 100%.</p>
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1552/110448?from_cn_redirect=1">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:<ul><li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When TaskType is 's3', the default format is JSON Lines;</li></ul>Particularly, when TaskType is 'cls' or 'log_analysis', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.</p> 
     * @return LogFormat <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1552/110448?from_cn_redirect=1">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:<ul><li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When TaskType is 's3', the default format is JSON Lines;</li></ul>Particularly, when TaskType is 'cls' or 'log_analysis', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.</p>
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1552/110448?from_cn_redirect=1">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:<ul><li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When TaskType is 's3', the default format is JSON Lines;</li></ul>Particularly, when TaskType is 'cls' or 'log_analysis', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.</p>
     * @param LogFormat <p>Output format for log delivery. For usage details, see <a href="https://www.tencentcloud.com/document/product/1552/110448?from_cn_redirect=1">Custom Log Output Format</a>. If left blank, the default format applies. The default format logic is as follows:<ul><li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When TaskType is 's3', the default format is JSON Lines;</li></ul>Particularly, when TaskType is 'cls' or 'log_analysis', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.</p>
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get <p>Configuration information of CLS. This parameter is required when TaskType is cls.</p> 
     * @return CLS <p>Configuration information of CLS. This parameter is required when TaskType is cls.</p>
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set <p>Configuration information of CLS. This parameter is required when TaskType is cls.</p>
     * @param CLS <p>Configuration information of CLS. This parameter is required when TaskType is cls.</p>
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get <p>Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.</p> 
     * @return CustomEndpoint <p>Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.</p>
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set <p>Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.</p>
     * @param CustomEndpoint <p>Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.</p>
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get <p>Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.</p> 
     * @return S3 <p>Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.</p>
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set <p>Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.</p>
     * @param S3 <p>Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.</p>
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
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

    }
}

