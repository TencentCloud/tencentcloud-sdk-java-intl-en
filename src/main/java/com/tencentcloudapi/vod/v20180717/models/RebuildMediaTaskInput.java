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

public class RebuildMediaTaskInput extends AbstractModel {

    /**
    * Media file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Start offset time, in seconds. If not filled, the segment is cut from the beginning of the video.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End offset time, in seconds. Not filled indicates cutting to the end of the video.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Audio and video quality rebirth template number.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Image quality restoration control parameters.
    */
    @SerializedName("RepairInfo")
    @Expose
    private RepairInfo RepairInfo;

    /**
    * Intelligent frame interpolation control parameters.
    */
    @SerializedName("VideoFrameInterpolationInfo")
    @Expose
    private VideoFrameInterpolationInfo VideoFrameInterpolationInfo;

    /**
    * Image super-resolution control parameters.
    */
    @SerializedName("SuperResolutionInfo")
    @Expose
    private SuperResolutionInfo SuperResolutionInfo;

    /**
    * High dynamic range type control parameter.
    */
    @SerializedName("HDRInfo")
    @Expose
    private HDRInfo HDRInfo;

    /**
    * Video noise reduction control parameters.
    */
    @SerializedName("VideoDenoiseInfo")
    @Expose
    private VideoDenoiseInfo VideoDenoiseInfo;

    /**
    * Audio noise reduction control parameters.
    */
    @SerializedName("AudioDenoiseInfo")
    @Expose
    private AudioDenoiseInfo AudioDenoiseInfo;

    /**
    * Color enhancement control parameters.
    */
    @SerializedName("ColorInfo")
    @Expose
    private ColorEnhanceInfo ColorInfo;

    /**
    * Detail enhancement control parameters.
    */
    @SerializedName("SharpInfo")
    @Expose
    private SharpEnhanceInfo SharpInfo;

    /**
    * Face enhancement control parameters.
    */
    @SerializedName("FaceInfo")
    @Expose
    private FaceEnhanceInfo FaceInfo;

    /**
    * Low-light control parameters.
    */
    @SerializedName("LowLightInfo")
    @Expose
    private LowLightEnhanceInfo LowLightInfo;

    /**
    * Scratch removal control parameter.
    */
    @SerializedName("ScratchRepairInfo")
    @Expose
    private ScratchRepairInfo ScratchRepairInfo;

    /**
    * Artifact (burr) removal control parameter.
    */
    @SerializedName("ArtifactRepairInfo")
    @Expose
    private ArtifactRepairInfo ArtifactRepairInfo;

    /**
    * Output target parameters for audio-visual quality rebirth.
    */
    @SerializedName("TargetInfo")
    @Expose
    private RebuildMediaTargetInfo TargetInfo;

    /**
     * Get Media file ID. 
     * @return FileId Media file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID.
     * @param FileId Media file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Start offset time, in seconds. If not filled, the segment is cut from the beginning of the video. 
     * @return StartTimeOffset Start offset time, in seconds. If not filled, the segment is cut from the beginning of the video.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start offset time, in seconds. If not filled, the segment is cut from the beginning of the video.
     * @param StartTimeOffset Start offset time, in seconds. If not filled, the segment is cut from the beginning of the video.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End offset time, in seconds. Not filled indicates cutting to the end of the video. 
     * @return EndTimeOffset End offset time, in seconds. Not filled indicates cutting to the end of the video.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End offset time, in seconds. Not filled indicates cutting to the end of the video.
     * @param EndTimeOffset End offset time, in seconds. Not filled indicates cutting to the end of the video.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Audio and video quality rebirth template number. 
     * @return Definition Audio and video quality rebirth template number.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Audio and video quality rebirth template number.
     * @param Definition Audio and video quality rebirth template number.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Image quality restoration control parameters. 
     * @return RepairInfo Image quality restoration control parameters.
     */
    public RepairInfo getRepairInfo() {
        return this.RepairInfo;
    }

    /**
     * Set Image quality restoration control parameters.
     * @param RepairInfo Image quality restoration control parameters.
     */
    public void setRepairInfo(RepairInfo RepairInfo) {
        this.RepairInfo = RepairInfo;
    }

    /**
     * Get Intelligent frame interpolation control parameters. 
     * @return VideoFrameInterpolationInfo Intelligent frame interpolation control parameters.
     */
    public VideoFrameInterpolationInfo getVideoFrameInterpolationInfo() {
        return this.VideoFrameInterpolationInfo;
    }

