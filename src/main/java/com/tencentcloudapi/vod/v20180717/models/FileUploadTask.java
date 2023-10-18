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
    * Basic information of media file generated after upload is completed.
    */
    @SerializedName("MediaBasicInfo")
    @Expose
    private MediaBasicInfo MediaBasicInfo;

    /**
    * The task ID for the task type `Procedure`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`, the task specified by this parameter will be executed.
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * The task ID for the task type `ReviewAudioVideo`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed.
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
    * Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Basic information of media file generated after upload is completed. 
     * @return MediaBasicInfo Basic information of media file generated after upload is completed.
     */
    public MediaBasicInfo getMediaBasicInfo() {
        return this.MediaBasicInfo;
    }

    /**
     * Set Basic information of media file generated after upload is completed.
     * @param MediaBasicInfo Basic information of media file generated after upload is completed.
     */
    public void setMediaBasicInfo(MediaBasicInfo MediaBasicInfo) {
        this.MediaBasicInfo = MediaBasicInfo;
    }

    /**
     * Get The task ID for the task type `Procedure`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`, the task specified by this parameter will be executed. 
     * @return ProcedureTaskId The task ID for the task type `Procedure`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`, the task specified by this parameter will be executed.
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set The task ID for the task type `Procedure`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`, the task specified by this parameter will be executed.
     * @param ProcedureTaskId The task ID for the task type `Procedure`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes one or more of `MediaProcessTask`, `AiAnalysisTask`, and `AiRecognitionTask`, the task specified by this parameter will be executed.
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get The task ID for the task type `ReviewAudioVideo`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed. 
     * @return ReviewAudioVideoTaskId The task ID for the task type `ReviewAudioVideo`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed.
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set The task ID for the task type `ReviewAudioVideo`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed.
     * @param ReviewAudioVideoTaskId The task ID for the task type `ReviewAudioVideo`. If a task flow is specified for [uploaded media](https://intl.cloud.tencent.com/document/product/266/33475?from_cn_redirect=1#.E4.BB.BB.E5.8A.A1.E5.8F.91.E8.B5.B7), and the task flow includes `ReviewAudioVideoTask`, the task specified by this parameter will be executed.
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    /**
     * Get Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MetaData Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MetaData Metadata, such as size, duration, video stream information, audio stream information, etc.
Note: this field may return null, indicating that no valid values can be obtained.
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

