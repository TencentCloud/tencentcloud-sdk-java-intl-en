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

public class Workflow extends AbstractModel {

    /**
    * <p>Workspace ID, which can be obtained through ListWorkspaces.</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Workflow basic info</p>
    */
    @SerializedName("BaseInfo")
    @Expose
    private WorkflowBaseInfo BaseInfo;

    /**
    * <p>Workflow scheduling configuration.</p>
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTriggerConfiguration [] Trigger;

    /**
    * <p>Workflow parameter list. The parameter name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;. It can contain up to 128 characters.</p>
    */
    @SerializedName("ParamList")
    @Expose
    private ParamInfo [] ParamList;

    /**
    * <p>Tag tag name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;', up to 128 characters</p>
    */
    @SerializedName("LabelList")
    @Expose
    private LabelBrief [] LabelList;

    /**
    * <p>Workflow alert configuration.</p>
    */
    @SerializedName("Alarm")
    @Expose
    private AlarmBrief Alarm;

    /**
    * <p>Monitoring metrics configuration</p>
    */
    @SerializedName("MonitorMetric")
    @Expose
    private MonitorMetricBrief MonitorMetric;

    /**
    * <p>Workflow advanced setting.</p>
    */
    @SerializedName("AdvanceConfig")
    @Expose
    private WorkflowAdvanceConfig AdvanceConfig;

    /**
    * <p>Workflow task list</p>
    */
    @SerializedName("TaskList")
    @Expose
    private WorkflowTask [] TaskList;

    /**
    * <p>BundleId, obtainable through the Bundle API</p>
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
    * <p>GIT configuration ID, corresponding to ConfigKey in the GetWorkspaceConfig API</p>
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
     * Get <p>Workspace ID, which can be obtained through ListWorkspaces.</p> 
     * @return WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces.</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID, which can be obtained through ListWorkspaces.</p>
     * @param WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces.</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Workflow basic info</p> 
     * @return BaseInfo <p>Workflow basic info</p>
     */
    public WorkflowBaseInfo getBaseInfo() {
        return this.BaseInfo;
    }

