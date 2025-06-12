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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchProcessMediaRequest extends AbstractModel {

    /**
    * Path of the input file.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo [] InputInfo;

    /**
    * Storage bucket for the output file. If it is left blank, the storage location in InputInfo will be inherited.
Note: When InputInfo.Type is URL, this parameter is required.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left blank, it indicates that the directory is the same as the one where the file is located in InputInfo.
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * Smart subtitle.
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * Event notification information of the task. If left blank, it indicates that no event notification will be obtained.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Resource ID. Ensure the corresponding resource is in the enabled state. The default value is an account's primary resource ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Whether to skip metadata acquisition. Valid values:
0: do not skip.
1: skip.
Default value: 0		
    */
    @SerializedName("SkipMateData")
    @Expose
    private Long SkipMateData;

    /**
     * Get Path of the input file. 
     * @return InputInfo Path of the input file.
     */
    public MediaInputInfo [] getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set Path of the input file.
     * @param InputInfo Path of the input file.
     */
    public void setInputInfo(MediaInputInfo [] InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Storage bucket for the output file. If it is left blank, the storage location in InputInfo will be inherited.
Note: When InputInfo.Type is URL, this parameter is required. 
     * @return OutputStorage Storage bucket for the output file. If it is left blank, the storage location in InputInfo will be inherited.
Note: When InputInfo.Type is URL, this parameter is required.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Storage bucket for the output file. If it is left blank, the storage location in InputInfo will be inherited.
Note: When InputInfo.Type is URL, this parameter is required.
     * @param OutputStorage Storage bucket for the output file. If it is left blank, the storage location in InputInfo will be inherited.
Note: When InputInfo.Type is URL, this parameter is required.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left blank, it indicates that the directory is the same as the one where the file is located in InputInfo. 
     * @return OutputDir Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left blank, it indicates that the directory is the same as the one where the file is located in InputInfo.
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left blank, it indicates that the directory is the same as the one where the file is located in InputInfo.
     * @param OutputDir Storage directory for the output file. It should start and end with a slash (/), such as `/movie/201907/`.
If left blank, it indicates that the directory is the same as the one where the file is located in InputInfo.
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get Smart subtitle. 
     * @return SmartSubtitlesTask Smart subtitle.
     */
    public SmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set Smart subtitle.
     * @param SmartSubtitlesTask Smart subtitle.
     */
    public void setSmartSubtitlesTask(SmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get Event notification information of the task. If left blank, it indicates that no event notification will be obtained. 
     * @return TaskNotifyConfig Event notification information of the task. If left blank, it indicates that no event notification will be obtained.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set Event notification information of the task. If left blank, it indicates that no event notification will be obtained.
     * @param TaskNotifyConfig Event notification information of the task. If left blank, it indicates that no event notification will be obtained.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0. 
     * @return TasksPriority Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     * @param TasksPriority Priority of the task flow. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters. 
     * @return SessionContext Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     * @param SessionContext Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
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
0: do not skip.
1: skip.
Default value: 0		 
     * @return SkipMateData Whether to skip metadata acquisition. Valid values:
0: do not skip.
1: skip.
Default value: 0		
     */
    public Long getSkipMateData() {
        return this.SkipMateData;
    }

    /**
     * Set Whether to skip metadata acquisition. Valid values:
0: do not skip.
1: skip.
Default value: 0		
     * @param SkipMateData Whether to skip metadata acquisition. Valid values:
0: do not skip.
1: skip.
Default value: 0		
     */
    public void setSkipMateData(Long SkipMateData) {
        this.SkipMateData = SkipMateData;
    }

    public BatchProcessMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchProcessMediaRequest(BatchProcessMediaRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo[source.InputInfo.length];
            for (int i = 0; i < source.InputInfo.length; i++) {
                this.InputInfo[i] = new MediaInputInfo(source.InputInfo[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new SmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
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
        this.setParamArrayObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "SkipMateData", this.SkipMateData);

    }
}

