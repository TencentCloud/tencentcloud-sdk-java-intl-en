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

public class SegmentRecognitionItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 
    */
    @SerializedName("SegmentUrl")
    @Expose
    private String SegmentUrl;

    /**
    * Segment title.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Segment summary.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

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
     * @return StartTimeOffset 
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 
     * @param StartTimeOffset 
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get  
     * @return EndTimeOffset 
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 
     * @param EndTimeOffset 
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get  
     * @return SegmentUrl 
     */
    public String getSegmentUrl() {
        return this.SegmentUrl;
    }

    /**
     * Set 
     * @param SegmentUrl 
     */
    public void setSegmentUrl(String SegmentUrl) {
        this.SegmentUrl = SegmentUrl;
    }

    /**
     * Get Segment title.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Title Segment title.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Segment title.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Title Segment title.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Segment summary.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Summary Segment summary.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set Segment summary.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Summary Segment summary.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    public SegmentRecognitionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentRecognitionItem(SegmentRecognitionItem source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.SegmentUrl != null) {
            this.SegmentUrl = new String(source.SegmentUrl);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "SegmentUrl", this.SegmentUrl);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Summary", this.Summary);

    }
}

