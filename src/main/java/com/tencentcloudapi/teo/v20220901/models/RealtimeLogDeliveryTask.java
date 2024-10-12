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

public class RealtimeLogDeliveryTask extends AbstractModel {

    /**
    * ID of a real-time log shipping task.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Name of a real-time log shipping task.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li>
    */
    @SerializedName("DeliveryStatus")
    @Expose
    private String DeliveryStatus;

    /**
    * Type of a real-time log shipping task. Valid values:<li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address.</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log shipping task. Valid value examples: <li>L7 domain name: domain.example.com;</li><li>L4 proxy instance: sid-2s69eb5wcms7.</li>	
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * Data shipping type. Valid values: <li>domain: site acceleration logs;</li><li>application: L4 proxy logs;</li><li>web-rateLiming: rate limiting and CC attack defense logs;</li><li>web-attack: managed rule logs;</li><li>web-rule: custom rule logs;</li><li>web-bot: Bot management logs.</li>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * List of predefined fields for shipping.
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * List of custom fields for shipping.
    */
    @SerializedName("CustomFields")
    @Expose
    private CustomField [] CustomFields;

    /**
    * Filter criteria of log shipping.
    */
    @SerializedName("DeliveryConditions")
    @Expose
    private DeliveryCondition [] DeliveryConditions;

    /**
    * Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines. </li>
Note: This field may return 'null', which indicates a failure to obtain a valid value.
    */
    @SerializedName("LogFormat")
    @Expose
    private LogFormat LogFormat;

    /**
    * Configuration information of the CLS.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * Configuration information of the custom HTTP service.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * Configuration information of the AWS S3-compatible bucket.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("S3")
    @Expose
    private S3 S3;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get ID of a real-time log shipping task. 
     * @return TaskId ID of a real-time log shipping task.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of a real-time log shipping task.
     * @param TaskId ID of a real-time log shipping task.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Name of a real-time log shipping task. 
     * @return TaskName Name of a real-time log shipping task.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Name of a real-time log shipping task.
     * @param TaskName Name of a real-time log shipping task.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li> 
     * @return DeliveryStatus Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li>
     */
    public String getDeliveryStatus() {
        return this.DeliveryStatus;
    }

