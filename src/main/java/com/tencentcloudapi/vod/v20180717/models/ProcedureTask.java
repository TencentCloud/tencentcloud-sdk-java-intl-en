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
    * Media processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Deprecated. Please use the ErrCode of each specific task.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Deprecated. Please use the Message of each specific task.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Media file ID.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents the FileId of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Id of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Media file name
<li>If the process is triggered by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.Name of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Name of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Media file address.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.MediaUrl of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the URL of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Metadata of the original audio/video.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * Execution status and results of the audio/video processing task.
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * Execution status and results of an audio/video moderation task.
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * Execution status and results of an audio/video content analysis task.
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * Execution status and results of an audio/video content recognition task.
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
    * Priority of the task flow, with a value range of [-10, 10].
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Task flow status change notification mode.
<li>Finish: Initiate an event notification only when all task flows are completed;</li>
<li>Change: Event notification will be sent as long as the state of each subtask in the task flow changes;</li>
<li>None: non-acceptance of the task flow callback.</li>
    */
    @SerializedName("TasksNotifyMode")
    @Expose
    private String TasksNotifyMode;

    /**
    * Source context, which is used to pass through the user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Operator. Valid values:
<li>System: indicates a system trigger.</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Operation type. Valid values:
<li>TSC: indicates usage of top speed Codec for smart bitrate reduction.</li>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
     * Get Media processing task ID. 
     * @return TaskId Media processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Media processing task ID.
     * @param TaskId Media processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li> 
     * @return Status Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     * @param Status Task stream status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Deprecated. Please use the ErrCode of each specific task. 
     * @return ErrCode Deprecated. Please use the ErrCode of each specific task.
     * @deprecated
     */
    @Deprecated
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Deprecated. Please use the ErrCode of each specific task.
     * @param ErrCode Deprecated. Please use the ErrCode of each specific task.
     * @deprecated
     */
    @Deprecated
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Deprecated. Please use the Message of each specific task. 
     * @return Message Deprecated. Please use the Message of each specific task.
     * @deprecated
     */
    @Deprecated
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Deprecated. Please use the Message of each specific task.
     * @param Message Deprecated. Please use the Message of each specific task.
     * @deprecated
     */
    @Deprecated
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Media file ID.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents the FileId of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Id of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li> 
     * @return FileId Media file ID.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents the FileId of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Id of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents the FileId of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Id of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     * @param FileId Media file ID.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents the FileId of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Id of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Media file name
<li>If the process is triggered by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.Name of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Name of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li> 
     * @return FileName Media file name
<li>If the process is triggered by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.Name of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Name of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Media file name
<li>If the process is triggered by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.Name of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Name of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     * @param FileName Media file name
<li>If the process is triggered by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.Name of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the Name of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Media file address.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.MediaUrl of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the URL of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li> 
     * @return FileUrl Media file address.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.MediaUrl of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the URL of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set Media file address.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.MediaUrl of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the URL of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     * @param FileUrl Media file address.
<li>If the process is initiated by [ProcessMedia](https://www.tencentcloud.com/document/product/266/33427?from_cn_redirect=1), this field represents BasicInfo.MediaUrl of [MediaInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInfo);</li>
<li>If the process is initiated by [ProcessMediaByUrl](https://www.tencentcloud.com/document/product/266/33426?from_cn_redirect=1), this field represents the URL of [MediaInputInfo](https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaInputInfo).</li>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get Metadata of the original audio/video. 
     * @return MetaData Metadata of the original audio/video.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Metadata of the original audio/video.
     * @param MetaData Metadata of the original audio/video.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get Execution status and results of the audio/video processing task. 
     * @return MediaProcessResultSet Execution status and results of the audio/video processing task.
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set Execution status and results of the audio/video processing task.
     * @param MediaProcessResultSet Execution status and results of the audio/video processing task.
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get Execution status and results of an audio/video moderation task. 
     * @return AiContentReviewResultSet Execution status and results of an audio/video moderation task.
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * Set Execution status and results of an audio/video moderation task.
     * @param AiContentReviewResultSet Execution status and results of an audio/video moderation task.
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * Get Execution status and results of an audio/video content analysis task. 
     * @return AiAnalysisResultSet Execution status and results of an audio/video content analysis task.
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * Set Execution status and results of an audio/video content analysis task.
     * @param AiAnalysisResultSet Execution status and results of an audio/video content analysis task.
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * Get Execution status and results of an audio/video content recognition task. 
     * @return AiRecognitionResultSet Execution status and results of an audio/video content recognition task.
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * Set Execution status and results of an audio/video content recognition task.
     * @param AiRecognitionResultSet Execution status and results of an audio/video content recognition task.
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    /**
     * Get Priority of the task flow, with a value range of [-10, 10]. 
     * @return TasksPriority Priority of the task flow, with a value range of [-10, 10].
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Priority of the task flow, with a value range of [-10, 10].
     * @param TasksPriority Priority of the task flow, with a value range of [-10, 10].
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Task flow status change notification mode.
<li>Finish: Initiate an event notification only when all task flows are completed;</li>
<li>Change: Event notification will be sent as long as the state of each subtask in the task flow changes;</li>
<li>None: non-acceptance of the task flow callback.</li> 
     * @return TasksNotifyMode Task flow status change notification mode.
<li>Finish: Initiate an event notification only when all task flows are completed;</li>
<li>Change: Event notification will be sent as long as the state of each subtask in the task flow changes;</li>
<li>None: non-acceptance of the task flow callback.</li>
     */
    public String getTasksNotifyMode() {
        return this.TasksNotifyMode;
    }

    /**
     * Set Task flow status change notification mode.
<li>Finish: Initiate an event notification only when all task flows are completed;</li>
<li>Change: Event notification will be sent as long as the state of each subtask in the task flow changes;</li>
<li>None: non-acceptance of the task flow callback.</li>
     * @param TasksNotifyMode Task flow status change notification mode.
<li>Finish: Initiate an event notification only when all task flows are completed;</li>
<li>Change: Event notification will be sent as long as the state of each subtask in the task flow changes;</li>
<li>None: non-acceptance of the task flow callback.</li>
     */
    public void setTasksNotifyMode(String TasksNotifyMode) {
        this.TasksNotifyMode = TasksNotifyMode;
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
     * Get An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required. 
     * @return SessionId An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     * @param SessionId An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Operator. Valid values:
<li>System: indicates a system trigger.</li> 
     * @return Operator Operator. Valid values:
<li>System: indicates a system trigger.</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator. Valid values:
<li>System: indicates a system trigger.</li>
     * @param Operator Operator. Valid values:
<li>System: indicates a system trigger.</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Operation type. Valid values:
<li>TSC: indicates usage of top speed Codec for smart bitrate reduction.</li> 
     * @return OperationType Operation type. Valid values:
<li>TSC: indicates usage of top speed Codec for smart bitrate reduction.</li>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Operation type. Valid values:
<li>TSC: indicates usage of top speed Codec for smart bitrate reduction.</li>
     * @param OperationType Operation type. Valid values:
<li>TSC: indicates usage of top speed Codec for smart bitrate reduction.</li>
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

