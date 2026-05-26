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

public class RecognizeConfig extends AbstractModel {

    /**
    * Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

Basic language engine:.
-"zh": chinese (simplified).

**Standard language engine:**.
-"8k_zh_large": engine (large model version) for telecommunication. the current model supports chinese and other language recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for telephone audio in various scenarios and chinese dialects.
-"16k_zh_large": large model engine for mandarin, chinese dialects, and english. the current model supports language recognition for chinese, english, and multiple chinese dialects. it has a large number of parameters and enhanced language model performance, targeting low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away with greatly improved recognition accuracy.
-"16k_zh_en": chinese-english large model engine. the current model simultaneously supports chinese and english recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away.

**Advanced language engine:**.
-"zh-dialect": chinese dialect.
-"zh-yue": cantonese in china.
-"Vi": "vietnamese.".
-"Ja": "japanese.".
-"Ko": "korean.".
-"id": "indonesian".
-"Th": thai.
-"pt": portuguese.
-"tr": "turkish.".
-"Ar": "arabic".
-"es": "spanish".
-"Hi": "hindi".
-"Fr": "french.".
-"ms": malay.
-"Fil": filipino.
-"de": german.
-`It`: italian.
-"Ru": russian.
-"sv": "swedish.".
-"Da": "danish.".
-"No": norwegian.

**Note**:.
If the language you need is not available, contact our technical staff.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * **Fuzzy recognition is an advanced edition capacity, charged as advanced edition by default, and only supports filling in basic version and advanced edition language.**.
Note: does not support entering "zh-dialect".
    */
    @SerializedName("AlternativeLanguage")
    @Expose
    private String [] AlternativeLanguage;

    /**
    * Hot word list: this parameter is used for improving recognition accuracy. each hot word is limited to "term|weight", with no more than 30 characters (a maximum of 10 chinese characters) per term. weight ranges from 1 to 11 or 100, for example: "tencent cloud|5" or "ASR|11". hot word list limitation: multiple terms separated by commas, supports up to 300 hot words, for example: "tencent cloud|10, speech recognition|5, ASR|11".
    */
    @SerializedName("HotWordList")
    @Expose
    private String HotWordList;

    /**
    * Specifies the time when automatic speech recognition (asr) vad is active. value range: 240-2000. default: 1000. unit: ms. a smaller value enables faster speech recognition sentence segmentation.
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
    * The vad far-field voice suppression capacity (does not impact asr recognition performance) ranges from 0 to 3, with a default value of 0. recommended setting is 2 for better far-field voice suppression.
    */
    @SerializedName("VadLevel")
    @Expose
    private Long VadLevel;