    /**
     * Set Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li>
     * @param DeliveryStatus Status of a real-time log shipping task. Valid values: <li>enabled: enabled;</li><li>disabled: disabled;</li><li>deleted: deleted abnormally. Check whether the destination log set/log topic of Tencent Cloud CLS has been deleted.</li>
     */
    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    /**
     * Get Type of a real-time log shipping task. Valid values:<li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address.</li> 
     * @return TaskType Type of a real-time log shipping task. Valid values:<li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address.</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Type of a real-time log shipping task. Valid values:<li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address.</li>
     * @param TaskType Type of a real-time log shipping task. Valid values:<li>cls: push to Tencent Cloud CLS;</li><li>custom_endpoint: push to a custom HTTP(S) address;</li><li>s3: push to an AWS S3-compatible bucket address.</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log shipping task. Valid value examples: <li>L7 domain name: domain.example.com;</li><li>L4 proxy instance: sid-2s69eb5wcms7.</li>	 
     * @return EntityList List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log shipping task. Valid value examples: <li>L7 domain name: domain.example.com;</li><li>L4 proxy instance: sid-2s69eb5wcms7.</li>	
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log shipping task. Valid value examples: <li>L7 domain name: domain.example.com;</li><li>L4 proxy instance: sid-2s69eb5wcms7.</li>	
     * @param EntityList List of entities (L7 domain names or L4 proxy instances) corresponding to a real-time log shipping task. Valid value examples: <li>L7 domain name: domain.example.com;</li><li>L4 proxy instance: sid-2s69eb5wcms7.</li>	
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get Data shipping type. Valid values: <li>domain: site acceleration logs;</li><li>application: L4 proxy logs;</li><li>web-rateLiming: rate limiting and CC attack defense logs;</li><li>web-attack: managed rule logs;</li><li>web-rule: custom rule logs;</li><li>web-bot: Bot management logs.</li> 
     * @return LogType Data shipping type. Valid values: <li>domain: site acceleration logs;</li><li>application: L4 proxy logs;</li><li>web-rateLiming: rate limiting and CC attack defense logs;</li><li>web-attack: managed rule logs;</li><li>web-rule: custom rule logs;</li><li>web-bot: Bot management logs.</li>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Data shipping type. Valid values: <li>domain: site acceleration logs;</li><li>application: L4 proxy logs;</li><li>web-rateLiming: rate limiting and CC attack defense logs;</li><li>web-attack: managed rule logs;</li><li>web-rule: custom rule logs;</li><li>web-bot: Bot management logs.</li>
     * @param LogType Data shipping type. Valid values: <li>domain: site acceleration logs;</li><li>application: L4 proxy logs;</li><li>web-rateLiming: rate limiting and CC attack defense logs;</li><li>web-attack: managed rule logs;</li><li>web-rule: custom rule logs;</li><li>web-bot: Bot management logs.</li>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li> 
     * @return Area Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li>
     * @param Area Data shipping area. Valid values:<li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding the Chinese mainland).</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get List of predefined fields for shipping. 
     * @return Fields List of predefined fields for shipping.
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set List of predefined fields for shipping.
     * @param Fields List of predefined fields for shipping.
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get List of custom fields for shipping. 
     * @return CustomFields List of custom fields for shipping.
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set List of custom fields for shipping.
     * @param CustomFields List of custom fields for shipping.
     */
    public void setCustomFields(CustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get Filter criteria of log shipping. 
     * @return DeliveryConditions Filter criteria of log shipping.
     */
    public DeliveryCondition [] getDeliveryConditions() {
        return this.DeliveryConditions;
    }

    /**
     * Set Filter criteria of log shipping.
     * @param DeliveryConditions Filter criteria of log shipping.
     */
    public void setDeliveryConditions(DeliveryCondition [] DeliveryConditions) {
        this.DeliveryConditions = DeliveryConditions;
    }

    /**
     * Get Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%. 
     * @return Sample Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.
     * @param Sample Sampling ratio in permille. Value range: 1-1000. For example, 605 indicates a sampling ratio of 60.5%.
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines. </li>
Note: This field may return 'null', which indicates a failure to obtain a valid value. 
     * @return LogFormat Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines. </li>
Note: This field may return 'null', which indicates a failure to obtain a valid value.
     */
    public LogFormat getLogFormat() {
        return this.LogFormat;
    }

    /**
     * Set Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines. </li>
Note: This field may return 'null', which indicates a failure to obtain a valid value.
     * @param LogFormat Output format for log delivery. When the output parameter is null, the default format is used, which works as follows:
<li>When TaskType is 'custom_endpoint', the default format is an array of JSON objects, with each JSON object representing a log entry;</li>
<li>When TaskType is 's3', the default format is JSON Lines. </li>
Note: This field may return 'null', which indicates a failure to obtain a valid value.
     */
    public void setLogFormat(LogFormat LogFormat) {
        this.LogFormat = LogFormat;
    }

    /**
     * Get Configuration information of the CLS.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return CLS Configuration information of the CLS.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set Configuration information of the CLS.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param CLS Configuration information of the CLS.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get Configuration information of the custom HTTP service.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return CustomEndpoint Configuration information of the custom HTTP service.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set Configuration information of the custom HTTP service.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param CustomEndpoint Configuration information of the custom HTTP service.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get Configuration information of the AWS S3-compatible bucket.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return S3 Configuration information of the AWS S3-compatible bucket.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set Configuration information of the AWS S3-compatible bucket.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param S3 Configuration information of the AWS S3-compatible bucket.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setS3(S3 S3) {
        this.S3 = S3;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
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
        this.setParamArrayObj(map, prefix + "DeliveryConditions.", this.DeliveryConditions);
        this.setParamSimple(map, prefix + "Sample", this.Sample);
        this.setParamObj(map, prefix + "LogFormat.", this.LogFormat);
        this.setParamObj(map, prefix + "CLS.", this.CLS);
        this.setParamObj(map, prefix + "CustomEndpoint.", this.CustomEndpoint);
        this.setParamObj(map, prefix + "S3.", this.S3);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

