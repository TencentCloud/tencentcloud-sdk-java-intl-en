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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTrigger extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Execution configuration</p>
    */
    @SerializedName("ExecuteConfig")
    @Expose
    private ExecuteConfig ExecuteConfig;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td> <td>1</td> <td>Command execution</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td> <td>2</td> <td>Workflow execution</td> </tr> </tbody> </table>
    */
    @SerializedName("ExecuteType")
    @Expose
    private Long ExecuteType;

    /**
    * <p>Number of failures</p>
    */
    @SerializedName("FailedCount")
    @Expose
    private String FailedCount;

    /**
    * <p>Push channel configuration</p>
    */
    @SerializedName("PushConfig")
    @Expose
    private TimerPushConfig PushConfig;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>Enablement</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>Suspension</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>Deleted</td></tr></tbody></table>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Number of successes</p>
    */
    @SerializedName("SuccessCount")
    @Expose
    private String SuccessCount;

    /**
    * <p>Trigger configuration</p>
    */
    @SerializedName("TriggerConfig")
    @Expose
    private TriggerConfig TriggerConfig;

    /**
    * <p>Trigger ID</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>Trigger name</p>
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * <p>Trigger status</p>
    */
    @SerializedName("TriggerStatus")
    @Expose
    private TriggerStatus TriggerStatus;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>Scheduled trigger</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook trigger</td></tr></tbody></table>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * <p>Visitor ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Execution configuration</p> 
     * @return ExecuteConfig <p>Execution configuration</p>
     */
    public ExecuteConfig getExecuteConfig() {
        return this.ExecuteConfig;
    }

    /**
     * Set <p>Execution configuration</p>
     * @param ExecuteConfig <p>Execution configuration</p>
     */
    public void setExecuteConfig(ExecuteConfig ExecuteConfig) {
        this.ExecuteConfig = ExecuteConfig;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td> <td>1</td> <td>Command execution</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td> <td>2</td> <td>Workflow execution</td> </tr> </tbody> </table> 
     * @return ExecuteType <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td> <td>1</td> <td>Command execution</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td> <td>2</td> <td>Workflow execution</td> </tr> </tbody> </table>
     */
    public Long getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td> <td>1</td> <td>Command execution</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td> <td>2</td> <td>Workflow execution</td> </tr> </tbody> </table>
     * @param ExecuteType <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td> <td>1</td> <td>Command execution</td> </tr> <tr> <td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td> <td>2</td> <td>Workflow execution</td> </tr> </tbody> </table>
     */
    public void setExecuteType(Long ExecuteType) {
        this.ExecuteType = ExecuteType;
    }

    /**
     * Get <p>Number of failures</p> 
     * @return FailedCount <p>Number of failures</p>
     */
    public String getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set <p>Number of failures</p>
     * @param FailedCount <p>Number of failures</p>
     */
    public void setFailedCount(String FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get <p>Push channel configuration</p> 
     * @return PushConfig <p>Push channel configuration</p>
     */
    public TimerPushConfig getPushConfig() {
        return this.PushConfig;
    }

    /**
     * Set <p>Push channel configuration</p>
     * @param PushConfig <p>Push channel configuration</p>
     */
    public void setPushConfig(TimerPushConfig PushConfig) {
        this.PushConfig = PushConfig;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table> 
     * @return Scope <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     * @param Scope <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>Enablement</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>Suspension</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>Deleted</td></tr></tbody></table> 
     * @return Status <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>Enablement</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>Suspension</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>Deleted</td></tr></tbody></table>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>Enablement</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>Suspension</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>Deleted</td></tr></tbody></table>
     * @param Status <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>Enablement</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>Suspension</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>Deleted</td></tr></tbody></table>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Number of successes</p> 
     * @return SuccessCount <p>Number of successes</p>
     */
    public String getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>Number of successes</p>
     * @param SuccessCount <p>Number of successes</p>
     */
    public void setSuccessCount(String SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get <p>Trigger configuration</p> 
     * @return TriggerConfig <p>Trigger configuration</p>
     */
    public TriggerConfig getTriggerConfig() {
        return this.TriggerConfig;
    }

    /**
     * Set <p>Trigger configuration</p>
     * @param TriggerConfig <p>Trigger configuration</p>
     */
    public void setTriggerConfig(TriggerConfig TriggerConfig) {
        this.TriggerConfig = TriggerConfig;
    }

    /**
     * Get <p>Trigger ID</p> 
     * @return TriggerId <p>Trigger ID</p>
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>Trigger ID</p>
     * @param TriggerId <p>Trigger ID</p>
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>Trigger name</p> 
     * @return TriggerName <p>Trigger name</p>
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set <p>Trigger name</p>
     * @param TriggerName <p>Trigger name</p>
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get <p>Trigger status</p> 
     * @return TriggerStatus <p>Trigger status</p>
     */
    public TriggerStatus getTriggerStatus() {
        return this.TriggerStatus;
    }

    /**
     * Set <p>Trigger status</p>
     * @param TriggerStatus <p>Trigger status</p>
     */
    public void setTriggerStatus(TriggerStatus TriggerStatus) {
        this.TriggerStatus = TriggerStatus;
    }

    /**
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>Scheduled trigger</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook trigger</td></tr></tbody></table> 
     * @return TriggerType <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>Scheduled trigger</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook trigger</td></tr></tbody></table>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>Scheduled trigger</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook trigger</td></tr></tbody></table>
     * @param TriggerType <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>Scheduled trigger</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook trigger</td></tr></tbody></table>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Visitor ID</p> 
     * @return UserId <p>Visitor ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Visitor ID</p>
     * @param UserId <p>Visitor ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public AppTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTrigger(AppTrigger source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ExecuteConfig != null) {
            this.ExecuteConfig = new ExecuteConfig(source.ExecuteConfig);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new Long(source.ExecuteType);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new String(source.FailedCount);
        }
        if (source.PushConfig != null) {
            this.PushConfig = new TimerPushConfig(source.PushConfig);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new String(source.SuccessCount);
        }
        if (source.TriggerConfig != null) {
            this.TriggerConfig = new TriggerConfig(source.TriggerConfig);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.TriggerStatus != null) {
            this.TriggerStatus = new TriggerStatus(source.TriggerStatus);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamObj(map, prefix + "ExecuteConfig.", this.ExecuteConfig);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamObj(map, prefix + "PushConfig.", this.PushConfig);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamObj(map, prefix + "TriggerConfig.", this.TriggerConfig);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamObj(map, prefix + "TriggerStatus.", this.TriggerStatus);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

