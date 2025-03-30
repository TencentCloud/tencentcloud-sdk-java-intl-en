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

public class MediaTranscodeItem extends AbstractModel {

    /**
    * Target bucket of an output file.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Path to an output video file.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Sum of the average bitrate of a video stream and that of an audio stream in bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Maximum value of the height of a video stream in px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Maximum value of the width of a video stream in px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Total size of a media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Video duration in seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Container, such as m4a and mp4.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * MD5 value of a video.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Audio stream information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * Video stream information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * Enhancement items used for video transcoding. Descriptions of enhancement items:
<li>hdr: HDR configuration</li>
<li>wd_fps: configuration of frame interpolation for higher frame rate</li>
<li>video_super_resolution: 	super-resolution configuration</li>
<li>repair: comprehensive enhancement configuration</li>
<li>denoise: video denoising configuration</li>
<Li>color_enhance: color enhancement configuration</li>
<Li>scratch: scratch removal configuration</li>
<li>artifact: artifact (glitch) removal configuration</li>
<li>sharp: detail enhancement configuration</li>
<Li>low_light: low-light enhancement configuration</li>
<Li>face_enhance: face enhancement configuration</li>
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CallBackExtInfo")
    @Expose
    private String CallBackExtInfo;

    /**
     * Get Target bucket of an output file. 
     * @return OutputStorage Target bucket of an output file.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target bucket of an output file.
     * @param OutputStorage Target bucket of an output file.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Path to an output video file. 
     * @return Path Path to an output video file.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path to an output video file.
     * @param Path Path to an output video file.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF). 
     * @return Definition Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     * @param Definition Transcoding specification ID. For more information, please see [Transcoding Parameter Template](https://intl.cloud.tencent.com/document/product/266/33478?from_cn_redirect=1#.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Sum of the average bitrate of a video stream and that of an audio stream in bps. 
     * @return Bitrate Sum of the average bitrate of a video stream and that of an audio stream in bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Sum of the average bitrate of a video stream and that of an audio stream in bps.
     * @param Bitrate Sum of the average bitrate of a video stream and that of an audio stream in bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Maximum value of the height of a video stream in px. 
     * @return Height Maximum value of the height of a video stream in px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum value of the height of a video stream in px.
     * @param Height Maximum value of the height of a video stream in px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Maximum value of the width of a video stream in px. 
     * @return Width Maximum value of the width of a video stream in px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the width of a video stream in px.
     * @param Width Maximum value of the width of a video stream in px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Total size of a media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format). 
     * @return Size Total size of a media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Total size of a media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
     * @param Size Total size of a media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Video duration in seconds. 
     * @return Duration Video duration in seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Video duration in seconds.
     * @param Duration Video duration in seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Container, such as m4a and mp4. 
     * @return Container Container, such as m4a and mp4.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container, such as m4a and mp4.
     * @param Container Container, such as m4a and mp4.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get MD5 value of a video. 
     * @return Md5 MD5 value of a video.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set MD5 value of a video.
     * @param Md5 MD5 value of a video.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Audio stream information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AudioStreamSet Audio stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set Audio stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AudioStreamSet Audio stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioStreamSet(MediaAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get Video stream information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoStreamSet Video stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set Video stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoStreamSet Video stream information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoStreamSet(MediaVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get Enhancement items used for video transcoding. Descriptions of enhancement items:
<li>hdr: HDR configuration</li>
<li>wd_fps: configuration of frame interpolation for higher frame rate</li>
<li>video_super_resolution: 	super-resolution configuration</li>
<li>repair: comprehensive enhancement configuration</li>
<li>denoise: video denoising configuration</li>
<Li>color_enhance: color enhancement configuration</li>
<Li>scratch: scratch removal configuration</li>
<li>artifact: artifact (glitch) removal configuration</li>
<li>sharp: detail enhancement configuration</li>
<Li>low_light: low-light enhancement configuration</li>
<Li>face_enhance: face enhancement configuration</li>
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CallBackExtInfo Enhancement items used for video transcoding. Descriptions of enhancement items:
<li>hdr: HDR configuration</li>
<li>wd_fps: configuration of frame interpolation for higher frame rate</li>
<li>video_super_resolution: 	super-resolution configuration</li>
<li>repair: comprehensive enhancement configuration</li>
<li>denoise: video denoising configuration</li>
<Li>color_enhance: color enhancement configuration</li>
<Li>scratch: scratch removal configuration</li>
<li>artifact: artifact (glitch) removal configuration</li>
<li>sharp: detail enhancement configuration</li>
<Li>low_light: low-light enhancement configuration</li>
<Li>face_enhance: face enhancement configuration</li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCallBackExtInfo() {
        return this.CallBackExtInfo;
    }

    /**
     * Set Enhancement items used for video transcoding. Descriptions of enhancement items:
<li>hdr: HDR configuration</li>
<li>wd_fps: configuration of frame interpolation for higher frame rate</li>
<li>video_super_resolution: 	super-resolution configuration</li>
<li>repair: comprehensive enhancement configuration</li>
<li>denoise: video denoising configuration</li>
<Li>color_enhance: color enhancement configuration</li>
<Li>scratch: scratch removal configuration</li>
<li>artifact: artifact (glitch) removal configuration</li>
<li>sharp: detail enhancement configuration</li>
<Li>low_light: low-light enhancement configuration</li>
<Li>face_enhance: face enhancement configuration</li>
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CallBackExtInfo Enhancement items used for video transcoding. Descriptions of enhancement items:
<li>hdr: HDR configuration</li>
<li>wd_fps: configuration of frame interpolation for higher frame rate</li>
<li>video_super_resolution: 	super-resolution configuration</li>
<li>repair: comprehensive enhancement configuration</li>
<li>denoise: video denoising configuration</li>
<Li>color_enhance: color enhancement configuration</li>
<Li>scratch: scratch removal configuration</li>
<li>artifact: artifact (glitch) removal configuration</li>
<li>sharp: detail enhancement configuration</li>
<Li>low_light: low-light enhancement configuration</li>
<Li>face_enhance: face enhancement configuration</li>
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCallBackExtInfo(String CallBackExtInfo) {
        this.CallBackExtInfo = CallBackExtInfo;
    }

    public MediaTranscodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTranscodeItem(MediaTranscodeItem source) {
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
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
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.AudioStreamSet != null) {
            this.AudioStreamSet = new MediaAudioStreamItem[source.AudioStreamSet.length];
            for (int i = 0; i < source.AudioStreamSet.length; i++) {
                this.AudioStreamSet[i] = new MediaAudioStreamItem(source.AudioStreamSet[i]);
            }
        }
        if (source.VideoStreamSet != null) {
            this.VideoStreamSet = new MediaVideoStreamItem[source.VideoStreamSet.length];
            for (int i = 0; i < source.VideoStreamSet.length; i++) {
                this.VideoStreamSet[i] = new MediaVideoStreamItem(source.VideoStreamSet[i]);
            }
        }
        if (source.CallBackExtInfo != null) {
            this.CallBackExtInfo = new String(source.CallBackExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamArrayObj(map, prefix + "AudioStreamSet.", this.AudioStreamSet);
        this.setParamArrayObj(map, prefix + "VideoStreamSet.", this.VideoStreamSet);
        this.setParamSimple(map, prefix + "CallBackExtInfo", this.CallBackExtInfo);

    }
}

