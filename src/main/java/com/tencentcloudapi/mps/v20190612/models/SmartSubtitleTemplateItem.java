/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Unique identifier of the smart subtitle template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Smart subtitle template name.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Smart subtitle template description.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ASR hotword lexicon parameter.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * Name of the hotword lexicon associated with the template.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AsrHotWordsLibraryName")
    @Expose
    private String AsrHotWordsLibraryName;

    /**
    * Source language of the video with smart subtitles.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
zh-PY: Chinese-English-Cantonese
zh-medical: Medical Chinese
yue: Cantonese
vi: Vietnamese
ms: Malay
id: Indonesian
fli: Filipino
th: Thai
pt: Portuguese
tr: Turkish
ar: Arabic
es: Spanish
hi: Hindi
fr: French
de: German
zh-dialect: Chinese dialect
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * Smart subtitle file format.
vtt: WebVTT format
If this field is left blank, no subtitle file will be generated.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Smart subtitle language type.
0: source language1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF.The value can only be 1 or 2 when TranslateSwitch is set to ON.
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * Subtitle translation switch.
ON: enable translation
OFF: disable translation
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * Target language for subtitle translation.
This field takes effect when TranslateSwitch is set to ON.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Indonesian
ms: Malay
th: Thai
ar: Arabic
hi: Hindi
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * Template creation time in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time of the template in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Alias of the preset smart subtitle template.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
     * Get Unique identifier of the smart subtitle template. 
     * @return Definition Unique identifier of the smart subtitle template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the smart subtitle template.
     * @param Definition Unique identifier of the smart subtitle template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Smart subtitle template name.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Smart subtitle template name.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Smart subtitle template name.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Name Smart subtitle template name.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Smart subtitle template description.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Comment Smart subtitle template description.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Smart subtitle template description.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Comment Smart subtitle template description.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type Template type. Valid values:
* Preset: system preset template
* Custom: user-defined template
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ASR hotword lexicon parameter.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AsrHotWordsConfigure ASR hotword lexicon parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set ASR hotword lexicon parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AsrHotWordsConfigure ASR hotword lexicon parameter.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get Name of the hotword lexicon associated with the template.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AsrHotWordsLibraryName Name of the hotword lexicon associated with the template.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAsrHotWordsLibraryName() {
        return this.AsrHotWordsLibraryName;
    }

    /**
     * Set Name of the hotword lexicon associated with the template.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AsrHotWordsLibraryName Name of the hotword lexicon associated with the template.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAsrHotWordsLibraryName(String AsrHotWordsLibraryName) {
        this.AsrHotWordsLibraryName = AsrHotWordsLibraryName;
    }

    /**
     * Get Source language of the video with smart subtitles.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
zh-PY: Chinese-English-Cantonese
zh-medical: Medical Chinese
yue: Cantonese
vi: Vietnamese
ms: Malay
id: Indonesian
fli: Filipino
th: Thai
pt: Portuguese
tr: Turkish
ar: Arabic
es: Spanish
hi: Hindi
fr: French
de: German
zh-dialect: Chinese dialect 
     * @return VideoSrcLanguage Source language of the video with smart subtitles.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
zh-PY: Chinese-English-Cantonese
zh-medical: Medical Chinese
yue: Cantonese
vi: Vietnamese
ms: Malay
id: Indonesian
fli: Filipino
th: Thai
pt: Portuguese
tr: Turkish
ar: Arabic
es: Spanish
hi: Hindi
fr: French
de: German
zh-dialect: Chinese dialect
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set Source language of the video with smart subtitles.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
zh-PY: Chinese-English-Cantonese
zh-medical: Medical Chinese
yue: Cantonese
vi: Vietnamese
ms: Malay
id: Indonesian
fli: Filipino
th: Thai
pt: Portuguese
tr: Turkish
ar: Arabic
es: Spanish
hi: Hindi
fr: French
de: German
zh-dialect: Chinese dialect
     * @param VideoSrcLanguage Source language of the video with smart subtitles.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
zh-PY: Chinese-English-Cantonese
zh-medical: Medical Chinese
yue: Cantonese
vi: Vietnamese
ms: Malay
id: Indonesian
fli: Filipino
th: Thai
pt: Portuguese
tr: Turkish
ar: Arabic
es: Spanish
hi: Hindi
fr: French
de: German
zh-dialect: Chinese dialect
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get Smart subtitle file format.
vtt: WebVTT format
If this field is left blank, no subtitle file will be generated.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubtitleFormat Smart subtitle file format.
vtt: WebVTT format
If this field is left blank, no subtitle file will be generated.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Smart subtitle file format.
vtt: WebVTT format
If this field is left blank, no subtitle file will be generated.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubtitleFormat Smart subtitle file format.
vtt: WebVTT format
If this field is left blank, no subtitle file will be generated.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Smart subtitle language type.
0: source language1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF.The value can only be 1 or 2 when TranslateSwitch is set to ON. 
     * @return SubtitleType Smart subtitle language type.
0: source language1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF.The value can only be 1 or 2 when TranslateSwitch is set to ON.
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set Smart subtitle language type.
0: source language1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF.The value can only be 1 or 2 when TranslateSwitch is set to ON.
     * @param SubtitleType Smart subtitle language type.
0: source language1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF.The value can only be 1 or 2 when TranslateSwitch is set to ON.
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get Subtitle translation switch.
ON: enable translation
OFF: disable translation
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TranslateSwitch Subtitle translation switch.
ON: enable translation
OFF: disable translation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set Subtitle translation switch.
ON: enable translation
OFF: disable translation
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TranslateSwitch Subtitle translation switch.
ON: enable translation
OFF: disable translation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get Target language for subtitle translation.
This field takes effect when TranslateSwitch is set to ON.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Indonesian
ms: Malay
th: Thai
ar: Arabic
hi: Hindi
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TranslateDstLanguage Target language for subtitle translation.
This field takes effect when TranslateSwitch is set to ON.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Indonesian
ms: Malay
th: Thai
ar: Arabic
hi: Hindi
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set Target language for subtitle translation.
This field takes effect when TranslateSwitch is set to ON.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Indonesian
ms: Malay
th: Thai
ar: Arabic
hi: Hindi
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TranslateDstLanguage Target language for subtitle translation.
This field takes effect when TranslateSwitch is set to ON.
Supported languages:
zh: Simplified Chinese
en: English
ja: Japanese
ko: Korean
fr: French
es: Spanish
it: Italian
de: German
tr: Turkish
ru: Russian
pt: Portuguese
vi: Vietnamese
id: Indonesian
ms: Malay
th: Thai
ar: Arabic
hi: Hindi
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get Template creation time in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return CreateTime Template creation time in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param CreateTime Template creation time in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time of the template in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return UpdateTime Last modification time of the template in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time of the template in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param UpdateTime Last modification time of the template in [ISO datetime format](https://intl.cloud.tencent.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Alias of the preset smart subtitle template.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AliasName Alias of the preset smart subtitle template.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Alias of the preset smart subtitle template.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AliasName Alias of the preset smart subtitle template.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
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

    }
}

