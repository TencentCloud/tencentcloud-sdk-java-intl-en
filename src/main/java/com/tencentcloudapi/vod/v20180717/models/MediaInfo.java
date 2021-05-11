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

public class MediaInfo extends AbstractModel{

    /**
    * Basic information, such as video name, category, playback address, and cover image.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BasicInfo")
    @Expose
    private MediaBasicInfo BasicInfo;

    /**
    * Metadata, such as size, duration, video stream information, and audio stream information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * Result information of transcoding, such as address, specification, bitrate, and resolution of the videos in various bitrates generated by transcoding a video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranscodeInfo")
    @Expose
    private MediaTranscodeInfo TranscodeInfo;

    /**
    * Result information of animated image generating, i.e., relevant information of an animated image (such as .gif) generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnimatedGraphicsInfo")
    @Expose
    private MediaAnimatedGraphicsInfo AnimatedGraphicsInfo;

    /**
    * Sampled screenshot information, i.e., relevant information of a sampled screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SampleSnapshotInfo")
    @Expose
    private MediaSampleSnapshotInfo SampleSnapshotInfo;

    /**
    * Image sprite information, i.e., relevant information of image sprite generated from video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageSpriteInfo")
    @Expose
    private MediaImageSpriteInfo ImageSpriteInfo;

    /**
    * Time point screenshot information, i.e., information of each time point screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetInfo")
    @Expose
    private MediaSnapshotByTimeOffsetInfo SnapshotByTimeOffsetInfo;

    /**
    * Timestamp information, i.e., information of each timestamp set for a video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeyFrameDescInfo")
    @Expose
    private MediaKeyFrameDescInfo KeyFrameDescInfo;

    /**
    * Adaptive bitrate streaming information, such as specification, encryption type, and container format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AdaptiveDynamicStreamingInfo")
    @Expose
    private MediaAdaptiveDynamicStreamingInfo AdaptiveDynamicStreamingInfo;

    /**
    * WeChat Mini Program audit information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiniProgramReviewInfo")
    @Expose
    private MediaMiniProgramReviewInfo MiniProgramReviewInfo;

    /**
    * Subtitle information
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("SubtitleInfo")
    @Expose
    private MediaSubtitleInfo SubtitleInfo;

    /**
    * Unique ID of media file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get Basic information, such as video name, category, playback address, and cover image.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BasicInfo Basic information, such as video name, category, playback address, and cover image.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set Basic information, such as video name, category, playback address, and cover image.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BasicInfo Basic information, such as video name, category, playback address, and cover image.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBasicInfo(MediaBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get Metadata, such as size, duration, video stream information, and audio stream information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MetaData Metadata, such as size, duration, video stream information, and audio stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Metadata, such as size, duration, video stream information, and audio stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MetaData Metadata, such as size, duration, video stream information, and audio stream information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get Result information of transcoding, such as address, specification, bitrate, and resolution of the videos in various bitrates generated by transcoding a video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TranscodeInfo Result information of transcoding, such as address, specification, bitrate, and resolution of the videos in various bitrates generated by transcoding a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaTranscodeInfo getTranscodeInfo() {
        return this.TranscodeInfo;
    }

    /**
     * Set Result information of transcoding, such as address, specification, bitrate, and resolution of the videos in various bitrates generated by transcoding a video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TranscodeInfo Result information of transcoding, such as address, specification, bitrate, and resolution of the videos in various bitrates generated by transcoding a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTranscodeInfo(MediaTranscodeInfo TranscodeInfo) {
        this.TranscodeInfo = TranscodeInfo;
    }

    /**
     * Get Result information of animated image generating, i.e., relevant information of an animated image (such as .gif) generated from a video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AnimatedGraphicsInfo Result information of animated image generating, i.e., relevant information of an animated image (such as .gif) generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaAnimatedGraphicsInfo getAnimatedGraphicsInfo() {
        return this.AnimatedGraphicsInfo;
    }

    /**
     * Set Result information of animated image generating, i.e., relevant information of an animated image (such as .gif) generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AnimatedGraphicsInfo Result information of animated image generating, i.e., relevant information of an animated image (such as .gif) generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAnimatedGraphicsInfo(MediaAnimatedGraphicsInfo AnimatedGraphicsInfo) {
        this.AnimatedGraphicsInfo = AnimatedGraphicsInfo;
    }

    /**
     * Get Sampled screenshot information, i.e., relevant information of a sampled screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SampleSnapshotInfo Sampled screenshot information, i.e., relevant information of a sampled screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaSampleSnapshotInfo getSampleSnapshotInfo() {
        return this.SampleSnapshotInfo;
    }

    /**
     * Set Sampled screenshot information, i.e., relevant information of a sampled screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SampleSnapshotInfo Sampled screenshot information, i.e., relevant information of a sampled screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSampleSnapshotInfo(MediaSampleSnapshotInfo SampleSnapshotInfo) {
        this.SampleSnapshotInfo = SampleSnapshotInfo;
    }

    /**
     * Get Image sprite information, i.e., relevant information of image sprite generated from video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImageSpriteInfo Image sprite information, i.e., relevant information of image sprite generated from video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaImageSpriteInfo getImageSpriteInfo() {
        return this.ImageSpriteInfo;
    }

    /**
     * Set Image sprite information, i.e., relevant information of image sprite generated from video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImageSpriteInfo Image sprite information, i.e., relevant information of image sprite generated from video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImageSpriteInfo(MediaImageSpriteInfo ImageSpriteInfo) {
        this.ImageSpriteInfo = ImageSpriteInfo;
    }

    /**
     * Get Time point screenshot information, i.e., information of each time point screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotByTimeOffsetInfo Time point screenshot information, i.e., information of each time point screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaSnapshotByTimeOffsetInfo getSnapshotByTimeOffsetInfo() {
        return this.SnapshotByTimeOffsetInfo;
    }

    /**
     * Set Time point screenshot information, i.e., information of each time point screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SnapshotByTimeOffsetInfo Time point screenshot information, i.e., information of each time point screenshot generated from a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotByTimeOffsetInfo(MediaSnapshotByTimeOffsetInfo SnapshotByTimeOffsetInfo) {
        this.SnapshotByTimeOffsetInfo = SnapshotByTimeOffsetInfo;
    }

    /**
     * Get Timestamp information, i.e., information of each timestamp set for a video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeyFrameDescInfo Timestamp information, i.e., information of each timestamp set for a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaKeyFrameDescInfo getKeyFrameDescInfo() {
        return this.KeyFrameDescInfo;
    }

    /**
     * Set Timestamp information, i.e., information of each timestamp set for a video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeyFrameDescInfo Timestamp information, i.e., information of each timestamp set for a video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeyFrameDescInfo(MediaKeyFrameDescInfo KeyFrameDescInfo) {
        this.KeyFrameDescInfo = KeyFrameDescInfo;
    }

    /**
     * Get Adaptive bitrate streaming information, such as specification, encryption type, and container format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AdaptiveDynamicStreamingInfo Adaptive bitrate streaming information, such as specification, encryption type, and container format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaAdaptiveDynamicStreamingInfo getAdaptiveDynamicStreamingInfo() {
        return this.AdaptiveDynamicStreamingInfo;
    }

    /**
     * Set Adaptive bitrate streaming information, such as specification, encryption type, and container format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AdaptiveDynamicStreamingInfo Adaptive bitrate streaming information, such as specification, encryption type, and container format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAdaptiveDynamicStreamingInfo(MediaAdaptiveDynamicStreamingInfo AdaptiveDynamicStreamingInfo) {
        this.AdaptiveDynamicStreamingInfo = AdaptiveDynamicStreamingInfo;
    }

    /**
     * Get WeChat Mini Program audit information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MiniProgramReviewInfo WeChat Mini Program audit information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaMiniProgramReviewInfo getMiniProgramReviewInfo() {
        return this.MiniProgramReviewInfo;
    }

    /**
     * Set WeChat Mini Program audit information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MiniProgramReviewInfo WeChat Mini Program audit information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMiniProgramReviewInfo(MediaMiniProgramReviewInfo MiniProgramReviewInfo) {
        this.MiniProgramReviewInfo = MiniProgramReviewInfo;
    }

    /**
     * Get Subtitle information
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return SubtitleInfo Subtitle information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public MediaSubtitleInfo getSubtitleInfo() {
        return this.SubtitleInfo;
    }

    /**
     * Set Subtitle information
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param SubtitleInfo Subtitle information
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setSubtitleInfo(MediaSubtitleInfo SubtitleInfo) {
        this.SubtitleInfo = SubtitleInfo;
    }

    /**
     * Get Unique ID of media file. 
     * @return FileId Unique ID of media file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique ID of media file.
     * @param FileId Unique ID of media file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BasicInfo.", this.BasicInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamObj(map, prefix + "TranscodeInfo.", this.TranscodeInfo);
        this.setParamObj(map, prefix + "AnimatedGraphicsInfo.", this.AnimatedGraphicsInfo);
        this.setParamObj(map, prefix + "SampleSnapshotInfo.", this.SampleSnapshotInfo);
        this.setParamObj(map, prefix + "ImageSpriteInfo.", this.ImageSpriteInfo);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetInfo.", this.SnapshotByTimeOffsetInfo);
        this.setParamObj(map, prefix + "KeyFrameDescInfo.", this.KeyFrameDescInfo);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingInfo.", this.AdaptiveDynamicStreamingInfo);
        this.setParamObj(map, prefix + "MiniProgramReviewInfo.", this.MiniProgramReviewInfo);
        this.setParamObj(map, prefix + "SubtitleInfo.", this.SubtitleInfo);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

