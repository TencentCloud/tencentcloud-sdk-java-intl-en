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

public class ParseLiveStreamProcessNotificationResponse extends AbstractModel {

    /**
    * Live stream processing result type, including:
<li>AiReviewResult: content auditing result.</li>
<li>AiRecognitionResult: content recognition result.</li>
<li>LiveRecordResult: live recording result.</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>ProcessEof: live stream processing result.</li>
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
Note: when this field return null, means no valid values can be obtained.
    */
    @SerializedName("ProcessEofInfo")
    @Expose
    private LiveStreamProcessErrorInfo ProcessEofInfo;

    /**
    * Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: when this field return null, means no valid values can be obtained.
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
    * Content analysis result, which is valid if `NotificationType` is `AiAnalysisResult`.
    */
    @SerializedName("AiAnalysisResultInfo")
    @Expose
    private LiveStreamAiAnalysisResultInfo AiAnalysisResultInfo;

    /**
    * Media quality inspection result, which is valid if `NotificationType` is `AiQualityControlResult`.
    */
    @SerializedName("AiQualityControlResultInfo")
    @Expose
    private LiveStreamAiQualityControlResultInfo AiQualityControlResultInfo;

    /**
    * Live recording result is valid when NotificationType is LiveRecordResult.
Note: when this field return null, means no valid values can be obtained.
    */
    @SerializedName("LiveRecordResultInfo")
    @Expose
    private LiveStreamRecordResultInfo LiveRecordResultInfo;

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
    * - Expiration time, event notification signature expiration UNIX timestamp. - By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks. - The format of Timestamp is a decimal UNIX timestamp, which is the number of seconds that have elapsed since January 1, 1970 (midnight UTC/GMT).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Live stream processing result type, including:
<li>AiReviewResult: content auditing result.</li>
<li>AiRecognitionResult: content recognition result.</li>
<li>LiveRecordResult: live recording result.</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>ProcessEof: live stream processing result.</li> 
     * @return NotificationType Live stream processing result type, including:
<li>AiReviewResult: content auditing result.</li>
<li>AiRecognitionResult: content recognition result.</li>
<li>LiveRecordResult: live recording result.</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>ProcessEof: live stream processing result.</li>
     */
    public String getNotificationType() {
        return this.NotificationType;
    }

    /**
     * Set Live stream processing result type, including:
<li>AiReviewResult: content auditing result.</li>
<li>AiRecognitionResult: content recognition result.</li>
<li>LiveRecordResult: live recording result.</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>ProcessEof: live stream processing result.</li>
     * @param NotificationType Live stream processing result type, including:
<li>AiReviewResult: content auditing result.</li>
<li>AiRecognitionResult: content recognition result.</li>
<li>LiveRecordResult: live recording result.</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>ProcessEof: live stream processing result.</li>
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
Note: when this field return null, means no valid values can be obtained. 
     * @return ProcessEofInfo Information of a live stream processing error, which is valid when `NotificationType` is `ProcessEof`.
Note: when this field return null, means no valid values can be obtained.
     */
    public LiveStreamProcessErrorInfo getProcessEofInfo() {
        return this.ProcessEofInfo;
    }

    /**
     * Set Information of a live stream processing error, which is valid when `NotificationType` is `ProcessEof`.
Note: when this field return null, means no valid values can be obtained.
     * @param ProcessEofInfo Information of a live stream processing error, which is valid when `NotificationType` is `ProcessEof`.
Note: when this field return null, means no valid values can be obtained.
     */
    public void setProcessEofInfo(LiveStreamProcessErrorInfo ProcessEofInfo) {
        this.ProcessEofInfo = ProcessEofInfo;
    }

    /**
     * Get Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: when this field return null, means no valid values can be obtained. 
     * @return AiReviewResultInfo Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: when this field return null, means no valid values can be obtained.
     */
    public LiveStreamAiReviewResultInfo getAiReviewResultInfo() {
        return this.AiReviewResultInfo;
    }

    /**
     * Set Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: when this field return null, means no valid values can be obtained.
     * @param AiReviewResultInfo Content audit result, which is valid when `NotificationType` is `AiReviewResult`.
Note: when this field return null, means no valid values can be obtained.
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
     * Get Content analysis result, which is valid if `NotificationType` is `AiAnalysisResult`. 
     * @return AiAnalysisResultInfo Content analysis result, which is valid if `NotificationType` is `AiAnalysisResult`.
     */
    public LiveStreamAiAnalysisResultInfo getAiAnalysisResultInfo() {
        return this.AiAnalysisResultInfo;
    }

