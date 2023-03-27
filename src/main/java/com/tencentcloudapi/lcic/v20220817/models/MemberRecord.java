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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemberRecord extends AbstractModel{

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Online duration, in seconds
    */
    @SerializedName("PresentTime")
    @Expose
    private Long PresentTime;

    /**
    * Whether the camera is enabled
    */
    @SerializedName("Camera")
    @Expose
    private Long Camera;

    /**
    * Whether the mic is enabled
    */
    @SerializedName("Mic")
    @Expose
    private Long Mic;

    /**
    * Whether the user is muted
    */
    @SerializedName("Silence")
    @Expose
    private Long Silence;

    /**
    * Number of questions answered by the user
    */
    @SerializedName("AnswerQuestions")
    @Expose
    private Long AnswerQuestions;

    /**
    * Number of hand raising times
    */
    @SerializedName("HandUps")
    @Expose
    private Long HandUps;

    /**
    * First time that the user entered the room, in UNIX timestamp format
    */
    @SerializedName("FirstJoinTimestamp")
    @Expose
    private Long FirstJoinTimestamp;

    /**
    * Last time that the user left the room, in UNIX timestamp format
    */
    @SerializedName("LastQuitTimestamp")
    @Expose
    private Long LastQuitTimestamp;

    /**
    * Number of rewards received
    */
    @SerializedName("Rewords")
    @Expose
    private Long Rewords;

    /**
    * The user’s IP address.
    */
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;

    /**
    * The user’s location.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * The user’s device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
    */
    @SerializedName("Device")
    @Expose
    private Long Device;

    /**
    * The number of times a user turned their mic on.
    */
    @SerializedName("PerMemberMicCount")
    @Expose
    private Long PerMemberMicCount;

    /**
    * The number of messages sent by a user.
    */
    @SerializedName("PerMemberMessageCount")
    @Expose
    private Long PerMemberMessageCount;

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
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Online duration, in seconds 
     * @return PresentTime Online duration, in seconds
     */
    public Long getPresentTime() {
        return this.PresentTime;
    }

    /**
     * Set Online duration, in seconds
     * @param PresentTime Online duration, in seconds
     */
    public void setPresentTime(Long PresentTime) {
        this.PresentTime = PresentTime;
    }

    /**
     * Get Whether the camera is enabled 
     * @return Camera Whether the camera is enabled
     */
    public Long getCamera() {
        return this.Camera;
    }

    /**
     * Set Whether the camera is enabled
     * @param Camera Whether the camera is enabled
     */
    public void setCamera(Long Camera) {
        this.Camera = Camera;
    }

    /**
     * Get Whether the mic is enabled 
     * @return Mic Whether the mic is enabled
     */
    public Long getMic() {
        return this.Mic;
    }

    /**
     * Set Whether the mic is enabled
     * @param Mic Whether the mic is enabled
     */
    public void setMic(Long Mic) {
        this.Mic = Mic;
    }

    /**
     * Get Whether the user is muted 
     * @return Silence Whether the user is muted
     */
    public Long getSilence() {
        return this.Silence;
    }

    /**
     * Set Whether the user is muted
     * @param Silence Whether the user is muted
     */
    public void setSilence(Long Silence) {
        this.Silence = Silence;
    }

    /**
     * Get Number of questions answered by the user 
     * @return AnswerQuestions Number of questions answered by the user
     */
    public Long getAnswerQuestions() {
        return this.AnswerQuestions;
    }

    /**
     * Set Number of questions answered by the user
     * @param AnswerQuestions Number of questions answered by the user
     */
    public void setAnswerQuestions(Long AnswerQuestions) {
        this.AnswerQuestions = AnswerQuestions;
    }

    /**
     * Get Number of hand raising times 
     * @return HandUps Number of hand raising times
     */
    public Long getHandUps() {
        return this.HandUps;
    }

    /**
     * Set Number of hand raising times
     * @param HandUps Number of hand raising times
     */
    public void setHandUps(Long HandUps) {
        this.HandUps = HandUps;
    }

    /**
     * Get First time that the user entered the room, in UNIX timestamp format 
     * @return FirstJoinTimestamp First time that the user entered the room, in UNIX timestamp format
     */
    public Long getFirstJoinTimestamp() {
        return this.FirstJoinTimestamp;
    }

    /**
     * Set First time that the user entered the room, in UNIX timestamp format
     * @param FirstJoinTimestamp First time that the user entered the room, in UNIX timestamp format
     */
    public void setFirstJoinTimestamp(Long FirstJoinTimestamp) {
        this.FirstJoinTimestamp = FirstJoinTimestamp;
    }

    /**
     * Get Last time that the user left the room, in UNIX timestamp format 
     * @return LastQuitTimestamp Last time that the user left the room, in UNIX timestamp format
     */
    public Long getLastQuitTimestamp() {
        return this.LastQuitTimestamp;
    }

    /**
     * Set Last time that the user left the room, in UNIX timestamp format
     * @param LastQuitTimestamp Last time that the user left the room, in UNIX timestamp format
     */
    public void setLastQuitTimestamp(Long LastQuitTimestamp) {
        this.LastQuitTimestamp = LastQuitTimestamp;
    }

    /**
     * Get Number of rewards received 
     * @return Rewords Number of rewards received
     */
    public Long getRewords() {
        return this.Rewords;
    }

    /**
     * Set Number of rewards received
     * @param Rewords Number of rewards received
     */
    public void setRewords(Long Rewords) {
        this.Rewords = Rewords;
    }

    /**
     * Get The user’s IP address. 
     * @return IPAddress The user’s IP address.
     */
    public String getIPAddress() {
        return this.IPAddress;
    }

    /**
     * Set The user’s IP address.
     * @param IPAddress The user’s IP address.
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    /**
     * Get The user’s location. 
     * @return Location The user’s location.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set The user’s location.
     * @param Location The user’s location.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get The user’s device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program. 
     * @return Device The user’s device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
     */
    public Long getDevice() {
        return this.Device;
    }

    /**
     * Set The user’s device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
     * @param Device The user’s device type. 0: Unknown; 1: Windows; 2: macOS; 3: Android; 4: iOS; 5: Web; 6: Mobile webpage; 7: Weixin Mini Program.
     */
    public void setDevice(Long Device) {
        this.Device = Device;
    }

    /**
     * Get The number of times a user turned their mic on. 
     * @return PerMemberMicCount The number of times a user turned their mic on.
     */
    public Long getPerMemberMicCount() {
        return this.PerMemberMicCount;
    }

    /**
     * Set The number of times a user turned their mic on.
     * @param PerMemberMicCount The number of times a user turned their mic on.
     */
    public void setPerMemberMicCount(Long PerMemberMicCount) {
        this.PerMemberMicCount = PerMemberMicCount;
    }

    /**
     * Get The number of messages sent by a user. 
     * @return PerMemberMessageCount The number of messages sent by a user.
     */
    public Long getPerMemberMessageCount() {
        return this.PerMemberMessageCount;
    }

    /**
     * Set The number of messages sent by a user.
     * @param PerMemberMessageCount The number of messages sent by a user.
     */
    public void setPerMemberMessageCount(Long PerMemberMessageCount) {
        this.PerMemberMessageCount = PerMemberMessageCount;
    }

    public MemberRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberRecord(MemberRecord source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PresentTime != null) {
            this.PresentTime = new Long(source.PresentTime);
        }
        if (source.Camera != null) {
            this.Camera = new Long(source.Camera);
        }
        if (source.Mic != null) {
            this.Mic = new Long(source.Mic);
        }
        if (source.Silence != null) {
            this.Silence = new Long(source.Silence);
        }
        if (source.AnswerQuestions != null) {
            this.AnswerQuestions = new Long(source.AnswerQuestions);
        }
        if (source.HandUps != null) {
            this.HandUps = new Long(source.HandUps);
        }
        if (source.FirstJoinTimestamp != null) {
            this.FirstJoinTimestamp = new Long(source.FirstJoinTimestamp);
        }
        if (source.LastQuitTimestamp != null) {
            this.LastQuitTimestamp = new Long(source.LastQuitTimestamp);
        }
        if (source.Rewords != null) {
            this.Rewords = new Long(source.Rewords);
        }
        if (source.IPAddress != null) {
            this.IPAddress = new String(source.IPAddress);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Device != null) {
            this.Device = new Long(source.Device);
        }
        if (source.PerMemberMicCount != null) {
            this.PerMemberMicCount = new Long(source.PerMemberMicCount);
        }
        if (source.PerMemberMessageCount != null) {
            this.PerMemberMessageCount = new Long(source.PerMemberMessageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PresentTime", this.PresentTime);
        this.setParamSimple(map, prefix + "Camera", this.Camera);
        this.setParamSimple(map, prefix + "Mic", this.Mic);
        this.setParamSimple(map, prefix + "Silence", this.Silence);
        this.setParamSimple(map, prefix + "AnswerQuestions", this.AnswerQuestions);
        this.setParamSimple(map, prefix + "HandUps", this.HandUps);
        this.setParamSimple(map, prefix + "FirstJoinTimestamp", this.FirstJoinTimestamp);
        this.setParamSimple(map, prefix + "LastQuitTimestamp", this.LastQuitTimestamp);
        this.setParamSimple(map, prefix + "Rewords", this.Rewords);
        this.setParamSimple(map, prefix + "IPAddress", this.IPAddress);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "PerMemberMicCount", this.PerMemberMicCount);
        this.setParamSimple(map, prefix + "PerMemberMessageCount", this.PerMemberMessageCount);

    }
}

