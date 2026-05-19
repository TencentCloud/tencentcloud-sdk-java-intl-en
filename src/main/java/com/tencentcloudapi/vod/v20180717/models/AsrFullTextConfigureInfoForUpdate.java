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

public class AsrFullTextConfigureInfoForUpdate extends AbstractModel {

    /**
    * Voice full-text recognition task switch. Available values:
<li>ON: enable intelligent voice full-text recognition task.</li>
<li>OFF: disable intelligent voice full-text recognition task</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Subtitle format list operation information.
    */
    @SerializedName("SubtitleFormatsOperation")
    @Expose
    private SubtitleFormatsOperation SubtitleFormatsOperation;

    /**
    * Generated subtitle file format. <font color='red'>Fill in an empty string</font> to indicate no subtitle file generation. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormatsOperation.</font>
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
    */
    @SerializedName("SrcLanguage")
    @Expose
    private String SrcLanguage;

    /**
    * Specify subtitle name. Length limit: 64 characters. This value will be used for player display.
    */
    @SerializedName("SubtitleName")
    @Expose
    private String SubtitleName;

    /**
     * Get Voice full-text recognition task switch. Available values:
<li>ON: enable intelligent voice full-text recognition task.</li>
<li>OFF: disable intelligent voice full-text recognition task</li> 
     * @return Switch Voice full-text recognition task switch. Available values:
<li>ON: enable intelligent voice full-text recognition task.</li>
<li>OFF: disable intelligent voice full-text recognition task</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Voice full-text recognition task switch. Available values:
<li>ON: enable intelligent voice full-text recognition task.</li>
<li>OFF: disable intelligent voice full-text recognition task</li>
     * @param Switch Voice full-text recognition task switch. Available values:
<li>ON: enable intelligent voice full-text recognition task.</li>
<li>OFF: disable intelligent voice full-text recognition task</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
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
     * Get Generated subtitle file format. <font color='red'>Fill in an empty string</font> to indicate no subtitle file generation. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormatsOperation.</font> 
     * @return SubtitleFormat Generated subtitle file format. <font color='red'>Fill in an empty string</font> to indicate no subtitle file generation. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormatsOperation.</font>
     * @deprecated
     */
    @Deprecated
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Generated subtitle file format. <font color='red'>Fill in an empty string</font> to indicate no subtitle file generation. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormatsOperation.</font>
     * @param SubtitleFormat Generated subtitle file format. <font color='red'>Fill in an empty string</font> to indicate no subtitle file generation. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
<li>srt: Generate SRT subtitle file.</li>
<font color='red'>Note: This field is deprecated. Recommend using SubtitleFormatsOperation.</font>
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
     * @return SrcLanguage Media source language. Valid values:
<li>zh: Mandarin;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>zh-ca: Cantonese.</li>
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
     * @param SrcLanguage Media source language. Valid values:
<li>zh: Mandarin;</li>
<li>en: English;</li>
<li>ja: Japanese;</li>
<li>zh-ca: Cantonese.</li>
     */
    public void setSrcLanguage(String SrcLanguage) {
        this.SrcLanguage = SrcLanguage;
    }

    /**
     * Get Specify subtitle name. Length limit: 64 characters. This value will be used for player display. 
     * @return SubtitleName Specify subtitle name. Length limit: 64 characters. This value will be used for player display.
     */
    public String getSubtitleName() {
        return this.SubtitleName;
    }

    /**
     * Set Specify subtitle name. Length limit: 64 characters. This value will be used for player display.
     * @param SubtitleName Specify subtitle name. Length limit: 64 characters. This value will be used for player display.
     */
    public void setSubtitleName(String SubtitleName) {
        this.SubtitleName = SubtitleName;
    }

    public AsrFullTextConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrFullTextConfigureInfoForUpdate(AsrFullTextConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SubtitleFormatsOperation != null) {
            this.SubtitleFormatsOperation = new SubtitleFormatsOperation(source.SubtitleFormatsOperation);
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
        this.setParamObj(map, prefix + "SubtitleFormatsOperation.", this.SubtitleFormatsOperation);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SrcLanguage", this.SrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleName", this.SubtitleName);

    }
}

