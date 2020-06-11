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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInformation extends AbstractModel{

    /**
    * Room ID of string type.
    */
    @SerializedName("RoomStr")
    @Expose
    private String RoomStr;

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The time when the user enters the room
    */
    @SerializedName("JoinTs")
    @Expose
    private Long JoinTs;

    /**
    * The time when the user exits the room
    */
    @SerializedName("LeaveTs")
    @Expose
    private Long LeaveTs;

    /**
    * Device type
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * SDK version number
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * Client IP
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Determine whether a user has left the room
    */
    @SerializedName("Finished")
    @Expose
    private Boolean Finished;

    /**
     * Get Room ID of string type. 
     * @return RoomStr Room ID of string type.
     */
    public String getRoomStr() {
        return this.RoomStr;
    }

    /**
     * Set Room ID of string type.
     * @param RoomStr Room ID of string type.
     */
    public void setRoomStr(String RoomStr) {
        this.RoomStr = RoomStr;
    }

    /**
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The time when the user enters the room 
     * @return JoinTs The time when the user enters the room
     */
    public Long getJoinTs() {
        return this.JoinTs;
    }

    /**
     * Set The time when the user enters the room
     * @param JoinTs The time when the user enters the room
     */
    public void setJoinTs(Long JoinTs) {
        this.JoinTs = JoinTs;
    }

    /**
     * Get The time when the user exits the room 
     * @return LeaveTs The time when the user exits the room
     */
    public Long getLeaveTs() {
        return this.LeaveTs;
    }

    /**
     * Set The time when the user exits the room
     * @param LeaveTs The time when the user exits the room
     */
    public void setLeaveTs(Long LeaveTs) {
        this.LeaveTs = LeaveTs;
    }

    /**
     * Get Device type 
     * @return DeviceType Device type
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set Device type
     * @param DeviceType Device type
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get SDK version number 
     * @return SdkVersion SDK version number
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set SDK version number
     * @param SdkVersion SDK version number
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get Client IP 
     * @return ClientIp Client IP
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP
     * @param ClientIp Client IP
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Determine whether a user has left the room 
     * @return Finished Determine whether a user has left the room
     */
    public Boolean getFinished() {
        return this.Finished;
    }

    /**
     * Set Determine whether a user has left the room
     * @param Finished Determine whether a user has left the room
     */
    public void setFinished(Boolean Finished) {
        this.Finished = Finished;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomStr", this.RoomStr);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "JoinTs", this.JoinTs);
        this.setParamSimple(map, prefix + "LeaveTs", this.LeaveTs);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "SdkVersion", this.SdkVersion);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Finished", this.Finished);

    }
}

