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

public class MediaAiAnalysisHighlightItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("HighlightUrl")
    @Expose
    private String HighlightUrl;

    /**
    * 
    */
    @SerializedName("CovImgUrl")
    @Expose
    private String CovImgUrl;

    /**
    * 
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 
    */
    @SerializedName("SegmentSet")
    @Expose
    private HighlightSegmentItem [] SegmentSet;

    /**
     * Get  
     * @return HighlightUrl 
     */
    public String getHighlightUrl() {
        return this.HighlightUrl;
    }

    /**
     * Set 
     * @param HighlightUrl 
     */
    public void setHighlightUrl(String HighlightUrl) {
        this.HighlightUrl = HighlightUrl;
    }

    /**
     * Get  
     * @return CovImgUrl 
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * Set 
     * @param CovImgUrl 
     */
    public void setCovImgUrl(String CovImgUrl) {
        this.CovImgUrl = CovImgUrl;
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
     * @return Duration 
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return SegmentSet 
     */
    public HighlightSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 
     * @param SegmentSet 
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
        if (source.HighlightUrl != null) {
            this.HighlightUrl = new String(source.HighlightUrl);
        }
        if (source.CovImgUrl != null) {
            this.CovImgUrl = new String(source.CovImgUrl);
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
        this.setParamSimple(map, prefix + "HighlightUrl", this.HighlightUrl);
        this.setParamSimple(map, prefix + "CovImgUrl", this.CovImgUrl);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

