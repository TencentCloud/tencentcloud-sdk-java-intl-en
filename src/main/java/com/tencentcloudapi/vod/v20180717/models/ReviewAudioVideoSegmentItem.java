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

public class ReviewAudioVideoSegmentItem extends AbstractModel {

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
    * Score of offensive information involved in suspected clips.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Result suggestions for identifying violations in suspected clips. Value range:
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Most likely rule violation tag of the suspected segment. Value range:
<li>Porn: Pornography;</li>
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
    * Rule-violating subtag.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * Suspected segment violation type. Value range:
<li>Image: people or icons on the screen;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * Valid when Form is Image or OCR. Indicates the pixel-level coordinates of the area where the suspect, icon, or text appears, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Valid when Form is OCR or ASR. It indicates the recognized OCR or ASR text content.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Valid when Form is OCR or ASR. It indicates the list of violation keywords hit by suspicious fragments.
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
    * Suspected image URL (images are not retained permanently and will be deleted after reaching
Images will be deleted after the PicUrlExpireTime time point).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Expiration time of the suspected image URL in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
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
     * Get Score of offensive information involved in suspected clips. 
     * @return Confidence Score of offensive information involved in suspected clips.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Score of offensive information involved in suspected clips.
     * @param Confidence Score of offensive information involved in suspected clips.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Result suggestions for identifying violations in suspected clips. Value range:
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li> 
     * @return Suggestion Result suggestions for identifying violations in suspected clips. Value range:
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result suggestions for identifying violations in suspected clips. Value range:
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li>
     * @param Suggestion Result suggestions for identifying violations in suspected clips. Value range:
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Most likely rule violation tag of the suspected segment. Value range:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li> 
     * @return Label Most likely rule violation tag of the suspected segment. Value range:
<li>Porn: Pornography;</li>
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
     * Set Most likely rule violation tag of the suspected segment. Value range:
<li>Porn: Pornography;</li>
<li>Terror: violence.</li>
<li>Polity: inappropriate information;</li>
<li>Ad: advertisement;</li>
<li>Illegal: illegal activities;</li>
<li>Abuse: abusive language;</li>
<li>Moan: panting.</li>
     * @param Label Most likely rule violation tag of the suspected segment. Value range:
<li>Porn: Pornography;</li>
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
     * Get Rule-violating subtag. 
     * @return SubLabel Rule-violating subtag.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set Rule-violating subtag.
     * @param SubLabel Rule-violating subtag.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get Suspected segment violation type. Value range:
<li>Image: people or icons on the screen;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li> 
     * @return Form Suspected segment violation type. Value range:
<li>Image: people or icons on the screen;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set Suspected segment violation type. Value range:
<li>Image: people or icons on the screen;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
     * @param Form Suspected segment violation type. Value range:
<li>Image: people or icons on the screen;</li>
<li>OCR: text on the screen;</li>
<li>ASR: text in speech.</li>
<li>Voice: sound.</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get Valid when Form is Image or OCR. Indicates the pixel-level coordinates of the area where the suspect, icon, or text appears, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner. 
     * @return AreaCoordSet Valid when Form is Image or OCR. Indicates the pixel-level coordinates of the area where the suspect, icon, or text appears, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Valid when Form is Image or OCR. Indicates the pixel-level coordinates of the area where the suspect, icon, or text appears, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.
     * @param AreaCoordSet Valid when Form is Image or OCR. Indicates the pixel-level coordinates of the area where the suspect, icon, or text appears, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get Valid when Form is OCR or ASR. It indicates the recognized OCR or ASR text content. 
     * @return Text Valid when Form is OCR or ASR. It indicates the recognized OCR or ASR text content.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Valid when Form is OCR or ASR. It indicates the recognized OCR or ASR text content.
     * @param Text Valid when Form is OCR or ASR. It indicates the recognized OCR or ASR text content.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Valid when Form is OCR or ASR. It indicates the list of violation keywords hit by suspicious fragments. 
     * @return KeywordSet Valid when Form is OCR or ASR. It indicates the list of violation keywords hit by suspicious fragments.
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set Valid when Form is OCR or ASR. It indicates the list of violation keywords hit by suspicious fragments.
     * @param KeywordSet Valid when Form is OCR or ASR. It indicates the list of violation keywords hit by suspicious fragments.
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    /**
     * Get Suspected image URL (images are not retained permanently and will be deleted after reaching
Images will be deleted after the PicUrlExpireTime time point). 
     * @return Url Suspected image URL (images are not retained permanently and will be deleted after reaching
Images will be deleted after the PicUrlExpireTime time point).
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Suspected image URL (images are not retained permanently and will be deleted after reaching
Images will be deleted after the PicUrlExpireTime time point).
     * @param Url Suspected image URL (images are not retained permanently and will be deleted after reaching
Images will be deleted after the PicUrlExpireTime time point).
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Expiration time of the suspected image URL in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return PicUrlExpireTime Expiration time of the suspected image URL in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set Expiration time of the suspected image URL in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param PicUrlExpireTime Expiration time of the suspected image URL in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    public ReviewAudioVideoSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewAudioVideoSegmentItem(ReviewAudioVideoSegmentItem source) {
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
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Form != null) {
            this.Form = new String(source.Form);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.KeywordSet != null) {
            this.KeywordSet = new String[source.KeywordSet.length];
            for (int i = 0; i < source.KeywordSet.length; i++) {
                this.KeywordSet[i] = new String(source.KeywordSet[i]);
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
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Form", this.Form);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

