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

public class TriggerWorkflowDetail extends AbstractModel {

    /**
    * Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Creator ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Workflow parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowParams")
    @Expose
    private ParamInfo [] WorkflowParams;

    /**
    * Unify scheduling parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerWorkflowSchedulerConfigurations")
    @Expose
    private WorkflowTriggerConfig [] TriggerWorkflowSchedulerConfigurations;

    /**
    * Workflow description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Workflow path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * BundleId item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * BundleInfo item.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * General parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GeneralTaskParams")
    @Expose
    private WorkflowGeneralTaskParam [] GeneralTaskParams;

    /**
    * Trigger status: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchedulerStatus")
    @Expose
    private String SchedulerStatus;

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
     * Get Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUin Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerUin Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
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

    /**
     * Get Workflow parameter array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowParams Workflow parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ParamInfo [] getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set Workflow parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowParams Workflow parameter array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowParams(ParamInfo [] WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get Unify scheduling parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerWorkflowSchedulerConfigurations Unify scheduling parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkflowTriggerConfig [] getTriggerWorkflowSchedulerConfigurations() {
        return this.TriggerWorkflowSchedulerConfigurations;
    }

    /**
     * Set Unify scheduling parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerWorkflowSchedulerConfigurations Unify scheduling parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerWorkflowSchedulerConfigurations(WorkflowTriggerConfig [] TriggerWorkflowSchedulerConfigurations) {
        this.TriggerWorkflowSchedulerConfigurations = TriggerWorkflowSchedulerConfigurations;
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
     * Get Workflow path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path Workflow path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Workflow path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path Workflow path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get BundleId item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BundleId BundleId item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set BundleId item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BundleId BundleId item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get BundleInfo item.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BundleInfo BundleInfo item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set BundleInfo item.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BundleInfo BundleInfo item.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get General parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GeneralTaskParams General parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkflowGeneralTaskParam [] getGeneralTaskParams() {
        return this.GeneralTaskParams;
    }

    /**
     * Set General parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GeneralTaskParams General parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGeneralTaskParams(WorkflowGeneralTaskParam [] GeneralTaskParams) {
        this.GeneralTaskParams = GeneralTaskParams;
    }

    /**
     * Get Trigger status: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchedulerStatus Trigger status: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchedulerStatus() {
        return this.SchedulerStatus;
    }

    /**
     * Set Trigger status: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchedulerStatus Trigger status: ACTIVE (start), PAUSED (suspend).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchedulerStatus(String SchedulerStatus) {
        this.SchedulerStatus = SchedulerStatus;
    }

    public TriggerWorkflowDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerWorkflowDetail(TriggerWorkflowDetail source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new ParamInfo[source.WorkflowParams.length];
            for (int i = 0; i < source.WorkflowParams.length; i++) {
                this.WorkflowParams[i] = new ParamInfo(source.WorkflowParams[i]);
            }
        }
        if (source.TriggerWorkflowSchedulerConfigurations != null) {
            this.TriggerWorkflowSchedulerConfigurations = new WorkflowTriggerConfig[source.TriggerWorkflowSchedulerConfigurations.length];
            for (int i = 0; i < source.TriggerWorkflowSchedulerConfigurations.length; i++) {
                this.TriggerWorkflowSchedulerConfigurations[i] = new WorkflowTriggerConfig(source.TriggerWorkflowSchedulerConfigurations[i]);
            }
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.GeneralTaskParams != null) {
            this.GeneralTaskParams = new WorkflowGeneralTaskParam[source.GeneralTaskParams.length];
            for (int i = 0; i < source.GeneralTaskParams.length; i++) {
                this.GeneralTaskParams[i] = new WorkflowGeneralTaskParam(source.GeneralTaskParams[i]);
            }
        }
        if (source.SchedulerStatus != null) {
            this.SchedulerStatus = new String(source.SchedulerStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamArrayObj(map, prefix + "TriggerWorkflowSchedulerConfigurations.", this.TriggerWorkflowSchedulerConfigurations);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamArrayObj(map, prefix + "GeneralTaskParams.", this.GeneralTaskParams);
        this.setParamSimple(map, prefix + "SchedulerStatus", this.SchedulerStatus);

    }
}

