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

public class CreateSmartSubtitleTemplateRequest extends AbstractModel {

    /**
    * <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br><br>ASR recognition and pure caption translation currently support the following: 

[ASR Supported Languages](https://www.tencentcloud.com/zh/document/product/1041/68175#ASRlanguages)


Common available language codes:<br>`auto` (Auto Recognition), <br>`zh` (Simplified Chinese), <br>`en` (English), <br>`ja` (Japanese), <br>`ko` (Korean), <br>`zh-PY `(Chinese, English and Cantonese), <br>`zh_medical `(Medical Chinese), <br>`vi` (Vietnamese), <br>`ms` (Malay), <br>`id` (Indonesian), <br>`fil` (Filipino), <br>`th` (Thai), <br>`pt` (Portuguese), <br>`tr` (Turkish), <br>`ar` (Arabic), <br>`es` (Spanish), <br>`hi` (Hindi), <br>`fr` (French), <br>`de` (German), <br>`it` (Italian), <br>`zh_dialect` (Chinese Dialects), <br>`zh_en` (Chinese & English Mixed), <br>`yue` (Cantonese), <br>`ru` (Russian), <br>`prime_zh` (Chinese, English & Chinese Dialects)
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p>
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * <p>Intelligent caption template description information<br>Length limit: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>ASR hot word lexicon parameter</p>
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p>
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * <p>Subtitle target language<br>Take effect when TranslateSwitch is ON. Translation language list:<br><code>ab</code>: Abkhaz<br><code>ace</code>: Acehnese<br><code>ach</code>: Acholi<br><code>af</code>: Afrikaans<br><code>ak</code>: Akan<br><code>am</code>: Amharic<br><code>ar</code>: Arabic<br><code>as</code>: Assamese<br><code>ay</code>: Aymara<br><code>az</code>: Azerbaijani<br><code>ba</code>: Bashkir<br><code>ban</code>: Balinese<br><code>bbc</code>: Batak Toba<br><code>bem</code>: Bemba<br><code>bew</code>: Betawi<br><code>bg</code>: Bulgarian<br><code>bho</code>: Bhojpuri<br><code>bik</code>: Bikol<br><code>bm</code>: Bambara<br><code>bn</code>: Bengali<br><code>br</code>: Breton<br><code>bs</code>: Bosnian<br><code>btx</code>: Batak Karo<br><code>bts</code>: Batak Simalungun<br><code>bua</code>: Buryat<br><code>ca</code>: Catalan<br><code>ceb</code>: Cebuano<br><code>cgg</code>: Kiga<br><code>chm</code>: Meadow Mari<br><code>ckb</code>: Kurdish (Sorani)<br><code>cnh</code>: Hakha Chin<br><code>co</code>: Corsican<br><code>crh</code>: Crimean Tatar<br><code>crs</code>: Seychellois Creole<br><code>cs</code>: Czech<br><code>cv</code>: Chuvash<br><code>cy</code>: Welsh<br><code>da</code>: Danish<br><code>de</code>: German<br><code>din</code>: Dinka<br><code>doi</code>: Dogri<br><code>dov</code>: Dombe<br><code>dv</code>: Dhivehi<br><code>dz</code>: Dzongkha<br><code>ee</code>: Ewe<br><code>el</code>: Greek<br><code>en</code>: English<br><code>eo</code>: Esperanto<br><code>es</code>: Spanish<br><code>et</code>: Estonian<br><code>eu</code>: Basque<br><code>fa</code>: Persian<br><code>ff</code>: Fula<br><code>fi</code>: Finnish<br><code>fil</code>: Filipino (Tagalog)<br><code>fj</code>: Fijian<br><code>fr</code>: French<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fy</code>: Frisian<br><code>ga</code>: Irish<br><code>gaa</code>: GaLanguage<br><code>gd</code>: Scottish Gaelic<br><code>gl</code>: Galician<br><code>gn</code>: Guarani<br><code>gom</code>: Konkani<br><code>gu</code>: Gujarati<br><code>gv</code>: Manx<br><code>ha</code>: Hausa<br><code>haw</code>: Hawaiian<br><code>he</code>: Hebrew<br><code>hi</code>: Hindi<br><code>hil</code>: Hiligaynon<br><code>hmn</code>: Hmong<br><code>hr</code>: Croatian<br><code>hrx</code>: Hunsrik<br><code>ht</code>: Haitian Creole<br><code>hu</code>: Hungarian<br><code>hy</code>: Armenian<br><code>id</code>: Indonesian<br><code>ig</code>: Igbo<br><code>ilo</code>: Ilocano<br><code>is</code>: Icelandic<br><code>it</code>: Italian<br><code>iw</code>: Hebrew<br><code>ja</code>: Japanese<br><code>jv</code>: Javanese<br><code>ka</code>: Georgian<br><code>kk</code>: Kazakh<br><code>km</code>: Khmer<br><code>kn</code>: Kannada<br><code>ko</code>: Korean<br><code>kri</code>: Krio<br><code>ku</code>: Kurdish (Kurmanji)<br><code>ktu</code>: Kituba<br><code>ky</code>: Kyrgyz<br><code>la</code>: Latin<br><code>lb</code>: Luxembourgish<br><code>lg</code>: Ganda (Luganda)<br><code>li</code>: Limburgish<br><code>lij</code>: Ligurian<br><code>lmo</code>: Lombard<br><code>ln</code>: Lingala<br><code>lo</code>: Lao<br><code>lt</code>: Lithuanian<br><code>ltg</code>: Latgalian<br><code>luo</code>: Luo<br><code>lus</code>: Mizo<br><code>lv</code>: Latvian<br><code>mai</code>: Maithili<br><code>mak</code>: Makassar<br><code>mg</code>: Malagasy<br><code>mi</code>: Maori<br><code>min</code>: Minangkabau<br><code>mk</code>: Macedonian<br><code>ml</code>: Malayalam<br><code>mn</code>: Mongolian<br><code>mr</code>: Marathi<br><code>ms</code>: Malay<br><code>mt</code>: Maltese<br><code>my</code>: Burmese<br><code>ne</code>: Nepali<br><code>new</code>: Newari<br><code>nl</code>: Dutch<br><code>no</code>: Norwegian<br><code>nr</code>: Southern Ndebele<br><code>nso</code>: Northern Sotho (Sepedi)<br><code>nus</code>: Nuer<br><code>ny</code>: Chichewa (Nyanja)<br><code>oc</code>: Occitan<br><code>om</code>: Oromo<br><code>or</code>: Odia<br><code>pa</code>: Punjabi<br><code>pag</code>: Pangasinan<br><code>pam</code>: Kapampangan<br><code>pap</code>: Papiamento<br><code>pl</code>: Polish<br><code>ps</code>: Pashto<br><code>pt</code>: Portuguese<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>qu</code>: Quechua<br><code>ro</code>: Romanian<br><code>rom</code>: Romani<br><code>rn</code>: Rundi<br><code>ru</code>: Russian<br><code>rw</code>: Kinyarwanda<br><code>sa</code>: Sanskrit<br><code>scn</code>: Sicilian<br><code>sd</code>: Sindhi<br><code>sg</code>: Sango<br><code>shn</code>: Shan<br><code>si</code>: Sinhalese<br><code>sk</code>: Slovak<br><code>sl</code>: Slovenian<br><code>sm</code>: Samoan<br><code>sn</code>: Shona<br><code>so</code>: Somali<br><code>sq</code>: Albanian<br><code>sr</code>: Serbian<br><code>ss</code>: Swati<br><code>st</code>: Sesotho<br><code>su</code>: Sundanese<br><code>sv</code>: Swedish<br><code>sw</code>: Swahili<br><code>szl</code>: Silesian<br><code>ta</code>: Tamil<br><code>te</code>: Telugu<br><code>tet</code>: Tetum<br><code>tg</code>: Tajik<br><code>th</code>: Thai<br><code>ti</code>: Tigrinya<br><code>tk</code>: Turkmen<br><code>tn</code>: Tswana<br><code>tr</code>: Turkish<br><code>ts</code>: Tsonga<br><code>tt</code>: Tatar<br><code>ug</code>: Uyghur<br><code>uk</code>: Ukrainian<br><code>ur</code>: Urdu<br><code>uz</code>: Uzbek<br><code>vi</code>: Vietnamese<br><code>xh</code>: Xhosa<br><code>yi</code>: Yiddish<br><code>yo</code>: Yoruba<br><code>yua</code>: Yucatec Maya<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>zu</code>: Zulu</p><p><strong>Note</strong>: Use the multilingual method.<code>/</code> to separate, such as <code>en/ja</code>, which indicates English and Japanese.</p>
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * <p>Subtitle processing type:</p><ul><li>0: ASR recognition subtitle</li><li>1: Pure caption translation</li><li>2: OCR recognition subtitle</li></ul><p><strong>Note</strong>: The default type is ASR recognition subtitle if the field is unspecified.</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * <p>Area configurations for the subtitle OCR extraction box</p>
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
    * <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p>
    */
    @SerializedName("SpeakerMode")
    @Expose
    private Long SpeakerMode;

