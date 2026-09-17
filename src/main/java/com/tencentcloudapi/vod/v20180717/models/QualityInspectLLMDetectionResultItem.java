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

public class QualityInspectLLMDetectionResultItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 
    */
    @SerializedName("IssueSet")
    @Expose
    private QualityInspectLLMDetectionIssue [] IssueSet;

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
     * @return Group 
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 
     * @param Group 
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Score 
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 
     * @param Score 
     */
    public void setScore(Float Score) {
        this.Score = Score;
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
     * @return IssueSet 
     */
    public QualityInspectLLMDetectionIssue [] getIssueSet() {
        return this.IssueSet;
    }

    /**
     * Set 
     * @param IssueSet 
     */
    public void setIssueSet(QualityInspectLLMDetectionIssue [] IssueSet) {
        this.IssueSet = IssueSet;
    }

    public QualityInspectLLMDetectionResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectLLMDetectionResultItem(QualityInspectLLMDetectionResultItem source) {
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
            this.IssueSet = new QualityInspectLLMDetectionIssue[source.IssueSet.length];
            for (int i = 0; i < source.IssueSet.length; i++) {
                this.IssueSet[i] = new QualityInspectLLMDetectionIssue(source.IssueSet[i]);
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

