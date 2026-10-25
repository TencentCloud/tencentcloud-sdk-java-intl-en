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

public class RealtimeLogDeliveryTask extends AbstractModel {

    /**
    * <p>Real-time log delivery task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Name of the real-time log delivery task.</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li></p>
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * <p>Type of a real-time log shipping task. Valid values: <ul><li>cls: push to Tencent Cloud CLS;</li> <li>custom_endpoint: push to a custom HTTP(S) address;</li> <li>s3: push to an S3-compatible (compatible with the SigV4 authentication algorithm) object storage address;</li><li>aws_s3: push to an AWS S3 bucket address;</li><li>log_analysis: push to EdgeOne log analytics.</li></ul></p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>List of entities corresponding to the real-time log delivery task (Layer 7 domain or L4 proxy instance). Example values: <li>Layer 7 domain: domain.example.com;</li> <li>L4 proxy instance: sid-2s69eb5wcms7.</li></p>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * <p>Data delivery type. Valid values: <li>l7-access-logs: L7 access log</li><li>application: four-layer proxy logs</li> <li>function: edge function logs</li> <li>web-attack: managed rule log</li> <li>domain: site acceleration log</li> <li>web-rateLiming: rate limit and CC attack defense log</li><li>web-rule: custom rule log</li> <li>web-bot: Bot Management Log.</li></p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>List of predefined fields for delivery.</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>Custom fields for delivery.</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * <p>List of custom expression fields for shipping.</p>
    */
    @SerializedName("CustomExpressionFields")
    @Expose
    private CustomExpressionField [] CustomExpressionFields;

