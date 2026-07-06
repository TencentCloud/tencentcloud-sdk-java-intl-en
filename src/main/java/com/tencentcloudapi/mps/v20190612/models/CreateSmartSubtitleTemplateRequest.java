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

public class CreateSmartSubtitleTemplateRequest extends AbstractModel {

    /**
    * <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Smart subtitling video source language.</p><p>For ASR and subtitle translation parameter values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Languages</a>.</p><p>The following lists some commonly used values:</p><p><code>auto</code>: automatic identification. <code>zh</code>: Simplified Chinese. <code>en</code>: English. <code>ja</code>: Japanese. <code>ko</code>: Korean. <code>zh-PY</code>: Chinese, English, and Cantonese. <code>zh_medical</code>: Chinese health care. <code>vi</code>: Vietnamese. <code>ms</code>: Malay. <code>id</code>: Indonesian. <code>fil</code>: Filipino. <code>th</code>: Thai. <code>pt</code>: Portuguese. <code>tr</code>: Turkish. <code>ar</code>: Arabic. <code>es</code>: Spanish. <code>hi</code>: Hindi. <code>fr</code>: French. <code>de</code>: German. <code>it</code>: Italian. <code>zh_dialect</code>: Chinese dialect. <code>zh_en</code>: Chinese and English. <code>yue</code>: Cantonese. <code>ru</code>: Russian. <code>prime_zh</code>: Chinese and English dialects.</p><p>OCR only supports the following values:</p><p><code>zh_en</code>: Chinese and English<br><code>multi</code>: others</p><p>For languages supported by different values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Languages</a></p>
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p>
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * <p>Intelligent caption template description information<br>Length limit: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>ASR hot word lexicon parameter</p>
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p>
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * <p>This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:</p><p>For ASR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Translation Languages</a>.<br>For OCR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Translation Languages</a>.</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p><p>Examples of some commonly used languages:</p><p><code>ar</code>: Arabic<br><code>en</code>: English<br><code>fr</code>: French<br><code>it</code>: Italian<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>ru</code>: Russian<br><code>th</code>: Thai<br><code>tr</code>: Turkish<br><code>vi</code>: Vietnamese<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese</p>
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * <p>Area configurations for the subtitle OCR extraction box</p>
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
    * <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p>
    */
    @SerializedName("SpeakerMode")
    @Expose
    private Long SpeakerMode;

    /**
    * <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p>
    */
    @SerializedName("SpeakerLabel")
    @Expose
    private Long SpeakerLabel;

