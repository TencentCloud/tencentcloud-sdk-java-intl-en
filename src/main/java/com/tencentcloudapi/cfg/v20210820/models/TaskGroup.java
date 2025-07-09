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

public class TaskGroup extends AbstractModel {

    /**
    * Task action ID
    */
    @SerializedName("TaskGroupId")
    @Expose
    private Long TaskGroupId;

    /**
    * Group name
    */
    @SerializedName("TaskGroupTitle")
    @Expose
    private String TaskGroupTitle;

    /**
    * Group description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupDescription")
    @Expose
    private String TaskGroupDescription;

    /**
    * Task group order
    */
    @SerializedName("TaskGroupOrder")
    @Expose
    private Long TaskGroupOrder;

    /**
    * Object type ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
    * Task group creation time
    */
    @SerializedName("TaskGroupCreateTime")
    @Expose
    private String TaskGroupCreateTime;

    /**
    * Task group update time
    */
    @SerializedName("TaskGroupUpdateTime")
    @Expose
    private String TaskGroupUpdateTime;

    /**
    * List of actions in the group
    */
    @SerializedName("TaskGroupActions")
    @Expose
    private TaskGroupAction [] TaskGroupActions;

    /**
    * Instance list
    */
    @SerializedName("TaskGroupInstanceList")
    @Expose
    private String [] TaskGroupInstanceList;

    /**
    * Execution mode. 1: sequential execution; 2: execution by stage.
    */
    @SerializedName("TaskGroupMode")
    @Expose
    private Long TaskGroupMode;

    /**
    * List of instances not involved in the experiment
    */
    @SerializedName("TaskGroupDiscardInstanceList")
    @Expose
    private String [] TaskGroupDiscardInstanceList;

    /**
    * List of instances involved in the experiment
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupSelectedInstanceList")
    @Expose
    private String [] TaskGroupSelectedInstanceList;

    /**
    * Machine selection rule
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstancesExecuteRule")
    @Expose
    private TaskGroupInstancesExecuteRules [] TaskGroupInstancesExecuteRule;

    /**
     * Get Task action ID 
     * @return TaskGroupId Task action ID
     */
    public Long getTaskGroupId() {
        return this.TaskGroupId;
    }

    /**
     * Set Task action ID
     * @param TaskGroupId Task action ID
     */
    public void setTaskGroupId(Long TaskGroupId) {
        this.TaskGroupId = TaskGroupId;
    }

    /**
     * Get Group name 
     * @return TaskGroupTitle Group name
     */
    public String getTaskGroupTitle() {
        return this.TaskGroupTitle;
    }

    /**
     * Set Group name
     * @param TaskGroupTitle Group name
     */
    public void setTaskGroupTitle(String TaskGroupTitle) {
        this.TaskGroupTitle = TaskGroupTitle;
    }

    /**
     * Get Group description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupDescription Group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskGroupDescription() {
        return this.TaskGroupDescription;
    }

    /**
     * Set Group description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupDescription Group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupDescription(String TaskGroupDescription) {
        this.TaskGroupDescription = TaskGroupDescription;
    }

    /**
     * Get Task group order 
     * @return TaskGroupOrder Task group order
     */
    public Long getTaskGroupOrder() {
        return this.TaskGroupOrder;
    }

    /**
     * Set Task group order
     * @param TaskGroupOrder Task group order
     */
    public void setTaskGroupOrder(Long TaskGroupOrder) {
        this.TaskGroupOrder = TaskGroupOrder;
    }

    /**
     * Get Object type ID 
     * @return ObjectTypeId Object type ID
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set Object type ID
     * @param ObjectTypeId Object type ID
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
    }

    /**
     * Get Task group creation time 
     * @return TaskGroupCreateTime Task group creation time
     */
    public String getTaskGroupCreateTime() {
        return this.TaskGroupCreateTime;
    }

