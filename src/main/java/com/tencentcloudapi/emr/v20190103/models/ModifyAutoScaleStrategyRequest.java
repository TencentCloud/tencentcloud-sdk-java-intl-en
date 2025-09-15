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

public class ModifyAutoScaleStrategyRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Metric for load-based scaling.
    */
    @SerializedName("LoadAutoScaleStrategies")
    @Expose
    private LoadAutoScaleStrategy [] LoadAutoScaleStrategies;

    /**
    * Rule for time-based scaling
    */
    @SerializedName("TimeAutoScaleStrategies")
    @Expose
    private TimeAutoScaleStrategy [] TimeAutoScaleStrategies;

    /**
    * Scaling group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

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
     * Get Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time 
     * @return StrategyType Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time
     * @param StrategyType Automatic scaling rule type. 1: Scaling by load metrics; 2: Scaling by time
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Metric for load-based scaling. 
     * @return LoadAutoScaleStrategies Metric for load-based scaling.
     */
    public LoadAutoScaleStrategy [] getLoadAutoScaleStrategies() {
        return this.LoadAutoScaleStrategies;
    }

    /**
     * Set Metric for load-based scaling.
     * @param LoadAutoScaleStrategies Metric for load-based scaling.
     */
    public void setLoadAutoScaleStrategies(LoadAutoScaleStrategy [] LoadAutoScaleStrategies) {
        this.LoadAutoScaleStrategies = LoadAutoScaleStrategies;
    }

    /**
     * Get Rule for time-based scaling 
     * @return TimeAutoScaleStrategies Rule for time-based scaling
     */
    public TimeAutoScaleStrategy [] getTimeAutoScaleStrategies() {
        return this.TimeAutoScaleStrategies;
    }

    /**
     * Set Rule for time-based scaling
     * @param TimeAutoScaleStrategies Rule for time-based scaling
     */
    public void setTimeAutoScaleStrategies(TimeAutoScaleStrategy [] TimeAutoScaleStrategies) {
        this.TimeAutoScaleStrategies = TimeAutoScaleStrategies;
    }

    /**
     * Get Scaling group ID. 
     * @return GroupId Scaling group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Scaling group ID.
     * @param GroupId Scaling group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    public ModifyAutoScaleStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoScaleStrategyRequest(ModifyAutoScaleStrategyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.LoadAutoScaleStrategies != null) {
            this.LoadAutoScaleStrategies = new LoadAutoScaleStrategy[source.LoadAutoScaleStrategies.length];
            for (int i = 0; i < source.LoadAutoScaleStrategies.length; i++) {
                this.LoadAutoScaleStrategies[i] = new LoadAutoScaleStrategy(source.LoadAutoScaleStrategies[i]);
            }
        }
        if (source.TimeAutoScaleStrategies != null) {
            this.TimeAutoScaleStrategies = new TimeAutoScaleStrategy[source.TimeAutoScaleStrategies.length];
            for (int i = 0; i < source.TimeAutoScaleStrategies.length; i++) {
                this.TimeAutoScaleStrategies[i] = new TimeAutoScaleStrategy(source.TimeAutoScaleStrategies[i]);
            }
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamArrayObj(map, prefix + "LoadAutoScaleStrategies.", this.LoadAutoScaleStrategies);
        this.setParamArrayObj(map, prefix + "TimeAutoScaleStrategies.", this.TimeAutoScaleStrategies);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

