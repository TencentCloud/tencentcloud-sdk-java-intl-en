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

public class VideoTemplateInfo extends AbstractModel {

    /**
    * Video transcoding template name, which can contain 1-20 letters and digits.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Video codec. Valid values: H264/H265. If this parameter is left empty, the original value will be used.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Video bitrate. Value range: [50000,40000000]. The value can only be a multiple of 1,000. If this parameter is left empty, the original value will be used.
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Video width. The input range is (0, 4096] and must be a multiple of 2. If left blank, it represents passthrough.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video height. Input range is (0, 4096] and must be a multiple of 2. Leave empty to represent passthrough.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Video frame rate. Valid when you select SPECIFIED_HZ for FrameRateType. Input range is [1, 240]. Leave blank to represent passthrough.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Whether to enable top speed codec. Valid value: CLOSE/OPEN. Default value: CLOSE.
    */
    @SerializedName("TopSpeed")
    @Expose
    private String TopSpeed;

    /**
    * Top speed codec compression ratio. Value range: [0,50]. The lower the compression ratio, the higher the image quality.
    */
    @SerializedName("BitrateCompressionRatio")
    @Expose
    private Long BitrateCompressionRatio;

    /**
    * Bitrate control mode. Optional values: [CBR|ABR|VBR]. Default: ABR.
    */
    @SerializedName("RateControlMode")
    @Expose
    private String RateControlMode;

    /**
    * Watermark Id.
    */
    @SerializedName("WatermarkId")
    @Expose
    private String WatermarkId;

    /**
    * Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0.
    */
    @SerializedName("FaceBlurringEnabled")
    @Expose
    private Long FaceBlurringEnabled;

    /**
    * This field indicates how to specify the output video frame rate. If selected FOLLOW_SOURCE, the output video frame rate is set to equal the frame rate of the first input video. If selected SPECIFIED_FRACTION, the output video frame rate is determined by the fraction (frame rate molecular and frame rate denominator). If selected SPECIFIED_HZ, the frame rate of the output video is determined by the HZ you input.
    */
    @SerializedName("FrameRateType")
    @Expose
    private String FrameRateType;

    /**
    * Valid when you select SPECIFIED_FRACTION as the FrameRateType. Set the output frame rate molecular.
    */
    @SerializedName("FrameRateNumerator")
    @Expose
    private Long FrameRateNumerator;

    /**
    * Valid when you select SPECIFIED_FRACTION for FrameRateType. Output frame rate denominator set.
    */
    @SerializedName("FrameRateDenominator")
    @Expose
    private Long FrameRateDenominator;

    /**
    * Number of B-frames 1-3.	
    */
    @SerializedName("BFramesNum")
    @Expose
    private Long BFramesNum;

    /**
    * Refer to the number of frames 1-16.	
    */
    @SerializedName("RefFramesNum")
    @Expose
    private Long RefFramesNum;

    /**
    * Additional video bitrate configuration.	
    */
    @SerializedName("AdditionalRateSettings")
    @Expose
    private AdditionalRateSetting AdditionalRateSettings;

    /**
    * Video encoding configuration.	
    */
    @SerializedName("VideoCodecDetails")
    @Expose
    private VideoCodecDetail VideoCodecDetails;

    /**
    * Video enhancement switch, 1: enable 0: disable.
    */
    @SerializedName("VideoEnhanceEnabled")
    @Expose
    private Long VideoEnhanceEnabled;

    /**
    * Video enhancement parameters array.
    */
    @SerializedName("VideoEnhanceSettings")
    @Expose
    private VideoEnhanceSetting [] VideoEnhanceSettings;

    /**
    * Colorspace configuration.
    */
    @SerializedName("ColorSpaceSettings")
    @Expose
    private ColorSpaceSetting ColorSpaceSettings;

    /**
    * Traceable watermark.
    */
    @SerializedName("ForensicWatermarkIds")
    @Expose
    private String [] ForensicWatermarkIds;

