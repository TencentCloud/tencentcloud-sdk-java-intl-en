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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLivePullStreamTaskRequest extends AbstractModel{

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The operator.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * The source URL(s).
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
    */
    @SerializedName("SourceUrls")
    @Expose
    private String [] SourceUrls;

    /**
    * The start time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time. Notes:
1. The end time must be later than the start time.
2. The end time and start time must be later than the current time.
3. The end time and start time must be less than seven days apart.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The number of times to loop video files.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only if the source is video files.
    */
    @SerializedName("VodLoopTimes")
    @Expose
    private Long VodLoopTimes;

    /**
    * The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Finish the current video first and then pull from the new source.
This parameter is valid only if the source is video files.
    */
    @SerializedName("VodRefreshType")
    @Expose
    private String VodRefreshType;

    /**
    * Whether to enable or pause the task. Valid values:
enable
pause
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task
    */
    @SerializedName("CallbackEvents")
    @Expose
    private String [] CallbackEvents;

    /**
    * A custom callback URL.
Callbacks will be sent to this URL.
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * The index of the video to start from.
The value of this parameter cannot be smaller than 1 or larger than the number of elements in `SourceUrls`.
    */
    @SerializedName("FileIndex")
    @Expose
    private Long FileIndex;

    /**
    * The playback offset (seconds).
Notes:
1. This parameter should be used together with `FileIndex`.
    */
    @SerializedName("OffsetTime")
    @Expose
    private Long OffsetTime;

    /**
    * The remarks for the task.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * The backup source type.
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Notes:
1. Backup sources are supported only if the primary source type is live streaming.
2. When pull from the primary source is interrupted, the system will pull from the backup source.
3. If the backup source is a video file, each time the video is finished, the system will check if the primary source is recovered and will switch back if it is.
    */
    @SerializedName("BackupSourceType")
    @Expose
    private String BackupSourceType;

    /**
    * The URL of the backup source.
You can specify only one backup source URL.
    */
    @SerializedName("BackupSourceUrl")
    @Expose
    private String BackupSourceUrl;

    /**
    * The information of watermarks to add.
Notes:
1. You can add up to four watermarks to different locations of the video.
2. Make sure you use publicly accessible URLs for the watermark images.
3. Supported image formats include PNG and JPG.
4. If you change the watermark configuration of a task whose source is a list of video files, the new configuration will take effect for the next file in the list.
5. If you change the watermark configuration of a task whose source is a live stream, the new configuration will take effect immediately.
6. If you want to stop using watermarks, pass in an empty array.
7. Currently, animated watermarks are not supported.
    */
    @SerializedName("WatermarkList")
    @Expose
    private PullPushWatermarkInfo [] WatermarkList;

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
     * Get The operator. 
     * @return Operator The operator.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set The operator.
     * @param Operator The operator.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get The source URL(s).
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs. 
     * @return SourceUrls The source URL(s).
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
     */
    public String [] getSourceUrls() {
        return this.SourceUrls;
    }

    /**
     * Set The source URL(s).
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
     * @param SourceUrls The source URL(s).
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
     */
    public void setSourceUrls(String [] SourceUrls) {
        this.SourceUrls = SourceUrls;
    }

    /**
     * Get The start time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used. 
     * @return StartTime The start time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     * @param StartTime The start time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time. Notes:
1. The end time must be later than the start time.
2. The end time and start time must be later than the current time.
3. The end time and start time must be less than seven days apart.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used. 
     * @return EndTime The end time. Notes:
1. The end time must be later than the start time.
2. The end time and start time must be later than the current time.
3. The end time and start time must be less than seven days apart.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time. Notes:
1. The end time must be later than the start time.
2. The end time and start time must be later than the current time.
3. The end time and start time must be less than seven days apart.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     * @param EndTime The end time. Notes:
1. The end time must be later than the start time.
2. The end time and start time must be later than the current time.
3. The end time and start time must be less than seven days apart.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The number of times to loop video files.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only if the source is video files. 
     * @return VodLoopTimes The number of times to loop video files.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only if the source is video files.
     */
    public Long getVodLoopTimes() {
        return this.VodLoopTimes;
    }

    /**
     * Set The number of times to loop video files.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only if the source is video files.
     * @param VodLoopTimes The number of times to loop video files.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only if the source is video files.
     */
    public void setVodLoopTimes(Long VodLoopTimes) {
        this.VodLoopTimes = VodLoopTimes;
    }

    /**
     * Get The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Finish the current video first and then pull from the new source.
This parameter is valid only if the source is video files. 
     * @return VodRefreshType The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Finish the current video first and then pull from the new source.
This parameter is valid only if the source is video files.
     */
    public String getVodRefreshType() {
        return this.VodRefreshType;
    }

    /**
     * Set The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Finish the current video first and then pull from the new source.
This parameter is valid only if the source is video files.
     * @param VodRefreshType The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Finish the current video first and then pull from the new source.
This parameter is valid only if the source is video files.
     */
    public void setVodRefreshType(String VodRefreshType) {
        this.VodRefreshType = VodRefreshType;
    }

    /**
     * Get Whether to enable or pause the task. Valid values:
enable
pause 
     * @return Status Whether to enable or pause the task. Valid values:
enable
pause
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Whether to enable or pause the task. Valid values:
enable
pause
     * @param Status Whether to enable or pause the task. Valid values:
enable
pause
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task 
     * @return CallbackEvents The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task
     */
    public String [] getCallbackEvents() {
        return this.CallbackEvents;
    }

    /**
     * Set The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task
     * @param CallbackEvents The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task
     */
    public void setCallbackEvents(String [] CallbackEvents) {
        this.CallbackEvents = CallbackEvents;
    }

    /**
     * Get A custom callback URL.
Callbacks will be sent to this URL. 
     * @return CallbackUrl A custom callback URL.
Callbacks will be sent to this URL.
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set A custom callback URL.
Callbacks will be sent to this URL.
     * @param CallbackUrl A custom callback URL.
Callbacks will be sent to this URL.
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get The index of the video to start from.
The value of this parameter cannot be smaller than 1 or larger than the number of elements in `SourceUrls`. 
     * @return FileIndex The index of the video to start from.
The value of this parameter cannot be smaller than 1 or larger than the number of elements in `SourceUrls`.
     */
    public Long getFileIndex() {
        return this.FileIndex;
    }

    /**
     * Set The index of the video to start from.
The value of this parameter cannot be smaller than 1 or larger than the number of elements in `SourceUrls`.
     * @param FileIndex The index of the video to start from.
The value of this parameter cannot be smaller than 1 or larger than the number of elements in `SourceUrls`.
     */
    public void setFileIndex(Long FileIndex) {
        this.FileIndex = FileIndex;
    }

    /**
     * Get The playback offset (seconds).
Notes:
1. This parameter should be used together with `FileIndex`. 
     * @return OffsetTime The playback offset (seconds).
Notes:
1. This parameter should be used together with `FileIndex`.
     */
    public Long getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set The playback offset (seconds).
Notes:
1. This parameter should be used together with `FileIndex`.
     * @param OffsetTime The playback offset (seconds).
Notes:
1. This parameter should be used together with `FileIndex`.
     */
    public void setOffsetTime(Long OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get The remarks for the task. 
     * @return Comment The remarks for the task.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set The remarks for the task.
     * @param Comment The remarks for the task.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get The backup source type.
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Notes:
1. Backup sources are supported only if the primary source type is live streaming.
2. When pull from the primary source is interrupted, the system will pull from the backup source.
3. If the backup source is a video file, each time the video is finished, the system will check if the primary source is recovered and will switch back if it is. 
     * @return BackupSourceType The backup source type.
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Notes:
1. Backup sources are supported only if the primary source type is live streaming.
2. When pull from the primary source is interrupted, the system will pull from the backup source.
3. If the backup source is a video file, each time the video is finished, the system will check if the primary source is recovered and will switch back if it is.
     */
    public String getBackupSourceType() {
        return this.BackupSourceType;
    }

    /**
     * Set The backup source type.
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Notes:
1. Backup sources are supported only if the primary source type is live streaming.
2. When pull from the primary source is interrupted, the system will pull from the backup source.
3. If the backup source is a video file, each time the video is finished, the system will check if the primary source is recovered and will switch back if it is.
     * @param BackupSourceType The backup source type.
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Notes:
1. Backup sources are supported only if the primary source type is live streaming.
2. When pull from the primary source is interrupted, the system will pull from the backup source.
3. If the backup source is a video file, each time the video is finished, the system will check if the primary source is recovered and will switch back if it is.
     */
    public void setBackupSourceType(String BackupSourceType) {
        this.BackupSourceType = BackupSourceType;
    }

    /**
     * Get The URL of the backup source.
You can specify only one backup source URL. 
     * @return BackupSourceUrl The URL of the backup source.
You can specify only one backup source URL.
     */
    public String getBackupSourceUrl() {
        return this.BackupSourceUrl;
    }

    /**
     * Set The URL of the backup source.
You can specify only one backup source URL.
     * @param BackupSourceUrl The URL of the backup source.
You can specify only one backup source URL.
     */
    public void setBackupSourceUrl(String BackupSourceUrl) {
        this.BackupSourceUrl = BackupSourceUrl;
    }

    /**
     * Get The information of watermarks to add.
Notes:
1. You can add up to four watermarks to different locations of the video.
2. Make sure you use publicly accessible URLs for the watermark images.
3. Supported image formats include PNG and JPG.
4. If you change the watermark configuration of a task whose source is a list of video files, the new configuration will take effect for the next file in the list.
5. If you change the watermark configuration of a task whose source is a live stream, the new configuration will take effect immediately.
6. If you want to stop using watermarks, pass in an empty array.
7. Currently, animated watermarks are not supported. 
     * @return WatermarkList The information of watermarks to add.
Notes:
1. You can add up to four watermarks to different locations of the video.
2. Make sure you use publicly accessible URLs for the watermark images.
3. Supported image formats include PNG and JPG.
4. If you change the watermark configuration of a task whose source is a list of video files, the new configuration will take effect for the next file in the list.
5. If you change the watermark configuration of a task whose source is a live stream, the new configuration will take effect immediately.
6. If you want to stop using watermarks, pass in an empty array.
7. Currently, animated watermarks are not supported.
     */
    public PullPushWatermarkInfo [] getWatermarkList() {
        return this.WatermarkList;
    }

    /**
     * Set The information of watermarks to add.
Notes:
1. You can add up to four watermarks to different locations of the video.
2. Make sure you use publicly accessible URLs for the watermark images.
3. Supported image formats include PNG and JPG.
4. If you change the watermark configuration of a task whose source is a list of video files, the new configuration will take effect for the next file in the list.
5. If you change the watermark configuration of a task whose source is a live stream, the new configuration will take effect immediately.
6. If you want to stop using watermarks, pass in an empty array.
7. Currently, animated watermarks are not supported.
     * @param WatermarkList The information of watermarks to add.
Notes:
1. You can add up to four watermarks to different locations of the video.
2. Make sure you use publicly accessible URLs for the watermark images.
3. Supported image formats include PNG and JPG.
4. If you change the watermark configuration of a task whose source is a list of video files, the new configuration will take effect for the next file in the list.
5. If you change the watermark configuration of a task whose source is a live stream, the new configuration will take effect immediately.
6. If you want to stop using watermarks, pass in an empty array.
7. Currently, animated watermarks are not supported.
     */
    public void setWatermarkList(PullPushWatermarkInfo [] WatermarkList) {
        this.WatermarkList = WatermarkList;
    }

    public ModifyLivePullStreamTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLivePullStreamTaskRequest(ModifyLivePullStreamTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.SourceUrls != null) {
            this.SourceUrls = new String[source.SourceUrls.length];
            for (int i = 0; i < source.SourceUrls.length; i++) {
                this.SourceUrls[i] = new String(source.SourceUrls[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.VodLoopTimes != null) {
            this.VodLoopTimes = new Long(source.VodLoopTimes);
        }
        if (source.VodRefreshType != null) {
            this.VodRefreshType = new String(source.VodRefreshType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CallbackEvents != null) {
            this.CallbackEvents = new String[source.CallbackEvents.length];
            for (int i = 0; i < source.CallbackEvents.length; i++) {
                this.CallbackEvents[i] = new String(source.CallbackEvents[i]);
            }
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.FileIndex != null) {
            this.FileIndex = new Long(source.FileIndex);
        }
        if (source.OffsetTime != null) {
            this.OffsetTime = new Long(source.OffsetTime);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.BackupSourceType != null) {
            this.BackupSourceType = new String(source.BackupSourceType);
        }
        if (source.BackupSourceUrl != null) {
            this.BackupSourceUrl = new String(source.BackupSourceUrl);
        }
        if (source.WatermarkList != null) {
            this.WatermarkList = new PullPushWatermarkInfo[source.WatermarkList.length];
            for (int i = 0; i < source.WatermarkList.length; i++) {
                this.WatermarkList[i] = new PullPushWatermarkInfo(source.WatermarkList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "SourceUrls.", this.SourceUrls);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "VodLoopTimes", this.VodLoopTimes);
        this.setParamSimple(map, prefix + "VodRefreshType", this.VodRefreshType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "CallbackEvents.", this.CallbackEvents);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "FileIndex", this.FileIndex);
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "BackupSourceType", this.BackupSourceType);
        this.setParamSimple(map, prefix + "BackupSourceUrl", this.BackupSourceUrl);
        this.setParamArrayObj(map, prefix + "WatermarkList.", this.WatermarkList);

    }
}

