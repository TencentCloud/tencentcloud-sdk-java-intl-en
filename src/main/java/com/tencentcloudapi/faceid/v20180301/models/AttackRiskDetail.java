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
    * <p>Suspected attack trace type, specific type as follows:<br>SuspectedSpoofingAttack: Rephotography attack<br>SuspectedSynthesisImage: Suspected synthesized image<br>SuspectedSynthesisVideo: Suspected synthesized video<br>SuspectedAnomalyAttack: Facial features suspected of not being real<br>SuspectedAdversarialAttack: Suspected adversarial sample attack<br>SuspectedBlackIndustry: Suspected black industry batch template attack<br>SuspectedWatermark: Suspected watermark</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Suspected attack trace type, specific type as follows:<br>SuspectedSpoofingAttack: Rephotography attack<br>SuspectedSynthesisImage: Suspected synthesized image<br>SuspectedSynthesisVideo: Suspected synthesized video<br>SuspectedAnomalyAttack: Facial features suspected of not being real<br>SuspectedAdversarialAttack: Suspected adversarial sample attack<br>SuspectedBlackIndustry: Suspected black industry batch template attack<br>SuspectedWatermark: Suspected watermark</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type <p>Suspected attack trace type, specific type as follows:<br>SuspectedSpoofingAttack: Rephotography attack<br>SuspectedSynthesisImage: Suspected synthesized image<br>SuspectedSynthesisVideo: Suspected synthesized video<br>SuspectedAnomalyAttack: Facial features suspected of not being real<br>SuspectedAdversarialAttack: Suspected adversarial sample attack<br>SuspectedBlackIndustry: Suspected black industry batch template attack<br>SuspectedWatermark: Suspected watermark</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Suspected attack trace type, specific type as follows:<br>SuspectedSpoofingAttack: Rephotography attack<br>SuspectedSynthesisImage: Suspected synthesized image<br>SuspectedSynthesisVideo: Suspected synthesized video<br>SuspectedAnomalyAttack: Facial features suspected of not being real<br>SuspectedAdversarialAttack: Suspected adversarial sample attack<br>SuspectedBlackIndustry: Suspected black industry batch template attack<br>SuspectedWatermark: Suspected watermark</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type <p>Suspected attack trace type, specific type as follows:<br>SuspectedSpoofingAttack: Rephotography attack<br>SuspectedSynthesisImage: Suspected synthesized image<br>SuspectedSynthesisVideo: Suspected synthesized video<br>SuspectedAnomalyAttack: Facial features suspected of not being real<br>SuspectedAdversarialAttack: Suspected adversarial sample attack<br>SuspectedBlackIndustry: Suspected black industry batch template attack<br>SuspectedWatermark: Suspected watermark</p>
Note: This field may return null, indicating that no valid values can be obtained.
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

