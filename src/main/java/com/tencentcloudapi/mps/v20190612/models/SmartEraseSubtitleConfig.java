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

public class SmartEraseSubtitleConfig extends AbstractModel {

    /**
    * Specifies the subtitle erasure method.
**Automatic erasing:** automatically identifies subtitle text content in videos through AI models and performs seamless erasure to generate new videos. frame interference and unique subtitle styles may cause certain missed or incorrect erasures, which can be handled through specified area erasure.
When using automatic erasure, if AutoAreas is not specified, the default region (lower middle of the frame) will be erased automatically. if AutoAreas is specified, it will change to erase the designated area.
**Specified area erasing:** if your subtitle position is fixed, directly specify the erasure area to decrease the chance of removal omission to the maximum extent.
When your choice is specified area erasure, please import at least one designated region in CustomAreas.
-Automated removal.
- specifies the custom specified area erasure.

    */
    @SerializedName("SubtitleEraseMethod")
    @Expose
    private String SubtitleEraseMethod;

    /**
    * Subtitle erasure model.
**Standard version (recommend):** if your subtitle style is standard, normally recommend choose this version for better effectiveness with seamless detail.
**Regional version:** if your subtitles have special styles such as italics, shadows, or motion effects, we recommend choosing the regional version for larger removal area, though the detail effect is not as good as the standard version.
-Specifies the standard model.
-area. specifies the regional model.
    */
    @SerializedName("SubtitleModel")
    @Expose
    private String SubtitleModel;

    /**
    * Whether OCR subtitle extraction is enabled. default value: OFF.
Supports enabling OCR subtitle extraction only when SubtitleEraseMethod is set to auto. when enabled, it identifies the longest and most stable text area within the region as the subtitle area, then performs text extraction and removal.
-ON: enable.
-OFF. specifies the disabled state.
    */
    @SerializedName("OcrSwitch")
    @Expose
    private String OcrSwitch;

    /**
    * Subtitle language, for OCR guidance, default value zh_en. this parameter is valid only when OcrSwitch is ON.
-Chinese and english.
-multi other.
Other supported languages:.
Chinese, english, japanese, korean, spanish, french, german, portuguese, vietnamese, malay, russian, italian, dutch, swedish, finnish, danish, norwegian, hungarian, thai, hindi, arabic, indian-bengali, indian-gujarati, indian-kannada, indian-malayalam, indian-tamil, indian-telugu, slovenian, polish, catalan, bosnian, czech, estonian, croatian, punjabi, marathi, azerbaijani, indonesian, luxembourgish, lithuanian, latvian, maltese, slovak, turkish, kazakh, greek, irish, belarusian, khmer, tagalog, pashto, persian, tajik.


    */
    @SerializedName("SubtitleLang")
    @Expose
    private String SubtitleLang;

    /**
    * Specifies the subtitle file format. default value: vtt. this parameter is valid only when OcrSwitch is set to ON.
-srt format.
-vtt: WebVTT format.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Specifies whether to enable subtitle translation. default value: OFF. this parameter is valid only when OcrSwitch is set to ON.
-ON: enable.
-OFF. specifies the disabled state.
    */
    @SerializedName("TransSwitch")
    @Expose
    private String TransSwitch;

    /**
    * Subtitle target language. default value: en. this parameter is valid only when TransSwitch is set to ON.
Supported languages:.
Simplified chinese.
Specifies the language. valid values: en (english).
Ja: japanese.
Ko: korean.
Fr: french.
es: spanish.
It: italian.
de: german.
tr: turkish.
Ru: russian.
pt: portuguese.
Vi: vietnamese.
id: indonesian.
ms: malay.
Th: thai.
Ar: arabic.
hi: Hindi
    */
    @SerializedName("TransDstLang")
    @Expose
    private String TransDstLang;

    /**
    * Specifies automatic removal of a custom region.
Specifies the use of an AI model to automatically detect and erase existing targets in the specified region.
Note that this parameter will not take effect when the removal method is custom. for template modification, input [] to clean up the region. the template region information remains unchanged if not imported.
    */
    @SerializedName("AutoAreas")
    @Expose
    private EraseArea [] AutoAreas;

