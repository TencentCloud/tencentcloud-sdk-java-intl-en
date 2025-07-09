/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordTaskResult extends AbstractModel {

    /**
    * `AUTO`: Recording automatically stops. `USER_CALL`: The API for stopping recording is called.
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
    * Group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Actual recording start time.
    */
    @SerializedName("RecordStartTime")
    @Expose
    private Long RecordStartTime;

    /**
    * Recording end time.
    */
    @SerializedName("RecordStopTime")
    @Expose
    private Long RecordStopTime;

    /**
    * Recording duration.
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * List of video information.
    */
    @SerializedName("VideoInfos")
    @Expose
    private VideoInfo [] VideoInfos;

    /**
    * Omitted video durations.
    */
    @SerializedName("OmittedDurations")
    @Expose
    private OmittedDuration [] OmittedDurations;

    /**
    * Details.
    */
    @SerializedName("Details")
    @Expose
    private String Details;

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
     * Get `AUTO`: Recording automatically stops. `USER_CALL`: The API for stopping recording is called. 
     * @return FinishReason `AUTO`: Recording automatically stops. `USER_CALL`: The API for stopping recording is called.
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set `AUTO`: Recording automatically stops. `USER_CALL`: The API for stopping recording is called.
     * @param FinishReason `AUTO`: Recording automatically stops. `USER_CALL`: The API for stopping recording is called.
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
     * Get Group ID. 
     * @return GroupId Group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID.
     * @param GroupId Group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Actual recording start time. 
     * @return RecordStartTime Actual recording start time.
     */
    public Long getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set Actual recording start time.
     * @param RecordStartTime Actual recording start time.
     */
    public void setRecordStartTime(Long RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get Recording end time. 
     * @return RecordStopTime Recording end time.
     */
    public Long getRecordStopTime() {
        return this.RecordStopTime;
    }

    /**
     * Set Recording end time.
     * @param RecordStopTime Recording end time.
     */
    public void setRecordStopTime(Long RecordStopTime) {
        this.RecordStopTime = RecordStopTime;
    }

    /**
     * Get Recording duration. 
     * @return TotalTime Recording duration.
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set Recording duration.
     * @param TotalTime Recording duration.
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get List of video information. 
     * @return VideoInfos List of video information.
     */
    public VideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set List of video information.
     * @param VideoInfos List of video information.
     */
    public void setVideoInfos(VideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get Omitted video durations. 
     * @return OmittedDurations Omitted video durations.
     */
    public OmittedDuration [] getOmittedDurations() {
        return this.OmittedDurations;
    }

    /**
     * Set Omitted video durations.
     * @param OmittedDurations Omitted video durations.
     */
    public void setOmittedDurations(OmittedDuration [] OmittedDurations) {
        this.OmittedDurations = OmittedDurations;
    }

    /**
     * Get Details. 
     * @return Details Details.
     */
    public String getDetails() {
        return this.Details;
    }

    /**
     * Set Details.
     * @param Details Details.
     */
    public void setDetails(String Details) {
        this.Details = Details;
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

    public RecordTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordTaskResult(RecordTaskResult source) {
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
        if (source.RecordStartTime != null) {
            this.RecordStartTime = new Long(source.RecordStartTime);
        }
        if (source.RecordStopTime != null) {
            this.RecordStopTime = new Long(source.RecordStopTime);
        }
        if (source.TotalTime != null) {
            this.TotalTime = new Long(source.TotalTime);
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new VideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new VideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.OmittedDurations != null) {
            this.OmittedDurations = new OmittedDuration[source.OmittedDurations.length];
            for (int i = 0; i < source.OmittedDurations.length; i++) {
                this.OmittedDurations[i] = new OmittedDuration(source.OmittedDurations[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new String(source.Details);
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
        this.setParamSimple(map, prefix + "RecordStartTime", this.RecordStartTime);
        this.setParamSimple(map, prefix + "RecordStopTime", this.RecordStopTime);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "OmittedDurations.", this.OmittedDurations);
        this.setParamSimple(map, prefix + "Details", this.Details);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

