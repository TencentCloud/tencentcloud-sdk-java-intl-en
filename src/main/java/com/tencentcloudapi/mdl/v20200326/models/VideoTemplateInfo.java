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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoTemplateInfo extends AbstractModel{

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
    * Bitrate control mode. Valid values: `CBR`, `ABR` (default)
    */
    @SerializedName("RateControlMode")
    @Expose
    private String RateControlMode;

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
     * Get Bitrate control mode. Valid values: `CBR`, `ABR` (default) 
     * @return RateControlMode Bitrate control mode. Valid values: `CBR`, `ABR` (default)
     */
    public String getRateControlMode() {
        return this.RateControlMode;
    }

    /**
     * Set Bitrate control mode. Valid values: `CBR`, `ABR` (default)
     * @param RateControlMode Bitrate control mode. Valid values: `CBR`, `ABR` (default)
     */
    public void setRateControlMode(String RateControlMode) {
        this.RateControlMode = RateControlMode;
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

    }
}

