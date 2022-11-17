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

public class PullStreamTaskInfo extends AbstractModel{

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
PullPicPushLive: Images
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * The source URL(s).
If `SourceType` is `PullLiveToLive`, there can be only one source URL.
If `SourceType` is `PullVodToLive`, there can be at most 10 source URLs.
    */
    @SerializedName("SourceUrls")
    @Expose
    private String [] SourceUrls;

    /**
    * The push domain name.
The pulled stream is pushed to this domain.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The application to push to.
The pulled stream is pushed to this application.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The stream name.
The pulled stream is pushed under this name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The push parameter.
A custom push parameter.
    */
    @SerializedName("PushArgs")
    @Expose
    private String PushArgs;

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
    * The region of the source (please choose the nearest region).
ap-beijing: North China (Beijing)
ap-shanghai: East China (Shanghai)
ap-guangzhou: South China (Guangzhou)
ap-mumbai: India
    */
    @SerializedName("Region")
    @Expose
    private String Region;

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
    * The task creation time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The last updated time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The task creator.
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * The operator of the last update.
    */
    @SerializedName("UpdateBy")
    @Expose
    private String UpdateBy;

    /**
    * The callback URL.
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * The events to listen for.
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
    * Note: This parameter is not returned currently.
The information of the last callback.
    */
    @SerializedName("CallbackInfo")
    @Expose
    private String CallbackInfo;

    /**
    * Note: This parameter is not returned currently.
Error message.
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * The task status.
enable: Enabled
pause: Paused
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Note: This parameter is returned only if one task is queried.
The latest pull information.
The information includes the source URL, offset, and report time.
    */
    @SerializedName("RecentPullInfo")
    @Expose
    private RecentPullInfo RecentPullInfo;

    /**
    * The remarks for the task.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * The backup source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupSourceType")
    @Expose
    private String BackupSourceType;

    /**
    * The URL of the backup source.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BackupSourceUrl")
    @Expose
    private String BackupSourceUrl;

    /**
    * The information of watermarks to add.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WatermarkList")
    @Expose
    private PullPushWatermarkInfo [] WatermarkList;

    /**
    * Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VodLocalMode")
    @Expose
    private Long VodLocalMode;

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
     * Get The source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
PullPicPushLive: Images 
     * @return SourceType The source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
PullPicPushLive: Images
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set The source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
PullPicPushLive: Images
     * @param SourceType The source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
PullPicPushLive: Images
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get The source URL(s).
If `SourceType` is `PullLiveToLive`, there can be only one source URL.
If `SourceType` is `PullVodToLive`, there can be at most 10 source URLs. 
     * @return SourceUrls The source URL(s).
If `SourceType` is `PullLiveToLive`, there can be only one source URL.
If `SourceType` is `PullVodToLive`, there can be at most 10 source URLs.
     */
    public String [] getSourceUrls() {
        return this.SourceUrls;
    }

    /**
     * Set The source URL(s).
If `SourceType` is `PullLiveToLive`, there can be only one source URL.
If `SourceType` is `PullVodToLive`, there can be at most 10 source URLs.
     * @param SourceUrls The source URL(s).
If `SourceType` is `PullLiveToLive`, there can be only one source URL.
If `SourceType` is `PullVodToLive`, there can be at most 10 source URLs.
     */
    public void setSourceUrls(String [] SourceUrls) {
        this.SourceUrls = SourceUrls;
    }

    /**
     * Get The push domain name.
The pulled stream is pushed to this domain. 
     * @return DomainName The push domain name.
The pulled stream is pushed to this domain.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The push domain name.
The pulled stream is pushed to this domain.
     * @param DomainName The push domain name.
The pulled stream is pushed to this domain.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The application to push to.
The pulled stream is pushed to this application. 
     * @return AppName The application to push to.
The pulled stream is pushed to this application.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The application to push to.
The pulled stream is pushed to this application.
     * @param AppName The application to push to.
The pulled stream is pushed to this application.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The stream name.
The pulled stream is pushed under this name. 
     * @return StreamName The stream name.
The pulled stream is pushed under this name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The stream name.
The pulled stream is pushed under this name.
     * @param StreamName The stream name.
The pulled stream is pushed under this name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The push parameter.
A custom push parameter. 
     * @return PushArgs The push parameter.
A custom push parameter.
     */
    public String getPushArgs() {
        return this.PushArgs;
    }

