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
    * Template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Name of caption selector. Required when CaptionSource selects `INPUT`.
    */
    @SerializedName("CaptionSelectorName")
    @Expose
    private String CaptionSelectorName;

    /**
    * Optional values: INPUT (source subtitle information), ANALYSIS (intelligent speech recognition to subtitles).
    */
    @SerializedName("CaptionSource")
    @Expose
    private String CaptionSource;

    /**
    * Optional values: 1 Source, 2 Source+Target, 3 Target (original language only, original language + translation language, translation language). Required when CaptionSource selects `ANALYSIS `. When outputting as WebVTT, a single template can only output one language.
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. Support `2` when CaptionSource selects `INPUT`. Support `1` and `3` when CaptionSource selects `ANALYSIS `.
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * Original phonetic language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `.
    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
    * Target language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `.
    */
    @SerializedName("TargetLanguage")
    @Expose
    private String TargetLanguage;

    /**
    * Font style configuration. Required when CaptionSource selects `ANALYSIS `.
    */
    @SerializedName("FontStyle")
    @Expose
    private SubtitleFontConf FontStyle;

    /**
    * There are two modes: STEADY and DYNAMIC, corresponding to steady state and unstable state respectively; the default is STEADY. Required when CaptionSource selects `ANALYSIS `. When the output is WebVTT, only STEADY can be selected.
    */
    @SerializedName("StateEffectMode")
    @Expose
    private String StateEffectMode;

    /**
    * Steady-state delay time, unit seconds; optional values: 10, 20, default 10. Required when CaptionSource selects `ANALYSIS `.
    */
    @SerializedName("SteadyStateDelayedTime")
    @Expose
    private Long SteadyStateDelayedTime;

    /**
    * Audio selector name, required for generating WebVTT subtitles using speech recognition, can be empty.
    */
    @SerializedName("AudioSelectorName")
    @Expose
    private String AudioSelectorName;

    /**
    * Format configuration for speech recognition output on WebVTT.
    */
    @SerializedName("WebVTTFontStyle")
    @Expose
    private WebVTTFontStyle WebVTTFontStyle;

    /**
    * Language code, length 2-20. ISO 639-2 three-digit code is recommend.
    */
    @SerializedName("LanguageCode")
    @Expose
    private String LanguageCode;

    /**
    * Language description, less than 100 characters in length.
    */
    @SerializedName("LanguageDescription")
    @Expose
    private String LanguageDescription;

    /**
     * Get Template name. 
     * @return Name Template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name.
     * @param Name Template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Name of caption selector. Required when CaptionSource selects `INPUT`. 
     * @return CaptionSelectorName Name of caption selector. Required when CaptionSource selects `INPUT`.
     */
    public String getCaptionSelectorName() {
        return this.CaptionSelectorName;
    }

    /**
     * Set Name of caption selector. Required when CaptionSource selects `INPUT`.
     * @param CaptionSelectorName Name of caption selector. Required when CaptionSource selects `INPUT`.
     */
    public void setCaptionSelectorName(String CaptionSelectorName) {
        this.CaptionSelectorName = CaptionSelectorName;
    }

    /**
     * Get Optional values: INPUT (source subtitle information), ANALYSIS (intelligent speech recognition to subtitles). 
     * @return CaptionSource Optional values: INPUT (source subtitle information), ANALYSIS (intelligent speech recognition to subtitles).
     */
    public String getCaptionSource() {
        return this.CaptionSource;
    }

    /**
     * Set Optional values: INPUT (source subtitle information), ANALYSIS (intelligent speech recognition to subtitles).
     * @param CaptionSource Optional values: INPUT (source subtitle information), ANALYSIS (intelligent speech recognition to subtitles).
     */
    public void setCaptionSource(String CaptionSource) {
        this.CaptionSource = CaptionSource;
    }

    /**
     * Get Optional values: 1 Source, 2 Source+Target, 3 Target (original language only, original language + translation language, translation language). Required when CaptionSource selects `ANALYSIS `. When outputting as WebVTT, a single template can only output one language. 
     * @return ContentType Optional values: 1 Source, 2 Source+Target, 3 Target (original language only, original language + translation language, translation language). Required when CaptionSource selects `ANALYSIS `. When outputting as WebVTT, a single template can only output one language.
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set Optional values: 1 Source, 2 Source+Target, 3 Target (original language only, original language + translation language, translation language). Required when CaptionSource selects `ANALYSIS `. When outputting as WebVTT, a single template can only output one language.
     * @param ContentType Optional values: 1 Source, 2 Source+Target, 3 Target (original language only, original language + translation language, translation language). Required when CaptionSource selects `ANALYSIS `. When outputting as WebVTT, a single template can only output one language.
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. Support `2` when CaptionSource selects `INPUT`. Support `1` and `3` when CaptionSource selects `ANALYSIS `. 
     * @return TargetType Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. Support `2` when CaptionSource selects `INPUT`. Support `1` and `3` when CaptionSource selects `ANALYSIS `.
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. Support `2` when CaptionSource selects `INPUT`. Support `1` and `3` when CaptionSource selects `ANALYSIS `.
     * @param TargetType Output mode: 1 Burn in, 2 Embedded, 3 WebVTT. Support `2` when CaptionSource selects `INPUT`. Support `1` and `3` when CaptionSource selects `ANALYSIS `.
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Original phonetic language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `. 
     * @return SourceLanguage Original phonetic language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `.
     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * Set Original phonetic language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `.
     * @param SourceLanguage Original phonetic language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `.
     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
    }

    /**
     * Get Target language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `. 
     * @return TargetLanguage Target language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `.
     */
    public String getTargetLanguage() {
        return this.TargetLanguage;
    }

    /**
     * Set Target language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `.
     * @param TargetLanguage Target language.
Optional values: Chinese, English, Japanese, Korean. Required when CaptionSource selects `ANALYSIS `.
     */
    public void setTargetLanguage(String TargetLanguage) {
        this.TargetLanguage = TargetLanguage;
    }

    /**
     * Get Font style configuration. Required when CaptionSource selects `ANALYSIS `. 
     * @return FontStyle Font style configuration. Required when CaptionSource selects `ANALYSIS `.
     */
    public SubtitleFontConf getFontStyle() {
        return this.FontStyle;
    }

    /**
     * Set Font style configuration. Required when CaptionSource selects `ANALYSIS `.
     * @param FontStyle Font style configuration. Required when CaptionSource selects `ANALYSIS `.
     */
    public void setFontStyle(SubtitleFontConf FontStyle) {
        this.FontStyle = FontStyle;
    }

    /**
     * Get There are two modes: STEADY and DYNAMIC, corresponding to steady state and unstable state respectively; the default is STEADY. Required when CaptionSource selects `ANALYSIS `. When the output is WebVTT, only STEADY can be selected. 
     * @return StateEffectMode There are two modes: STEADY and DYNAMIC, corresponding to steady state and unstable state respectively; the default is STEADY. Required when CaptionSource selects `ANALYSIS `. When the output is WebVTT, only STEADY can be selected.
     */
    public String getStateEffectMode() {
        return this.StateEffectMode;
    }

    /**
     * Set There are two modes: STEADY and DYNAMIC, corresponding to steady state and unstable state respectively; the default is STEADY. Required when CaptionSource selects `ANALYSIS `. When the output is WebVTT, only STEADY can be selected.
     * @param StateEffectMode There are two modes: STEADY and DYNAMIC, corresponding to steady state and unstable state respectively; the default is STEADY. Required when CaptionSource selects `ANALYSIS `. When the output is WebVTT, only STEADY can be selected.
     */
    public void setStateEffectMode(String StateEffectMode) {
        this.StateEffectMode = StateEffectMode;
    }

    /**
     * Get Steady-state delay time, unit seconds; optional values: 10, 20, default 10. Required when CaptionSource selects `ANALYSIS `. 
     * @return SteadyStateDelayedTime Steady-state delay time, unit seconds; optional values: 10, 20, default 10. Required when CaptionSource selects `ANALYSIS `.
     */
    public Long getSteadyStateDelayedTime() {
        return this.SteadyStateDelayedTime;
    }

    /**
     * Set Steady-state delay time, unit seconds; optional values: 10, 20, default 10. Required when CaptionSource selects `ANALYSIS `.
     * @param SteadyStateDelayedTime Steady-state delay time, unit seconds; optional values: 10, 20, default 10. Required when CaptionSource selects `ANALYSIS `.
     */
    public void setSteadyStateDelayedTime(Long SteadyStateDelayedTime) {
        this.SteadyStateDelayedTime = SteadyStateDelayedTime;
    }

    /**
     * Get Audio selector name, required for generating WebVTT subtitles using speech recognition, can be empty. 
     * @return AudioSelectorName Audio selector name, required for generating WebVTT subtitles using speech recognition, can be empty.
     */
    public String getAudioSelectorName() {
        return this.AudioSelectorName;
    }

    /**
     * Set Audio selector name, required for generating WebVTT subtitles using speech recognition, can be empty.
     * @param AudioSelectorName Audio selector name, required for generating WebVTT subtitles using speech recognition, can be empty.
     */
    public void setAudioSelectorName(String AudioSelectorName) {
        this.AudioSelectorName = AudioSelectorName;
    }

    /**
     * Get Format configuration for speech recognition output on WebVTT. 
     * @return WebVTTFontStyle Format configuration for speech recognition output on WebVTT.
     */
    public WebVTTFontStyle getWebVTTFontStyle() {
        return this.WebVTTFontStyle;
    }

    /**
     * Set Format configuration for speech recognition output on WebVTT.
     * @param WebVTTFontStyle Format configuration for speech recognition output on WebVTT.
     */
    public void setWebVTTFontStyle(WebVTTFontStyle WebVTTFontStyle) {
        this.WebVTTFontStyle = WebVTTFontStyle;
    }

    /**
     * Get Language code, length 2-20. ISO 639-2 three-digit code is recommend. 
     * @return LanguageCode Language code, length 2-20. ISO 639-2 three-digit code is recommend.
     */
    public String getLanguageCode() {
        return this.LanguageCode;
    }

    /**
     * Set Language code, length 2-20. ISO 639-2 three-digit code is recommend.
     * @param LanguageCode Language code, length 2-20. ISO 639-2 three-digit code is recommend.
     */
    public void setLanguageCode(String LanguageCode) {
        this.LanguageCode = LanguageCode;
    }

    /**
     * Get Language description, less than 100 characters in length. 
     * @return LanguageDescription Language description, less than 100 characters in length.
     */
    public String getLanguageDescription() {
        return this.LanguageDescription;
    }

    /**
     * Set Language description, less than 100 characters in length.
     * @param LanguageDescription Language description, less than 100 characters in length.
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

