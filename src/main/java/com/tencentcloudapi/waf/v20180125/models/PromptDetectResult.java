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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromptDetectResult extends AbstractModel {

    /**
    * <p>Detection result</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>Confidence</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * <p>Detection category</p>
    */
    @SerializedName("Category")
    @Expose
    private String [] Category;

    /**
     * Get <p>Detection result</p> 
     * @return Result <p>Detection result</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>Detection result</p>
     * @param Result <p>Detection result</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>Confidence</p> 
     * @return Confidence <p>Confidence</p>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Confidence</p>
     * @param Confidence <p>Confidence</p>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>Detection category</p> 
     * @return Category <p>Detection category</p>
     */
    public String [] getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Detection category</p>
     * @param Category <p>Detection category</p>
     */
    public void setCategory(String [] Category) {
        this.Category = Category;
    }

    public PromptDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromptDetectResult(PromptDetectResult source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Category != null) {
            this.Category = new String[source.Category.length];
            for (int i = 0; i < source.Category.length; i++) {
                this.Category[i] = new String(source.Category[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "Category.", this.Category);

    }
}