    /**
     * Set Task group creation time
     * @param TaskGroupCreateTime Task group creation time
     */
    public void setTaskGroupCreateTime(String TaskGroupCreateTime) {
        this.TaskGroupCreateTime = TaskGroupCreateTime;
    }

    /**
     * Get Task group update time 
     * @return TaskGroupUpdateTime Task group update time
     */
    public String getTaskGroupUpdateTime() {
        return this.TaskGroupUpdateTime;
    }

    /**
     * Set Task group update time
     * @param TaskGroupUpdateTime Task group update time
     */
    public void setTaskGroupUpdateTime(String TaskGroupUpdateTime) {
        this.TaskGroupUpdateTime = TaskGroupUpdateTime;
    }

    /**
     * Get List of actions in the group 
     * @return TaskGroupActions List of actions in the group
     */
    public TaskGroupAction [] getTaskGroupActions() {
        return this.TaskGroupActions;
    }

    /**
     * Set List of actions in the group
     * @param TaskGroupActions List of actions in the group
     */
    public void setTaskGroupActions(TaskGroupAction [] TaskGroupActions) {
        this.TaskGroupActions = TaskGroupActions;
    }

    /**
     * Get Instance list 
     * @return TaskGroupInstanceList Instance list
     */
    public String [] getTaskGroupInstanceList() {
        return this.TaskGroupInstanceList;
    }

    /**
     * Set Instance list
     * @param TaskGroupInstanceList Instance list
     */
    public void setTaskGroupInstanceList(String [] TaskGroupInstanceList) {
        this.TaskGroupInstanceList = TaskGroupInstanceList;
    }

    /**
     * Get Execution mode. 1: sequential execution; 2: execution by stage. 
     * @return TaskGroupMode Execution mode. 1: sequential execution; 2: execution by stage.
     */
    public Long getTaskGroupMode() {
        return this.TaskGroupMode;
    }

    /**
     * Set Execution mode. 1: sequential execution; 2: execution by stage.
     * @param TaskGroupMode Execution mode. 1: sequential execution; 2: execution by stage.
     */
    public void setTaskGroupMode(Long TaskGroupMode) {
        this.TaskGroupMode = TaskGroupMode;
    }

    /**
     * Get List of instances not involved in the experiment 
     * @return TaskGroupDiscardInstanceList List of instances not involved in the experiment
     */
    public String [] getTaskGroupDiscardInstanceList() {
        return this.TaskGroupDiscardInstanceList;
    }

    /**
     * Set List of instances not involved in the experiment
     * @param TaskGroupDiscardInstanceList List of instances not involved in the experiment
     */
    public void setTaskGroupDiscardInstanceList(String [] TaskGroupDiscardInstanceList) {
        this.TaskGroupDiscardInstanceList = TaskGroupDiscardInstanceList;
    }

