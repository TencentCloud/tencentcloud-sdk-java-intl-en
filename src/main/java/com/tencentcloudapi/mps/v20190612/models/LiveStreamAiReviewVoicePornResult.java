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

public class LiveStreamAiReviewVoicePornResult extends AbstractModel{

    /**
    * Start PTS time of a suspected segment in seconds.
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * End PTS time of a suspected segment in seconds.
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * Score of a suspected porn segment.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Tag of the detected porn information in video. Valid values:
<li>sexual_moan: Sexual moans.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get Start PTS time of a suspected segment in seconds. 
     * @return StartPtsTime Start PTS time of a suspected segment in seconds.
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set Start PTS time of a suspected segment in seconds.
     * @param StartPtsTime Start PTS time of a suspected segment in seconds.
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get End PTS time of a suspected segment in seconds. 
     * @return EndPtsTime End PTS time of a suspected segment in seconds.
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set End PTS time of a suspected segment in seconds.
     * @param EndPtsTime End PTS time of a suspected segment in seconds.
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get Score of a suspected porn segment. 
     * @return Confidence Score of a suspected porn segment.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of a suspected porn segment.
     * @param Confidence Score of a suspected porn segment.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li> 
     * @return Suggestion Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Tag of the detected porn information in video. Valid values:
<li>sexual_moan: Sexual moans.</li> 
     * @return Label Tag of the detected porn information in video. Valid values:
<li>sexual_moan: Sexual moans.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of the detected porn information in video. Valid values:
<li>sexual_moan: Sexual moans.</li>
     * @param Label Tag of the detected porn information in video. Valid values:
<li>sexual_moan: Sexual moans.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

