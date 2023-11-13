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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordParams extends AbstractModel {

    /**
    * The recording mode.
1: Single-stream recording. Records the audio and video of each subscribed user (`UserId`) in a room and saves the recording files to the cloud.
2: Mixed-stream recording. Mixes the audios and videos of subscribed users (`UserId`) in a room, records the mixed stream, and saves the recording files to the cloud.
    */
    @SerializedName("RecordMode")
    @Expose
    private Long RecordMode;

    /**
    * The time period (seconds) to wait to automatically stop recording after there are no anchors (users who publish streams) in a room. Value range: 5-86400 (max 24 hours). Default value: 30.
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * The media type of the streams to record.
0: Audio and video streams (default)
1: Audio streams only
2: Video streams only
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * The allowlist/blocklist for stream subscription.
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeStreamUserIds SubscribeStreamUserIds;

    /**
    * The output format. `0` (default): HLS; `1`: HLS + MP4; `2`: HLS + AAC;  `3` : MP4,  `4` : AAC. This parameter is invalid if you save recording files to VOD. To specify the format of files saved to VOD, use `MediaType` of `TencentVod`.
    */
    @SerializedName("OutputFormat")
    @Expose
    private Long OutputFormat;

    /**
    * Whether to merge the audio and video of a user in the single-stream recording mode. 0 (default): Do not mix the audio and video; 1: Mix the audio and video into one TS file. You don’t need to specify this parameter for mixed-stream recording, which merges audios and videos by default.
    */
    @SerializedName("AvMerge")
    @Expose
    private Long AvMerge;

    /**
    * The maximum file duration allowed (minutes). If the output format is AAC or MP4, and the maximum file duration is exceeded, the file will be segmented. Value range: 1-1440. Default value: 1440 (24 hours). The maximum file size allowed is 2 GB. If the file size exceeds 2 GB, or the file duration exceeds 24 hours, the file will also be segmented.
This parameter is invalid if the output format is HLS.
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
    * The type of stream to record. `0` (default): The primary stream and substream; `1`: The primary stream; `2`: The substream.
    */
    @SerializedName("MediaId")
    @Expose
    private Long MediaId;

    /**
     * Get The recording mode.
1: Single-stream recording. Records the audio and video of each subscribed user (`UserId`) in a room and saves the recording files to the cloud.
2: Mixed-stream recording. Mixes the audios and videos of subscribed users (`UserId`) in a room, records the mixed stream, and saves the recording files to the cloud. 
     * @return RecordMode The recording mode.
1: Single-stream recording. Records the audio and video of each subscribed user (`UserId`) in a room and saves the recording files to the cloud.
2: Mixed-stream recording. Mixes the audios and videos of subscribed users (`UserId`) in a room, records the mixed stream, and saves the recording files to the cloud.
     */
    public Long getRecordMode() {
        return this.RecordMode;
    }

    /**
     * Set The recording mode.
1: Single-stream recording. Records the audio and video of each subscribed user (`UserId`) in a room and saves the recording files to the cloud.
2: Mixed-stream recording. Mixes the audios and videos of subscribed users (`UserId`) in a room, records the mixed stream, and saves the recording files to the cloud.
     * @param RecordMode The recording mode.
1: Single-stream recording. Records the audio and video of each subscribed user (`UserId`) in a room and saves the recording files to the cloud.
2: Mixed-stream recording. Mixes the audios and videos of subscribed users (`UserId`) in a room, records the mixed stream, and saves the recording files to the cloud.
     */
    public void setRecordMode(Long RecordMode) {
        this.RecordMode = RecordMode;
    }

    /**
     * Get The time period (seconds) to wait to automatically stop recording after there are no anchors (users who publish streams) in a room. Value range: 5-86400 (max 24 hours). Default value: 30. 
     * @return MaxIdleTime The time period (seconds) to wait to automatically stop recording after there are no anchors (users who publish streams) in a room. Value range: 5-86400 (max 24 hours). Default value: 30.
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set The time period (seconds) to wait to automatically stop recording after there are no anchors (users who publish streams) in a room. Value range: 5-86400 (max 24 hours). Default value: 30.
     * @param MaxIdleTime The time period (seconds) to wait to automatically stop recording after there are no anchors (users who publish streams) in a room. Value range: 5-86400 (max 24 hours). Default value: 30.
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get The media type of the streams to record.
0: Audio and video streams (default)
1: Audio streams only
2: Video streams only 
     * @return StreamType The media type of the streams to record.
0: Audio and video streams (default)
1: Audio streams only
2: Video streams only
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set The media type of the streams to record.
0: Audio and video streams (default)
1: Audio streams only
2: Video streams only
     * @param StreamType The media type of the streams to record.
0: Audio and video streams (default)
1: Audio streams only
2: Video streams only
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get The allowlist/blocklist for stream subscription. 
     * @return SubscribeStreamUserIds The allowlist/blocklist for stream subscription.
     */
    public SubscribeStreamUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set The allowlist/blocklist for stream subscription.
     * @param SubscribeStreamUserIds The allowlist/blocklist for stream subscription.
     */
    public void setSubscribeStreamUserIds(SubscribeStreamUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    /**
     * Get The output format. `0` (default): HLS; `1`: HLS + MP4; `2`: HLS + AAC;  `3` : MP4,  `4` : AAC. This parameter is invalid if you save recording files to VOD. To specify the format of files saved to VOD, use `MediaType` of `TencentVod`. 
     * @return OutputFormat The output format. `0` (default): HLS; `1`: HLS + MP4; `2`: HLS + AAC;  `3` : MP4,  `4` : AAC. This parameter is invalid if you save recording files to VOD. To specify the format of files saved to VOD, use `MediaType` of `TencentVod`.
     */
    public Long getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set The output format. `0` (default): HLS; `1`: HLS + MP4; `2`: HLS + AAC;  `3` : MP4,  `4` : AAC. This parameter is invalid if you save recording files to VOD. To specify the format of files saved to VOD, use `MediaType` of `TencentVod`.
     * @param OutputFormat The output format. `0` (default): HLS; `1`: HLS + MP4; `2`: HLS + AAC;  `3` : MP4,  `4` : AAC. This parameter is invalid if you save recording files to VOD. To specify the format of files saved to VOD, use `MediaType` of `TencentVod`.
     */
    public void setOutputFormat(Long OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get Whether to merge the audio and video of a user in the single-stream recording mode. 0 (default): Do not mix the audio and video; 1: Mix the audio and video into one TS file. You don’t need to specify this parameter for mixed-stream recording, which merges audios and videos by default. 
     * @return AvMerge Whether to merge the audio and video of a user in the single-stream recording mode. 0 (default): Do not mix the audio and video; 1: Mix the audio and video into one TS file. You don’t need to specify this parameter for mixed-stream recording, which merges audios and videos by default.
     */
    public Long getAvMerge() {
        return this.AvMerge;
    }

    /**
     * Set Whether to merge the audio and video of a user in the single-stream recording mode. 0 (default): Do not mix the audio and video; 1: Mix the audio and video into one TS file. You don’t need to specify this parameter for mixed-stream recording, which merges audios and videos by default.
     * @param AvMerge Whether to merge the audio and video of a user in the single-stream recording mode. 0 (default): Do not mix the audio and video; 1: Mix the audio and video into one TS file. You don’t need to specify this parameter for mixed-stream recording, which merges audios and videos by default.
     */
    public void setAvMerge(Long AvMerge) {
        this.AvMerge = AvMerge;
    }

    /**
     * Get The maximum file duration allowed (minutes). If the output format is AAC or MP4, and the maximum file duration is exceeded, the file will be segmented. Value range: 1-1440. Default value: 1440 (24 hours). The maximum file size allowed is 2 GB. If the file size exceeds 2 GB, or the file duration exceeds 24 hours, the file will also be segmented.
This parameter is invalid if the output format is HLS. 
     * @return MaxMediaFileDuration The maximum file duration allowed (minutes). If the output format is AAC or MP4, and the maximum file duration is exceeded, the file will be segmented. Value range: 1-1440. Default value: 1440 (24 hours). The maximum file size allowed is 2 GB. If the file size exceeds 2 GB, or the file duration exceeds 24 hours, the file will also be segmented.
This parameter is invalid if the output format is HLS.
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set The maximum file duration allowed (minutes). If the output format is AAC or MP4, and the maximum file duration is exceeded, the file will be segmented. Value range: 1-1440. Default value: 1440 (24 hours). The maximum file size allowed is 2 GB. If the file size exceeds 2 GB, or the file duration exceeds 24 hours, the file will also be segmented.
This parameter is invalid if the output format is HLS.
     * @param MaxMediaFileDuration The maximum file duration allowed (minutes). If the output format is AAC or MP4, and the maximum file duration is exceeded, the file will be segmented. Value range: 1-1440. Default value: 1440 (24 hours). The maximum file size allowed is 2 GB. If the file size exceeds 2 GB, or the file duration exceeds 24 hours, the file will also be segmented.
This parameter is invalid if the output format is HLS.
     */
    public void setMaxMediaFileDuration(Long MaxMediaFileDuration) {
        this.MaxMediaFileDuration = MaxMediaFileDuration;
    }

    /**
     * Get The type of stream to record. `0` (default): The primary stream and substream; `1`: The primary stream; `2`: The substream. 
     * @return MediaId The type of stream to record. `0` (default): The primary stream and substream; `1`: The primary stream; `2`: The substream.
     */
    public Long getMediaId() {
        return this.MediaId;
    }

    /**
     * Set The type of stream to record. `0` (default): The primary stream and substream; `1`: The primary stream; `2`: The substream.
     * @param MediaId The type of stream to record. `0` (default): The primary stream and substream; `1`: The primary stream; `2`: The substream.
     */
    public void setMediaId(Long MediaId) {
        this.MediaId = MediaId;
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

    }
}

