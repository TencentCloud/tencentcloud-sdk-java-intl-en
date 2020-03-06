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

public class MediaContentReviewOcrTextSegmentItem extends AbstractModel{

    /**
    * Start time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Confidence of suspected segment.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Suggestion for suspected segment audit. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * List of suspected keywords.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
    * Zone coordinates (at the pixel level) of suspected text: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * URL of a suspected image (which will not be permanently stored
and will be deleted after `PicUrlExpireTime`).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Expiration time of suspected image URL in [ISO date format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get Start time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StartTimeOffset Start time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StartTimeOffset Start time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EndTimeOffset End time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EndTimeOffset End time offset of suspected segment in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Confidence of suspected segment.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Confidence Confidence of suspected segment.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of suspected segment.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Confidence Confidence of suspected segment.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Suggestion for suspected segment audit. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion Suggestion for suspected segment audit. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for suspected segment audit. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Suggestion Suggestion for suspected segment audit. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get List of suspected keywords.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return KeywordSet List of suspected keywords.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set List of suspected keywords.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param KeywordSet List of suspected keywords.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    /**
     * Get Zone coordinates (at the pixel level) of suspected text: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AreaCoordSet Zone coordinates (at the pixel level) of suspected text: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Zone coordinates (at the pixel level) of suspected text: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AreaCoordSet Zone coordinates (at the pixel level) of suspected text: [x1, y1, x2, y2], i.e., the coordinates of the top-left and bottom-right corners.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
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
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

