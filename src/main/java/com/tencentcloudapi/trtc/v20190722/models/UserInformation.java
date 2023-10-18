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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInformation extends AbstractModel {

    /**
    * The room ID.
    */
    @SerializedName("RoomStr")
    @Expose
    private String RoomStr;

    /**
    * The user ID.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The time when the user entered the room.
    */
    @SerializedName("JoinTs")
    @Expose
    private Long JoinTs;

    /**
    * The time when the user left the room. If the user is still in the room, the current time will be returned.
    */
    @SerializedName("LeaveTs")
    @Expose
    private Long LeaveTs;

    /**
    * The device type.
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * The SDK version number.
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * The client IP address.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Whether a user has left the room.
    */
    @SerializedName("Finished")
    @Expose
    private Boolean Finished;

    /**
     * Get The room ID. 
     * @return RoomStr The room ID.
     */
    public String getRoomStr() {
        return this.RoomStr;
    }

    /**
     * Set The room ID.
     * @param RoomStr The room ID.
     */
    public void setRoomStr(String RoomStr) {
        this.RoomStr = RoomStr;
    }

    /**
     * Get The user ID. 
     * @return UserId The user ID.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user ID.
     * @param UserId The user ID.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The time when the user entered the room. 
     * @return JoinTs The time when the user entered the room.
     */
    public Long getJoinTs() {
        return this.JoinTs;
    }

    /**
     * Set The time when the user entered the room.
     * @param JoinTs The time when the user entered the room.
     */
    public void setJoinTs(Long JoinTs) {
        this.JoinTs = JoinTs;
    }

    /**
     * Get The time when the user left the room. If the user is still in the room, the current time will be returned. 
     * @return LeaveTs The time when the user left the room. If the user is still in the room, the current time will be returned.
     */
    public Long getLeaveTs() {
        return this.LeaveTs;
    }

    /**
     * Set The time when the user left the room. If the user is still in the room, the current time will be returned.
     * @param LeaveTs The time when the user left the room. If the user is still in the room, the current time will be returned.
     */
    public void setLeaveTs(Long LeaveTs) {
        this.LeaveTs = LeaveTs;
    }

    /**
     * Get The device type. 
     * @return DeviceType The device type.
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set The device type.
     * @param DeviceType The device type.
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get The SDK version number. 
     * @return SdkVersion The SDK version number.
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set The SDK version number.
     * @param SdkVersion The SDK version number.
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get The client IP address. 
     * @return ClientIp The client IP address.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set The client IP address.
     * @param ClientIp The client IP address.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Whether a user has left the room. 
     * @return Finished Whether a user has left the room.
     */
    public Boolean getFinished() {
        return this.Finished;
    }

    /**
     * Set Whether a user has left the room.
     * @param Finished Whether a user has left the room.
     */
    public void setFinished(Boolean Finished) {
        this.Finished = Finished;
    }

    public UserInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInformation(UserInformation source) {
        if (source.RoomStr != null) {
            this.RoomStr = new String(source.RoomStr);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.JoinTs != null) {
            this.JoinTs = new Long(source.JoinTs);
        }
        if (source.LeaveTs != null) {
            this.LeaveTs = new Long(source.LeaveTs);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.SdkVersion != null) {
            this.SdkVersion = new String(source.SdkVersion);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Finished != null) {
            this.Finished = new Boolean(source.Finished);
        }
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

