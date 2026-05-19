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

public class DescribeTranscodeTemplatesRequest extends AbstractModel {

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Filter condition for the unique identifier of the transcoding template. The array can contain up to 100 unique identifiers.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * Condition for filtering templates by type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: User-defined template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Muxing format filter condition. Available values:
<li>Video: Video format that contains both video stream and audio stream in a muxing format.</li>
<li>PureAudio: Pure audio format, a muxing format that can only contain audio streams.</li>
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * Top Speed Codec filter conditions for filtering standard transcoding or TSC transcoding templates. Available values:
<li>Common: standard transcoding template.</li>
<li>TEHD: Ultra-HD template.</li>
    */
    @SerializedName("TEHDType")
    @Expose
    private String TEHDType;

    /**
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Enhancement type. Valid values:
<li>VideoEnhance: video enhancement only.</li>
<li>AudioEnhance (audio enhancement only).</li>
<li>AudioVideoEnhance: audio and video enhancement included.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, audio and video enhancement)</li>
<li>None (non-enhanced)</li>
    */
    @SerializedName("EnhanceType")
    @Expose
    private String EnhanceType;

    /**
    * Enhance scenario configuration. Available values: <li>common (general): general enhancement parameter, suitable for basic optimization parameters of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li> <li>short_play (mini-drama): enhances face and subtitle details, highlights facial expression details and subtitle clarity to improve viewing experience.</li> <li>short_video (short video): optimizes complex and diverse image quality issues, targets complex scenarios in short videos, improves video quality, and addresses multiple visual problems.</li> <li>game (gaming video): restores motion blur, enhances details, focuses on improving game detail clarity, restores motion blur areas, and makes the game screen content clearer and more vivid.</li> <li>HD_movie_series (UHD TV shows and movies): achieves ultra-high-definition smooth effects, targets the demand for UHD videos in broadcasting and OTT scenarios, and generates UHD standard videos in 4K 60fps HDR. Supports broadcasting scenario format standards.</li> <li>LQ_material (low-quality material/classic film restoration): improves overall resolution, specifically optimizes issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature due to their age.</li> <li>lecture (showroom/e-commerce/conference/lecture): beautifies and enhances face effects, specifically optimizes face regions, noise reduction, and burr processing for scenarios where figures are explained in showrooms, e-commerce, conferences, or lectures.</li>
    */
    @SerializedName("EnhanceScenarioType")
    @Expose
    private String EnhanceScenarioType;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Filter condition for the unique identifier of the transcoding template. The array can contain up to 100 unique identifiers. 
     * @return Definitions Filter condition for the unique identifier of the transcoding template. The array can contain up to 100 unique identifiers.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Filter condition for the unique identifier of the transcoding template. The array can contain up to 100 unique identifiers.
     * @param Definitions Filter condition for the unique identifier of the transcoding template. The array can contain up to 100 unique identifiers.
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get Condition for filtering templates by type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: User-defined template.</li> 
     * @return Type Condition for filtering templates by type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: User-defined template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Condition for filtering templates by type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: User-defined template.</li>
     * @param Type Condition for filtering templates by type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: User-defined template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Muxing format filter condition. Available values:
<li>Video: Video format that contains both video stream and audio stream in a muxing format.</li>
<li>PureAudio: Pure audio format, a muxing format that can only contain audio streams.</li> 
     * @return ContainerType Muxing format filter condition. Available values:
<li>Video: Video format that contains both video stream and audio stream in a muxing format.</li>
<li>PureAudio: Pure audio format, a muxing format that can only contain audio streams.</li>
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set Muxing format filter condition. Available values:
<li>Video: Video format that contains both video stream and audio stream in a muxing format.</li>
<li>PureAudio: Pure audio format, a muxing format that can only contain audio streams.</li>
     * @param ContainerType Muxing format filter condition. Available values:
<li>Video: Video format that contains both video stream and audio stream in a muxing format.</li>
<li>PureAudio: Pure audio format, a muxing format that can only contain audio streams.</li>
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get Top Speed Codec filter conditions for filtering standard transcoding or TSC transcoding templates. Available values:
<li>Common: standard transcoding template.</li>
<li>TEHD: Ultra-HD template.</li> 
     * @return TEHDType Top Speed Codec filter conditions for filtering standard transcoding or TSC transcoding templates. Available values:
<li>Common: standard transcoding template.</li>
<li>TEHD: Ultra-HD template.</li>
     */
    public String getTEHDType() {
        return this.TEHDType;
    }

