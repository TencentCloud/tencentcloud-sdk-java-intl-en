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

public class WorkflowInfo extends AbstractModel {

    /**
    * Workflow ID.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.

    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Workflow type: cycle or manual.

    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * Owner ID


    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Creation time.

    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last Modification Time

    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Last updated user ID.

    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * Workflow description.

    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Creator ID.

    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

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
     * Get Workflow type: cycle or manual.
 
     * @return WorkflowType Workflow type: cycle or manual.

     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set Workflow type: cycle or manual.

     * @param WorkflowType Workflow type: cycle or manual.

     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get Owner ID

 
     * @return OwnerUin Owner ID


     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner ID


     * @param OwnerUin Owner ID


     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Creation time.
 
     * @return CreateTime Creation time.

     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.

     * @param CreateTime Creation time.

     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last Modification Time
 
     * @return ModifyTime Last Modification Time

     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last Modification Time

     * @param ModifyTime Last Modification Time

     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Last updated user ID.
 
     * @return UpdateUserUin Last updated user ID.

     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set Last updated user ID.

     * @param UpdateUserUin Last updated user ID.

     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get Workflow description.
 
     * @return WorkflowDesc Workflow description.

     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set Workflow description.

     * @param WorkflowDesc Workflow description.

     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Creator ID.
 
     * @return CreateUserUin Creator ID.

     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator ID.

     * @param CreateUserUin Creator ID.

     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    public WorkflowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowInfo(WorkflowInfo source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);

    }
}

