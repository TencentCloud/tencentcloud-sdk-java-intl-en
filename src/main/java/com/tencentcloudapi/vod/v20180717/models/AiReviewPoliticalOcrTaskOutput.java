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

public class AiReviewPoliticalOcrTaskOutput extends AbstractModel{

    /**
    * Score of OCR-detected politically sensitive information in text between 0 and 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Suggestion for OCR-detected politically sensitive information in text. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * List of video segments that contain OCR-detected politically sensitive information in text.
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewOcrTextSegmentItem [] SegmentSet;

    /**
     * Get Score of OCR-detected politically sensitive information in text between 0 and 100. 
     * @return Confidence Score of OCR-detected politically sensitive information in text between 0 and 100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of OCR-detected politically sensitive information in text between 0 and 100.
     * @param Confidence Score of OCR-detected politically sensitive information in text between 0 and 100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Suggestion for OCR-detected politically sensitive information in text. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Suggestion for OCR-detected politically sensitive information in text. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for OCR-detected politically sensitive information in text. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Suggestion for OCR-detected politically sensitive information in text. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get List of video segments that contain OCR-detected politically sensitive information in text. 
     * @return SegmentSet List of video segments that contain OCR-detected politically sensitive information in text.
     */
    public MediaContentReviewOcrTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of video segments that contain OCR-detected politically sensitive information in text.
     * @param SegmentSet List of video segments that contain OCR-detected politically sensitive information in text.
     */
    public void setSegmentSet(MediaContentReviewOcrTextSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
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

