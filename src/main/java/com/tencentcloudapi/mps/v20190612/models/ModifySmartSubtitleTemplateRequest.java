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

public class ModifySmartSubtitleTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of the smart subtitle template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * Smart subtitle template name.
Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Smart subtitle template description.
Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Source language of the video with smart subtitles.
OCR recognition only supports the following languages:
`zh_en`: Chinese and English.
`multi`: others.
ASR recognition and pure subtitle translation currently support the following languages:
`auto`: automatic recognition (it is only supported in pure subtitle translation).
`zh`: Simplified Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`vi`: Vietnamese.
`ms`: Malay.
`id`: Indonesian.
`fil`: Filipino.
`th`: Thai.
`pt`: Portuguese.
`tr`: Turkish.
`ar`: Arabic.
`es`: Spanish.
`hi`: Hindi.
`fr`: French.
`de`: German.
`it`: Italian.
`zh_dialect`: Chinese dialect.
`zh_en`: Chinese and English.
`yue`: Cantonese.
`ru`: Russian.
`prime_zh`: Chinese, English, and Chinese dialects.
`af-ZA`: Afrikaans (South Africa).
`sq-AL`: Albanian (Albania).
`am-ET`: Amharic (Ethiopia).
`ar-DZ`: Arabic (Algeria).
`ar-BH`: Arabic (Bahrain).
`ar-EG`: Arabic (Egypt).
`ar-IQ`: Arabic (Iraq).
`ar-IL`: Arabic (Israel).
`ar-JO`: Arabic (Jordan).
`ar-KW`: Arabic (Kuwait).
`ar-LB`: Arabic (Lebanon).
`ar-MR`: Arabic (Mauritania).
`ar-MA`: Arabic (Morocco).
`ar-OM`: Arabic (Oman).
`ar-QA`: Arabic (Qatar).
`ar-SA`: Arabic (Saudi Arabia).
`ar-PS`: Arabic (State of Palestine).
`ar-SY`: Arabic (Syria).
`ar-TN`: Arabic (Tunisia).
`ar-AE`: Arabic (United Arab Emirates).
`ar-YE`: Arabic (Yemen).
`hy-AM`: Armenian (Armenia).
`az-AZ`: Azerbaijani (Azerbaijan).
`eu-ES`: Basque (Spain).
`bn-BD`: Bengali (Bangladesh).
`bn-IN`: Bengali (India).
`bs-BA`: Bosnian (Bosnia and Herzegovina).
`bg-BG`: Bulgarian (Bulgaria).
`my-MM`: Burmese (Myanmar).
`ca-ES`: Catalan (Spain).
`hr-HR`: Croatian (Croatia).
`cs-CZ`: Czech (Czech Republic).
`da-DK`: Danish (Denmark).
`nl-BE`: Dutch (Belgium).
`nl-NL`: Dutch (Holland).
`en-AU`: English (Australia).
`en-CA`: English (Canada).
`en-GH`: English (Ghana).
`en-HK`: English (Hong Kong (China)).
`en-IN`: English (India).
`en-IE`: English (Ireland).
`en-KE`: English (Kenya).
`en-NZ`: English (New Zealand).
`en-NG`: English (Nigeria).
`en-PK`: English (Pakistan).
`en-PH`: English (Philippines).
`en-SG`: English (Singapore).
`en-ZA`: English (South Africa).
`en-TZ`: English (Tanzania).
`en-GB`: English (UK).
`en-US`: English (US).
`et-EE`: Estonian (Estonia).
`fil-PH`: Filipino (Philippines).
`fi-FI`: Finnish (Finland).
`fr-BE`: French (Belgium).
`fr-CA`: French (Canada).
`fr-FR`: French (France).
`fr-CH`: French (Switzerland).
`gl-ES`: Galician (Spain).
`ka-GE`: Georgian (Georgia).
`el-GR`: Greek (Greece).
`gu-IN`: Gujarati (India).
`iw-IL`: Hebrew (Israel).
`hi-IN`: Hindi (India).
`hu-HU`: Hungarian (Hungary).
`is-IS`: Icelandic (Iceland).
`id-ID`: Indonesian (Indonesia).
`it-IT`: Italian (Italy).
`it-CH`: Italian (Switzerland).
`ja-JP`: Japanese (Japan).
`jv-ID`: Javanese (Indonesia).
`kn-IN`: Kannada (India).
`kk-KZ`: Kazakh (Kazakhstan).
`km-KH`: Khmer (Cambodia).
`rw-RW`: Kinyarwanda (Rwanda).
`ko-KR`: Korean (South Korea).
`lo-LA`: Lao (Laos).
`lv-LV`: Latvian (Latvia).
`lt-LT`: Lithuanian (Lithuania).
`mk-MK`: Macedonian (North Macedonia).
`ms-MY`: Malay (Malaysia).
`ml-IN`: Malayalam (India).
`mr-IN`: Marathi (India).
`mn-MN`: Mongolian (Mongolia).
`ne-NP`: Nepali (Nepal).
`no-NO`: Bokmal Norwegian (Norway).
`fa-IR`: Persian (Iran).
`pl-PL`: Polish (Poland).
`pt-BR`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`ro-RO`: Romanian (Romania).
`ru-RU`: Russian (Russia).
`sr-RS`: Serbian (Serbia).
`si-LK`: Sinhalese (Sri Lanka).
`sk-SK`: Slovak (Slovakia).
`sl-SI`: Slovenian (Slovenia).
`st-ZA`: Sesotho (South Africa).
`es-AR`: Spanish (Argentina).
`es-BO`: Spanish (Bolivia).
`es-CL`: Spanish (Chile).
`es-CO`: Spanish (Colombia).
`es-CR`: Spanish (Costa Rica).
`es-DO`: Spanish (Dominican Republic).
`es-EC`: Spanish (Ecuador).
`es-SV`: Spanish (El Salvador).
`es-GT`: Spanish (Guatemala).
`es-HN`: Spanish (Honduras).
`es-MX`: Spanish (Mexico).
`es-NI`: Spanish (Nicaragua).
`es-PA`: Spanish (Panama).
`es-PY`: Spanish (Paraguay).
`es-PE`: Spanish (Peru).
`es-PR`: Spanish (Puerto Rico).
`es-ES`: Spanish (Spain).
`es-US`: Spanish (US).
`es-UY`: Spanish (Uruguay).
`es-VE`: Spanish (Venezuela).
`su-ID`: Sundanese (Indonesia).
`sw-KE`: Swahili (Kenya).
`sw-TZ`: Swahili (Tanzania).
`sv-SE`: Swedish (Sweden).
`ta-IN`: Tamil (India).
`ta-MY`: Tamil (Malaysia).
`ta-SG`: Tamil (Singapore).
`ta-LK`: Tamil (Sri Lanka).
`te-IN`: Telugu (India).
`th-TH`: Thai (Thailand).
`ts-ZA`: Tsonga (South Africa).
`tr-TR`: Turkish (Turkey).
`uk-UA`: Ukrainian (Ukraine).
`ur-IN`: Urdu (India).
`ur-PK`: Urdu (Pakistan).
`uz-UZ`: Uzbek (Uzbekistan).
`ve-ZA`: Venda (South Africa).
`vi-VN`: Vietnamese (Vietnam).
`xh-ZA`: Xhosa (South Africa).
`zu-ZA`: Zulu (South Africa).


    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
     - Unspecified or left blank: no subtitle file generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
