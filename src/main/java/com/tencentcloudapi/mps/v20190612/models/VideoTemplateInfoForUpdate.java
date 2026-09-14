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
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * 
    */
    @SerializedName("GopUnit")
    @Expose
    private String GopUnit;

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
    @SerializedName("ContentAdaptStream")
    @Expose
    private Long ContentAdaptStream;

    /**
    * 
    */
    @SerializedName("HlsTime")
    @Expose
    private Long HlsTime;

    /**
    * 
    */
    @SerializedName("SegmentType")
    @Expose
    private Long SegmentType;

    /**
    * 
    */
    @SerializedName("FpsDenominator")
    @Expose
    private Long FpsDenominator;

    /**
    * 
    */
    @SerializedName("Stereo3dType")
    @Expose
    private String Stereo3dType;

    /**
    * 
    */
    @SerializedName("VideoProfile")
    @Expose
    private String VideoProfile;

    /**
    * 
    */
    @SerializedName("VideoLevel")
    @Expose
    private String VideoLevel;

    /**
    * 
    */
    @SerializedName("Bframes")
    @Expose
    private Long Bframes;

    /**
    * 
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 
    */
    @SerializedName("Sar")
    @Expose
    private String Sar;

    /**
    * 
    */
    @SerializedName("NoScenecut")
    @Expose
    private Long NoScenecut;

    /**
    * 
    */
    @SerializedName("BitDepth")
    @Expose
    private Long BitDepth;

    /**
    * 
    */
    @SerializedName("RawPts")
    @Expose
    private Long RawPts;

    /**
    * 
    */
    @SerializedName("Compress")
    @Expose
    private Long Compress;

    /**
    * 
    */
    @SerializedName("SegmentSpecificInfo")
    @Expose
    private SegmentSpecificInfo SegmentSpecificInfo;

    /**
    * 
    */
    @SerializedName("ScenarioBased")
    @Expose
    private Long ScenarioBased;

    /**
    * 
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * 
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

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
     * @return ContentAdaptStream 
     */
    public Long getContentAdaptStream() {
        return this.ContentAdaptStream;
    }

    /**
     * Set 
     * @param ContentAdaptStream 
     */
    public void setContentAdaptStream(Long ContentAdaptStream) {
        this.ContentAdaptStream = ContentAdaptStream;
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
     * @return SegmentType 
     */
    public Long getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set 
     * @param SegmentType 
     */
    public void setSegmentType(Long SegmentType) {
        this.SegmentType = SegmentType;
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

    /**
     * Get  
     * @return Stereo3dType 
     */
    public String getStereo3dType() {
        return this.Stereo3dType;
    }

    /**
     * Set 
     * @param Stereo3dType 
     */
    public void setStereo3dType(String Stereo3dType) {
        this.Stereo3dType = Stereo3dType;
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

    /**
     * Get  
     * @return VideoLevel 
     */
    public String getVideoLevel() {
        return this.VideoLevel;
    }

    /**
     * Set 
     * @param VideoLevel 
     */
    public void setVideoLevel(String VideoLevel) {
        this.VideoLevel = VideoLevel;
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
     * @return Sar 
     */
    public String getSar() {
        return this.Sar;
    }

    /**
     * Set 
     * @param Sar 
     */
    public void setSar(String Sar) {
        this.Sar = Sar;
    }

    /**
     * Get  
     * @return NoScenecut 
     */
    public Long getNoScenecut() {
        return this.NoScenecut;
    }

    /**
     * Set 
     * @param NoScenecut 
     */
    public void setNoScenecut(Long NoScenecut) {
        this.NoScenecut = NoScenecut;
    }

    /**
     * Get  
     * @return BitDepth 
     */
    public Long getBitDepth() {
        return this.BitDepth;
    }

    /**
     * Set 
     * @param BitDepth 
     */
    public void setBitDepth(Long BitDepth) {
        this.BitDepth = BitDepth;
    }

    /**
     * Get  
     * @return RawPts 
     */
    public Long getRawPts() {
        return this.RawPts;
    }

    /**
     * Set 
     * @param RawPts 
     */
    public void setRawPts(Long RawPts) {
        this.RawPts = RawPts;
    }

    /**
     * Get  
     * @return Compress 
     */
    public Long getCompress() {
        return this.Compress;
    }

    /**
     * Set 
     * @param Compress 
     */
    public void setCompress(Long Compress) {
        this.Compress = Compress;
    }

    /**
     * Get  
     * @return SegmentSpecificInfo 
     */
    public SegmentSpecificInfo getSegmentSpecificInfo() {
        return this.SegmentSpecificInfo;
    }

    /**
     * Set 
     * @param SegmentSpecificInfo 
     */
    public void setSegmentSpecificInfo(SegmentSpecificInfo SegmentSpecificInfo) {
        this.SegmentSpecificInfo = SegmentSpecificInfo;
    }

    /**
     * Get  
     * @return ScenarioBased 
     */
    public Long getScenarioBased() {
        return this.ScenarioBased;
    }

    /**
     * Set 
     * @param ScenarioBased 
     */
    public void setScenarioBased(Long ScenarioBased) {
        this.ScenarioBased = ScenarioBased;
    }

    /**
     * Get  
     * @return SceneType 
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 
     * @param SceneType 
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get  
     * @return CompressType 
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set 
     * @param CompressType 
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
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
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.GopUnit != null) {
            this.GopUnit = new String(source.GopUnit);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Vcrf != null) {
            this.Vcrf = new Long(source.Vcrf);
        }
        if (source.ContentAdaptStream != null) {
            this.ContentAdaptStream = new Long(source.ContentAdaptStream);
        }
        if (source.HlsTime != null) {
            this.HlsTime = new Long(source.HlsTime);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new Long(source.SegmentType);
        }
        if (source.FpsDenominator != null) {
            this.FpsDenominator = new Long(source.FpsDenominator);
        }
        if (source.Stereo3dType != null) {
            this.Stereo3dType = new String(source.Stereo3dType);
        }
        if (source.VideoProfile != null) {
            this.VideoProfile = new String(source.VideoProfile);
        }
        if (source.VideoLevel != null) {
            this.VideoLevel = new String(source.VideoLevel);
        }
        if (source.Bframes != null) {
            this.Bframes = new Long(source.Bframes);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Sar != null) {
            this.Sar = new String(source.Sar);
        }
        if (source.NoScenecut != null) {
            this.NoScenecut = new Long(source.NoScenecut);
        }
        if (source.BitDepth != null) {
            this.BitDepth = new Long(source.BitDepth);
        }
        if (source.RawPts != null) {
            this.RawPts = new Long(source.RawPts);
        }
        if (source.Compress != null) {
            this.Compress = new Long(source.Compress);
        }
        if (source.SegmentSpecificInfo != null) {
            this.SegmentSpecificInfo = new SegmentSpecificInfo(source.SegmentSpecificInfo);
        }
        if (source.ScenarioBased != null) {
            this.ScenarioBased = new Long(source.ScenarioBased);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
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
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "GopUnit", this.GopUnit);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Vcrf", this.Vcrf);
        this.setParamSimple(map, prefix + "ContentAdaptStream", this.ContentAdaptStream);
        this.setParamSimple(map, prefix + "HlsTime", this.HlsTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "FpsDenominator", this.FpsDenominator);
        this.setParamSimple(map, prefix + "Stereo3dType", this.Stereo3dType);
        this.setParamSimple(map, prefix + "VideoProfile", this.VideoProfile);
        this.setParamSimple(map, prefix + "VideoLevel", this.VideoLevel);
        this.setParamSimple(map, prefix + "Bframes", this.Bframes);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Sar", this.Sar);
        this.setParamSimple(map, prefix + "NoScenecut", this.NoScenecut);
        this.setParamSimple(map, prefix + "BitDepth", this.BitDepth);
        this.setParamSimple(map, prefix + "RawPts", this.RawPts);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "SegmentSpecificInfo.", this.SegmentSpecificInfo);
        this.setParamSimple(map, prefix + "ScenarioBased", this.ScenarioBased);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);

    }
}

