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

public class ProcedureTask extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * 
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * 
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * 
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

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
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
     * Get  
     * @return TaskId 
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 
     * @param TaskId 
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return ErrCode 
     * @deprecated
     */
    @Deprecated
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 
     * @param ErrCode 
     * @deprecated
     */
    @Deprecated
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get  
     * @return Message 
     * @deprecated
     */
    @Deprecated
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 
     * @param Message 
     * @deprecated
     */
    @Deprecated
    public void setMessage(String Message) {
        this.Message = Message;
    }

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
     * @return FileName 
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 
     * @param FileName 
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get  
     * @return FileUrl 
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 
     * @param FileUrl 
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get  
     * @return MetaData 
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 
     * @param MetaData 
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get  
     * @return MediaProcessResultSet 
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set 
     * @param MediaProcessResultSet 
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get  
     * @return AiContentReviewResultSet 
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * Set 
     * @param AiContentReviewResultSet 
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * Get  
     * @return AiAnalysisResultSet 
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * Set 
     * @param AiAnalysisResultSet 
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * Get  
     * @return AiRecognitionResultSet 
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * Set 
     * @param AiRecognitionResultSet 
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
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
     * @return Operator 
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 
     * @param Operator 
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get  
     * @return OperationType 
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 
     * @param OperationType 
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    public ProcedureTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcedureTask(ProcedureTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.MediaProcessResultSet != null) {
            this.MediaProcessResultSet = new MediaProcessTaskResult[source.MediaProcessResultSet.length];
            for (int i = 0; i < source.MediaProcessResultSet.length; i++) {
                this.MediaProcessResultSet[i] = new MediaProcessTaskResult(source.MediaProcessResultSet[i]);
            }
        }
        if (source.AiContentReviewResultSet != null) {
            this.AiContentReviewResultSet = new AiContentReviewResult[source.AiContentReviewResultSet.length];
            for (int i = 0; i < source.AiContentReviewResultSet.length; i++) {
                this.AiContentReviewResultSet[i] = new AiContentReviewResult(source.AiContentReviewResultSet[i]);
            }
        }
        if (source.AiAnalysisResultSet != null) {
            this.AiAnalysisResultSet = new AiAnalysisResult[source.AiAnalysisResultSet.length];
            for (int i = 0; i < source.AiAnalysisResultSet.length; i++) {
                this.AiAnalysisResultSet[i] = new AiAnalysisResult(source.AiAnalysisResultSet[i]);
            }
        }
        if (source.AiRecognitionResultSet != null) {
            this.AiRecognitionResultSet = new AiRecognitionResult[source.AiRecognitionResultSet.length];
            for (int i = 0; i < source.AiRecognitionResultSet.length; i++) {
                this.AiRecognitionResultSet[i] = new AiRecognitionResult(source.AiRecognitionResultSet[i]);
            }
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
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "MediaProcessResultSet.", this.MediaProcessResultSet);
        this.setParamArrayObj(map, prefix + "AiContentReviewResultSet.", this.AiContentReviewResultSet);
        this.setParamArrayObj(map, prefix + "AiAnalysisResultSet.", this.AiAnalysisResultSet);
        this.setParamArrayObj(map, prefix + "AiRecognitionResultSet.", this.AiRecognitionResultSet);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "TasksNotifyMode", this.TasksNotifyMode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

