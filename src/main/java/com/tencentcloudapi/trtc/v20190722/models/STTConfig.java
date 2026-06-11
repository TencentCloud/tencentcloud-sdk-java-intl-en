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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class STTConfig extends AbstractModel {

    /**
    * Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

- "zh": chinese (simplified).
- "zh-TW": chinese (traditional).
- "en": english.
- "zh-yue": cantonese in china.
- "vi": "vietnamese.".
- "ja": "japanese.".
- "ko": "korean.".
- "id": "indonesian".
- "th": thai.
- "pt": portuguese.
- "tr": "turkish.".
- "ar": "arabic".
- "es": "spanish".
- "hi": "hindi".
- "ft": "french.".
- "ms": malay.
- "fil": filipino.
- "de": german.
-`it`: italian.
- "ru": russian.
- "sv": "swedish.".
- "da": "danish.".
- "no": norwegian.
- "pl": polski.
-"af-ZA": afrikaans.
- "nl-NL": dutch.
- "nl-BE": flemish.
- "uz": uzbek.
- "hu": hungarian.
- "he": hebrew.
- "ur": urdu.

**Note**:.
If the language you need is not available, contact our technical staff.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * **Fuzzy recognition is an advanced edition capacity, charged by default as the advanced edition.**.
    */
    @SerializedName("AlternativeLanguage")
    @Expose
    private String [] AlternativeLanguage;

    /**
    * Custom parameter. contact for background usage.

    */
    @SerializedName("CustomParam")
    @Expose
    private String CustomParam;

    /**
    * Specifies the time when automatic speech recognition (asr) vad is active. value range: 240-2000. default: 1000. unit: ms. a smaller value enables faster speech recognition sentence segmentation.
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
    * The vad far-field voice suppression capacity (without impacting asr recognition performance) ranges from 0 to 5, with a default value of 0, indicating disabled far-field voice suppression. the recommended setting is 2 for better far-field voice suppression. in a noisy office environment, it can be set to 3, and in more noisy environments, 4 and 5 are available for use. note that a higher VadLevel may suppress single words as noise.
    */
    @SerializedName("VadLevel")
    @Expose
    private Long VadLevel;

    /**
     * Get Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

- "zh": chinese (simplified).
- "zh-TW": chinese (traditional).
- "en": english.
- "zh-yue": cantonese in china.
- "vi": "vietnamese.".
- "ja": "japanese.".
- "ko": "korean.".
- "id": "indonesian".
- "th": thai.
- "pt": portuguese.
- "tr": "turkish.".
- "ar": "arabic".
- "es": "spanish".
- "hi": "hindi".
- "ft": "french.".
- "ms": malay.
- "fil": filipino.
- "de": german.
-`it`: italian.
- "ru": russian.
- "sv": "swedish.".
- "da": "danish.".
- "no": norwegian.
- "pl": polski.
-"af-ZA": afrikaans.
- "nl-NL": dutch.
- "nl-BE": flemish.
- "uz": uzbek.
- "hu": hungarian.
- "he": hebrew.
- "ur": urdu.

**Note**:.
If the language you need is not available, contact our technical staff. 
     * @return Language Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

- "zh": chinese (simplified).
- "zh-TW": chinese (traditional).
- "en": english.
- "zh-yue": cantonese in china.
- "vi": "vietnamese.".
- "ja": "japanese.".
- "ko": "korean.".
- "id": "indonesian".
- "th": thai.
- "pt": portuguese.
- "tr": "turkish.".
- "ar": "arabic".
- "es": "spanish".
- "hi": "hindi".
- "ft": "french.".
- "ms": malay.
- "fil": filipino.
- "de": german.
-`it`: italian.
- "ru": russian.
- "sv": "swedish.".
- "da": "danish.".
- "no": norwegian.
- "pl": polski.
-"af-ZA": afrikaans.
- "nl-NL": dutch.
- "nl-BE": flemish.
- "uz": uzbek.
- "hu": hungarian.
- "he": hebrew.
- "ur": urdu.

**Note**:.
If the language you need is not available, contact our technical staff.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

- "zh": chinese (simplified).
- "zh-TW": chinese (traditional).
- "en": english.
- "zh-yue": cantonese in china.
- "vi": "vietnamese.".
- "ja": "japanese.".
- "ko": "korean.".
- "id": "indonesian".
- "th": thai.
- "pt": portuguese.
- "tr": "turkish.".
- "ar": "arabic".
- "es": "spanish".
- "hi": "hindi".
- "ft": "french.".
- "ms": malay.
- "fil": filipino.
- "de": german.
-`it`: italian.
- "ru": russian.
- "sv": "swedish.".
- "da": "danish.".
- "no": norwegian.
- "pl": polski.
-"af-ZA": afrikaans.
- "nl-NL": dutch.
- "nl-BE": flemish.
- "uz": uzbek.
- "hu": hungarian.
- "he": hebrew.
- "ur": urdu.

**Note**:.
If the language you need is not available, contact our technical staff.
     * @param Language Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

- "zh": chinese (simplified).
- "zh-TW": chinese (traditional).
- "en": english.
- "zh-yue": cantonese in china.
- "vi": "vietnamese.".
- "ja": "japanese.".
- "ko": "korean.".
- "id": "indonesian".
- "th": thai.
- "pt": portuguese.
- "tr": "turkish.".
- "ar": "arabic".
- "es": "spanish".
- "hi": "hindi".
- "ft": "french.".
- "ms": malay.
- "fil": filipino.
- "de": german.
-`it`: italian.
- "ru": russian.
- "sv": "swedish.".
- "da": "danish.".
- "no": norwegian.
- "pl": polski.
-"af-ZA": afrikaans.
- "nl-NL": dutch.
- "nl-BE": flemish.
- "uz": uzbek.
- "hu": hungarian.
- "he": hebrew.
- "ur": urdu.

**Note**:.
If the language you need is not available, contact our technical staff.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get **Fuzzy recognition is an advanced edition capacity, charged by default as the advanced edition.**. 
     * @return AlternativeLanguage **Fuzzy recognition is an advanced edition capacity, charged by default as the advanced edition.**.
     */
    public String [] getAlternativeLanguage() {
        return this.AlternativeLanguage;
    }

    /**
     * Set **Fuzzy recognition is an advanced edition capacity, charged by default as the advanced edition.**.
     * @param AlternativeLanguage **Fuzzy recognition is an advanced edition capacity, charged by default as the advanced edition.**.
     */
    public void setAlternativeLanguage(String [] AlternativeLanguage) {
        this.AlternativeLanguage = AlternativeLanguage;
    }

    /**
     * Get Custom parameter. contact for background usage.
 
     * @return CustomParam Custom parameter. contact for background usage.

     */
    public String getCustomParam() {
        return this.CustomParam;
    }

    /**
     * Set Custom parameter. contact for background usage.

     * @param CustomParam Custom parameter. contact for background usage.

     */
    public void setCustomParam(String CustomParam) {
        this.CustomParam = CustomParam;
    }

    /**
     * Get Specifies the time when automatic speech recognition (asr) vad is active. value range: 240-2000. default: 1000. unit: ms. a smaller value enables faster speech recognition sentence segmentation. 
     * @return VadSilenceTime Specifies the time when automatic speech recognition (asr) vad is active. value range: 240-2000. default: 1000. unit: ms. a smaller value enables faster speech recognition sentence segmentation.
     */
    public Long getVadSilenceTime() {
        return this.VadSilenceTime;
    }

    /**
     * Set Specifies the time when automatic speech recognition (asr) vad is active. value range: 240-2000. default: 1000. unit: ms. a smaller value enables faster speech recognition sentence segmentation.
     * @param VadSilenceTime Specifies the time when automatic speech recognition (asr) vad is active. value range: 240-2000. default: 1000. unit: ms. a smaller value enables faster speech recognition sentence segmentation.
     */
    public void setVadSilenceTime(Long VadSilenceTime) {
        this.VadSilenceTime = VadSilenceTime;
    }

    /**
     * Get The vad far-field voice suppression capacity (without impacting asr recognition performance) ranges from 0 to 5, with a default value of 0, indicating disabled far-field voice suppression. the recommended setting is 2 for better far-field voice suppression. in a noisy office environment, it can be set to 3, and in more noisy environments, 4 and 5 are available for use. note that a higher VadLevel may suppress single words as noise. 
     * @return VadLevel The vad far-field voice suppression capacity (without impacting asr recognition performance) ranges from 0 to 5, with a default value of 0, indicating disabled far-field voice suppression. the recommended setting is 2 for better far-field voice suppression. in a noisy office environment, it can be set to 3, and in more noisy environments, 4 and 5 are available for use. note that a higher VadLevel may suppress single words as noise.
     */
    public Long getVadLevel() {
        return this.VadLevel;
    }

    /**
     * Set The vad far-field voice suppression capacity (without impacting asr recognition performance) ranges from 0 to 5, with a default value of 0, indicating disabled far-field voice suppression. the recommended setting is 2 for better far-field voice suppression. in a noisy office environment, it can be set to 3, and in more noisy environments, 4 and 5 are available for use. note that a higher VadLevel may suppress single words as noise.
     * @param VadLevel The vad far-field voice suppression capacity (without impacting asr recognition performance) ranges from 0 to 5, with a default value of 0, indicating disabled far-field voice suppression. the recommended setting is 2 for better far-field voice suppression. in a noisy office environment, it can be set to 3, and in more noisy environments, 4 and 5 are available for use. note that a higher VadLevel may suppress single words as noise.
     */
    public void setVadLevel(Long VadLevel) {
        this.VadLevel = VadLevel;
    }

    public STTConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public STTConfig(STTConfig source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.AlternativeLanguage != null) {
            this.AlternativeLanguage = new String[source.AlternativeLanguage.length];
            for (int i = 0; i < source.AlternativeLanguage.length; i++) {
                this.AlternativeLanguage[i] = new String(source.AlternativeLanguage[i]);
            }
        }
        if (source.CustomParam != null) {
            this.CustomParam = new String(source.CustomParam);
        }
        if (source.VadSilenceTime != null) {
            this.VadSilenceTime = new Long(source.VadSilenceTime);
        }
        if (source.VadLevel != null) {
            this.VadLevel = new Long(source.VadLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamArraySimple(map, prefix + "AlternativeLanguage.", this.AlternativeLanguage);
        this.setParamSimple(map, prefix + "CustomParam", this.CustomParam);
        this.setParamSimple(map, prefix + "VadSilenceTime", this.VadSilenceTime);
        this.setParamSimple(map, prefix + "VadLevel", this.VadLevel);

    }
}

