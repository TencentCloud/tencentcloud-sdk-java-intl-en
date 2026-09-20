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

public class ReviewAudioVideoTaskOutput extends AbstractModel {

    /**
    * Result suggestion for audio/video content moderation. Value range:
<li>pass: It is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Valid when Suggestion is review or block. Indicates the most likely rule violation tag of the audio and video. Value range:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Valid when Suggestion is review or block. It indicates the most likely prohibited forms of audio and video. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * List of video clips suspected of containing violation information.
<font color=red>Note</font>: This list can only display up to the first 10 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private ReviewAudioVideoSegmentItem [] SegmentSet;

    /**
    * URL of the video clip list file involved in suspicion of violation information. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached.
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * URL expiry time of the list of video clips suspected of involving violation information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
    * Cover review result.
    */
    @SerializedName("CoverReviewResult")
    @Expose
    private ReviewImageResult CoverReviewResult;

    /**
     * Get Result suggestion for audio/video content moderation. Value range:
<li>pass: It is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li> 
     * @return Suggestion Result suggestion for audio/video content moderation. Value range:
<li>pass: It is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result suggestion for audio/video content moderation. Value range:
<li>pass: It is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li>
     * @param Suggestion Result suggestion for audio/video content moderation. Value range:
<li>pass: It is recommended to pass;</li>
<li>review: suggest re-examination;</li>
<li>block: suggest banning.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Valid when Suggestion is review or block. Indicates the most likely rule violation tag of the audio and video. Value range:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li> 
     * @return Label Valid when Suggestion is review or block. Indicates the most likely rule violation tag of the audio and video. Value range:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Valid when Suggestion is review or block. Indicates the most likely rule violation tag of the audio and video. Value range:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
     * @param Label Valid when Suggestion is review or block. Indicates the most likely rule violation tag of the audio and video. Value range:
<li>Porn: pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Valid when Suggestion is review or block. It indicates the most likely prohibited forms of audio and video. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li> 
     * @return Form Valid when Suggestion is review or block. It indicates the most likely prohibited forms of audio and video. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set Valid when Suggestion is review or block. It indicates the most likely prohibited forms of audio and video. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
     * @param Form Valid when Suggestion is review or block. It indicates the most likely prohibited forms of audio and video. Value range:
<li>Image: people or icons in the image;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get List of video clips suspected of containing violation information.
<font color=red>Note</font>: This list can only display up to the first 10 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl. 
     * @return SegmentSet List of video clips suspected of containing violation information.
<font color=red>Note</font>: This list can only display up to the first 10 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public ReviewAudioVideoSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of video clips suspected of containing violation information.
<font color=red>Note</font>: This list can only display up to the first 10 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     * @param SegmentSet List of video clips suspected of containing violation information.
<font color=red>Note</font>: This list can only display up to the first 10 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public void setSegmentSet(ReviewAudioVideoSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL of the video clip list file involved in suspicion of violation information. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached. 
     * @return SegmentSetFileUrl URL of the video clip list file involved in suspicion of violation information. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached.
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL of the video clip list file involved in suspicion of violation information. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached.
     * @param SegmentSetFileUrl URL of the video clip list file involved in suspicion of violation information. The content of the file is JSON, and the data structure is consistent with the SegmentSet fields. The file is not retained permanently and will be deleted after the SegmentSetFileUrlExpireTime time point is reached.
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get URL expiry time of the list of video clips suspected of involving violation information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return SegmentSetFileUrlExpireTime URL expiry time of the list of video clips suspected of involving violation information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set URL expiry time of the list of video clips suspected of involving violation information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param SegmentSetFileUrlExpireTime URL expiry time of the list of video clips suspected of involving violation information in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    /**
     * Get Cover review result. 
     * @return CoverReviewResult Cover review result.
     */
    public ReviewImageResult getCoverReviewResult() {
        return this.CoverReviewResult;
    }

    /**
     * Set Cover review result.
     * @param CoverReviewResult Cover review result.
     */
    public void setCoverReviewResult(ReviewImageResult CoverReviewResult) {
        this.CoverReviewResult = CoverReviewResult;
    }

    public ReviewAudioVideoTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewAudioVideoTaskOutput(ReviewAudioVideoTaskOutput source) {
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Form != null) {
            this.Form = new String(source.Form);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new ReviewAudioVideoSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new ReviewAudioVideoSegmentItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
        if (source.CoverReviewResult != null) {
            this.CoverReviewResult = new ReviewImageResult(source.CoverReviewResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Form", this.Form);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);
        this.setParamObj(map, prefix + "CoverReviewResult.", this.CoverReviewResult);

    }
}

