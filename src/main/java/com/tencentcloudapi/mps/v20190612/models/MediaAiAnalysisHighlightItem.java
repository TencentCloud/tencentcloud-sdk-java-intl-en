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

public class MediaAiAnalysisHighlightItem extends AbstractModel {

    /**
    * The URL of the highlight segments.
    */
    @SerializedName("HighlightPath")
    @Expose
    private String HighlightPath;

    /**
    * The URL of the thumbnail.
    */
    @SerializedName("CovImgPath")
    @Expose
    private String CovImgPath;

    /**
    * The confidence score. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The duration of the highlights.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * A list of the highlight segments.
    */
    @SerializedName("SegmentSet")
    @Expose
    private HighlightSegmentItem [] SegmentSet;

    /**
     * Get The URL of the highlight segments. 
     * @return HighlightPath The URL of the highlight segments.
     */
    public String getHighlightPath() {
        return this.HighlightPath;
    }

    /**
     * Set The URL of the highlight segments.
     * @param HighlightPath The URL of the highlight segments.
     */
    public void setHighlightPath(String HighlightPath) {
        this.HighlightPath = HighlightPath;
    }

    /**
     * Get The URL of the thumbnail. 
     * @return CovImgPath The URL of the thumbnail.
     */
    public String getCovImgPath() {
        return this.CovImgPath;
    }

    /**
     * Set The URL of the thumbnail.
     * @param CovImgPath The URL of the thumbnail.
     */
    public void setCovImgPath(String CovImgPath) {
        this.CovImgPath = CovImgPath;
    }

    /**
     * Get The confidence score. Value range: 0-100. 
     * @return Confidence The confidence score. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score. Value range: 0-100.
     * @param Confidence The confidence score. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The duration of the highlights. 
     * @return Duration The duration of the highlights.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set The duration of the highlights.
     * @param Duration The duration of the highlights.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get A list of the highlight segments. 
     * @return SegmentSet A list of the highlight segments.
     */
    public HighlightSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set A list of the highlight segments.
     * @param SegmentSet A list of the highlight segments.
     */
    public void setSegmentSet(HighlightSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    public MediaAiAnalysisHighlightItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisHighlightItem(MediaAiAnalysisHighlightItem source) {
        if (source.HighlightPath != null) {
            this.HighlightPath = new String(source.HighlightPath);
        }
        if (source.CovImgPath != null) {
            this.CovImgPath = new String(source.CovImgPath);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new HighlightSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new HighlightSegmentItem(source.SegmentSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighlightPath", this.HighlightPath);
        this.setParamSimple(map, prefix + "CovImgPath", this.CovImgPath);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

