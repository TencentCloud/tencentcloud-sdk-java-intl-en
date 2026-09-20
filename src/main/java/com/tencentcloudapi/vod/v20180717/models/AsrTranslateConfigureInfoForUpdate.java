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

public class AsrTranslateConfigureInfoForUpdate extends AbstractModel {

    /**
    * Task switch for speech translation recognition. Value range:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition simultaneously is forbidden.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Media source language. Valid values:
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
    * Target language.
If this parameter is set to an empty string, it means that only full text speech recognition is performed without translation (the billing item is the same as that of AsrFullTextConfigure full text speech recognition);
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value ranges from...to...
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
When SrcLanguage is ja (Japanese), value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When SrcLanguage is ko (Korean), value ranges from...to...
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
When SrcLanguage is tr (Turkish), value ranges from...to...
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
    * Subtitle format list operation information.
    */
    @SerializedName("SubtitleFormatsOperation")
    @Expose
    private SubtitleFormatsOperation SubtitleFormatsOperation;

    /**
    * Specify subtitle name. Length limited to 64 characters. This value will be used for player display.
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get Task switch for speech translation recognition. Value range:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition simultaneously is forbidden. 
     * @return Switch Task switch for speech translation recognition. Value range:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition simultaneously is forbidden.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Task switch for speech translation recognition. Value range:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition simultaneously is forbidden.
     * @param Switch Task switch for speech translation recognition. Value range:
<li>ON: enabled;</li>
<li>OFF: Disabled.</li><font color=red>Note:</font> The voice translation recognition task itself will return ASR full text recognition results. To avoid duplicate charges, enabling voice translation recognition and ASR full text recognition simultaneously is forbidden.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Media source language. Valid values:
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
     * @return SrcLanguage Media source language. Valid values:
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
     * Set Media source language. Valid values:
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
     * @param SrcLanguage Media source language. Valid values:
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
     * Get Target language.
If this parameter is set to an empty string, it means that only full text speech recognition is performed without translation (the billing item is the same as that of AsrFullTextConfigure full text speech recognition);
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value ranges from...to...
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
When SrcLanguage is ja (Japanese), value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When SrcLanguage is ko (Korean), value ranges from...to...
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
When SrcLanguage is tr (Turkish), value ranges from...to...
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
     * @return DstLanguage Target language.
If this parameter is set to an empty string, it means that only full text speech recognition is performed without translation (the billing item is the same as that of AsrFullTextConfigure full text speech recognition);
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value ranges from...to...
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
When SrcLanguage is ja (Japanese), value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When SrcLanguage is ko (Korean), value ranges from...to...
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
When SrcLanguage is tr (Turkish), value ranges from...to...
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
     * Set Target language.
If this parameter is set to an empty string, it means that only full text speech recognition is performed without translation (the billing item is the same as that of AsrFullTextConfigure full text speech recognition);
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value ranges from...to...
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
When SrcLanguage is ja (Japanese), value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When SrcLanguage is ko (Korean), value ranges from...to...
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
When SrcLanguage is tr (Turkish), value ranges from...to...
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
     * @param DstLanguage Target language.
If this parameter is set to an empty string, it means that only full text speech recognition is performed without translation (the billing item is the same as that of AsrFullTextConfigure full text speech recognition);
Otherwise, the parameter value range is divided into the following cases:
When SrcLanguage is zh (Chinese), value ranges from...to...
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
When SrcLanguage is ja (Japanese), value ranges from...to...
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>
When SrcLanguage is ko (Korean), value ranges from...to...
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
When SrcLanguage is tr (Turkish), value ranges from...to...
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
     * Get Subtitle format list operation information. 
     * @return SubtitleFormatsOperation Subtitle format list operation information.
     */
    public SubtitleFormatsOperation getSubtitleFormatsOperation() {
        return this.SubtitleFormatsOperation;
    }

    /**
     * Set Subtitle format list operation information.
     * @param SubtitleFormatsOperation Subtitle format list operation information.
     */
    public void setSubtitleFormatsOperation(SubtitleFormatsOperation SubtitleFormatsOperation) {
        this.SubtitleFormatsOperation = SubtitleFormatsOperation;
    }

    /**
     * Get Specify subtitle name. Length limited to 64 characters. This value will be used for player display. 
     * @return SubtitleName Specify subtitle name. Length limited to 64 characters. This value will be used for player display.
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set Specify subtitle name. Length limited to 64 characters. This value will be used for player display.
     * @param SubtitleName Specify subtitle name. Length limited to 64 characters. This value will be used for player display.
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    public AsrTranslateConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrTranslateConfigureInfoForUpdate(AsrTranslateConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SrcLanguage != null) {
            this.SrcLanguage = new String(source.SrcLanguage);
        }
        if (source.DstLanguage != null) {
            this.DstLanguage = new String(source.DstLanguage);
        }
        if (source.SubtitleFormatsOperation != null) {
            this.SubtitleFormatsOperation = new SubtitleFormatsOperation(source.SubtitleFormatsOperation);
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
        this.setParamObj(map, prefix + "SubtitleFormatsOperation.", this.SubtitleFormatsOperation);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);

    }
}

