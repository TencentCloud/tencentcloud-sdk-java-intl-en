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

public class AsrParam extends AbstractModel {

    /**
    * The model type used for the transcription service. Example: <code>"zh"</code>.

Supported languages for speech-to-text:

- <code>"zh"</code>: Chinese (Simplified) - Powered by the latest 16k large model engine. Supports Mandarin, English, multiple Chinese regional accents, and code-switching between Chinese and English.
- <code>"zh-TW"</code>: Chinese (Traditional)
- <code>"en"</code>: English
- <code>"vi"</code>: Vietnamese
- <code>"ja"</code>: Japanese
- <code>"ko"</code>: Korean
- <code>"id"</code>: Indonesian
- <code>"th"</code>: Thai
- <code>"pt"</code>: Portuguese
- <code>"tr"</code>: Turkish
- <code>"ar"</code>: Arabic
- <code>"es"</code>: Spanish
- <code>"hi"</code>: Hindi
- <code>"fr"</code>: French
- <code>"ms"</code>: Malay
- <code>"fil"</code>: Filipino
- <code>"de"</code>: German
- <code>"it"</code>: Italian
- <code>"ru"</code>: Russian
- <code>"sv"</code>: Swedish
- <code>"da"</code>: Danish
- <code>"no"</code>: Norwegian

> **Note:** If the language you need is not listed, please contact our support team.
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * The time for speech recognition vad ranges (ms) from 240 to 2000, with a default of 1000. A smaller value enables faster sentence segmentation in speech recognition.Example value: 1000.
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
    * Temporary hotword list: This parameter is used for improving recognition accuracy.

- Hotword limit: "hotword|weight". Each hotword contains no more than 30 characters (10 Chinese characters max). Weight ranges from 1 to 11 or 100, for example: "Tencent Cloud|5" or "ASR|11".
- Restrictions for the temporary term list: multiple terms separated by commas, supports up to 128 terms, for example: "Tencent Cloud|10,speech recognition|5,ASR|11".

> Note:
- When the hotword weight is set to 11, the current hotword will be upgraded to a super term. It is advisable to only set important and must-effective hotwords to 11. Setting too many hotwords with weight 11 will affect overall accuracy.
- When a hotword weight is set to 100, the hotword enhancement feature forces an exact match replacement: any recognized word that is a homophone of the configured hotword will be replaced with the hotword in the transcription output. 
- For example, if the hotword Lyft|100 is configured, the word lift, which is phonetically identical, will always be transcribed as Lyft. 
- Use this feature with caution. Only assign a weight of 100 to hotwords that are business-critical and must always appear verbatim in the output. Overuse of weight 100 hotwords may degrade overall transcription accuracy.
- Hot words cannot contain spaces, for example: ASR Tencent Cloud
- Example value: voice assistant|10
    */
    @SerializedName("HotWordList")
    @Expose
    private String HotWordList;

    /**
    * Fuzzy language detection is an advanced function, which is billed at the Advanced tier rate by default. Only Advanced tier languages are supported, excluding zh-dialect and zh-yue. Note: A maximum of 4 languages can be specified.

    */
    @SerializedName("AlternativeLanguage")
    @Expose
    private String [] AlternativeLanguage;

    /**
    * vad far-field voice suppression capacity (does not impact asr recognition accuracy), range [0, 3], default is 0. Recommended setting is 2 for better far-field voice suppression.
    */
    @SerializedName("VadLevel")
    @Expose
    private Long VadLevel;

    /**
    * Whether to filter out dirty words (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.
0: Not filtering; 1: Filter out dirty words; 2: Replace dirty words with "*".
    */
    @SerializedName("FilterDirty")
    @Expose
    private Long FilterDirty;

    /**
    * Whether to filter filler words (currently only support basic language engine and standard language engine). Range:  [0, 2]. Default value 0.
0:No filtering; 1: Partial filtering; 2: Strict filtering.
    */
    @SerializedName("FilterModal")
    @Expose
    private Long FilterModal;

    /**
    * Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.
0: Do not filter out periods at the end of sentences; 1: Filter out periods at the end of sentences.
    */
    @SerializedName("FilterPunc")
    @Expose
    private Long FilterPunc;

