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

public class MediaSubtitleItem extends AbstractModel {

    /**
    * Unique subtitle ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Subtitle name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subtitle language. Common values:
<li>`zh`: Chinese</li>
<li>`en`: English</li>
<li>`ja`: Japanese</li>
<li>`ko`: Korean</li>
<li>`vi`: Vietnamese</li>
<li>`ms`: Malay</li>
<li>`th`: Thai</li>
<li>`pt`: Portuguese</li>
<li>`tr`: Turkish</li>
<li>`ar`: Arabic</li>
<li>`es`: Spanish</li>
<li>`hi`: Hindi</li>
<li>`fr`: French</li>For other valid values, see [RFC 5646](https://tools.ietf.org/html/rfc5646).
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Subtitle format. Valid value:
<li>vtt</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Subtitle URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Subtitle source, values:
<li>UserUploaded: user uploaded;</li>
<li>AIRecognition: AI recognition, generated through asr full text recognition or voice translation.</li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get Unique subtitle ID 
     * @return Id Unique subtitle ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique subtitle ID
     * @param Id Unique subtitle ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Subtitle name 
     * @return Name Subtitle name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Subtitle name
     * @param Name Subtitle name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subtitle language. Common values:
<li>`zh`: Chinese</li>
<li>`en`: English</li>
<li>`ja`: Japanese</li>
<li>`ko`: Korean</li>
<li>`vi`: Vietnamese</li>
<li>`ms`: Malay</li>
<li>`th`: Thai</li>
<li>`pt`: Portuguese</li>
<li>`tr`: Turkish</li>
<li>`ar`: Arabic</li>
<li>`es`: Spanish</li>
<li>`hi`: Hindi</li>
<li>`fr`: French</li>For other valid values, see [RFC 5646](https://tools.ietf.org/html/rfc5646). 
     * @return Language Subtitle language. Common values:
<li>`zh`: Chinese</li>
<li>`en`: English</li>
<li>`ja`: Japanese</li>
<li>`ko`: Korean</li>
<li>`vi`: Vietnamese</li>
<li>`ms`: Malay</li>
<li>`th`: Thai</li>
<li>`pt`: Portuguese</li>
<li>`tr`: Turkish</li>
<li>`ar`: Arabic</li>
<li>`es`: Spanish</li>
<li>`hi`: Hindi</li>
<li>`fr`: French</li>For other valid values, see [RFC 5646](https://tools.ietf.org/html/rfc5646).
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Subtitle language. Common values:
<li>`zh`: Chinese</li>
<li>`en`: English</li>
<li>`ja`: Japanese</li>
<li>`ko`: Korean</li>
<li>`vi`: Vietnamese</li>
<li>`ms`: Malay</li>
<li>`th`: Thai</li>
<li>`pt`: Portuguese</li>
<li>`tr`: Turkish</li>
<li>`ar`: Arabic</li>
<li>`es`: Spanish</li>
<li>`hi`: Hindi</li>
<li>`fr`: French</li>For other valid values, see [RFC 5646](https://tools.ietf.org/html/rfc5646).
     * @param Language Subtitle language. Common values:
<li>`zh`: Chinese</li>
<li>`en`: English</li>
<li>`ja`: Japanese</li>
<li>`ko`: Korean</li>
<li>`vi`: Vietnamese</li>
<li>`ms`: Malay</li>
<li>`th`: Thai</li>
<li>`pt`: Portuguese</li>
<li>`tr`: Turkish</li>
<li>`ar`: Arabic</li>
<li>`es`: Spanish</li>
<li>`hi`: Hindi</li>
<li>`fr`: French</li>For other valid values, see [RFC 5646](https://tools.ietf.org/html/rfc5646).
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Subtitle format. Valid value:
<li>vtt</li> 
     * @return Format Subtitle format. Valid value:
<li>vtt</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Subtitle format. Valid value:
<li>vtt</li>
     * @param Format Subtitle format. Valid value:
<li>vtt</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Subtitle URL 
     * @return Url Subtitle URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Subtitle URL
     * @param Url Subtitle URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Subtitle source, values:
<li>UserUploaded: user uploaded;</li>
<li>AIRecognition: AI recognition, generated through asr full text recognition or voice translation.</li> 
     * @return Source Subtitle source, values:
<li>UserUploaded: user uploaded;</li>
<li>AIRecognition: AI recognition, generated through asr full text recognition or voice translation.</li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Subtitle source, values:
<li>UserUploaded: user uploaded;</li>
<li>AIRecognition: AI recognition, generated through asr full text recognition or voice translation.</li>
     * @param Source Subtitle source, values:
<li>UserUploaded: user uploaded;</li>
<li>AIRecognition: AI recognition, generated through asr full text recognition or voice translation.</li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public MediaSubtitleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSubtitleItem(MediaSubtitleItem source) {
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
        if (source.Source != null) {
            this.Source = new String(source.Source);
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
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

