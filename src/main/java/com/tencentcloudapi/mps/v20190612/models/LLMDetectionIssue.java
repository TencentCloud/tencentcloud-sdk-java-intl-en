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

public class LLMDetectionIssue extends AbstractModel {

    /**
    * <p>Issue category tag.</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>Issue description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Quality score of the issue. Value range: [0, 100].</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>Detection confidence for the issue. Value range: [0, 100].</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>Issue start time (ms).</p>
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * <p>Issue end time (ms).</p>
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * <p>Additional data (JSON format), such as severity and other supplementary information.</p>
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
     * Get <p>Issue category tag.</p> 
     * @return Tag <p>Issue category tag.</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Issue category tag.</p>
     * @param Tag <p>Issue category tag.</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Issue description.</p> 
     * @return Description <p>Issue description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Issue description.</p>
     * @param Description <p>Issue description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Quality score of the issue. Value range: [0, 100].</p> 
     * @return Score <p>Quality score of the issue. Value range: [0, 100].</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>Quality score of the issue. Value range: [0, 100].</p>
     * @param Score <p>Quality score of the issue. Value range: [0, 100].</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>Detection confidence for the issue. Value range: [0, 100].</p> 
     * @return Confidence <p>Detection confidence for the issue. Value range: [0, 100].</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Detection confidence for the issue. Value range: [0, 100].</p>
     * @param Confidence <p>Detection confidence for the issue. Value range: [0, 100].</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>Issue start time (ms).</p> 
     * @return StartTimeMs <p>Issue start time (ms).</p>
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set <p>Issue start time (ms).</p>
     * @param StartTimeMs <p>Issue start time (ms).</p>
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get <p>Issue end time (ms).</p> 
     * @return EndTimeMs <p>Issue end time (ms).</p>
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set <p>Issue end time (ms).</p>
     * @param EndTimeMs <p>Issue end time (ms).</p>
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get <p>Additional data (JSON format), such as severity and other supplementary information.</p> 
     * @return ExtraData <p>Additional data (JSON format), such as severity and other supplementary information.</p>
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set <p>Additional data (JSON format), such as severity and other supplementary information.</p>
     * @param ExtraData <p>Additional data (JSON format), such as severity and other supplementary information.</p>
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    public LLMDetectionIssue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMDetectionIssue(LLMDetectionIssue source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.StartTimeMs != null) {
            this.StartTimeMs = new Long(source.StartTimeMs);
        }
        if (source.EndTimeMs != null) {
            this.EndTimeMs = new Long(source.EndTimeMs);
        }
        if (source.ExtraData != null) {
            this.ExtraData = new String(source.ExtraData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeMs", this.StartTimeMs);
        this.setParamSimple(map, prefix + "EndTimeMs", this.EndTimeMs);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);

    }
}

