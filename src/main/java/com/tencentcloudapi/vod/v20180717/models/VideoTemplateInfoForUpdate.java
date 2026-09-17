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

public class VideoTemplateInfoForUpdate extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * 
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * 
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * 
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * 
    */
    @SerializedName("PreserveHDRSwitch")
    @Expose
    private String PreserveHDRSwitch;

    /**
    * 
    */
    @SerializedName("CodecTag")
    @Expose
    private String CodecTag;

    /**
    * 
    */
    @SerializedName("GopUnit")
    @Expose
    private String GopUnit;

    /**
    * 
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 
    */
    @SerializedName("Bframes")
    @Expose
    private Long Bframes;

    /**
    * 
    */
    @SerializedName("HlsTime")
    @Expose
    private Long HlsTime;

    /**
    * 
    */
    @SerializedName("VideoProfile")
    @Expose
    private String VideoProfile;

    /**
     * Get  
     * @return Codec 
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 
     * @param Codec 
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get  
     * @return Fps 
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 
     * @param Fps 
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get  
     * @return Bitrate 
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 
     * @param Bitrate 
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get  
     * @return ResolutionAdaptive 
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set 
     * @param ResolutionAdaptive 
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get  
     * @return Width 
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 
     * @param Width 
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get  
     * @return Height 
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 
     * @param Height 
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get  
     * @return FillType 
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set 
     * @param FillType 
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get  
     * @return Vcrf 
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set 
     * @param Vcrf 
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get  
     * @return Gop 
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 
     * @param Gop 
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get  
     * @return PreserveHDRSwitch 
     */
    public String getPreserveHDRSwitch() {
        return this.PreserveHDRSwitch;
    }

    /**
     * Set 
     * @param PreserveHDRSwitch 
     */
    public void setPreserveHDRSwitch(String PreserveHDRSwitch) {
        this.PreserveHDRSwitch = PreserveHDRSwitch;
    }

    /**
     * Get  
     * @return CodecTag 
     */
    public String getCodecTag() {
        return this.CodecTag;
    }

    /**
     * Set 
     * @param CodecTag 
     */
    public void setCodecTag(String CodecTag) {
        this.CodecTag = CodecTag;
    }

    /**
     * Get  
     * @return GopUnit 
     */
    public String getGopUnit() {
        return this.GopUnit;
    }

    /**
     * Set 
     * @param GopUnit 
     */
    public void setGopUnit(String GopUnit) {
        this.GopUnit = GopUnit;
    }

    /**
     * Get  
     * @return Mode 
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 
     * @param Mode 
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get  
     * @return Bframes 
     */
    public Long getBframes() {
        return this.Bframes;
    }

    /**
     * Set 
     * @param Bframes 
     */
    public void setBframes(Long Bframes) {
        this.Bframes = Bframes;
    }

    /**
     * Get  
     * @return HlsTime 
     */
    public Long getHlsTime() {
        return this.HlsTime;
    }

    /**
     * Set 
     * @param HlsTime 
     */
    public void setHlsTime(Long HlsTime) {
        this.HlsTime = HlsTime;
    }

    /**
     * Get  
     * @return VideoProfile 
     */
    public String getVideoProfile() {
        return this.VideoProfile;
    }

    /**
     * Set 
     * @param VideoProfile 
     */
    public void setVideoProfile(String VideoProfile) {
        this.VideoProfile = VideoProfile;
    }

    public VideoTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTemplateInfoForUpdate(VideoTemplateInfoForUpdate source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Vcrf != null) {
            this.Vcrf = new Long(source.Vcrf);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.PreserveHDRSwitch != null) {
            this.PreserveHDRSwitch = new String(source.PreserveHDRSwitch);
        }
        if (source.CodecTag != null) {
            this.CodecTag = new String(source.CodecTag);
        }
        if (source.GopUnit != null) {
            this.GopUnit = new String(source.GopUnit);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Bframes != null) {
            this.Bframes = new Long(source.Bframes);
        }
        if (source.HlsTime != null) {
            this.HlsTime = new Long(source.HlsTime);
        }
        if (source.VideoProfile != null) {
            this.VideoProfile = new String(source.VideoProfile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Vcrf", this.Vcrf);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "PreserveHDRSwitch", this.PreserveHDRSwitch);
        this.setParamSimple(map, prefix + "CodecTag", this.CodecTag);
        this.setParamSimple(map, prefix + "GopUnit", this.GopUnit);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Bframes", this.Bframes);
        this.setParamSimple(map, prefix + "HlsTime", this.HlsTime);
        this.setParamSimple(map, prefix + "VideoProfile", this.VideoProfile);

    }
}

