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

public class HighlightSegmentItem extends AbstractModel {

    /**
    * Confidence degree.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Segment start time offset.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of the recording clip.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 
    */
    @SerializedName("SegmentTags")
    @Expose
    private String [] SegmentTags;

    /**
    * The start time of a live streaming segment, in the ISO date format.	
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time of a live streaming segment, in the ISO date format.	
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Highlight title.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Highlight overview.
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
     * Get Confidence degree. 
     * @return Confidence Confidence degree.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence degree.
     * @param Confidence Confidence degree.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Segment start time offset. 
     * @return StartTimeOffset Segment start time offset.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Segment start time offset.
     * @param StartTimeOffset Segment start time offset.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of the recording clip. 
     * @return EndTimeOffset End time offset of the recording clip.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of the recording clip.
     * @param EndTimeOffset End time offset of the recording clip.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get  
     * @return SegmentTags 
     */
    public String [] getSegmentTags() {
        return this.SegmentTags;
    }

    /**
     * Set 
     * @param SegmentTags 
     */
    public void setSegmentTags(String [] SegmentTags) {
        this.SegmentTags = SegmentTags;
    }

    /**
     * Get The start time of a live streaming segment, in the ISO date format.	 
     * @return BeginTime The start time of a live streaming segment, in the ISO date format.	
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time of a live streaming segment, in the ISO date format.	
     * @param BeginTime The start time of a live streaming segment, in the ISO date format.	
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time of a live streaming segment, in the ISO date format.	 
     * @return EndTime The end time of a live streaming segment, in the ISO date format.	
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of a live streaming segment, in the ISO date format.	
     * @param EndTime The end time of a live streaming segment, in the ISO date format.	
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Highlight title. 
     * @return Title Highlight title.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Highlight title.
     * @param Title Highlight title.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Highlight overview. 
     * @return Summary Highlight overview.
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set Highlight overview.
     * @param Summary Highlight overview.
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    public HighlightSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighlightSegmentItem(HighlightSegmentItem source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.SegmentTags != null) {
            this.SegmentTags = new String[source.SegmentTags.length];
            for (int i = 0; i < source.SegmentTags.length; i++) {
                this.SegmentTags[i] = new String(source.SegmentTags[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamArraySimple(map, prefix + "SegmentTags.", this.SegmentTags);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Summary", this.Summary);

    }
}

