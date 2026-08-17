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
When using automatic erasing, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
-auto erasing
- custom: specified area erasing.

    */
    @SerializedName("SubtitleEraseMethod")
    @Expose
    private String SubtitleEraseMethod;

    /**
    * Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, it is usually recommended to select this version for better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition.
    */
    @SerializedName("SubtitleModel")
    @Expose
    private String SubtitleModel;

    /**
    * Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported only when SubtitleEraseMethod is set to auto. Once enabled, it identifies the text region that appears longest and most stably within the automated erasing area as the subtitle area. The text in the subtitle area is extracted and erased.
-ON
-OFF: disabled.
    */
    @SerializedName("OcrSwitch")
    @Expose
    private String OcrSwitch;

    /**
    * Subtitle language, used for guiding OCR recognition, default value zh_en; this parameter is valid only when OcrSwitch is "ON".
- zh_en: Chinese and English
- multi: others
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Indian Bengali, Indian Gujarati, Indian Kannada, Indian Malayalam, Indian Tamil, Indian Telugu, Slovenian, Polish, Catalonia, Bosnia, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijan, Indonesian, Luxembourg, Lithuanian, Latvian, Malta, Slovak, Turkish, Kazakh, Greek, Irish, Belarus, Khmer, Tagalog, Pashto, Persian, Tajikistan


    */
    @SerializedName("SubtitleLang")
    @Expose
    private String SubtitleLang;

    /**
    * Subtitle file format, default value vtt; this parameter is valid only when OcrSwitch is "ON".
- srt: SRT format
- vtt: WebVTT format.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Whether to enable subtitle translation, default value is OFF. This parameter is valid only when OcrSwitch is "ON".
-ON
-OFF: disabled.
    */
    @SerializedName("TransSwitch")
    @Expose
    private String TransSwitch;

    /**
    * Subtitle target language, default value en; this parameter is valid only when TransSwitch is "ON".
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
    * Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
    */
    @SerializedName("CustomAreas")
    @Expose
    private EraseTimeArea [] CustomAreas;

    /**
     * Get Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When using automatic erasing, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
-auto erasing
- custom: specified area erasing.
 
     * @return SubtitleEraseMethod Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When using automatic erasing, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
-auto erasing
- custom: specified area erasing.

     */
    public String getSubtitleEraseMethod() {
        return this.SubtitleEraseMethod;
    }

    /**
     * Set Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When using automatic erasing, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
-auto erasing
- custom: specified area erasing.

     * @param SubtitleEraseMethod Subtitle erasing method.
**Automatic erasing:** Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area.
When using automatic erasing, if AutoAreas is not specified, the default area (lower middle part of the image) will be erased automatically. If AutoAreas is specified, the specified area will be erased automatically.
**Specified area erasing:** If the subtitle position is relatively fixed, you are recommended to specify the erasing area directly to minimize missed erasing.
When you choose specified area erasing, specify at least one area for CustomAreas.
-auto erasing
- custom: specified area erasing.

     */
    public void setSubtitleEraseMethod(String SubtitleEraseMethod) {
        this.SubtitleEraseMethod = SubtitleEraseMethod;
    }

    /**
     * Get Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, it is usually recommended to select this version for better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition. 
     * @return SubtitleModel Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, it is usually recommended to select this version for better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition.
     */
    public String getSubtitleModel() {
        return this.SubtitleModel;
    }

    /**
     * Set Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, it is usually recommended to select this version for better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition.
     * @param SubtitleModel Subtitle erasing model.
**Standard edition (recommended):** For standard subtitle styles, it is usually recommended to select this version for better traceless effects in the details.
**Area edition:** If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition.
- standard: standard edition.
- area: area edition.
     */
    public void setSubtitleModel(String SubtitleModel) {
        this.SubtitleModel = SubtitleModel;
    }

    /**
     * Get Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported only when SubtitleEraseMethod is set to auto. Once enabled, it identifies the text region that appears longest and most stably within the automated erasing area as the subtitle area. The text in the subtitle area is extracted and erased.
-ON
-OFF: disabled. 
     * @return OcrSwitch Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported only when SubtitleEraseMethod is set to auto. Once enabled, it identifies the text region that appears longest and most stably within the automated erasing area as the subtitle area. The text in the subtitle area is extracted and erased.
-ON
-OFF: disabled.
     */
    public String getOcrSwitch() {
        return this.OcrSwitch;
    }

    /**
     * Set Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported only when SubtitleEraseMethod is set to auto. Once enabled, it identifies the text region that appears longest and most stably within the automated erasing area as the subtitle area. The text in the subtitle area is extracted and erased.
-ON
-OFF: disabled.
     * @param OcrSwitch Whether to enable OCR subtitle extraction. The default value is OFF.
OCR subtitle extraction is supported only when SubtitleEraseMethod is set to auto. Once enabled, it identifies the text region that appears longest and most stably within the automated erasing area as the subtitle area. The text in the subtitle area is extracted and erased.
-ON
-OFF: disabled.
     */
    public void setOcrSwitch(String OcrSwitch) {
        this.OcrSwitch = OcrSwitch;
    }

    /**
     * Get Subtitle language, used for guiding OCR recognition, default value zh_en; this parameter is valid only when OcrSwitch is "ON".
- zh_en: Chinese and English
- multi: others
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Indian Bengali, Indian Gujarati, Indian Kannada, Indian Malayalam, Indian Tamil, Indian Telugu, Slovenian, Polish, Catalonia, Bosnia, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijan, Indonesian, Luxembourg, Lithuanian, Latvian, Malta, Slovak, Turkish, Kazakh, Greek, Irish, Belarus, Khmer, Tagalog, Pashto, Persian, Tajikistan

 
     * @return SubtitleLang Subtitle language, used for guiding OCR recognition, default value zh_en; this parameter is valid only when OcrSwitch is "ON".
- zh_en: Chinese and English
- multi: others
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Indian Bengali, Indian Gujarati, Indian Kannada, Indian Malayalam, Indian Tamil, Indian Telugu, Slovenian, Polish, Catalonia, Bosnia, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijan, Indonesian, Luxembourg, Lithuanian, Latvian, Malta, Slovak, Turkish, Kazakh, Greek, Irish, Belarus, Khmer, Tagalog, Pashto, Persian, Tajikistan


     */
    public String getSubtitleLang() {
        return this.SubtitleLang;
    }

    /**
     * Set Subtitle language, used for guiding OCR recognition, default value zh_en; this parameter is valid only when OcrSwitch is "ON".
- zh_en: Chinese and English
- multi: others
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Indian Bengali, Indian Gujarati, Indian Kannada, Indian Malayalam, Indian Tamil, Indian Telugu, Slovenian, Polish, Catalonia, Bosnia, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijan, Indonesian, Luxembourg, Lithuanian, Latvian, Malta, Slovak, Turkish, Kazakh, Greek, Irish, Belarus, Khmer, Tagalog, Pashto, Persian, Tajikistan


     * @param SubtitleLang Subtitle language, used for guiding OCR recognition, default value zh_en; this parameter is valid only when OcrSwitch is "ON".
- zh_en: Chinese and English
- multi: others
The following are other languages supported for recognition:
Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Indian Bengali, Indian Gujarati, Indian Kannada, Indian Malayalam, Indian Tamil, Indian Telugu, Slovenian, Polish, Catalonia, Bosnia, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijan, Indonesian, Luxembourg, Lithuanian, Latvian, Malta, Slovak, Turkish, Kazakh, Greek, Irish, Belarus, Khmer, Tagalog, Pashto, Persian, Tajikistan


     */
    public void setSubtitleLang(String SubtitleLang) {
        this.SubtitleLang = SubtitleLang;
    }

    /**
     * Get Subtitle file format, default value vtt; this parameter is valid only when OcrSwitch is "ON".
- srt: SRT format
- vtt: WebVTT format. 
     * @return SubtitleFormat Subtitle file format, default value vtt; this parameter is valid only when OcrSwitch is "ON".
- srt: SRT format
- vtt: WebVTT format.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Subtitle file format, default value vtt; this parameter is valid only when OcrSwitch is "ON".
- srt: SRT format
- vtt: WebVTT format.
     * @param SubtitleFormat Subtitle file format, default value vtt; this parameter is valid only when OcrSwitch is "ON".
- srt: SRT format
- vtt: WebVTT format.
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Whether to enable subtitle translation, default value is OFF. This parameter is valid only when OcrSwitch is "ON".
-ON
-OFF: disabled. 
     * @return TransSwitch Whether to enable subtitle translation, default value is OFF. This parameter is valid only when OcrSwitch is "ON".
-ON
-OFF: disabled.
     */
    public String getTransSwitch() {
        return this.TransSwitch;
    }

    /**
     * Set Whether to enable subtitle translation, default value is OFF. This parameter is valid only when OcrSwitch is "ON".
-ON
-OFF: disabled.
     * @param TransSwitch Whether to enable subtitle translation, default value is OFF. This parameter is valid only when OcrSwitch is "ON".
-ON
-OFF: disabled.
     */
    public void setTransSwitch(String TransSwitch) {
        this.TransSwitch = TransSwitch;
    }

    /**
     * Get Subtitle target language, default value en; this parameter is valid only when TransSwitch is "ON".
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
     * @return TransDstLang Subtitle target language, default value en; this parameter is valid only when TransSwitch is "ON".
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
     */
    public String getTransDstLang() {
        return this.TransDstLang;
    }

    /**
     * Set Subtitle target language, default value en; this parameter is valid only when TransSwitch is "ON".
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
     * @param TransDstLang Subtitle target language, default value en; this parameter is valid only when TransSwitch is "ON".
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
     * Get Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged. 
     * @return CustomAreas Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     */
    public EraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set Specify the custom region for erasing.
For the specified area, erase the target objects directly without detection and recognition within a selected time period.
Note: When a template is modified, input [] for the erasing area; if this parameter is unspecified, the template area information will remain unchanged.
     * @param CustomAreas Specify the custom region for erasing.
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

