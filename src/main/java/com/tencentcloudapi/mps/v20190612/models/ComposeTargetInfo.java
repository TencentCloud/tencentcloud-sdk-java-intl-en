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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeTargetInfo extends AbstractModel{

    /**
    * The container. Valid values:
<li>`mp4` (default), for video files. </li>
<li>`mp3`, for audio files. </li>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Whether to remove video data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * Whether to remove audio data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * The information of the output video stream.
    */
    @SerializedName("VideoStream")
    @Expose
    private ComposeVideoStream VideoStream;

    /**
    * The information of the output audio stream.
    */
    @SerializedName("AudioStream")
    @Expose
    private ComposeAudioStream AudioStream;

    /**
     * Get The container. Valid values:
<li>`mp4` (default), for video files. </li>
<li>`mp3`, for audio files. </li> 
     * @return Container The container. Valid values:
<li>`mp4` (default), for video files. </li>
<li>`mp3`, for audio files. </li>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set The container. Valid values:
<li>`mp4` (default), for video files. </li>
<li>`mp3`, for audio files. </li>
     * @param Container The container. Valid values:
<li>`mp4` (default), for video files. </li>
<li>`mp3`, for audio files. </li>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Whether to remove video data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li> 
     * @return RemoveVideo Whether to remove video data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set Whether to remove video data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     * @param RemoveVideo Whether to remove video data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get Whether to remove audio data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li> 
     * @return RemoveAudio Whether to remove audio data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set Whether to remove audio data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     * @param RemoveAudio Whether to remove audio data. Valid values:
<li>`0` (default): No. </li>
<li>`1`: Yes. </li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get The information of the output video stream. 
     * @return VideoStream The information of the output video stream.
     */
    public ComposeVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set The information of the output video stream.
     * @param VideoStream The information of the output video stream.
     */
    public void setVideoStream(ComposeVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get The information of the output audio stream. 
     * @return AudioStream The information of the output audio stream.
     */
    public ComposeAudioStream getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set The information of the output audio stream.
     * @param AudioStream The information of the output audio stream.
     */
    public void setAudioStream(ComposeAudioStream AudioStream) {
        this.AudioStream = AudioStream;
    }

    public ComposeTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeTargetInfo(ComposeTargetInfo source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.VideoStream != null) {
            this.VideoStream = new ComposeVideoStream(source.VideoStream);
        }
        if (source.AudioStream != null) {
            this.AudioStream = new ComposeAudioStream(source.AudioStream);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoStream.", this.VideoStream);
        this.setParamObj(map, prefix + "AudioStream.", this.AudioStream);

    }
}

