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
    * 
    */
    @SerializedName("RoomStr")
    @Expose
    private String RoomStr;

    /**
    * 
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 
    */
    @SerializedName("JoinTs")
    @Expose
    private Long JoinTs;

    /**
    * The time when the user exits the room. If the user is still in the room, the current time will be returned
    */
    @SerializedName("LeaveTs")
    @Expose
    private Long LeaveTs;

    /**
    * 
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 
    */
    @SerializedName("SdkVersion")
    @Expose
    private String SdkVersion;

    /**
    * 
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 
    */
    @SerializedName("Finished")
    @Expose
    private Boolean Finished;

    /**
     * Get  
     * @return RoomStr 
     */
    public String getRoomStr() {
        return this.RoomStr;
    }

    /**
     * Set 
     * @param RoomStr 
     */
    public void setRoomStr(String RoomStr) {
        this.RoomStr = RoomStr;
    }

    /**
     * Get  
     * @return UserId 
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 
     * @param UserId 
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get  
     * @return JoinTs 
     */
    public Long getJoinTs() {
        return this.JoinTs;
    }

    /**
     * Set 
     * @param JoinTs 
     */
    public void setJoinTs(Long JoinTs) {
        this.JoinTs = JoinTs;
    }

    /**
     * Get The time when the user exits the room. If the user is still in the room, the current time will be returned 
     * @return LeaveTs The time when the user exits the room. If the user is still in the room, the current time will be returned
     */
    public Long getLeaveTs() {
        return this.LeaveTs;
    }

    /**
     * Set The time when the user exits the room. If the user is still in the room, the current time will be returned
     * @param LeaveTs The time when the user exits the room. If the user is still in the room, the current time will be returned
     */
    public void setLeaveTs(Long LeaveTs) {
        this.LeaveTs = LeaveTs;
    }

    /**
     * Get  
     * @return DeviceType 
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 
     * @param DeviceType 
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get  
     * @return SdkVersion 
     */
    public String getSdkVersion() {
        return this.SdkVersion;
    }

    /**
     * Set 
     * @param SdkVersion 
     */
    public void setSdkVersion(String SdkVersion) {
        this.SdkVersion = SdkVersion;
    }

    /**
     * Get  
     * @return ClientIp 
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 
     * @param ClientIp 
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get  
     * @return Finished 
     */
    public Boolean getFinished() {
        return this.Finished;
    }

    /**
     * Set 
     * @param Finished 
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

