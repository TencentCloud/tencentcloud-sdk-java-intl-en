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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddMetricScaleStrategyRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 1 indicates scaling by load rules. 2 indicates scaling by time rules. This parameter is required and should match the following rule policy.
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Load-based scale-out rules.
    */
    @SerializedName("LoadAutoScaleStrategy")
    @Expose
    private LoadAutoScaleStrategy LoadAutoScaleStrategy;

    /**
    * Rule for time-based scaling
    */
    @SerializedName("TimeAutoScaleStrategy")
    @Expose
    private TimeAutoScaleStrategy TimeAutoScaleStrategy;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 1 indicates scaling by load rules. 2 indicates scaling by time rules. This parameter is required and should match the following rule policy. 
     * @return StrategyType 1 indicates scaling by load rules. 2 indicates scaling by time rules. This parameter is required and should match the following rule policy.
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 1 indicates scaling by load rules. 2 indicates scaling by time rules. This parameter is required and should match the following rule policy.
     * @param StrategyType 1 indicates scaling by load rules. 2 indicates scaling by time rules. This parameter is required and should match the following rule policy.
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Load-based scale-out rules. 
     * @return LoadAutoScaleStrategy Load-based scale-out rules.
     */
    public LoadAutoScaleStrategy getLoadAutoScaleStrategy() {
        return this.LoadAutoScaleStrategy;
    }

    /**
     * Set Load-based scale-out rules.
     * @param LoadAutoScaleStrategy Load-based scale-out rules.
     */
    public void setLoadAutoScaleStrategy(LoadAutoScaleStrategy LoadAutoScaleStrategy) {
        this.LoadAutoScaleStrategy = LoadAutoScaleStrategy;
    }

    /**
     * Get Rule for time-based scaling 
     * @return TimeAutoScaleStrategy Rule for time-based scaling
     */
    public TimeAutoScaleStrategy getTimeAutoScaleStrategy() {
        return this.TimeAutoScaleStrategy;
    }

    /**
     * Set Rule for time-based scaling
     * @param TimeAutoScaleStrategy Rule for time-based scaling
     */
    public void setTimeAutoScaleStrategy(TimeAutoScaleStrategy TimeAutoScaleStrategy) {
        this.TimeAutoScaleStrategy = TimeAutoScaleStrategy;
    }

    public AddMetricScaleStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddMetricScaleStrategyRequest(AddMetricScaleStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.LoadAutoScaleStrategy != null) {
            this.LoadAutoScaleStrategy = new LoadAutoScaleStrategy(source.LoadAutoScaleStrategy);
        }
        if (source.TimeAutoScaleStrategy != null) {
            this.TimeAutoScaleStrategy = new TimeAutoScaleStrategy(source.TimeAutoScaleStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamObj(map, prefix + "LoadAutoScaleStrategy.", this.LoadAutoScaleStrategy);
        this.setParamObj(map, prefix + "TimeAutoScaleStrategy.", this.TimeAutoScaleStrategy);

    }
}

