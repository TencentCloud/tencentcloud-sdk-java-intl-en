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
    * <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after a successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/33950">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.<br>You must provide one of FileId and MediaStoragePath.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Storage path of the media.<br>Only sub-applications in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can initiate task through MediaStoragePath.<br>Either FileId or MediaStoragePath must be provided.</p>
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
    * <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID to access resources in on-demand applications (whether default or newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Parameters for the video processing type task.</p>
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * <p>Audio and video content review type task parameters.<br><font color="red">* Not recommended for use</font>. It is recommended to use <a href="https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1">ReviewAudioVideo</a> or <a href="https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1">ReviewImage</a>.</p>
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * <p>Parameters for the audio and video content analysis task.</p>
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>Parameters for the audio/video content recognition task.</p>
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * <p>Priority of the task flow. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>Task flow status change notification mode. Valid values are Finish, Change, and None. If this is not specified, the default value is Finish.</p>
    */
    @SerializedName("TasksNotifyMode")
    @Expose
    private String TasksNotifyMode;

    /**
    * <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Reserved field, used when special purpose.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <p>Valid when FileID is empty. Pull the Url to generate new media assets and generate a new FileID. The media processing product will be affiliated with the new media assets.</p><p>Note: Storage fees will occur for new media assets.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>The media processing transcoding result is output as standalone media assets. Enabling this option will output the product as standalone media assets and generate a brand-new FileID. Currently only support outputting TranscodeTask transcoding tasks as standalone media assets.</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Note: New media assets will incur storage fees. This option does not currently support enabling for video opening/closing credits and traceable watermarks in transcoding tasks.</p>
    */
    @SerializedName("OutputAsIndependentMedia")
    @Expose
    private String OutputAsIndependentMedia;

    /**
     * Get <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after a successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/33950">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.<br>You must provide one of FileId and MediaStoragePath.</p> 
     * @return FileId <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after a successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/33950">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.<br>You must provide one of FileId and MediaStoragePath.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after a successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/33950">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.<br>You must provide one of FileId and MediaStoragePath.</p>
     * @param FileId <p>Media file ID, the globally unique identifier of the file in VOD, is assigned by the VOD backend after a successful upload. You can get this field in the <a href="https://www.tencentcloud.com/document/product/266/33950">video upload completion event notification</a> or the <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.<br>You must provide one of FileId and MediaStoragePath.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>Storage path of the media.<br>Only sub-applications in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can initiate task through MediaStoragePath.<br>Either FileId or MediaStoragePath must be provided.</p> 
     * @return MediaStoragePath <p>Storage path of the media.<br>Only sub-applications in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can initiate task through MediaStoragePath.<br>Either FileId or MediaStoragePath must be provided.</p>
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set <p>Storage path of the media.<br>Only sub-applications in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can initiate task through MediaStoragePath.<br>Either FileId or MediaStoragePath must be provided.</p>
     * @param MediaStoragePath <p>Storage path of the media.<br>Only sub-applications in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can initiate task through MediaStoragePath.<br>Either FileId or MediaStoragePath must be provided.</p>
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
    }

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID to access resources in on-demand applications (whether default or newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID to access resources in on-demand applications (whether default or newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID to access resources in on-demand applications (whether default or newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/33987">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID to access resources in on-demand applications (whether default or newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Parameters for the video processing type task.</p> 
     * @return MediaProcessTask <p>Parameters for the video processing type task.</p>
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set <p>Parameters for the video processing type task.</p>
     * @param MediaProcessTask <p>Parameters for the video processing type task.</p>
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get <p>Audio and video content review type task parameters.<br><font color="red">* Not recommended for use</font>. It is recommended to use <a href="https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1">ReviewAudioVideo</a> or <a href="https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1">ReviewImage</a>.</p> 
     * @return AiContentReviewTask <p>Audio and video content review type task parameters.<br><font color="red">* Not recommended for use</font>. It is recommended to use <a href="https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1">ReviewAudioVideo</a> or <a href="https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1">ReviewImage</a>.</p>
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set <p>Audio and video content review type task parameters.<br><font color="red">* Not recommended for use</font>. It is recommended to use <a href="https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1">ReviewAudioVideo</a> or <a href="https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1">ReviewImage</a>.</p>
     * @param AiContentReviewTask <p>Audio and video content review type task parameters.<br><font color="red">* Not recommended for use</font>. It is recommended to use <a href="https://www.tencentcloud.com/document/api/266/80283?from_cn_redirect=1">ReviewAudioVideo</a> or <a href="https://www.tencentcloud.com/document/api/266/73217?from_cn_redirect=1">ReviewImage</a>.</p>
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get <p>Parameters for the audio and video content analysis task.</p> 
     * @return AiAnalysisTask <p>Parameters for the audio and video content analysis task.</p>
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>Parameters for the audio and video content analysis task.</p>
     * @param AiAnalysisTask <p>Parameters for the audio and video content analysis task.</p>
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>Parameters for the audio/video content recognition task.</p> 
     * @return AiRecognitionTask <p>Parameters for the audio/video content recognition task.</p>
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set <p>Parameters for the audio/video content recognition task.</p>
     * @param AiRecognitionTask <p>Parameters for the audio/video content recognition task.</p>
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get <p>Priority of the task flow. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p> 
     * @return TasksPriority <p>Priority of the task flow. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>Priority of the task flow. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     * @param TasksPriority <p>Priority of the task flow. The higher the value, the higher the priority. The value ranges from -10 to 10. If this is not specified, it represents 0.</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get <p>Task flow status change notification mode. Valid values are Finish, Change, and None. If this is not specified, the default value is Finish.</p> 
     * @return TasksNotifyMode <p>Task flow status change notification mode. Valid values are Finish, Change, and None. If this is not specified, the default value is Finish.</p>
     */
    public String getTasksNotifyMode() {
        return this.TasksNotifyMode;
    }

    /**
     * Set <p>Task flow status change notification mode. Valid values are Finish, Change, and None. If this is not specified, the default value is Finish.</p>
     * @param TasksNotifyMode <p>Task flow status change notification mode. Valid values are Finish, Change, and None. If this is not specified, the default value is Finish.</p>
     */
    public void setTasksNotifyMode(String TasksNotifyMode) {
        this.TasksNotifyMode = TasksNotifyMode;
    }

    /**
     * Get <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Source context. This is used to pass user request information. The task status change callback returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p> 
     * @return SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     * @param SessionId <p>Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Reserved field, used when special purpose.</p> 
     * @return ExtInfo <p>Reserved field, used when special purpose.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field, used when special purpose.</p>
     * @param ExtInfo <p>Reserved field, used when special purpose.</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <p>Valid when FileID is empty. Pull the Url to generate new media assets and generate a new FileID. The media processing product will be affiliated with the new media assets.</p><p>Note: Storage fees will occur for new media assets.</p> 
     * @return Url <p>Valid when FileID is empty. Pull the Url to generate new media assets and generate a new FileID. The media processing product will be affiliated with the new media assets.</p><p>Note: Storage fees will occur for new media assets.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Valid when FileID is empty. Pull the Url to generate new media assets and generate a new FileID. The media processing product will be affiliated with the new media assets.</p><p>Note: Storage fees will occur for new media assets.</p>
     * @param Url <p>Valid when FileID is empty. Pull the Url to generate new media assets and generate a new FileID. The media processing product will be affiliated with the new media assets.</p><p>Note: Storage fees will occur for new media assets.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>The media processing transcoding result is output as standalone media assets. Enabling this option will output the product as standalone media assets and generate a brand-new FileID. Currently only support outputting TranscodeTask transcoding tasks as standalone media assets.</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Note: New media assets will incur storage fees. This option does not currently support enabling for video opening/closing credits and traceable watermarks in transcoding tasks.</p> 
     * @return OutputAsIndependentMedia <p>The media processing transcoding result is output as standalone media assets. Enabling this option will output the product as standalone media assets and generate a brand-new FileID. Currently only support outputting TranscodeTask transcoding tasks as standalone media assets.</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Note: New media assets will incur storage fees. This option does not currently support enabling for video opening/closing credits and traceable watermarks in transcoding tasks.</p>
     */
    public String getOutputAsIndependentMedia() {
        return this.OutputAsIndependentMedia;
    }

    /**
     * Set <p>The media processing transcoding result is output as standalone media assets. Enabling this option will output the product as standalone media assets and generate a brand-new FileID. Currently only support outputting TranscodeTask transcoding tasks as standalone media assets.</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Note: New media assets will incur storage fees. This option does not currently support enabling for video opening/closing credits and traceable watermarks in transcoding tasks.</p>
     * @param OutputAsIndependentMedia <p>The media processing transcoding result is output as standalone media assets. Enabling this option will output the product as standalone media assets and generate a brand-new FileID. Currently only support outputting TranscodeTask transcoding tasks as standalone media assets.</p><p>Enumeration value:</p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p><p>Note: New media assets will incur storage fees. This option does not currently support enabling for video opening/closing credits and traceable watermarks in transcoding tasks.</p>
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

