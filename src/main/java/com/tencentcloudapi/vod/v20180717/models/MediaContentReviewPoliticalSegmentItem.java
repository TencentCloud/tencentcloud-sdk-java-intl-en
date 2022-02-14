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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaContentReviewPoliticalSegmentItem extends AbstractModel{

    /**
    * Start time offset of a suspected segment in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of a suspected segment in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Confidence score for the detected politically sensitive content
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Processing suggestion for the detected politically sensitive content. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Name of the politically sensitive content or banned images
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Labels for the detected politically sensitive content. The relationship between the values of this parameter and those of the `LabelSet` parameter in [PoliticalImgReviewTemplateInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) is as follows:
violation_photo:
<li>`violation_photo`: banned images</li>
politician:
<li>`nation_politician`: state leader of China</li>
<li>`province_politician`: provincial officials</li>
<li>`bureau_politician`: bureau-level officials</li>
<li>`county_politician`: county-level officials</li>
<li>`rural_politician`: township-level officials</li>
<li>`sensitive_politician`: politically sensitive people</li>
<li>`foreign_politician`: state leaders of other countries</li>
entertainment:
<li>`sensitive_entertainment`: banned people in the entertainment industry</li>
sport:
<li>`sensitive_sport`: banned sports celebrities</li>
entrepreneur:
<li>`sensitive_entrepreneur`: banned businesspeople</li>
scholar:
<li>sensitive_scholar: banned scholars</li>
celebrity:
<li>sensitive_celebrity: banned celebrities</li>
<li>historical_celebrity: banned historical figures</li>
military:
<li>sensitive_military: banned people in military</li>
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
    * Coordinates (pixel) of the detected politically sensitive content or banned icons. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * This field has been disused. Please use `PicUrlExpireTime`.
    */
    @SerializedName("PicUrlExpireTimeStamp")
    @Expose
    private Long PicUrlExpireTimeStamp;

    /**
    * Expiration time of suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get Start time offset of a suspected segment in seconds. 
     * @return StartTimeOffset Start time offset of a suspected segment in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of a suspected segment in seconds.
     * @param StartTimeOffset Start time offset of a suspected segment in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of a suspected segment in seconds. 
     * @return EndTimeOffset End time offset of a suspected segment in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of a suspected segment in seconds.
     * @param EndTimeOffset End time offset of a suspected segment in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Confidence score for the detected politically sensitive content 
     * @return Confidence Confidence score for the detected politically sensitive content
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence score for the detected politically sensitive content
     * @param Confidence Confidence score for the detected politically sensitive content
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Processing suggestion for the detected politically sensitive content. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li> 
     * @return Suggestion Processing suggestion for the detected politically sensitive content. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Processing suggestion for the detected politically sensitive content. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     * @param Suggestion Processing suggestion for the detected politically sensitive content. Valid values:
<li>pass</li>
<li>review</li>
<li>block</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Name of the politically sensitive content or banned images 
     * @return Name Name of the politically sensitive content or banned images
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the politically sensitive content or banned images
     * @param Name Name of the politically sensitive content or banned images
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Labels for the detected politically sensitive content. The relationship between the values of this parameter and those of the `LabelSet` parameter in [PoliticalImgReviewTemplateInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) is as follows:
violation_photo:
<li>`violation_photo`: banned images</li>
politician:
<li>`nation_politician`: state leader of China</li>
<li>`province_politician`: provincial officials</li>
<li>`bureau_politician`: bureau-level officials</li>
<li>`county_politician`: county-level officials</li>
<li>`rural_politician`: township-level officials</li>
<li>`sensitive_politician`: politically sensitive people</li>
<li>`foreign_politician`: state leaders of other countries</li>
entertainment:
<li>`sensitive_entertainment`: banned people in the entertainment industry</li>
sport:
<li>`sensitive_sport`: banned sports celebrities</li>
entrepreneur:
<li>`sensitive_entrepreneur`: banned businesspeople</li>
scholar:
<li>sensitive_scholar: banned scholars</li>
celebrity:
<li>sensitive_celebrity: banned celebrities</li>
<li>historical_celebrity: banned historical figures</li>
military:
<li>sensitive_military: banned people in military</li> 
     * @return Label Labels for the detected politically sensitive content. The relationship between the values of this parameter and those of the `LabelSet` parameter in [PoliticalImgReviewTemplateInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) is as follows:
violation_photo:
<li>`violation_photo`: banned images</li>
politician:
<li>`nation_politician`: state leader of China</li>
<li>`province_politician`: provincial officials</li>
<li>`bureau_politician`: bureau-level officials</li>
<li>`county_politician`: county-level officials</li>
<li>`rural_politician`: township-level officials</li>
<li>`sensitive_politician`: politically sensitive people</li>
<li>`foreign_politician`: state leaders of other countries</li>
entertainment:
<li>`sensitive_entertainment`: banned people in the entertainment industry</li>
sport:
<li>`sensitive_sport`: banned sports celebrities</li>
entrepreneur:
<li>`sensitive_entrepreneur`: banned businesspeople</li>
scholar:
<li>sensitive_scholar: banned scholars</li>
celebrity:
<li>sensitive_celebrity: banned celebrities</li>
<li>historical_celebrity: banned historical figures</li>
military:
<li>sensitive_military: banned people in military</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Labels for the detected politically sensitive content. The relationship between the values of this parameter and those of the `LabelSet` parameter in [PoliticalImgReviewTemplateInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) is as follows:
violation_photo:
<li>`violation_photo`: banned images</li>
politician:
<li>`nation_politician`: state leader of China</li>
<li>`province_politician`: provincial officials</li>
<li>`bureau_politician`: bureau-level officials</li>
<li>`county_politician`: county-level officials</li>
<li>`rural_politician`: township-level officials</li>
<li>`sensitive_politician`: politically sensitive people</li>
<li>`foreign_politician`: state leaders of other countries</li>
entertainment:
<li>`sensitive_entertainment`: banned people in the entertainment industry</li>
sport:
<li>`sensitive_sport`: banned sports celebrities</li>
entrepreneur:
<li>`sensitive_entrepreneur`: banned businesspeople</li>
scholar:
<li>sensitive_scholar: banned scholars</li>
celebrity:
<li>sensitive_celebrity: banned celebrities</li>
<li>historical_celebrity: banned historical figures</li>
military:
<li>sensitive_military: banned people in military</li>
     * @param Label Labels for the detected politically sensitive content. The relationship between the values of this parameter and those of the `LabelSet` parameter in [PoliticalImgReviewTemplateInfo](https://intl.cloud.tencent.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) is as follows:
violation_photo:
<li>`violation_photo`: banned images</li>
politician:
<li>`nation_politician`: state leader of China</li>
<li>`province_politician`: provincial officials</li>
<li>`bureau_politician`: bureau-level officials</li>
<li>`county_politician`: county-level officials</li>
<li>`rural_politician`: township-level officials</li>
<li>`sensitive_politician`: politically sensitive people</li>
<li>`foreign_politician`: state leaders of other countries</li>
entertainment:
<li>`sensitive_entertainment`: banned people in the entertainment industry</li>
sport:
<li>`sensitive_sport`: banned sports celebrities</li>
entrepreneur:
<li>`sensitive_entrepreneur`: banned businesspeople</li>
scholar:
<li>sensitive_scholar: banned scholars</li>
celebrity:
<li>sensitive_celebrity: banned celebrities</li>
<li>historical_celebrity: banned historical figures</li>
military:
<li>sensitive_military: banned people in military</li>
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
     * Get Coordinates (pixel) of the detected politically sensitive content or banned icons. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners. 
     * @return AreaCoordSet Coordinates (pixel) of the detected politically sensitive content or banned icons. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Coordinates (pixel) of the detected politically sensitive content or banned icons. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners.
     * @param AreaCoordSet Coordinates (pixel) of the detected politically sensitive content or banned icons. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get This field has been disused. Please use `PicUrlExpireTime`. 
     * @return PicUrlExpireTimeStamp This field has been disused. Please use `PicUrlExpireTime`.
     */
    public Long getPicUrlExpireTimeStamp() {
        return this.PicUrlExpireTimeStamp;
    }

    /**
     * Set This field has been disused. Please use `PicUrlExpireTime`.
     * @param PicUrlExpireTimeStamp This field has been disused. Please use `PicUrlExpireTime`.
     */
    public void setPicUrlExpireTimeStamp(Long PicUrlExpireTimeStamp) {
        this.PicUrlExpireTimeStamp = PicUrlExpireTimeStamp;
    }

    /**
     * Get Expiration time of suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return PicUrlExpireTime Expiration time of suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param PicUrlExpireTime Expiration time of suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
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

