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

public class TerrorismImgReviewTemplateInfoForUpdate extends AbstractModel {

    /**
    * <p>Task switch for image recognition involving unsafe information. Available values:</p><li>ON: Enable the task for image recognition involving unsafe information.</li><li>OFF: Disable the task for image recognition involving unsafe information.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Image recognition involves filter tags for unsafe information. If the review result contains the selected tag, the result will be returned. If the filter tag is empty, all auditing results will be returned. Available values are:</p><li>guns: weapons and firearms;</li><li>crowd: crowd gathering;</li><li>bloody: graphic violence;</li><li>police: Police force;</li><li>banners: flags of violent terrorism;</li><li>militant: militant;</li><li>explosion: explosions and fires;</li><li>terrorists: figures of violent terrorism;</li><li>scenario: scenes of violent terrorism.</li>
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
    * <p>Threshold score for determining suspected violations. When the moderation score reaches this threshold, it is considered a suspected violation. Value range: 0-100.</p>
    */
    @SerializedName("BlockConfidence")
    @Expose
    private Long BlockConfidence;

    /**
    * <p>Threshold score for determining whether manual review is required for violations. When the moderation score reaches or exceeds this value, manual review is considered necessary. Value range: 0–100.</p>
    */
    @SerializedName("ReviewConfidence")
    @Expose
    private Long ReviewConfidence;

    /**
     * Get <p>Task switch for image recognition involving unsafe information. Available values:</p><li>ON: Enable the task for image recognition involving unsafe information.</li><li>OFF: Disable the task for image recognition involving unsafe information.</li> 
     * @return Switch <p>Task switch for image recognition involving unsafe information. Available values:</p><li>ON: Enable the task for image recognition involving unsafe information.</li><li>OFF: Disable the task for image recognition involving unsafe information.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Task switch for image recognition involving unsafe information. Available values:</p><li>ON: Enable the task for image recognition involving unsafe information.</li><li>OFF: Disable the task for image recognition involving unsafe information.</li>
     * @param Switch <p>Task switch for image recognition involving unsafe information. Available values:</p><li>ON: Enable the task for image recognition involving unsafe information.</li><li>OFF: Disable the task for image recognition involving unsafe information.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Image recognition involves filter tags for unsafe information. If the review result contains the selected tag, the result will be returned. If the filter tag is empty, all auditing results will be returned. Available values are:</p><li>guns: weapons and firearms;</li><li>crowd: crowd gathering;</li><li>bloody: graphic violence;</li><li>police: Police force;</li><li>banners: flags of violent terrorism;</li><li>militant: militant;</li><li>explosion: explosions and fires;</li><li>terrorists: figures of violent terrorism;</li><li>scenario: scenes of violent terrorism.</li> 
     * @return LabelSet <p>Image recognition involves filter tags for unsafe information. If the review result contains the selected tag, the result will be returned. If the filter tag is empty, all auditing results will be returned. Available values are:</p><li>guns: weapons and firearms;</li><li>crowd: crowd gathering;</li><li>bloody: graphic violence;</li><li>police: Police force;</li><li>banners: flags of violent terrorism;</li><li>militant: militant;</li><li>explosion: explosions and fires;</li><li>terrorists: figures of violent terrorism;</li><li>scenario: scenes of violent terrorism.</li>
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set <p>Image recognition involves filter tags for unsafe information. If the review result contains the selected tag, the result will be returned. If the filter tag is empty, all auditing results will be returned. Available values are:</p><li>guns: weapons and firearms;</li><li>crowd: crowd gathering;</li><li>bloody: graphic violence;</li><li>police: Police force;</li><li>banners: flags of violent terrorism;</li><li>militant: militant;</li><li>explosion: explosions and fires;</li><li>terrorists: figures of violent terrorism;</li><li>scenario: scenes of violent terrorism.</li>
     * @param LabelSet <p>Image recognition involves filter tags for unsafe information. If the review result contains the selected tag, the result will be returned. If the filter tag is empty, all auditing results will be returned. Available values are:</p><li>guns: weapons and firearms;</li><li>crowd: crowd gathering;</li><li>bloody: graphic violence;</li><li>police: Police force;</li><li>banners: flags of violent terrorism;</li><li>militant: militant;</li><li>explosion: explosions and fires;</li><li>terrorists: figures of violent terrorism;</li><li>scenario: scenes of violent terrorism.</li>
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    /**
     * Get <p>Threshold score for determining suspected violations. When the moderation score reaches this threshold, it is considered a suspected violation. Value range: 0-100.</p> 
     * @return BlockConfidence <p>Threshold score for determining suspected violations. When the moderation score reaches this threshold, it is considered a suspected violation. Value range: 0-100.</p>
     */
    public Long getBlockConfidence() {
        return this.BlockConfidence;
    }

    /**
     * Set <p>Threshold score for determining suspected violations. When the moderation score reaches this threshold, it is considered a suspected violation. Value range: 0-100.</p>
     * @param BlockConfidence <p>Threshold score for determining suspected violations. When the moderation score reaches this threshold, it is considered a suspected violation. Value range: 0-100.</p>
     */
    public void setBlockConfidence(Long BlockConfidence) {
        this.BlockConfidence = BlockConfidence;
    }

    /**
     * Get <p>Threshold score for determining whether manual review is required for violations. When the moderation score reaches or exceeds this value, manual review is considered necessary. Value range: 0–100.</p> 
     * @return ReviewConfidence <p>Threshold score for determining whether manual review is required for violations. When the moderation score reaches or exceeds this value, manual review is considered necessary. Value range: 0–100.</p>
     */
    public Long getReviewConfidence() {
        return this.ReviewConfidence;
    }

    /**
     * Set <p>Threshold score for determining whether manual review is required for violations. When the moderation score reaches or exceeds this value, manual review is considered necessary. Value range: 0–100.</p>
     * @param ReviewConfidence <p>Threshold score for determining whether manual review is required for violations. When the moderation score reaches or exceeds this value, manual review is considered necessary. Value range: 0–100.</p>
     */
    public void setReviewConfidence(Long ReviewConfidence) {
        this.ReviewConfidence = ReviewConfidence;
    }

    public TerrorismImgReviewTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerrorismImgReviewTemplateInfoForUpdate(TerrorismImgReviewTemplateInfoForUpdate source) {
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

