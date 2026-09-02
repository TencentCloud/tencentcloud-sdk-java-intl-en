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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineRiskLevelStatistic extends AbstractModel {

    /**
    * <p>Risk level. Parameter value: LOW, MEDIUM, HIGH, CRITICAL.</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>Number of detection items with a NOT_PASS result at this risk level.</p>
    */
    @SerializedName("NotPassCount")
    @Expose
    private Long NotPassCount;

    /**
     * Get <p>Risk level. Parameter value: LOW, MEDIUM, HIGH, CRITICAL.</p> 
     * @return RiskLevel <p>Risk level. Parameter value: LOW, MEDIUM, HIGH, CRITICAL.</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level. Parameter value: LOW, MEDIUM, HIGH, CRITICAL.</p>
     * @param RiskLevel <p>Risk level. Parameter value: LOW, MEDIUM, HIGH, CRITICAL.</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Number of detection items with a NOT_PASS result at this risk level.</p> 
     * @return NotPassCount <p>Number of detection items with a NOT_PASS result at this risk level.</p>
     */
    public Long getNotPassCount() {
        return this.NotPassCount;
    }

    /**
     * Set <p>Number of detection items with a NOT_PASS result at this risk level.</p>
     * @param NotPassCount <p>Number of detection items with a NOT_PASS result at this risk level.</p>
     */
    public void setNotPassCount(Long NotPassCount) {
        this.NotPassCount = NotPassCount;
    }

    public BaselineRiskLevelStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRiskLevelStatistic(BaselineRiskLevelStatistic source) {
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.NotPassCount != null) {
            this.NotPassCount = new Long(source.NotPassCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "NotPassCount", this.NotPassCount);

    }
}

