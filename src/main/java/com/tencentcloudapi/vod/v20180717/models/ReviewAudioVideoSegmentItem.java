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

public class ReviewAudioVideoSegmentItem extends AbstractModel{

    /**
    * The start time offset (seconds) of the segment.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * The end time offset (seconds) of the segment.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * The confidence score of the segment.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The processing suggestion for the segment. Valid values:
<li>review: The content may be non-compliant. Please review it.</li>
<li>block: The content is non-compliant. We recommend you block it.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * The most likely label for the segment. Valid values:
<li>Porn</li>
<li>Terrorism</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * The sublabel for the segment. This parameter is valid only if `Form` is `Image` or `Voice`.
Valid values when `Form` is `Image` and `Label` is `Porn`:
<li>porn</li>
<li>vulgar</li>

Valid values when `Form` is `Image` and `Label` is `Terrorism`:
<li>guns</li>
<li>bloody</li>
<li>banners</li>
<li>scenario (terrorist scenes)</li>
<li>explosion</li>

Valid values when `Form` is `Voice` and `Label` is `Porn`:
<li>moan</li>
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * The format of the suspicious segment detected. Valid values:
<li>Image</li>
<li>OCR</li>
<li>ASR</li>
<li>Voice</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * The pixel coordinates ([x1, y1, x2, y2]) of the top-left corner and bottom-right corner of the suspicious text. This parameter is valid only if `Form` is `OCR`.
<font color=red>Note</font>: This parameter is not supported currently.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR` or `ASR`.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR` or `ASR`.
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
    * The URL of a suspected image (which will be deleted
 after `PicUrlExpireTime`).
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The expiration time of the suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * Get The start time offset (seconds) of the segment. 
     * @return StartTimeOffset The start time offset (seconds) of the segment.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set The start time offset (seconds) of the segment.
     * @param StartTimeOffset The start time offset (seconds) of the segment.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get The end time offset (seconds) of the segment. 
     * @return EndTimeOffset The end time offset (seconds) of the segment.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set The end time offset (seconds) of the segment.
     * @param EndTimeOffset The end time offset (seconds) of the segment.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get The confidence score of the segment. 
     * @return Confidence The confidence score of the segment.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score of the segment.
     * @param Confidence The confidence score of the segment.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The processing suggestion for the segment. Valid values:
<li>review: The content may be non-compliant. Please review it.</li>
<li>block: The content is non-compliant. We recommend you block it.</li> 
     * @return Suggestion The processing suggestion for the segment. Valid values:
<li>review: The content may be non-compliant. Please review it.</li>
<li>block: The content is non-compliant. We recommend you block it.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set The processing suggestion for the segment. Valid values:
<li>review: The content may be non-compliant. Please review it.</li>
<li>block: The content is non-compliant. We recommend you block it.</li>
     * @param Suggestion The processing suggestion for the segment. Valid values:
<li>review: The content may be non-compliant. Please review it.</li>
<li>block: The content is non-compliant. We recommend you block it.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get The most likely label for the segment. Valid values:
<li>Porn</li>
<li>Terrorism</li> 
     * @return Label The most likely label for the segment. Valid values:
<li>Porn</li>
<li>Terrorism</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set The most likely label for the segment. Valid values:
<li>Porn</li>
<li>Terrorism</li>
     * @param Label The most likely label for the segment. Valid values:
<li>Porn</li>
<li>Terrorism</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get The sublabel for the segment. This parameter is valid only if `Form` is `Image` or `Voice`.
Valid values when `Form` is `Image` and `Label` is `Porn`:
<li>porn</li>
<li>vulgar</li>

Valid values when `Form` is `Image` and `Label` is `Terrorism`:
<li>guns</li>
<li>bloody</li>
<li>banners</li>
<li>scenario (terrorist scenes)</li>
<li>explosion</li>

Valid values when `Form` is `Voice` and `Label` is `Porn`:
<li>moan</li> 
     * @return SubLabel The sublabel for the segment. This parameter is valid only if `Form` is `Image` or `Voice`.
Valid values when `Form` is `Image` and `Label` is `Porn`:
<li>porn</li>
<li>vulgar</li>

Valid values when `Form` is `Image` and `Label` is `Terrorism`:
<li>guns</li>
<li>bloody</li>
<li>banners</li>
<li>scenario (terrorist scenes)</li>
<li>explosion</li>

Valid values when `Form` is `Voice` and `Label` is `Porn`:
<li>moan</li>
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set The sublabel for the segment. This parameter is valid only if `Form` is `Image` or `Voice`.
Valid values when `Form` is `Image` and `Label` is `Porn`:
<li>porn</li>
<li>vulgar</li>

Valid values when `Form` is `Image` and `Label` is `Terrorism`:
<li>guns</li>
<li>bloody</li>
<li>banners</li>
<li>scenario (terrorist scenes)</li>
<li>explosion</li>

Valid values when `Form` is `Voice` and `Label` is `Porn`:
<li>moan</li>
     * @param SubLabel The sublabel for the segment. This parameter is valid only if `Form` is `Image` or `Voice`.
Valid values when `Form` is `Image` and `Label` is `Porn`:
<li>porn</li>
<li>vulgar</li>

Valid values when `Form` is `Image` and `Label` is `Terrorism`:
<li>guns</li>
<li>bloody</li>
<li>banners</li>
<li>scenario (terrorist scenes)</li>
<li>explosion</li>

Valid values when `Form` is `Voice` and `Label` is `Porn`:
<li>moan</li>
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get The format of the suspicious segment detected. Valid values:
<li>Image</li>
<li>OCR</li>
<li>ASR</li>
<li>Voice</li> 
     * @return Form The format of the suspicious segment detected. Valid values:
<li>Image</li>
<li>OCR</li>
<li>ASR</li>
<li>Voice</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set The format of the suspicious segment detected. Valid values:
<li>Image</li>
<li>OCR</li>
<li>ASR</li>
<li>Voice</li>
     * @param Form The format of the suspicious segment detected. Valid values:
<li>Image</li>
<li>OCR</li>
<li>ASR</li>
<li>Voice</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get The pixel coordinates ([x1, y1, x2, y2]) of the top-left corner and bottom-right corner of the suspicious text. This parameter is valid only if `Form` is `OCR`.
<font color=red>Note</font>: This parameter is not supported currently. 
     * @return AreaCoordSet The pixel coordinates ([x1, y1, x2, y2]) of the top-left corner and bottom-right corner of the suspicious text. This parameter is valid only if `Form` is `OCR`.
<font color=red>Note</font>: This parameter is not supported currently.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set The pixel coordinates ([x1, y1, x2, y2]) of the top-left corner and bottom-right corner of the suspicious text. This parameter is valid only if `Form` is `OCR`.
<font color=red>Note</font>: This parameter is not supported currently.
     * @param AreaCoordSet The pixel coordinates ([x1, y1, x2, y2]) of the top-left corner and bottom-right corner of the suspicious text. This parameter is valid only if `Form` is `OCR`.
<font color=red>Note</font>: This parameter is not supported currently.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR` or `ASR`. 
     * @return Text The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR` or `ASR`.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR` or `ASR`.
     * @param Text The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR` or `ASR`.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR` or `ASR`. 
     * @return KeywordSet The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR` or `ASR`.
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR` or `ASR`.
     * @param KeywordSet The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR` or `ASR`.
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    /**
     * Get The URL of a suspected image (which will be deleted
 after `PicUrlExpireTime`). 
     * @return Url The URL of a suspected image (which will be deleted
 after `PicUrlExpireTime`).
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL of a suspected image (which will be deleted
 after `PicUrlExpireTime`).
     * @param Url The URL of a suspected image (which will be deleted
 after `PicUrlExpireTime`).
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The expiration time of the suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return PicUrlExpireTime The expiration time of the suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * Set The expiration time of the suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param PicUrlExpireTime The expiration time of the suspected image URL in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
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

