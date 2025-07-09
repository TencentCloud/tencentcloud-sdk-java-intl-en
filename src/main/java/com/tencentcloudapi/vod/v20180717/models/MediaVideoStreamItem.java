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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaVideoStreamItem extends AbstractModel {

    /**
    * Bitrate of video stream in bps.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Height of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Width of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video stream encoder, such as h264.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Frame rate in Hz.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * The codec tag. This parameter is valid only if `Codec` is `hevc`.
    */
    @SerializedName("CodecTag")
    @Expose
    private String CodecTag;

    /**
    * Dynamic range information.
<li><font color=red>Note</font>: This parameter is valid for transcoding files generated after 2023-01-10T00:00:00Z.</li>
    */
    @SerializedName("DynamicRangeInfo")
    @Expose
    private DynamicRangeInfo DynamicRangeInfo;

    /**
     * Get Bitrate of video stream in bps.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Bitrate Bitrate of video stream in bps.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of video stream in bps.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Bitrate Bitrate of video stream in bps.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Height of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Height Height of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Height Height of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Width of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Width Width of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Width Width of video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video stream encoder, such as h264.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Codec Video stream encoder, such as h264.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Video stream encoder, such as h264.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Codec Video stream encoder, such as h264.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Frame rate in Hz.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Fps Frame rate in Hz.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate in Hz.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Fps Frame rate in Hz.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get The codec tag. This parameter is valid only if `Codec` is `hevc`. 
     * @return CodecTag The codec tag. This parameter is valid only if `Codec` is `hevc`.
     */
    public String getCodecTag() {
        return this.CodecTag;
    }

    /**
     * Set The codec tag. This parameter is valid only if `Codec` is `hevc`.
     * @param CodecTag The codec tag. This parameter is valid only if `Codec` is `hevc`.
     */
    public void setCodecTag(String CodecTag) {
        this.CodecTag = CodecTag;
    }

    /**
     * Get Dynamic range information.
<li><font color=red>Note</font>: This parameter is valid for transcoding files generated after 2023-01-10T00:00:00Z.</li> 
     * @return DynamicRangeInfo Dynamic range information.
<li><font color=red>Note</font>: This parameter is valid for transcoding files generated after 2023-01-10T00:00:00Z.</li>
     */
    public DynamicRangeInfo getDynamicRangeInfo() {
        return this.DynamicRangeInfo;
    }

    /**
     * Set Dynamic range information.
<li><font color=red>Note</font>: This parameter is valid for transcoding files generated after 2023-01-10T00:00:00Z.</li>
     * @param DynamicRangeInfo Dynamic range information.
<li><font color=red>Note</font>: This parameter is valid for transcoding files generated after 2023-01-10T00:00:00Z.</li>
     */
    public void setDynamicRangeInfo(DynamicRangeInfo DynamicRangeInfo) {
        this.DynamicRangeInfo = DynamicRangeInfo;
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
        if (source.CodecTag != null) {
            this.CodecTag = new String(source.CodecTag);
        }
        if (source.DynamicRangeInfo != null) {
            this.DynamicRangeInfo = new DynamicRangeInfo(source.DynamicRangeInfo);
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
        this.setParamSimple(map, prefix + "CodecTag", this.CodecTag);
        this.setParamObj(map, prefix + "DynamicRangeInfo.", this.DynamicRangeInfo);

    }
}

