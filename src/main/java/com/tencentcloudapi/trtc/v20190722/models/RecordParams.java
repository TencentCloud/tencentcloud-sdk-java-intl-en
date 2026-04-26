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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordParams extends AbstractModel {

    /**
    * Recording mode:.
1: single stream recording, record the audio and video of the subscribed UserId in the room separately, and upload the recording files to cloud storage.
2: mixed-stream recording. mix the audio and video of the subscribed UserId in the room into an audio-video file and upload the recording file to cloud storage.
    */
    @SerializedName("RecordMode")
    @Expose
    private Long RecordMode;

    /**
    * Recording stops automatically when there is no host inside the room for a duration exceeding MaxIdleTime. measurement unit: second. default value: 30 seconds. the value must be greater than or equal to 5 seconds and less than or equal to 86400 seconds (24 hours).
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * Media stream type for recording.
0: recording audio and video streams (default).
1: record audio streams only.
2: record video stream only.
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * Specifies the allowlist or blocklist for the subscription stream.
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeStreamUserIds SubscribeStreamUserIds;

    /**
    * Output file format (valid when stored in third-party storage such as COS). 0: (default) output file is in hls format. 1: output file format is hls+mp4. 2: output file format is hls+aac. 3: output file format is mp4. 4: output file format is aac.

This parameter is invalid when storing in VOD. when storing in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).
    */
    @SerializedName("OutputFormat")
    @Expose
    private Long OutputFormat;

    /**
    * In single-stream recording mode, determine whether to merge the user's audio and video. 0: do not merge the audio and video of a stream (default). 1: merge the audio and video of a stream into one ts. in mixed-stream recording, this parameter is not required, and the audio and video are merged by default.
    */
    @SerializedName("AvMerge")
    @Expose
    private Long AvMerge;

    /**
    * If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
    * Specify recording streams. 0: mainstream + auxiliary stream (default); 1: mainstream; 2: auxiliary stream.
    */
    @SerializedName("MediaId")
    @Expose
    private Long MediaId;

    /**
    * Specifies the type of frame to fill when the upstream video stream stops:
- 0: Fill with the last frame (freeze the last video frame)
- 1: Fill with black frames
    */
    @SerializedName("FillType")
    @Expose
    private Long FillType;

    /**
    * Specifies whether the recording task subscribes to the stream published by the Mixed Stream Robot. 

- 1: Subscribe. 
- 0: Do not subscribe (default).
> Note: 
When this option is enabled, it is recommended to use the "Subscription Allowlist." Avoid subscribing to both the stream published by the Mixed Stream Robot and the streams published by the hosts simultaneously; otherwise, it will result in audio echoing (duplicate audio) in the recorded file.
    */
    @SerializedName("SubscribeAbility")
    @Expose
    private Long SubscribeAbility;

    /**
     * Get Recording mode:.
1: single stream recording, record the audio and video of the subscribed UserId in the room separately, and upload the recording files to cloud storage.
2: mixed-stream recording. mix the audio and video of the subscribed UserId in the room into an audio-video file and upload the recording file to cloud storage. 
     * @return RecordMode Recording mode:.
1: single stream recording, record the audio and video of the subscribed UserId in the room separately, and upload the recording files to cloud storage.
2: mixed-stream recording. mix the audio and video of the subscribed UserId in the room into an audio-video file and upload the recording file to cloud storage.
     */
    public Long getRecordMode() {
        return this.RecordMode;
    }

    /**
     * Set Recording mode:.
1: single stream recording, record the audio and video of the subscribed UserId in the room separately, and upload the recording files to cloud storage.
2: mixed-stream recording. mix the audio and video of the subscribed UserId in the room into an audio-video file and upload the recording file to cloud storage.
     * @param RecordMode Recording mode:.
1: single stream recording, record the audio and video of the subscribed UserId in the room separately, and upload the recording files to cloud storage.
2: mixed-stream recording. mix the audio and video of the subscribed UserId in the room into an audio-video file and upload the recording file to cloud storage.
     */
    public void setRecordMode(Long RecordMode) {
        this.RecordMode = RecordMode;
    }

    /**
     * Get Recording stops automatically when there is no host inside the room for a duration exceeding MaxIdleTime. measurement unit: second. default value: 30 seconds. the value must be greater than or equal to 5 seconds and less than or equal to 86400 seconds (24 hours). 
     * @return MaxIdleTime Recording stops automatically when there is no host inside the room for a duration exceeding MaxIdleTime. measurement unit: second. default value: 30 seconds. the value must be greater than or equal to 5 seconds and less than or equal to 86400 seconds (24 hours).
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set Recording stops automatically when there is no host inside the room for a duration exceeding MaxIdleTime. measurement unit: second. default value: 30 seconds. the value must be greater than or equal to 5 seconds and less than or equal to 86400 seconds (24 hours).
     * @param MaxIdleTime Recording stops automatically when there is no host inside the room for a duration exceeding MaxIdleTime. measurement unit: second. default value: 30 seconds. the value must be greater than or equal to 5 seconds and less than or equal to 86400 seconds (24 hours).
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get Media stream type for recording.
0: recording audio and video streams (default).
1: record audio streams only.
2: record video stream only. 
     * @return StreamType Media stream type for recording.
0: recording audio and video streams (default).
1: record audio streams only.
2: record video stream only.
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set Media stream type for recording.
0: recording audio and video streams (default).
1: record audio streams only.
2: record video stream only.
     * @param StreamType Media stream type for recording.
0: recording audio and video streams (default).
1: record audio streams only.
2: record video stream only.
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Specifies the allowlist or blocklist for the subscription stream. 
     * @return SubscribeStreamUserIds Specifies the allowlist or blocklist for the subscription stream.
     */
    public SubscribeStreamUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set Specifies the allowlist or blocklist for the subscription stream.
     * @param SubscribeStreamUserIds Specifies the allowlist or blocklist for the subscription stream.
     */
    public void setSubscribeStreamUserIds(SubscribeStreamUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    /**
     * Get Output file format (valid when stored in third-party storage such as COS). 0: (default) output file is in hls format. 1: output file format is hls+mp4. 2: output file format is hls+aac. 3: output file format is mp4. 4: output file format is aac.

This parameter is invalid when storing in VOD. when storing in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod). 
     * @return OutputFormat Output file format (valid when stored in third-party storage such as COS). 0: (default) output file is in hls format. 1: output file format is hls+mp4. 2: output file format is hls+aac. 3: output file format is mp4. 4: output file format is aac.

This parameter is invalid when storing in VOD. when storing in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).
     */
    public Long getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set Output file format (valid when stored in third-party storage such as COS). 0: (default) output file is in hls format. 1: output file format is hls+mp4. 2: output file format is hls+aac. 3: output file format is mp4. 4: output file format is aac.

This parameter is invalid when storing in VOD. when storing in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).
     * @param OutputFormat Output file format (valid when stored in third-party storage such as COS). 0: (default) output file is in hls format. 1: output file format is hls+mp4. 2: output file format is hls+aac. 3: output file format is mp4. 4: output file format is aac.

This parameter is invalid when storing in VOD. when storing in VOD, set MediaType in TencentVod (https://www.tencentcloud.comom/document/api/647/44055?from_cn_redirect=1#TencentVod).
     */
    public void setOutputFormat(Long OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get In single-stream recording mode, determine whether to merge the user's audio and video. 0: do not merge the audio and video of a stream (default). 1: merge the audio and video of a stream into one ts. in mixed-stream recording, this parameter is not required, and the audio and video are merged by default. 
     * @return AvMerge In single-stream recording mode, determine whether to merge the user's audio and video. 0: do not merge the audio and video of a stream (default). 1: merge the audio and video of a stream into one ts. in mixed-stream recording, this parameter is not required, and the audio and video are merged by default.
     */
    public Long getAvMerge() {
        return this.AvMerge;
    }

    /**
     * Set In single-stream recording mode, determine whether to merge the user's audio and video. 0: do not merge the audio and video of a stream (default). 1: merge the audio and video of a stream into one ts. in mixed-stream recording, this parameter is not required, and the audio and video are merged by default.
     * @param AvMerge In single-stream recording mode, determine whether to merge the user's audio and video. 0: do not merge the audio and video of a stream (default). 1: merge the audio and video of a stream into one ts. in mixed-stream recording, this parameter is not required, and the audio and video are merged by default.
     */
    public void setAvMerge(Long AvMerge) {
        this.AvMerge = AvMerge;
    }

    /**
     * Get If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective. 
     * @return MaxMediaFileDuration If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
     * @param MaxMediaFileDuration If the file format is aac or mp4, the system will automatically split the video file when the length limit is exceeded. measurement unit: minute. defaults to 1440 min (24h). value range: 1-1440. [single file limit is 2G. if file size exceeds 2G or recording duration exceeds 24h, the file will be automatically split.].
Hls format recording. this parameter is not effective.
     */
    public void setMaxMediaFileDuration(Long MaxMediaFileDuration) {
        this.MaxMediaFileDuration = MaxMediaFileDuration;
    }

    /**
     * Get Specify recording streams. 0: mainstream + auxiliary stream (default); 1: mainstream; 2: auxiliary stream. 
     * @return MediaId Specify recording streams. 0: mainstream + auxiliary stream (default); 1: mainstream; 2: auxiliary stream.
     */
    public Long getMediaId() {
        return this.MediaId;
    }

    /**
     * Set Specify recording streams. 0: mainstream + auxiliary stream (default); 1: mainstream; 2: auxiliary stream.
     * @param MediaId Specify recording streams. 0: mainstream + auxiliary stream (default); 1: mainstream; 2: auxiliary stream.
     */
    public void setMediaId(Long MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get Specifies the type of frame to fill when the upstream video stream stops:
- 0: Fill with the last frame (freeze the last video frame)
- 1: Fill with black frames 
     * @return FillType Specifies the type of frame to fill when the upstream video stream stops:
- 0: Fill with the last frame (freeze the last video frame)
- 1: Fill with black frames
     */
    public Long getFillType() {
        return this.FillType;
    }

    /**
     * Set Specifies the type of frame to fill when the upstream video stream stops:
- 0: Fill with the last frame (freeze the last video frame)
- 1: Fill with black frames
     * @param FillType Specifies the type of frame to fill when the upstream video stream stops:
- 0: Fill with the last frame (freeze the last video frame)
- 1: Fill with black frames
     */
    public void setFillType(Long FillType) {
        this.FillType = FillType;
    }

    /**
     * Get Specifies whether the recording task subscribes to the stream published by the Mixed Stream Robot. 

- 1: Subscribe. 
- 0: Do not subscribe (default).
> Note: 
When this option is enabled, it is recommended to use the "Subscription Allowlist." Avoid subscribing to both the stream published by the Mixed Stream Robot and the streams published by the hosts simultaneously; otherwise, it will result in audio echoing (duplicate audio) in the recorded file. 
     * @return SubscribeAbility Specifies whether the recording task subscribes to the stream published by the Mixed Stream Robot. 

- 1: Subscribe. 
- 0: Do not subscribe (default).
> Note: 
When this option is enabled, it is recommended to use the "Subscription Allowlist." Avoid subscribing to both the stream published by the Mixed Stream Robot and the streams published by the hosts simultaneously; otherwise, it will result in audio echoing (duplicate audio) in the recorded file.
     */
    public Long getSubscribeAbility() {
        return this.SubscribeAbility;
    }

    /**
     * Set Specifies whether the recording task subscribes to the stream published by the Mixed Stream Robot. 

- 1: Subscribe. 
- 0: Do not subscribe (default).
> Note: 
When this option is enabled, it is recommended to use the "Subscription Allowlist." Avoid subscribing to both the stream published by the Mixed Stream Robot and the streams published by the hosts simultaneously; otherwise, it will result in audio echoing (duplicate audio) in the recorded file.
     * @param SubscribeAbility Specifies whether the recording task subscribes to the stream published by the Mixed Stream Robot. 

- 1: Subscribe. 
- 0: Do not subscribe (default).
> Note: 
When this option is enabled, it is recommended to use the "Subscription Allowlist." Avoid subscribing to both the stream published by the Mixed Stream Robot and the streams published by the hosts simultaneously; otherwise, it will result in audio echoing (duplicate audio) in the recorded file.
     */
    public void setSubscribeAbility(Long SubscribeAbility) {
        this.SubscribeAbility = SubscribeAbility;
    }

    public RecordParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordParams(RecordParams source) {
        if (source.RecordMode != null) {
            this.RecordMode = new Long(source.RecordMode);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
        if (source.SubscribeStreamUserIds != null) {
            this.SubscribeStreamUserIds = new SubscribeStreamUserIds(source.SubscribeStreamUserIds);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new Long(source.OutputFormat);
        }
        if (source.AvMerge != null) {
            this.AvMerge = new Long(source.AvMerge);
        }
        if (source.MaxMediaFileDuration != null) {
            this.MaxMediaFileDuration = new Long(source.MaxMediaFileDuration);
        }
        if (source.MediaId != null) {
            this.MediaId = new Long(source.MediaId);
        }
        if (source.FillType != null) {
            this.FillType = new Long(source.FillType);
        }
        if (source.SubscribeAbility != null) {
            this.SubscribeAbility = new Long(source.SubscribeAbility);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordMode", this.RecordMode);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "AvMerge", this.AvMerge);
        this.setParamSimple(map, prefix + "MaxMediaFileDuration", this.MaxMediaFileDuration);
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "SubscribeAbility", this.SubscribeAbility);

    }
}

