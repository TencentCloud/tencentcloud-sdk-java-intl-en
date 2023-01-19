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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskSimpleInfo extends AbstractModel{

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. Valid values: `WAITING` (waiting), `PROCESSING` (processing), `FINISH` (completed)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Video ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`ReduceMediaBitrate`: Bitrate reduction</li>
<li>`WechatDistribute`: Publishing to Weixin</li>
<li> `ReviewAudioVideo`: Moderation</li>
Task types for v2017:
<li>`Transcode`: Transcoding</li>
<li>`SnapshotByTimeOffset`: Screencapturing</li>
<li>`Concat`: Video splicing</li>
<li>`Clip`: Video clipping</li>
<li>`ImageSprites`: Image sprite generating</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been started yet, this field will be empty.
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * End time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been completed yet, this field will be empty.
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * ID used for deduplication if there was a request with the same ID in the last seven days.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, which is used to pass through the user request information.
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
     * Get Task status. Valid values: `WAITING` (waiting), `PROCESSING` (processing), `FINISH` (completed) 
     * @return Status Task status. Valid values: `WAITING` (waiting), `PROCESSING` (processing), `FINISH` (completed)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: `WAITING` (waiting), `PROCESSING` (processing), `FINISH` (completed)
     * @param Status Task status. Valid values: `WAITING` (waiting), `PROCESSING` (processing), `FINISH` (completed)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Video ID 
     * @return FileId Video ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Video ID
     * @param FileId Video ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`ReduceMediaBitrate`: Bitrate reduction</li>
<li>`WechatDistribute`: Publishing to Weixin</li>
<li> `ReviewAudioVideo`: Moderation</li>
Task types for v2017:
<li>`Transcode`: Transcoding</li>
<li>`SnapshotByTimeOffset`: Screencapturing</li>
<li>`Concat`: Video splicing</li>
<li>`Clip`: Video clipping</li>
<li>`ImageSprites`: Image sprite generating</li> 
     * @return TaskType The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`ReduceMediaBitrate`: Bitrate reduction</li>
<li>`WechatDistribute`: Publishing to Weixin</li>
<li> `ReviewAudioVideo`: Moderation</li>
Task types for v2017:
<li>`Transcode`: Transcoding</li>
<li>`SnapshotByTimeOffset`: Screencapturing</li>
<li>`Concat`: Video splicing</li>
<li>`Clip`: Video clipping</li>
<li>`ImageSprites`: Image sprite generating</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`ReduceMediaBitrate`: Bitrate reduction</li>
<li>`WechatDistribute`: Publishing to Weixin</li>
<li> `ReviewAudioVideo`: Moderation</li>
Task types for v2017:
<li>`Transcode`: Transcoding</li>
<li>`SnapshotByTimeOffset`: Screencapturing</li>
<li>`Concat`: Video splicing</li>
<li>`Clip`: Video clipping</li>
<li>`ImageSprites`: Image sprite generating</li>
     * @param TaskType The task type. Valid values:
<li>`Procedure`: Video processing</li>
<li>`EditMedia`: Video editing</li>
<li>`ReduceMediaBitrate`: Bitrate reduction</li>
<li>`WechatDistribute`: Publishing to Weixin</li>
<li> `ReviewAudioVideo`: Moderation</li>
Task types for v2017:
<li>`Transcode`: Transcoding</li>
<li>`SnapshotByTimeOffset`: Screencapturing</li>
<li>`Concat`: Video splicing</li>
<li>`Clip`: Video clipping</li>
<li>`ImageSprites`: Image sprite generating</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been started yet, this field will be empty. 
     * @return BeginProcessTime Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been started yet, this field will be empty.
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been started yet, this field will be empty.
     * @param BeginProcessTime Start time of task execution in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been started yet, this field will be empty.
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get End time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been completed yet, this field will be empty. 
     * @return FinishTime End time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been completed yet, this field will be empty.
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set End time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been completed yet, this field will be empty.
     * @param FinishTime End time of task in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). If the task has not been completed yet, this field will be empty.
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get ID used for deduplication if there was a request with the same ID in the last seven days. 
     * @return SessionId ID used for deduplication if there was a request with the same ID in the last seven days.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set ID used for deduplication if there was a request with the same ID in the last seven days.
     * @param SessionId ID used for deduplication if there was a request with the same ID in the last seven days.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, which is used to pass through the user request information. 
     * @return SessionContext Source context, which is used to pass through the user request information.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, which is used to pass through the user request information.
     * @param SessionContext Source context, which is used to pass through the user request information.
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