    /**
     * Set The push parameter.
A custom push parameter.
     * @param PushArgs The push parameter.
A custom push parameter.
     */
    public void setPushArgs(String PushArgs) {
        this.PushArgs = PushArgs;
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
     * Get The region of the source (please choose the nearest region).
ap-beijing: North China (Beijing)
ap-shanghai: East China (Shanghai)
ap-guangzhou: South China (Guangzhou)
ap-mumbai: India 
     * @return Region The region of the source (please choose the nearest region).
ap-beijing: North China (Beijing)
ap-shanghai: East China (Shanghai)
ap-guangzhou: South China (Guangzhou)
ap-mumbai: India
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region of the source (please choose the nearest region).
ap-beijing: North China (Beijing)
ap-shanghai: East China (Shanghai)
ap-guangzhou: South China (Guangzhou)
ap-mumbai: India
     * @param Region The region of the source (please choose the nearest region).
ap-beijing: North China (Beijing)
ap-shanghai: East China (Shanghai)
ap-guangzhou: South China (Guangzhou)
ap-mumbai: India
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get The task creation time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used. 
     * @return CreateTime The task creation time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The task creation time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     * @param CreateTime The task creation time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last updated time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used. 
     * @return UpdateTime The last updated time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The last updated time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     * @param UpdateTime The last updated time.
It must be in UTC format.
Example: 2019-01-08T10:00:00Z.
Note: Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The task creator. 
     * @return CreateBy The task creator.
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set The task creator.
     * @param CreateBy The task creator.
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get The operator of the last update. 
     * @return UpdateBy The operator of the last update.
     */
    public String getUpdateBy() {
        return this.UpdateBy;
    }

    /**
     * Set The operator of the last update.
     * @param UpdateBy The operator of the last update.
     */
    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    /**
     * Get The callback URL. 
     * @return CallbackUrl The callback URL.
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set The callback URL.
     * @param CallbackUrl The callback URL.
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get The events to listen for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task 
     * @return CallbackEvents The events to listen for.
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
     * Set The events to listen for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task
     * @param CallbackEvents The events to listen for.
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
     * Get Note: This parameter is not returned currently.
The information of the last callback. 
     * @return CallbackInfo Note: This parameter is not returned currently.
The information of the last callback.
     */
    public String getCallbackInfo() {
        return this.CallbackInfo;
    }

    /**
     * Set Note: This parameter is not returned currently.
The information of the last callback.
     * @param CallbackInfo Note: This parameter is not returned currently.
The information of the last callback.
     */
    public void setCallbackInfo(String CallbackInfo) {
        this.CallbackInfo = CallbackInfo;
    }

    /**
     * Get Note: This parameter is not returned currently.
Error message. 
     * @return ErrorInfo Note: This parameter is not returned currently.
Error message.
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set Note: This parameter is not returned currently.
Error message.
     * @param ErrorInfo Note: This parameter is not returned currently.
Error message.
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get The task status.
enable: Enabled
pause: Paused 
     * @return Status The task status.
enable: Enabled
pause: Paused
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task status.
enable: Enabled
pause: Paused
     * @param Status The task status.
enable: Enabled
pause: Paused
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Note: This parameter is returned only if one task is queried.
The latest pull information.
The information includes the source URL, offset, and report time. 
     * @return RecentPullInfo Note: This parameter is returned only if one task is queried.
The latest pull information.
The information includes the source URL, offset, and report time.
     */
    public RecentPullInfo getRecentPullInfo() {
        return this.RecentPullInfo;
    }

    /**
     * Set Note: This parameter is returned only if one task is queried.
The latest pull information.
The information includes the source URL, offset, and report time.
     * @param RecentPullInfo Note: This parameter is returned only if one task is queried.
The latest pull information.
The information includes the source URL, offset, and report time.
     */
    public void setRecentPullInfo(RecentPullInfo RecentPullInfo) {
        this.RecentPullInfo = RecentPullInfo;
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
     * Get The backup source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupSourceType The backup source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupSourceType() {
        return this.BackupSourceType;
    }

    /**
     * Set The backup source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupSourceType The backup source type. Valid values:
PullLivePushLive: Live streaming
PullVodPushLive: Video files
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupSourceType(String BackupSourceType) {
        this.BackupSourceType = BackupSourceType;
    }

    /**
     * Get The URL of the backup source.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BackupSourceUrl The URL of the backup source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBackupSourceUrl() {
        return this.BackupSourceUrl;
    }

    /**
     * Set The URL of the backup source.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BackupSourceUrl The URL of the backup source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBackupSourceUrl(String BackupSourceUrl) {
        this.BackupSourceUrl = BackupSourceUrl;
    }

    /**
     * Get The information of watermarks to add.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WatermarkList The information of watermarks to add.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PullPushWatermarkInfo [] getWatermarkList() {
        return this.WatermarkList;
    }

    /**
     * Set The information of watermarks to add.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WatermarkList The information of watermarks to add.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWatermarkList(PullPushWatermarkInfo [] WatermarkList) {
        this.WatermarkList = WatermarkList;
    }

    /**
     * Get Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VodLocalMode Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVodLocalMode() {
        return this.VodLocalMode;
    }

    /**
     * Set Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VodLocalMode Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVodLocalMode(Long VodLocalMode) {
        this.VodLocalMode = VodLocalMode;
    }

    public PullStreamTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullStreamTaskInfo(PullStreamTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceUrls != null) {
            this.SourceUrls = new String[source.SourceUrls.length];
            for (int i = 0; i < source.SourceUrls.length; i++) {
                this.SourceUrls[i] = new String(source.SourceUrls[i]);
            }
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.PushArgs != null) {
            this.PushArgs = new String(source.PushArgs);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VodLoopTimes != null) {
            this.VodLoopTimes = new Long(source.VodLoopTimes);
        }
        if (source.VodRefreshType != null) {
            this.VodRefreshType = new String(source.VodRefreshType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.UpdateBy != null) {
            this.UpdateBy = new String(source.UpdateBy);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CallbackEvents != null) {
            this.CallbackEvents = new String[source.CallbackEvents.length];
            for (int i = 0; i < source.CallbackEvents.length; i++) {
                this.CallbackEvents[i] = new String(source.CallbackEvents[i]);
            }
        }
        if (source.CallbackInfo != null) {
            this.CallbackInfo = new String(source.CallbackInfo);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RecentPullInfo != null) {
            this.RecentPullInfo = new RecentPullInfo(source.RecentPullInfo);
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
        if (source.VodLocalMode != null) {
            this.VodLocalMode = new Long(source.VodLocalMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArraySimple(map, prefix + "SourceUrls.", this.SourceUrls);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "PushArgs", this.PushArgs);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VodLoopTimes", this.VodLoopTimes);
        this.setParamSimple(map, prefix + "VodRefreshType", this.VodRefreshType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "UpdateBy", this.UpdateBy);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArraySimple(map, prefix + "CallbackEvents.", this.CallbackEvents);
        this.setParamSimple(map, prefix + "CallbackInfo", this.CallbackInfo);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "RecentPullInfo.", this.RecentPullInfo);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "BackupSourceType", this.BackupSourceType);
        this.setParamSimple(map, prefix + "BackupSourceUrl", this.BackupSourceUrl);
        this.setParamArrayObj(map, prefix + "WatermarkList.", this.WatermarkList);
        this.setParamSimple(map, prefix + "VodLocalMode", this.VodLocalMode);

    }
}

