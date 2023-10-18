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
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

