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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TelCdrInfo extends AbstractModel {

    /**
    * Caller number.
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * Called number.
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * Call initiation timestamp, Unix timestamp.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Call direction: 0 - Inbound, 1 - Outbound.
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Call duration.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Recording Information.
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * Recording ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Agent Information
    */
    @SerializedName("SeatUser")
    @Expose
    private SeatUserInfo SeatUser;

    /**
    * EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Outgoing Call	         206	           busy	During the call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Incoming & Outgoing Calls	211    clientError    Client Error

    */
    @SerializedName("EndStatus")
    @Expose
    private Long EndStatus;

    /**
    * Skill group name.
    */
    @SerializedName("SkillGroup")
    @Expose
    private String SkillGroup;

    /**
    * Caller's location.
    */
    @SerializedName("CallerLocation")
    @Expose
    private String CallerLocation;

    /**
    * Time spent in IVR stage.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IVRDuration")
    @Expose
    private Long IVRDuration;

    /**
    * Ring timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * Answer timestamp. UNIX second-Level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * End timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * IVR key information, e.g. ["1","2","3"]
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IVRKeyPressed")
    @Expose
    private String [] IVRKeyPressed;

    /**
    * Hanging Up Party seat Seat user Users system system
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HungUpSide")
    @Expose
    private String HungUpSide;

    /**
    * List of Service Participants
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServeParticipants")
    @Expose
    private ServeParticipant [] ServeParticipants;

    /**
    * Skill group ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Phone Call Out	         206	           busy	In Call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Phone Call In & Out	211    clientError    Client Error

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndStatusString")
    @Expose
    private String EndStatusString;

    /**
    * Session start timestamp. UNIX second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * Queue entry time. Unix second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QueuedTimestamp")
    @Expose
    private Long QueuedTimestamp;

    /**
    * Post-IVR key information (e.g. [{"Key":"1","Label":"Very Satisfied"}])
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PostIVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressed;

    /**
    * Queue Skill Group ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QueuedSkillGroupId")
    @Expose
    private Long QueuedSkillGroupId;

    /**
    * Session ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Caller number protection ID. (Effective when the number protection map feature is activated, and the Caller field is empty).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectedCaller")
    @Expose
    private String ProtectedCaller;

    /**
    * Called number protection ID (Effective when the number protection map feature is activated, and the Callee field is empty).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectedCallee")
    @Expose
    private String ProtectedCallee;

    /**
    * Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uui")
    @Expose
    private String Uui;

    /**
    * Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * IVR key information (e.g.?[{"Key":"1","Label":"highly satisfied"}])
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IVRKeyPressedEx")
    @Expose
    private IVRKeyPressedElement [] IVRKeyPressedEx;

    /**
    * Access to the ASR text information address of the recording.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrUrl")
    @Expose
    private String AsrUrl;

    /**
    * Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Queue skill group name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QueuedSkillGroupName")
    @Expose
    private String QueuedSkillGroupName;

    /**
    * Audio message recording URL during call.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoicemailRecordURL")
    @Expose
    private String [] VoicemailRecordURL;

    /**
    * Text Information address of ASR audio message during a call.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VoicemailAsrURL")
    @Expose
    private String [] VoicemailAsrURL;

    /**
     * Get Caller number. 
     * @return Caller Caller number.
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set Caller number.
     * @param Caller Caller number.
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get Called number. 
     * @return Callee Called number.
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set Called number.
     * @param Callee Called number.
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get Call initiation timestamp, Unix timestamp. 
     * @return Time Call initiation timestamp, Unix timestamp.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Call initiation timestamp, Unix timestamp.
     * @param Time Call initiation timestamp, Unix timestamp.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Call direction: 0 - Inbound, 1 - Outbound. 
     * @return Direction Call direction: 0 - Inbound, 1 - Outbound.
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Call direction: 0 - Inbound, 1 - Outbound.
     * @param Direction Call direction: 0 - Inbound, 1 - Outbound.
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Call duration. 
     * @return Duration Call duration.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Call duration.
     * @param Duration Call duration.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Recording Information. 
     * @return RecordURL Recording Information.
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set Recording Information.
     * @param RecordURL Recording Information.
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get Recording ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RecordId Recording ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Recording ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RecordId Recording ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Agent Information 
     * @return SeatUser Agent Information
     */
    public SeatUserInfo getSeatUser() {
        return this.SeatUser;
    }

    /**
     * Set Agent Information
     * @param SeatUser Agent Information
     */
    public void setSeatUser(SeatUserInfo SeatUser) {
        this.SeatUser = SeatUser;
    }

    /**
     * Get EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Outgoing Call	         206	           busy	During the call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Incoming & Outgoing Calls	211    clientError    Client Error
 
     * @return EndStatus EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Outgoing Call	         206	           busy	During the call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Incoming & Outgoing Calls	211    clientError    Client Error

     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Outgoing Call	         206	           busy	During the call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Incoming & Outgoing Calls	211    clientError    Client Error

     * @param EndStatus EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Outgoing Call	         206	           busy	During the call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Incoming & Outgoing Calls	211    clientError    Client Error

     */
    public void setEndStatus(Long EndStatus) {
        this.EndStatus = EndStatus;
    }

    /**
     * Get Skill group name. 
     * @return SkillGroup Skill group name.
     */
    public String getSkillGroup() {
        return this.SkillGroup;
    }

    /**
     * Set Skill group name.
     * @param SkillGroup Skill group name.
     */
    public void setSkillGroup(String SkillGroup) {
        this.SkillGroup = SkillGroup;
    }

    /**
     * Get Caller's location. 
     * @return CallerLocation Caller's location.
     */
    public String getCallerLocation() {
        return this.CallerLocation;
    }

    /**
     * Set Caller's location.
     * @param CallerLocation Caller's location.
     */
    public void setCallerLocation(String CallerLocation) {
        this.CallerLocation = CallerLocation;
    }

    /**
     * Get Time spent in IVR stage.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IVRDuration Time spent in IVR stage.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIVRDuration() {
        return this.IVRDuration;
    }

    /**
     * Set Time spent in IVR stage.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IVRDuration Time spent in IVR stage.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIVRDuration(Long IVRDuration) {
        this.IVRDuration = IVRDuration;
    }

    /**
     * Get Ring timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RingTimestamp Ring timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set Ring timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RingTimestamp Ring timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get Answer timestamp. UNIX second-Level timestamp
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AcceptTimestamp Answer timestamp. UNIX second-Level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set Answer timestamp. UNIX second-Level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AcceptTimestamp Answer timestamp. UNIX second-Level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get End timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EndedTimestamp End timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set End timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EndedTimestamp End timestamp. UNIX second-level timestamp
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get IVR key information, e.g. ["1","2","3"]
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IVRKeyPressed IVR key information, e.g. ["1","2","3"]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getIVRKeyPressed() {
        return this.IVRKeyPressed;
    }

    /**
     * Set IVR key information, e.g. ["1","2","3"]
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IVRKeyPressed IVR key information, e.g. ["1","2","3"]
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIVRKeyPressed(String [] IVRKeyPressed) {
        this.IVRKeyPressed = IVRKeyPressed;
    }

    /**
     * Get Hanging Up Party seat Seat user Users system system
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HungUpSide Hanging Up Party seat Seat user Users system system
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHungUpSide() {
        return this.HungUpSide;
    }

    /**
     * Set Hanging Up Party seat Seat user Users system system
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HungUpSide Hanging Up Party seat Seat user Users system system
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHungUpSide(String HungUpSide) {
        this.HungUpSide = HungUpSide;
    }

    /**
     * Get List of Service Participants
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServeParticipants List of Service Participants
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ServeParticipant [] getServeParticipants() {
        return this.ServeParticipants;
    }

    /**
     * Set List of Service Participants
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServeParticipants List of Service Participants
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServeParticipants(ServeParticipant [] ServeParticipants) {
        this.ServeParticipants = ServeParticipants;
    }

    /**
     * Get Skill group ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SkillGroupId Skill group ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SkillGroupId Skill group ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Phone Call Out	         206	           busy	In Call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Phone Call In & Out	211    clientError    Client Error

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndStatusString EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Phone Call Out	         206	           busy	In Call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Phone Call In & Out	211    clientError    Client Error

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndStatusString() {
        return this.EndStatusString;
    }

    /**
     * Set EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Phone Call Out	         206	           busy	In Call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Phone Call In & Out	211    clientError    Client Error

Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndStatusString EndStatus corresponds one-to-one with EndStatusString, specific enumerations are as follows:

**Scenario	         EndStatus	EndStatusString	Status Description**

Incoming & Outgoing Calls	1	        ok	                        Normal End

Incoming & Outgoing Calls	0	        error	                System Error

Incoming Call	             102	        ivrGiveUp	        User Gave Up During IVR

Incoming Call	             103	        waitingGiveUp	       User Gave Up During Queue

Incoming Call	             104	        ringingGiveUp	       User Gave Up During Ringing

Incoming Call	             105	        noSeatOnline	       No Seat Online

Incoming Call              106	       notWorkTime	       Non-Working Hours   

Incoming Call	            107	       ivrEnd	               Ended Directly After IVR

Incoming Call	            100	      blackList Incoming blocklist  

Outgoing Call               2	              unconnected	Unconnected

Outgoing Call             108	        restrictedCallee	Callee restricted due to high risk

Outgoing Call             109	        tooManyRequest	    Frequency limit exceeded

Outgoing Call             110	        restrictedArea	    Call to restricted area

Outgoing Call             111	        restrictedTime	Call time restricted
                         
Outgoing Call             201            unknown	Unknown status

Outgoing Call             202            notAnswer	Missed call

Outgoing Call            203	    userReject	Reject/Hang Up

Outgoing Call	          204	    powerOff	Shutting down

Outgoing Call           205            numberNotExist	Disconnected Number

Phone Call Out	         206	           busy	In Call

Outgoing Call   	        207	           outOfCredit	Overdue Payment

Outgoing Call	         208	           operatorError	 ISP Carrier Line Anomaly

Outgoing Call         	209	           callerCancel	Caller Cancelled

Outgoing Call	        210	           notInService	Out of Service Area

Phone Call In & Out	211    clientError    Client Error

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndStatusString(String EndStatusString) {
        this.EndStatusString = EndStatusString;
    }

    /**
     * Get Session start timestamp. UNIX second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTimestamp Session start timestamp. UNIX second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set Session start timestamp. UNIX second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartTimestamp Session start timestamp. UNIX second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get Queue entry time. Unix second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QueuedTimestamp Queue entry time. Unix second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getQueuedTimestamp() {
        return this.QueuedTimestamp;
    }

    /**
     * Set Queue entry time. Unix second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QueuedTimestamp Queue entry time. Unix second-level timestamp.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQueuedTimestamp(Long QueuedTimestamp) {
        this.QueuedTimestamp = QueuedTimestamp;
    }

    /**
     * Get Post-IVR key information (e.g. [{"Key":"1","Label":"Very Satisfied"}])
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PostIVRKeyPressed Post-IVR key information (e.g. [{"Key":"1","Label":"Very Satisfied"}])
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public IVRKeyPressedElement [] getPostIVRKeyPressed() {
        return this.PostIVRKeyPressed;
    }

    /**
     * Set Post-IVR key information (e.g. [{"Key":"1","Label":"Very Satisfied"}])
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PostIVRKeyPressed Post-IVR key information (e.g. [{"Key":"1","Label":"Very Satisfied"}])
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPostIVRKeyPressed(IVRKeyPressedElement [] PostIVRKeyPressed) {
        this.PostIVRKeyPressed = PostIVRKeyPressed;
    }

    /**
     * Get Queue Skill Group ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QueuedSkillGroupId Queue Skill Group ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getQueuedSkillGroupId() {
        return this.QueuedSkillGroupId;
    }

    /**
     * Set Queue Skill Group ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QueuedSkillGroupId Queue Skill Group ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQueuedSkillGroupId(Long QueuedSkillGroupId) {
        this.QueuedSkillGroupId = QueuedSkillGroupId;
    }

    /**
     * Get Session ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SessionId Session ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SessionId Session ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Caller number protection ID. (Effective when the number protection map feature is activated, and the Caller field is empty).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProtectedCaller Caller number protection ID. (Effective when the number protection map feature is activated, and the Caller field is empty).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtectedCaller() {
        return this.ProtectedCaller;
    }

    /**
     * Set Caller number protection ID. (Effective when the number protection map feature is activated, and the Caller field is empty).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProtectedCaller Caller number protection ID. (Effective when the number protection map feature is activated, and the Caller field is empty).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtectedCaller(String ProtectedCaller) {
        this.ProtectedCaller = ProtectedCaller;
    }

    /**
     * Get Called number protection ID (Effective when the number protection map feature is activated, and the Callee field is empty).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProtectedCallee Called number protection ID (Effective when the number protection map feature is activated, and the Callee field is empty).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtectedCallee() {
        return this.ProtectedCallee;
    }

    /**
     * Set Called number protection ID (Effective when the number protection map feature is activated, and the Callee field is empty).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProtectedCallee Called number protection ID (Effective when the number protection map feature is activated, and the Callee field is empty).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtectedCallee(String ProtectedCallee) {
        this.ProtectedCallee = ProtectedCallee;
    }

    /**
     * Get Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uui Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getUui() {
        return this.Uui;
    }

    /**
     * Set Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uui Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setUui(String Uui) {
        this.Uui = Uui;
    }

    /**
     * Get Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UUI Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UUI Customer custom data. (User-to-User Interface)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get IVR key information (e.g.?[{"Key":"1","Label":"highly satisfied"}])
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IVRKeyPressedEx IVR key information (e.g.?[{"Key":"1","Label":"highly satisfied"}])
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IVRKeyPressedElement [] getIVRKeyPressedEx() {
        return this.IVRKeyPressedEx;
    }

    /**
     * Set IVR key information (e.g.?[{"Key":"1","Label":"highly satisfied"}])
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IVRKeyPressedEx IVR key information (e.g.?[{"Key":"1","Label":"highly satisfied"}])
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIVRKeyPressedEx(IVRKeyPressedElement [] IVRKeyPressedEx) {
        this.IVRKeyPressedEx = IVRKeyPressedEx;
    }

    /**
     * Get Access to the ASR text information address of the recording.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AsrUrl Access to the ASR text information address of the recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAsrUrl() {
        return this.AsrUrl;
    }

    /**
     * Set Access to the ASR text information address of the recording.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AsrUrl Access to the ASR text information address of the recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrUrl(String AsrUrl) {
        this.AsrUrl = AsrUrl;
    }

    /**
     * Get Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomRecordURL Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomRecordURL Address of the third party COS for transferring recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Queue skill group name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QueuedSkillGroupName Queue skill group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQueuedSkillGroupName() {
        return this.QueuedSkillGroupName;
    }

    /**
     * Set Queue skill group name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QueuedSkillGroupName Queue skill group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQueuedSkillGroupName(String QueuedSkillGroupName) {
        this.QueuedSkillGroupName = QueuedSkillGroupName;
    }

    /**
     * Get Audio message recording URL during call.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoicemailRecordURL Audio message recording URL during call.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getVoicemailRecordURL() {
        return this.VoicemailRecordURL;
    }

    /**
     * Set Audio message recording URL during call.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoicemailRecordURL Audio message recording URL during call.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoicemailRecordURL(String [] VoicemailRecordURL) {
        this.VoicemailRecordURL = VoicemailRecordURL;
    }

    /**
     * Get Text Information address of ASR audio message during a call.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VoicemailAsrURL Text Information address of ASR audio message during a call.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getVoicemailAsrURL() {
        return this.VoicemailAsrURL;
    }

    /**
     * Set Text Information address of ASR audio message during a call.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VoicemailAsrURL Text Information address of ASR audio message during a call.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVoicemailAsrURL(String [] VoicemailAsrURL) {
        this.VoicemailAsrURL = VoicemailAsrURL;
    }

    public TelCdrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TelCdrInfo(TelCdrInfo source) {
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.RecordURL != null) {
            this.RecordURL = new String(source.RecordURL);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.SeatUser != null) {
            this.SeatUser = new SeatUserInfo(source.SeatUser);
        }
        if (source.EndStatus != null) {
            this.EndStatus = new Long(source.EndStatus);
        }
        if (source.SkillGroup != null) {
            this.SkillGroup = new String(source.SkillGroup);
        }
        if (source.CallerLocation != null) {
            this.CallerLocation = new String(source.CallerLocation);
        }
        if (source.IVRDuration != null) {
            this.IVRDuration = new Long(source.IVRDuration);
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
        if (source.IVRKeyPressed != null) {
            this.IVRKeyPressed = new String[source.IVRKeyPressed.length];
            for (int i = 0; i < source.IVRKeyPressed.length; i++) {
                this.IVRKeyPressed[i] = new String(source.IVRKeyPressed[i]);
            }
        }
        if (source.HungUpSide != null) {
            this.HungUpSide = new String(source.HungUpSide);
        }
        if (source.ServeParticipants != null) {
            this.ServeParticipants = new ServeParticipant[source.ServeParticipants.length];
            for (int i = 0; i < source.ServeParticipants.length; i++) {
                this.ServeParticipants[i] = new ServeParticipant(source.ServeParticipants[i]);
            }
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.EndStatusString != null) {
            this.EndStatusString = new String(source.EndStatusString);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.QueuedTimestamp != null) {
            this.QueuedTimestamp = new Long(source.QueuedTimestamp);
        }
        if (source.PostIVRKeyPressed != null) {
            this.PostIVRKeyPressed = new IVRKeyPressedElement[source.PostIVRKeyPressed.length];
            for (int i = 0; i < source.PostIVRKeyPressed.length; i++) {
                this.PostIVRKeyPressed[i] = new IVRKeyPressedElement(source.PostIVRKeyPressed[i]);
            }
        }
        if (source.QueuedSkillGroupId != null) {
            this.QueuedSkillGroupId = new Long(source.QueuedSkillGroupId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ProtectedCaller != null) {
            this.ProtectedCaller = new String(source.ProtectedCaller);
        }
        if (source.ProtectedCallee != null) {
            this.ProtectedCallee = new String(source.ProtectedCallee);
        }
        if (source.Uui != null) {
            this.Uui = new String(source.Uui);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
        if (source.IVRKeyPressedEx != null) {
            this.IVRKeyPressedEx = new IVRKeyPressedElement[source.IVRKeyPressedEx.length];
            for (int i = 0; i < source.IVRKeyPressedEx.length; i++) {
                this.IVRKeyPressedEx[i] = new IVRKeyPressedElement(source.IVRKeyPressedEx[i]);
            }
        }
        if (source.AsrUrl != null) {
            this.AsrUrl = new String(source.AsrUrl);
        }
        if (source.CustomRecordURL != null) {
            this.CustomRecordURL = new String(source.CustomRecordURL);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.QueuedSkillGroupName != null) {
            this.QueuedSkillGroupName = new String(source.QueuedSkillGroupName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "RecordURL", this.RecordURL);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamObj(map, prefix + "SeatUser.", this.SeatUser);
        this.setParamSimple(map, prefix + "EndStatus", this.EndStatus);
        this.setParamSimple(map, prefix + "SkillGroup", this.SkillGroup);
        this.setParamSimple(map, prefix + "CallerLocation", this.CallerLocation);
        this.setParamSimple(map, prefix + "IVRDuration", this.IVRDuration);
        this.setParamSimple(map, prefix + "RingTimestamp", this.RingTimestamp);
        this.setParamSimple(map, prefix + "AcceptTimestamp", this.AcceptTimestamp);
        this.setParamSimple(map, prefix + "EndedTimestamp", this.EndedTimestamp);
        this.setParamArraySimple(map, prefix + "IVRKeyPressed.", this.IVRKeyPressed);
        this.setParamSimple(map, prefix + "HungUpSide", this.HungUpSide);
        this.setParamArrayObj(map, prefix + "ServeParticipants.", this.ServeParticipants);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "EndStatusString", this.EndStatusString);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "QueuedTimestamp", this.QueuedTimestamp);
        this.setParamArrayObj(map, prefix + "PostIVRKeyPressed.", this.PostIVRKeyPressed);
        this.setParamSimple(map, prefix + "QueuedSkillGroupId", this.QueuedSkillGroupId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ProtectedCaller", this.ProtectedCaller);
        this.setParamSimple(map, prefix + "ProtectedCallee", this.ProtectedCallee);
        this.setParamSimple(map, prefix + "Uui", this.Uui);
        this.setParamSimple(map, prefix + "UUI", this.UUI);
        this.setParamArrayObj(map, prefix + "IVRKeyPressedEx.", this.IVRKeyPressedEx);
        this.setParamSimple(map, prefix + "AsrUrl", this.AsrUrl);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "QueuedSkillGroupName", this.QueuedSkillGroupName);
        this.setParamArraySimple(map, prefix + "VoicemailRecordURL.", this.VoicemailRecordURL);
        this.setParamArraySimple(map, prefix + "VoicemailAsrURL.", this.VoicemailAsrURL);

    }
}

