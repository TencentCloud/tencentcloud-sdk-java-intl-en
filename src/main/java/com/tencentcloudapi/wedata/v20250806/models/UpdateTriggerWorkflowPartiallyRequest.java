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

public class UpdateTriggerWorkflowPartiallyRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Responsible person ID.
    */
    @SerializedName("NewSetting")
    @Expose
    private UpdateTriggerWorkflowPartially NewSetting;

    /**
    * Delete field content, identify in the form of property path, separate deleted values with ":" and multiple values with ",".
Delete the attributes "WorkflowParams:aa,bb" where ParamKey is aa,bb in the scheduling parameters.
Delete the scheduling configuration with TriggerId "da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" in TriggerWorkflowSchedulerConfigurations. 
Delete the spark sql general parameter "GeneralTaskParams: spark_sql". 

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
     * Get Workflow ID. 
     * @return WorkflowId Workflow ID.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
     * @param WorkflowId Workflow ID.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Responsible person ID. 
     * @return NewSetting Responsible person ID.
     */
    public UpdateTriggerWorkflowPartially getNewSetting() {
        return this.NewSetting;
    }

    /**
     * Set Responsible person ID.
     * @param NewSetting Responsible person ID.
     */
    public void setNewSetting(UpdateTriggerWorkflowPartially NewSetting) {
        this.NewSetting = NewSetting;
    }

    /**
     * Get Delete field content, identify in the form of property path, separate deleted values with ":" and multiple values with ",".
Delete the attributes "WorkflowParams:aa,bb" where ParamKey is aa,bb in the scheduling parameters.
Delete the scheduling configuration with TriggerId "da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" in TriggerWorkflowSchedulerConfigurations. 
Delete the spark sql general parameter "GeneralTaskParams: spark_sql". 
 
     * @return FieldToRemoveList Delete field content, identify in the form of property path, separate deleted values with ":" and multiple values with ",".
Delete the attributes "WorkflowParams:aa,bb" where ParamKey is aa,bb in the scheduling parameters.
Delete the scheduling configuration with TriggerId "da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" in TriggerWorkflowSchedulerConfigurations. 
Delete the spark sql general parameter "GeneralTaskParams: spark_sql". 

     */
    public String [] getFieldToRemoveList() {
        return this.FieldToRemoveList;
    }

    /**
     * Set Delete field content, identify in the form of property path, separate deleted values with ":" and multiple values with ",".
Delete the attributes "WorkflowParams:aa,bb" where ParamKey is aa,bb in the scheduling parameters.
Delete the scheduling configuration with TriggerId "da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" in TriggerWorkflowSchedulerConfigurations. 
Delete the spark sql general parameter "GeneralTaskParams: spark_sql". 

     * @param FieldToRemoveList Delete field content, identify in the form of property path, separate deleted values with ":" and multiple values with ",".
Delete the attributes "WorkflowParams:aa,bb" where ParamKey is aa,bb in the scheduling parameters.
Delete the scheduling configuration with TriggerId "da46d950-d5ca-4cfb-a5a9-f3c2eeea1bf0" in TriggerWorkflowSchedulerConfigurations. 
Delete the spark sql general parameter "GeneralTaskParams: spark_sql". 

     */
    public void setFieldToRemoveList(String [] FieldToRemoveList) {
        this.FieldToRemoveList = FieldToRemoveList;
    }

    public UpdateTriggerWorkflowPartiallyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTriggerWorkflowPartiallyRequest(UpdateTriggerWorkflowPartiallyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.NewSetting != null) {
            this.NewSetting = new UpdateTriggerWorkflowPartially(source.NewSetting);
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
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamObj(map, prefix + "NewSetting.", this.NewSetting);
        this.setParamArraySimple(map, prefix + "FieldToRemoveList.", this.FieldToRemoveList);

    }
}

