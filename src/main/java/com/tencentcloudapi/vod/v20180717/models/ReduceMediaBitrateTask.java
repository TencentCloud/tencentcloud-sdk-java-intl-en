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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReduceMediaBitrateTask extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The task flow status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The ID of the media file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The name of the media file.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * The address of the media file.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * The execution status and result of the bitrate reduction task.
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private ReduceMediaBitrateMediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * The task priority, which can be a value from -10 to 10.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * The notification mode for the change of task status. Valid values:
<li>Finish: Send a notification after the task is completed.</li>
<li>None: Do not send status change notifications for this task.</li>
    */
    @SerializedName("TasksNotifyMode")
    @Expose
    private String TasksNotifyMode;

    /**
    * The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get The task ID. 
     * @return TaskId The task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID.
     * @param TaskId The task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The task flow status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li> 
     * @return Status The task flow status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task flow status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     * @param Status The task flow status. Valid values:
<li>PROCESSING</li>
<li>FINISH</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The ID of the media file. 
     * @return FileId The ID of the media file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The ID of the media file.
     * @param FileId The ID of the media file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The name of the media file. 
     * @return FileName The name of the media file.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set The name of the media file.
     * @param FileName The name of the media file.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get The address of the media file. 
     * @return FileUrl The address of the media file.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set The address of the media file.
     * @param FileUrl The address of the media file.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetaData The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetaData The metadata of the source video.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get The execution status and result of the bitrate reduction task. 
     * @return MediaProcessResultSet The execution status and result of the bitrate reduction task.
     */
    public ReduceMediaBitrateMediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * Set The execution status and result of the bitrate reduction task.
     * @param MediaProcessResultSet The execution status and result of the bitrate reduction task.
     */
    public void setMediaProcessResultSet(ReduceMediaBitrateMediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * Get The task priority, which can be a value from -10 to 10. 
     * @return TasksPriority The task priority, which can be a value from -10 to 10.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set The task priority, which can be a value from -10 to 10.
     * @param TasksPriority The task priority, which can be a value from -10 to 10.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get The notification mode for the change of task status. Valid values:
<li>Finish: Send a notification after the task is completed.</li>
<li>None: Do not send status change notifications for this task.</li> 
     * @return TasksNotifyMode The notification mode for the change of task status. Valid values:
<li>Finish: Send a notification after the task is completed.</li>
<li>None: Do not send status change notifications for this task.</li>
     */
    public String getTasksNotifyMode() {
        return this.TasksNotifyMode;
    }

    /**
     * Set The notification mode for the change of task status. Valid values:
<li>Finish: Send a notification after the task is completed.</li>
<li>None: Do not send status change notifications for this task.</li>
     * @param TasksNotifyMode The notification mode for the change of task status. Valid values:
<li>Finish: Send a notification after the task is completed.</li>
<li>None: Do not send status change notifications for this task.</li>
     */
    public void setTasksNotifyMode(String TasksNotifyMode) {
        this.TasksNotifyMode = TasksNotifyMode;
    }

    /**
     * Get The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters. 
     * @return SessionContext The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters.
     * @param SessionContext The source context, which is used to pass through user request information. The `ProcedureStateChanged` callback will return the value of this parameter. It can contain up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified. 
     * @return SessionId The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     * @param SessionId The session ID, which is used for de-duplication. If there was a request with the same session ID in the last seven days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public ReduceMediaBitrateTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReduceMediaBitrateTask(ReduceMediaBitrateTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.MediaProcessResultSet != null) {
            this.MediaProcessResultSet = new ReduceMediaBitrateMediaProcessTaskResult[source.MediaProcessResultSet.length];
            for (int i = 0; i < source.MediaProcessResultSet.length; i++) {
                this.MediaProcessResultSet[i] = new ReduceMediaBitrateMediaProcessTaskResult(source.MediaProcessResultSet[i]);
            }
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.TasksNotifyMode != null) {
            this.TasksNotifyMode = new String(source.TasksNotifyMode);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "MediaProcessResultSet.", this.MediaProcessResultSet);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "TasksNotifyMode", this.TasksNotifyMode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

