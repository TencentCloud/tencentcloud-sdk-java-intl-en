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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRealtimeLogDeliveryTaskRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Type of a real-time log delivery task. Valid values:
<li>cls: push to Tencent Cloud CLS;</li>
<li>custom_endpoint: push to a custom HTTP(S) address;</li>
<li>s3: push to an AWS S3-compatible bucket address.</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log delivery task. Valid value examples:
<li>L7 domain name: domain.example.com;</li>
<li>L4 proxy instance: sid-2s69eb5wcms7.</li>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * Dataset type. Valid values:
<li>domain: site acceleration logs;</li>
<li>application: L4 proxy logs;</li>
<li>web-rateLiming: rate limit and CC attack defense logs;</li>
<li>web-attack: managed rule logs;</li>
<li>web-rule: custom rule logs;</li>
<li>web-bot: Bot management logs.</li>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Data area. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * List of predefined fields for delivery.
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * The list of custom fields for log delivery, which supports extracting specified content from HTTP request headers, response headers, cookies, and request bodies. Custom field names must be unique. The number of custom fields cannot exceed a maximum of 200. A single real-time log delivery task can configure up to 5 custom fields of the request body type. Currently, only site acceleration logs (LogType=domain) support custom fields.
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * Filter criteria of log delivery. If this parameter is not specified, all logs will be shipped.
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not specified, the sampling ratio is 100%.
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * Output format for log delivery. If this field is not specified, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines;</li>Specifically, when TaskType is 'cls', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * Configuration information of CLS. This parameter is required when TaskType is cls.
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_). 
     * @return TaskName Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).
     * @param TaskName Name of a real-time log delivery task, which can contain up to 200 characters, including digits, English letters, hyphens (-) and underscores (_).
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Type of a real-time log delivery task. Valid values:
<li>cls: push to Tencent Cloud CLS;</li>
<li>custom_endpoint: push to a custom HTTP(S) address;</li>
<li>s3: push to an AWS S3-compatible bucket address.</li> 
     * @return TaskType Type of a real-time log delivery task. Valid values:
<li>cls: push to Tencent Cloud CLS;</li>
<li>custom_endpoint: push to a custom HTTP(S) address;</li>
<li>s3: push to an AWS S3-compatible bucket address.</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Type of a real-time log delivery task. Valid values:
<li>cls: push to Tencent Cloud CLS;</li>
<li>custom_endpoint: push to a custom HTTP(S) address;</li>
<li>s3: push to an AWS S3-compatible bucket address.</li>
     * @param TaskType Type of a real-time log delivery task. Valid values:
<li>cls: push to Tencent Cloud CLS;</li>
<li>custom_endpoint: push to a custom HTTP(S) address;</li>
<li>s3: push to an AWS S3-compatible bucket address.</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log delivery task. Valid value examples:
<li>L7 domain name: domain.example.com;</li>
<li>L4 proxy instance: sid-2s69eb5wcms7.</li> 
     * @return EntityList List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log delivery task. Valid value examples:
<li>L7 domain name: domain.example.com;</li>
<li>L4 proxy instance: sid-2s69eb5wcms7.</li>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log delivery task. Valid value examples:
<li>L7 domain name: domain.example.com;</li>
<li>L4 proxy instance: sid-2s69eb5wcms7.</li>
     * @param EntityList List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log delivery task. Valid value examples:
<li>L7 domain name: domain.example.com;</li>
<li>L4 proxy instance: sid-2s69eb5wcms7.</li>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get Dataset type. Valid values:
<li>domain: site acceleration logs;</li>
<li>application: L4 proxy logs;</li>
<li>web-rateLiming: rate limit and CC attack defense logs;</li>
<li>web-attack: managed rule logs;</li>
<li>web-rule: custom rule logs;</li>
<li>web-bot: Bot management logs.</li> 
     * @return LogType Dataset type. Valid values:
<li>domain: site acceleration logs;</li>
<li>application: L4 proxy logs;</li>
<li>web-rateLiming: rate limit and CC attack defense logs;</li>
<li>web-attack: managed rule logs;</li>
<li>web-rule: custom rule logs;</li>
<li>web-bot: Bot management logs.</li>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Dataset type. Valid values:
<li>domain: site acceleration logs;</li>
<li>application: L4 proxy logs;</li>
<li>web-rateLiming: rate limit and CC attack defense logs;</li>
<li>web-attack: managed rule logs;</li>
<li>web-rule: custom rule logs;</li>
<li>web-bot: Bot management logs.</li>
     * @param LogType Dataset type. Valid values:
