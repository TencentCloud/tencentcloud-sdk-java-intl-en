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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowBaseInfoDetail extends AbstractModel {

    /**
    * Workflow name.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Creator UIN
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * UIN of the person who runs the workflow
    */
    @SerializedName("RunUserUin")
    @Expose
    private String RunUserUin;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Workflow owner userName
    */
    @SerializedName("OwnerUserName")
    @Expose
    private String OwnerUserName;

    /**
    * Workflow owner UIN
    */
    @SerializedName("OwnerUserUin")
    @Expose
    private String OwnerUserUin;

    /**
    * Display name of the workflow owner
    */
    @SerializedName("OwnerDisplayName")
    @Expose
    private String OwnerDisplayName;

    /**
    * Creation time. Unit: millisecond timestamp
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time. Unit: timestamp in milliseconds
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Workflow name. 
     * @return WorkflowName Workflow name.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
     * @param WorkflowName Workflow name.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Workflow ID 
     * @return WorkflowId Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
     * @param WorkflowId Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Creator UIN 
     * @return CreateUserUin Creator UIN
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator UIN
     * @param CreateUserUin Creator UIN
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get UIN of the person who runs the workflow 
     * @return RunUserUin UIN of the person who runs the workflow
     */
    public String getRunUserUin() {
        return this.RunUserUin;
    }

    /**
     * Set UIN of the person who runs the workflow
     * @param RunUserUin UIN of the person who runs the workflow
     */
    public void setRunUserUin(String RunUserUin) {
        this.RunUserUin = RunUserUin;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Workflow owner userName 
     * @return OwnerUserName Workflow owner userName
     */
    public String getOwnerUserName() {
        return this.OwnerUserName;
    }

    /**
     * Set Workflow owner userName
     * @param OwnerUserName Workflow owner userName
     */
    public void setOwnerUserName(String OwnerUserName) {
        this.OwnerUserName = OwnerUserName;
    }

    /**
     * Get Workflow owner UIN 
     * @return OwnerUserUin Workflow owner UIN
     */
    public String getOwnerUserUin() {
        return this.OwnerUserUin;
    }

    /**
     * Set Workflow owner UIN
     * @param OwnerUserUin Workflow owner UIN
     */
    public void setOwnerUserUin(String OwnerUserUin) {
        this.OwnerUserUin = OwnerUserUin;
    }

    /**
     * Get Display name of the workflow owner 
     * @return OwnerDisplayName Display name of the workflow owner
     */
    public String getOwnerDisplayName() {
        return this.OwnerDisplayName;
    }

    /**
     * Set Display name of the workflow owner
     * @param OwnerDisplayName Display name of the workflow owner
     */
    public void setOwnerDisplayName(String OwnerDisplayName) {
        this.OwnerDisplayName = OwnerDisplayName;
    }

    /**
     * Get Creation time. Unit: millisecond timestamp 
     * @return CreateTime Creation time. Unit: millisecond timestamp
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time. Unit: millisecond timestamp
     * @param CreateTime Creation time. Unit: millisecond timestamp
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time. Unit: timestamp in milliseconds 
     * @return UpdateTime Last update time. Unit: timestamp in milliseconds
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time. Unit: timestamp in milliseconds
     * @param UpdateTime Last update time. Unit: timestamp in milliseconds
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public WorkflowBaseInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowBaseInfoDetail(WorkflowBaseInfoDetail source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.RunUserUin != null) {
            this.RunUserUin = new String(source.RunUserUin);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OwnerUserName != null) {
            this.OwnerUserName = new String(source.OwnerUserName);
        }
        if (source.OwnerUserUin != null) {
            this.OwnerUserUin = new String(source.OwnerUserUin);
        }
        if (source.OwnerDisplayName != null) {
            this.OwnerDisplayName = new String(source.OwnerDisplayName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "OwnerUserUin", this.OwnerUserUin);
        this.setParamSimple(map, prefix + "OwnerDisplayName", this.OwnerDisplayName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