    /**
     * Set <p>Workflow basic info</p>
     * @param BaseInfo <p>Workflow basic info</p>
     */
    public void setBaseInfo(WorkflowBaseInfo BaseInfo) {
        this.BaseInfo = BaseInfo;
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
     * Get <p>Workflow parameter list. The parameter name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;. It can contain up to 128 characters.</p> 
     * @return ParamList <p>Workflow parameter list. The parameter name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;. It can contain up to 128 characters.</p>
     */
    public ParamInfo [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>Workflow parameter list. The parameter name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;. It can contain up to 128 characters.</p>
     * @param ParamList <p>Workflow parameter list. The parameter name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;. It can contain up to 128 characters.</p>
     */
    public void setParamList(ParamInfo [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get <p>Tag tag name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;', up to 128 characters</p> 
     * @return LabelList <p>Tag tag name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;', up to 128 characters</p>
     */
    public LabelBrief [] getLabelList() {
        return this.LabelList;
    }

    /**
     * Set <p>Tag tag name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;', up to 128 characters</p>
     * @param LabelList <p>Tag tag name is required and can only contain digits, upper- and lower-case letters, spaces, .$@#!%^&amp;*()-_+=&gt;', up to 128 characters</p>
     */
    public void setLabelList(LabelBrief [] LabelList) {
        this.LabelList = LabelList;
    }

    /**
     * Get <p>Workflow alert configuration.</p> 
     * @return Alarm <p>Workflow alert configuration.</p>
     */
    public AlarmBrief getAlarm() {
        return this.Alarm;
    }

    /**
     * Set <p>Workflow alert configuration.</p>
     * @param Alarm <p>Workflow alert configuration.</p>
     */
    public void setAlarm(AlarmBrief Alarm) {
        this.Alarm = Alarm;
    }

    /**
     * Get <p>Monitoring metrics configuration</p> 
     * @return MonitorMetric <p>Monitoring metrics configuration</p>
     */
    public MonitorMetricBrief getMonitorMetric() {
        return this.MonitorMetric;
    }

    /**
     * Set <p>Monitoring metrics configuration</p>
     * @param MonitorMetric <p>Monitoring metrics configuration</p>
     */
    public void setMonitorMetric(MonitorMetricBrief MonitorMetric) {
        this.MonitorMetric = MonitorMetric;
    }

    /**
     * Get <p>Workflow advanced setting.</p> 
     * @return AdvanceConfig <p>Workflow advanced setting.</p>
     */
    public WorkflowAdvanceConfig getAdvanceConfig() {
        return this.AdvanceConfig;
    }

    /**
     * Set <p>Workflow advanced setting.</p>
     * @param AdvanceConfig <p>Workflow advanced setting.</p>
     */
    public void setAdvanceConfig(WorkflowAdvanceConfig AdvanceConfig) {
        this.AdvanceConfig = AdvanceConfig;
    }

    /**
     * Get <p>Workflow task list</p> 
     * @return TaskList <p>Workflow task list</p>
     */
    public WorkflowTask [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set <p>Workflow task list</p>
     * @param TaskList <p>Workflow task list</p>
     */
    public void setTaskList(WorkflowTask [] TaskList) {
        this.TaskList = TaskList;
    }

    /**
     * Get <p>BundleId, obtainable through the Bundle API</p> 
     * @return BundleId <p>BundleId, obtainable through the Bundle API</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>BundleId, obtainable through the Bundle API</p>
     * @param BundleId <p>BundleId, obtainable through the Bundle API</p>
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
     * Get <p>GIT configuration ID, corresponding to ConfigKey in the GetWorkspaceConfig API</p> 
     * @return GitConfigId <p>GIT configuration ID, corresponding to ConfigKey in the GetWorkspaceConfig API</p>
     */
    public String getGitConfigId() {
        return this.GitConfigId;
    }

    /**
     * Set <p>GIT configuration ID, corresponding to ConfigKey in the GetWorkspaceConfig API</p>
     * @param GitConfigId <p>GIT configuration ID, corresponding to ConfigKey in the GetWorkspaceConfig API</p>
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

    public Workflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Workflow(Workflow source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.BaseInfo != null) {
            this.BaseInfo = new WorkflowBaseInfo(source.BaseInfo);
        }
        if (source.Trigger != null) {
            this.Trigger = new WorkflowTriggerConfiguration[source.Trigger.length];
            for (int i = 0; i < source.Trigger.length; i++) {
                this.Trigger[i] = new WorkflowTriggerConfiguration(source.Trigger[i]);
            }
        }
        if (source.ParamList != null) {
            this.ParamList = new ParamInfo[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new ParamInfo(source.ParamList[i]);
            }
        }
        if (source.LabelList != null) {
            this.LabelList = new LabelBrief[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new LabelBrief(source.LabelList[i]);
            }
        }
        if (source.Alarm != null) {
            this.Alarm = new AlarmBrief(source.Alarm);
        }
        if (source.MonitorMetric != null) {
            this.MonitorMetric = new MonitorMetricBrief(source.MonitorMetric);
        }
        if (source.AdvanceConfig != null) {
            this.AdvanceConfig = new WorkflowAdvanceConfig(source.AdvanceConfig);
        }
        if (source.TaskList != null) {
            this.TaskList = new WorkflowTask[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new WorkflowTask(source.TaskList[i]);
            }
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
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "BaseInfo.", this.BaseInfo);
        this.setParamArrayObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamArrayObj(map, prefix + "LabelList.", this.LabelList);
        this.setParamObj(map, prefix + "Alarm.", this.Alarm);
        this.setParamObj(map, prefix + "MonitorMetric.", this.MonitorMetric);
        this.setParamObj(map, prefix + "AdvanceConfig.", this.AdvanceConfig);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "GitConfigId", this.GitConfigId);
        this.setParamSimple(map, prefix + "GitBranch", this.GitBranch);

    }
}

