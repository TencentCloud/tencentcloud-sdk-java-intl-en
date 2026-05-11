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

public class SmartSubtitleTemplateItem extends AbstractModel {

    /**
    * <p>Unique identifier of the smart subtitle template.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Smart subtitle template name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Smart subtitle template description.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Template type. Valid values:</p><ul><li>Preset: preset template.</li><li>Custom: custom template.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>ASR hotword lexicon parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * <p>Name of the hotword lexicon associated with the template.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrHotWordsLibraryName")
    @Expose
    private String AsrHotWordsLibraryName;

    /**
    * <p>Video source language list for smart subtitle:</p><p><code>zh</code>: Simplified Chinese<br><code>yue</code>: Cantonese<br><code>zh-PY</code>: Chinese, English, and Cantonese<br><code>zh_medical</code>: Chinese healthcare<br><code>zh_dialect</code>: Chinese dialect<br><code>prime_zh</code>: Chinese and English dialects<br><code>zh_en</code>: Chinese and English<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino<br><code>auto</code>: Automatic identification (only supported for subtitle translation)</p>
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * <p>Smart subtitle file format.</p><ul><li>vtt: WebVTT.</li><li>srt: SRT.</li><li>original: same as the source subtitle file (for subtitle translation templates).</li><li>Not specified or empty: no subtitle file generated.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p>
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * <p>Subtitle translation switch.<br>ON: enables translation.<br>OFF: disables translation.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * <p>Target language for subtitle translation.<br>This parameter takes effect when TranslateSwitch is ON.<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Preset template alias for smart subtitle.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * <p>Subtitle processing type:</p><ul><li>0: ASR.</li><li>1: subtitle translation.</li><li>2: OCR.</li></ul>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * <p>Area configurations for the subtitle OCR extraction box.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
    * <p>Subtitle burn-in template ID.</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p>
    */
    @SerializedName("SpeakerMode")
    @Expose
    private Long SpeakerMode;

    /**
    * <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p>
    */
    @SerializedName("SpeakerLabel")
    @Expose
    private Long SpeakerLabel;

