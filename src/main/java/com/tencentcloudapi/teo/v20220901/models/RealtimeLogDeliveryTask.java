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
    * <p>ID of the real-time log delivery task.</p>
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
    * <p>Status of the real-time log delivery task. Valid values:</p><ul><li>`enabled`: enabled;</li><li>`disabled`: disabled;</li><li>`deleted`: abnormally deleted. Check whether the destination Tencent Cloud CLS log set or log topic has been deleted.</li></ul>
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint;</li><li>`aws_s3`: deliver to an AWS S3 bucket;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis.</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>List of entities that the real-time log delivery task applies to (Layer 7 domain names or Layer 4 proxy instances). Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`;</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`.</li></ul>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs;</li><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Data delivery area. Valid values:</p><ul><li>`mainland`: Chinese mainland;</li><li>`overseas`: Global (excluding the Chinese mainland).</li></ul>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>List of preset fields to deliver.</p>
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * <p>List of custom fields to deliver.</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * <p>List of custom expression fields to deliver.</p>
    */
    @SerializedName("CustomExpressionFields")
    @Expose
    private CustomExpressionField [] CustomExpressionFields;

    /**
    * <p>Filter conditions for log delivery.</p>
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
    * <p>Output format for log delivery. A null value indicates the default format. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3`, the default format is JSON Lines.</li></ul>
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * <p>Configuration of CLS.</p>
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * <p>Configuration of the custom HTTP service.</p>
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage.</p>
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

    /**
    * <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3.</p>
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
     * Get <p>ID of the real-time log delivery task.</p> 
     * @return TaskId <p>ID of the real-time log delivery task.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>ID of the real-time log delivery task.</p>
     * @param TaskId <p>ID of the real-time log delivery task.</p>
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
     * Get <p>Status of the real-time log delivery task. Valid values:</p><ul><li>`enabled`: enabled;</li><li>`disabled`: disabled;</li><li>`deleted`: abnormally deleted. Check whether the destination Tencent Cloud CLS log set or log topic has been deleted.</li></ul> 
     * @return DeliveryStatus <p>Status of the real-time log delivery task. Valid values:</p><ul><li>`enabled`: enabled;</li><li>`disabled`: disabled;</li><li>`deleted`: abnormally deleted. Check whether the destination Tencent Cloud CLS log set or log topic has been deleted.</li></ul>
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set <p>Status of the real-time log delivery task. Valid values:</p><ul><li>`enabled`: enabled;</li><li>`disabled`: disabled;</li><li>`deleted`: abnormally deleted. Check whether the destination Tencent Cloud CLS log set or log topic has been deleted.</li></ul>
     * @param DeliveryStatus <p>Status of the real-time log delivery task. Valid values:</p><ul><li>`enabled`: enabled;</li><li>`disabled`: disabled;</li><li>`deleted`: abnormally deleted. Check whether the destination Tencent Cloud CLS log set or log topic has been deleted.</li></ul>
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint;</li><li>`aws_s3`: deliver to an AWS S3 bucket;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis.</li></ul> 
     * @return TaskType <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint;</li><li>`aws_s3`: deliver to an AWS S3 bucket;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis.</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint;</li><li>`aws_s3`: deliver to an AWS S3 bucket;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis.</li></ul>
     * @param TaskType <p>Type of the real-time log delivery task. Valid values:</p><ul><li>`cls`: deliver to Tencent Cloud CLS;</li><li>`custom_endpoint`: deliver to a custom HTTP(S) endpoint;</li><li>`s3`: deliver to an S3-compatible (SigV4 authentication algorithm compatible) object storage endpoint;</li><li>`aws_s3`: deliver to an AWS S3 bucket;</li><li>`log_analysis`: deliver to EdgeOne Log Analysis.</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>List of entities that the real-time log delivery task applies to (Layer 7 domain names or Layer 4 proxy instances). Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`;</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`.</li></ul> 
     * @return EntityList <p>List of entities that the real-time log delivery task applies to (Layer 7 domain names or Layer 4 proxy instances). Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`;</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`.</li></ul>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set <p>List of entities that the real-time log delivery task applies to (Layer 7 domain names or Layer 4 proxy instances). Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`;</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`.</li></ul>
     * @param EntityList <p>List of entities that the real-time log delivery task applies to (Layer 7 domain names or Layer 4 proxy instances). Examples:</p><ul><li>Layer 7 domain name: `domain.example.com`;</li><li>Layer 4 proxy instance: `sid-2s69eb5wcms7`.</li></ul>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs;</li><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul> 
     * @return LogType <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs;</li><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs;</li><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul>
     * @param LogType <p>Data delivery type. Valid values:</p><ul><li>`l7-access-logs`: Layer 7 access logs;</li><li>`application`: Layer 4 proxy logs;</li><li>`function`: Edge Function execution logs;</li><li>`web-attack`: managed rule logs;</li><li>`domain`: site acceleration logs;</li><li>`web-rateLiming`: rate limiting and CC attack defense logs;</li><li>`web-rule`: custom rule logs;</li><li>`web-bot`: Bot management logs.</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
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
     * Get <p>List of preset fields to deliver.</p> 
     * @return Fields <p>List of preset fields to deliver.</p>
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set <p>List of preset fields to deliver.</p>
     * @param Fields <p>List of preset fields to deliver.</p>
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get <p>List of custom fields to deliver.</p> 
     * @return CustomFields <p>List of custom fields to deliver.</p>
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>List of custom fields to deliver.</p>
     * @param CustomFields <p>List of custom fields to deliver.</p>
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>List of custom expression fields to deliver.</p> 
     * @return CustomExpressionFields <p>List of custom expression fields to deliver.</p>
     */
    public CustomExpressionField [] getCustomExpressionFields() {
        return this.CustomExpressionFields;
    }

    /**
     * Set <p>List of custom expression fields to deliver.</p>
     * @param CustomExpressionFields <p>List of custom expression fields to deliver.</p>
     */
    public void setCustomExpressionFields(CustomExpressionField [] CustomExpressionFields) {
        this.CustomExpressionFields = CustomExpressionFields;
    }

    /**
     * Get <p>Filter conditions for log delivery.</p> 
     * @return DeliveryConditions <p>Filter conditions for log delivery.</p>
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set <p>Filter conditions for log delivery.</p>
     * @param DeliveryConditions <p>Filter conditions for log delivery.</p>
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
     * Get <p>Output format for log delivery. A null value indicates the default format. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3`, the default format is JSON Lines.</li></ul> 
     * @return LogFormat <p>Output format for log delivery. A null value indicates the default format. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3`, the default format is JSON Lines.</li></ul>
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set <p>Output format for log delivery. A null value indicates the default format. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3`, the default format is JSON Lines.</li></ul>
     * @param LogFormat <p>Output format for log delivery. A null value indicates the default format. The default format logic is as follows:</p><ul><li>When `TaskType` is `custom_endpoint`, the default format is an array of JSON objects, each JSON object represents a log entry;</li><li>When `TaskType` is `s3`, the default format is JSON Lines.</li></ul>
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get <p>Configuration of CLS.</p> 
     * @return CLS <p>Configuration of CLS.</p>
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set <p>Configuration of CLS.</p>
     * @param CLS <p>Configuration of CLS.</p>
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get <p>Configuration of the custom HTTP service.</p> 
     * @return CustomEndpoint <p>Configuration of the custom HTTP service.</p>
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set <p>Configuration of the custom HTTP service.</p>
     * @param CustomEndpoint <p>Configuration of the custom HTTP service.</p>
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage.</p> 
     * @return S3 <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage.</p>
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage.</p>
     * @param S3 <p>Configuration of the S3-compatible (SigV4 authentication algorithm compatible) object storage.</p>
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
    }

    /**
     * Get <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3.</p> 
     * @return AWSS3 <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3.</p>
     */
    public AWSS3 getAWSS3() {
        return this.AWSS3;
    }

    /**
     * Set <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3.</p>
     * @param AWSS3 <p>Configuration of the AWS S3 object storage. It uses IAM role authorization, requires no long-term key, and applies only to AWS native S3.</p>
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

