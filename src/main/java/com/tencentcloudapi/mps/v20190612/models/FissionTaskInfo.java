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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FissionTaskInfo extends AbstractModel {

    /**
    * <p>Video output duration</p><p>Range: [1, 15]</p><p>Unit: seconds</p><p>Default value: 15</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>Model gearbox</p><p>Enumeration value:</p><ul><li>standard: Standard version</li><li>flagship: Flagship edition</li></ul>
    */
    @SerializedName("ModelTier")
    @Expose
    private String ModelTier;

    /**
    * <p>Video image ratio</p><p>Enumeration values:</p><ul><li>9:16: 9:16</li><li>16:9: 16:9</li><li>1:1: -1:1</li><li>3:4: 3:4</li><li>4:3: 4:3</li></ul>
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * <p>Output resolution</p><p>Enumeration values:</p><ul><li>720p: 720p</li><li>1080p: 1080p</li><li>2k: 2k</li><li>4k: 4k</li></ul>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>Target market</p><p>Enumeration values:</p><ul><li>north_america: North America</li><li>europe: Europe</li><li>china: China</li><li>japan: Japan</li><li>korea: South Korea</li><li>southeast_asia: Southeast Asia</li><li>brazil: Brazil</li><li>global: Global</li><li>other: Other</li></ul><p>Impacts the default model ethnicity and localized style. When CustomModel is not specified, the ethnicity is automatically determined by the market.</p>
    */
    @SerializedName("Market")
    @Expose
    private String Market;

    /**
    * <p>Voiceover/subtitle language</p><p>Enumeration value:</p><ul><li>english: English</li><li>chinese: Chinese</li><li>japanese: Japanese</li><li>korean: Korean</li><li>spanish: Spanish</li><li>portuguese: Portuguese</li><li>music_only: Music only, no voiceover</li></ul>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>Video type</p><p>Enumeration value:</p><ul><li>ugc: UGC seeding</li><li>talk: Product talk</li><li>display: Product display (product only, no voice)</li><li>unboxing: Out-of-the-box sharing</li><li>reaction: Reaction show</li></ul>
    */
    @SerializedName("VideoType")
    @Expose
    private String VideoType;

    /**
    * <p>Fission count</p><p>Value ranges from 0 to 1</p><p>Unit: unit</p>
    */
    @SerializedName("SplitCount")
    @Expose
    private Long SplitCount;

    /**
    * <p>Customize an on-camera model</p>
    */
    @SerializedName("CustomModel")
    @Expose
    private CustomModel CustomModel;

    /**
     * Get <p>Video output duration</p><p>Range: [1, 15]</p><p>Unit: seconds</p><p>Default value: 15</p> 
     * @return Duration <p>Video output duration</p><p>Range: [1, 15]</p><p>Unit: seconds</p><p>Default value: 15</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Video output duration</p><p>Range: [1, 15]</p><p>Unit: seconds</p><p>Default value: 15</p>
     * @param Duration <p>Video output duration</p><p>Range: [1, 15]</p><p>Unit: seconds</p><p>Default value: 15</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Model gearbox</p><p>Enumeration value:</p><ul><li>standard: Standard version</li><li>flagship: Flagship edition</li></ul> 
     * @return ModelTier <p>Model gearbox</p><p>Enumeration value:</p><ul><li>standard: Standard version</li><li>flagship: Flagship edition</li></ul>
     */
    public String getModelTier() {
        return this.ModelTier;
    }

    /**
     * Set <p>Model gearbox</p><p>Enumeration value:</p><ul><li>standard: Standard version</li><li>flagship: Flagship edition</li></ul>
     * @param ModelTier <p>Model gearbox</p><p>Enumeration value:</p><ul><li>standard: Standard version</li><li>flagship: Flagship edition</li></ul>
     */
    public void setModelTier(String ModelTier) {
        this.ModelTier = ModelTier;
    }

    /**
     * Get <p>Video image ratio</p><p>Enumeration values:</p><ul><li>9:16: 9:16</li><li>16:9: 16:9</li><li>1:1: -1:1</li><li>3:4: 3:4</li><li>4:3: 4:3</li></ul> 
     * @return Ratio <p>Video image ratio</p><p>Enumeration values:</p><ul><li>9:16: 9:16</li><li>16:9: 16:9</li><li>1:1: -1:1</li><li>3:4: 3:4</li><li>4:3: 4:3</li></ul>
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>Video image ratio</p><p>Enumeration values:</p><ul><li>9:16: 9:16</li><li>16:9: 16:9</li><li>1:1: -1:1</li><li>3:4: 3:4</li><li>4:3: 4:3</li></ul>
     * @param Ratio <p>Video image ratio</p><p>Enumeration values:</p><ul><li>9:16: 9:16</li><li>16:9: 16:9</li><li>1:1: -1:1</li><li>3:4: 3:4</li><li>4:3: 4:3</li></ul>
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>Output resolution</p><p>Enumeration values:</p><ul><li>720p: 720p</li><li>1080p: 1080p</li><li>2k: 2k</li><li>4k: 4k</li></ul> 
     * @return Resolution <p>Output resolution</p><p>Enumeration values:</p><ul><li>720p: 720p</li><li>1080p: 1080p</li><li>2k: 2k</li><li>4k: 4k</li></ul>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>Output resolution</p><p>Enumeration values:</p><ul><li>720p: 720p</li><li>1080p: 1080p</li><li>2k: 2k</li><li>4k: 4k</li></ul>
     * @param Resolution <p>Output resolution</p><p>Enumeration values:</p><ul><li>720p: 720p</li><li>1080p: 1080p</li><li>2k: 2k</li><li>4k: 4k</li></ul>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>Target market</p><p>Enumeration values:</p><ul><li>north_america: North America</li><li>europe: Europe</li><li>china: China</li><li>japan: Japan</li><li>korea: South Korea</li><li>southeast_asia: Southeast Asia</li><li>brazil: Brazil</li><li>global: Global</li><li>other: Other</li></ul><p>Impacts the default model ethnicity and localized style. When CustomModel is not specified, the ethnicity is automatically determined by the market.</p> 
     * @return Market <p>Target market</p><p>Enumeration values:</p><ul><li>north_america: North America</li><li>europe: Europe</li><li>china: China</li><li>japan: Japan</li><li>korea: South Korea</li><li>southeast_asia: Southeast Asia</li><li>brazil: Brazil</li><li>global: Global</li><li>other: Other</li></ul><p>Impacts the default model ethnicity and localized style. When CustomModel is not specified, the ethnicity is automatically determined by the market.</p>
     */
    public String getMarket() {
        return this.Market;
    }

    /**
     * Set <p>Target market</p><p>Enumeration values:</p><ul><li>north_america: North America</li><li>europe: Europe</li><li>china: China</li><li>japan: Japan</li><li>korea: South Korea</li><li>southeast_asia: Southeast Asia</li><li>brazil: Brazil</li><li>global: Global</li><li>other: Other</li></ul><p>Impacts the default model ethnicity and localized style. When CustomModel is not specified, the ethnicity is automatically determined by the market.</p>
     * @param Market <p>Target market</p><p>Enumeration values:</p><ul><li>north_america: North America</li><li>europe: Europe</li><li>china: China</li><li>japan: Japan</li><li>korea: South Korea</li><li>southeast_asia: Southeast Asia</li><li>brazil: Brazil</li><li>global: Global</li><li>other: Other</li></ul><p>Impacts the default model ethnicity and localized style. When CustomModel is not specified, the ethnicity is automatically determined by the market.</p>
     */
    public void setMarket(String Market) {
        this.Market = Market;
    }

    /**
     * Get <p>Voiceover/subtitle language</p><p>Enumeration value:</p><ul><li>english: English</li><li>chinese: Chinese</li><li>japanese: Japanese</li><li>korean: Korean</li><li>spanish: Spanish</li><li>portuguese: Portuguese</li><li>music_only: Music only, no voiceover</li></ul> 
     * @return Language <p>Voiceover/subtitle language</p><p>Enumeration value:</p><ul><li>english: English</li><li>chinese: Chinese</li><li>japanese: Japanese</li><li>korean: Korean</li><li>spanish: Spanish</li><li>portuguese: Portuguese</li><li>music_only: Music only, no voiceover</li></ul>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>Voiceover/subtitle language</p><p>Enumeration value:</p><ul><li>english: English</li><li>chinese: Chinese</li><li>japanese: Japanese</li><li>korean: Korean</li><li>spanish: Spanish</li><li>portuguese: Portuguese</li><li>music_only: Music only, no voiceover</li></ul>
     * @param Language <p>Voiceover/subtitle language</p><p>Enumeration value:</p><ul><li>english: English</li><li>chinese: Chinese</li><li>japanese: Japanese</li><li>korean: Korean</li><li>spanish: Spanish</li><li>portuguese: Portuguese</li><li>music_only: Music only, no voiceover</li></ul>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>Video type</p><p>Enumeration value:</p><ul><li>ugc: UGC seeding</li><li>talk: Product talk</li><li>display: Product display (product only, no voice)</li><li>unboxing: Out-of-the-box sharing</li><li>reaction: Reaction show</li></ul> 
     * @return VideoType <p>Video type</p><p>Enumeration value:</p><ul><li>ugc: UGC seeding</li><li>talk: Product talk</li><li>display: Product display (product only, no voice)</li><li>unboxing: Out-of-the-box sharing</li><li>reaction: Reaction show</li></ul>
     */
    public String getVideoType() {
        return this.VideoType;
    }

    /**
     * Set <p>Video type</p><p>Enumeration value:</p><ul><li>ugc: UGC seeding</li><li>talk: Product talk</li><li>display: Product display (product only, no voice)</li><li>unboxing: Out-of-the-box sharing</li><li>reaction: Reaction show</li></ul>
     * @param VideoType <p>Video type</p><p>Enumeration value:</p><ul><li>ugc: UGC seeding</li><li>talk: Product talk</li><li>display: Product display (product only, no voice)</li><li>unboxing: Out-of-the-box sharing</li><li>reaction: Reaction show</li></ul>
     */
    public void setVideoType(String VideoType) {
        this.VideoType = VideoType;
    }

    /**
     * Get <p>Fission count</p><p>Value ranges from 0 to 1</p><p>Unit: unit</p> 
     * @return SplitCount <p>Fission count</p><p>Value ranges from 0 to 1</p><p>Unit: unit</p>
     */
    public Long getSplitCount() {
        return this.SplitCount;
    }

    /**
     * Set <p>Fission count</p><p>Value ranges from 0 to 1</p><p>Unit: unit</p>
     * @param SplitCount <p>Fission count</p><p>Value ranges from 0 to 1</p><p>Unit: unit</p>
     */
    public void setSplitCount(Long SplitCount) {
        this.SplitCount = SplitCount;
    }

    /**
     * Get <p>Customize an on-camera model</p> 
     * @return CustomModel <p>Customize an on-camera model</p>
     */
    public CustomModel getCustomModel() {
        return this.CustomModel;
    }

    /**
     * Set <p>Customize an on-camera model</p>
     * @param CustomModel <p>Customize an on-camera model</p>
     */
    public void setCustomModel(CustomModel CustomModel) {
        this.CustomModel = CustomModel;
    }

    public FissionTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FissionTaskInfo(FissionTaskInfo source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ModelTier != null) {
            this.ModelTier = new String(source.ModelTier);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Market != null) {
            this.Market = new String(source.Market);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.VideoType != null) {
            this.VideoType = new String(source.VideoType);
        }
        if (source.SplitCount != null) {
            this.SplitCount = new Long(source.SplitCount);
        }
        if (source.CustomModel != null) {
            this.CustomModel = new CustomModel(source.CustomModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ModelTier", this.ModelTier);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Market", this.Market);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "VideoType", this.VideoType);
        this.setParamSimple(map, prefix + "SplitCount", this.SplitCount);
        this.setParamObj(map, prefix + "CustomModel.", this.CustomModel);

    }
}