    /**
     * Get The model type used for the transcription service. Example: <code>"zh"</code>.

Supported languages for speech-to-text:

- <code>"zh"</code>: Chinese (Simplified) - Powered by the latest 16k large model engine. Supports Mandarin, English, multiple Chinese regional accents, and code-switching between Chinese and English.
- <code>"zh-TW"</code>: Chinese (Traditional)
- <code>"en"</code>: English
- <code>"vi"</code>: Vietnamese
- <code>"ja"</code>: Japanese
- <code>"ko"</code>: Korean
- <code>"id"</code>: Indonesian
- <code>"th"</code>: Thai
- <code>"pt"</code>: Portuguese
- <code>"tr"</code>: Turkish
- <code>"ar"</code>: Arabic
- <code>"es"</code>: Spanish
- <code>"hi"</code>: Hindi
- <code>"fr"</code>: French
- <code>"ms"</code>: Malay
- <code>"fil"</code>: Filipino
- <code>"de"</code>: German
- <code>"it"</code>: Italian
- <code>"ru"</code>: Russian
- <code>"sv"</code>: Swedish
- <code>"da"</code>: Danish
- <code>"no"</code>: Norwegian

> **Note:** If the language you need is not listed, please contact our support team. 
     * @return Lang The model type used for the transcription service. Example: <code>"zh"</code>.

Supported languages for speech-to-text:

- <code>"zh"</code>: Chinese (Simplified) - Powered by the latest 16k large model engine. Supports Mandarin, English, multiple Chinese regional accents, and code-switching between Chinese and English.
- <code>"zh-TW"</code>: Chinese (Traditional)
- <code>"en"</code>: English
- <code>"vi"</code>: Vietnamese
- <code>"ja"</code>: Japanese
- <code>"ko"</code>: Korean
- <code>"id"</code>: Indonesian
- <code>"th"</code>: Thai
- <code>"pt"</code>: Portuguese
- <code>"tr"</code>: Turkish
- <code>"ar"</code>: Arabic
- <code>"es"</code>: Spanish
- <code>"hi"</code>: Hindi
- <code>"fr"</code>: French
- <code>"ms"</code>: Malay
- <code>"fil"</code>: Filipino
- <code>"de"</code>: German
- <code>"it"</code>: Italian
- <code>"ru"</code>: Russian
- <code>"sv"</code>: Swedish
- <code>"da"</code>: Danish
- <code>"no"</code>: Norwegian

> **Note:** If the language you need is not listed, please contact our support team.
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set The model type used for the transcription service. Example: <code>"zh"</code>.

Supported languages for speech-to-text:

- <code>"zh"</code>: Chinese (Simplified) - Powered by the latest 16k large model engine. Supports Mandarin, English, multiple Chinese regional accents, and code-switching between Chinese and English.
- <code>"zh-TW"</code>: Chinese (Traditional)
- <code>"en"</code>: English
- <code>"vi"</code>: Vietnamese
- <code>"ja"</code>: Japanese
- <code>"ko"</code>: Korean
- <code>"id"</code>: Indonesian
- <code>"th"</code>: Thai
- <code>"pt"</code>: Portuguese
- <code>"tr"</code>: Turkish
- <code>"ar"</code>: Arabic
- <code>"es"</code>: Spanish
- <code>"hi"</code>: Hindi
- <code>"fr"</code>: French
- <code>"ms"</code>: Malay
- <code>"fil"</code>: Filipino
- <code>"de"</code>: German
- <code>"it"</code>: Italian
- <code>"ru"</code>: Russian
- <code>"sv"</code>: Swedish
- <code>"da"</code>: Danish
- <code>"no"</code>: Norwegian

> **Note:** If the language you need is not listed, please contact our support team.
     * @param Lang The model type used for the transcription service. Example: <code>"zh"</code>.

Supported languages for speech-to-text:

- <code>"zh"</code>: Chinese (Simplified) - Powered by the latest 16k large model engine. Supports Mandarin, English, multiple Chinese regional accents, and code-switching between Chinese and English.
- <code>"zh-TW"</code>: Chinese (Traditional)
- <code>"en"</code>: English
- <code>"vi"</code>: Vietnamese
- <code>"ja"</code>: Japanese
- <code>"ko"</code>: Korean
- <code>"id"</code>: Indonesian
- <code>"th"</code>: Thai
- <code>"pt"</code>: Portuguese
- <code>"tr"</code>: Turkish
- <code>"ar"</code>: Arabic
- <code>"es"</code>: Spanish
- <code>"hi"</code>: Hindi
- <code>"fr"</code>: French
- <code>"ms"</code>: Malay
- <code>"fil"</code>: Filipino
- <code>"de"</code>: German
- <code>"it"</code>: Italian
- <code>"ru"</code>: Russian
- <code>"sv"</code>: Swedish
- <code>"da"</code>: Danish
- <code>"no"</code>: Norwegian

> **Note:** If the language you need is not listed, please contact our support team.
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get The time for speech recognition vad ranges (ms) from 240 to 2000, with a default of 1000. A smaller value enables faster sentence segmentation in speech recognition.Example value: 1000. 
     * @return VadSilenceTime The time for speech recognition vad ranges (ms) from 240 to 2000, with a default of 1000. A smaller value enables faster sentence segmentation in speech recognition.Example value: 1000.
     */
    public Long getVadSilenceTime() {
        return this.VadSilenceTime;
    }

