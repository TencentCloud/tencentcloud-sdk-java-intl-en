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

public class BatchUpdateIntegrationTasksRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Person in Charge (separate multiple persons in charge with a lowercase semicolon; offline tasks use the account name, real-time tasks use the account ID)
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
    * Task Type
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Responsible Person ID (separate multiple persons in charge with a lowercase semicolon)
    */
    @SerializedName("InchargeIds")
    @Expose
    private String InchargeIds;

    /**
    * This batch operation involves tasks for auditing
    */
    @SerializedName("TaskNames")
    @Expose
    private String [] TaskNames;

    /**
     * Get Task ID 
     * @return TaskIds Task ID
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Task ID
     * @param TaskIds Task ID
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Person in Charge (separate multiple persons in charge with a lowercase semicolon; offline tasks use the account name, real-time tasks use the account ID) 
     * @return Incharge Person in Charge (separate multiple persons in charge with a lowercase semicolon; offline tasks use the account name, real-time tasks use the account ID)
     */
    public String getIncharge() {
        return this.Incharge;
    }

    /**
     * Set Person in Charge (separate multiple persons in charge with a lowercase semicolon; offline tasks use the account name, real-time tasks use the account ID)
     * @param Incharge Person in Charge (separate multiple persons in charge with a lowercase semicolon; offline tasks use the account name, real-time tasks use the account ID)
     */
    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    /**
     * Get Task Type 
     * @return TaskType Task Type
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type
     * @param TaskType Task Type
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Responsible Person ID (separate multiple persons in charge with a lowercase semicolon) 
     * @return InchargeIds Responsible Person ID (separate multiple persons in charge with a lowercase semicolon)
     */
    public String getInchargeIds() {
        return this.InchargeIds;
    }

    /**
     * Set Responsible Person ID (separate multiple persons in charge with a lowercase semicolon)
     * @param InchargeIds Responsible Person ID (separate multiple persons in charge with a lowercase semicolon)
     */
    public void setInchargeIds(String InchargeIds) {
        this.InchargeIds = InchargeIds;
    }

    /**
     * Get This batch operation involves tasks for auditing 
     * @return TaskNames This batch operation involves tasks for auditing
     */
    public String [] getTaskNames() {
        return this.TaskNames;
    }

    /**
     * Set This batch operation involves tasks for auditing
     * @param TaskNames This batch operation involves tasks for auditing
     */
    public void setTaskNames(String [] TaskNames) {
        this.TaskNames = TaskNames;
    }

    public BatchUpdateIntegrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchUpdateIntegrationTasksRequest(BatchUpdateIntegrationTasksRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.Incharge != null) {
            this.Incharge = new String(source.Incharge);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InchargeIds != null) {
            this.InchargeIds = new String(source.InchargeIds);
        }
        if (source.TaskNames != null) {
            this.TaskNames = new String[source.TaskNames.length];
            for (int i = 0; i < source.TaskNames.length; i++) {
                this.TaskNames[i] = new String(source.TaskNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "Incharge", this.Incharge);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InchargeIds", this.InchargeIds);
        this.setParamArraySimple(map, prefix + "TaskNames.", this.TaskNames);

    }
}