    /**
     * Get Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

Basic language engine:.
-"zh": chinese (simplified).

**Standard language engine:**.
-"8k_zh_large": engine (large model version) for telecommunication. the current model supports chinese and other language recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for telephone audio in various scenarios and chinese dialects.
-"16k_zh_large": large model engine for mandarin, chinese dialects, and english. the current model supports language recognition for chinese, english, and multiple chinese dialects. it has a large number of parameters and enhanced language model performance, targeting low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away with greatly improved recognition accuracy.
-"16k_zh_en": chinese-english large model engine. the current model simultaneously supports chinese and english recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away.

**Advanced language engine:**.
-"zh-dialect": chinese dialect.
-"zh-yue": cantonese in china.
-"Vi": "vietnamese.".
-"Ja": "japanese.".
-"Ko": "korean.".
-"id": "indonesian".
-"Th": thai.
-"pt": portuguese.
-"tr": "turkish.".
-"Ar": "arabic".
-"es": "spanish".
-"Hi": "hindi".
-"Fr": "french.".
-"ms": malay.
-"Fil": filipino.
-"de": german.
-`It`: italian.
-"Ru": russian.
-"sv": "swedish.".
-"Da": "danish.".
-"No": norwegian.

**Note**:.
If the language you need is not available, contact our technical staff. 
     * @return Language Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

Basic language engine:.
-"zh": chinese (simplified).

**Standard language engine:**.
-"8k_zh_large": engine (large model version) for telecommunication. the current model supports chinese and other language recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for telephone audio in various scenarios and chinese dialects.
-"16k_zh_large": large model engine for mandarin, chinese dialects, and english. the current model supports language recognition for chinese, english, and multiple chinese dialects. it has a large number of parameters and enhanced language model performance, targeting low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away with greatly improved recognition accuracy.
-"16k_zh_en": chinese-english large model engine. the current model simultaneously supports chinese and english recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away.

**Advanced language engine:**.
-"zh-dialect": chinese dialect.
-"zh-yue": cantonese in china.
-"Vi": "vietnamese.".
-"Ja": "japanese.".
-"Ko": "korean.".
-"id": "indonesian".
-"Th": thai.
-"pt": portuguese.
-"tr": "turkish.".
-"Ar": "arabic".
-"es": "spanish".
-"Hi": "hindi".
-"Fr": "french.".
-"ms": malay.
-"Fil": filipino.
-"de": german.
-`It`: italian.
-"Ru": russian.
-"sv": "swedish.".
-"Da": "danish.".
-"No": norwegian.

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

Basic language engine:.
-"zh": chinese (simplified).

**Standard language engine:**.
-"8k_zh_large": engine (large model version) for telecommunication. the current model supports chinese and other language recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for telephone audio in various scenarios and chinese dialects.
-"16k_zh_large": large model engine for mandarin, chinese dialects, and english. the current model supports language recognition for chinese, english, and multiple chinese dialects. it has a large number of parameters and enhanced language model performance, targeting low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away with greatly improved recognition accuracy.
-"16k_zh_en": chinese-english large model engine. the current model simultaneously supports chinese and english recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away.

**Advanced language engine:**.
-"zh-dialect": chinese dialect.
-"zh-yue": cantonese in china.
-"Vi": "vietnamese.".
-"Ja": "japanese.".
-"Ko": "korean.".
-"id": "indonesian".
-"Th": thai.
-"pt": portuguese.
-"tr": "turkish.".
-"Ar": "arabic".
-"es": "spanish".
-"Hi": "hindi".
-"Fr": "french.".
-"ms": malay.
-"Fil": filipino.
-"de": german.
-`It`: italian.
-"Ru": russian.
-"sv": "swedish.".
-"Da": "danish.".
-"No": norwegian.

**Note**:.
If the language you need is not available, contact our technical staff.
     * @param Language Convert speech to text supported languages, "zh" chinese is selected by default.

You can unlock different languages by purchasing the "AI intelligent recognition duration package" or claiming the trial version of the monthly subscription package. 

Supported languages for different speech to text package versions are as follows:.

Basic language engine:.
-"zh": chinese (simplified).

**Standard language engine:**.
-"8k_zh_large": engine (large model version) for telecommunication. the current model supports chinese and other language recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for telephone audio in various scenarios and chinese dialects.
-"16k_zh_large": large model engine for mandarin, chinese dialects, and english. the current model supports language recognition for chinese, english, and multiple chinese dialects. it has a large number of parameters and enhanced language model performance, targeting low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away with greatly improved recognition accuracy.
-"16k_zh_en": chinese-english large model engine. the current model simultaneously supports chinese and english recognition, has a large number of parameters, and features language model performance enhancement. it greatly improves recognition accuracy for low-quality audio such as loud noise, strong echo, low voice volume, and voice from far away.

**Advanced language engine:**.
-"zh-dialect": chinese dialect.
-"zh-yue": cantonese in china.
-"Vi": "vietnamese.".
-"Ja": "japanese.".
-"Ko": "korean.".
-"id": "indonesian".
-"Th": thai.
-"pt": portuguese.
-"tr": "turkish.".
-"Ar": "arabic".
-"es": "spanish".
-"Hi": "hindi".
-"Fr": "french.".
-"ms": malay.
-"Fil": filipino.
-"de": german.
-`It`: italian.
-"Ru": russian.
-"sv": "swedish.".
-"Da": "danish.".
-"No": norwegian.

**Note**:.
If the language you need is not available, contact our technical staff.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get **Fuzzy recognition is an advanced edition capacity, charged as advanced edition by default, and only supports filling in basic version and advanced edition language.**.
Note: does not support entering "zh-dialect". 
     * @return AlternativeLanguage **Fuzzy recognition is an advanced edition capacity, charged as advanced edition by default, and only supports filling in basic version and advanced edition language.**.
Note: does not support entering "zh-dialect".
     */
    public String [] getAlternativeLanguage() {
        return this.AlternativeLanguage;
    }

