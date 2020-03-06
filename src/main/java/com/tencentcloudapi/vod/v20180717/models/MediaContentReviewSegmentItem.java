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

public class MediaContentReviewSegmentItem extends AbstractModel{

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
    * Score of a suspected porn segment.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Tag of porn information detection result of a suspected segment.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * URL of a suspected image (which will not be permanently stored
 and will be deleted after `PicUrlExpireTime`).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * This field has been disused. Please use `PicUrlExpireTime`.
    */
    @SerializedName("PicUrlExpireTimeStamp")
    @Expose
    private Long PicUrlExpireTimeStamp;

    /**
    * Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
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
     * Get Score of a suspected porn segment. 
     * @return Confidence Score of a suspected porn segment.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of a suspected porn segment.
     * @param Confidence Score of a suspected porn segment.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Tag of porn information detection result of a suspected segment. 
     * @return Label Tag of porn information detection result of a suspected segment.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of porn information detection result of a suspected segment.
     * @param Label Tag of porn information detection result of a suspected segment.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Suggestion for porn information detection of a suspected segment. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
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
     * Get Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return PicUrlExpireTime Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param PicUrlExpireTime Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
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

