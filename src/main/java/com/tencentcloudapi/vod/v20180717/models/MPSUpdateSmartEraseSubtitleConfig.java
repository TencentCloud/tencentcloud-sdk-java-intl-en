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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSUpdateSmartEraseSubtitleConfig extends AbstractModel {

    /**
    * <p>Subtitle erasure method. <strong>Automatic erasing:</strong> Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area. When using automatic erasing, if you do not specify AutoAreas, the default region (lower middle part of the frame) will be erased automatically. If AutoAreas is specified, the designated region will be erased instead. <strong>Specified area erasure:</strong> If your subtitle position is fixed, it is recommended to directly specify the erasure area to minimize missed erasures. When choosing specified area erasure, please input at least one designated region in CustomAreas. </p><ul><li>auto: Automatic erasing -</li><li>custom: Specified area erasure</li></ul>
    */
    @SerializedName("SubtitleEraseMethod")
    @Expose
    private String SubtitleEraseMethod;

    /**
    * <p>Subtitle erasure model. <strong>Standard version (recommended):</strong> If your subtitles have a standard style, it is usually recommended to select this version for better effectiveness in seamless detail removal. <strong>Area edition:</strong> If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition. - standard Standard model - area Regional model</p>
    */
    @SerializedName("SubtitleModel")
    @Expose
    private String SubtitleModel;

    /**
    * <p>Whether OCR subtitle extraction is enabled. The default value is OFF. OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased. </p><ul><li>ON Enable</li><li>OFF Disable</li></ul>
    */
    @SerializedName("OcrSwitch")
    @Expose
    private String OcrSwitch;

    /**
    * <p>Subtitle language, for OCR recognition. Default value: zh_en.<br>This parameter is valid only when OcrSwitch is set to &quot;ON&quot;. </p><ul><li>zh_en: Chinese and English </li><li>multi: other. The following languages are supported: Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Bengali, Gujarati, Kannada, Malayalam, Tamil, Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, Tajik</li></ul>
    */
    @SerializedName("SubtitleLang")
    @Expose
    private String SubtitleLang;

    /**
    * <p>Subtitle file format. Default value: vtt. This parameter is valid only when OcrSwitch is set to "ON".</p><ul><li>srt: srt format</li><li>vtt: WebVTT format</li></ul>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>Whether to enable subtitle translation. Default value: OFF. This parameter is valid only when OcrSwitch is set to "ON". </p><ul><li>ON: enable </li><li>OFF: disable</li></ul>
    */
    @SerializedName("TransSwitch")
    @Expose
    private String TransSwitch;

    /**
    * <p>Target language for subtitle translation. Default value: en. This parameter is valid only when TransSwitch is set to "ON". Currently supported languages:<br>zh: Simplified Chinese<br>en: English<br>ja: Japanese<br>ko: Korean<br>fr: French<br>es: Spanish<br>it: Italian<br>de: German<br>tr: Turkish<br>ru: Russian<br>pt: Portuguese<br>vi: Vietnamese<br>id: Indonesian<br>ms: Malay<br>th: Thai<br>ar: Arabic<br>hi: Hindi</p>
    */
    @SerializedName("TransDstLang")
    @Expose
    private String TransDstLang;

    /**
    * <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets.<br>Note: When the erase method is set to custom, this parameter will not take effect. To modify the template, input [] for region cleanup. If not provided, the template region information remains unchanged.</p>
    */
    @SerializedName("AutoAreas")
    @Expose
    private MPSEraseArea [] AutoAreas;

    /**
    * <p>Designate the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: When modifying the template, import [] to clear regions. The template region information remains unchanged if not imported.</p>
    */
    @SerializedName("CustomAreas")
    @Expose
    private MPSEraseTimeArea [] CustomAreas;

    /**
     * Get <p>Subtitle erasure method. <strong>Automatic erasing:</strong> Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area. When using automatic erasing, if you do not specify AutoAreas, the default region (lower middle part of the frame) will be erased automatically. If AutoAreas is specified, the designated region will be erased instead. <strong>Specified area erasure:</strong> If your subtitle position is fixed, it is recommended to directly specify the erasure area to minimize missed erasures. When choosing specified area erasure, please input at least one designated region in CustomAreas. </p><ul><li>auto: Automatic erasing -</li><li>custom: Specified area erasure</li></ul> 
     * @return SubtitleEraseMethod <p>Subtitle erasure method. <strong>Automatic erasing:</strong> Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area. When using automatic erasing, if you do not specify AutoAreas, the default region (lower middle part of the frame) will be erased automatically. If AutoAreas is specified, the designated region will be erased instead. <strong>Specified area erasure:</strong> If your subtitle position is fixed, it is recommended to directly specify the erasure area to minimize missed erasures. When choosing specified area erasure, please input at least one designated region in CustomAreas. </p><ul><li>auto: Automatic erasing -</li><li>custom: Specified area erasure</li></ul>
     */
    public String getSubtitleEraseMethod() {
        return this.SubtitleEraseMethod;
    }

    /**
     * Set <p>Subtitle erasure method. <strong>Automatic erasing:</strong> Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area. When using automatic erasing, if you do not specify AutoAreas, the default region (lower middle part of the frame) will be erased automatically. If AutoAreas is specified, the designated region will be erased instead. <strong>Specified area erasure:</strong> If your subtitle position is fixed, it is recommended to directly specify the erasure area to minimize missed erasures. When choosing specified area erasure, please input at least one designated region in CustomAreas. </p><ul><li>auto: Automatic erasing -</li><li>custom: Specified area erasure</li></ul>
     * @param SubtitleEraseMethod <p>Subtitle erasure method. <strong>Automatic erasing:</strong> Video subtitles are automatically recognized using an AI model and are erased without traces to generate a new video. However, missed or incorrect erasing may occur due to image interference and special subtitle styles. In this case, you can specify the erasing area. When using automatic erasing, if you do not specify AutoAreas, the default region (lower middle part of the frame) will be erased automatically. If AutoAreas is specified, the designated region will be erased instead. <strong>Specified area erasure:</strong> If your subtitle position is fixed, it is recommended to directly specify the erasure area to minimize missed erasures. When choosing specified area erasure, please input at least one designated region in CustomAreas. </p><ul><li>auto: Automatic erasing -</li><li>custom: Specified area erasure</li></ul>
     */
    public void setSubtitleEraseMethod(String SubtitleEraseMethod) {
        this.SubtitleEraseMethod = SubtitleEraseMethod;
    }

    /**
     * Get <p>Subtitle erasure model. <strong>Standard version (recommended):</strong> If your subtitles have a standard style, it is usually recommended to select this version for better effectiveness in seamless detail removal. <strong>Area edition:</strong> If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition. - standard Standard model - area Regional model</p> 
     * @return SubtitleModel <p>Subtitle erasure model. <strong>Standard version (recommended):</strong> If your subtitles have a standard style, it is usually recommended to select this version for better effectiveness in seamless detail removal. <strong>Area edition:</strong> If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition. - standard Standard model - area Regional model</p>
     */
    public String getSubtitleModel() {
        return this.SubtitleModel;
    }

    /**
     * Set <p>Subtitle erasure model. <strong>Standard version (recommended):</strong> If your subtitles have a standard style, it is usually recommended to select this version for better effectiveness in seamless detail removal. <strong>Area edition:</strong> If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition. - standard Standard model - area Regional model</p>
     * @param SubtitleModel <p>Subtitle erasure model. <strong>Standard version (recommended):</strong> If your subtitles have a standard style, it is usually recommended to select this version for better effectiveness in seamless detail removal. <strong>Area edition:</strong> If the subtitles have special styles, such as calligraphy, shadow, or motion effects, you are recommended to select this edition to ensure a larger erasing area. However, the erasing effect in the details is not as good as the standard edition. - standard Standard model - area Regional model</p>
     */
    public void setSubtitleModel(String SubtitleModel) {
        this.SubtitleModel = SubtitleModel;
    }

    /**
     * Get <p>Whether OCR subtitle extraction is enabled. The default value is OFF. OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased. </p><ul><li>ON Enable</li><li>OFF Disable</li></ul> 
     * @return OcrSwitch <p>Whether OCR subtitle extraction is enabled. The default value is OFF. OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased. </p><ul><li>ON Enable</li><li>OFF Disable</li></ul>
     */
    public String getOcrSwitch() {
        return this.OcrSwitch;
    }

    /**
     * Set <p>Whether OCR subtitle extraction is enabled. The default value is OFF. OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased. </p><ul><li>ON Enable</li><li>OFF Disable</li></ul>
     * @param OcrSwitch <p>Whether OCR subtitle extraction is enabled. The default value is OFF. OCR subtitle extraction is supported if and only if SubtitleEraseMethod is set to auto. When enabled, it identifies the text region that appears most persistently and stably within the automatic erasing area as the subtitle area. The text within the subtitle area is extracted and erased. </p><ul><li>ON Enable</li><li>OFF Disable</li></ul>
     */
    public void setOcrSwitch(String OcrSwitch) {
        this.OcrSwitch = OcrSwitch;
    }

    /**
     * Get <p>Subtitle language, for OCR recognition. Default value: zh_en.<br>This parameter is valid only when OcrSwitch is set to &quot;ON&quot;. </p><ul><li>zh_en: Chinese and English </li><li>multi: other. The following languages are supported: Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Bengali, Gujarati, Kannada, Malayalam, Tamil, Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, Tajik</li></ul> 
     * @return SubtitleLang <p>Subtitle language, for OCR recognition. Default value: zh_en.<br>This parameter is valid only when OcrSwitch is set to &quot;ON&quot;. </p><ul><li>zh_en: Chinese and English </li><li>multi: other. The following languages are supported: Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Bengali, Gujarati, Kannada, Malayalam, Tamil, Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, Tajik</li></ul>
     */
    public String getSubtitleLang() {
        return this.SubtitleLang;
    }

    /**
     * Set <p>Subtitle language, for OCR recognition. Default value: zh_en.<br>This parameter is valid only when OcrSwitch is set to &quot;ON&quot;. </p><ul><li>zh_en: Chinese and English </li><li>multi: other. The following languages are supported: Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Bengali, Gujarati, Kannada, Malayalam, Tamil, Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, Tajik</li></ul>
     * @param SubtitleLang <p>Subtitle language, for OCR recognition. Default value: zh_en.<br>This parameter is valid only when OcrSwitch is set to &quot;ON&quot;. </p><ul><li>zh_en: Chinese and English </li><li>multi: other. The following languages are supported: Chinese, English, Japanese, Korean, Spanish, French, German, Portuguese, Vietnamese, Malay, Russian, Italian, Dutch, Swedish, Finnish, Danish, Norwegian, Hungarian, Thai, Hindi, Arabic, Bengali, Gujarati, Kannada, Malayalam, Tamil, Telugu, Slovenian, Polish, Catalan, Bosnian, Czech, Estonian, Croatian, Punjabi, Marathi, Azerbaijani, Indonesian, Luxembourgish, Lithuanian, Latvian, Maltese, Slovak, Turkish, Kazakh, Greek, Irish, Belarusian, Khmer, Tagalog, Pashto, Persian, Tajik</li></ul>
     */
    public void setSubtitleLang(String SubtitleLang) {
        this.SubtitleLang = SubtitleLang;
    }

    /**
     * Get <p>Subtitle file format. Default value: vtt. This parameter is valid only when OcrSwitch is set to "ON".</p><ul><li>srt: srt format</li><li>vtt: WebVTT format</li></ul> 
     * @return SubtitleFormat <p>Subtitle file format. Default value: vtt. This parameter is valid only when OcrSwitch is set to "ON".</p><ul><li>srt: srt format</li><li>vtt: WebVTT format</li></ul>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>Subtitle file format. Default value: vtt. This parameter is valid only when OcrSwitch is set to "ON".</p><ul><li>srt: srt format</li><li>vtt: WebVTT format</li></ul>
     * @param SubtitleFormat <p>Subtitle file format. Default value: vtt. This parameter is valid only when OcrSwitch is set to "ON".</p><ul><li>srt: srt format</li><li>vtt: WebVTT format</li></ul>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>Whether to enable subtitle translation. Default value: OFF. This parameter is valid only when OcrSwitch is set to "ON". </p><ul><li>ON: enable </li><li>OFF: disable</li></ul> 
     * @return TransSwitch <p>Whether to enable subtitle translation. Default value: OFF. This parameter is valid only when OcrSwitch is set to "ON". </p><ul><li>ON: enable </li><li>OFF: disable</li></ul>
     */
    public String getTransSwitch() {
        return this.TransSwitch;
    }

    /**
     * Set <p>Whether to enable subtitle translation. Default value: OFF. This parameter is valid only when OcrSwitch is set to "ON". </p><ul><li>ON: enable </li><li>OFF: disable</li></ul>
     * @param TransSwitch <p>Whether to enable subtitle translation. Default value: OFF. This parameter is valid only when OcrSwitch is set to "ON". </p><ul><li>ON: enable </li><li>OFF: disable</li></ul>
     */
    public void setTransSwitch(String TransSwitch) {
        this.TransSwitch = TransSwitch;
    }

    /**
     * Get <p>Target language for subtitle translation. Default value: en. This parameter is valid only when TransSwitch is set to "ON". Currently supported languages:<br>zh: Simplified Chinese<br>en: English<br>ja: Japanese<br>ko: Korean<br>fr: French<br>es: Spanish<br>it: Italian<br>de: German<br>tr: Turkish<br>ru: Russian<br>pt: Portuguese<br>vi: Vietnamese<br>id: Indonesian<br>ms: Malay<br>th: Thai<br>ar: Arabic<br>hi: Hindi</p> 
     * @return TransDstLang <p>Target language for subtitle translation. Default value: en. This parameter is valid only when TransSwitch is set to "ON". Currently supported languages:<br>zh: Simplified Chinese<br>en: English<br>ja: Japanese<br>ko: Korean<br>fr: French<br>es: Spanish<br>it: Italian<br>de: German<br>tr: Turkish<br>ru: Russian<br>pt: Portuguese<br>vi: Vietnamese<br>id: Indonesian<br>ms: Malay<br>th: Thai<br>ar: Arabic<br>hi: Hindi</p>
     */
    public String getTransDstLang() {
        return this.TransDstLang;
    }

    /**
     * Set <p>Target language for subtitle translation. Default value: en. This parameter is valid only when TransSwitch is set to "ON". Currently supported languages:<br>zh: Simplified Chinese<br>en: English<br>ja: Japanese<br>ko: Korean<br>fr: French<br>es: Spanish<br>it: Italian<br>de: German<br>tr: Turkish<br>ru: Russian<br>pt: Portuguese<br>vi: Vietnamese<br>id: Indonesian<br>ms: Malay<br>th: Thai<br>ar: Arabic<br>hi: Hindi</p>
     * @param TransDstLang <p>Target language for subtitle translation. Default value: en. This parameter is valid only when TransSwitch is set to "ON". Currently supported languages:<br>zh: Simplified Chinese<br>en: English<br>ja: Japanese<br>ko: Korean<br>fr: French<br>es: Spanish<br>it: Italian<br>de: German<br>tr: Turkish<br>ru: Russian<br>pt: Portuguese<br>vi: Vietnamese<br>id: Indonesian<br>ms: Malay<br>th: Thai<br>ar: Arabic<br>hi: Hindi</p>
     */
    public void setTransDstLang(String TransDstLang) {
        this.TransDstLang = TransDstLang;
    }

    /**
     * Get <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets.<br>Note: When the erase method is set to custom, this parameter will not take effect. To modify the template, input [] for region cleanup. If not provided, the template region information remains unchanged.</p> 
     * @return AutoAreas <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets.<br>Note: When the erase method is set to custom, this parameter will not take effect. To modify the template, input [] for region cleanup. If not provided, the template region information remains unchanged.</p>
     */
    public MPSEraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets.<br>Note: When the erase method is set to custom, this parameter will not take effect. To modify the template, input [] for region cleanup. If not provided, the template region information remains unchanged.</p>
     * @param AutoAreas <p>Automatically erase custom regions. For selected regions, use the AI model to automatically detect and erase existing targets.<br>Note: When the erase method is set to custom, this parameter will not take effect. To modify the template, input [] for region cleanup. If not provided, the template region information remains unchanged.</p>
     */
    public void setAutoAreas(MPSEraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get <p>Designate the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: When modifying the template, import [] to clear regions. The template region information remains unchanged if not imported.</p> 
     * @return CustomAreas <p>Designate the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: When modifying the template, import [] to clear regions. The template region information remains unchanged if not imported.</p>
     */
    public MPSEraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set <p>Designate the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: When modifying the template, import [] to clear regions. The template region information remains unchanged if not imported.</p>
     * @param CustomAreas <p>Designate the removal of custom regions. For specified regions, directly perform erasure without detection and recognition within a selected time range. Note: When modifying the template, import [] to clear regions. The template region information remains unchanged if not imported.</p>
     */
    public void setCustomAreas(MPSEraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    public MPSUpdateSmartEraseSubtitleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSUpdateSmartEraseSubtitleConfig(MPSUpdateSmartEraseSubtitleConfig source) {
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
            this.AutoAreas = new MPSEraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new MPSEraseArea(source.AutoAreas[i]);
            }
        }
        if (source.CustomAreas != null) {
            this.CustomAreas = new MPSEraseTimeArea[source.CustomAreas.length];
            for (int i = 0; i < source.CustomAreas.length; i++) {
                this.CustomAreas[i] = new MPSEraseTimeArea(source.CustomAreas[i]);
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

