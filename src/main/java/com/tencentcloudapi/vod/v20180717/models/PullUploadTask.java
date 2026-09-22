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

public class PullUploadTask extends AbstractModel {

    /**
    * <p>Pull the upload task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task flow status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check input parameters;</li><li>60000: source file error (for example, video data corruption). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>Error message.</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Pull the video ID generated after upload completion.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Pull basic information of the generated media file after upload completion.</p>
    */
    @SerializedName("MediaBasicInfo")
    @Expose
    private MediaBasicInfo MediaBasicInfo;

    /**
    * <p>Meta information of the output video.</p>
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * <p>Get the playback address generated after upload completion.</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>Task ID of the task type Procedure. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, and AiRecognitionTask.</p>
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * <p>Task ID of the task type ReviewAudioVideo. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies ReviewAudioVideoTask.</p>
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
    * <p>Source context, used to pass through user request information. <a href="https://www.tencentcloud.com/document/product/266/7831?from_cn_redirect=1">URL pull video upload completed</a> will return the value of this field, up to 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Pull upload progress, in the range of [0,100].</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get <p>Pull the upload task ID.</p> 
     * @return TaskId <p>Pull the upload task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Pull the upload task ID.</p>
     * @param TaskId <p>Pull the upload task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task flow status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li> 
     * @return Status <p>Task flow status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task flow status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li>
     * @param Status <p>Task flow status. Valid values: </p><li>PROCESSING: Processing; </li><li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check input parameters;</li><li>60000: source file error (for example, video data corruption). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li> 
     * @return ErrCode <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check input parameters;</li><li>60000: source file error (for example, video data corruption). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check input parameters;</li><li>60000: source file error (for example, video data corruption). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li>
     * @param ErrCode <p>Error code. 0 indicates success, and other values indicate failure:</p><li>40000: invalid input parameters. Check input parameters;</li><li>60000: source file error (for example, video data corruption). Confirm whether the source file is normal;</li><li>70000: internal service error. Retry is recommended.</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Error message.</p> 
     * @return Message <p>Error message.</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Error message.</p>
     * @param Message <p>Error message.</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Pull the video ID generated after upload completion.</p> 
     * @return FileId <p>Pull the video ID generated after upload completion.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Pull the video ID generated after upload completion.</p>
     * @param FileId <p>Pull the video ID generated after upload completion.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Pull basic information of the generated media file after upload completion.</p> 
     * @return MediaBasicInfo <p>Pull basic information of the generated media file after upload completion.</p>
     */
    public MediaBasicInfo getMediaBasicInfo() {
        return this.MediaBasicInfo;
    }

    /**
     * Set <p>Pull basic information of the generated media file after upload completion.</p>
     * @param MediaBasicInfo <p>Pull basic information of the generated media file after upload completion.</p>
     */
    public void setMediaBasicInfo(MediaBasicInfo MediaBasicInfo) {
        this.MediaBasicInfo = MediaBasicInfo;
    }

    /**
     * Get <p>Meta information of the output video.</p> 
     * @return MetaData <p>Meta information of the output video.</p>
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>Meta information of the output video.</p>
     * @param MetaData <p>Meta information of the output video.</p>
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get <p>Get the playback address generated after upload completion.</p> 
     * @return FileUrl <p>Get the playback address generated after upload completion.</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>Get the playback address generated after upload completion.</p>
     * @param FileUrl <p>Get the playback address generated after upload completion.</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>Task ID of the task type Procedure. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, and AiRecognitionTask.</p> 
     * @return ProcedureTaskId <p>Task ID of the task type Procedure. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, and AiRecognitionTask.</p>
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set <p>Task ID of the task type Procedure. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, and AiRecognitionTask.</p>
     * @param ProcedureTaskId <p>Task ID of the task type Procedure. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies one or more of MediaProcessTask, AiAnalysisTask, and AiRecognitionTask.</p>
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get <p>Task ID of the task type ReviewAudioVideo. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies ReviewAudioVideoTask.</p> 
     * @return ReviewAudioVideoTaskId <p>Task ID of the task type ReviewAudioVideo. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies ReviewAudioVideoTask.</p>
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set <p>Task ID of the task type ReviewAudioVideo. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies ReviewAudioVideoTask.</p>
     * @param ReviewAudioVideoTaskId <p>Task ID of the task type ReviewAudioVideo. If a media subsequent task operation (Procedure) is specified during <a href="https://www.tencentcloud.com/document/api/266/35575?from_cn_redirect=1">pull upload</a>, the task is initiated when the task flow template specifies ReviewAudioVideoTask.</p>
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    /**
     * Get <p>Source context, used to pass through user request information. <a href="https://www.tencentcloud.com/document/product/266/7831?from_cn_redirect=1">URL pull video upload completed</a> will return the value of this field, up to 1000 characters.</p> 
     * @return SessionContext <p>Source context, used to pass through user request information. <a href="https://www.tencentcloud.com/document/product/266/7831?from_cn_redirect=1">URL pull video upload completed</a> will return the value of this field, up to 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context, used to pass through user request information. <a href="https://www.tencentcloud.com/document/product/266/7831?from_cn_redirect=1">URL pull video upload completed</a> will return the value of this field, up to 1000 characters.</p>
     * @param SessionContext <p>Source context, used to pass through user request information. <a href="https://www.tencentcloud.com/document/product/266/7831?from_cn_redirect=1">URL pull video upload completed</a> will return the value of this field, up to 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p> 
     * @return SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     * @param SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past seven days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Pull upload progress, in the range of [0,100].</p> 
     * @return Progress <p>Pull upload progress, in the range of [0,100].</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Pull upload progress, in the range of [0,100].</p>
     * @param Progress <p>Pull upload progress, in the range of [0,100].</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public PullUploadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullUploadTask(PullUploadTask source) {
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
        if (source.MediaBasicInfo != null) {
            this.MediaBasicInfo = new MediaBasicInfo(source.MediaBasicInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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
        this.setParamObj(map, prefix + "MediaBasicInfo.", this.MediaBasicInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

