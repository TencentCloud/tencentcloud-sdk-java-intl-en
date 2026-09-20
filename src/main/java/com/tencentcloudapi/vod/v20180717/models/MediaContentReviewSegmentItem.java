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

public class MediaContentReviewSegmentItem extends AbstractModel {

    /**
    * Time offset of the start of the suspected segment. Unit: second.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of the suspected segment, in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Score of offensive information involved in suspected clips.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Tag of the result that the suspected segment involves offensive content.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Result suggestions for identifying suspected segments involving offensive content. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Suspected image URL (images are not retained permanently and will be deleted upon reaching
Images will be deleted after the PicUrlExpireTime time point).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * This field is deprecated. Please use PicUrlExpireTime.
    */
    @SerializedName("PicUrlExpireTimeStamp")
    @Expose
    private Long PicUrlExpireTimeStamp;

    /**
    * Expiration time of the URL of the suspected image, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get Time offset of the start of the suspected segment. Unit: second. 
     * @return StartTimeOffset Time offset of the start of the suspected segment. Unit: second.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Time offset of the start of the suspected segment. Unit: second.
     * @param StartTimeOffset Time offset of the start of the suspected segment. Unit: second.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of the suspected segment, in seconds. 
     * @return EndTimeOffset End time offset of the suspected segment, in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of the suspected segment, in seconds.
     * @param EndTimeOffset End time offset of the suspected segment, in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Score of offensive information involved in suspected clips. 
     * @return Confidence Score of offensive information involved in suspected clips.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of offensive information involved in suspected clips.
     * @param Confidence Score of offensive information involved in suspected clips.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Tag of the result that the suspected segment involves offensive content. 
     * @return Label Tag of the result that the suspected segment involves offensive content.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of the result that the suspected segment involves offensive content.
     * @param Label Tag of the result that the suspected segment involves offensive content.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Result suggestions for identifying suspected segments involving offensive content. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Result suggestions for identifying suspected segments involving offensive content. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result suggestions for identifying suspected segments involving offensive content. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Result suggestions for identifying suspected segments involving offensive content. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Suspected image URL (images are not retained permanently and will be deleted upon reaching
Images will be deleted after the PicUrlExpireTime time point). 
     * @return Url Suspected image URL (images are not retained permanently and will be deleted upon reaching
Images will be deleted after the PicUrlExpireTime time point).
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Suspected image URL (images are not retained permanently and will be deleted upon reaching
Images will be deleted after the PicUrlExpireTime time point).
     * @param Url Suspected image URL (images are not retained permanently and will be deleted upon reaching
Images will be deleted after the PicUrlExpireTime time point).
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get This field is deprecated. Please use PicUrlExpireTime. 
     * @return PicUrlExpireTimeStamp This field is deprecated. Please use PicUrlExpireTime.
     * @deprecated
     */
    @Deprecated
    public Long getPicUrlExpireTimeStamp() {
        return this.PicUrlExpireTimeStamp;
    }

    /**
     * Set This field is deprecated. Please use PicUrlExpireTime.
     * @param PicUrlExpireTimeStamp This field is deprecated. Please use PicUrlExpireTime.
     * @deprecated
     */
    @Deprecated
    public void setPicUrlExpireTimeStamp(Long PicUrlExpireTimeStamp) {
        this.PicUrlExpireTimeStamp = PicUrlExpireTimeStamp;
    }

    /**
     * Get Expiration time of the URL of the suspected image, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return PicUrlExpireTime Expiration time of the URL of the suspected image, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL of the suspected image, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param PicUrlExpireTime Expiration time of the URL of the suspected image, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    public MediaContentReviewSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaContentReviewSegmentItem(MediaContentReviewSegmentItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PicUrlExpireTimeStamp != null) {
            this.PicUrlExpireTimeStamp = new Long(source.PicUrlExpireTimeStamp);
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
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTimeStamp", this.PicUrlExpireTimeStamp);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

