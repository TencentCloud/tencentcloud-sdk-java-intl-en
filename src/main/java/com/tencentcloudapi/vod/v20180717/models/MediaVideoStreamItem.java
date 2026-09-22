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
    * Bitrate of the video stream. Unit: bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Height of the video stream. Unit: px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Video stream width. Unit: px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video stream encoding format, for example h264.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * Frame rate. Unit: hz.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Encoding tag, valid only when Codec is hevc.
    */
    @SerializedName("CodecTag")
    @Expose
    private String CodecTag;

    /**
    * Dynamic range information of the frame.
<li><font color=red>Note</font>: This field is valid for transcoded files processed after 2023-01-10T00:00:00Z.</li>
    */
    @SerializedName("DynamicRangeInfo")
    @Expose
    private DynamicRangeInfo DynamicRangeInfo;

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
     * Get Height of the video stream. Unit: px. 
     * @return Height Height of the video stream. Unit: px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of the video stream. Unit: px.
     * @param Height Height of the video stream. Unit: px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Video stream width. Unit: px. 
     * @return Width Video stream width. Unit: px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video stream width. Unit: px.
     * @param Width Video stream width. Unit: px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video stream encoding format, for example h264. 
     * @return Codec Video stream encoding format, for example h264.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set Video stream encoding format, for example h264.
     * @param Codec Video stream encoding format, for example h264.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get Frame rate. Unit: hz. 
     * @return Fps Frame rate. Unit: hz.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Frame rate. Unit: hz.
     * @param Fps Frame rate. Unit: hz.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Encoding tag, valid only when Codec is hevc. 
     * @return CodecTag Encoding tag, valid only when Codec is hevc.
     */
    public String getCodecTag() {
        return this.CodecTag;
    }

    /**
     * Set Encoding tag, valid only when Codec is hevc.
     * @param CodecTag Encoding tag, valid only when Codec is hevc.
     */
    public void setCodecTag(String CodecTag) {
        this.CodecTag = CodecTag;
    }

    /**
     * Get Dynamic range information of the frame.
<li><font color=red>Note</font>: This field is valid for transcoded files processed after 2023-01-10T00:00:00Z.</li> 
     * @return DynamicRangeInfo Dynamic range information of the frame.
<li><font color=red>Note</font>: This field is valid for transcoded files processed after 2023-01-10T00:00:00Z.</li>
     */
    public DynamicRangeInfo getDynamicRangeInfo() {
        return this.DynamicRangeInfo;
    }

    /**
     * Set Dynamic range information of the frame.
<li><font color=red>Note</font>: This field is valid for transcoded files processed after 2023-01-10T00:00:00Z.</li>
     * @param DynamicRangeInfo Dynamic range information of the frame.
<li><font color=red>Note</font>: This field is valid for transcoded files processed after 2023-01-10T00:00:00Z.</li>
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

