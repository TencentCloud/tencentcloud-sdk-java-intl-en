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

public class WorkflowBrief extends AbstractModel {

    /**
    * <p>Workflow name</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>Workflow ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Creator UIN</p>
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>Workflow owner userName</p>
    */
    @SerializedName("OwnerUserName")
    @Expose
    private String OwnerUserName;

    /**
    * <p>Workflow owner UIN</p>
    */
    @SerializedName("OwnerUserUin")
    @Expose
    private String OwnerUserUin;

    /**
    * <p>Display name of the workflow owner</p>
    */
    @SerializedName("OwnerDisplayName")
    @Expose
    private String OwnerDisplayName;

    /**
    * <p>Creation time. Unit: millisecond timestamp</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last update time. Unit: timestamp in milliseconds</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Tag list.</p>
    */
    @SerializedName("LabelList")
    @Expose
    private LabelBrief [] LabelList;

    /**
    * <p>Workflow scheduling configuration.</p>
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTriggerConfiguration [] Trigger;

    /**
    * <p>Workflow runner UIN</p>
    */
    @SerializedName("RunUserUin")
    @Expose
    private String RunUserUin;

    /**
    * <p>Workflow runner userName</p>
    */
    @SerializedName("RunUserName")
    @Expose
    private String RunUserName;

    /**
    * <p>Workflow task node list</p>
    */
    @SerializedName("TaskList")
    @Expose
    private WorkflowTaskNodeBrief [] TaskList;

    /**
    * <p>Workflow running status list</p>
    */
    @SerializedName("WorkflowRunList")
    @Expose
    private WorkflowRunBrief [] WorkflowRunList;

    /**
    * <p>Resource group information list.</p>
    */
    @SerializedName("ResourceGroupInfoList")
    @Expose
    private ResourceGroupInfo [] ResourceGroupInfoList;

    /**
    * <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p>
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * <p>Unique ID of the Bundle bound to the workflow. Empty if not bound</p>
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>Bundle information</p>
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>Git configuration ID.</p>
    */
    @SerializedName("GitConfigId")
    @Expose
    private String GitConfigId;

    /**
    * <p>Git branch information.</p>
    */
    @SerializedName("GitBranch")
    @Expose
    private String GitBranch;

    /**
     * Get <p>Workflow name</p> 
     * @return WorkflowName <p>Workflow name</p>
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>Workflow name</p>
     * @param WorkflowName <p>Workflow name</p>
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>Workflow ID</p> 
     * @return WorkflowId <p>Workflow ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>Workflow ID</p>
     * @param WorkflowId <p>Workflow ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Creator UIN</p> 
     * @return CreateUserUin <p>Creator UIN</p>
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>Creator UIN</p>
     * @param CreateUserUin <p>Creator UIN</p>
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>Workflow owner userName</p> 
     * @return OwnerUserName <p>Workflow owner userName</p>
     */
    public String getOwnerUserName() {
        return this.OwnerUserName;
    }

    /**
     * Set <p>Workflow owner userName</p>
     * @param OwnerUserName <p>Workflow owner userName</p>
     */
    public void setOwnerUserName(String OwnerUserName) {
        this.OwnerUserName = OwnerUserName;
    }

    /**
     * Get <p>Workflow owner UIN</p> 
     * @return OwnerUserUin <p>Workflow owner UIN</p>
     */
    public String getOwnerUserUin() {
        return this.OwnerUserUin;
    }

    /**
     * Set <p>Workflow owner UIN</p>
     * @param OwnerUserUin <p>Workflow owner UIN</p>
     */
    public void setOwnerUserUin(String OwnerUserUin) {
        this.OwnerUserUin = OwnerUserUin;
    }

    /**
     * Get <p>Display name of the workflow owner</p> 
     * @return OwnerDisplayName <p>Display name of the workflow owner</p>
     */
    public String getOwnerDisplayName() {
        return this.OwnerDisplayName;
    }

