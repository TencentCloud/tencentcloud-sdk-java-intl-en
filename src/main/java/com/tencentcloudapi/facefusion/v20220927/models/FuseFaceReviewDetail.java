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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FuseFaceReviewDetail extends AbstractModel {

    /**
    * Reserved field
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Label Names Matched by Content Moderation
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Confidence score of the detection label. A higher score means a greater likelihood of violations.
0-70: Suggestion = PASS
70-80: Suggestion = REVIEW
80-100: Suggestion = BLOCK
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Moderation Conclusion for Detection Scenarios
PASS: Normal
REVIEW: Suspicious
BLOCK: Violation
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get Reserved field 
     * @return Field Reserved field
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Reserved field
     * @param Field Reserved field
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Label Names Matched by Content Moderation 
     * @return Label Label Names Matched by Content Moderation
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Label Names Matched by Content Moderation
     * @param Label Label Names Matched by Content Moderation
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Confidence score of the detection label. A higher score means a greater likelihood of violations.
0-70: Suggestion = PASS
70-80: Suggestion = REVIEW
80-100: Suggestion = BLOCK 
     * @return Confidence Confidence score of the detection label. A higher score means a greater likelihood of violations.
0-70: Suggestion = PASS
70-80: Suggestion = REVIEW
80-100: Suggestion = BLOCK
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence score of the detection label. A higher score means a greater likelihood of violations.
0-70: Suggestion = PASS
70-80: Suggestion = REVIEW
80-100: Suggestion = BLOCK
     * @param Confidence Confidence score of the detection label. A higher score means a greater likelihood of violations.
0-70: Suggestion = PASS
70-80: Suggestion = REVIEW
80-100: Suggestion = BLOCK
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Moderation Conclusion for Detection Scenarios
PASS: Normal
REVIEW: Suspicious
BLOCK: Violation 
     * @return Suggestion Moderation Conclusion for Detection Scenarios
PASS: Normal
REVIEW: Suspicious
BLOCK: Violation
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Moderation Conclusion for Detection Scenarios
PASS: Normal
REVIEW: Suspicious
BLOCK: Violation
     * @param Suggestion Moderation Conclusion for Detection Scenarios
PASS: Normal
REVIEW: Suspicious
BLOCK: Violation
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    public FuseFaceReviewDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FuseFaceReviewDetail(FuseFaceReviewDetail source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

