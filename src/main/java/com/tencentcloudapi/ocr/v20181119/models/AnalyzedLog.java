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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyzedLog extends AbstractModel {

    /**
    * <p>Indexes of the procedure.</p><p>Enumeration value:</p><ul><li>L1_IMAGE_QUALITY: Image quality detection</li><li>L2_RULE_ENGINE: Rule verification</li><li>L3_LLM_JUDGE: Large model judgment</li></ul>
    */
    @SerializedName("StepKey")
    @Expose
    private String StepKey;

    /**
    * <p>Compliant and non-compliant are final states; to be determined is an intermediate state. Judgment status of each layer: Compliant Non-Compliant Pending.</p>
    */
    @SerializedName("Decision")
    @Expose
    private String Decision;

    /**
    * <p>Reason for the current layer judgment</p>
    */
    @SerializedName("DecisionMessage")
    @Expose
    private String DecisionMessage;

    /**
    * <p>Time taken by the current layer</p><p>Unit: ms</p>
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
     * Get <p>Indexes of the procedure.</p><p>Enumeration value:</p><ul><li>L1_IMAGE_QUALITY: Image quality detection</li><li>L2_RULE_ENGINE: Rule verification</li><li>L3_LLM_JUDGE: Large model judgment</li></ul> 
     * @return StepKey <p>Indexes of the procedure.</p><p>Enumeration value:</p><ul><li>L1_IMAGE_QUALITY: Image quality detection</li><li>L2_RULE_ENGINE: Rule verification</li><li>L3_LLM_JUDGE: Large model judgment</li></ul>
     */
    public String getStepKey() {
        return this.StepKey;
    }

    /**
     * Set <p>Indexes of the procedure.</p><p>Enumeration value:</p><ul><li>L1_IMAGE_QUALITY: Image quality detection</li><li>L2_RULE_ENGINE: Rule verification</li><li>L3_LLM_JUDGE: Large model judgment</li></ul>
     * @param StepKey <p>Indexes of the procedure.</p><p>Enumeration value:</p><ul><li>L1_IMAGE_QUALITY: Image quality detection</li><li>L2_RULE_ENGINE: Rule verification</li><li>L3_LLM_JUDGE: Large model judgment</li></ul>
     */
    public void setStepKey(String StepKey) {
        this.StepKey = StepKey;
    }

    /**
     * Get <p>Compliant and non-compliant are final states; to be determined is an intermediate state. Judgment status of each layer: Compliant Non-Compliant Pending.</p> 
     * @return Decision <p>Compliant and non-compliant are final states; to be determined is an intermediate state. Judgment status of each layer: Compliant Non-Compliant Pending.</p>
     */
    public String getDecision() {
        return this.Decision;
    }

    /**
     * Set <p>Compliant and non-compliant are final states; to be determined is an intermediate state. Judgment status of each layer: Compliant Non-Compliant Pending.</p>
     * @param Decision <p>Compliant and non-compliant are final states; to be determined is an intermediate state. Judgment status of each layer: Compliant Non-Compliant Pending.</p>
     */
    public void setDecision(String Decision) {
        this.Decision = Decision;
    }

    /**
     * Get <p>Reason for the current layer judgment</p> 
     * @return DecisionMessage <p>Reason for the current layer judgment</p>
     */
    public String getDecisionMessage() {
        return this.DecisionMessage;
    }

    /**
     * Set <p>Reason for the current layer judgment</p>
     * @param DecisionMessage <p>Reason for the current layer judgment</p>
     */
    public void setDecisionMessage(String DecisionMessage) {
        this.DecisionMessage = DecisionMessage;
    }

    /**
     * Get <p>Time taken by the current layer</p><p>Unit: ms</p> 
     * @return CostTime <p>Time taken by the current layer</p><p>Unit: ms</p>
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set <p>Time taken by the current layer</p><p>Unit: ms</p>
     * @param CostTime <p>Time taken by the current layer</p><p>Unit: ms</p>
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    public AnalyzedLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyzedLog(AnalyzedLog source) {
        if (source.StepKey != null) {
            this.StepKey = new String(source.StepKey);
        }
        if (source.Decision != null) {
            this.Decision = new String(source.Decision);
        }
        if (source.DecisionMessage != null) {
            this.DecisionMessage = new String(source.DecisionMessage);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StepKey", this.StepKey);
        this.setParamSimple(map, prefix + "Decision", this.Decision);
        this.setParamSimple(map, prefix + "DecisionMessage", this.DecisionMessage);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