    /**
     * Get Video transcoding template name, which can contain 1-20 letters and digits. 
     * @return Name Video transcoding template name, which can contain 1-20 letters and digits.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Video transcoding template name, which can contain 1-20 letters and digits.
     * @param Name Video transcoding template name, which can contain 1-20 letters and digits.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Video codec. Valid values: H264/H265. If this parameter is left empty, the original value will be used. 
     * @return Vcodec Video codec. Valid values: H264/H265. If this parameter is left empty, the original value will be used.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video codec. Valid values: H264/H265. If this parameter is left empty, the original value will be used.
     * @param Vcodec Video codec. Valid values: H264/H265. If this parameter is left empty, the original value will be used.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Video bitrate. Value range: [50000,40000000]. The value can only be a multiple of 1,000. If this parameter is left empty, the original value will be used. 
     * @return VideoBitrate Video bitrate. Value range: [50000,40000000]. The value can only be a multiple of 1,000. If this parameter is left empty, the original value will be used.
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate. Value range: [50000,40000000]. The value can only be a multiple of 1,000. If this parameter is left empty, the original value will be used.
     * @param VideoBitrate Video bitrate. Value range: [50000,40000000]. The value can only be a multiple of 1,000. If this parameter is left empty, the original value will be used.
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get Video width. The input range is (0, 4096] and must be a multiple of 2. If left blank, it represents passthrough. 
     * @return Width Video width. The input range is (0, 4096] and must be a multiple of 2. If left blank, it represents passthrough.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video width. The input range is (0, 4096] and must be a multiple of 2. If left blank, it represents passthrough.
     * @param Width Video width. The input range is (0, 4096] and must be a multiple of 2. If left blank, it represents passthrough.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video height. Input range is (0, 4096] and must be a multiple of 2. Leave empty to represent passthrough. 
     * @return Height Video height. Input range is (0, 4096] and must be a multiple of 2. Leave empty to represent passthrough.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Video height. Input range is (0, 4096] and must be a multiple of 2. Leave empty to represent passthrough.
     * @param Height Video height. Input range is (0, 4096] and must be a multiple of 2. Leave empty to represent passthrough.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Video frame rate. Valid when you select SPECIFIED_HZ for FrameRateType. Input range is [1, 240]. Leave blank to represent passthrough. 
     * @return Fps Video frame rate. Valid when you select SPECIFIED_HZ for FrameRateType. Input range is [1, 240]. Leave blank to represent passthrough.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate. Valid when you select SPECIFIED_HZ for FrameRateType. Input range is [1, 240]. Leave blank to represent passthrough.
     * @param Fps Video frame rate. Valid when you select SPECIFIED_HZ for FrameRateType. Input range is [1, 240]. Leave blank to represent passthrough.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Whether to enable top speed codec. Valid value: CLOSE/OPEN. Default value: CLOSE. 
     * @return TopSpeed Whether to enable top speed codec. Valid value: CLOSE/OPEN. Default value: CLOSE.
     */
    public String getTopSpeed() {
        return this.TopSpeed;
    }

    /**
     * Set Whether to enable top speed codec. Valid value: CLOSE/OPEN. Default value: CLOSE.
     * @param TopSpeed Whether to enable top speed codec. Valid value: CLOSE/OPEN. Default value: CLOSE.
     */
    public void setTopSpeed(String TopSpeed) {
        this.TopSpeed = TopSpeed;
    }

    /**
     * Get Top speed codec compression ratio. Value range: [0,50]. The lower the compression ratio, the higher the image quality. 
     * @return BitrateCompressionRatio Top speed codec compression ratio. Value range: [0,50]. The lower the compression ratio, the higher the image quality.
     */
    public Long getBitrateCompressionRatio() {
        return this.BitrateCompressionRatio;
    }

    /**
     * Set Top speed codec compression ratio. Value range: [0,50]. The lower the compression ratio, the higher the image quality.
     * @param BitrateCompressionRatio Top speed codec compression ratio. Value range: [0,50]. The lower the compression ratio, the higher the image quality.
     */
    public void setBitrateCompressionRatio(Long BitrateCompressionRatio) {
        this.BitrateCompressionRatio = BitrateCompressionRatio;
    }

    /**
     * Get Bitrate control mode. Optional values: [CBR|ABR|VBR]. Default: ABR. 
     * @return RateControlMode Bitrate control mode. Optional values: [CBR|ABR|VBR]. Default: ABR.
     */
    public String getRateControlMode() {
        return this.RateControlMode;
    }

