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

public class RebuildMediaRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

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
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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

    /**
     * Get  
     * @return SessionId 
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 
     * @param SessionId 
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get  
     * @return SessionContext 
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 
     * @param SessionContext 
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get  
     * @return TasksPriority 
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 
     * @param TasksPriority 
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get  
     * @return ExtInfo 
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 
     * @param ExtInfo 
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public RebuildMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaRequest(RebuildMediaRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
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
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
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
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

