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

public class StrategyConfig extends AbstractModel {

    /**
    * 0: disables rolling restart.
1: enables rolling start.
    */
    @SerializedName("RollingRestartSwitch")
    @Expose
    private Long RollingRestartSwitch;

    /**
    * Number of instances to restart per batch for rolling restart. Maximum value: 99999.
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * Stop and wait time for rolling restart per batch. Maximum interval: 5 minutes. Unit: seconds.
    */
    @SerializedName("TimeWait")
    @Expose
    private Long TimeWait;

    /**
    * Operation failure processing policy. Valid values: 0 (blocking upon the failure) and 1 (automatically skipping the failure).
    */
    @SerializedName("DealOnFail")
    @Expose
    private Long DealOnFail;

    /**
    * Parameters required in the instruction.
    */
    @SerializedName("Args")
    @Expose
    private Arg [] Args;

    /**
     * Get 0: disables rolling restart.
1: enables rolling start. 
     * @return RollingRestartSwitch 0: disables rolling restart.
1: enables rolling start.
     */
    public Long getRollingRestartSwitch() {
        return this.RollingRestartSwitch;
    }

    /**
     * Set 0: disables rolling restart.
1: enables rolling start.
     * @param RollingRestartSwitch 0: disables rolling restart.
1: enables rolling start.
     */
    public void setRollingRestartSwitch(Long RollingRestartSwitch) {
        this.RollingRestartSwitch = RollingRestartSwitch;
    }

    /**
     * Get Number of instances to restart per batch for rolling restart. Maximum value: 99999. 
     * @return BatchSize Number of instances to restart per batch for rolling restart. Maximum value: 99999.
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set Number of instances to restart per batch for rolling restart. Maximum value: 99999.
     * @param BatchSize Number of instances to restart per batch for rolling restart. Maximum value: 99999.
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get Stop and wait time for rolling restart per batch. Maximum interval: 5 minutes. Unit: seconds. 
     * @return TimeWait Stop and wait time for rolling restart per batch. Maximum interval: 5 minutes. Unit: seconds.
     */
    public Long getTimeWait() {
        return this.TimeWait;
    }

    /**
     * Set Stop and wait time for rolling restart per batch. Maximum interval: 5 minutes. Unit: seconds.
     * @param TimeWait Stop and wait time for rolling restart per batch. Maximum interval: 5 minutes. Unit: seconds.
     */
    public void setTimeWait(Long TimeWait) {
        this.TimeWait = TimeWait;
    }

    /**
     * Get Operation failure processing policy. Valid values: 0 (blocking upon the failure) and 1 (automatically skipping the failure). 
     * @return DealOnFail Operation failure processing policy. Valid values: 0 (blocking upon the failure) and 1 (automatically skipping the failure).
     */
    public Long getDealOnFail() {
        return this.DealOnFail;
    }

    /**
     * Set Operation failure processing policy. Valid values: 0 (blocking upon the failure) and 1 (automatically skipping the failure).
     * @param DealOnFail Operation failure processing policy. Valid values: 0 (blocking upon the failure) and 1 (automatically skipping the failure).
     */
    public void setDealOnFail(Long DealOnFail) {
        this.DealOnFail = DealOnFail;
    }

    /**
     * Get Parameters required in the instruction. 
     * @return Args Parameters required in the instruction.
     */
    public Arg [] getArgs() {
        return this.Args;
    }

    /**
     * Set Parameters required in the instruction.
     * @param Args Parameters required in the instruction.
     */
    public void setArgs(Arg [] Args) {
        this.Args = Args;
    }

    public StrategyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyConfig(StrategyConfig source) {
        if (source.RollingRestartSwitch != null) {
            this.RollingRestartSwitch = new Long(source.RollingRestartSwitch);
        }
        if (source.BatchSize != null) {
            this.BatchSize = new Long(source.BatchSize);
        }
        if (source.TimeWait != null) {
            this.TimeWait = new Long(source.TimeWait);
        }
        if (source.DealOnFail != null) {
            this.DealOnFail = new Long(source.DealOnFail);
        }
        if (source.Args != null) {
            this.Args = new Arg[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new Arg(source.Args[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RollingRestartSwitch", this.RollingRestartSwitch);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamSimple(map, prefix + "TimeWait", this.TimeWait);
        this.setParamSimple(map, prefix + "DealOnFail", this.DealOnFail);
        this.setParamArrayObj(map, prefix + "Args.", this.Args);

    }
}