    /**
     * Set The time for speech recognition vad ranges (ms) from 240 to 2000, with a default of 1000. A smaller value enables faster sentence segmentation in speech recognition.Example value: 1000.
     * @param VadSilenceTime The time for speech recognition vad ranges (ms) from 240 to 2000, with a default of 1000. A smaller value enables faster sentence segmentation in speech recognition.Example value: 1000.
     */
    public void setVadSilenceTime(Long VadSilenceTime) {
        this.VadSilenceTime = VadSilenceTime;
    }

    /**
     * Get Temporary hotword list: This parameter is used for improving recognition accuracy.

- Hotword limit: "hotword|weight". Each hotword contains no more than 30 characters (10 Chinese characters max). Weight ranges from 1 to 11 or 100, for example: "Tencent Cloud|5" or "ASR|11".
- Restrictions for the temporary term list: multiple terms separated by commas, supports up to 128 terms, for example: "Tencent Cloud|10,speech recognition|5,ASR|11".

> Note:
- When the hotword weight is set to 11, the current hotword will be upgraded to a super term. It is advisable to only set important and must-effective hotwords to 11. Setting too many hotwords with weight 11 will affect overall accuracy.
- When a hotword weight is set to 100, the hotword enhancement feature forces an exact match replacement: any recognized word that is a homophone of the configured hotword will be replaced with the hotword in the transcription output. 
- For example, if the hotword Lyft|100 is configured, the word lift, which is phonetically identical, will always be transcribed as Lyft. 
- Use this feature with caution. Only assign a weight of 100 to hotwords that are business-critical and must always appear verbatim in the output. Overuse of weight 100 hotwords may degrade overall transcription accuracy.
- Hot words cannot contain spaces, for example: ASR Tencent Cloud
- Example value: voice assistant|10 
     * @return HotWordList Temporary hotword list: This parameter is used for improving recognition accuracy.

- Hotword limit: "hotword|weight". Each hotword contains no more than 30 characters (10 Chinese characters max). Weight ranges from 1 to 11 or 100, for example: "Tencent Cloud|5" or "ASR|11".
- Restrictions for the temporary term list: multiple terms separated by commas, supports up to 128 terms, for example: "Tencent Cloud|10,speech recognition|5,ASR|11".

> Note:
- When the hotword weight is set to 11, the current hotword will be upgraded to a super term. It is advisable to only set important and must-effective hotwords to 11. Setting too many hotwords with weight 11 will affect overall accuracy.
- When a hotword weight is set to 100, the hotword enhancement feature forces an exact match replacement: any recognized word that is a homophone of the configured hotword will be replaced with the hotword in the transcription output. 
- For example, if the hotword Lyft|100 is configured, the word lift, which is phonetically identical, will always be transcribed as Lyft. 
- Use this feature with caution. Only assign a weight of 100 to hotwords that are business-critical and must always appear verbatim in the output. Overuse of weight 100 hotwords may degrade overall transcription accuracy.
- Hot words cannot contain spaces, for example: ASR Tencent Cloud
- Example value: voice assistant|10
     */
    public String getHotWordList() {
        return this.HotWordList;
    }

