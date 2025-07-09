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
    * Segment cover.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CovImgUrl")
    @Expose
    private String CovImgUrl;

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
    * Segmentation keywords.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * The start time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * The end time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies the character ID.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

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
     * Get Segment cover.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CovImgUrl Segment cover.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * Set Segment cover.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CovImgUrl Segment cover.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCovImgUrl(String CovImgUrl) {
        this.CovImgUrl = CovImgUrl;
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

    /**
     * Get Segmentation keywords. 
     * @return Keywords Segmentation keywords.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set Segmentation keywords.
     * @param Keywords Segmentation keywords.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get The start time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BeginTime The start time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set The start time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BeginTime The start time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get The end time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime The end time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime The end time of a live streaming segment, in the ISO date format.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies the character ID. 
     * @return PersonId Specifies the character ID.
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Specifies the character ID.
     * @param PersonId Specifies the character ID.
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
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
        if (source.CovImgUrl != null) {
            this.CovImgUrl = new String(source.CovImgUrl);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
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
        this.setParamSimple(map, prefix + "CovImgUrl", this.CovImgUrl);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);

    }
}

