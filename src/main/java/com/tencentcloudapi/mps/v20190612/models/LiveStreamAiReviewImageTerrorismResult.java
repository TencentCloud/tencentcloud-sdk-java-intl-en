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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiReviewImageTerrorismResult extends AbstractModel {

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
    * The confidence score for the detected sensitive segments.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The suggestion for handling the sensitive segments. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * The labels for the detected sensitive content. Valid values:
<li>guns</li>
<li>crowd</li>
<li>police</li>
<li>bloody</li>
<li>banners (sensitive flags)</li>
<li>militant</li>
<li>explosion</li>
<li>terrorists</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * URL of a suspected image (which will not be permanently stored
and will be deleted after `PicUrlExpireTime`).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

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
     * Get The confidence score for the detected sensitive segments. 
     * @return Confidence The confidence score for the detected sensitive segments.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score for the detected sensitive segments.
     * @param Confidence The confidence score for the detected sensitive segments.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The suggestion for handling the sensitive segments. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li> 
     * @return Suggestion The suggestion for handling the sensitive segments. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set The suggestion for handling the sensitive segments. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion The suggestion for handling the sensitive segments. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get The labels for the detected sensitive content. Valid values:
<li>guns</li>
<li>crowd</li>
<li>police</li>
<li>bloody</li>
<li>banners (sensitive flags)</li>
<li>militant</li>
<li>explosion</li>
<li>terrorists</li> 
     * @return Label The labels for the detected sensitive content. Valid values:
<li>guns</li>
<li>crowd</li>
<li>police</li>
<li>bloody</li>
<li>banners (sensitive flags)</li>
<li>militant</li>
<li>explosion</li>
<li>terrorists</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set The labels for the detected sensitive content. Valid values:
<li>guns</li>
<li>crowd</li>
<li>police</li>
<li>bloody</li>
<li>banners (sensitive flags)</li>
<li>militant</li>
<li>explosion</li>
<li>terrorists</li>
     * @param Label The labels for the detected sensitive content. Valid values:
<li>guns</li>
<li>crowd</li>
<li>police</li>
<li>bloody</li>
<li>banners (sensitive flags)</li>
<li>militant</li>
<li>explosion</li>
<li>terrorists</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get URL of a suspected image (which will not be permanently stored
and will be deleted after `PicUrlExpireTime`). 
     * @return Url URL of a suspected image (which will not be permanently stored
and will be deleted after `PicUrlExpireTime`).
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of a suspected image (which will not be permanently stored
and will be deleted after `PicUrlExpireTime`).
     * @param Url URL of a suspected image (which will not be permanently stored
and will be deleted after `PicUrlExpireTime`).
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return PicUrlExpireTime Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param PicUrlExpireTime Expiration time of a suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    public LiveStreamAiReviewImageTerrorismResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiReviewImageTerrorismResult(LiveStreamAiReviewImageTerrorismResult source) {
        if (source.StartPtsTime != null) {
            this.StartPtsTime = new Float(source.StartPtsTime);
        }
        if (source.EndPtsTime != null) {
            this.EndPtsTime = new Float(source.EndPtsTime);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
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
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