    /**
     * Get <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p> 
     * @return Name <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p>
     * @param Name <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Smart subtitling video source language.</p><p>For ASR and subtitle translation parameter values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Languages</a>.</p><p>The following lists some commonly used values:</p><p><code>auto</code>: automatic identification. <code>zh</code>: Simplified Chinese. <code>en</code>: English. <code>ja</code>: Japanese. <code>ko</code>: Korean. <code>zh-PY</code>: Chinese, English, and Cantonese. <code>zh_medical</code>: Chinese health care. <code>vi</code>: Vietnamese. <code>ms</code>: Malay. <code>id</code>: Indonesian. <code>fil</code>: Filipino. <code>th</code>: Thai. <code>pt</code>: Portuguese. <code>tr</code>: Turkish. <code>ar</code>: Arabic. <code>es</code>: Spanish. <code>hi</code>: Hindi. <code>fr</code>: French. <code>de</code>: German. <code>it</code>: Italian. <code>zh_dialect</code>: Chinese dialect. <code>zh_en</code>: Chinese and English. <code>yue</code>: Cantonese. <code>ru</code>: Russian. <code>prime_zh</code>: Chinese and English dialects.</p><p>OCR only supports the following values:</p><p><code>zh_en</code>: Chinese and English<br><code>multi</code>: others</p><p>For languages supported by different values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Languages</a></p> 
     * @return VideoSrcLanguage <p>Smart subtitling video source language.</p><p>For ASR and subtitle translation parameter values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Languages</a>.</p><p>The following lists some commonly used values:</p><p><code>auto</code>: automatic identification. <code>zh</code>: Simplified Chinese. <code>en</code>: English. <code>ja</code>: Japanese. <code>ko</code>: Korean. <code>zh-PY</code>: Chinese, English, and Cantonese. <code>zh_medical</code>: Chinese health care. <code>vi</code>: Vietnamese. <code>ms</code>: Malay. <code>id</code>: Indonesian. <code>fil</code>: Filipino. <code>th</code>: Thai. <code>pt</code>: Portuguese. <code>tr</code>: Turkish. <code>ar</code>: Arabic. <code>es</code>: Spanish. <code>hi</code>: Hindi. <code>fr</code>: French. <code>de</code>: German. <code>it</code>: Italian. <code>zh_dialect</code>: Chinese dialect. <code>zh_en</code>: Chinese and English. <code>yue</code>: Cantonese. <code>ru</code>: Russian. <code>prime_zh</code>: Chinese and English dialects.</p><p>OCR only supports the following values:</p><p><code>zh_en</code>: Chinese and English<br><code>multi</code>: others</p><p>For languages supported by different values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Languages</a></p>
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>Smart subtitling video source language.</p><p>For ASR and subtitle translation parameter values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Languages</a>.</p><p>The following lists some commonly used values:</p><p><code>auto</code>: automatic identification. <code>zh</code>: Simplified Chinese. <code>en</code>: English. <code>ja</code>: Japanese. <code>ko</code>: Korean. <code>zh-PY</code>: Chinese, English, and Cantonese. <code>zh_medical</code>: Chinese health care. <code>vi</code>: Vietnamese. <code>ms</code>: Malay. <code>id</code>: Indonesian. <code>fil</code>: Filipino. <code>th</code>: Thai. <code>pt</code>: Portuguese. <code>tr</code>: Turkish. <code>ar</code>: Arabic. <code>es</code>: Spanish. <code>hi</code>: Hindi. <code>fr</code>: French. <code>de</code>: German. <code>it</code>: Italian. <code>zh_dialect</code>: Chinese dialect. <code>zh_en</code>: Chinese and English. <code>yue</code>: Cantonese. <code>ru</code>: Russian. <code>prime_zh</code>: Chinese and English dialects.</p><p>OCR only supports the following values:</p><p><code>zh_en</code>: Chinese and English<br><code>multi</code>: others</p><p>For languages supported by different values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Languages</a></p>
     * @param VideoSrcLanguage <p>Smart subtitling video source language.</p><p>For ASR and subtitle translation parameter values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Languages</a>.</p><p>The following lists some commonly used values:</p><p><code>auto</code>: automatic identification. <code>zh</code>: Simplified Chinese. <code>en</code>: English. <code>ja</code>: Japanese. <code>ko</code>: Korean. <code>zh-PY</code>: Chinese, English, and Cantonese. <code>zh_medical</code>: Chinese health care. <code>vi</code>: Vietnamese. <code>ms</code>: Malay. <code>id</code>: Indonesian. <code>fil</code>: Filipino. <code>th</code>: Thai. <code>pt</code>: Portuguese. <code>tr</code>: Turkish. <code>ar</code>: Arabic. <code>es</code>: Spanish. <code>hi</code>: Hindi. <code>fr</code>: French. <code>de</code>: German. <code>it</code>: Italian. <code>zh_dialect</code>: Chinese dialect. <code>zh_en</code>: Chinese and English. <code>yue</code>: Cantonese. <code>ru</code>: Russian. <code>prime_zh</code>: Chinese and English dialects.</p><p>OCR only supports the following values:</p><p><code>zh_en</code>: Chinese and English<br><code>multi</code>: others</p><p>For languages supported by different values, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Languages</a></p>
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p> 
     * @return SubtitleType <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p>
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p>
     * @param SubtitleType <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p>
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get <p>Intelligent caption template description information<br>Length limit: 256 characters.</p> 
     * @return Comment <p>Intelligent caption template description information<br>Length limit: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Intelligent caption template description information<br>Length limit: 256 characters.</p>
     * @param Comment <p>Intelligent caption template description information<br>Length limit: 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul> 
     * @return SubtitleFormat <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul>
     * @param SubtitleFormat <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>ASR hot word lexicon parameter</p> 
     * @return AsrHotWordsConfigure <p>ASR hot word lexicon parameter</p>
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set <p>ASR hot word lexicon parameter</p>
     * @param AsrHotWordsConfigure <p>ASR hot word lexicon parameter</p>
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p> 
     * @return TranslateSwitch <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p>
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p>
     * @param TranslateSwitch <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p>
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get <p>This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:</p><p>For ASR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Translation Languages</a>.<br>For OCR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Translation Languages</a>.</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p><p>Examples of some commonly used languages:</p><p><code>ar</code>: Arabic<br><code>en</code>: English<br><code>fr</code>: French<br><code>it</code>: Italian<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>ru</code>: Russian<br><code>th</code>: Thai<br><code>tr</code>: Turkish<br><code>vi</code>: Vietnamese<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese</p> 
     * @return TranslateDstLanguage <p>This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:</p><p>For ASR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Translation Languages</a>.<br>For OCR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Translation Languages</a>.</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p><p>Examples of some commonly used languages:</p><p><code>ar</code>: Arabic<br><code>en</code>: English<br><code>fr</code>: French<br><code>it</code>: Italian<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>ru</code>: Russian<br><code>th</code>: Thai<br><code>tr</code>: Turkish<br><code>vi</code>: Vietnamese<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese</p>
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set <p>This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:</p><p>For ASR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Translation Languages</a>.<br>For OCR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Translation Languages</a>.</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p><p>Examples of some commonly used languages:</p><p><code>ar</code>: Arabic<br><code>en</code>: English<br><code>fr</code>: French<br><code>it</code>: Italian<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>ru</code>: Russian<br><code>th</code>: Thai<br><code>tr</code>: Turkish<br><code>vi</code>: Vietnamese<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese</p>
     * @param TranslateDstLanguage <p>This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:</p><p>For ASR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#ASRlanguages">ASR Translation Languages</a>.<br>For OCR extraction and translation, see <a href="https://www.tencentcloud.com/document/product/862/116243?from_cn_redirect=1#OCRlanguages">OCR Translation Languages</a>.</p><p><strong>Note</strong>: Use <code>/</code> to separate multiple languages, such as <code>en/ja</code>, which indicates English and Japanese.</p><p>Examples of some commonly used languages:</p><p><code>ar</code>: Arabic<br><code>en</code>: English<br><code>fr</code>: French<br><code>it</code>: Italian<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>ru</code>: Russian<br><code>th</code>: Thai<br><code>tr</code>: Turkish<br><code>vi</code>: Vietnamese<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese</p>
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p> 
     * @return ProcessType <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
     * @param ProcessType <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>Area configurations for the subtitle OCR extraction box</p> 
     * @return SelectingSubtitleAreasConfig <p>Area configurations for the subtitle OCR extraction box</p>
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set <p>Area configurations for the subtitle OCR extraction box</p>
     * @param SelectingSubtitleAreasConfig <p>Area configurations for the subtitle OCR extraction box</p>
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    /**
     * Get <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p> 
     * @return SubtitleEmbedId <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p>
     * @param SubtitleEmbedId <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p> 
     * @return SpeakerMode <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p>
     */
    public Long getSpeakerMode() {
        return this.SpeakerMode;
    }

    /**
     * Set <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p>
     * @param SpeakerMode <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p>
     */
    public void setSpeakerMode(Long SpeakerMode) {
        this.SpeakerMode = SpeakerMode;
    }

    /**
     * Get <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p> 
     * @return SpeakerLabel <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p>
     */
    public Long getSpeakerLabel() {
        return this.SpeakerLabel;
    }

    /**
     * Set <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p>
     * @param SpeakerLabel <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p>
     */
    public void setSpeakerLabel(Long SpeakerLabel) {
        this.SpeakerLabel = SpeakerLabel;
    }

    public CreateSmartSubtitleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSmartSubtitleTemplateRequest(CreateSmartSubtitleTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "SpeakerMode", this.SpeakerMode);
        this.setParamSimple(map, prefix + "SpeakerLabel", this.SpeakerLabel);

    }
}

