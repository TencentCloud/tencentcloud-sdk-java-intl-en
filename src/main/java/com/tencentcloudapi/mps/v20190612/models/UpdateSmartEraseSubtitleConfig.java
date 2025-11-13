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

public class UpdateSmartEraseSubtitleConfig extends AbstractModel {

    /**
    * Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When automatic erasing is used, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
- auto: automatic erasing.
- custom: specified area erasing.

    */
    @SerializedName("SubtitleEraseMethod")
    @Expose
    private String SubtitleEraseMethod;

    /**
    * Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, you are recommended to select this edition to ensure better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition.
    */
    @SerializedName("SubtitleModel")
    @Expose
    private String SubtitleModel;

    /**
    * Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When OCR subtitle extraction is enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased.
- ON: enabled.
-OFF: disabled.
    */
    @SerializedName("OcrSwitch")
    @Expose
    private String OcrSwitch;

    /**
    * Subtitle language, which is used to guide OCR recognition. The default value is zh_en. This parameter is valid only when OcrSwitch is set to ON.
- zh_en: Chinese and English.
- multi: others.
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, India-Bengali, India-Gujarati, India-Kannada, India-Malayalam, India-Tamil, India-Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, and Tajik.

    */
    @SerializedName("SubtitleLang")
    @Expose
    private String SubtitleLang;

    /**
    * Subtitle file format. The default value is vtt. This parameter is valid only when OcrSwitch is set to ON.
- srt: SRT format.
- vtt: WebVTT format.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Whether to enable subtitle translation. The default value is OFF. This parameter is valid only when OcrSwitch is set to ON.
- ON: enabled.
- OFF: disabled.
    */
    @SerializedName("TransSwitch")
    @Expose
    private String TransSwitch;

    /**
    * Target language for Subtitle translation. The default value is en. This parameter is valid only when TransSwitch is set to ON.
Currently, the following languages are supported:
zh: Simplified Chinese.
en: English.
ja: Japanese.
ko: Korean.
fr: French.
es: Spanish.
it: Italian.
de: German.
tr: Turkish.
ru: Russian.
pt: Portuguese.
vi: Vietnamese.
id: Indonesian.
ms: Malay.
th: Thai.
ar: Arabic.
hi: Hindi.
    */
    @SerializedName("TransDstLang")
    @Expose
    private String TransDstLang;

    /**
    * Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
    */
    @SerializedName("AutoAreas")
    @Expose
    private EraseArea [] AutoAreas;

    /**
    * Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
    */
    @SerializedName("CustomAreas")
    @Expose
    private EraseTimeArea [] CustomAreas;

    /**
     * Get Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When automatic erasing is used, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
- auto: automatic erasing.
- custom: specified area erasing.
 
     * @return SubtitleEraseMethod Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When automatic erasing is used, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
- auto: automatic erasing.
- custom: specified area erasing.

     */
    public String getSubtitleEraseMethod() {
        return this.SubtitleEraseMethod;
    }

    /**
     * Set Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When automatic erasing is used, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
- auto: automatic erasing.
- custom: specified area erasing.

     * @param SubtitleEraseMethod Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When automatic erasing is used, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
- auto: automatic erasing.
- custom: specified area erasing.

     */
    public void setSubtitleEraseMethod(String SubtitleEraseMethod) {
        this.SubtitleEraseMethod = SubtitleEraseMethod;
    }

    /**
     * Get Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, you are recommended to select this edition to ensure better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition. 
     * @return SubtitleModel Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, you are recommended to select this edition to ensure better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition.
     */
    public String getSubtitleModel() {
        return this.SubtitleModel;
    }

    /**
     * Set Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, you are recommended to select this edition to ensure better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition.
     * @param SubtitleModel Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, you are recommended to select this edition to ensure better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition.
     */
    public void setSubtitleModel(String SubtitleModel) {
        this.SubtitleModel = SubtitleModel;
    }

    /**
     * Get Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When OCR subtitle extraction is enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased.
- ON: enabled.
-OFF: disabled. 
     * @return OcrSwitch Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When OCR subtitle extraction is enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased.
- ON: enabled.
-OFF: disabled.
     */
    public String getOcrSwitch() {
        return this.OcrSwitch;
    }

