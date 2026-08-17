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

public class MediaContentReviewPoliticalSegmentItem extends AbstractModel {

    /**
    * Start time offset of a suspected segment, in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a suspected segment, in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Suspected segment sensitivity score.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Suspected segment sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Sensitive person, violative icon name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Suspected segment sensitive result Tag. The mapping between the LabelSet parameter in the content moderation template [visual sensitive task control parameter](https://www.tencentcloud.com/document/api/862/37615?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the parameter value range of this parameter:
violation_photo:
<li>violation_photo: violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: sensitive person.</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: sensitive entertainment figure.</li>
sport:
<li>Sensitive_sport: sensitive sports celebrity.</li>
entrepreneur:
<li>sensitive_entrepreneur: sensitive entrepreneur.</li>
scholar:
<li>sensitive_scholar: Sensitive educational scholars.</li>
celebrity:
<li>sensitive_celebrity: sensitive celebrity.</li>
<li>historical_celebrity: historical celebrity.</li>
military:
<li>sensitive_military: sensitive military figure.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Suspected image URL (Images are not retained permanently upon arrival)
The image will be deleted after the PicUrlExpireTime time point.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Area coordinates of sensitive person and violation icon occurrence (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Expiration time of the suspected image URL, using the ISO date format (https://www.tencentcloud.com/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get Start time offset of a suspected segment, in seconds. 
     * @return StartTimeOffset Start time offset of a suspected segment, in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a suspected segment, in seconds.
     * @param StartTimeOffset Start time offset of a suspected segment, in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a suspected segment, in seconds. 
     * @return EndTimeOffset End time offset of a suspected segment, in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a suspected segment, in seconds.
     * @param EndTimeOffset End time offset of a suspected segment, in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Suspected segment sensitivity score. 
     * @return Confidence Suspected segment sensitivity score.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Suspected segment sensitivity score.
     * @param Confidence Suspected segment sensitivity score.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Suspected segment sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Suspected segment sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suspected segment sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Suspected segment sensitive result suggestion, value ranges from...to...
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
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
     * Get Suspected segment sensitive result Tag. The mapping between the LabelSet parameter in the content moderation template [visual sensitive task control parameter](https://www.tencentcloud.com/document/api/862/37615?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the parameter value range of this parameter:
violation_photo:
<li>violation_photo: violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: sensitive person.</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: sensitive entertainment figure.</li>
sport:
<li>Sensitive_sport: sensitive sports celebrity.</li>
entrepreneur:
<li>sensitive_entrepreneur: sensitive entrepreneur.</li>
scholar:
<li>sensitive_scholar: Sensitive educational scholars.</li>
celebrity:
<li>sensitive_celebrity: sensitive celebrity.</li>
<li>historical_celebrity: historical celebrity.</li>
military:
<li>sensitive_military: sensitive military figure.</li> 
     * @return Label Suspected segment sensitive result Tag. The mapping between the LabelSet parameter in the content moderation template [visual sensitive task control parameter](https://www.tencentcloud.com/document/api/862/37615?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the parameter value range of this parameter:
violation_photo:
<li>violation_photo: violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: sensitive person.</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: sensitive entertainment figure.</li>
sport:
<li>Sensitive_sport: sensitive sports celebrity.</li>
entrepreneur:
<li>sensitive_entrepreneur: sensitive entrepreneur.</li>
scholar:
<li>sensitive_scholar: Sensitive educational scholars.</li>
celebrity:
<li>sensitive_celebrity: sensitive celebrity.</li>
<li>historical_celebrity: historical celebrity.</li>
military:
<li>sensitive_military: sensitive military figure.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Suspected segment sensitive result Tag. The mapping between the LabelSet parameter in the content moderation template [visual sensitive task control parameter](https://www.tencentcloud.com/document/api/862/37615?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the parameter value range of this parameter:
violation_photo:
<li>violation_photo: violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: sensitive person.</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: sensitive entertainment figure.</li>
sport:
<li>Sensitive_sport: sensitive sports celebrity.</li>
entrepreneur:
<li>sensitive_entrepreneur: sensitive entrepreneur.</li>
scholar:
<li>sensitive_scholar: Sensitive educational scholars.</li>
celebrity:
<li>sensitive_celebrity: sensitive celebrity.</li>
<li>historical_celebrity: historical celebrity.</li>
military:
<li>sensitive_military: sensitive military figure.</li>
     * @param Label Suspected segment sensitive result Tag. The mapping between the LabelSet parameter in the content moderation template [visual sensitive task control parameter](https://www.tencentcloud.com/document/api/862/37615?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the parameter value range of this parameter:
violation_photo:
<li>violation_photo: violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: sensitive person.</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: sensitive entertainment figure.</li>
sport:
<li>Sensitive_sport: sensitive sports celebrity.</li>
entrepreneur:
<li>sensitive_entrepreneur: sensitive entrepreneur.</li>
scholar:
<li>sensitive_scholar: Sensitive educational scholars.</li>
celebrity:
<li>sensitive_celebrity: sensitive celebrity.</li>
<li>historical_celebrity: historical celebrity.</li>
military:
<li>sensitive_military: sensitive military figure.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
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
     * Get Area coordinates of sensitive person and violation icon occurrence (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner. 
     * @return AreaCoordSet Area coordinates of sensitive person and violation icon occurrence (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Area coordinates of sensitive person and violation icon occurrence (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner.
     * @param AreaCoordSet Area coordinates of sensitive person and violation icon occurrence (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
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

    public MediaContentReviewPoliticalSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaContentReviewPoliticalSegmentItem(MediaContentReviewPoliticalSegmentItem source) {
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

