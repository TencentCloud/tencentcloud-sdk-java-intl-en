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

public class ProcessMediaRequest extends AbstractModel {

    /**
    * The information of the file to process.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * Target storage for Media Processing Service output files. If left blank, it inherits the storage location in InputInfo.

Note: When InputInfo.Type is URL, this parameter is required.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this parameter, the file will be saved to the directory specified in `InputInfo`.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * Orchestration ID.
Note 1: For parameters OutputStorage and OutputDir:
<li>When a sub-task node in service orchestration has OutputStorage and OutputDir configured, the output configured in this sub-task node is used as the output of the sub-task.</li>
<li>When a sub-task node in service orchestration does not have OutputStorage and OutputDir configured, if the task creation API (ProcessMedia) has specified an output, it will override the default output of the original orchestration.</li>
<li>The priority of output settings is: Orchestration sub-task node > Output specified by the task API > Corresponding configuration within an orchestration.</li>
Note 2: For the TaskNotifyConfig parameter, if the task creation API (ProcessMedia) has set this parameter, it will override the default callback of the original orchestration.

Note 3: The trigger configured for an orchestration is for automatically starting the orchestration. It stops working when you manually call this API to start an orchestration.
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * The media processing parameters to use.
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * Type parameter of a video content audit task.
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
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * Media quality inspection type task parameters.
    */
    @SerializedName("AiQualityControlTask")
    @Expose
    private AiQualityControlTaskInput AiQualityControlTask;

    /**
    * Smart subtitle task.
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * Smart erase task parameter.
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private SmartEraseTaskInput SmartEraseTask;

    /**
    * Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Identification code for deduplication, up to 50 characters. If a request with the same identification code was made within the past 3 days, an error will be returned for the current request. If this parameter is not provided or is an empty string, deduplication will not be performed for this request.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The task type.
<li> `Online` (default): A task that is executed immediately.</li>
<li> `Offline`: A task that is executed when the system is idle (within three days by default).</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Resource ID. Ensure the corresponding resource is in the enabled state. The default value is an account's primary resource ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Whether to skip metadata acquisition. Valid values:
0: do not skip
1: skip
Default value: 0		
    */
    @SerializedName("SkipMateData")
    @Expose
    private Long SkipMateData;

