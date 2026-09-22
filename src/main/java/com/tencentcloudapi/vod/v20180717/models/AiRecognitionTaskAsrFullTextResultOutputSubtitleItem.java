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

public class AiRecognitionTaskAsrFullTextResultOutputSubtitleItem extends AbstractModel {

    /**
    * Media asset subtitle ID, used for media asset subtitle management. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Media asset subtitle name for player display. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subtitle language.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Subtitle file format. Valid values:
<li>vtt: WebVTT subtitle file;</li>
<li>srt: SRT Subtitle File.</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Subtitle file Url.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Media asset subtitle ID, used for media asset subtitle management. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid. 
     * @return Id Media asset subtitle ID, used for media asset subtitle management. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Media asset subtitle ID, used for media asset subtitle management. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid.
     * @param Id Media asset subtitle ID, used for media asset subtitle management. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Media asset subtitle name for player display. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid. 
     * @return Name Media asset subtitle name for player display. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media asset subtitle name for player display. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid.
     * @param Name Media asset subtitle name for player display. Valid only when Format is vtt.
<font color=red>Note:</font> For tasks earlier than 2024-11-01T10:00:00Z, this field is invalid.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subtitle language. 
     * @return Language Subtitle language.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Subtitle language.
     * @param Language Subtitle language.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Subtitle file format. Valid values:
<li>vtt: WebVTT subtitle file;</li>
<li>srt: SRT Subtitle File.</li> 
     * @return Format Subtitle file format. Valid values:
<li>vtt: WebVTT subtitle file;</li>
<li>srt: SRT Subtitle File.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Subtitle file format. Valid values:
<li>vtt: WebVTT subtitle file;</li>
<li>srt: SRT Subtitle File.</li>
     * @param Format Subtitle file format. Valid values:
<li>vtt: WebVTT subtitle file;</li>
<li>srt: SRT Subtitle File.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Subtitle file Url. 
     * @return Url Subtitle file Url.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Subtitle file Url.
     * @param Url Subtitle file Url.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public AiRecognitionTaskAsrFullTextResultOutputSubtitleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskAsrFullTextResultOutputSubtitleItem(AiRecognitionTaskAsrFullTextResultOutputSubtitleItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

