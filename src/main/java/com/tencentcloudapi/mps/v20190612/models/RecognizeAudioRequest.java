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

public class RecognizeAudioRequest extends AbstractModel {

    /**
    * Base64-encoded audio data.
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * Target language for recognition. If this is not specified, the language is automatically identified (auto).Note: If the automatic identification provides unsatisfactory results, you can specify the language to improve the accuracy.Supported languages:auto: automatic identification.zh: Simplified Chinese.en: English.ja: Japanese.ko: Korean.vi: Vietnamese.ms: Malay.id: Indonesian.fil: Filipino.th: Thai.pt: Portuguese.tr: Turkish.ar: Arabic.es: Spanish.hi: Hindi.fr: French.de: German.it: Italian.yue: Cantonese.ru: Russian.af: Afrikaans.sq: Albanian.am: Amharic.hy: Armenian.az: Azerbaijani.eu: Basque.bn: Bengali.bs: Bosnian.bg: Bulgarian.my: Burmese.ca: Catalan.hr: Croatian.cs: Czech.da: Danish.nl: Dutch.et: Estonian.fi: Finnish.gl: Galician.ka: Georgian.el: Greek.gu: Gujarati.iw: Hebrew.hu: Hungarian.is: Icelandic.jv: Javanese.kn: Kannada.kk: Kazakh.km: Khmer.rw: Kinyarwanda.lo: Lao.lv: Latvian.lt: Lithuanian.mk: Macedonian.ml: Malayalam.mr: Marathi.mn: Mongolian.ne: Nepali.no: Norwegian Bokmal.fa: Persian.pl: Polish.ro: Romanian.sr: Serbian.si: Sinhala.sk: Slovak.sl: Slovenian.st: Southern Sotho.su: Sundanese.sw: Swahili.sv: Swedish.ta: Tamil.te: Telugu.ts: Tsonga.uk: Ukrainian.ur: Urdu.uz: Uzbek.ve: Vendaxh: Xhosa.zu: Zulu.

    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Audio data format. Default value: pcm.Supported formats:pcm (mono 16-bit PCM data with a sample rate of 16000).ogg-opus (mono Opus-encoded Ogg data with sample rates of 16000, 24000, or 48000).
    */
    @SerializedName("AudioFormat")
    @Expose
    private String AudioFormat;

    /**
    * Audio sample rate.Supported sample rates:pcm 16000
ogg-opus 16000 / 24000 / 48000
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Extended parameter. This is left empty by default. Use this parameter for special requirements.
    */
    @SerializedName("UserExtPara")
    @Expose
    private String UserExtPara;