    /**
     * Set Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When OCR subtitle extraction is enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased.
- ON: enabled.
-OFF: disabled.
     * @param OcrSwitch Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When OCR subtitle extraction is enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased.
- ON: enabled.
-OFF: disabled.
     */
    public void setOcrSwitch(String OcrSwitch) {
        this.OcrSwitch = OcrSwitch;
    }

    /**
     * Get Subtitle language, which is used to guide OCR recognition. The default value is zh_en. This parameter is valid only when OcrSwitch is set to ON.
- zh_en: Chinese and English.
- multi: others.
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, India-Bengali, India-Gujarati, India-Kannada, India-Malayalam, India-Tamil, India-Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, and Tajik.
 
     * @return SubtitleLang Subtitle language, which is used to guide OCR recognition. The default value is zh_en. This parameter is valid only when OcrSwitch is set to ON.
- zh_en: Chinese and English.
- multi: others.
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, India-Bengali, India-Gujarati, India-Kannada, India-Malayalam, India-Tamil, India-Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, and Tajik.

     */
    public String getSubtitleLang() {
        return this.SubtitleLang;
    }

    /**
     * Set Subtitle language, which is used to guide OCR recognition. The default value is zh_en. This parameter is valid only when OcrSwitch is set to ON.
- zh_en: Chinese and English.
- multi: others.
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, India-Bengali, India-Gujarati, India-Kannada, India-Malayalam, India-Tamil, India-Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, and Tajik.

     * @param SubtitleLang Subtitle language, which is used to guide OCR recognition. The default value is zh_en. This parameter is valid only when OcrSwitch is set to ON.
- zh_en: Chinese and English.
- multi: others.
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, India-Bengali, India-Gujarati, India-Kannada, India-Malayalam, India-Tamil, India-Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, and Tajik.

     */
    public void setSubtitleLang(String SubtitleLang) {
        this.SubtitleLang = SubtitleLang;
    }

    /**
     * Get Subtitle file format. The default value is vtt. This parameter is valid only when OcrSwitch is set to ON.
- srt: SRT format.
- vtt: WebVTT format. 
     * @return SubtitleFormat Subtitle file format. The default value is vtt. This parameter is valid only when OcrSwitch is set to ON.
- srt: SRT format.
- vtt: WebVTT format.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Subtitle file format. The default value is vtt. This parameter is valid only when OcrSwitch is set to ON.
- srt: SRT format.
- vtt: WebVTT format.
     * @param SubtitleFormat Subtitle file format. The default value is vtt. This parameter is valid only when OcrSwitch is set to ON.
- srt: SRT format.
- vtt: WebVTT format.
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Whether to enable subtitle translation. The default value is OFF. This parameter is valid only when OcrSwitch is set to ON.
- ON: enabled.
- OFF: disabled. 
     * @return TransSwitch Whether to enable subtitle translation. The default value is OFF. This parameter is valid only when OcrSwitch is set to ON.
- ON: enabled.
- OFF: disabled.
     */
    public String getTransSwitch() {
        return this.TransSwitch;
    }

    /**
     * Set Whether to enable subtitle translation. The default value is OFF. This parameter is valid only when OcrSwitch is set to ON.
- ON: enabled.
- OFF: disabled.
     * @param TransSwitch Whether to enable subtitle translation. The default value is OFF. This parameter is valid only when OcrSwitch is set to ON.
- ON: enabled.
- OFF: disabled.
     */
    public void setTransSwitch(String TransSwitch) {
        this.TransSwitch = TransSwitch;
    }

