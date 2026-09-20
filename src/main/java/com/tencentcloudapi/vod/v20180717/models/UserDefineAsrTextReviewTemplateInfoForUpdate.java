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

public class UserDefineAsrTextReviewTemplateInfoForUpdate extends AbstractModel {

    /**
    * User custom speech audit task switch. Available values:
<li>ON: Enable the custom voice moderation task;</li>
<li>OFF: disables the custom voice moderation task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * User-customized voice filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. To use the tag filtering feature, the corresponding tag needs to be added when adding custom voice keyword material.
The number of tags can be up to 10, and each tag can contain up to 16 characters.
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
    * Threshold score for determining suspected violations. When the review score reaches or exceeds this threshold, it is considered a suspected violation. Value range: 0–100.
    */
    @SerializedName("BlockConfidence")
    @Expose
    private Long BlockConfidence;

    /**
    * Threshold score for determining whether manual review is required for violations. When the review score reaches or exceeds this threshold, manual review is considered necessary. Value range: 0–100.
    */
    @SerializedName("ReviewConfidence")
    @Expose
    private Long ReviewConfidence;

    /**
     * Get User custom speech audit task switch. Available values:
<li>ON: Enable the custom voice moderation task;</li>
<li>OFF: disables the custom voice moderation task.</li> 
     * @return Switch User custom speech audit task switch. Available values:
<li>ON: Enable the custom voice moderation task;</li>
<li>OFF: disables the custom voice moderation task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set User custom speech audit task switch. Available values:
<li>ON: Enable the custom voice moderation task;</li>
<li>OFF: disables the custom voice moderation task.</li>
     * @param Switch User custom speech audit task switch. Available values:
<li>ON: Enable the custom voice moderation task;</li>
<li>OFF: disables the custom voice moderation task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get User-customized voice filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. To use the tag filtering feature, the corresponding tag needs to be added when adding custom voice keyword material.
The number of tags can be up to 10, and each tag can contain up to 16 characters. 
     * @return LabelSet User-customized voice filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. To use the tag filtering feature, the corresponding tag needs to be added when adding custom voice keyword material.
The number of tags can be up to 10, and each tag can contain up to 16 characters.
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set User-customized voice filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. To use the tag filtering feature, the corresponding tag needs to be added when adding custom voice keyword material.
The number of tags can be up to 10, and each tag can contain up to 16 characters.
     * @param LabelSet User-customized voice filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. To use the tag filtering feature, the corresponding tag needs to be added when adding custom voice keyword material.
The number of tags can be up to 10, and each tag can contain up to 16 characters.
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    /**
     * Get Threshold score for determining suspected violations. When the review score reaches or exceeds this threshold, it is considered a suspected violation. Value range: 0–100. 
     * @return BlockConfidence Threshold score for determining suspected violations. When the review score reaches or exceeds this threshold, it is considered a suspected violation. Value range: 0–100.
     */
    public Long getBlockConfidence() {
        return this.BlockConfidence;
    }

    /**
     * Set Threshold score for determining suspected violations. When the review score reaches or exceeds this threshold, it is considered a suspected violation. Value range: 0–100.
     * @param BlockConfidence Threshold score for determining suspected violations. When the review score reaches or exceeds this threshold, it is considered a suspected violation. Value range: 0–100.
     */
    public void setBlockConfidence(Long BlockConfidence) {
        this.BlockConfidence = BlockConfidence;
    }

    /**
     * Get Threshold score for determining whether manual review is required for violations. When the review score reaches or exceeds this threshold, manual review is considered necessary. Value range: 0–100. 
     * @return ReviewConfidence Threshold score for determining whether manual review is required for violations. When the review score reaches or exceeds this threshold, manual review is considered necessary. Value range: 0–100.
     */
    public Long getReviewConfidence() {
        return this.ReviewConfidence;
    }

    /**
     * Set Threshold score for determining whether manual review is required for violations. When the review score reaches or exceeds this threshold, manual review is considered necessary. Value range: 0–100.
     * @param ReviewConfidence Threshold score for determining whether manual review is required for violations. When the review score reaches or exceeds this threshold, manual review is considered necessary. Value range: 0–100.
     */
    public void setReviewConfidence(Long ReviewConfidence) {
        this.ReviewConfidence = ReviewConfidence;
    }

    public UserDefineAsrTextReviewTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDefineAsrTextReviewTemplateInfoForUpdate(UserDefineAsrTextReviewTemplateInfoForUpdate source) {
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