    /**
     * Set Top Speed Codec filter conditions for filtering standard transcoding or TSC transcoding templates. Available values:
<li>Common: standard transcoding template.</li>
<li>TEHD: Ultra-HD template.</li>
     * @param TEHDType Top Speed Codec filter conditions for filtering standard transcoding or TSC transcoding templates. Available values:
<li>Common: standard transcoding template.</li>
<li>TEHD: Ultra-HD template.</li>
     */
    public void setTEHDType(String TEHDType) {
        this.TEHDType = TEHDType;
    }

    /**
     * Get Pagination offset. Default value: 0. 
     * @return Offset Pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0.
     * @param Offset Pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. Default value: 10. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 10. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Enhancement type. Valid values:
<li>VideoEnhance: video enhancement only.</li>
<li>AudioEnhance (audio enhancement only).</li>
<li>AudioVideoEnhance: audio and video enhancement included.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, audio and video enhancement)</li>
<li>None (non-enhanced)</li> 
     * @return EnhanceType Enhancement type. Valid values:
<li>VideoEnhance: video enhancement only.</li>
<li>AudioEnhance (audio enhancement only).</li>
<li>AudioVideoEnhance: audio and video enhancement included.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, audio and video enhancement)</li>
<li>None (non-enhanced)</li>
     */
    public String getEnhanceType() {
        return this.EnhanceType;
    }

    /**
     * Set Enhancement type. Valid values:
<li>VideoEnhance: video enhancement only.</li>
<li>AudioEnhance (audio enhancement only).</li>
<li>AudioVideoEnhance: audio and video enhancement included.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, audio and video enhancement)</li>
<li>None (non-enhanced)</li>
     * @param EnhanceType Enhancement type. Valid values:
<li>VideoEnhance: video enhancement only.</li>
<li>AudioEnhance (audio enhancement only).</li>
<li>AudioVideoEnhance: audio and video enhancement included.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, audio and video enhancement)</li>
<li>None (non-enhanced)</li>
     */
    public void setEnhanceType(String EnhanceType) {
        this.EnhanceType = EnhanceType;
    }

    /**
     * Get Enhance scenario configuration. Available values: <li>common (general): general enhancement parameter, suitable for basic optimization parameters of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li> <li>short_play (mini-drama): enhances face and subtitle details, highlights facial expression details and subtitle clarity to improve viewing experience.</li> <li>short_video (short video): optimizes complex and diverse image quality issues, targets complex scenarios in short videos, improves video quality, and addresses multiple visual problems.</li> <li>game (gaming video): restores motion blur, enhances details, focuses on improving game detail clarity, restores motion blur areas, and makes the game screen content clearer and more vivid.</li> <li>HD_movie_series (UHD TV shows and movies): achieves ultra-high-definition smooth effects, targets the demand for UHD videos in broadcasting and OTT scenarios, and generates UHD standard videos in 4K 60fps HDR. Supports broadcasting scenario format standards.</li> <li>LQ_material (low-quality material/classic film restoration): improves overall resolution, specifically optimizes issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature due to their age.</li> <li>lecture (showroom/e-commerce/conference/lecture): beautifies and enhances face effects, specifically optimizes face regions, noise reduction, and burr processing for scenarios where figures are explained in showrooms, e-commerce, conferences, or lectures.</li> 
     * @return EnhanceScenarioType Enhance scenario configuration. Available values: <li>common (general): general enhancement parameter, suitable for basic optimization parameters of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li> <li>short_play (mini-drama): enhances face and subtitle details, highlights facial expression details and subtitle clarity to improve viewing experience.</li> <li>short_video (short video): optimizes complex and diverse image quality issues, targets complex scenarios in short videos, improves video quality, and addresses multiple visual problems.</li> <li>game (gaming video): restores motion blur, enhances details, focuses on improving game detail clarity, restores motion blur areas, and makes the game screen content clearer and more vivid.</li> <li>HD_movie_series (UHD TV shows and movies): achieves ultra-high-definition smooth effects, targets the demand for UHD videos in broadcasting and OTT scenarios, and generates UHD standard videos in 4K 60fps HDR. Supports broadcasting scenario format standards.</li> <li>LQ_material (low-quality material/classic film restoration): improves overall resolution, specifically optimizes issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature due to their age.</li> <li>lecture (showroom/e-commerce/conference/lecture): beautifies and enhances face effects, specifically optimizes face regions, noise reduction, and burr processing for scenarios where figures are explained in showrooms, e-commerce, conferences, or lectures.</li>
     */
    public String getEnhanceScenarioType() {
        return this.EnhanceScenarioType;
    }

