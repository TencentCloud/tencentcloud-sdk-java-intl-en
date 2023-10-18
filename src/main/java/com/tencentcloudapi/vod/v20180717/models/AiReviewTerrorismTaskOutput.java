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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiReviewTerrorismTaskOutput extends AbstractModel {

    /**
    * Score of detected terrorism information in a video between 0 and 100.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Suggestion for detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Tag of the detected terrorism information in a video. Valid values:
<li>`guns`: weapons and guns</li>
<li>`crowd`: crowds</li>
<li>`police`: police forces</li>
<li>`bloody`: bloody images</li>
<li>`banners`: terrorism flags</li>
<li>`militant`: militants</li>
<li>`explosion`: explosions and fires</li>
<li>`terrorists`: terrorists</li>
<li>`scenario`: terrorism images</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * List of video segments that contain terrorism information
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`.
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewSegmentItem [] SegmentSet;

    /**
    * URL to the file for video segments that contain terrorism information. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`.
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Expiration time of the URL to the file for video segments that contain terrorism information, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get Score of detected terrorism information in a video between 0 and 100.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Confidence Score of detected terrorism information in a video between 0 and 100.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of detected terrorism information in a video between 0 and 100.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Confidence Score of detected terrorism information in a video between 0 and 100.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Suggestion for detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion Suggestion for detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggestion for detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Suggestion Suggestion for detected terrorism information. Valid values:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Tag of the detected terrorism information in a video. Valid values:
<li>`guns`: weapons and guns</li>
<li>`crowd`: crowds</li>
<li>`police`: police forces</li>
<li>`bloody`: bloody images</li>
<li>`banners`: terrorism flags</li>
<li>`militant`: militants</li>
<li>`explosion`: explosions and fires</li>
<li>`terrorists`: terrorists</li>
<li>`scenario`: terrorism images</li> 
     * @return Label Tag of the detected terrorism information in a video. Valid values:
<li>`guns`: weapons and guns</li>
<li>`crowd`: crowds</li>
<li>`police`: police forces</li>
<li>`bloody`: bloody images</li>
<li>`banners`: terrorism flags</li>
<li>`militant`: militants</li>
<li>`explosion`: explosions and fires</li>
<li>`terrorists`: terrorists</li>
<li>`scenario`: terrorism images</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Tag of the detected terrorism information in a video. Valid values:
<li>`guns`: weapons and guns</li>
<li>`crowd`: crowds</li>
<li>`police`: police forces</li>
<li>`bloody`: bloody images</li>
<li>`banners`: terrorism flags</li>
<li>`militant`: militants</li>
<li>`explosion`: explosions and fires</li>
<li>`terrorists`: terrorists</li>
<li>`scenario`: terrorism images</li>
     * @param Label Tag of the detected terrorism information in a video. Valid values:
<li>`guns`: weapons and guns</li>
<li>`crowd`: crowds</li>
<li>`police`: police forces</li>
<li>`bloody`: bloody images</li>
<li>`banners`: terrorism flags</li>
<li>`militant`: militants</li>
<li>`explosion`: explosions and fires</li>
<li>`terrorists`: terrorists</li>
<li>`scenario`: terrorism images</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get List of video segments that contain terrorism information
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`. 
     * @return SegmentSet List of video segments that contain terrorism information
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`.
     */
    public MediaContentReviewSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of video segments that contain terrorism information
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`.
     * @param SegmentSet List of video segments that contain terrorism information
<font color=red>Note</font>: This list displays the first 100 results at most. You can get all the results from the file at the URL specified by `SegmentSetFileUrl`.
     */
    public void setSegmentSet(MediaContentReviewSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL to the file for video segments that contain terrorism information. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`. 
     * @return SegmentSetFileUrl URL to the file for video segments that contain terrorism information. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`.
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL to the file for video segments that contain terrorism information. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`.
     * @param SegmentSetFileUrl URL to the file for video segments that contain terrorism information. The file is in JSON format and has the same data structure as `SegmentSet`. Instead of being saved permanently, the file is deleted upon the expiration time specified by `SegmentSetFileUrlExpireTime`.
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Expiration time of the URL to the file for video segments that contain terrorism information, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) 
     * @return SegmentSetFileUrlExpireTime Expiration time of the URL to the file for video segments that contain terrorism information, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL to the file for video segments that contain terrorism information, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     * @param SegmentSetFileUrlExpireTime Expiration time of the URL to the file for video segments that contain terrorism information, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format)
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public AiReviewTerrorismTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiReviewTerrorismTaskOutput(AiReviewTerrorismTaskOutput source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new MediaContentReviewSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new MediaContentReviewSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

