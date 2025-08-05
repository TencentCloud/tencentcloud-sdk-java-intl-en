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
    * The confidence score.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The start time offset of the segment.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * The end time offset of the segment.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Segment tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentTags")
    @Expose
    private String [] SegmentTags;

    /**
    * Start time of the live streaming segment in ISO date and time format.	
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time of the live streaming segment in ISO date and time format.	
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get The confidence score. 
     * @return Confidence The confidence score.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score.
     * @param Confidence The confidence score.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The start time offset of the segment. 
     * @return StartTimeOffset The start time offset of the segment.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set The start time offset of the segment.
     * @param StartTimeOffset The start time offset of the segment.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get The end time offset of the segment. 
     * @return EndTimeOffset The end time offset of the segment.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set The end time offset of the segment.
     * @param EndTimeOffset The end time offset of the segment.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Segment tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SegmentTags Segment tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSegmentTags() {
        return this.SegmentTags;
    }

    /**
     * Set Segment tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SegmentTags Segment tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentTags(String [] SegmentTags) {
        this.SegmentTags = SegmentTags;
    }

    /**
     * Get Start time of the live streaming segment in ISO date and time format.	 
     * @return BeginTime Start time of the live streaming segment in ISO date and time format.	
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of the live streaming segment in ISO date and time format.	
     * @param BeginTime Start time of the live streaming segment in ISO date and time format.	
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time of the live streaming segment in ISO date and time format.	 
     * @return EndTime End time of the live streaming segment in ISO date and time format.	
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the live streaming segment in ISO date and time format.	
     * @param EndTime End time of the live streaming segment in ISO date and time format.	
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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

    }
}

