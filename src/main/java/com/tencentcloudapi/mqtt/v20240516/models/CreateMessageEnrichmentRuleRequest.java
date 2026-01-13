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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMessageEnrichmentRuleRequest extends AbstractModel {

    /**
    * tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule matching conditions in JSON format, Base64 encoding is required.
Creating a Billing Resource Order
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Specifies the Base64-encoded content.
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Specifies the action of rule execution in JSON format, which must be Base64 encoded.
Creating a Billing Resource Order
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
Specifies the BASE64-encoded value.
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ==
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * Rule priority. a smaller number indicates a higher priority. high priority overwrites low-priority. the userproperty field will be merged.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Rule status. valid values: 0 (undefined), 1 (activate), 2 (deactivate). default: deactivate.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Specifies the remark with length not exceeding 128 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console. 
     * @return InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     * @param InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Rule name 
     * @return RuleName Rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
     * @param RuleName Rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule matching conditions in JSON format, Base64 encoding is required.
Creating a Billing Resource Order
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Specifies the Base64-encoded content.
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9 
     * @return Condition Rule matching conditions in JSON format, Base64 encoding is required.
Creating a Billing Resource Order
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Specifies the Base64-encoded content.
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Rule matching conditions in JSON format, Base64 encoding is required.
Creating a Billing Resource Order
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Specifies the Base64-encoded content.
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9
     * @param Condition Rule matching conditions in JSON format, Base64 encoding is required.
Creating a Billing Resource Order
{"clientId":"client-1","username":"client-1","topic":"home/room1"}
Specifies the Base64-encoded content.
eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Specifies the action of rule execution in JSON format, which must be Base64 encoded.
Creating a Billing Resource Order
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
Specifies the BASE64-encoded value.
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ== 
     * @return Actions Specifies the action of rule execution in JSON format, which must be Base64 encoded.
Creating a Billing Resource Order
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
Specifies the BASE64-encoded value.
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ==
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set Specifies the action of rule execution in JSON format, which must be Base64 encoded.
Creating a Billing Resource Order
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
Specifies the BASE64-encoded value.
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ==
     * @param Actions Specifies the action of rule execution in JSON format, which must be Base64 encoded.
Creating a Billing Resource Order
{"messageExpiryInterval":360,"responseTopic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"}]}
Specifies the BASE64-encoded value.
eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2VUb3BpYyI6InJlcGxpZXMvZGV2aWNlcy8ke2NsaWVudGlkfSIsImNvcnJlbGF0aW9uRGF0YSI6IiR7dHJhY2VpZH0iLCJ1c2VyUHJvcGVydHkiOlt7ImtleSI6InRyYWNlLWlkIiwidmFsdWUiOiIke3RyYWNlaWR9In1dfQ==
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get Rule priority. a smaller number indicates a higher priority. high priority overwrites low-priority. the userproperty field will be merged. 
     * @return Priority Rule priority. a smaller number indicates a higher priority. high priority overwrites low-priority. the userproperty field will be merged.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Rule priority. a smaller number indicates a higher priority. high priority overwrites low-priority. the userproperty field will be merged.
     * @param Priority Rule priority. a smaller number indicates a higher priority. high priority overwrites low-priority. the userproperty field will be merged.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Rule status. valid values: 0 (undefined), 1 (activate), 2 (deactivate). default: deactivate. 
     * @return Status Rule status. valid values: 0 (undefined), 1 (activate), 2 (deactivate). default: deactivate.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. valid values: 0 (undefined), 1 (activate), 2 (deactivate). default: deactivate.
     * @param Status Rule status. valid values: 0 (undefined), 1 (activate), 2 (deactivate). default: deactivate.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies the remark with length not exceeding 128 characters. 
     * @return Remark Specifies the remark with length not exceeding 128 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark with length not exceeding 128 characters.
     * @param Remark Specifies the remark with length not exceeding 128 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateMessageEnrichmentRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMessageEnrichmentRuleRequest(CreateMessageEnrichmentRuleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Actions != null) {
            this.Actions = new String(source.Actions);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

