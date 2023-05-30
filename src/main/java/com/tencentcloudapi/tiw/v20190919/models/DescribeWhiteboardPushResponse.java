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

public class DescribeWhiteboardPushResponse extends AbstractModel{

    /**
    * Reason for push stop.
- AUTO: Pushing automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping pushing is called.
- EXCEPTION: An exception occurred.
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * ID of the whiteboard push task.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Status of the push task.
- PREPARED: Push in preparation (including entering the room and starting the push service).
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * Group ID of the whiteboard.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * User ID of the push task.
    */
    @SerializedName("PushUserId")
    @Expose
    private String PushUserId;

    /**
    * Actual push start time, which is a Unix timestamp in seconds.
    */
    @SerializedName("PushStartTime")
    @Expose
    private Long PushStartTime;

    /**
    * Actual push stop time, which is a Unix timestamp in seconds.
    */
    @SerializedName("PushStopTime")
    @Expose
    private Long PushStopTime;

    /**
    * Number of exceptions during push.
    */
    @SerializedName("ExceptionCnt")
    @Expose
    private Long ExceptionCnt;

    /**
    * IM timestamp corresponding to the first frame of the whiteboard push video. The timestamp is used for time synchronization between IM messages and the whiteboard push video during playback.
    */
    @SerializedName("IMSyncTime")
    @Expose
    private Long IMSyncTime;

    /**
    * Result information of the backup push task.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Backup")
    @Expose
    private String Backup;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Reason for push stop.
- AUTO: Pushing automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping pushing is called.
- EXCEPTION: An exception occurred. 
     * @return FinishReason Reason for push stop.
- AUTO: Pushing automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping pushing is called.
- EXCEPTION: An exception occurred.
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set Reason for push stop.
- AUTO: Pushing automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping pushing is called.
- EXCEPTION: An exception occurred.
     * @param FinishReason Reason for push stop.
- AUTO: Pushing automatically stops because no upstream audio/video or whiteboard operation occurs in the room for a long time.
- USER_CALL: The API for stopping pushing is called.
- EXCEPTION: An exception occurred.
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get ID of the whiteboard push task. 
     * @return TaskId ID of the whiteboard push task.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the whiteboard push task.
     * @param TaskId ID of the whiteboard push task.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Status of the push task.
- PREPARED: Push in preparation (including entering the room and starting the push service).
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped. 
     * @return Status Status of the push task.
- PREPARED: Push in preparation (including entering the room and starting the push service).
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the push task.
- PREPARED: Push in preparation (including entering the room and starting the push service).
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped.
     * @param Status Status of the push task.
- PREPARED: Push in preparation (including entering the room and starting the push service).
- PUSHING: Pushing in progress.
- STOPPED: Pushing stopped.
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Group ID of the whiteboard. 
     * @return GroupId Group ID of the whiteboard.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID of the whiteboard.
     * @param GroupId Group ID of the whiteboard.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get User ID of the push task. 
     * @return PushUserId User ID of the push task.
     */
    public String getPushUserId() {
        return this.PushUserId;
    }

    /**
     * Set User ID of the push task.
     * @param PushUserId User ID of the push task.
     */
    public void setPushUserId(String PushUserId) {
        this.PushUserId = PushUserId;
    }

    /**
     * Get Actual push start time, which is a Unix timestamp in seconds. 
     * @return PushStartTime Actual push start time, which is a Unix timestamp in seconds.
     */
    public Long getPushStartTime() {
        return this.PushStartTime;
    }

    /**
     * Set Actual push start time, which is a Unix timestamp in seconds.
     * @param PushStartTime Actual push start time, which is a Unix timestamp in seconds.
     */
    public void setPushStartTime(Long PushStartTime) {
        this.PushStartTime = PushStartTime;
    }

    /**
     * Get Actual push stop time, which is a Unix timestamp in seconds. 
     * @return PushStopTime Actual push stop time, which is a Unix timestamp in seconds.
     */
    public Long getPushStopTime() {
        return this.PushStopTime;
    }

    /**
     * Set Actual push stop time, which is a Unix timestamp in seconds.
     * @param PushStopTime Actual push stop time, which is a Unix timestamp in seconds.
     */
    public void setPushStopTime(Long PushStopTime) {
        this.PushStopTime = PushStopTime;
    }

    /**
     * Get Number of exceptions during push. 
     * @return ExceptionCnt Number of exceptions during push.
     */
    public Long getExceptionCnt() {
        return this.ExceptionCnt;
    }

    /**
     * Set Number of exceptions during push.
     * @param ExceptionCnt Number of exceptions during push.
     */
    public void setExceptionCnt(Long ExceptionCnt) {
        this.ExceptionCnt = ExceptionCnt;
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
     * Get Result information of the backup push task.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Backup Result information of the backup push task.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getBackup() {
        return this.Backup;
    }

    /**
     * Set Result information of the backup push task.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Backup Result information of the backup push task.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setBackup(String Backup) {
        this.Backup = Backup;
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

    public DescribeWhiteboardPushResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWhiteboardPushResponse(DescribeWhiteboardPushResponse source) {
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
        if (source.PushUserId != null) {
            this.PushUserId = new String(source.PushUserId);
        }
        if (source.PushStartTime != null) {
            this.PushStartTime = new Long(source.PushStartTime);
        }
        if (source.PushStopTime != null) {
            this.PushStopTime = new Long(source.PushStopTime);
        }
        if (source.ExceptionCnt != null) {
            this.ExceptionCnt = new Long(source.ExceptionCnt);
        }
        if (source.IMSyncTime != null) {
            this.IMSyncTime = new Long(source.IMSyncTime);
        }
        if (source.Backup != null) {
            this.Backup = new String(source.Backup);
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
        this.setParamSimple(map, prefix + "PushUserId", this.PushUserId);
        this.setParamSimple(map, prefix + "PushStartTime", this.PushStartTime);
        this.setParamSimple(map, prefix + "PushStopTime", this.PushStopTime);
        this.setParamSimple(map, prefix + "ExceptionCnt", this.ExceptionCnt);
        this.setParamSimple(map, prefix + "IMSyncTime", this.IMSyncTime);
        this.setParamSimple(map, prefix + "Backup", this.Backup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

