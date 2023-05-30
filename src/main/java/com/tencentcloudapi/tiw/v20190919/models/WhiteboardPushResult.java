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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteboardPushResult extends AbstractModel{

    /**
    * `AUTO`: Pushing automatically stops. `USER_CALL`: The API for stopping pushing is called.
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * Number of exceptions.
    */
    @SerializedName("ExceptionCnt")
    @Expose
    private Long ExceptionCnt;

    /**
    * Room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * IM group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Actual push start time.
    */
    @SerializedName("PushStartTime")
    @Expose
    private Long PushStartTime;

    /**
    * Push end time.
    */
    @SerializedName("PushStopTime")
    @Expose
    private Long PushStopTime;

    /**
    * IM timestamp corresponding to the first frame of the whiteboard push video. The timestamp is used for time synchronization between IM messages and the whiteboard push video during playback.
    */
    @SerializedName("IMSyncTime")
    @Expose
    private Long IMSyncTime;

    /**
    * Task execution error code.
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * Error message.
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get `AUTO`: Pushing automatically stops. `USER_CALL`: The API for stopping pushing is called. 
     * @return FinishReason `AUTO`: Pushing automatically stops. `USER_CALL`: The API for stopping pushing is called.
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set `AUTO`: Pushing automatically stops. `USER_CALL`: The API for stopping pushing is called.
     * @param FinishReason `AUTO`: Pushing automatically stops. `USER_CALL`: The API for stopping pushing is called.
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get Number of exceptions. 
     * @return ExceptionCnt Number of exceptions.
     */
    public Long getExceptionCnt() {
        return this.ExceptionCnt;
    }

    /**
     * Set Number of exceptions.
     * @param ExceptionCnt Number of exceptions.
     */
    public void setExceptionCnt(Long ExceptionCnt) {
        this.ExceptionCnt = ExceptionCnt;
    }

    /**
     * Get Room ID. 
     * @return RoomId Room ID.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID.
     * @param RoomId Room ID.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get IM group ID. 
     * @return GroupId IM group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set IM group ID.
     * @param GroupId IM group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Actual push start time. 
     * @return PushStartTime Actual push start time.
     */
    public Long getPushStartTime() {
        return this.PushStartTime;
    }

    /**
     * Set Actual push start time.
     * @param PushStartTime Actual push start time.
     */
    public void setPushStartTime(Long PushStartTime) {
        this.PushStartTime = PushStartTime;
    }

    /**
     * Get Push end time. 
     * @return PushStopTime Push end time.
     */
    public Long getPushStopTime() {
        return this.PushStopTime;
    }

    /**
     * Set Push end time.
     * @param PushStopTime Push end time.
     */
    public void setPushStopTime(Long PushStopTime) {
        this.PushStopTime = PushStopTime;
    }

    /**
     * Get IM timestamp corresponding to the first frame of the whiteboard push video. The timestamp is used for time synchronization between IM messages and the whiteboard push video during playback. 
     * @return IMSyncTime IM timestamp corresponding to the first frame of the whiteboard push video. The timestamp is used for time synchronization between IM messages and the whiteboard push video during playback.
     */
    public Long getIMSyncTime() {
        return this.IMSyncTime;
    }

    /**
     * Set IM timestamp corresponding to the first frame of the whiteboard push video. The timestamp is used for time synchronization between IM messages and the whiteboard push video during playback.
     * @param IMSyncTime IM timestamp corresponding to the first frame of the whiteboard push video. The timestamp is used for time synchronization between IM messages and the whiteboard push video during playback.
     */
    public void setIMSyncTime(Long IMSyncTime) {
        this.IMSyncTime = IMSyncTime;
    }

    /**
     * Get Task execution error code. 
     * @return ErrorCode Task execution error code.
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Task execution error code.
     * @param ErrorCode Task execution error code.
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Error message. 
     * @return ErrorMsg Error message.
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set Error message.
     * @param ErrorMsg Error message.
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public WhiteboardPushResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteboardPushResult(WhiteboardPushResult source) {
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.ExceptionCnt != null) {
            this.ExceptionCnt = new Long(source.ExceptionCnt);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PushStartTime != null) {
            this.PushStartTime = new Long(source.PushStartTime);
        }
        if (source.PushStopTime != null) {
            this.PushStopTime = new Long(source.PushStopTime);
        }
        if (source.IMSyncTime != null) {
            this.IMSyncTime = new Long(source.IMSyncTime);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamSimple(map, prefix + "ExceptionCnt", this.ExceptionCnt);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PushStartTime", this.PushStartTime);
        this.setParamSimple(map, prefix + "PushStopTime", this.PushStopTime);
        this.setParamSimple(map, prefix + "IMSyncTime", this.IMSyncTime);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

