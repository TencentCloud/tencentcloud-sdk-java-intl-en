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

public class MediaContentReviewPoliticalSegmentItem extends AbstractModel {

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
    * Suspected segment score.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Result suggestions for suspected segments involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Involves inappropriate information and violative icon names.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Result tag for suspected segments involving inappropriate information. Mapping between the LabelSet parameter in the task control parameter for frames involving inappropriate information in the audio/video moderation template (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: relevant people involved in rule violations;</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: banned people in the entertainment industry.</li>
sport:
<li>sensitive_sport: sports celebrity involved in rule violations.</li>
entrepreneur:
<li>sensitive_entrepreneur: commercial figure involved in rule violation.</li>
scholar:
<li>sensitive_scholar: Educational scholar with rule violation.</li>
celebrity:
<li>sensitive_celebrity: rule-violating celebrity;</li>
<li>historical_celebrity: historic celebrity.</li>
military:
<li>sensitive_military: relevant people involved in rule violation.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Suspected image URL (images are not retained permanently and will reach
Images will be deleted after the PicUrlExpireTime time point).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Coordinates of the area where inappropriate information or violation icons appear (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Deprecated. Please use PicUrlExpireTime.
    */
    @SerializedName("PicUrlExpireTimeStamp")
    @Expose
    private Long PicUrlExpireTimeStamp;

    /**
    * Expiration time of the suspected image URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
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
     * Get Suspected segment score. 
     * @return Confidence Suspected segment score.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Suspected segment score.
     * @param Confidence Suspected segment score.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Result suggestions for suspected segments involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Result suggestions for suspected segments involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result suggestions for suspected segments involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Result suggestions for suspected segments involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Involves inappropriate information and violative icon names. 
     * @return Name Involves inappropriate information and violative icon names.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Involves inappropriate information and violative icon names.
     * @param Name Involves inappropriate information and violative icon names.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Result tag for suspected segments involving inappropriate information. Mapping between the LabelSet parameter in the task control parameter for frames involving inappropriate information in the audio/video moderation template (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: relevant people involved in rule violations;</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: banned people in the entertainment industry.</li>
sport:
<li>sensitive_sport: sports celebrity involved in rule violations.</li>
entrepreneur:
<li>sensitive_entrepreneur: commercial figure involved in rule violation.</li>
scholar:
<li>sensitive_scholar: Educational scholar with rule violation.</li>
celebrity:
<li>sensitive_celebrity: rule-violating celebrity;</li>
<li>historical_celebrity: historic celebrity.</li>
military:
<li>sensitive_military: relevant people involved in rule violation.</li> 
     * @return Label Result tag for suspected segments involving inappropriate information. Mapping between the LabelSet parameter in the task control parameter for frames involving inappropriate information in the audio/video moderation template (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: relevant people involved in rule violations;</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: banned people in the entertainment industry.</li>
sport:
<li>sensitive_sport: sports celebrity involved in rule violations.</li>
entrepreneur:
<li>sensitive_entrepreneur: commercial figure involved in rule violation.</li>
scholar:
<li>sensitive_scholar: Educational scholar with rule violation.</li>
celebrity:
<li>sensitive_celebrity: rule-violating celebrity;</li>
<li>historical_celebrity: historic celebrity.</li>
military:
<li>sensitive_military: relevant people involved in rule violation.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Result tag for suspected segments involving inappropriate information. Mapping between the LabelSet parameter in the task control parameter for frames involving inappropriate information in the audio/video moderation template (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: relevant people involved in rule violations;</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: banned people in the entertainment industry.</li>
sport:
<li>sensitive_sport: sports celebrity involved in rule violations.</li>
entrepreneur:
<li>sensitive_entrepreneur: commercial figure involved in rule violation.</li>
scholar:
<li>sensitive_scholar: Educational scholar with rule violation.</li>
celebrity:
<li>sensitive_celebrity: rule-violating celebrity;</li>
<li>historical_celebrity: historic celebrity.</li>
military:
<li>sensitive_military: relevant people involved in rule violation.</li>
     * @param Label Result tag for suspected segments involving inappropriate information. Mapping between the LabelSet parameter in the task control parameter for frames involving inappropriate information in the audio/video moderation template (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
politician:
<li>nation_politician: State leaders;</li>
<li>province_politician: provincial and ministerial leaders;</li>
<li>bureau_politician: bureau-level official;</li>
<li>county_politician: county-level official;</li>
<li>rural_politician: township-level official;</li>
<li>sensitive_politician: relevant people involved in rule violations;</li>
<li>foreign_politician: state leaders of other countries.</li>
entertainment:
<li>sensitive_entertainment: banned people in the entertainment industry.</li>
sport:
<li>sensitive_sport: sports celebrity involved in rule violations.</li>
entrepreneur:
<li>sensitive_entrepreneur: commercial figure involved in rule violation.</li>
scholar:
<li>sensitive_scholar: Educational scholar with rule violation.</li>
celebrity:
<li>sensitive_celebrity: rule-violating celebrity;</li>
<li>historical_celebrity: historic celebrity.</li>
military:
<li>sensitive_military: relevant people involved in rule violation.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Suspected image URL (images are not retained permanently and will reach
Images will be deleted after the PicUrlExpireTime time point). 
     * @return Url Suspected image URL (images are not retained permanently and will reach
Images will be deleted after the PicUrlExpireTime time point).
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Suspected image URL (images are not retained permanently and will reach
Images will be deleted after the PicUrlExpireTime time point).
     * @param Url Suspected image URL (images are not retained permanently and will reach
Images will be deleted after the PicUrlExpireTime time point).
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Coordinates of the area where inappropriate information or violation icons appear (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner. 
     * @return AreaCoordSet Coordinates of the area where inappropriate information or violation icons appear (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Coordinates of the area where inappropriate information or violation icons appear (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner.
     * @param AreaCoordSet Coordinates of the area where inappropriate information or violation icons appear (pixel-level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get Deprecated. Please use PicUrlExpireTime. 
     * @return PicUrlExpireTimeStamp Deprecated. Please use PicUrlExpireTime.
     * @deprecated
     */
    @Deprecated
    public Long getPicUrlExpireTimeStamp() {
        return this.PicUrlExpireTimeStamp;
    }

    /**
     * Set Deprecated. Please use PicUrlExpireTime.
     * @param PicUrlExpireTimeStamp Deprecated. Please use PicUrlExpireTime.
     * @deprecated
     */
    @Deprecated
    public void setPicUrlExpireTimeStamp(Long PicUrlExpireTimeStamp) {
        this.PicUrlExpireTimeStamp = PicUrlExpireTimeStamp;
    }

    /**
     * Get Expiration time of the suspected image URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return PicUrlExpireTime Expiration time of the suspected image URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of the suspected image URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param PicUrlExpireTime Expiration time of the suspected image URL in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
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
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "PicUrlExpireTimeStamp", this.PicUrlExpireTimeStamp);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