    /**
    * <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p>
    */
    @SerializedName("SpeakerLabel")
    @Expose
    private Long SpeakerLabel;

    /**
     * Get <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p> 
     * @return Name <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p>
     * @param Name <p>Intelligent subtitle template name<br>Length limit: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br><br>ASR recognition and pure caption translation currently support the following: 

[ASR Supported Languages](https://www.tencentcloud.com/zh/document/product/1041/68175#ASRlanguages)


Common available language codes:<br>`auto` (Auto Recognition), <br>`zh` (Simplified Chinese), <br>`en` (English), <br>`ja` (Japanese), <br>`ko` (Korean), <br>`zh-PY `(Chinese, English and Cantonese), <br>`zh_medical `(Medical Chinese), <br>`vi` (Vietnamese), <br>`ms` (Malay), <br>`id` (Indonesian), <br>`fil` (Filipino), <br>`th` (Thai), <br>`pt` (Portuguese), <br>`tr` (Turkish), <br>`ar` (Arabic), <br>`es` (Spanish), <br>`hi` (Hindi), <br>`fr` (French), <br>`de` (German), <br>`it` (Italian), <br>`zh_dialect` (Chinese Dialects), <br>`zh_en` (Chinese & English Mixed), <br>`yue` (Cantonese), <br>`ru` (Russian), <br>`prime_zh` (Chinese, English & Chinese Dialects) 
     * @return VideoSrcLanguage <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br><br>ASR recognition and pure caption translation currently support the following: 

[ASR Supported Languages](https://www.tencentcloud.com/zh/document/product/1041/68175#ASRlanguages)


Common available language codes:<br>`auto` (Auto Recognition), <br>`zh` (Simplified Chinese), <br>`en` (English), <br>`ja` (Japanese), <br>`ko` (Korean), <br>`zh-PY `(Chinese, English and Cantonese), <br>`zh_medical `(Medical Chinese), <br>`vi` (Vietnamese), <br>`ms` (Malay), <br>`id` (Indonesian), <br>`fil` (Filipino), <br>`th` (Thai), <br>`pt` (Portuguese), <br>`tr` (Turkish), <br>`ar` (Arabic), <br>`es` (Spanish), <br>`hi` (Hindi), <br>`fr` (French), <br>`de` (German), <br>`it` (Italian), <br>`zh_dialect` (Chinese Dialects), <br>`zh_en` (Chinese & English Mixed), <br>`yue` (Cantonese), <br>`ru` (Russian), <br>`prime_zh` (Chinese, English & Chinese Dialects)
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br><br>ASR recognition and pure caption translation currently support the following: 

[ASR Supported Languages](https://www.tencentcloud.com/zh/document/product/1041/68175#ASRlanguages)


Common available language codes:<br>`auto` (Auto Recognition), <br>`zh` (Simplified Chinese), <br>`en` (English), <br>`ja` (Japanese), <br>`ko` (Korean), <br>`zh-PY `(Chinese, English and Cantonese), <br>`zh_medical `(Medical Chinese), <br>`vi` (Vietnamese), <br>`ms` (Malay), <br>`id` (Indonesian), <br>`fil` (Filipino), <br>`th` (Thai), <br>`pt` (Portuguese), <br>`tr` (Turkish), <br>`ar` (Arabic), <br>`es` (Spanish), <br>`hi` (Hindi), <br>`fr` (French), <br>`de` (German), <br>`it` (Italian), <br>`zh_dialect` (Chinese Dialects), <br>`zh_en` (Chinese & English Mixed), <br>`yue` (Cantonese), <br>`ru` (Russian), <br>`prime_zh` (Chinese, English & Chinese Dialects)
     * @param VideoSrcLanguage <p>Smart subtitling video source language<br>OCR recognition supports the following languages:<br><code>zh_en</code>: Chinese-English<br><code>multi</code>: Other<br><br>ASR recognition and pure caption translation currently support the following: 

[ASR Supported Languages](https://www.tencentcloud.com/zh/document/product/1041/68175#ASRlanguages)


Common available language codes:<br>`auto` (Auto Recognition), <br>`zh` (Simplified Chinese), <br>`en` (English), <br>`ja` (Japanese), <br>`ko` (Korean), <br>`zh-PY `(Chinese, English and Cantonese), <br>`zh_medical `(Medical Chinese), <br>`vi` (Vietnamese), <br>`ms` (Malay), <br>`id` (Indonesian), <br>`fil` (Filipino), <br>`th` (Thai), <br>`pt` (Portuguese), <br>`tr` (Turkish), <br>`ar` (Arabic), <br>`es` (Spanish), <br>`hi` (Hindi), <br>`fr` (French), <br>`de` (German), <br>`it` (Italian), <br>`zh_dialect` (Chinese Dialects), <br>`zh_en` (Chinese & English Mixed), <br>`yue` (Cantonese), <br>`ru` (Russian), <br>`prime_zh` (Chinese, English & Chinese Dialects)
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p> 
     * @return SubtitleType <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p>
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p>
     * @param SubtitleType <p>Intelligent caption subtitle language type<br>0: Source language<br>1: Target language<br>2: Source language + target language<br>Only 0 is supported when TranslateSwitch is OFF<br>Only 1 or 2 is supported when TranslateSwitch is ON</p>
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get <p>Intelligent caption template description information<br>Length limit: 256 characters.</p> 
     * @return Comment <p>Intelligent caption template description information<br>Length limit: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Intelligent caption template description information<br>Length limit: 256 characters.</p>
     * @param Comment <p>Intelligent caption template description information<br>Length limit: 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul> 
     * @return SubtitleFormat <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul>
     * @param SubtitleFormat <p>Intelligent subtitle file format:</p><ul><li>For ASR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li><li>Leave blank or fill in the blank: no subtitle file generated</li></ul></li><li>For pure subtitle translation processing type:<ul><li>original: consistent with the source file</li><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li><li>For OCR recognition translation processing type:<ul><li>vtt: WebVTT format subtitle</li><li>srt: SRT format subtitle</li></ul></li></ul><p><strong>Note</strong>:</p><ul><li>For ASR recognition method, do not leave blank or not pass when translating 2 or more languages.</li><li>For pure subtitle translation method, do not leave blank or not pass.</li><li>For OCR tasks, it is allowed to leave blank or not pass when suppression is enabled.</li></ul>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>ASR hot word lexicon parameter</p> 
     * @return AsrHotWordsConfigure <p>ASR hot word lexicon parameter</p>
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set <p>ASR hot word lexicon parameter</p>
     * @param AsrHotWordsConfigure <p>ASR hot word lexicon parameter</p>
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p> 
     * @return TranslateSwitch <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p>
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p>
     * @param TranslateSwitch <p>Subtitle translation switch<br><code>ON</code>: Enable translation<br><code>OFF</code>: Disable translation</p><p><strong>Note</strong>: For pure subtitle translation mode, the default value is enabled if the field is unspecified. The field cannot be left blank or set to <code>OFF</code>.</p>
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get <p>Subtitle target language<br>Take effect when TranslateSwitch is ON. Translation language list:<br><code>ab</code>: Abkhaz<br><code>ace</code>: Acehnese<br><code>ach</code>: Acholi<br><code>af</code>: Afrikaans<br><code>ak</code>: Akan<br><code>am</code>: Amharic<br><code>ar</code>: Arabic<br><code>as</code>: Assamese<br><code>ay</code>: Aymara<br><code>az</code>: Azerbaijani<br><code>ba</code>: Bashkir<br><code>ban</code>: Balinese<br><code>bbc</code>: Batak Toba<br><code>bem</code>: Bemba<br><code>bew</code>: Betawi<br><code>bg</code>: Bulgarian<br><code>bho</code>: Bhojpuri<br><code>bik</code>: Bikol<br><code>bm</code>: Bambara<br><code>bn</code>: Bengali<br><code>br</code>: Breton<br><code>bs</code>: Bosnian<br><code>btx</code>: Batak Karo<br><code>bts</code>: Batak Simalungun<br><code>bua</code>: Buryat<br><code>ca</code>: Catalan<br><code>ceb</code>: Cebuano<br><code>cgg</code>: Kiga<br><code>chm</code>: Meadow Mari<br><code>ckb</code>: Kurdish (Sorani)<br><code>cnh</code>: Hakha Chin<br><code>co</code>: Corsican<br><code>crh</code>: Crimean Tatar<br><code>crs</code>: Seychellois Creole<br><code>cs</code>: Czech<br><code>cv</code>: Chuvash<br><code>cy</code>: Welsh<br><code>da</code>: Danish<br><code>de</code>: German<br><code>din</code>: Dinka<br><code>doi</code>: Dogri<br><code>dov</code>: Dombe<br><code>dv</code>: Dhivehi<br><code>dz</code>: Dzongkha<br><code>ee</code>: Ewe<br><code>el</code>: Greek<br><code>en</code>: English<br><code>eo</code>: Esperanto<br><code>es</code>: Spanish<br><code>et</code>: Estonian<br><code>eu</code>: Basque<br><code>fa</code>: Persian<br><code>ff</code>: Fula<br><code>fi</code>: Finnish<br><code>fil</code>: Filipino (Tagalog)<br><code>fj</code>: Fijian<br><code>fr</code>: French<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fy</code>: Frisian<br><code>ga</code>: Irish<br><code>gaa</code>: GaLanguage<br><code>gd</code>: Scottish Gaelic<br><code>gl</code>: Galician<br><code>gn</code>: Guarani<br><code>gom</code>: Konkani<br><code>gu</code>: Gujarati<br><code>gv</code>: Manx<br><code>ha</code>: Hausa<br><code>haw</code>: Hawaiian<br><code>he</code>: Hebrew<br><code>hi</code>: Hindi<br><code>hil</code>: Hiligaynon<br><code>hmn</code>: Hmong<br><code>hr</code>: Croatian<br><code>hrx</code>: Hunsrik<br><code>ht</code>: Haitian Creole<br><code>hu</code>: Hungarian<br><code>hy</code>: Armenian<br><code>id</code>: Indonesian<br><code>ig</code>: Igbo<br><code>ilo</code>: Ilocano<br><code>is</code>: Icelandic<br><code>it</code>: Italian<br><code>iw</code>: Hebrew<br><code>ja</code>: Japanese<br><code>jv</code>: Javanese<br><code>ka</code>: Georgian<br><code>kk</code>: Kazakh<br><code>km</code>: Khmer<br><code>kn</code>: Kannada<br><code>ko</code>: Korean<br><code>kri</code>: Krio<br><code>ku</code>: Kurdish (Kurmanji)<br><code>ktu</code>: Kituba<br><code>ky</code>: Kyrgyz<br><code>la</code>: Latin<br><code>lb</code>: Luxembourgish<br><code>lg</code>: Ganda (Luganda)<br><code>li</code>: Limburgish<br><code>lij</code>: Ligurian<br><code>lmo</code>: Lombard<br><code>ln</code>: Lingala<br><code>lo</code>: Lao<br><code>lt</code>: Lithuanian<br><code>ltg</code>: Latgalian<br><code>luo</code>: Luo<br><code>lus</code>: Mizo<br><code>lv</code>: Latvian<br><code>mai</code>: Maithili<br><code>mak</code>: Makassar<br><code>mg</code>: Malagasy<br><code>mi</code>: Maori<br><code>min</code>: Minangkabau<br><code>mk</code>: Macedonian<br><code>ml</code>: Malayalam<br><code>mn</code>: Mongolian<br><code>mr</code>: Marathi<br><code>ms</code>: Malay<br><code>mt</code>: Maltese<br><code>my</code>: Burmese<br><code>ne</code>: Nepali<br><code>new</code>: Newari<br><code>nl</code>: Dutch<br><code>no</code>: Norwegian<br><code>nr</code>: Southern Ndebele<br><code>nso</code>: Northern Sotho (Sepedi)<br><code>nus</code>: Nuer<br><code>ny</code>: Chichewa (Nyanja)<br><code>oc</code>: Occitan<br><code>om</code>: Oromo<br><code>or</code>: Odia<br><code>pa</code>: Punjabi<br><code>pag</code>: Pangasinan<br><code>pam</code>: Kapampangan<br><code>pap</code>: Papiamento<br><code>pl</code>: Polish<br><code>ps</code>: Pashto<br><code>pt</code>: Portuguese<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>qu</code>: Quechua<br><code>ro</code>: Romanian<br><code>rom</code>: Romani<br><code>rn</code>: Rundi<br><code>ru</code>: Russian<br><code>rw</code>: Kinyarwanda<br><code>sa</code>: Sanskrit<br><code>scn</code>: Sicilian<br><code>sd</code>: Sindhi<br><code>sg</code>: Sango<br><code>shn</code>: Shan<br><code>si</code>: Sinhalese<br><code>sk</code>: Slovak<br><code>sl</code>: Slovenian<br><code>sm</code>: Samoan<br><code>sn</code>: Shona<br><code>so</code>: Somali<br><code>sq</code>: Albanian<br><code>sr</code>: Serbian<br><code>ss</code>: Swati<br><code>st</code>: Sesotho<br><code>su</code>: Sundanese<br><code>sv</code>: Swedish<br><code>sw</code>: Swahili<br><code>szl</code>: Silesian<br><code>ta</code>: Tamil<br><code>te</code>: Telugu<br><code>tet</code>: Tetum<br><code>tg</code>: Tajik<br><code>th</code>: Thai<br><code>ti</code>: Tigrinya<br><code>tk</code>: Turkmen<br><code>tn</code>: Tswana<br><code>tr</code>: Turkish<br><code>ts</code>: Tsonga<br><code>tt</code>: Tatar<br><code>ug</code>: Uyghur<br><code>uk</code>: Ukrainian<br><code>ur</code>: Urdu<br><code>uz</code>: Uzbek<br><code>vi</code>: Vietnamese<br><code>xh</code>: Xhosa<br><code>yi</code>: Yiddish<br><code>yo</code>: Yoruba<br><code>yua</code>: Yucatec Maya<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>zu</code>: Zulu</p><p><strong>Note</strong>: Use the multilingual method.<code>/</code> to separate, such as <code>en/ja</code>, which indicates English and Japanese.</p> 
     * @return TranslateDstLanguage <p>Subtitle target language<br>Take effect when TranslateSwitch is ON. Translation language list:<br><code>ab</code>: Abkhaz<br><code>ace</code>: Acehnese<br><code>ach</code>: Acholi<br><code>af</code>: Afrikaans<br><code>ak</code>: Akan<br><code>am</code>: Amharic<br><code>ar</code>: Arabic<br><code>as</code>: Assamese<br><code>ay</code>: Aymara<br><code>az</code>: Azerbaijani<br><code>ba</code>: Bashkir<br><code>ban</code>: Balinese<br><code>bbc</code>: Batak Toba<br><code>bem</code>: Bemba<br><code>bew</code>: Betawi<br><code>bg</code>: Bulgarian<br><code>bho</code>: Bhojpuri<br><code>bik</code>: Bikol<br><code>bm</code>: Bambara<br><code>bn</code>: Bengali<br><code>br</code>: Breton<br><code>bs</code>: Bosnian<br><code>btx</code>: Batak Karo<br><code>bts</code>: Batak Simalungun<br><code>bua</code>: Buryat<br><code>ca</code>: Catalan<br><code>ceb</code>: Cebuano<br><code>cgg</code>: Kiga<br><code>chm</code>: Meadow Mari<br><code>ckb</code>: Kurdish (Sorani)<br><code>cnh</code>: Hakha Chin<br><code>co</code>: Corsican<br><code>crh</code>: Crimean Tatar<br><code>crs</code>: Seychellois Creole<br><code>cs</code>: Czech<br><code>cv</code>: Chuvash<br><code>cy</code>: Welsh<br><code>da</code>: Danish<br><code>de</code>: German<br><code>din</code>: Dinka<br><code>doi</code>: Dogri<br><code>dov</code>: Dombe<br><code>dv</code>: Dhivehi<br><code>dz</code>: Dzongkha<br><code>ee</code>: Ewe<br><code>el</code>: Greek<br><code>en</code>: English<br><code>eo</code>: Esperanto<br><code>es</code>: Spanish<br><code>et</code>: Estonian<br><code>eu</code>: Basque<br><code>fa</code>: Persian<br><code>ff</code>: Fula<br><code>fi</code>: Finnish<br><code>fil</code>: Filipino (Tagalog)<br><code>fj</code>: Fijian<br><code>fr</code>: French<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fy</code>: Frisian<br><code>ga</code>: Irish<br><code>gaa</code>: GaLanguage<br><code>gd</code>: Scottish Gaelic<br><code>gl</code>: Galician<br><code>gn</code>: Guarani<br><code>gom</code>: Konkani<br><code>gu</code>: Gujarati<br><code>gv</code>: Manx<br><code>ha</code>: Hausa<br><code>haw</code>: Hawaiian<br><code>he</code>: Hebrew<br><code>hi</code>: Hindi<br><code>hil</code>: Hiligaynon<br><code>hmn</code>: Hmong<br><code>hr</code>: Croatian<br><code>hrx</code>: Hunsrik<br><code>ht</code>: Haitian Creole<br><code>hu</code>: Hungarian<br><code>hy</code>: Armenian<br><code>id</code>: Indonesian<br><code>ig</code>: Igbo<br><code>ilo</code>: Ilocano<br><code>is</code>: Icelandic<br><code>it</code>: Italian<br><code>iw</code>: Hebrew<br><code>ja</code>: Japanese<br><code>jv</code>: Javanese<br><code>ka</code>: Georgian<br><code>kk</code>: Kazakh<br><code>km</code>: Khmer<br><code>kn</code>: Kannada<br><code>ko</code>: Korean<br><code>kri</code>: Krio<br><code>ku</code>: Kurdish (Kurmanji)<br><code>ktu</code>: Kituba<br><code>ky</code>: Kyrgyz<br><code>la</code>: Latin<br><code>lb</code>: Luxembourgish<br><code>lg</code>: Ganda (Luganda)<br><code>li</code>: Limburgish<br><code>lij</code>: Ligurian<br><code>lmo</code>: Lombard<br><code>ln</code>: Lingala<br><code>lo</code>: Lao<br><code>lt</code>: Lithuanian<br><code>ltg</code>: Latgalian<br><code>luo</code>: Luo<br><code>lus</code>: Mizo<br><code>lv</code>: Latvian<br><code>mai</code>: Maithili<br><code>mak</code>: Makassar<br><code>mg</code>: Malagasy<br><code>mi</code>: Maori<br><code>min</code>: Minangkabau<br><code>mk</code>: Macedonian<br><code>ml</code>: Malayalam<br><code>mn</code>: Mongolian<br><code>mr</code>: Marathi<br><code>ms</code>: Malay<br><code>mt</code>: Maltese<br><code>my</code>: Burmese<br><code>ne</code>: Nepali<br><code>new</code>: Newari<br><code>nl</code>: Dutch<br><code>no</code>: Norwegian<br><code>nr</code>: Southern Ndebele<br><code>nso</code>: Northern Sotho (Sepedi)<br><code>nus</code>: Nuer<br><code>ny</code>: Chichewa (Nyanja)<br><code>oc</code>: Occitan<br><code>om</code>: Oromo<br><code>or</code>: Odia<br><code>pa</code>: Punjabi<br><code>pag</code>: Pangasinan<br><code>pam</code>: Kapampangan<br><code>pap</code>: Papiamento<br><code>pl</code>: Polish<br><code>ps</code>: Pashto<br><code>pt</code>: Portuguese<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>qu</code>: Quechua<br><code>ro</code>: Romanian<br><code>rom</code>: Romani<br><code>rn</code>: Rundi<br><code>ru</code>: Russian<br><code>rw</code>: Kinyarwanda<br><code>sa</code>: Sanskrit<br><code>scn</code>: Sicilian<br><code>sd</code>: Sindhi<br><code>sg</code>: Sango<br><code>shn</code>: Shan<br><code>si</code>: Sinhalese<br><code>sk</code>: Slovak<br><code>sl</code>: Slovenian<br><code>sm</code>: Samoan<br><code>sn</code>: Shona<br><code>so</code>: Somali<br><code>sq</code>: Albanian<br><code>sr</code>: Serbian<br><code>ss</code>: Swati<br><code>st</code>: Sesotho<br><code>su</code>: Sundanese<br><code>sv</code>: Swedish<br><code>sw</code>: Swahili<br><code>szl</code>: Silesian<br><code>ta</code>: Tamil<br><code>te</code>: Telugu<br><code>tet</code>: Tetum<br><code>tg</code>: Tajik<br><code>th</code>: Thai<br><code>ti</code>: Tigrinya<br><code>tk</code>: Turkmen<br><code>tn</code>: Tswana<br><code>tr</code>: Turkish<br><code>ts</code>: Tsonga<br><code>tt</code>: Tatar<br><code>ug</code>: Uyghur<br><code>uk</code>: Ukrainian<br><code>ur</code>: Urdu<br><code>uz</code>: Uzbek<br><code>vi</code>: Vietnamese<br><code>xh</code>: Xhosa<br><code>yi</code>: Yiddish<br><code>yo</code>: Yoruba<br><code>yua</code>: Yucatec Maya<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>zu</code>: Zulu</p><p><strong>Note</strong>: Use the multilingual method.<code>/</code> to separate, such as <code>en/ja</code>, which indicates English and Japanese.</p>
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set <p>Subtitle target language<br>Take effect when TranslateSwitch is ON. Translation language list:<br><code>ab</code>: Abkhaz<br><code>ace</code>: Acehnese<br><code>ach</code>: Acholi<br><code>af</code>: Afrikaans<br><code>ak</code>: Akan<br><code>am</code>: Amharic<br><code>ar</code>: Arabic<br><code>as</code>: Assamese<br><code>ay</code>: Aymara<br><code>az</code>: Azerbaijani<br><code>ba</code>: Bashkir<br><code>ban</code>: Balinese<br><code>bbc</code>: Batak Toba<br><code>bem</code>: Bemba<br><code>bew</code>: Betawi<br><code>bg</code>: Bulgarian<br><code>bho</code>: Bhojpuri<br><code>bik</code>: Bikol<br><code>bm</code>: Bambara<br><code>bn</code>: Bengali<br><code>br</code>: Breton<br><code>bs</code>: Bosnian<br><code>btx</code>: Batak Karo<br><code>bts</code>: Batak Simalungun<br><code>bua</code>: Buryat<br><code>ca</code>: Catalan<br><code>ceb</code>: Cebuano<br><code>cgg</code>: Kiga<br><code>chm</code>: Meadow Mari<br><code>ckb</code>: Kurdish (Sorani)<br><code>cnh</code>: Hakha Chin<br><code>co</code>: Corsican<br><code>crh</code>: Crimean Tatar<br><code>crs</code>: Seychellois Creole<br><code>cs</code>: Czech<br><code>cv</code>: Chuvash<br><code>cy</code>: Welsh<br><code>da</code>: Danish<br><code>de</code>: German<br><code>din</code>: Dinka<br><code>doi</code>: Dogri<br><code>dov</code>: Dombe<br><code>dv</code>: Dhivehi<br><code>dz</code>: Dzongkha<br><code>ee</code>: Ewe<br><code>el</code>: Greek<br><code>en</code>: English<br><code>eo</code>: Esperanto<br><code>es</code>: Spanish<br><code>et</code>: Estonian<br><code>eu</code>: Basque<br><code>fa</code>: Persian<br><code>ff</code>: Fula<br><code>fi</code>: Finnish<br><code>fil</code>: Filipino (Tagalog)<br><code>fj</code>: Fijian<br><code>fr</code>: French<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fy</code>: Frisian<br><code>ga</code>: Irish<br><code>gaa</code>: GaLanguage<br><code>gd</code>: Scottish Gaelic<br><code>gl</code>: Galician<br><code>gn</code>: Guarani<br><code>gom</code>: Konkani<br><code>gu</code>: Gujarati<br><code>gv</code>: Manx<br><code>ha</code>: Hausa<br><code>haw</code>: Hawaiian<br><code>he</code>: Hebrew<br><code>hi</code>: Hindi<br><code>hil</code>: Hiligaynon<br><code>hmn</code>: Hmong<br><code>hr</code>: Croatian<br><code>hrx</code>: Hunsrik<br><code>ht</code>: Haitian Creole<br><code>hu</code>: Hungarian<br><code>hy</code>: Armenian<br><code>id</code>: Indonesian<br><code>ig</code>: Igbo<br><code>ilo</code>: Ilocano<br><code>is</code>: Icelandic<br><code>it</code>: Italian<br><code>iw</code>: Hebrew<br><code>ja</code>: Japanese<br><code>jv</code>: Javanese<br><code>ka</code>: Georgian<br><code>kk</code>: Kazakh<br><code>km</code>: Khmer<br><code>kn</code>: Kannada<br><code>ko</code>: Korean<br><code>kri</code>: Krio<br><code>ku</code>: Kurdish (Kurmanji)<br><code>ktu</code>: Kituba<br><code>ky</code>: Kyrgyz<br><code>la</code>: Latin<br><code>lb</code>: Luxembourgish<br><code>lg</code>: Ganda (Luganda)<br><code>li</code>: Limburgish<br><code>lij</code>: Ligurian<br><code>lmo</code>: Lombard<br><code>ln</code>: Lingala<br><code>lo</code>: Lao<br><code>lt</code>: Lithuanian<br><code>ltg</code>: Latgalian<br><code>luo</code>: Luo<br><code>lus</code>: Mizo<br><code>lv</code>: Latvian<br><code>mai</code>: Maithili<br><code>mak</code>: Makassar<br><code>mg</code>: Malagasy<br><code>mi</code>: Maori<br><code>min</code>: Minangkabau<br><code>mk</code>: Macedonian<br><code>ml</code>: Malayalam<br><code>mn</code>: Mongolian<br><code>mr</code>: Marathi<br><code>ms</code>: Malay<br><code>mt</code>: Maltese<br><code>my</code>: Burmese<br><code>ne</code>: Nepali<br><code>new</code>: Newari<br><code>nl</code>: Dutch<br><code>no</code>: Norwegian<br><code>nr</code>: Southern Ndebele<br><code>nso</code>: Northern Sotho (Sepedi)<br><code>nus</code>: Nuer<br><code>ny</code>: Chichewa (Nyanja)<br><code>oc</code>: Occitan<br><code>om</code>: Oromo<br><code>or</code>: Odia<br><code>pa</code>: Punjabi<br><code>pag</code>: Pangasinan<br><code>pam</code>: Kapampangan<br><code>pap</code>: Papiamento<br><code>pl</code>: Polish<br><code>ps</code>: Pashto<br><code>pt</code>: Portuguese<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>qu</code>: Quechua<br><code>ro</code>: Romanian<br><code>rom</code>: Romani<br><code>rn</code>: Rundi<br><code>ru</code>: Russian<br><code>rw</code>: Kinyarwanda<br><code>sa</code>: Sanskrit<br><code>scn</code>: Sicilian<br><code>sd</code>: Sindhi<br><code>sg</code>: Sango<br><code>shn</code>: Shan<br><code>si</code>: Sinhalese<br><code>sk</code>: Slovak<br><code>sl</code>: Slovenian<br><code>sm</code>: Samoan<br><code>sn</code>: Shona<br><code>so</code>: Somali<br><code>sq</code>: Albanian<br><code>sr</code>: Serbian<br><code>ss</code>: Swati<br><code>st</code>: Sesotho<br><code>su</code>: Sundanese<br><code>sv</code>: Swedish<br><code>sw</code>: Swahili<br><code>szl</code>: Silesian<br><code>ta</code>: Tamil<br><code>te</code>: Telugu<br><code>tet</code>: Tetum<br><code>tg</code>: Tajik<br><code>th</code>: Thai<br><code>ti</code>: Tigrinya<br><code>tk</code>: Turkmen<br><code>tn</code>: Tswana<br><code>tr</code>: Turkish<br><code>ts</code>: Tsonga<br><code>tt</code>: Tatar<br><code>ug</code>: Uyghur<br><code>uk</code>: Ukrainian<br><code>ur</code>: Urdu<br><code>uz</code>: Uzbek<br><code>vi</code>: Vietnamese<br><code>xh</code>: Xhosa<br><code>yi</code>: Yiddish<br><code>yo</code>: Yoruba<br><code>yua</code>: Yucatec Maya<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>zu</code>: Zulu</p><p><strong>Note</strong>: Use the multilingual method.<code>/</code> to separate, such as <code>en/ja</code>, which indicates English and Japanese.</p>
     * @param TranslateDstLanguage <p>Subtitle target language<br>Take effect when TranslateSwitch is ON. Translation language list:<br><code>ab</code>: Abkhaz<br><code>ace</code>: Acehnese<br><code>ach</code>: Acholi<br><code>af</code>: Afrikaans<br><code>ak</code>: Akan<br><code>am</code>: Amharic<br><code>ar</code>: Arabic<br><code>as</code>: Assamese<br><code>ay</code>: Aymara<br><code>az</code>: Azerbaijani<br><code>ba</code>: Bashkir<br><code>ban</code>: Balinese<br><code>bbc</code>: Batak Toba<br><code>bem</code>: Bemba<br><code>bew</code>: Betawi<br><code>bg</code>: Bulgarian<br><code>bho</code>: Bhojpuri<br><code>bik</code>: Bikol<br><code>bm</code>: Bambara<br><code>bn</code>: Bengali<br><code>br</code>: Breton<br><code>bs</code>: Bosnian<br><code>btx</code>: Batak Karo<br><code>bts</code>: Batak Simalungun<br><code>bua</code>: Buryat<br><code>ca</code>: Catalan<br><code>ceb</code>: Cebuano<br><code>cgg</code>: Kiga<br><code>chm</code>: Meadow Mari<br><code>ckb</code>: Kurdish (Sorani)<br><code>cnh</code>: Hakha Chin<br><code>co</code>: Corsican<br><code>crh</code>: Crimean Tatar<br><code>crs</code>: Seychellois Creole<br><code>cs</code>: Czech<br><code>cv</code>: Chuvash<br><code>cy</code>: Welsh<br><code>da</code>: Danish<br><code>de</code>: German<br><code>din</code>: Dinka<br><code>doi</code>: Dogri<br><code>dov</code>: Dombe<br><code>dv</code>: Dhivehi<br><code>dz</code>: Dzongkha<br><code>ee</code>: Ewe<br><code>el</code>: Greek<br><code>en</code>: English<br><code>eo</code>: Esperanto<br><code>es</code>: Spanish<br><code>et</code>: Estonian<br><code>eu</code>: Basque<br><code>fa</code>: Persian<br><code>ff</code>: Fula<br><code>fi</code>: Finnish<br><code>fil</code>: Filipino (Tagalog)<br><code>fj</code>: Fijian<br><code>fr</code>: French<br><code>fr-CA</code>: French (Canada)<br><code>fr-FR</code>: French (France)<br><code>fy</code>: Frisian<br><code>ga</code>: Irish<br><code>gaa</code>: GaLanguage<br><code>gd</code>: Scottish Gaelic<br><code>gl</code>: Galician<br><code>gn</code>: Guarani<br><code>gom</code>: Konkani<br><code>gu</code>: Gujarati<br><code>gv</code>: Manx<br><code>ha</code>: Hausa<br><code>haw</code>: Hawaiian<br><code>he</code>: Hebrew<br><code>hi</code>: Hindi<br><code>hil</code>: Hiligaynon<br><code>hmn</code>: Hmong<br><code>hr</code>: Croatian<br><code>hrx</code>: Hunsrik<br><code>ht</code>: Haitian Creole<br><code>hu</code>: Hungarian<br><code>hy</code>: Armenian<br><code>id</code>: Indonesian<br><code>ig</code>: Igbo<br><code>ilo</code>: Ilocano<br><code>is</code>: Icelandic<br><code>it</code>: Italian<br><code>iw</code>: Hebrew<br><code>ja</code>: Japanese<br><code>jv</code>: Javanese<br><code>ka</code>: Georgian<br><code>kk</code>: Kazakh<br><code>km</code>: Khmer<br><code>kn</code>: Kannada<br><code>ko</code>: Korean<br><code>kri</code>: Krio<br><code>ku</code>: Kurdish (Kurmanji)<br><code>ktu</code>: Kituba<br><code>ky</code>: Kyrgyz<br><code>la</code>: Latin<br><code>lb</code>: Luxembourgish<br><code>lg</code>: Ganda (Luganda)<br><code>li</code>: Limburgish<br><code>lij</code>: Ligurian<br><code>lmo</code>: Lombard<br><code>ln</code>: Lingala<br><code>lo</code>: Lao<br><code>lt</code>: Lithuanian<br><code>ltg</code>: Latgalian<br><code>luo</code>: Luo<br><code>lus</code>: Mizo<br><code>lv</code>: Latvian<br><code>mai</code>: Maithili<br><code>mak</code>: Makassar<br><code>mg</code>: Malagasy<br><code>mi</code>: Maori<br><code>min</code>: Minangkabau<br><code>mk</code>: Macedonian<br><code>ml</code>: Malayalam<br><code>mn</code>: Mongolian<br><code>mr</code>: Marathi<br><code>ms</code>: Malay<br><code>mt</code>: Maltese<br><code>my</code>: Burmese<br><code>ne</code>: Nepali<br><code>new</code>: Newari<br><code>nl</code>: Dutch<br><code>no</code>: Norwegian<br><code>nr</code>: Southern Ndebele<br><code>nso</code>: Northern Sotho (Sepedi)<br><code>nus</code>: Nuer<br><code>ny</code>: Chichewa (Nyanja)<br><code>oc</code>: Occitan<br><code>om</code>: Oromo<br><code>or</code>: Odia<br><code>pa</code>: Punjabi<br><code>pag</code>: Pangasinan<br><code>pam</code>: Kapampangan<br><code>pap</code>: Papiamento<br><code>pl</code>: Polish<br><code>ps</code>: Pashto<br><code>pt</code>: Portuguese<br><code>pt-BR</code>: Portuguese (Brazil)<br><code>pt-PT</code>: Portuguese (Portugal)<br><code>qu</code>: Quechua<br><code>ro</code>: Romanian<br><code>rom</code>: Romani<br><code>rn</code>: Rundi<br><code>ru</code>: Russian<br><code>rw</code>: Kinyarwanda<br><code>sa</code>: Sanskrit<br><code>scn</code>: Sicilian<br><code>sd</code>: Sindhi<br><code>sg</code>: Sango<br><code>shn</code>: Shan<br><code>si</code>: Sinhalese<br><code>sk</code>: Slovak<br><code>sl</code>: Slovenian<br><code>sm</code>: Samoan<br><code>sn</code>: Shona<br><code>so</code>: Somali<br><code>sq</code>: Albanian<br><code>sr</code>: Serbian<br><code>ss</code>: Swati<br><code>st</code>: Sesotho<br><code>su</code>: Sundanese<br><code>sv</code>: Swedish<br><code>sw</code>: Swahili<br><code>szl</code>: Silesian<br><code>ta</code>: Tamil<br><code>te</code>: Telugu<br><code>tet</code>: Tetum<br><code>tg</code>: Tajik<br><code>th</code>: Thai<br><code>ti</code>: Tigrinya<br><code>tk</code>: Turkmen<br><code>tn</code>: Tswana<br><code>tr</code>: Turkish<br><code>ts</code>: Tsonga<br><code>tt</code>: Tatar<br><code>ug</code>: Uyghur<br><code>uk</code>: Ukrainian<br><code>ur</code>: Urdu<br><code>uz</code>: Uzbek<br><code>vi</code>: Vietnamese<br><code>xh</code>: Xhosa<br><code>yi</code>: Yiddish<br><code>yo</code>: Yoruba<br><code>yua</code>: Yucatec Maya<br><code>yue</code>: Cantonese<br><code>zh</code>: Simplified Chinese<br><code>zh-TW</code>: Traditional Chinese<br><code>zu</code>: Zulu</p><p><strong>Note</strong>: Use the multilingual method.<code>/</code> to separate, such as <code>en/ja</code>, which indicates English and Japanese.</p>
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
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
     * Get <p>Area configurations for the subtitle OCR extraction box</p> 
     * @return SelectingSubtitleAreasConfig <p>Area configurations for the subtitle OCR extraction box</p>
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set <p>Area configurations for the subtitle OCR extraction box</p>
     * @param SelectingSubtitleAreasConfig <p>Area configurations for the subtitle OCR extraction box</p>
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    /**
     * Get <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p> 
     * @return SubtitleEmbedId <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p>
     * @param SubtitleEmbedId <p>Suppression Template id. Only allowed to fill in when ProcessType is 0 or 2 (task type is ASR or OCR). Cannot fill in when multiple target languages are enabled.</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p> 
     * @return SpeakerMode <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p>
     */
    public Long getSpeakerMode() {
        return this.SpeakerMode;
    }