    /**
     * Set <p>Display name of the workflow owner</p>
     * @param OwnerDisplayName <p>Display name of the workflow owner</p>
     */
    public void setOwnerDisplayName(String OwnerDisplayName) {
        this.OwnerDisplayName = OwnerDisplayName;
    }

    /**
     * Get <p>Creation time. Unit: millisecond timestamp</p> 
     * @return CreateTime <p>Creation time. Unit: millisecond timestamp</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time. Unit: millisecond timestamp</p>
     * @param CreateTime <p>Creation time. Unit: millisecond timestamp</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last update time. Unit: timestamp in milliseconds</p> 
     * @return UpdateTime <p>Last update time. Unit: timestamp in milliseconds</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last update time. Unit: timestamp in milliseconds</p>
     * @param UpdateTime <p>Last update time. Unit: timestamp in milliseconds</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Tag list.</p> 
     * @return LabelList <p>Tag list.</p>
     */
    public LabelBrief [] getLabelList() {
        return this.LabelList;
    }

    /**
     * Set <p>Tag list.</p>
     * @param LabelList <p>Tag list.</p>
     */
    public void setLabelList(LabelBrief [] LabelList) {
        this.LabelList = LabelList;
    }

    /**
     * Get <p>Workflow scheduling configuration.</p> 
     * @return Trigger <p>Workflow scheduling configuration.</p>
     */
    public WorkflowTriggerConfiguration [] getTrigger() {
        return this.Trigger;
    }