    /**
    * <p>Filter criteria of log shipping.</p>
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.</p>
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * <p>Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:</p><li>When TaskType is custom_endpoint, the default format is an array of JSON objects, where each JSON object represents a log entry;</li><li>When TaskType is s3, the default format is JSON Lines.</li>
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * <p>Configuration information of the CLS.</p>
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * <p>Configuration information of the custom HTTP service.</p>
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * <p>Configuration message of S3-compatible (compatible with SigV4 authentication algorithm) object storage.</p>
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

    /**
    * <p>Configuration information of the AWS S3 object storage. It uses IAM role authorization, eliminating the need for persistent keys, and is applicable only to AWS native S3.</p>
    */
    @SerializedName("AWSS3")
    @Expose
    private AWSS3 AWSS3;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Real-time log delivery task ID.</p> 
     * @return TaskId <p>Real-time log delivery task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Real-time log delivery task ID.</p>
     * @param TaskId <p>Real-time log delivery task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Name of the real-time log delivery task.</p> 
     * @return TaskName <p>Name of the real-time log delivery task.</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Name of the real-time log delivery task.</p>
     * @param TaskName <p>Name of the real-time log delivery task.</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li></p> 
     * @return DeliveryStatus <p>Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li></p>
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set <p>Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li></p>
     * @param DeliveryStatus <p>Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li></p>
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get <p>Type of a real-time log shipping task. Valid values: <ul><li>cls: push to Tencent Cloud CLS;</li> <li>custom_endpoint: push to a custom HTTP(S) address;</li> <li>s3: push to an S3-compatible (compatible with the SigV4 authentication algorithm) object storage address;</li><li>aws_s3: push to an AWS S3 bucket address;</li><li>log_analysis: push to EdgeOne log analytics.</li></ul></p> 
     * @return TaskType <p>Type of a real-time log shipping task. Valid values: <ul><li>cls: push to Tencent Cloud CLS;</li> <li>custom_endpoint: push to a custom HTTP(S) address;</li> <li>s3: push to an S3-compatible (compatible with the SigV4 authentication algorithm) object storage address;</li><li>aws_s3: push to an AWS S3 bucket address;</li><li>log_analysis: push to EdgeOne log analytics.</li></ul></p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Type of a real-time log shipping task. Valid values: <ul><li>cls: push to Tencent Cloud CLS;</li> <li>custom_endpoint: push to a custom HTTP(S) address;</li> <li>s3: push to an S3-compatible (compatible with the SigV4 authentication algorithm) object storage address;</li><li>aws_s3: push to an AWS S3 bucket address;</li><li>log_analysis: push to EdgeOne log analytics.</li></ul></p>
     * @param TaskType <p>Type of a real-time log shipping task. Valid values: <ul><li>cls: push to Tencent Cloud CLS;</li> <li>custom_endpoint: push to a custom HTTP(S) address;</li> <li>s3: push to an S3-compatible (compatible with the SigV4 authentication algorithm) object storage address;</li><li>aws_s3: push to an AWS S3 bucket address;</li><li>log_analysis: push to EdgeOne log analytics.</li></ul></p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>List of entities corresponding to the real-time log delivery task (Layer 7 domain or L4 proxy instance). Example values: <li>Layer 7 domain: domain.example.com;</li> <li>L4 proxy instance: sid-2s69eb5wcms7.</li></p> 
     * @return EntityList <p>List of entities corresponding to the real-time log delivery task (Layer 7 domain or L4 proxy instance). Example values: <li>Layer 7 domain: domain.example.com;</li> <li>L4 proxy instance: sid-2s69eb5wcms7.</li></p>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set <p>List of entities corresponding to the real-time log delivery task (Layer 7 domain or L4 proxy instance). Example values: <li>Layer 7 domain: domain.example.com;</li> <li>L4 proxy instance: sid-2s69eb5wcms7.</li></p>
     * @param EntityList <p>List of entities corresponding to the real-time log delivery task (Layer 7 domain or L4 proxy instance). Example values: <li>Layer 7 domain: domain.example.com;</li> <li>L4 proxy instance: sid-2s69eb5wcms7.</li></p>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get <p>Data delivery type. Valid values: <li>l7-access-logs: L7 access log</li><li>application: four-layer proxy logs</li> <li>function: edge function logs</li> <li>web-attack: managed rule log</li> <li>domain: site acceleration log</li> <li>web-rateLiming: rate limit and CC attack defense log</li><li>web-rule: custom rule log</li> <li>web-bot: Bot Management Log.</li></p> 
     * @return LogType <p>Data delivery type. Valid values: <li>l7-access-logs: L7 access log</li><li>application: four-layer proxy logs</li> <li>function: edge function logs</li> <li>web-attack: managed rule log</li> <li>domain: site acceleration log</li> <li>web-rateLiming: rate limit and CC attack defense log</li><li>web-rule: custom rule log</li> <li>web-bot: Bot Management Log.</li></p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Data delivery type. Valid values: <li>l7-access-logs: L7 access log</li><li>application: four-layer proxy logs</li> <li>function: edge function logs</li> <li>web-attack: managed rule log</li> <li>domain: site acceleration log</li> <li>web-rateLiming: rate limit and CC attack defense log</li><li>web-rule: custom rule log</li> <li>web-bot: Bot Management Log.</li></p>
     * @param LogType <p>Data delivery type. Valid values: <li>l7-access-logs: L7 access log</li><li>application: four-layer proxy logs</li> <li>function: edge function logs</li> <li>web-attack: managed rule log</li> <li>domain: site acceleration log</li> <li>web-rateLiming: rate limit and CC attack defense log</li><li>web-rule: custom rule log</li> <li>web-bot: Bot Management Log.</li></p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></p> 
     * @return Area <p>Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></p>
     * @param Area <p>Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li></p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>List of predefined fields for delivery.</p> 
     * @return Fields <p>List of predefined fields for delivery.</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>List of predefined fields for delivery.</p>
     * @param Fields <p>List of predefined fields for delivery.</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>Custom fields for delivery.</p> 
     * @return CustomFields <p>Custom fields for delivery.</p>
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>Custom fields for delivery.</p>
     * @param CustomFields <p>Custom fields for delivery.</p>
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>List of custom expression fields for shipping.</p> 
     * @return CustomExpressionFields <p>List of custom expression fields for shipping.</p>
     */
    public CustomExpressionField [] getCustomExpressionFields() {
        return this.CustomExpressionFields;
    }