    /**
     * Set Temporary hotword list: This parameter is used for improving recognition accuracy.

- Hotword limit: "hotword|weight". Each hotword contains no more than 30 characters (10 Chinese characters max). Weight ranges from 1 to 11 or 100, for example: "Tencent Cloud|5" or "ASR|11".
- Restrictions for the temporary term list: multiple terms separated by commas, supports up to 128 terms, for example: "Tencent Cloud|10,speech recognition|5,ASR|11".

> Note:
- When the hotword weight is set to 11, the current hotword will be upgraded to a super term. It is advisable to only set important and must-effective hotwords to 11. Setting too many hotwords with weight 11 will affect overall accuracy.
- When a hotword weight is set to 100, the hotword enhancement feature forces an exact match replacement: any recognized word that is a homophone of the configured hotword will be replaced with the hotword in the transcription output. 
- For example, if the hotword Lyft|100 is configured, the word lift, which is phonetically identical, will always be transcribed as Lyft. 
- Use this feature with caution. Only assign a weight of 100 to hotwords that are business-critical and must always appear verbatim in the output. Overuse of weight 100 hotwords may degrade overall transcription accuracy.
- Hot words cannot contain spaces, for example: ASR Tencent Cloud
- Example value: voice assistant|10
     * @param HotWordList Temporary hotword list: This parameter is used for improving recognition accuracy.

- Hotword limit: "hotword|weight". Each hotword contains no more than 30 characters (10 Chinese characters max). Weight ranges from 1 to 11 or 100, for example: "Tencent Cloud|5" or "ASR|11".
- Restrictions for the temporary term list: multiple terms separated by commas, supports up to 128 terms, for example: "Tencent Cloud|10,speech recognition|5,ASR|11".

> Note:
- When the hotword weight is set to 11, the current hotword will be upgraded to a super term. It is advisable to only set important and must-effective hotwords to 11. Setting too many hotwords with weight 11 will affect overall accuracy.
- When a hotword weight is set to 100, the hotword enhancement feature forces an exact match replacement: any recognized word that is a homophone of the configured hotword will be replaced with the hotword in the transcription output. 
- For example, if the hotword Lyft|100 is configured, the word lift, which is phonetically identical, will always be transcribed as Lyft. 
- Use this feature with caution. Only assign a weight of 100 to hotwords that are business-critical and must always appear verbatim in the output. Overuse of weight 100 hotwords may degrade overall transcription accuracy.
- Hot words cannot contain spaces, for example: ASR Tencent Cloud
- Example value: voice assistant|10
     */
    public void setHotWordList(String HotWordList) {
        this.HotWordList = HotWordList;
    }

    /**
     * Get Fuzzy language detection is an advanced function, which is billed at the Advanced tier rate by default. Only Advanced tier languages are supported, excluding zh-dialect and zh-yue. Note: A maximum of 4 languages can be specified.
 
     * @return AlternativeLanguage Fuzzy language detection is an advanced function, which is billed at the Advanced tier rate by default. Only Advanced tier languages are supported, excluding zh-dialect and zh-yue. Note: A maximum of 4 languages can be specified.

     */
    public String [] getAlternativeLanguage() {
        return this.AlternativeLanguage;
    }

    /**
     * Set Fuzzy language detection is an advanced function, which is billed at the Advanced tier rate by default. Only Advanced tier languages are supported, excluding zh-dialect and zh-yue. Note: A maximum of 4 languages can be specified.

     * @param AlternativeLanguage Fuzzy language detection is an advanced function, which is billed at the Advanced tier rate by default. Only Advanced tier languages are supported, excluding zh-dialect and zh-yue. Note: A maximum of 4 languages can be specified.

     */
    public void setAlternativeLanguage(String [] AlternativeLanguage) {
        this.AlternativeLanguage = AlternativeLanguage;
    }

    /**
     * Get vad far-field voice suppression capacity (does not impact asr recognition accuracy), range [0, 3], default is 0. Recommended setting is 2 for better far-field voice suppression. 
     * @return VadLevel vad far-field voice suppression capacity (does not impact asr recognition accuracy), range [0, 3], default is 0. Recommended setting is 2 for better far-field voice suppression.
     */
    public Long getVadLevel() {
        return this.VadLevel;
    }

