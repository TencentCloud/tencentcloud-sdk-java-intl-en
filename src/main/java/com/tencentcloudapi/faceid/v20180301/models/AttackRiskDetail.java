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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackRiskDetail extends AbstractModel {

    /**
    * Suspected attack trace types
SuspectedSpoofingAttack: Suspected spoofing attack
SuspectedSynthesisImage: Suspected synthesis image
SuspectedSynthesisVideo: Suspected synthesis video
SuspectedeAnomalyAttack: Suspected anomaly attack
SuspectedAdversarialAttack: Suspected adversarial attack 
SuspectedBlackIndustry: Suspected batch generation attack
SuspectedWatermark: Suspected watermark
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Suspected attack trace types
SuspectedSpoofingAttack: Suspected spoofing attack
SuspectedSynthesisImage: Suspected synthesis image
SuspectedSynthesisVideo: Suspected synthesis video
SuspectedeAnomalyAttack: Suspected anomaly attack
SuspectedAdversarialAttack: Suspected adversarial attack 
SuspectedBlackIndustry: Suspected batch generation attack
SuspectedWatermark: Suspected watermark 
     * @return Type Suspected attack trace types
SuspectedSpoofingAttack: Suspected spoofing attack
SuspectedSynthesisImage: Suspected synthesis image
SuspectedSynthesisVideo: Suspected synthesis video
SuspectedeAnomalyAttack: Suspected anomaly attack
SuspectedAdversarialAttack: Suspected adversarial attack 
SuspectedBlackIndustry: Suspected batch generation attack
SuspectedWatermark: Suspected watermark
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Suspected attack trace types
SuspectedSpoofingAttack: Suspected spoofing attack
SuspectedSynthesisImage: Suspected synthesis image
SuspectedSynthesisVideo: Suspected synthesis video
SuspectedeAnomalyAttack: Suspected anomaly attack
SuspectedAdversarialAttack: Suspected adversarial attack 
SuspectedBlackIndustry: Suspected batch generation attack
SuspectedWatermark: Suspected watermark
     * @param Type Suspected attack trace types
SuspectedSpoofingAttack: Suspected spoofing attack
SuspectedSynthesisImage: Suspected synthesis image
SuspectedSynthesisVideo: Suspected synthesis video
SuspectedeAnomalyAttack: Suspected anomaly attack
SuspectedAdversarialAttack: Suspected adversarial attack 
SuspectedBlackIndustry: Suspected batch generation attack
SuspectedWatermark: Suspected watermark
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public AttackRiskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackRiskDetail(AttackRiskDetail source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