    /**
     * Get List of instances involved in the experiment
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupSelectedInstanceList List of instances involved in the experiment
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTaskGroupSelectedInstanceList() {
        return this.TaskGroupSelectedInstanceList;
    }

    /**
     * Set List of instances involved in the experiment
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupSelectedInstanceList List of instances involved in the experiment
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupSelectedInstanceList(String [] TaskGroupSelectedInstanceList) {
        this.TaskGroupSelectedInstanceList = TaskGroupSelectedInstanceList;
    }

    /**
     * Get Machine selection rule
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstancesExecuteRule Machine selection rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskGroupInstancesExecuteRules [] getTaskGroupInstancesExecuteRule() {
        return this.TaskGroupInstancesExecuteRule;
    }

    /**
     * Set Machine selection rule
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstancesExecuteRule Machine selection rule
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstancesExecuteRule(TaskGroupInstancesExecuteRules [] TaskGroupInstancesExecuteRule) {
        this.TaskGroupInstancesExecuteRule = TaskGroupInstancesExecuteRule;
    }

    public TaskGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroup(TaskGroup source) {
        if (source.TaskGroupId != null) {
            this.TaskGroupId = new Long(source.TaskGroupId);
        }
        if (source.TaskGroupTitle != null) {
            this.TaskGroupTitle = new String(source.TaskGroupTitle);
        }
        if (source.TaskGroupDescription != null) {
            this.TaskGroupDescription = new String(source.TaskGroupDescription);
        }
        if (source.TaskGroupOrder != null) {
            this.TaskGroupOrder = new Long(source.TaskGroupOrder);
        }
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
        if (source.TaskGroupCreateTime != null) {
            this.TaskGroupCreateTime = new String(source.TaskGroupCreateTime);
        }
        if (source.TaskGroupUpdateTime != null) {
            this.TaskGroupUpdateTime = new String(source.TaskGroupUpdateTime);
        }
        if (source.TaskGroupActions != null) {
            this.TaskGroupActions = new TaskGroupAction[source.TaskGroupActions.length];
            for (int i = 0; i < source.TaskGroupActions.length; i++) {
                this.TaskGroupActions[i] = new TaskGroupAction(source.TaskGroupActions[i]);
            }
        }
        if (source.TaskGroupInstanceList != null) {
            this.TaskGroupInstanceList = new String[source.TaskGroupInstanceList.length];
            for (int i = 0; i < source.TaskGroupInstanceList.length; i++) {
                this.TaskGroupInstanceList[i] = new String(source.TaskGroupInstanceList[i]);
            }
        }
        if (source.TaskGroupMode != null) {
            this.TaskGroupMode = new Long(source.TaskGroupMode);
        }
        if (source.TaskGroupDiscardInstanceList != null) {
            this.TaskGroupDiscardInstanceList = new String[source.TaskGroupDiscardInstanceList.length];
            for (int i = 0; i < source.TaskGroupDiscardInstanceList.length; i++) {
                this.TaskGroupDiscardInstanceList[i] = new String(source.TaskGroupDiscardInstanceList[i]);
            }
        }
        if (source.TaskGroupSelectedInstanceList != null) {
            this.TaskGroupSelectedInstanceList = new String[source.TaskGroupSelectedInstanceList.length];
            for (int i = 0; i < source.TaskGroupSelectedInstanceList.length; i++) {
                this.TaskGroupSelectedInstanceList[i] = new String(source.TaskGroupSelectedInstanceList[i]);
            }
        }
        if (source.TaskGroupInstancesExecuteRule != null) {
            this.TaskGroupInstancesExecuteRule = new TaskGroupInstancesExecuteRules[source.TaskGroupInstancesExecuteRule.length];
            for (int i = 0; i < source.TaskGroupInstancesExecuteRule.length; i++) {
                this.TaskGroupInstancesExecuteRule[i] = new TaskGroupInstancesExecuteRules(source.TaskGroupInstancesExecuteRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupId", this.TaskGroupId);
        this.setParamSimple(map, prefix + "TaskGroupTitle", this.TaskGroupTitle);
        this.setParamSimple(map, prefix + "TaskGroupDescription", this.TaskGroupDescription);
        this.setParamSimple(map, prefix + "TaskGroupOrder", this.TaskGroupOrder);
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);
        this.setParamSimple(map, prefix + "TaskGroupCreateTime", this.TaskGroupCreateTime);
        this.setParamSimple(map, prefix + "TaskGroupUpdateTime", this.TaskGroupUpdateTime);
        this.setParamArrayObj(map, prefix + "TaskGroupActions.", this.TaskGroupActions);
        this.setParamArraySimple(map, prefix + "TaskGroupInstanceList.", this.TaskGroupInstanceList);
        this.setParamSimple(map, prefix + "TaskGroupMode", this.TaskGroupMode);
        this.setParamArraySimple(map, prefix + "TaskGroupDiscardInstanceList.", this.TaskGroupDiscardInstanceList);
        this.setParamArraySimple(map, prefix + "TaskGroupSelectedInstanceList.", this.TaskGroupSelectedInstanceList);
        this.setParamArrayObj(map, prefix + "TaskGroupInstancesExecuteRule.", this.TaskGroupInstancesExecuteRule);

    }
}

