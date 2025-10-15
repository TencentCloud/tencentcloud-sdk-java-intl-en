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

public class WorkflowDetail extends AbstractModel {

    /**
    * Workflow name.

    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Owner ID.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Creator ID.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Workflow type. Valid values: cycle or manual.

    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * Workflow parameter array.
    */
    @SerializedName("WorkflowParams")
    @Expose
    private ParamInfo [] WorkflowParams;

    /**
    * Unified scheduling parameter.
.
    */
    @SerializedName("WorkflowSchedulerConfiguration")
    @Expose
    private WorkflowSchedulerConfiguration WorkflowSchedulerConfiguration;

    /**
    * Workflow description.

    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Workflow path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * BundleId item.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * BundleInfo item. specifies the bundle information.

    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

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
     * Get Owner ID. 
     * @return OwnerUin Owner ID.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Owner ID.
     * @param OwnerUin Owner ID.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
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

    /**
     * Get Workflow type. Valid values: cycle or manual.
 
     * @return WorkflowType Workflow type. Valid values: cycle or manual.

     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set Workflow type. Valid values: cycle or manual.

     * @param WorkflowType Workflow type. Valid values: cycle or manual.

     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get Workflow parameter array. 
     * @return WorkflowParams Workflow parameter array.
     */
    public ParamInfo [] getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set Workflow parameter array.
     * @param WorkflowParams Workflow parameter array.
     */
    public void setWorkflowParams(ParamInfo [] WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get Unified scheduling parameter.
. 
     * @return WorkflowSchedulerConfiguration Unified scheduling parameter.
.
     */
    public WorkflowSchedulerConfiguration getWorkflowSchedulerConfiguration() {
        return this.WorkflowSchedulerConfiguration;
    }

    /**
     * Set Unified scheduling parameter.
.
     * @param WorkflowSchedulerConfiguration Unified scheduling parameter.
.
     */
    public void setWorkflowSchedulerConfiguration(WorkflowSchedulerConfiguration WorkflowSchedulerConfiguration) {
        this.WorkflowSchedulerConfiguration = WorkflowSchedulerConfiguration;
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
     * Get Workflow path. 
     * @return Path Workflow path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Workflow path.
     * @param Path Workflow path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get BundleId item. 
     * @return BundleId BundleId item.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set BundleId item.
     * @param BundleId BundleId item.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get BundleInfo item. specifies the bundle information.
 
     * @return BundleInfo BundleInfo item. specifies the bundle information.

     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set BundleInfo item. specifies the bundle information.

     * @param BundleInfo BundleInfo item. specifies the bundle information.

     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public WorkflowDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowDetail(WorkflowDetail source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new ParamInfo[source.WorkflowParams.length];
            for (int i = 0; i < source.WorkflowParams.length; i++) {
                this.WorkflowParams[i] = new ParamInfo(source.WorkflowParams[i]);
            }
        }
        if (source.WorkflowSchedulerConfiguration != null) {
            this.WorkflowSchedulerConfiguration = new WorkflowSchedulerConfiguration(source.WorkflowSchedulerConfiguration);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamArrayObj(map, prefix + "WorkflowParams.", this.WorkflowParams);
        this.setParamObj(map, prefix + "WorkflowSchedulerConfiguration.", this.WorkflowSchedulerConfiguration);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

