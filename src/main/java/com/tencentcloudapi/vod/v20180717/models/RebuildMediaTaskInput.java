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
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("RepairInfo")
    @Expose
    private RepairInfo RepairInfo;

    /**
    * 
    */
    @SerializedName("VideoFrameInterpolationInfo")
    @Expose
    private VideoFrameInterpolationInfo VideoFrameInterpolationInfo;

    /**
    * 
    */
    @SerializedName("SuperResolutionInfo")
    @Expose
    private SuperResolutionInfo SuperResolutionInfo;

    /**
    * 
    */
    @SerializedName("HDRInfo")
    @Expose
    private HDRInfo HDRInfo;

    /**
    * 
    */
    @SerializedName("VideoDenoiseInfo")
    @Expose
    private VideoDenoiseInfo VideoDenoiseInfo;

    /**
    * 
    */
    @SerializedName("AudioDenoiseInfo")
    @Expose
    private AudioDenoiseInfo AudioDenoiseInfo;

    /**
    * 
    */
    @SerializedName("ColorInfo")
    @Expose
    private ColorEnhanceInfo ColorInfo;

    /**
    * 
    */
    @SerializedName("SharpInfo")
    @Expose
    private SharpEnhanceInfo SharpInfo;

    /**
    * 
    */
    @SerializedName("FaceInfo")
    @Expose
    private FaceEnhanceInfo FaceInfo;

    /**
    * 
    */
    @SerializedName("LowLightInfo")
    @Expose
    private LowLightEnhanceInfo LowLightInfo;

    /**
    * 
    */
    @SerializedName("ScratchRepairInfo")
    @Expose
    private ScratchRepairInfo ScratchRepairInfo;

    /**
    * 
    */
    @SerializedName("ArtifactRepairInfo")
    @Expose
    private ArtifactRepairInfo ArtifactRepairInfo;

    /**
    * 
    */
    @SerializedName("TargetInfo")
    @Expose
    private RebuildMediaTargetInfo TargetInfo;

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
     * @return StartTimeOffset 
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 
     * @param StartTimeOffset 
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get  
     * @return EndTimeOffset 
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 
     * @param EndTimeOffset 
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return RepairInfo 
     */
    public RepairInfo getRepairInfo() {
        return this.RepairInfo;
    }

    /**
     * Set 
     * @param RepairInfo 
     */
    public void setRepairInfo(RepairInfo RepairInfo) {
        this.RepairInfo = RepairInfo;
    }

    /**
     * Get  
     * @return VideoFrameInterpolationInfo 
     */
    public VideoFrameInterpolationInfo getVideoFrameInterpolationInfo() {
        return this.VideoFrameInterpolationInfo;
    }

    /**
     * Set 
     * @param VideoFrameInterpolationInfo 
     */
    public void setVideoFrameInterpolationInfo(VideoFrameInterpolationInfo VideoFrameInterpolationInfo) {
        this.VideoFrameInterpolationInfo = VideoFrameInterpolationInfo;
    }

    /**
     * Get  
     * @return SuperResolutionInfo 
     */
    public SuperResolutionInfo getSuperResolutionInfo() {
        return this.SuperResolutionInfo;
    }

    /**
     * Set 
     * @param SuperResolutionInfo 
     */
    public void setSuperResolutionInfo(SuperResolutionInfo SuperResolutionInfo) {
        this.SuperResolutionInfo = SuperResolutionInfo;
    }

    /**
     * Get  
     * @return HDRInfo 
     */
    public HDRInfo getHDRInfo() {
        return this.HDRInfo;
    }

    /**
     * Set 
     * @param HDRInfo 
     */
    public void setHDRInfo(HDRInfo HDRInfo) {
        this.HDRInfo = HDRInfo;
    }

    /**
     * Get  
     * @return VideoDenoiseInfo 
     */
    public VideoDenoiseInfo getVideoDenoiseInfo() {
        return this.VideoDenoiseInfo;
    }

    /**
     * Set 
     * @param VideoDenoiseInfo 
     */
    public void setVideoDenoiseInfo(VideoDenoiseInfo VideoDenoiseInfo) {
        this.VideoDenoiseInfo = VideoDenoiseInfo;
    }

    /**
     * Get  
     * @return AudioDenoiseInfo 
     */
    public AudioDenoiseInfo getAudioDenoiseInfo() {
        return this.AudioDenoiseInfo;
    }

    /**
     * Set 
     * @param AudioDenoiseInfo 
     */
    public void setAudioDenoiseInfo(AudioDenoiseInfo AudioDenoiseInfo) {
        this.AudioDenoiseInfo = AudioDenoiseInfo;
    }

    /**
     * Get  
     * @return ColorInfo 
     */
    public ColorEnhanceInfo getColorInfo() {
        return this.ColorInfo;
    }

    /**
     * Set 
     * @param ColorInfo 
     */
    public void setColorInfo(ColorEnhanceInfo ColorInfo) {
        this.ColorInfo = ColorInfo;
    }

    /**
     * Get  
     * @return SharpInfo 
     */
    public SharpEnhanceInfo getSharpInfo() {
        return this.SharpInfo;
    }

    /**
     * Set 
     * @param SharpInfo 
     */
    public void setSharpInfo(SharpEnhanceInfo SharpInfo) {
        this.SharpInfo = SharpInfo;
    }

    /**
     * Get  
     * @return FaceInfo 
     */
    public FaceEnhanceInfo getFaceInfo() {
        return this.FaceInfo;
    }

    /**
     * Set 
     * @param FaceInfo 
     */
    public void setFaceInfo(FaceEnhanceInfo FaceInfo) {
        this.FaceInfo = FaceInfo;
    }

    /**
     * Get  
     * @return LowLightInfo 
     */
    public LowLightEnhanceInfo getLowLightInfo() {
        return this.LowLightInfo;
    }

    /**
     * Set 
     * @param LowLightInfo 
     */
    public void setLowLightInfo(LowLightEnhanceInfo LowLightInfo) {
        this.LowLightInfo = LowLightInfo;
    }

    /**
     * Get  
     * @return ScratchRepairInfo 
     */
    public ScratchRepairInfo getScratchRepairInfo() {
        return this.ScratchRepairInfo;
    }

    /**
     * Set 
     * @param ScratchRepairInfo 
     */
    public void setScratchRepairInfo(ScratchRepairInfo ScratchRepairInfo) {
        this.ScratchRepairInfo = ScratchRepairInfo;
    }

    /**
     * Get  
     * @return ArtifactRepairInfo 
     */
    public ArtifactRepairInfo getArtifactRepairInfo() {
        return this.ArtifactRepairInfo;
    }

    /**
     * Set 
     * @param ArtifactRepairInfo 
     */
    public void setArtifactRepairInfo(ArtifactRepairInfo ArtifactRepairInfo) {
        this.ArtifactRepairInfo = ArtifactRepairInfo;
    }

    /**
     * Get  
     * @return TargetInfo 
     */
    public RebuildMediaTargetInfo getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set 
     * @param TargetInfo 
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

