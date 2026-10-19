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

public class CosRiskTrendInfo extends AbstractModel {

    /**
    * Current date.
    */
    @SerializedName("CurrentDateStr")
    @Expose
    private String CurrentDateStr;

    /**
    * Risk data information
    */
    @SerializedName("RiskDataSet")
    @Expose
    private CosRiskInfo [] RiskDataSet;

    /**
     * Get Current date. 
     * @return CurrentDateStr Current date.
     */
    public String getCurrentDateStr() {
        return this.CurrentDateStr;
    }

    /**
     * Set Current date.
     * @param CurrentDateStr Current date.
     */
    public void setCurrentDateStr(String CurrentDateStr) {
        this.CurrentDateStr = CurrentDateStr;
    }

    /**
     * Get Risk data information 
     * @return RiskDataSet Risk data information
     */
    public CosRiskInfo [] getRiskDataSet() {
        return this.RiskDataSet;
    }

    /**
     * Set Risk data information
     * @param RiskDataSet Risk data information
     */
    public void setRiskDataSet(CosRiskInfo [] RiskDataSet) {
        this.RiskDataSet = RiskDataSet;
    }

    public CosRiskTrendInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRiskTrendInfo(CosRiskTrendInfo source) {
        if (source.CurrentDateStr != null) {
            this.CurrentDateStr = new String(source.CurrentDateStr);
        }
        if (source.RiskDataSet != null) {
            this.RiskDataSet = new CosRiskInfo[source.RiskDataSet.length];
            for (int i = 0; i < source.RiskDataSet.length; i++) {
                this.RiskDataSet[i] = new CosRiskInfo(source.RiskDataSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentDateStr", this.CurrentDateStr);
        this.setParamArrayObj(map, prefix + "RiskDataSet.", this.RiskDataSet);

    }
}

