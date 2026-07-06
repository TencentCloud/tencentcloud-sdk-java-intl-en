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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMDetectionResultItem extends AbstractModel {

    /**
    * <p>Detection category.</p><p>Enumeration value:</p><ul><li>AIGCQualityCharacteristics: AIGC quality characteristics.</li></ul>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>Detection group.</p><p>Enumeration values:</p><ul><li>AIGCAuthenticity: AIGC authenticity, including human body plausibility, physical plausibility, and cross-frame consistency.</li><li>AIGCTechQuality: AIGC technology quality, including aspect ratio, black border, and forced portrait mode.</li></ul>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>Detection type name.</p><p>Enumeration values:</p><ul><li>BodyPoseCheck: Human body pose plausibility, which belongs to AIGCAuthenticity.</li><li>BodyDetailCheck: Human body detail plausibility, including finger count and facial symmetry, which belongs to AIGCAuthenticity.</li><li>PhysicRulesCheck: Physics rules plausibility, including perspective, lighting, and gravity, which belongs to AIGCAuthenticity.</li><li>ObjectConsistencyCheck: Cross-frame object consistency, which belongs to AIGCAuthenticity.</li><li>FormatCheck: Aspect ratio, black border, forced portrait mode, and other format issues, which belong to AIGCTechQuality.</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Overall quality score. Value range: [0, 100]. Higher values indicate better quality.</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>Detection confidence. Value range: [0, 100]. Higher values indicate greater certainty.</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>List of issues detected. This is empty if no issue is detected.</p>
    */
    @SerializedName("IssueSet")
    @Expose
    private LLMDetectionIssue [] IssueSet;

    /**
     * Get <p>Detection category.</p><p>Enumeration value:</p><ul><li>AIGCQualityCharacteristics: AIGC quality characteristics.</li></ul> 
     * @return Category <p>Detection category.</p><p>Enumeration value:</p><ul><li>AIGCQualityCharacteristics: AIGC quality characteristics.</li></ul>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>Detection category.</p><p>Enumeration value:</p><ul><li>AIGCQualityCharacteristics: AIGC quality characteristics.</li></ul>
     * @param Category <p>Detection category.</p><p>Enumeration value:</p><ul><li>AIGCQualityCharacteristics: AIGC quality characteristics.</li></ul>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>Detection group.</p><p>Enumeration values:</p><ul><li>AIGCAuthenticity: AIGC authenticity, including human body plausibility, physical plausibility, and cross-frame consistency.</li><li>AIGCTechQuality: AIGC technology quality, including aspect ratio, black border, and forced portrait mode.</li></ul> 
     * @return Group <p>Detection group.</p><p>Enumeration values:</p><ul><li>AIGCAuthenticity: AIGC authenticity, including human body plausibility, physical plausibility, and cross-frame consistency.</li><li>AIGCTechQuality: AIGC technology quality, including aspect ratio, black border, and forced portrait mode.</li></ul>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>Detection group.</p><p>Enumeration values:</p><ul><li>AIGCAuthenticity: AIGC authenticity, including human body plausibility, physical plausibility, and cross-frame consistency.</li><li>AIGCTechQuality: AIGC technology quality, including aspect ratio, black border, and forced portrait mode.</li></ul>
     * @param Group <p>Detection group.</p><p>Enumeration values:</p><ul><li>AIGCAuthenticity: AIGC authenticity, including human body plausibility, physical plausibility, and cross-frame consistency.</li><li>AIGCTechQuality: AIGC technology quality, including aspect ratio, black border, and forced portrait mode.</li></ul>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>Detection type name.</p><p>Enumeration values:</p><ul><li>BodyPoseCheck: Human body pose plausibility, which belongs to AIGCAuthenticity.</li><li>BodyDetailCheck: Human body detail plausibility, including finger count and facial symmetry, which belongs to AIGCAuthenticity.</li><li>PhysicRulesCheck: Physics rules plausibility, including perspective, lighting, and gravity, which belongs to AIGCAuthenticity.</li><li>ObjectConsistencyCheck: Cross-frame object consistency, which belongs to AIGCAuthenticity.</li><li>FormatCheck: Aspect ratio, black border, forced portrait mode, and other format issues, which belong to AIGCTechQuality.</li></ul> 
     * @return Type <p>Detection type name.</p><p>Enumeration values:</p><ul><li>BodyPoseCheck: Human body pose plausibility, which belongs to AIGCAuthenticity.</li><li>BodyDetailCheck: Human body detail plausibility, including finger count and facial symmetry, which belongs to AIGCAuthenticity.</li><li>PhysicRulesCheck: Physics rules plausibility, including perspective, lighting, and gravity, which belongs to AIGCAuthenticity.</li><li>ObjectConsistencyCheck: Cross-frame object consistency, which belongs to AIGCAuthenticity.</li><li>FormatCheck: Aspect ratio, black border, forced portrait mode, and other format issues, which belong to AIGCTechQuality.</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Detection type name.</p><p>Enumeration values:</p><ul><li>BodyPoseCheck: Human body pose plausibility, which belongs to AIGCAuthenticity.</li><li>BodyDetailCheck: Human body detail plausibility, including finger count and facial symmetry, which belongs to AIGCAuthenticity.</li><li>PhysicRulesCheck: Physics rules plausibility, including perspective, lighting, and gravity, which belongs to AIGCAuthenticity.</li><li>ObjectConsistencyCheck: Cross-frame object consistency, which belongs to AIGCAuthenticity.</li><li>FormatCheck: Aspect ratio, black border, forced portrait mode, and other format issues, which belong to AIGCTechQuality.</li></ul>
     * @param Type <p>Detection type name.</p><p>Enumeration values:</p><ul><li>BodyPoseCheck: Human body pose plausibility, which belongs to AIGCAuthenticity.</li><li>BodyDetailCheck: Human body detail plausibility, including finger count and facial symmetry, which belongs to AIGCAuthenticity.</li><li>PhysicRulesCheck: Physics rules plausibility, including perspective, lighting, and gravity, which belongs to AIGCAuthenticity.</li><li>ObjectConsistencyCheck: Cross-frame object consistency, which belongs to AIGCAuthenticity.</li><li>FormatCheck: Aspect ratio, black border, forced portrait mode, and other format issues, which belong to AIGCTechQuality.</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Overall quality score. Value range: [0, 100]. Higher values indicate better quality.</p> 
     * @return Score <p>Overall quality score. Value range: [0, 100]. Higher values indicate better quality.</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>Overall quality score. Value range: [0, 100]. Higher values indicate better quality.</p>
     * @param Score <p>Overall quality score. Value range: [0, 100]. Higher values indicate better quality.</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>Detection confidence. Value range: [0, 100]. Higher values indicate greater certainty.</p> 
     * @return Confidence <p>Detection confidence. Value range: [0, 100]. Higher values indicate greater certainty.</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Detection confidence. Value range: [0, 100]. Higher values indicate greater certainty.</p>
     * @param Confidence <p>Detection confidence. Value range: [0, 100]. Higher values indicate greater certainty.</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>List of issues detected. This is empty if no issue is detected.</p> 
     * @return IssueSet <p>List of issues detected. This is empty if no issue is detected.</p>
     */
    public LLMDetectionIssue [] getIssueSet() {
        return this.IssueSet;
    }

    /**
     * Set <p>List of issues detected. This is empty if no issue is detected.</p>
     * @param IssueSet <p>List of issues detected. This is empty if no issue is detected.</p>
     */
    public void setIssueSet(LLMDetectionIssue [] IssueSet) {
        this.IssueSet = IssueSet;
    }

    public LLMDetectionResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMDetectionResultItem(LLMDetectionResultItem source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.IssueSet != null) {
            this.IssueSet = new LLMDetectionIssue[source.IssueSet.length];
            for (int i = 0; i < source.IssueSet.length; i++) {
                this.IssueSet[i] = new LLMDetectionIssue(source.IssueSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "IssueSet.", this.IssueSet);

    }
}

