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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaMetaData extends AbstractModel {

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
    * The MD5 hash of the file.
<li><font color=red>Note</font>: To get the MD5 hash of a file, call the `DescribeFileAttributes` API. The information will be returned after the task is completed.</li>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

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
     * Get The MD5 hash of the file.
<li><font color=red>Note</font>: To get the MD5 hash of a file, call the `DescribeFileAttributes` API. The information will be returned after the task is completed.</li> 
     * @return Md5 The MD5 hash of the file.
<li><font color=red>Note</font>: To get the MD5 hash of a file, call the `DescribeFileAttributes` API. The information will be returned after the task is completed.</li>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set The MD5 hash of the file.
<li><font color=red>Note</font>: To get the MD5 hash of a file, call the `DescribeFileAttributes` API. The information will be returned after the task is completed.</li>
     * @param Md5 The MD5 hash of the file.
<li><font color=red>Note</font>: To get the MD5 hash of a file, call the `DescribeFileAttributes` API. The information will be returned after the task is completed.</li>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
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
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
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
        this.setParamSimple(map, prefix + "Md5", this.Md5);

    }
}

