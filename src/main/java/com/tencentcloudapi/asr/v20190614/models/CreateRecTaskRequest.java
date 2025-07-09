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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecTaskRequest extends AbstractModel {

    /**
    * Engine model type.
Each recognition engine adopts a specific billing plan. Engines marked with "large model version" adopt the large model billing plan. For product billing instructions, [click here] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1).


Note: If you want to recognize telecommunication audio but find that a 16k engine is required, you can use a 16k engine as described below for recognition. However, ** the 16k engines are not trained for recognizing telecommunication audio. Therefore, the recognition results cannot be guaranteed. You need to check whether the recognition results can be used. **

Engines for general scenarios:
** Note: Use 16k engines for scenarios other than telecommunication. **
** 16k_zh_large: ** Engine (large model version) for Mandarin, Chinese dialects, and English. This engine supports recognizing audio in Chinese, English, and [various Chinese dialects] (https://intl.cloud.tencent.com/document/product/1093/35682?from_cn_redirect=1). It has a large number of parameters, enhanced performance, and greatly improved recognition accuracy for low-quality audio with loud noise, too much echo, low voice volume, or faint voices. [Click here] (https://console.cloud.tencent.com/asr/demonstrate) to compare the recognition performance of the 16k_zh engine and this one.
** 16k_multi_lang: ** Engine (large model version) for multiple languages. This engine supports recognizing audio in English, Japanese, Korean, Arabic, Filipino, French, Hindi, Indonesian, Malay, Portuguese, Spanish, Thai, Turkish, Vietnamese, and German (sentence-level or paragraph-level).
** 16k_zh-PY: ** Engine for Chinese, English, and Cantonese. The engine supports recognizing audio in Mandarin, English, and Cantonese at the same time.
** 16k_ms: ** Engine for Malay.
** 16k_id: ** Engine for Indonesian.
** 16k_th: ** Engine for Thai.
    */
    @SerializedName("EngineModelType")
    @Expose
    private String EngineModelType;

    /**
    * Number of recognition channels.
1: Mono. (16k engines only support mono. ** Do no t** set to stereo.)
2: Stereo. (Stereo is supported only for 8k engines, and the two channels should correspond to the respective communication parties.)

Note:
16k engines: Only support mono. ** ChannelNum should be set to 1 **.
8k engines: Support both mono and stereo. ** It is recommended to set ChannelNum to 2 (indicating stereo) **. Stereo can physically distinguish speakers to avoid recognition mistakes caused by overlapping speech. It can provide the best speaker separation and recognition effects. Once stereo is set, the speakers are automatically separated. ** You do not need to enable the speaker separation feature **. You can use the default values for related parameters (** SpeakerDiarization and SpeakerNumber **). For speakerId in the returned ResultDetail, the value 0 represents the left channel, and the value 1 represents the right channel.
    */
    @SerializedName("ChannelNum")
    @Expose
    private Long ChannelNum;

    /**
    * Format of the returned recognition result.
0: The basic recognition result (containing only valid voice timestamps but no word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail)).
1: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps and speech speed value but ** no punctuation **).
2: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **).
3: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by punctuation. ** This format applies to subtitle scenarios **.
4: ** [Value-added paid feature] ** The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by NLP semantics. ** This format applies to scenarios such as meeting and court record transcription ** and is supported only for 8k_zh and 16k_zh engines.
5: ** [Value-added paid feature] ** Basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The oral-to-written transcription result is also output, which has excluded modal particles and consecutive identical words, optimized expressions, and corrected speech mistakes. ** This format applies to scenarios of generating minutes for online and offline meetings** and is supported only for 8k_zh and 16k_zh engines.

Notes:
If this parameter is set to 4, make sure that a [semantics-based segmentation resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 4, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
If this parameter is set to 5, make sure that an [oral-to-written resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 5, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
    */
    @SerializedName("ResTextFormat")
    @Expose
    private Long ResTextFormat;

    /**
    * Audio source.
0: Audio URL.
1: Local audio file (body of the POST request).
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Audio file Base64 code.
** This parameter is required if SourceType is set to 1. Otherwise, it can be left blank. **

Note: The audio data size cannot exceed 5 MB.
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * Data length (before Base64 encoding).
    */
    @SerializedName("DataLen")
    @Expose
    private Long DataLen;

    /**
    * Audio URL. (The audio should be downloadable via a public network browser.)
** This parameter is required if SourceType is set to 0. Otherwise, it can be left blank. **

Notes:
1. Make sure that the total audio duration of recording files does not exceed 5 hours. Otherwise, recognition may fail.
2. Pay attention to file download to avoid download failure.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Callback URL

User-defined service URL for receiving recognition results.
For the callback format and content, see [Callback Description] (https://intl.cloud.tencent.com/document/product/1093/52632?from_cn_redirect=1).

Notes:

- If you use the polling method to obtain recognition results, this parameter is not required.
- It is recommended to include your business ID and other information in the callback URL for handling business logic.
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * Whether to enable speaker separation.
0: Disable.
1: Enable. (This value is supported only for the following engines: 8k_zh, 16k_zh, 16k_ms, 16k_en, 16k_id, 16k_zh_large, and 16k_zh_dialect. ChannelNum should be set to 1.)
The default value is 0.

Note:
If an 8k engine is used and ChannelNum is set to 2 (stereo), use the default values for corresponding parameters as stated in the ** ChannelNum ** parameter description.
    */
    @SerializedName("SpeakerDiarization")
    @Expose
    private Long SpeakerDiarization;

    /**
    * Number of speakers to be separated.
** Speaker separation must be enabled. Otherwise, this parameter does not take effect. ** Value range: 0-10.
0: Automatic separation. (Up to 20 speakers can be separated.)
1-10: Specify the number of speakers.
The default value is 0.
    */
    @SerializedName("SpeakerNumber")
    @Expose
    private Long SpeakerNumber;

    /**
    * This service is not available.
    */
    @SerializedName("HotwordId")
    @Expose
    private String HotwordId;

    /**
    * This service is not available.
    */
    @SerializedName("ReinforceHotword")
    @Expose
    private Long ReinforceHotword;

    /**
    * This service is not available.
    */
    @SerializedName("CustomizationId")
    @Expose
    private String CustomizationId;

    /**
    * This service is not available.
    */
    @SerializedName("EmotionRecognition")
    @Expose
    private Long EmotionRecognition;

    /**
    * Emotional energy value.
The value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
0: Disable.
1: Enable.
The default value is 0.
    */
    @SerializedName("EmotionalEnergy")
    @Expose
    private Long EmotionalEnergy;

    /**
    * Intelligent conversion into Arabic numerals (supported only for engines for recognizing audio in Mandarin).
0: Do not convert, but directly output Chinese numerals.
1: Intelligently convert into Arabic numerals based on the scenario.
3: Enable conversion for math-related letters.
The default value is 1.
    */
    @SerializedName("ConvertNumMode")
    @Expose
    private Long ConvertNumMode;

    /**
    * Dirty word filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out dirty words.
1: Filter out dirty words.
2: Replace dirty words with *.
The default value is 0.
    */
    @SerializedName("FilterDirty")
    @Expose
    private Long FilterDirty;

    /**
    * Punctuation filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out punctuation.
1: Filter out sentence-ending punctuation.
2: Filter out all punctuation.
The default value is 0.
    */
    @SerializedName("FilterPunc")
    @Expose
    private Long FilterPunc;

    /**
    * Modal particle filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out modal particles.
1: Filter out specified modal particles.
2: Filter out all modal particles.
The default value is 0.
    */
    @SerializedName("FilterModal")
    @Expose
    private Long FilterModal;

    /**
    * The maximum number of characters per line (supported only for engines for recognizing audio in Mandarin). A punctuation mark is added if this limit is reached.
** This parameter can control the maximum number of characters per line, which applies to subtitle generation scenarios. ** Value range: [6,40].
0: Disable this feature.
The default value is 0.

Note: To enable this feature, ResTextFormat should be set to 3. The recognition result can be obtained from FinalSentence by parsing the list in the returned ResultDetail.
    */
    @SerializedName("SentenceMaxLength")
    @Expose
    private Long SentenceMaxLength;

    /**
    * Additional parameter. ** (This parameter is meaningless. Ignore it.) **
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * Temporary term list. This parameter is used to improve the recognition accuracy.

- Restrictions for individual terms: The format is "term|weight". Each term can contain no more than 30 characters (or 10 Chinese characters. The weight can be in the range of [1-11] or 100. For example, "Tencent Cloud|5" or "ASR|11".

- Restrictions for the temporary term list: Multiple terms are separated by commas. The list can contain up to 128 terms. For example, "Tencent Cloud|10, Audio Recognition|5, ASR|11".

- Difference between hotword_id (term list) and hotword_list (temporary term list):

    - hotword_id: Term list. You need to create a term list in the console or by using the API first and obtain the term list ID.

    - hotword_list: Temporary term list. You can directly enter the ID of the temporary term list each time you initiate a request. The temporary term list is not retained on the cloud. This parameter applies to users with a massive number of terms.

Notes:

- If both hotword_id and hotword_list are specified, hotword_list will take effect first.

- When the weight of a term is set to 11, this term becomes a super term. It is recommended that the weight is set to 11 only for critical and necessary terms. The overall accuracy will be affected if the weight is set to 11 for too many terms.

- When the weight of a term is set to 100, the term enhancement feature is enabled to replace homophones of this term. (This feature is supported only for 8k_zh and 16k_zh engines.) For example, if you configure "mizhi 1|100", the recognized word "mizhi 2", which is a homophone of "mizhi 2", will be forcibly replaced with "mizhi 2". It is recommended that you enable this feature based on the actual needs. You can set the weight to 100 for only critical and necessary terms. The overall accuracy will be affected if the weight is set to 100 for too many terms.
    */
    @SerializedName("HotwordList")
    @Expose
    private String HotwordList;

    /**
    * List of keyword IDs for recognition. This parameter is left blank by default, indicating that no keyword is recognized. You can enter up to 10 IDs.

    */
    @SerializedName("KeyWordLibIdList")
    @Expose
    private String [] KeyWordLibIdList;

    /**
     * Get Engine model type.
Each recognition engine adopts a specific billing plan. Engines marked with "large model version" adopt the large model billing plan. For product billing instructions, [click here] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1).


Note: If you want to recognize telecommunication audio but find that a 16k engine is required, you can use a 16k engine as described below for recognition. However, ** the 16k engines are not trained for recognizing telecommunication audio. Therefore, the recognition results cannot be guaranteed. You need to check whether the recognition results can be used. **

Engines for general scenarios:
** Note: Use 16k engines for scenarios other than telecommunication. **
** 16k_zh_large: ** Engine (large model version) for Mandarin, Chinese dialects, and English. This engine supports recognizing audio in Chinese, English, and [various Chinese dialects] (https://intl.cloud.tencent.com/document/product/1093/35682?from_cn_redirect=1). It has a large number of parameters, enhanced performance, and greatly improved recognition accuracy for low-quality audio with loud noise, too much echo, low voice volume, or faint voices. [Click here] (https://console.cloud.tencent.com/asr/demonstrate) to compare the recognition performance of the 16k_zh engine and this one.
** 16k_multi_lang: ** Engine (large model version) for multiple languages. This engine supports recognizing audio in English, Japanese, Korean, Arabic, Filipino, French, Hindi, Indonesian, Malay, Portuguese, Spanish, Thai, Turkish, Vietnamese, and German (sentence-level or paragraph-level).
** 16k_zh-PY: ** Engine for Chinese, English, and Cantonese. The engine supports recognizing audio in Mandarin, English, and Cantonese at the same time.
** 16k_ms: ** Engine for Malay.
** 16k_id: ** Engine for Indonesian.
** 16k_th: ** Engine for Thai. 
     * @return EngineModelType Engine model type.
Each recognition engine adopts a specific billing plan. Engines marked with "large model version" adopt the large model billing plan. For product billing instructions, [click here] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1).


Note: If you want to recognize telecommunication audio but find that a 16k engine is required, you can use a 16k engine as described below for recognition. However, ** the 16k engines are not trained for recognizing telecommunication audio. Therefore, the recognition results cannot be guaranteed. You need to check whether the recognition results can be used. **

Engines for general scenarios:
** Note: Use 16k engines for scenarios other than telecommunication. **
** 16k_zh_large: ** Engine (large model version) for Mandarin, Chinese dialects, and English. This engine supports recognizing audio in Chinese, English, and [various Chinese dialects] (https://intl.cloud.tencent.com/document/product/1093/35682?from_cn_redirect=1). It has a large number of parameters, enhanced performance, and greatly improved recognition accuracy for low-quality audio with loud noise, too much echo, low voice volume, or faint voices. [Click here] (https://console.cloud.tencent.com/asr/demonstrate) to compare the recognition performance of the 16k_zh engine and this one.
** 16k_multi_lang: ** Engine (large model version) for multiple languages. This engine supports recognizing audio in English, Japanese, Korean, Arabic, Filipino, French, Hindi, Indonesian, Malay, Portuguese, Spanish, Thai, Turkish, Vietnamese, and German (sentence-level or paragraph-level).
** 16k_zh-PY: ** Engine for Chinese, English, and Cantonese. The engine supports recognizing audio in Mandarin, English, and Cantonese at the same time.
** 16k_ms: ** Engine for Malay.
** 16k_id: ** Engine for Indonesian.
** 16k_th: ** Engine for Thai.
     */
    public String getEngineModelType() {
        return this.EngineModelType;
    }

    /**
     * Set Engine model type.
Each recognition engine adopts a specific billing plan. Engines marked with "large model version" adopt the large model billing plan. For product billing instructions, [click here] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1).


Note: If you want to recognize telecommunication audio but find that a 16k engine is required, you can use a 16k engine as described below for recognition. However, ** the 16k engines are not trained for recognizing telecommunication audio. Therefore, the recognition results cannot be guaranteed. You need to check whether the recognition results can be used. **

Engines for general scenarios:
** Note: Use 16k engines for scenarios other than telecommunication. **
** 16k_zh_large: ** Engine (large model version) for Mandarin, Chinese dialects, and English. This engine supports recognizing audio in Chinese, English, and [various Chinese dialects] (https://intl.cloud.tencent.com/document/product/1093/35682?from_cn_redirect=1). It has a large number of parameters, enhanced performance, and greatly improved recognition accuracy for low-quality audio with loud noise, too much echo, low voice volume, or faint voices. [Click here] (https://console.cloud.tencent.com/asr/demonstrate) to compare the recognition performance of the 16k_zh engine and this one.
** 16k_multi_lang: ** Engine (large model version) for multiple languages. This engine supports recognizing audio in English, Japanese, Korean, Arabic, Filipino, French, Hindi, Indonesian, Malay, Portuguese, Spanish, Thai, Turkish, Vietnamese, and German (sentence-level or paragraph-level).
** 16k_zh-PY: ** Engine for Chinese, English, and Cantonese. The engine supports recognizing audio in Mandarin, English, and Cantonese at the same time.
** 16k_ms: ** Engine for Malay.
** 16k_id: ** Engine for Indonesian.
** 16k_th: ** Engine for Thai.
     * @param EngineModelType Engine model type.
Each recognition engine adopts a specific billing plan. Engines marked with "large model version" adopt the large model billing plan. For product billing instructions, [click here] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1).


Note: If you want to recognize telecommunication audio but find that a 16k engine is required, you can use a 16k engine as described below for recognition. However, ** the 16k engines are not trained for recognizing telecommunication audio. Therefore, the recognition results cannot be guaranteed. You need to check whether the recognition results can be used. **

Engines for general scenarios:
** Note: Use 16k engines for scenarios other than telecommunication. **
** 16k_zh_large: ** Engine (large model version) for Mandarin, Chinese dialects, and English. This engine supports recognizing audio in Chinese, English, and [various Chinese dialects] (https://intl.cloud.tencent.com/document/product/1093/35682?from_cn_redirect=1). It has a large number of parameters, enhanced performance, and greatly improved recognition accuracy for low-quality audio with loud noise, too much echo, low voice volume, or faint voices. [Click here] (https://console.cloud.tencent.com/asr/demonstrate) to compare the recognition performance of the 16k_zh engine and this one.
** 16k_multi_lang: ** Engine (large model version) for multiple languages. This engine supports recognizing audio in English, Japanese, Korean, Arabic, Filipino, French, Hindi, Indonesian, Malay, Portuguese, Spanish, Thai, Turkish, Vietnamese, and German (sentence-level or paragraph-level).
** 16k_zh-PY: ** Engine for Chinese, English, and Cantonese. The engine supports recognizing audio in Mandarin, English, and Cantonese at the same time.
** 16k_ms: ** Engine for Malay.
** 16k_id: ** Engine for Indonesian.
** 16k_th: ** Engine for Thai.
     */
    public void setEngineModelType(String EngineModelType) {
        this.EngineModelType = EngineModelType;
    }

    /**
     * Get Number of recognition channels.
1: Mono. (16k engines only support mono. ** Do no t** set to stereo.)
2: Stereo. (Stereo is supported only for 8k engines, and the two channels should correspond to the respective communication parties.)

Note:
16k engines: Only support mono. ** ChannelNum should be set to 1 **.
8k engines: Support both mono and stereo. ** It is recommended to set ChannelNum to 2 (indicating stereo) **. Stereo can physically distinguish speakers to avoid recognition mistakes caused by overlapping speech. It can provide the best speaker separation and recognition effects. Once stereo is set, the speakers are automatically separated. ** You do not need to enable the speaker separation feature **. You can use the default values for related parameters (** SpeakerDiarization and SpeakerNumber **). For speakerId in the returned ResultDetail, the value 0 represents the left channel, and the value 1 represents the right channel. 
     * @return ChannelNum Number of recognition channels.
1: Mono. (16k engines only support mono. ** Do no t** set to stereo.)
2: Stereo. (Stereo is supported only for 8k engines, and the two channels should correspond to the respective communication parties.)

Note:
16k engines: Only support mono. ** ChannelNum should be set to 1 **.
8k engines: Support both mono and stereo. ** It is recommended to set ChannelNum to 2 (indicating stereo) **. Stereo can physically distinguish speakers to avoid recognition mistakes caused by overlapping speech. It can provide the best speaker separation and recognition effects. Once stereo is set, the speakers are automatically separated. ** You do not need to enable the speaker separation feature **. You can use the default values for related parameters (** SpeakerDiarization and SpeakerNumber **). For speakerId in the returned ResultDetail, the value 0 represents the left channel, and the value 1 represents the right channel.
     */
    public Long getChannelNum() {
        return this.ChannelNum;
    }

    /**
     * Set Number of recognition channels.
1: Mono. (16k engines only support mono. ** Do no t** set to stereo.)
2: Stereo. (Stereo is supported only for 8k engines, and the two channels should correspond to the respective communication parties.)

Note:
16k engines: Only support mono. ** ChannelNum should be set to 1 **.
8k engines: Support both mono and stereo. ** It is recommended to set ChannelNum to 2 (indicating stereo) **. Stereo can physically distinguish speakers to avoid recognition mistakes caused by overlapping speech. It can provide the best speaker separation and recognition effects. Once stereo is set, the speakers are automatically separated. ** You do not need to enable the speaker separation feature **. You can use the default values for related parameters (** SpeakerDiarization and SpeakerNumber **). For speakerId in the returned ResultDetail, the value 0 represents the left channel, and the value 1 represents the right channel.
     * @param ChannelNum Number of recognition channels.
1: Mono. (16k engines only support mono. ** Do no t** set to stereo.)
2: Stereo. (Stereo is supported only for 8k engines, and the two channels should correspond to the respective communication parties.)

Note:
16k engines: Only support mono. ** ChannelNum should be set to 1 **.
8k engines: Support both mono and stereo. ** It is recommended to set ChannelNum to 2 (indicating stereo) **. Stereo can physically distinguish speakers to avoid recognition mistakes caused by overlapping speech. It can provide the best speaker separation and recognition effects. Once stereo is set, the speakers are automatically separated. ** You do not need to enable the speaker separation feature **. You can use the default values for related parameters (** SpeakerDiarization and SpeakerNumber **). For speakerId in the returned ResultDetail, the value 0 represents the left channel, and the value 1 represents the right channel.
     */
    public void setChannelNum(Long ChannelNum) {
        this.ChannelNum = ChannelNum;
    }

    /**
     * Get Format of the returned recognition result.
0: The basic recognition result (containing only valid voice timestamps but no word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail)).
1: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps and speech speed value but ** no punctuation **).
2: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **).
3: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by punctuation. ** This format applies to subtitle scenarios **.
4: ** [Value-added paid feature] ** The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by NLP semantics. ** This format applies to scenarios such as meeting and court record transcription ** and is supported only for 8k_zh and 16k_zh engines.
5: ** [Value-added paid feature] ** Basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The oral-to-written transcription result is also output, which has excluded modal particles and consecutive identical words, optimized expressions, and corrected speech mistakes. ** This format applies to scenarios of generating minutes for online and offline meetings** and is supported only for 8k_zh and 16k_zh engines.

Notes:
If this parameter is set to 4, make sure that a [semantics-based segmentation resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 4, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
If this parameter is set to 5, make sure that an [oral-to-written resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 5, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **. 
     * @return ResTextFormat Format of the returned recognition result.
0: The basic recognition result (containing only valid voice timestamps but no word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail)).
1: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps and speech speed value but ** no punctuation **).
2: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **).
3: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by punctuation. ** This format applies to subtitle scenarios **.
4: ** [Value-added paid feature] ** The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by NLP semantics. ** This format applies to scenarios such as meeting and court record transcription ** and is supported only for 8k_zh and 16k_zh engines.
5: ** [Value-added paid feature] ** Basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The oral-to-written transcription result is also output, which has excluded modal particles and consecutive identical words, optimized expressions, and corrected speech mistakes. ** This format applies to scenarios of generating minutes for online and offline meetings** and is supported only for 8k_zh and 16k_zh engines.

Notes:
If this parameter is set to 4, make sure that a [semantics-based segmentation resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 4, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
If this parameter is set to 5, make sure that an [oral-to-written resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 5, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
     */
    public Long getResTextFormat() {
        return this.ResTextFormat;
    }

    /**
     * Set Format of the returned recognition result.
0: The basic recognition result (containing only valid voice timestamps but no word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail)).
1: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps and speech speed value but ** no punctuation **).
2: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **).
3: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by punctuation. ** This format applies to subtitle scenarios **.
4: ** [Value-added paid feature] ** The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by NLP semantics. ** This format applies to scenarios such as meeting and court record transcription ** and is supported only for 8k_zh and 16k_zh engines.
5: ** [Value-added paid feature] ** Basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The oral-to-written transcription result is also output, which has excluded modal particles and consecutive identical words, optimized expressions, and corrected speech mistakes. ** This format applies to scenarios of generating minutes for online and offline meetings** and is supported only for 8k_zh and 16k_zh engines.

Notes:
If this parameter is set to 4, make sure that a [semantics-based segmentation resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 4, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
If this parameter is set to 5, make sure that an [oral-to-written resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 5, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
     * @param ResTextFormat Format of the returned recognition result.
0: The basic recognition result (containing only valid voice timestamps but no word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail)).
1: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps and speech speed value but ** no punctuation **).
2: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **).
3: The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by punctuation. ** This format applies to subtitle scenarios **.
4: ** [Value-added paid feature] ** The basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The recognition results are segmented by NLP semantics. ** This format applies to scenarios such as meeting and court record transcription ** and is supported only for 8k_zh and 16k_zh engines.
5: ** [Value-added paid feature] ** Basic recognition result and word-level [detailed recognition result] (https://intl.cloud.tencent.com/document/api/1093/37824?from_cn_redirect=1#SentenceDetail) (containing word-level timestamps, speech speed value, and ** punctuation **). The oral-to-written transcription result is also output, which has excluded modal particles and consecutive identical words, optimized expressions, and corrected speech mistakes. ** This format applies to scenarios of generating minutes for online and offline meetings** and is supported only for 8k_zh and 16k_zh engines.

Notes:
If this parameter is set to 4, make sure that a [semantics-based segmentation resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 4, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
If this parameter is set to 5, make sure that an [oral-to-written resource package] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#97ae4aa0-29a0-4066-9f07-ccaf8856a16b) is purchased for your account or that your account has enabled post-payment. ** If post-payment is enabled and this parameter is set to 5, [automatic billing] (https://intl.cloud.tencent.com/document/product/1093/35686?from_cn_redirect=1#d912167d-ffd5-41a9-8b1c-2e89845a6852) will apply **.
     */
    public void setResTextFormat(Long ResTextFormat) {
        this.ResTextFormat = ResTextFormat;
    }

    /**
     * Get Audio source.
0: Audio URL.
1: Local audio file (body of the POST request). 
     * @return SourceType Audio source.
0: Audio URL.
1: Local audio file (body of the POST request).
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Audio source.
0: Audio URL.
1: Local audio file (body of the POST request).
     * @param SourceType Audio source.
0: Audio URL.
1: Local audio file (body of the POST request).
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Audio file Base64 code.
** This parameter is required if SourceType is set to 1. Otherwise, it can be left blank. **

Note: The audio data size cannot exceed 5 MB. 
     * @return Data Audio file Base64 code.
** This parameter is required if SourceType is set to 1. Otherwise, it can be left blank. **

Note: The audio data size cannot exceed 5 MB.
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Audio file Base64 code.
** This parameter is required if SourceType is set to 1. Otherwise, it can be left blank. **

Note: The audio data size cannot exceed 5 MB.
     * @param Data Audio file Base64 code.
** This parameter is required if SourceType is set to 1. Otherwise, it can be left blank. **

Note: The audio data size cannot exceed 5 MB.
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get Data length (before Base64 encoding). 
     * @return DataLen Data length (before Base64 encoding).
     */
    public Long getDataLen() {
        return this.DataLen;
    }

    /**
     * Set Data length (before Base64 encoding).
     * @param DataLen Data length (before Base64 encoding).
     */
    public void setDataLen(Long DataLen) {
        this.DataLen = DataLen;
    }

    /**
     * Get Audio URL. (The audio should be downloadable via a public network browser.)
** This parameter is required if SourceType is set to 0. Otherwise, it can be left blank. **

Notes:
1. Make sure that the total audio duration of recording files does not exceed 5 hours. Otherwise, recognition may fail.
2. Pay attention to file download to avoid download failure. 
     * @return Url Audio URL. (The audio should be downloadable via a public network browser.)
** This parameter is required if SourceType is set to 0. Otherwise, it can be left blank. **

Notes:
1. Make sure that the total audio duration of recording files does not exceed 5 hours. Otherwise, recognition may fail.
2. Pay attention to file download to avoid download failure.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Audio URL. (The audio should be downloadable via a public network browser.)
** This parameter is required if SourceType is set to 0. Otherwise, it can be left blank. **

Notes:
1. Make sure that the total audio duration of recording files does not exceed 5 hours. Otherwise, recognition may fail.
2. Pay attention to file download to avoid download failure.
     * @param Url Audio URL. (The audio should be downloadable via a public network browser.)
** This parameter is required if SourceType is set to 0. Otherwise, it can be left blank. **

Notes:
1. Make sure that the total audio duration of recording files does not exceed 5 hours. Otherwise, recognition may fail.
2. Pay attention to file download to avoid download failure.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Callback URL

User-defined service URL for receiving recognition results.
For the callback format and content, see [Callback Description] (https://intl.cloud.tencent.com/document/product/1093/52632?from_cn_redirect=1).

Notes:

- If you use the polling method to obtain recognition results, this parameter is not required.
- It is recommended to include your business ID and other information in the callback URL for handling business logic. 
     * @return CallbackUrl Callback URL

User-defined service URL for receiving recognition results.
For the callback format and content, see [Callback Description] (https://intl.cloud.tencent.com/document/product/1093/52632?from_cn_redirect=1).

Notes:

- If you use the polling method to obtain recognition results, this parameter is not required.
- It is recommended to include your business ID and other information in the callback URL for handling business logic.
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set Callback URL

User-defined service URL for receiving recognition results.
For the callback format and content, see [Callback Description] (https://intl.cloud.tencent.com/document/product/1093/52632?from_cn_redirect=1).

Notes:

- If you use the polling method to obtain recognition results, this parameter is not required.
- It is recommended to include your business ID and other information in the callback URL for handling business logic.
     * @param CallbackUrl Callback URL

User-defined service URL for receiving recognition results.
For the callback format and content, see [Callback Description] (https://intl.cloud.tencent.com/document/product/1093/52632?from_cn_redirect=1).

Notes:

- If you use the polling method to obtain recognition results, this parameter is not required.
- It is recommended to include your business ID and other information in the callback URL for handling business logic.
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get Whether to enable speaker separation.
0: Disable.
1: Enable. (This value is supported only for the following engines: 8k_zh, 16k_zh, 16k_ms, 16k_en, 16k_id, 16k_zh_large, and 16k_zh_dialect. ChannelNum should be set to 1.)
The default value is 0.

Note:
If an 8k engine is used and ChannelNum is set to 2 (stereo), use the default values for corresponding parameters as stated in the ** ChannelNum ** parameter description. 
     * @return SpeakerDiarization Whether to enable speaker separation.
0: Disable.
1: Enable. (This value is supported only for the following engines: 8k_zh, 16k_zh, 16k_ms, 16k_en, 16k_id, 16k_zh_large, and 16k_zh_dialect. ChannelNum should be set to 1.)
The default value is 0.

Note:
If an 8k engine is used and ChannelNum is set to 2 (stereo), use the default values for corresponding parameters as stated in the ** ChannelNum ** parameter description.
     */
    public Long getSpeakerDiarization() {
        return this.SpeakerDiarization;
    }

    /**
     * Set Whether to enable speaker separation.
0: Disable.
1: Enable. (This value is supported only for the following engines: 8k_zh, 16k_zh, 16k_ms, 16k_en, 16k_id, 16k_zh_large, and 16k_zh_dialect. ChannelNum should be set to 1.)
The default value is 0.

Note:
If an 8k engine is used and ChannelNum is set to 2 (stereo), use the default values for corresponding parameters as stated in the ** ChannelNum ** parameter description.
     * @param SpeakerDiarization Whether to enable speaker separation.
0: Disable.
1: Enable. (This value is supported only for the following engines: 8k_zh, 16k_zh, 16k_ms, 16k_en, 16k_id, 16k_zh_large, and 16k_zh_dialect. ChannelNum should be set to 1.)
The default value is 0.

Note:
If an 8k engine is used and ChannelNum is set to 2 (stereo), use the default values for corresponding parameters as stated in the ** ChannelNum ** parameter description.
     */
    public void setSpeakerDiarization(Long SpeakerDiarization) {
        this.SpeakerDiarization = SpeakerDiarization;
    }

    /**
     * Get Number of speakers to be separated.
** Speaker separation must be enabled. Otherwise, this parameter does not take effect. ** Value range: 0-10.
0: Automatic separation. (Up to 20 speakers can be separated.)
1-10: Specify the number of speakers.
The default value is 0. 
     * @return SpeakerNumber Number of speakers to be separated.
** Speaker separation must be enabled. Otherwise, this parameter does not take effect. ** Value range: 0-10.
0: Automatic separation. (Up to 20 speakers can be separated.)
1-10: Specify the number of speakers.
The default value is 0.
     */
    public Long getSpeakerNumber() {
        return this.SpeakerNumber;
    }

    /**
     * Set Number of speakers to be separated.
** Speaker separation must be enabled. Otherwise, this parameter does not take effect. ** Value range: 0-10.
0: Automatic separation. (Up to 20 speakers can be separated.)
1-10: Specify the number of speakers.
The default value is 0.
     * @param SpeakerNumber Number of speakers to be separated.
** Speaker separation must be enabled. Otherwise, this parameter does not take effect. ** Value range: 0-10.
0: Automatic separation. (Up to 20 speakers can be separated.)
1-10: Specify the number of speakers.
The default value is 0.
     */
    public void setSpeakerNumber(Long SpeakerNumber) {
        this.SpeakerNumber = SpeakerNumber;
    }

    /**
     * Get This service is not available. 
     * @return HotwordId This service is not available.
     */
    public String getHotwordId() {
        return this.HotwordId;
    }

    /**
     * Set This service is not available.
     * @param HotwordId This service is not available.
     */
    public void setHotwordId(String HotwordId) {
        this.HotwordId = HotwordId;
    }

    /**
     * Get This service is not available. 
     * @return ReinforceHotword This service is not available.
     * @deprecated
     */
    @Deprecated
    public Long getReinforceHotword() {
        return this.ReinforceHotword;
    }

    /**
     * Set This service is not available.
     * @param ReinforceHotword This service is not available.
     * @deprecated
     */
    @Deprecated
    public void setReinforceHotword(Long ReinforceHotword) {
        this.ReinforceHotword = ReinforceHotword;
    }

    /**
     * Get This service is not available. 
     * @return CustomizationId This service is not available.
     */
    public String getCustomizationId() {
        return this.CustomizationId;
    }

    /**
     * Set This service is not available.
     * @param CustomizationId This service is not available.
     */
    public void setCustomizationId(String CustomizationId) {
        this.CustomizationId = CustomizationId;
    }

    /**
     * Get This service is not available. 
     * @return EmotionRecognition This service is not available.
     */
    public Long getEmotionRecognition() {
        return this.EmotionRecognition;
    }

    /**
     * Set This service is not available.
     * @param EmotionRecognition This service is not available.
     */
    public void setEmotionRecognition(Long EmotionRecognition) {
        this.EmotionRecognition = EmotionRecognition;
    }

    /**
     * Get Emotional energy value.
The value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
0: Disable.
1: Enable.
The default value is 0. 
     * @return EmotionalEnergy Emotional energy value.
The value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
0: Disable.
1: Enable.
The default value is 0.
     */
    public Long getEmotionalEnergy() {
        return this.EmotionalEnergy;
    }

    /**
     * Set Emotional energy value.
The value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
0: Disable.
1: Enable.
The default value is 0.
     * @param EmotionalEnergy Emotional energy value.
The value is the result of dividing the sound volume in dB by 10. Value range: [1,10]. The higher the value, the stronger the emotion.
0: Disable.
1: Enable.
The default value is 0.
     */
    public void setEmotionalEnergy(Long EmotionalEnergy) {
        this.EmotionalEnergy = EmotionalEnergy;
    }

    /**
     * Get Intelligent conversion into Arabic numerals (supported only for engines for recognizing audio in Mandarin).
0: Do not convert, but directly output Chinese numerals.
1: Intelligently convert into Arabic numerals based on the scenario.
3: Enable conversion for math-related letters.
The default value is 1. 
     * @return ConvertNumMode Intelligent conversion into Arabic numerals (supported only for engines for recognizing audio in Mandarin).
0: Do not convert, but directly output Chinese numerals.
1: Intelligently convert into Arabic numerals based on the scenario.
3: Enable conversion for math-related letters.
The default value is 1.
     */
    public Long getConvertNumMode() {
        return this.ConvertNumMode;
    }

    /**
     * Set Intelligent conversion into Arabic numerals (supported only for engines for recognizing audio in Mandarin).
0: Do not convert, but directly output Chinese numerals.
1: Intelligently convert into Arabic numerals based on the scenario.
3: Enable conversion for math-related letters.
The default value is 1.
     * @param ConvertNumMode Intelligent conversion into Arabic numerals (supported only for engines for recognizing audio in Mandarin).
0: Do not convert, but directly output Chinese numerals.
1: Intelligently convert into Arabic numerals based on the scenario.
3: Enable conversion for math-related letters.
The default value is 1.
     */
    public void setConvertNumMode(Long ConvertNumMode) {
        this.ConvertNumMode = ConvertNumMode;
    }

    /**
     * Get Dirty word filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out dirty words.
1: Filter out dirty words.
2: Replace dirty words with *.
The default value is 0. 
     * @return FilterDirty Dirty word filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out dirty words.
1: Filter out dirty words.
2: Replace dirty words with *.
The default value is 0.
     */
    public Long getFilterDirty() {
        return this.FilterDirty;
    }

    /**
     * Set Dirty word filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out dirty words.
1: Filter out dirty words.
2: Replace dirty words with *.
The default value is 0.
     * @param FilterDirty Dirty word filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out dirty words.
1: Filter out dirty words.
2: Replace dirty words with *.
The default value is 0.
     */
    public void setFilterDirty(Long FilterDirty) {
        this.FilterDirty = FilterDirty;
    }

    /**
     * Get Punctuation filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out punctuation.
1: Filter out sentence-ending punctuation.
2: Filter out all punctuation.
The default value is 0. 
     * @return FilterPunc Punctuation filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out punctuation.
1: Filter out sentence-ending punctuation.
2: Filter out all punctuation.
The default value is 0.
     */
    public Long getFilterPunc() {
        return this.FilterPunc;
    }

    /**
     * Set Punctuation filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out punctuation.
1: Filter out sentence-ending punctuation.
2: Filter out all punctuation.
The default value is 0.
     * @param FilterPunc Punctuation filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out punctuation.
1: Filter out sentence-ending punctuation.
2: Filter out all punctuation.
The default value is 0.
     */
    public void setFilterPunc(Long FilterPunc) {
        this.FilterPunc = FilterPunc;
    }

    /**
     * Get Modal particle filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out modal particles.
1: Filter out specified modal particles.
2: Filter out all modal particles.
The default value is 0. 
     * @return FilterModal Modal particle filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out modal particles.
1: Filter out specified modal particles.
2: Filter out all modal particles.
The default value is 0.
     */
    public Long getFilterModal() {
        return this.FilterModal;
    }

    /**
     * Set Modal particle filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out modal particles.
1: Filter out specified modal particles.
2: Filter out all modal particles.
The default value is 0.
     * @param FilterModal Modal particle filtering (supported only for engines for recognizing audio in Mandarin).
0: Do not filter out modal particles.
1: Filter out specified modal particles.
2: Filter out all modal particles.
The default value is 0.
     */
    public void setFilterModal(Long FilterModal) {
        this.FilterModal = FilterModal;
    }

    /**
     * Get The maximum number of characters per line (supported only for engines for recognizing audio in Mandarin). A punctuation mark is added if this limit is reached.
** This parameter can control the maximum number of characters per line, which applies to subtitle generation scenarios. ** Value range: [6,40].
0: Disable this feature.
The default value is 0.

Note: To enable this feature, ResTextFormat should be set to 3. The recognition result can be obtained from FinalSentence by parsing the list in the returned ResultDetail. 
     * @return SentenceMaxLength The maximum number of characters per line (supported only for engines for recognizing audio in Mandarin). A punctuation mark is added if this limit is reached.
** This parameter can control the maximum number of characters per line, which applies to subtitle generation scenarios. ** Value range: [6,40].
0: Disable this feature.
The default value is 0.

Note: To enable this feature, ResTextFormat should be set to 3. The recognition result can be obtained from FinalSentence by parsing the list in the returned ResultDetail.
     */
    public Long getSentenceMaxLength() {
        return this.SentenceMaxLength;
    }

    /**
     * Set The maximum number of characters per line (supported only for engines for recognizing audio in Mandarin). A punctuation mark is added if this limit is reached.
** This parameter can control the maximum number of characters per line, which applies to subtitle generation scenarios. ** Value range: [6,40].
0: Disable this feature.
The default value is 0.

Note: To enable this feature, ResTextFormat should be set to 3. The recognition result can be obtained from FinalSentence by parsing the list in the returned ResultDetail.
     * @param SentenceMaxLength The maximum number of characters per line (supported only for engines for recognizing audio in Mandarin). A punctuation mark is added if this limit is reached.
** This parameter can control the maximum number of characters per line, which applies to subtitle generation scenarios. ** Value range: [6,40].
0: Disable this feature.
The default value is 0.

Note: To enable this feature, ResTextFormat should be set to 3. The recognition result can be obtained from FinalSentence by parsing the list in the returned ResultDetail.
     */
    public void setSentenceMaxLength(Long SentenceMaxLength) {
        this.SentenceMaxLength = SentenceMaxLength;
    }

    /**
     * Get Additional parameter. ** (This parameter is meaningless. Ignore it.) ** 
     * @return Extra Additional parameter. ** (This parameter is meaningless. Ignore it.) **
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set Additional parameter. ** (This parameter is meaningless. Ignore it.) **
     * @param Extra Additional parameter. ** (This parameter is meaningless. Ignore it.) **
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get Temporary term list. This parameter is used to improve the recognition accuracy.

- Restrictions for individual terms: The format is "term|weight". Each term can contain no more than 30 characters (or 10 Chinese characters. The weight can be in the range of [1-11] or 100. For example, "Tencent Cloud|5" or "ASR|11".

- Restrictions for the temporary term list: Multiple terms are separated by commas. The list can contain up to 128 terms. For example, "Tencent Cloud|10, Audio Recognition|5, ASR|11".

- Difference between hotword_id (term list) and hotword_list (temporary term list):

    - hotword_id: Term list. You need to create a term list in the console or by using the API first and obtain the term list ID.

    - hotword_list: Temporary term list. You can directly enter the ID of the temporary term list each time you initiate a request. The temporary term list is not retained on the cloud. This parameter applies to users with a massive number of terms.

Notes:

- If both hotword_id and hotword_list are specified, hotword_list will take effect first.

- When the weight of a term is set to 11, this term becomes a super term. It is recommended that the weight is set to 11 only for critical and necessary terms. The overall accuracy will be affected if the weight is set to 11 for too many terms.

- When the weight of a term is set to 100, the term enhancement feature is enabled to replace homophones of this term. (This feature is supported only for 8k_zh and 16k_zh engines.) For example, if you configure "mizhi 1|100", the recognized word "mizhi 2", which is a homophone of "mizhi 2", will be forcibly replaced with "mizhi 2". It is recommended that you enable this feature based on the actual needs. You can set the weight to 100 for only critical and necessary terms. The overall accuracy will be affected if the weight is set to 100 for too many terms. 
     * @return HotwordList Temporary term list. This parameter is used to improve the recognition accuracy.

- Restrictions for individual terms: The format is "term|weight". Each term can contain no more than 30 characters (or 10 Chinese characters. The weight can be in the range of [1-11] or 100. For example, "Tencent Cloud|5" or "ASR|11".

- Restrictions for the temporary term list: Multiple terms are separated by commas. The list can contain up to 128 terms. For example, "Tencent Cloud|10, Audio Recognition|5, ASR|11".

- Difference between hotword_id (term list) and hotword_list (temporary term list):

    - hotword_id: Term list. You need to create a term list in the console or by using the API first and obtain the term list ID.

    - hotword_list: Temporary term list. You can directly enter the ID of the temporary term list each time you initiate a request. The temporary term list is not retained on the cloud. This parameter applies to users with a massive number of terms.

Notes:

- If both hotword_id and hotword_list are specified, hotword_list will take effect first.

- When the weight of a term is set to 11, this term becomes a super term. It is recommended that the weight is set to 11 only for critical and necessary terms. The overall accuracy will be affected if the weight is set to 11 for too many terms.

- When the weight of a term is set to 100, the term enhancement feature is enabled to replace homophones of this term. (This feature is supported only for 8k_zh and 16k_zh engines.) For example, if you configure "mizhi 1|100", the recognized word "mizhi 2", which is a homophone of "mizhi 2", will be forcibly replaced with "mizhi 2". It is recommended that you enable this feature based on the actual needs. You can set the weight to 100 for only critical and necessary terms. The overall accuracy will be affected if the weight is set to 100 for too many terms.
     */
    public String getHotwordList() {
        return this.HotwordList;
    }

    /**
     * Set Temporary term list. This parameter is used to improve the recognition accuracy.

- Restrictions for individual terms: The format is "term|weight". Each term can contain no more than 30 characters (or 10 Chinese characters. The weight can be in the range of [1-11] or 100. For example, "Tencent Cloud|5" or "ASR|11".

- Restrictions for the temporary term list: Multiple terms are separated by commas. The list can contain up to 128 terms. For example, "Tencent Cloud|10, Audio Recognition|5, ASR|11".

- Difference between hotword_id (term list) and hotword_list (temporary term list):

    - hotword_id: Term list. You need to create a term list in the console or by using the API first and obtain the term list ID.

    - hotword_list: Temporary term list. You can directly enter the ID of the temporary term list each time you initiate a request. The temporary term list is not retained on the cloud. This parameter applies to users with a massive number of terms.

Notes:

- If both hotword_id and hotword_list are specified, hotword_list will take effect first.

- When the weight of a term is set to 11, this term becomes a super term. It is recommended that the weight is set to 11 only for critical and necessary terms. The overall accuracy will be affected if the weight is set to 11 for too many terms.

- When the weight of a term is set to 100, the term enhancement feature is enabled to replace homophones of this term. (This feature is supported only for 8k_zh and 16k_zh engines.) For example, if you configure "mizhi 1|100", the recognized word "mizhi 2", which is a homophone of "mizhi 2", will be forcibly replaced with "mizhi 2". It is recommended that you enable this feature based on the actual needs. You can set the weight to 100 for only critical and necessary terms. The overall accuracy will be affected if the weight is set to 100 for too many terms.
     * @param HotwordList Temporary term list. This parameter is used to improve the recognition accuracy.

- Restrictions for individual terms: The format is "term|weight". Each term can contain no more than 30 characters (or 10 Chinese characters. The weight can be in the range of [1-11] or 100. For example, "Tencent Cloud|5" or "ASR|11".

- Restrictions for the temporary term list: Multiple terms are separated by commas. The list can contain up to 128 terms. For example, "Tencent Cloud|10, Audio Recognition|5, ASR|11".

- Difference between hotword_id (term list) and hotword_list (temporary term list):

    - hotword_id: Term list. You need to create a term list in the console or by using the API first and obtain the term list ID.

    - hotword_list: Temporary term list. You can directly enter the ID of the temporary term list each time you initiate a request. The temporary term list is not retained on the cloud. This parameter applies to users with a massive number of terms.

Notes:

- If both hotword_id and hotword_list are specified, hotword_list will take effect first.

- When the weight of a term is set to 11, this term becomes a super term. It is recommended that the weight is set to 11 only for critical and necessary terms. The overall accuracy will be affected if the weight is set to 11 for too many terms.

- When the weight of a term is set to 100, the term enhancement feature is enabled to replace homophones of this term. (This feature is supported only for 8k_zh and 16k_zh engines.) For example, if you configure "mizhi 1|100", the recognized word "mizhi 2", which is a homophone of "mizhi 2", will be forcibly replaced with "mizhi 2". It is recommended that you enable this feature based on the actual needs. You can set the weight to 100 for only critical and necessary terms. The overall accuracy will be affected if the weight is set to 100 for too many terms.
     */
    public void setHotwordList(String HotwordList) {
        this.HotwordList = HotwordList;
    }

    /**
     * Get List of keyword IDs for recognition. This parameter is left blank by default, indicating that no keyword is recognized. You can enter up to 10 IDs.
 
     * @return KeyWordLibIdList List of keyword IDs for recognition. This parameter is left blank by default, indicating that no keyword is recognized. You can enter up to 10 IDs.

     */
    public String [] getKeyWordLibIdList() {
        return this.KeyWordLibIdList;
    }

    /**
     * Set List of keyword IDs for recognition. This parameter is left blank by default, indicating that no keyword is recognized. You can enter up to 10 IDs.

     * @param KeyWordLibIdList List of keyword IDs for recognition. This parameter is left blank by default, indicating that no keyword is recognized. You can enter up to 10 IDs.

     */
    public void setKeyWordLibIdList(String [] KeyWordLibIdList) {
        this.KeyWordLibIdList = KeyWordLibIdList;
    }

    public CreateRecTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecTaskRequest(CreateRecTaskRequest source) {
        if (source.EngineModelType != null) {
            this.EngineModelType = new String(source.EngineModelType);
        }
        if (source.ChannelNum != null) {
            this.ChannelNum = new Long(source.ChannelNum);
        }
        if (source.ResTextFormat != null) {
            this.ResTextFormat = new Long(source.ResTextFormat);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.DataLen != null) {
            this.DataLen = new Long(source.DataLen);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.SpeakerDiarization != null) {
            this.SpeakerDiarization = new Long(source.SpeakerDiarization);
        }
        if (source.SpeakerNumber != null) {
            this.SpeakerNumber = new Long(source.SpeakerNumber);
        }
        if (source.HotwordId != null) {
            this.HotwordId = new String(source.HotwordId);
        }
        if (source.ReinforceHotword != null) {
            this.ReinforceHotword = new Long(source.ReinforceHotword);
        }
        if (source.CustomizationId != null) {
            this.CustomizationId = new String(source.CustomizationId);
        }
        if (source.EmotionRecognition != null) {
            this.EmotionRecognition = new Long(source.EmotionRecognition);
        }
        if (source.EmotionalEnergy != null) {
            this.EmotionalEnergy = new Long(source.EmotionalEnergy);
        }
        if (source.ConvertNumMode != null) {
            this.ConvertNumMode = new Long(source.ConvertNumMode);
        }
        if (source.FilterDirty != null) {
            this.FilterDirty = new Long(source.FilterDirty);
        }
        if (source.FilterPunc != null) {
            this.FilterPunc = new Long(source.FilterPunc);
        }
        if (source.FilterModal != null) {
            this.FilterModal = new Long(source.FilterModal);
        }
        if (source.SentenceMaxLength != null) {
            this.SentenceMaxLength = new Long(source.SentenceMaxLength);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.HotwordList != null) {
            this.HotwordList = new String(source.HotwordList);
        }
        if (source.KeyWordLibIdList != null) {
            this.KeyWordLibIdList = new String[source.KeyWordLibIdList.length];
            for (int i = 0; i < source.KeyWordLibIdList.length; i++) {
                this.KeyWordLibIdList[i] = new String(source.KeyWordLibIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineModelType", this.EngineModelType);
        this.setParamSimple(map, prefix + "ChannelNum", this.ChannelNum);
        this.setParamSimple(map, prefix + "ResTextFormat", this.ResTextFormat);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DataLen", this.DataLen);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "SpeakerDiarization", this.SpeakerDiarization);
        this.setParamSimple(map, prefix + "SpeakerNumber", this.SpeakerNumber);
        this.setParamSimple(map, prefix + "HotwordId", this.HotwordId);
        this.setParamSimple(map, prefix + "ReinforceHotword", this.ReinforceHotword);
        this.setParamSimple(map, prefix + "CustomizationId", this.CustomizationId);
        this.setParamSimple(map, prefix + "EmotionRecognition", this.EmotionRecognition);
        this.setParamSimple(map, prefix + "EmotionalEnergy", this.EmotionalEnergy);
        this.setParamSimple(map, prefix + "ConvertNumMode", this.ConvertNumMode);
        this.setParamSimple(map, prefix + "FilterDirty", this.FilterDirty);
        this.setParamSimple(map, prefix + "FilterPunc", this.FilterPunc);
        this.setParamSimple(map, prefix + "FilterModal", this.FilterModal);
        this.setParamSimple(map, prefix + "SentenceMaxLength", this.SentenceMaxLength);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "HotwordList", this.HotwordList);
        this.setParamArraySimple(map, prefix + "KeyWordLibIdList.", this.KeyWordLibIdList);

    }
}

