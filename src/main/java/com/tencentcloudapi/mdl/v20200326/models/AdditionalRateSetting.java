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

public class AdditionalRateSetting extends AbstractModel {

    /**
    * The maximum bit rate in a VBR scenario must be a multiple of 1000 and between 50000 - 40000000.
    */
    @SerializedName("VideoMaxBitrate")
    @Expose
    private Long VideoMaxBitrate;

    /**
    * Cache configuration supports configuring a Max Bitrate value of 1-4 times.
    */
    @SerializedName("BufferSize")
    @Expose
    private Long BufferSize;

    /**
    * VBR scene is valid, video quality level, only supports user input numbers between 1-51.
    */
    @SerializedName("QualityLevel")
    @Expose
    private Long QualityLevel;

    /**
     * Get The maximum bit rate in a VBR scenario must be a multiple of 1000 and between 50000 - 40000000. 
     * @return VideoMaxBitrate The maximum bit rate in a VBR scenario must be a multiple of 1000 and between 50000 - 40000000.
     */
    public Long getVideoMaxBitrate() {
        return this.VideoMaxBitrate;
    }

    /**
     * Set The maximum bit rate in a VBR scenario must be a multiple of 1000 and between 50000 - 40000000.
     * @param VideoMaxBitrate The maximum bit rate in a VBR scenario must be a multiple of 1000 and between 50000 - 40000000.
     */
    public void setVideoMaxBitrate(Long VideoMaxBitrate) {
        this.VideoMaxBitrate = VideoMaxBitrate;
    }

    /**
     * Get Cache configuration supports configuring a Max Bitrate value of 1-4 times. 
     * @return BufferSize Cache configuration supports configuring a Max Bitrate value of 1-4 times.
     */
    public Long getBufferSize() {
        return this.BufferSize;
    }

    /**
     * Set Cache configuration supports configuring a Max Bitrate value of 1-4 times.
     * @param BufferSize Cache configuration supports configuring a Max Bitrate value of 1-4 times.
     */
    public void setBufferSize(Long BufferSize) {
        this.BufferSize = BufferSize;
    }

    /**
     * Get VBR scene is valid, video quality level, only supports user input numbers between 1-51. 
     * @return QualityLevel VBR scene is valid, video quality level, only supports user input numbers between 1-51.
     */
    public Long getQualityLevel() {
        return this.QualityLevel;
    }

    /**
     * Set VBR scene is valid, video quality level, only supports user input numbers between 1-51.
     * @param QualityLevel VBR scene is valid, video quality level, only supports user input numbers between 1-51.
     */
    public void setQualityLevel(Long QualityLevel) {
        this.QualityLevel = QualityLevel;
    }

    public AdditionalRateSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdditionalRateSetting(AdditionalRateSetting source) {
        if (source.VideoMaxBitrate != null) {
            this.VideoMaxBitrate = new Long(source.VideoMaxBitrate);
        }
        if (source.BufferSize != null) {
            this.BufferSize = new Long(source.BufferSize);
        }
        if (source.QualityLevel != null) {
            this.QualityLevel = new Long(source.QualityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoMaxBitrate", this.VideoMaxBitrate);
        this.setParamSimple(map, prefix + "BufferSize", this.BufferSize);
        this.setParamSimple(map, prefix + "QualityLevel", this.QualityLevel);

    }
}

