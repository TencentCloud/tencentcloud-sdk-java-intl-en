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
    * <p>Hit template type, among them Common-public library; Auto-Auto Clustering Library; Owner-custom template library</p>
    */
    @SerializedName("HitGroup")
    @Expose
    private String HitGroup;

    /**
    * <p>Similarity between the request image and the attack template hit. The similarity value ranges from 0 to 2. The smaller the value, the higher the probability of hitting the attack template. The default threshold is 0.6. When the SimilarityScore is ≥0.6, the judgment is as normal. When the SimilarityScore is <0.6, the judgment is an attack.</p>
    */
    @SerializedName("SimilarityScore")
    @Expose
    private Float SimilarityScore;

    /**
    * <p>Template id of the cache hit</p>
    */
    @SerializedName("HitTemplate")
    @Expose
    private String HitTemplate;

    /**
     * Get <p>Hit template type, among them Common-public library; Auto-Auto Clustering Library; Owner-custom template library</p> 
     * @return HitGroup <p>Hit template type, among them Common-public library; Auto-Auto Clustering Library; Owner-custom template library</p>
     */
    public String getHitGroup() {
        return this.HitGroup;
    }

    /**
     * Set <p>Hit template type, among them Common-public library; Auto-Auto Clustering Library; Owner-custom template library</p>
     * @param HitGroup <p>Hit template type, among them Common-public library; Auto-Auto Clustering Library; Owner-custom template library</p>
     */
    public void setHitGroup(String HitGroup) {
        this.HitGroup = HitGroup;
    }

    /**
     * Get <p>Similarity between the request image and the attack template hit. The similarity value ranges from 0 to 2. The smaller the value, the higher the probability of hitting the attack template. The default threshold is 0.6. When the SimilarityScore is ≥0.6, the judgment is as normal. When the SimilarityScore is <0.6, the judgment is an attack.</p> 
     * @return SimilarityScore <p>Similarity between the request image and the attack template hit. The similarity value ranges from 0 to 2. The smaller the value, the higher the probability of hitting the attack template. The default threshold is 0.6. When the SimilarityScore is ≥0.6, the judgment is as normal. When the SimilarityScore is <0.6, the judgment is an attack.</p>
     */
    public Float getSimilarityScore() {
        return this.SimilarityScore;
    }

    /**
     * Set <p>Similarity between the request image and the attack template hit. The similarity value ranges from 0 to 2. The smaller the value, the higher the probability of hitting the attack template. The default threshold is 0.6. When the SimilarityScore is ≥0.6, the judgment is as normal. When the SimilarityScore is <0.6, the judgment is an attack.</p>
     * @param SimilarityScore <p>Similarity between the request image and the attack template hit. The similarity value ranges from 0 to 2. The smaller the value, the higher the probability of hitting the attack template. The default threshold is 0.6. When the SimilarityScore is ≥0.6, the judgment is as normal. When the SimilarityScore is <0.6, the judgment is an attack.</p>
     */
    public void setSimilarityScore(Float SimilarityScore) {
        this.SimilarityScore = SimilarityScore;
    }

    /**
     * Get <p>Template id of the cache hit</p> 
     * @return HitTemplate <p>Template id of the cache hit</p>
     */
    public String getHitTemplate() {
        return this.HitTemplate;
    }

    /**
     * Set <p>Template id of the cache hit</p>
     * @param HitTemplate <p>Template id of the cache hit</p>
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

