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

public class ReviewInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 
    */
    @SerializedName("TypeSet")
    @Expose
    private String [] TypeSet;

    /**
    * 
    */
    @SerializedName("ReviewTime")
    @Expose
    private String ReviewTime;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * @return TypeSet 
     */
    public String [] getTypeSet() {
        return this.TypeSet;
    }

    /**
     * Set 
     * @param TypeSet 
     */
    public void setTypeSet(String [] TypeSet) {
        this.TypeSet = TypeSet;
    }

    /**
     * Get  
     * @return ReviewTime 
     */
    public String getReviewTime() {
        return this.ReviewTime;
    }

    /**
     * Set 
     * @param ReviewTime 
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

