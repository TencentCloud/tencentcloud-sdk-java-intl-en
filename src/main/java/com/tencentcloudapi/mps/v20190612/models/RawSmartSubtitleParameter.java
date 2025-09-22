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

public class RawSmartSubtitleParameter extends AbstractModel {

    /**
    * Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON.
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * Video source language for intelligent caption.
Valid values: 
zh: Simplified Chinese.
en: Eenglish.
Ja: Japanese.
Ko: Korean.
zh-PY: Simplified Chinese, English and Cantonese.
zh-medical: Medical Chinese.
yue: Cantonese.
Vi: Vietnamese.
ms: Malay.
id: Indonesian.
fil: Filipino.
th: Thai.
pt: Portuguese.
tr: Turkish.
ar: Arabic.
es: Spanish.
hi: Hindi
Fr: French.
de: German.
zh-dialect: Chinese dialect
zh_en: Simplified Chinese and English
prime_zh: Simplified Chinese, Chinese Dialect and English.
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * Intelligent subtitle file format.
vtt: WebVTT format.
srt: SRT format.
If this field is left blank, no subtitle file will be generated.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

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
    * ASR hotword lexicon parameter.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * Custom parameter.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON. 
     * @return SubtitleType Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON.
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON.
     * @param SubtitleType Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON.
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get Video source language for intelligent caption.
Valid values: 
zh: Simplified Chinese.
en: Eenglish.
Ja: Japanese.
Ko: Korean.
zh-PY: Simplified Chinese, English and Cantonese.
zh-medical: Medical Chinese.
yue: Cantonese.
Vi: Vietnamese.
ms: Malay.
id: Indonesian.
fil: Filipino.
th: Thai.
pt: Portuguese.
tr: Turkish.
ar: Arabic.
es: Spanish.
hi: Hindi
Fr: French.
de: German.
zh-dialect: Chinese dialect
zh_en: Simplified Chinese and English
prime_zh: Simplified Chinese, Chinese Dialect and English. 
     * @return VideoSrcLanguage Video source language for intelligent caption.
Valid values: 
zh: Simplified Chinese.
en: Eenglish.
Ja: Japanese.
Ko: Korean.
zh-PY: Simplified Chinese, English and Cantonese.
zh-medical: Medical Chinese.
yue: Cantonese.
Vi: Vietnamese.
ms: Malay.
id: Indonesian.
fil: Filipino.
th: Thai.
pt: Portuguese.
tr: Turkish.
ar: Arabic.
es: Spanish.
hi: Hindi
Fr: French.
de: German.
zh-dialect: Chinese dialect
zh_en: Simplified Chinese and English
prime_zh: Simplified Chinese, Chinese Dialect and English.
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set Video source language for intelligent caption.
Valid values: 
zh: Simplified Chinese.
en: Eenglish.
Ja: Japanese.
Ko: Korean.
zh-PY: Simplified Chinese, English and Cantonese.
zh-medical: Medical Chinese.
yue: Cantonese.
Vi: Vietnamese.
ms: Malay.
id: Indonesian.
fil: Filipino.
th: Thai.
pt: Portuguese.
tr: Turkish.
ar: Arabic.
es: Spanish.
hi: Hindi
Fr: French.
de: German.
zh-dialect: Chinese dialect
zh_en: Simplified Chinese and English
prime_zh: Simplified Chinese, Chinese Dialect and English.
     * @param VideoSrcLanguage Video source language for intelligent caption.
Valid values: 
zh: Simplified Chinese.
en: Eenglish.
Ja: Japanese.
Ko: Korean.
zh-PY: Simplified Chinese, English and Cantonese.
zh-medical: Medical Chinese.
yue: Cantonese.
Vi: Vietnamese.
ms: Malay.
id: Indonesian.
fil: Filipino.
th: Thai.
pt: Portuguese.
tr: Turkish.
ar: Arabic.
es: Spanish.
hi: Hindi
Fr: French.
de: German.
zh-dialect: Chinese dialect
zh_en: Simplified Chinese and English
prime_zh: Simplified Chinese, Chinese Dialect and English.
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get Intelligent subtitle file format.
vtt: WebVTT format.
srt: SRT format.
If this field is left blank, no subtitle file will be generated. 
     * @return SubtitleFormat Intelligent subtitle file format.
vtt: WebVTT format.
srt: SRT format.
If this field is left blank, no subtitle file will be generated.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Intelligent subtitle file format.
vtt: WebVTT format.
srt: SRT format.
If this field is left blank, no subtitle file will be generated.
     * @param SubtitleFormat Intelligent subtitle file format.
vtt: WebVTT format.
srt: SRT format.
If this field is left blank, no subtitle file will be generated.
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
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
     * Get Custom parameter. 
     * @return ExtInfo Custom parameter.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Custom parameter.
     * @param ExtInfo Custom parameter.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public RawSmartSubtitleParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSmartSubtitleParameter(RawSmartSubtitleParameter source) {
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

