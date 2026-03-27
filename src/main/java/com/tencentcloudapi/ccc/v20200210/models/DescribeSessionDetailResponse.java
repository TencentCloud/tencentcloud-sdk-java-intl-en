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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionDetailResponse extends AbstractModel {

    /**
    * <P>Calling number</p>.
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * <P>Called number</p>.
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * <P>Call type 1 outgoing call 2 incoming call 3 audio dial-in 5 predictive outbound call 6 extension call</p>.
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * <p>Start timestamp, Unix second-level timestamp</p>.
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * <p>Ring timestamp, UNIX second-level timestamp</p>.
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * <p>Answer timestamp, UNIX second-level timestamp</p>.
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * <p>End timestamp, UNIX second-level timestamp</p>.
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * <p>Queue entry time, Unix second-level timestamp</p>.
    */
    @SerializedName("QueuedTimestamp")
    @Expose
    private Long QueuedTimestamp;

    /**
    * <P>Agent account</p>.
    */
    @SerializedName("StaffUserId")
    @Expose
    private String StaffUserId;

    /**
    * <p>Refer to the EndStatus field in the DescribeTelCdr api.</p>.
    */
    @SerializedName("EndStatus")
    @Expose
    private Long EndStatus;

    /**
    * <p>Queue skill group ID</p>.
    */
    @SerializedName("QueuedSkillGroupId")
    @Expose
    private Long QueuedSkillGroupId;

    /**
    * <P>Queue skill group name</p>.
    */
    @SerializedName("QueuedSkillGroupName")
    @Expose
    private String QueuedSkillGroupName;

    /**
    * <P>The recording link comes with authentication and a valid period. after obtaining it, please retrieve the content within 24 hours. do not persist this link. if the link has expired, call this api again to get a new link.</p>.
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * <p>Recording transfer to external COS link</p>.
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
    * <P>Text information link of the voice recording, with authentication and valid period. please retrieve it within 24 hr after obtaining. do not persist this link. if the link has expired, call this api again to get a new link.</p>.
    */
    @SerializedName("AsrURL")
    @Expose
    private String AsrURL;

    /**
    * <P>Voicemail recording link</p>.
    */
    @SerializedName("VoicemailRecordURL")
    @Expose
    private String [] VoicemailRecordURL;

    /**
    * <P>Voicemail voice recording text information link. you need to purchase an offline speech recognition package through the console and enable the offline speech recognition switch.</p>.
    */
    @SerializedName("VoicemailAsrURL")
    @Expose
    private String [] VoicemailAsrURL;

    /**
    * <P>IVR key information</p>.
    */
    @SerializedName("IVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] IVRKeyPressed;

    /**
    * <P>Key information of satisfaction rate</p>.
    */
    @SerializedName("PostIVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressed;

    /**
    * <P>Hang-Up side seat agent user system</p>.
    */
    @SerializedName("HungUpSide")
    @Expose
    private String HungUpSide;

    /**
    * <p>Customer custom data (User-to-User Interface)</p>.
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * <P>Event list for calls in progress</p>.
    */
    @SerializedName("Events")
    @Expose
    private SessionEvent [] Events;

    /**
    * <P>Service participant list</p>.
    */
    @SerializedName("ServeParticipants")
    @Expose
    private ServeParticipant [] ServeParticipants;

    /**
    * <P>Status code for reason of system hang-up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>.
    */
    @SerializedName("SysHangupReason")
    @Expose
    private Long SysHangupReason;

    /**
    * <P>Reason for system hang up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>.
    */
    @SerializedName("SysHangupReasonString")
    @Expose
    private String SysHangupReasonString;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <P>Calling number</p>. 
     * @return Caller <P>Calling number</p>.
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set <P>Calling number</p>.
     * @param Caller <P>Calling number</p>.
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get <P>Called number</p>. 
     * @return Callee <P>Called number</p>.
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set <P>Called number</p>.
     * @param Callee <P>Called number</p>.
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get <P>Call type 1 outgoing call 2 incoming call 3 audio dial-in 5 predictive outbound call 6 extension call</p>. 
     * @return CallType <P>Call type 1 outgoing call 2 incoming call 3 audio dial-in 5 predictive outbound call 6 extension call</p>.
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set <P>Call type 1 outgoing call 2 incoming call 3 audio dial-in 5 predictive outbound call 6 extension call</p>.
     * @param CallType <P>Call type 1 outgoing call 2 incoming call 3 audio dial-in 5 predictive outbound call 6 extension call</p>.
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get <p>Start timestamp, Unix second-level timestamp</p>. 
     * @return StartTimeStamp <p>Start timestamp, Unix second-level timestamp</p>.
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set <p>Start timestamp, Unix second-level timestamp</p>.
     * @param StartTimeStamp <p>Start timestamp, Unix second-level timestamp</p>.
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get <p>Ring timestamp, UNIX second-level timestamp</p>. 
     * @return RingTimestamp <p>Ring timestamp, UNIX second-level timestamp</p>.
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set <p>Ring timestamp, UNIX second-level timestamp</p>.
     * @param RingTimestamp <p>Ring timestamp, UNIX second-level timestamp</p>.
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get <p>Answer timestamp, UNIX second-level timestamp</p>. 
     * @return AcceptTimestamp <p>Answer timestamp, UNIX second-level timestamp</p>.
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set <p>Answer timestamp, UNIX second-level timestamp</p>.
     * @param AcceptTimestamp <p>Answer timestamp, UNIX second-level timestamp</p>.
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get <p>End timestamp, UNIX second-level timestamp</p>. 
     * @return EndedTimestamp <p>End timestamp, UNIX second-level timestamp</p>.
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set <p>End timestamp, UNIX second-level timestamp</p>.
     * @param EndedTimestamp <p>End timestamp, UNIX second-level timestamp</p>.
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get <p>Queue entry time, Unix second-level timestamp</p>. 
     * @return QueuedTimestamp <p>Queue entry time, Unix second-level timestamp</p>.
     */
    public Long getQueuedTimestamp() {
        return this.QueuedTimestamp;
    }

    /**
     * Set <p>Queue entry time, Unix second-level timestamp</p>.
     * @param QueuedTimestamp <p>Queue entry time, Unix second-level timestamp</p>.
     */
    public void setQueuedTimestamp(Long QueuedTimestamp) {
        this.QueuedTimestamp = QueuedTimestamp;
    }

    /**
     * Get <P>Agent account</p>. 
     * @return StaffUserId <P>Agent account</p>.
     */
    public String getStaffUserId() {
        return this.StaffUserId;
    }

    /**
     * Set <P>Agent account</p>.
     * @param StaffUserId <P>Agent account</p>.
     */
    public void setStaffUserId(String StaffUserId) {
        this.StaffUserId = StaffUserId;
    }

    /**
     * Get <p>Refer to the EndStatus field in the DescribeTelCdr api.</p>. 
     * @return EndStatus <p>Refer to the EndStatus field in the DescribeTelCdr api.</p>.
     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set <p>Refer to the EndStatus field in the DescribeTelCdr api.</p>.
     * @param EndStatus <p>Refer to the EndStatus field in the DescribeTelCdr api.</p>.
     */
    public void setEndStatus(Long EndStatus) {
        this.EndStatus = EndStatus;
    }

    /**
     * Get <p>Queue skill group ID</p>. 
     * @return QueuedSkillGroupId <p>Queue skill group ID</p>.
     */
    public Long getQueuedSkillGroupId() {
        return this.QueuedSkillGroupId;
    }

    /**
     * Set <p>Queue skill group ID</p>.
     * @param QueuedSkillGroupId <p>Queue skill group ID</p>.
     */
    public void setQueuedSkillGroupId(Long QueuedSkillGroupId) {
        this.QueuedSkillGroupId = QueuedSkillGroupId;
    }

    /**
     * Get <P>Queue skill group name</p>. 
     * @return QueuedSkillGroupName <P>Queue skill group name</p>.
     */
    public String getQueuedSkillGroupName() {
        return this.QueuedSkillGroupName;
    }

    /**
     * Set <P>Queue skill group name</p>.
     * @param QueuedSkillGroupName <P>Queue skill group name</p>.
     */
    public void setQueuedSkillGroupName(String QueuedSkillGroupName) {
        this.QueuedSkillGroupName = QueuedSkillGroupName;
    }

    /**
     * Get <P>The recording link comes with authentication and a valid period. after obtaining it, please retrieve the content within 24 hours. do not persist this link. if the link has expired, call this api again to get a new link.</p>. 
     * @return RecordURL <P>The recording link comes with authentication and a valid period. after obtaining it, please retrieve the content within 24 hours. do not persist this link. if the link has expired, call this api again to get a new link.</p>.
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set <P>The recording link comes with authentication and a valid period. after obtaining it, please retrieve the content within 24 hours. do not persist this link. if the link has expired, call this api again to get a new link.</p>.
     * @param RecordURL <P>The recording link comes with authentication and a valid period. after obtaining it, please retrieve the content within 24 hours. do not persist this link. if the link has expired, call this api again to get a new link.</p>.
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get <p>Recording transfer to external COS link</p>. 
     * @return CustomRecordURL <p>Recording transfer to external COS link</p>.
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set <p>Recording transfer to external COS link</p>.
     * @param CustomRecordURL <p>Recording transfer to external COS link</p>.
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    /**
     * Get <P>Text information link of the voice recording, with authentication and valid period. please retrieve it within 24 hr after obtaining. do not persist this link. if the link has expired, call this api again to get a new link.</p>. 
     * @return AsrURL <P>Text information link of the voice recording, with authentication and valid period. please retrieve it within 24 hr after obtaining. do not persist this link. if the link has expired, call this api again to get a new link.</p>.
     */
    public String getAsrURL() {
        return this.AsrURL;
    }

    /**
     * Set <P>Text information link of the voice recording, with authentication and valid period. please retrieve it within 24 hr after obtaining. do not persist this link. if the link has expired, call this api again to get a new link.</p>.
     * @param AsrURL <P>Text information link of the voice recording, with authentication and valid period. please retrieve it within 24 hr after obtaining. do not persist this link. if the link has expired, call this api again to get a new link.</p>.
     */
    public void setAsrURL(String AsrURL) {
        this.AsrURL = AsrURL;
    }

    /**
     * Get <P>Voicemail recording link</p>. 
     * @return VoicemailRecordURL <P>Voicemail recording link</p>.
     */
    public String [] getVoicemailRecordURL() {
        return this.VoicemailRecordURL;
    }

    /**
     * Set <P>Voicemail recording link</p>.
     * @param VoicemailRecordURL <P>Voicemail recording link</p>.
     */
    public void setVoicemailRecordURL(String [] VoicemailRecordURL) {
        this.VoicemailRecordURL = VoicemailRecordURL;
    }

    /**
     * Get <P>Voicemail voice recording text information link. you need to purchase an offline speech recognition package through the console and enable the offline speech recognition switch.</p>. 
     * @return VoicemailAsrURL <P>Voicemail voice recording text information link. you need to purchase an offline speech recognition package through the console and enable the offline speech recognition switch.</p>.
     */
    public String [] getVoicemailAsrURL() {
        return this.VoicemailAsrURL;
    }

    /**
     * Set <P>Voicemail voice recording text information link. you need to purchase an offline speech recognition package through the console and enable the offline speech recognition switch.</p>.
     * @param VoicemailAsrURL <P>Voicemail voice recording text information link. you need to purchase an offline speech recognition package through the console and enable the offline speech recognition switch.</p>.
     */
    public void setVoicemailAsrURL(String [] VoicemailAsrURL) {
        this.VoicemailAsrURL = VoicemailAsrURL;
    }

    /**
     * Get <P>IVR key information</p>. 
     * @return IVRKeyPressed <P>IVR key information</p>.
     */
    public IVRKeyPressedElement [] getIVRKeyPressed() {
        return this.IVRKeyPressed;
    }

    /**
     * Set <P>IVR key information</p>.
     * @param IVRKeyPressed <P>IVR key information</p>.
     */
    public void setIVRKeyPressed(IVRKeyPressedElement [] IVRKeyPressed) {
        this.IVRKeyPressed = IVRKeyPressed;
    }

    /**
     * Get <P>Key information of satisfaction rate</p>. 
     * @return PostIVRKeyPressed <P>Key information of satisfaction rate</p>.
     */
    public IVRKeyPressedElement [] getPostIVRKeyPressed() {
        return this.PostIVRKeyPressed;
    }

    /**
     * Set <P>Key information of satisfaction rate</p>.
     * @param PostIVRKeyPressed <P>Key information of satisfaction rate</p>.
     */
    public void setPostIVRKeyPressed(IVRKeyPressedElement [] PostIVRKeyPressed) {
        this.PostIVRKeyPressed = PostIVRKeyPressed;
    }

    /**
     * Get <P>Hang-Up side seat agent user system</p>. 
     * @return HungUpSide <P>Hang-Up side seat agent user system</p>.
     */
    public String getHungUpSide() {
        return this.HungUpSide;
    }

    /**
     * Set <P>Hang-Up side seat agent user system</p>.
     * @param HungUpSide <P>Hang-Up side seat agent user system</p>.
     */
    public void setHungUpSide(String HungUpSide) {
        this.HungUpSide = HungUpSide;
    }

    /**
     * Get <p>Customer custom data (User-to-User Interface)</p>. 
     * @return UUI <p>Customer custom data (User-to-User Interface)</p>.
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set <p>Customer custom data (User-to-User Interface)</p>.
     * @param UUI <p>Customer custom data (User-to-User Interface)</p>.
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get <P>Event list for calls in progress</p>. 
     * @return Events <P>Event list for calls in progress</p>.
     */
    public SessionEvent [] getEvents() {
        return this.Events;
    }

    /**
     * Set <P>Event list for calls in progress</p>.
     * @param Events <P>Event list for calls in progress</p>.
     */
    public void setEvents(SessionEvent [] Events) {
        this.Events = Events;
    }

    /**
     * Get <P>Service participant list</p>. 
     * @return ServeParticipants <P>Service participant list</p>.
     */
    public ServeParticipant [] getServeParticipants() {
        return this.ServeParticipants;
    }

    /**
     * Set <P>Service participant list</p>.
     * @param ServeParticipants <P>Service participant list</p>.
     */
    public void setServeParticipants(ServeParticipant [] ServeParticipants) {
        this.ServeParticipants = ServeParticipants;
    }

    /**
     * Get <P>Status code for reason of system hang-up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>. 
     * @return SysHangupReason <P>Status code for reason of system hang-up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>.
     */
    public Long getSysHangupReason() {
        return this.SysHangupReason;
    }

    /**
     * Set <P>Status code for reason of system hang-up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>.
     * @param SysHangupReason <P>Status code for reason of system hang-up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>.
     */
    public void setSysHangupReason(Long SysHangupReason) {
        this.SysHangupReason = SysHangupReason;
    }

    /**
     * Get <P>Reason for system hang up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>. 
     * @return SysHangupReasonString <P>Reason for system hang up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>.
     */
    public String getSysHangupReasonString() {
        return this.SysHangupReasonString;
    }

    /**
     * Set <P>Reason for system hang up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>.
     * @param SysHangupReasonString <P>Reason for system hang up after connect.</p><p><a href="https://www.tencentcloud.com/document/product/679/123938?from_cn_redirect=1">details</a></p>.
     */
    public void setSysHangupReasonString(String SysHangupReasonString) {
        this.SysHangupReasonString = SysHangupReasonString;
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

    public DescribeSessionDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionDetailResponse(DescribeSessionDetailResponse source) {
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
        }
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Long(source.StartTimeStamp);
        }
        if (source.RingTimestamp != null) {
            this.RingTimestamp = new Long(source.RingTimestamp);
        }
        if (source.AcceptTimestamp != null) {
            this.AcceptTimestamp = new Long(source.AcceptTimestamp);
        }
        if (source.EndedTimestamp != null) {
            this.EndedTimestamp = new Long(source.EndedTimestamp);
        }
        if (source.QueuedTimestamp != null) {
            this.QueuedTimestamp = new Long(source.QueuedTimestamp);
        }
        if (source.StaffUserId != null) {
            this.StaffUserId = new String(source.StaffUserId);
        }
        if (source.EndStatus != null) {
            this.EndStatus = new Long(source.EndStatus);
        }
        if (source.QueuedSkillGroupId != null) {
            this.QueuedSkillGroupId = new Long(source.QueuedSkillGroupId);
        }
        if (source.QueuedSkillGroupName != null) {
            this.QueuedSkillGroupName = new String(source.QueuedSkillGroupName);
        }
        if (source.RecordURL != null) {
            this.RecordURL = new String(source.RecordURL);
        }
        if (source.CustomRecordURL != null) {
            this.CustomRecordURL = new String(source.CustomRecordURL);
        }
        if (source.AsrURL != null) {
            this.AsrURL = new String(source.AsrURL);
        }
        if (source.VoicemailRecordURL != null) {
            this.VoicemailRecordURL = new String[source.VoicemailRecordURL.length];
            for (int i = 0; i < source.VoicemailRecordURL.length; i++) {
                this.VoicemailRecordURL[i] = new String(source.VoicemailRecordURL[i]);
            }
        }
        if (source.VoicemailAsrURL != null) {
            this.VoicemailAsrURL = new String[source.VoicemailAsrURL.length];
            for (int i = 0; i < source.VoicemailAsrURL.length; i++) {
                this.VoicemailAsrURL[i] = new String(source.VoicemailAsrURL[i]);
            }
        }
        if (source.IVRKeyPressed != null) {
            this.IVRKeyPressed = new IVRKeyPressedElement[source.IVRKeyPressed.length];
            for (int i = 0; i < source.IVRKeyPressed.length; i++) {
                this.IVRKeyPressed[i] = new IVRKeyPressedElement(source.IVRKeyPressed[i]);
            }
        }
        if (source.PostIVRKeyPressed != null) {
            this.PostIVRKeyPressed = new IVRKeyPressedElement[source.PostIVRKeyPressed.length];
            for (int i = 0; i < source.PostIVRKeyPressed.length; i++) {
                this.PostIVRKeyPressed[i] = new IVRKeyPressedElement(source.PostIVRKeyPressed[i]);
            }
        }
        if (source.HungUpSide != null) {
            this.HungUpSide = new String(source.HungUpSide);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
        if (source.Events != null) {
            this.Events = new SessionEvent[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new SessionEvent(source.Events[i]);
            }
        }
        if (source.ServeParticipants != null) {
            this.ServeParticipants = new ServeParticipant[source.ServeParticipants.length];
            for (int i = 0; i < source.ServeParticipants.length; i++) {
                this.ServeParticipants[i] = new ServeParticipant(source.ServeParticipants[i]);
            }
        }
        if (source.SysHangupReason != null) {
            this.SysHangupReason = new Long(source.SysHangupReason);
        }
        if (source.SysHangupReasonString != null) {
            this.SysHangupReasonString = new String(source.SysHangupReasonString);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "RingTimestamp", this.RingTimestamp);
        this.setParamSimple(map, prefix + "AcceptTimestamp", this.AcceptTimestamp);
        this.setParamSimple(map, prefix + "EndedTimestamp", this.EndedTimestamp);
        this.setParamSimple(map, prefix + "QueuedTimestamp", this.QueuedTimestamp);
        this.setParamSimple(map, prefix + "StaffUserId", this.StaffUserId);
        this.setParamSimple(map, prefix + "EndStatus", this.EndStatus);
        this.setParamSimple(map, prefix + "QueuedSkillGroupId", this.QueuedSkillGroupId);
        this.setParamSimple(map, prefix + "QueuedSkillGroupName", this.QueuedSkillGroupName);
        this.setParamSimple(map, prefix + "RecordURL", this.RecordURL);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);
        this.setParamSimple(map, prefix + "AsrURL", this.AsrURL);
        this.setParamArraySimple(map, prefix + "VoicemailRecordURL.", this.VoicemailRecordURL);
        this.setParamArraySimple(map, prefix + "VoicemailAsrURL.", this.VoicemailAsrURL);
        this.setParamArrayObj(map, prefix + "IVRKeyPressed.", this.IVRKeyPressed);
        this.setParamArrayObj(map, prefix + "PostIVRKeyPressed.", this.PostIVRKeyPressed);
        this.setParamSimple(map, prefix + "HungUpSide", this.HungUpSide);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamArrayObj(map, prefix + "ServeParticipants.", this.ServeParticipants);
        this.setParamSimple(map, prefix + "SysHangupReason", this.SysHangupReason);
        this.setParamSimple(map, prefix + "SysHangupReasonString", this.SysHangupReasonString);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

