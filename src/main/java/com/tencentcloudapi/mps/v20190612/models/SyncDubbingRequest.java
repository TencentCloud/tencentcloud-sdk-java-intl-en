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

public class SyncDubbingRequest extends AbstractModel {

    /**
    * Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Text language. This defaults to zh (Chinese) if left empty.
Supported languages:
zh: Chinese.
en: English.
ja: Japanese.
de: German.
fr: French.
ko: Korean.
ru: Russian.
uk: Ukrainian.
pt: Portuguese.
it: Italian.
es: Spanish.
id: Indonesian.
nl: Dutch.
tr: Turkish.
fil: Filipino.
ms: Malay.
el: Greek.
fi: Finnish.
hr: Croatian.
sk: Slovak.
pl: Polish.
sv: Swedish.
hi: Hindi.
bg: Bulgarian.
ro: Romanian.
ar: Arabic.
cs: Czech.
da: Danish.
ta: Tamil.
hun: Hungarian.
vi: Vietnamese.
no: Norwegian.
yue: Cantonese.
th: Thai.
he: Hebrew.
ca: Catalan.
nn: Nynorsk.
af: Afrikaans.
fa: Persian.
sl: Slovenian.

    */
    @SerializedName("TextLang")
    @Expose
    private String TextLang;

    /**
    * Voice type ID. This is required for synthesis with a specific voice type. System voice types and voice type cloning are supported.
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * Base64-encoded audio for cloning.
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * 
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * Cloning audio language. The default language is Chinese.
Supported languages are the same as those for TextLang.
    */
    @SerializedName("AudioLang")
    @Expose
    private String AudioLang;

    /**
    * 
    */
    @SerializedName("Output")
    @Expose
    private SyncDubbingOutputOption Output;

    /**
    * Extended parameters in the format of a JSON string.
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length. 
     * @return Text Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.
     * @param Text Text for the synthesis. This is required for text to speech. The text cannot exceed 2000 characters in length.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Text language. This defaults to zh (Chinese) if left empty.
Supported languages:
zh: Chinese.
en: English.
ja: Japanese.
de: German.
fr: French.
ko: Korean.
ru: Russian.
uk: Ukrainian.
pt: Portuguese.
it: Italian.
es: Spanish.
id: Indonesian.
nl: Dutch.
tr: Turkish.
fil: Filipino.
ms: Malay.
el: Greek.
fi: Finnish.
hr: Croatian.
sk: Slovak.
pl: Polish.
sv: Swedish.
hi: Hindi.
bg: Bulgarian.
ro: Romanian.
ar: Arabic.
cs: Czech.
da: Danish.
ta: Tamil.
hun: Hungarian.
vi: Vietnamese.
no: Norwegian.
yue: Cantonese.
th: Thai.
he: Hebrew.
ca: Catalan.
nn: Nynorsk.
af: Afrikaans.
fa: Persian.
sl: Slovenian.
 
     * @return TextLang Text language. This defaults to zh (Chinese) if left empty.
Supported languages:
zh: Chinese.
en: English.
ja: Japanese.
de: German.
fr: French.
ko: Korean.
ru: Russian.
uk: Ukrainian.
pt: Portuguese.
it: Italian.
es: Spanish.
id: Indonesian.
nl: Dutch.
tr: Turkish.
fil: Filipino.
ms: Malay.
el: Greek.
fi: Finnish.
hr: Croatian.
sk: Slovak.
pl: Polish.
sv: Swedish.
hi: Hindi.
bg: Bulgarian.
ro: Romanian.
ar: Arabic.
cs: Czech.
da: Danish.
ta: Tamil.
hun: Hungarian.
vi: Vietnamese.
no: Norwegian.
yue: Cantonese.
th: Thai.
he: Hebrew.
ca: Catalan.
nn: Nynorsk.
af: Afrikaans.
fa: Persian.
sl: Slovenian.

     */
    public String getTextLang() {
        return this.TextLang;
    }

