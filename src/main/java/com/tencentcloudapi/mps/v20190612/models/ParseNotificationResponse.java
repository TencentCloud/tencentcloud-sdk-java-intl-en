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

public class ParseNotificationResponse extends AbstractModel {

    /**
    * The event type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>ScheduleTask (scheme)</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * The information of a video processing task. Information will be returned only if `EventType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowTaskEvent")
    @Expose
    private WorkflowTask WorkflowTaskEvent;

    /**
    * The information of a video editing task. Information will be returned only if `EventType` is `EditMediaTask`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EditMediaTaskEvent")
    @Expose
    private EditMediaTask EditMediaTaskEvent;

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
    * The information of a scheme. Information will be returned only if `EventType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduleTaskEvent")
    @Expose
    private ScheduleTask ScheduleTaskEvent;

    /**
    * - The expiration time (Unix timestamp) of the notification's signature.
- By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks.
- The format of this parameter is a decimal Unix timestamp, i.e., the number of seconds that have elapsed since 00:00 (UTC/GMT time) on January 1, 1970.

    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * The notification signature. Sign = MD5 (Timestamp + NotifyKey) MPS concatenates `Timestamp` and `NotifyKey` in `TaskNotifyConfig` and calculates a signature using the MD5 algorithm. This signature is included in the notification sent to your backend server. If the signature in the notification matches your own calculation result, it indicates that the notification is from MPS.
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The event type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>ScheduleTask (scheme)</li> 
     * @return EventType The event type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>ScheduleTask (scheme)</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set The event type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>ScheduleTask (scheme)</li>
     * @param EventType The event type. Valid values:
<li>WorkflowTask</li>
<li>EditMediaTask</li>
<li>ScheduleTask (scheme)</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get The information of a video processing task. Information will be returned only if `EventType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowTaskEvent The information of a video processing task. Information will be returned only if `EventType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkflowTask getWorkflowTaskEvent() {
        return this.WorkflowTaskEvent;
    }

    /**
     * Set The information of a video processing task. Information will be returned only if `EventType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowTaskEvent The information of a video processing task. Information will be returned only if `EventType` is `WorkflowTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowTaskEvent(WorkflowTask WorkflowTaskEvent) {
        this.WorkflowTaskEvent = WorkflowTaskEvent;
    }

    /**
     * Get The information of a video editing task. Information will be returned only if `EventType` is `EditMediaTask`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EditMediaTaskEvent The information of a video editing task. Information will be returned only if `EventType` is `EditMediaTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EditMediaTask getEditMediaTaskEvent() {
        return this.EditMediaTaskEvent;
    }

    /**
     * Set The information of a video editing task. Information will be returned only if `EventType` is `EditMediaTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EditMediaTaskEvent The information of a video editing task. Information will be returned only if `EventType` is `EditMediaTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEditMediaTaskEvent(EditMediaTask EditMediaTaskEvent) {
        this.EditMediaTaskEvent = EditMediaTaskEvent;
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
     * Get The information of a scheme. Information will be returned only if `EventType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduleTaskEvent The information of a scheme. Information will be returned only if `EventType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScheduleTask getScheduleTaskEvent() {
        return this.ScheduleTaskEvent;
    }

    /**
     * Set The information of a scheme. Information will be returned only if `EventType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduleTaskEvent The information of a scheme. Information will be returned only if `EventType` is `ScheduleTask`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduleTaskEvent(ScheduleTask ScheduleTaskEvent) {
        this.ScheduleTaskEvent = ScheduleTaskEvent;
    }

    /**
     * Get - The expiration time (Unix timestamp) of the notification's signature.
- By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks.
- The format of this parameter is a decimal Unix timestamp, i.e., the number of seconds that have elapsed since 00:00 (UTC/GMT time) on January 1, 1970.
 
     * @return Timestamp - The expiration time (Unix timestamp) of the notification's signature.
- By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks.
- The format of this parameter is a decimal Unix timestamp, i.e., the number of seconds that have elapsed since 00:00 (UTC/GMT time) on January 1, 1970.

     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set - The expiration time (Unix timestamp) of the notification's signature.
- By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks.
- The format of this parameter is a decimal Unix timestamp, i.e., the number of seconds that have elapsed since 00:00 (UTC/GMT time) on January 1, 1970.

     * @param Timestamp - The expiration time (Unix timestamp) of the notification's signature.
- By default, notifications sent by MPS expire after 10 minutes. If the expiration time specified has elapsed, a notification will be considered invalid. This can prevent replay attacks.
- The format of this parameter is a decimal Unix timestamp, i.e., the number of seconds that have elapsed since 00:00 (UTC/GMT time) on January 1, 1970.

     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get The notification signature. Sign = MD5 (Timestamp + NotifyKey) MPS concatenates `Timestamp` and `NotifyKey` in `TaskNotifyConfig` and calculates a signature using the MD5 algorithm. This signature is included in the notification sent to your backend server. If the signature in the notification matches your own calculation result, it indicates that the notification is from MPS. 
     * @return Sign The notification signature. Sign = MD5 (Timestamp + NotifyKey) MPS concatenates `Timestamp` and `NotifyKey` in `TaskNotifyConfig` and calculates a signature using the MD5 algorithm. This signature is included in the notification sent to your backend server. If the signature in the notification matches your own calculation result, it indicates that the notification is from MPS.
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set The notification signature. Sign = MD5 (Timestamp + NotifyKey) MPS concatenates `Timestamp` and `NotifyKey` in `TaskNotifyConfig` and calculates a signature using the MD5 algorithm. This signature is included in the notification sent to your backend server. If the signature in the notification matches your own calculation result, it indicates that the notification is from MPS.
     * @param Sign The notification signature. Sign = MD5 (Timestamp + NotifyKey) MPS concatenates `Timestamp` and `NotifyKey` in `TaskNotifyConfig` and calculates a signature using the MD5 algorithm. This signature is included in the notification sent to your backend server. If the signature in the notification matches your own calculation result, it indicates that the notification is from MPS.
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
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

    public ParseNotificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseNotificationResponse(ParseNotificationResponse source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.WorkflowTaskEvent != null) {
            this.WorkflowTaskEvent = new WorkflowTask(source.WorkflowTaskEvent);
        }
        if (source.EditMediaTaskEvent != null) {
            this.EditMediaTaskEvent = new EditMediaTask(source.EditMediaTaskEvent);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.ScheduleTaskEvent != null) {
            this.ScheduleTaskEvent = new ScheduleTask(source.ScheduleTaskEvent);
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
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "WorkflowTaskEvent.", this.WorkflowTaskEvent);
        this.setParamObj(map, prefix + "EditMediaTaskEvent.", this.EditMediaTaskEvent);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamObj(map, prefix + "ScheduleTaskEvent.", this.ScheduleTaskEvent);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

