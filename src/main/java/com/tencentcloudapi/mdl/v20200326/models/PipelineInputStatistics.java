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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PipelineInputStatistics extends AbstractModel {

    /**
    * Data timestamp in seconds.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Input bandwidth in bps.
    */
    @SerializedName("NetworkIn")
    @Expose
    private Long NetworkIn;

    /**
    * Video information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input video.
For other inputs, the quantity is 1.
    */
    @SerializedName("Video")
    @Expose
    private VideoPipelineInputStatistics [] Video;

    /**
    * Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
    */
    @SerializedName("Audio")
    @Expose
    private AudioPipelineInputStatistics [] Audio;

    /**
     * Get Data timestamp in seconds. 
     * @return Timestamp Data timestamp in seconds.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Data timestamp in seconds.
     * @param Timestamp Data timestamp in seconds.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Input bandwidth in bps. 
     * @return NetworkIn Input bandwidth in bps.
     */
    public Long getNetworkIn() {
        return this.NetworkIn;
    }

    /**
     * Set Input bandwidth in bps.
     * @param NetworkIn Input bandwidth in bps.
     */
    public void setNetworkIn(Long NetworkIn) {
        this.NetworkIn = NetworkIn;
    }

    /**
     * Get Video information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input video.
For other inputs, the quantity is 1. 
     * @return Video Video information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input video.
For other inputs, the quantity is 1.
     */
    public VideoPipelineInputStatistics [] getVideo() {
        return this.Video;
    }

    /**
     * Set Video information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input video.
For other inputs, the quantity is 1.
     * @param Video Video information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input video.
For other inputs, the quantity is 1.
     */
    public void setVideo(VideoPipelineInputStatistics [] Video) {
        this.Video = Video;
    }

    /**
     * Get Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1. 
     * @return Audio Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
     */
    public AudioPipelineInputStatistics [] getAudio() {
        return this.Audio;
    }

    /**
     * Set Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
     * @param Audio Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
     */
    public void setAudio(AudioPipelineInputStatistics [] Audio) {
        this.Audio = Audio;
    }

    public PipelineInputStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PipelineInputStatistics(PipelineInputStatistics source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.NetworkIn != null) {
            this.NetworkIn = new Long(source.NetworkIn);
        }
        if (source.Video != null) {
            this.Video = new VideoPipelineInputStatistics[source.Video.length];
            for (int i = 0; i < source.Video.length; i++) {
                this.Video[i] = new VideoPipelineInputStatistics(source.Video[i]);
            }
        }
        if (source.Audio != null) {
            this.Audio = new AudioPipelineInputStatistics[source.Audio.length];
            for (int i = 0; i < source.Audio.length; i++) {
                this.Audio[i] = new AudioPipelineInputStatistics(source.Audio[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "NetworkIn", this.NetworkIn);
        this.setParamArrayObj(map, prefix + "Video.", this.Video);
        this.setParamArrayObj(map, prefix + "Audio.", this.Audio);

    }
}

