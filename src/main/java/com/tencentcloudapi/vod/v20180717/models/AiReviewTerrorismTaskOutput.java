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

public class AiReviewTerrorismTaskOutput extends AbstractModel {

    /**
    * Video terrorism score. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Terrorism result suggestion. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Video terrorism result tag. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: violent and terrorist flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: violent and terrorist persons.</li>
<li>scenario: violent and terrorist scene.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * List of video segments with suspected terrorism.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewSegmentItem [] SegmentSet;

    /**
    * URL of the Segment List File for suspected terrorism. The file content is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * File URL expiration time of the suspected terrorism video segment list in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get Video terrorism score. Value range: 0-100. 
     * @return Confidence Video terrorism score. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Video terrorism score. Value range: 0-100.
     * @param Confidence Video terrorism score. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Terrorism result suggestion. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li> 
     * @return Suggestion Terrorism result suggestion. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Terrorism result suggestion. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     * @param Suggestion Terrorism result suggestion. Value range:
<li>pass.</li>
<li>review.</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Video terrorism result tag. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: violent and terrorist flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: violent and terrorist persons.</li>
<li>scenario: violent and terrorist scene.</li> 
     * @return Label Video terrorism result tag. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: violent and terrorist flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: violent and terrorist persons.</li>
<li>scenario: violent and terrorist scene.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Video terrorism result tag. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: violent and terrorist flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: violent and terrorist persons.</li>
<li>scenario: violent and terrorist scene.</li>
     * @param Label Video terrorism result tag. Value range:
<li>guns: weapons and firearms.</li>
<li>crowd: crowd gathering.</li>
<li>police: police force.</li>
<li>bloody: graphic violence.</li>
<li>banners: violent and terrorist flags.</li>
<li>militant: militants.</li>
<li>explosion: explosions and fires.</li>
<li>terrorists: violent and terrorist persons.</li>
<li>scenario: violent and terrorist scene.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get List of video segments with suspected terrorism.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl. 
     * @return SegmentSet List of video segments with suspected terrorism.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public MediaContentReviewSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of video segments with suspected terrorism.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     * @param SegmentSet List of video segments with suspected terrorism.
<font color=red>Note</font>: This list can only display up to the first 100 elements. To obtain the complete result, get it from the file corresponding to SegmentSetFileUrl.
     */
    public void setSegmentSet(MediaContentReviewSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL of the Segment List File for suspected terrorism. The file content is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.) 
     * @return SegmentSetFileUrl URL of the Segment List File for suspected terrorism. The file content is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL of the Segment List File for suspected terrorism. The file content is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)
     * @param SegmentSetFileUrl URL of the Segment List File for suspected terrorism. The file content is in JSON format, and its data structure is consistent with the fields of SegmentSet. (The file is not retained permanently. It will be deleted after reaching the SegmentSetFileUrlExpireTime time point.)
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get File URL expiration time of the suspected terrorism video segment list in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return SegmentSetFileUrlExpireTime File URL expiration time of the suspected terrorism video segment list in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set File URL expiration time of the suspected terrorism video segment list in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param SegmentSetFileUrlExpireTime File URL expiration time of the suspected terrorism video segment list in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
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

