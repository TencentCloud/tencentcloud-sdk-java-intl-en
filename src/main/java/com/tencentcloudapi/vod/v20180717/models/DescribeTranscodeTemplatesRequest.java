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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Filtering condition for the unique identifier of the transcoding template. The array length cannot exceed 100.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * Condition for filtering templates by type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Muxing format filter criteria. Available values:
<li>Video: Video format. A container format that can contain both video and audio streams.</li>
<li>PureAudio: Pure audio format. A muxing format that can only contain audio streams.</li>
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * TSC filter criteria for filtering standard or TSC transcoding templates. Available values:
<li>Common: standard transcoding template;</li>
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
<li>AudioVideoEnhance: audio and video enhancement.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, and audio and video enhancement)</li>
<li>None (non-enhanced)</li>
    */
    @SerializedName("EnhanceType")
    @Expose
    private String EnhanceType;

    /**
    * Enhancement scenario configuration. Available values: <li>common: general enhancement parameters, suitable for basic optimization of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement, using AI technology to improve overall video resolution and enhance image definition.</li> <li>short_play: enhances face and subtitle details, highlights facial expression details and subtitle clarity, and improves the viewing experience.</li> <li>short_video: optimizes complex and diverse image quality issues. For complex short video scenarios, it optimizes video quality and addresses multiple visual issues.</li> <li>game: repairs motion blur and enhances details, focusing on enhancing the clarity of game details and restoring motion blur areas to make the game screen content clearer and richer.</li> <li>HD_movie_series: achieves ultra-high-definition smooth effects. For the demand of ultra-high-definition video in broadcasting and OTT, it generates 4K 60fps HDR ultra-high-definition standard video. It supports broadcasting scenario format standards.</li> <li>LQ_material: overall resolution enhancement, specially optimized for issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature caused by the age of shooting.</li> <li>lecture: beautifies and enhances face effects. For scenarios where people explain in shows, e-commerce, conferences, and lectures, it performs specialized optimization for face regions, noise reduction, and burr processing.</li>
    */
    @SerializedName("EnhanceScenarioType")
    @Expose
    private String EnhanceScenarioType;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD from December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Filtering condition for the unique identifier of the transcoding template. The array length cannot exceed 100. 
     * @return Definitions Filtering condition for the unique identifier of the transcoding template. The array length cannot exceed 100.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Filtering condition for the unique identifier of the transcoding template. The array length cannot exceed 100.
     * @param Definitions Filtering condition for the unique identifier of the transcoding template. The array length cannot exceed 100.
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get Condition for filtering templates by type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Condition for filtering templates by type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Condition for filtering templates by type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Condition for filtering templates by type. Valid values:
<li>Preset: system-preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Muxing format filter criteria. Available values:
<li>Video: Video format. A container format that can contain both video and audio streams.</li>
<li>PureAudio: Pure audio format. A muxing format that can only contain audio streams.</li> 
     * @return ContainerType Muxing format filter criteria. Available values:
<li>Video: Video format. A container format that can contain both video and audio streams.</li>
<li>PureAudio: Pure audio format. A muxing format that can only contain audio streams.</li>
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set Muxing format filter criteria. Available values:
<li>Video: Video format. A container format that can contain both video and audio streams.</li>
<li>PureAudio: Pure audio format. A muxing format that can only contain audio streams.</li>
     * @param ContainerType Muxing format filter criteria. Available values:
<li>Video: Video format. A container format that can contain both video and audio streams.</li>
<li>PureAudio: Pure audio format. A muxing format that can only contain audio streams.</li>
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get TSC filter criteria for filtering standard or TSC transcoding templates. Available values:
<li>Common: standard transcoding template;</li>
<li>TEHD: Ultra-HD template.</li> 
     * @return TEHDType TSC filter criteria for filtering standard or TSC transcoding templates. Available values:
<li>Common: standard transcoding template;</li>
<li>TEHD: Ultra-HD template.</li>
     */
    public String getTEHDType() {
        return this.TEHDType;
    }

    /**
     * Set TSC filter criteria for filtering standard or TSC transcoding templates. Available values:
<li>Common: standard transcoding template;</li>
<li>TEHD: Ultra-HD template.</li>
     * @param TEHDType TSC filter criteria for filtering standard or TSC transcoding templates. Available values:
<li>Common: standard transcoding template;</li>
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
<li>AudioVideoEnhance: audio and video enhancement.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, and audio and video enhancement)</li>
<li>None (non-enhanced)</li> 
     * @return EnhanceType Enhancement type. Valid values:
<li>VideoEnhance: video enhancement only.</li>
<li>AudioEnhance (audio enhancement only).</li>
<li>AudioVideoEnhance: audio and video enhancement.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, and audio and video enhancement)</li>
<li>None (non-enhanced)</li>
     */
    public String getEnhanceType() {
        return this.EnhanceType;
    }

    /**
     * Set Enhancement type. Valid values:
<li>VideoEnhance: video enhancement only.</li>
<li>AudioEnhance (audio enhancement only).</li>
<li>AudioVideoEnhance: audio and video enhancement.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, and audio and video enhancement)</li>
<li>None (non-enhanced)</li>
     * @param EnhanceType Enhancement type. Valid values:
<li>VideoEnhance: video enhancement only.</li>
<li>AudioEnhance (audio enhancement only).</li>
<li>AudioVideoEnhance: audio and video enhancement.</li>
<li>AnyEnhance (including video enhancement only, audio enhancement only, and audio and video enhancement)</li>
<li>None (non-enhanced)</li>
     */
    public void setEnhanceType(String EnhanceType) {
        this.EnhanceType = EnhanceType;
    }

    /**
     * Get Enhancement scenario configuration. Available values: <li>common: general enhancement parameters, suitable for basic optimization of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement, using AI technology to improve overall video resolution and enhance image definition.</li> <li>short_play: enhances face and subtitle details, highlights facial expression details and subtitle clarity, and improves the viewing experience.</li> <li>short_video: optimizes complex and diverse image quality issues. For complex short video scenarios, it optimizes video quality and addresses multiple visual issues.</li> <li>game: repairs motion blur and enhances details, focusing on enhancing the clarity of game details and restoring motion blur areas to make the game screen content clearer and richer.</li> <li>HD_movie_series: achieves ultra-high-definition smooth effects. For the demand of ultra-high-definition video in broadcasting and OTT, it generates 4K 60fps HDR ultra-high-definition standard video. It supports broadcasting scenario format standards.</li> <li>LQ_material: overall resolution enhancement, specially optimized for issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature caused by the age of shooting.</li> <li>lecture: beautifies and enhances face effects. For scenarios where people explain in shows, e-commerce, conferences, and lectures, it performs specialized optimization for face regions, noise reduction, and burr processing.</li> 
     * @return EnhanceScenarioType Enhancement scenario configuration. Available values: <li>common: general enhancement parameters, suitable for basic optimization of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement, using AI technology to improve overall video resolution and enhance image definition.</li> <li>short_play: enhances face and subtitle details, highlights facial expression details and subtitle clarity, and improves the viewing experience.</li> <li>short_video: optimizes complex and diverse image quality issues. For complex short video scenarios, it optimizes video quality and addresses multiple visual issues.</li> <li>game: repairs motion blur and enhances details, focusing on enhancing the clarity of game details and restoring motion blur areas to make the game screen content clearer and richer.</li> <li>HD_movie_series: achieves ultra-high-definition smooth effects. For the demand of ultra-high-definition video in broadcasting and OTT, it generates 4K 60fps HDR ultra-high-definition standard video. It supports broadcasting scenario format standards.</li> <li>LQ_material: overall resolution enhancement, specially optimized for issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature caused by the age of shooting.</li> <li>lecture: beautifies and enhances face effects. For scenarios where people explain in shows, e-commerce, conferences, and lectures, it performs specialized optimization for face regions, noise reduction, and burr processing.</li>
     */
    public String getEnhanceScenarioType() {
        return this.EnhanceScenarioType;
    }

    /**
     * Set Enhancement scenario configuration. Available values: <li>common: general enhancement parameters, suitable for basic optimization of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement, using AI technology to improve overall video resolution and enhance image definition.</li> <li>short_play: enhances face and subtitle details, highlights facial expression details and subtitle clarity, and improves the viewing experience.</li> <li>short_video: optimizes complex and diverse image quality issues. For complex short video scenarios, it optimizes video quality and addresses multiple visual issues.</li> <li>game: repairs motion blur and enhances details, focusing on enhancing the clarity of game details and restoring motion blur areas to make the game screen content clearer and richer.</li> <li>HD_movie_series: achieves ultra-high-definition smooth effects. For the demand of ultra-high-definition video in broadcasting and OTT, it generates 4K 60fps HDR ultra-high-definition standard video. It supports broadcasting scenario format standards.</li> <li>LQ_material: overall resolution enhancement, specially optimized for issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature caused by the age of shooting.</li> <li>lecture: beautifies and enhances face effects. For scenarios where people explain in shows, e-commerce, conferences, and lectures, it performs specialized optimization for face regions, noise reduction, and burr processing.</li>
     * @param EnhanceScenarioType Enhancement scenario configuration. Available values: <li>common: general enhancement parameters, suitable for basic optimization of various video types to improve overall video quality.</li> <li>AIGC: overall resolution enhancement, using AI technology to improve overall video resolution and enhance image definition.</li> <li>short_play: enhances face and subtitle details, highlights facial expression details and subtitle clarity, and improves the viewing experience.</li> <li>short_video: optimizes complex and diverse image quality issues. For complex short video scenarios, it optimizes video quality and addresses multiple visual issues.</li> <li>game: repairs motion blur and enhances details, focusing on enhancing the clarity of game details and restoring motion blur areas to make the game screen content clearer and richer.</li> <li>HD_movie_series: achieves ultra-high-definition smooth effects. For the demand of ultra-high-definition video in broadcasting and OTT, it generates 4K 60fps HDR ultra-high-definition standard video. It supports broadcasting scenario format standards.</li> <li>LQ_material: overall resolution enhancement, specially optimized for issues in old videos such as insufficient resolution, blur distortion, scratch damage, and color temperature caused by the age of shooting.</li> <li>lecture: beautifies and enhances face effects. For scenarios where people explain in shows, e-commerce, conferences, and lectures, it performs specialized optimization for face regions, noise reduction, and burr processing.</li>
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

