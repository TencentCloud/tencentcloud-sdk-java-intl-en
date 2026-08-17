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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTask extends AbstractModel {

    /**
    * Media processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * Execution status and results of a Media Processing Service task.
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * Execution status and results of a video content review task.
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * Execution status and results of a video content analysis task.
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * Task execution status and results of the video content recognition task.
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
    * 
    */
    @SerializedName("AiQualityControlTaskResult")
    @Expose
    private ScheduleQualityControlTaskResult AiQualityControlTaskResult;

    /**
    * 
    */
    @SerializedName("SmartSubtitlesTaskResult")
    @Expose
    private SmartSubtitlesResult [] SmartSubtitlesTaskResult;

    /**
    * 
    */
    @SerializedName("SmartEraseTaskResult")
    @Expose
    private SmartEraseTaskResult SmartEraseTaskResult;

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
     * Get Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li> 
     * @return Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     * @param Status Task flow status. Valid values:
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned. 
     * @return ErrCode An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned.
     * @param ErrCode An error code other than 0 is returned in case of a source exception. Use the error code of the specific task when a value of 0 is returned.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task. 
     * @return Message The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task.
     * @param Message The corresponding exception message is returned in case of a source exception. If no source exception occurs, use the message of each specific task.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get  
     * @return InputInfo 
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 
     * @param InputInfo 
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
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
     * Get Execution status and results of a Media Processing Service task. 
     * @return MediaProcessResultSet Execution status and results of a Media Processing Service task.
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set Execution status and results of a Media Processing Service task.
     * @param MediaProcessResultSet Execution status and results of a Media Processing Service task.
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get Execution status and results of a video content review task. 
     * @return AiContentReviewResultSet Execution status and results of a video content review task.
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * Set Execution status and results of a video content review task.
     * @param AiContentReviewResultSet Execution status and results of a video content review task.
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * Get Execution status and results of a video content analysis task. 
     * @return AiAnalysisResultSet Execution status and results of a video content analysis task.
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * Set Execution status and results of a video content analysis task.
     * @param AiAnalysisResultSet Execution status and results of a video content analysis task.
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * Get Task execution status and results of the video content recognition task. 
     * @return AiRecognitionResultSet Task execution status and results of the video content recognition task.
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * Set Task execution status and results of the video content recognition task.
     * @param AiRecognitionResultSet Task execution status and results of the video content recognition task.
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    /**
     * Get  
     * @return AiQualityControlTaskResult 
     */
    public ScheduleQualityControlTaskResult getAiQualityControlTaskResult() {
        return this.AiQualityControlTaskResult;
    }

    /**
     * Set 
     * @param AiQualityControlTaskResult 
     */
    public void setAiQualityControlTaskResult(ScheduleQualityControlTaskResult AiQualityControlTaskResult) {
        this.AiQualityControlTaskResult = AiQualityControlTaskResult;
    }

    /**
     * Get  
     * @return SmartSubtitlesTaskResult 
     */
    public SmartSubtitlesResult [] getSmartSubtitlesTaskResult() {
        return this.SmartSubtitlesTaskResult;
    }

    /**
     * Set 
     * @param SmartSubtitlesTaskResult 
     */
    public void setSmartSubtitlesTaskResult(SmartSubtitlesResult [] SmartSubtitlesTaskResult) {
        this.SmartSubtitlesTaskResult = SmartSubtitlesTaskResult;
    }

    /**
     * Get  
     * @return SmartEraseTaskResult 
     */
    public SmartEraseTaskResult getSmartEraseTaskResult() {
        return this.SmartEraseTaskResult;
    }

    /**
     * Set 
     * @param SmartEraseTaskResult 
     */
    public void setSmartEraseTaskResult(SmartEraseTaskResult SmartEraseTaskResult) {
        this.SmartEraseTaskResult = SmartEraseTaskResult;
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
        if (source.SmartEraseTaskResult != null) {
            this.SmartEraseTaskResult = new SmartEraseTaskResult(source.SmartEraseTaskResult);
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
        this.setParamObj(map, prefix + "SmartEraseTaskResult.", this.SmartEraseTaskResult);

    }
}