    /**
    * Specifies erasure of a custom region.
Detects and directly performs removal within a specified time range for the selected region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed.
    */
    @SerializedName("CustomAreas")
    @Expose
    private EraseTimeArea [] CustomAreas;

    /**
     * Get Specifies the subtitle erasure method.
**Automatic erasing:** automatically identifies subtitle text content in videos through AI models and performs seamless erasure to generate new videos. frame interference and unique subtitle styles may cause certain missed or incorrect erasures, which can be handled through specified area erasure.
When using automatic erasure, if AutoAreas is not specified, the default region (lower middle of the frame) will be erased automatically. if AutoAreas is specified, it will change to erase the designated area.
**Specified area erasing:** if your subtitle position is fixed, directly specify the erasure area to decrease the chance of removal omission to the maximum extent.
When your choice is specified area erasure, please import at least one designated region in CustomAreas.
-Automated removal.
- specifies the custom specified area erasure.
 
     * @return SubtitleEraseMethod Specifies the subtitle erasure method.
**Automatic erasing:** automatically identifies subtitle text content in videos through AI models and performs seamless erasure to generate new videos. frame interference and unique subtitle styles may cause certain missed or incorrect erasures, which can be handled through specified area erasure.
When using automatic erasure, if AutoAreas is not specified, the default region (lower middle of the frame) will be erased automatically. if AutoAreas is specified, it will change to erase the designated area.
**Specified area erasing:** if your subtitle position is fixed, directly specify the erasure area to decrease the chance of removal omission to the maximum extent.
When your choice is specified area erasure, please import at least one designated region in CustomAreas.
-Automated removal.
- specifies the custom specified area erasure.

     */
    public String getSubtitleEraseMethod() {
        return this.SubtitleEraseMethod;
    }

    /**
     * Set Specifies the subtitle erasure method.
**Automatic erasing:** automatically identifies subtitle text content in videos through AI models and performs seamless erasure to generate new videos. frame interference and unique subtitle styles may cause certain missed or incorrect erasures, which can be handled through specified area erasure.
When using automatic erasure, if AutoAreas is not specified, the default region (lower middle of the frame) will be erased automatically. if AutoAreas is specified, it will change to erase the designated area.
**Specified area erasing:** if your subtitle position is fixed, directly specify the erasure area to decrease the chance of removal omission to the maximum extent.
When your choice is specified area erasure, please import at least one designated region in CustomAreas.
-Automated removal.
- specifies the custom specified area erasure.

     * @param SubtitleEraseMethod Specifies the subtitle erasure method.
**Automatic erasing:** automatically identifies subtitle text content in videos through AI models and performs seamless erasure to generate new videos. frame interference and unique subtitle styles may cause certain missed or incorrect erasures, which can be handled through specified area erasure.
When using automatic erasure, if AutoAreas is not specified, the default region (lower middle of the frame) will be erased automatically. if AutoAreas is specified, it will change to erase the designated area.
**Specified area erasing:** if your subtitle position is fixed, directly specify the erasure area to decrease the chance of removal omission to the maximum extent.
When your choice is specified area erasure, please import at least one designated region in CustomAreas.
-Automated removal.
- specifies the custom specified area erasure.

     */
    public void setSubtitleEraseMethod(String SubtitleEraseMethod) {
        this.SubtitleEraseMethod = SubtitleEraseMethod;
    }

    /**
     * Get Subtitle erasure model.
**Standard version (recommend):** if your subtitle style is standard, normally recommend choose this version for better effectiveness with seamless detail.
**Regional version:** if your subtitles have special styles such as italics, shadows, or motion effects, we recommend choosing the regional version for larger removal area, though the detail effect is not as good as the standard version.
-Specifies the standard model.
-area. specifies the regional model. 
     * @return SubtitleModel Subtitle erasure model.
**Standard version (recommend):** if your subtitle style is standard, normally recommend choose this version for better effectiveness with seamless detail.
**Regional version:** if your subtitles have special styles such as italics, shadows, or motion effects, we recommend choosing the regional version for larger removal area, though the detail effect is not as good as the standard version.
-Specifies the standard model.
-area. specifies the regional model.
     */
    public String getSubtitleModel() {
        return this.SubtitleModel;
    }

