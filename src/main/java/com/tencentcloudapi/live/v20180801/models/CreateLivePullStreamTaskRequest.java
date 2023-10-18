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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLivePullStreamTaskRequest extends AbstractModel {

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
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
Supported file formats: FLV, MP4, HLS.
Supported protocols: HTTP, HTTPS, RTMP, RTMPS, RTSP, SRT.
Notes:
1. We recommend you use FLV files as the source. Poorly interleaved MP4 files may result in playback stuttering. You can also re-interleave your MP4 files before adding them as the source.
2. Do not use private network domains or malicious URLs. CSS will block accounts that do.
3. To avoid push and playback issues, make sure the source files are properly interleaved.
4. Supported video coding formats: H.264, H.265.
5. Supported audio coding format: AAC.
6. Use small video files, preferably not longer than one hour. Large files may take a long time to load or resume after pause. Relay may fail if the time consumed exceeds 15 seconds.
    */
    @SerializedName("SourceUrls")
    @Expose
    private String [] SourceUrls;

    /**
    * The push domain name.
The pulled stream is pushed to this domain.
Note: If the destination is not a CSS address and its format is different from that of CSS addresses, pass the full address to `ToUrl`. For details, see the description of the `ToUrl` parameter.
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
    * The operator.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * The push parameter.
This is a custom parameter carried during push.
Example:
bak=1&test=2
    */
    @SerializedName("PushArgs")
    @Expose
    private String PushArgs;

    /**
    * The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task

`TaskAlarm` indicates a warning event. `AlarmType` examples:
PullFileUnstable: Pull from video files is unstable.
PushStreamUnstable: Push is unstable.
PullFileFailed: Error pulling from video files.
PushStreamFailed: Push error.
FileEndEarly: The video file ended prematurely.
    */
    @SerializedName("CallbackEvents")
    @Expose
    private String [] CallbackEvents;

    /**
    * The number of times to loop video files. Default value: -1.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only when the source is video files.
    */
    @SerializedName("VodLoopTimes")
    @Expose
    private String VodLoopTimes;

    /**
    * The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Play the new videos after the current video is finished playing (the remaining videos in the old playlist will not be played).

This parameter is valid only if the source before the change is video files.
    */
    @SerializedName("VodRefreshType")
    @Expose
    private String VodRefreshType;

    /**
    * A custom callback URL.
Callbacks about pull and relay events will be sent to this URL.
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * Other parameters.
For example, you can use `ignore_region` to ignore the region passed in and assign a region based on load distribution.
    */
    @SerializedName("ExtraCmd")
    @Expose
    private String ExtraCmd;

    /**
    * The remarks for a task, not longer than 512 bytes.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * The complete destination URL.
If you specify this parameter, make sure you pass in an empty string for `DomainName`, `AppName`, and `StreamName`.

Note: Make sure that the expiration time of the signature is later than the task end time.
    */
    @SerializedName("ToUrl")
    @Expose
    private String ToUrl;

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
3. Supported image formats include PNG, JPG, and GIF.
    */
    @SerializedName("WatermarkList")
    @Expose
    private PullPushWatermarkInfo [] WatermarkList;

    /**
    * Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: If you enable local mode, MP4 files will be downloaded to local storage, and the local files will be used for push. This ensures more reliable push. Pushing a local file will incur additional fees.
    */
    @SerializedName("VodLocalMode")
    @Expose
    private Long VodLocalMode;

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
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
Supported file formats: FLV, MP4, HLS.
Supported protocols: HTTP, HTTPS, RTMP, RTMPS, RTSP, SRT.
Notes:
1. We recommend you use FLV files as the source. Poorly interleaved MP4 files may result in playback stuttering. You can also re-interleave your MP4 files before adding them as the source.
2. Do not use private network domains or malicious URLs. CSS will block accounts that do.
3. To avoid push and playback issues, make sure the source files are properly interleaved.
4. Supported video coding formats: H.264, H.265.
5. Supported audio coding format: AAC.
6. Use small video files, preferably not longer than one hour. Large files may take a long time to load or resume after pause. Relay may fail if the time consumed exceeds 15 seconds. 
     * @return SourceUrls The source URL(s).
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
Supported file formats: FLV, MP4, HLS.
Supported protocols: HTTP, HTTPS, RTMP, RTMPS, RTSP, SRT.
Notes:
1. We recommend you use FLV files as the source. Poorly interleaved MP4 files may result in playback stuttering. You can also re-interleave your MP4 files before adding them as the source.
2. Do not use private network domains or malicious URLs. CSS will block accounts that do.
3. To avoid push and playback issues, make sure the source files are properly interleaved.
4. Supported video coding formats: H.264, H.265.
5. Supported audio coding format: AAC.
6. Use small video files, preferably not longer than one hour. Large files may take a long time to load or resume after pause. Relay may fail if the time consumed exceeds 15 seconds.
     */
    public String [] getSourceUrls() {
        return this.SourceUrls;
    }

    /**
     * Set The source URL(s).
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
Supported file formats: FLV, MP4, HLS.
Supported protocols: HTTP, HTTPS, RTMP, RTMPS, RTSP, SRT.
Notes:
1. We recommend you use FLV files as the source. Poorly interleaved MP4 files may result in playback stuttering. You can also re-interleave your MP4 files before adding them as the source.
2. Do not use private network domains or malicious URLs. CSS will block accounts that do.
3. To avoid push and playback issues, make sure the source files are properly interleaved.
4. Supported video coding formats: H.264, H.265.
5. Supported audio coding format: AAC.
6. Use small video files, preferably not longer than one hour. Large files may take a long time to load or resume after pause. Relay may fail if the time consumed exceeds 15 seconds.
     * @param SourceUrls The source URL(s).
If `SourceType` is `PullLivePushLive`, you can specify only one source URL.
If `SourceType` is `PullVodPushLive`, you can specify at most 30 source URLs.
Supported file formats: FLV, MP4, HLS.
Supported protocols: HTTP, HTTPS, RTMP, RTMPS, RTSP, SRT.
Notes:
1. We recommend you use FLV files as the source. Poorly interleaved MP4 files may result in playback stuttering. You can also re-interleave your MP4 files before adding them as the source.
2. Do not use private network domains or malicious URLs. CSS will block accounts that do.
3. To avoid push and playback issues, make sure the source files are properly interleaved.
4. Supported video coding formats: H.264, H.265.
5. Supported audio coding format: AAC.
6. Use small video files, preferably not longer than one hour. Large files may take a long time to load or resume after pause. Relay may fail if the time consumed exceeds 15 seconds.
     */
    public void setSourceUrls(String [] SourceUrls) {
        this.SourceUrls = SourceUrls;
    }

    /**
     * Get The push domain name.
The pulled stream is pushed to this domain.
Note: If the destination is not a CSS address and its format is different from that of CSS addresses, pass the full address to `ToUrl`. For details, see the description of the `ToUrl` parameter. 
     * @return DomainName The push domain name.
The pulled stream is pushed to this domain.
Note: If the destination is not a CSS address and its format is different from that of CSS addresses, pass the full address to `ToUrl`. For details, see the description of the `ToUrl` parameter.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The push domain name.
The pulled stream is pushed to this domain.
Note: If the destination is not a CSS address and its format is different from that of CSS addresses, pass the full address to `ToUrl`. For details, see the description of the `ToUrl` parameter.
     * @param DomainName The push domain name.
The pulled stream is pushed to this domain.
Note: If the destination is not a CSS address and its format is different from that of CSS addresses, pass the full address to `ToUrl`. For details, see the description of the `ToUrl` parameter.
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
     * Get The push parameter.
This is a custom parameter carried during push.
Example:
bak=1&test=2 
     * @return PushArgs The push parameter.
This is a custom parameter carried during push.
Example:
bak=1&test=2
     */
    public String getPushArgs() {
        return this.PushArgs;
    }

    /**
     * Set The push parameter.
This is a custom parameter carried during push.
Example:
bak=1&test=2
     * @param PushArgs The push parameter.
This is a custom parameter carried during push.
Example:
bak=1&test=2
     */
    public void setPushArgs(String PushArgs) {
        this.PushArgs = PushArgs;
    }

    /**
     * Get The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task

`TaskAlarm` indicates a warning event. `AlarmType` examples:
PullFileUnstable: Pull from video files is unstable.
PushStreamUnstable: Push is unstable.
PullFileFailed: Error pulling from video files.
PushStreamFailed: Push error.
FileEndEarly: The video file ended prematurely. 
     * @return CallbackEvents The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task

`TaskAlarm` indicates a warning event. `AlarmType` examples:
PullFileUnstable: Pull from video files is unstable.
PushStreamUnstable: Push is unstable.
PullFileFailed: Error pulling from video files.
PushStreamFailed: Push error.
FileEndEarly: The video file ended prematurely.
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

`TaskAlarm` indicates a warning event. `AlarmType` examples:
PullFileUnstable: Pull from video files is unstable.
PushStreamUnstable: Push is unstable.
PullFileFailed: Error pulling from video files.
PushStreamFailed: Push error.
FileEndEarly: The video file ended prematurely.
     * @param CallbackEvents The events to listen for. If you do not pass this parameter, all events will be listened for.
TaskStart: Callback for starting a task
TaskExit: Callback for ending a task
VodSourceFileStart: Callback for starting to pull from video files
VodSourceFileFinish: Callback for stopping pulling from video files
ResetTaskConfig: Callback for modifying a task

`TaskAlarm` indicates a warning event. `AlarmType` examples:
PullFileUnstable: Pull from video files is unstable.
PushStreamUnstable: Push is unstable.
PullFileFailed: Error pulling from video files.
PushStreamFailed: Push error.
FileEndEarly: The video file ended prematurely.
     */
    public void setCallbackEvents(String [] CallbackEvents) {
        this.CallbackEvents = CallbackEvents;
    }

    /**
     * Get The number of times to loop video files. Default value: -1.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only when the source is video files. 
     * @return VodLoopTimes The number of times to loop video files. Default value: -1.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only when the source is video files.
     */
    public String getVodLoopTimes() {
        return this.VodLoopTimes;
    }

    /**
     * Set The number of times to loop video files. Default value: -1.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only when the source is video files.
     * @param VodLoopTimes The number of times to loop video files. Default value: -1.
-1: Loop indefinitely
0: Do not loop
> 0: The number of loop times. A task will end either when the videos are looped for the specified number of times or at the specified task end time, whichever is earlier.
This parameter is valid only when the source is video files.
     */
    public void setVodLoopTimes(String VodLoopTimes) {
        this.VodLoopTimes = VodLoopTimes;
    }

    /**
     * Get The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Play the new videos after the current video is finished playing (the remaining videos in the old playlist will not be played).

This parameter is valid only if the source before the change is video files. 
     * @return VodRefreshType The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Play the new videos after the current video is finished playing (the remaining videos in the old playlist will not be played).

This parameter is valid only if the source before the change is video files.
     */
    public String getVodRefreshType() {
        return this.VodRefreshType;
    }

    /**
     * Set The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Play the new videos after the current video is finished playing (the remaining videos in the old playlist will not be played).

This parameter is valid only if the source before the change is video files.
     * @param VodRefreshType The behavior after the source video files (`SourceUrls`) are changed.
ImmediateNewSource: Play the new videos immediately
ContinueBreakPoint: Play the new videos after the current video is finished playing (the remaining videos in the old playlist will not be played).

This parameter is valid only if the source before the change is video files.
     */
    public void setVodRefreshType(String VodRefreshType) {
        this.VodRefreshType = VodRefreshType;
    }

    /**
     * Get A custom callback URL.
Callbacks about pull and relay events will be sent to this URL. 
     * @return CallbackUrl A custom callback URL.
Callbacks about pull and relay events will be sent to this URL.
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set A custom callback URL.
Callbacks about pull and relay events will be sent to this URL.
     * @param CallbackUrl A custom callback URL.
Callbacks about pull and relay events will be sent to this URL.
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get Other parameters.
For example, you can use `ignore_region` to ignore the region passed in and assign a region based on load distribution. 
     * @return ExtraCmd Other parameters.
For example, you can use `ignore_region` to ignore the region passed in and assign a region based on load distribution.
     */
    public String getExtraCmd() {
        return this.ExtraCmd;
    }

    /**
     * Set Other parameters.
For example, you can use `ignore_region` to ignore the region passed in and assign a region based on load distribution.
     * @param ExtraCmd Other parameters.
For example, you can use `ignore_region` to ignore the region passed in and assign a region based on load distribution.
     */
    public void setExtraCmd(String ExtraCmd) {
        this.ExtraCmd = ExtraCmd;
    }

    /**
     * Get The remarks for a task, not longer than 512 bytes. 
     * @return Comment The remarks for a task, not longer than 512 bytes.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set The remarks for a task, not longer than 512 bytes.
     * @param Comment The remarks for a task, not longer than 512 bytes.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get The complete destination URL.
If you specify this parameter, make sure you pass in an empty string for `DomainName`, `AppName`, and `StreamName`.

Note: Make sure that the expiration time of the signature is later than the task end time. 
     * @return ToUrl The complete destination URL.
If you specify this parameter, make sure you pass in an empty string for `DomainName`, `AppName`, and `StreamName`.

Note: Make sure that the expiration time of the signature is later than the task end time.
     */
    public String getToUrl() {
        return this.ToUrl;
    }

    /**
     * Set The complete destination URL.
If you specify this parameter, make sure you pass in an empty string for `DomainName`, `AppName`, and `StreamName`.

Note: Make sure that the expiration time of the signature is later than the task end time.
     * @param ToUrl The complete destination URL.
If you specify this parameter, make sure you pass in an empty string for `DomainName`, `AppName`, and `StreamName`.

Note: Make sure that the expiration time of the signature is later than the task end time.
     */
    public void setToUrl(String ToUrl) {
        this.ToUrl = ToUrl;
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
3. Supported image formats include PNG, JPG, and GIF. 
     * @return WatermarkList The information of watermarks to add.
Notes:
1. You can add up to four watermarks to different locations of the video.
2. Make sure you use publicly accessible URLs for the watermark images.
3. Supported image formats include PNG, JPG, and GIF.
     */
    public PullPushWatermarkInfo [] getWatermarkList() {
        return this.WatermarkList;
    }

    /**
     * Set The information of watermarks to add.
Notes:
1. You can add up to four watermarks to different locations of the video.
2. Make sure you use publicly accessible URLs for the watermark images.
3. Supported image formats include PNG, JPG, and GIF.
     * @param WatermarkList The information of watermarks to add.
Notes:
1. You can add up to four watermarks to different locations of the video.
2. Make sure you use publicly accessible URLs for the watermark images.
3. Supported image formats include PNG, JPG, and GIF.
     */
    public void setWatermarkList(PullPushWatermarkInfo [] WatermarkList) {
        this.WatermarkList = WatermarkList;
    }

    /**
     * Get Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: If you enable local mode, MP4 files will be downloaded to local storage, and the local files will be used for push. This ensures more reliable push. Pushing a local file will incur additional fees. 
     * @return VodLocalMode Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: If you enable local mode, MP4 files will be downloaded to local storage, and the local files will be used for push. This ensures more reliable push. Pushing a local file will incur additional fees.
     */
    public Long getVodLocalMode() {
        return this.VodLocalMode;
    }

    /**
     * Set Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: If you enable local mode, MP4 files will be downloaded to local storage, and the local files will be used for push. This ensures more reliable push. Pushing a local file will incur additional fees.
     * @param VodLocalMode Whether to use local mode when the source type is video files. The default is `0`.
0: Do not use local mode
1: Use local mode
Note: If you enable local mode, MP4 files will be downloaded to local storage, and the local files will be used for push. This ensures more reliable push. Pushing a local file will incur additional fees.
     */
    public void setVodLocalMode(Long VodLocalMode) {
        this.VodLocalMode = VodLocalMode;
    }

    public CreateLivePullStreamTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLivePullStreamTaskRequest(CreateLivePullStreamTaskRequest source) {
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
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.PushArgs != null) {
            this.PushArgs = new String(source.PushArgs);
        }
        if (source.CallbackEvents != null) {
            this.CallbackEvents = new String[source.CallbackEvents.length];
            for (int i = 0; i < source.CallbackEvents.length; i++) {
                this.CallbackEvents[i] = new String(source.CallbackEvents[i]);
            }
        }
        if (source.VodLoopTimes != null) {
            this.VodLoopTimes = new String(source.VodLoopTimes);
        }
        if (source.VodRefreshType != null) {
            this.VodRefreshType = new String(source.VodRefreshType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ExtraCmd != null) {
            this.ExtraCmd = new String(source.ExtraCmd);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ToUrl != null) {
            this.ToUrl = new String(source.ToUrl);
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
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArraySimple(map, prefix + "SourceUrls.", this.SourceUrls);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "PushArgs", this.PushArgs);
        this.setParamArraySimple(map, prefix + "CallbackEvents.", this.CallbackEvents);
        this.setParamSimple(map, prefix + "VodLoopTimes", this.VodLoopTimes);
        this.setParamSimple(map, prefix + "VodRefreshType", this.VodRefreshType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ExtraCmd", this.ExtraCmd);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ToUrl", this.ToUrl);
        this.setParamSimple(map, prefix + "BackupSourceType", this.BackupSourceType);
        this.setParamSimple(map, prefix + "BackupSourceUrl", this.BackupSourceUrl);
        this.setParamArrayObj(map, prefix + "WatermarkList.", this.WatermarkList);
        this.setParamSimple(map, prefix + "VodLocalMode", this.VodLocalMode);

    }
}

