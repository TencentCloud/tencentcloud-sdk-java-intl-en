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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTriggerTaskPartiallyRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task basic attributes.
    */
    @SerializedName("NewSetting")
    @Expose
    private UpdateTriggerTaskPart NewSetting;

    /**
    * Delete field content, identified in the form of property paths, with deleted values separated by ":" and multiple values separated by "," delete the attribute "TaskConfiguration/TaskSchedulingParameterList:aa,bb" where ParamKey is aa,bb in scheduling parameters delete the upstream dependency "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" where TaskId is 2509162129381111,2509162129381112 in upstream dependencies delete the downstream dependency "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" where TaskId is 2509162129382222,2509162129382223 in downstream circular dependencies delete the event "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" where EventName is event_250916_213234,event_250916_213235 in events delete the parameter "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" where ParamKey is pp_out,pp_1 in parameter output transmission delete the parameter "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" where ParamKey is pp_in,pp_1 in parameter application delete the output registration "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1" where TablePhysicalId is 6578laxif4d1 in product registration.
    */
    @SerializedName("FieldToRemoveList")
    @Expose
    private String [] FieldToRemoveList;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task basic attributes. 
     * @return NewSetting Task basic attributes.
     */
    public UpdateTriggerTaskPart getNewSetting() {
        return this.NewSetting;
    }

    /**
     * Set Task basic attributes.
     * @param NewSetting Task basic attributes.
     */
    public void setNewSetting(UpdateTriggerTaskPart NewSetting) {
        this.NewSetting = NewSetting;
    }

    /**
     * Get Delete field content, identified in the form of property paths, with deleted values separated by ":" and multiple values separated by "," delete the attribute "TaskConfiguration/TaskSchedulingParameterList:aa,bb" where ParamKey is aa,bb in scheduling parameters delete the upstream dependency "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" where TaskId is 2509162129381111,2509162129381112 in upstream dependencies delete the downstream dependency "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" where TaskId is 2509162129382222,2509162129382223 in downstream circular dependencies delete the event "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" where EventName is event_250916_213234,event_250916_213235 in events delete the parameter "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" where ParamKey is pp_out,pp_1 in parameter output transmission delete the parameter "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" where ParamKey is pp_in,pp_1 in parameter application delete the output registration "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1" where TablePhysicalId is 6578laxif4d1 in product registration. 
     * @return FieldToRemoveList Delete field content, identified in the form of property paths, with deleted values separated by ":" and multiple values separated by "," delete the attribute "TaskConfiguration/TaskSchedulingParameterList:aa,bb" where ParamKey is aa,bb in scheduling parameters delete the upstream dependency "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" where TaskId is 2509162129381111,2509162129381112 in upstream dependencies delete the downstream dependency "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" where TaskId is 2509162129382222,2509162129382223 in downstream circular dependencies delete the event "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" where EventName is event_250916_213234,event_250916_213235 in events delete the parameter "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" where ParamKey is pp_out,pp_1 in parameter output transmission delete the parameter "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" where ParamKey is pp_in,pp_1 in parameter application delete the output registration "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1" where TablePhysicalId is 6578laxif4d1 in product registration.
     */
    public String [] getFieldToRemoveList() {
        return this.FieldToRemoveList;
    }

    /**
     * Set Delete field content, identified in the form of property paths, with deleted values separated by ":" and multiple values separated by "," delete the attribute "TaskConfiguration/TaskSchedulingParameterList:aa,bb" where ParamKey is aa,bb in scheduling parameters delete the upstream dependency "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" where TaskId is 2509162129381111,2509162129381112 in upstream dependencies delete the downstream dependency "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" where TaskId is 2509162129382222,2509162129382223 in downstream circular dependencies delete the event "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" where EventName is event_250916_213234,event_250916_213235 in events delete the parameter "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" where ParamKey is pp_out,pp_1 in parameter output transmission delete the parameter "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" where ParamKey is pp_in,pp_1 in parameter application delete the output registration "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1" where TablePhysicalId is 6578laxif4d1 in product registration.
     * @param FieldToRemoveList Delete field content, identified in the form of property paths, with deleted values separated by ":" and multiple values separated by "," delete the attribute "TaskConfiguration/TaskSchedulingParameterList:aa,bb" where ParamKey is aa,bb in scheduling parameters delete the upstream dependency "TaskSchedulerConfiguration/UpstreamDependencyConfigList:2509162129381111,2509162129381112" where TaskId is 2509162129381111,2509162129381112 in upstream dependencies delete the downstream dependency "TaskSchedulerConfiguration/DownStreamDependencyConfigList:2509162129382222,2509162129382223" where TaskId is 2509162129382222,2509162129382223 in downstream circular dependencies delete the event "TaskSchedulerConfiguration/EventListenerList:event_250916_213234,event_250916_213235" where EventName is event_250916_213234,event_250916_213235 in events delete the parameter "TaskSchedulerConfiguration/ParamTaskOutList:pp_out,pp_1" where ParamKey is pp_out,pp_1 in parameter output transmission delete the parameter "TaskSchedulerConfiguration/ParamTaskInList:pp_in,pp_1" where ParamKey is pp_in,pp_1 in parameter application delete the output registration "TaskSchedulerConfiguration/TaskOutputRegistryList:6578laxif4d1" where TablePhysicalId is 6578laxif4d1 in product registration.
     */
    public void setFieldToRemoveList(String [] FieldToRemoveList) {
        this.FieldToRemoveList = FieldToRemoveList;
    }

    public UpdateTriggerTaskPartiallyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerTaskPartiallyRequest(UpdateTriggerTaskPartiallyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.NewSetting != null) {
            this.NewSetting = new UpdateTriggerTaskPart(source.NewSetting);
        }
        if (source.FieldToRemoveList != null) {
            this.FieldToRemoveList = new String[source.FieldToRemoveList.length];
            for (int i = 0; i < source.FieldToRemoveList.length; i++) {
                this.FieldToRemoveList[i] = new String(source.FieldToRemoveList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "NewSetting.", this.NewSetting);
        this.setParamArraySimple(map, prefix + "FieldToRemoveList.", this.FieldToRemoveList);

    }
}

