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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupAction extends AbstractModel {

    /**
    * Task group action ID
    */
    @SerializedName("TaskGroupActionId")
    @Expose
    private Long TaskGroupActionId;

    /**
    * Action instance list of the task group
    */
    @SerializedName("TaskGroupInstances")
    @Expose
    private TaskGroupInstance [] TaskGroupInstances;

    /**
    * Action ID
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * Order of actions in the group
    */
    @SerializedName("TaskGroupActionOrder")
    @Expose
    private Long TaskGroupActionOrder;

    /**
    * General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupActionGeneralConfiguration")
    @Expose
    private String TaskGroupActionGeneralConfiguration;

    /**
    * Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupActionCustomConfiguration")
    @Expose
    private String TaskGroupActionCustomConfiguration;

    /**
    * Status of actions in the group
    */
    @SerializedName("TaskGroupActionStatus")
    @Expose
    private Long TaskGroupActionStatus;

    /**
    * Action group creation time
    */
    @SerializedName("TaskGroupActionCreateTime")
    @Expose
    private String TaskGroupActionCreateTime;

    /**
    * Action group update time
    */
    @SerializedName("TaskGroupActionUpdateTime")
    @Expose
    private String TaskGroupActionUpdateTime;

    /**
    * Action name
    */
    @SerializedName("ActionTitle")
    @Expose
    private String ActionTitle;

    /**
    * Status. 0: no status; 1: successful; 2; failed; 3: terminated; 4: skipped.
    */
    @SerializedName("TaskGroupActionStatusType")
    @Expose
    private Long TaskGroupActionStatusType;

    /**
    * RandomId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupActionRandomId")
    @Expose
    private Long TaskGroupActionRandomId;

    /**
    * RecoverId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupActionRecoverId")
    @Expose
    private Long TaskGroupActionRecoverId;

    /**
    * ExecuteId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupActionExecuteId")
    @Expose
    private Long TaskGroupActionExecuteId;

    /**
    * Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionApiType")
    @Expose
    private Long ActionApiType;

    /**
    * 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionAttribute")
    @Expose
    private Long ActionAttribute;

    /**
    * Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Whether retry is allowed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsExecuteRedo")
    @Expose
    private Boolean IsExecuteRedo;

    /**
    * Action risk level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionRisk")
    @Expose
    private String ActionRisk;

    /**
    * Action running time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupActionExecuteTime")
    @Expose
    private Long TaskGroupActionExecuteTime;

    /**
     * Get Task group action ID 
     * @return TaskGroupActionId Task group action ID
     */
    public Long getTaskGroupActionId() {
        return this.TaskGroupActionId;
    }

    /**
     * Set Task group action ID
     * @param TaskGroupActionId Task group action ID
     */
    public void setTaskGroupActionId(Long TaskGroupActionId) {
        this.TaskGroupActionId = TaskGroupActionId;
    }

    /**
     * Get Action instance list of the task group 
     * @return TaskGroupInstances Action instance list of the task group
     */
    public TaskGroupInstance [] getTaskGroupInstances() {
        return this.TaskGroupInstances;
    }

    /**
     * Set Action instance list of the task group
     * @param TaskGroupInstances Action instance list of the task group
     */
    public void setTaskGroupInstances(TaskGroupInstance [] TaskGroupInstances) {
        this.TaskGroupInstances = TaskGroupInstances;
    }

    /**
     * Get Action ID 
     * @return ActionId Action ID
     */
    public Long getActionId() {
        return this.ActionId;
    }

    /**
     * Set Action ID
     * @param ActionId Action ID
     */
    public void setActionId(Long ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get Order of actions in the group 
     * @return TaskGroupActionOrder Order of actions in the group
     */
    public Long getTaskGroupActionOrder() {
        return this.TaskGroupActionOrder;
    }

    /**
     * Set Order of actions in the group
     * @param TaskGroupActionOrder Order of actions in the group
     */
    public void setTaskGroupActionOrder(Long TaskGroupActionOrder) {
        this.TaskGroupActionOrder = TaskGroupActionOrder;
    }

    /**
     * Get General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupActionGeneralConfiguration General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskGroupActionGeneralConfiguration() {
        return this.TaskGroupActionGeneralConfiguration;
    }

    /**
     * Set General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupActionGeneralConfiguration General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupActionGeneralConfiguration(String TaskGroupActionGeneralConfiguration) {
        this.TaskGroupActionGeneralConfiguration = TaskGroupActionGeneralConfiguration;
    }

    /**
     * Get Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupActionCustomConfiguration Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskGroupActionCustomConfiguration() {
        return this.TaskGroupActionCustomConfiguration;
    }

    /**
     * Set Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupActionCustomConfiguration Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupActionCustomConfiguration(String TaskGroupActionCustomConfiguration) {
        this.TaskGroupActionCustomConfiguration = TaskGroupActionCustomConfiguration;
    }

    /**
     * Get Status of actions in the group 
     * @return TaskGroupActionStatus Status of actions in the group
     */
    public Long getTaskGroupActionStatus() {
        return this.TaskGroupActionStatus;
    }

    /**
     * Set Status of actions in the group
     * @param TaskGroupActionStatus Status of actions in the group
     */
    public void setTaskGroupActionStatus(Long TaskGroupActionStatus) {
        this.TaskGroupActionStatus = TaskGroupActionStatus;
    }

    /**
     * Get Action group creation time 
     * @return TaskGroupActionCreateTime Action group creation time
     */
    public String getTaskGroupActionCreateTime() {
        return this.TaskGroupActionCreateTime;
    }

    /**
     * Set Action group creation time
     * @param TaskGroupActionCreateTime Action group creation time
     */
    public void setTaskGroupActionCreateTime(String TaskGroupActionCreateTime) {
        this.TaskGroupActionCreateTime = TaskGroupActionCreateTime;
    }

    /**
     * Get Action group update time 
     * @return TaskGroupActionUpdateTime Action group update time
     */
    public String getTaskGroupActionUpdateTime() {
        return this.TaskGroupActionUpdateTime;
    }

    /**
     * Set Action group update time
     * @param TaskGroupActionUpdateTime Action group update time
     */
    public void setTaskGroupActionUpdateTime(String TaskGroupActionUpdateTime) {
        this.TaskGroupActionUpdateTime = TaskGroupActionUpdateTime;
    }

    /**
     * Get Action name 
     * @return ActionTitle Action name
     */
    public String getActionTitle() {
        return this.ActionTitle;
    }

    /**
     * Set Action name
     * @param ActionTitle Action name
     */
    public void setActionTitle(String ActionTitle) {
        this.ActionTitle = ActionTitle;
    }

    /**
     * Get Status. 0: no status; 1: successful; 2; failed; 3: terminated; 4: skipped. 
     * @return TaskGroupActionStatusType Status. 0: no status; 1: successful; 2; failed; 3: terminated; 4: skipped.
     */
    public Long getTaskGroupActionStatusType() {
        return this.TaskGroupActionStatusType;
    }

    /**
     * Set Status. 0: no status; 1: successful; 2; failed; 3: terminated; 4: skipped.
     * @param TaskGroupActionStatusType Status. 0: no status; 1: successful; 2; failed; 3: terminated; 4: skipped.
     */
    public void setTaskGroupActionStatusType(Long TaskGroupActionStatusType) {
        this.TaskGroupActionStatusType = TaskGroupActionStatusType;
    }

    /**
     * Get RandomId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupActionRandomId RandomId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskGroupActionRandomId() {
        return this.TaskGroupActionRandomId;
    }

    /**
     * Set RandomId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupActionRandomId RandomId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupActionRandomId(Long TaskGroupActionRandomId) {
        this.TaskGroupActionRandomId = TaskGroupActionRandomId;
    }

    /**
     * Get RecoverId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupActionRecoverId RecoverId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskGroupActionRecoverId() {
        return this.TaskGroupActionRecoverId;
    }

    /**
     * Set RecoverId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupActionRecoverId RecoverId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupActionRecoverId(Long TaskGroupActionRecoverId) {
        this.TaskGroupActionRecoverId = TaskGroupActionRecoverId;
    }

    /**
     * Get ExecuteId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupActionExecuteId ExecuteId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskGroupActionExecuteId() {
        return this.TaskGroupActionExecuteId;
    }

    /**
     * Set ExecuteId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupActionExecuteId ExecuteId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupActionExecuteId(Long TaskGroupActionExecuteId) {
        this.TaskGroupActionExecuteId = TaskGroupActionExecuteId;
    }

    /**
     * Get Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionApiType Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getActionApiType() {
        return this.ActionApiType;
    }

    /**
     * Set Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionApiType Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionApiType(Long ActionApiType) {
        this.ActionApiType = ActionApiType;
    }

    /**
     * Get 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionAttribute 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getActionAttribute() {
        return this.ActionAttribute;
    }

    /**
     * Set 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionAttribute 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionAttribute(Long ActionAttribute) {
        this.ActionAttribute = ActionAttribute;
    }

    /**
     * Get Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionType Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionType Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Whether retry is allowed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsExecuteRedo Whether retry is allowed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsExecuteRedo() {
        return this.IsExecuteRedo;
    }

    /**
     * Set Whether retry is allowed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsExecuteRedo Whether retry is allowed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsExecuteRedo(Boolean IsExecuteRedo) {
        this.IsExecuteRedo = IsExecuteRedo;
    }

    /**
     * Get Action risk level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionRisk Action risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionRisk() {
        return this.ActionRisk;
    }

    /**
     * Set Action risk level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionRisk Action risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionRisk(String ActionRisk) {
        this.ActionRisk = ActionRisk;
    }

    /**
     * Get Action running time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupActionExecuteTime Action running time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskGroupActionExecuteTime() {
        return this.TaskGroupActionExecuteTime;
    }

    /**
     * Set Action running time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupActionExecuteTime Action running time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupActionExecuteTime(Long TaskGroupActionExecuteTime) {
        this.TaskGroupActionExecuteTime = TaskGroupActionExecuteTime;
    }

    public TaskGroupAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupAction(TaskGroupAction source) {
        if (source.TaskGroupActionId != null) {
            this.TaskGroupActionId = new Long(source.TaskGroupActionId);
        }
        if (source.TaskGroupInstances != null) {
            this.TaskGroupInstances = new TaskGroupInstance[source.TaskGroupInstances.length];
            for (int i = 0; i < source.TaskGroupInstances.length; i++) {
                this.TaskGroupInstances[i] = new TaskGroupInstance(source.TaskGroupInstances[i]);
            }
        }
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.TaskGroupActionOrder != null) {
            this.TaskGroupActionOrder = new Long(source.TaskGroupActionOrder);
        }
        if (source.TaskGroupActionGeneralConfiguration != null) {
            this.TaskGroupActionGeneralConfiguration = new String(source.TaskGroupActionGeneralConfiguration);
        }
        if (source.TaskGroupActionCustomConfiguration != null) {
            this.TaskGroupActionCustomConfiguration = new String(source.TaskGroupActionCustomConfiguration);
        }
        if (source.TaskGroupActionStatus != null) {
            this.TaskGroupActionStatus = new Long(source.TaskGroupActionStatus);
        }
        if (source.TaskGroupActionCreateTime != null) {
            this.TaskGroupActionCreateTime = new String(source.TaskGroupActionCreateTime);
        }
        if (source.TaskGroupActionUpdateTime != null) {
            this.TaskGroupActionUpdateTime = new String(source.TaskGroupActionUpdateTime);
        }
        if (source.ActionTitle != null) {
            this.ActionTitle = new String(source.ActionTitle);
        }
        if (source.TaskGroupActionStatusType != null) {
            this.TaskGroupActionStatusType = new Long(source.TaskGroupActionStatusType);
        }
        if (source.TaskGroupActionRandomId != null) {
            this.TaskGroupActionRandomId = new Long(source.TaskGroupActionRandomId);
        }
        if (source.TaskGroupActionRecoverId != null) {
            this.TaskGroupActionRecoverId = new Long(source.TaskGroupActionRecoverId);
        }
        if (source.TaskGroupActionExecuteId != null) {
            this.TaskGroupActionExecuteId = new Long(source.TaskGroupActionExecuteId);
        }
        if (source.ActionApiType != null) {
            this.ActionApiType = new Long(source.ActionApiType);
        }
        if (source.ActionAttribute != null) {
            this.ActionAttribute = new Long(source.ActionAttribute);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.IsExecuteRedo != null) {
            this.IsExecuteRedo = new Boolean(source.IsExecuteRedo);
        }
        if (source.ActionRisk != null) {
            this.ActionRisk = new String(source.ActionRisk);
        }
        if (source.TaskGroupActionExecuteTime != null) {
            this.TaskGroupActionExecuteTime = new Long(source.TaskGroupActionExecuteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupActionId", this.TaskGroupActionId);
        this.setParamArrayObj(map, prefix + "TaskGroupInstances.", this.TaskGroupInstances);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "TaskGroupActionOrder", this.TaskGroupActionOrder);
        this.setParamSimple(map, prefix + "TaskGroupActionGeneralConfiguration", this.TaskGroupActionGeneralConfiguration);
        this.setParamSimple(map, prefix + "TaskGroupActionCustomConfiguration", this.TaskGroupActionCustomConfiguration);
        this.setParamSimple(map, prefix + "TaskGroupActionStatus", this.TaskGroupActionStatus);
        this.setParamSimple(map, prefix + "TaskGroupActionCreateTime", this.TaskGroupActionCreateTime);
        this.setParamSimple(map, prefix + "TaskGroupActionUpdateTime", this.TaskGroupActionUpdateTime);
        this.setParamSimple(map, prefix + "ActionTitle", this.ActionTitle);
        this.setParamSimple(map, prefix + "TaskGroupActionStatusType", this.TaskGroupActionStatusType);
        this.setParamSimple(map, prefix + "TaskGroupActionRandomId", this.TaskGroupActionRandomId);
        this.setParamSimple(map, prefix + "TaskGroupActionRecoverId", this.TaskGroupActionRecoverId);
        this.setParamSimple(map, prefix + "TaskGroupActionExecuteId", this.TaskGroupActionExecuteId);
        this.setParamSimple(map, prefix + "ActionApiType", this.ActionApiType);
        this.setParamSimple(map, prefix + "ActionAttribute", this.ActionAttribute);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "IsExecuteRedo", this.IsExecuteRedo);
        this.setParamSimple(map, prefix + "ActionRisk", this.ActionRisk);
        this.setParamSimple(map, prefix + "TaskGroupActionExecuteTime", this.TaskGroupActionExecuteTime);

    }
}

