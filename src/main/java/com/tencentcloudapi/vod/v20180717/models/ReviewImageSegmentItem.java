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
    * 
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * 
    */
    @SerializedName("Form")
    @Expose
    private String Form;

    /**
    * 
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * 
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
     * Get  
     * @return Confidence 
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 
     * @param Confidence 
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get  
     * @return Suggestion 
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 
     * @param Suggestion 
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get  
     * @return Label 
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 
     * @param Label 
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get  
     * @return SubLabel 
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 
     * @param SubLabel 
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get  
     * @return Form 
     */
    public String getForm() {
        return this.Form;
    }

    /**
     * Set 
     * @param Form 
     */
    public void setForm(String Form) {
        this.Form = Form;
    }

    /**
     * Get  
     * @return AreaCoordSet 
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set 
     * @param AreaCoordSet 
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get  
     * @return Text 
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 
     * @param Text 
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get  
     * @return KeywordSet 
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set 
     * @param KeywordSet 
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