    /**
     * Get The information of the file to process. 
     * @return InputInfo The information of the file to process.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set The information of the file to process.
     * @param InputInfo The information of the file to process.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Target storage for Media Processing Service output files. If left blank, it inherits the storage location in InputInfo.

Note: When InputInfo.Type is URL, this parameter is required. 
     * @return OutputStorage Target storage for Media Processing Service output files. If left blank, it inherits the storage location in InputInfo.

Note: When InputInfo.Type is URL, this parameter is required.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target storage for Media Processing Service output files. If left blank, it inherits the storage location in InputInfo.

Note: When InputInfo.Type is URL, this parameter is required.
     * @param OutputStorage Target storage for Media Processing Service output files. If left blank, it inherits the storage location in InputInfo.

Note: When InputInfo.Type is URL, this parameter is required.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this parameter, the file will be saved to the directory specified in `InputInfo`. 
     * @return OutputDir The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this parameter, the file will be saved to the directory specified in `InputInfo`.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this parameter, the file will be saved to the directory specified in `InputInfo`.
     * @param OutputDir The directory to save the media processing output file, which must start and end with `/`, such as `/movie/201907/`.
If you do not specify this parameter, the file will be saved to the directory specified in `InputInfo`.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get Orchestration ID.
Note 1: For parameters OutputStorage and OutputDir:
<li>When a sub-task node in service orchestration has OutputStorage and OutputDir configured, the output configured in this sub-task node is used as the output of the sub-task.</li>
<li>When a sub-task node in service orchestration does not have OutputStorage and OutputDir configured, if the task creation API (ProcessMedia) has specified an output, it will override the default output of the original orchestration.</li>
<li>The priority of output settings is: Orchestration sub-task node > Output specified by the task API > Corresponding configuration within an orchestration.</li>
Note 2: For the TaskNotifyConfig parameter, if the task creation API (ProcessMedia) has set this parameter, it will override the default callback of the original orchestration.

Note 3: The trigger configured for an orchestration is for automatically starting the orchestration. It stops working when you manually call this API to start an orchestration. 
     * @return ScheduleId Orchestration ID.
Note 1: For parameters OutputStorage and OutputDir:
<li>When a sub-task node in service orchestration has OutputStorage and OutputDir configured, the output configured in this sub-task node is used as the output of the sub-task.</li>
<li>When a sub-task node in service orchestration does not have OutputStorage and OutputDir configured, if the task creation API (ProcessMedia) has specified an output, it will override the default output of the original orchestration.</li>
<li>The priority of output settings is: Orchestration sub-task node > Output specified by the task API > Corresponding configuration within an orchestration.</li>
Note 2: For the TaskNotifyConfig parameter, if the task creation API (ProcessMedia) has set this parameter, it will override the default callback of the original orchestration.

Note 3: The trigger configured for an orchestration is for automatically starting the orchestration. It stops working when you manually call this API to start an orchestration.
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set Orchestration ID.
Note 1: For parameters OutputStorage and OutputDir:
<li>When a sub-task node in service orchestration has OutputStorage and OutputDir configured, the output configured in this sub-task node is used as the output of the sub-task.</li>
<li>When a sub-task node in service orchestration does not have OutputStorage and OutputDir configured, if the task creation API (ProcessMedia) has specified an output, it will override the default output of the original orchestration.</li>
<li>The priority of output settings is: Orchestration sub-task node > Output specified by the task API > Corresponding configuration within an orchestration.</li>
Note 2: For the TaskNotifyConfig parameter, if the task creation API (ProcessMedia) has set this parameter, it will override the default callback of the original orchestration.

Note 3: The trigger configured for an orchestration is for automatically starting the orchestration. It stops working when you manually call this API to start an orchestration.
     * @param ScheduleId Orchestration ID.
Note 1: For parameters OutputStorage and OutputDir:
<li>When a sub-task node in service orchestration has OutputStorage and OutputDir configured, the output configured in this sub-task node is used as the output of the sub-task.</li>
<li>When a sub-task node in service orchestration does not have OutputStorage and OutputDir configured, if the task creation API (ProcessMedia) has specified an output, it will override the default output of the original orchestration.</li>
<li>The priority of output settings is: Orchestration sub-task node > Output specified by the task API > Corresponding configuration within an orchestration.</li>
Note 2: For the TaskNotifyConfig parameter, if the task creation API (ProcessMedia) has set this parameter, it will override the default callback of the original orchestration.

Note 3: The trigger configured for an orchestration is for automatically starting the orchestration. It stops working when you manually call this API to start an orchestration.
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get The media processing parameters to use. 
     * @return MediaProcessTask The media processing parameters to use.
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set The media processing parameters to use.
     * @param MediaProcessTask The media processing parameters to use.
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get Type parameter of a video content audit task. 
     * @return AiContentReviewTask Type parameter of a video content audit task.
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set Type parameter of a video content audit task.
     * @param AiContentReviewTask Type parameter of a video content audit task.
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
     * @return AiRecognitionTask Type parameter of a video content recognition task.
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set Type parameter of a video content recognition task.
     * @param AiRecognitionTask Type parameter of a video content recognition task.
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get Media quality inspection type task parameters. 
     * @return AiQualityControlTask Media quality inspection type task parameters.
     */
    public AiQualityControlTaskInput getAiQualityControlTask() {
        return this.AiQualityControlTask;
    }

    /**
     * Set Media quality inspection type task parameters.
     * @param AiQualityControlTask Media quality inspection type task parameters.
     */
    public void setAiQualityControlTask(AiQualityControlTaskInput AiQualityControlTask) {
        this.AiQualityControlTask = AiQualityControlTask;
    }

