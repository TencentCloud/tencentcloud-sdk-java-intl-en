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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAiAnalysisDescriptionItem extends AbstractModel {

    /**
    * Intelligent description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Confidence of the intelligent description, with a value range from 0 to 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Paragraphs")
    @Expose
    private AiParagraphInfo [] Paragraphs;

    /**
     * Get Intelligent description. 
     * @return Description Intelligent description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Intelligent description.
     * @param Description Intelligent description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Confidence of the intelligent description, with a value range from 0 to 100. 
     * @return Confidence Confidence of the intelligent description, with a value range from 0 to 100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of the intelligent description, with a value range from 0 to 100.
     * @param Confidence Confidence of the intelligent description, with a value range from 0 to 100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Paragraphs Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AiParagraphInfo [] getParagraphs() {
        return this.Paragraphs;
    }

    /**
     * Set Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Paragraphs Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParagraphs(AiParagraphInfo [] Paragraphs) {
        this.Paragraphs = Paragraphs;
    }

    public MediaAiAnalysisDescriptionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisDescriptionItem(MediaAiAnalysisDescriptionItem source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Paragraphs != null) {
            this.Paragraphs = new AiParagraphInfo[source.Paragraphs.length];
            for (int i = 0; i < source.Paragraphs.length; i++) {
                this.Paragraphs[i] = new AiParagraphInfo(source.Paragraphs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "Paragraphs.", this.Paragraphs);

    }
}

