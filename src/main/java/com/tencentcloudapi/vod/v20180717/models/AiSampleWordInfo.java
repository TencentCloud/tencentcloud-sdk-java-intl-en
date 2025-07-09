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

public class AiSampleWordInfo extends AbstractModel {

    /**
    * Keyword. Length limit: 20 characters.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Keyword tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get Keyword. Length limit: 20 characters. 
     * @return Keyword Keyword. Length limit: 20 characters.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword. Length limit: 20 characters.
     * @param Keyword Keyword. Length limit: 20 characters.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Keyword tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li> 
     * @return Tags Keyword tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Keyword tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li>
     * @param Tags Keyword tag
<li>Array length limit: 20 tags;</li>
<li>Tag length limit: 128 characters.</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public AiSampleWordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSampleWordInfo(AiSampleWordInfo source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

