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

public class CreateTroubleInfoRequest extends AbstractModel{

    /**
    * Application ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * Room ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * Teacher user ID
    */
    @SerializedName("TeacherUserId")
    @Expose
    private String TeacherUserId;

    /**
    * Student user ID
    */
    @SerializedName("StudentUserId")
    @Expose
    private String StudentUserId;

    /**
    * ID of the user (teacher or student) with exception.
    */
    @SerializedName("TroubleUserId")
    @Expose
    private String TroubleUserId;

    /**
    * Exception type.
1: exceptional video
2: exceptional audio
3: exceptional video and audio
5: exceptional room entry
4: course switch
6: help seeking
7: problem feedback
8: complaint
    */
    @SerializedName("TroubleType")
    @Expose
    private Long TroubleType;

    /**
    * UNIX timestamp when the exception occurred in seconds.
    */
    @SerializedName("TroubleTime")
    @Expose
    private Long TroubleTime;

    /**
    * Exception details
    */
    @SerializedName("TroubleMsg")
    @Expose
    private String TroubleMsg;

    /**
     * Get Application ID 
     * @return SdkAppId Application ID
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID
     * @param SdkAppId Application ID
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Room ID 
     * @return RoomId Room ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID
     * @param RoomId Room ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Teacher user ID 
     * @return TeacherUserId Teacher user ID
     */
    public String getTeacherUserId() {
        return this.TeacherUserId;
    }

    /**
     * Set Teacher user ID
     * @param TeacherUserId Teacher user ID
     */
    public void setTeacherUserId(String TeacherUserId) {
        this.TeacherUserId = TeacherUserId;
    }

    /**
     * Get Student user ID 
     * @return StudentUserId Student user ID
     */
    public String getStudentUserId() {
        return this.StudentUserId;
    }

    /**
     * Set Student user ID
     * @param StudentUserId Student user ID
     */
    public void setStudentUserId(String StudentUserId) {
        this.StudentUserId = StudentUserId;
    }

    /**
     * Get ID of the user (teacher or student) with exception. 
     * @return TroubleUserId ID of the user (teacher or student) with exception.
     */
    public String getTroubleUserId() {
        return this.TroubleUserId;
    }

    /**
     * Set ID of the user (teacher or student) with exception.
     * @param TroubleUserId ID of the user (teacher or student) with exception.
     */
    public void setTroubleUserId(String TroubleUserId) {
        this.TroubleUserId = TroubleUserId;
    }

    /**
     * Get Exception type.
1: exceptional video
2: exceptional audio
3: exceptional video and audio
5: exceptional room entry
4: course switch
6: help seeking
7: problem feedback
8: complaint 
     * @return TroubleType Exception type.
1: exceptional video
2: exceptional audio
3: exceptional video and audio
5: exceptional room entry
4: course switch
6: help seeking
7: problem feedback
8: complaint
     */
    public Long getTroubleType() {
        return this.TroubleType;
    }

    /**
     * Set Exception type.
1: exceptional video
2: exceptional audio
3: exceptional video and audio
5: exceptional room entry
4: course switch
6: help seeking
7: problem feedback
8: complaint
     * @param TroubleType Exception type.
1: exceptional video
2: exceptional audio
3: exceptional video and audio
5: exceptional room entry
4: course switch
6: help seeking
7: problem feedback
8: complaint
     */
    public void setTroubleType(Long TroubleType) {
        this.TroubleType = TroubleType;
    }

    /**
     * Get UNIX timestamp when the exception occurred in seconds. 
     * @return TroubleTime UNIX timestamp when the exception occurred in seconds.
     */
    public Long getTroubleTime() {
        return this.TroubleTime;
    }

    /**
     * Set UNIX timestamp when the exception occurred in seconds.
     * @param TroubleTime UNIX timestamp when the exception occurred in seconds.
     */
    public void setTroubleTime(Long TroubleTime) {
        this.TroubleTime = TroubleTime;
    }

    /**
     * Get Exception details 
     * @return TroubleMsg Exception details
     */
    public String getTroubleMsg() {
        return this.TroubleMsg;
    }

    /**
     * Set Exception details
     * @param TroubleMsg Exception details
     */
    public void setTroubleMsg(String TroubleMsg) {
        this.TroubleMsg = TroubleMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "TeacherUserId", this.TeacherUserId);
        this.setParamSimple(map, prefix + "StudentUserId", this.StudentUserId);
        this.setParamSimple(map, prefix + "TroubleUserId", this.TroubleUserId);
        this.setParamSimple(map, prefix + "TroubleType", this.TroubleType);
        this.setParamSimple(map, prefix + "TroubleTime", this.TroubleTime);
        this.setParamSimple(map, prefix + "TroubleMsg", this.TroubleMsg);

    }
}

