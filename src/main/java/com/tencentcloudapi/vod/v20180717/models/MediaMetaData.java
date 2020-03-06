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

public class MediaMetaData extends AbstractModel{

    /**
    * Size of uploaded media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Container, such as m4a and mp4.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

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
    * Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Selected angle during video recording in degrees.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

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
    * Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoDuration")
    @Expose
    private Float VideoDuration;

    /**
    * Audio duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AudioDuration")
    @Expose
    private Float AudioDuration;

    /**
     * Get Size of uploaded media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Size Size of uploaded media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Size of uploaded media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Size Size of uploaded media file in bytes (which is the sum of size of m3u8 and ts files if the video is in HLS format).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSize(Long Size) {
        this.Size = Size;
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
     * Get Selected angle during video recording in degrees.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Rotate Selected angle during video recording in degrees.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set Selected angle during video recording in degrees.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Rotate Selected angle during video recording in degrees.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
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
     * Get Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VideoDuration Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VideoDuration Video duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoDuration(Float VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * Get Audio duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AudioDuration Audio duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getAudioDuration() {
        return this.AudioDuration;
    }

    /**
     * Set Audio duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AudioDuration Audio duration in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAudioDuration(Float AudioDuration) {
        this.AudioDuration = AudioDuration;
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

