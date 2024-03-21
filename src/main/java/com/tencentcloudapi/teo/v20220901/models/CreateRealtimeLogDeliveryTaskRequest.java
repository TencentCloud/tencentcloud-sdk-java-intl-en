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
    * The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * The type of the real-time log delivery task. Valid values:
<li>cls: Push to Tencent Cloud CLS;</li>
<li>custom_endpoint: Push to a user-defined HTTP(S) address;</li>
<li>s3: Push to an AWS S3-compatible bucket address.</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * The type of data delivery. Valid values:
<li>domain: Site acceleration log;</li>
<li>application: Layer 4 proxy log;</li>
<li>web-rateLiming: Rate limit and CC attack defense log;</li>
<li>web-attack: Managed rule log;</li>
<li>web-rule: Custom rule log;</li>
<li>web-bot: Bot management log.</li>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * The data delivery area. Valid values:
<li>mainland: Within the Chinese mainland;</li>
<li>overseas: Global (excluding the Chinese mainland).</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * The list of predefined fields for delivery.
    */
    @SerializedName("Fields")
    @Expose
    private String [] Fields;

    /**
    * The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200.
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
    * The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the sampling ratio is 100%.
    */
    @SerializedName("Sample")
    @Expose
    private Long Sample;

    /**
    * The configuration information of CLS. This parameter is required when TaskType is cls.
    */
    @SerializedName("CLS")
    @Expose
    private CLSTopic CLS;

    /**
    * The configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.
    */
    @SerializedName("CustomEndpoint")
    @Expose
    private CustomEndpoint CustomEndpoint;

    /**
    * The configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.
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
     * Get The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters. 
     * @return TaskName The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters.
     * @param TaskName The name of the real-time log delivery task, which is a combination of numbers, English letters, - and _, containing up to 200 characters.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get The type of the real-time log delivery task. Valid values:
<li>cls: Push to Tencent Cloud CLS;</li>
<li>custom_endpoint: Push to a user-defined HTTP(S) address;</li>
<li>s3: Push to an AWS S3-compatible bucket address.</li> 
     * @return TaskType The type of the real-time log delivery task. Valid values:
<li>cls: Push to Tencent Cloud CLS;</li>
<li>custom_endpoint: Push to a user-defined HTTP(S) address;</li>
<li>s3: Push to an AWS S3-compatible bucket address.</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set The type of the real-time log delivery task. Valid values:
<li>cls: Push to Tencent Cloud CLS;</li>
<li>custom_endpoint: Push to a user-defined HTTP(S) address;</li>
<li>s3: Push to an AWS S3-compatible bucket address.</li>
     * @param TaskType The type of the real-time log delivery task. Valid values:
<li>cls: Push to Tencent Cloud CLS;</li>
<li>custom_endpoint: Push to a user-defined HTTP(S) address;</li>
<li>s3: Push to an AWS S3-compatible bucket address.</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li> 
     * @return EntityList The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>
     * @param EntityList The list of entities (Layer 7 domains or Layer 4 proxy instances) corresponding to the real-time log delivery task. Valid value examples:
<li>Layer 7 domain: domain.example.com;</li>
<li>Layer 4 proxy instance: sid-2s69eb5wcms7.</li>
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get The type of data delivery. Valid values:
<li>domain: Site acceleration log;</li>
<li>application: Layer 4 proxy log;</li>
<li>web-rateLiming: Rate limit and CC attack defense log;</li>
<li>web-attack: Managed rule log;</li>
<li>web-rule: Custom rule log;</li>
<li>web-bot: Bot management log.</li> 
     * @return LogType The type of data delivery. Valid values:
<li>domain: Site acceleration log;</li>
<li>application: Layer 4 proxy log;</li>
<li>web-rateLiming: Rate limit and CC attack defense log;</li>
<li>web-attack: Managed rule log;</li>
<li>web-rule: Custom rule log;</li>
<li>web-bot: Bot management log.</li>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set The type of data delivery. Valid values:
<li>domain: Site acceleration log;</li>
<li>application: Layer 4 proxy log;</li>
<li>web-rateLiming: Rate limit and CC attack defense log;</li>
<li>web-attack: Managed rule log;</li>
<li>web-rule: Custom rule log;</li>
<li>web-bot: Bot management log.</li>
     * @param LogType The type of data delivery. Valid values:
<li>domain: Site acceleration log;</li>
<li>application: Layer 4 proxy log;</li>
<li>web-rateLiming: Rate limit and CC attack defense log;</li>
<li>web-attack: Managed rule log;</li>
<li>web-rule: Custom rule log;</li>
<li>web-bot: Bot management log.</li>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get The data delivery area. Valid values:
<li>mainland: Within the Chinese mainland;</li>
<li>overseas: Global (excluding the Chinese mainland).</li> 
     * @return Area The data delivery area. Valid values:
<li>mainland: Within the Chinese mainland;</li>
<li>overseas: Global (excluding the Chinese mainland).</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The data delivery area. Valid values:
<li>mainland: Within the Chinese mainland;</li>
<li>overseas: Global (excluding the Chinese mainland).</li>
     * @param Area The data delivery area. Valid values:
<li>mainland: Within the Chinese mainland;</li>
<li>overseas: Global (excluding the Chinese mainland).</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get The list of predefined fields for delivery. 
     * @return Fields The list of predefined fields for delivery.
     */
    public String [] getFields() {
        return this.Fields;
    }

    /**
     * Set The list of predefined fields for delivery.
     * @param Fields The list of predefined fields for delivery.
     */
    public void setFields(String [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200. 
     * @return CustomFields The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200.
     */
    public CustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200.
     * @param CustomFields The list of custom fields for delivery, supporting extracting specified field values from HTTP request headers, response headers, and cookies. Each custom field name must be unique and the maximum number of fields is 200.
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
     * Get The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the sampling ratio is 100%. 
     * @return Sample The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the sampling ratio is 100%.
     */
    public Long getSample() {
        return this.Sample;
    }

    /**
     * Set The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the sampling ratio is 100%.
     * @param Sample The sampling ratio in permille. Value range: 1 to 1000. For example, 605 represents a sampling ratio of 60.5%. If this field is not filled in, the sampling ratio is 100%.
     */
    public void setSample(Long Sample) {
        this.Sample = Sample;
    }

    /**
     * Get The configuration information of CLS. This parameter is required when TaskType is cls. 
     * @return CLS The configuration information of CLS. This parameter is required when TaskType is cls.
     */
    public CLSTopic getCLS() {
        return this.CLS;
    }

    /**
     * Set The configuration information of CLS. This parameter is required when TaskType is cls.
     * @param CLS The configuration information of CLS. This parameter is required when TaskType is cls.
     */
    public void setCLS(CLSTopic CLS) {
        this.CLS = CLS;
    }

    /**
     * Get The configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint. 
     * @return CustomEndpoint The configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.
     */
    public CustomEndpoint getCustomEndpoint() {
        return this.CustomEndpoint;
    }

    /**
     * Set The configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.
     * @param CustomEndpoint The configuration information of the custom HTTP service. This parameter is required when TaskType is custom_endpoint.
     */
    public void setCustomEndpoint(CustomEndpoint CustomEndpoint) {
        this.CustomEndpoint = CustomEndpoint;
    }

    /**
     * Get The configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3. 
     * @return S3 The configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.
     */
    public S3 getS3() {
        return this.S3;
    }

    /**
     * Set The configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.
     * @param S3 The configuration information of the AWS S3-compatible bucket. This parameter is required when TaskType is s3.
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
        this.setParamObj(map, prefix + "CLS.", this.CLS);
        this.setParamObj(map, prefix + "CustomEndpoint.", this.CustomEndpoint);
        this.setParamObj(map, prefix + "S3.", this.S3);

    }
}

