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

public class LiveStreamAiReviewImagePoliticalResult extends AbstractModel {

    /**
    * Start PTS time of a suspected segment, in seconds.
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
    * Sensitive score of the suspected segment.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Result suggestion for suspected segment porn detection, permissible range:
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Video sensitive result tag, value ranges from...to...
<li>politician: sensitive person.</li>
<li>violation_photo: violation icon.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Sensitive person, violative icon name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Area coordinates (pixel-level) where sensitive persons or violation icons appear. Format: [x1, y1, x2, y2], which indicates the coordinates of the top-left corner and the bottom-right corner.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Suspected image URL (Images are not retained permanently upon arrival)
The image will be deleted after the PicUrlExpireTime time point.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Expiration time of the suspected image URL, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get Start PTS time of a suspected segment, in seconds. 
     * @return StartPtsTime Start PTS time of a suspected segment, in seconds.
     */
    public Float getStartPtsTime() {
        return this.StartPtsTime;
    }

    /**
     * Set Start PTS time of a suspected segment, in seconds.
     * @param StartPtsTime Start PTS time of a suspected segment, in seconds.
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
     * Get Sensitive score of the suspected segment. 
     * @return Confidence Sensitive score of the suspected segment.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Sensitive score of the suspected segment.
     * @param Confidence Sensitive score of the suspected segment.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Result suggestion for suspected segment porn detection, permissible range:
<li>pass</li>
<li>review</li>
<li>block</li> 
     * @return Suggestion Result suggestion for suspected segment porn detection, permissible range:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result suggestion for suspected segment porn detection, permissible range:
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion Result suggestion for suspected segment porn detection, permissible range:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Video sensitive result tag, value ranges from...to...
<li>politician: sensitive person.</li>
<li>violation_photo: violation icon.</li> 
     * @return Label Video sensitive result tag, value ranges from...to...
<li>politician: sensitive person.</li>
<li>violation_photo: violation icon.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Video sensitive result tag, value ranges from...to...
<li>politician: sensitive person.</li>
<li>violation_photo: violation icon.</li>
     * @param Label Video sensitive result tag, value ranges from...to...
<li>politician: sensitive person.</li>
<li>violation_photo: violation icon.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Sensitive person, violative icon name. 
     * @return Name Sensitive person, violative icon name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sensitive person, violative icon name.
     * @param Name Sensitive person, violative icon name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Area coordinates (pixel-level) where sensitive persons or violation icons appear. Format: [x1, y1, x2, y2], which indicates the coordinates of the top-left corner and the bottom-right corner. 
     * @return AreaCoordSet Area coordinates (pixel-level) where sensitive persons or violation icons appear. Format: [x1, y1, x2, y2], which indicates the coordinates of the top-left corner and the bottom-right corner.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Area coordinates (pixel-level) where sensitive persons or violation icons appear. Format: [x1, y1, x2, y2], which indicates the coordinates of the top-left corner and the bottom-right corner.
     * @param AreaCoordSet Area coordinates (pixel-level) where sensitive persons or violation icons appear. Format: [x1, y1, x2, y2], which indicates the coordinates of the top-left corner and the bottom-right corner.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get Suspected image URL (Images are not retained permanently upon arrival)
The image will be deleted after the PicUrlExpireTime time point. 
     * @return Url Suspected image URL (Images are not retained permanently upon arrival)
The image will be deleted after the PicUrlExpireTime time point.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Suspected image URL (Images are not retained permanently upon arrival)
The image will be deleted after the PicUrlExpireTime time point.
     * @param Url Suspected image URL (Images are not retained permanently upon arrival)
The image will be deleted after the PicUrlExpireTime time point.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Expiration time of the suspected image URL, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52). 
     * @return PicUrlExpireTime Expiration time of the suspected image URL, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of the suspected image URL, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     * @param PicUrlExpireTime Expiration time of the suspected image URL, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    public LiveStreamAiReviewImagePoliticalResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiReviewImagePoliticalResult(LiveStreamAiReviewImagePoliticalResult source) {
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "StartPtsTime", this.StartPtsTime);
        this.setParamSimple(map, prefix + "EndPtsTime", this.EndPtsTime);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

