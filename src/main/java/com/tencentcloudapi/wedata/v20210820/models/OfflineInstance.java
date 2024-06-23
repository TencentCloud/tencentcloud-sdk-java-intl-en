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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OfflineInstance extends AbstractModel {

    /**
    * Create Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * Operate Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * Primary AccountNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * AccountsNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Project ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Data Timestamp
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Issuance time
    */
    @SerializedName("IssueId")
    @Expose
    private String IssueId;

    /**
    * Resource Group ID Issuance, not an input item
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InlongTaskId")
    @Expose
    private String InlongTaskId;

    /**
    * Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * Task Type (1 Debugging, 2 Scheduled Execution)
    */
    @SerializedName("TaskRunType")
    @Expose
    private Long TaskRunType;

    /**
    * Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED|COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Start TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last Updated Time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Unique Key
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
     * Get Create Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateUin Create Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Create Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CreateUin Create Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Operate Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OperatorUin Operate Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set Operate Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OperatorUin Operate Account Sub UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get Primary AccountNote: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerUin Primary AccountNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Primary AccountNote: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerUin Primary AccountNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get AccountsNote: This field may return null, indicating that no valid value can be obtained. 
     * @return AppId AccountsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set AccountsNote: This field may return null, indicating that no valid value can be obtained.
     * @param AppId AccountsNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Project ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkspaceId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WorkspaceId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Data Timestamp 
     * @return CurRunDate Data Timestamp
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Data Timestamp
     * @param CurRunDate Data Timestamp
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Issuance time 
     * @return IssueId Issuance time
     */
    public String getIssueId() {
        return this.IssueId;
    }

    /**
     * Set Issuance time
     * @param IssueId Issuance time
     */
    public void setIssueId(String IssueId) {
        this.IssueId = IssueId;
    }

    /**
     * Get Resource Group ID Issuance, not an input item
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InlongTaskId Resource Group ID Issuance, not an input item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInlongTaskId() {
        return this.InlongTaskId;
    }

    /**
     * Set Resource Group ID Issuance, not an input item
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InlongTaskId Resource Group ID Issuance, not an input item
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInlongTaskId(String InlongTaskId) {
        this.InlongTaskId = InlongTaskId;
    }

    /**
     * Get Resource Group
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResourceGroup Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResourceGroup Resource Group
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get Task Type (1 Debugging, 2 Scheduled Execution) 
     * @return TaskRunType Task Type (1 Debugging, 2 Scheduled Execution)
     */
    public Long getTaskRunType() {
        return this.TaskRunType;
    }

    /**
     * Set Task Type (1 Debugging, 2 Scheduled Execution)
     * @param TaskRunType Task Type (1 Debugging, 2 Scheduled Execution)
     */
    public void setTaskRunType(Long TaskRunType) {
        this.TaskRunType = TaskRunType;
    }

    /**
     * Get Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED|COMPLETED|EXPIRED|KILL_EXPIRED|DELETED 
     * @return State Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED|COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED|COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
     * @param State Instance status EVENT_LISTENING|DEPENDENCE|BEFORE_ASPECT|ALLOCATED|LAUNCHED|KILL|SNAP_STATE_SAVING|ISSUED|RUNNING|AFTER_ASPECT|PENDING|KILLING|FINAL_STATE_SAVING|FAILED|KILL_FAILED|COMPLETED|EXPIRED|KILL_EXPIRED|DELETED
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Start TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime End timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime End timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last Updated Time 
     * @return UpdateTime Last Updated Time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last Updated Time
     * @param UpdateTime Last Updated Time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Unique Key
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceKey Unique Key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Unique Key
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceKey Unique Key
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    public OfflineInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OfflineInstance(OfflineInstance source) {
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.IssueId != null) {
            this.IssueId = new String(source.IssueId);
        }
        if (source.InlongTaskId != null) {
            this.InlongTaskId = new String(source.InlongTaskId);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.TaskRunType != null) {
            this.TaskRunType = new Long(source.TaskRunType);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "IssueId", this.IssueId);
        this.setParamSimple(map, prefix + "InlongTaskId", this.InlongTaskId);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "TaskRunType", this.TaskRunType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);

    }
}

