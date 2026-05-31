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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitleConf extends AbstractModel {

    /**
    * Template Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Name of the subtitle selector. Required when CaptionSource is set to INPUT.
    */
    @SerializedName("CaptionSelectorName")
    @Expose
    private String CaptionSelectorName;

    /**
    * Available values: INPUT (source subtitle information), ANALYSIS (intelligent voice recognition to subtitle).
    */
    @SerializedName("CaptionSource")
    @Expose
    private String CaptionSource;

    /**
    * Available values: 1 Source, 2 Source+Target, 3 Target (source language only, source language + target language, target language). When the output is WebVTT, it can only output one language.
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. When CaptionSource is INPUT, it supports only 2. When CaptionSource is ANALYSIS, it supports 1, 3.
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * Original speech languages: Chinese, English, Japanese, Korean.
    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
    * Target languages: Chinese, English, Japanese, Korean.
    */
    @SerializedName("TargetLanguage")
    @Expose
    private String TargetLanguage;

    /**
    * Font style configuration. Required for BurnIn.
    */
    @SerializedName("FontStyle")
    @Expose
    private SubtitleFontConf FontStyle;

    /**
    * STEADY and DYNAMIC modes correspond to steady state and non-steady state respectively. Default is STEADY. Only select STEADY when the output is WebVTT.
    */
    @SerializedName("StateEffectMode")
    @Expose
    private String StateEffectMode;

    /**
    * Steady-state delay time in seconds. Value range: 10, 20. Default: 10.
    */
    @SerializedName("SteadyStateDelayedTime")
    @Expose
    private Long SteadyStateDelayedTime;

    /**
    * Audio selector name, required for speech recognition to generate WebVTT subtitles, can be empty
    */
    @SerializedName("AudioSelectorName")
    @Expose
    private String AudioSelectorName;

    /**
    * Format configuration for WebVTT output in speech recognition.
    */
    @SerializedName("WebVTTFontStyle")
    @Expose
    private WebVTTFontStyle WebVTTFontStyle;

    /**
    * Language code, length 2-20.
    */
    @SerializedName("LanguageCode")
    @Expose
    private String LanguageCode;

    /**
    * Language description, length less than 100.
    */
    @SerializedName("LanguageDescription")
    @Expose
    private String LanguageDescription;

    /**
     * Get Template Name 
     * @return Name Template Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template Name
     * @param Name Template Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Name of the subtitle selector. Required when CaptionSource is set to INPUT. 
     * @return CaptionSelectorName Name of the subtitle selector. Required when CaptionSource is set to INPUT.
     */
    public String getCaptionSelectorName() {
        return this.CaptionSelectorName;
    }

    /**
     * Set Name of the subtitle selector. Required when CaptionSource is set to INPUT.
     * @param CaptionSelectorName Name of the subtitle selector. Required when CaptionSource is set to INPUT.
     */
    public void setCaptionSelectorName(String CaptionSelectorName) {
        this.CaptionSelectorName = CaptionSelectorName;
    }

    /**
     * Get Available values: INPUT (source subtitle information), ANALYSIS (intelligent voice recognition to subtitle). 
     * @return CaptionSource Available values: INPUT (source subtitle information), ANALYSIS (intelligent voice recognition to subtitle).
     */
    public String getCaptionSource() {
        return this.CaptionSource;
    }

    /**
     * Set Available values: INPUT (source subtitle information), ANALYSIS (intelligent voice recognition to subtitle).
     * @param CaptionSource Available values: INPUT (source subtitle information), ANALYSIS (intelligent voice recognition to subtitle).
     */
    public void setCaptionSource(String CaptionSource) {
        this.CaptionSource = CaptionSource;
    }

    /**
     * Get Available values: 1 Source, 2 Source+Target, 3 Target (source language only, source language + target language, target language). When the output is WebVTT, it can only output one language. 
     * @return ContentType Available values: 1 Source, 2 Source+Target, 3 Target (source language only, source language + target language, target language). When the output is WebVTT, it can only output one language.
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set Available values: 1 Source, 2 Source+Target, 3 Target (source language only, source language + target language, target language). When the output is WebVTT, it can only output one language.
     * @param ContentType Available values: 1 Source, 2 Source+Target, 3 Target (source language only, source language + target language, target language). When the output is WebVTT, it can only output one language.
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. When CaptionSource is INPUT, it supports only 2. When CaptionSource is ANALYSIS, it supports 1, 3. 
     * @return TargetType Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. When CaptionSource is INPUT, it supports only 2. When CaptionSource is ANALYSIS, it supports 1, 3.
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. When CaptionSource is INPUT, it supports only 2. When CaptionSource is ANALYSIS, it supports 1, 3.
     * @param TargetType Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. When CaptionSource is INPUT, it supports only 2. When CaptionSource is ANALYSIS, it supports 1, 3.
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Original speech languages: Chinese, English, Japanese, Korean. 
     * @return SourceLanguage Original speech languages: Chinese, English, Japanese, Korean.
     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * Set Original speech languages: Chinese, English, Japanese, Korean.
     * @param SourceLanguage Original speech languages: Chinese, English, Japanese, Korean.
     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
    }

    /**
     * Get Target languages: Chinese, English, Japanese, Korean. 
     * @return TargetLanguage Target languages: Chinese, English, Japanese, Korean.
     */
    public String getTargetLanguage() {
        return this.TargetLanguage;
    }

    /**
     * Set Target languages: Chinese, English, Japanese, Korean.
     * @param TargetLanguage Target languages: Chinese, English, Japanese, Korean.
     */
    public void setTargetLanguage(String TargetLanguage) {
        this.TargetLanguage = TargetLanguage;
    }

    /**
     * Get Font style configuration. Required for BurnIn. 
     * @return FontStyle Font style configuration. Required for BurnIn.
     */
    public SubtitleFontConf getFontStyle() {
        return this.FontStyle;
    }

    /**
     * Set Font style configuration. Required for BurnIn.
     * @param FontStyle Font style configuration. Required for BurnIn.
     */
    public void setFontStyle(SubtitleFontConf FontStyle) {
        this.FontStyle = FontStyle;
    }

    /**
     * Get STEADY and DYNAMIC modes correspond to steady state and non-steady state respectively. Default is STEADY. Only select STEADY when the output is WebVTT. 
     * @return StateEffectMode STEADY and DYNAMIC modes correspond to steady state and non-steady state respectively. Default is STEADY. Only select STEADY when the output is WebVTT.
     */
    public String getStateEffectMode() {
        return this.StateEffectMode;
    }

    /**
     * Set STEADY and DYNAMIC modes correspond to steady state and non-steady state respectively. Default is STEADY. Only select STEADY when the output is WebVTT.
     * @param StateEffectMode STEADY and DYNAMIC modes correspond to steady state and non-steady state respectively. Default is STEADY. Only select STEADY when the output is WebVTT.
     */
    public void setStateEffectMode(String StateEffectMode) {
        this.StateEffectMode = StateEffectMode;
    }

    /**
     * Get Steady-state delay time in seconds. Value range: 10, 20. Default: 10. 
     * @return SteadyStateDelayedTime Steady-state delay time in seconds. Value range: 10, 20. Default: 10.
     */
    public Long getSteadyStateDelayedTime() {
        return this.SteadyStateDelayedTime;
    }

    /**
     * Set Steady-state delay time in seconds. Value range: 10, 20. Default: 10.
     * @param SteadyStateDelayedTime Steady-state delay time in seconds. Value range: 10, 20. Default: 10.
     */
    public void setSteadyStateDelayedTime(Long SteadyStateDelayedTime) {
        this.SteadyStateDelayedTime = SteadyStateDelayedTime;
    }

    /**
     * Get Audio selector name, required for speech recognition to generate WebVTT subtitles, can be empty 
     * @return AudioSelectorName Audio selector name, required for speech recognition to generate WebVTT subtitles, can be empty
     */
    public String getAudioSelectorName() {
        return this.AudioSelectorName;
    }

    /**
     * Set Audio selector name, required for speech recognition to generate WebVTT subtitles, can be empty
     * @param AudioSelectorName Audio selector name, required for speech recognition to generate WebVTT subtitles, can be empty
     */
    public void setAudioSelectorName(String AudioSelectorName) {
        this.AudioSelectorName = AudioSelectorName;
    }

    /**
     * Get Format configuration for WebVTT output in speech recognition. 
     * @return WebVTTFontStyle Format configuration for WebVTT output in speech recognition.
     */
    public WebVTTFontStyle getWebVTTFontStyle() {
        return this.WebVTTFontStyle;
    }

    /**
     * Set Format configuration for WebVTT output in speech recognition.
     * @param WebVTTFontStyle Format configuration for WebVTT output in speech recognition.
     */
    public void setWebVTTFontStyle(WebVTTFontStyle WebVTTFontStyle) {
        this.WebVTTFontStyle = WebVTTFontStyle;
    }

    /**
     * Get Language code, length 2-20. 
     * @return LanguageCode Language code, length 2-20.
     */
    public String getLanguageCode() {
        return this.LanguageCode;
    }

    /**
     * Set Language code, length 2-20.
     * @param LanguageCode Language code, length 2-20.
     */
    public void setLanguageCode(String LanguageCode) {
        this.LanguageCode = LanguageCode;
    }

    /**
     * Get Language description, length less than 100. 
     * @return LanguageDescription Language description, length less than 100.
     */
    public String getLanguageDescription() {
        return this.LanguageDescription;
    }

    /**
     * Set Language description, length less than 100.
     * @param LanguageDescription Language description, length less than 100.
     */
    public void setLanguageDescription(String LanguageDescription) {
        this.LanguageDescription = LanguageDescription;
    }

    public SubtitleConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleConf(SubtitleConf source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CaptionSelectorName != null) {
            this.CaptionSelectorName = new String(source.CaptionSelectorName);
        }
        if (source.CaptionSource != null) {
            this.CaptionSource = new String(source.CaptionSource);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.SourceLanguage != null) {
            this.SourceLanguage = new String(source.SourceLanguage);
        }
        if (source.TargetLanguage != null) {
            this.TargetLanguage = new String(source.TargetLanguage);
        }
        if (source.FontStyle != null) {
            this.FontStyle = new SubtitleFontConf(source.FontStyle);
        }
        if (source.StateEffectMode != null) {
            this.StateEffectMode = new String(source.StateEffectMode);
        }
        if (source.SteadyStateDelayedTime != null) {
            this.SteadyStateDelayedTime = new Long(source.SteadyStateDelayedTime);
        }
        if (source.AudioSelectorName != null) {
            this.AudioSelectorName = new String(source.AudioSelectorName);
        }
        if (source.WebVTTFontStyle != null) {
            this.WebVTTFontStyle = new WebVTTFontStyle(source.WebVTTFontStyle);
        }
        if (source.LanguageCode != null) {
            this.LanguageCode = new String(source.LanguageCode);
        }
        if (source.LanguageDescription != null) {
            this.LanguageDescription = new String(source.LanguageDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CaptionSelectorName", this.CaptionSelectorName);
        this.setParamSimple(map, prefix + "CaptionSource", this.CaptionSource);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "SourceLanguage", this.SourceLanguage);
        this.setParamSimple(map, prefix + "TargetLanguage", this.TargetLanguage);
        this.setParamObj(map, prefix + "FontStyle.", this.FontStyle);
        this.setParamSimple(map, prefix + "StateEffectMode", this.StateEffectMode);
        this.setParamSimple(map, prefix + "SteadyStateDelayedTime", this.SteadyStateDelayedTime);
        this.setParamSimple(map, prefix + "AudioSelectorName", this.AudioSelectorName);
        this.setParamObj(map, prefix + "WebVTTFontStyle.", this.WebVTTFontStyle);
        this.setParamSimple(map, prefix + "LanguageCode", this.LanguageCode);
        this.setParamSimple(map, prefix + "LanguageDescription", this.LanguageDescription);

    }
}

