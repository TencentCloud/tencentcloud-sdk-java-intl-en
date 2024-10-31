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

public class AiRecognitionTaskAsrFullTextResultOutputSubtitleItem extends AbstractModel {

    /**
    * Media asset subtitle ID, used for media asset subtitle management, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Media asset subtitle name, used for player display, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subtitle Language.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * The format of the subtitle files. Valid values:
<li>vtt</li>
<li>srt</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * The URL of a subtitle file.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Media asset subtitle ID, used for media asset subtitle management, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid. 
     * @return Id Media asset subtitle ID, used for media asset subtitle management, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Media asset subtitle ID, used for media asset subtitle management, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid.
     * @param Id Media asset subtitle ID, used for media asset subtitle management, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Media asset subtitle name, used for player display, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid. 
     * @return Name Media asset subtitle name, used for player display, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media asset subtitle name, used for player display, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid.
     * @param Name Media asset subtitle name, used for player display, only valid when Format is vtt.
<font color=red>Note:</font> Tasks before 2024-11-01T10:00:00Z return this field as invalid.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subtitle Language. 
     * @return Language Subtitle Language.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Subtitle Language.
     * @param Language Subtitle Language.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get The format of the subtitle files. Valid values:
<li>vtt</li>
<li>srt</li> 
     * @return Format The format of the subtitle files. Valid values:
<li>vtt</li>
<li>srt</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set The format of the subtitle files. Valid values:
<li>vtt</li>
<li>srt</li>
     * @param Format The format of the subtitle files. Valid values:
<li>vtt</li>
<li>srt</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get The URL of a subtitle file. 
     * @return Url The URL of a subtitle file.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL of a subtitle file.
     * @param Url The URL of a subtitle file.
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

