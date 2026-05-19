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

public class AsrFullTextConfigureInfo extends AbstractModel {

    /**
    * Voice full-text recognition task switch. Available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disable the intelligent voice full-text recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Generated subtitle file format list. Leaving it as an empty array means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will be generated subtitles add to media assets.
    */
    @SerializedName("SubtitleFormats")
    @Expose
    private String [] SubtitleFormats;

    /**
    * Generated subtitle file format. Leaving it as an empty string or not filling it means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormats.</font>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Media source language. Valid values:
<li>zh: Mandarin;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>zh-ca: Cantonese.</li>
<font color=red>Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. Recommended to fill in the language corresponding to the original media to improve recognition accuracy).
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * Specify subtitle name. Length limit: 64 characters. This value will be used for player display. If left blank, VOD will auto generate.
<font color=red>Note:</font> This field is valid only when SubtitleFormats contains vtt.
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get Voice full-text recognition task switch. Available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disable the intelligent voice full-text recognition task.</li> 
     * @return Switch Voice full-text recognition task switch. Available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disable the intelligent voice full-text recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Voice full-text recognition task switch. Available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disable the intelligent voice full-text recognition task.</li>
     * @param Switch Voice full-text recognition task switch. Available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disable the intelligent voice full-text recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Generated subtitle file format list. Leaving it as an empty array means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will be generated subtitles add to media assets. 
     * @return SubtitleFormats Generated subtitle file format list. Leaving it as an empty array means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will be generated subtitles add to media assets.
     */
    public String [] getSubtitleFormats() {
        return this.SubtitleFormats;
    }

    /**
     * Set Generated subtitle file format list. Leaving it as an empty array means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will be generated subtitles add to media assets.
     * @param SubtitleFormats Generated subtitle file format list. Leaving it as an empty array means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li><font color=red>Note:</font> VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will be generated subtitles add to media assets.
     */
    public void setSubtitleFormats(String [] SubtitleFormats) {
        this.SubtitleFormats = SubtitleFormats;
    }

    /**
     * Get Generated subtitle file format. Leaving it as an empty string or not filling it means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormats.</font> 
     * @return SubtitleFormat Generated subtitle file format. Leaving it as an empty string or not filling it means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormats.</font>
     * @deprecated
     */
    @Deprecated
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Generated subtitle file format. Leaving it as an empty string or not filling it means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormats.</font>
     * @param SubtitleFormat Generated subtitle file format. Leaving it as an empty string or not filling it means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormats.</font>
     * @deprecated
     */
    @Deprecated
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Media source language. Valid values:
<li>zh: Mandarin;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>zh-ca: Cantonese.</li>
<font color=red>Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. Recommended to fill in the language corresponding to the original media to improve recognition accuracy). 
     * @return SrcLanguage Media source language. Valid values:
<li>zh: Mandarin;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>zh-ca: Cantonese.</li>
<font color=red>Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. Recommended to fill in the language corresponding to the original media to improve recognition accuracy).
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set Media source language. Valid values:
<li>zh: Mandarin;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>zh-ca: Cantonese.</li>
<font color=red>Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. Recommended to fill in the language corresponding to the original media to improve recognition accuracy).
     * @param SrcLanguage Media source language. Valid values:
<li>zh: Mandarin;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>zh-ca: Cantonese.</li>
<font color=red>Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. Recommended to fill in the language corresponding to the original media to improve recognition accuracy).
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get Specify subtitle name. Length limit: 64 characters. This value will be used for player display. If left blank, VOD will auto generate.
<font color=red>Note:</font> This field is valid only when SubtitleFormats contains vtt. 
     * @return SubtitleName Specify subtitle name. Length limit: 64 characters. This value will be used for player display. If left blank, VOD will auto generate.
<font color=red>Note:</font> This field is valid only when SubtitleFormats contains vtt.
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set Specify subtitle name. Length limit: 64 characters. This value will be used for player display. If left blank, VOD will auto generate.
<font color=red>Note:</font> This field is valid only when SubtitleFormats contains vtt.
     * @param SubtitleName Specify subtitle name. Length limit: 64 characters. This value will be used for player display. If left blank, VOD will auto generate.
<font color=red>Note:</font> This field is valid only when SubtitleFormats contains vtt.
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    public AsrFullTextConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrFullTextConfigureInfo(AsrFullTextConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SubtitleFormats != null) {
            this.SubtitleFormats = new String[source.SubtitleFormats.length];
            for (int i = 0; i < source.SubtitleFormats.length; i++) {
                this.SubtitleFormats[i] = new String(source.SubtitleFormats[i]);
            }
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.SrcLanguage != null) {
            this.SrcLanguage = new String(source.SrcLanguage);
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
        this.setParamArraySimple(map, prefix + "SubtitleFormats.", this.SubtitleFormats);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);

    }
}

