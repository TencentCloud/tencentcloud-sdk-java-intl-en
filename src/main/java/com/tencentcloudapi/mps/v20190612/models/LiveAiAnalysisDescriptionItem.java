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

public class LiveAiAnalysisDescriptionItem extends AbstractModel {

    /**
    * Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Paragraphs")
    @Expose
    private LiveAiParagraphInfo [] Paragraphs;

    /**
     * Get Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Paragraphs Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LiveAiParagraphInfo [] getParagraphs() {
        return this.Paragraphs;
    }

    /**
     * Set Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Paragraphs Segmentation result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParagraphs(LiveAiParagraphInfo [] Paragraphs) {
        this.Paragraphs = Paragraphs;
    }

    public LiveAiAnalysisDescriptionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveAiAnalysisDescriptionItem(LiveAiAnalysisDescriptionItem source) {
        if (source.Paragraphs != null) {
            this.Paragraphs = new LiveAiParagraphInfo[source.Paragraphs.length];
            for (int i = 0; i < source.Paragraphs.length; i++) {
                this.Paragraphs[i] = new LiveAiParagraphInfo(source.Paragraphs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Paragraphs.", this.Paragraphs);

    }
}

