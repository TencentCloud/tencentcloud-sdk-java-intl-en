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

public class VideoEncode extends AbstractModel{

    /**
    * The width of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1920].
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The height of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1080].
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The frame rate (fps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 60].
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * The bitrate (Kbps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 10000].
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
    * The GOP (seconds) of the output stream. This parameter is required if audio and video are relayed. Value range: [1, 5].
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
     * Get The width of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1920]. 
     * @return Width The width of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1920].
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The width of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1920].
     * @param Width The width of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1920].
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The height of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1080]. 
     * @return Height The height of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1080].
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The height of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1080].
     * @param Height The height of the output stream (pixels). This parameter is required if audio and video are relayed. Value range: [0, 1080].
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The frame rate (fps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 60]. 
     * @return Fps The frame rate (fps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 60].
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set The frame rate (fps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 60].
     * @param Fps The frame rate (fps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 60].
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get The bitrate (Kbps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 10000]. 
     * @return BitRate The bitrate (Kbps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 10000].
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set The bitrate (Kbps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 10000].
     * @param BitRate The bitrate (Kbps) of the output stream. This parameter is required if audio and video are relayed. Value range: [0, 10000].
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Get The GOP (seconds) of the output stream. This parameter is required if audio and video are relayed. Value range: [1, 5]. 
     * @return Gop The GOP (seconds) of the output stream. This parameter is required if audio and video are relayed. Value range: [1, 5].
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set The GOP (seconds) of the output stream. This parameter is required if audio and video are relayed. Value range: [1, 5].
     * @param Gop The GOP (seconds) of the output stream. This parameter is required if audio and video are relayed. Value range: [1, 5].
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    public VideoEncode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEncode(VideoEncode source) {
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

