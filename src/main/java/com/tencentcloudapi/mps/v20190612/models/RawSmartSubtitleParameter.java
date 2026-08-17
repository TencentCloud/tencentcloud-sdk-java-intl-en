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
    * <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p>
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br>ASR recognition and pure caption translation currently support the following languages:<br><code>auto</code>: Auto-identification<br><code>zh</code>: Simplified Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>zh-PY</code>: Chinese-English-Cantonese<br><code>zh_medical</code>: Chinese health care<br><code>vi</code>: Vietnamese<br><code>ms</code>: Malay<br><code>id</code>: Indonesian<br><code>fil</code>: Filipino<br><code>th</code>: Thai<br><code>pt</code>: Portuguese<br><code>tr</code>: Turkish<br><code>ar</code>: Arabic<br><code>es</code>: Spanish<br><code>hi</code>: Hindi<br><code>fr</code>: French<br><code>de</code>: German<br><code>it</code>: Italian<br><code>zh_dialect</code>: Chinese dialect<br><code>zh_en</code>: Chinese-English<br><code>yue</code>: Cantonese<br><code>ru</code>: Russian<br><code>prime_zh</code>: Chinese-English dialect<br><code>af-ZA</code>: Afrikaans (South Africa)<br><code>sq-AL</code>: Albanian (Albania)<br><code>am-ET</code>: Amharic (Ethiopia)<br><code>ar-DZ</code>: Arabic (Algeria)<br><code>ar-BH</code>: Arabic (Bahrain)<br><code>ar-EG</code>: Arabic (Egypt)<br><code>ar-IQ</code>: Arabic (Iraq)<br><code>ar-IL</code>: Arabic (Israel)<br><code>ar-JO</code>: Arabic (Jordan)<br><code>ar-KW</code>: Arabic (Kuwait)<br><code>ar-LB</code>: Arabic (Lebanon)<br><code>ar-MR</code>: Arabic (Mauritania)<br><code>ar-MA</code>: Arabic (Morocco)<br><code>ar-OM</code>: Arabic (Oman)<br><code>ar-QA</code>: Arabic (Qatar)<br><code>ar-SA</code>: Arabic (Saudi Arabia)<br><code>ar-PS</code>: Arabic (State of Palestine)<br><code>ar-SY</code>: Arabic (Syria)<br><code>ar-TN</code>: Arabic (Tunisia)<br><code>ar-AE</code>: Arabic (United Arab Emirates)<br><code>ar-YE</code>: Arabic (Yemen)<br><code>hy-AM</code>: Armenian (Armenia)<br><code>az-AZ</code>: Azerbaijani (Azerbaijan)<br><code>eu-ES</code>: Basque (Spain)<br><code>bn-BD</code>: Bengali (Bangladesh)<br><code>bn-IN</code>: Bengali (India)<br><code>bs-BA</code>: Bosnian (Bosnia and Herzegovina)<br><code>bg-BG</code>: Bulgarian (Bulgaria)<br><code>my-MM</code>: Burmese (Myanmar)<br><code>ca-ES</code>: Catalan (Spain)<br><code>hr-HR</code>: Croatian (Croatia)<br><code>cs-CZ</code>: Czech (Czech Republic)<br><code>da-DK</code>: Danish (Denmark)<br><code>nl-BE</code>: Dutch (Belgium)<br><code>nl-NL</code>: Dutch (Netherlands)<br><code>en-AU</code>: English (Australia)<br><code>en-CA</code>: English (Canada)<br><code>en-GH</code>: English (Ghana)<br><code>en-HK</code>: English (Hong Kong (China))<br><code>en-IN</code>: English (India)<br><code>en-IE</code>: English (Ireland)<br><code>en-KE</code>: English (Kenya)<br><code>en-NZ</code>: English (New Zealand)<br><code>en-NG</code>: English (Nigeria)<br><code>en-PK</code>: English (Pakistan)<br><code>en-PH</code>: English (Philippines)<br><code>en-SG</code>: English (Singapore)<br><code>en-ZA</code>: English (South Africa)<br><code>en-TZ</code>: English (Tanzania)<br><code>en-GB</code>: English (UK)<br><code>en-US</code>: English (United States)<br><code>et-EE</code>: Estonian (Estonia)<br><code>fil-PH</code>: Filipino (Philippines)<br><code>fi-FI</code>: Finnish (Finland)<br><code>fr-BE</code>: French (Belgium)<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fr-CH</code>: French (Switzerland)<br><code>gl-ES</code>: Galician (Spain)<br><code>ka-GE</code>: Georgian (Georgia)<br><code>el-GR</code>: Greek (Greece)<br><code>gu-IN</code>: Gujarati (India)<br><code>iw-IL</code>: Hebrew (Israel)<br><code>hi-IN</code>: Hindi (India)<br><code>hu-HU</code>: Hungarian (Hungary)<br><code>is-IS</code>: Icelandic (Iceland)<br><code>id-ID</code>: Indonesian (Indonesia)<br><code>it-IT</code>: Italian (Italy)<br><code>it-CH</code>: Italian (Switzerland)<br><code>ja-JP</code>: Japanese (Japan)<br><code>jv-ID</code>: Javanese (Indonesia)<br><code>kn-IN</code>: Kannada (India)<br><code>kk-KZ</code>: Kazakh (Kazakhstan)<br><code>km-KH</code>: Khmer (Cambodia)<br><code>rw-RW</code>: Kinyarwanda (Rwanda)<br><code>ko-KR</code>: Korean (South Korea)<br><code>lo-LA</code>: Lao (Laos)<br><code>lv-LV</code>: Latvian (Latvia)<br><code>lt-LT</code>: Lithuanian (Lithuania)<br><code>mk-MK</code>: Macedonian (North Macedonia)<br><code>ms-MY</code>: Malay (Malaysia)<br><code>ml-IN</code>: Malayalam (India)<br><code>mr-IN</code>: Marathi (India)<br><code>mn-MN</code>: Mongolian (Mongolia)<br><code>ne-NP</code>: Nepali (Nepal)<br><code>no-NO</code>: Norwegian Bokmål (Norway)<br><code>fa-IR</code>: Persian (Iran)<br><code>pl-PL</code>: Polish (Poland)<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>ro-RO</code>: Romanian (Romania)<br><code>ru-RU</code>: Russian (Russia)<br><code>sr-RS</code>: Serbian (Serbia)<br><code>si-LK</code>: Sinhalese (Sri Lanka)<br><code>sk-SK</code>: Slovak (Slovakia)<br><code>sl-SI</code>: Slovenian (Slovenia)<br><code>st-ZA</code>: Southern Sotho (South Africa)<br><code>es-AR</code>: Spanish (Argentina)<br><code>es-BO</code>: Spanish (Bolivia)<br><code>es-CL</code>: Spanish (Chile)<br><code>es-CO</code>: Spanish (Colombia)<br><code>es-CR</code>: Spanish (Costa Rica)<br><code>es-DO</code>: Spanish (Dominican Republic)<br><code>es-EC</code>: Spanish (Ecuador)<br><code>es-SV</code>: Spanish (El Salvador)<br><code>es-GT</code>: Spanish (Guatemala)<br><code>es-HN</code>: Spanish (Honduras)<br><code>es-MX</code>: Spanish (Mexico)<br><code>es-NI</code>: Spanish (Nicaragua)<br><code>es-PA</code>: Spanish (Panama)<br><code>es-PY</code>: Spanish (Paraguay)<br><code>es-PE</code>: Spanish (Peru)<br><code>es-PR</code>: Spanish (Puerto Rico)<br><code>es-ES</code>: Spanish (Spain)<br><code>es-US</code>: Spanish (United States)<br><code>es-UY</code>: Spanish (Uruguay)<br><code>es-VE</code>: Spanish (Venezuela)<br><code>su-ID</code>: Sundanese (Indonesia)<br><code>sw-KE</code>: Swahili (Kenya)<br><code>sw-TZ</code>: Swahili (Tanzania)<br><code>sv-SE</code>: Swedish (Sweden)<br><code>ta-IN</code>: Tamil (India)<br><code>ta-MY</code>: Tamil (Malaysia)<br><code>ta-SG</code>: Tamil (Singapore)<br><code>ta-LK</code>: Tamil (Sri Lanka)<br><code>te-IN</code>: Telugu (India)<br><code>th-TH</code>: Thai (Thailand)<br><code>ts-ZA</code>: Tsonga (South Africa)<br><code>tr-TR</code>: Turkish (Türkiye)<br><code>uk-UA</code>: Ukrainian (Ukraine)<br><code>ur-IN</code>: Urdu (India)<br><code>ur-PK</code>: Urdu (Pakistan)<br><code>uz-UZ</code>: Uzbek (Uzbekistan)<br><code>ve-ZA</code>: Venda (South Africa)<code>vi-VN</code>: Vietnamese (Vietnam)<br><code>xh-ZA</code>: Xhosa (South Africa)<br><code>zu-ZA</code>: Zulu (South Africa)</p>
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * 
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * 
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * 
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * 
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * <p>Custom parameter</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * 
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
    * <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR).</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p>
    */
    @SerializedName("SpeakerMode")
    @Expose
    private Long SpeakerMode;

    /**
    * <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p>
    */
    @SerializedName("SpeakerLabel")
    @Expose
    private Long SpeakerLabel;

    /**
     * Get <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p> 
     * @return SubtitleType <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p>
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p>
     * @param SubtitleType <p>Smart subtitle language type.<br>0: source language.<br>1: target language.<br>2: source language and target language.<br>Only 0 is supported when TranslateSwitch is OFF.<br>Only 1 or 2 is supported when TranslateSwitch is ON.</p>
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br>ASR recognition and pure caption translation currently support the following languages:<br><code>auto</code>: Auto-identification<br><code>zh</code>: Simplified Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>zh-PY</code>: Chinese-English-Cantonese<br><code>zh_medical</code>: Chinese health care<br><code>vi</code>: Vietnamese<br><code>ms</code>: Malay<br><code>id</code>: Indonesian<br><code>fil</code>: Filipino<br><code>th</code>: Thai<br><code>pt</code>: Portuguese<br><code>tr</code>: Turkish<br><code>ar</code>: Arabic<br><code>es</code>: Spanish<br><code>hi</code>: Hindi<br><code>fr</code>: French<br><code>de</code>: German<br><code>it</code>: Italian<br><code>zh_dialect</code>: Chinese dialect<br><code>zh_en</code>: Chinese-English<br><code>yue</code>: Cantonese<br><code>ru</code>: Russian<br><code>prime_zh</code>: Chinese-English dialect<br><code>af-ZA</code>: Afrikaans (South Africa)<br><code>sq-AL</code>: Albanian (Albania)<br><code>am-ET</code>: Amharic (Ethiopia)<br><code>ar-DZ</code>: Arabic (Algeria)<br><code>ar-BH</code>: Arabic (Bahrain)<br><code>ar-EG</code>: Arabic (Egypt)<br><code>ar-IQ</code>: Arabic (Iraq)<br><code>ar-IL</code>: Arabic (Israel)<br><code>ar-JO</code>: Arabic (Jordan)<br><code>ar-KW</code>: Arabic (Kuwait)<br><code>ar-LB</code>: Arabic (Lebanon)<br><code>ar-MR</code>: Arabic (Mauritania)<br><code>ar-MA</code>: Arabic (Morocco)<br><code>ar-OM</code>: Arabic (Oman)<br><code>ar-QA</code>: Arabic (Qatar)<br><code>ar-SA</code>: Arabic (Saudi Arabia)<br><code>ar-PS</code>: Arabic (State of Palestine)<br><code>ar-SY</code>: Arabic (Syria)<br><code>ar-TN</code>: Arabic (Tunisia)<br><code>ar-AE</code>: Arabic (United Arab Emirates)<br><code>ar-YE</code>: Arabic (Yemen)<br><code>hy-AM</code>: Armenian (Armenia)<br><code>az-AZ</code>: Azerbaijani (Azerbaijan)<br><code>eu-ES</code>: Basque (Spain)<br><code>bn-BD</code>: Bengali (Bangladesh)<br><code>bn-IN</code>: Bengali (India)<br><code>bs-BA</code>: Bosnian (Bosnia and Herzegovina)<br><code>bg-BG</code>: Bulgarian (Bulgaria)<br><code>my-MM</code>: Burmese (Myanmar)<br><code>ca-ES</code>: Catalan (Spain)<br><code>hr-HR</code>: Croatian (Croatia)<br><code>cs-CZ</code>: Czech (Czech Republic)<br><code>da-DK</code>: Danish (Denmark)<br><code>nl-BE</code>: Dutch (Belgium)<br><code>nl-NL</code>: Dutch (Netherlands)<br><code>en-AU</code>: English (Australia)<br><code>en-CA</code>: English (Canada)<br><code>en-GH</code>: English (Ghana)<br><code>en-HK</code>: English (Hong Kong (China))<br><code>en-IN</code>: English (India)<br><code>en-IE</code>: English (Ireland)<br><code>en-KE</code>: English (Kenya)<br><code>en-NZ</code>: English (New Zealand)<br><code>en-NG</code>: English (Nigeria)<br><code>en-PK</code>: English (Pakistan)<br><code>en-PH</code>: English (Philippines)<br><code>en-SG</code>: English (Singapore)<br><code>en-ZA</code>: English (South Africa)<br><code>en-TZ</code>: English (Tanzania)<br><code>en-GB</code>: English (UK)<br><code>en-US</code>: English (United States)<br><code>et-EE</code>: Estonian (Estonia)<br><code>fil-PH</code>: Filipino (Philippines)<br><code>fi-FI</code>: Finnish (Finland)<br><code>fr-BE</code>: French (Belgium)<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fr-CH</code>: French (Switzerland)<br><code>gl-ES</code>: Galician (Spain)<br><code>ka-GE</code>: Georgian (Georgia)<br><code>el-GR</code>: Greek (Greece)<br><code>gu-IN</code>: Gujarati (India)<br><code>iw-IL</code>: Hebrew (Israel)<br><code>hi-IN</code>: Hindi (India)<br><code>hu-HU</code>: Hungarian (Hungary)<br><code>is-IS</code>: Icelandic (Iceland)<br><code>id-ID</code>: Indonesian (Indonesia)<br><code>it-IT</code>: Italian (Italy)<br><code>it-CH</code>: Italian (Switzerland)<br><code>ja-JP</code>: Japanese (Japan)<br><code>jv-ID</code>: Javanese (Indonesia)<br><code>kn-IN</code>: Kannada (India)<br><code>kk-KZ</code>: Kazakh (Kazakhstan)<br><code>km-KH</code>: Khmer (Cambodia)<br><code>rw-RW</code>: Kinyarwanda (Rwanda)<br><code>ko-KR</code>: Korean (South Korea)<br><code>lo-LA</code>: Lao (Laos)<br><code>lv-LV</code>: Latvian (Latvia)<br><code>lt-LT</code>: Lithuanian (Lithuania)<br><code>mk-MK</code>: Macedonian (North Macedonia)<br><code>ms-MY</code>: Malay (Malaysia)<br><code>ml-IN</code>: Malayalam (India)<br><code>mr-IN</code>: Marathi (India)<br><code>mn-MN</code>: Mongolian (Mongolia)<br><code>ne-NP</code>: Nepali (Nepal)<br><code>no-NO</code>: Norwegian Bokmål (Norway)<br><code>fa-IR</code>: Persian (Iran)<br><code>pl-PL</code>: Polish (Poland)<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>ro-RO</code>: Romanian (Romania)<br><code>ru-RU</code>: Russian (Russia)<br><code>sr-RS</code>: Serbian (Serbia)<br><code>si-LK</code>: Sinhalese (Sri Lanka)<br><code>sk-SK</code>: Slovak (Slovakia)<br><code>sl-SI</code>: Slovenian (Slovenia)<br><code>st-ZA</code>: Southern Sotho (South Africa)<br><code>es-AR</code>: Spanish (Argentina)<br><code>es-BO</code>: Spanish (Bolivia)<br><code>es-CL</code>: Spanish (Chile)<br><code>es-CO</code>: Spanish (Colombia)<br><code>es-CR</code>: Spanish (Costa Rica)<br><code>es-DO</code>: Spanish (Dominican Republic)<br><code>es-EC</code>: Spanish (Ecuador)<br><code>es-SV</code>: Spanish (El Salvador)<br><code>es-GT</code>: Spanish (Guatemala)<br><code>es-HN</code>: Spanish (Honduras)<br><code>es-MX</code>: Spanish (Mexico)<br><code>es-NI</code>: Spanish (Nicaragua)<br><code>es-PA</code>: Spanish (Panama)<br><code>es-PY</code>: Spanish (Paraguay)<br><code>es-PE</code>: Spanish (Peru)<br><code>es-PR</code>: Spanish (Puerto Rico)<br><code>es-ES</code>: Spanish (Spain)<br><code>es-US</code>: Spanish (United States)<br><code>es-UY</code>: Spanish (Uruguay)<br><code>es-VE</code>: Spanish (Venezuela)<br><code>su-ID</code>: Sundanese (Indonesia)<br><code>sw-KE</code>: Swahili (Kenya)<br><code>sw-TZ</code>: Swahili (Tanzania)<br><code>sv-SE</code>: Swedish (Sweden)<br><code>ta-IN</code>: Tamil (India)<br><code>ta-MY</code>: Tamil (Malaysia)<br><code>ta-SG</code>: Tamil (Singapore)<br><code>ta-LK</code>: Tamil (Sri Lanka)<br><code>te-IN</code>: Telugu (India)<br><code>th-TH</code>: Thai (Thailand)<br><code>ts-ZA</code>: Tsonga (South Africa)<br><code>tr-TR</code>: Turkish (Türkiye)<br><code>uk-UA</code>: Ukrainian (Ukraine)<br><code>ur-IN</code>: Urdu (India)<br><code>ur-PK</code>: Urdu (Pakistan)<br><code>uz-UZ</code>: Uzbek (Uzbekistan)<br><code>ve-ZA</code>: Venda (South Africa)<code>vi-VN</code>: Vietnamese (Vietnam)<br><code>xh-ZA</code>: Xhosa (South Africa)<br><code>zu-ZA</code>: Zulu (South Africa)</p> 
     * @return VideoSrcLanguage <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br>ASR recognition and pure caption translation currently support the following languages:<br><code>auto</code>: Auto-identification<br><code>zh</code>: Simplified Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>zh-PY</code>: Chinese-English-Cantonese<br><code>zh_medical</code>: Chinese health care<br><code>vi</code>: Vietnamese<br><code>ms</code>: Malay<br><code>id</code>: Indonesian<br><code>fil</code>: Filipino<br><code>th</code>: Thai<br><code>pt</code>: Portuguese<br><code>tr</code>: Turkish<br><code>ar</code>: Arabic<br><code>es</code>: Spanish<br><code>hi</code>: Hindi<br><code>fr</code>: French<br><code>de</code>: German<br><code>it</code>: Italian<br><code>zh_dialect</code>: Chinese dialect<br><code>zh_en</code>: Chinese-English<br><code>yue</code>: Cantonese<br><code>ru</code>: Russian<br><code>prime_zh</code>: Chinese-English dialect<br><code>af-ZA</code>: Afrikaans (South Africa)<br><code>sq-AL</code>: Albanian (Albania)<br><code>am-ET</code>: Amharic (Ethiopia)<br><code>ar-DZ</code>: Arabic (Algeria)<br><code>ar-BH</code>: Arabic (Bahrain)<br><code>ar-EG</code>: Arabic (Egypt)<br><code>ar-IQ</code>: Arabic (Iraq)<br><code>ar-IL</code>: Arabic (Israel)<br><code>ar-JO</code>: Arabic (Jordan)<br><code>ar-KW</code>: Arabic (Kuwait)<br><code>ar-LB</code>: Arabic (Lebanon)<br><code>ar-MR</code>: Arabic (Mauritania)<br><code>ar-MA</code>: Arabic (Morocco)<br><code>ar-OM</code>: Arabic (Oman)<br><code>ar-QA</code>: Arabic (Qatar)<br><code>ar-SA</code>: Arabic (Saudi Arabia)<br><code>ar-PS</code>: Arabic (State of Palestine)<br><code>ar-SY</code>: Arabic (Syria)<br><code>ar-TN</code>: Arabic (Tunisia)<br><code>ar-AE</code>: Arabic (United Arab Emirates)<br><code>ar-YE</code>: Arabic (Yemen)<br><code>hy-AM</code>: Armenian (Armenia)<br><code>az-AZ</code>: Azerbaijani (Azerbaijan)<br><code>eu-ES</code>: Basque (Spain)<br><code>bn-BD</code>: Bengali (Bangladesh)<br><code>bn-IN</code>: Bengali (India)<br><code>bs-BA</code>: Bosnian (Bosnia and Herzegovina)<br><code>bg-BG</code>: Bulgarian (Bulgaria)<br><code>my-MM</code>: Burmese (Myanmar)<br><code>ca-ES</code>: Catalan (Spain)<br><code>hr-HR</code>: Croatian (Croatia)<br><code>cs-CZ</code>: Czech (Czech Republic)<br><code>da-DK</code>: Danish (Denmark)<br><code>nl-BE</code>: Dutch (Belgium)<br><code>nl-NL</code>: Dutch (Netherlands)<br><code>en-AU</code>: English (Australia)<br><code>en-CA</code>: English (Canada)<br><code>en-GH</code>: English (Ghana)<br><code>en-HK</code>: English (Hong Kong (China))<br><code>en-IN</code>: English (India)<br><code>en-IE</code>: English (Ireland)<br><code>en-KE</code>: English (Kenya)<br><code>en-NZ</code>: English (New Zealand)<br><code>en-NG</code>: English (Nigeria)<br><code>en-PK</code>: English (Pakistan)<br><code>en-PH</code>: English (Philippines)<br><code>en-SG</code>: English (Singapore)<br><code>en-ZA</code>: English (South Africa)<br><code>en-TZ</code>: English (Tanzania)<br><code>en-GB</code>: English (UK)<br><code>en-US</code>: English (United States)<br><code>et-EE</code>: Estonian (Estonia)<br><code>fil-PH</code>: Filipino (Philippines)<br><code>fi-FI</code>: Finnish (Finland)<br><code>fr-BE</code>: French (Belgium)<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fr-CH</code>: French (Switzerland)<br><code>gl-ES</code>: Galician (Spain)<br><code>ka-GE</code>: Georgian (Georgia)<br><code>el-GR</code>: Greek (Greece)<br><code>gu-IN</code>: Gujarati (India)<br><code>iw-IL</code>: Hebrew (Israel)<br><code>hi-IN</code>: Hindi (India)<br><code>hu-HU</code>: Hungarian (Hungary)<br><code>is-IS</code>: Icelandic (Iceland)<br><code>id-ID</code>: Indonesian (Indonesia)<br><code>it-IT</code>: Italian (Italy)<br><code>it-CH</code>: Italian (Switzerland)<br><code>ja-JP</code>: Japanese (Japan)<br><code>jv-ID</code>: Javanese (Indonesia)<br><code>kn-IN</code>: Kannada (India)<br><code>kk-KZ</code>: Kazakh (Kazakhstan)<br><code>km-KH</code>: Khmer (Cambodia)<br><code>rw-RW</code>: Kinyarwanda (Rwanda)<br><code>ko-KR</code>: Korean (South Korea)<br><code>lo-LA</code>: Lao (Laos)<br><code>lv-LV</code>: Latvian (Latvia)<br><code>lt-LT</code>: Lithuanian (Lithuania)<br><code>mk-MK</code>: Macedonian (North Macedonia)<br><code>ms-MY</code>: Malay (Malaysia)<br><code>ml-IN</code>: Malayalam (India)<br><code>mr-IN</code>: Marathi (India)<br><code>mn-MN</code>: Mongolian (Mongolia)<br><code>ne-NP</code>: Nepali (Nepal)<br><code>no-NO</code>: Norwegian Bokmål (Norway)<br><code>fa-IR</code>: Persian (Iran)<br><code>pl-PL</code>: Polish (Poland)<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>ro-RO</code>: Romanian (Romania)<br><code>ru-RU</code>: Russian (Russia)<br><code>sr-RS</code>: Serbian (Serbia)<br><code>si-LK</code>: Sinhalese (Sri Lanka)<br><code>sk-SK</code>: Slovak (Slovakia)<br><code>sl-SI</code>: Slovenian (Slovenia)<br><code>st-ZA</code>: Southern Sotho (South Africa)<br><code>es-AR</code>: Spanish (Argentina)<br><code>es-BO</code>: Spanish (Bolivia)<br><code>es-CL</code>: Spanish (Chile)<br><code>es-CO</code>: Spanish (Colombia)<br><code>es-CR</code>: Spanish (Costa Rica)<br><code>es-DO</code>: Spanish (Dominican Republic)<br><code>es-EC</code>: Spanish (Ecuador)<br><code>es-SV</code>: Spanish (El Salvador)<br><code>es-GT</code>: Spanish (Guatemala)<br><code>es-HN</code>: Spanish (Honduras)<br><code>es-MX</code>: Spanish (Mexico)<br><code>es-NI</code>: Spanish (Nicaragua)<br><code>es-PA</code>: Spanish (Panama)<br><code>es-PY</code>: Spanish (Paraguay)<br><code>es-PE</code>: Spanish (Peru)<br><code>es-PR</code>: Spanish (Puerto Rico)<br><code>es-ES</code>: Spanish (Spain)<br><code>es-US</code>: Spanish (United States)<br><code>es-UY</code>: Spanish (Uruguay)<br><code>es-VE</code>: Spanish (Venezuela)<br><code>su-ID</code>: Sundanese (Indonesia)<br><code>sw-KE</code>: Swahili (Kenya)<br><code>sw-TZ</code>: Swahili (Tanzania)<br><code>sv-SE</code>: Swedish (Sweden)<br><code>ta-IN</code>: Tamil (India)<br><code>ta-MY</code>: Tamil (Malaysia)<br><code>ta-SG</code>: Tamil (Singapore)<br><code>ta-LK</code>: Tamil (Sri Lanka)<br><code>te-IN</code>: Telugu (India)<br><code>th-TH</code>: Thai (Thailand)<br><code>ts-ZA</code>: Tsonga (South Africa)<br><code>tr-TR</code>: Turkish (Türkiye)<br><code>uk-UA</code>: Ukrainian (Ukraine)<br><code>ur-IN</code>: Urdu (India)<br><code>ur-PK</code>: Urdu (Pakistan)<br><code>uz-UZ</code>: Uzbek (Uzbekistan)<br><code>ve-ZA</code>: Venda (South Africa)<code>vi-VN</code>: Vietnamese (Vietnam)<br><code>xh-ZA</code>: Xhosa (South Africa)<br><code>zu-ZA</code>: Zulu (South Africa)</p>
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br>ASR recognition and pure caption translation currently support the following languages:<br><code>auto</code>: Auto-identification<br><code>zh</code>: Simplified Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>zh-PY</code>: Chinese-English-Cantonese<br><code>zh_medical</code>: Chinese health care<br><code>vi</code>: Vietnamese<br><code>ms</code>: Malay<br><code>id</code>: Indonesian<br><code>fil</code>: Filipino<br><code>th</code>: Thai<br><code>pt</code>: Portuguese<br><code>tr</code>: Turkish<br><code>ar</code>: Arabic<br><code>es</code>: Spanish<br><code>hi</code>: Hindi<br><code>fr</code>: French<br><code>de</code>: German<br><code>it</code>: Italian<br><code>zh_dialect</code>: Chinese dialect<br><code>zh_en</code>: Chinese-English<br><code>yue</code>: Cantonese<br><code>ru</code>: Russian<br><code>prime_zh</code>: Chinese-English dialect<br><code>af-ZA</code>: Afrikaans (South Africa)<br><code>sq-AL</code>: Albanian (Albania)<br><code>am-ET</code>: Amharic (Ethiopia)<br><code>ar-DZ</code>: Arabic (Algeria)<br><code>ar-BH</code>: Arabic (Bahrain)<br><code>ar-EG</code>: Arabic (Egypt)<br><code>ar-IQ</code>: Arabic (Iraq)<br><code>ar-IL</code>: Arabic (Israel)<br><code>ar-JO</code>: Arabic (Jordan)<br><code>ar-KW</code>: Arabic (Kuwait)<br><code>ar-LB</code>: Arabic (Lebanon)<br><code>ar-MR</code>: Arabic (Mauritania)<br><code>ar-MA</code>: Arabic (Morocco)<br><code>ar-OM</code>: Arabic (Oman)<br><code>ar-QA</code>: Arabic (Qatar)<br><code>ar-SA</code>: Arabic (Saudi Arabia)<br><code>ar-PS</code>: Arabic (State of Palestine)<br><code>ar-SY</code>: Arabic (Syria)<br><code>ar-TN</code>: Arabic (Tunisia)<br><code>ar-AE</code>: Arabic (United Arab Emirates)<br><code>ar-YE</code>: Arabic (Yemen)<br><code>hy-AM</code>: Armenian (Armenia)<br><code>az-AZ</code>: Azerbaijani (Azerbaijan)<br><code>eu-ES</code>: Basque (Spain)<br><code>bn-BD</code>: Bengali (Bangladesh)<br><code>bn-IN</code>: Bengali (India)<br><code>bs-BA</code>: Bosnian (Bosnia and Herzegovina)<br><code>bg-BG</code>: Bulgarian (Bulgaria)<br><code>my-MM</code>: Burmese (Myanmar)<br><code>ca-ES</code>: Catalan (Spain)<br><code>hr-HR</code>: Croatian (Croatia)<br><code>cs-CZ</code>: Czech (Czech Republic)<br><code>da-DK</code>: Danish (Denmark)<br><code>nl-BE</code>: Dutch (Belgium)<br><code>nl-NL</code>: Dutch (Netherlands)<br><code>en-AU</code>: English (Australia)<br><code>en-CA</code>: English (Canada)<br><code>en-GH</code>: English (Ghana)<br><code>en-HK</code>: English (Hong Kong (China))<br><code>en-IN</code>: English (India)<br><code>en-IE</code>: English (Ireland)<br><code>en-KE</code>: English (Kenya)<br><code>en-NZ</code>: English (New Zealand)<br><code>en-NG</code>: English (Nigeria)<br><code>en-PK</code>: English (Pakistan)<br><code>en-PH</code>: English (Philippines)<br><code>en-SG</code>: English (Singapore)<br><code>en-ZA</code>: English (South Africa)<br><code>en-TZ</code>: English (Tanzania)<br><code>en-GB</code>: English (UK)<br><code>en-US</code>: English (United States)<br><code>et-EE</code>: Estonian (Estonia)<br><code>fil-PH</code>: Filipino (Philippines)<br><code>fi-FI</code>: Finnish (Finland)<br><code>fr-BE</code>: French (Belgium)<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fr-CH</code>: French (Switzerland)<br><code>gl-ES</code>: Galician (Spain)<br><code>ka-GE</code>: Georgian (Georgia)<br><code>el-GR</code>: Greek (Greece)<br><code>gu-IN</code>: Gujarati (India)<br><code>iw-IL</code>: Hebrew (Israel)<br><code>hi-IN</code>: Hindi (India)<br><code>hu-HU</code>: Hungarian (Hungary)<br><code>is-IS</code>: Icelandic (Iceland)<br><code>id-ID</code>: Indonesian (Indonesia)<br><code>it-IT</code>: Italian (Italy)<br><code>it-CH</code>: Italian (Switzerland)<br><code>ja-JP</code>: Japanese (Japan)<br><code>jv-ID</code>: Javanese (Indonesia)<br><code>kn-IN</code>: Kannada (India)<br><code>kk-KZ</code>: Kazakh (Kazakhstan)<br><code>km-KH</code>: Khmer (Cambodia)<br><code>rw-RW</code>: Kinyarwanda (Rwanda)<br><code>ko-KR</code>: Korean (South Korea)<br><code>lo-LA</code>: Lao (Laos)<br><code>lv-LV</code>: Latvian (Latvia)<br><code>lt-LT</code>: Lithuanian (Lithuania)<br><code>mk-MK</code>: Macedonian (North Macedonia)<br><code>ms-MY</code>: Malay (Malaysia)<br><code>ml-IN</code>: Malayalam (India)<br><code>mr-IN</code>: Marathi (India)<br><code>mn-MN</code>: Mongolian (Mongolia)<br><code>ne-NP</code>: Nepali (Nepal)<br><code>no-NO</code>: Norwegian Bokmål (Norway)<br><code>fa-IR</code>: Persian (Iran)<br><code>pl-PL</code>: Polish (Poland)<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>ro-RO</code>: Romanian (Romania)<br><code>ru-RU</code>: Russian (Russia)<br><code>sr-RS</code>: Serbian (Serbia)<br><code>si-LK</code>: Sinhalese (Sri Lanka)<br><code>sk-SK</code>: Slovak (Slovakia)<br><code>sl-SI</code>: Slovenian (Slovenia)<br><code>st-ZA</code>: Southern Sotho (South Africa)<br><code>es-AR</code>: Spanish (Argentina)<br><code>es-BO</code>: Spanish (Bolivia)<br><code>es-CL</code>: Spanish (Chile)<br><code>es-CO</code>: Spanish (Colombia)<br><code>es-CR</code>: Spanish (Costa Rica)<br><code>es-DO</code>: Spanish (Dominican Republic)<br><code>es-EC</code>: Spanish (Ecuador)<br><code>es-SV</code>: Spanish (El Salvador)<br><code>es-GT</code>: Spanish (Guatemala)<br><code>es-HN</code>: Spanish (Honduras)<br><code>es-MX</code>: Spanish (Mexico)<br><code>es-NI</code>: Spanish (Nicaragua)<br><code>es-PA</code>: Spanish (Panama)<br><code>es-PY</code>: Spanish (Paraguay)<br><code>es-PE</code>: Spanish (Peru)<br><code>es-PR</code>: Spanish (Puerto Rico)<br><code>es-ES</code>: Spanish (Spain)<br><code>es-US</code>: Spanish (United States)<br><code>es-UY</code>: Spanish (Uruguay)<br><code>es-VE</code>: Spanish (Venezuela)<br><code>su-ID</code>: Sundanese (Indonesia)<br><code>sw-KE</code>: Swahili (Kenya)<br><code>sw-TZ</code>: Swahili (Tanzania)<br><code>sv-SE</code>: Swedish (Sweden)<br><code>ta-IN</code>: Tamil (India)<br><code>ta-MY</code>: Tamil (Malaysia)<br><code>ta-SG</code>: Tamil (Singapore)<br><code>ta-LK</code>: Tamil (Sri Lanka)<br><code>te-IN</code>: Telugu (India)<br><code>th-TH</code>: Thai (Thailand)<br><code>ts-ZA</code>: Tsonga (South Africa)<br><code>tr-TR</code>: Turkish (Türkiye)<br><code>uk-UA</code>: Ukrainian (Ukraine)<br><code>ur-IN</code>: Urdu (India)<br><code>ur-PK</code>: Urdu (Pakistan)<br><code>uz-UZ</code>: Uzbek (Uzbekistan)<br><code>ve-ZA</code>: Venda (South Africa)<code>vi-VN</code>: Vietnamese (Vietnam)<br><code>xh-ZA</code>: Xhosa (South Africa)<br><code>zu-ZA</code>: Zulu (South Africa)</p>
     * @param VideoSrcLanguage <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br>ASR recognition and pure caption translation currently support the following languages:<br><code>auto</code>: Auto-identification<br><code>zh</code>: Simplified Chinese<br><code>en</code>: English<br><code>ja</code>: Japanese<br><code>ko</code>: Korean<br><code>zh-PY</code>: Chinese-English-Cantonese<br><code>zh_medical</code>: Chinese health care<br><code>vi</code>: Vietnamese<br><code>ms</code>: Malay<br><code>id</code>: Indonesian<br><code>fil</code>: Filipino<br><code>th</code>: Thai<br><code>pt</code>: Portuguese<br><code>tr</code>: Turkish<br><code>ar</code>: Arabic<br><code>es</code>: Spanish<br><code>hi</code>: Hindi<br><code>fr</code>: French<br><code>de</code>: German<br><code>it</code>: Italian<br><code>zh_dialect</code>: Chinese dialect<br><code>zh_en</code>: Chinese-English<br><code>yue</code>: Cantonese<br><code>ru</code>: Russian<br><code>prime_zh</code>: Chinese-English dialect<br><code>af-ZA</code>: Afrikaans (South Africa)<br><code>sq-AL</code>: Albanian (Albania)<br><code>am-ET</code>: Amharic (Ethiopia)<br><code>ar-DZ</code>: Arabic (Algeria)<br><code>ar-BH</code>: Arabic (Bahrain)<br><code>ar-EG</code>: Arabic (Egypt)<br><code>ar-IQ</code>: Arabic (Iraq)<br><code>ar-IL</code>: Arabic (Israel)<br><code>ar-JO</code>: Arabic (Jordan)<br><code>ar-KW</code>: Arabic (Kuwait)<br><code>ar-LB</code>: Arabic (Lebanon)<br><code>ar-MR</code>: Arabic (Mauritania)<br><code>ar-MA</code>: Arabic (Morocco)<br><code>ar-OM</code>: Arabic (Oman)<br><code>ar-QA</code>: Arabic (Qatar)<br><code>ar-SA</code>: Arabic (Saudi Arabia)<br><code>ar-PS</code>: Arabic (State of Palestine)<br><code>ar-SY</code>: Arabic (Syria)<br><code>ar-TN</code>: Arabic (Tunisia)<br><code>ar-AE</code>: Arabic (United Arab Emirates)<br><code>ar-YE</code>: Arabic (Yemen)<br><code>hy-AM</code>: Armenian (Armenia)<br><code>az-AZ</code>: Azerbaijani (Azerbaijan)<br><code>eu-ES</code>: Basque (Spain)<br><code>bn-BD</code>: Bengali (Bangladesh)<br><code>bn-IN</code>: Bengali (India)<br><code>bs-BA</code>: Bosnian (Bosnia and Herzegovina)<br><code>bg-BG</code>: Bulgarian (Bulgaria)<br><code>my-MM</code>: Burmese (Myanmar)<br><code>ca-ES</code>: Catalan (Spain)<br><code>hr-HR</code>: Croatian (Croatia)<br><code>cs-CZ</code>: Czech (Czech Republic)<br><code>da-DK</code>: Danish (Denmark)<br><code>nl-BE</code>: Dutch (Belgium)<br><code>nl-NL</code>: Dutch (Netherlands)<br><code>en-AU</code>: English (Australia)<br><code>en-CA</code>: English (Canada)<br><code>en-GH</code>: English (Ghana)<br><code>en-HK</code>: English (Hong Kong (China))<br><code>en-IN</code>: English (India)<br><code>en-IE</code>: English (Ireland)<br><code>en-KE</code>: English (Kenya)<br><code>en-NZ</code>: English (New Zealand)<br><code>en-NG</code>: English (Nigeria)<br><code>en-PK</code>: English (Pakistan)<br><code>en-PH</code>: English (Philippines)<br><code>en-SG</code>: English (Singapore)<br><code>en-ZA</code>: English (South Africa)<br><code>en-TZ</code>: English (Tanzania)<br><code>en-GB</code>: English (UK)<br><code>en-US</code>: English (United States)<br><code>et-EE</code>: Estonian (Estonia)<br><code>fil-PH</code>: Filipino (Philippines)<br><code>fi-FI</code>: Finnish (Finland)<br><code>fr-BE</code>: French (Belgium)<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fr-CH</code>: French (Switzerland)<br><code>gl-ES</code>: Galician (Spain)<br><code>ka-GE</code>: Georgian (Georgia)<br><code>el-GR</code>: Greek (Greece)<br><code>gu-IN</code>: Gujarati (India)<br><code>iw-IL</code>: Hebrew (Israel)<br><code>hi-IN</code>: Hindi (India)<br><code>hu-HU</code>: Hungarian (Hungary)<br><code>is-IS</code>: Icelandic (Iceland)<br><code>id-ID</code>: Indonesian (Indonesia)<br><code>it-IT</code>: Italian (Italy)<br><code>it-CH</code>: Italian (Switzerland)<br><code>ja-JP</code>: Japanese (Japan)<br><code>jv-ID</code>: Javanese (Indonesia)<br><code>kn-IN</code>: Kannada (India)<br><code>kk-KZ</code>: Kazakh (Kazakhstan)<br><code>km-KH</code>: Khmer (Cambodia)<br><code>rw-RW</code>: Kinyarwanda (Rwanda)<br><code>ko-KR</code>: Korean (South Korea)<br><code>lo-LA</code>: Lao (Laos)<br><code>lv-LV</code>: Latvian (Latvia)<br><code>lt-LT</code>: Lithuanian (Lithuania)<br><code>mk-MK</code>: Macedonian (North Macedonia)<br><code>ms-MY</code>: Malay (Malaysia)<br><code>ml-IN</code>: Malayalam (India)<br><code>mr-IN</code>: Marathi (India)<br><code>mn-MN</code>: Mongolian (Mongolia)<br><code>ne-NP</code>: Nepali (Nepal)<br><code>no-NO</code>: Norwegian Bokmål (Norway)<br><code>fa-IR</code>: Persian (Iran)<br><code>pl-PL</code>: Polish (Poland)<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>ro-RO</code>: Romanian (Romania)<br><code>ru-RU</code>: Russian (Russia)<br><code>sr-RS</code>: Serbian (Serbia)<br><code>si-LK</code>: Sinhalese (Sri Lanka)<br><code>sk-SK</code>: Slovak (Slovakia)<br><code>sl-SI</code>: Slovenian (Slovenia)<br><code>st-ZA</code>: Southern Sotho (South Africa)<br><code>es-AR</code>: Spanish (Argentina)<br><code>es-BO</code>: Spanish (Bolivia)<br><code>es-CL</code>: Spanish (Chile)<br><code>es-CO</code>: Spanish (Colombia)<br><code>es-CR</code>: Spanish (Costa Rica)<br><code>es-DO</code>: Spanish (Dominican Republic)<br><code>es-EC</code>: Spanish (Ecuador)<br><code>es-SV</code>: Spanish (El Salvador)<br><code>es-GT</code>: Spanish (Guatemala)<br><code>es-HN</code>: Spanish (Honduras)<br><code>es-MX</code>: Spanish (Mexico)<br><code>es-NI</code>: Spanish (Nicaragua)<br><code>es-PA</code>: Spanish (Panama)<br><code>es-PY</code>: Spanish (Paraguay)<br><code>es-PE</code>: Spanish (Peru)<br><code>es-PR</code>: Spanish (Puerto Rico)<br><code>es-ES</code>: Spanish (Spain)<br><code>es-US</code>: Spanish (United States)<br><code>es-UY</code>: Spanish (Uruguay)<br><code>es-VE</code>: Spanish (Venezuela)<br><code>su-ID</code>: Sundanese (Indonesia)<br><code>sw-KE</code>: Swahili (Kenya)<br><code>sw-TZ</code>: Swahili (Tanzania)<br><code>sv-SE</code>: Swedish (Sweden)<br><code>ta-IN</code>: Tamil (India)<br><code>ta-MY</code>: Tamil (Malaysia)<br><code>ta-SG</code>: Tamil (Singapore)<br><code>ta-LK</code>: Tamil (Sri Lanka)<br><code>te-IN</code>: Telugu (India)<br><code>th-TH</code>: Thai (Thailand)<br><code>ts-ZA</code>: Tsonga (South Africa)<br><code>tr-TR</code>: Turkish (Türkiye)<br><code>uk-UA</code>: Ukrainian (Ukraine)<br><code>ur-IN</code>: Urdu (India)<br><code>ur-PK</code>: Urdu (Pakistan)<br><code>uz-UZ</code>: Uzbek (Uzbekistan)<br><code>ve-ZA</code>: Venda (South Africa)<code>vi-VN</code>: Vietnamese (Vietnam)<br><code>xh-ZA</code>: Xhosa (South Africa)<br><code>zu-ZA</code>: Zulu (South Africa)</p>
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get  
     * @return SubtitleFormat 
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 
     * @param SubtitleFormat 
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get  
     * @return TranslateSwitch 
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set 
     * @param TranslateSwitch 
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get  
     * @return TranslateDstLanguage 
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set 
     * @param TranslateDstLanguage 
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get  
     * @return AsrHotWordsConfigure 
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set 
     * @param AsrHotWordsConfigure 
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get <p>Custom parameter</p> 
     * @return ExtInfo <p>Custom parameter</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Custom parameter</p>
     * @param ExtInfo <p>Custom parameter</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p> 
     * @return ProcessType <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
     * @param ProcessType <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get  
     * @return SelectingSubtitleAreasConfig 
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set 
     * @param SelectingSubtitleAreasConfig 
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    /**
     * Get <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR).</p> 
     * @return SubtitleEmbedId <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR).</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR).</p>
     * @param SubtitleEmbedId <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR).</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p> 
     * @return SpeakerMode <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p>
     */
    public Long getSpeakerMode() {
        return this.SpeakerMode;
    }

    /**
     * Set <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p>
     * @param SpeakerMode <p>Speaker identification mode. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>Default value: 0.</p>
     */
    public void setSpeakerMode(Long SpeakerMode) {
        this.SpeakerMode = SpeakerMode;
    }

    /**
     * Get <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p> 
     * @return SpeakerLabel <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p>
     */
    public Long getSpeakerLabel() {
        return this.SpeakerLabel;
    }

    /**
     * Set <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p>
     * @param SpeakerLabel <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>Default value: 0.</p>
     */
    public void setSpeakerLabel(Long SpeakerLabel) {
        this.SpeakerLabel = SpeakerLabel;
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
        if (source.SelectingSubtitleAreasConfig != null) {
            this.SelectingSubtitleAreasConfig = new SelectingSubtitleAreasConfig(source.SelectingSubtitleAreasConfig);
        }
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
        }
        if (source.SpeakerMode != null) {
            this.SpeakerMode = new Long(source.SpeakerMode);
        }
        if (source.SpeakerLabel != null) {
            this.SpeakerLabel = new Long(source.SpeakerLabel);
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
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "SpeakerMode", this.SpeakerMode);
        this.setParamSimple(map, prefix + "SpeakerLabel", this.SpeakerLabel);

    }
}