    /**
     * Set <p>List of custom expression fields for shipping.</p>
     * @param CustomExpressionFields <p>List of custom expression fields for shipping.</p>
     */
    public void setCustomExpressionFields(CustomExpressionField [] CustomExpressionFields) {
        this.CustomExpressionFields = CustomExpressionFields;
    }

    /**
     * Get <p>Filter criteria of log shipping.</p> 
     * @return DeliveryConditions <p>Filter criteria of log shipping.</p>
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set <p>Filter criteria of log shipping.</p>
     * @param DeliveryConditions <p>Filter criteria of log shipping.</p>
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.</p> 
     * @return Sample <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.</p>
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.</p>
     * @param Sample <p>Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.</p>
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get <p>Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:</p><li>When TaskType is custom_endpoint, the default format is an array of JSON objects, where each JSON object represents a log entry;</li><li>When TaskType is s3, the default format is JSON Lines.</li> 
     * @return LogFormat <p>Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:</p><li>When TaskType is custom_endpoint, the default format is an array of JSON objects, where each JSON object represents a log entry;</li><li>When TaskType is s3, the default format is JSON Lines.</li>
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set <p>Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:</p><li>When TaskType is custom_endpoint, the default format is an array of JSON objects, where each JSON object represents a log entry;</li><li>When TaskType is s3, the default format is JSON Lines.</li>
     * @param LogFormat <p>Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:</p><li>When TaskType is custom_endpoint, the default format is an array of JSON objects, where each JSON object represents a log entry;</li><li>When TaskType is s3, the default format is JSON Lines.</li>
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get <p>Configuration information of the CLS.</p> 
     * @return CLS <p>Configuration information of the CLS.</p>
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set <p>Configuration information of the CLS.</p>
     * @param CLS <p>Configuration information of the CLS.</p>
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get <p>Configuration information of the custom HTTP service.</p> 
     * @return CustomEndpoint <p>Configuration information of the custom HTTP service.</p>
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set <p>Configuration information of the custom HTTP service.</p>
     * @param CustomEndpoint <p>Configuration information of the custom HTTP service.</p>
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get <p>Configuration message of S3-compatible (compatible with SigV4 authentication algorithm) object storage.</p> 
     * @return S3 <p>Configuration message of S3-compatible (compatible with SigV4 authentication algorithm) object storage.</p>
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set <p>Configuration message of S3-compatible (compatible with SigV4 authentication algorithm) object storage.</p>
     * @param S3 <p>Configuration message of S3-compatible (compatible with SigV4 authentication algorithm) object storage.</p>
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
    }

    /**
     * Get <p>Configuration information of the AWS S3 object storage. It uses IAM role authorization, eliminating the need for persistent keys, and is applicable only to AWS native S3.</p> 
     * @return AWSS3 <p>Configuration information of the AWS S3 object storage. It uses IAM role authorization, eliminating the need for persistent keys, and is applicable only to AWS native S3.</p>
     */
    public AWSS3 getAWSS3() {
        return this.AWSS3;
    }

    /**
     * Set <p>Configuration information of the AWS S3 object storage. It uses IAM role authorization, eliminating the need for persistent keys, and is applicable only to AWS native S3.</p>
     * @param AWSS3 <p>Configuration information of the AWS S3 object storage. It uses IAM role authorization, eliminating the need for persistent keys, and is applicable only to AWS native S3.</p>
     */
    public void setAWSS3(AWSS3 AWSS3) {
        this.AWSS3 = AWSS3;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public RealtimeLogDeliveryTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealtimeLogDeliveryTask(RealtimeLogDeliveryTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DeliveryStatus != null) {
            this.DeliveryStatus = new String(source.DeliveryStatus);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DeliveryStatus", this.DeliveryStatus);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Area", this.Area);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

