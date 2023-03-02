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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReviewInfo extends AbstractModel{

    /**
    * The moderation template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * The moderation type in the format of `Form.Label`. This parameter is valid if `Suggestion` is `review` or `block`.
`Form` indicates the type of inappropriate content detected. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
<li>`ASR` (speech)</li>
<li>`Voice`</li>
`Label` indicates the violation label. Valid values:
<li>`Porn` (pornographic content)</li>
<li>`Terror` (terrorist content)</li>
<li>`Polity` (politically sensitive content)</li>
<li>`Ad` (advertisement)</li>
<li>`Illegal` (illegal content)</li>
<li>`Abuse`</li>
<li>`Moan`</li>
    */
    @SerializedName("TypeSet")
    @Expose
    private String [] TypeSet;

    /**
    * The moderation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ReviewTime")
    @Expose
    private String ReviewTime;

    /**
     * Get The moderation template ID. 
     * @return Definition The moderation template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set The moderation template ID.
     * @param Definition The moderation template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li> 
     * @return Suggestion The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion The suggestion. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get The moderation type in the format of `Form.Label`. This parameter is valid if `Suggestion` is `review` or `block`.
`Form` indicates the type of inappropriate content detected. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
<li>`ASR` (speech)</li>
<li>`Voice`</li>
`Label` indicates the violation label. Valid values:
<li>`Porn` (pornographic content)</li>
<li>`Terror` (terrorist content)</li>
<li>`Polity` (politically sensitive content)</li>
<li>`Ad` (advertisement)</li>
<li>`Illegal` (illegal content)</li>
<li>`Abuse`</li>
<li>`Moan`</li> 
     * @return TypeSet The moderation type in the format of `Form.Label`. This parameter is valid if `Suggestion` is `review` or `block`.
`Form` indicates the type of inappropriate content detected. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
<li>`ASR` (speech)</li>
<li>`Voice`</li>
`Label` indicates the violation label. Valid values:
<li>`Porn` (pornographic content)</li>
<li>`Terror` (terrorist content)</li>
<li>`Polity` (politically sensitive content)</li>
<li>`Ad` (advertisement)</li>
<li>`Illegal` (illegal content)</li>
<li>`Abuse`</li>
<li>`Moan`</li>
     */
    public String [] getTypeSet() {
        return this.TypeSet;
    }

    /**
     * Set The moderation type in the format of `Form.Label`. This parameter is valid if `Suggestion` is `review` or `block`.
`Form` indicates the type of inappropriate content detected. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
<li>`ASR` (speech)</li>
<li>`Voice`</li>
`Label` indicates the violation label. Valid values:
<li>`Porn` (pornographic content)</li>
<li>`Terror` (terrorist content)</li>
<li>`Polity` (politically sensitive content)</li>
<li>`Ad` (advertisement)</li>
<li>`Illegal` (illegal content)</li>
<li>`Abuse`</li>
<li>`Moan`</li>
     * @param TypeSet The moderation type in the format of `Form.Label`. This parameter is valid if `Suggestion` is `review` or `block`.
`Form` indicates the type of inappropriate content detected. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
<li>`ASR` (speech)</li>
<li>`Voice`</li>
`Label` indicates the violation label. Valid values:
<li>`Porn` (pornographic content)</li>
<li>`Terror` (terrorist content)</li>
<li>`Polity` (politically sensitive content)</li>
<li>`Ad` (advertisement)</li>
<li>`Illegal` (illegal content)</li>
<li>`Abuse`</li>
<li>`Moan`</li>
     */
    public void setTypeSet(String [] TypeSet) {
        this.TypeSet = TypeSet;
    }

    /**
     * Get The moderation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ReviewTime The moderation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getReviewTime() {
        return this.ReviewTime;
    }

    /**
     * Set The moderation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ReviewTime The moderation time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
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

