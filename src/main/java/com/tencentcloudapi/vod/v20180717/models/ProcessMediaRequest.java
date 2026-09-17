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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessMediaRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 
    */
    @SerializedName("TasksNotifyMode")
    @Expose
    private String TasksNotifyMode;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("OutputAsIndependentMedia")
    @Expose
    private String OutputAsIndependentMedia;

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return MediaStoragePath 
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set 
     * @param MediaStoragePath 
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
     * @return TasksPriority 
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 
     * @param TasksPriority 
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get  
     * @return TasksNotifyMode 
     */
    public String getTasksNotifyMode() {
        return this.TasksNotifyMode;
    }

    /**
     * Set 
     * @param TasksNotifyMode 
     */
    public void setTasksNotifyMode(String TasksNotifyMode) {
        this.TasksNotifyMode = TasksNotifyMode;
    }

    /**
     * Get  
     * @return SessionContext 
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 
     * @param SessionContext 
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get  
     * @return SessionId 
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 
     * @param SessionId 
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get  
     * @return ExtInfo 
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 
     * @param ExtInfo 
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return OutputAsIndependentMedia 
     */
    public String getOutputAsIndependentMedia() {
        return this.OutputAsIndependentMedia;
    }

    /**
     * Set 
     * @param OutputAsIndependentMedia 
     */
    public void setOutputAsIndependentMedia(String OutputAsIndependentMedia) {
        this.OutputAsIndependentMedia = OutputAsIndependentMedia;
    }

    public ProcessMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaRequest(ProcessMediaRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaStoragePath != null) {
            this.MediaStoragePath = new String(source.MediaStoragePath);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.TasksNotifyMode != null) {
            this.TasksNotifyMode = new String(source.TasksNotifyMode);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.OutputAsIndependentMedia != null) {
            this.OutputAsIndependentMedia = new String(source.OutputAsIndependentMedia);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "TasksNotifyMode", this.TasksNotifyMode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "OutputAsIndependentMedia", this.OutputAsIndependentMedia);

    }
}

