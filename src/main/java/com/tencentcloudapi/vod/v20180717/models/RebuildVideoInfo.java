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

public class RebuildVideoInfo extends AbstractModel {

    /**
    * The image restoration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RepairInfo")
    @Expose
    private RepairInfo RepairInfo;

    /**
    * The smart frame interpolation parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoFrameInterpolationInfo")
    @Expose
    private VideoFrameInterpolationInfo VideoFrameInterpolationInfo;

    /**
    * The super resolution parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuperResolutionInfo")
    @Expose
    private SuperResolutionInfo SuperResolutionInfo;

    /**
    * The high dynamic range (HDR) configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HDRInfo")
    @Expose
    private HDRInfo HDRInfo;

    /**
    * The image noise removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VideoDenoiseInfo")
    @Expose
    private VideoDenoiseInfo VideoDenoiseInfo;

    /**
    * The color enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColorInfo")
    @Expose
    private ColorEnhanceInfo ColorInfo;

    /**
    * The detail enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SharpInfo")
    @Expose
    private SharpEnhanceInfo SharpInfo;

    /**
    * The face enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceInfo")
    @Expose
    private FaceEnhanceInfo FaceInfo;

    /**
    * The low-light enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LowLightInfo")
    @Expose
    private LowLightEnhanceInfo LowLightInfo;

    /**
    * The banding removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScratchRepairInfo")
    @Expose
    private ScratchRepairInfo ScratchRepairInfo;

    /**
    * The artifact removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ArtifactRepairInfo")
    @Expose
    private ArtifactRepairInfo ArtifactRepairInfo;

    /**
     * Get The image restoration parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RepairInfo The image restoration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RepairInfo getRepairInfo() {
        return this.RepairInfo;
    }

    /**
     * Set The image restoration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RepairInfo The image restoration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRepairInfo(RepairInfo RepairInfo) {
        this.RepairInfo = RepairInfo;
    }

    /**
     * Get The smart frame interpolation parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoFrameInterpolationInfo The smart frame interpolation parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VideoFrameInterpolationInfo getVideoFrameInterpolationInfo() {
        return this.VideoFrameInterpolationInfo;
    }

    /**
     * Set The smart frame interpolation parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoFrameInterpolationInfo The smart frame interpolation parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoFrameInterpolationInfo(VideoFrameInterpolationInfo VideoFrameInterpolationInfo) {
        this.VideoFrameInterpolationInfo = VideoFrameInterpolationInfo;
    }

    /**
     * Get The super resolution parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuperResolutionInfo The super resolution parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SuperResolutionInfo getSuperResolutionInfo() {
        return this.SuperResolutionInfo;
    }

    /**
     * Set The super resolution parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuperResolutionInfo The super resolution parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuperResolutionInfo(SuperResolutionInfo SuperResolutionInfo) {
        this.SuperResolutionInfo = SuperResolutionInfo;
    }

    /**
     * Get The high dynamic range (HDR) configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HDRInfo The high dynamic range (HDR) configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public HDRInfo getHDRInfo() {
        return this.HDRInfo;
    }

    /**
     * Set The high dynamic range (HDR) configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HDRInfo The high dynamic range (HDR) configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHDRInfo(HDRInfo HDRInfo) {
        this.HDRInfo = HDRInfo;
    }

    /**
     * Get The image noise removal parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VideoDenoiseInfo The image noise removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VideoDenoiseInfo getVideoDenoiseInfo() {
        return this.VideoDenoiseInfo;
    }

    /**
     * Set The image noise removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VideoDenoiseInfo The image noise removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVideoDenoiseInfo(VideoDenoiseInfo VideoDenoiseInfo) {
        this.VideoDenoiseInfo = VideoDenoiseInfo;
    }

    /**
     * Get The color enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ColorInfo The color enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ColorEnhanceInfo getColorInfo() {
        return this.ColorInfo;
    }

    /**
     * Set The color enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ColorInfo The color enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColorInfo(ColorEnhanceInfo ColorInfo) {
        this.ColorInfo = ColorInfo;
    }

    /**
     * Get The detail enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SharpInfo The detail enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SharpEnhanceInfo getSharpInfo() {
        return this.SharpInfo;
    }

    /**
     * Set The detail enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SharpInfo The detail enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSharpInfo(SharpEnhanceInfo SharpInfo) {
        this.SharpInfo = SharpInfo;
    }

    /**
     * Get The face enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FaceInfo The face enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public FaceEnhanceInfo getFaceInfo() {
        return this.FaceInfo;
    }

    /**
     * Set The face enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FaceInfo The face enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceInfo(FaceEnhanceInfo FaceInfo) {
        this.FaceInfo = FaceInfo;
    }

    /**
     * Get The low-light enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LowLightInfo The low-light enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LowLightEnhanceInfo getLowLightInfo() {
        return this.LowLightInfo;
    }

    /**
     * Set The low-light enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LowLightInfo The low-light enhancement parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLowLightInfo(LowLightEnhanceInfo LowLightInfo) {
        this.LowLightInfo = LowLightInfo;
    }

    /**
     * Get The banding removal parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScratchRepairInfo The banding removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ScratchRepairInfo getScratchRepairInfo() {
        return this.ScratchRepairInfo;
    }

    /**
     * Set The banding removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScratchRepairInfo The banding removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScratchRepairInfo(ScratchRepairInfo ScratchRepairInfo) {
        this.ScratchRepairInfo = ScratchRepairInfo;
    }

    /**
     * Get The artifact removal parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ArtifactRepairInfo The artifact removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ArtifactRepairInfo getArtifactRepairInfo() {
        return this.ArtifactRepairInfo;
    }

    /**
     * Set The artifact removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ArtifactRepairInfo The artifact removal parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArtifactRepairInfo(ArtifactRepairInfo ArtifactRepairInfo) {
        this.ArtifactRepairInfo = ArtifactRepairInfo;
    }

    public RebuildVideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildVideoInfo(RebuildVideoInfo source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RepairInfo.", this.RepairInfo);
        this.setParamObj(map, prefix + "VideoFrameInterpolationInfo.", this.VideoFrameInterpolationInfo);
        this.setParamObj(map, prefix + "SuperResolutionInfo.", this.SuperResolutionInfo);
        this.setParamObj(map, prefix + "HDRInfo.", this.HDRInfo);
        this.setParamObj(map, prefix + "VideoDenoiseInfo.", this.VideoDenoiseInfo);
        this.setParamObj(map, prefix + "ColorInfo.", this.ColorInfo);
        this.setParamObj(map, prefix + "SharpInfo.", this.SharpInfo);
        this.setParamObj(map, prefix + "FaceInfo.", this.FaceInfo);
        this.setParamObj(map, prefix + "LowLightInfo.", this.LowLightInfo);
        this.setParamObj(map, prefix + "ScratchRepairInfo.", this.ScratchRepairInfo);
        this.setParamObj(map, prefix + "ArtifactRepairInfo.", this.ArtifactRepairInfo);

    }
}

