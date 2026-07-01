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
    * <p>The model type used by the transcription service. Example value "bigmodel-zh". The languages supported by different package versions of speech to text are as follows:</p><ol><li>V2 version (recommended)</li></ol><p>"bigmodel-xxx": large model engine, recommended for use. "xxx" can be filled with specific languages, such as "bigmodel-zh". "xxx" can be filled with Chinese ("zh"), English ("en"), Cantonese ("yue"), Arabic ("ar"), German ("de"), French ("fr"), Spanish ("es"), Portuguese ("pt"), Indonesian ("id"), Italian ("it"), Korean ("ko"), Russian ("ru"), Thai ("th"), Vietnamese ("vi"), Japanese ("ja"), Turkish ("tr"), Hindi ("hi"), Malay ("ms"), Dutch ("nl"), Swedish ("sv"), Danish ("da"), Finnish ("fi"), Polish ("pl"), Czech ("cs"), Filipino ("fil"), Persian ("fa"), Greek ("el"), Hungarian ("hu"), Macedonian ("mk"), Romanian ("ro").</p><ol start="2"><li>V1 version (legacy version)</li></ol><p>Standard language engine:</p><ul><li>"16k_zh_large": 16k large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition.</li><li>"16k_zh_en": latest 16k Chinese-English large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition, optimized for Chinese-English mixed scenarios.</li></ul><p>Advanced language engine:</p><ul><li>"zh-yue": Cantonese Chinese</li><li>"vi": Vietnamese</li><li>"ja": Japanese</li><li>"ko": Korean</li><li>"id": Indonesian</li><li>"th": Thai</li><li>"pt": Portuguese</li><li>"tr": Turkish</li><li>"ar": Arabic</li><li>"es": Spanish</li><li>"hi": Hindi</li><li>"fr": French</li><li>"ms": Malay</li><li>"fil": Filipino</li><li>"de": German</li><li>"it": Italian</li><li>"ru": Russian</li><li>"sv": Swedish</li><li>"da": Danish</li><li>"no": Norwegian</li></ul><p>Note:<br>If the language you need is not available, contact our technical support.</p>
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * <p>The time when speech recognition vad ranges from 240 to 2000, with a default of 1000. The unit is ms. A smaller value enables faster sentence segmentation for speech recognition.<br>Example value: 1000</p>
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
    * <p>Temporary term list: improves recognition accuracy by biasing the ASR engine toward specific terms.</p>
