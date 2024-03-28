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

public class PSTNSession extends AbstractModel {

    /**
    * Session ID.
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
    * Temporary room ID for session.
    */
    @SerializedName("RoomID")
    @Expose
    private String RoomID;

    /**
    * Caller.
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * Called.
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * Start time. Unix timestamp.
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * Ring time. Unix timestamp.
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * Answer time. Unix timestamp.
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * Agent email.
    */
    @SerializedName("StaffEmail")
    @Expose
    private String StaffEmail;

    /**
    * Agent work number.
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * Session state.
ringing - In progress.
seatJoining - Waiting for agent to receive call.
InProgress - Ongoing.
finished - Completed.
    */
    @SerializedName("SessionStatus")
    @Expose
    private String SessionStatus;

    /**
    * Session call direction, 0 - Inbound | 1 - Outbound.
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * The number used for transferring to the external line (Outbound Caller).
    */
    @SerializedName("OutBoundCaller")
    @Expose
    private String OutBoundCaller;

    /**
    * Outbound callee.
    */
    @SerializedName("OutBoundCallee")
    @Expose
    private String OutBoundCallee;

    /**
    * Caller number protection ID. Effective when the number protection map feature is activated, and the Caller field is empty.
    */
    @SerializedName("ProtectedCaller")
    @Expose
    private String ProtectedCaller;

    /**
    * Called number protection ID. Effective when the number protection map feature is activated, and the Callee field is empty.
    */
    @SerializedName("ProtectedCallee")
    @Expose
    private String ProtectedCallee;

    /**
     * Get Session ID. 
     * @return SessionID Session ID.
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set Session ID.
     * @param SessionID Session ID.
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * Get Temporary room ID for session. 
     * @return RoomID Temporary room ID for session.
     */
    public String getRoomID() {
        return this.RoomID;
    }

    /**
     * Set Temporary room ID for session.
     * @param RoomID Temporary room ID for session.
     */
    public void setRoomID(String RoomID) {
        this.RoomID = RoomID;
    }

    /**
     * Get Caller. 
     * @return Caller Caller.
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set Caller.
     * @param Caller Caller.
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get Called. 
     * @return Callee Called.
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set Called.
     * @param Callee Called.
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get Start time. Unix timestamp. 
     * @return StartTimestamp Start time. Unix timestamp.
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set Start time. Unix timestamp.
     * @param StartTimestamp Start time. Unix timestamp.
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get Ring time. Unix timestamp. 
     * @return RingTimestamp Ring time. Unix timestamp.
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set Ring time. Unix timestamp.
     * @param RingTimestamp Ring time. Unix timestamp.
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get Answer time. Unix timestamp. 
     * @return AcceptTimestamp Answer time. Unix timestamp.
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set Answer time. Unix timestamp.
     * @param AcceptTimestamp Answer time. Unix timestamp.
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get Agent email. 
     * @return StaffEmail Agent email.
     */
    public String getStaffEmail() {
        return this.StaffEmail;
    }

    /**
     * Set Agent email.
     * @param StaffEmail Agent email.
     */
    public void setStaffEmail(String StaffEmail) {
        this.StaffEmail = StaffEmail;
    }

    /**
     * Get Agent work number. 
     * @return StaffNumber Agent work number.
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set Agent work number.
     * @param StaffNumber Agent work number.
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get Session state.
ringing - In progress.
seatJoining - Waiting for agent to receive call.
InProgress - Ongoing.
finished - Completed. 
     * @return SessionStatus Session state.
ringing - In progress.
seatJoining - Waiting for agent to receive call.
InProgress - Ongoing.
finished - Completed.
     */
    public String getSessionStatus() {
        return this.SessionStatus;
    }

    /**
     * Set Session state.
ringing - In progress.
seatJoining - Waiting for agent to receive call.
InProgress - Ongoing.
finished - Completed.
     * @param SessionStatus Session state.
ringing - In progress.
seatJoining - Waiting for agent to receive call.
InProgress - Ongoing.
finished - Completed.
     */
    public void setSessionStatus(String SessionStatus) {
        this.SessionStatus = SessionStatus;
    }

    /**
     * Get Session call direction, 0 - Inbound | 1 - Outbound. 
     * @return Direction Session call direction, 0 - Inbound | 1 - Outbound.
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set Session call direction, 0 - Inbound | 1 - Outbound.
     * @param Direction Session call direction, 0 - Inbound | 1 - Outbound.
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get The number used for transferring to the external line (Outbound Caller). 
     * @return OutBoundCaller The number used for transferring to the external line (Outbound Caller).
     */
    public String getOutBoundCaller() {
        return this.OutBoundCaller;
    }

