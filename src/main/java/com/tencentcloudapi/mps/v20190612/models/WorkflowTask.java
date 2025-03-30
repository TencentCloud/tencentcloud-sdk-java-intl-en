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

public class WorkflowTask extends AbstractModel {

    /**
    * The media processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * If the value returned is not 0, there was a source error. If 0 is returned, refer to the error codes of the corresponding task type.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Except those for source errors, error messages vary with task type.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * The information of the file processed.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * The execution status and result of the media processing task.
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * Execution status and result of a video content audit task.
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * Execution status and result of video content analysis task.
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * Execution status and result of a video content recognition task.
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
    * Execution status and results of a media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AiQualityControlTaskResult")
    @Expose
    private ScheduleQualityControlTaskResult AiQualityControlTaskResult;

    /**
    * Execution result of the smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SmartSubtitlesTaskResult")
    @Expose
    private SmartSubtitlesResult [] SmartSubtitlesTaskResult;

    /**
     * Get The media processing task ID. 
     * @return TaskId The media processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The media processing task ID.
     * @param TaskId The media processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li> 
     * @return Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     * @param Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: Completed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get If the value returned is not 0, there was a source error. If 0 is returned, refer to the error codes of the corresponding task type. 
     * @return ErrCode If the value returned is not 0, there was a source error. If 0 is returned, refer to the error codes of the corresponding task type.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set If the value returned is not 0, there was a source error. If 0 is returned, refer to the error codes of the corresponding task type.
     * @param ErrCode If the value returned is not 0, there was a source error. If 0 is returned, refer to the error codes of the corresponding task type.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Except those for source errors, error messages vary with task type. 
     * @return Message Except those for source errors, error messages vary with task type.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Except those for source errors, error messages vary with task type.
     * @param Message Except those for source errors, error messages vary with task type.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get The information of the file processed.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InputInfo The information of the file processed.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set The information of the file processed.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InputInfo The information of the file processed.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetaData Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetaData Metadata of a source video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get The execution status and result of the media processing task. 
     * @return MediaProcessResultSet The execution status and result of the media processing task.
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set The execution status and result of the media processing task.
     * @param MediaProcessResultSet The execution status and result of the media processing task.
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get Execution status and result of a video content audit task. 
     * @return AiContentReviewResultSet Execution status and result of a video content audit task.
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * Set Execution status and result of a video content audit task.
     * @param AiContentReviewResultSet Execution status and result of a video content audit task.
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * Get Execution status and result of video content analysis task. 
     * @return AiAnalysisResultSet Execution status and result of video content analysis task.
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * Set Execution status and result of video content analysis task.
     * @param AiAnalysisResultSet Execution status and result of video content analysis task.
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * Get Execution status and result of a video content recognition task. 
     * @return AiRecognitionResultSet Execution status and result of a video content recognition task.
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * Set Execution status and result of a video content recognition task.
     * @param AiRecognitionResultSet Execution status and result of a video content recognition task.
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    /**
     * Get Execution status and results of a media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AiQualityControlTaskResult Execution status and results of a media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduleQualityControlTaskResult getAiQualityControlTaskResult() {
        return this.AiQualityControlTaskResult;
    }

    /**
     * Set Execution status and results of a media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AiQualityControlTaskResult Execution status and results of a media quality inspection task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAiQualityControlTaskResult(ScheduleQualityControlTaskResult AiQualityControlTaskResult) {
        this.AiQualityControlTaskResult = AiQualityControlTaskResult;
    }

    /**
     * Get Execution result of the smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SmartSubtitlesTaskResult Execution result of the smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitlesResult [] getSmartSubtitlesTaskResult() {
        return this.SmartSubtitlesTaskResult;
    }

    /**
     * Set Execution result of the smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SmartSubtitlesTaskResult Execution result of the smart subtitle task.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSmartSubtitlesTaskResult(SmartSubtitlesResult [] SmartSubtitlesTaskResult) {
        this.SmartSubtitlesTaskResult = SmartSubtitlesTaskResult;
    }

    public WorkflowTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTask(WorkflowTask source) {
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
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
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
        if (source.AiQualityControlTaskResult != null) {
            this.AiQualityControlTaskResult = new ScheduleQualityControlTaskResult(source.AiQualityControlTaskResult);
        }
        if (source.SmartSubtitlesTaskResult != null) {
            this.SmartSubtitlesTaskResult = new SmartSubtitlesResult[source.SmartSubtitlesTaskResult.length];
            for (int i = 0; i < source.SmartSubtitlesTaskResult.length; i++) {
                this.SmartSubtitlesTaskResult[i] = new SmartSubtitlesResult(source.SmartSubtitlesTaskResult[i]);
            }
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
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "MediaProcessResultSet.", this.MediaProcessResultSet);
        this.setParamArrayObj(map, prefix + "AiContentReviewResultSet.", this.AiContentReviewResultSet);
        this.setParamArrayObj(map, prefix + "AiAnalysisResultSet.", this.AiAnalysisResultSet);
        this.setParamArrayObj(map, prefix + "AiRecognitionResultSet.", this.AiRecognitionResultSet);
        this.setParamObj(map, prefix + "AiQualityControlTaskResult.", this.AiQualityControlTaskResult);
        this.setParamArrayObj(map, prefix + "SmartSubtitlesTaskResult.", this.SmartSubtitlesTaskResult);

    }
}

