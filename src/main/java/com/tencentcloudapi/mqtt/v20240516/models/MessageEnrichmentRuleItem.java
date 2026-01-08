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

public class MessageEnrichmentRuleItem extends AbstractModel {

    /**
    * Rule ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * MQTT cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the rule name.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule matching conditions, in JSON format, must be Base64-encoded. 
Specifies the client id, username, and topic. example: {"clientId":"client-1","username":"client-1","topic":"home/room1"}.
Specifies the Base64-encoded string "eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9".
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Specifies the action of rule execution in JSON format, which must be Base64 encoded.
 Creating a Billing Resource Order
{"messageExpiryInterval":360,"response Topic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"},{"key":"data-source","value":"rule-engine"}]}
Specifies the BASE64-encoded string "eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2UgVG9waWMiOiJyZXBsaWVzL2RldmljZXMvJHtjbGllbnRpZH0iLCJjb3JyZWxhdGlvbkRhdGEiOiIke3RyYWNlaWR9IiwidXNlclByb3BlcnR5IjpbeyJrZXkiOiJ0cmFjZS1pZCIsInZhbHVlIjoiJHt0cmFjZWlkfSJ9LHsia2V5IjoiZGF0YS1zb3VyY2UiLCJ2YWx1ZSI6InJ1bGUtZW5naW5lIn1dfQ==".
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * Rule priority. a smaller number indicates a higher priority. high priority overrides low priority. the UserProperty field will be merged.
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
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time. millisecond-level timestamp.
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * Update time. millisecond-level timestamp.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Rule ID. 
     * @return Id Rule ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID.
     * @param Id Rule ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get MQTT cluster ID. 
     * @return InstanceId MQTT cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set MQTT cluster ID.
     * @param InstanceId MQTT cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the rule name. 
     * @return RuleName Specifies the rule name.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Specifies the rule name.
     * @param RuleName Specifies the rule name.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule matching conditions, in JSON format, must be Base64-encoded. 
Specifies the client id, username, and topic. example: {"clientId":"client-1","username":"client-1","topic":"home/room1"}.
Specifies the Base64-encoded string "eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9". 
     * @return Condition Rule matching conditions, in JSON format, must be Base64-encoded. 
Specifies the client id, username, and topic. example: {"clientId":"client-1","username":"client-1","topic":"home/room1"}.
Specifies the Base64-encoded string "eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9".
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Rule matching conditions, in JSON format, must be Base64-encoded. 
Specifies the client id, username, and topic. example: {"clientId":"client-1","username":"client-1","topic":"home/room1"}.
Specifies the Base64-encoded string "eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9".
     * @param Condition Rule matching conditions, in JSON format, must be Base64-encoded. 
Specifies the client id, username, and topic. example: {"clientId":"client-1","username":"client-1","topic":"home/room1"}.
Specifies the Base64-encoded string "eyJjbGllbnRJZCI6ImNsaWVudC0xIiwidXNlcm5hbWUiOiJjbGllbnQtMSIsInRvcGljIjoiaG9tZS9yb29tMSJ9".
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Specifies the action of rule execution in JSON format, which must be Base64 encoded.
 Creating a Billing Resource Order
{"messageExpiryInterval":360,"response Topic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"},{"key":"data-source","value":"rule-engine"}]}
Specifies the BASE64-encoded string "eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2UgVG9waWMiOiJyZXBsaWVzL2RldmljZXMvJHtjbGllbnRpZH0iLCJjb3JyZWxhdGlvbkRhdGEiOiIke3RyYWNlaWR9IiwidXNlclByb3BlcnR5IjpbeyJrZXkiOiJ0cmFjZS1pZCIsInZhbHVlIjoiJHt0cmFjZWlkfSJ9LHsia2V5IjoiZGF0YS1zb3VyY2UiLCJ2YWx1ZSI6InJ1bGUtZW5naW5lIn1dfQ==". 
     * @return Actions Specifies the action of rule execution in JSON format, which must be Base64 encoded.
 Creating a Billing Resource Order
{"messageExpiryInterval":360,"response Topic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"},{"key":"data-source","value":"rule-engine"}]}
Specifies the BASE64-encoded string "eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2UgVG9waWMiOiJyZXBsaWVzL2RldmljZXMvJHtjbGllbnRpZH0iLCJjb3JyZWxhdGlvbkRhdGEiOiIke3RyYWNlaWR9IiwidXNlclByb3BlcnR5IjpbeyJrZXkiOiJ0cmFjZS1pZCIsInZhbHVlIjoiJHt0cmFjZWlkfSJ9LHsia2V5IjoiZGF0YS1zb3VyY2UiLCJ2YWx1ZSI6InJ1bGUtZW5naW5lIn1dfQ==".
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set Specifies the action of rule execution in JSON format, which must be Base64 encoded.
 Creating a Billing Resource Order
{"messageExpiryInterval":360,"response Topic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"},{"key":"data-source","value":"rule-engine"}]}
Specifies the BASE64-encoded string "eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2UgVG9waWMiOiJyZXBsaWVzL2RldmljZXMvJHtjbGllbnRpZH0iLCJjb3JyZWxhdGlvbkRhdGEiOiIke3RyYWNlaWR9IiwidXNlclByb3BlcnR5IjpbeyJrZXkiOiJ0cmFjZS1pZCIsInZhbHVlIjoiJHt0cmFjZWlkfSJ9LHsia2V5IjoiZGF0YS1zb3VyY2UiLCJ2YWx1ZSI6InJ1bGUtZW5naW5lIn1dfQ==".
     * @param Actions Specifies the action of rule execution in JSON format, which must be Base64 encoded.
 Creating a Billing Resource Order
{"messageExpiryInterval":360,"response Topic":"replies/devices/${clientid}","correlationData":"${traceid}","userProperty":[{"key":"trace-id","value":"${traceid}"},{"key":"data-source","value":"rule-engine"}]}
Specifies the BASE64-encoded string "eyJtZXNzYWdlRXhwaXJ5SW50ZXJ2YWwiOjM2MCwicmVzcG9uc2UgVG9waWMiOiJyZXBsaWVzL2RldmljZXMvJHtjbGllbnRpZH0iLCJjb3JyZWxhdGlvbkRhdGEiOiIke3RyYWNlaWR9IiwidXNlclByb3BlcnR5IjpbeyJrZXkiOiJ0cmFjZS1pZCIsInZhbHVlIjoiJHt0cmFjZWlkfSJ9LHsia2V5IjoiZGF0YS1zb3VyY2UiLCJ2YWx1ZSI6InJ1bGUtZW5naW5lIn1dfQ==".
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get Rule priority. a smaller number indicates a higher priority. high priority overrides low priority. the UserProperty field will be merged. 
     * @return Priority Rule priority. a smaller number indicates a higher priority. high priority overrides low priority. the UserProperty field will be merged.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Rule priority. a smaller number indicates a higher priority. high priority overrides low priority. the UserProperty field will be merged.
     * @param Priority Rule priority. a smaller number indicates a higher priority. high priority overrides low priority. the UserProperty field will be merged.
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
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time. millisecond-level timestamp. 
     * @return CreatedTime Creation time. millisecond-level timestamp.
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time. millisecond-level timestamp.
     * @param CreatedTime Creation time. millisecond-level timestamp.
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Update time. millisecond-level timestamp. 
     * @return UpdateTime Update time. millisecond-level timestamp.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. millisecond-level timestamp.
     * @param UpdateTime Update time. millisecond-level timestamp.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MessageEnrichmentRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageEnrichmentRuleItem(MessageEnrichmentRuleItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
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
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

