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

public class SubtitleFormatsOperation extends AbstractModel {

    /**
    * The modification type. Valid values:
<li>add: Add the formats specified by `Formats`.</li>
<li>delete: Delete the formats specified by `Formats`.<l/i>
<li>reset: Reset the format list to formats specified by `Formats`.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The subtitle format list. Valid values:
<li>vtt</li>
<li>srt</li>
    */
    @SerializedName("Formats")
    @Expose
    private String [] Formats;

    /**
     * Get The modification type. Valid values:
<li>add: Add the formats specified by `Formats`.</li>
<li>delete: Delete the formats specified by `Formats`.<l/i>
<li>reset: Reset the format list to formats specified by `Formats`.</li> 
     * @return Type The modification type. Valid values:
<li>add: Add the formats specified by `Formats`.</li>
<li>delete: Delete the formats specified by `Formats`.<l/i>
<li>reset: Reset the format list to formats specified by `Formats`.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The modification type. Valid values:
<li>add: Add the formats specified by `Formats`.</li>
<li>delete: Delete the formats specified by `Formats`.<l/i>
<li>reset: Reset the format list to formats specified by `Formats`.</li>
     * @param Type The modification type. Valid values:
<li>add: Add the formats specified by `Formats`.</li>
<li>delete: Delete the formats specified by `Formats`.<l/i>
<li>reset: Reset the format list to formats specified by `Formats`.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The subtitle format list. Valid values:
<li>vtt</li>
<li>srt</li> 
     * @return Formats The subtitle format list. Valid values:
<li>vtt</li>
<li>srt</li>
     */
    public String [] getFormats() {
        return this.Formats;
    }

    /**
     * Set The subtitle format list. Valid values:
<li>vtt</li>
<li>srt</li>
     * @param Formats The subtitle format list. Valid values:
<li>vtt</li>
<li>srt</li>
     */
    public void setFormats(String [] Formats) {
        this.Formats = Formats;
    }

    public SubtitleFormatsOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleFormatsOperation(SubtitleFormatsOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Formats != null) {
            this.Formats = new String[source.Formats.length];
            for (int i = 0; i < source.Formats.length; i++) {
                this.Formats[i] = new String(source.Formats[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Formats.", this.Formats);

    }
}

