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

public class MediaSubtitleInput extends AbstractModel {

    /**
    * Subtitle name. Length limit: 64 characters
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
    * Subtitle content, which is [Base64-encoded](https://tools.ietf.org/html/rfc4648) strings
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * The subtitle ID. It can be up to 16 characters long, can contain letters, numbers, underscores (_), and hyphens (-), and cannot be identical to an existing subtitle ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Subtitle name. Length limit: 64 characters 
     * @return Name Subtitle name. Length limit: 64 characters
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Subtitle name. Length limit: 64 characters
     * @param Name Subtitle name. Length limit: 64 characters
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
     * Get Subtitle content, which is [Base64-encoded](https://tools.ietf.org/html/rfc4648) strings 
     * @return Content Subtitle content, which is [Base64-encoded](https://tools.ietf.org/html/rfc4648) strings
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Subtitle content, which is [Base64-encoded](https://tools.ietf.org/html/rfc4648) strings
     * @param Content Subtitle content, which is [Base64-encoded](https://tools.ietf.org/html/rfc4648) strings
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get The subtitle ID. It can be up to 16 characters long, can contain letters, numbers, underscores (_), and hyphens (-), and cannot be identical to an existing subtitle ID. 
     * @return Id The subtitle ID. It can be up to 16 characters long, can contain letters, numbers, underscores (_), and hyphens (-), and cannot be identical to an existing subtitle ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set The subtitle ID. It can be up to 16 characters long, can contain letters, numbers, underscores (_), and hyphens (-), and cannot be identical to an existing subtitle ID.
     * @param Id The subtitle ID. It can be up to 16 characters long, can contain letters, numbers, underscores (_), and hyphens (-), and cannot be identical to an existing subtitle ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public MediaSubtitleInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSubtitleInput(MediaSubtitleInput source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

