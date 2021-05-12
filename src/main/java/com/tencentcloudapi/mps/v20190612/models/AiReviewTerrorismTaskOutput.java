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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiReviewTerrorismTaskOutput extends AbstractModel{

    /**
    * Score of the detected terrorism information in a video from 0 to 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Suggestion for the detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Tag of the detected terrorism information in a video. Valid values:
<li>guns: Weapons and guns.</li>
<li>crowd: Crowd.</li>
<li>police: Police force.</li>
<li>bloody: Bloody scenes.</li>
<li>banners: Terrorism flags.</li>
<li>militant: Militants.</li>
<li>explosion: Explosions and fires.</li>
<li>terrorists: Terrorists.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * List of video segments that contain the detected terrorism information.
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewSegmentItem [] SegmentSet;

    /**
     * Get Score of the detected terrorism information in a video from 0 to 100. 
     * @return Confidence Score of the detected terrorism information in a video from 0 to 100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of the detected terrorism information in a video from 0 to 100.
     * @param Confidence Score of the detected terrorism information in a video from 0 to 100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Suggestion for the detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Suggestion for the detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for the detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Suggestion for the detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Tag of the detected terrorism information in a video. Valid values:
<li>guns: Weapons and guns.</li>
<li>crowd: Crowd.</li>
<li>police: Police force.</li>
<li>bloody: Bloody scenes.</li>
<li>banners: Terrorism flags.</li>
<li>militant: Militants.</li>
<li>explosion: Explosions and fires.</li>
<li>terrorists: Terrorists.</li> 
     * @return Label Tag of the detected terrorism information in a video. Valid values:
<li>guns: Weapons and guns.</li>
<li>crowd: Crowd.</li>
<li>police: Police force.</li>
<li>bloody: Bloody scenes.</li>
<li>banners: Terrorism flags.</li>
<li>militant: Militants.</li>
<li>explosion: Explosions and fires.</li>
<li>terrorists: Terrorists.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of the detected terrorism information in a video. Valid values:
<li>guns: Weapons and guns.</li>
<li>crowd: Crowd.</li>
<li>police: Police force.</li>
<li>bloody: Bloody scenes.</li>
<li>banners: Terrorism flags.</li>
<li>militant: Militants.</li>
<li>explosion: Explosions and fires.</li>
<li>terrorists: Terrorists.</li>
     * @param Label Tag of the detected terrorism information in a video. Valid values:
<li>guns: Weapons and guns.</li>
<li>crowd: Crowd.</li>
<li>police: Police force.</li>
<li>bloody: Bloody scenes.</li>
<li>banners: Terrorism flags.</li>
<li>militant: Militants.</li>
<li>explosion: Explosions and fires.</li>
<li>terrorists: Terrorists.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get List of video segments that contain the detected terrorism information. 
     * @return SegmentSet List of video segments that contain the detected terrorism information.
     */
    public MediaContentReviewSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of video segments that contain the detected terrorism information.
     * @param SegmentSet List of video segments that contain the detected terrorism information.
     */
    public void setSegmentSet(MediaContentReviewSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    public AiReviewTerrorismTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiReviewTerrorismTaskOutput(AiReviewTerrorismTaskOutput source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new MediaContentReviewSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new MediaContentReviewSegmentItem(source.SegmentSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