    /**
     * Set Intelligent frame interpolation control parameters.
     * @param VideoFrameInterpolationInfo Intelligent frame interpolation control parameters.
     */
    public void setVideoFrameInterpolationInfo(VideoFrameInterpolationInfo VideoFrameInterpolationInfo) {
        this.VideoFrameInterpolationInfo = VideoFrameInterpolationInfo;
    }

    /**
     * Get Image super-resolution control parameters. 
     * @return SuperResolutionInfo Image super-resolution control parameters.
     */
    public SuperResolutionInfo getSuperResolutionInfo() {
        return this.SuperResolutionInfo;
    }

    /**
     * Set Image super-resolution control parameters.
     * @param SuperResolutionInfo Image super-resolution control parameters.
     */
    public void setSuperResolutionInfo(SuperResolutionInfo SuperResolutionInfo) {
        this.SuperResolutionInfo = SuperResolutionInfo;
    }

    /**
     * Get High dynamic range type control parameter. 
     * @return HDRInfo High dynamic range type control parameter.
     */
    public HDRInfo getHDRInfo() {
        return this.HDRInfo;
    }

    /**
     * Set High dynamic range type control parameter.
     * @param HDRInfo High dynamic range type control parameter.
     */
    public void setHDRInfo(HDRInfo HDRInfo) {
        this.HDRInfo = HDRInfo;
    }

    /**
     * Get Video noise reduction control parameters. 
     * @return VideoDenoiseInfo Video noise reduction control parameters.
     */
    public VideoDenoiseInfo getVideoDenoiseInfo() {
        return this.VideoDenoiseInfo;
    }

    /**
     * Set Video noise reduction control parameters.
     * @param VideoDenoiseInfo Video noise reduction control parameters.
     */
    public void setVideoDenoiseInfo(VideoDenoiseInfo VideoDenoiseInfo) {
        this.VideoDenoiseInfo = VideoDenoiseInfo;
    }

    /**
     * Get Audio noise reduction control parameters. 
     * @return AudioDenoiseInfo Audio noise reduction control parameters.
     */
    public AudioDenoiseInfo getAudioDenoiseInfo() {
        return this.AudioDenoiseInfo;
    }

    /**
     * Set Audio noise reduction control parameters.
     * @param AudioDenoiseInfo Audio noise reduction control parameters.
     */
    public void setAudioDenoiseInfo(AudioDenoiseInfo AudioDenoiseInfo) {
        this.AudioDenoiseInfo = AudioDenoiseInfo;
    }

    /**
     * Get Color enhancement control parameters. 
     * @return ColorInfo Color enhancement control parameters.
     */
    public ColorEnhanceInfo getColorInfo() {
        return this.ColorInfo;
    }

    /**
     * Set Color enhancement control parameters.
     * @param ColorInfo Color enhancement control parameters.
     */
    public void setColorInfo(ColorEnhanceInfo ColorInfo) {
        this.ColorInfo = ColorInfo;
    }

    /**
     * Get Detail enhancement control parameters. 
     * @return SharpInfo Detail enhancement control parameters.
     */
    public SharpEnhanceInfo getSharpInfo() {
        return this.SharpInfo;
    }

    /**
     * Set Detail enhancement control parameters.
     * @param SharpInfo Detail enhancement control parameters.
     */
    public void setSharpInfo(SharpEnhanceInfo SharpInfo) {
        this.SharpInfo = SharpInfo;
    }

    /**
     * Get Face enhancement control parameters. 
     * @return FaceInfo Face enhancement control parameters.
     */
    public FaceEnhanceInfo getFaceInfo() {
        return this.FaceInfo;
    }

    /**
     * Set Face enhancement control parameters.
     * @param FaceInfo Face enhancement control parameters.
     */
    public void setFaceInfo(FaceEnhanceInfo FaceInfo) {
        this.FaceInfo = FaceInfo;
    }

    /**
     * Get Low-light control parameters. 
     * @return LowLightInfo Low-light control parameters.
     */
    public LowLightEnhanceInfo getLowLightInfo() {
        return this.LowLightInfo;
    }

    /**
     * Set Low-light control parameters.
     * @param LowLightInfo Low-light control parameters.
     */
    public void setLowLightInfo(LowLightEnhanceInfo LowLightInfo) {
        this.LowLightInfo = LowLightInfo;
    }

    /**
     * Get Scratch removal control parameter. 
     * @return ScratchRepairInfo Scratch removal control parameter.
     */
    public ScratchRepairInfo getScratchRepairInfo() {
        return this.ScratchRepairInfo;
    }