    /**
     * Set Subtitle erasure model.
**Standard version (recommend):** if your subtitle style is standard, normally recommend choose this version for better effectiveness with seamless detail.
**Regional version:** if your subtitles have special styles such as italics, shadows, or motion effects, we recommend choosing the regional version for larger removal area, though the detail effect is not as good as the standard version.
-Specifies the standard model.
-area. specifies the regional model.
     * @param SubtitleModel Subtitle erasure model.
**Standard version (recommend):** if your subtitle style is standard, normally recommend choose this version for better effectiveness with seamless detail.
**Regional version:** if your subtitles have special styles such as italics, shadows, or motion effects, we recommend choosing the regional version for larger removal area, though the detail effect is not as good as the standard version.
-Specifies the standard model.
-area. specifies the regional model.
     */
    public void setSubtitleModel(String SubtitleModel) {
        this.SubtitleModel = SubtitleModel;
    }

    /**
     * Get Whether OCR subtitle extraction is enabled. default value: OFF.
Supports enabling OCR subtitle extraction only when SubtitleEraseMethod is set to auto. when enabled, it identifies the longest and most stable text area within the region as the subtitle area, then performs text extraction and removal.
-ON: enable.
-OFF. specifies the disabled state. 
     * @return OcrSwitch Whether OCR subtitle extraction is enabled. default value: OFF.
Supports enabling OCR subtitle extraction only when SubtitleEraseMethod is set to auto. when enabled, it identifies the longest and most stable text area within the region as the subtitle area, then performs text extraction and removal.
-ON: enable.
-OFF. specifies the disabled state.
     */
    public String getOcrSwitch() {
        return this.OcrSwitch;
    }

    /**
     * Set Whether OCR subtitle extraction is enabled. default value: OFF.
Supports enabling OCR subtitle extraction only when SubtitleEraseMethod is set to auto. when enabled, it identifies the longest and most stable text area within the region as the subtitle area, then performs text extraction and removal.
-ON: enable.
-OFF. specifies the disabled state.
     * @param OcrSwitch Whether OCR subtitle extraction is enabled. default value: OFF.
Supports enabling OCR subtitle extraction only when SubtitleEraseMethod is set to auto. when enabled, it identifies the longest and most stable text area within the region as the subtitle area, then performs text extraction and removal.
-ON: enable.
-OFF. specifies the disabled state.
     */
    public void setOcrSwitch(String OcrSwitch) {
        this.OcrSwitch = OcrSwitch;
    }

    /**
     * Get Subtitle language, for OCR guidance, default value zh_en. this parameter is valid only when OcrSwitch is ON.
-Chinese and english.
-multi other.
Other supported languages:.
Chinese, english, japanese, korean, spanish, french, german, portuguese, vietnamese, malay, russian, italian, dutch, swedish, finnish, danish, norwegian, hungarian, thai, hindi, arabic, indian-bengali, indian-gujarati, indian-kannada, indian-malayalam, indian-tamil, indian-telugu, slovenian, polish, catalan, bosnian, czech, estonian, croatian, punjabi, marathi, azerbaijani, indonesian, luxembourgish, lithuanian, latvian, maltese, slovak, turkish, kazakh, greek, irish, belarusian, khmer, tagalog, pashto, persian, tajik.

 
     * @return SubtitleLang Subtitle language, for OCR guidance, default value zh_en. this parameter is valid only when OcrSwitch is ON.
-Chinese and english.
-multi other.
Other supported languages:.
Chinese, english, japanese, korean, spanish, french, german, portuguese, vietnamese, malay, russian, italian, dutch, swedish, finnish, danish, norwegian, hungarian, thai, hindi, arabic, indian-bengali, indian-gujarati, indian-kannada, indian-malayalam, indian-tamil, indian-telugu, slovenian, polish, catalan, bosnian, czech, estonian, croatian, punjabi, marathi, azerbaijani, indonesian, luxembourgish, lithuanian, latvian, maltese, slovak, turkish, kazakh, greek, irish, belarusian, khmer, tagalog, pashto, persian, tajik.


     */
    public String getSubtitleLang() {
        return this.SubtitleLang;
    }

