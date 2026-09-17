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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("BasicInfo")
    @Expose
    private MediaBasicInfo BasicInfo;

    /**
    * 
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 
    */
    @SerializedName("TranscodeInfo")
    @Expose
    private MediaTranscodeInfo TranscodeInfo;

    /**
    * 
    */
    @SerializedName("AnimatedGraphicsInfo")
    @Expose
    private MediaAnimatedGraphicsInfo AnimatedGraphicsInfo;

    /**
    * 
    */
    @SerializedName("SampleSnapshotInfo")
    @Expose
    private MediaSampleSnapshotInfo SampleSnapshotInfo;

    /**
    * 
    */
    @SerializedName("ImageSpriteInfo")
    @Expose
    private MediaImageSpriteInfo ImageSpriteInfo;

    /**
    * 
    */
    @SerializedName("SnapshotByTimeOffsetInfo")
    @Expose
    private MediaSnapshotByTimeOffsetInfo SnapshotByTimeOffsetInfo;

    /**
    * 
    */
    @SerializedName("KeyFrameDescInfo")
    @Expose
    private MediaKeyFrameDescInfo KeyFrameDescInfo;

    /**
    * 
    */
    @SerializedName("AdaptiveDynamicStreamingInfo")
    @Expose
    private MediaAdaptiveDynamicStreamingInfo AdaptiveDynamicStreamingInfo;

    /**
    * 
    */
    @SerializedName("MiniProgramReviewInfo")
    @Expose
    private MediaMiniProgramReviewInfo MiniProgramReviewInfo;

    /**
    * 
    */
    @SerializedName("SubtitleInfo")
    @Expose
    private MediaSubtitleInfo SubtitleInfo;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("ReviewInfo")
    @Expose
    private FileReviewInfo ReviewInfo;

    /**
    * 
    */
    @SerializedName("MPSAiMediaInfo")
    @Expose
    private MPSAiMediaInfo MPSAiMediaInfo;

    /**
    * 
    */
    @SerializedName("ImageUnderstandingInfo")
    @Expose
    private ImageUnderstandingInfo ImageUnderstandingInfo;

    /**
    * 
    */
    @SerializedName("KnowledgeBasesInfo")
    @Expose
    private KnowledgeBasesInfo KnowledgeBasesInfo;

    /**
    * 
    */
    @SerializedName("FaceRecognitionInfo")
    @Expose
    private FaceRecognitionInfo FaceRecognitionInfo;

    /**
     * Get  
     * @return BasicInfo 
     */
    public MediaBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 
     * @param BasicInfo 
     */
    public void setBasicInfo(MediaBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get  
     * @return MetaData 
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 
     * @param MetaData 
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get  
     * @return TranscodeInfo 
     */
    public MediaTranscodeInfo getTranscodeInfo() {
        return this.TranscodeInfo;
    }

    /**
     * Set 
     * @param TranscodeInfo 
     */
    public void setTranscodeInfo(MediaTranscodeInfo TranscodeInfo) {
        this.TranscodeInfo = TranscodeInfo;
    }

    /**
     * Get  
     * @return AnimatedGraphicsInfo 
     */
    public MediaAnimatedGraphicsInfo getAnimatedGraphicsInfo() {
        return this.AnimatedGraphicsInfo;
    }

    /**
     * Set 
     * @param AnimatedGraphicsInfo 
     */
    public void setAnimatedGraphicsInfo(MediaAnimatedGraphicsInfo AnimatedGraphicsInfo) {
        this.AnimatedGraphicsInfo = AnimatedGraphicsInfo;
    }

    /**
     * Get  
     * @return SampleSnapshotInfo 
     */
    public MediaSampleSnapshotInfo getSampleSnapshotInfo() {
        return this.SampleSnapshotInfo;
    }

    /**
     * Set 
     * @param SampleSnapshotInfo 
     */
    public void setSampleSnapshotInfo(MediaSampleSnapshotInfo SampleSnapshotInfo) {
        this.SampleSnapshotInfo = SampleSnapshotInfo;
    }

    /**
     * Get  
     * @return ImageSpriteInfo 
     */
    public MediaImageSpriteInfo getImageSpriteInfo() {
        return this.ImageSpriteInfo;
    }

    /**
     * Set 
     * @param ImageSpriteInfo 
     */
    public void setImageSpriteInfo(MediaImageSpriteInfo ImageSpriteInfo) {
        this.ImageSpriteInfo = ImageSpriteInfo;
    }

    /**
     * Get  
     * @return SnapshotByTimeOffsetInfo 
     */
    public MediaSnapshotByTimeOffsetInfo getSnapshotByTimeOffsetInfo() {
        return this.SnapshotByTimeOffsetInfo;
    }

    /**
     * Set 
     * @param SnapshotByTimeOffsetInfo 
     */
    public void setSnapshotByTimeOffsetInfo(MediaSnapshotByTimeOffsetInfo SnapshotByTimeOffsetInfo) {
        this.SnapshotByTimeOffsetInfo = SnapshotByTimeOffsetInfo;
    }

    /**
     * Get  
     * @return KeyFrameDescInfo 
     */
    public MediaKeyFrameDescInfo getKeyFrameDescInfo() {
        return this.KeyFrameDescInfo;
    }

    /**
     * Set 
     * @param KeyFrameDescInfo 
     */
    public void setKeyFrameDescInfo(MediaKeyFrameDescInfo KeyFrameDescInfo) {
        this.KeyFrameDescInfo = KeyFrameDescInfo;
    }

    /**
     * Get  
     * @return AdaptiveDynamicStreamingInfo 
     */
    public MediaAdaptiveDynamicStreamingInfo getAdaptiveDynamicStreamingInfo() {
        return this.AdaptiveDynamicStreamingInfo;
    }

    /**
     * Set 
     * @param AdaptiveDynamicStreamingInfo 
     */
    public void setAdaptiveDynamicStreamingInfo(MediaAdaptiveDynamicStreamingInfo AdaptiveDynamicStreamingInfo) {
        this.AdaptiveDynamicStreamingInfo = AdaptiveDynamicStreamingInfo;
    }

    /**
     * Get  
     * @return MiniProgramReviewInfo 
     */
    public MediaMiniProgramReviewInfo getMiniProgramReviewInfo() {
        return this.MiniProgramReviewInfo;
    }

    /**
     * Set 
     * @param MiniProgramReviewInfo 
     */
    public void setMiniProgramReviewInfo(MediaMiniProgramReviewInfo MiniProgramReviewInfo) {
        this.MiniProgramReviewInfo = MiniProgramReviewInfo;
    }

    /**
     * Get  
     * @return SubtitleInfo 
     */
    public MediaSubtitleInfo getSubtitleInfo() {
        return this.SubtitleInfo;
    }

    /**
     * Set 
     * @param SubtitleInfo 
     */
    public void setSubtitleInfo(MediaSubtitleInfo SubtitleInfo) {
        this.SubtitleInfo = SubtitleInfo;
    }

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return ReviewInfo 
     */
    public FileReviewInfo getReviewInfo() {
        return this.ReviewInfo;
    }

    /**
     * Set 
     * @param ReviewInfo 
     */
    public void setReviewInfo(FileReviewInfo ReviewInfo) {
        this.ReviewInfo = ReviewInfo;
    }

    /**
     * Get  
     * @return MPSAiMediaInfo 
     */
    public MPSAiMediaInfo getMPSAiMediaInfo() {
        return this.MPSAiMediaInfo;
    }

    /**
     * Set 
     * @param MPSAiMediaInfo 
     */
    public void setMPSAiMediaInfo(MPSAiMediaInfo MPSAiMediaInfo) {
        this.MPSAiMediaInfo = MPSAiMediaInfo;
    }

    /**
     * Get  
     * @return ImageUnderstandingInfo 
     */
    public ImageUnderstandingInfo getImageUnderstandingInfo() {
        return this.ImageUnderstandingInfo;
    }

    /**
     * Set 
     * @param ImageUnderstandingInfo 
     */
    public void setImageUnderstandingInfo(ImageUnderstandingInfo ImageUnderstandingInfo) {
        this.ImageUnderstandingInfo = ImageUnderstandingInfo;
    }

    /**
     * Get  
     * @return KnowledgeBasesInfo 
     */
    public KnowledgeBasesInfo getKnowledgeBasesInfo() {
        return this.KnowledgeBasesInfo;
    }

    /**
     * Set 
     * @param KnowledgeBasesInfo 
     */
    public void setKnowledgeBasesInfo(KnowledgeBasesInfo KnowledgeBasesInfo) {
        this.KnowledgeBasesInfo = KnowledgeBasesInfo;
    }

    /**
     * Get  
     * @return FaceRecognitionInfo 
     */
    public FaceRecognitionInfo getFaceRecognitionInfo() {
        return this.FaceRecognitionInfo;
    }

    /**
     * Set 
     * @param FaceRecognitionInfo 
     */
    public void setFaceRecognitionInfo(FaceRecognitionInfo FaceRecognitionInfo) {
        this.FaceRecognitionInfo = FaceRecognitionInfo;
    }

    public MediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInfo(MediaInfo source) {
        if (source.BasicInfo != null) {
            this.BasicInfo = new MediaBasicInfo(source.BasicInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.TranscodeInfo != null) {
            this.TranscodeInfo = new MediaTranscodeInfo(source.TranscodeInfo);
        }
        if (source.AnimatedGraphicsInfo != null) {
            this.AnimatedGraphicsInfo = new MediaAnimatedGraphicsInfo(source.AnimatedGraphicsInfo);
        }
        if (source.SampleSnapshotInfo != null) {
            this.SampleSnapshotInfo = new MediaSampleSnapshotInfo(source.SampleSnapshotInfo);
        }
        if (source.ImageSpriteInfo != null) {
            this.ImageSpriteInfo = new MediaImageSpriteInfo(source.ImageSpriteInfo);
        }
        if (source.SnapshotByTimeOffsetInfo != null) {
            this.SnapshotByTimeOffsetInfo = new MediaSnapshotByTimeOffsetInfo(source.SnapshotByTimeOffsetInfo);
        }
        if (source.KeyFrameDescInfo != null) {
            this.KeyFrameDescInfo = new MediaKeyFrameDescInfo(source.KeyFrameDescInfo);
        }
        if (source.AdaptiveDynamicStreamingInfo != null) {
            this.AdaptiveDynamicStreamingInfo = new MediaAdaptiveDynamicStreamingInfo(source.AdaptiveDynamicStreamingInfo);
        }
        if (source.MiniProgramReviewInfo != null) {
            this.MiniProgramReviewInfo = new MediaMiniProgramReviewInfo(source.MiniProgramReviewInfo);
        }
        if (source.SubtitleInfo != null) {
            this.SubtitleInfo = new MediaSubtitleInfo(source.SubtitleInfo);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ReviewInfo != null) {
            this.ReviewInfo = new FileReviewInfo(source.ReviewInfo);
        }
        if (source.MPSAiMediaInfo != null) {
            this.MPSAiMediaInfo = new MPSAiMediaInfo(source.MPSAiMediaInfo);
        }
        if (source.ImageUnderstandingInfo != null) {
            this.ImageUnderstandingInfo = new ImageUnderstandingInfo(source.ImageUnderstandingInfo);
        }
        if (source.KnowledgeBasesInfo != null) {
            this.KnowledgeBasesInfo = new KnowledgeBasesInfo(source.KnowledgeBasesInfo);
        }
        if (source.FaceRecognitionInfo != null) {
            this.FaceRecognitionInfo = new FaceRecognitionInfo(source.FaceRecognitionInfo);
        }
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
        this.setParamObj(map, prefix + "ReviewInfo.", this.ReviewInfo);
        this.setParamObj(map, prefix + "MPSAiMediaInfo.", this.MPSAiMediaInfo);
        this.setParamObj(map, prefix + "ImageUnderstandingInfo.", this.ImageUnderstandingInfo);
        this.setParamObj(map, prefix + "KnowledgeBasesInfo.", this.KnowledgeBasesInfo);
        this.setParamObj(map, prefix + "FaceRecognitionInfo.", this.FaceRecognitionInfo);

    }
}

