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

public class AiReviewPoliticalTaskOutput extends AbstractModel {

    /**
    * Score of inappropriate information in the video. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Result suggestions involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Result tag for videos involving inappropriate information. Mapping between the LabelSet parameter in the screen image authentication task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) of the audio/video moderation template and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
Other (politician/entertainment/sport/entrepreneur/scholar/celebrity/military):
<li>politician: relevant people.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * List of video segments suspected of involving inappropriate information.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewPoliticalSegmentItem [] SegmentSet;

    /**
    * URL of the segment list file that may contain inappropriate information. The file content is in JSON format, and its data structure is consistent with the SegmentSet fields. (The file will not be retained permanently. It will be deleted after the SegmentSetFileUrlExpireTime is reached.)
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Expiration time of the URL of the Segment List File of the video suspected of involving inappropriate information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get Score of inappropriate information in the video. Value range: 0-100. 
     * @return Confidence Score of inappropriate information in the video. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of inappropriate information in the video. Value range: 0-100.
     * @param Confidence Score of inappropriate information in the video. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Result suggestions involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Result suggestions involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result suggestions involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Result suggestions involving inappropriate information. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Result tag for videos involving inappropriate information. Mapping between the LabelSet parameter in the screen image authentication task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) of the audio/video moderation template and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
Other (politician/entertainment/sport/entrepreneur/scholar/celebrity/military):
<li>politician: relevant people.</li> 
     * @return Label Result tag for videos involving inappropriate information. Mapping between the LabelSet parameter in the screen image authentication task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) of the audio/video moderation template and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
Other (politician/entertainment/sport/entrepreneur/scholar/celebrity/military):
<li>politician: relevant people.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Result tag for videos involving inappropriate information. Mapping between the LabelSet parameter in the screen image authentication task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) of the audio/video moderation template and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
Other (politician/entertainment/sport/entrepreneur/scholar/celebrity/military):
<li>politician: relevant people.</li>
     * @param Label Result tag for videos involving inappropriate information. Mapping between the LabelSet parameter in the screen image authentication task control parameter (https://www.tencentcloud.com/document/api/266/31773?from_cn_redirect=1#PoliticalImgReviewTemplateInfo) of the audio/video moderation template and the value range of this parameter:
violation_photo:
<li>violation_photo: Violation icon.</li>
Other (politician/entertainment/sport/entrepreneur/scholar/celebrity/military):
<li>politician: relevant people.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get List of video segments suspected of involving inappropriate information.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl. 
     * @return SegmentSet List of video segments suspected of involving inappropriate information.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public MediaContentReviewPoliticalSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of video segments suspected of involving inappropriate information.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     * @param SegmentSet List of video segments suspected of involving inappropriate information.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public void setSegmentSet(MediaContentReviewPoliticalSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL of the segment list file that may contain inappropriate information. The file content is in JSON format, and its data structure is consistent with the SegmentSet fields. (The file will not be retained permanently. It will be deleted after the SegmentSetFileUrlExpireTime is reached.) 
     * @return SegmentSetFileUrl URL of the segment list file that may contain inappropriate information. The file content is in JSON format, and its data structure is consistent with the SegmentSet fields. (The file will not be retained permanently. It will be deleted after the SegmentSetFileUrlExpireTime is reached.)
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL of the segment list file that may contain inappropriate information. The file content is in JSON format, and its data structure is consistent with the SegmentSet fields. (The file will not be retained permanently. It will be deleted after the SegmentSetFileUrlExpireTime is reached.)
     * @param SegmentSetFileUrl URL of the segment list file that may contain inappropriate information. The file content is in JSON format, and its data structure is consistent with the SegmentSet fields. (The file will not be retained permanently. It will be deleted after the SegmentSetFileUrlExpireTime is reached.)
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Expiration time of the URL of the Segment List File of the video suspected of involving inappropriate information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return SegmentSetFileUrlExpireTime Expiration time of the URL of the Segment List File of the video suspected of involving inappropriate information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the URL of the Segment List File of the video suspected of involving inappropriate information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param SegmentSetFileUrlExpireTime Expiration time of the URL of the Segment List File of the video suspected of involving inappropriate information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public AiReviewPoliticalTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiReviewPoliticalTaskOutput(AiReviewPoliticalTaskOutput source) {
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
            this.SegmentSet = new MediaContentReviewPoliticalSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new MediaContentReviewPoliticalSegmentItem(source.SegmentSet[i]);
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

