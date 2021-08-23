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

public class AVTemplate extends AbstractModel{

    /**
    * Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether video is needed. `0`: not needed; `1`: needed
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used.
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * Video width. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video width will be used.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video height. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video height will be used.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
    */
    @SerializedName("TopSpeed")
    @Expose
    private String TopSpeed;

    /**
    * Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality.
    */
    @SerializedName("BitrateCompressionRatio")
    @Expose
    private Long BitrateCompressionRatio;

    /**
    * Whether audio is needed. `0`: not needed; `1`: needed
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * Audio codec. Valid value: `AAC` (default)
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000`
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used.
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * Bitrate control mode. Valid values: `CBR`, `ABR` (default)
    */
    @SerializedName("RateControlMode")
    @Expose
    private String RateControlMode;

    /**
     * Get Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits 
     * @return Name Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits
     * @param Name Name of an audio/video transcoding template, which can contain 1-20 case-sensitive letters and digits
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether video is needed. `0`: not needed; `1`: needed 
     * @return NeedVideo Whether video is needed. `0`: not needed; `1`: needed
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set Whether video is needed. `0`: not needed; `1`: needed
     * @param NeedVideo Whether video is needed. `0`: not needed; `1`: needed
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used. 
     * @return Vcodec Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used.
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used.
     * @param Vcodec Video codec. Valid values: `H264`, `H265`. If this parameter is left empty, the original video codec will be used.
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get Video width. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video width will be used. 
     * @return Width Video width. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video width will be used.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video width. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video width will be used.
     * @param Width Video width. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video width will be used.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video height. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video height will be used. 
     * @return Height Video height. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video height will be used.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Video height. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video height will be used.
     * @param Height Video height. Value range: (0, 3000]. The value must be an integer multiple of 4. If this parameter is left empty, the original video height will be used.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used. 
     * @return Fps Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used.
     * @param Fps Video frame rate. Value range: [1, 240]. If this parameter is left empty, the original frame rate will be used.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE` 
     * @return TopSpeed Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
     */
    public String getTopSpeed() {
        return this.TopSpeed;
    }

    /**
     * Set Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
     * @param TopSpeed Whether to enable top speed codec transcoding. Valid values: `CLOSE` (disable), `OPEN` (enable). Default value: `CLOSE`
     */
    public void setTopSpeed(String TopSpeed) {
        this.TopSpeed = TopSpeed;
    }

    /**
     * Get Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality. 
     * @return BitrateCompressionRatio Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality.
     */
    public Long getBitrateCompressionRatio() {
        return this.BitrateCompressionRatio;
    }

    /**
     * Set Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality.
     * @param BitrateCompressionRatio Compression ratio for top speed codec transcoding. Value range: [0, 50]. The lower the compression ratio, the higher the image quality.
     */
    public void setBitrateCompressionRatio(Long BitrateCompressionRatio) {
        this.BitrateCompressionRatio = BitrateCompressionRatio;
    }

    /**
     * Get Whether audio is needed. `0`: not needed; `1`: needed 
     * @return NeedAudio Whether audio is needed. `0`: not needed; `1`: needed
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set Whether audio is needed. `0`: not needed; `1`: needed
     * @param NeedAudio Whether audio is needed. `0`: not needed; `1`: needed
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get Audio codec. Valid value: `AAC` (default) 
     * @return Acodec Audio codec. Valid value: `AAC` (default)
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set Audio codec. Valid value: `AAC` (default)
     * @param Acodec Audio codec. Valid value: `AAC` (default)
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000` 
     * @return AudioBitrate Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000`
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000`
     * @param AudioBitrate Audio bitrate. If this parameter is left empty, the original bitrate will be used.
Valid values: `6000`, `7000`, `8000`, `10000`, `12000`, `14000`, `16000`, `20000`, `24000`, `28000`, `32000`, `40000`, `48000`, `56000`, `64000`, `80000`, `96000`, `112000`, `128000`, `160000`, `192000`, `224000`, `256000`, `288000`, `320000`, `384000`, `448000`, `512000`, `576000`, `640000`, `768000`, `896000`, `1024000`
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used. 
     * @return VideoBitrate Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used.
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used.
     * @param VideoBitrate Video bitrate. Value range: [50000, 40000000]. The value must be an integer multiple of 1000. If this parameter is left empty, the original bitrate will be used.
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
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

    public AVTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AVTemplate(AVTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NeedVideo != null) {
            this.NeedVideo = new Long(source.NeedVideo);
        }
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
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
        if (source.NeedAudio != null) {
            this.NeedAudio = new Long(source.NeedAudio);
        }
        if (source.Acodec != null) {
            this.Acodec = new String(source.Acodec);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
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
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "TopSpeed", this.TopSpeed);
        this.setParamSimple(map, prefix + "BitrateCompressionRatio", this.BitrateCompressionRatio);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "RateControlMode", this.RateControlMode);

    }
}

