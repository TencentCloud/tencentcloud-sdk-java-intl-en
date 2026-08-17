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
    * Confidence degree.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Start time offset of a recording clip.
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
    * Split segment URL.
    */
    @SerializedName("SegmentUrl")
    @Expose
    private String SegmentUrl;

    /**
    * Segment cover.
    */
    @SerializedName("CovImgUrl")
    @Expose
    private String CovImgUrl;

    /**
    * Segment title.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Segment summary.
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
    * Specify the figure ID.
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

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
     * Get Start time offset of a recording clip. 
     * @return StartTimeOffset Start time offset of a recording clip.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a recording clip.
     * @param StartTimeOffset Start time offset of a recording clip.
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
     * Get Split segment URL. 
     * @return SegmentUrl Split segment URL.
     */
    public String getSegmentUrl() {
        return this.SegmentUrl;
    }

    /**
     * Set Split segment URL.
     * @param SegmentUrl Split segment URL.
     */
    public void setSegmentUrl(String SegmentUrl) {
        this.SegmentUrl = SegmentUrl;
    }

    /**
     * Get Segment cover. 
     * @return CovImgUrl Segment cover.
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * Set Segment cover.
     * @param CovImgUrl Segment cover.
     */
    public void setCovImgUrl(String CovImgUrl) {
        this.CovImgUrl = CovImgUrl;
    }

    /**
     * Get Segment title. 
     * @return Title Segment title.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Segment title.
     * @param Title Segment title.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Segment summary. 
     * @return Summary Segment summary.
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set Segment summary.
     * @param Summary Segment summary.
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
     * Get Specify the figure ID. 
     * @return PersonId Specify the figure ID.
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set Specify the figure ID.
     * @param PersonId Specify the figure ID.
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

