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
    * <p>Voice full-text recognition task switch. Available values:</p><li>ON: Enable the intelligent voice full-text recognition task;</li><li>OFF: Disable the intelligent voice full-text recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>List of generated subtitle file formats. Leave empty or pass an empty array to indicate no subtitle file generation. Available values:</p><li>vtt: generate WebVTT subtitle file;</li><li>srt: generate SRT subtitle file.</li><font color="red">Note:</font>VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets.
    */
    @SerializedName("SubtitleFormats")
    @Expose
    private String [] SubtitleFormats;

    /**
    * <p>Generated subtitle file format. Leave it empty or as an empty string to not generate subtitle files. Available values:</p><li>vtt: generate a WebVTT subtitle file;</li><li>srt: generate an SRT subtitle file.</li><font color="red">Note: This field is deprecated. We recommend using SubtitleFormats.</font>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>Media source language. Value range:</p><li>zh: Mandarin</li><li>en: English</li><li>ja: Japanese</li><li>zh-ca: Cantonese</li><font color="red">Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. It is recommended to fill in the language corresponding to the original media to improve recognition accuracy).
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * <p>Specify subtitle name, length limited to 64 characters. This value will be used for player display. If left blank, VOD will auto generate it.<br><font color="red">Note:</font> This field is valid only when SubtitleFormats includes vtt.</p>
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get <p>Voice full-text recognition task switch. Available values:</p><li>ON: Enable the intelligent voice full-text recognition task;</li><li>OFF: Disable the intelligent voice full-text recognition task.</li> 
     * @return Switch <p>Voice full-text recognition task switch. Available values:</p><li>ON: Enable the intelligent voice full-text recognition task;</li><li>OFF: Disable the intelligent voice full-text recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Voice full-text recognition task switch. Available values:</p><li>ON: Enable the intelligent voice full-text recognition task;</li><li>OFF: Disable the intelligent voice full-text recognition task.</li>
     * @param Switch <p>Voice full-text recognition task switch. Available values:</p><li>ON: Enable the intelligent voice full-text recognition task;</li><li>OFF: Disable the intelligent voice full-text recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>List of generated subtitle file formats. Leave empty or pass an empty array to indicate no subtitle file generation. Available values:</p><li>vtt: generate WebVTT subtitle file;</li><li>srt: generate SRT subtitle file.</li><font color="red">Note:</font>VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets. 
     * @return SubtitleFormats <p>List of generated subtitle file formats. Leave empty or pass an empty array to indicate no subtitle file generation. Available values:</p><li>vtt: generate WebVTT subtitle file;</li><li>srt: generate SRT subtitle file.</li><font color="red">Note:</font>VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets.
     */
    public String [] getSubtitleFormats() {
        return this.SubtitleFormats;
    }

    /**
     * Set <p>List of generated subtitle file formats. Leave empty or pass an empty array to indicate no subtitle file generation. Available values:</p><li>vtt: generate WebVTT subtitle file;</li><li>srt: generate SRT subtitle file.</li><font color="red">Note:</font>VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets.
     * @param SubtitleFormats <p>List of generated subtitle file formats. Leave empty or pass an empty array to indicate no subtitle file generation. Available values:</p><li>vtt: generate WebVTT subtitle file;</li><li>srt: generate SRT subtitle file.</li><font color="red">Note:</font>VOD media asset information only supports adding vtt subtitles. When and only when SubtitleFormats includes vtt, VOD will add the generated subtitles to media assets.
     */
    public void setSubtitleFormats(String [] SubtitleFormats) {
        this.SubtitleFormats = SubtitleFormats;
    }

    /**
     * Get <p>Generated subtitle file format. Leave it empty or as an empty string to not generate subtitle files. Available values:</p><li>vtt: generate a WebVTT subtitle file;</li><li>srt: generate an SRT subtitle file.</li><font color="red">Note: This field is deprecated. We recommend using SubtitleFormats.</font> 
     * @return SubtitleFormat <p>Generated subtitle file format. Leave it empty or as an empty string to not generate subtitle files. Available values:</p><li>vtt: generate a WebVTT subtitle file;</li><li>srt: generate an SRT subtitle file.</li><font color="red">Note: This field is deprecated. We recommend using SubtitleFormats.</font>
     * @deprecated
     */
    @Deprecated
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>Generated subtitle file format. Leave it empty or as an empty string to not generate subtitle files. Available values:</p><li>vtt: generate a WebVTT subtitle file;</li><li>srt: generate an SRT subtitle file.</li><font color="red">Note: This field is deprecated. We recommend using SubtitleFormats.</font>
     * @param SubtitleFormat <p>Generated subtitle file format. Leave it empty or as an empty string to not generate subtitle files. Available values:</p><li>vtt: generate a WebVTT subtitle file;</li><li>srt: generate an SRT subtitle file.</li><font color="red">Note: This field is deprecated. We recommend using SubtitleFormats.</font>
     * @deprecated
     */
    @Deprecated
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>Media source language. Value range:</p><li>zh: Mandarin</li><li>en: English</li><li>ja: Japanese</li><li>zh-ca: Cantonese</li><font color="red">Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. It is recommended to fill in the language corresponding to the original media to improve recognition accuracy). 
     * @return SrcLanguage <p>Media source language. Value range:</p><li>zh: Mandarin</li><li>en: English</li><li>ja: Japanese</li><li>zh-ca: Cantonese</li><font color="red">Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. It is recommended to fill in the language corresponding to the original media to improve recognition accuracy).
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set <p>Media source language. Value range:</p><li>zh: Mandarin</li><li>en: English</li><li>ja: Japanese</li><li>zh-ca: Cantonese</li><font color="red">Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. It is recommended to fill in the language corresponding to the original media to improve recognition accuracy).
     * @param SrcLanguage <p>Media source language. Value range:</p><li>zh: Mandarin</li><li>en: English</li><li>ja: Japanese</li><li>zh-ca: Cantonese</li><font color="red">Note:</font> Fill in an empty string or leave the parameter blank for automatic recognition (effectiveness difficult to guarantee. It is recommended to fill in the language corresponding to the original media to improve recognition accuracy).
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get <p>Specify subtitle name, length limited to 64 characters. This value will be used for player display. If left blank, VOD will auto generate it.<br><font color="red">Note:</font> This field is valid only when SubtitleFormats includes vtt.</p> 
     * @return SubtitleName <p>Specify subtitle name, length limited to 64 characters. This value will be used for player display. If left blank, VOD will auto generate it.<br><font color="red">Note:</font> This field is valid only when SubtitleFormats includes vtt.</p>
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set <p>Specify subtitle name, length limited to 64 characters. This value will be used for player display. If left blank, VOD will auto generate it.<br><font color="red">Note:</font> This field is valid only when SubtitleFormats includes vtt.</p>
     * @param SubtitleName <p>Specify subtitle name, length limited to 64 characters. This value will be used for player display. If left blank, VOD will auto generate it.<br><font color="red">Note:</font> This field is valid only when SubtitleFormats includes vtt.</p>
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

