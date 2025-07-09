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
    * Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The formats of the subtitle files generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
    */
    @SerializedName("SubtitleFormats")
    @Expose
    private String [] SubtitleFormats;

    /**
    * The format of the subtitle file generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormats` instead.</font>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Media source language value range: <li>zh: Mandarin </li> <li>en: English</li> <li>ja: Japanese </li> <li>zh-ca: Cantonese</li><font color=red>Note: </font> If it fills in an empty string or leaves this parameter blank, it will be automatically recognized (it is recommended to fill in the language corresponding to the media to improve the recognition accuracy).
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * Specify subtitle name, length limit: 64 characters. This value will be displayed by the player. If not provided, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.

    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li> 
     * @return Switch Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li>
     * @param Switch Switch of full speech recognition task. Valid values:
<li>ON: enables intelligent full speech recognition task;</li>
<li>OFF: disables intelligent full speech recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The formats of the subtitle files generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li> 
     * @return SubtitleFormats The formats of the subtitle files generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
     */
    public String [] getSubtitleFormats() {
        return this.SubtitleFormats;
    }

    /**
     * Set The formats of the subtitle files generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
     * @param SubtitleFormats The formats of the subtitle files generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
     */
    public void setSubtitleFormats(String [] SubtitleFormats) {
        this.SubtitleFormats = SubtitleFormats;
    }

    /**
     * Get The format of the subtitle file generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormats` instead.</font> 
     * @return SubtitleFormat The format of the subtitle file generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormats` instead.</font>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set The format of the subtitle file generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormats` instead.</font>
     * @param SubtitleFormat The format of the subtitle file generated. If this parameter is not passed or an empty string is passed in, no subtitles files will be generated. Valid values:
<li>vtt</li>
<li>srt</li>
<font color='red'>Note: This parameter has been deprecated. Please use `SubtitleFormats` instead.</font>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Media source language value range: <li>zh: Mandarin </li> <li>en: English</li> <li>ja: Japanese </li> <li>zh-ca: Cantonese</li><font color=red>Note: </font> If it fills in an empty string or leaves this parameter blank, it will be automatically recognized (it is recommended to fill in the language corresponding to the media to improve the recognition accuracy). 
     * @return SrcLanguage Media source language value range: <li>zh: Mandarin </li> <li>en: English</li> <li>ja: Japanese </li> <li>zh-ca: Cantonese</li><font color=red>Note: </font> If it fills in an empty string or leaves this parameter blank, it will be automatically recognized (it is recommended to fill in the language corresponding to the media to improve the recognition accuracy).
     */
    public String getSrcLanguage() {
        return this.SrcLanguage;
    }

    /**
     * Set Media source language value range: <li>zh: Mandarin </li> <li>en: English</li> <li>ja: Japanese </li> <li>zh-ca: Cantonese</li><font color=red>Note: </font> If it fills in an empty string or leaves this parameter blank, it will be automatically recognized (it is recommended to fill in the language corresponding to the media to improve the recognition accuracy).
     * @param SrcLanguage Media source language value range: <li>zh: Mandarin </li> <li>en: English</li> <li>ja: Japanese </li> <li>zh-ca: Cantonese</li><font color=red>Note: </font> If it fills in an empty string or leaves this parameter blank, it will be automatically recognized (it is recommended to fill in the language corresponding to the media to improve the recognition accuracy).
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get Specify subtitle name, length limit: 64 characters. This value will be displayed by the player. If not provided, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.
 
     * @return SubtitleName Specify subtitle name, length limit: 64 characters. This value will be displayed by the player. If not provided, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.

     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set Specify subtitle name, length limit: 64 characters. This value will be displayed by the player. If not provided, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.

     * @param SubtitleName Specify subtitle name, length limit: 64 characters. This value will be displayed by the player. If not provided, VOD will automatically generate it.
<font color=red>Note:</font> This field is valid only when SubtitleFormats includes vtt.

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

