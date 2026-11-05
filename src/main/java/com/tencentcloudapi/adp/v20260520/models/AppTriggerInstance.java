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

public class AppTriggerInstance extends AbstractModel {

    /**
    * <p>Application id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Session id</p>
    */
    @SerializedName("ConversationId")
    @Expose
    private String ConversationId;

    /**
    * <p>Trigger creation time</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>End time.</p>
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
    * <p>Trigger running instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Request ID</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>Result code</p>
    */
    @SerializedName("ResultCode")
    @Expose
    private String ResultCode;

    /**
    * <p>Result Summary</p>
    */
    @SerializedName("ResultSummary")
    @Expose
    private String ResultSummary;

    /**
    * <p>Single dialogue id</p>
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>Originates from an application trigger</td></tr></tbody></table>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>Trigger start execution time</p>
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>TIMER_RUN_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>TIMER_RUN_STATUS_PENDING</td> <td>1</td> <td>Waiting to execute</td> </tr> <tr> <td>TIMER_RUN_STATUS_RUNNING</td> <td>2</td> <td>Executing</td> </tr> <tr> <td>TIMER_RUN_STATUS_RETRY_WAIT</td> <td>3</td> <td>Wait for retry</td> </tr> <tr> <td>TIMER_RUN_STATUS_SUCCESS</td> <td>4</td> <td>Successful</td> </tr> <tr> <td>TIMER_RUN_STATUS_DEAD</td> <td>5</td> <td>Failure final state (retry exhausted / non-retriable)</td> </tr> <tr> <td>TIMER_RUN_STATUS_CANCELLED</td> <td>6</td> <td>Cancelled by task pause/deletion/modification</td> </tr> </tbody> </table>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>TraceId, used for logging</p>
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * <p>Trigger id</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>Visitor ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>Workflow running ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
     * Get <p>Application id</p> 
     * @return AppId <p>Application id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application id</p>
     * @param AppId <p>Application id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Session id</p> 
     * @return ConversationId <p>Session id</p>
     */
    public String getConversationId() {
        return this.ConversationId;
    }

    /**
     * Set <p>Session id</p>
     * @param ConversationId <p>Session id</p>
     */
    public void setConversationId(String ConversationId) {
        this.ConversationId = ConversationId;
    }

