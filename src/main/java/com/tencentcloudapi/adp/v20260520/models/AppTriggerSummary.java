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

public class AppTriggerSummary extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>Command execution</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>Workflow execution</td></tr></tbody></table>
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
    * <p>Last session id</p>
    */
    @SerializedName("LastSessionId")
    @Expose
    private String LastSessionId;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table> <p>Value range: [0, 2]</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_STATUS_ENABLED</td> <td>1</td> <td>Enablement</td> </tr> <tr> <td>APP_TRIGGER_STATUS_PAUSED</td> <td>2</td> <td>Suspension</td> </tr> <tr> <td>APP_TRIGGER_STATUS_DELETED</td> <td>3</td> <td>Deleted</td> </tr> </tbody> </table>
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
    * <p>Trigger id.</p>
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
    * <p>Trigger execution status</p>
    */
    @SerializedName("TriggerStatus")
    @Expose
    private TriggerStatus TriggerStatus;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_TYPE_SCHEDULED</td> <td>1</td> <td>Scheduled trigger</td> </tr> <tr> <td>APP_TRIGGER_TYPE_WEBHOOK</td> <td>2</td> <td>Webhook trigger</td> </tr> </tbody> </table>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * <p>The number of unread logs</p>
    */
    @SerializedName("UnreadRunLogCount")
    @Expose
    private String UnreadRunLogCount;

    /**
    * <p>Visitor ID.</p>
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
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>Command execution</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>Workflow execution</td></tr></tbody></table> 
     * @return ExecuteType <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>Command execution</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>Workflow execution</td></tr></tbody></table>
     */
    public Long getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>Command execution</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>Workflow execution</td></tr></tbody></table>
     * @param ExecuteType <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>Command execution</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>Workflow execution</td></tr></tbody></table>
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
     * Get <p>Last session id</p> 
     * @return LastSessionId <p>Last session id</p>
     */
    public String getLastSessionId() {
        return this.LastSessionId;
    }

    /**
     * Set <p>Last session id</p>
     * @param LastSessionId <p>Last session id</p>
     */
    public void setLastSessionId(String LastSessionId) {
        this.LastSessionId = LastSessionId;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table> <p>Value range: [0, 2]</p> 
     * @return Scope <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table> <p>Value range: [0, 2]</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table> <p>Value range: [0, 2]</p>
     * @param Scope <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table> <p>Value range: [0, 2]</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_STATUS_ENABLED</td> <td>1</td> <td>Enablement</td> </tr> <tr> <td>APP_TRIGGER_STATUS_PAUSED</td> <td>2</td> <td>Suspension</td> </tr> <tr> <td>APP_TRIGGER_STATUS_DELETED</td> <td>3</td> <td>Deleted</td> </tr> </tbody> </table> 
     * @return Status <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_STATUS_ENABLED</td> <td>1</td> <td>Enablement</td> </tr> <tr> <td>APP_TRIGGER_STATUS_PAUSED</td> <td>2</td> <td>Suspension</td> </tr> <tr> <td>APP_TRIGGER_STATUS_DELETED</td> <td>3</td> <td>Deleted</td> </tr> </tbody> </table>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_STATUS_ENABLED</td> <td>1</td> <td>Enablement</td> </tr> <tr> <td>APP_TRIGGER_STATUS_PAUSED</td> <td>2</td> <td>Suspension</td> </tr> <tr> <td>APP_TRIGGER_STATUS_DELETED</td> <td>3</td> <td>Deleted</td> </tr> </tbody> </table>
     * @param Status <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_STATUS_ENABLED</td> <td>1</td> <td>Enablement</td> </tr> <tr> <td>APP_TRIGGER_STATUS_PAUSED</td> <td>2</td> <td>Suspension</td> </tr> <tr> <td>APP_TRIGGER_STATUS_DELETED</td> <td>3</td> <td>Deleted</td> </tr> </tbody> </table>
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
     * Get <p>Trigger id.</p> 
     * @return TriggerId <p>Trigger id.</p>
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>Trigger id.</p>
     * @param TriggerId <p>Trigger id.</p>
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
     * Get <p>Trigger execution status</p> 
     * @return TriggerStatus <p>Trigger execution status</p>
     */
    public TriggerStatus getTriggerStatus() {
        return this.TriggerStatus;
    }

    /**
     * Set <p>Trigger execution status</p>
     * @param TriggerStatus <p>Trigger execution status</p>
     */
    public void setTriggerStatus(TriggerStatus TriggerStatus) {
        this.TriggerStatus = TriggerStatus;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_TYPE_SCHEDULED</td> <td>1</td> <td>Scheduled trigger</td> </tr> <tr> <td>APP_TRIGGER_TYPE_WEBHOOK</td> <td>2</td> <td>Webhook trigger</td> </tr> </tbody> </table> 
     * @return TriggerType <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_TYPE_SCHEDULED</td> <td>1</td> <td>Scheduled trigger</td> </tr> <tr> <td>APP_TRIGGER_TYPE_WEBHOOK</td> <td>2</td> <td>Webhook trigger</td> </tr> </tbody> </table>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_TYPE_SCHEDULED</td> <td>1</td> <td>Scheduled trigger</td> </tr> <tr> <td>APP_TRIGGER_TYPE_WEBHOOK</td> <td>2</td> <td>Webhook trigger</td> </tr> </tbody> </table>
     * @param TriggerType <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_TYPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_TYPE_SCHEDULED</td> <td>1</td> <td>Scheduled trigger</td> </tr> <tr> <td>APP_TRIGGER_TYPE_WEBHOOK</td> <td>2</td> <td>Webhook trigger</td> </tr> </tbody> </table>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>The number of unread logs</p> 
     * @return UnreadRunLogCount <p>The number of unread logs</p>
     */
    public String getUnreadRunLogCount() {
        return this.UnreadRunLogCount;
    }

    /**
     * Set <p>The number of unread logs</p>
     * @param UnreadRunLogCount <p>The number of unread logs</p>
     */
    public void setUnreadRunLogCount(String UnreadRunLogCount) {
        this.UnreadRunLogCount = UnreadRunLogCount;
    }

    /**
     * Get <p>Visitor ID.</p> 
     * @return UserId <p>Visitor ID.</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Visitor ID.</p>
     * @param UserId <p>Visitor ID.</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public AppTriggerSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerSummary(AppTriggerSummary source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new Long(source.ExecuteType);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new String(source.FailedCount);
        }
        if (source.LastSessionId != null) {
            this.LastSessionId = new String(source.LastSessionId);
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
        if (source.UnreadRunLogCount != null) {
            this.UnreadRunLogCount = new String(source.UnreadRunLogCount);
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
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "LastSessionId", this.LastSessionId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamObj(map, prefix + "TriggerStatus.", this.TriggerStatus);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "UnreadRunLogCount", this.UnreadRunLogCount);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

