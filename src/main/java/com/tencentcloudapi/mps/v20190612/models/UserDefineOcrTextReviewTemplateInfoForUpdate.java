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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDefineOcrTextReviewTemplateInfoForUpdate extends AbstractModel {

    /**
    * Switch of a custom text audit task. Valid values:
<li>ON: Enables a custom text audit task;</li>
<li>OFF: Disables a custom text audit task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Custom text filter tag. If an audit result contains the selected tag, it will be returned; if the filter tag is empty, all audit results will be returned. To use the tag filtering feature, you need to add the corresponding tag when adding materials for custom text keywords.
There can be up to 10 tags, each with a length limit of 16 characters.
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
     * Get Switch of a custom text audit task. Valid values:
<li>ON: Enables a custom text audit task;</li>
<li>OFF: Disables a custom text audit task.</li> 
     * @return Switch Switch of a custom text audit task. Valid values:
<li>ON: Enables a custom text audit task;</li>
<li>OFF: Disables a custom text audit task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of a custom text audit task. Valid values:
<li>ON: Enables a custom text audit task;</li>
<li>OFF: Disables a custom text audit task.</li>
     * @param Switch Switch of a custom text audit task. Valid values:
<li>ON: Enables a custom text audit task;</li>
<li>OFF: Disables a custom text audit task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Custom text filter tag. If an audit result contains the selected tag, it will be returned; if the filter tag is empty, all audit results will be returned. To use the tag filtering feature, you need to add the corresponding tag when adding materials for custom text keywords.
There can be up to 10 tags, each with a length limit of 16 characters. 
     * @return LabelSet Custom text filter tag. If an audit result contains the selected tag, it will be returned; if the filter tag is empty, all audit results will be returned. To use the tag filtering feature, you need to add the corresponding tag when adding materials for custom text keywords.
There can be up to 10 tags, each with a length limit of 16 characters.
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set Custom text filter tag. If an audit result contains the selected tag, it will be returned; if the filter tag is empty, all audit results will be returned. To use the tag filtering feature, you need to add the corresponding tag when adding materials for custom text keywords.
There can be up to 10 tags, each with a length limit of 16 characters.
     * @param LabelSet Custom text filter tag. If an audit result contains the selected tag, it will be returned; if the filter tag is empty, all audit results will be returned. To use the tag filtering feature, you need to add the corresponding tag when adding materials for custom text keywords.
There can be up to 10 tags, each with a length limit of 16 characters.
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

    public UserDefineOcrTextReviewTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDefineOcrTextReviewTemplateInfoForUpdate(UserDefineOcrTextReviewTemplateInfoForUpdate source) {
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

