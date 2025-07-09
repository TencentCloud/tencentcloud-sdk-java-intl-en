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

public class CreateComplexAdaptiveDynamicStreamingTaskRequest extends AbstractModel {

    /**
    * The VOD application ID.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Media ID of the main media.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Adaptive bitrate streaming parameters, supporting up to 8 entries.
    */
    @SerializedName("StreamParaSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskStreamPara [] StreamParaSet;

    /**
    * List of video opening/closing credits configuration template IDs, supporting up to 4 entries. If this field is filled in, the start times of the media specified in AudioSet and SubtitleSet will be automatically adjusted to stay in sync with the main media.
    */
    @SerializedName("HeadTailSet")
    @Expose
    private HeadTailTaskInput [] HeadTailSet;

    /**
    * Audio media parameters, supporting up to 16 entries. Each array element corresponds to an audio stream in the output. If you want to add the audio stream from the main media file to the output, you also need to specify it here. The order of elements in the array will determine the order of audio streams in the output. If the input media file contains both video and audio streams, the video stream will be ignored.
    */
    @SerializedName("AudioSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskAudioInput [] AudioSet;

    /**
    * List of subtitle IDs, supporting up to 16 entries. Each array element corresponds to an subtitle stream in the output. The order of elements in the array will determine the order of subtitles in the output.
    */
    @SerializedName("SubtitleSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] SubtitleSet;

    /**
     * Get The VOD application ID. 
     * @return SubAppId The VOD application ID.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set The VOD application ID.
     * @param SubAppId The VOD application ID.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Media ID of the main media. 
     * @return FileId Media ID of the main media.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media ID of the main media.
     * @param FileId Media ID of the main media.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Adaptive bitrate streaming parameters, supporting up to 8 entries. 
     * @return StreamParaSet Adaptive bitrate streaming parameters, supporting up to 8 entries.
     */
    public ComplexAdaptiveDynamicStreamingTaskStreamPara [] getStreamParaSet() {
        return this.StreamParaSet;
    }

    /**
     * Set Adaptive bitrate streaming parameters, supporting up to 8 entries.
     * @param StreamParaSet Adaptive bitrate streaming parameters, supporting up to 8 entries.
     */
    public void setStreamParaSet(ComplexAdaptiveDynamicStreamingTaskStreamPara [] StreamParaSet) {
        this.StreamParaSet = StreamParaSet;
    }

    /**
     * Get List of video opening/closing credits configuration template IDs, supporting up to 4 entries. If this field is filled in, the start times of the media specified in AudioSet and SubtitleSet will be automatically adjusted to stay in sync with the main media. 
     * @return HeadTailSet List of video opening/closing credits configuration template IDs, supporting up to 4 entries. If this field is filled in, the start times of the media specified in AudioSet and SubtitleSet will be automatically adjusted to stay in sync with the main media.
     */
    public HeadTailTaskInput [] getHeadTailSet() {
        return this.HeadTailSet;
    }

    /**
     * Set List of video opening/closing credits configuration template IDs, supporting up to 4 entries. If this field is filled in, the start times of the media specified in AudioSet and SubtitleSet will be automatically adjusted to stay in sync with the main media.
     * @param HeadTailSet List of video opening/closing credits configuration template IDs, supporting up to 4 entries. If this field is filled in, the start times of the media specified in AudioSet and SubtitleSet will be automatically adjusted to stay in sync with the main media.
     */
    public void setHeadTailSet(HeadTailTaskInput [] HeadTailSet) {
        this.HeadTailSet = HeadTailSet;
    }

    /**
     * Get Audio media parameters, supporting up to 16 entries. Each array element corresponds to an audio stream in the output. If you want to add the audio stream from the main media file to the output, you also need to specify it here. The order of elements in the array will determine the order of audio streams in the output. If the input media file contains both video and audio streams, the video stream will be ignored. 
     * @return AudioSet Audio media parameters, supporting up to 16 entries. Each array element corresponds to an audio stream in the output. If you want to add the audio stream from the main media file to the output, you also need to specify it here. The order of elements in the array will determine the order of audio streams in the output. If the input media file contains both video and audio streams, the video stream will be ignored.
     */
    public ComplexAdaptiveDynamicStreamingTaskAudioInput [] getAudioSet() {
        return this.AudioSet;
    }

    /**
     * Set Audio media parameters, supporting up to 16 entries. Each array element corresponds to an audio stream in the output. If you want to add the audio stream from the main media file to the output, you also need to specify it here. The order of elements in the array will determine the order of audio streams in the output. If the input media file contains both video and audio streams, the video stream will be ignored.
     * @param AudioSet Audio media parameters, supporting up to 16 entries. Each array element corresponds to an audio stream in the output. If you want to add the audio stream from the main media file to the output, you also need to specify it here. The order of elements in the array will determine the order of audio streams in the output. If the input media file contains both video and audio streams, the video stream will be ignored.
     */
    public void setAudioSet(ComplexAdaptiveDynamicStreamingTaskAudioInput [] AudioSet) {
        this.AudioSet = AudioSet;
    }

    /**
     * Get List of subtitle IDs, supporting up to 16 entries. Each array element corresponds to an subtitle stream in the output. The order of elements in the array will determine the order of subtitles in the output. 
     * @return SubtitleSet List of subtitle IDs, supporting up to 16 entries. Each array element corresponds to an subtitle stream in the output. The order of elements in the array will determine the order of subtitles in the output.
     */
    public ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set List of subtitle IDs, supporting up to 16 entries. Each array element corresponds to an subtitle stream in the output. The order of elements in the array will determine the order of subtitles in the output.
     * @param SubtitleSet List of subtitle IDs, supporting up to 16 entries. Each array element corresponds to an subtitle stream in the output. The order of elements in the array will determine the order of subtitles in the output.
     */
    public void setSubtitleSet(ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    public CreateComplexAdaptiveDynamicStreamingTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateComplexAdaptiveDynamicStreamingTaskRequest(CreateComplexAdaptiveDynamicStreamingTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.StreamParaSet != null) {
            this.StreamParaSet = new ComplexAdaptiveDynamicStreamingTaskStreamPara[source.StreamParaSet.length];
            for (int i = 0; i < source.StreamParaSet.length; i++) {
                this.StreamParaSet[i] = new ComplexAdaptiveDynamicStreamingTaskStreamPara(source.StreamParaSet[i]);
            }
        }
        if (source.HeadTailSet != null) {
            this.HeadTailSet = new HeadTailTaskInput[source.HeadTailSet.length];
            for (int i = 0; i < source.HeadTailSet.length; i++) {
                this.HeadTailSet[i] = new HeadTailTaskInput(source.HeadTailSet[i]);
            }
        }
        if (source.AudioSet != null) {
            this.AudioSet = new ComplexAdaptiveDynamicStreamingTaskAudioInput[source.AudioSet.length];
            for (int i = 0; i < source.AudioSet.length; i++) {
                this.AudioSet[i] = new ComplexAdaptiveDynamicStreamingTaskAudioInput(source.AudioSet[i]);
            }
        }
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new ComplexAdaptiveDynamicStreamingTaskSubtitleInput[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new ComplexAdaptiveDynamicStreamingTaskSubtitleInput(source.SubtitleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamArrayObj(map, prefix + "StreamParaSet.", this.StreamParaSet);
        this.setParamArrayObj(map, prefix + "HeadTailSet.", this.HeadTailSet);
        this.setParamArrayObj(map, prefix + "AudioSet.", this.AudioSet);
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);

    }
}

