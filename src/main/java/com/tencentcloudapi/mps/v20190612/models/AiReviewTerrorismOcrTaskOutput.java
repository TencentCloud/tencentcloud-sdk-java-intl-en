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

public class AiReviewTerrorismOcrTaskOutput extends AbstractModel {

    /**
    * Ocr text sensitive content score, ranging from 0 to III.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Ocr text sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * List of video segments suspected of containing sensitive content in Ocr text.
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewOcrTextSegmentItem [] SegmentSet;

    /**
     * Get Ocr text sensitive content score, ranging from 0 to III. 
     * @return Confidence Ocr text sensitive content score, ranging from 0 to III.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Ocr text sensitive content score, ranging from 0 to III.
     * @param Confidence Ocr text sensitive content score, ranging from 0 to III.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Ocr text sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Ocr text sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Ocr text sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Ocr text sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get List of video segments suspected of containing sensitive content in Ocr text. 
     * @return SegmentSet List of video segments suspected of containing sensitive content in Ocr text.
     */
    public MediaContentReviewOcrTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of video segments suspected of containing sensitive content in Ocr text.
     * @param SegmentSet List of video segments suspected of containing sensitive content in Ocr text.
     */
    public void setSegmentSet(MediaContentReviewOcrTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    public AiReviewTerrorismOcrTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiReviewTerrorismOcrTaskOutput(AiReviewTerrorismOcrTaskOutput source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new MediaContentReviewOcrTextSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new MediaContentReviewOcrTextSegmentItem(source.SegmentSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

