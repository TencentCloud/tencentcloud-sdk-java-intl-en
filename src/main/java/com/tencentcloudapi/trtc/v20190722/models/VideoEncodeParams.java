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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEncodeParams extends AbstractModel {

    /**
    * Width. Value range [0,1920], unit is pixel value.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height. Value range [0,1080], unit is pixel value.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Frame Rate. Value range [1,60], indicating that the frame rate can be selected from 1 to 60fps.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Bitrate. Value range [1,10000], unit is kbps.
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
    * Gop. Value range [1,2], unit is second.
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
     * Get Width. Value range [0,1920], unit is pixel value. 
     * @return Width Width. Value range [0,1920], unit is pixel value.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width. Value range [0,1920], unit is pixel value.
     * @param Width Width. Value range [0,1920], unit is pixel value.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height. Value range [0,1080], unit is pixel value. 
     * @return Height Height. Value range [0,1080], unit is pixel value.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height. Value range [0,1080], unit is pixel value.
     * @param Height Height. Value range [0,1080], unit is pixel value.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Frame Rate. Value range [1,60], indicating that the frame rate can be selected from 1 to 60fps. 
     * @return Fps Frame Rate. Value range [1,60], indicating that the frame rate can be selected from 1 to 60fps.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame Rate. Value range [1,60], indicating that the frame rate can be selected from 1 to 60fps.
     * @param Fps Frame Rate. Value range [1,60], indicating that the frame rate can be selected from 1 to 60fps.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Bitrate. Value range [1,10000], unit is kbps. 
     * @return BitRate Bitrate. Value range [1,10000], unit is kbps.
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set Bitrate. Value range [1,10000], unit is kbps.
     * @param BitRate Bitrate. Value range [1,10000], unit is kbps.
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Get Gop. Value range [1,2], unit is second. 
     * @return Gop Gop. Value range [1,2], unit is second.
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set Gop. Value range [1,2], unit is second.
     * @param Gop Gop. Value range [1,2], unit is second.
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    public VideoEncodeParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEncodeParams(VideoEncodeParams source) {
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

