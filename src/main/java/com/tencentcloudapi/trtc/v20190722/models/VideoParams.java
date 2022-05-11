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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoParams extends AbstractModel{

    /**
    * The video width in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `360`.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The video height in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `640`.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The video frame rate. Value range: [1, 60]. Default: 15.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * The video bitrate (bps). Value range: [64000, 8192000]. Default: 550000.
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
    * The keyframe interval (seconds). Default value: 10.
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
     * Get The video width in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `360`. 
     * @return Width The video width in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `360`.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The video width in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `360`.
     * @param Width The video width in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `360`.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The video height in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `640`. 
     * @return Height The video height in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `640`.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The video height in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `640`.
     * @param Height The video height in pixels. The value of this parameter cannot be larger than 1920, and the result of multiplying `Width` and `Height` cannot exceed 1920 x 1080. The default value is `640`.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The video frame rate. Value range: [1, 60]. Default: 15. 
     * @return Fps The video frame rate. Value range: [1, 60]. Default: 15.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set The video frame rate. Value range: [1, 60]. Default: 15.
     * @param Fps The video frame rate. Value range: [1, 60]. Default: 15.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get The video bitrate (bps). Value range: [64000, 8192000]. Default: 550000. 
     * @return BitRate The video bitrate (bps). Value range: [64000, 8192000]. Default: 550000.
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set The video bitrate (bps). Value range: [64000, 8192000]. Default: 550000.
     * @param BitRate The video bitrate (bps). Value range: [64000, 8192000]. Default: 550000.
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Get The keyframe interval (seconds). Default value: 10. 
     * @return Gop The keyframe interval (seconds). Default value: 10.
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set The keyframe interval (seconds). Default value: 10.
     * @param Gop The keyframe interval (seconds). Default value: 10.
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    public VideoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoParams(VideoParams source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.BitRate != null) {
            this.BitRate = new Long(source.BitRate);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "BitRate", this.BitRate);
        this.setParamSimple(map, prefix + "Gop", this.Gop);

    }
}

