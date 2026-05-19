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
    * Score of offensive information involved in suspected clips.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Result suggestions for identifying violations in suspected clips. Value ranges from...to...
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li>
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
    * Rule violation subtag.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * Suspected segment is prohibited in the form of, value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on screen.</li>
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * Coordinates of the area where suspicious figures, icons, or text appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Valid when Form is OCR, means the OCR Text Content that comes out.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Valid when Form is OCR, means the list of violation keywords hit by suspicious fragments.
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

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
     * Get Result suggestions for identifying violations in suspected clips. Value ranges from...to...
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li> 
     * @return Suggestion Result suggestions for identifying violations in suspected clips. Value ranges from...to...
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result suggestions for identifying violations in suspected clips. Value ranges from...to...
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li>
     * @param Suggestion Result suggestions for identifying violations in suspected clips. Value ranges from...to...
<li>review: suspected violation, suggest re-examination;</li>
<li>block: Confirmed violation. Suggest banning.</li>
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
     * Get Rule violation subtag. 
     * @return SubLabel Rule violation subtag.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set Rule violation subtag.
     * @param SubLabel Rule violation subtag.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get Suspected segment is prohibited in the form of, value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on screen.</li> 
     * @return Form Suspected segment is prohibited in the form of, value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on screen.</li>
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set Suspected segment is prohibited in the form of, value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on screen.</li>
     * @param Form Suspected segment is prohibited in the form of, value ranges from...to...
<li>Image: The figure or icon on the screen;</li>
<li>OCR: Text on screen.</li>
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get Coordinates of the area where suspicious figures, icons, or text appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner. 
     * @return AreaCoordSet Coordinates of the area where suspicious figures, icons, or text appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Coordinates of the area where suspicious figures, icons, or text appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner.
     * @param AreaCoordSet Coordinates of the area where suspicious figures, icons, or text appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and coordinate of the bottom-right corner.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get Valid when Form is OCR, means the OCR Text Content that comes out. 
     * @return Text Valid when Form is OCR, means the OCR Text Content that comes out.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Valid when Form is OCR, means the OCR Text Content that comes out.
     * @param Text Valid when Form is OCR, means the OCR Text Content that comes out.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Valid when Form is OCR, means the list of violation keywords hit by suspicious fragments. 
     * @return KeywordSet Valid when Form is OCR, means the list of violation keywords hit by suspicious fragments.
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set Valid when Form is OCR, means the list of violation keywords hit by suspicious fragments.
     * @param KeywordSet Valid when Form is OCR, means the list of violation keywords hit by suspicious fragments.
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

