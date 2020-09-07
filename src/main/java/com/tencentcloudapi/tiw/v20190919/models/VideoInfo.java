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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoInfo extends AbstractModel{

    /**
    * Video playback start time, in milliseconds
    */
    @SerializedName("VideoPlayTime")
    @Expose
    private Long VideoPlayTime;

    /**
    * Video size, in bytes
    */
    @SerializedName("VideoSize")
    @Expose
    private Long VideoSize;

    /**
    * Video format
    */
    @SerializedName("VideoFormat")
    @Expose
    private String VideoFormat;

    /**
    * Video playback duration, in milliseconds
    */
    @SerializedName("VideoDuration")
    @Expose
    private Long VideoDuration;

    /**
    * Video file URL
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * Video file ID
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
    * Video stream type - 0: camera video - 1: screen-sharing video - 2: whiteboard video - 3: mixed stream video - 4: audio-only (mp3)
    */
    @SerializedName("VideoType")
    @Expose
    private Long VideoType;

    /**
    * ID of the user to which the camera video or screen-sharing video belongs (whiteboard video: null, mixed stream video: tic_mixstream_<Room ID>_<Mixed stream layout type>, auxiliary video: tic_substream_user ID)
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Width of the video resolution.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Height of the video resolution.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get Video playback start time, in milliseconds 
     * @return VideoPlayTime Video playback start time, in milliseconds
     */
    public Long getVideoPlayTime() {
        return this.VideoPlayTime;
    }

    /**
     * Set Video playback start time, in milliseconds
     * @param VideoPlayTime Video playback start time, in milliseconds
     */
    public void setVideoPlayTime(Long VideoPlayTime) {
        this.VideoPlayTime = VideoPlayTime;
    }

    /**
     * Get Video size, in bytes 
     * @return VideoSize Video size, in bytes
     */
    public Long getVideoSize() {
        return this.VideoSize;
    }

    /**
     * Set Video size, in bytes
     * @param VideoSize Video size, in bytes
     */
    public void setVideoSize(Long VideoSize) {
        this.VideoSize = VideoSize;
    }

    /**
     * Get Video format 
     * @return VideoFormat Video format
     */
    public String getVideoFormat() {
        return this.VideoFormat;
    }

    /**
     * Set Video format
     * @param VideoFormat Video format
     */
    public void setVideoFormat(String VideoFormat) {
        this.VideoFormat = VideoFormat;
    }

    /**
     * Get Video playback duration, in milliseconds 
     * @return VideoDuration Video playback duration, in milliseconds
     */
    public Long getVideoDuration() {
        return this.VideoDuration;
    }

    /**
     * Set Video playback duration, in milliseconds
     * @param VideoDuration Video playback duration, in milliseconds
     */
    public void setVideoDuration(Long VideoDuration) {
        this.VideoDuration = VideoDuration;
    }

    /**
     * Get Video file URL 
     * @return VideoUrl Video file URL
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set Video file URL
     * @param VideoUrl Video file URL
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get Video file ID 
     * @return VideoId Video file ID
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * Set Video file ID
     * @param VideoId Video file ID
     */
    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    /**
     * Get Video stream type - 0: camera video - 1: screen-sharing video - 2: whiteboard video - 3: mixed stream video - 4: audio-only (mp3) 
     * @return VideoType Video stream type - 0: camera video - 1: screen-sharing video - 2: whiteboard video - 3: mixed stream video - 4: audio-only (mp3)
     */
    public Long getVideoType() {
        return this.VideoType;
    }

    /**
     * Set Video stream type - 0: camera video - 1: screen-sharing video - 2: whiteboard video - 3: mixed stream video - 4: audio-only (mp3)
     * @param VideoType Video stream type - 0: camera video - 1: screen-sharing video - 2: whiteboard video - 3: mixed stream video - 4: audio-only (mp3)
     */
    public void setVideoType(Long VideoType) {
        this.VideoType = VideoType;
    }

    /**
     * Get ID of the user to which the camera video or screen-sharing video belongs (whiteboard video: null, mixed stream video: tic_mixstream_<Room ID>_<Mixed stream layout type>, auxiliary video: tic_substream_user ID) 
     * @return UserId ID of the user to which the camera video or screen-sharing video belongs (whiteboard video: null, mixed stream video: tic_mixstream_<Room ID>_<Mixed stream layout type>, auxiliary video: tic_substream_user ID)
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set ID of the user to which the camera video or screen-sharing video belongs (whiteboard video: null, mixed stream video: tic_mixstream_<Room ID>_<Mixed stream layout type>, auxiliary video: tic_substream_user ID)
     * @param UserId ID of the user to which the camera video or screen-sharing video belongs (whiteboard video: null, mixed stream video: tic_mixstream_<Room ID>_<Mixed stream layout type>, auxiliary video: tic_substream_user ID)
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Width of the video resolution. 
     * @return Width Width of the video resolution.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Width of the video resolution.
     * @param Width Width of the video resolution.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Height of the video resolution. 
     * @return Height Height of the video resolution.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Height of the video resolution.
     * @param Height Height of the video resolution.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoPlayTime", this.VideoPlayTime);
        this.setParamSimple(map, prefix + "VideoSize", this.VideoSize);
        this.setParamSimple(map, prefix + "VideoFormat", this.VideoFormat);
        this.setParamSimple(map, prefix + "VideoDuration", this.VideoDuration);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "VideoId", this.VideoId);
        this.setParamSimple(map, prefix + "VideoType", this.VideoType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

