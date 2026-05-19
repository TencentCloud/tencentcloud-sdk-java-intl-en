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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Media ID of the main media file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Adaptive Bitrate Parameters support a maximum of 8.
    */
    @SerializedName("StreamParaSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskStreamPara [] StreamParaSet;

    /**
    * Credits list, supports multiple opening and ending sequences, with a maximum of 4 supported. If this field is filled, the start time of the media specified in AudioSet and SubtitleSet will automatically adjust to keep synchronized with the main media.
    */
    @SerializedName("HeadTailSet")
    @Expose
    private HeadTailTaskInput [] HeadTailSet;

    /**
    * Multilingual audio stream parameters, supports a maximum of 16. Each array element corresponds to an audio stream in the adaptive bitrate stream. If you need to add the audio stream from the main media file to the output adaptive bitrate stream, you must specify it here. The order of elements in an array determines the order of audio streams in the adaptive bitrate stream. If the input media file contains both video and audio streams, the video stream will be ignored.
    */
    @SerializedName("AudioSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskAudioInput [] AudioSet;

    /**
    * Multilingual subtitle parameters, with a maximum of 16 supported. Each element in an array corresponds to a subtitle stream in the adaptive bitrate stream. The order of elements in an array determines the order of subtitle streams in the adaptive bitrate stream.
    */
    @SerializedName("SubtitleSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] SubtitleSet;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Media ID of the main media file. 
     * @return FileId Media ID of the main media file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media ID of the main media file.
     * @param FileId Media ID of the main media file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Adaptive Bitrate Parameters support a maximum of 8. 
     * @return StreamParaSet Adaptive Bitrate Parameters support a maximum of 8.
     */
    public ComplexAdaptiveDynamicStreamingTaskStreamPara [] getStreamParaSet() {
        return this.StreamParaSet;
    }

    /**
     * Set Adaptive Bitrate Parameters support a maximum of 8.
     * @param StreamParaSet Adaptive Bitrate Parameters support a maximum of 8.
     */
    public void setStreamParaSet(ComplexAdaptiveDynamicStreamingTaskStreamPara [] StreamParaSet) {
        this.StreamParaSet = StreamParaSet;
    }

    /**
     * Get Credits list, supports multiple opening and ending sequences, with a maximum of 4 supported. If this field is filled, the start time of the media specified in AudioSet and SubtitleSet will automatically adjust to keep synchronized with the main media. 
     * @return HeadTailSet Credits list, supports multiple opening and ending sequences, with a maximum of 4 supported. If this field is filled, the start time of the media specified in AudioSet and SubtitleSet will automatically adjust to keep synchronized with the main media.
     */
    public HeadTailTaskInput [] getHeadTailSet() {
        return this.HeadTailSet;
    }

    /**
     * Set Credits list, supports multiple opening and ending sequences, with a maximum of 4 supported. If this field is filled, the start time of the media specified in AudioSet and SubtitleSet will automatically adjust to keep synchronized with the main media.
     * @param HeadTailSet Credits list, supports multiple opening and ending sequences, with a maximum of 4 supported. If this field is filled, the start time of the media specified in AudioSet and SubtitleSet will automatically adjust to keep synchronized with the main media.
     */
    public void setHeadTailSet(HeadTailTaskInput [] HeadTailSet) {
        this.HeadTailSet = HeadTailSet;
    }

    /**
     * Get Multilingual audio stream parameters, supports a maximum of 16. Each array element corresponds to an audio stream in the adaptive bitrate stream. If you need to add the audio stream from the main media file to the output adaptive bitrate stream, you must specify it here. The order of elements in an array determines the order of audio streams in the adaptive bitrate stream. If the input media file contains both video and audio streams, the video stream will be ignored. 
     * @return AudioSet Multilingual audio stream parameters, supports a maximum of 16. Each array element corresponds to an audio stream in the adaptive bitrate stream. If you need to add the audio stream from the main media file to the output adaptive bitrate stream, you must specify it here. The order of elements in an array determines the order of audio streams in the adaptive bitrate stream. If the input media file contains both video and audio streams, the video stream will be ignored.
     */
    public ComplexAdaptiveDynamicStreamingTaskAudioInput [] getAudioSet() {
        return this.AudioSet;
    }

    /**
     * Set Multilingual audio stream parameters, supports a maximum of 16. Each array element corresponds to an audio stream in the adaptive bitrate stream. If you need to add the audio stream from the main media file to the output adaptive bitrate stream, you must specify it here. The order of elements in an array determines the order of audio streams in the adaptive bitrate stream. If the input media file contains both video and audio streams, the video stream will be ignored.
     * @param AudioSet Multilingual audio stream parameters, supports a maximum of 16. Each array element corresponds to an audio stream in the adaptive bitrate stream. If you need to add the audio stream from the main media file to the output adaptive bitrate stream, you must specify it here. The order of elements in an array determines the order of audio streams in the adaptive bitrate stream. If the input media file contains both video and audio streams, the video stream will be ignored.
     */
    public void setAudioSet(ComplexAdaptiveDynamicStreamingTaskAudioInput [] AudioSet) {
        this.AudioSet = AudioSet;
    }

    /**
     * Get Multilingual subtitle parameters, with a maximum of 16 supported. Each element in an array corresponds to a subtitle stream in the adaptive bitrate stream. The order of elements in an array determines the order of subtitle streams in the adaptive bitrate stream. 
     * @return SubtitleSet Multilingual subtitle parameters, with a maximum of 16 supported. Each element in an array corresponds to a subtitle stream in the adaptive bitrate stream. The order of elements in an array determines the order of subtitle streams in the adaptive bitrate stream.
     */
    public ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set Multilingual subtitle parameters, with a maximum of 16 supported. Each element in an array corresponds to a subtitle stream in the adaptive bitrate stream. The order of elements in an array determines the order of subtitle streams in the adaptive bitrate stream.
     * @param SubtitleSet Multilingual subtitle parameters, with a maximum of 16 supported. Each element in an array corresponds to a subtitle stream in the adaptive bitrate stream. The order of elements in an array determines the order of subtitle streams in the adaptive bitrate stream.
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