    /**
     * Set <p>Workflow scheduling configuration.</p>
     * @param Trigger <p>Workflow scheduling configuration.</p>
     */
    public void setTrigger(WorkflowTriggerConfiguration [] Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get <p>Workflow runner UIN</p> 
     * @return RunUserUin <p>Workflow runner UIN</p>
     */
    public String getRunUserUin() {
        return this.RunUserUin;
    }

    /**
     * Set <p>Workflow runner UIN</p>
     * @param RunUserUin <p>Workflow runner UIN</p>
     */
    public void setRunUserUin(String RunUserUin) {
        this.RunUserUin = RunUserUin;
    }

    /**
     * Get <p>Workflow runner userName</p> 
     * @return RunUserName <p>Workflow runner userName</p>
     */
    public String getRunUserName() {
        return this.RunUserName;
    }

    /**
     * Set <p>Workflow runner userName</p>
     * @param RunUserName <p>Workflow runner userName</p>
     */
    public void setRunUserName(String RunUserName) {
        this.RunUserName = RunUserName;
    }

    /**
     * Get <p>Workflow task node list</p> 
     * @return TaskList <p>Workflow task node list</p>
     */
    public WorkflowTaskNodeBrief [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set <p>Workflow task node list</p>
     * @param TaskList <p>Workflow task node list</p>
     */
    public void setTaskList(WorkflowTaskNodeBrief [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get <p>Workflow running status list</p> 
     * @return WorkflowRunList <p>Workflow running status list</p>
     */
    public WorkflowRunBrief [] getWorkflowRunList() {
        return this.WorkflowRunList;
    }

    /**
     * Set <p>Workflow running status list</p>
     * @param WorkflowRunList <p>Workflow running status list</p>
     */
    public void setWorkflowRunList(WorkflowRunBrief [] WorkflowRunList) {
        this.WorkflowRunList = WorkflowRunList;
    }

    /**
     * Get <p>Resource group information list.</p> 
     * @return ResourceGroupInfoList <p>Resource group information list.</p>
     */
    public ResourceGroupInfo [] getResourceGroupInfoList() {
        return this.ResourceGroupInfoList;
    }

    /**
     * Set <p>Resource group information list.</p>
     * @param ResourceGroupInfoList <p>Resource group information list.</p>
     */
    public void setResourceGroupInfoList(ResourceGroupInfo [] ResourceGroupInfoList) {
        this.ResourceGroupInfoList = ResourceGroupInfoList;
    }

    /**
     * Get <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p> 
     * @return Permission <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p>
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p>
     * @param Permission <p>Authorization permission type<br>PERMISSION_TYPE_UNSPECIFIED: unspecified permission<br>MANAGE: management permission, including all operation permissions<br>RUN: execution permission, executable entity<br>VIEW: view permission, viewable entity content</p>
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>Unique ID of the Bundle bound to the workflow. Empty if not bound</p> 
     * @return BundleId <p>Unique ID of the Bundle bound to the workflow. Empty if not bound</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>Unique ID of the Bundle bound to the workflow. Empty if not bound</p>
     * @param BundleId <p>Unique ID of the Bundle bound to the workflow. Empty if not bound</p>
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>Bundle information</p> 
     * @return BundleInfo <p>Bundle information</p>
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>Bundle information</p>
     * @param BundleInfo <p>Bundle information</p>
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>Git configuration ID.</p> 
     * @return GitConfigId <p>Git configuration ID.</p>
     */
    public String getGitConfigId() {
        return this.GitConfigId;
    }

    /**
     * Set <p>Git configuration ID.</p>
     * @param GitConfigId <p>Git configuration ID.</p>
     */
    public void setGitConfigId(String GitConfigId) {
        this.GitConfigId = GitConfigId;
    }

    /**
     * Get <p>Git branch information.</p> 
     * @return GitBranch <p>Git branch information.</p>
     */
    public String getGitBranch() {
        return this.GitBranch;
    }

    /**
     * Set <p>Git branch information.</p>
     * @param GitBranch <p>Git branch information.</p>
     */
    public void setGitBranch(String GitBranch) {
        this.GitBranch = GitBranch;
    }

    public WorkflowBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowBrief(WorkflowBrief source) {
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
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
        if (source.LabelList != null) {
            this.LabelList = new LabelBrief[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new LabelBrief(source.LabelList[i]);
            }
        }
        if (source.Trigger != null) {
            this.Trigger = new WorkflowTriggerConfiguration[source.Trigger.length];
            for (int i = 0; i < source.Trigger.length; i++) {
                this.Trigger[i] = new WorkflowTriggerConfiguration(source.Trigger[i]);
            }
        }
        if (source.RunUserUin != null) {
            this.RunUserUin = new String(source.RunUserUin);
        }
        if (source.RunUserName != null) {
            this.RunUserName = new String(source.RunUserName);
        }
        if (source.TaskList != null) {
            this.TaskList = new WorkflowTaskNodeBrief[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new WorkflowTaskNodeBrief(source.TaskList[i]);
            }
        }
        if (source.WorkflowRunList != null) {
            this.WorkflowRunList = new WorkflowRunBrief[source.WorkflowRunList.length];
            for (int i = 0; i < source.WorkflowRunList.length; i++) {
                this.WorkflowRunList[i] = new WorkflowRunBrief(source.WorkflowRunList[i]);
            }
        }
        if (source.ResourceGroupInfoList != null) {
            this.ResourceGroupInfoList = new ResourceGroupInfo[source.ResourceGroupInfoList.length];
            for (int i = 0; i < source.ResourceGroupInfoList.length; i++) {
                this.ResourceGroupInfoList[i] = new ResourceGroupInfo(source.ResourceGroupInfoList[i]);
            }
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.GitConfigId != null) {
            this.GitConfigId = new String(source.GitConfigId);
        }
        if (source.GitBranch != null) {
            this.GitBranch = new String(source.GitBranch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "OwnerUserUin", this.OwnerUserUin);
        this.setParamSimple(map, prefix + "OwnerDisplayName", this.OwnerDisplayName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "LabelList.", this.LabelList);
        this.setParamArrayObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "RunUserName", this.RunUserName);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamArrayObj(map, prefix + "WorkflowRunList.", this.WorkflowRunList);
        this.setParamArrayObj(map, prefix + "ResourceGroupInfoList.", this.ResourceGroupInfoList);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "GitConfigId", this.GitConfigId);
        this.setParamSimple(map, prefix + "GitBranch", this.GitBranch);

    }
}

