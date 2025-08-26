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

public class LiveStreamAiAnalysisResultItem extends AbstractModel {

    /**
    * Result type. Valid values:
<li>SegmentRecognition: video splitting.</li>
<li>Highlight: highlight.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("SegmentResultSet")
    @Expose
    private SegmentRecognitionItem [] SegmentResultSet;

    /**
    * Highlight result. This field is valid when Type is set to Highlight.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HighlightResultSet")
    @Expose
    private MediaAiAnalysisHighlightItem [] HighlightResultSet;

    /**
     * Get Result type. Valid values:
<li>SegmentRecognition: video splitting.</li>
<li>Highlight: highlight.</li> 
     * @return Type Result type. Valid values:
<li>SegmentRecognition: video splitting.</li>
<li>Highlight: highlight.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Result type. Valid values:
<li>SegmentRecognition: video splitting.</li>
<li>Highlight: highlight.</li>
     * @param Type Result type. Valid values:
<li>SegmentRecognition: video splitting.</li>
<li>Highlight: highlight.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return SegmentResultSet 
     */
    public SegmentRecognitionItem [] getSegmentResultSet() {
        return this.SegmentResultSet;
    }

    /**
     * Set 
     * @param SegmentResultSet 
     */
    public void setSegmentResultSet(SegmentRecognitionItem [] SegmentResultSet) {
        this.SegmentResultSet = SegmentResultSet;
    }

    /**
     * Get Highlight result. This field is valid when Type is set to Highlight.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HighlightResultSet Highlight result. This field is valid when Type is set to Highlight.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MediaAiAnalysisHighlightItem [] getHighlightResultSet() {
        return this.HighlightResultSet;
    }

    /**
     * Set Highlight result. This field is valid when Type is set to Highlight.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HighlightResultSet Highlight result. This field is valid when Type is set to Highlight.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHighlightResultSet(MediaAiAnalysisHighlightItem [] HighlightResultSet) {
        this.HighlightResultSet = HighlightResultSet;
    }

    public LiveStreamAiAnalysisResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiAnalysisResultItem(LiveStreamAiAnalysisResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SegmentResultSet != null) {
            this.SegmentResultSet = new SegmentRecognitionItem[source.SegmentResultSet.length];
            for (int i = 0; i < source.SegmentResultSet.length; i++) {
                this.SegmentResultSet[i] = new SegmentRecognitionItem(source.SegmentResultSet[i]);
            }
        }
        if (source.HighlightResultSet != null) {
            this.HighlightResultSet = new MediaAiAnalysisHighlightItem[source.HighlightResultSet.length];
            for (int i = 0; i < source.HighlightResultSet.length; i++) {
                this.HighlightResultSet[i] = new MediaAiAnalysisHighlightItem(source.HighlightResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SegmentResultSet.", this.SegmentResultSet);
        this.setParamArrayObj(map, prefix + "HighlightResultSet.", this.HighlightResultSet);

    }
}

