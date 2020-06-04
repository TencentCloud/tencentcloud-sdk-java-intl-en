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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PipelineInputStatistics extends AbstractModel{

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
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Video")
    @Expose
    private VideoPipelineInputStatistics [] Video;

    /**
    * Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
Note: this field may return null, indicating that no valid values can be obtained.
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
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Video Video information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input video.
For other inputs, the quantity is 1.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public VideoPipelineInputStatistics [] getVideo() {
        return this.Video;
    }

    /**
     * Set Video information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input video.
For other inputs, the quantity is 1.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Video Video information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input video.
For other inputs, the quantity is 1.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVideo(VideoPipelineInputStatistics [] Video) {
        this.Video = Video;
    }

    /**
     * Get Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Audio Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AudioPipelineInputStatistics [] getAudio() {
        return this.Audio;
    }

    /**
     * Set Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Audio Audio information array.
For `rtp/udp` input, the quantity is the number of `Pid` of the input audio.
For other inputs, the quantity is 1.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudio(AudioPipelineInputStatistics [] Audio) {
        this.Audio = Audio;
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