    /**
     * Set Bitrate control mode. Optional values: [CBR|ABR|VBR]. Default: ABR.
     * @param RateControlMode Bitrate control mode. Optional values: [CBR|ABR|VBR]. Default: ABR.
     */
    public void setRateControlMode(String RateControlMode) {
        this.RateControlMode = RateControlMode;
    }

    /**
     * Get Watermark Id. 
     * @return WatermarkId Watermark Id.
     */
    public String getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set Watermark Id.
     * @param WatermarkId Watermark Id.
     */
    public void setWatermarkId(String WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * Get Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0. 
     * @return FaceBlurringEnabled Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0.
     */
    public Long getFaceBlurringEnabled() {
        return this.FaceBlurringEnabled;
    }

    /**
     * Set Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0.
     * @param FaceBlurringEnabled Whether to enable the face blur function, 1 is on, 0 is off, and the default is 0.
     */
    public void setFaceBlurringEnabled(Long FaceBlurringEnabled) {
        this.FaceBlurringEnabled = FaceBlurringEnabled;
    }

    /**
     * Get This field indicates how to specify the output video frame rate. If selected FOLLOW_SOURCE, the output video frame rate is set to equal the frame rate of the first input video. If selected SPECIFIED_FRACTION, the output video frame rate is determined by the fraction (frame rate molecular and frame rate denominator). If selected SPECIFIED_HZ, the frame rate of the output video is determined by the HZ you input. 
     * @return FrameRateType This field indicates how to specify the output video frame rate. If selected FOLLOW_SOURCE, the output video frame rate is set to equal the frame rate of the first input video. If selected SPECIFIED_FRACTION, the output video frame rate is determined by the fraction (frame rate molecular and frame rate denominator). If selected SPECIFIED_HZ, the frame rate of the output video is determined by the HZ you input.
     */
    public String getFrameRateType() {
        return this.FrameRateType;
    }

    /**
     * Set This field indicates how to specify the output video frame rate. If selected FOLLOW_SOURCE, the output video frame rate is set to equal the frame rate of the first input video. If selected SPECIFIED_FRACTION, the output video frame rate is determined by the fraction (frame rate molecular and frame rate denominator). If selected SPECIFIED_HZ, the frame rate of the output video is determined by the HZ you input.
     * @param FrameRateType This field indicates how to specify the output video frame rate. If selected FOLLOW_SOURCE, the output video frame rate is set to equal the frame rate of the first input video. If selected SPECIFIED_FRACTION, the output video frame rate is determined by the fraction (frame rate molecular and frame rate denominator). If selected SPECIFIED_HZ, the frame rate of the output video is determined by the HZ you input.
     */
    public void setFrameRateType(String FrameRateType) {
        this.FrameRateType = FrameRateType;
    }

    /**
     * Get Valid when you select SPECIFIED_FRACTION as the FrameRateType. Set the output frame rate molecular. 
     * @return FrameRateNumerator Valid when you select SPECIFIED_FRACTION as the FrameRateType. Set the output frame rate molecular.
     */
    public Long getFrameRateNumerator() {
        return this.FrameRateNumerator;
    }

    /**
     * Set Valid when you select SPECIFIED_FRACTION as the FrameRateType. Set the output frame rate molecular.
     * @param FrameRateNumerator Valid when you select SPECIFIED_FRACTION as the FrameRateType. Set the output frame rate molecular.
     */
    public void setFrameRateNumerator(Long FrameRateNumerator) {
        this.FrameRateNumerator = FrameRateNumerator;
    }

    /**
     * Get Valid when you select SPECIFIED_FRACTION for FrameRateType. Output frame rate denominator set. 
     * @return FrameRateDenominator Valid when you select SPECIFIED_FRACTION for FrameRateType. Output frame rate denominator set.
     */
    public Long getFrameRateDenominator() {
        return this.FrameRateDenominator;
    }

    /**
     * Set Valid when you select SPECIFIED_FRACTION for FrameRateType. Output frame rate denominator set.
     * @param FrameRateDenominator Valid when you select SPECIFIED_FRACTION for FrameRateType. Output frame rate denominator set.
     */
    public void setFrameRateDenominator(Long FrameRateDenominator) {
        this.FrameRateDenominator = FrameRateDenominator;
    }

    /**
     * Get Number of B-frames 1-3.	 
     * @return BFramesNum Number of B-frames 1-3.	
     */
    public Long getBFramesNum() {
        return this.BFramesNum;
    }

    /**
     * Set Number of B-frames 1-3.	
     * @param BFramesNum Number of B-frames 1-3.	
     */
    public void setBFramesNum(Long BFramesNum) {
        this.BFramesNum = BFramesNum;
    }

    /**
     * Get Refer to the number of frames 1-16.	 
     * @return RefFramesNum Refer to the number of frames 1-16.	
     */
    public Long getRefFramesNum() {
        return this.RefFramesNum;
    }

    /**
     * Set Refer to the number of frames 1-16.	
     * @param RefFramesNum Refer to the number of frames 1-16.	
     */
    public void setRefFramesNum(Long RefFramesNum) {
        this.RefFramesNum = RefFramesNum;
    }

    /**
     * Get Additional video bitrate configuration.	 
     * @return AdditionalRateSettings Additional video bitrate configuration.	
     */
    public AdditionalRateSetting getAdditionalRateSettings() {
        return this.AdditionalRateSettings;
    }

    /**
     * Set Additional video bitrate configuration.	
     * @param AdditionalRateSettings Additional video bitrate configuration.	
     */
    public void setAdditionalRateSettings(AdditionalRateSetting AdditionalRateSettings) {
        this.AdditionalRateSettings = AdditionalRateSettings;
    }

    /**
     * Get Video encoding configuration.	 
     * @return VideoCodecDetails Video encoding configuration.	
     */
    public VideoCodecDetail getVideoCodecDetails() {
        return this.VideoCodecDetails;
    }

    /**
     * Set Video encoding configuration.	
     * @param VideoCodecDetails Video encoding configuration.	
     */
    public void setVideoCodecDetails(VideoCodecDetail VideoCodecDetails) {
        this.VideoCodecDetails = VideoCodecDetails;
    }

    /**
     * Get Video enhancement switch, 1: enable 0: disable. 
     * @return VideoEnhanceEnabled Video enhancement switch, 1: enable 0: disable.
     */
    public Long getVideoEnhanceEnabled() {
        return this.VideoEnhanceEnabled;
    }

    /**
     * Set Video enhancement switch, 1: enable 0: disable.
     * @param VideoEnhanceEnabled Video enhancement switch, 1: enable 0: disable.
     */
    public void setVideoEnhanceEnabled(Long VideoEnhanceEnabled) {
        this.VideoEnhanceEnabled = VideoEnhanceEnabled;
    }

    /**
     * Get Video enhancement parameters array. 
     * @return VideoEnhanceSettings Video enhancement parameters array.
     */
    public VideoEnhanceSetting [] getVideoEnhanceSettings() {
        return this.VideoEnhanceSettings;
    }

    /**
     * Set Video enhancement parameters array.
     * @param VideoEnhanceSettings Video enhancement parameters array.
     */
    public void setVideoEnhanceSettings(VideoEnhanceSetting [] VideoEnhanceSettings) {
        this.VideoEnhanceSettings = VideoEnhanceSettings;
    }

    /**
     * Get Colorspace configuration. 
     * @return ColorSpaceSettings Colorspace configuration.
     */
    public ColorSpaceSetting getColorSpaceSettings() {
        return this.ColorSpaceSettings;
    }

    /**
     * Set Colorspace configuration.
     * @param ColorSpaceSettings Colorspace configuration.
     */
    public void setColorSpaceSettings(ColorSpaceSetting ColorSpaceSettings) {
        this.ColorSpaceSettings = ColorSpaceSettings;
    }

    /**
     * Get Traceable watermark. 
     * @return ForensicWatermarkIds Traceable watermark.
     */
    public String [] getForensicWatermarkIds() {
        return this.ForensicWatermarkIds;
    }

    /**
     * Set Traceable watermark.
     * @param ForensicWatermarkIds Traceable watermark.
     */
    public void setForensicWatermarkIds(String [] ForensicWatermarkIds) {
        this.ForensicWatermarkIds = ForensicWatermarkIds;
    }

    public VideoTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTemplateInfo(VideoTemplateInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.TopSpeed != null) {
            this.TopSpeed = new String(source.TopSpeed);
        }
        if (source.BitrateCompressionRatio != null) {
            this.BitrateCompressionRatio = new Long(source.BitrateCompressionRatio);
        }
        if (source.RateControlMode != null) {
            this.RateControlMode = new String(source.RateControlMode);
        }
        if (source.WatermarkId != null) {
            this.WatermarkId = new String(source.WatermarkId);
        }
        if (source.FaceBlurringEnabled != null) {
            this.FaceBlurringEnabled = new Long(source.FaceBlurringEnabled);
        }
        if (source.FrameRateType != null) {
            this.FrameRateType = new String(source.FrameRateType);
        }
        if (source.FrameRateNumerator != null) {
            this.FrameRateNumerator = new Long(source.FrameRateNumerator);
        }
        if (source.FrameRateDenominator != null) {
            this.FrameRateDenominator = new Long(source.FrameRateDenominator);
        }
        if (source.BFramesNum != null) {
            this.BFramesNum = new Long(source.BFramesNum);
        }
        if (source.RefFramesNum != null) {
            this.RefFramesNum = new Long(source.RefFramesNum);
        }
        if (source.AdditionalRateSettings != null) {
            this.AdditionalRateSettings = new AdditionalRateSetting(source.AdditionalRateSettings);
        }
        if (source.VideoCodecDetails != null) {
            this.VideoCodecDetails = new VideoCodecDetail(source.VideoCodecDetails);
        }
        if (source.VideoEnhanceEnabled != null) {
            this.VideoEnhanceEnabled = new Long(source.VideoEnhanceEnabled);
        }
        if (source.VideoEnhanceSettings != null) {
            this.VideoEnhanceSettings = new VideoEnhanceSetting[source.VideoEnhanceSettings.length];
            for (int i = 0; i < source.VideoEnhanceSettings.length; i++) {
                this.VideoEnhanceSettings[i] = new VideoEnhanceSetting(source.VideoEnhanceSettings[i]);
            }
        }
        if (source.ColorSpaceSettings != null) {
            this.ColorSpaceSettings = new ColorSpaceSetting(source.ColorSpaceSettings);
        }
        if (source.ForensicWatermarkIds != null) {
            this.ForensicWatermarkIds = new String[source.ForensicWatermarkIds.length];
            for (int i = 0; i < source.ForensicWatermarkIds.length; i++) {
                this.ForensicWatermarkIds[i] = new String(source.ForensicWatermarkIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "TopSpeed", this.TopSpeed);
        this.setParamSimple(map, prefix + "BitrateCompressionRatio", this.BitrateCompressionRatio);
        this.setParamSimple(map, prefix + "RateControlMode", this.RateControlMode);
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);
        this.setParamSimple(map, prefix + "FaceBlurringEnabled", this.FaceBlurringEnabled);
        this.setParamSimple(map, prefix + "FrameRateType", this.FrameRateType);
        this.setParamSimple(map, prefix + "FrameRateNumerator", this.FrameRateNumerator);
        this.setParamSimple(map, prefix + "FrameRateDenominator", this.FrameRateDenominator);
        this.setParamSimple(map, prefix + "BFramesNum", this.BFramesNum);
        this.setParamSimple(map, prefix + "RefFramesNum", this.RefFramesNum);
        this.setParamObj(map, prefix + "AdditionalRateSettings.", this.AdditionalRateSettings);
        this.setParamObj(map, prefix + "VideoCodecDetails.", this.VideoCodecDetails);
        this.setParamSimple(map, prefix + "VideoEnhanceEnabled", this.VideoEnhanceEnabled);
        this.setParamArrayObj(map, prefix + "VideoEnhanceSettings.", this.VideoEnhanceSettings);
        this.setParamObj(map, prefix + "ColorSpaceSettings.", this.ColorSpaceSettings);
        this.setParamArraySimple(map, prefix + "ForensicWatermarkIds.", this.ForensicWatermarkIds);

    }
}

