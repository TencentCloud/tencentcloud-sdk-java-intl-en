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
package com.tencentcloudapi.mps.v20190612.models;

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
    private Long WorkflowId;

    /**
    * Workflow name.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Workflow status. Valid values:
<li>Enabled: on</li>
<li>Disabled: Disabled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The input rule bound to the workflow triggers the workflow when an uploaded video hits the rule for the object.
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * 
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * 
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * 
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
    */
    @SerializedName("TaskPriority")
    @Expose
    private Long TaskPriority;

    /**
    * Storage directory for the output file, such as `/movie/201907/`.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * Workflow creation time, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time of the workflow, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Workflow ID. 
     * @return WorkflowId Workflow ID.
     */
    public Long getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
     * @param WorkflowId Workflow ID.
     */
    public void setWorkflowId(Long WorkflowId) {
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
     * Get Workflow status. Valid values:
<li>Enabled: on</li>
<li>Disabled: Disabled.</li> 
     * @return Status Workflow status. Valid values:
<li>Enabled: on</li>
<li>Disabled: Disabled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Workflow status. Valid values:
<li>Enabled: on</li>
<li>Disabled: Disabled.</li>
     * @param Status Workflow status. Valid values:
<li>Enabled: on</li>
<li>Disabled: Disabled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The input rule bound to the workflow triggers the workflow when an uploaded video hits the rule for the object. 
     * @return Trigger The input rule bound to the workflow triggers the workflow when an uploaded video hits the rule for the object.
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set The input rule bound to the workflow triggers the workflow when an uploaded video hits the rule for the object.
     * @param Trigger The input rule bound to the workflow triggers the workflow when an uploaded video hits the rule for the object.
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get  
     * @return OutputStorage 
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 
     * @param OutputStorage 
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get  
     * @return MediaProcessTask 
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set 
     * @param MediaProcessTask 
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get  
     * @return AiContentReviewTask 
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set 
     * @param AiContentReviewTask 
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get  
     * @return AiAnalysisTask 
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set 
     * @param AiAnalysisTask 
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get  
     * @return AiRecognitionTask 
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set 
     * @param AiRecognitionTask 
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get  
     * @return TaskNotifyConfig 
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 
     * @param TaskNotifyConfig 
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0. 
     * @return TaskPriority Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public Long getTaskPriority() {
        return this.TaskPriority;
    }

    /**
     * Set Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     * @param TaskPriority Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public void setTaskPriority(Long TaskPriority) {
        this.TaskPriority = TaskPriority;
    }

    /**
     * Get Storage directory for the output file, such as `/movie/201907/`. 
     * @return OutputDir Storage directory for the output file, such as `/movie/201907/`.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set Storage directory for the output file, such as `/movie/201907/`.
     * @param OutputDir Storage directory for the output file, such as `/movie/201907/`.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get Workflow creation time, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return CreateTime Workflow creation time, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Workflow creation time, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param CreateTime Workflow creation time, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time of the workflow, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return UpdateTime Last modification time of the workflow, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time of the workflow, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param UpdateTime Last modification time of the workflow, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public WorkflowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowInfo(WorkflowInfo source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new Long(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Trigger != null) {
            this.Trigger = new WorkflowTrigger(source.Trigger);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.MediaProcessTask != null) {
            this.MediaProcessTask = new MediaProcessTaskInput(source.MediaProcessTask);
        }
        if (source.AiContentReviewTask != null) {
            this.AiContentReviewTask = new AiContentReviewTaskInput(source.AiContentReviewTask);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new AiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.TaskPriority != null) {
            this.TaskPriority = new Long(source.TaskPriority);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
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
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TaskPriority", this.TaskPriority);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

