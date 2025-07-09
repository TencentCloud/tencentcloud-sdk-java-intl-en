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

public class ContentReviewOcrResult extends AbstractModel {

    /**
    * The confidence score for the OCR-based moderation result. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The suggestion for handling the suspicious content detected based on OCR. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * The list of suspicious keywords detected based on OCR.
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
    * The coordinates (pixel) of the top-left and bottom-right corners of the frame where a suspicious keyword appears. Format: [x1, y1, x2, y2].
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get The confidence score for the OCR-based moderation result. Value range: 0-100. 
     * @return Confidence The confidence score for the OCR-based moderation result. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score for the OCR-based moderation result. Value range: 0-100.
     * @param Confidence The confidence score for the OCR-based moderation result. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The suggestion for handling the suspicious content detected based on OCR. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li> 
     * @return Suggestion The suggestion for handling the suspicious content detected based on OCR. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set The suggestion for handling the suspicious content detected based on OCR. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li>
     * @param Suggestion The suggestion for handling the suspicious content detected based on OCR. Valid values:
<li>pass/li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get The list of suspicious keywords detected based on OCR. 
     * @return KeywordSet The list of suspicious keywords detected based on OCR.
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set The list of suspicious keywords detected based on OCR.
     * @param KeywordSet The list of suspicious keywords detected based on OCR.
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    /**
     * Get The coordinates (pixel) of the top-left and bottom-right corners of the frame where a suspicious keyword appears. Format: [x1, y1, x2, y2]. 
     * @return AreaCoordSet The coordinates (pixel) of the top-left and bottom-right corners of the frame where a suspicious keyword appears. Format: [x1, y1, x2, y2].
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set The coordinates (pixel) of the top-left and bottom-right corners of the frame where a suspicious keyword appears. Format: [x1, y1, x2, y2].
     * @param AreaCoordSet The coordinates (pixel) of the top-left and bottom-right corners of the frame where a suspicious keyword appears. Format: [x1, y1, x2, y2].
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    public ContentReviewOcrResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReviewOcrResult(ContentReviewOcrResult source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.KeywordSet != null) {
            this.KeywordSet = new String[source.KeywordSet.length];
            for (int i = 0; i < source.KeywordSet.length; i++) {
                this.KeywordSet[i] = new String(source.KeywordSet[i]);
            }
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}

