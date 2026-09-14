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

public class ProcessLiveStreamRequest extends AbstractModel {

    /**
    * <p>Live stream URL (must be a live streaming address, supporting rtmp, hls, flv, trtc, webrtc, srt, etc.).<br>The trtc address is as follows:<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> is the TRTC room number ID<br><code>&lt;sdkappid&gt;</code> is the TRTC SDK app ID<br><code>&lt;userid&gt;</code> is the user ID for the service to enter the room, which can distinguish who is the robot<br><code>&lt;usersig&gt;</code> is the TRTC user signature</p><p>webrtc supports LEB live streams. For address retrieval, please <a href="https://www.tencentcloud.com/document/product/267/32720?from_cn_redirect=1">refer</a></p><p>For srt supported addresses, please <a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">refer</a></p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private LiveStreamTaskNotifyConfig TaskNotifyConfig;

    /**
    * 
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * 
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 
    */
    @SerializedName("AiQualityControlTask")
    @Expose
    private AiQualityControlTaskInput AiQualityControlTask;

    /**
    * 
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private LiveSmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * 
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get <p>Live stream URL (must be a live streaming address, supporting rtmp, hls, flv, trtc, webrtc, srt, etc.).<br>The trtc address is as follows:<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> is the TRTC room number ID<br><code>&lt;sdkappid&gt;</code> is the TRTC SDK app ID<br><code>&lt;userid&gt;</code> is the user ID for the service to enter the room, which can distinguish who is the robot<br><code>&lt;usersig&gt;</code> is the TRTC user signature</p><p>webrtc supports LEB live streams. For address retrieval, please <a href="https://www.tencentcloud.com/document/product/267/32720?from_cn_redirect=1">refer</a></p><p>For srt supported addresses, please <a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">refer</a></p> 
     * @return Url <p>Live stream URL (must be a live streaming address, supporting rtmp, hls, flv, trtc, webrtc, srt, etc.).<br>The trtc address is as follows:<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> is the TRTC room number ID<br><code>&lt;sdkappid&gt;</code> is the TRTC SDK app ID<br><code>&lt;userid&gt;</code> is the user ID for the service to enter the room, which can distinguish who is the robot<br><code>&lt;usersig&gt;</code> is the TRTC user signature</p><p>webrtc supports LEB live streams. For address retrieval, please <a href="https://www.tencentcloud.com/document/product/267/32720?from_cn_redirect=1">refer</a></p><p>For srt supported addresses, please <a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">refer</a></p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Live stream URL (must be a live streaming address, supporting rtmp, hls, flv, trtc, webrtc, srt, etc.).<br>The trtc address is as follows:<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> is the TRTC room number ID<br><code>&lt;sdkappid&gt;</code> is the TRTC SDK app ID<br><code>&lt;userid&gt;</code> is the user ID for the service to enter the room, which can distinguish who is the robot<br><code>&lt;usersig&gt;</code> is the TRTC user signature</p><p>webrtc supports LEB live streams. For address retrieval, please <a href="https://www.tencentcloud.com/document/product/267/32720?from_cn_redirect=1">refer</a></p><p>For srt supported addresses, please <a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">refer</a></p>
     * @param Url <p>Live stream URL (must be a live streaming address, supporting rtmp, hls, flv, trtc, webrtc, srt, etc.).<br>The trtc address is as follows:<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> is the TRTC room number ID<br><code>&lt;sdkappid&gt;</code> is the TRTC SDK app ID<br><code>&lt;userid&gt;</code> is the user ID for the service to enter the room, which can distinguish who is the robot<br><code>&lt;usersig&gt;</code> is the TRTC user signature</p><p>webrtc supports LEB live streams. For address retrieval, please <a href="https://www.tencentcloud.com/document/product/267/32720?from_cn_redirect=1">refer</a></p><p>For srt supported addresses, please <a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">refer</a></p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return TaskNotifyConfig 
     */
    public LiveStreamTaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 
     * @param TaskNotifyConfig 
     */
    public void setTaskNotifyConfig(LiveStreamTaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get  
     * @return OutputStorage 
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 
     * @param OutputStorage 
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get  
     * @return OutputDir 
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 
     * @param OutputDir 
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get  
     * @return AiContentReviewTask 
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set 
     * @param AiContentReviewTask 
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get  
     * @return AiRecognitionTask 
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set 
     * @param AiRecognitionTask 
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get  
     * @return AiAnalysisTask 
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set 
     * @param AiAnalysisTask 
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get  
     * @return AiQualityControlTask 
     */
    public AiQualityControlTaskInput getAiQualityControlTask() {
        return this.AiQualityControlTask;
    }

    /**
     * Set 
     * @param AiQualityControlTask 
     */
    public void setAiQualityControlTask(AiQualityControlTaskInput AiQualityControlTask) {
        this.AiQualityControlTask = AiQualityControlTask;
    }

    /**
     * Get  
     * @return SmartSubtitlesTask 
     */
    public LiveSmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set 
     * @param SmartSubtitlesTask 
     */
    public void setSmartSubtitlesTask(LiveSmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
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
     * @return ScheduleId 
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set 
     * @param ScheduleId 
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get  
     * @return ResourceId 
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 
     * @param ResourceId 
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ProcessLiveStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessLiveStreamRequest(ProcessLiveStreamRequest source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new LiveStreamTaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.AiContentReviewTask != null) {
            this.AiContentReviewTask = new AiContentReviewTaskInput(source.AiContentReviewTask);
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new AiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.AiQualityControlTask != null) {
            this.AiQualityControlTask = new AiQualityControlTaskInput(source.AiQualityControlTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new LiveSmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiQualityControlTask.", this.AiQualityControlTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