    /**
     * Set vad far-field voice suppression capacity (does not impact asr recognition accuracy), range [0, 3], default is 0. Recommended setting is 2 for better far-field voice suppression.
     * @param VadLevel vad far-field voice suppression capacity (does not impact asr recognition accuracy), range [0, 3], default is 0. Recommended setting is 2 for better far-field voice suppression.
     */
    public void setVadLevel(Long VadLevel) {
        this.VadLevel = VadLevel;
    }

    /**
     * Get Whether to filter out dirty words (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.
0: Not filtering; 1: Filter out dirty words; 2: Replace dirty words with "*". 
     * @return FilterDirty Whether to filter out dirty words (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.
0: Not filtering; 1: Filter out dirty words; 2: Replace dirty words with "*".
     */
    public Long getFilterDirty() {
        return this.FilterDirty;
    }

    /**
     * Set Whether to filter out dirty words (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.
0: Not filtering; 1: Filter out dirty words; 2: Replace dirty words with "*".
     * @param FilterDirty Whether to filter out dirty words (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.
0: Not filtering; 1: Filter out dirty words; 2: Replace dirty words with "*".
     */
    public void setFilterDirty(Long FilterDirty) {
        this.FilterDirty = FilterDirty;
    }

    /**
     * Get Whether to filter filler words (currently only support basic language engine and standard language engine). Range:  [0, 2]. Default value 0.
0:No filtering; 1: Partial filtering; 2: Strict filtering. 
     * @return FilterModal Whether to filter filler words (currently only support basic language engine and standard language engine). Range:  [0, 2]. Default value 0.
0:No filtering; 1: Partial filtering; 2: Strict filtering.
     */
    public Long getFilterModal() {
        return this.FilterModal;
    }

    /**
     * Set Whether to filter filler words (currently only support basic language engine and standard language engine). Range:  [0, 2]. Default value 0.
0:No filtering; 1: Partial filtering; 2: Strict filtering.
     * @param FilterModal Whether to filter filler words (currently only support basic language engine and standard language engine). Range:  [0, 2]. Default value 0.
0:No filtering; 1: Partial filtering; 2: Strict filtering.
     */
    public void setFilterModal(Long FilterModal) {
        this.FilterModal = FilterModal;
    }

    /**
     * Get Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.
0: Do not filter out periods at the end of sentences; 1: Filter out periods at the end of sentences. 
     * @return FilterPunc Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.
0: Do not filter out periods at the end of sentences; 1: Filter out periods at the end of sentences.
     */
    public Long getFilterPunc() {
        return this.FilterPunc;
    }

    /**
     * Set Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.
0: Do not filter out periods at the end of sentences; 1: Filter out periods at the end of sentences.
     * @param FilterPunc Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.
0: Do not filter out periods at the end of sentences; 1: Filter out periods at the end of sentences.
     */
    public void setFilterPunc(Long FilterPunc) {
        this.FilterPunc = FilterPunc;
    }

    public AsrParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrParam(AsrParam source) {
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.VadSilenceTime != null) {
            this.VadSilenceTime = new Long(source.VadSilenceTime);
        }
        if (source.HotWordList != null) {
            this.HotWordList = new String(source.HotWordList);
        }
        if (source.AlternativeLanguage != null) {
            this.AlternativeLanguage = new String[source.AlternativeLanguage.length];
            for (int i = 0; i < source.AlternativeLanguage.length; i++) {
                this.AlternativeLanguage[i] = new String(source.AlternativeLanguage[i]);
            }
        }
        if (source.VadLevel != null) {
            this.VadLevel = new Long(source.VadLevel);
        }
        if (source.FilterDirty != null) {
            this.FilterDirty = new Long(source.FilterDirty);
        }
        if (source.FilterModal != null) {
            this.FilterModal = new Long(source.FilterModal);
        }
        if (source.FilterPunc != null) {
            this.FilterPunc = new Long(source.FilterPunc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "VadSilenceTime", this.VadSilenceTime);
        this.setParamSimple(map, prefix + "HotWordList", this.HotWordList);
        this.setParamArraySimple(map, prefix + "AlternativeLanguage.", this.AlternativeLanguage);
        this.setParamSimple(map, prefix + "VadLevel", this.VadLevel);
        this.setParamSimple(map, prefix + "FilterDirty", this.FilterDirty);
        this.setParamSimple(map, prefix + "FilterModal", this.FilterModal);
        this.setParamSimple(map, prefix + "FilterPunc", this.FilterPunc);

    }
}