<ul>
<li>Single term format: term|weight. Each term must not exceed 30 characters (or 10 Chinese characters). Weight must be an integer from [1-11] or 100. Examples: Tencent Cloud|5, ASR|11.</li>
<li>List format and limits: separate multiple terms with commas. Up to 128 terms are supported. Example: Tencent Cloud|10,speech recognition|5,ASR|11.<br>
Note:<br>
When the term weight is set to 11, the term is treated as a high-priority super term. Use weight 11 only for terms that are critical and must be recognized reliably. Setting too many terms to weight 11 may reduce overall accuracy.<br>
When the term weight is set to 100, the term enables homophone replacement. For example, when the configuration is write|100, any recognized homophone of "write" (such as "right") is forcibly replaced with "write". Enable this feature only when needed, and reserve weight 100 for terms where homophone confusion is a real problem. Setting too many terms to weight 100 may reduce overall accuracy.<br>
Terms must not contain spaces. Invalid example: ASR Tencent Cloud<br>
Example value: voice assistant|10</li>
</ul>
    */
    @SerializedName("HotWordList")
    @Expose
    private String HotWordList;

    /**
    * <p>Fuzzy recognition is an advanced language engine feature. You can only specify advanced language engines other than zh-dialect and zh-yue. Note: You can specify up to 4 languages.</p>
    */
    @SerializedName("AlternativeLanguage")
    @Expose
    private String [] AlternativeLanguage;

    /**
    * <p>The far-field voice suppression capacity of vad (without impacting asr recognition accuracy) ranges from [0, 3], defaulting to 0. Recommended setting is 2 for better far-field voice suppression capacity.</p>
    */
    @SerializedName("VadLevel")
    @Expose
    private Long VadLevel;

    /**
    * <p>Whether to filter profanity (currently only support basic language engine and standard language engine), range [0, 2], default value 0.<br>0: not filter profanity; 1: filter dirty words; 2: replace with " * ".</p>
    */
    @SerializedName("FilterDirty")
    @Expose
    private Long FilterDirty;

    /**
    * <p>Whether to filter modal particles (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.<br>0: Do not filter modal particles; 1: Partial filtering; 2: Strict filtering.</p>
    */
    @SerializedName("FilterModal")
    @Expose
    private Long FilterModal;

    /**
    * <p>Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.<br>0: does not filter periods at the end of sentences; 1: filter out periods at the end of sentences.</p>
    */
    @SerializedName("FilterPunc")
    @Expose
    private Long FilterPunc;

    /**
     * Get <p>The model type used by the transcription service. Example value "bigmodel-zh". The languages supported by different package versions of speech to text are as follows:</p><ol><li>V2 version (recommended)</li></ol><p>"bigmodel-xxx": large model engine, recommended for use. "xxx" can be filled with specific languages, such as "bigmodel-zh". "xxx" can be filled with Chinese ("zh"), English ("en"), Cantonese ("yue"), Arabic ("ar"), German ("de"), French ("fr"), Spanish ("es"), Portuguese ("pt"), Indonesian ("id"), Italian ("it"), Korean ("ko"), Russian ("ru"), Thai ("th"), Vietnamese ("vi"), Japanese ("ja"), Turkish ("tr"), Hindi ("hi"), Malay ("ms"), Dutch ("nl"), Swedish ("sv"), Danish ("da"), Finnish ("fi"), Polish ("pl"), Czech ("cs"), Filipino ("fil"), Persian ("fa"), Greek ("el"), Hungarian ("hu"), Macedonian ("mk"), Romanian ("ro").</p><ol start="2"><li>V1 version (legacy version)</li></ol><p>Standard language engine:</p><ul><li>"16k_zh_large": 16k large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition.</li><li>"16k_zh_en": latest 16k Chinese-English large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition, optimized for Chinese-English mixed scenarios.</li></ul><p>Advanced language engine:</p><ul><li>"zh-yue": Cantonese Chinese</li><li>"vi": Vietnamese</li><li>"ja": Japanese</li><li>"ko": Korean</li><li>"id": Indonesian</li><li>"th": Thai</li><li>"pt": Portuguese</li><li>"tr": Turkish</li><li>"ar": Arabic</li><li>"es": Spanish</li><li>"hi": Hindi</li><li>"fr": French</li><li>"ms": Malay</li><li>"fil": Filipino</li><li>"de": German</li><li>"it": Italian</li><li>"ru": Russian</li><li>"sv": Swedish</li><li>"da": Danish</li><li>"no": Norwegian</li></ul><p>Note:<br>If the language you need is not available, contact our technical support.</p> 
     * @return Lang <p>The model type used by the transcription service. Example value "bigmodel-zh". The languages supported by different package versions of speech to text are as follows:</p><ol><li>V2 version (recommended)</li></ol><p>"bigmodel-xxx": large model engine, recommended for use. "xxx" can be filled with specific languages, such as "bigmodel-zh". "xxx" can be filled with Chinese ("zh"), English ("en"), Cantonese ("yue"), Arabic ("ar"), German ("de"), French ("fr"), Spanish ("es"), Portuguese ("pt"), Indonesian ("id"), Italian ("it"), Korean ("ko"), Russian ("ru"), Thai ("th"), Vietnamese ("vi"), Japanese ("ja"), Turkish ("tr"), Hindi ("hi"), Malay ("ms"), Dutch ("nl"), Swedish ("sv"), Danish ("da"), Finnish ("fi"), Polish ("pl"), Czech ("cs"), Filipino ("fil"), Persian ("fa"), Greek ("el"), Hungarian ("hu"), Macedonian ("mk"), Romanian ("ro").</p><ol start="2"><li>V1 version (legacy version)</li></ol><p>Standard language engine:</p><ul><li>"16k_zh_large": 16k large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition.</li><li>"16k_zh_en": latest 16k Chinese-English large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition, optimized for Chinese-English mixed scenarios.</li></ul><p>Advanced language engine:</p><ul><li>"zh-yue": Cantonese Chinese</li><li>"vi": Vietnamese</li><li>"ja": Japanese</li><li>"ko": Korean</li><li>"id": Indonesian</li><li>"th": Thai</li><li>"pt": Portuguese</li><li>"tr": Turkish</li><li>"ar": Arabic</li><li>"es": Spanish</li><li>"hi": Hindi</li><li>"fr": French</li><li>"ms": Malay</li><li>"fil": Filipino</li><li>"de": German</li><li>"it": Italian</li><li>"ru": Russian</li><li>"sv": Swedish</li><li>"da": Danish</li><li>"no": Norwegian</li></ul><p>Note:<br>If the language you need is not available, contact our technical support.</p>
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set <p>The model type used by the transcription service. Example value "bigmodel-zh". The languages supported by different package versions of speech to text are as follows:</p><ol><li>V2 version (recommended)</li></ol><p>"bigmodel-xxx": large model engine, recommended for use. "xxx" can be filled with specific languages, such as "bigmodel-zh". "xxx" can be filled with Chinese ("zh"), English ("en"), Cantonese ("yue"), Arabic ("ar"), German ("de"), French ("fr"), Spanish ("es"), Portuguese ("pt"), Indonesian ("id"), Italian ("it"), Korean ("ko"), Russian ("ru"), Thai ("th"), Vietnamese ("vi"), Japanese ("ja"), Turkish ("tr"), Hindi ("hi"), Malay ("ms"), Dutch ("nl"), Swedish ("sv"), Danish ("da"), Finnish ("fi"), Polish ("pl"), Czech ("cs"), Filipino ("fil"), Persian ("fa"), Greek ("el"), Hungarian ("hu"), Macedonian ("mk"), Romanian ("ro").</p><ol start="2"><li>V1 version (legacy version)</li></ol><p>Standard language engine:</p><ul><li>"16k_zh_large": 16k large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition.</li><li>"16k_zh_en": latest 16k Chinese-English large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition, optimized for Chinese-English mixed scenarios.</li></ul><p>Advanced language engine:</p><ul><li>"zh-yue": Cantonese Chinese</li><li>"vi": Vietnamese</li><li>"ja": Japanese</li><li>"ko": Korean</li><li>"id": Indonesian</li><li>"th": Thai</li><li>"pt": Portuguese</li><li>"tr": Turkish</li><li>"ar": Arabic</li><li>"es": Spanish</li><li>"hi": Hindi</li><li>"fr": French</li><li>"ms": Malay</li><li>"fil": Filipino</li><li>"de": German</li><li>"it": Italian</li><li>"ru": Russian</li><li>"sv": Swedish</li><li>"da": Danish</li><li>"no": Norwegian</li></ul><p>Note:<br>If the language you need is not available, contact our technical support.</p>
     * @param Lang <p>The model type used by the transcription service. Example value "bigmodel-zh". The languages supported by different package versions of speech to text are as follows:</p><ol><li>V2 version (recommended)</li></ol><p>"bigmodel-xxx": large model engine, recommended for use. "xxx" can be filled with specific languages, such as "bigmodel-zh". "xxx" can be filled with Chinese ("zh"), English ("en"), Cantonese ("yue"), Arabic ("ar"), German ("de"), French ("fr"), Spanish ("es"), Portuguese ("pt"), Indonesian ("id"), Italian ("it"), Korean ("ko"), Russian ("ru"), Thai ("th"), Vietnamese ("vi"), Japanese ("ja"), Turkish ("tr"), Hindi ("hi"), Malay ("ms"), Dutch ("nl"), Swedish ("sv"), Danish ("da"), Finnish ("fi"), Polish ("pl"), Czech ("cs"), Filipino ("fil"), Persian ("fa"), Greek ("el"), Hungarian ("hu"), Macedonian ("mk"), Romanian ("ro").</p><ol start="2"><li>V1 version (legacy version)</li></ol><p>Standard language engine:</p><ul><li>"16k_zh_large": 16k large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition.</li><li>"16k_zh_en": latest 16k Chinese-English large model engine, simultaneously supports Chinese, English, and multiple Chinese dialects with accent recognition, optimized for Chinese-English mixed scenarios.</li></ul><p>Advanced language engine:</p><ul><li>"zh-yue": Cantonese Chinese</li><li>"vi": Vietnamese</li><li>"ja": Japanese</li><li>"ko": Korean</li><li>"id": Indonesian</li><li>"th": Thai</li><li>"pt": Portuguese</li><li>"tr": Turkish</li><li>"ar": Arabic</li><li>"es": Spanish</li><li>"hi": Hindi</li><li>"fr": French</li><li>"ms": Malay</li><li>"fil": Filipino</li><li>"de": German</li><li>"it": Italian</li><li>"ru": Russian</li><li>"sv": Swedish</li><li>"da": Danish</li><li>"no": Norwegian</li></ul><p>Note:<br>If the language you need is not available, contact our technical support.</p>
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get <p>The time when speech recognition vad ranges from 240 to 2000, with a default of 1000. The unit is ms. A smaller value enables faster sentence segmentation for speech recognition.<br>Example value: 1000</p> 
     * @return VadSilenceTime <p>The time when speech recognition vad ranges from 240 to 2000, with a default of 1000. The unit is ms. A smaller value enables faster sentence segmentation for speech recognition.<br>Example value: 1000</p>
     */
    public Long getVadSilenceTime() {
        return this.VadSilenceTime;
    }

    /**
     * Set <p>The time when speech recognition vad ranges from 240 to 2000, with a default of 1000. The unit is ms. A smaller value enables faster sentence segmentation for speech recognition.<br>Example value: 1000</p>
     * @param VadSilenceTime <p>The time when speech recognition vad ranges from 240 to 2000, with a default of 1000. The unit is ms. A smaller value enables faster sentence segmentation for speech recognition.<br>Example value: 1000</p>
     */
    public void setVadSilenceTime(Long VadSilenceTime) {
        this.VadSilenceTime = VadSilenceTime;
    }

    /**
     * Get <p>Temporary term list: improves recognition accuracy by biasing the ASR engine toward specific terms.</p>
<ul>
<li>Single term format: term|weight. Each term must not exceed 30 characters (or 10 Chinese characters). Weight must be an integer from [1-11] or 100. Examples: Tencent Cloud|5, ASR|11.</li>
<li>List format and limits: separate multiple terms with commas. Up to 128 terms are supported. Example: Tencent Cloud|10,speech recognition|5,ASR|11.<br>
Note:<br>
When the term weight is set to 11, the term is treated as a high-priority super term. Use weight 11 only for terms that are critical and must be recognized reliably. Setting too many terms to weight 11 may reduce overall accuracy.<br>
When the term weight is set to 100, the term enables homophone replacement. For example, when the configuration is write|100, any recognized homophone of "write" (such as "right") is forcibly replaced with "write". Enable this feature only when needed, and reserve weight 100 for terms where homophone confusion is a real problem. Setting too many terms to weight 100 may reduce overall accuracy.<br>
Terms must not contain spaces. Invalid example: ASR Tencent Cloud<br>
Example value: voice assistant|10</li>
</ul> 
     * @return HotWordList <p>Temporary term list: improves recognition accuracy by biasing the ASR engine toward specific terms.</p>
<ul>
<li>Single term format: term|weight. Each term must not exceed 30 characters (or 10 Chinese characters). Weight must be an integer from [1-11] or 100. Examples: Tencent Cloud|5, ASR|11.</li>
<li>List format and limits: separate multiple terms with commas. Up to 128 terms are supported. Example: Tencent Cloud|10,speech recognition|5,ASR|11.<br>
Note:<br>
When the term weight is set to 11, the term is treated as a high-priority super term. Use weight 11 only for terms that are critical and must be recognized reliably. Setting too many terms to weight 11 may reduce overall accuracy.<br>
When the term weight is set to 100, the term enables homophone replacement. For example, when the configuration is write|100, any recognized homophone of "write" (such as "right") is forcibly replaced with "write". Enable this feature only when needed, and reserve weight 100 for terms where homophone confusion is a real problem. Setting too many terms to weight 100 may reduce overall accuracy.<br>
Terms must not contain spaces. Invalid example: ASR Tencent Cloud<br>
Example value: voice assistant|10</li>
</ul>
     */
    public String getHotWordList() {
        return this.HotWordList;
    }

    /**
     * Set <p>Temporary term list: improves recognition accuracy by biasing the ASR engine toward specific terms.</p>
<ul>
<li>Single term format: term|weight. Each term must not exceed 30 characters (or 10 Chinese characters). Weight must be an integer from [1-11] or 100. Examples: Tencent Cloud|5, ASR|11.</li>
<li>List format and limits: separate multiple terms with commas. Up to 128 terms are supported. Example: Tencent Cloud|10,speech recognition|5,ASR|11.<br>
Note:<br>
When the term weight is set to 11, the term is treated as a high-priority super term. Use weight 11 only for terms that are critical and must be recognized reliably. Setting too many terms to weight 11 may reduce overall accuracy.<br>
When the term weight is set to 100, the term enables homophone replacement. For example, when the configuration is write|100, any recognized homophone of "write" (such as "right") is forcibly replaced with "write". Enable this feature only when needed, and reserve weight 100 for terms where homophone confusion is a real problem. Setting too many terms to weight 100 may reduce overall accuracy.<br>
Terms must not contain spaces. Invalid example: ASR Tencent Cloud<br>
Example value: voice assistant|10</li>
</ul>
     * @param HotWordList <p>Temporary term list: improves recognition accuracy by biasing the ASR engine toward specific terms.</p>
<ul>
<li>Single term format: term|weight. Each term must not exceed 30 characters (or 10 Chinese characters). Weight must be an integer from [1-11] or 100. Examples: Tencent Cloud|5, ASR|11.</li>
<li>List format and limits: separate multiple terms with commas. Up to 128 terms are supported. Example: Tencent Cloud|10,speech recognition|5,ASR|11.<br>
Note:<br>
When the term weight is set to 11, the term is treated as a high-priority super term. Use weight 11 only for terms that are critical and must be recognized reliably. Setting too many terms to weight 11 may reduce overall accuracy.<br>
When the term weight is set to 100, the term enables homophone replacement. For example, when the configuration is write|100, any recognized homophone of "write" (such as "right") is forcibly replaced with "write". Enable this feature only when needed, and reserve weight 100 for terms where homophone confusion is a real problem. Setting too many terms to weight 100 may reduce overall accuracy.<br>
Terms must not contain spaces. Invalid example: ASR Tencent Cloud<br>
Example value: voice assistant|10</li>
</ul>
     */
    public void setHotWordList(String HotWordList) {
        this.HotWordList = HotWordList;
    }

    /**
     * Get <p>Fuzzy recognition is an advanced language engine feature. You can only specify advanced language engines other than zh-dialect and zh-yue. Note: You can specify up to 4 languages.</p> 
     * @return AlternativeLanguage <p>Fuzzy recognition is an advanced language engine feature. You can only specify advanced language engines other than zh-dialect and zh-yue. Note: You can specify up to 4 languages.</p>
     */
    public String [] getAlternativeLanguage() {
        return this.AlternativeLanguage;
    }

    /**
     * Set <p>Fuzzy recognition is an advanced language engine feature. You can only specify advanced language engines other than zh-dialect and zh-yue. Note: You can specify up to 4 languages.</p>
     * @param AlternativeLanguage <p>Fuzzy recognition is an advanced language engine feature. You can only specify advanced language engines other than zh-dialect and zh-yue. Note: You can specify up to 4 languages.</p>
     */
    public void setAlternativeLanguage(String [] AlternativeLanguage) {
        this.AlternativeLanguage = AlternativeLanguage;
    }

    /**
     * Get <p>The far-field voice suppression capacity of vad (without impacting asr recognition accuracy) ranges from [0, 3], defaulting to 0. Recommended setting is 2 for better far-field voice suppression capacity.</p> 
     * @return VadLevel <p>The far-field voice suppression capacity of vad (without impacting asr recognition accuracy) ranges from [0, 3], defaulting to 0. Recommended setting is 2 for better far-field voice suppression capacity.</p>
     */
    public Long getVadLevel() {
        return this.VadLevel;
    }

    /**
     * Set <p>The far-field voice suppression capacity of vad (without impacting asr recognition accuracy) ranges from [0, 3], defaulting to 0. Recommended setting is 2 for better far-field voice suppression capacity.</p>
     * @param VadLevel <p>The far-field voice suppression capacity of vad (without impacting asr recognition accuracy) ranges from [0, 3], defaulting to 0. Recommended setting is 2 for better far-field voice suppression capacity.</p>
     */
    public void setVadLevel(Long VadLevel) {
        this.VadLevel = VadLevel;
    }

    /**
     * Get <p>Whether to filter profanity (currently only support basic language engine and standard language engine), range [0, 2], default value 0.<br>0: not filter profanity; 1: filter dirty words; 2: replace with " * ".</p> 
     * @return FilterDirty <p>Whether to filter profanity (currently only support basic language engine and standard language engine), range [0, 2], default value 0.<br>0: not filter profanity; 1: filter dirty words; 2: replace with " * ".</p>
     */
    public Long getFilterDirty() {
        return this.FilterDirty;
    }

    /**
     * Set <p>Whether to filter profanity (currently only support basic language engine and standard language engine), range [0, 2], default value 0.<br>0: not filter profanity; 1: filter dirty words; 2: replace with " * ".</p>
     * @param FilterDirty <p>Whether to filter profanity (currently only support basic language engine and standard language engine), range [0, 2], default value 0.<br>0: not filter profanity; 1: filter dirty words; 2: replace with " * ".</p>
     */
    public void setFilterDirty(Long FilterDirty) {
        this.FilterDirty = FilterDirty;
    }

    /**
     * Get <p>Whether to filter modal particles (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.<br>0: Do not filter modal particles; 1: Partial filtering; 2: Strict filtering.</p> 
     * @return FilterModal <p>Whether to filter modal particles (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.<br>0: Do not filter modal particles; 1: Partial filtering; 2: Strict filtering.</p>
     */
    public Long getFilterModal() {
        return this.FilterModal;
    }

    /**
     * Set <p>Whether to filter modal particles (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.<br>0: Do not filter modal particles; 1: Partial filtering; 2: Strict filtering.</p>
     * @param FilterModal <p>Whether to filter modal particles (currently only support basic language engine and standard language engine). Range: [0, 2]. Default value: 0.<br>0: Do not filter modal particles; 1: Partial filtering; 2: Strict filtering.</p>
     */
    public void setFilterModal(Long FilterModal) {
        this.FilterModal = FilterModal;
    }

    /**
     * Get <p>Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.<br>0: does not filter periods at the end of sentences; 1: filter out periods at the end of sentences.</p> 
     * @return FilterPunc <p>Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.<br>0: does not filter periods at the end of sentences; 1: filter out periods at the end of sentences.</p>
     */
    public Long getFilterPunc() {
        return this.FilterPunc;
    }

    /**
     * Set <p>Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.<br>0: does not filter periods at the end of sentences; 1: filter out periods at the end of sentences.</p>
     * @param FilterPunc <p>Whether to filter periods at the end of sentences (currently only support basic language engine and standard language engine), range [0, 1], default value 0.<br>0: does not filter periods at the end of sentences; 1: filter out periods at the end of sentences.</p>
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