    /**
     * Get Target language for Subtitle translation. The default value is en. This parameter is valid only when TransSwitch is set to ON.
Currently, the following languages are supported:
zh: Simplified Chinese.
en: English.
ja: Japanese.
ko: Korean.
fr: French.
es: Spanish.
it: Italian.
de: German.
tr: Turkish.
ru: Russian.
pt: Portuguese.
vi: Vietnamese.
id: Indonesian.
ms: Malay.
th: Thai.
ar: Arabic.
hi: Hindi. 
     * @return TransDstLang Target language for Subtitle translation. The default value is en. This parameter is valid only when TransSwitch is set to ON.
Currently, the following languages are supported:
zh: Simplified Chinese.
en: English.
ja: Japanese.
ko: Korean.
fr: French.
es: Spanish.
it: Italian.
de: German.
tr: Turkish.
ru: Russian.
pt: Portuguese.
vi: Vietnamese.
id: Indonesian.
ms: Malay.
th: Thai.
ar: Arabic.
hi: Hindi.
     */
    public String getTransDstLang() {
        return this.TransDstLang;
    }

    /**
     * Set Target language for Subtitle translation. The default value is en. This parameter is valid only when TransSwitch is set to ON.
Currently, the following languages are supported:
zh: Simplified Chinese.
en: English.
ja: Japanese.
ko: Korean.
fr: French.
es: Spanish.
it: Italian.
de: German.
tr: Turkish.
ru: Russian.
pt: Portuguese.
vi: Vietnamese.
id: Indonesian.
ms: Malay.
th: Thai.
ar: Arabic.
hi: Hindi.
     * @param TransDstLang Target language for Subtitle translation. The default value is en. This parameter is valid only when TransSwitch is set to ON.
Currently, the following languages are supported:
zh: Simplified Chinese.
en: English.
ja: Japanese.
ko: Korean.
fr: French.
es: Spanish.
it: Italian.
de: German.
tr: Turkish.
ru: Russian.
pt: Portuguese.
vi: Vietnamese.
id: Indonesian.
ms: Malay.
th: Thai.
ar: Arabic.
hi: Hindi.
     */
    public void setTransDstLang(String TransDstLang) {
        this.TransDstLang = TransDstLang;
    }

    /**
     * Get Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged. 
     * @return AutoAreas Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public EraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     * @param AutoAreas Custom area for automatic erasing.
For the specified area, AI models are used to automatically detect and erase the target objects.
Note: When the erasing method is set to custom, this parameter is invalid. When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public void setAutoAreas(EraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged. 
     * @return CustomAreas Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public EraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     * @param CustomAreas Custom area for specified area erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public void setCustomAreas(EraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public UpdateSmartEraseSubtitleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSmartEraseSubtitleConfig(UpdateSmartEraseSubtitleConfig source) {
        if (source.SubtitleEraseMethod != null) {
            this.SubtitleEraseMethod = new String(source.SubtitleEraseMethod);
        }
        if (source.SubtitleModel != null) {
            this.SubtitleModel = new String(source.SubtitleModel);
        }
        if (source.OcrSwitch != null) {
            this.OcrSwitch = new String(source.OcrSwitch);
        }
        if (source.SubtitleLang != null) {
            this.SubtitleLang = new String(source.SubtitleLang);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.TransSwitch != null) {
            this.TransSwitch = new String(source.TransSwitch);
        }
        if (source.TransDstLang != null) {
            this.TransDstLang = new String(source.TransDstLang);
        }
        if (source.AutoAreas != null) {
            this.AutoAreas = new EraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new EraseArea(source.AutoAreas[i]);
            }
        }
        if (source.CustomAreas != null) {
            this.CustomAreas = new EraseTimeArea[source.CustomAreas.length];
            for (int i = 0; i < source.CustomAreas.length; i++) {
                this.CustomAreas[i] = new EraseTimeArea(source.CustomAreas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleEraseMethod", this.SubtitleEraseMethod);
        this.setParamSimple(map, prefix + "SubtitleModel", this.SubtitleModel);
        this.setParamSimple(map, prefix + "OcrSwitch", this.OcrSwitch);
        this.setParamSimple(map, prefix + "SubtitleLang", this.SubtitleLang);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "TransSwitch", this.TransSwitch);
        this.setParamSimple(map, prefix + "TransDstLang", this.TransDstLang);
        this.setParamArrayObj(map, prefix + "AutoAreas.", this.AutoAreas);
        this.setParamArrayObj(map, prefix + "CustomAreas.", this.CustomAreas);

    }
}