    /**
     * Set Subtitle language, for OCR guidance, default value zh_en. this parameter is valid only when OcrSwitch is ON.
-Chinese and english.
-multi other.
Other supported languages:.
Chinese, english, japanese, korean, spanish, french, german, portuguese, vietnamese, malay, russian, italian, dutch, swedish, finnish, danish, norwegian, hungarian, thai, hindi, arabic, indian-bengali, indian-gujarati, indian-kannada, indian-malayalam, indian-tamil, indian-telugu, slovenian, polish, catalan, bosnian, czech, estonian, croatian, punjabi, marathi, azerbaijani, indonesian, luxembourgish, lithuanian, latvian, maltese, slovak, turkish, kazakh, greek, irish, belarusian, khmer, tagalog, pashto, persian, tajik.


     * @param SubtitleLang Subtitle language, for OCR guidance, default value zh_en. this parameter is valid only when OcrSwitch is ON.
-Chinese and english.
-multi other.
Other supported languages:.
Chinese, english, japanese, korean, spanish, french, german, portuguese, vietnamese, malay, russian, italian, dutch, swedish, finnish, danish, norwegian, hungarian, thai, hindi, arabic, indian-bengali, indian-gujarati, indian-kannada, indian-malayalam, indian-tamil, indian-telugu, slovenian, polish, catalan, bosnian, czech, estonian, croatian, punjabi, marathi, azerbaijani, indonesian, luxembourgish, lithuanian, latvian, maltese, slovak, turkish, kazakh, greek, irish, belarusian, khmer, tagalog, pashto, persian, tajik.


     */
    public void setSubtitleLang(String SubtitleLang) {
        this.SubtitleLang = SubtitleLang;
    }

    /**
     * Get Specifies the subtitle file format. default value: vtt. this parameter is valid only when OcrSwitch is set to ON.
-srt format.
-vtt: WebVTT format. 
     * @return SubtitleFormat Specifies the subtitle file format. default value: vtt. this parameter is valid only when OcrSwitch is set to ON.
-srt format.
-vtt: WebVTT format.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Specifies the subtitle file format. default value: vtt. this parameter is valid only when OcrSwitch is set to ON.
-srt format.
-vtt: WebVTT format.
     * @param SubtitleFormat Specifies the subtitle file format. default value: vtt. this parameter is valid only when OcrSwitch is set to ON.
-srt format.
-vtt: WebVTT format.
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Specifies whether to enable subtitle translation. default value: OFF. this parameter is valid only when OcrSwitch is set to ON.
-ON: enable.
-OFF. specifies the disabled state. 
     * @return TransSwitch Specifies whether to enable subtitle translation. default value: OFF. this parameter is valid only when OcrSwitch is set to ON.
-ON: enable.
-OFF. specifies the disabled state.
     */
    public String getTransSwitch() {
        return this.TransSwitch;
    }

    /**
     * Set Specifies whether to enable subtitle translation. default value: OFF. this parameter is valid only when OcrSwitch is set to ON.
-ON: enable.
-OFF. specifies the disabled state.
     * @param TransSwitch Specifies whether to enable subtitle translation. default value: OFF. this parameter is valid only when OcrSwitch is set to ON.
-ON: enable.
-OFF. specifies the disabled state.
     */
    public void setTransSwitch(String TransSwitch) {
        this.TransSwitch = TransSwitch;
    }

