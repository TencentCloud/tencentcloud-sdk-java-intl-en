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

public class TriggerWorkflowInfo extends AbstractModel {

    /**
    * Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Person in Charge ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last Modification Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Last updated by user ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * Workflow description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
     * Get Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowId Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowId Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Person in Charge ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin Person in Charge ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Person in Charge ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin Person in Charge ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Creation time.


Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last Modification Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Last Modification Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last Modification Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Last Modification Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Last updated by user ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateUserUin Last updated by user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set Last updated by user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateUserUin Last updated by user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get Workflow description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowDesc Workflow description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set Workflow description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowDesc Workflow description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Creator ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUserUin Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUserUin Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    public TriggerWorkflowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerWorkflowInfo(TriggerWorkflowInfo source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
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
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);

    }
}