    /**
     * Set **Fuzzy recognition is an advanced edition capacity, charged as advanced edition by default, and only supports filling in basic version and advanced edition language.**.
Note: does not support entering "zh-dialect".
     * @param AlternativeLanguage **Fuzzy recognition is an advanced edition capacity, charged as advanced edition by default, and only supports filling in basic version and advanced edition language.**.
Note: does not support entering "zh-dialect".
     */
    public void setAlternativeLanguage(String [] AlternativeLanguage) {
        this.AlternativeLanguage = AlternativeLanguage;
    }

    /**
     * Get Hot word list: this parameter is used for improving recognition accuracy. each hot word is limited to "term|weight", with no more than 30 characters (a maximum of 10 chinese characters) per term. weight ranges from 1 to 11 or 100, for example: "tencent cloud|5" or "ASR|11". hot word list limitation: multiple terms separated by commas, supports up to 300 hot words, for example: "tencent cloud|10, speech recognition|5, ASR|11". 
     * @return HotWordList Hot word list: this parameter is used for improving recognition accuracy. each hot word is limited to "term|weight", with no more than 30 characters (a maximum of 10 chinese characters) per term. weight ranges from 1 to 11 or 100, for example: "tencent cloud|5" or "ASR|11". hot word list limitation: multiple terms separated by commas, supports up to 300 hot words, for example: "tencent cloud|10, speech recognition|5, ASR|11".
     */
    public String getHotWordList() {
        return this.HotWordList;
    }

    /**
     * Set Hot word list: this parameter is used for improving recognition accuracy. each hot word is limited to "term|weight", with no more than 30 characters (a maximum of 10 chinese characters) per term. weight ranges from 1 to 11 or 100, for example: "tencent cloud|5" or "ASR|11". hot word list limitation: multiple terms separated by commas, supports up to 300 hot words, for example: "tencent cloud|10, speech recognition|5, ASR|11".
     * @param HotWordList Hot word list: this parameter is used for improving recognition accuracy. each hot word is limited to "term|weight", with no more than 30 characters (a maximum of 10 chinese characters) per term. weight ranges from 1 to 11 or 100, for example: "tencent cloud|5" or "ASR|11". hot word list limitation: multiple terms separated by commas, supports up to 300 hot words, for example: "tencent cloud|10, speech recognition|5, ASR|11".
     */
    public void setHotWordList(String HotWordList) {
        this.HotWordList = HotWordList;
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
     * Get The vad far-field voice suppression capacity (does not impact asr recognition performance) ranges from 0 to 3, with a default value of 0. recommended setting is 2 for better far-field voice suppression. 
     * @return VadLevel The vad far-field voice suppression capacity (does not impact asr recognition performance) ranges from 0 to 3, with a default value of 0. recommended setting is 2 for better far-field voice suppression.
     */
    public Long getVadLevel() {
        return this.VadLevel;
    }

    /**
     * Set The vad far-field voice suppression capacity (does not impact asr recognition performance) ranges from 0 to 3, with a default value of 0. recommended setting is 2 for better far-field voice suppression.
     * @param VadLevel The vad far-field voice suppression capacity (does not impact asr recognition performance) ranges from 0 to 3, with a default value of 0. recommended setting is 2 for better far-field voice suppression.
     */
    public void setVadLevel(Long VadLevel) {
        this.VadLevel = VadLevel;
    }

    public RecognizeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeConfig(RecognizeConfig source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.AlternativeLanguage != null) {
            this.AlternativeLanguage = new String[source.AlternativeLanguage.length];
            for (int i = 0; i < source.AlternativeLanguage.length; i++) {
                this.AlternativeLanguage[i] = new String(source.AlternativeLanguage[i]);
            }
        }
        if (source.HotWordList != null) {
            this.HotWordList = new String(source.HotWordList);
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
        this.setParamSimple(map, prefix + "HotWordList", this.HotWordList);
        this.setParamSimple(map, prefix + "VadSilenceTime", this.VadSilenceTime);
        this.setParamSimple(map, prefix + "VadLevel", this.VadLevel);

    }
}

