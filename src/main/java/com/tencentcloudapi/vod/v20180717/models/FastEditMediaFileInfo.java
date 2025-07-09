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

public class FastEditMediaFileInfo extends AbstractModel {

    /**
    * Media file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * The types of media. Valid values: <li>Transcode:Transcoded output; </li> <li>Original: Original audio and video. </li>The audio and video being operated on must be in HLS format.
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * When AudioVideoType is set to Transcode, it is valid and indicates the transcoding template ID for the media being operated on.
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * Offset time of the start of the video clip, unit: seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * Offset time at the end of the video clip, unit: seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Media file ID. 
     * @return FileId Media file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID.
     * @param FileId Media file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get The types of media. Valid values: <li>Transcode:Transcoded output; </li> <li>Original: Original audio and video. </li>The audio and video being operated on must be in HLS format. 
     * @return AudioVideoType The types of media. Valid values: <li>Transcode:Transcoded output; </li> <li>Original: Original audio and video. </li>The audio and video being operated on must be in HLS format.
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set The types of media. Valid values: <li>Transcode:Transcoded output; </li> <li>Original: Original audio and video. </li>The audio and video being operated on must be in HLS format.
     * @param AudioVideoType The types of media. Valid values: <li>Transcode:Transcoded output; </li> <li>Original: Original audio and video. </li>The audio and video being operated on must be in HLS format.
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get When AudioVideoType is set to Transcode, it is valid and indicates the transcoding template ID for the media being operated on. 
     * @return TranscodeDefinition When AudioVideoType is set to Transcode, it is valid and indicates the transcoding template ID for the media being operated on.
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set When AudioVideoType is set to Transcode, it is valid and indicates the transcoding template ID for the media being operated on.
     * @param TranscodeDefinition When AudioVideoType is set to Transcode, it is valid and indicates the transcoding template ID for the media being operated on.
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get Offset time of the start of the video clip, unit: seconds. 
     * @return StartTimeOffset Offset time of the start of the video clip, unit: seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Offset time of the start of the video clip, unit: seconds.
     * @param StartTimeOffset Offset time of the start of the video clip, unit: seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Offset time at the end of the video clip, unit: seconds. 
     * @return EndTimeOffset Offset time at the end of the video clip, unit: seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Offset time at the end of the video clip, unit: seconds.
     * @param EndTimeOffset Offset time at the end of the video clip, unit: seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public FastEditMediaFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FastEditMediaFileInfo(FastEditMediaFileInfo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.AudioVideoType != null) {
            this.AudioVideoType = new String(source.AudioVideoType);
        }
        if (source.TranscodeDefinition != null) {
            this.TranscodeDefinition = new Long(source.TranscodeDefinition);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "TranscodeDefinition", this.TranscodeDefinition);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

