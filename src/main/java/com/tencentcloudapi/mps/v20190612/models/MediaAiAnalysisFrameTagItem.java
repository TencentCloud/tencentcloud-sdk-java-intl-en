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

public class MediaAiAnalysisFrameTagItem extends AbstractModel {

    /**
    * Tag name by frame.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Classification list by frame tag name. CategorySet.N indicates the (N+1)th level classification.
For example, when the Tag is "tower", CategorySet contains two elements: CategorySet.0 is "scenario" and CategorySet.1 is "building", which means the frame Tag is "tower", the first-level category is "scenario", and the second-level category is "building".
    */
    @SerializedName("CategorySet")
    @Expose
    private String [] CategorySet;

    /**
    * Reliability of frame tagging, with a value range from 0 to -100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get Tag name by frame. 
     * @return Tag Tag name by frame.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Tag name by frame.
     * @param Tag Tag name by frame.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Classification list by frame tag name. CategorySet.N indicates the (N+1)th level classification.
For example, when the Tag is "tower", CategorySet contains two elements: CategorySet.0 is "scenario" and CategorySet.1 is "building", which means the frame Tag is "tower", the first-level category is "scenario", and the second-level category is "building". 
     * @return CategorySet Classification list by frame tag name. CategorySet.N indicates the (N+1)th level classification.
For example, when the Tag is "tower", CategorySet contains two elements: CategorySet.0 is "scenario" and CategorySet.1 is "building", which means the frame Tag is "tower", the first-level category is "scenario", and the second-level category is "building".
     */
    public String [] getCategorySet() {
        return this.CategorySet;
    }

    /**
     * Set Classification list by frame tag name. CategorySet.N indicates the (N+1)th level classification.
For example, when the Tag is "tower", CategorySet contains two elements: CategorySet.0 is "scenario" and CategorySet.1 is "building", which means the frame Tag is "tower", the first-level category is "scenario", and the second-level category is "building".
     * @param CategorySet Classification list by frame tag name. CategorySet.N indicates the (N+1)th level classification.
For example, when the Tag is "tower", CategorySet contains two elements: CategorySet.0 is "scenario" and CategorySet.1 is "building", which means the frame Tag is "tower", the first-level category is "scenario", and the second-level category is "building".
     */
    public void setCategorySet(String [] CategorySet) {
        this.CategorySet = CategorySet;
    }

    /**
     * Get Reliability of frame tagging, with a value range from 0 to -100. 
     * @return Confidence Reliability of frame tagging, with a value range from 0 to -100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Reliability of frame tagging, with a value range from 0 to -100.
     * @param Confidence Reliability of frame tagging, with a value range from 0 to -100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public MediaAiAnalysisFrameTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisFrameTagItem(MediaAiAnalysisFrameTagItem source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.CategorySet != null) {
            this.CategorySet = new String[source.CategorySet.length];
            for (int i = 0; i < source.CategorySet.length; i++) {
                this.CategorySet[i] = new String(source.CategorySet[i]);
            }
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamArraySimple(map, prefix + "CategorySet.", this.CategorySet);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

