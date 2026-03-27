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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetrievalLivenessExtraInfo extends AbstractModel {

    /**
    * Matched template types, where Common - public library; Auto - automatic clustering library; Owner - self-built template library.
    */
    @SerializedName("HitGroup")
    @Expose
    private String HitGroup;

    /**
    * Matched Similarity
    */
    @SerializedName("SimilarityScore")
    @Expose
    private Float SimilarityScore;

    /**
    * Matched Template id
    */
    @SerializedName("HitTemplate")
    @Expose
    private String HitTemplate;

    /**
     * Get Matched template types, where Common - public library; Auto - automatic clustering library; Owner - self-built template library. 
     * @return HitGroup Matched template types, where Common - public library; Auto - automatic clustering library; Owner - self-built template library.
     */
    public String getHitGroup() {
        return this.HitGroup;
    }

    /**
     * Set Matched template types, where Common - public library; Auto - automatic clustering library; Owner - self-built template library.
     * @param HitGroup Matched template types, where Common - public library; Auto - automatic clustering library; Owner - self-built template library.
     */
    public void setHitGroup(String HitGroup) {
        this.HitGroup = HitGroup;
    }

    /**
     * Get Matched Similarity 
     * @return SimilarityScore Matched Similarity
     */
    public Float getSimilarityScore() {
        return this.SimilarityScore;
    }

    /**
     * Set Matched Similarity
     * @param SimilarityScore Matched Similarity
     */
    public void setSimilarityScore(Float SimilarityScore) {
        this.SimilarityScore = SimilarityScore;
    }

    /**
     * Get Matched Template id 
     * @return HitTemplate Matched Template id
     */
    public String getHitTemplate() {
        return this.HitTemplate;
    }

    /**
     * Set Matched Template id
     * @param HitTemplate Matched Template id
     */
    public void setHitTemplate(String HitTemplate) {
        this.HitTemplate = HitTemplate;
    }

    public RetrievalLivenessExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetrievalLivenessExtraInfo(RetrievalLivenessExtraInfo source) {
        if (source.HitGroup != null) {
            this.HitGroup = new String(source.HitGroup);
        }
        if (source.SimilarityScore != null) {
            this.SimilarityScore = new Float(source.SimilarityScore);
        }
        if (source.HitTemplate != null) {
            this.HitTemplate = new String(source.HitTemplate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitGroup", this.HitGroup);
        this.setParamSimple(map, prefix + "SimilarityScore", this.SimilarityScore);
        this.setParamSimple(map, prefix + "HitTemplate", this.HitTemplate);

    }
}

