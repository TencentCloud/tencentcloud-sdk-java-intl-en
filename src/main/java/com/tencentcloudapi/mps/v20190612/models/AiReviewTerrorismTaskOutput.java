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

public class AiReviewTerrorismTaskOutput extends AbstractModel {

    /**
    * Video sensitive content score, ranging from 0 to 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Result Suggestions for sensitive content, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Video sensitive content detection result tag, permissible range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militant.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
<li>scenario: Sensitive content.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * List of video segments suspected of containing sensitive content.
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewSegmentItem [] SegmentSet;

    /**
     * Get Video sensitive content score, ranging from 0 to 100. 
     * @return Confidence Video sensitive content score, ranging from 0 to 100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Video sensitive content score, ranging from 0 to 100.
     * @param Confidence Video sensitive content score, ranging from 0 to 100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Result Suggestions for sensitive content, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Result Suggestions for sensitive content, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result Suggestions for sensitive content, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Result Suggestions for sensitive content, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Video sensitive content detection result tag, permissible range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militant.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
<li>scenario: Sensitive content.</li> 
     * @return Label Video sensitive content detection result tag, permissible range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militant.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
<li>scenario: Sensitive content.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Video sensitive content detection result tag, permissible range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militant.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
<li>scenario: Sensitive content.</li>
     * @param Label Video sensitive content detection result tag, permissible range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militant.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
<li>scenario: Sensitive content.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get List of video segments suspected of containing sensitive content. 
     * @return SegmentSet List of video segments suspected of containing sensitive content.
     */
    public MediaContentReviewSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of video segments suspected of containing sensitive content.
     * @param SegmentSet List of video segments suspected of containing sensitive content.
     */
    public void setSegmentSet(MediaContentReviewSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    public AiReviewTerrorismTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiReviewTerrorismTaskOutput(AiReviewTerrorismTaskOutput source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new MediaContentReviewSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new MediaContentReviewSegmentItem(source.SegmentSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

