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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerrorismImgReviewTemplateInfoForUpdate extends AbstractModel {

    /**
    * Whether to detect sensitive information in images. Valid values:
<li>ON</li>
<li>OFF</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Sensitive content filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. Valid values:
<li>guns: weapons and guns;</li>
<li>crowd: crowd gathering;</li>
<li>bloody: bloodiness;</li>
<li>police: police force;</li>
<li>banners: sensitive flags;</li>
<li>militant: militants;</li>
<li>explosion: explosions and fires;</li>
<li>terrorists: sensitive persons.</li>
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
    * Threshold score for violation. If this score is reached or exceeded during intelligent audit, it will be deemed that a suspected violation has occurred. Value range: 0-100.
    */
    @SerializedName("BlockConfidence")
    @Expose
    private Long BlockConfidence;

    /**
    * Threshold score for human audit. If this score is reached or exceeded during intelligent audit, human audit will be considered necessary. Value range: 0-100.
    */
    @SerializedName("ReviewConfidence")
    @Expose
    private Long ReviewConfidence;

    /**
     * Get Whether to detect sensitive information in images. Valid values:
<li>ON</li>
<li>OFF</li> 
     * @return Switch Whether to detect sensitive information in images. Valid values:
<li>ON</li>
<li>OFF</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to detect sensitive information in images. Valid values:
<li>ON</li>
<li>OFF</li>
     * @param Switch Whether to detect sensitive information in images. Valid values:
<li>ON</li>
<li>OFF</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Sensitive content filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. Valid values:
<li>guns: weapons and guns;</li>
<li>crowd: crowd gathering;</li>
<li>bloody: bloodiness;</li>
<li>police: police force;</li>
<li>banners: sensitive flags;</li>
<li>militant: militants;</li>
<li>explosion: explosions and fires;</li>
<li>terrorists: sensitive persons.</li> 
     * @return LabelSet Sensitive content filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. Valid values:
<li>guns: weapons and guns;</li>
<li>crowd: crowd gathering;</li>
<li>bloody: bloodiness;</li>
<li>police: police force;</li>
<li>banners: sensitive flags;</li>
<li>militant: militants;</li>
<li>explosion: explosions and fires;</li>
<li>terrorists: sensitive persons.</li>
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set Sensitive content filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. Valid values:
<li>guns: weapons and guns;</li>
<li>crowd: crowd gathering;</li>
<li>bloody: bloodiness;</li>
<li>police: police force;</li>
<li>banners: sensitive flags;</li>
<li>militant: militants;</li>
<li>explosion: explosions and fires;</li>
<li>terrorists: sensitive persons.</li>
     * @param LabelSet Sensitive content filter tags. The auditing results including the selected tags are returned. If the filter tag is empty, all auditing results will be returned. Valid values:
<li>guns: weapons and guns;</li>
<li>crowd: crowd gathering;</li>
<li>bloody: bloodiness;</li>
<li>police: police force;</li>
<li>banners: sensitive flags;</li>
<li>militant: militants;</li>
<li>explosion: explosions and fires;</li>
<li>terrorists: sensitive persons.</li>
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    /**
     * Get Threshold score for violation. If this score is reached or exceeded during intelligent audit, it will be deemed that a suspected violation has occurred. Value range: 0-100. 
     * @return BlockConfidence Threshold score for violation. If this score is reached or exceeded during intelligent audit, it will be deemed that a suspected violation has occurred. Value range: 0-100.
     */
    public Long getBlockConfidence() {
        return this.BlockConfidence;
    }

    /**
     * Set Threshold score for violation. If this score is reached or exceeded during intelligent audit, it will be deemed that a suspected violation has occurred. Value range: 0-100.
     * @param BlockConfidence Threshold score for violation. If this score is reached or exceeded during intelligent audit, it will be deemed that a suspected violation has occurred. Value range: 0-100.
     */
    public void setBlockConfidence(Long BlockConfidence) {
        this.BlockConfidence = BlockConfidence;
    }

    /**
     * Get Threshold score for human audit. If this score is reached or exceeded during intelligent audit, human audit will be considered necessary. Value range: 0-100. 
     * @return ReviewConfidence Threshold score for human audit. If this score is reached or exceeded during intelligent audit, human audit will be considered necessary. Value range: 0-100.
     */
    public Long getReviewConfidence() {
        return this.ReviewConfidence;
    }

    /**
     * Set Threshold score for human audit. If this score is reached or exceeded during intelligent audit, human audit will be considered necessary. Value range: 0-100.
     * @param ReviewConfidence Threshold score for human audit. If this score is reached or exceeded during intelligent audit, human audit will be considered necessary. Value range: 0-100.
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