    /**
     * Set Scratch removal control parameter.
     * @param ScratchRepairInfo Scratch removal control parameter.
     */
    public void setScratchRepairInfo(ScratchRepairInfo ScratchRepairInfo) {
        this.ScratchRepairInfo = ScratchRepairInfo;
    }

    /**
     * Get Artifact (burr) removal control parameter. 
     * @return ArtifactRepairInfo Artifact (burr) removal control parameter.
     */
    public ArtifactRepairInfo getArtifactRepairInfo() {
        return this.ArtifactRepairInfo;
    }

    /**
     * Set Artifact (burr) removal control parameter.
     * @param ArtifactRepairInfo Artifact (burr) removal control parameter.
     */
    public void setArtifactRepairInfo(ArtifactRepairInfo ArtifactRepairInfo) {
        this.ArtifactRepairInfo = ArtifactRepairInfo;
    }

    /**
     * Get Output target parameters for audio-visual quality rebirth. 
     * @return TargetInfo Output target parameters for audio-visual quality rebirth.
     */
    public RebuildMediaTargetInfo getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set Output target parameters for audio-visual quality rebirth.
     * @param TargetInfo Output target parameters for audio-visual quality rebirth.
     */
    public void setTargetInfo(RebuildMediaTargetInfo TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    public RebuildMediaTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTaskInput(RebuildMediaTaskInput source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RepairInfo != null) {
            this.RepairInfo = new RepairInfo(source.RepairInfo);
        }
        if (source.VideoFrameInterpolationInfo != null) {
            this.VideoFrameInterpolationInfo = new VideoFrameInterpolationInfo(source.VideoFrameInterpolationInfo);
        }
        if (source.SuperResolutionInfo != null) {
            this.SuperResolutionInfo = new SuperResolutionInfo(source.SuperResolutionInfo);
        }
        if (source.HDRInfo != null) {
            this.HDRInfo = new HDRInfo(source.HDRInfo);
        }
        if (source.VideoDenoiseInfo != null) {
            this.VideoDenoiseInfo = new VideoDenoiseInfo(source.VideoDenoiseInfo);
        }
        if (source.AudioDenoiseInfo != null) {
            this.AudioDenoiseInfo = new AudioDenoiseInfo(source.AudioDenoiseInfo);
        }
        if (source.ColorInfo != null) {
            this.ColorInfo = new ColorEnhanceInfo(source.ColorInfo);
        }
        if (source.SharpInfo != null) {
            this.SharpInfo = new SharpEnhanceInfo(source.SharpInfo);
        }
        if (source.FaceInfo != null) {
            this.FaceInfo = new FaceEnhanceInfo(source.FaceInfo);
        }
        if (source.LowLightInfo != null) {
            this.LowLightInfo = new LowLightEnhanceInfo(source.LowLightInfo);
        }
        if (source.ScratchRepairInfo != null) {
            this.ScratchRepairInfo = new ScratchRepairInfo(source.ScratchRepairInfo);
        }
        if (source.ArtifactRepairInfo != null) {
            this.ArtifactRepairInfo = new ArtifactRepairInfo(source.ArtifactRepairInfo);
        }
        if (source.TargetInfo != null) {
            this.TargetInfo = new RebuildMediaTargetInfo(source.TargetInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RepairInfo.", this.RepairInfo);
        this.setParamObj(map, prefix + "VideoFrameInterpolationInfo.", this.VideoFrameInterpolationInfo);
        this.setParamObj(map, prefix + "SuperResolutionInfo.", this.SuperResolutionInfo);
        this.setParamObj(map, prefix + "HDRInfo.", this.HDRInfo);
        this.setParamObj(map, prefix + "VideoDenoiseInfo.", this.VideoDenoiseInfo);
        this.setParamObj(map, prefix + "AudioDenoiseInfo.", this.AudioDenoiseInfo);
        this.setParamObj(map, prefix + "ColorInfo.", this.ColorInfo);
        this.setParamObj(map, prefix + "SharpInfo.", this.SharpInfo);
        this.setParamObj(map, prefix + "FaceInfo.", this.FaceInfo);
        this.setParamObj(map, prefix + "LowLightInfo.", this.LowLightInfo);
        this.setParamObj(map, prefix + "ScratchRepairInfo.", this.ScratchRepairInfo);
        this.setParamObj(map, prefix + "ArtifactRepairInfo.", this.ArtifactRepairInfo);
        this.setParamObj(map, prefix + "TargetInfo.", this.TargetInfo);

    }
}

