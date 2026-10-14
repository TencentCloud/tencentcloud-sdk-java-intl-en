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
    * <p>Media processing task ID.</p>
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
    * <p>Returns a non-zero error code when a source error occurs. If 0 is returned, use the ErrCode of each specific task.</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>Returns the corresponding error Message when a source error occurs. Otherwise, use the Message of each specific task.</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Target file information of media processing.</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>Metadata of the original video.</p>
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * <p>Execution status and result of the media processing task.</p>
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * <p>Execution status and results of the video content review task.</p>
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * <p>Execution status and results of the video content analysis task.</p>
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * <p>Execution status and results of the video content recognition task.</p>
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
    * <p>Execution status and results of a media quality inspection task.</p>
    */
    @SerializedName("AiQualityControlTaskResult")
    @Expose
    private ScheduleQualityControlTaskResult AiQualityControlTaskResult;

    /**
    * <p>Execution result of the smart subtitle task</p>
    */
    @SerializedName("SmartSubtitlesTaskResult")
    @Expose
    private SmartSubtitlesResult [] SmartSubtitlesTaskResult;

    /**
    * <p>Outcome of the intelligent erasure task</p>
    */
    @SerializedName("SmartEraseTaskResult")
    @Expose
    private SmartEraseTaskResult SmartEraseTaskResult;

    /**
    * <p>Outcome of the AI dubbing task.</p>
    */
    @SerializedName("AiDubbingTaskResult")
    @Expose
    private AIDubbingTaskResult AiDubbingTaskResult;

    /**
     * Get <p>Media processing task ID.</p> 
     * @return TaskId <p>Media processing task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Media processing task ID.</p>
     * @param TaskId <p>Media processing task ID.</p>
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
     * Get <p>Returns a non-zero error code when a source error occurs. If 0 is returned, use the ErrCode of each specific task.</p> 
     * @return ErrCode <p>Returns a non-zero error code when a source error occurs. If 0 is returned, use the ErrCode of each specific task.</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>Returns a non-zero error code when a source error occurs. If 0 is returned, use the ErrCode of each specific task.</p>
     * @param ErrCode <p>Returns a non-zero error code when a source error occurs. If 0 is returned, use the ErrCode of each specific task.</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>Returns the corresponding error Message when a source error occurs. Otherwise, use the Message of each specific task.</p> 
     * @return Message <p>Returns the corresponding error Message when a source error occurs. Otherwise, use the Message of each specific task.</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>Returns the corresponding error Message when a source error occurs. Otherwise, use the Message of each specific task.</p>
     * @param Message <p>Returns the corresponding error Message when a source error occurs. Otherwise, use the Message of each specific task.</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Target file information of media processing.</p> 
     * @return InputInfo <p>Target file information of media processing.</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>Target file information of media processing.</p>
     * @param InputInfo <p>Target file information of media processing.</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>Metadata of the original video.</p> 
     * @return MetaData <p>Metadata of the original video.</p>
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>Metadata of the original video.</p>
     * @param MetaData <p>Metadata of the original video.</p>
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get <p>Execution status and result of the media processing task.</p> 
     * @return MediaProcessResultSet <p>Execution status and result of the media processing task.</p>
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set <p>Execution status and result of the media processing task.</p>
     * @param MediaProcessResultSet <p>Execution status and result of the media processing task.</p>
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get <p>Execution status and results of the video content review task.</p> 
     * @return AiContentReviewResultSet <p>Execution status and results of the video content review task.</p>
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * Set <p>Execution status and results of the video content review task.</p>
     * @param AiContentReviewResultSet <p>Execution status and results of the video content review task.</p>
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * Get <p>Execution status and results of the video content analysis task.</p> 
     * @return AiAnalysisResultSet <p>Execution status and results of the video content analysis task.</p>
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * Set <p>Execution status and results of the video content analysis task.</p>
     * @param AiAnalysisResultSet <p>Execution status and results of the video content analysis task.</p>
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * Get <p>Execution status and results of the video content recognition task.</p> 
     * @return AiRecognitionResultSet <p>Execution status and results of the video content recognition task.</p>
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * Set <p>Execution status and results of the video content recognition task.</p>
     * @param AiRecognitionResultSet <p>Execution status and results of the video content recognition task.</p>
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    /**
     * Get <p>Execution status and results of a media quality inspection task.</p> 
     * @return AiQualityControlTaskResult <p>Execution status and results of a media quality inspection task.</p>
     */
    public ScheduleQualityControlTaskResult getAiQualityControlTaskResult() {
        return this.AiQualityControlTaskResult;
    }

    /**
     * Set <p>Execution status and results of a media quality inspection task.</p>
     * @param AiQualityControlTaskResult <p>Execution status and results of a media quality inspection task.</p>
     */
    public void setAiQualityControlTaskResult(ScheduleQualityControlTaskResult AiQualityControlTaskResult) {
        this.AiQualityControlTaskResult = AiQualityControlTaskResult;
    }

    /**
     * Get <p>Execution result of the smart subtitle task</p> 
     * @return SmartSubtitlesTaskResult <p>Execution result of the smart subtitle task</p>
     */
    public SmartSubtitlesResult [] getSmartSubtitlesTaskResult() {
        return this.SmartSubtitlesTaskResult;
    }

    /**
     * Set <p>Execution result of the smart subtitle task</p>
     * @param SmartSubtitlesTaskResult <p>Execution result of the smart subtitle task</p>
     */
    public void setSmartSubtitlesTaskResult(SmartSubtitlesResult [] SmartSubtitlesTaskResult) {
        this.SmartSubtitlesTaskResult = SmartSubtitlesTaskResult;
    }

    /**
     * Get <p>Outcome of the intelligent erasure task</p> 
     * @return SmartEraseTaskResult <p>Outcome of the intelligent erasure task</p>
     */
    public SmartEraseTaskResult getSmartEraseTaskResult() {
        return this.SmartEraseTaskResult;
    }

    /**
     * Set <p>Outcome of the intelligent erasure task</p>
     * @param SmartEraseTaskResult <p>Outcome of the intelligent erasure task</p>
     */
    public void setSmartEraseTaskResult(SmartEraseTaskResult SmartEraseTaskResult) {
        this.SmartEraseTaskResult = SmartEraseTaskResult;
    }

    /**
     * Get <p>Outcome of the AI dubbing task.</p> 
     * @return AiDubbingTaskResult <p>Outcome of the AI dubbing task.</p>
     */
    public AIDubbingTaskResult getAiDubbingTaskResult() {
        return this.AiDubbingTaskResult;
    }

    /**
     * Set <p>Outcome of the AI dubbing task.</p>
     * @param AiDubbingTaskResult <p>Outcome of the AI dubbing task.</p>
     */
    public void setAiDubbingTaskResult(AIDubbingTaskResult AiDubbingTaskResult) {
        this.AiDubbingTaskResult = AiDubbingTaskResult;
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
        if (source.AiDubbingTaskResult != null) {
            this.AiDubbingTaskResult = new AIDubbingTaskResult(source.AiDubbingTaskResult);
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
        this.setParamObj(map, prefix + "AiDubbingTaskResult.", this.AiDubbingTaskResult);

    }
}

