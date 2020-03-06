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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessMediaRequest extends AbstractModel{

    /**
    * Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](/document/product/266/7830) or [VOD Console](https://console.cloud.tencent.com/vod/media).
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Parameter of video processing task.
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * Type parameter of video content audit task.
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
    * Type parameter of video content recognition task.
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * Task flow priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Notification mode for task flow status change. Valid values: Finish, Change, None. If this parameter is left empty, `Finish` will be used.
    */
    @SerializedName("TasksNotifyMode")
    @Expose
    private String TasksNotifyMode;

    /**
    * The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Reserved field for special purposes.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](/document/product/266/7830) or [VOD Console](https://console.cloud.tencent.com/vod/media). 
     * @return FileId Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](/document/product/266/7830) or [VOD Console](https://console.cloud.tencent.com/vod/media).
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](/document/product/266/7830) or [VOD Console](https://console.cloud.tencent.com/vod/media).
     * @param FileId Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](/document/product/266/7830) or [VOD Console](https://console.cloud.tencent.com/vod/media).
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Parameter of video processing task. 
     * @return MediaProcessTask Parameter of video processing task.
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set Parameter of video processing task.
     * @param MediaProcessTask Parameter of video processing task.
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get Type parameter of video content audit task. 
     * @return AiContentReviewTask Type parameter of video content audit task.
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set Type parameter of video content audit task.
     * @param AiContentReviewTask Type parameter of video content audit task.
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
     * Get Type parameter of video content recognition task. 
     * @return AiRecognitionTask Type parameter of video content recognition task.
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set Type parameter of video content recognition task.
     * @param AiRecognitionTask Type parameter of video content recognition task.
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get Task flow priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used. 
     * @return TasksPriority Task flow priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task flow priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used.
     * @param TasksPriority Task flow priority. The higher the value, the higher the priority. Value range: -10–10. If this parameter is left empty, 0 will be used.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Notification mode for task flow status change. Valid values: Finish, Change, None. If this parameter is left empty, `Finish` will be used. 
     * @return TasksNotifyMode Notification mode for task flow status change. Valid values: Finish, Change, None. If this parameter is left empty, `Finish` will be used.
     */
    public String getTasksNotifyMode() {
        return this.TasksNotifyMode;
    }

    /**
     * Set Notification mode for task flow status change. Valid values: Finish, Change, None. If this parameter is left empty, `Finish` will be used.
     * @param TasksNotifyMode Notification mode for task flow status change. Valid values: Finish, Change, None. If this parameter is left empty, `Finish` will be used.
     */
    public void setTasksNotifyMode(String TasksNotifyMode) {
        this.TasksNotifyMode = TasksNotifyMode;
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
     * Get The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed. 
     * @return SessionId The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
     * @param SessionId The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Reserved field for special purposes. 
     * @return ExtInfo Reserved field for special purposes.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field for special purposes.
     * @param ExtInfo Reserved field for special purposes.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "TasksNotifyMode", this.TasksNotifyMode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

