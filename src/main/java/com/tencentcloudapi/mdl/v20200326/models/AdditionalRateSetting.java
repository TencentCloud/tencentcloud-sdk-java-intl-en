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
    * The maximum bitrate in the VBR scenario must be a multiple of 1000 and between 50000 and 40000000.
    */
    @SerializedName("VideoMaxBitrate")
    @Expose
    private Long VideoMaxBitrate;

    /**
    * Cache configuration supports configuration as 1-4x the Max Bitrate value.
    */
    @SerializedName("BufferSize")
    @Expose
    private Long BufferSize;

    /**
    * Valid in VBR scenarios. Video quality level. Only supports user input of numbers between 1 and 51.
    */
    @SerializedName("QualityLevel")
    @Expose
    private Long QualityLevel;

    /**
     * Get The maximum bitrate in the VBR scenario must be a multiple of 1000 and between 50000 and 40000000. 
     * @return VideoMaxBitrate The maximum bitrate in the VBR scenario must be a multiple of 1000 and between 50000 and 40000000.
     */
    public Long getVideoMaxBitrate() {
        return this.VideoMaxBitrate;
    }

    /**
     * Set The maximum bitrate in the VBR scenario must be a multiple of 1000 and between 50000 and 40000000.
     * @param VideoMaxBitrate The maximum bitrate in the VBR scenario must be a multiple of 1000 and between 50000 and 40000000.
     */
    public void setVideoMaxBitrate(Long VideoMaxBitrate) {
        this.VideoMaxBitrate = VideoMaxBitrate;
    }

    /**
     * Get Cache configuration supports configuration as 1-4x the Max Bitrate value. 
     * @return BufferSize Cache configuration supports configuration as 1-4x the Max Bitrate value.
     */
    public Long getBufferSize() {
        return this.BufferSize;
    }

    /**
     * Set Cache configuration supports configuration as 1-4x the Max Bitrate value.
     * @param BufferSize Cache configuration supports configuration as 1-4x the Max Bitrate value.
     */
    public void setBufferSize(Long BufferSize) {
        this.BufferSize = BufferSize;
    }

    /**
     * Get Valid in VBR scenarios. Video quality level. Only supports user input of numbers between 1 and 51. 
     * @return QualityLevel Valid in VBR scenarios. Video quality level. Only supports user input of numbers between 1 and 51.
     */
    public Long getQualityLevel() {
        return this.QualityLevel;
    }

    /**
     * Set Valid in VBR scenarios. Video quality level. Only supports user input of numbers between 1 and 51.
     * @param QualityLevel Valid in VBR scenarios. Video quality level. Only supports user input of numbers between 1 and 51.
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

