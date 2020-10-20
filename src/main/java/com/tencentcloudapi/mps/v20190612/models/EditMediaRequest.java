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

public class EditMediaRequest extends AbstractModel{

    /**
    * Information of input video file.
    */
    @SerializedName("FileInfos")
    @Expose
    private EditMediaFileInfo [] FileInfos;

    /**
    * Target storage of video processing output file.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Target path of video processing output file.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * Event notification information of task. If this parameter is left empty, no event notifications will be obtained.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * Task priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * The ID used for deduplication. If there was a request with the same ID in the last three days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
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
     * Get Information of input video file. 
     * @return FileInfos Information of input video file.
     */
    public EditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Information of input video file.
     * @param FileInfos Information of input video file.
     */
    public void setFileInfos(EditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get Target storage of video processing output file. 
     * @return OutputStorage Target storage of video processing output file.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target storage of video processing output file.
     * @param OutputStorage Target storage of video processing output file.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Target path of video processing output file. 
     * @return OutputObjectPath Target path of video processing output file.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set Target path of video processing output file.
     * @param OutputObjectPath Target path of video processing output file.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get Event notification information of task. If this parameter is left empty, no event notifications will be obtained. 
     * @return TaskNotifyConfig Event notification information of task. If this parameter is left empty, no event notifications will be obtained.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set Event notification information of task. If this parameter is left empty, no event notifications will be obtained.
     * @param TaskNotifyConfig Event notification information of task. If this parameter is left empty, no event notifications will be obtained.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get Task priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used. 
     * @return TasksPriority Task priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used.
     * @param TasksPriority Task priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get The ID used for deduplication. If there was a request with the same ID in the last three days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed. 
     * @return SessionId The ID used for deduplication. If there was a request with the same ID in the last three days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID used for deduplication. If there was a request with the same ID in the last three days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
     * @param SessionId The ID used for deduplication. If there was a request with the same ID in the last three days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

