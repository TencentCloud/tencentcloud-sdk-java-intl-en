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
<li>AiReviewResult: content moderation result;</li>
<li>AiRecognitionResult: content recognition result;</li>
<li>LiveRecordResult: live streaming result;</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>AiAnalysisResult: content analysis result.</li>
<li>AiSmartSubtitleResult: smart subtitle result;</li>
<li>ProcessEof: end of live stream processing.</li>
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
    * Error information of live stream processing. Valid when NotificationType is ProcessEof.
    */
    @SerializedName("ProcessEofInfo")
    @Expose
    private LiveStreamProcessErrorInfo ProcessEofInfo;

    /**
    * Content moderation result. Valid when NotificationType is AiReviewResult.
    */
    @SerializedName("AiReviewResultInfo")
    @Expose
    private LiveStreamAiReviewResultInfo AiReviewResultInfo;

    /**
    * Content recognition result. Valid when NotificationType is AiRecognitionResult.
    */
    @SerializedName("AiRecognitionResultInfo")
    @Expose
    private LiveStreamAiRecognitionResultInfo AiRecognitionResultInfo;

    /**
    * Content analysis result. Valid when NotificationType is AiAnalysisResult.
    */
    @SerializedName("AiAnalysisResultInfo")
    @Expose
    private LiveStreamAiAnalysisResultInfo AiAnalysisResultInfo;

    /**
    * Media quality inspection result. Valid when NotificationType is AiQualityControlResult.
    */
    @SerializedName("AiQualityControlResultInfo")
    @Expose
    private LiveStreamAiQualityControlResultInfo AiQualityControlResultInfo;

    /**
    * Live streaming result is valid when NotificationType is LiveRecordResult.
    */
    @SerializedName("LiveRecordResultInfo")
    @Expose
    private LiveStreamRecordResultInfo LiveRecordResultInfo;

    /**
    * Smart subtitle result. Valid when NotificationType is AiSmartSubtitleResult.
    */
    @SerializedName("AiSmartSubtitleResultInfo")
    @Expose
    private LiveStreamAiSmartSubtitleResultInfo AiSmartSubtitleResultInfo;

    /**
    * An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, which is used to pass through user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * - Expiration time: the UNIX Timestamp when the event notification signature expires. - Message notifications from media processing expire after 10 minutes by default. If the time specified by the Timestamp value in a message notification has expired, the notification is deemed invalid, which prevents network replay attacks. - Timestamp is in decimal UNIX Timestamp format, which is the seconds elapsed since January 1, 1970 (UTC/GMT midnight).
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.
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
<li>AiReviewResult: content moderation result;</li>
<li>AiRecognitionResult: content recognition result;</li>
<li>LiveRecordResult: live streaming result;</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>AiAnalysisResult: content analysis result.</li>
<li>AiSmartSubtitleResult: smart subtitle result;</li>
<li>ProcessEof: end of live stream processing.</li> 
     * @return NotificationType Live stream processing result type, including:
<li>AiReviewResult: content moderation result;</li>
<li>AiRecognitionResult: content recognition result;</li>
<li>LiveRecordResult: live streaming result;</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>AiAnalysisResult: content analysis result.</li>
<li>AiSmartSubtitleResult: smart subtitle result;</li>
<li>ProcessEof: end of live stream processing.</li>
     */
    public String getNotificationType() {
        return this.NotificationType;
    }

    /**
     * Set Live stream processing result type, including:
<li>AiReviewResult: content moderation result;</li>
<li>AiRecognitionResult: content recognition result;</li>
<li>LiveRecordResult: live streaming result;</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>AiAnalysisResult: content analysis result.</li>
<li>AiSmartSubtitleResult: smart subtitle result;</li>
<li>ProcessEof: end of live stream processing.</li>
     * @param NotificationType Live stream processing result type, including:
<li>AiReviewResult: content moderation result;</li>
<li>AiRecognitionResult: content recognition result;</li>
<li>LiveRecordResult: live streaming result;</li>
<li>AiQualityControlResult: media quality inspection result.</li>
<li>AiAnalysisResult: content analysis result.</li>
<li>AiSmartSubtitleResult: smart subtitle result;</li>
<li>ProcessEof: end of live stream processing.</li>
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
     * Get Error information of live stream processing. Valid when NotificationType is ProcessEof. 
     * @return ProcessEofInfo Error information of live stream processing. Valid when NotificationType is ProcessEof.
     */
    public LiveStreamProcessErrorInfo getProcessEofInfo() {
        return this.ProcessEofInfo;
    }

    /**
     * Set Error information of live stream processing. Valid when NotificationType is ProcessEof.
     * @param ProcessEofInfo Error information of live stream processing. Valid when NotificationType is ProcessEof.
     */
    public void setProcessEofInfo(LiveStreamProcessErrorInfo ProcessEofInfo) {
        this.ProcessEofInfo = ProcessEofInfo;
    }

    /**
     * Get Content moderation result. Valid when NotificationType is AiReviewResult. 
     * @return AiReviewResultInfo Content moderation result. Valid when NotificationType is AiReviewResult.
     */
    public LiveStreamAiReviewResultInfo getAiReviewResultInfo() {
        return this.AiReviewResultInfo;
    }

    /**
     * Set Content moderation result. Valid when NotificationType is AiReviewResult.
     * @param AiReviewResultInfo Content moderation result. Valid when NotificationType is AiReviewResult.
     */
    public void setAiReviewResultInfo(LiveStreamAiReviewResultInfo AiReviewResultInfo) {
        this.AiReviewResultInfo = AiReviewResultInfo;
    }

    /**
     * Get Content recognition result. Valid when NotificationType is AiRecognitionResult. 
     * @return AiRecognitionResultInfo Content recognition result. Valid when NotificationType is AiRecognitionResult.
     */
    public LiveStreamAiRecognitionResultInfo getAiRecognitionResultInfo() {
        return this.AiRecognitionResultInfo;
    }

    /**
     * Set Content recognition result. Valid when NotificationType is AiRecognitionResult.
     * @param AiRecognitionResultInfo Content recognition result. Valid when NotificationType is AiRecognitionResult.
     */
    public void setAiRecognitionResultInfo(LiveStreamAiRecognitionResultInfo AiRecognitionResultInfo) {
        this.AiRecognitionResultInfo = AiRecognitionResultInfo;
    }

    /**
     * Get Content analysis result. Valid when NotificationType is AiAnalysisResult. 
     * @return AiAnalysisResultInfo Content analysis result. Valid when NotificationType is AiAnalysisResult.
     */
    public LiveStreamAiAnalysisResultInfo getAiAnalysisResultInfo() {
        return this.AiAnalysisResultInfo;
    }

    /**
     * Set Content analysis result. Valid when NotificationType is AiAnalysisResult.
     * @param AiAnalysisResultInfo Content analysis result. Valid when NotificationType is AiAnalysisResult.
     */
    public void setAiAnalysisResultInfo(LiveStreamAiAnalysisResultInfo AiAnalysisResultInfo) {
        this.AiAnalysisResultInfo = AiAnalysisResultInfo;
    }

    /**
     * Get Media quality inspection result. Valid when NotificationType is AiQualityControlResult. 
     * @return AiQualityControlResultInfo Media quality inspection result. Valid when NotificationType is AiQualityControlResult.
     */
    public LiveStreamAiQualityControlResultInfo getAiQualityControlResultInfo() {
        return this.AiQualityControlResultInfo;
    }

    /**
     * Set Media quality inspection result. Valid when NotificationType is AiQualityControlResult.
     * @param AiQualityControlResultInfo Media quality inspection result. Valid when NotificationType is AiQualityControlResult.
     */
    public void setAiQualityControlResultInfo(LiveStreamAiQualityControlResultInfo AiQualityControlResultInfo) {
        this.AiQualityControlResultInfo = AiQualityControlResultInfo;
    }

    /**
     * Get Live streaming result is valid when NotificationType is LiveRecordResult. 
     * @return LiveRecordResultInfo Live streaming result is valid when NotificationType is LiveRecordResult.
     */
    public LiveStreamRecordResultInfo getLiveRecordResultInfo() {
        return this.LiveRecordResultInfo;
    }

    /**
     * Set Live streaming result is valid when NotificationType is LiveRecordResult.
     * @param LiveRecordResultInfo Live streaming result is valid when NotificationType is LiveRecordResult.
     */
    public void setLiveRecordResultInfo(LiveStreamRecordResultInfo LiveRecordResultInfo) {
        this.LiveRecordResultInfo = LiveRecordResultInfo;
    }

    /**
     * Get Smart subtitle result. Valid when NotificationType is AiSmartSubtitleResult. 
     * @return AiSmartSubtitleResultInfo Smart subtitle result. Valid when NotificationType is AiSmartSubtitleResult.
     */
    public LiveStreamAiSmartSubtitleResultInfo getAiSmartSubtitleResultInfo() {
        return this.AiSmartSubtitleResultInfo;
    }

    /**
     * Set Smart subtitle result. Valid when NotificationType is AiSmartSubtitleResult.
     * @param AiSmartSubtitleResultInfo Smart subtitle result. Valid when NotificationType is AiSmartSubtitleResult.
     */
    public void setAiSmartSubtitleResultInfo(LiveStreamAiSmartSubtitleResultInfo AiSmartSubtitleResultInfo) {
        this.AiSmartSubtitleResultInfo = AiSmartSubtitleResultInfo;
    }

    /**
     * Get An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required. 
     * @return SessionId An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     * @param SessionId An identifier for deduplication. If there has been a request with the same identifier within the past seven days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, which is used to pass through user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters. 
     * @return SessionContext Source context, which is used to pass through user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, which is used to pass through user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     * @param SessionContext Source context, which is used to pass through user request information. The callback for task flow status changes will return the value of this field. The maximum length is 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get - Expiration time: the UNIX Timestamp when the event notification signature expires. - Message notifications from media processing expire after 10 minutes by default. If the time specified by the Timestamp value in a message notification has expired, the notification is deemed invalid, which prevents network replay attacks. - Timestamp is in decimal UNIX Timestamp format, which is the seconds elapsed since January 1, 1970 (UTC/GMT midnight). 
     * @return Timestamp - Expiration time: the UNIX Timestamp when the event notification signature expires. - Message notifications from media processing expire after 10 minutes by default. If the time specified by the Timestamp value in a message notification has expired, the notification is deemed invalid, which prevents network replay attacks. - Timestamp is in decimal UNIX Timestamp format, which is the seconds elapsed since January 1, 1970 (UTC/GMT midnight).
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set - Expiration time: the UNIX Timestamp when the event notification signature expires. - Message notifications from media processing expire after 10 minutes by default. If the time specified by the Timestamp value in a message notification has expired, the notification is deemed invalid, which prevents network replay attacks. - Timestamp is in decimal UNIX Timestamp format, which is the seconds elapsed since January 1, 1970 (UTC/GMT midnight).
     * @param Timestamp - Expiration time: the UNIX Timestamp when the event notification signature expires. - Message notifications from media processing expire after 10 minutes by default. If the time specified by the Timestamp value in a message notification has expired, the notification is deemed invalid, which prevents network replay attacks. - Timestamp is in decimal UNIX Timestamp format, which is the seconds elapsed since January 1, 1970 (UTC/GMT midnight).
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend. 
     * @return Sign Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.
     * @param Sign Event notification security signature. Sign = MD5 (Timestamp + NotifyKey). Note: Media Processing Service concatenates Timestamp and NotifyKey from TaskNotifyConfig as a string and calculates the Sign value through MD5. This value is included in the notification message. Your backend server can verify whether the Sign is correct using the same algorithm, to confirm whether the message is indeed from the Media Processing Service backend.
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
        if (source.AiSmartSubtitleResultInfo != null) {
            this.AiSmartSubtitleResultInfo = new LiveStreamAiSmartSubtitleResultInfo(source.AiSmartSubtitleResultInfo);
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
        this.setParamObj(map, prefix + "AiSmartSubtitleResultInfo.", this.AiSmartSubtitleResultInfo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

