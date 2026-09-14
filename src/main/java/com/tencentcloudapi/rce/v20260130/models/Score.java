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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Score extends AbstractModel {

    /**
    * <p>Risk score. Range: 1–1000. The higher the score indicates the higher risk</p>
    */
    @SerializedName("RiskScore")
    @Expose
    private Long RiskScore;

    /**
    * <p>Risk label</p>
    */
    @SerializedName("RiskLabels")
    @Expose
    private RiskLabel [] RiskLabels;

    /**
     * Get <p>Risk score. Range: 1–1000. The higher the score indicates the higher risk</p> 
     * @return RiskScore <p>Risk score. Range: 1–1000. The higher the score indicates the higher risk</p>
     */
    public Long getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set <p>Risk score. Range: 1–1000. The higher the score indicates the higher risk</p>
     * @param RiskScore <p>Risk score. Range: 1–1000. The higher the score indicates the higher risk</p>
     */
    public void setRiskScore(Long RiskScore) {
        this.RiskScore = RiskScore;
    }

    /**
     * Get <p>Risk label</p> 
     * @return RiskLabels <p>Risk label</p>
     */
    public RiskLabel [] getRiskLabels() {
        return this.RiskLabels;
    }

    /**
     * Set <p>Risk label</p>
     * @param RiskLabels <p>Risk label</p>
     */
    public void setRiskLabels(RiskLabel [] RiskLabels) {
        this.RiskLabels = RiskLabels;
    }

    public Score() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Score(Score source) {
        if (source.RiskScore != null) {
            this.RiskScore = new Long(source.RiskScore);
        }
        if (source.RiskLabels != null) {
            this.RiskLabels = new RiskLabel[source.RiskLabels.length];
            for (int i = 0; i < source.RiskLabels.length; i++) {
                this.RiskLabels[i] = new RiskLabel(source.RiskLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);
        this.setParamArrayObj(map, prefix + "RiskLabels.", this.RiskLabels);

    }
}