    /**
     * Set <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p>
     * @param SpeakerMode <p>Speaker identification switch. Valid values:<br>0: Speaker identification is disabled.<br>1: Speaker identification is enabled.<br>By default, speaker identification is disabled.</p>
     */
    public void setSpeakerMode(Long SpeakerMode) {
        this.SpeakerMode = SpeakerMode;
    }

    /**
     * Get <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p> 
     * @return SpeakerLabel <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p>
     */
    public Long getSpeakerLabel() {
        return this.SpeakerLabel;
    }

    /**
     * Set <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p>
     * @param SpeakerLabel <p>Indicates whether to output the identified speaker to the subtitle file. Valid values:<br>0: The speaker is not output to the subtitle file.<br>1: The speaker is output to the VTT subtitle file.<br>Note: To use this parameter, the value of SpeakerMode cannot be 0.<br>By default, the speaker is not output to the subtitle file.</p>
     */
    public void setSpeakerLabel(Long SpeakerLabel) {
        this.SpeakerLabel = SpeakerLabel;
    }

    public CreateSmartSubtitleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSmartSubtitleTemplateRequest(CreateSmartSubtitleTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "SpeakerMode", this.SpeakerMode);
        this.setParamSimple(map, prefix + "SpeakerLabel", this.SpeakerLabel);

    }
}

