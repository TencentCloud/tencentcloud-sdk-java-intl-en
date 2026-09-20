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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskSimpleInfo extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Valid values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed), ABORTED (Terminated).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Video ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Task type. Value:
<li>Procedure: video processing task;</li>
<li>EditMedia: video editing task;</li>
<li>ReduceMediaBitrate: bitrate reduction task;</li>
<li>WechatDistribute: publishing on WeChat task;</li>
<li>ReviewAudioVideo: audio/video moderation task;</li>
<li>MPSWorkflowTask: MPS video processing task.</li>
Task types compatible with the 2017 version:
<li>Transcode: video transcoding task;</li>
<li>SnapshotByTimeOffset: video screencapturing task;</li>
<li>Concat: video splicing task;</li>
<li>Clip: video clipping task;</li>
<li>ImageSprites: capture image sprite task.</li>

    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task execution start time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not started, this field is empty.
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * Task end time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task is not completed yet, this field is empty.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * An identifier for deduplication. If there has been a request with the same identifier within the past seven days.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to pass through user request information.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

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
     * Get Task status. Valid values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed), ABORTED (Terminated). 
     * @return Status Task status. Valid values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed), ABORTED (Terminated).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed), ABORTED (Terminated).
     * @param Status Task status. Valid values: WAITING (Waiting), PROCESSING (Processing), FINISH (Completed), ABORTED (Terminated).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Video ID. 
     * @return FileId Video ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Video ID.
     * @param FileId Video ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Task type. Value:
<li>Procedure: video processing task;</li>
<li>EditMedia: video editing task;</li>
<li>ReduceMediaBitrate: bitrate reduction task;</li>
<li>WechatDistribute: publishing on WeChat task;</li>
<li>ReviewAudioVideo: audio/video moderation task;</li>
<li>MPSWorkflowTask: MPS video processing task.</li>
Task types compatible with the 2017 version:
<li>Transcode: video transcoding task;</li>
<li>SnapshotByTimeOffset: video screencapturing task;</li>
<li>Concat: video splicing task;</li>
<li>Clip: video clipping task;</li>
<li>ImageSprites: capture image sprite task.</li>
 
     * @return TaskType Task type. Value:
<li>Procedure: video processing task;</li>
<li>EditMedia: video editing task;</li>
<li>ReduceMediaBitrate: bitrate reduction task;</li>
<li>WechatDistribute: publishing on WeChat task;</li>
<li>ReviewAudioVideo: audio/video moderation task;</li>
<li>MPSWorkflowTask: MPS video processing task.</li>
Task types compatible with the 2017 version:
<li>Transcode: video transcoding task;</li>
<li>SnapshotByTimeOffset: video screencapturing task;</li>
<li>Concat: video splicing task;</li>
<li>Clip: video clipping task;</li>
<li>ImageSprites: capture image sprite task.</li>

     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. Value:
<li>Procedure: video processing task;</li>
<li>EditMedia: video editing task;</li>
<li>ReduceMediaBitrate: bitrate reduction task;</li>
<li>WechatDistribute: publishing on WeChat task;</li>
<li>ReviewAudioVideo: audio/video moderation task;</li>
<li>MPSWorkflowTask: MPS video processing task.</li>
Task types compatible with the 2017 version:
<li>Transcode: video transcoding task;</li>
<li>SnapshotByTimeOffset: video screencapturing task;</li>
<li>Concat: video splicing task;</li>
<li>Clip: video clipping task;</li>
<li>ImageSprites: capture image sprite task.</li>

     * @param TaskType Task type. Value:
<li>Procedure: video processing task;</li>
<li>EditMedia: video editing task;</li>
<li>ReduceMediaBitrate: bitrate reduction task;</li>
<li>WechatDistribute: publishing on WeChat task;</li>
<li>ReviewAudioVideo: audio/video moderation task;</li>
<li>MPSWorkflowTask: MPS video processing task.</li>
Task types compatible with the 2017 version:
<li>Transcode: video transcoding task;</li>
<li>SnapshotByTimeOffset: video screencapturing task;</li>
<li>Concat: video splicing task;</li>
<li>Clip: video clipping task;</li>
<li>ImageSprites: capture image sprite task.</li>

     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Task creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Task creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Task creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task execution start time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not started, this field is empty. 
     * @return BeginProcessTime Task execution start time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not started, this field is empty.
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Task execution start time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not started, this field is empty.
     * @param BeginProcessTime Task execution start time in [ISO datetime format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not started, this field is empty.
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get Task end time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task is not completed yet, this field is empty. 
     * @return FinishTime Task end time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task is not completed yet, this field is empty.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Task end time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task is not completed yet, this field is empty.
     * @param FinishTime Task end time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). If the task is not completed yet, this field is empty.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get An identifier for deduplication. If there has been a request with the same identifier within the past seven days. 
     * @return SessionId An identifier for deduplication. If there has been a request with the same identifier within the past seven days.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set An identifier for deduplication. If there has been a request with the same identifier within the past seven days.
     * @param SessionId An identifier for deduplication. If there has been a request with the same identifier within the past seven days.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, used to pass through user request information. 
     * @return SessionContext Source context, used to pass through user request information.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information.
     * @param SessionContext Source context, used to pass through user request information.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public TaskSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskSimpleInfo(TaskSimpleInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

