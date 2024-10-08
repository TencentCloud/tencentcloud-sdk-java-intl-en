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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaVideoStreamItem extends AbstractModel {

    /**
    * Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Color primaries
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ColorPrimaries")
    @Expose
    private String ColorPrimaries;

    /**
    * Color space
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ColorSpace")
    @Expose
    private String ColorSpace;

    /**
    * Color transfer
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ColorTransfer")
    @Expose
    private String ColorTransfer;

    /**
    * HDR type
Note: This field may return `null`, indicating that no valid value was found.
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
    * Numerator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FpsNumerator")
    @Expose
    private Long FpsNumerator;

    /**
    * Denominator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FpsDenominator")
    @Expose
    private Long FpsDenominator;

    /**
     * Get Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bitrate Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bitrate Bitrate of a video stream in bps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Height Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Height Height of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Width Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Width Width of a video stream in px.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Codec Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Codec Video stream codec, such as h264.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fps Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fps Frame rate in Hz.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Color primaries
Note: this field may return `null`, indicating that no valid value was found. 
     * @return ColorPrimaries Color primaries
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getColorPrimaries() {
        return this.ColorPrimaries;
    }

    /**
     * Set Color primaries
Note: this field may return `null`, indicating that no valid value was found.
     * @param ColorPrimaries Color primaries
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setColorPrimaries(String ColorPrimaries) {
        this.ColorPrimaries = ColorPrimaries;
    }

    /**
     * Get Color space
Note: this field may return `null`, indicating that no valid value was found. 
     * @return ColorSpace Color space
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getColorSpace() {
        return this.ColorSpace;
    }

    /**
     * Set Color space
Note: this field may return `null`, indicating that no valid value was found.
     * @param ColorSpace Color space
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setColorSpace(String ColorSpace) {
        this.ColorSpace = ColorSpace;
    }

    /**
     * Get Color transfer
Note: this field may return `null`, indicating that no valid value was found. 
     * @return ColorTransfer Color transfer
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getColorTransfer() {
        return this.ColorTransfer;
    }

    /**
     * Set Color transfer
Note: this field may return `null`, indicating that no valid value was found.
     * @param ColorTransfer Color transfer
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setColorTransfer(String ColorTransfer) {
        this.ColorTransfer = ColorTransfer;
    }

    /**
     * Get HDR type
Note: This field may return `null`, indicating that no valid value was found. 
     * @return HdrType HDR type
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getHdrType() {
        return this.HdrType;
    }

    /**
     * Set HDR type
Note: This field may return `null`, indicating that no valid value was found.
     * @param HdrType HDR type
Note: This field may return `null`, indicating that no valid value was found.
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
     * Get Numerator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FpsNumerator Numerator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFpsNumerator() {
        return this.FpsNumerator;
    }

    /**
     * Set Numerator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FpsNumerator Numerator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFpsNumerator(Long FpsNumerator) {
        this.FpsNumerator = FpsNumerator;
    }

    /**
     * Get Denominator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FpsDenominator Denominator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFpsDenominator() {
        return this.FpsDenominator;
    }

    /**
     * Set Denominator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FpsDenominator Denominator of the frame rate.
Note: This field may return null, indicating that no valid values can be obtained.
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

