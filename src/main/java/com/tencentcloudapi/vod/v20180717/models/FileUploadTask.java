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

public class FileUploadTask extends AbstractModel {

    /**
    * Unique file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Basic information of the generated media file after upload completion.
    */
    @SerializedName("MediaBasicInfo")
    @Expose
    private MediaBasicInfo MediaBasicInfo;

    /**
    * Task ID of the `Procedure` type. If A task (Procedure) to execute is specified during video upload, the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * Task ID of the `ReviewAudioVideo` task type. If a task procedure is specified during video upload (https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), the task is initiated when the task flow template specifies `ReviewAudioVideoTask`.
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
    * Meta information, including size, duration, video stream information, and audio stream information.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get Unique file ID. 
     * @return FileId Unique file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique file ID.
     * @param FileId Unique file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Basic information of the generated media file after upload completion. 
     * @return MediaBasicInfo Basic information of the generated media file after upload completion.
     */
    public MediaBasicInfo getMediaBasicInfo() {
        return this.MediaBasicInfo;
    }

    /**
     * Set Basic information of the generated media file after upload completion.
     * @param MediaBasicInfo Basic information of the generated media file after upload completion.
     */
    public void setMediaBasicInfo(MediaBasicInfo MediaBasicInfo) {
        this.MediaBasicInfo = MediaBasicInfo;
    }

    /**
     * Get Task ID of the `Procedure` type. If A task (Procedure) to execute is specified during video upload, the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`. 
     * @return ProcedureTaskId Task ID of the `Procedure` type. If A task (Procedure) to execute is specified during video upload, the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set Task ID of the `Procedure` type. If A task (Procedure) to execute is specified during video upload, the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     * @param ProcedureTaskId Task ID of the `Procedure` type. If A task (Procedure) to execute is specified during video upload, the task is initiated when the task flow template specifies one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`.
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get Task ID of the `ReviewAudioVideo` task type. If a task procedure is specified during video upload (https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), the task is initiated when the task flow template specifies `ReviewAudioVideoTask`. 
     * @return ReviewAudioVideoTaskId Task ID of the `ReviewAudioVideo` task type. If a task procedure is specified during video upload (https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), the task is initiated when the task flow template specifies `ReviewAudioVideoTask`.
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set Task ID of the `ReviewAudioVideo` task type. If a task procedure is specified during video upload (https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), the task is initiated when the task flow template specifies `ReviewAudioVideoTask`.
     * @param ReviewAudioVideoTaskId Task ID of the `ReviewAudioVideo` task type. If a task procedure is specified during video upload (https://www.tencentcloud.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), the task is initiated when the task flow template specifies `ReviewAudioVideoTask`.
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    /**
     * Get Meta information, including size, duration, video stream information, and audio stream information. 
     * @return MetaData Meta information, including size, duration, video stream information, and audio stream information.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Meta information, including size, duration, video stream information, and audio stream information.
     * @param MetaData Meta information, including size, duration, video stream information, and audio stream information.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    public FileUploadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileUploadTask(FileUploadTask source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaBasicInfo != null) {
            this.MediaBasicInfo = new MediaBasicInfo(source.MediaBasicInfo);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MediaBasicInfo.", this.MediaBasicInfo);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