    /**
     * Get Subtitle target language. default value: en. this parameter is valid only when TransSwitch is set to ON.
Supported languages:.
Simplified chinese.
Specifies the language. valid values: en (english).
Ja: japanese.
Ko: korean.
Fr: french.
es: spanish.
It: italian.
de: german.
tr: turkish.
Ru: russian.
pt: portuguese.
Vi: vietnamese.
id: indonesian.
ms: malay.
Th: thai.
Ar: arabic.
hi: Hindi 
     * @return TransDstLang Subtitle target language. default value: en. this parameter is valid only when TransSwitch is set to ON.
Supported languages:.
Simplified chinese.
Specifies the language. valid values: en (english).
Ja: japanese.
Ko: korean.
Fr: french.
es: spanish.
It: italian.
de: german.
tr: turkish.
Ru: russian.
pt: portuguese.
Vi: vietnamese.
id: indonesian.
ms: malay.
Th: thai.
Ar: arabic.
hi: Hindi
     */
    public String getTransDstLang() {
        return this.TransDstLang;
    }

    /**
     * Set Subtitle target language. default value: en. this parameter is valid only when TransSwitch is set to ON.
Supported languages:.
Simplified chinese.
Specifies the language. valid values: en (english).
Ja: japanese.
Ko: korean.
Fr: french.
es: spanish.
It: italian.
de: german.
tr: turkish.
Ru: russian.
pt: portuguese.
Vi: vietnamese.
id: indonesian.
ms: malay.
Th: thai.
Ar: arabic.
hi: Hindi
     * @param TransDstLang Subtitle target language. default value: en. this parameter is valid only when TransSwitch is set to ON.
Supported languages:.
Simplified chinese.
Specifies the language. valid values: en (english).
Ja: japanese.
Ko: korean.
Fr: french.
es: spanish.
It: italian.
de: german.
tr: turkish.
Ru: russian.
pt: portuguese.
Vi: vietnamese.
id: indonesian.
ms: malay.
Th: thai.
Ar: arabic.
hi: Hindi
     */
    public void setTransDstLang(String TransDstLang) {
        this.TransDstLang = TransDstLang;
    }

    /**
     * Get Specifies automatic removal of a custom region.
Specifies the use of an AI model to automatically detect and erase existing targets in the specified region.
Note that this parameter will not take effect when the removal method is custom. for template modification, input [] to clean up the region. the template region information remains unchanged if not imported. 
     * @return AutoAreas Specifies automatic removal of a custom region.
Specifies the use of an AI model to automatically detect and erase existing targets in the specified region.
Note that this parameter will not take effect when the removal method is custom. for template modification, input [] to clean up the region. the template region information remains unchanged if not imported.
     */
    public EraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set Specifies automatic removal of a custom region.
Specifies the use of an AI model to automatically detect and erase existing targets in the specified region.
Note that this parameter will not take effect when the removal method is custom. for template modification, input [] to clean up the region. the template region information remains unchanged if not imported.
     * @param AutoAreas Specifies automatic removal of a custom region.
Specifies the use of an AI model to automatically detect and erase existing targets in the specified region.
Note that this parameter will not take effect when the removal method is custom. for template modification, input [] to clean up the region. the template region information remains unchanged if not imported.
     */
    public void setAutoAreas(EraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get Specifies erasure of a custom region.
Detects and directly performs removal within a specified time range for the selected region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed. 
     * @return CustomAreas Specifies erasure of a custom region.
Detects and directly performs removal within a specified time range for the selected region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed.
     */
    public EraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set Specifies erasure of a custom region.
Detects and directly performs removal within a specified time range for the selected region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed.
     * @param CustomAreas Specifies erasure of a custom region.
Detects and directly performs removal within a specified time range for the selected region.
Note: when modifying the template, pass [] to clear the region. the template region information remains unchanged if not passed.
     */
    public void setCustomAreas(EraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public SmartEraseSubtitleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseSubtitleConfig(SmartEraseSubtitleConfig source) {
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

