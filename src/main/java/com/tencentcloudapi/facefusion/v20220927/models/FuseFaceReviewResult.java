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

public class FuseFaceReviewResult extends AbstractModel {

    /**
    * Reserved Field
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Status code; 0 indicates successful processing, other values indicate processing failure
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Description for the status code
    */
    @SerializedName("CodeDescription")
    @Expose
    private String CodeDescription;

    /**
    * Reserved Field
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Reserved Field
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Audit Details
    */
    @SerializedName("DetailSet")
    @Expose
    private FuseFaceReviewDetail [] DetailSet;

    /**
     * Get Reserved Field 
     * @return Category Reserved Field
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Reserved Field
     * @param Category Reserved Field
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Status code; 0 indicates successful processing, other values indicate processing failure 
     * @return Code Status code; 0 indicates successful processing, other values indicate processing failure
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Status code; 0 indicates successful processing, other values indicate processing failure
     * @param Code Status code; 0 indicates successful processing, other values indicate processing failure
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Description for the status code 
     * @return CodeDescription Description for the status code
     */
    public String getCodeDescription() {
        return this.CodeDescription;
    }

    /**
     * Set Description for the status code
     * @param CodeDescription Description for the status code
     */
    public void setCodeDescription(String CodeDescription) {
        this.CodeDescription = CodeDescription;
    }

    /**
     * Get Reserved Field 
     * @return Confidence Reserved Field
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Reserved Field
     * @param Confidence Reserved Field
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Reserved Field 
     * @return Suggestion Reserved Field
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Reserved Field
     * @param Suggestion Reserved Field
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Audit Details 
     * @return DetailSet Audit Details
     */
    public FuseFaceReviewDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * Set Audit Details
     * @param DetailSet Audit Details
     */
    public void setDetailSet(FuseFaceReviewDetail [] DetailSet) {
        this.DetailSet = DetailSet;
    }

    public FuseFaceReviewResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FuseFaceReviewResult(FuseFaceReviewResult source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.CodeDescription != null) {
            this.CodeDescription = new String(source.CodeDescription);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.DetailSet != null) {
            this.DetailSet = new FuseFaceReviewDetail[source.DetailSet.length];
            for (int i = 0; i < source.DetailSet.length; i++) {
                this.DetailSet[i] = new FuseFaceReviewDetail(source.DetailSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "CodeDescription", this.CodeDescription);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArrayObj(map, prefix + "DetailSet.", this.DetailSet);

    }
}

