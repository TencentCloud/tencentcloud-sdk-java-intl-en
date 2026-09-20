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

public class QualityInspectStrategy extends AbstractModel {

    /**
    * <p>Policy type.</p><p>Enumeration values:</p><ul><li>TimeSpotCheck: Time-based spot check policy.</li></ul>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>Spot check policy parameter based on time. Valid when StrategyType is TimeSpotCheck.</p>
    */
    @SerializedName("TimeSpotCheck")
    @Expose
    private QualityInspectTimeSpotCheck TimeSpotCheck;

    /**
     * Get <p>Policy type.</p><p>Enumeration values:</p><ul><li>TimeSpotCheck: Time-based spot check policy.</li></ul> 
     * @return StrategyType <p>Policy type.</p><p>Enumeration values:</p><ul><li>TimeSpotCheck: Time-based spot check policy.</li></ul>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>Policy type.</p><p>Enumeration values:</p><ul><li>TimeSpotCheck: Time-based spot check policy.</li></ul>
     * @param StrategyType <p>Policy type.</p><p>Enumeration values:</p><ul><li>TimeSpotCheck: Time-based spot check policy.</li></ul>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>Spot check policy parameter based on time. Valid when StrategyType is TimeSpotCheck.</p> 
     * @return TimeSpotCheck <p>Spot check policy parameter based on time. Valid when StrategyType is TimeSpotCheck.</p>
     */
    public QualityInspectTimeSpotCheck getTimeSpotCheck() {
        return this.TimeSpotCheck;
    }

    /**
     * Set <p>Spot check policy parameter based on time. Valid when StrategyType is TimeSpotCheck.</p>
     * @param TimeSpotCheck <p>Spot check policy parameter based on time. Valid when StrategyType is TimeSpotCheck.</p>
     */
    public void setTimeSpotCheck(QualityInspectTimeSpotCheck TimeSpotCheck) {
        this.TimeSpotCheck = TimeSpotCheck;
    }

    public QualityInspectStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectStrategy(QualityInspectStrategy source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.TimeSpotCheck != null) {
            this.TimeSpotCheck = new QualityInspectTimeSpotCheck(source.TimeSpotCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamObj(map, prefix + "TimeSpotCheck.", this.TimeSpotCheck);

    }
}

