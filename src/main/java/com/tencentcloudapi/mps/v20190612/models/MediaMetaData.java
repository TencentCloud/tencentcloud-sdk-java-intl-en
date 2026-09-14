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

public class MediaMetaData extends AbstractModel {

    /**
    * Size of the uploaded media file (for HLS videos, the size is the total of the m3u8 and ts file sizes), unit: byte.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Container type, for example, m4a and mp4.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * Sum of the average video stream bitrate and average audio stream bitrate. Unit: bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Maximum height of a video stream. Unit: px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Maximum video stream width in px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video duration, unit: seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Selection angle during video shooting. Unit: degree.
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * Video stream information.
    */
    @SerializedName("VideoStreamSet")
    @Expose
    private MediaVideoStreamItem [] VideoStreamSet;

    /**
    * Audio stream information.
    */
    @SerializedName("AudioStreamSet")
    @Expose
    private MediaAudioStreamItem [] AudioStreamSet;

    /**
    * Video duration, unit: seconds.
    */
    @SerializedName("VideoDuration")
    @Expose
    private Float VideoDuration;

    /**
    * Audio duration, in seconds.
    */
    @SerializedName("AudioDuration")
    @Expose
    private Float AudioDuration;

    /**
     * Get Size of the uploaded media file (for HLS videos, the size is the total of the m3u8 and ts file sizes), unit: byte. 
     * @return Size Size of the uploaded media file (for HLS videos, the size is the total of the m3u8 and ts file sizes), unit: byte.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Size of the uploaded media file (for HLS videos, the size is the total of the m3u8 and ts file sizes), unit: byte.
     * @param Size Size of the uploaded media file (for HLS videos, the size is the total of the m3u8 and ts file sizes), unit: byte.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Container type, for example, m4a and mp4. 
     * @return Container Container type, for example, m4a and mp4.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set Container type, for example, m4a and mp4.
     * @param Container Container type, for example, m4a and mp4.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get Sum of the average video stream bitrate and average audio stream bitrate. Unit: bps. 
     * @return Bitrate Sum of the average video stream bitrate and average audio stream bitrate. Unit: bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Sum of the average video stream bitrate and average audio stream bitrate. Unit: bps.
     * @param Bitrate Sum of the average video stream bitrate and average audio stream bitrate. Unit: bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Maximum height of a video stream. Unit: px. 
     * @return Height Maximum height of a video stream. Unit: px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum height of a video stream. Unit: px.
     * @param Height Maximum height of a video stream. Unit: px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Maximum video stream width in px. 
     * @return Width Maximum video stream width in px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum video stream width in px.
     * @param Width Maximum video stream width in px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video duration, unit: seconds. 
     * @return Duration Video duration, unit: seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Video duration, unit: seconds.
     * @param Duration Video duration, unit: seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Selection angle during video shooting. Unit: degree. 
     * @return Rotate Selection angle during video shooting. Unit: degree.
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set Selection angle during video shooting. Unit: degree.
     * @param Rotate Selection angle during video shooting. Unit: degree.
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
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
     * Get Video duration, unit: seconds. 
     * @return VideoDuration Video duration, unit: seconds.
     */
    public Float getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set Video duration, unit: seconds.
     * @param VideoDuration Video duration, unit: seconds.
     */
    public void setVideoDuration(Float VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * Get Audio duration, in seconds. 
     * @return AudioDuration Audio duration, in seconds.
     */
    public Float getAudioDuration() {
        return this.AudioDuration;
    }

    /**
     * Set Audio duration, in seconds.
     * @param AudioDuration Audio duration, in seconds.
     */
    public void setAudioDuration(Float AudioDuration) {
        this.AudioDuration = AudioDuration;
    }

    public MediaMetaData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaMetaData(MediaMetaData source) {
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
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
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Rotate != null) {
            this.Rotate = new Long(source.Rotate);
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
        if (source.VideoDuration != null) {
            this.VideoDuration = new Float(source.VideoDuration);
        }
        if (source.AudioDuration != null) {
            this.AudioDuration = new Float(source.AudioDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamArrayObj(map, prefix + "VideoStreamSet.", this.VideoStreamSet);
        this.setParamArrayObj(map, prefix + "AudioStreamSet.", this.AudioStreamSet);
        this.setParamSimple(map, prefix + "VideoDuration", this.VideoDuration);
        this.setParamSimple(map, prefix + "AudioDuration", this.AudioDuration);

    }
}

