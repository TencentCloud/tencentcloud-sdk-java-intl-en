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

public class AsrFullTextConfigureInfo extends AbstractModel {

    /**
    * Voice full-text recognition task switch, available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disables the intelligent voice full-text recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Generated subtitle file format. Leaving it as an empty string or not filling it in means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * Video source language.
    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
     * Get Voice full-text recognition task switch, available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disables the intelligent voice full-text recognition task.</li> 
     * @return Switch Voice full-text recognition task switch, available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disables the intelligent voice full-text recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Voice full-text recognition task switch, available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disables the intelligent voice full-text recognition task.</li>
     * @param Switch Voice full-text recognition task switch, available values:
<li>ON: Enable intelligent voice full-text recognition task.</li>
<li>OFF: Disables the intelligent voice full-text recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Generated subtitle file format. Leaving it as an empty string or not filling it in means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li> 
     * @return SubtitleFormat Generated subtitle file format. Leaving it as an empty string or not filling it in means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Generated subtitle file format. Leaving it as an empty string or not filling it in means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
     * @param SubtitleFormat Generated subtitle file format. Leaving it as an empty string or not filling it in means no subtitle file will be generated. Available values:
<li>vtt: Generate a WebVTT subtitle file.</li>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get Video source language. 
     * @return SourceLanguage Video source language.
     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * Set Video source language.
     * @param SourceLanguage Video source language.
     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
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
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.SourceLanguage != null) {
            this.SourceLanguage = new String(source.SourceLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SourceLanguage", this.SourceLanguage);

    }
}

