/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Voice translation task switch, optional values:
<li>ON: switch on;</li>
<li>OFF: switch off.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Media source language, value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`vi`: Vietnamese;</li>
<li>`ms`: Malay;</li>
<li>`th`: Thai;</li>
<li>`pt`: Portuguese;</li>
<li>`tr`: Turkish;</li>
<li>`ar`: Arabic;</li>
<li>`es`: Spanish;</li>
<li>`hi`: Hindi;</li>
<li>`fr`: French.</li>
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * Translation target language.
When SrcLanguage is zh(Chinese), value range:
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay.</li>

When SrcLanguage is en(English), value range:
<li>`zh`: Chinese;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay;</li>
<li>`ar`: Arabic;</li>
<li>`hi`: Hindi.</li>

When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>

When SrcLanguage is ko (Korean), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese.</li>

When SrcLanguage is vi (Vietnamese) or ms (Malay) or th (Thai), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English.</li>

When SrcLanguage is pt (Portuguese), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian.</li>

When SrcLanguage is tr (Turkish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is es (Spanish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>`en`: English.</li>

When SrcLanguage is fr (French), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>
    */
    @SerializedName("DstLanguage")
    @Expose
    private String DstLanguage;

    /**
    * Operation information about subtitle format list.
    */
    @SerializedName("SubtitleFormatsOperation")
    @Expose
    private SubtitleFormatsOperation SubtitleFormatsOperation;

    /**
    * Specify subtitle name, length limit: 64 characters. This value will be used for player display.
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get Voice translation task switch, optional values:
<li>ON: switch on;</li>
<li>OFF: switch off.</li> 
     * @return Switch Voice translation task switch, optional values:
<li>ON: switch on;</li>
<li>OFF: switch off.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Voice translation task switch, optional values:
<li>ON: switch on;</li>
<li>OFF: switch off.</li>
     * @param Switch Voice translation task switch, optional values:
<li>ON: switch on;</li>
<li>OFF: switch off.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Media source language, value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`vi`: Vietnamese;</li>
<li>`ms`: Malay;</li>
<li>`th`: Thai;</li>
<li>`pt`: Portuguese;</li>
<li>`tr`: Turkish;</li>
<li>`ar`: Arabic;</li>
<li>`es`: Spanish;</li>
<li>`hi`: Hindi;</li>
<li>`fr`: French.</li> 
     * @return SrcLanguage Media source language, value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`vi`: Vietnamese;</li>
<li>`ms`: Malay;</li>
<li>`th`: Thai;</li>
<li>`pt`: Portuguese;</li>
<li>`tr`: Turkish;</li>
<li>`ar`: Arabic;</li>
<li>`es`: Spanish;</li>
<li>`hi`: Hindi;</li>
<li>`fr`: French.</li>
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set Media source language, value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`vi`: Vietnamese;</li>
<li>`ms`: Malay;</li>
<li>`th`: Thai;</li>
<li>`pt`: Portuguese;</li>
<li>`tr`: Turkish;</li>
<li>`ar`: Arabic;</li>
<li>`es`: Spanish;</li>
<li>`hi`: Hindi;</li>
<li>`fr`: French.</li>
     * @param SrcLanguage Media source language, value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`vi`: Vietnamese;</li>
<li>`ms`: Malay;</li>
<li>`th`: Thai;</li>
<li>`pt`: Portuguese;</li>
<li>`tr`: Turkish;</li>
<li>`ar`: Arabic;</li>
<li>`es`: Spanish;</li>
<li>`hi`: Hindi;</li>
<li>`fr`: French.</li>
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get Translation target language.
When SrcLanguage is zh(Chinese), value range:
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay.</li>

When SrcLanguage is en(English), value range:
<li>`zh`: Chinese;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay;</li>
<li>`ar`: Arabic;</li>
<li>`hi`: Hindi.</li>

When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>

When SrcLanguage is ko (Korean), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese.</li>

When SrcLanguage is vi (Vietnamese) or ms (Malay) or th (Thai), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English.</li>

When SrcLanguage is pt (Portuguese), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian.</li>

When SrcLanguage is tr (Turkish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is es (Spanish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>`en`: English.</li>

When SrcLanguage is fr (French), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li> 
     * @return DstLanguage Translation target language.
When SrcLanguage is zh(Chinese), value range:
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay.</li>

When SrcLanguage is en(English), value range:
<li>`zh`: Chinese;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay;</li>
<li>`ar`: Arabic;</li>
<li>`hi`: Hindi.</li>

When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>

When SrcLanguage is ko (Korean), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese.</li>

When SrcLanguage is vi (Vietnamese) or ms (Malay) or th (Thai), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English.</li>

When SrcLanguage is pt (Portuguese), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian.</li>

When SrcLanguage is tr (Turkish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is es (Spanish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>`en`: English.</li>

When SrcLanguage is fr (French), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>
     */
    public String getDstLanguage() {
        return this.DstLanguage;
    }

    /**
     * Set Translation target language.
When SrcLanguage is zh(Chinese), value range:
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay.</li>

When SrcLanguage is en(English), value range:
<li>`zh`: Chinese;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay;</li>
<li>`ar`: Arabic;</li>
<li>`hi`: Hindi.</li>

When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>

When SrcLanguage is ko (Korean), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese.</li>

When SrcLanguage is vi (Vietnamese) or ms (Malay) or th (Thai), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English.</li>

When SrcLanguage is pt (Portuguese), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian.</li>

When SrcLanguage is tr (Turkish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is es (Spanish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>`en`: English.</li>

When SrcLanguage is fr (French), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>
     * @param DstLanguage Translation target language.
When SrcLanguage is zh(Chinese), value range:
<li>`en`: English;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay.</li>

When SrcLanguage is en(English), value range:
<li>`zh`: Chinese;</li>
<li>`ja`: Japanese;</li>
<li>`ko`: Korean;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese;</li>
<li>`vi`: Vietnamese;</li>
<li>`id`: Indonesian;</li>
<li>`th`: Thai;</li>
<li>`ms`: Malay;</li>
<li>`ar`: Arabic;</li>
<li>`hi`: Hindi.</li>

When SrcLanguage is ja (Japanese), value range:
<li>zh: Chinese;</li>
<li>en: English;</li>
<li>ko: Korean.</li>

When SrcLanguage is ko (Korean), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`ja`: Japanese.</li>

When SrcLanguage is vi (Vietnamese) or ms (Malay) or th (Thai), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English.</li>

When SrcLanguage is pt (Portuguese), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian.</li>

When SrcLanguage is tr (Turkish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is es (Spanish), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`fr`: French;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>

When SrcLanguage is ar (Arabic) or hi (Hindi), value range:
<li>`en`: English.</li>

When SrcLanguage is fr (French), value range:
<li>`zh`: Chinese;</li>
<li>`en`: English;</li>
<li>`es`: Spanish;</li>
<li>`it`: Italian;</li>
<li>`de`: German;</li>
<li>`tr`: Turkish;</li>
<li>`ru`: Russian;</li>
<li>`pt`: Portuguese.</li>
     */
    public void setDstLanguage(String DstLanguage) {
        this.DstLanguage = DstLanguage;
    }

    /**
     * Get Operation information about subtitle format list. 
     * @return SubtitleFormatsOperation Operation information about subtitle format list.
     */
    public SubtitleFormatsOperation getSubtitleFormatsOperation() {
        return this.SubtitleFormatsOperation;
    }

    /**
     * Set Operation information about subtitle format list.
     * @param SubtitleFormatsOperation Operation information about subtitle format list.
     */
    public void setSubtitleFormatsOperation(SubtitleFormatsOperation SubtitleFormatsOperation) {
        this.SubtitleFormatsOperation = SubtitleFormatsOperation;
    }

    /**
     * Get Specify subtitle name, length limit: 64 characters. This value will be used for player display. 
     * @return SubtitleName Specify subtitle name, length limit: 64 characters. This value will be used for player display.
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set Specify subtitle name, length limit: 64 characters. This value will be used for player display.
     * @param SubtitleName Specify subtitle name, length limit: 64 characters. This value will be used for player display.
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

