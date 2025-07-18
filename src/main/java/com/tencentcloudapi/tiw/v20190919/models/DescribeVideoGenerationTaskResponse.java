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

public class DescribeVideoGenerationTaskResponse extends AbstractModel {

    /**
    * Group ID corresponding to the task.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Room ID corresponding to the task.
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Disused.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Status of the recording video generation task. Valid values:
- QUEUED: Queuing.
- PROCESSING: Video generation in progress.
- FINISHED: Video generation finished. (To determine whether the task succeeded or failed, check the error code and message.)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Total video playback duration. Unit: milliseconds.
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * Disused. Use the `VideoInfoList` parameter.
    */
    @SerializedName("VideoInfos")
    @Expose
    private VideoInfo VideoInfos;

    /**
    * List of videos generated by the recording video generation tasks.
    */
    @SerializedName("VideoInfoList")
    @Expose
    private VideoInfo [] VideoInfoList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Group ID corresponding to the task. 
     * @return GroupId Group ID corresponding to the task.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID corresponding to the task.
     * @param GroupId Group ID corresponding to the task.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Room ID corresponding to the task. 
     * @return RoomId Room ID corresponding to the task.
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID corresponding to the task.
     * @param RoomId Room ID corresponding to the task.
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Disused. 
     * @return Progress Disused.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Disused.
     * @param Progress Disused.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Status of the recording video generation task. Valid values:
- QUEUED: Queuing.
- PROCESSING: Video generation in progress.
- FINISHED: Video generation finished. (To determine whether the task succeeded or failed, check the error code and message.) 
     * @return Status Status of the recording video generation task. Valid values:
- QUEUED: Queuing.
- PROCESSING: Video generation in progress.
- FINISHED: Video generation finished. (To determine whether the task succeeded or failed, check the error code and message.)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the recording video generation task. Valid values:
- QUEUED: Queuing.
- PROCESSING: Video generation in progress.
- FINISHED: Video generation finished. (To determine whether the task succeeded or failed, check the error code and message.)
     * @param Status Status of the recording video generation task. Valid values:
- QUEUED: Queuing.
- PROCESSING: Video generation in progress.
- FINISHED: Video generation finished. (To determine whether the task succeeded or failed, check the error code and message.)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Total video playback duration. Unit: milliseconds. 
     * @return TotalTime Total video playback duration. Unit: milliseconds.
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set Total video playback duration. Unit: milliseconds.
     * @param TotalTime Total video playback duration. Unit: milliseconds.
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get Disused. Use the `VideoInfoList` parameter. 
     * @return VideoInfos Disused. Use the `VideoInfoList` parameter.
     */
    public VideoInfo getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set Disused. Use the `VideoInfoList` parameter.
     * @param VideoInfos Disused. Use the `VideoInfoList` parameter.
     */
    public void setVideoInfos(VideoInfo VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get List of videos generated by the recording video generation tasks. 
     * @return VideoInfoList List of videos generated by the recording video generation tasks.
     */
    public VideoInfo [] getVideoInfoList() {
        return this.VideoInfoList;
    }

    /**
     * Set List of videos generated by the recording video generation tasks.
     * @param VideoInfoList List of videos generated by the recording video generation tasks.
     */
    public void setVideoInfoList(VideoInfo [] VideoInfoList) {
        this.VideoInfoList = VideoInfoList;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVideoGenerationTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoGenerationTaskResponse(DescribeVideoGenerationTaskResponse source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TotalTime != null) {
            this.TotalTime = new Long(source.TotalTime);
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new VideoInfo(source.VideoInfos);
        }
        if (source.VideoInfoList != null) {
            this.VideoInfoList = new VideoInfo[source.VideoInfoList.length];
            for (int i = 0; i < source.VideoInfoList.length; i++) {
                this.VideoInfoList[i] = new VideoInfo(source.VideoInfoList[i]);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "VideoInfoList.", this.VideoInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