    /**
     * Get Base64-encoded audio data. 
     * @return AudioData Base64-encoded audio data.
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set Base64-encoded audio data.
     * @param AudioData Base64-encoded audio data.
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get Target language for recognition. If this is not specified, the language is automatically identified (auto).Note: If the automatic identification provides unsatisfactory results, you can specify the language to improve the accuracy.Supported languages:auto: automatic identification.zh: Simplified Chinese.en: English.ja: Japanese.ko: Korean.vi: Vietnamese.ms: Malay.id: Indonesian.fil: Filipino.th: Thai.pt: Portuguese.tr: Turkish.ar: Arabic.es: Spanish.hi: Hindi.fr: French.de: German.it: Italian.yue: Cantonese.ru: Russian.af: Afrikaans.sq: Albanian.am: Amharic.hy: Armenian.az: Azerbaijani.eu: Basque.bn: Bengali.bs: Bosnian.bg: Bulgarian.my: Burmese.ca: Catalan.hr: Croatian.cs: Czech.da: Danish.nl: Dutch.et: Estonian.fi: Finnish.gl: Galician.ka: Georgian.el: Greek.gu: Gujarati.iw: Hebrew.hu: Hungarian.is: Icelandic.jv: Javanese.kn: Kannada.kk: Kazakh.km: Khmer.rw: Kinyarwanda.lo: Lao.lv: Latvian.lt: Lithuanian.mk: Macedonian.ml: Malayalam.mr: Marathi.mn: Mongolian.ne: Nepali.no: Norwegian Bokmal.fa: Persian.pl: Polish.ro: Romanian.sr: Serbian.si: Sinhala.sk: Slovak.sl: Slovenian.st: Southern Sotho.su: Sundanese.sw: Swahili.sv: Swedish.ta: Tamil.te: Telugu.ts: Tsonga.uk: Ukrainian.ur: Urdu.uz: Uzbek.ve: Vendaxh: Xhosa.zu: Zulu.
 
     * @return Source Target language for recognition. If this is not specified, the language is automatically identified (auto).Note: If the automatic identification provides unsatisfactory results, you can specify the language to improve the accuracy.Supported languages:auto: automatic identification.zh: Simplified Chinese.en: English.ja: Japanese.ko: Korean.vi: Vietnamese.ms: Malay.id: Indonesian.fil: Filipino.th: Thai.pt: Portuguese.tr: Turkish.ar: Arabic.es: Spanish.hi: Hindi.fr: French.de: German.it: Italian.yue: Cantonese.ru: Russian.af: Afrikaans.sq: Albanian.am: Amharic.hy: Armenian.az: Azerbaijani.eu: Basque.bn: Bengali.bs: Bosnian.bg: Bulgarian.my: Burmese.ca: Catalan.hr: Croatian.cs: Czech.da: Danish.nl: Dutch.et: Estonian.fi: Finnish.gl: Galician.ka: Georgian.el: Greek.gu: Gujarati.iw: Hebrew.hu: Hungarian.is: Icelandic.jv: Javanese.kn: Kannada.kk: Kazakh.km: Khmer.rw: Kinyarwanda.lo: Lao.lv: Latvian.lt: Lithuanian.mk: Macedonian.ml: Malayalam.mr: Marathi.mn: Mongolian.ne: Nepali.no: Norwegian Bokmal.fa: Persian.pl: Polish.ro: Romanian.sr: Serbian.si: Sinhala.sk: Slovak.sl: Slovenian.st: Southern Sotho.su: Sundanese.sw: Swahili.sv: Swedish.ta: Tamil.te: Telugu.ts: Tsonga.uk: Ukrainian.ur: Urdu.uz: Uzbek.ve: Vendaxh: Xhosa.zu: Zulu.

     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Target language for recognition. If this is not specified, the language is automatically identified (auto).Note: If the automatic identification provides unsatisfactory results, you can specify the language to improve the accuracy.Supported languages:auto: automatic identification.zh: Simplified Chinese.en: English.ja: Japanese.ko: Korean.vi: Vietnamese.ms: Malay.id: Indonesian.fil: Filipino.th: Thai.pt: Portuguese.tr: Turkish.ar: Arabic.es: Spanish.hi: Hindi.fr: French.de: German.it: Italian.yue: Cantonese.ru: Russian.af: Afrikaans.sq: Albanian.am: Amharic.hy: Armenian.az: Azerbaijani.eu: Basque.bn: Bengali.bs: Bosnian.bg: Bulgarian.my: Burmese.ca: Catalan.hr: Croatian.cs: Czech.da: Danish.nl: Dutch.et: Estonian.fi: Finnish.gl: Galician.ka: Georgian.el: Greek.gu: Gujarati.iw: Hebrew.hu: Hungarian.is: Icelandic.jv: Javanese.kn: Kannada.kk: Kazakh.km: Khmer.rw: Kinyarwanda.lo: Lao.lv: Latvian.lt: Lithuanian.mk: Macedonian.ml: Malayalam.mr: Marathi.mn: Mongolian.ne: Nepali.no: Norwegian Bokmal.fa: Persian.pl: Polish.ro: Romanian.sr: Serbian.si: Sinhala.sk: Slovak.sl: Slovenian.st: Southern Sotho.su: Sundanese.sw: Swahili.sv: Swedish.ta: Tamil.te: Telugu.ts: Tsonga.uk: Ukrainian.ur: Urdu.uz: Uzbek.ve: Vendaxh: Xhosa.zu: Zulu.

     * @param Source Target language for recognition. If this is not specified, the language is automatically identified (auto).Note: If the automatic identification provides unsatisfactory results, you can specify the language to improve the accuracy.Supported languages:auto: automatic identification.zh: Simplified Chinese.en: English.ja: Japanese.ko: Korean.vi: Vietnamese.ms: Malay.id: Indonesian.fil: Filipino.th: Thai.pt: Portuguese.tr: Turkish.ar: Arabic.es: Spanish.hi: Hindi.fr: French.de: German.it: Italian.yue: Cantonese.ru: Russian.af: Afrikaans.sq: Albanian.am: Amharic.hy: Armenian.az: Azerbaijani.eu: Basque.bn: Bengali.bs: Bosnian.bg: Bulgarian.my: Burmese.ca: Catalan.hr: Croatian.cs: Czech.da: Danish.nl: Dutch.et: Estonian.fi: Finnish.gl: Galician.ka: Georgian.el: Greek.gu: Gujarati.iw: Hebrew.hu: Hungarian.is: Icelandic.jv: Javanese.kn: Kannada.kk: Kazakh.km: Khmer.rw: Kinyarwanda.lo: Lao.lv: Latvian.lt: Lithuanian.mk: Macedonian.ml: Malayalam.mr: Marathi.mn: Mongolian.ne: Nepali.no: Norwegian Bokmal.fa: Persian.pl: Polish.ro: Romanian.sr: Serbian.si: Sinhala.sk: Slovak.sl: Slovenian.st: Southern Sotho.su: Sundanese.sw: Swahili.sv: Swedish.ta: Tamil.te: Telugu.ts: Tsonga.uk: Ukrainian.ur: Urdu.uz: Uzbek.ve: Vendaxh: Xhosa.zu: Zulu.

     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Audio data format. Default value: pcm.Supported formats:pcm (mono 16-bit PCM data with a sample rate of 16000).ogg-opus (mono Opus-encoded Ogg data with sample rates of 16000, 24000, or 48000). 
     * @return AudioFormat Audio data format. Default value: pcm.Supported formats:pcm (mono 16-bit PCM data with a sample rate of 16000).ogg-opus (mono Opus-encoded Ogg data with sample rates of 16000, 24000, or 48000).
     */
    public String getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set Audio data format. Default value: pcm.Supported formats:pcm (mono 16-bit PCM data with a sample rate of 16000).ogg-opus (mono Opus-encoded Ogg data with sample rates of 16000, 24000, or 48000).
     * @param AudioFormat Audio data format. Default value: pcm.Supported formats:pcm (mono 16-bit PCM data with a sample rate of 16000).ogg-opus (mono Opus-encoded Ogg data with sample rates of 16000, 24000, or 48000).
     */
    public void setAudioFormat(String AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get Audio sample rate.Supported sample rates:pcm 16000
ogg-opus 16000 / 24000 / 48000 
     * @return SampleRate Audio sample rate.Supported sample rates:pcm 16000
ogg-opus 16000 / 24000 / 48000
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Audio sample rate.Supported sample rates:pcm 16000
ogg-opus 16000 / 24000 / 48000
     * @param SampleRate Audio sample rate.Supported sample rates:pcm 16000
ogg-opus 16000 / 24000 / 48000
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Extended parameter. This is left empty by default. Use this parameter for special requirements. 
     * @return UserExtPara Extended parameter. This is left empty by default. Use this parameter for special requirements.
     */
    public String getUserExtPara() {
        return this.UserExtPara;
    }

    /**
     * Set Extended parameter. This is left empty by default. Use this parameter for special requirements.
     * @param UserExtPara Extended parameter. This is left empty by default. Use this parameter for special requirements.
     */
    public void setUserExtPara(String UserExtPara) {
        this.UserExtPara = UserExtPara;
    }

    public RecognizeAudioRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeAudioRequest(RecognizeAudioRequest source) {
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.AudioFormat != null) {
            this.AudioFormat = new String(source.AudioFormat);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.UserExtPara != null) {
            this.UserExtPara = new String(source.UserExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "UserExtPara", this.UserExtPara);

    }
}