    /**
     * Set The number used for transferring to the external line (Outbound Caller).
     * @param OutBoundCaller The number used for transferring to the external line (Outbound Caller).
     */
    public void setOutBoundCaller(String OutBoundCaller) {
        this.OutBoundCaller = OutBoundCaller;
    }

    /**
     * Get Outbound callee. 
     * @return OutBoundCallee Outbound callee.
     */
    public String getOutBoundCallee() {
        return this.OutBoundCallee;
    }

    /**
     * Set Outbound callee.
     * @param OutBoundCallee Outbound callee.
     */
    public void setOutBoundCallee(String OutBoundCallee) {
        this.OutBoundCallee = OutBoundCallee;
    }

    /**
     * Get Caller number protection ID. Effective when the number protection map feature is activated, and the Caller field is empty. 
     * @return ProtectedCaller Caller number protection ID. Effective when the number protection map feature is activated, and the Caller field is empty.
     */
    public String getProtectedCaller() {
        return this.ProtectedCaller;
    }

    /**
     * Set Caller number protection ID. Effective when the number protection map feature is activated, and the Caller field is empty.
     * @param ProtectedCaller Caller number protection ID. Effective when the number protection map feature is activated, and the Caller field is empty.
     */
    public void setProtectedCaller(String ProtectedCaller) {
        this.ProtectedCaller = ProtectedCaller;
    }

    /**
     * Get Called number protection ID. Effective when the number protection map feature is activated, and the Callee field is empty. 
     * @return ProtectedCallee Called number protection ID. Effective when the number protection map feature is activated, and the Callee field is empty.
     */
    public String getProtectedCallee() {
        return this.ProtectedCallee;
    }

    /**
     * Set Called number protection ID. Effective when the number protection map feature is activated, and the Callee field is empty.
     * @param ProtectedCallee Called number protection ID. Effective when the number protection map feature is activated, and the Callee field is empty.
     */
    public void setProtectedCallee(String ProtectedCallee) {
        this.ProtectedCallee = ProtectedCallee;
    }

    public PSTNSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PSTNSession(PSTNSession source) {
        if (source.SessionID != null) {
            this.SessionID = new String(source.SessionID);
        }
        if (source.RoomID != null) {
            this.RoomID = new String(source.RoomID);
        }
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.StartTimestamp != null) {
            this.StartTimestamp = new Long(source.StartTimestamp);
        }
        if (source.RingTimestamp != null) {
            this.RingTimestamp = new Long(source.RingTimestamp);
        }
        if (source.AcceptTimestamp != null) {
            this.AcceptTimestamp = new Long(source.AcceptTimestamp);
        }
        if (source.StaffEmail != null) {
            this.StaffEmail = new String(source.StaffEmail);
        }
        if (source.StaffNumber != null) {
            this.StaffNumber = new String(source.StaffNumber);
        }
        if (source.SessionStatus != null) {
            this.SessionStatus = new String(source.SessionStatus);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.OutBoundCaller != null) {
            this.OutBoundCaller = new String(source.OutBoundCaller);
        }
        if (source.OutBoundCallee != null) {
            this.OutBoundCallee = new String(source.OutBoundCallee);
        }
        if (source.ProtectedCaller != null) {
            this.ProtectedCaller = new String(source.ProtectedCaller);
        }
        if (source.ProtectedCallee != null) {
            this.ProtectedCallee = new String(source.ProtectedCallee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);
        this.setParamSimple(map, prefix + "RoomID", this.RoomID);
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "RingTimestamp", this.RingTimestamp);
        this.setParamSimple(map, prefix + "AcceptTimestamp", this.AcceptTimestamp);
        this.setParamSimple(map, prefix + "StaffEmail", this.StaffEmail);
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);
        this.setParamSimple(map, prefix + "SessionStatus", this.SessionStatus);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "OutBoundCaller", this.OutBoundCaller);
        this.setParamSimple(map, prefix + "OutBoundCallee", this.OutBoundCallee);
        this.setParamSimple(map, prefix + "ProtectedCaller", this.ProtectedCaller);
        this.setParamSimple(map, prefix + "ProtectedCallee", this.ProtectedCallee);

    }
}

