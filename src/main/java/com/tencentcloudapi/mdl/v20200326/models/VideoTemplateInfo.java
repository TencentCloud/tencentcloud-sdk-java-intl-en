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
    * Video width. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video height. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Video frame rate. Value range: [1,240]. If this parameter is left empty, the original value will be used.
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
    * Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`.
    */
    @SerializedName("RateControlMode")
    @Expose
    private String RateControlMode;

    /**
    * Watermark ID
Note: This field may return `null`, indicating that no valid value was found.
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
    * This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter.
    */
    @SerializedName("FrameRateType")
    @Expose
    private String FrameRateType;

    /**
    * Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting.
    */
    @SerializedName("FrameRateNumerator")
    @Expose
    private Long FrameRateNumerator;

    /**
    * Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting.
    */
    @SerializedName("FrameRateDenominator")
    @Expose
    private Long FrameRateDenominator;

    /**
    * The number of B frames can be selected from 1 to 3.
    */
    @SerializedName("BFramesNum")
    @Expose
    private Long BFramesNum;

    /**
    * The number of reference frames can be selected from 1 to 16.
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
    * 
    */
    @SerializedName("VideoEnhanceEnabled")
    @Expose
    private Long VideoEnhanceEnabled;

    /**
    * 
    */
    @SerializedName("VideoEnhanceSettings")
    @Expose
    private VideoEnhanceSetting [] VideoEnhanceSettings;

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
     * Get Video width. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used. 
     * @return Width Video width. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video width. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used.
     * @param Width Video width. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video height. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used. 
     * @return Height Video height. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Video height. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used.
     * @param Height Video height. Value range: (0,3000]. The value can only be a multiple of 4. If this parameter is left empty, the original value will be used.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Video frame rate. Value range: [1,240]. If this parameter is left empty, the original value will be used. 
     * @return Fps Video frame rate. Value range: [1,240]. If this parameter is left empty, the original value will be used.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate. Value range: [1,240]. If this parameter is left empty, the original value will be used.
     * @param Fps Video frame rate. Value range: [1,240]. If this parameter is left empty, the original value will be used.
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
     * Get Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`. 
     * @return RateControlMode Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`.
     */
    public String getRateControlMode() {
        return this.RateControlMode;
    }

    /**
     * Set Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`.
     * @param RateControlMode Bitrate control mode. Valid values: `CBR`, `ABR` (default), `VBR`.
     */
    public void setRateControlMode(String RateControlMode) {
        this.RateControlMode = RateControlMode;
    }

    /**
     * Get Watermark ID
Note: This field may return `null`, indicating that no valid value was found. 
     * @return WatermarkId Watermark ID
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set Watermark ID
Note: This field may return `null`, indicating that no valid value was found.
     * @param WatermarkId Watermark ID
Note: This field may return `null`, indicating that no valid value was found.
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
     * Get This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter. 
     * @return FrameRateType This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter.
     */
    public String getFrameRateType() {
        return this.FrameRateType;
    }

    /**
     * Set This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter.
     * @param FrameRateType This field indicates how to specify the output video frame rate. If FOLLOW_SOURCE is selected, the output video frame rate will be set equal to the input video frame rate of the first input. If SPECIFIED_FRACTION is selected, the output video frame rate is determined by the fraction (frame rate numerator and frame rate denominator). If SPECIFIED_HZ is selected, the frame rate of the output video is determined by the HZ you enter.
     */
    public void setFrameRateType(String FrameRateType) {
        this.FrameRateType = FrameRateType;
    }

    /**
     * Get Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting. 
     * @return FrameRateNumerator Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting.
     */
    public Long getFrameRateNumerator() {
        return this.FrameRateNumerator;
    }

    /**
     * Set Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting.
     * @param FrameRateNumerator Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate numerator setting.
     */
    public void setFrameRateNumerator(Long FrameRateNumerator) {
        this.FrameRateNumerator = FrameRateNumerator;
    }

    /**
     * Get Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting. 
     * @return FrameRateDenominator Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting.
     */
    public Long getFrameRateDenominator() {
        return this.FrameRateDenominator;
    }

    /**
     * Set Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting.
     * @param FrameRateDenominator Valid when the FrameRateType type you select is SPECIFIED_FRACTION, the output frame rate denominator setting.
     */
    public void setFrameRateDenominator(Long FrameRateDenominator) {
        this.FrameRateDenominator = FrameRateDenominator;
    }

    /**
     * Get The number of B frames can be selected from 1 to 3. 
     * @return BFramesNum The number of B frames can be selected from 1 to 3.
     */
    public Long getBFramesNum() {
        return this.BFramesNum;
    }

    /**
     * Set The number of B frames can be selected from 1 to 3.
     * @param BFramesNum The number of B frames can be selected from 1 to 3.
     */
    public void setBFramesNum(Long BFramesNum) {
        this.BFramesNum = BFramesNum;
    }

    /**
     * Get The number of reference frames can be selected from 1 to 16. 
     * @return RefFramesNum The number of reference frames can be selected from 1 to 16.
     */
    public Long getRefFramesNum() {
        return this.RefFramesNum;
    }

    /**
     * Set The number of reference frames can be selected from 1 to 16.
     * @param RefFramesNum The number of reference frames can be selected from 1 to 16.
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
     * Get  
     * @return VideoEnhanceEnabled 
     */
    public Long getVideoEnhanceEnabled() {
        return this.VideoEnhanceEnabled;
    }

    /**
     * Set 
     * @param VideoEnhanceEnabled 
     */
    public void setVideoEnhanceEnabled(Long VideoEnhanceEnabled) {
        this.VideoEnhanceEnabled = VideoEnhanceEnabled;
    }

    /**
     * Get  
     * @return VideoEnhanceSettings 
     */
    public VideoEnhanceSetting [] getVideoEnhanceSettings() {
        return this.VideoEnhanceSettings;
    }

    /**
     * Set 
     * @param VideoEnhanceSettings 
     */
    public void setVideoEnhanceSettings(VideoEnhanceSetting [] VideoEnhanceSettings) {
        this.VideoEnhanceSettings = VideoEnhanceSettings;
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

    }
}