- Under the OCR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation and OCR recognition mode, this field cannot be unspecified or left blank.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON.
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * ASR hotword lexicon parameter.
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * Target language for subtitle translation.
This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:`ab`: Abkhazian.`ace`: Acehnese.`ach`: Acholi.`af`: Afrikaans.`ak`: Twi (Akan).`am`: Amharic.`ar`: Arabic.`as`: Assamese.`ay`: Aymara.`az`: Azerbaijani.`ba`: Bashkir.`ban`: Balinese.`bbc`: Batak toba.`bem`: Bemba.`bew`: Betawi.`bg`: Bulgarian.`bho`: Bhojpuri.`bik`: Bikol.`bm`: Bambara.`bn`: Bengali.`br`: Breton.`bs`: Bosnian.`btx`: Batak Karo.`bts`: Batak Simalungun.`bua`: Buryat.`ca`: Catalan.`ceb`: Cebuano.`cgg`: Kiga.`chm`: Meadow Mari.`ckb`: Kurdish (Sorani).`cnh`: Hakha Chin.`co`: Corsican.`crh`: Crimean Tatar.`crs`: Seychellois Creole.`cs`: Czech.`cv`: Chuvash.`cy`: Welsh.`da`: Danish.`de`: German.`din`: Dinka.`doi`: Dogri.`dov`: Dombe.`dv`: Dhivehi.`dz`: Dzongkha.`ee`: Ewe.`el`: Greek.`en`: English.`eo`: Esperanto.`es`: Spanish.`et`: Estonian.`eu`: Basque.`fa`: Persian.`ff`: Fulah.`fi`: Finnish.`fil`: Filipino (Tagalog).`fj`: Fijian.`fr`: French.`fr-CA`: French (Canada).`fr-FR`: French (France).`fy`: Frisian.`ga`: Irish.`gaa`: Ga.
`gd`: Scottish Gaelic.`gl`: Galician.`gn`: Guarani.`gom`: Konkani.`gu`: Gujarati.`gv`: Manx.`ha`: Hausa.`haw`: Hawaiian.`he`: Hebrew.`hi`: Hindi.`hil`: Hiligaynon.`hmn`: Hmong.`hr`: Croatian.`hrx`: Hunsrik.`ht`: Haitian Creole.`hu`: Hungarian.`hy`: Armenian.`id`: Indonesian.`ig`: Igbo.`ilo`: Iloko.`is`: Icelandic.`it`: Italian.`iw`: Hebrew.`ja`: Japanese.`jv`: Javanese.`ka`: Georgian.`kk`: Kazakh.`km`: Khmer.`kn`: Kannada.`ko`: Korean.`kri`: Krio.`ku`: Kurdish (Kurmanji).`ktu`: Kituba.`ky`: Kyrgyz.`la`: Latin.`lb`: Luxembourgish.`lg`: Ganda (Luganda).`li`: Limburgish.`lij`: Ligurian.`lmo`: Lombard.`ln`: Lingala.`lo`: Lao.`lt`: Lithuanian.`ltg`: Latgalian.`luo`: Luo.`lus`: Mizo.`lv`: Latvian.`mai`: Maithili.`mak`: Makasar.`mg`: Malagasy.`mi`: Maori.`min`: Minangkabau.`mk`: Macedonian.`ml`: Malayalam.`mn`: Mongolian.`mr`: Marathi.`ms`: Malay.`mt`: Maltese.`my`: Burmese.`ne`: Nepali.`new`: Newari.`nl`: Dutch.`no`: Norwegian.`nr`: Southern Ndebele.`nso`: Northern Sotho (Sepedi).`nus`: Nuer.`ny`: Chichewa (Nyanja).`oc`: Occitan.`om`: Oromo.`or`: Odia.`pa`: Punjabi.`pag`: Pangasinan.`pam`: Kapampangan.`pap`: Papiamento.`pl`: Polish.`ps`: Pashto.`pt`: Portuguese.`pt-BR`: Portuguese (Brazil).`pt-PT`: Portuguese (Portugal).`qu`: Quechua.`ro`: Romanian.`rom`: Romani.`rn`: Rundi.`ru`: Russian.`rw`: Kinyarwanda.`sa`: Sanskrit.`scn`: Sicilian.`sd`: Sindhi.`sg`: Sango.`shn`: Shan.`si`: Sinhala.`sk`: Slovak.`sl`: Slovenian.`sm`: Samoan.`sn`: Shona.`so`: Somali.`sq`: Albanian.`sr`: Serbian.`ss`: Swazi.`st`: Southern Sotho.`su`: Sundanese.`sv`: Swedish.`sw`: Swahili.`szl`: Silesian.`ta`: Tamil.`te`: Telugu.`tet`: Tetum.`tg`: Tajik.`th`: Thai.`ti`: Tigrinya.`tk`: Turkmen.`tn`: Tswana.`tr`: Turkish.`ts`: Tsonga.`tt`: Tatar.`ug`: Uyghur.`uk`: Ukrainian.`ur`: Urdu.`uz`: Uzbek.`vi`: Vietnamese.`xh`: Xhosa.`yi`: Yiddish.`yo`: Yoruba.`yua`: Yucatec Maya.`yue`: Cantonese.`zh`: Chinese (Simplified).`zh-TW`: Chinese (Traditional).`zu`: Zulu.**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * Subtitle processing type:
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
- 2: OCR recognition subtitle.
**Note**: If the field is unspecified, ASR is used by default.
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * Area configurations for the subtitle OCR extraction box.
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
     * Get Unique identifier of the smart subtitle template. 
     * @return Definition Unique identifier of the smart subtitle template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the smart subtitle template.
     * @param Definition Unique identifier of the smart subtitle template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`. 
     * @return TranslateSwitch Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
     * @param TranslateSwitch Subtitle translation switch.
`ON`: translation enabled.
`OFF`: translation disabled.
**Note**: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to `OFF`.
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get Smart subtitle template name.
Length limit: 64 characters. 
     * @return Name Smart subtitle template name.
Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Smart subtitle template name.
Length limit: 64 characters.
     * @param Name Smart subtitle template name.
Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Smart subtitle template description.
Length limit: 256 characters. 
     * @return Comment Smart subtitle template description.
Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Smart subtitle template description.
Length limit: 256 characters.
     * @param Comment Smart subtitle template description.
Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Source language of the video with smart subtitles.
OCR recognition only supports the following languages:
`zh_en`: Chinese and English.
`multi`: others.
ASR recognition and pure subtitle translation currently support the following languages:
`auto`: automatic recognition (it is only supported in pure subtitle translation).
`zh`: Simplified Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`vi`: Vietnamese.
`ms`: Malay.
`id`: Indonesian.
`fil`: Filipino.
`th`: Thai.
`pt`: Portuguese.
`tr`: Turkish.
`ar`: Arabic.
`es`: Spanish.
`hi`: Hindi.
`fr`: French.
`de`: German.
`it`: Italian.
`zh_dialect`: Chinese dialect.
`zh_en`: Chinese and English.
`yue`: Cantonese.
`ru`: Russian.
`prime_zh`: Chinese, English, and Chinese dialects.
`af-ZA`: Afrikaans (South Africa).
`sq-AL`: Albanian (Albania).
`am-ET`: Amharic (Ethiopia).
`ar-DZ`: Arabic (Algeria).
`ar-BH`: Arabic (Bahrain).
`ar-EG`: Arabic (Egypt).
`ar-IQ`: Arabic (Iraq).
`ar-IL`: Arabic (Israel).
`ar-JO`: Arabic (Jordan).
`ar-KW`: Arabic (Kuwait).
`ar-LB`: Arabic (Lebanon).
`ar-MR`: Arabic (Mauritania).
`ar-MA`: Arabic (Morocco).
`ar-OM`: Arabic (Oman).
`ar-QA`: Arabic (Qatar).
`ar-SA`: Arabic (Saudi Arabia).
`ar-PS`: Arabic (State of Palestine).
`ar-SY`: Arabic (Syria).
`ar-TN`: Arabic (Tunisia).
`ar-AE`: Arabic (United Arab Emirates).
`ar-YE`: Arabic (Yemen).
`hy-AM`: Armenian (Armenia).
`az-AZ`: Azerbaijani (Azerbaijan).
`eu-ES`: Basque (Spain).
`bn-BD`: Bengali (Bangladesh).
`bn-IN`: Bengali (India).
`bs-BA`: Bosnian (Bosnia and Herzegovina).
`bg-BG`: Bulgarian (Bulgaria).
`my-MM`: Burmese (Myanmar).
`ca-ES`: Catalan (Spain).
`hr-HR`: Croatian (Croatia).
`cs-CZ`: Czech (Czech Republic).
`da-DK`: Danish (Denmark).
`nl-BE`: Dutch (Belgium).
`nl-NL`: Dutch (Holland).
`en-AU`: English (Australia).
`en-CA`: English (Canada).
`en-GH`: English (Ghana).
`en-HK`: English (Hong Kong (China)).
`en-IN`: English (India).
`en-IE`: English (Ireland).
`en-KE`: English (Kenya).
`en-NZ`: English (New Zealand).
`en-NG`: English (Nigeria).
`en-PK`: English (Pakistan).
`en-PH`: English (Philippines).
`en-SG`: English (Singapore).
`en-ZA`: English (South Africa).
`en-TZ`: English (Tanzania).
`en-GB`: English (UK).
`en-US`: English (US).
`et-EE`: Estonian (Estonia).
`fil-PH`: Filipino (Philippines).
`fi-FI`: Finnish (Finland).
`fr-BE`: French (Belgium).
`fr-CA`: French (Canada).
`fr-FR`: French (France).
`fr-CH`: French (Switzerland).
`gl-ES`: Galician (Spain).
`ka-GE`: Georgian (Georgia).
`el-GR`: Greek (Greece).
`gu-IN`: Gujarati (India).
`iw-IL`: Hebrew (Israel).
`hi-IN`: Hindi (India).
`hu-HU`: Hungarian (Hungary).
`is-IS`: Icelandic (Iceland).
`id-ID`: Indonesian (Indonesia).
`it-IT`: Italian (Italy).
`it-CH`: Italian (Switzerland).
`ja-JP`: Japanese (Japan).
`jv-ID`: Javanese (Indonesia).
`kn-IN`: Kannada (India).
`kk-KZ`: Kazakh (Kazakhstan).
`km-KH`: Khmer (Cambodia).
`rw-RW`: Kinyarwanda (Rwanda).
`ko-KR`: Korean (South Korea).
`lo-LA`: Lao (Laos).
`lv-LV`: Latvian (Latvia).
`lt-LT`: Lithuanian (Lithuania).
`mk-MK`: Macedonian (North Macedonia).
`ms-MY`: Malay (Malaysia).
`ml-IN`: Malayalam (India).
`mr-IN`: Marathi (India).
`mn-MN`: Mongolian (Mongolia).
`ne-NP`: Nepali (Nepal).
`no-NO`: Bokmal Norwegian (Norway).
`fa-IR`: Persian (Iran).
`pl-PL`: Polish (Poland).
`pt-BR`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`ro-RO`: Romanian (Romania).
`ru-RU`: Russian (Russia).
`sr-RS`: Serbian (Serbia).
`si-LK`: Sinhalese (Sri Lanka).
`sk-SK`: Slovak (Slovakia).
`sl-SI`: Slovenian (Slovenia).
`st-ZA`: Sesotho (South Africa).
`es-AR`: Spanish (Argentina).
`es-BO`: Spanish (Bolivia).
`es-CL`: Spanish (Chile).
`es-CO`: Spanish (Colombia).
`es-CR`: Spanish (Costa Rica).
`es-DO`: Spanish (Dominican Republic).
`es-EC`: Spanish (Ecuador).
`es-SV`: Spanish (El Salvador).
`es-GT`: Spanish (Guatemala).
`es-HN`: Spanish (Honduras).
`es-MX`: Spanish (Mexico).
`es-NI`: Spanish (Nicaragua).
`es-PA`: Spanish (Panama).
`es-PY`: Spanish (Paraguay).
`es-PE`: Spanish (Peru).
`es-PR`: Spanish (Puerto Rico).
`es-ES`: Spanish (Spain).
`es-US`: Spanish (US).
`es-UY`: Spanish (Uruguay).
`es-VE`: Spanish (Venezuela).
`su-ID`: Sundanese (Indonesia).
`sw-KE`: Swahili (Kenya).
`sw-TZ`: Swahili (Tanzania).
`sv-SE`: Swedish (Sweden).
`ta-IN`: Tamil (India).
`ta-MY`: Tamil (Malaysia).
`ta-SG`: Tamil (Singapore).
`ta-LK`: Tamil (Sri Lanka).
`te-IN`: Telugu (India).
`th-TH`: Thai (Thailand).
`ts-ZA`: Tsonga (South Africa).
`tr-TR`: Turkish (Turkey).
`uk-UA`: Ukrainian (Ukraine).
`ur-IN`: Urdu (India).
`ur-PK`: Urdu (Pakistan).
`uz-UZ`: Uzbek (Uzbekistan).
`ve-ZA`: Venda (South Africa).
`vi-VN`: Vietnamese (Vietnam).
`xh-ZA`: Xhosa (South Africa).
`zu-ZA`: Zulu (South Africa).

 
     * @return VideoSrcLanguage Source language of the video with smart subtitles.
OCR recognition only supports the following languages:
`zh_en`: Chinese and English.
`multi`: others.
ASR recognition and pure subtitle translation currently support the following languages:
`auto`: automatic recognition (it is only supported in pure subtitle translation).
`zh`: Simplified Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`vi`: Vietnamese.
`ms`: Malay.
`id`: Indonesian.
`fil`: Filipino.
`th`: Thai.
`pt`: Portuguese.
`tr`: Turkish.
`ar`: Arabic.
`es`: Spanish.
`hi`: Hindi.
`fr`: French.
`de`: German.
`it`: Italian.
`zh_dialect`: Chinese dialect.
`zh_en`: Chinese and English.
`yue`: Cantonese.
`ru`: Russian.
`prime_zh`: Chinese, English, and Chinese dialects.
`af-ZA`: Afrikaans (South Africa).
`sq-AL`: Albanian (Albania).
`am-ET`: Amharic (Ethiopia).
`ar-DZ`: Arabic (Algeria).
`ar-BH`: Arabic (Bahrain).
`ar-EG`: Arabic (Egypt).
`ar-IQ`: Arabic (Iraq).
`ar-IL`: Arabic (Israel).
`ar-JO`: Arabic (Jordan).
`ar-KW`: Arabic (Kuwait).
`ar-LB`: Arabic (Lebanon).
`ar-MR`: Arabic (Mauritania).
`ar-MA`: Arabic (Morocco).
`ar-OM`: Arabic (Oman).
`ar-QA`: Arabic (Qatar).
`ar-SA`: Arabic (Saudi Arabia).
`ar-PS`: Arabic (State of Palestine).
`ar-SY`: Arabic (Syria).
`ar-TN`: Arabic (Tunisia).
`ar-AE`: Arabic (United Arab Emirates).
`ar-YE`: Arabic (Yemen).
`hy-AM`: Armenian (Armenia).
`az-AZ`: Azerbaijani (Azerbaijan).
`eu-ES`: Basque (Spain).
`bn-BD`: Bengali (Bangladesh).
`bn-IN`: Bengali (India).
`bs-BA`: Bosnian (Bosnia and Herzegovina).
`bg-BG`: Bulgarian (Bulgaria).
`my-MM`: Burmese (Myanmar).
`ca-ES`: Catalan (Spain).
`hr-HR`: Croatian (Croatia).
`cs-CZ`: Czech (Czech Republic).
`da-DK`: Danish (Denmark).
`nl-BE`: Dutch (Belgium).
`nl-NL`: Dutch (Holland).
`en-AU`: English (Australia).
`en-CA`: English (Canada).
`en-GH`: English (Ghana).
`en-HK`: English (Hong Kong (China)).
`en-IN`: English (India).
`en-IE`: English (Ireland).
`en-KE`: English (Kenya).
`en-NZ`: English (New Zealand).
`en-NG`: English (Nigeria).
`en-PK`: English (Pakistan).
`en-PH`: English (Philippines).
`en-SG`: English (Singapore).
`en-ZA`: English (South Africa).
`en-TZ`: English (Tanzania).
`en-GB`: English (UK).
`en-US`: English (US).
`et-EE`: Estonian (Estonia).
`fil-PH`: Filipino (Philippines).
`fi-FI`: Finnish (Finland).
`fr-BE`: French (Belgium).
`fr-CA`: French (Canada).
`fr-FR`: French (France).
`fr-CH`: French (Switzerland).
`gl-ES`: Galician (Spain).
`ka-GE`: Georgian (Georgia).
`el-GR`: Greek (Greece).
`gu-IN`: Gujarati (India).
`iw-IL`: Hebrew (Israel).
`hi-IN`: Hindi (India).
`hu-HU`: Hungarian (Hungary).
`is-IS`: Icelandic (Iceland).
`id-ID`: Indonesian (Indonesia).
`it-IT`: Italian (Italy).
`it-CH`: Italian (Switzerland).
`ja-JP`: Japanese (Japan).
`jv-ID`: Javanese (Indonesia).
`kn-IN`: Kannada (India).
`kk-KZ`: Kazakh (Kazakhstan).
`km-KH`: Khmer (Cambodia).
`rw-RW`: Kinyarwanda (Rwanda).
`ko-KR`: Korean (South Korea).
`lo-LA`: Lao (Laos).
`lv-LV`: Latvian (Latvia).
`lt-LT`: Lithuanian (Lithuania).
`mk-MK`: Macedonian (North Macedonia).
`ms-MY`: Malay (Malaysia).
`ml-IN`: Malayalam (India).
`mr-IN`: Marathi (India).
`mn-MN`: Mongolian (Mongolia).
`ne-NP`: Nepali (Nepal).
`no-NO`: Bokmal Norwegian (Norway).
`fa-IR`: Persian (Iran).
`pl-PL`: Polish (Poland).
`pt-BR`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`ro-RO`: Romanian (Romania).
`ru-RU`: Russian (Russia).
`sr-RS`: Serbian (Serbia).
`si-LK`: Sinhalese (Sri Lanka).
`sk-SK`: Slovak (Slovakia).
`sl-SI`: Slovenian (Slovenia).
`st-ZA`: Sesotho (South Africa).
`es-AR`: Spanish (Argentina).
`es-BO`: Spanish (Bolivia).
`es-CL`: Spanish (Chile).
`es-CO`: Spanish (Colombia).
`es-CR`: Spanish (Costa Rica).
`es-DO`: Spanish (Dominican Republic).
`es-EC`: Spanish (Ecuador).
`es-SV`: Spanish (El Salvador).
`es-GT`: Spanish (Guatemala).
`es-HN`: Spanish (Honduras).
`es-MX`: Spanish (Mexico).
`es-NI`: Spanish (Nicaragua).
`es-PA`: Spanish (Panama).
`es-PY`: Spanish (Paraguay).
`es-PE`: Spanish (Peru).
`es-PR`: Spanish (Puerto Rico).
`es-ES`: Spanish (Spain).
`es-US`: Spanish (US).
`es-UY`: Spanish (Uruguay).
`es-VE`: Spanish (Venezuela).
`su-ID`: Sundanese (Indonesia).
`sw-KE`: Swahili (Kenya).
`sw-TZ`: Swahili (Tanzania).
`sv-SE`: Swedish (Sweden).
`ta-IN`: Tamil (India).
`ta-MY`: Tamil (Malaysia).
`ta-SG`: Tamil (Singapore).
`ta-LK`: Tamil (Sri Lanka).
`te-IN`: Telugu (India).
`th-TH`: Thai (Thailand).
`ts-ZA`: Tsonga (South Africa).
`tr-TR`: Turkish (Turkey).
`uk-UA`: Ukrainian (Ukraine).
`ur-IN`: Urdu (India).
`ur-PK`: Urdu (Pakistan).
`uz-UZ`: Uzbek (Uzbekistan).
`ve-ZA`: Venda (South Africa).
`vi-VN`: Vietnamese (Vietnam).
`xh-ZA`: Xhosa (South Africa).
`zu-ZA`: Zulu (South Africa).


     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set Source language of the video with smart subtitles.
OCR recognition only supports the following languages:
`zh_en`: Chinese and English.
`multi`: others.
ASR recognition and pure subtitle translation currently support the following languages:
`auto`: automatic recognition (it is only supported in pure subtitle translation).
`zh`: Simplified Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`vi`: Vietnamese.
`ms`: Malay.
`id`: Indonesian.
`fil`: Filipino.
`th`: Thai.
`pt`: Portuguese.
`tr`: Turkish.
`ar`: Arabic.
`es`: Spanish.
`hi`: Hindi.
`fr`: French.
`de`: German.
`it`: Italian.
`zh_dialect`: Chinese dialect.
`zh_en`: Chinese and English.
`yue`: Cantonese.
`ru`: Russian.
`prime_zh`: Chinese, English, and Chinese dialects.
`af-ZA`: Afrikaans (South Africa).
`sq-AL`: Albanian (Albania).
`am-ET`: Amharic (Ethiopia).
`ar-DZ`: Arabic (Algeria).
`ar-BH`: Arabic (Bahrain).
`ar-EG`: Arabic (Egypt).
`ar-IQ`: Arabic (Iraq).
`ar-IL`: Arabic (Israel).
`ar-JO`: Arabic (Jordan).
`ar-KW`: Arabic (Kuwait).
`ar-LB`: Arabic (Lebanon).
`ar-MR`: Arabic (Mauritania).
`ar-MA`: Arabic (Morocco).
`ar-OM`: Arabic (Oman).
`ar-QA`: Arabic (Qatar).
`ar-SA`: Arabic (Saudi Arabia).
`ar-PS`: Arabic (State of Palestine).
`ar-SY`: Arabic (Syria).
`ar-TN`: Arabic (Tunisia).
`ar-AE`: Arabic (United Arab Emirates).
`ar-YE`: Arabic (Yemen).
`hy-AM`: Armenian (Armenia).
`az-AZ`: Azerbaijani (Azerbaijan).
`eu-ES`: Basque (Spain).
`bn-BD`: Bengali (Bangladesh).
`bn-IN`: Bengali (India).
`bs-BA`: Bosnian (Bosnia and Herzegovina).
`bg-BG`: Bulgarian (Bulgaria).
`my-MM`: Burmese (Myanmar).
`ca-ES`: Catalan (Spain).
`hr-HR`: Croatian (Croatia).
`cs-CZ`: Czech (Czech Republic).
`da-DK`: Danish (Denmark).
`nl-BE`: Dutch (Belgium).
`nl-NL`: Dutch (Holland).
`en-AU`: English (Australia).
`en-CA`: English (Canada).
`en-GH`: English (Ghana).
`en-HK`: English (Hong Kong (China)).
`en-IN`: English (India).
`en-IE`: English (Ireland).
`en-KE`: English (Kenya).
`en-NZ`: English (New Zealand).
`en-NG`: English (Nigeria).
`en-PK`: English (Pakistan).
`en-PH`: English (Philippines).
`en-SG`: English (Singapore).
`en-ZA`: English (South Africa).
`en-TZ`: English (Tanzania).
`en-GB`: English (UK).
`en-US`: English (US).
`et-EE`: Estonian (Estonia).
`fil-PH`: Filipino (Philippines).
`fi-FI`: Finnish (Finland).
`fr-BE`: French (Belgium).
`fr-CA`: French (Canada).
`fr-FR`: French (France).
`fr-CH`: French (Switzerland).
`gl-ES`: Galician (Spain).
`ka-GE`: Georgian (Georgia).
`el-GR`: Greek (Greece).
`gu-IN`: Gujarati (India).
`iw-IL`: Hebrew (Israel).
`hi-IN`: Hindi (India).
`hu-HU`: Hungarian (Hungary).
`is-IS`: Icelandic (Iceland).
`id-ID`: Indonesian (Indonesia).
`it-IT`: Italian (Italy).
`it-CH`: Italian (Switzerland).
`ja-JP`: Japanese (Japan).
`jv-ID`: Javanese (Indonesia).
`kn-IN`: Kannada (India).
`kk-KZ`: Kazakh (Kazakhstan).
`km-KH`: Khmer (Cambodia).
`rw-RW`: Kinyarwanda (Rwanda).
`ko-KR`: Korean (South Korea).
`lo-LA`: Lao (Laos).
`lv-LV`: Latvian (Latvia).
`lt-LT`: Lithuanian (Lithuania).
`mk-MK`: Macedonian (North Macedonia).
`ms-MY`: Malay (Malaysia).
`ml-IN`: Malayalam (India).
`mr-IN`: Marathi (India).
`mn-MN`: Mongolian (Mongolia).
`ne-NP`: Nepali (Nepal).
`no-NO`: Bokmal Norwegian (Norway).
`fa-IR`: Persian (Iran).
`pl-PL`: Polish (Poland).
`pt-BR`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`ro-RO`: Romanian (Romania).
`ru-RU`: Russian (Russia).
`sr-RS`: Serbian (Serbia).
`si-LK`: Sinhalese (Sri Lanka).
`sk-SK`: Slovak (Slovakia).
`sl-SI`: Slovenian (Slovenia).
`st-ZA`: Sesotho (South Africa).
`es-AR`: Spanish (Argentina).
`es-BO`: Spanish (Bolivia).
`es-CL`: Spanish (Chile).
`es-CO`: Spanish (Colombia).
`es-CR`: Spanish (Costa Rica).
`es-DO`: Spanish (Dominican Republic).
`es-EC`: Spanish (Ecuador).
`es-SV`: Spanish (El Salvador).
`es-GT`: Spanish (Guatemala).
`es-HN`: Spanish (Honduras).
`es-MX`: Spanish (Mexico).
`es-NI`: Spanish (Nicaragua).
`es-PA`: Spanish (Panama).
`es-PY`: Spanish (Paraguay).
`es-PE`: Spanish (Peru).
`es-PR`: Spanish (Puerto Rico).
`es-ES`: Spanish (Spain).
`es-US`: Spanish (US).
`es-UY`: Spanish (Uruguay).
`es-VE`: Spanish (Venezuela).
`su-ID`: Sundanese (Indonesia).
`sw-KE`: Swahili (Kenya).
`sw-TZ`: Swahili (Tanzania).
`sv-SE`: Swedish (Sweden).
`ta-IN`: Tamil (India).
`ta-MY`: Tamil (Malaysia).
`ta-SG`: Tamil (Singapore).
`ta-LK`: Tamil (Sri Lanka).
`te-IN`: Telugu (India).
`th-TH`: Thai (Thailand).
`ts-ZA`: Tsonga (South Africa).
`tr-TR`: Turkish (Turkey).
`uk-UA`: Ukrainian (Ukraine).
`ur-IN`: Urdu (India).
`ur-PK`: Urdu (Pakistan).
`uz-UZ`: Uzbek (Uzbekistan).
`ve-ZA`: Venda (South Africa).
`vi-VN`: Vietnamese (Vietnam).
`xh-ZA`: Xhosa (South Africa).
`zu-ZA`: Zulu (South Africa).


     * @param VideoSrcLanguage Source language of the video with smart subtitles.
OCR recognition only supports the following languages:
`zh_en`: Chinese and English.
`multi`: others.
ASR recognition and pure subtitle translation currently support the following languages:
`auto`: automatic recognition (it is only supported in pure subtitle translation).
`zh`: Simplified Chinese.
`en`: English.
`ja`: Japanese.
`ko`: Korean.
`zh-PY`: Chinese, English, and Cantonese.
`zh_medical`: Chinese (medical scenario).
`vi`: Vietnamese.
`ms`: Malay.
`id`: Indonesian.
`fil`: Filipino.
`th`: Thai.
`pt`: Portuguese.
`tr`: Turkish.
`ar`: Arabic.
`es`: Spanish.
`hi`: Hindi.
`fr`: French.
`de`: German.
`it`: Italian.
`zh_dialect`: Chinese dialect.
`zh_en`: Chinese and English.
`yue`: Cantonese.
`ru`: Russian.
`prime_zh`: Chinese, English, and Chinese dialects.
`af-ZA`: Afrikaans (South Africa).
`sq-AL`: Albanian (Albania).
`am-ET`: Amharic (Ethiopia).
`ar-DZ`: Arabic (Algeria).
`ar-BH`: Arabic (Bahrain).
`ar-EG`: Arabic (Egypt).
`ar-IQ`: Arabic (Iraq).
`ar-IL`: Arabic (Israel).
`ar-JO`: Arabic (Jordan).
`ar-KW`: Arabic (Kuwait).
`ar-LB`: Arabic (Lebanon).
`ar-MR`: Arabic (Mauritania).
`ar-MA`: Arabic (Morocco).
`ar-OM`: Arabic (Oman).
`ar-QA`: Arabic (Qatar).
`ar-SA`: Arabic (Saudi Arabia).
`ar-PS`: Arabic (State of Palestine).
`ar-SY`: Arabic (Syria).
`ar-TN`: Arabic (Tunisia).
`ar-AE`: Arabic (United Arab Emirates).
`ar-YE`: Arabic (Yemen).
`hy-AM`: Armenian (Armenia).
`az-AZ`: Azerbaijani (Azerbaijan).
`eu-ES`: Basque (Spain).
`bn-BD`: Bengali (Bangladesh).
`bn-IN`: Bengali (India).
`bs-BA`: Bosnian (Bosnia and Herzegovina).
`bg-BG`: Bulgarian (Bulgaria).
`my-MM`: Burmese (Myanmar).
`ca-ES`: Catalan (Spain).
`hr-HR`: Croatian (Croatia).
`cs-CZ`: Czech (Czech Republic).
`da-DK`: Danish (Denmark).
`nl-BE`: Dutch (Belgium).
`nl-NL`: Dutch (Holland).
`en-AU`: English (Australia).
`en-CA`: English (Canada).
`en-GH`: English (Ghana).
`en-HK`: English (Hong Kong (China)).
`en-IN`: English (India).
`en-IE`: English (Ireland).
`en-KE`: English (Kenya).
`en-NZ`: English (New Zealand).
`en-NG`: English (Nigeria).
`en-PK`: English (Pakistan).
`en-PH`: English (Philippines).
`en-SG`: English (Singapore).
`en-ZA`: English (South Africa).
`en-TZ`: English (Tanzania).
`en-GB`: English (UK).
`en-US`: English (US).
`et-EE`: Estonian (Estonia).
`fil-PH`: Filipino (Philippines).
`fi-FI`: Finnish (Finland).
`fr-BE`: French (Belgium).
`fr-CA`: French (Canada).
`fr-FR`: French (France).
`fr-CH`: French (Switzerland).
`gl-ES`: Galician (Spain).
`ka-GE`: Georgian (Georgia).
`el-GR`: Greek (Greece).
`gu-IN`: Gujarati (India).
`iw-IL`: Hebrew (Israel).
`hi-IN`: Hindi (India).
`hu-HU`: Hungarian (Hungary).
`is-IS`: Icelandic (Iceland).
`id-ID`: Indonesian (Indonesia).
`it-IT`: Italian (Italy).
`it-CH`: Italian (Switzerland).
`ja-JP`: Japanese (Japan).
`jv-ID`: Javanese (Indonesia).
`kn-IN`: Kannada (India).
`kk-KZ`: Kazakh (Kazakhstan).
`km-KH`: Khmer (Cambodia).
`rw-RW`: Kinyarwanda (Rwanda).
`ko-KR`: Korean (South Korea).
`lo-LA`: Lao (Laos).
`lv-LV`: Latvian (Latvia).
`lt-LT`: Lithuanian (Lithuania).
`mk-MK`: Macedonian (North Macedonia).
`ms-MY`: Malay (Malaysia).
`ml-IN`: Malayalam (India).
`mr-IN`: Marathi (India).
`mn-MN`: Mongolian (Mongolia).
`ne-NP`: Nepali (Nepal).
`no-NO`: Bokmal Norwegian (Norway).
`fa-IR`: Persian (Iran).
`pl-PL`: Polish (Poland).
`pt-BR`: Portuguese (Brazil).
`pt-PT`: Portuguese (Portugal).
`ro-RO`: Romanian (Romania).
`ru-RU`: Russian (Russia).
`sr-RS`: Serbian (Serbia).
`si-LK`: Sinhalese (Sri Lanka).
`sk-SK`: Slovak (Slovakia).
`sl-SI`: Slovenian (Slovenia).
`st-ZA`: Sesotho (South Africa).
`es-AR`: Spanish (Argentina).
`es-BO`: Spanish (Bolivia).
`es-CL`: Spanish (Chile).
`es-CO`: Spanish (Colombia).
`es-CR`: Spanish (Costa Rica).
`es-DO`: Spanish (Dominican Republic).
`es-EC`: Spanish (Ecuador).
`es-SV`: Spanish (El Salvador).
`es-GT`: Spanish (Guatemala).
`es-HN`: Spanish (Honduras).
`es-MX`: Spanish (Mexico).
`es-NI`: Spanish (Nicaragua).
`es-PA`: Spanish (Panama).
`es-PY`: Spanish (Paraguay).
`es-PE`: Spanish (Peru).
`es-PR`: Spanish (Puerto Rico).
`es-ES`: Spanish (Spain).
`es-US`: Spanish (US).
`es-UY`: Spanish (Uruguay).
`es-VE`: Spanish (Venezuela).
`su-ID`: Sundanese (Indonesia).
`sw-KE`: Swahili (Kenya).
`sw-TZ`: Swahili (Tanzania).
`sv-SE`: Swedish (Sweden).
`ta-IN`: Tamil (India).
`ta-MY`: Tamil (Malaysia).
`ta-SG`: Tamil (Singapore).
`ta-LK`: Tamil (Sri Lanka).
`te-IN`: Telugu (India).
`th-TH`: Thai (Thailand).
`ts-ZA`: Tsonga (South Africa).
`tr-TR`: Turkish (Turkey).
`uk-UA`: Ukrainian (Ukraine).
`ur-IN`: Urdu (India).
`ur-PK`: Urdu (Pakistan).
`uz-UZ`: Uzbek (Uzbekistan).
`ve-ZA`: Venda (South Africa).
`vi-VN`: Vietnamese (Vietnam).
`xh-ZA`: Xhosa (South Africa).
`zu-ZA`: Zulu (South Africa).


     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
     - Unspecified or left blank: no subtitle file generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
- Under the OCR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation and OCR recognition mode, this field cannot be unspecified or left blank. 
     * @return SubtitleFormat Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
     - Unspecified or left blank: no subtitle file generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
- Under the OCR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation and OCR recognition mode, this field cannot be unspecified or left blank.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
     - Unspecified or left blank: no subtitle file generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
- Under the OCR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation and OCR recognition mode, this field cannot be unspecified or left blank.
     * @param SubtitleFormat Smart subtitle file format:
- Under the ASR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
     - Unspecified or left blank: no subtitle file generated.
- Under the pure subtitle translation processing type:
    - original: consistent with the source file.
    - vtt: WebVTT format subtitle.
    - srt: SRT format subtitle.
- Under the OCR recognition and translation processing type:
     - vtt: WebVTT format subtitle.
     - srt: SRT format subtitle.
**Note**:
- For ASR recognition mode, when 2 or more languages are involved in translation, this field cannot be unspecified or left blank.
- For pure subtitle translation and OCR recognition mode, this field cannot be unspecified or left blank.
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON. 
     * @return SubtitleType Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON.
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON.
     * @param SubtitleType Smart subtitle language type.
0: source language
1: target language
2: source language + target language
The value can only be 0 when TranslateSwitch is set to OFF. The value can only be 1 or 2 when TranslateSwitch is set to ON.
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get ASR hotword lexicon parameter. 
     * @return AsrHotWordsConfigure ASR hotword lexicon parameter.
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set ASR hotword lexicon parameter.
     * @param AsrHotWordsConfigure ASR hotword lexicon parameter.
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get Target language for subtitle translation.
This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:`ab`: Abkhazian.`ace`: Acehnese.`ach`: Acholi.`af`: Afrikaans.`ak`: Twi (Akan).`am`: Amharic.`ar`: Arabic.`as`: Assamese.`ay`: Aymara.`az`: Azerbaijani.`ba`: Bashkir.`ban`: Balinese.`bbc`: Batak toba.`bem`: Bemba.`bew`: Betawi.`bg`: Bulgarian.`bho`: Bhojpuri.`bik`: Bikol.`bm`: Bambara.`bn`: Bengali.`br`: Breton.`bs`: Bosnian.`btx`: Batak Karo.`bts`: Batak Simalungun.`bua`: Buryat.`ca`: Catalan.`ceb`: Cebuano.`cgg`: Kiga.`chm`: Meadow Mari.`ckb`: Kurdish (Sorani).`cnh`: Hakha Chin.`co`: Corsican.`crh`: Crimean Tatar.`crs`: Seychellois Creole.`cs`: Czech.`cv`: Chuvash.`cy`: Welsh.`da`: Danish.`de`: German.`din`: Dinka.`doi`: Dogri.`dov`: Dombe.`dv`: Dhivehi.`dz`: Dzongkha.`ee`: Ewe.`el`: Greek.`en`: English.`eo`: Esperanto.`es`: Spanish.`et`: Estonian.`eu`: Basque.`fa`: Persian.`ff`: Fulah.`fi`: Finnish.`fil`: Filipino (Tagalog).`fj`: Fijian.`fr`: French.`fr-CA`: French (Canada).`fr-FR`: French (France).`fy`: Frisian.`ga`: Irish.`gaa`: Ga.
`gd`: Scottish Gaelic.`gl`: Galician.`gn`: Guarani.`gom`: Konkani.`gu`: Gujarati.`gv`: Manx.`ha`: Hausa.`haw`: Hawaiian.`he`: Hebrew.`hi`: Hindi.`hil`: Hiligaynon.`hmn`: Hmong.`hr`: Croatian.`hrx`: Hunsrik.`ht`: Haitian Creole.`hu`: Hungarian.`hy`: Armenian.`id`: Indonesian.`ig`: Igbo.`ilo`: Iloko.`is`: Icelandic.`it`: Italian.`iw`: Hebrew.`ja`: Japanese.`jv`: Javanese.`ka`: Georgian.`kk`: Kazakh.`km`: Khmer.`kn`: Kannada.`ko`: Korean.`kri`: Krio.`ku`: Kurdish (Kurmanji).`ktu`: Kituba.`ky`: Kyrgyz.`la`: Latin.`lb`: Luxembourgish.`lg`: Ganda (Luganda).`li`: Limburgish.`lij`: Ligurian.`lmo`: Lombard.`ln`: Lingala.`lo`: Lao.`lt`: Lithuanian.`ltg`: Latgalian.`luo`: Luo.`lus`: Mizo.`lv`: Latvian.`mai`: Maithili.`mak`: Makasar.`mg`: Malagasy.`mi`: Maori.`min`: Minangkabau.`mk`: Macedonian.`ml`: Malayalam.`mn`: Mongolian.`mr`: Marathi.`ms`: Malay.`mt`: Maltese.`my`: Burmese.`ne`: Nepali.`new`: Newari.`nl`: Dutch.`no`: Norwegian.`nr`: Southern Ndebele.`nso`: Northern Sotho (Sepedi).`nus`: Nuer.`ny`: Chichewa (Nyanja).`oc`: Occitan.`om`: Oromo.`or`: Odia.`pa`: Punjabi.`pag`: Pangasinan.`pam`: Kapampangan.`pap`: Papiamento.`pl`: Polish.`ps`: Pashto.`pt`: Portuguese.`pt-BR`: Portuguese (Brazil).`pt-PT`: Portuguese (Portugal).`qu`: Quechua.`ro`: Romanian.`rom`: Romani.`rn`: Rundi.`ru`: Russian.`rw`: Kinyarwanda.`sa`: Sanskrit.`scn`: Sicilian.`sd`: Sindhi.`sg`: Sango.`shn`: Shan.`si`: Sinhala.`sk`: Slovak.`sl`: Slovenian.`sm`: Samoan.`sn`: Shona.`so`: Somali.`sq`: Albanian.`sr`: Serbian.`ss`: Swazi.`st`: Southern Sotho.`su`: Sundanese.`sv`: Swedish.`sw`: Swahili.`szl`: Silesian.`ta`: Tamil.`te`: Telugu.`tet`: Tetum.`tg`: Tajik.`th`: Thai.`ti`: Tigrinya.`tk`: Turkmen.`tn`: Tswana.`tr`: Turkish.`ts`: Tsonga.`tt`: Tatar.`ug`: Uyghur.`uk`: Ukrainian.`ur`: Urdu.`uz`: Uzbek.`vi`: Vietnamese.`xh`: Xhosa.`yi`: Yiddish.`yo`: Yoruba.`yua`: Yucatec Maya.`yue`: Cantonese.`zh`: Chinese (Simplified).`zh-TW`: Chinese (Traditional).`zu`: Zulu.**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese. 
     * @return TranslateDstLanguage Target language for subtitle translation.
This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:`ab`: Abkhazian.`ace`: Acehnese.`ach`: Acholi.`af`: Afrikaans.`ak`: Twi (Akan).`am`: Amharic.`ar`: Arabic.`as`: Assamese.`ay`: Aymara.`az`: Azerbaijani.`ba`: Bashkir.`ban`: Balinese.`bbc`: Batak toba.`bem`: Bemba.`bew`: Betawi.`bg`: Bulgarian.`bho`: Bhojpuri.`bik`: Bikol.`bm`: Bambara.`bn`: Bengali.`br`: Breton.`bs`: Bosnian.`btx`: Batak Karo.`bts`: Batak Simalungun.`bua`: Buryat.`ca`: Catalan.`ceb`: Cebuano.`cgg`: Kiga.`chm`: Meadow Mari.`ckb`: Kurdish (Sorani).`cnh`: Hakha Chin.`co`: Corsican.`crh`: Crimean Tatar.`crs`: Seychellois Creole.`cs`: Czech.`cv`: Chuvash.`cy`: Welsh.`da`: Danish.`de`: German.`din`: Dinka.`doi`: Dogri.`dov`: Dombe.`dv`: Dhivehi.`dz`: Dzongkha.`ee`: Ewe.`el`: Greek.`en`: English.`eo`: Esperanto.`es`: Spanish.`et`: Estonian.`eu`: Basque.`fa`: Persian.`ff`: Fulah.`fi`: Finnish.`fil`: Filipino (Tagalog).`fj`: Fijian.`fr`: French.`fr-CA`: French (Canada).`fr-FR`: French (France).`fy`: Frisian.`ga`: Irish.`gaa`: Ga.
`gd`: Scottish Gaelic.`gl`: Galician.`gn`: Guarani.`gom`: Konkani.`gu`: Gujarati.`gv`: Manx.`ha`: Hausa.`haw`: Hawaiian.`he`: Hebrew.`hi`: Hindi.`hil`: Hiligaynon.`hmn`: Hmong.`hr`: Croatian.`hrx`: Hunsrik.`ht`: Haitian Creole.`hu`: Hungarian.`hy`: Armenian.`id`: Indonesian.`ig`: Igbo.`ilo`: Iloko.`is`: Icelandic.`it`: Italian.`iw`: Hebrew.`ja`: Japanese.`jv`: Javanese.`ka`: Georgian.`kk`: Kazakh.`km`: Khmer.`kn`: Kannada.`ko`: Korean.`kri`: Krio.`ku`: Kurdish (Kurmanji).`ktu`: Kituba.`ky`: Kyrgyz.`la`: Latin.`lb`: Luxembourgish.`lg`: Ganda (Luganda).`li`: Limburgish.`lij`: Ligurian.`lmo`: Lombard.`ln`: Lingala.`lo`: Lao.`lt`: Lithuanian.`ltg`: Latgalian.`luo`: Luo.`lus`: Mizo.`lv`: Latvian.`mai`: Maithili.`mak`: Makasar.`mg`: Malagasy.`mi`: Maori.`min`: Minangkabau.`mk`: Macedonian.`ml`: Malayalam.`mn`: Mongolian.`mr`: Marathi.`ms`: Malay.`mt`: Maltese.`my`: Burmese.`ne`: Nepali.`new`: Newari.`nl`: Dutch.`no`: Norwegian.`nr`: Southern Ndebele.`nso`: Northern Sotho (Sepedi).`nus`: Nuer.`ny`: Chichewa (Nyanja).`oc`: Occitan.`om`: Oromo.`or`: Odia.`pa`: Punjabi.`pag`: Pangasinan.`pam`: Kapampangan.`pap`: Papiamento.`pl`: Polish.`ps`: Pashto.`pt`: Portuguese.`pt-BR`: Portuguese (Brazil).`pt-PT`: Portuguese (Portugal).`qu`: Quechua.`ro`: Romanian.`rom`: Romani.`rn`: Rundi.`ru`: Russian.`rw`: Kinyarwanda.`sa`: Sanskrit.`scn`: Sicilian.`sd`: Sindhi.`sg`: Sango.`shn`: Shan.`si`: Sinhala.`sk`: Slovak.`sl`: Slovenian.`sm`: Samoan.`sn`: Shona.`so`: Somali.`sq`: Albanian.`sr`: Serbian.`ss`: Swazi.`st`: Southern Sotho.`su`: Sundanese.`sv`: Swedish.`sw`: Swahili.`szl`: Silesian.`ta`: Tamil.`te`: Telugu.`tet`: Tetum.`tg`: Tajik.`th`: Thai.`ti`: Tigrinya.`tk`: Turkmen.`tn`: Tswana.`tr`: Turkish.`ts`: Tsonga.`tt`: Tatar.`ug`: Uyghur.`uk`: Ukrainian.`ur`: Urdu.`uz`: Uzbek.`vi`: Vietnamese.`xh`: Xhosa.`yi`: Yiddish.`yo`: Yoruba.`yua`: Yucatec Maya.`yue`: Cantonese.`zh`: Chinese (Simplified).`zh-TW`: Chinese (Traditional).`zu`: Zulu.**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set Target language for subtitle translation.
This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:`ab`: Abkhazian.`ace`: Acehnese.`ach`: Acholi.`af`: Afrikaans.`ak`: Twi (Akan).`am`: Amharic.`ar`: Arabic.`as`: Assamese.`ay`: Aymara.`az`: Azerbaijani.`ba`: Bashkir.`ban`: Balinese.`bbc`: Batak toba.`bem`: Bemba.`bew`: Betawi.`bg`: Bulgarian.`bho`: Bhojpuri.`bik`: Bikol.`bm`: Bambara.`bn`: Bengali.`br`: Breton.`bs`: Bosnian.`btx`: Batak Karo.`bts`: Batak Simalungun.`bua`: Buryat.`ca`: Catalan.`ceb`: Cebuano.`cgg`: Kiga.`chm`: Meadow Mari.`ckb`: Kurdish (Sorani).`cnh`: Hakha Chin.`co`: Corsican.`crh`: Crimean Tatar.`crs`: Seychellois Creole.`cs`: Czech.`cv`: Chuvash.`cy`: Welsh.`da`: Danish.`de`: German.`din`: Dinka.`doi`: Dogri.`dov`: Dombe.`dv`: Dhivehi.`dz`: Dzongkha.`ee`: Ewe.`el`: Greek.`en`: English.`eo`: Esperanto.`es`: Spanish.`et`: Estonian.`eu`: Basque.`fa`: Persian.`ff`: Fulah.`fi`: Finnish.`fil`: Filipino (Tagalog).`fj`: Fijian.`fr`: French.`fr-CA`: French (Canada).`fr-FR`: French (France).`fy`: Frisian.`ga`: Irish.`gaa`: Ga.
`gd`: Scottish Gaelic.`gl`: Galician.`gn`: Guarani.`gom`: Konkani.`gu`: Gujarati.`gv`: Manx.`ha`: Hausa.`haw`: Hawaiian.`he`: Hebrew.`hi`: Hindi.`hil`: Hiligaynon.`hmn`: Hmong.`hr`: Croatian.`hrx`: Hunsrik.`ht`: Haitian Creole.`hu`: Hungarian.`hy`: Armenian.`id`: Indonesian.`ig`: Igbo.`ilo`: Iloko.`is`: Icelandic.`it`: Italian.`iw`: Hebrew.`ja`: Japanese.`jv`: Javanese.`ka`: Georgian.`kk`: Kazakh.`km`: Khmer.`kn`: Kannada.`ko`: Korean.`kri`: Krio.`ku`: Kurdish (Kurmanji).`ktu`: Kituba.`ky`: Kyrgyz.`la`: Latin.`lb`: Luxembourgish.`lg`: Ganda (Luganda).`li`: Limburgish.`lij`: Ligurian.`lmo`: Lombard.`ln`: Lingala.`lo`: Lao.`lt`: Lithuanian.`ltg`: Latgalian.`luo`: Luo.`lus`: Mizo.`lv`: Latvian.`mai`: Maithili.`mak`: Makasar.`mg`: Malagasy.`mi`: Maori.`min`: Minangkabau.`mk`: Macedonian.`ml`: Malayalam.`mn`: Mongolian.`mr`: Marathi.`ms`: Malay.`mt`: Maltese.`my`: Burmese.`ne`: Nepali.`new`: Newari.`nl`: Dutch.`no`: Norwegian.`nr`: Southern Ndebele.`nso`: Northern Sotho (Sepedi).`nus`: Nuer.`ny`: Chichewa (Nyanja).`oc`: Occitan.`om`: Oromo.`or`: Odia.`pa`: Punjabi.`pag`: Pangasinan.`pam`: Kapampangan.`pap`: Papiamento.`pl`: Polish.`ps`: Pashto.`pt`: Portuguese.`pt-BR`: Portuguese (Brazil).`pt-PT`: Portuguese (Portugal).`qu`: Quechua.`ro`: Romanian.`rom`: Romani.`rn`: Rundi.`ru`: Russian.`rw`: Kinyarwanda.`sa`: Sanskrit.`scn`: Sicilian.`sd`: Sindhi.`sg`: Sango.`shn`: Shan.`si`: Sinhala.`sk`: Slovak.`sl`: Slovenian.`sm`: Samoan.`sn`: Shona.`so`: Somali.`sq`: Albanian.`sr`: Serbian.`ss`: Swazi.`st`: Southern Sotho.`su`: Sundanese.`sv`: Swedish.`sw`: Swahili.`szl`: Silesian.`ta`: Tamil.`te`: Telugu.`tet`: Tetum.`tg`: Tajik.`th`: Thai.`ti`: Tigrinya.`tk`: Turkmen.`tn`: Tswana.`tr`: Turkish.`ts`: Tsonga.`tt`: Tatar.`ug`: Uyghur.`uk`: Ukrainian.`ur`: Urdu.`uz`: Uzbek.`vi`: Vietnamese.`xh`: Xhosa.`yi`: Yiddish.`yo`: Yoruba.`yua`: Yucatec Maya.`yue`: Cantonese.`zh`: Chinese (Simplified).`zh-TW`: Chinese (Traditional).`zu`: Zulu.**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
     * @param TranslateDstLanguage Target language for subtitle translation.
This parameter takes effect when the value of TranslateSwitch is ON. Valid translation languages:`ab`: Abkhazian.`ace`: Acehnese.`ach`: Acholi.`af`: Afrikaans.`ak`: Twi (Akan).`am`: Amharic.`ar`: Arabic.`as`: Assamese.`ay`: Aymara.`az`: Azerbaijani.`ba`: Bashkir.`ban`: Balinese.`bbc`: Batak toba.`bem`: Bemba.`bew`: Betawi.`bg`: Bulgarian.`bho`: Bhojpuri.`bik`: Bikol.`bm`: Bambara.`bn`: Bengali.`br`: Breton.`bs`: Bosnian.`btx`: Batak Karo.`bts`: Batak Simalungun.`bua`: Buryat.`ca`: Catalan.`ceb`: Cebuano.`cgg`: Kiga.`chm`: Meadow Mari.`ckb`: Kurdish (Sorani).`cnh`: Hakha Chin.`co`: Corsican.`crh`: Crimean Tatar.`crs`: Seychellois Creole.`cs`: Czech.`cv`: Chuvash.`cy`: Welsh.`da`: Danish.`de`: German.`din`: Dinka.`doi`: Dogri.`dov`: Dombe.`dv`: Dhivehi.`dz`: Dzongkha.`ee`: Ewe.`el`: Greek.`en`: English.`eo`: Esperanto.`es`: Spanish.`et`: Estonian.`eu`: Basque.`fa`: Persian.`ff`: Fulah.`fi`: Finnish.`fil`: Filipino (Tagalog).`fj`: Fijian.`fr`: French.`fr-CA`: French (Canada).`fr-FR`: French (France).`fy`: Frisian.`ga`: Irish.`gaa`: Ga.
`gd`: Scottish Gaelic.`gl`: Galician.`gn`: Guarani.`gom`: Konkani.`gu`: Gujarati.`gv`: Manx.`ha`: Hausa.`haw`: Hawaiian.`he`: Hebrew.`hi`: Hindi.`hil`: Hiligaynon.`hmn`: Hmong.`hr`: Croatian.`hrx`: Hunsrik.`ht`: Haitian Creole.`hu`: Hungarian.`hy`: Armenian.`id`: Indonesian.`ig`: Igbo.`ilo`: Iloko.`is`: Icelandic.`it`: Italian.`iw`: Hebrew.`ja`: Japanese.`jv`: Javanese.`ka`: Georgian.`kk`: Kazakh.`km`: Khmer.`kn`: Kannada.`ko`: Korean.`kri`: Krio.`ku`: Kurdish (Kurmanji).`ktu`: Kituba.`ky`: Kyrgyz.`la`: Latin.`lb`: Luxembourgish.`lg`: Ganda (Luganda).`li`: Limburgish.`lij`: Ligurian.`lmo`: Lombard.`ln`: Lingala.`lo`: Lao.`lt`: Lithuanian.`ltg`: Latgalian.`luo`: Luo.`lus`: Mizo.`lv`: Latvian.`mai`: Maithili.`mak`: Makasar.`mg`: Malagasy.`mi`: Maori.`min`: Minangkabau.`mk`: Macedonian.`ml`: Malayalam.`mn`: Mongolian.`mr`: Marathi.`ms`: Malay.`mt`: Maltese.`my`: Burmese.`ne`: Nepali.`new`: Newari.`nl`: Dutch.`no`: Norwegian.`nr`: Southern Ndebele.`nso`: Northern Sotho (Sepedi).`nus`: Nuer.`ny`: Chichewa (Nyanja).`oc`: Occitan.`om`: Oromo.`or`: Odia.`pa`: Punjabi.`pag`: Pangasinan.`pam`: Kapampangan.`pap`: Papiamento.`pl`: Polish.`ps`: Pashto.`pt`: Portuguese.`pt-BR`: Portuguese (Brazil).`pt-PT`: Portuguese (Portugal).`qu`: Quechua.`ro`: Romanian.`rom`: Romani.`rn`: Rundi.`ru`: Russian.`rw`: Kinyarwanda.`sa`: Sanskrit.`scn`: Sicilian.`sd`: Sindhi.`sg`: Sango.`shn`: Shan.`si`: Sinhala.`sk`: Slovak.`sl`: Slovenian.`sm`: Samoan.`sn`: Shona.`so`: Somali.`sq`: Albanian.`sr`: Serbian.`ss`: Swazi.`st`: Southern Sotho.`su`: Sundanese.`sv`: Swedish.`sw`: Swahili.`szl`: Silesian.`ta`: Tamil.`te`: Telugu.`tet`: Tetum.`tg`: Tajik.`th`: Thai.`ti`: Tigrinya.`tk`: Turkmen.`tn`: Tswana.`tr`: Turkish.`ts`: Tsonga.`tt`: Tatar.`ug`: Uyghur.`uk`: Ukrainian.`ur`: Urdu.`uz`: Uzbek.`vi`: Vietnamese.`xh`: Xhosa.`yi`: Yiddish.`yo`: Yoruba.`yua`: Yucatec Maya.`yue`: Cantonese.`zh`: Chinese (Simplified).`zh-TW`: Chinese (Traditional).`zu`: Zulu.**Note**: Use `/` to separate multiple languages, such as `en/ja`, which indicates English and Japanese.
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get Subtitle processing type:
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
- 2: OCR recognition subtitle.
**Note**: If the field is unspecified, ASR is used by default. 
     * @return ProcessType Subtitle processing type:
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
- 2: OCR recognition subtitle.
**Note**: If the field is unspecified, ASR is used by default.
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set Subtitle processing type:
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
- 2: OCR recognition subtitle.
**Note**: If the field is unspecified, ASR is used by default.
     * @param ProcessType Subtitle processing type:
- 0: ASR recognition subtitle.
- 1: pure subtitle translation.
- 2: OCR recognition subtitle.
**Note**: If the field is unspecified, ASR is used by default.
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get Area configurations for the subtitle OCR extraction box. 
     * @return SelectingSubtitleAreasConfig Area configurations for the subtitle OCR extraction box.
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set Area configurations for the subtitle OCR extraction box.
     * @param SelectingSubtitleAreasConfig Area configurations for the subtitle OCR extraction box.
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    public ModifySmartSubtitleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySmartSubtitleTemplateRequest(ModifySmartSubtitleTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
        if (source.SelectingSubtitleAreasConfig != null) {
            this.SelectingSubtitleAreasConfig = new SelectingSubtitleAreasConfig(source.SelectingSubtitleAreasConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);

    }
}