    /**
     * Get Smart subtitle task. 
     * @return SmartSubtitlesTask Smart subtitle task.
     */
    public SmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set Smart subtitle task.
     * @param SmartSubtitlesTask Smart subtitle task.
     */
    public void setSmartSubtitlesTask(SmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get Smart erase task parameter. 
     * @return SmartEraseTask Smart erase task parameter.
     */
    public SmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set Smart erase task parameter.
     * @param SmartEraseTask Smart erase task parameter.
     */
    public void setSmartEraseTask(SmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
    }

    /**
     * Get Event notification information of a task. If this parameter is left empty, no event notifications will be obtained. 
     * @return TaskNotifyConfig Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
     * @param TaskNotifyConfig Event notification information of a task. If this parameter is left empty, no event notifications will be obtained.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used. 
     * @return TasksPriority Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     * @param TasksPriority Task flow priority. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Identification code for deduplication, up to 50 characters. If a request with the same identification code was made within the past 3 days, an error will be returned for the current request. If this parameter is not provided or is an empty string, deduplication will not be performed for this request. 
     * @return SessionId Identification code for deduplication, up to 50 characters. If a request with the same identification code was made within the past 3 days, an error will be returned for the current request. If this parameter is not provided or is an empty string, deduplication will not be performed for this request.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identification code for deduplication, up to 50 characters. If a request with the same identification code was made within the past 3 days, an error will be returned for the current request. If this parameter is not provided or is an empty string, deduplication will not be performed for this request.
     * @param SessionId Identification code for deduplication, up to 50 characters. If a request with the same identification code was made within the past 3 days, an error will be returned for the current request. If this parameter is not provided or is an empty string, deduplication will not be performed for this request.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters. 
     * @return SessionContext The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     * @param SessionContext The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get The task type.
<li> `Online` (default): A task that is executed immediately.</li>
<li> `Offline`: A task that is executed when the system is idle (within three days by default).</li> 
     * @return TaskType The task type.
<li> `Online` (default): A task that is executed immediately.</li>
<li> `Offline`: A task that is executed when the system is idle (within three days by default).</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set The task type.
<li> `Online` (default): A task that is executed immediately.</li>
<li> `Offline`: A task that is executed when the system is idle (within three days by default).</li>
     * @param TaskType The task type.
<li> `Online` (default): A task that is executed immediately.</li>
<li> `Offline`: A task that is executed when the system is idle (within three days by default).</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Resource ID. Ensure the corresponding resource is in the enabled state. The default value is an account's primary resource ID. 
     * @return ResourceId Resource ID. Ensure the corresponding resource is in the enabled state. The default value is an account's primary resource ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID. Ensure the corresponding resource is in the enabled state. The default value is an account's primary resource ID.
     * @param ResourceId Resource ID. Ensure the corresponding resource is in the enabled state. The default value is an account's primary resource ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Whether to skip metadata acquisition. Valid values:
0: do not skip
1: skip
Default value: 0		 
     * @return SkipMateData Whether to skip metadata acquisition. Valid values:
0: do not skip
1: skip
Default value: 0		
     */
    public Long getSkipMateData() {
        return this.SkipMateData;
    }

    /**
     * Set Whether to skip metadata acquisition. Valid values:
0: do not skip
1: skip
Default value: 0		
     * @param SkipMateData Whether to skip metadata acquisition. Valid values:
0: do not skip
1: skip
Default value: 0		
     */
    public void setSkipMateData(Long SkipMateData) {
        this.SkipMateData = SkipMateData;
    }

    public ProcessMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaRequest(ProcessMediaRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
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
        if (source.AiQualityControlTask != null) {
            this.AiQualityControlTask = new AiQualityControlTaskInput(source.AiQualityControlTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new SmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new SmartEraseTaskInput(source.SmartEraseTask);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.SkipMateData != null) {
            this.SkipMateData = new Long(source.SkipMateData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "AiQualityControlTask.", this.AiQualityControlTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "SkipMateData", this.SkipMateData);

    }
}

