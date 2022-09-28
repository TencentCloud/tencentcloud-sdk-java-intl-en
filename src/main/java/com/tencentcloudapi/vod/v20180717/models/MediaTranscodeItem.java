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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTranscodeItem extends AbstractModel{

    /**
    * Address of output video file.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Sum of the average bitrate of a video stream and that of an audio stream in bps.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Maximum value of the height of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Maximum value of the width of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The file size (bytes).
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * MD5 value of video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Container, such as m4a and mp4.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Video stream information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * Audio stream information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li>
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
     * Get Address of output video file.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Url Address of output video file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Address of output video file.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Url Address of output video file.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Definition Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Definition Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Sum of the average bitrate of a video stream and that of an audio stream in bps.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Bitrate Sum of the average bitrate of a video stream and that of an audio stream in bps.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Sum of the average bitrate of a video stream and that of an audio stream in bps.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Bitrate Sum of the average bitrate of a video stream and that of an audio stream in bps.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Maximum value of the height of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Height Maximum value of the height of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum value of the height of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Height Maximum value of the height of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Maximum value of the width of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Width Maximum value of the width of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the width of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Width Maximum value of the width of a video stream in px.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The file size (bytes).
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li> 
     * @return Size The file size (bytes).
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The file size (bytes).
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
     * @param Size The file size (bytes).
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Duration Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Duration Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get MD5 value of video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Md5 MD5 value of video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set MD5 value of video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Md5 MD5 value of video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Container, such as m4a and mp4.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Container Container, such as m4a and mp4.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container, such as m4a and mp4.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Container Container, such as m4a and mp4.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Video stream information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VideoStreamSet Video stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set Video stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VideoStreamSet Video stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoStreamSet(MediaVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get Audio stream information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioStreamSet Audio stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set Audio stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioStreamSet Audio stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioStreamSet(MediaAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li> 
     * @return DigitalWatermarkType The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li>
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li>
     * @param DigitalWatermarkType The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li>
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    public MediaTranscodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTranscodeItem(MediaTranscodeItem source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.VideoStreamSet != null) {
            this.VideoStreamSet = new MediaVideoStreamItem[source.VideoStreamSet.length];
            for (int i = 0; i < source.VideoStreamSet.length; i++) {
                this.VideoStreamSet[i] = new MediaVideoStreamItem(source.VideoStreamSet[i]);
            }
        }
        if (source.AudioStreamSet != null) {
            this.AudioStreamSet = new MediaAudioStreamItem[source.AudioStreamSet.length];
            for (int i = 0; i < source.AudioStreamSet.length; i++) {
                this.AudioStreamSet[i] = new MediaAudioStreamItem(source.AudioStreamSet[i]);
            }
        }
        if (source.DigitalWatermarkType != null) {
            this.DigitalWatermarkType = new String(source.DigitalWatermarkType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamArrayObj(map, prefix + "VideoStreamSet.", this.VideoStreamSet);
        this.setParamArrayObj(map, prefix + "AudioStreamSet.", this.AudioStreamSet);
        this.setParamSimple(map, prefix + "DigitalWatermarkType", this.DigitalWatermarkType);

    }
}

