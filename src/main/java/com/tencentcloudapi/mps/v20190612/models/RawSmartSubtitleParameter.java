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
    * Source language of the video with smart subtitles.
Currently, the following languages are supported:
`zh`: Simplified Chinese.
`yue`: Cantonese.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`zh_dialect`: Chinese dialect.
`prime_zh`: Chinese, English, and Chinese dialects.
`zh_en`: Chinese and English.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
`auto`: automatic recognition (it is only supported in pure subtitle translation).
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     -vtt: WebVTT format subtitle.
     -srt: SRT format subtitle.
     - If this field is unspecified or left blank, no subtitle file will be generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation mode, this field cannot be unspecified or left blank.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * Target language for subtitle translation.
This field is valid when the value of TranslateSwitch is ON. List of translation languages:
`zh`: Simplified Chinese.
`zh-TW`: Traditional Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Subtitle processing type.
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
**Note**: The default processing type is ASR recognition subtitle if the field is unspecified.
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

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
     * Get Source language of the video with smart subtitles.
Currently, the following languages are supported:
`zh`: Simplified Chinese.
`yue`: Cantonese.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`zh_dialect`: Chinese dialect.
`prime_zh`: Chinese, English, and Chinese dialects.
`zh_en`: Chinese and English.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
`auto`: automatic recognition (it is only supported in pure subtitle translation). 
     * @return VideoSrcLanguage Source language of the video with smart subtitles.
Currently, the following languages are supported:
`zh`: Simplified Chinese.
`yue`: Cantonese.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`zh_dialect`: Chinese dialect.
`prime_zh`: Chinese, English, and Chinese dialects.
`zh_en`: Chinese and English.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
`auto`: automatic recognition (it is only supported in pure subtitle translation).
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set Source language of the video with smart subtitles.
Currently, the following languages are supported:
`zh`: Simplified Chinese.
`yue`: Cantonese.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`zh_dialect`: Chinese dialect.
`prime_zh`: Chinese, English, and Chinese dialects.
`zh_en`: Chinese and English.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
`auto`: automatic recognition (it is only supported in pure subtitle translation).
     * @param VideoSrcLanguage Source language of the video with smart subtitles.
Currently, the following languages are supported:
`zh`: Simplified Chinese.
`yue`: Cantonese.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`zh_dialect`: Chinese dialect.
`prime_zh`: Chinese, English, and Chinese dialects.
`zh_en`: Chinese and English.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
`auto`: automatic recognition (it is only supported in pure subtitle translation).
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     -vtt: WebVTT format subtitle.
     -srt: SRT format subtitle.
     - If this field is unspecified or left blank, no subtitle file will be generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation mode, this field cannot be unspecified or left blank.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubtitleFormat Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     -vtt: WebVTT format subtitle.
     -srt: SRT format subtitle.
     - If this field is unspecified or left blank, no subtitle file will be generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation mode, this field cannot be unspecified or left blank.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     -vtt: WebVTT format subtitle.
     -srt: SRT format subtitle.
     - If this field is unspecified or left blank, no subtitle file will be generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation mode, this field cannot be unspecified or left blank.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubtitleFormat Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     -vtt: WebVTT format subtitle.
     -srt: SRT format subtitle.
     - If this field is unspecified or left blank, no subtitle file will be generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation mode, this field cannot be unspecified or left blank.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranslateSwitch Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranslateSwitch Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get Target language for subtitle translation.
This field is valid when the value of TranslateSwitch is ON. List of translation languages:
`zh`: Simplified Chinese.
`zh-TW`: Traditional Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranslateDstLanguage Target language for subtitle translation.
This field is valid when the value of TranslateSwitch is ON. List of translation languages:
`zh`: Simplified Chinese.
`zh-TW`: Traditional Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set Target language for subtitle translation.
This field is valid when the value of TranslateSwitch is ON. List of translation languages:
`zh`: Simplified Chinese.
`zh-TW`: Traditional Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranslateDstLanguage Target language for subtitle translation.
This field is valid when the value of TranslateSwitch is ON. List of translation languages:
`zh`: Simplified Chinese.
`zh-TW`: Traditional Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`fr`: French.
`es`: Spanish.
`it`: Italian.
`de`: German.
`tr`: Turkish.
`ru`: Russian.
`pt`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`vi`: Vietnamese.
`id`: Indonesian.
`ms`: Malay.
`th`: Thai.
`ar`: Arabic.
`hi`: Hindi.
`fil`: Filipino.
**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
Note: This field may return null, indicating that no valid values can be obtained.
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

    /**
     * Get Subtitle processing type.
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
**Note**: The default processing type is ASR recognition subtitle if the field is unspecified. 
     * @return ProcessType Subtitle processing type.
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
**Note**: The default processing type is ASR recognition subtitle if the field is unspecified.
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set Subtitle processing type.
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
**Note**: The default processing type is ASR recognition subtitle if the field is unspecified.
     * @param ProcessType Subtitle processing type.
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
**Note**: The default processing type is ASR recognition subtitle if the field is unspecified.
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
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
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
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
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);

    }
}