    /**
     * Get <p>Unique identifier of the smart subtitle template.</p> 
     * @return Definition <p>Unique identifier of the smart subtitle template.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Unique identifier of the smart subtitle template.</p>
     * @param Definition <p>Unique identifier of the smart subtitle template.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Smart subtitle template name.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name <p>Smart subtitle template name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Smart subtitle template name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name <p>Smart subtitle template name.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Smart subtitle template description.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Comment <p>Smart subtitle template description.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Smart subtitle template description.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Comment <p>Smart subtitle template description.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Template type. Valid values:</p><ul><li>Preset: preset template.</li><li>Custom: custom template.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type <p>Template type. Valid values:</p><ul><li>Preset: preset template.</li><li>Custom: custom template.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Template type. Valid values:</p><ul><li>Preset: preset template.</li><li>Custom: custom template.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type <p>Template type. Valid values:</p><ul><li>Preset: preset template.</li><li>Custom: custom template.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>ASR hotword lexicon parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AsrHotWordsConfigure <p>ASR hotword lexicon parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set <p>ASR hotword lexicon parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AsrHotWordsConfigure <p>ASR hotword lexicon parameters.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get <p>Name of the hotword lexicon associated with the template.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AsrHotWordsLibraryName <p>Name of the hotword lexicon associated with the template.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAsrHotWordsLibraryName() {
        return this.AsrHotWordsLibraryName;
    }

    /**
     * Set <p>Name of the hotword lexicon associated with the template.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AsrHotWordsLibraryName <p>Name of the hotword lexicon associated with the template.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrHotWordsLibraryName(String AsrHotWordsLibraryName) {
        this.AsrHotWordsLibraryName = AsrHotWordsLibraryName;
    }

    /**
     * Get <p>Video source language list for smart subtitle:</p><p><code>zh</code>: Simplified Chinese<br><code>yue</code>: Cantonese<br><code>zh-PY</code>: Chinese, English, and Cantonese<br><code>zh_medical</code>: Chinese healthcare<br><code>zh_dialect</code>: Chinese dialect<br><code>prime_zh</code>: Chinese and English dialects<br><code>zh_en</code>: Chinese and English<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino<br><code>auto</code>: Automatic identification (only supported for subtitle translation)</p> 
     * @return VideoSrcLanguage <p>Video source language list for smart subtitle:</p><p><code>zh</code>: Simplified Chinese<br><code>yue</code>: Cantonese<br><code>zh-PY</code>: Chinese, English, and Cantonese<br><code>zh_medical</code>: Chinese healthcare<br><code>zh_dialect</code>: Chinese dialect<br><code>prime_zh</code>: Chinese and English dialects<br><code>zh_en</code>: Chinese and English<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino<br><code>auto</code>: Automatic identification (only supported for subtitle translation)</p>
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>Video source language list for smart subtitle:</p><p><code>zh</code>: Simplified Chinese<br><code>yue</code>: Cantonese<br><code>zh-PY</code>: Chinese, English, and Cantonese<br><code>zh_medical</code>: Chinese healthcare<br><code>zh_dialect</code>: Chinese dialect<br><code>prime_zh</code>: Chinese and English dialects<br><code>zh_en</code>: Chinese and English<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino<br><code>auto</code>: Automatic identification (only supported for subtitle translation)</p>
     * @param VideoSrcLanguage <p>Video source language list for smart subtitle:</p><p><code>zh</code>: Simplified Chinese<br><code>yue</code>: Cantonese<br><code>zh-PY</code>: Chinese, English, and Cantonese<br><code>zh_medical</code>: Chinese healthcare<br><code>zh_dialect</code>: Chinese dialect<br><code>prime_zh</code>: Chinese and English dialects<br><code>zh_en</code>: Chinese and English<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino<br><code>auto</code>: Automatic identification (only supported for subtitle translation)</p>
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get <p>Smart subtitle file format.</p><ul><li>vtt: WebVTT.</li><li>srt: SRT.</li><li>original: same as the source subtitle file (for subtitle translation templates).</li><li>Not specified or empty: no subtitle file generated.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubtitleFormat <p>Smart subtitle file format.</p><ul><li>vtt: WebVTT.</li><li>srt: SRT.</li><li>original: same as the source subtitle file (for subtitle translation templates).</li><li>Not specified or empty: no subtitle file generated.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>Smart subtitle file format.</p><ul><li>vtt: WebVTT.</li><li>srt: SRT.</li><li>original: same as the source subtitle file (for subtitle translation templates).</li><li>Not specified or empty: no subtitle file generated.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubtitleFormat <p>Smart subtitle file format.</p><ul><li>vtt: WebVTT.</li><li>srt: SRT.</li><li>original: same as the source subtitle file (for subtitle translation templates).</li><li>Not specified or empty: no subtitle file generated.</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p> 
     * @return SubtitleType <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p>
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p>
     * @param SubtitleType <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p>
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get <p>Subtitle translation switch.<br>ON: enables translation.<br>OFF: disables translation.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranslateSwitch <p>Subtitle translation switch.<br>ON: enables translation.<br>OFF: disables translation.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set <p>Subtitle translation switch.<br>ON: enables translation.<br>OFF: disables translation.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranslateSwitch <p>Subtitle translation switch.<br>ON: enables translation.<br>OFF: disables translation.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get <p>Target language for subtitle translation.<br>This parameter takes effect when TranslateSwitch is ON.<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranslateDstLanguage <p>Target language for subtitle translation.<br>This parameter takes effect when TranslateSwitch is ON.<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set <p>Target language for subtitle translation.<br>This parameter takes effect when TranslateSwitch is ON.<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranslateDstLanguage <p>Target language for subtitle translation.<br>This parameter takes effect when TranslateSwitch is ON.<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>fr</code>: French<br><code>es</code>: Spanish<br><code>it</code>: Italian<br><code>de</code>: German<br><code>tr</code>: Turkish<br><code>ru</code>: Russian<br><code>pt</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>vi</code>: Vietnamese<br><code>id</code>: Indonesian<br><code>ms</code>: Malay<br><code>th</code>: Thai<br><code>ar</code>: Arabic<br><code>hi</code>: Hindi<br><code>fil</code>: Filipino</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p> 
     * @return CreateTime <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p>
     * @param CreateTime <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p> 
     * @return UpdateTime <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p>
     * @param UpdateTime <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52">ISO date format</a>.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Preset template alias for smart subtitle.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AliasName <p>Preset template alias for smart subtitle.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set <p>Preset template alias for smart subtitle.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AliasName <p>Preset template alias for smart subtitle.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get <p>Subtitle processing type:</p><ul><li>0: ASR.</li><li>1: subtitle translation.</li><li>2: OCR.</li></ul> 
     * @return ProcessType <p>Subtitle processing type:</p><ul><li>0: ASR.</li><li>1: subtitle translation.</li><li>2: OCR.</li></ul>
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>Subtitle processing type:</p><ul><li>0: ASR.</li><li>1: subtitle translation.</li><li>2: OCR.</li></ul>
     * @param ProcessType <p>Subtitle processing type:</p><ul><li>0: ASR.</li><li>1: subtitle translation.</li><li>2: OCR.</li></ul>
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>Area configurations for the subtitle OCR extraction box.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SelectingSubtitleAreasConfig <p>Area configurations for the subtitle OCR extraction box.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set <p>Area configurations for the subtitle OCR extraction box.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SelectingSubtitleAreasConfig <p>Area configurations for the subtitle OCR extraction box.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    /**
     * Get <p>Subtitle burn-in template ID.</p> 
     * @return SubtitleEmbedId <p>Subtitle burn-in template ID.</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>Subtitle burn-in template ID.</p>
     * @param SubtitleEmbedId <p>Subtitle burn-in template ID.</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p> 
     * @return SpeakerMode <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p>
     */
    public Long getSpeakerMode() {
        return this.SpeakerMode;
    }

    /**
     * Set <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p>
     * @param SpeakerMode <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p>
     */
    public void setSpeakerMode(Long SpeakerMode) {
        this.SpeakerMode = SpeakerMode;
    }

    /**
     * Get <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p> 
     * @return SpeakerLabel <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p>
     */
    public Long getSpeakerLabel() {
        return this.SpeakerLabel;
    }

    /**
     * Set <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p>
     * @param SpeakerLabel <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p>
     */
    public void setSpeakerLabel(Long SpeakerLabel) {
        this.SpeakerLabel = SpeakerLabel;
    }

    public SmartSubtitleTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTemplateItem(SmartSubtitleTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.AsrHotWordsLibraryName != null) {
            this.AsrHotWordsLibraryName = new String(source.AsrHotWordsLibraryName);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
        if (source.SelectingSubtitleAreasConfig != null) {
            this.SelectingSubtitleAreasConfig = new SelectingSubtitleAreasConfig(source.SelectingSubtitleAreasConfig);
        }
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
        }
        if (source.SpeakerMode != null) {
            this.SpeakerMode = new Long(source.SpeakerMode);
        }
        if (source.SpeakerLabel != null) {
            this.SpeakerLabel = new Long(source.SpeakerLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "AsrHotWordsLibraryName", this.AsrHotWordsLibraryName);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "SpeakerMode", this.SpeakerMode);
        this.setParamSimple(map, prefix + "SpeakerLabel", this.SpeakerLabel);

    }
}