<li>domain: site acceleration logs;</li>
<li>application: L4 proxy logs;</li>
<li>web-rateLiming: rate limit and CC attack defense logs;</li>
<li>web-attack: managed rule logs;</li>
<li>web-rule: custom rule logs;</li>
<li>web-bot: Bot management logs.</li>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Data area. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li> 
     * @return Area Data area. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data area. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
     * @param Area Data area. Valid values:
<li>mainland: within the Chinese mainland;</li>
<li>overseas: global (excluding the Chinese mainland).</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get List of predefined fields for delivery. 
     * @return Fields List of predefined fields for delivery.
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set List of predefined fields for delivery.
     * @param Fields List of predefined fields for delivery.
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get The list of custom fields for log delivery, which supports extracting specified content from HTTP request headers, response headers, cookies, and request bodies. Custom field names must be unique. The number of custom fields cannot exceed a maximum of 200. A single real-time log delivery task can configure up to 5 custom fields of the request body type. Currently, only site acceleration logs (LogType=domain) support custom fields. 
     * @return CustomFields The list of custom fields for log delivery, which supports extracting specified content from HTTP request headers, response headers, cookies, and request bodies. Custom field names must be unique. The number of custom fields cannot exceed a maximum of 200. A single real-time log delivery task can configure up to 5 custom fields of the request body type. Currently, only site acceleration logs (LogType=domain) support custom fields.
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set The list of custom fields for log delivery, which supports extracting specified content from HTTP request headers, response headers, cookies, and request bodies. Custom field names must be unique. The number of custom fields cannot exceed a maximum of 200. A single real-time log delivery task can configure up to 5 custom fields of the request body type. Currently, only site acceleration logs (LogType=domain) support custom fields.
     * @param CustomFields The list of custom fields for log delivery, which supports extracting specified content from HTTP request headers, response headers, cookies, and request bodies. Custom field names must be unique. The number of custom fields cannot exceed a maximum of 200. A single real-time log delivery task can configure up to 5 custom fields of the request body type. Currently, only site acceleration logs (LogType=domain) support custom fields.
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get Filter criteria of log delivery. If this parameter is not specified, all logs will be shipped. 
     * @return DeliveryConditions Filter criteria of log delivery. If this parameter is not specified, all logs will be shipped.
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set Filter criteria of log delivery. If this parameter is not specified, all logs will be shipped.
     * @param DeliveryConditions Filter criteria of log delivery. If this parameter is not specified, all logs will be shipped.
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not specified, the sampling ratio is 100%. 
     * @return Sample Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not specified, the sampling ratio is 100%.
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not specified, the sampling ratio is 100%.
     * @param Sample Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. If this parameter is not specified, the sampling ratio is 100%.
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get Output format for log delivery. If this field is not specified, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines;</li>Specifically, when TaskType is 'cls', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat. 
     * @return LogFormat Output format for log delivery. If this field is not specified, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines;</li>Specifically, when TaskType is 'cls', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set Output format for log delivery. If this field is not specified, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines;</li>Specifically, when TaskType is 'cls', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.
     * @param LogFormat Output format for log delivery. If this field is not specified, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines;</li>Specifically, when TaskType is 'cls', the only allowed value for LogFormat.FormatType is 'json', and other parameters in LogFormat will be ignored. It is recommended not to transfer LogFormat.
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get Configuration information of CLS. This parameter is required when TaskType is cls. 
     * @return CLS Configuration information of CLS. This parameter is required when TaskType is cls.
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set Configuration information of CLS. This parameter is required when TaskType is cls.
     * @param CLS Configuration information of CLS. This parameter is required when TaskType is cls.
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint. 
     * @return CustomEndpoint Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.
     * @param CustomEndpoint Configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3. 
     * @return S3 Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.
     * @param S3 Configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.
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
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
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
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamArrayObj(map, prefix + "DeliveryConditions.", this.DeliveryConditions);
        this.setParamSimple(map, prefix + "Sample", this.Sample);
        this.setParamObj(map, prefix + "LogFormat.", this.LogFormat);
        this.setParamObj(map, prefix + "CLS.", this.CLS);
        this.setParamObj(map, prefix + "CustomEndpoint.", this.CustomEndpoint);
        this.setParamObj(map, prefix + "S3.", this.S3);

    }
}

