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

public class ReviewImageSegmentItem extends AbstractModel {

    /**
    * The confidence score for the suspicious segment.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The suggestion. Valid values:
<li>`review`: The content may be non-compliant and needs to be reviewed.</li>
<li>`block`: The content is non-compliant and should be blocked.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * The most likely label for the suspicious content. Valid values: <li>`Porn`</li> <li>`Terror`</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * The sub-label.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * The type of the suspicious segment. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * The pixel coordinates of the suspicious people, icons, or text. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR`.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR`.
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
     * Get The confidence score for the suspicious segment. 
     * @return Confidence The confidence score for the suspicious segment.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score for the suspicious segment.
     * @param Confidence The confidence score for the suspicious segment.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The suggestion. Valid values:
<li>`review`: The content may be non-compliant and needs to be reviewed.</li>
<li>`block`: The content is non-compliant and should be blocked.</li> 
     * @return Suggestion The suggestion. Valid values:
<li>`review`: The content may be non-compliant and needs to be reviewed.</li>
<li>`block`: The content is non-compliant and should be blocked.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set The suggestion. Valid values:
<li>`review`: The content may be non-compliant and needs to be reviewed.</li>
<li>`block`: The content is non-compliant and should be blocked.</li>
     * @param Suggestion The suggestion. Valid values:
<li>`review`: The content may be non-compliant and needs to be reviewed.</li>
<li>`block`: The content is non-compliant and should be blocked.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get The most likely label for the suspicious content. Valid values: <li>`Porn`</li> <li>`Terror`</li> 
     * @return Label The most likely label for the suspicious content. Valid values: <li>`Porn`</li> <li>`Terror`</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set The most likely label for the suspicious content. Valid values: <li>`Porn`</li> <li>`Terror`</li>
     * @param Label The most likely label for the suspicious content. Valid values: <li>`Porn`</li> <li>`Terror`</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get The sub-label. 
     * @return SubLabel The sub-label.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set The sub-label.
     * @param SubLabel The sub-label.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get The type of the suspicious segment. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li> 
     * @return Form The type of the suspicious segment. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set The type of the suspicious segment. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
     * @param Form The type of the suspicious segment. Valid values:
<li>`Image` (people or icons in images)</li>
<li>`OCR` (text in images)</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get The pixel coordinates of the suspicious people, icons, or text. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners. 
     * @return AreaCoordSet The pixel coordinates of the suspicious people, icons, or text. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set The pixel coordinates of the suspicious people, icons, or text. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners.
     * @param AreaCoordSet The pixel coordinates of the suspicious people, icons, or text. The format is [x1, y1, x2, y2], which indicates the coordinates of the top-left and bottom-right corners.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR`. 
     * @return Text The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR`.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR`.
     * @param Text The content of the suspicious text detected. This parameter is valid only if `Form` is `OCR`.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR`. 
     * @return KeywordSet The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR`.
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR`.
     * @param KeywordSet The keywords that match the suspicious text. This parameter is valid only if `Form` is `OCR`.
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    public ReviewImageSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewImageSegmentItem(ReviewImageSegmentItem source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Form", this.Form);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);

    }
}

