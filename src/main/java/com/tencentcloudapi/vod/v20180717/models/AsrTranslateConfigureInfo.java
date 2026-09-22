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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrTranslateConfigureInfo extends AbstractModel {

    /**
    * Task switch for speech translation recognition. Available values:
<li>ON: enabled</li>
<li>OFF: disable.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition feature items simultaneously is forbidden.

    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Media source language. This parameter is required when Switch is ON. Value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>vi: Vietnamese;</li>
<li>ms: Malay;</li>
<li>th: Thai;</li>
<li>pt: Portuguese;</li>
<li>tr: Turkish;</li>
<li>ar: Arabic;</li>
<li>es: Spanish;</li>
<li>hi: Hindi;</li>
<li>fr: French.</li>
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * Translation target language. This parameter is valid when Switch is ON.
If this parameter is not specified or an empty string is entered, it means that only full text recognition is performed without translation. The billing item is the same as that of full text recognition in AsrFullTextConfigure.
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value range:
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay.</li>
When SrcLanguage is en, value range:
<li>zh: Chinese;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay;</li>
<li>ar: Arabic;</li>
<li>hi: Hindi.</li>
When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When `SrcLanguage` is `ko` (Korean), the value range is:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese.</li>
When SrcLanguage is vi (Vietnamese), ms (Malay), or th (Thai), the value range is:
<li>zh: Chinese;</li>
<li>en: English.</li>
When SrcLanguage is pt (Portuguese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian.</li>
When SrcLanguage is tr (Turkish), the value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is es (Spanish), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>en: English.</li>
When SrcLanguage is fr (French), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
    */
    @SerializedName("DstLanguage")
    @Expose
    private String DstLanguage;

    /**
    * Generated subtitle file format list. Leaving it empty or as an empty array means no subtitle file will be generated. Valid values:
<li>vtt: Generate a WebVTT subtitle file;</li>
<li>srt: generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. Therefore, when and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets.
    */
    @SerializedName("SubtitleFormats")
    @Expose
    private String [] SubtitleFormats;

    /**
    * Specify subtitle name. Length limited to 64 characters. This value will be used for player display. If left blank, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.

    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get Task switch for speech translation recognition. Available values:
<li>ON: enabled</li>
<li>OFF: disable.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition feature items simultaneously is forbidden.
 
     * @return Switch Task switch for speech translation recognition. Available values:
<li>ON: enabled</li>
<li>OFF: disable.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition feature items simultaneously is forbidden.

     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Task switch for speech translation recognition. Available values:
<li>ON: enabled</li>
<li>OFF: disable.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition feature items simultaneously is forbidden.

     * @param Switch Task switch for speech translation recognition. Available values:
<li>ON: enabled</li>
<li>OFF: disable.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition feature items simultaneously is forbidden.

     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Media source language. This parameter is required when Switch is ON. Value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>vi: Vietnamese;</li>
<li>ms: Malay;</li>
<li>th: Thai;</li>
<li>pt: Portuguese;</li>
<li>tr: Turkish;</li>
<li>ar: Arabic;</li>
<li>es: Spanish;</li>
<li>hi: Hindi;</li>
<li>fr: French.</li> 
     * @return SrcLanguage Media source language. This parameter is required when Switch is ON. Value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>vi: Vietnamese;</li>
<li>ms: Malay;</li>
<li>th: Thai;</li>
<li>pt: Portuguese;</li>
<li>tr: Turkish;</li>
<li>ar: Arabic;</li>
<li>es: Spanish;</li>
<li>hi: Hindi;</li>
<li>fr: French.</li>
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set Media source language. This parameter is required when Switch is ON. Value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>vi: Vietnamese;</li>
<li>ms: Malay;</li>
<li>th: Thai;</li>
<li>pt: Portuguese;</li>
<li>tr: Turkish;</li>
<li>ar: Arabic;</li>
<li>es: Spanish;</li>
<li>hi: Hindi;</li>
<li>fr: French.</li>
     * @param SrcLanguage Media source language. This parameter is required when Switch is ON. Value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>vi: Vietnamese;</li>
<li>ms: Malay;</li>
<li>th: Thai;</li>
<li>pt: Portuguese;</li>
<li>tr: Turkish;</li>
<li>ar: Arabic;</li>
<li>es: Spanish;</li>
<li>hi: Hindi;</li>
<li>fr: French.</li>
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get Translation target language. This parameter is valid when Switch is ON.
If this parameter is not specified or an empty string is entered, it means that only full text recognition is performed without translation. The billing item is the same as that of full text recognition in AsrFullTextConfigure.
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value range:
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay.</li>
When SrcLanguage is en, value range:
<li>zh: Chinese;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay;</li>
<li>ar: Arabic;</li>
<li>hi: Hindi.</li>
When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When `SrcLanguage` is `ko` (Korean), the value range is:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese.</li>
When SrcLanguage is vi (Vietnamese), ms (Malay), or th (Thai), the value range is:
<li>zh: Chinese;</li>
<li>en: English.</li>
When SrcLanguage is pt (Portuguese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian.</li>
When SrcLanguage is tr (Turkish), the value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is es (Spanish), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>en: English.</li>
When SrcLanguage is fr (French), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li> 
     * @return DstLanguage Translation target language. This parameter is valid when Switch is ON.
If this parameter is not specified or an empty string is entered, it means that only full text recognition is performed without translation. The billing item is the same as that of full text recognition in AsrFullTextConfigure.
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value range:
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay.</li>
When SrcLanguage is en, value range:
<li>zh: Chinese;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay;</li>
<li>ar: Arabic;</li>
<li>hi: Hindi.</li>
When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When `SrcLanguage` is `ko` (Korean), the value range is:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese.</li>
When SrcLanguage is vi (Vietnamese), ms (Malay), or th (Thai), the value range is:
<li>zh: Chinese;</li>
<li>en: English.</li>
When SrcLanguage is pt (Portuguese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian.</li>
When SrcLanguage is tr (Turkish), the value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is es (Spanish), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>en: English.</li>
When SrcLanguage is fr (French), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
     */
    public String getDstLanguage() {
        return this.DstLanguage;
    }

    /**
     * Set Translation target language. This parameter is valid when Switch is ON.
If this parameter is not specified or an empty string is entered, it means that only full text recognition is performed without translation. The billing item is the same as that of full text recognition in AsrFullTextConfigure.
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value range:
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay.</li>
When SrcLanguage is en, value range:
<li>zh: Chinese;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay;</li>
<li>ar: Arabic;</li>
<li>hi: Hindi.</li>
When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When `SrcLanguage` is `ko` (Korean), the value range is:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese.</li>
When SrcLanguage is vi (Vietnamese), ms (Malay), or th (Thai), the value range is:
<li>zh: Chinese;</li>
<li>en: English.</li>
When SrcLanguage is pt (Portuguese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian.</li>
When SrcLanguage is tr (Turkish), the value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is es (Spanish), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>en: English.</li>
When SrcLanguage is fr (French), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
     * @param DstLanguage Translation target language. This parameter is valid when Switch is ON.
If this parameter is not specified or an empty string is entered, it means that only full text recognition is performed without translation. The billing item is the same as that of full text recognition in AsrFullTextConfigure.
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value range:
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay.</li>
When SrcLanguage is en, value range:
<li>zh: Chinese;</li>
<li>ja: Japanese;</li>
<li>ko: Korean;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese;</li>
<li>vi: Vietnamese;</li>
<li>id: Indonesian;</li>
<li>th: Thai;</li>
<li>ms: Malay;</li>
<li>ar: Arabic;</li>
<li>hi: Hindi.</li>
When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When `SrcLanguage` is `ko` (Korean), the value range is:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ja: Japanese.</li>
When SrcLanguage is vi (Vietnamese), ms (Malay), or th (Thai), the value range is:
<li>zh: Chinese;</li>
<li>en: English.</li>
When SrcLanguage is pt (Portuguese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian.</li>
When SrcLanguage is tr (Turkish), the value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is es (Spanish), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>fr: French;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>en: English.</li>
When SrcLanguage is fr (French), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>es: Spanish;</li>
<li>it: Italian;</li>
<li>de: German;</li>
<li>tr: Turkish;</li>
<li>ru: Russian;</li>
<li>pt: Portuguese.</li>
     */
    public void setDstLanguage(String DstLanguage) {
        this.DstLanguage = DstLanguage;
    }

    /**
     * Get Generated subtitle file format list. Leaving it empty or as an empty array means no subtitle file will be generated. Valid values:
<li>vtt: Generate a WebVTT subtitle file;</li>
<li>srt: generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. Therefore, when and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets. 
     * @return SubtitleFormats Generated subtitle file format list. Leaving it empty or as an empty array means no subtitle file will be generated. Valid values:
<li>vtt: Generate a WebVTT subtitle file;</li>
<li>srt: generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. Therefore, when and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets.
     */
    public String [] getSubtitleFormats() {
        return this.SubtitleFormats;
    }

    /**
     * Set Generated subtitle file format list. Leaving it empty or as an empty array means no subtitle file will be generated. Valid values:
<li>vtt: Generate a WebVTT subtitle file;</li>
<li>srt: generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. Therefore, when and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets.
     * @param SubtitleFormats Generated subtitle file format list. Leaving it empty or as an empty array means no subtitle file will be generated. Valid values:
<li>vtt: Generate a WebVTT subtitle file;</li>
<li>srt: generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. Therefore, when and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets.
     */
    public void setSubtitleFormats(String [] SubtitleFormats) {
        this.SubtitleFormats = SubtitleFormats;
    }

    /**
     * Get Specify subtitle name. Length limited to 64 characters. This value will be used for player display. If left blank, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.
 
     * @return SubtitleName Specify subtitle name. Length limited to 64 characters. This value will be used for player display. If left blank, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.

     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set Specify subtitle name. Length limited to 64 characters. This value will be used for player display. If left blank, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.

     * @param SubtitleName Specify subtitle name. Length limited to 64 characters. This value will be used for player display. If left blank, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.

     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    public AsrTranslateConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrTranslateConfigureInfo(AsrTranslateConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SrcLanguage != null) {
            this.SrcLanguage = new String(source.SrcLanguage);
        }
        if (source.DstLanguage != null) {
            this.DstLanguage = new String(source.DstLanguage);
        }
        if (source.SubtitleFormats != null) {
            this.SubtitleFormats = new String[source.SubtitleFormats.length];
            for (int i = 0; i < source.SubtitleFormats.length; i++) {
                this.SubtitleFormats[i] = new String(source.SubtitleFormats[i]);
            }
        }
        if (source.SubtitleName != null) {
            this.SubtitleName = new String(source.SubtitleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "DstLanguage", this.DstLanguage);
        this.setParamArraySimple(map, prefix + "SubtitleFormats.", this.SubtitleFormats);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);

    }
}

