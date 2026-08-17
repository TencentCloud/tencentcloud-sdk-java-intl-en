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

public class TranslateConfigureInfo extends AbstractModel {

    /**
    * Voice translation task switch, available values:
<li>ON: Enable Intelligent Voice Translation task.</li>
<li>OFF: Disables the Intelligent Voice Translation task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Video source language.
    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
    * Target language.
    */
    @SerializedName("DestinationLanguage")
    @Expose
    private String DestinationLanguage;

    /**
    * 
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
     * Get Voice translation task switch, available values:
<li>ON: Enable Intelligent Voice Translation task.</li>
<li>OFF: Disables the Intelligent Voice Translation task.</li> 
     * @return Switch Voice translation task switch, available values:
<li>ON: Enable Intelligent Voice Translation task.</li>
<li>OFF: Disables the Intelligent Voice Translation task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Voice translation task switch, available values:
<li>ON: Enable Intelligent Voice Translation task.</li>
<li>OFF: Disables the Intelligent Voice Translation task.</li>
     * @param Switch Voice translation task switch, available values:
<li>ON: Enable Intelligent Voice Translation task.</li>
<li>OFF: Disables the Intelligent Voice Translation task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
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

    /**
     * Get Target language. 
     * @return DestinationLanguage Target language.
     */
    public String getDestinationLanguage() {
        return this.DestinationLanguage;
    }

    /**
     * Set Target language.
     * @param DestinationLanguage Target language.
     */
    public void setDestinationLanguage(String DestinationLanguage) {
        this.DestinationLanguage = DestinationLanguage;
    }

    /**
     * Get  
     * @return SubtitleFormat 
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 
     * @param SubtitleFormat 
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    public TranslateConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslateConfigureInfo(TranslateConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SourceLanguage != null) {
            this.SourceLanguage = new String(source.SourceLanguage);
        }
        if (source.DestinationLanguage != null) {
            this.DestinationLanguage = new String(source.DestinationLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "SourceLanguage", this.SourceLanguage);
        this.setParamSimple(map, prefix + "DestinationLanguage", this.DestinationLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);

    }
}

