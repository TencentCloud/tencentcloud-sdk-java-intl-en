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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOnlineRecordResponse extends AbstractModel {

    /**
    * Recording stop reason
- AUTO: Recording automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping recording is called.
- EXCEPTION: An exception occurred.
- FORCE_STOP: Recording is forcibly stopped, which is usually because the recording has been paused for more than 90 minutes or has lasted for more than 24 hours.
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * ID of the recording task to be queried.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Recording task status
- PREPARED: preparing
- RECORDING: recording
- PAUSED: recording is paused.
- STOPPED: recording is stopped, and the recorded video is being processed and uploaded.
- FINISHED: the recorded video has been processed and uploaded, and the recording result is generated.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Room ID
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * Group ID of the whiteboard
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * ID of the recording user
    */
    @SerializedName("RecordUserId")
    @Expose
    private String RecordUserId;

    /**
    * Actual recording start time, which is a UNIX timestamp in seconds
    */
    @SerializedName("RecordStartTime")
    @Expose
    private Long RecordStartTime;

    /**
    * Actual recording stop time, which is a UNIX timestamp in seconds
    */
    @SerializedName("RecordStopTime")
    @Expose
    private Long RecordStopTime;

    /**
    * Total video playback duration, in milliseconds
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * Number of exceptions during recording
    */
    @SerializedName("ExceptionCnt")
    @Expose
    private Long ExceptionCnt;

    /**
    * Duration to be deleted in the spliced video. This parameter is valid only when the video splicing feature is enabled.
    */
    @SerializedName("OmittedDurations")
    @Expose
    private OmittedDuration [] OmittedDurations;

    /**
    * List of recorded videos
    */
    @SerializedName("VideoInfos")
    @Expose
    private VideoInfo [] VideoInfos;

    /**
    * 
    */
    @SerializedName("ReplayUrl")
    @Expose
    private String ReplayUrl;

    /**
    * Number of video stream interruptions during recording.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Interrupts")
    @Expose
    private Interrupt [] Interrupts;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Recording stop reason
- AUTO: Recording automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping recording is called.
- EXCEPTION: An exception occurred.
- FORCE_STOP: Recording is forcibly stopped, which is usually because the recording has been paused for more than 90 minutes or has lasted for more than 24 hours. 
     * @return FinishReason Recording stop reason
- AUTO: Recording automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping recording is called.
- EXCEPTION: An exception occurred.
- FORCE_STOP: Recording is forcibly stopped, which is usually because the recording has been paused for more than 90 minutes or has lasted for more than 24 hours.
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set Recording stop reason
- AUTO: Recording automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping recording is called.
- EXCEPTION: An exception occurred.
- FORCE_STOP: Recording is forcibly stopped, which is usually because the recording has been paused for more than 90 minutes or has lasted for more than 24 hours.
     * @param FinishReason Recording stop reason
- AUTO: Recording automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping recording is called.
- EXCEPTION: An exception occurred.
- FORCE_STOP: Recording is forcibly stopped, which is usually because the recording has been paused for more than 90 minutes or has lasted for more than 24 hours.
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get ID of the recording task to be queried. 
     * @return TaskId ID of the recording task to be queried.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the recording task to be queried.
     * @param TaskId ID of the recording task to be queried.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Recording task status
- PREPARED: preparing
- RECORDING: recording
- PAUSED: recording is paused.
- STOPPED: recording is stopped, and the recorded video is being processed and uploaded.
- FINISHED: the recorded video has been processed and uploaded, and the recording result is generated. 
     * @return Status Recording task status
- PREPARED: preparing
- RECORDING: recording
- PAUSED: recording is paused.
- STOPPED: recording is stopped, and the recorded video is being processed and uploaded.
- FINISHED: the recorded video has been processed and uploaded, and the recording result is generated.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Recording task status
- PREPARED: preparing
- RECORDING: recording
- PAUSED: recording is paused.
- STOPPED: recording is stopped, and the recorded video is being processed and uploaded.
- FINISHED: the recorded video has been processed and uploaded, and the recording result is generated.
     * @param Status Recording task status
- PREPARED: preparing
- RECORDING: recording
- PAUSED: recording is paused.
- STOPPED: recording is stopped, and the recorded video is being processed and uploaded.
- FINISHED: the recorded video has been processed and uploaded, and the recording result is generated.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Room ID 
     * @return RoomId Room ID
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID
     * @param RoomId Room ID
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Group ID of the whiteboard 
     * @return GroupId Group ID of the whiteboard
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID of the whiteboard
     * @param GroupId Group ID of the whiteboard
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get ID of the recording user 
     * @return RecordUserId ID of the recording user
     */
    public String getRecordUserId() {
        return this.RecordUserId;
    }

    /**
     * Set ID of the recording user
     * @param RecordUserId ID of the recording user
     */
    public void setRecordUserId(String RecordUserId) {
        this.RecordUserId = RecordUserId;
    }

    /**
     * Get Actual recording start time, which is a UNIX timestamp in seconds 
     * @return RecordStartTime Actual recording start time, which is a UNIX timestamp in seconds
     */
    public Long getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set Actual recording start time, which is a UNIX timestamp in seconds
     * @param RecordStartTime Actual recording start time, which is a UNIX timestamp in seconds
     */
    public void setRecordStartTime(Long RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get Actual recording stop time, which is a UNIX timestamp in seconds 
     * @return RecordStopTime Actual recording stop time, which is a UNIX timestamp in seconds
     */
    public Long getRecordStopTime() {
        return this.RecordStopTime;
    }

    /**
     * Set Actual recording stop time, which is a UNIX timestamp in seconds
     * @param RecordStopTime Actual recording stop time, which is a UNIX timestamp in seconds
     */
    public void setRecordStopTime(Long RecordStopTime) {
        this.RecordStopTime = RecordStopTime;
    }

    /**
     * Get Total video playback duration, in milliseconds 
     * @return TotalTime Total video playback duration, in milliseconds
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set Total video playback duration, in milliseconds
     * @param TotalTime Total video playback duration, in milliseconds
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get Number of exceptions during recording 
     * @return ExceptionCnt Number of exceptions during recording
     */
    public Long getExceptionCnt() {
        return this.ExceptionCnt;
    }

    /**
     * Set Number of exceptions during recording
     * @param ExceptionCnt Number of exceptions during recording
     */
    public void setExceptionCnt(Long ExceptionCnt) {
        this.ExceptionCnt = ExceptionCnt;
    }

    /**
     * Get Duration to be deleted in the spliced video. This parameter is valid only when the video splicing feature is enabled. 
     * @return OmittedDurations Duration to be deleted in the spliced video. This parameter is valid only when the video splicing feature is enabled.
     */
    public OmittedDuration [] getOmittedDurations() {
        return this.OmittedDurations;
    }

    /**
     * Set Duration to be deleted in the spliced video. This parameter is valid only when the video splicing feature is enabled.
     * @param OmittedDurations Duration to be deleted in the spliced video. This parameter is valid only when the video splicing feature is enabled.
     */
    public void setOmittedDurations(OmittedDuration [] OmittedDurations) {
        this.OmittedDurations = OmittedDurations;
    }

    /**
     * Get List of recorded videos 
     * @return VideoInfos List of recorded videos
     */
    public VideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set List of recorded videos
     * @param VideoInfos List of recorded videos
     */
    public void setVideoInfos(VideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get  
     * @return ReplayUrl 
     */
    public String getReplayUrl() {
        return this.ReplayUrl;
    }

    /**
     * Set 
     * @param ReplayUrl 
     */
    public void setReplayUrl(String ReplayUrl) {
        this.ReplayUrl = ReplayUrl;
    }

    /**
     * Get Number of video stream interruptions during recording.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Interrupts Number of video stream interruptions during recording.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public Interrupt [] getInterrupts() {
        return this.Interrupts;
    }

    /**
     * Set Number of video stream interruptions during recording.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Interrupts Number of video stream interruptions during recording.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setInterrupts(Interrupt [] Interrupts) {
        this.Interrupts = Interrupts;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeOnlineRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOnlineRecordResponse(DescribeOnlineRecordResponse source) {
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.RecordUserId != null) {
            this.RecordUserId = new String(source.RecordUserId);
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
        if (source.ExceptionCnt != null) {
            this.ExceptionCnt = new Long(source.ExceptionCnt);
        }
        if (source.OmittedDurations != null) {
            this.OmittedDurations = new OmittedDuration[source.OmittedDurations.length];
            for (int i = 0; i < source.OmittedDurations.length; i++) {
                this.OmittedDurations[i] = new OmittedDuration(source.OmittedDurations[i]);
            }
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new VideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new VideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.ReplayUrl != null) {
            this.ReplayUrl = new String(source.ReplayUrl);
        }
        if (source.Interrupts != null) {
            this.Interrupts = new Interrupt[source.Interrupts.length];
            for (int i = 0; i < source.Interrupts.length; i++) {
                this.Interrupts[i] = new Interrupt(source.Interrupts[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "RecordUserId", this.RecordUserId);
        this.setParamSimple(map, prefix + "RecordStartTime", this.RecordStartTime);
        this.setParamSimple(map, prefix + "RecordStopTime", this.RecordStopTime);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "ExceptionCnt", this.ExceptionCnt);
        this.setParamArrayObj(map, prefix + "OmittedDurations.", this.OmittedDurations);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamSimple(map, prefix + "ReplayUrl", this.ReplayUrl);
        this.setParamArrayObj(map, prefix + "Interrupts.", this.Interrupts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

