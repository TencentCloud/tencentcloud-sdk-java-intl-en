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

public class MediaTranscodeItem extends AbstractModel {

    /**
    * <p>Target storage for the transcoded file.</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>Transcoded video file path.</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1">transcoding parameter template</a>.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Sum of the mean video stream bitrate and the mean audio stream bitrate. Unit: bps.</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>Maximum height of the video stream. Unit: px.</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>Maximum video stream width. Unit: px.</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>Total size of media files (for HLS videos, the size is the sum of m3u8 and ts file sizes), unit: byte.</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>Video duration, in seconds.</p>
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * <p>Container type, for example, m4a, mp4.</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>md5 value of the video.</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>Audio stream information.</p>
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * <p>Video stream information.</p>
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * <p>Video transcoding enhancement item descriptions and explanations</p><li>hdr: HDR configuration</li><li>wd_fps: Frame interpolation frame rate configuration</li><li>video_super_resolution: Super-resolution configuration</li><li>repair: Comprehensive enhancement configuration</li><li>denoise: Video noise reduction configuration</li><li>color_enhance: Color enhancement configuration</li><li>scratch: Scratches removal configuration</li><li>artifact: Artifacts removal (burrs) configuration</li><li>sharp: Detail enhancement configuration</li><li>low_light: Low-light enhancement configuration</li><li>face_enhance: Face enhancement configuration</li>
    */
    @SerializedName("CallBackExtInfo")
    @Expose
    private String CallBackExtInfo;

    /**
    * <p>MediaTranscodeItem</p>
    */
    @SerializedName("Usage")
    @Expose
    private MediaUsageItem Usage;

