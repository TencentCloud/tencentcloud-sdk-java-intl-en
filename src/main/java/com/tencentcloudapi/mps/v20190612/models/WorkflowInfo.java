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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowInfo extends AbstractModel{

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
<li>Enabled: Enabled,</li>
<li>Disabled: Disabled.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Input rule bound to a workflow. If an uploaded video hits the rule for the object, the workflow will be triggered.
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * Target storage of a video processing output file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Parameter of a video processing task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * Type parameter of a video content audit task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * Video content analysis task parameter.
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * Type parameter of a video content recognition task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
    */
    @SerializedName("TaskPriority")
    @Expose
    private Long TaskPriority;

    /**
    * Target directory of a video processing output file, such as `/movie/201907/`.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * Creation time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
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
<li>Enabled: Enabled,</li>
<li>Disabled: Disabled.</li> 
     * @return Status Workflow status. Valid values:
<li>Enabled: Enabled,</li>
<li>Disabled: Disabled.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Workflow status. Valid values:
<li>Enabled: Enabled,</li>
<li>Disabled: Disabled.</li>
     * @param Status Workflow status. Valid values:
<li>Enabled: Enabled,</li>
<li>Disabled: Disabled.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Input rule bound to a workflow. If an uploaded video hits the rule for the object, the workflow will be triggered. 
     * @return Trigger Input rule bound to a workflow. If an uploaded video hits the rule for the object, the workflow will be triggered.
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set Input rule bound to a workflow. If an uploaded video hits the rule for the object, the workflow will be triggered.
     * @param Trigger Input rule bound to a workflow. If an uploaded video hits the rule for the object, the workflow will be triggered.
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get Target storage of a video processing output file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputStorage Target storage of a video processing output file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target storage of a video processing output file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputStorage Target storage of a video processing output file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Parameter of a video processing task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MediaProcessTask Parameter of a video processing task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set Parameter of a video processing task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MediaProcessTask Parameter of a video processing task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get Type parameter of a video content audit task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AiContentReviewTask Type parameter of a video content audit task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set Type parameter of a video content audit task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AiContentReviewTask Type parameter of a video content audit task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get Video content analysis task parameter. 
     * @return AiAnalysisTask Video content analysis task parameter.
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set Video content analysis task parameter.
     * @param AiAnalysisTask Video content analysis task parameter.
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get Type parameter of a video content recognition task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AiRecognitionTask Type parameter of a video content recognition task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set Type parameter of a video content recognition task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AiRecognitionTask Type parameter of a video content recognition task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskNotifyConfig Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskNotifyConfig Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used. 
     * @return TaskPriority Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     */
    public Long getTaskPriority() {
        return this.TaskPriority;
    }

    /**
     * Set Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     * @param TaskPriority Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     */
    public void setTaskPriority(Long TaskPriority) {
        this.TaskPriority = TaskPriority;
    }

    /**
     * Get Target directory of a video processing output file, such as `/movie/201907/`. 
     * @return OutputDir Target directory of a video processing output file, such as `/movie/201907/`.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set Target directory of a video processing output file, such as `/movie/201907/`.
     * @param OutputDir Target directory of a video processing output file, such as `/movie/201907/`.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get Creation time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return CreateTime Creation time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param CreateTime Creation time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return UpdateTime Last modified time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param UpdateTime Last modified time of a workflow in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

