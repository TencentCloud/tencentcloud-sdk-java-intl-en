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
    * Call initiation timestamp, unix timestamp.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Call direction: 0 - inbound, 1 - outbound.
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
    * Recording information.
    */
    @SerializedName("RecordURL")
    @Expose
    private String RecordURL;

    /**
    * Recording id.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Agent information.
    */
    @SerializedName("SeatUser")
    @Expose
    private SeatUserInfo SeatUser;

    /**
    * EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking.
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
    * Caller'S location.
    */
    @SerializedName("CallerLocation")
    @Expose
    private String CallerLocation;

    /**
    * Time spent in ivr stage.
    */
    @SerializedName("IVRDuration")
    @Expose
    private Long IVRDuration;

    /**
    * Ring timestamp. unix second-level timestamp.
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * Answer timestamp. unix second-level timestamp.
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * End timestamp. unix second-level timestamp.
    */
    @SerializedName("EndedTimestamp")
    @Expose
    private Long EndedTimestamp;

    /**
    * IVR key information, e.g. ["1","2","3"].
    */
    @SerializedName("IVRKeyPressed")
    @Expose
    private String [] IVRKeyPressed;

    /**
    * Hang-Up side, seat, user, system.
    */
    @SerializedName("HungUpSide")
    @Expose
    private String HungUpSide;

    /**
    * Service participant list.
    */
    @SerializedName("ServeParticipants")
    @Expose
    private ServeParticipant [] ServeParticipants;

    /**
    * Skill group id.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking.
    */
    @SerializedName("EndStatusString")
    @Expose
    private String EndStatusString;

    /**
    * Session start timestamp. unix second-level timestamp.
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * Queue entry time. unix second-level timestamp.
    */
    @SerializedName("QueuedTimestamp")
    @Expose
    private Long QueuedTimestamp;

    /**
    * Post-IVR key information (e.g. [{"key":"1","label":"very satisfied"}]).
    */
    @SerializedName("PostIVRKeyPressed")
    @Expose
    private IVRKeyPressedElement [] PostIVRKeyPressed;

    /**
    * Queue skill group id.
    */
    @SerializedName("QueuedSkillGroupId")
    @Expose
    private Long QueuedSkillGroupId;

    /**
    * Session id.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Caller number protection id. effective when the number protection map feature is activated, and the caller field is empty.
    */
    @SerializedName("ProtectedCaller")
    @Expose
    private String ProtectedCaller;

    /**
    * Called number protection id. effective when the number protection map feature is activated, and the callee field is empty.
    */
    @SerializedName("ProtectedCallee")
    @Expose
    private String ProtectedCallee;

    /**
    * Customer custom data. (user - to - user interface).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uui")
    @Expose
    private String Uui;

    /**
    * Customer custom data. (user - to - user interface).
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
    * IVR key information (e.g. [{"key":"1","label":"very satisfied"}]).
    */
    @SerializedName("IVRKeyPressedEx")
    @Expose
    private IVRKeyPressedElement [] IVRKeyPressedEx;

    /**
    * Access to the asr text information address of the recording.
    */
    @SerializedName("AsrUrl")
    @Expose
    private String AsrUrl;

    /**
    * ASRUrl status: complete.
Completed;.
Processing.
Generating.
NotExists.
No record (offline asr generation is not enabled or no package is available).
    */
    @SerializedName("AsrStatus")
    @Expose
    private String AsrStatus;

    /**
    * Address of the third-party cos for transferring recording.
    */
    @SerializedName("CustomRecordURL")
    @Expose
    private String CustomRecordURL;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Queue skill group name.
    */
    @SerializedName("QueuedSkillGroupName")
    @Expose
    private String QueuedSkillGroupName;

    /**
    * Audio message recording url during call.
    */
    @SerializedName("VoicemailRecordURL")
    @Expose
    private String [] VoicemailRecordURL;

    /**
    * Text information address of asr audio message during a call.
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
     * Get Call initiation timestamp, unix timestamp. 
     * @return Time Call initiation timestamp, unix timestamp.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Call initiation timestamp, unix timestamp.
     * @param Time Call initiation timestamp, unix timestamp.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Call direction: 0 - inbound, 1 - outbound. 
     * @return Direction Call direction: 0 - inbound, 1 - outbound.
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Call direction: 0 - inbound, 1 - outbound.
     * @param Direction Call direction: 0 - inbound, 1 - outbound.
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
     * Get Recording information. 
     * @return RecordURL Recording information.
     */
    public String getRecordURL() {
        return this.RecordURL;
    }

    /**
     * Set Recording information.
     * @param RecordURL Recording information.
     */
    public void setRecordURL(String RecordURL) {
        this.RecordURL = RecordURL;
    }

    /**
     * Get Recording id. 
     * @return RecordId Recording id.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Recording id.
     * @param RecordId Recording id.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Agent information. 
     * @return SeatUser Agent information.
     */
    public SeatUserInfo getSeatUser() {
        return this.SeatUser;
    }

    /**
     * Set Agent information.
     * @param SeatUser Agent information.
     */
    public void setSeatUser(SeatUserInfo SeatUser) {
        this.SeatUser = SeatUser;
    }

    /**
     * Get EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking. 
     * @return EndStatus EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking.
     */
    public Long getEndStatus() {
        return this.EndStatus;
    }

    /**
     * Set EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking.
     * @param EndStatus EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking.
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
     * Get Caller'S location. 
     * @return CallerLocation Caller'S location.
     */
    public String getCallerLocation() {
        return this.CallerLocation;
    }

    /**
     * Set Caller'S location.
     * @param CallerLocation Caller'S location.
     */
    public void setCallerLocation(String CallerLocation) {
        this.CallerLocation = CallerLocation;
    }

    /**
     * Get Time spent in ivr stage. 
     * @return IVRDuration Time spent in ivr stage.
     */
    public Long getIVRDuration() {
        return this.IVRDuration;
    }

    /**
     * Set Time spent in ivr stage.
     * @param IVRDuration Time spent in ivr stage.
     */
    public void setIVRDuration(Long IVRDuration) {
        this.IVRDuration = IVRDuration;
    }

    /**
     * Get Ring timestamp. unix second-level timestamp. 
     * @return RingTimestamp Ring timestamp. unix second-level timestamp.
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set Ring timestamp. unix second-level timestamp.
     * @param RingTimestamp Ring timestamp. unix second-level timestamp.
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get Answer timestamp. unix second-level timestamp. 
     * @return AcceptTimestamp Answer timestamp. unix second-level timestamp.
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set Answer timestamp. unix second-level timestamp.
     * @param AcceptTimestamp Answer timestamp. unix second-level timestamp.
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get End timestamp. unix second-level timestamp. 
     * @return EndedTimestamp End timestamp. unix second-level timestamp.
     */
    public Long getEndedTimestamp() {
        return this.EndedTimestamp;
    }

    /**
     * Set End timestamp. unix second-level timestamp.
     * @param EndedTimestamp End timestamp. unix second-level timestamp.
     */
    public void setEndedTimestamp(Long EndedTimestamp) {
        this.EndedTimestamp = EndedTimestamp;
    }

    /**
     * Get IVR key information, e.g. ["1","2","3"]. 
     * @return IVRKeyPressed IVR key information, e.g. ["1","2","3"].
     */
    public String [] getIVRKeyPressed() {
        return this.IVRKeyPressed;
    }

    /**
     * Set IVR key information, e.g. ["1","2","3"].
     * @param IVRKeyPressed IVR key information, e.g. ["1","2","3"].
     */
    public void setIVRKeyPressed(String [] IVRKeyPressed) {
        this.IVRKeyPressed = IVRKeyPressed;
    }

    /**
     * Get Hang-Up side, seat, user, system. 
     * @return HungUpSide Hang-Up side, seat, user, system.
     */
    public String getHungUpSide() {
        return this.HungUpSide;
    }

    /**
     * Set Hang-Up side, seat, user, system.
     * @param HungUpSide Hang-Up side, seat, user, system.
     */
    public void setHungUpSide(String HungUpSide) {
        this.HungUpSide = HungUpSide;
    }

    /**
     * Get Service participant list. 
     * @return ServeParticipants Service participant list.
     */
    public ServeParticipant [] getServeParticipants() {
        return this.ServeParticipants;
    }

    /**
     * Set Service participant list.
     * @param ServeParticipants Service participant list.
     */
    public void setServeParticipants(ServeParticipant [] ServeParticipants) {
        this.ServeParticipants = ServeParticipants;
    }

    /**
     * Get Skill group id. 
     * @return SkillGroupId Skill group id.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group id.
     * @param SkillGroupId Skill group id.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking. 
     * @return EndStatusString EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking.
     */
    public String getEndStatusString() {
        return this.EndStatusString;
    }

    /**
     * Set EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking.
     * @param EndStatusString EndStatus corresponds one-to-one with endstatusstring, with specific enumerations as follows:.

**Scenario	EndStatus	EndStatusString	Status description**.

Inbound call & call	1	ok	end properly.

Inbound call & call | 0 | error | system error.

Inbound call | 102 | ivrgiveup | user gives up during ivr.

Inbound call | 103 | waitinggiveup | user gives up during session queue.

Inbound call | 104 | ringinggiveup | user gives up during session ringing.

Inbound call | 105 | noseatonline | no agent online.

Inbound call              106	       non - working hour      non - working hour.   

Inbound call              107	       ivrend                   end directly after ivr.

Inbound call              100	       blocklist call - in      call - in blocklist. 

Outgoing call            2                 unconnected            unconnected.

Outgoing call            108           restricted callee      callee restricted due to high - risk.

Outgoing call         109        toomanyrequest        overfrequency.

Outgoing call         110        restrictedarea        outbound blind area.

Outgoing call         111        restrictedtime        outbound time restriction.
                         
Outgoing call         201        unknown               unknown status.

Outgoing call         202        notanswer             unanswered.

Outgoing call - 203 - userreject: reject call.

Outgoing call - 204 - poweroff: power off.

Outgoing call - 205 - numbernotexist: nonexistent number.

Outgoing call - 206 - busy: call in progress.

Outgoing call - 207 - outofcredit: arrears.

Outgoing call - 208 - operatorerror - ISP line exception.

Outgoing call - 209 - callercancel - caller cancellation.

Outgoing call - 210 - notinservice - not in service area.

Inbound and outgoing call - 211 - clienterror - client error.
Outgoing call - 212 - carrierblocked - ISP blocking.
     */
    public void setEndStatusString(String EndStatusString) {
        this.EndStatusString = EndStatusString;
    }

    /**
     * Get Session start timestamp. unix second-level timestamp. 
     * @return StartTimestamp Session start timestamp. unix second-level timestamp.
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set Session start timestamp. unix second-level timestamp.
     * @param StartTimestamp Session start timestamp. unix second-level timestamp.
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get Queue entry time. unix second-level timestamp. 
     * @return QueuedTimestamp Queue entry time. unix second-level timestamp.
     */
    public Long getQueuedTimestamp() {
        return this.QueuedTimestamp;
    }

    /**
     * Set Queue entry time. unix second-level timestamp.
     * @param QueuedTimestamp Queue entry time. unix second-level timestamp.
     */
    public void setQueuedTimestamp(Long QueuedTimestamp) {
        this.QueuedTimestamp = QueuedTimestamp;
    }

    /**
     * Get Post-IVR key information (e.g. [{"key":"1","label":"very satisfied"}]). 
     * @return PostIVRKeyPressed Post-IVR key information (e.g. [{"key":"1","label":"very satisfied"}]).
     */
    public IVRKeyPressedElement [] getPostIVRKeyPressed() {
        return this.PostIVRKeyPressed;
    }

    /**
     * Set Post-IVR key information (e.g. [{"key":"1","label":"very satisfied"}]).
     * @param PostIVRKeyPressed Post-IVR key information (e.g. [{"key":"1","label":"very satisfied"}]).
     */
    public void setPostIVRKeyPressed(IVRKeyPressedElement [] PostIVRKeyPressed) {
        this.PostIVRKeyPressed = PostIVRKeyPressed;
    }

    /**
     * Get Queue skill group id. 
     * @return QueuedSkillGroupId Queue skill group id.
     */
    public Long getQueuedSkillGroupId() {
        return this.QueuedSkillGroupId;
    }

    /**
     * Set Queue skill group id.
     * @param QueuedSkillGroupId Queue skill group id.
     */
    public void setQueuedSkillGroupId(Long QueuedSkillGroupId) {
        this.QueuedSkillGroupId = QueuedSkillGroupId;
    }

    /**
     * Get Session id. 
     * @return SessionId Session id.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session id.
     * @param SessionId Session id.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Caller number protection id. effective when the number protection map feature is activated, and the caller field is empty. 
     * @return ProtectedCaller Caller number protection id. effective when the number protection map feature is activated, and the caller field is empty.
     */
    public String getProtectedCaller() {
        return this.ProtectedCaller;
    }

    /**
     * Set Caller number protection id. effective when the number protection map feature is activated, and the caller field is empty.
     * @param ProtectedCaller Caller number protection id. effective when the number protection map feature is activated, and the caller field is empty.
     */
    public void setProtectedCaller(String ProtectedCaller) {
        this.ProtectedCaller = ProtectedCaller;
    }

    /**
     * Get Called number protection id. effective when the number protection map feature is activated, and the callee field is empty. 
     * @return ProtectedCallee Called number protection id. effective when the number protection map feature is activated, and the callee field is empty.
     */
    public String getProtectedCallee() {
        return this.ProtectedCallee;
    }

    /**
     * Set Called number protection id. effective when the number protection map feature is activated, and the callee field is empty.
     * @param ProtectedCallee Called number protection id. effective when the number protection map feature is activated, and the callee field is empty.
     */
    public void setProtectedCallee(String ProtectedCallee) {
        this.ProtectedCallee = ProtectedCallee;
    }

    /**
     * Get Customer custom data. (user - to - user interface).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Uui Customer custom data. (user - to - user interface).
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getUui() {
        return this.Uui;
    }

    /**
     * Set Customer custom data. (user - to - user interface).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Uui Customer custom data. (user - to - user interface).
Note: this field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setUui(String Uui) {
        this.Uui = Uui;
    }

    /**
     * Get Customer custom data. (user - to - user interface). 
     * @return UUI Customer custom data. (user - to - user interface).
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set Customer custom data. (user - to - user interface).
     * @param UUI Customer custom data. (user - to - user interface).
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    /**
     * Get IVR key information (e.g. [{"key":"1","label":"very satisfied"}]). 
     * @return IVRKeyPressedEx IVR key information (e.g. [{"key":"1","label":"very satisfied"}]).
     */
    public IVRKeyPressedElement [] getIVRKeyPressedEx() {
        return this.IVRKeyPressedEx;
    }

    /**
     * Set IVR key information (e.g. [{"key":"1","label":"very satisfied"}]).
     * @param IVRKeyPressedEx IVR key information (e.g. [{"key":"1","label":"very satisfied"}]).
     */
    public void setIVRKeyPressedEx(IVRKeyPressedElement [] IVRKeyPressedEx) {
        this.IVRKeyPressedEx = IVRKeyPressedEx;
    }

    /**
     * Get Access to the asr text information address of the recording. 
     * @return AsrUrl Access to the asr text information address of the recording.
     */
    public String getAsrUrl() {
        return this.AsrUrl;
    }

    /**
     * Set Access to the asr text information address of the recording.
     * @param AsrUrl Access to the asr text information address of the recording.
     */
    public void setAsrUrl(String AsrUrl) {
        this.AsrUrl = AsrUrl;
    }

    /**
     * Get ASRUrl status: complete.
Completed;.
Processing.
Generating.
NotExists.
No record (offline asr generation is not enabled or no package is available). 
     * @return AsrStatus ASRUrl status: complete.
Completed;.
Processing.
Generating.
NotExists.
No record (offline asr generation is not enabled or no package is available).
     */
    public String getAsrStatus() {
        return this.AsrStatus;
    }

    /**
     * Set ASRUrl status: complete.
Completed;.
Processing.
Generating.
NotExists.
No record (offline asr generation is not enabled or no package is available).
     * @param AsrStatus ASRUrl status: complete.
Completed;.
Processing.
Generating.
NotExists.
No record (offline asr generation is not enabled or no package is available).
     */
    public void setAsrStatus(String AsrStatus) {
        this.AsrStatus = AsrStatus;
    }

    /**
     * Get Address of the third-party cos for transferring recording. 
     * @return CustomRecordURL Address of the third-party cos for transferring recording.
     */
    public String getCustomRecordURL() {
        return this.CustomRecordURL;
    }

    /**
     * Set Address of the third-party cos for transferring recording.
     * @param CustomRecordURL Address of the third-party cos for transferring recording.
     */
    public void setCustomRecordURL(String CustomRecordURL) {
        this.CustomRecordURL = CustomRecordURL;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Queue skill group name. 
     * @return QueuedSkillGroupName Queue skill group name.
     */
    public String getQueuedSkillGroupName() {
        return this.QueuedSkillGroupName;
    }

    /**
     * Set Queue skill group name.
     * @param QueuedSkillGroupName Queue skill group name.
     */
    public void setQueuedSkillGroupName(String QueuedSkillGroupName) {
        this.QueuedSkillGroupName = QueuedSkillGroupName;
    }

    /**
     * Get Audio message recording url during call. 
     * @return VoicemailRecordURL Audio message recording url during call.
     */
    public String [] getVoicemailRecordURL() {
        return this.VoicemailRecordURL;
    }

    /**
     * Set Audio message recording url during call.
     * @param VoicemailRecordURL Audio message recording url during call.
     */
    public void setVoicemailRecordURL(String [] VoicemailRecordURL) {
        this.VoicemailRecordURL = VoicemailRecordURL;
    }

    /**
     * Get Text information address of asr audio message during a call. 
     * @return VoicemailAsrURL Text information address of asr audio message during a call.
     */
    public String [] getVoicemailAsrURL() {
        return this.VoicemailAsrURL;
    }

    /**
     * Set Text information address of asr audio message during a call.
     * @param VoicemailAsrURL Text information address of asr audio message during a call.
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
        if (source.AsrStatus != null) {
            this.AsrStatus = new String(source.AsrStatus);
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
        this.setParamSimple(map, prefix + "AsrStatus", this.AsrStatus);
        this.setParamSimple(map, prefix + "CustomRecordURL", this.CustomRecordURL);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "QueuedSkillGroupName", this.QueuedSkillGroupName);
        this.setParamArraySimple(map, prefix + "VoicemailRecordURL.", this.VoicemailRecordURL);
        this.setParamArraySimple(map, prefix + "VoicemailAsrURL.", this.VoicemailAsrURL);

    }
}