    /**
     * Get <p>Target storage for the transcoded file.</p> 
     * @return OutputStorage <p>Target storage for the transcoded file.</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Target storage for the transcoded file.</p>
     * @param OutputStorage <p>Target storage for the transcoded file.</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>Transcoded video file path.</p> 
     * @return Path <p>Transcoded video file path.</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Transcoded video file path.</p>
     * @param Path <p>Transcoded video file path.</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1">transcoding parameter template</a>.</p> 
     * @return Definition <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1">transcoding parameter template</a>.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1">transcoding parameter template</a>.</p>
     * @param Definition <p>Transcoding specification ID. Please refer to <a href="https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1">transcoding parameter template</a>.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Sum of the mean video stream bitrate and the mean audio stream bitrate. Unit: bps.</p> 
     * @return Bitrate <p>Sum of the mean video stream bitrate and the mean audio stream bitrate. Unit: bps.</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>Sum of the mean video stream bitrate and the mean audio stream bitrate. Unit: bps.</p>
     * @param Bitrate <p>Sum of the mean video stream bitrate and the mean audio stream bitrate. Unit: bps.</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>Maximum height of the video stream. Unit: px.</p> 
     * @return Height <p>Maximum height of the video stream. Unit: px.</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>Maximum height of the video stream. Unit: px.</p>
     * @param Height <p>Maximum height of the video stream. Unit: px.</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>Maximum video stream width. Unit: px.</p> 
     * @return Width <p>Maximum video stream width. Unit: px.</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>Maximum video stream width. Unit: px.</p>
     * @param Width <p>Maximum video stream width. Unit: px.</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>Total size of media files (for HLS videos, the size is the sum of m3u8 and ts file sizes), unit: byte.</p> 
     * @return Size <p>Total size of media files (for HLS videos, the size is the sum of m3u8 and ts file sizes), unit: byte.</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>Total size of media files (for HLS videos, the size is the sum of m3u8 and ts file sizes), unit: byte.</p>
     * @param Size <p>Total size of media files (for HLS videos, the size is the sum of m3u8 and ts file sizes), unit: byte.</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>Video duration, in seconds.</p> 
     * @return Duration <p>Video duration, in seconds.</p>
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Video duration, in seconds.</p>
     * @param Duration <p>Video duration, in seconds.</p>
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Container type, for example, m4a, mp4.</p> 
     * @return Container <p>Container type, for example, m4a, mp4.</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>Container type, for example, m4a, mp4.</p>
     * @param Container <p>Container type, for example, m4a, mp4.</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>md5 value of the video.</p> 
     * @return Md5 <p>md5 value of the video.</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>md5 value of the video.</p>
     * @param Md5 <p>md5 value of the video.</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>Audio stream information.</p> 
     * @return AudioStreamSet <p>Audio stream information.</p>
     */
    public MediaAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set <p>Audio stream information.</p>
     * @param AudioStreamSet <p>Audio stream information.</p>
     */
    public void setAudioStreamSet(MediaAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get <p>Video stream information.</p> 
     * @return VideoStreamSet <p>Video stream information.</p>
     */
    public MediaVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set <p>Video stream information.</p>
     * @param VideoStreamSet <p>Video stream information.</p>
     */
    public void setVideoStreamSet(MediaVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get <p>Video transcoding enhancement item descriptions and explanations</p><li>hdr: HDR configuration</li><li>wd_fps: Frame interpolation frame rate configuration</li><li>video_super_resolution: Super-resolution configuration</li><li>repair: Comprehensive enhancement configuration</li><li>denoise: Video noise reduction configuration</li><li>color_enhance: Color enhancement configuration</li><li>scratch: Scratches removal configuration</li><li>artifact: Artifacts removal (burrs) configuration</li><li>sharp: Detail enhancement configuration</li><li>low_light: Low-light enhancement configuration</li><li>face_enhance: Face enhancement configuration</li> 
     * @return CallBackExtInfo <p>Video transcoding enhancement item descriptions and explanations</p><li>hdr: HDR configuration</li><li>wd_fps: Frame interpolation frame rate configuration</li><li>video_super_resolution: Super-resolution configuration</li><li>repair: Comprehensive enhancement configuration</li><li>denoise: Video noise reduction configuration</li><li>color_enhance: Color enhancement configuration</li><li>scratch: Scratches removal configuration</li><li>artifact: Artifacts removal (burrs) configuration</li><li>sharp: Detail enhancement configuration</li><li>low_light: Low-light enhancement configuration</li><li>face_enhance: Face enhancement configuration</li>
     */
    public String getCallBackExtInfo() {
        return this.CallBackExtInfo;
    }

    /**
     * Set <p>Video transcoding enhancement item descriptions and explanations</p><li>hdr: HDR configuration</li><li>wd_fps: Frame interpolation frame rate configuration</li><li>video_super_resolution: Super-resolution configuration</li><li>repair: Comprehensive enhancement configuration</li><li>denoise: Video noise reduction configuration</li><li>color_enhance: Color enhancement configuration</li><li>scratch: Scratches removal configuration</li><li>artifact: Artifacts removal (burrs) configuration</li><li>sharp: Detail enhancement configuration</li><li>low_light: Low-light enhancement configuration</li><li>face_enhance: Face enhancement configuration</li>
     * @param CallBackExtInfo <p>Video transcoding enhancement item descriptions and explanations</p><li>hdr: HDR configuration</li><li>wd_fps: Frame interpolation frame rate configuration</li><li>video_super_resolution: Super-resolution configuration</li><li>repair: Comprehensive enhancement configuration</li><li>denoise: Video noise reduction configuration</li><li>color_enhance: Color enhancement configuration</li><li>scratch: Scratches removal configuration</li><li>artifact: Artifacts removal (burrs) configuration</li><li>sharp: Detail enhancement configuration</li><li>low_light: Low-light enhancement configuration</li><li>face_enhance: Face enhancement configuration</li>
     */
    public void setCallBackExtInfo(String CallBackExtInfo) {
        this.CallBackExtInfo = CallBackExtInfo;
    }

    /**
     * Get <p>MediaTranscodeItem</p> 
     * @return Usage <p>MediaTranscodeItem</p>
     */
    public MediaUsageItem getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>MediaTranscodeItem</p>
     * @param Usage <p>MediaTranscodeItem</p>
     */
    public void setUsage(MediaUsageItem Usage) {
        this.Usage = Usage;
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
        if (source.Usage != null) {
            this.Usage = new MediaUsageItem(source.Usage);
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
        this.setParamObj(map, prefix + "Usage.", this.Usage);

    }
}

