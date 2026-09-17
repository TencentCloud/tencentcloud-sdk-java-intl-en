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

public class QualityInspectLLMDetectionIssue extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * 
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * 
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * 
    */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
     * Get  
     * @return Tag 
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 
     * @param Tag 
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return Score 
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 
     * @param Score 
     */
    public void setScore(Float Score) {
        this.Score = Score;
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
     * @return StartTimeMs 
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set 
     * @param StartTimeMs 
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get  
     * @return EndTimeMs 
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set 
     * @param EndTimeMs 
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get  
     * @return ExtraData 
     */
    public String getExtraData() {
        return this.ExtraData;
    }

    /**
     * Set 
     * @param ExtraData 
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    public QualityInspectLLMDetectionIssue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectLLMDetectionIssue(QualityInspectLLMDetectionIssue source) {
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