    /**
     * Get <p>Trigger creation time</p> 
     * @return CreatedAt <p>Trigger creation time</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Trigger creation time</p>
     * @param CreatedAt <p>Trigger creation time</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>End time.</p> 
     * @return FinishedAt <p>End time.</p>
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set <p>End time.</p>
     * @param FinishedAt <p>End time.</p>
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    /**
     * Get <p>Trigger running instance id</p> 
     * @return InstanceId <p>Trigger running instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Trigger running instance id</p>
     * @param InstanceId <p>Trigger running instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Request ID</p> 
     * @return RequestId <p>Request ID</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>Request ID</p>
     * @param RequestId <p>Request ID</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get <p>Result code</p> 
     * @return ResultCode <p>Result code</p>
     */
    public String getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set <p>Result code</p>
     * @param ResultCode <p>Result code</p>
     */
    public void setResultCode(String ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get <p>Result Summary</p> 
     * @return ResultSummary <p>Result Summary</p>
     */
    public String getResultSummary() {
        return this.ResultSummary;
    }

    /**
     * Set <p>Result Summary</p>
     * @param ResultSummary <p>Result Summary</p>
     */
    public void setResultSummary(String ResultSummary) {
        this.ResultSummary = ResultSummary;
    }

    /**
     * Get <p>Single dialogue id</p> 
     * @return RunId <p>Single dialogue id</p>
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set <p>Single dialogue id</p>
     * @param RunId <p>Single dialogue id</p>
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
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
     * Get <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>Originates from an application trigger</td></tr></tbody></table> 
     * @return Source <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>Originates from an application trigger</td></tr></tbody></table>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>Originates from an application trigger</td></tr></tbody></table>
     * @param Source <table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>Unspecified</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>Originates from an application trigger</td></tr></tbody></table>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Trigger start execution time</p> 
     * @return StartedAt <p>Trigger start execution time</p>
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set <p>Trigger start execution time</p>
     * @param StartedAt <p>Trigger start execution time</p>
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>TIMER_RUN_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>TIMER_RUN_STATUS_PENDING</td> <td>1</td> <td>Waiting to execute</td> </tr> <tr> <td>TIMER_RUN_STATUS_RUNNING</td> <td>2</td> <td>Executing</td> </tr> <tr> <td>TIMER_RUN_STATUS_RETRY_WAIT</td> <td>3</td> <td>Wait for retry</td> </tr> <tr> <td>TIMER_RUN_STATUS_SUCCESS</td> <td>4</td> <td>Successful</td> </tr> <tr> <td>TIMER_RUN_STATUS_DEAD</td> <td>5</td> <td>Failure final state (retry exhausted / non-retriable)</td> </tr> <tr> <td>TIMER_RUN_STATUS_CANCELLED</td> <td>6</td> <td>Cancelled by task pause/deletion/modification</td> </tr> </tbody> </table> 
     * @return Status <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>TIMER_RUN_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>TIMER_RUN_STATUS_PENDING</td> <td>1</td> <td>Waiting to execute</td> </tr> <tr> <td>TIMER_RUN_STATUS_RUNNING</td> <td>2</td> <td>Executing</td> </tr> <tr> <td>TIMER_RUN_STATUS_RETRY_WAIT</td> <td>3</td> <td>Wait for retry</td> </tr> <tr> <td>TIMER_RUN_STATUS_SUCCESS</td> <td>4</td> <td>Successful</td> </tr> <tr> <td>TIMER_RUN_STATUS_DEAD</td> <td>5</td> <td>Failure final state (retry exhausted / non-retriable)</td> </tr> <tr> <td>TIMER_RUN_STATUS_CANCELLED</td> <td>6</td> <td>Cancelled by task pause/deletion/modification</td> </tr> </tbody> </table>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>TIMER_RUN_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>TIMER_RUN_STATUS_PENDING</td> <td>1</td> <td>Waiting to execute</td> </tr> <tr> <td>TIMER_RUN_STATUS_RUNNING</td> <td>2</td> <td>Executing</td> </tr> <tr> <td>TIMER_RUN_STATUS_RETRY_WAIT</td> <td>3</td> <td>Wait for retry</td> </tr> <tr> <td>TIMER_RUN_STATUS_SUCCESS</td> <td>4</td> <td>Successful</td> </tr> <tr> <td>TIMER_RUN_STATUS_DEAD</td> <td>5</td> <td>Failure final state (retry exhausted / non-retriable)</td> </tr> <tr> <td>TIMER_RUN_STATUS_CANCELLED</td> <td>6</td> <td>Cancelled by task pause/deletion/modification</td> </tr> </tbody> </table>
     * @param Status <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>TIMER_RUN_STATUS_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>TIMER_RUN_STATUS_PENDING</td> <td>1</td> <td>Waiting to execute</td> </tr> <tr> <td>TIMER_RUN_STATUS_RUNNING</td> <td>2</td> <td>Executing</td> </tr> <tr> <td>TIMER_RUN_STATUS_RETRY_WAIT</td> <td>3</td> <td>Wait for retry</td> </tr> <tr> <td>TIMER_RUN_STATUS_SUCCESS</td> <td>4</td> <td>Successful</td> </tr> <tr> <td>TIMER_RUN_STATUS_DEAD</td> <td>5</td> <td>Failure final state (retry exhausted / non-retriable)</td> </tr> <tr> <td>TIMER_RUN_STATUS_CANCELLED</td> <td>6</td> <td>Cancelled by task pause/deletion/modification</td> </tr> </tbody> </table>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>TraceId, used for logging</p> 
     * @return TraceId <p>TraceId, used for logging</p>
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>TraceId, used for logging</p>
     * @param TraceId <p>TraceId, used for logging</p>
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
    }

    /**
     * Get <p>Trigger id</p> 
     * @return TriggerId <p>Trigger id</p>
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>Trigger id</p>
     * @param TriggerId <p>Trigger id</p>
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
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

    /**
     * Get <p>Workflow running ID</p> 
     * @return WorkflowRunId <p>Workflow running ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>Workflow running ID</p>
     * @param WorkflowRunId <p>Workflow running ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    public AppTriggerInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerInstance(AppTriggerInstance source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ConversationId != null) {
            this.ConversationId = new String(source.ConversationId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.ResultCode != null) {
            this.ResultCode = new String(source.ResultCode);
        }
        if (source.ResultSummary != null) {
            this.ResultSummary = new String(source.ResultSummary);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ConversationId", this.ConversationId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ResultSummary", this.ResultSummary);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);

    }
}

