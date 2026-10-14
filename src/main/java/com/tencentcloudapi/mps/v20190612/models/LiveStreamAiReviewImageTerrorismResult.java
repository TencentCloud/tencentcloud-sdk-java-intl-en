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

public class LiveStreamAiReviewImageTerrorismResult extends AbstractModel {

    /**
    * Starting PTS time of a suspected segment, in seconds.
    */
    @SerializedName("StartPtsTime")
    @Expose
    private Float StartPtsTime;

    /**
    * End PTS time of a suspected segment, in seconds.
    */
    @SerializedName("EndPtsTime")
    @Expose
    private Float EndPtsTime;

    /**
    * Sensitivity score of the suspected segment.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Suspected segment sensitive result suggestion. Value range:
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Sensitive result tag of the video. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Suspected image URL (images are not retained permanently and will be deleted upon reaching
Images will be deleted after the PicUrlExpireTime time point).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Expiration time of the suspected image URL, using the [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get Starting PTS time of a suspected segment, in seconds. 
     * @return StartPtsTime Starting PTS time of a suspected segment, in seconds.
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set Starting PTS time of a suspected segment, in seconds.
     * @param StartPtsTime Starting PTS time of a suspected segment, in seconds.
     */
    public void setStartPtsTime(Float StartPtsTime) {
        this.StartPtsTime = StartPtsTime;
    }

    /**
     * Get End PTS time of a suspected segment, in seconds. 
     * @return EndPtsTime End PTS time of a suspected segment, in seconds.
     */
    public Float getEndPtsTime() {
        return this.EndPtsTime;
    }

    /**
     * Set End PTS time of a suspected segment, in seconds.
     * @param EndPtsTime End PTS time of a suspected segment, in seconds.
     */
    public void setEndPtsTime(Float EndPtsTime) {
        this.EndPtsTime = EndPtsTime;
    }

    /**
     * Get Sensitivity score of the suspected segment. 
     * @return Confidence Sensitivity score of the suspected segment.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Sensitivity score of the suspected segment.
     * @param Confidence Sensitivity score of the suspected segment.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Suspected segment sensitive result suggestion. Value range:
<li>pass</li>
<li>review</li>
<li>block</li> 
     * @return Suggestion Suspected segment sensitive result suggestion. Value range:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suspected segment sensitive result suggestion. Value range:
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion Suspected segment sensitive result suggestion. Value range:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Sensitive result tag of the video. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li> 
     * @return Label Sensitive result tag of the video. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Sensitive result tag of the video. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
     * @param Label Sensitive result tag of the video. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: sensitive flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: sensitive persons.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
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
     * Get Expiration time of the suspected image URL, using the [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return PicUrlExpireTime Expiration time of the suspected image URL, using the [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of the suspected image URL, using the [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param PicUrlExpireTime Expiration time of the suspected image URL, using the [ISO date format](https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
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

