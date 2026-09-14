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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaVideoStreamItem extends AbstractModel {

    /**
    * Bitrate of the video stream. Unit: bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Height of a video stream. Unit: px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Video stream width in px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video stream encoding format, for example, h264.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Frame rate. Measurement unit: hz.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 
    */
    @SerializedName("ColorPrimaries")
    @Expose
    private String ColorPrimaries;

    /**
    * 
    */
    @SerializedName("ColorSpace")
    @Expose
    private String ColorSpace;

    /**
    * 
    */
    @SerializedName("ColorTransfer")
    @Expose
    private String ColorTransfer;

    /**
    * 
    */
    @SerializedName("HdrType")
    @Expose
    private String HdrType;

    /**
    * 
    */
    @SerializedName("Codecs")
    @Expose
    private String Codecs;

    /**
    * 
    */
    @SerializedName("FpsNumerator")
    @Expose
    private Long FpsNumerator;

    /**
    * 
    */
    @SerializedName("FpsDenominator")
    @Expose
    private Long FpsDenominator;

    /**
     * Get Bitrate of the video stream. Unit: bps. 
     * @return Bitrate Bitrate of the video stream. Unit: bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of the video stream. Unit: bps.
     * @param Bitrate Bitrate of the video stream. Unit: bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Height of a video stream. Unit: px. 
     * @return Height Height of a video stream. Unit: px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a video stream. Unit: px.
     * @param Height Height of a video stream. Unit: px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Video stream width in px. 
     * @return Width Video stream width in px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video stream width in px.
     * @param Width Video stream width in px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video stream encoding format, for example, h264. 
     * @return Codec Video stream encoding format, for example, h264.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Video stream encoding format, for example, h264.
     * @param Codec Video stream encoding format, for example, h264.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Frame rate. Measurement unit: hz. 
     * @return Fps Frame rate. Measurement unit: hz.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate. Measurement unit: hz.
     * @param Fps Frame rate. Measurement unit: hz.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get  
     * @return ColorPrimaries 
     */
    public String getColorPrimaries() {
        return this.ColorPrimaries;
    }

    /**
     * Set 
     * @param ColorPrimaries 
     */
    public void setColorPrimaries(String ColorPrimaries) {
        this.ColorPrimaries = ColorPrimaries;
    }

    /**
     * Get  
     * @return ColorSpace 
     */
    public String getColorSpace() {
        return this.ColorSpace;
    }

    /**
     * Set 
     * @param ColorSpace 
     */
    public void setColorSpace(String ColorSpace) {
        this.ColorSpace = ColorSpace;
    }

    /**
     * Get  
     * @return ColorTransfer 
     */
    public String getColorTransfer() {
        return this.ColorTransfer;
    }

    /**
     * Set 
     * @param ColorTransfer 
     */
    public void setColorTransfer(String ColorTransfer) {
        this.ColorTransfer = ColorTransfer;
    }

    /**
     * Get  
     * @return HdrType 
     */
    public String getHdrType() {
        return this.HdrType;
    }

    /**
     * Set 
     * @param HdrType 
     */
    public void setHdrType(String HdrType) {
        this.HdrType = HdrType;
    }

    /**
     * Get  
     * @return Codecs 
     */
    public String getCodecs() {
        return this.Codecs;
    }

    /**
     * Set 
     * @param Codecs 
     */
    public void setCodecs(String Codecs) {
        this.Codecs = Codecs;
    }

    /**
     * Get  
     * @return FpsNumerator 
     */
    public Long getFpsNumerator() {
        return this.FpsNumerator;
    }

    /**
     * Set 
     * @param FpsNumerator 
     */
    public void setFpsNumerator(Long FpsNumerator) {
        this.FpsNumerator = FpsNumerator;
    }

    /**
     * Get  
     * @return FpsDenominator 
     */
    public Long getFpsDenominator() {
        return this.FpsDenominator;
    }

    /**
     * Set 
     * @param FpsDenominator 
     */
    public void setFpsDenominator(Long FpsDenominator) {
        this.FpsDenominator = FpsDenominator;
    }

    public MediaVideoStreamItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaVideoStreamItem(MediaVideoStreamItem source) {
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.ColorPrimaries != null) {
            this.ColorPrimaries = new String(source.ColorPrimaries);
        }
        if (source.ColorSpace != null) {
            this.ColorSpace = new String(source.ColorSpace);
        }
        if (source.ColorTransfer != null) {
            this.ColorTransfer = new String(source.ColorTransfer);
        }
        if (source.HdrType != null) {
            this.HdrType = new String(source.HdrType);
        }
        if (source.Codecs != null) {
            this.Codecs = new String(source.Codecs);
        }
        if (source.FpsNumerator != null) {
            this.FpsNumerator = new Long(source.FpsNumerator);
        }
        if (source.FpsDenominator != null) {
            this.FpsDenominator = new Long(source.FpsDenominator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "ColorPrimaries", this.ColorPrimaries);
        this.setParamSimple(map, prefix + "ColorSpace", this.ColorSpace);
        this.setParamSimple(map, prefix + "ColorTransfer", this.ColorTransfer);
        this.setParamSimple(map, prefix + "HdrType", this.HdrType);
        this.setParamSimple(map, prefix + "Codecs", this.Codecs);
        this.setParamSimple(map, prefix + "FpsNumerator", this.FpsNumerator);
        this.setParamSimple(map, prefix + "FpsDenominator", this.FpsDenominator);

    }
}

