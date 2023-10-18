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

public class PoliticalImgReviewTemplateInfo extends AbstractModel {

    /**
    * Whether to enable recognition of politically sensitive content in images. Valid values:
<li>ON</li>
<li>OFF</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Filter labels for recognition of politically sensitive content in images. Results containing the specified labels are returned. If no labels are specified, all results are returned. Valid values:
<li>`violation_photo`: banned images</li>
<li>`politician`: politically sensitive people</li>
<li>`entertainment`: people in the entertainment industry</li>
<li>`sport`: sportspeople</li>
<li>`entrepreneur`: businesspeople</li>
<li>`scholar`: scholars</li>
<li>`celebrity`: celebrities</li>
<li>`military`: people in military</li>
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
    * Confidence score threshold for determining that something should be blocked. If this threshold is reached, VOD will suggest that the content be blocked. If this parameter is left empty, `97` will be used by default. Value range: 0-100
    */
    @SerializedName("BlockConfidence")
    @Expose
    private Long BlockConfidence;

    /**
    * Confidence score threshold for human review. If this threshold is reached, human review is needed. If this parameter is left empty, `95` will be used by default. Value range: 0-100
    */
    @SerializedName("ReviewConfidence")
    @Expose
    private Long ReviewConfidence;

    /**
     * Get Whether to enable recognition of politically sensitive content in images. Valid values:
<li>ON</li>
<li>OFF</li> 
     * @return Switch Whether to enable recognition of politically sensitive content in images. Valid values:
<li>ON</li>
<li>OFF</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable recognition of politically sensitive content in images. Valid values:
<li>ON</li>
<li>OFF</li>
     * @param Switch Whether to enable recognition of politically sensitive content in images. Valid values:
<li>ON</li>
<li>OFF</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Filter labels for recognition of politically sensitive content in images. Results containing the specified labels are returned. If no labels are specified, all results are returned. Valid values:
<li>`violation_photo`: banned images</li>
<li>`politician`: politically sensitive people</li>
<li>`entertainment`: people in the entertainment industry</li>
<li>`sport`: sportspeople</li>
<li>`entrepreneur`: businesspeople</li>
<li>`scholar`: scholars</li>
<li>`celebrity`: celebrities</li>
<li>`military`: people in military</li> 
     * @return LabelSet Filter labels for recognition of politically sensitive content in images. Results containing the specified labels are returned. If no labels are specified, all results are returned. Valid values:
<li>`violation_photo`: banned images</li>
<li>`politician`: politically sensitive people</li>
<li>`entertainment`: people in the entertainment industry</li>
<li>`sport`: sportspeople</li>
<li>`entrepreneur`: businesspeople</li>
<li>`scholar`: scholars</li>
<li>`celebrity`: celebrities</li>
<li>`military`: people in military</li>
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set Filter labels for recognition of politically sensitive content in images. Results containing the specified labels are returned. If no labels are specified, all results are returned. Valid values:
<li>`violation_photo`: banned images</li>
<li>`politician`: politically sensitive people</li>
<li>`entertainment`: people in the entertainment industry</li>
<li>`sport`: sportspeople</li>
<li>`entrepreneur`: businesspeople</li>
<li>`scholar`: scholars</li>
<li>`celebrity`: celebrities</li>
<li>`military`: people in military</li>
     * @param LabelSet Filter labels for recognition of politically sensitive content in images. Results containing the specified labels are returned. If no labels are specified, all results are returned. Valid values:
<li>`violation_photo`: banned images</li>
<li>`politician`: politically sensitive people</li>
<li>`entertainment`: people in the entertainment industry</li>
<li>`sport`: sportspeople</li>
<li>`entrepreneur`: businesspeople</li>
<li>`scholar`: scholars</li>
<li>`celebrity`: celebrities</li>
<li>`military`: people in military</li>
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    /**
     * Get Confidence score threshold for determining that something should be blocked. If this threshold is reached, VOD will suggest that the content be blocked. If this parameter is left empty, `97` will be used by default. Value range: 0-100 
     * @return BlockConfidence Confidence score threshold for determining that something should be blocked. If this threshold is reached, VOD will suggest that the content be blocked. If this parameter is left empty, `97` will be used by default. Value range: 0-100
     */
    public Long getBlockConfidence() {
        return this.BlockConfidence;
    }

    /**
     * Set Confidence score threshold for determining that something should be blocked. If this threshold is reached, VOD will suggest that the content be blocked. If this parameter is left empty, `97` will be used by default. Value range: 0-100
     * @param BlockConfidence Confidence score threshold for determining that something should be blocked. If this threshold is reached, VOD will suggest that the content be blocked. If this parameter is left empty, `97` will be used by default. Value range: 0-100
     */
    public void setBlockConfidence(Long BlockConfidence) {
        this.BlockConfidence = BlockConfidence;
    }

    /**
     * Get Confidence score threshold for human review. If this threshold is reached, human review is needed. If this parameter is left empty, `95` will be used by default. Value range: 0-100 
     * @return ReviewConfidence Confidence score threshold for human review. If this threshold is reached, human review is needed. If this parameter is left empty, `95` will be used by default. Value range: 0-100
     */
    public Long getReviewConfidence() {
        return this.ReviewConfidence;
    }

    /**
     * Set Confidence score threshold for human review. If this threshold is reached, human review is needed. If this parameter is left empty, `95` will be used by default. Value range: 0-100
     * @param ReviewConfidence Confidence score threshold for human review. If this threshold is reached, human review is needed. If this parameter is left empty, `95` will be used by default. Value range: 0-100
     */
    public void setReviewConfidence(Long ReviewConfidence) {
        this.ReviewConfidence = ReviewConfidence;
    }

    public PoliticalImgReviewTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoliticalImgReviewTemplateInfo(PoliticalImgReviewTemplateInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.LabelSet != null) {
            this.LabelSet = new String[source.LabelSet.length];
            for (int i = 0; i < source.LabelSet.length; i++) {
                this.LabelSet[i] = new String(source.LabelSet[i]);
            }
        }
        if (source.BlockConfidence != null) {
            this.BlockConfidence = new Long(source.BlockConfidence);
        }
        if (source.ReviewConfidence != null) {
            this.ReviewConfidence = new Long(source.ReviewConfidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "LabelSet.", this.LabelSet);
        this.setParamSimple(map, prefix + "BlockConfidence", this.BlockConfidence);
        this.setParamSimple(map, prefix + "ReviewConfidence", this.ReviewConfidence);

    }
}

