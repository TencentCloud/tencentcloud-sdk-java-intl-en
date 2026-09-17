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

public class MediaContentReviewOcrTextSegmentItem extends AbstractModel {

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
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
    * 
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

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
     * @return Suggestion 
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 
     * @param Suggestion 
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get  
     * @return KeywordSet 
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set 
     * @param KeywordSet 
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    /**
     * Get  
     * @return AreaCoordSet 
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set 
     * @param AreaCoordSet 
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return PicUrlExpireTime 
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set 
     * @param PicUrlExpireTime 
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    public MediaContentReviewOcrTextSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaContentReviewOcrTextSegmentItem(MediaContentReviewOcrTextSegmentItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.KeywordSet != null) {
            this.KeywordSet = new String[source.KeywordSet.length];
            for (int i = 0; i < source.KeywordSet.length; i++) {
                this.KeywordSet[i] = new String(source.KeywordSet[i]);
            }
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PicUrlExpireTime != null) {
            this.PicUrlExpireTime = new String(source.PicUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