    /**
     * Set Enhance scenario configuration. Available values: <li>common (general): general enhancement parameter, suitable for basic optimization parameters of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li> <li>short_play (mini-drama): enhances face and subtitle details, highlights facial expression details and subtitle clarity to improve viewing experience.</li> <li>short_video (short video): optimizes complex and diverse image quality issues, targets complex scenarios in short videos, improves video quality, and addresses multiple visual problems.</li> <li>game (gaming video): restores motion blur, enhances details, focuses on improving game detail clarity, restores motion blur areas, and makes the game screen content clearer and more vivid.</li> <li>HD_movie_series (UHD TV shows and movies): achieves ultra-high-definition smooth effects, targets the demand for UHD videos in broadcasting and OTT scenarios, and generates UHD standard videos in 4K 60fps HDR. Supports broadcasting scenario format standards.</li> <li>LQ_material (low-quality material/classic film restoration): improves overall resolution, specifically optimizes issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature due to their age.</li> <li>lecture (showroom/e-commerce/conference/lecture): beautifies and enhances face effects, specifically optimizes face regions, noise reduction, and burr processing for scenarios where figures are explained in showrooms, e-commerce, conferences, or lectures.</li>
     * @param EnhanceScenarioType Enhance scenario configuration. Available values: <li>common (general): general enhancement parameter, suitable for basic optimization parameters of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement. It uses AI technology to improve the overall video resolution and image clarity.</li> <li>short_play (mini-drama): enhances face and subtitle details, highlights facial expression details and subtitle clarity to improve viewing experience.</li> <li>short_video (short video): optimizes complex and diverse image quality issues, targets complex scenarios in short videos, improves video quality, and addresses multiple visual problems.</li> <li>game (gaming video): restores motion blur, enhances details, focuses on improving game detail clarity, restores motion blur areas, and makes the game screen content clearer and more vivid.</li> <li>HD_movie_series (UHD TV shows and movies): achieves ultra-high-definition smooth effects, targets the demand for UHD videos in broadcasting and OTT scenarios, and generates UHD standard videos in 4K 60fps HDR. Supports broadcasting scenario format standards.</li> <li>LQ_material (low-quality material/classic film restoration): improves overall resolution, specifically optimizes issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature due to their age.</li> <li>lecture (showroom/e-commerce/conference/lecture): beautifies and enhances face effects, specifically optimizes face regions, noise reduction, and burr processing for scenarios where figures are explained in showrooms, e-commerce, conferences, or lectures.</li>
     */
    public void setEnhanceScenarioType(String EnhanceScenarioType) {
        this.EnhanceScenarioType = EnhanceScenarioType;
    }

    public DescribeTranscodeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTranscodeTemplatesRequest(DescribeTranscodeTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ContainerType != null) {
            this.ContainerType = new String(source.ContainerType);
        }
        if (source.TEHDType != null) {
            this.TEHDType = new String(source.TEHDType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EnhanceType != null) {
            this.EnhanceType = new String(source.EnhanceType);
        }
        if (source.EnhanceScenarioType != null) {
            this.EnhanceScenarioType = new String(source.EnhanceScenarioType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "TEHDType", this.TEHDType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EnhanceType", this.EnhanceType);
        this.setParamSimple(map, prefix + "EnhanceScenarioType", this.EnhanceScenarioType);

    }
}

