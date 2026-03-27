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
    * Reserved Field
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Tag name matched in audit
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Confidence score corresponding to the identified label. A higher score indicates a higher probability of violation.

0 to 70: Suggestion is PASS;

70 to 80: Suggestion is REVIEW;

80 to 100: Suggestion is BLOCK.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Audit conclusion for identified scenarios:

PASS: Normal

REVIEW: Suspected

BLOCK: Violation
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get Reserved Field 
     * @return Field Reserved Field
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Reserved Field
     * @param Field Reserved Field
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Tag name matched in audit 
     * @return Label Tag name matched in audit
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag name matched in audit
     * @param Label Tag name matched in audit
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Confidence score corresponding to the identified label. A higher score indicates a higher probability of violation.

0 to 70: Suggestion is PASS;

70 to 80: Suggestion is REVIEW;

80 to 100: Suggestion is BLOCK. 
     * @return Confidence Confidence score corresponding to the identified label. A higher score indicates a higher probability of violation.

0 to 70: Suggestion is PASS;

70 to 80: Suggestion is REVIEW;

80 to 100: Suggestion is BLOCK.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence score corresponding to the identified label. A higher score indicates a higher probability of violation.

0 to 70: Suggestion is PASS;

70 to 80: Suggestion is REVIEW;

80 to 100: Suggestion is BLOCK.
     * @param Confidence Confidence score corresponding to the identified label. A higher score indicates a higher probability of violation.

0 to 70: Suggestion is PASS;

70 to 80: Suggestion is REVIEW;

80 to 100: Suggestion is BLOCK.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Audit conclusion for identified scenarios:

PASS: Normal

REVIEW: Suspected

BLOCK: Violation 
     * @return Suggestion Audit conclusion for identified scenarios:

PASS: Normal

REVIEW: Suspected

BLOCK: Violation
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Audit conclusion for identified scenarios:

PASS: Normal

REVIEW: Suspected

BLOCK: Violation
     * @param Suggestion Audit conclusion for identified scenarios:

PASS: Normal

REVIEW: Suspected

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