    /**
     * Set Content analysis result, which is valid if `NotificationType` is `AiAnalysisResult`.
     * @param AiAnalysisResultInfo Content analysis result, which is valid if `NotificationType` is `AiAnalysisResult`.
     */
    public void setAiAnalysisResultInfo(LiveStreamAiAnalysisResultInfo AiAnalysisResultInfo) {
        this.AiAnalysisResultInfo = AiAnalysisResultInfo;
    }

    /**
     * Get Media quality inspection result, which is valid if `NotificationType` is `AiQualityControlResult`. 
     * @return AiQualityControlResultInfo Media quality inspection result, which is valid if `NotificationType` is `AiQualityControlResult`.
     */
    public LiveStreamAiQualityControlResultInfo getAiQualityControlResultInfo() {
        return this.AiQualityControlResultInfo;
    }

    /**
     * Set Media quality inspection result, which is valid if `NotificationType` is `AiQualityControlResult`.
     * @param AiQualityControlResultInfo Media quality inspection result, which is valid if `NotificationType` is `AiQualityControlResult`.
     */
    public void setAiQualityControlResultInfo(LiveStreamAiQualityControlResultInfo AiQualityControlResultInfo) {
        this.AiQualityControlResultInfo = AiQualityControlResultInfo;
    }

    /**
     * Get Live recording result is valid when NotificationType is LiveRecordResult.
Note: when this field return null, means no valid values can be obtained. 
     * @return LiveRecordResultInfo Live recording result is valid when NotificationType is LiveRecordResult.
Note: when this field return null, means no valid values can be obtained.
     */
    public LiveStreamRecordResultInfo getLiveRecordResultInfo() {
        return this.LiveRecordResultInfo;
    }

    /**
     * Set Live recording result is valid when NotificationType is LiveRecordResult.
Note: when this field return null, means no valid values can be obtained.
     * @param LiveRecordResultInfo Live recording result is valid when NotificationType is LiveRecordResult.
Note: when this field return null, means no valid values can be obtained.
     */
    public void setLiveRecordResultInfo(LiveStreamRecordResultInfo LiveRecordResultInfo) {
        this.LiveRecordResultInfo = LiveRecordResultInfo;
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
     * Get - Expiration time, event notification signature expiration UNIX timestamp. - By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks. - The format of Timestamp is a decimal UNIX timestamp, which is the number of seconds that have elapsed since January 1, 1970 (midnight UTC/GMT).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Timestamp - Expiration time, event notification signature expiration UNIX timestamp. - By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks. - The format of Timestamp is a decimal UNIX timestamp, which is the number of seconds that have elapsed since January 1, 1970 (midnight UTC/GMT).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set - Expiration time, event notification signature expiration UNIX timestamp. - By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks. - The format of Timestamp is a decimal UNIX timestamp, which is the number of seconds that have elapsed since January 1, 1970 (midnight UTC/GMT).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Timestamp - Expiration time, event notification signature expiration UNIX timestamp. - By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks. - The format of Timestamp is a decimal UNIX timestamp, which is the number of seconds that have elapsed since January 1, 1970 (midnight UTC/GMT).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Sign Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.

Note: This field may return null, indicating that no valid value can be obtained.
     * @param Sign Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ParseLiveStreamProcessNotificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseLiveStreamProcessNotificationResponse(ParseLiveStreamProcessNotificationResponse source) {
        if (source.NotificationType != null) {
            this.NotificationType = new String(source.NotificationType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProcessEofInfo != null) {
            this.ProcessEofInfo = new LiveStreamProcessErrorInfo(source.ProcessEofInfo);
        }
        if (source.AiReviewResultInfo != null) {
            this.AiReviewResultInfo = new LiveStreamAiReviewResultInfo(source.AiReviewResultInfo);
        }
        if (source.AiRecognitionResultInfo != null) {
            this.AiRecognitionResultInfo = new LiveStreamAiRecognitionResultInfo(source.AiRecognitionResultInfo);
        }
        if (source.AiAnalysisResultInfo != null) {
            this.AiAnalysisResultInfo = new LiveStreamAiAnalysisResultInfo(source.AiAnalysisResultInfo);
        }
        if (source.AiQualityControlResultInfo != null) {
            this.AiQualityControlResultInfo = new LiveStreamAiQualityControlResultInfo(source.AiQualityControlResultInfo);
        }
        if (source.LiveRecordResultInfo != null) {
            this.LiveRecordResultInfo = new LiveStreamRecordResultInfo(source.LiveRecordResultInfo);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamObj(map, prefix + "AiAnalysisResultInfo.", this.AiAnalysisResultInfo);
        this.setParamObj(map, prefix + "AiQualityControlResultInfo.", this.AiQualityControlResultInfo);
        this.setParamObj(map, prefix + "LiveRecordResultInfo.", this.LiveRecordResultInfo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

