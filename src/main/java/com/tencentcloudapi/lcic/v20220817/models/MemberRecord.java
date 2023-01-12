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

    }
}