    /**
     * Set Text language. This defaults to zh (Chinese) if left empty.
Supported languages:
zh: Chinese.
en: English.
ja: Japanese.
de: German.
fr: French.
ko: Korean.
ru: Russian.
uk: Ukrainian.
pt: Portuguese.
it: Italian.
es: Spanish.
id: Indonesian.
nl: Dutch.
tr: Turkish.
fil: Filipino.
ms: Malay.
el: Greek.
fi: Finnish.
hr: Croatian.
sk: Slovak.
pl: Polish.
sv: Swedish.
hi: Hindi.
bg: Bulgarian.
ro: Romanian.
ar: Arabic.
cs: Czech.
da: Danish.
ta: Tamil.
hun: Hungarian.
vi: Vietnamese.
no: Norwegian.
yue: Cantonese.
th: Thai.
he: Hebrew.
ca: Catalan.
nn: Nynorsk.
af: Afrikaans.
fa: Persian.
sl: Slovenian.

     * @param TextLang Text language. This defaults to zh (Chinese) if left empty.
Supported languages:
zh: Chinese.
en: English.
ja: Japanese.
de: German.
fr: French.
ko: Korean.
ru: Russian.
uk: Ukrainian.
pt: Portuguese.
it: Italian.
es: Spanish.
id: Indonesian.
nl: Dutch.
tr: Turkish.
fil: Filipino.
ms: Malay.
el: Greek.
fi: Finnish.
hr: Croatian.
sk: Slovak.
pl: Polish.
sv: Swedish.
hi: Hindi.
bg: Bulgarian.
ro: Romanian.
ar: Arabic.
cs: Czech.
da: Danish.
ta: Tamil.
hun: Hungarian.
vi: Vietnamese.
no: Norwegian.
yue: Cantonese.
th: Thai.
he: Hebrew.
ca: Catalan.
nn: Nynorsk.
af: Afrikaans.
fa: Persian.
sl: Slovenian.

     */
    public void setTextLang(String TextLang) {
        this.TextLang = TextLang;
    }

    /**
     * Get Voice type ID. This is required for synthesis with a specific voice type. System voice types and voice type cloning are supported. 
     * @return VoiceId Voice type ID. This is required for synthesis with a specific voice type. System voice types and voice type cloning are supported.
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set Voice type ID. This is required for synthesis with a specific voice type. System voice types and voice type cloning are supported.
     * @param VoiceId Voice type ID. This is required for synthesis with a specific voice type. System voice types and voice type cloning are supported.
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get Base64-encoded audio for cloning. 
     * @return AudioData Base64-encoded audio for cloning.
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set Base64-encoded audio for cloning.
     * @param AudioData Base64-encoded audio for cloning.
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get  
     * @return AudioUrl 
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 
     * @param AudioUrl 
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get Cloning audio language. The default language is Chinese.
Supported languages are the same as those for TextLang. 
     * @return AudioLang Cloning audio language. The default language is Chinese.
Supported languages are the same as those for TextLang.
     */
    public String getAudioLang() {
        return this.AudioLang;
    }

    /**
     * Set Cloning audio language. The default language is Chinese.
Supported languages are the same as those for TextLang.
     * @param AudioLang Cloning audio language. The default language is Chinese.
Supported languages are the same as those for TextLang.
     */
    public void setAudioLang(String AudioLang) {
        this.AudioLang = AudioLang;
    }

    /**
     * Get  
     * @return Output 
     */
    public SyncDubbingOutputOption getOutput() {
        return this.Output;
    }

    /**
     * Set 
     * @param Output 
     */
    public void setOutput(SyncDubbingOutputOption Output) {
        this.Output = Output;
    }

    /**
     * Get Extended parameters in the format of a JSON string. 
     * @return ExtParam Extended parameters in the format of a JSON string.
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set Extended parameters in the format of a JSON string.
     * @param ExtParam Extended parameters in the format of a JSON string.
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public SyncDubbingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDubbingRequest(SyncDubbingRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TextLang != null) {
            this.TextLang = new String(source.TextLang);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioLang != null) {
            this.AudioLang = new String(source.AudioLang);
        }
        if (source.Output != null) {
            this.Output = new SyncDubbingOutputOption(source.Output);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "TextLang", this.TextLang);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "AudioLang", this.AudioLang);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

