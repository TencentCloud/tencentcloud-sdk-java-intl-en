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
package com.tencentcloudapi.facefusion.v20220927.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FuseFaceReviewResult extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 
    */
    @SerializedName("CodeDescription")
    @Expose
    private String CodeDescription;

    /**
    * 
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 
    */
    @SerializedName("DetailSet")
    @Expose
    private FuseFaceReviewDetail [] DetailSet;

    /**
     * Get  
     * @return Category 
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 
     * @param Category 
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get  
     * @return Code 
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 
     * @param Code 
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get  
     * @return CodeDescription 
     */
    public String getCodeDescription() {
        return this.CodeDescription;
    }

    /**
     * Set 
     * @param CodeDescription 
     */
    public void setCodeDescription(String CodeDescription) {
        this.CodeDescription = CodeDescription;
    }

    /**
     * Get  
     * @return Confidence 
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 
     * @param Confidence 
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get  
     * @return Suggestion 
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 
     * @param Suggestion 
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get  
     * @return DetailSet 
     */
    public FuseFaceReviewDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * Set 
     * @param DetailSet 
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

