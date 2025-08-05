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

public class QualityControlStrategy extends AbstractModel {

    /**
    * Policy type. Valid values:
- TimeSpotCheck
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * Spot check policy based on time.
    */
    @SerializedName("TimeSpotCheck")
    @Expose
    private TimeSpotCheck TimeSpotCheck;

    /**
     * Get Policy type. Valid values:
- TimeSpotCheck 
     * @return StrategyType Policy type. Valid values:
- TimeSpotCheck
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Policy type. Valid values:
- TimeSpotCheck
     * @param StrategyType Policy type. Valid values:
- TimeSpotCheck
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Spot check policy based on time. 
     * @return TimeSpotCheck Spot check policy based on time.
     */
    public TimeSpotCheck getTimeSpotCheck() {
        return this.TimeSpotCheck;
    }

    /**
     * Set Spot check policy based on time.
     * @param TimeSpotCheck Spot check policy based on time.
     */
    public void setTimeSpotCheck(TimeSpotCheck TimeSpotCheck) {
        this.TimeSpotCheck = TimeSpotCheck;
    }

    public QualityControlStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlStrategy(QualityControlStrategy source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.TimeSpotCheck != null) {
            this.TimeSpotCheck = new TimeSpotCheck(source.TimeSpotCheck);
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

