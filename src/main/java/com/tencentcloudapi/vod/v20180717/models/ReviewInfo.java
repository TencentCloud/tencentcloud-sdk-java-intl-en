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

public class ReviewInfo extends AbstractModel {

    /**
    * Content review template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Review result suggestion. Valid values:
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Moderation type. Valid when `Suggestion` is `review` or `block`. Format: `Form.Label`.
Form refers to prohibited forms. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
Label indicates prohibited tags. Value range:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
    */
    @SerializedName("TypeSet")
    @Expose
    private String [] TypeSet;

    /**
    * Moderation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ReviewTime")
    @Expose
    private String ReviewTime;

    /**
     * Get Content review template ID. 
     * @return Definition Content review template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Content review template ID.
     * @param Definition Content review template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Review result suggestion. Valid values:
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li> 
     * @return Suggestion Review result suggestion. Valid values:
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Review result suggestion. Valid values:
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li>
     * @param Suggestion Review result suggestion. Valid values:
<li>pass: it is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Moderation type. Valid when `Suggestion` is `review` or `block`. Format: `Form.Label`.
Form refers to prohibited forms. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
Label indicates prohibited tags. Value range:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li> 
     * @return TypeSet Moderation type. Valid when `Suggestion` is `review` or `block`. Format: `Form.Label`.
Form refers to prohibited forms. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
Label indicates prohibited tags. Value range:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
     */
    public String [] getTypeSet() {
        return this.TypeSet;
    }

    /**
     * Set Moderation type. Valid when `Suggestion` is `review` or `block`. Format: `Form.Label`.
Form refers to prohibited forms. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
Label indicates prohibited tags. Value range:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
     * @param TypeSet Moderation type. Valid when `Suggestion` is `review` or `block`. Format: `Form.Label`.
Form refers to prohibited forms. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
Label indicates prohibited tags. Value range:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
     */
    public void setTypeSet(String [] TypeSet) {
        this.TypeSet = TypeSet;
    }

    /**
     * Get Moderation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ReviewTime Moderation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getReviewTime() {
        return this.ReviewTime;
    }

    /**
     * Set Moderation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ReviewTime Moderation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setReviewTime(String ReviewTime) {
        this.ReviewTime = ReviewTime;
    }

    public ReviewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewInfo(ReviewInfo source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.TypeSet != null) {
            this.TypeSet = new String[source.TypeSet.length];
            for (int i = 0; i < source.TypeSet.length; i++) {
                this.TypeSet[i] = new String(source.TypeSet[i]);
            }
        }
        if (source.ReviewTime != null) {
            this.ReviewTime = new String(source.ReviewTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "TypeSet.", this.TypeSet);
        this.setParamSimple(map, prefix + "ReviewTime", this.ReviewTime);

    }
}

