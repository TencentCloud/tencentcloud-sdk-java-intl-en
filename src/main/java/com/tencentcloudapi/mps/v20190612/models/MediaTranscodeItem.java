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
    * Target storage of the transcoded file.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * Video file path after transcoding.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Transcoding specification ID. Please refer to the transcoding parameter template (https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Sum of the average video stream bitrate and the average audio stream bit rate. Measurement unit: bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Maximum value of video stream height, measurement unit: px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Maximum value of the video stream width in px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Total size of media files (when the video is HLS, the size is the sum of m3u8 and ts file sizes), measurement unit: byte.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Video duration, in seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Container type, such as m4a and mp4.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * md5 value of the video.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Audio stream information.
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * Video stream information.
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * 
    */
    @SerializedName("CallBackExtInfo")
    @Expose
    private String CallBackExtInfo;

    /**
     * Get Target storage of the transcoded file. 
     * @return OutputStorage Target storage of the transcoded file.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set Target storage of the transcoded file.
     * @param OutputStorage Target storage of the transcoded file.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get Video file path after transcoding. 
     * @return Path Video file path after transcoding.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Video file path after transcoding.
     * @param Path Video file path after transcoding.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Transcoding specification ID. Please refer to the transcoding parameter template (https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1). 
     * @return Definition Transcoding specification ID. Please refer to the transcoding parameter template (https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Transcoding specification ID. Please refer to the transcoding parameter template (https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1).
     * @param Definition Transcoding specification ID. Please refer to the transcoding parameter template (https://www.tencentcloud.com/document/product/862/37042?from_cn_redirect=1).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Sum of the average video stream bitrate and the average audio stream bit rate. Measurement unit: bps. 
     * @return Bitrate Sum of the average video stream bitrate and the average audio stream bit rate. Measurement unit: bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Sum of the average video stream bitrate and the average audio stream bit rate. Measurement unit: bps.
     * @param Bitrate Sum of the average video stream bitrate and the average audio stream bit rate. Measurement unit: bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Maximum value of video stream height, measurement unit: px. 
     * @return Height Maximum value of video stream height, measurement unit: px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum value of video stream height, measurement unit: px.
     * @param Height Maximum value of video stream height, measurement unit: px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Maximum value of the video stream width in px. 
     * @return Width Maximum value of the video stream width in px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the video stream width in px.
     * @param Width Maximum value of the video stream width in px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Total size of media files (when the video is HLS, the size is the sum of m3u8 and ts file sizes), measurement unit: byte. 
     * @return Size Total size of media files (when the video is HLS, the size is the sum of m3u8 and ts file sizes), measurement unit: byte.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Total size of media files (when the video is HLS, the size is the sum of m3u8 and ts file sizes), measurement unit: byte.
     * @param Size Total size of media files (when the video is HLS, the size is the sum of m3u8 and ts file sizes), measurement unit: byte.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Video duration, in seconds. 
     * @return Duration Video duration, in seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Video duration, in seconds.
     * @param Duration Video duration, in seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Container type, such as m4a and mp4. 
     * @return Container Container type, such as m4a and mp4.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container type, such as m4a and mp4.
     * @param Container Container type, such as m4a and mp4.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get md5 value of the video. 
     * @return Md5 md5 value of the video.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set md5 value of the video.
     * @param Md5 md5 value of the video.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Audio stream information. 
     * @return AudioStreamSet Audio stream information.
     */
    public MediaAudioStreamItem [] getAudioStreamSet() {
        return this.AudioStreamSet;
    }

    /**
     * Set Audio stream information.
     * @param AudioStreamSet Audio stream information.
     */
    public void setAudioStreamSet(MediaAudioStreamItem [] AudioStreamSet) {
        this.AudioStreamSet = AudioStreamSet;
    }

    /**
     * Get Video stream information. 
     * @return VideoStreamSet Video stream information.
     */
    public MediaVideoStreamItem [] getVideoStreamSet() {
        return this.VideoStreamSet;
    }

    /**
     * Set Video stream information.
     * @param VideoStreamSet Video stream information.
     */
    public void setVideoStreamSet(MediaVideoStreamItem [] VideoStreamSet) {
        this.VideoStreamSet = VideoStreamSet;
    }

    /**
     * Get  
     * @return CallBackExtInfo 
     */
    public String getCallBackExtInfo() {
        return this.CallBackExtInfo;
    }

    /**
     * Set 
     * @param CallBackExtInfo 
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

