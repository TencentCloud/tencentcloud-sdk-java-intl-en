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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricConfig extends AbstractModel{

    /**
    * Allowed operator
    */
    @SerializedName("Operator")
    @Expose
    private String [] Operator;

    /**
    * Allowed data cycle in seconds
    */
    @SerializedName("Period")
    @Expose
    private Long [] Period;

    /**
    * Allowed number of continuous cycles
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long [] ContinuePeriod;

    /**
     * Get Allowed operator 
     * @return Operator Allowed operator
     */
    public String [] getOperator() {
        return this.Operator;
    }

    /**
     * Set Allowed operator
     * @param Operator Allowed operator
     */
    public void setOperator(String [] Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Allowed data cycle in seconds 
     * @return Period Allowed data cycle in seconds
     */
    public Long [] getPeriod() {
        return this.Period;
    }

    /**
     * Set Allowed data cycle in seconds
     * @param Period Allowed data cycle in seconds
     */
    public void setPeriod(Long [] Period) {
        this.Period = Period;
    }

    /**
     * Get Allowed number of continuous cycles 
     * @return ContinuePeriod Allowed number of continuous cycles
     */
    public Long [] getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set Allowed number of continuous cycles
     * @param ContinuePeriod Allowed number of continuous cycles
     */
    public void setContinuePeriod(Long [] ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "Period.", this.Period);
        this.setParamArraySimple(map, prefix + "ContinuePeriod.", this.ContinuePeriod);

    }
}

