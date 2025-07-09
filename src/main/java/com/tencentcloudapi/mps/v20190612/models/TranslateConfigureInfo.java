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
    * Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("SourceLanguage")
    @Expose
    private String SourceLanguage;

    /**
    * 
    */
    @SerializedName("DestinationLanguage")
    @Expose
    private String DestinationLanguage;

    /**
    * Generated subtitle file format. Leaving it as an empty string means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
     * Get Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li> 
     * @return Switch Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li>
     * @param Switch Switch of a full speech recognition task. Valid values:
<li>ON: Enables an intelligent full speech recognition task;</li>
<li>OFF: Disables an intelligent full speech recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get  
     * @return SourceLanguage 
     */
    public String getSourceLanguage() {
        return this.SourceLanguage;
    }

    /**
     * Set 
     * @param SourceLanguage 
     */
    public void setSourceLanguage(String SourceLanguage) {
        this.SourceLanguage = SourceLanguage;
    }

    /**
     * Get  
     * @return DestinationLanguage 
     */
    public String getDestinationLanguage() {
        return this.DestinationLanguage;
    }

    /**
     * Set 
     * @param DestinationLanguage 
     */
    public void setDestinationLanguage(String DestinationLanguage) {
        this.DestinationLanguage = DestinationLanguage;
    }

    /**
     * Get Generated subtitle file format. Leaving it as an empty string means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubtitleFormat Generated subtitle file format. Leaving it as an empty string means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set Generated subtitle file format. Leaving it as an empty string means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>

Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubtitleFormat Generated subtitle file format. Leaving it as an empty string means no subtitle file will be generated. Valid value:
<li>vtt: Generate a WebVTT subtitle file.</li>

Note: This field may return null, indicating that no valid values can be obtained.
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

