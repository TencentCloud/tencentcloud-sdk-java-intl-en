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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParseLiveStreamProcessNotificationResponse extends AbstractModel{

    /**
    * Result type of live stream processing. Valid values:
<li>AiReviewResult: Content audit result;</li>
<li>ProcessEof: Live stream processing has been completed.</li>
    */
    @SerializedName("NotificationType")
    @Expose
    private String NotificationType;

    /**
    * Video processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Information of a live stream processing error, which is valid when `NotificationType` is `ProcessEof`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessEofInfo")
    @Expose
    private LiveStreamProcessErrorInfo ProcessEofInfo;

    /**
    * Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AiReviewResultInfo")
    @Expose
    private LiveStreamAiReviewResultInfo AiReviewResultInfo;

    /**
    * Content recognition result, which is valid if `NotificationType` is `AiRecognitionResult`.
    */
    @SerializedName("AiRecognitionResultInfo")
    @Expose
    private LiveStreamAiRecognitionResultInfo AiRecognitionResultInfo;

    /**
    * The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The source context which is used to pass through the user request information. The task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Result type of live stream processing. Valid values:
<li>AiReviewResult: Content audit result;</li>
<li>ProcessEof: Live stream processing has been completed.</li> 
     * @return NotificationType Result type of live stream processing. Valid values:
<li>AiReviewResult: Content audit result;</li>
<li>ProcessEof: Live stream processing has been completed.</li>
     */
    public String getNotificationType() {
        return this.NotificationType;
    }

    /**
     * Set Result type of live stream processing. Valid values:
<li>AiReviewResult: Content audit result;</li>
<li>ProcessEof: Live stream processing has been completed.</li>
     * @param NotificationType Result type of live stream processing. Valid values:
<li>AiReviewResult: Content audit result;</li>
<li>ProcessEof: Live stream processing has been completed.</li>
     */
    public void setNotificationType(String NotificationType) {
        this.NotificationType = NotificationType;
    }

    /**
     * Get Video processing task ID. 
     * @return TaskId Video processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Video processing task ID.
     * @param TaskId Video processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Information of a live stream processing error, which is valid when `NotificationType` is `ProcessEof`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcessEofInfo Information of a live stream processing error, which is valid when `NotificationType` is `ProcessEof`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveStreamProcessErrorInfo getProcessEofInfo() {
        return this.ProcessEofInfo;
    }

    /**
     * Set Information of a live stream processing error, which is valid when `NotificationType` is `ProcessEof`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcessEofInfo Information of a live stream processing error, which is valid when `NotificationType` is `ProcessEof`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcessEofInfo(LiveStreamProcessErrorInfo ProcessEofInfo) {
        this.ProcessEofInfo = ProcessEofInfo;
    }

    /**
     * Get Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AiReviewResultInfo Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveStreamAiReviewResultInfo getAiReviewResultInfo() {
        return this.AiReviewResultInfo;
    }

    /**
     * Set Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AiReviewResultInfo Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAiReviewResultInfo(LiveStreamAiReviewResultInfo AiReviewResultInfo) {
        this.AiReviewResultInfo = AiReviewResultInfo;
    }

    /**
     * Get Content recognition result, which is valid if `NotificationType` is `AiRecognitionResult`. 
     * @return AiRecognitionResultInfo Content recognition result, which is valid if `NotificationType` is `AiRecognitionResult`.
     */
    public LiveStreamAiRecognitionResultInfo getAiRecognitionResultInfo() {
        return this.AiRecognitionResultInfo;
    }

    /**
     * Set Content recognition result, which is valid if `NotificationType` is `AiRecognitionResult`.
     * @param AiRecognitionResultInfo Content recognition result, which is valid if `NotificationType` is `AiRecognitionResult`.
     */
    public void setAiRecognitionResultInfo(LiveStreamAiRecognitionResultInfo AiRecognitionResultInfo) {
        this.AiRecognitionResultInfo = AiRecognitionResultInfo;
    }

    /**
     * Get The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed. 
     * @return SessionId The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
     * @param SessionId The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or an empty string is entered, no deduplication will be performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
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
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotificationType", this.NotificationType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "ProcessEofInfo.", this.ProcessEofInfo);
        this.setParamObj(map, prefix + "AiReviewResultInfo.", this.AiReviewResultInfo);
        this.setParamObj(map, prefix + "AiRecognitionResultInfo.", this.AiRecognitionResultInfo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

