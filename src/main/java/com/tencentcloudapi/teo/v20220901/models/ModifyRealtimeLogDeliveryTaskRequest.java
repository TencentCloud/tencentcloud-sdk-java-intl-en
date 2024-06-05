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

public class ModifyRealtimeLogDeliveryTaskRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The ID of the real-time log delivery task.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters. If this field is not filled in, the original configuration will be retained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * The status of the real-time log delivery task. Valid values:
<li>`enabled`: Enabled;</li>
<li>`disabled`: Disabled.</li>If this field is not filled in, the original configuration will be retained.
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>If this field is not filled in, the original configuration will be retained.
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * The list of predefined fields for delivery. If this field is not filled in, the original configuration will be retained.
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200. If this field is not filled in, the original configuration will be retained.
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * Log delivery filter conditions. If this field is not filled in, all logs will be delivered.
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the original configuration will be retained.
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * Output format for log delivery. If this field is not specified, the original configuration will be retained.Specifically, when TaskType is set to cls, the value of LogFormat.FormatType can only be json, and other parameters in LogFormat will be ignored. It is recommended not to input LogFormat.
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * The configuration information of the custom HTTP service. If this field is not filled in, the original configuration will be retained.
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * The configuration information of the AWS S3-compatible bucket. If this field is not filled in, the original configuration will be retained.
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
     * Get The ID of the real-time log delivery task. 
     * @return TaskId The ID of the real-time log delivery task.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The ID of the real-time log delivery task.
     * @param TaskId The ID of the real-time log delivery task.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters. If this field is not filled in, the original configuration will be retained. 
     * @return TaskName The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters. If this field is not filled in, the original configuration will be retained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters. If this field is not filled in, the original configuration will be retained.
     * @param TaskName The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters. If this field is not filled in, the original configuration will be retained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get The status of the real-time log delivery task. Valid values:
<li>`enabled`: Enabled;</li>
<li>`disabled`: Disabled.</li>If this field is not filled in, the original configuration will be retained. 
     * @return DeliveryStatus The status of the real-time log delivery task. Valid values:
<li>`enabled`: Enabled;</li>
<li>`disabled`: Disabled.</li>If this field is not filled in, the original configuration will be retained.
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set The status of the real-time log delivery task. Valid values:
<li>`enabled`: Enabled;</li>
<li>`disabled`: Disabled.</li>If this field is not filled in, the original configuration will be retained.
     * @param DeliveryStatus The status of the real-time log delivery task. Valid values:
<li>`enabled`: Enabled;</li>
<li>`disabled`: Disabled.</li>If this field is not filled in, the original configuration will be retained.
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>If this field is not filled in, the original configuration will be retained. 
     * @return EntityList The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>If this field is not filled in, the original configuration will be retained.
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>If this field is not filled in, the original configuration will be retained.
     * @param EntityList The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>If this field is not filled in, the original configuration will be retained.
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get The list of predefined fields for delivery. If this field is not filled in, the original configuration will be retained. 
     * @return Fields The list of predefined fields for delivery. If this field is not filled in, the original configuration will be retained.
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set The list of predefined fields for delivery. If this field is not filled in, the original configuration will be retained.
     * @param Fields The list of predefined fields for delivery. If this field is not filled in, the original configuration will be retained.
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200. If this field is not filled in, the original configuration will be retained. 
     * @return CustomFields The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200. If this field is not filled in, the original configuration will be retained.
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200. If this field is not filled in, the original configuration will be retained.
     * @param CustomFields The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200. If this field is not filled in, the original configuration will be retained.
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get Log delivery filter conditions. If this field is not filled in, all logs will be delivered. 
     * @return DeliveryConditions Log delivery filter conditions. If this field is not filled in, all logs will be delivered.
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set Log delivery filter conditions. If this field is not filled in, all logs will be delivered.
     * @param DeliveryConditions Log delivery filter conditions. If this field is not filled in, all logs will be delivered.
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the original configuration will be retained. 
     * @return Sample The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the original configuration will be retained.
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the original configuration will be retained.
     * @param Sample The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the original configuration will be retained.
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get Output format for log delivery. If this field is not specified, the original configuration will be retained.Specifically, when TaskType is set to cls, the value of LogFormat.FormatType can only be json, and other parameters in LogFormat will be ignored. It is recommended not to input LogFormat. 
     * @return LogFormat Output format for log delivery. If this field is not specified, the original configuration will be retained.Specifically, when TaskType is set to cls, the value of LogFormat.FormatType can only be json, and other parameters in LogFormat will be ignored. It is recommended not to input LogFormat.
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set Output format for log delivery. If this field is not specified, the original configuration will be retained.Specifically, when TaskType is set to cls, the value of LogFormat.FormatType can only be json, and other parameters in LogFormat will be ignored. It is recommended not to input LogFormat.
     * @param LogFormat Output format for log delivery. If this field is not specified, the original configuration will be retained.Specifically, when TaskType is set to cls, the value of LogFormat.FormatType can only be json, and other parameters in LogFormat will be ignored. It is recommended not to input LogFormat.
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get The configuration information of the custom HTTP service. If this field is not filled in, the original configuration will be retained. 
     * @return CustomEndpoint The configuration information of the custom HTTP service. If this field is not filled in, the original configuration will be retained.
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set The configuration information of the custom HTTP service. If this field is not filled in, the original configuration will be retained.
     * @param CustomEndpoint The configuration information of the custom HTTP service. If this field is not filled in, the original configuration will be retained.
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get The configuration information of the AWS S3-compatible bucket. If this field is not filled in, the original configuration will be retained. 
     * @return S3 The configuration information of the AWS S3-compatible bucket. If this field is not filled in, the original configuration will be retained.
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set The configuration information of the AWS S3-compatible bucket. If this field is not filled in, the original configuration will be retained.
     * @param S3 The configuration information of the AWS S3-compatible bucket. If this field is not filled in, the original configuration will be retained.
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
    }

    public ModifyRealtimeLogDeliveryTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRealtimeLogDeliveryTaskRequest(ModifyRealtimeLogDeliveryTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DeliveryStatus != null) {
            this.DeliveryStatus = new String(source.DeliveryStatus);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DeliveryStatus", this.DeliveryStatus);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamArraySimple(map, prefix + "Fields.", this.Fields);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamArrayObj(map, prefix + "DeliveryConditions.", this.DeliveryConditions);
        this.setParamSimple(map, prefix + "Sample", this.Sample);
        this.setParamObj(map, prefix + "LogFormat.", this.LogFormat);
        this.setParamObj(map, prefix + "CustomEndpoint.", this.CustomEndpoint);
        this.setParamObj(map, prefix + "S3.", this.S3);

    }
}

