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
    * 0: disable rolling restart.
1: enable rolling start.
    */
    @SerializedName("RollingRestartSwitch")
    @Expose
    private Long RollingRestartSwitch;

    /**
    * Rolling restart quantity per batch, which is up to 99999.
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * Stop and wait time for rolling restart per batch, with the maximum interval of 5 minutes and the unit of seconds.
    */
    @SerializedName("TimeWait")
    @Expose
    private Long TimeWait;

    /**
    * Operation failure processing policy. 0: Block upon failure, 1: Automatically skipping failure.
    */
    @SerializedName("DealOnFail")
    @Expose
    private Long DealOnFail;

    /**
    * Parameters required in the instruction.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Args")
    @Expose
    private Arg [] Args;

    /**
     * Get 0: disable rolling restart.
1: enable rolling start. 
     * @return RollingRestartSwitch 0: disable rolling restart.
1: enable rolling start.
     */
    public Long getRollingRestartSwitch() {
        return this.RollingRestartSwitch;
    }

    /**
     * Set 0: disable rolling restart.
1: enable rolling start.
     * @param RollingRestartSwitch 0: disable rolling restart.
1: enable rolling start.
     */
    public void setRollingRestartSwitch(Long RollingRestartSwitch) {
        this.RollingRestartSwitch = RollingRestartSwitch;
    }

    /**
     * Get Rolling restart quantity per batch, which is up to 99999. 
     * @return BatchSize Rolling restart quantity per batch, which is up to 99999.
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set Rolling restart quantity per batch, which is up to 99999.
     * @param BatchSize Rolling restart quantity per batch, which is up to 99999.
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get Stop and wait time for rolling restart per batch, with the maximum interval of 5 minutes and the unit of seconds. 
     * @return TimeWait Stop and wait time for rolling restart per batch, with the maximum interval of 5 minutes and the unit of seconds.
     */
    public Long getTimeWait() {
        return this.TimeWait;
    }

    /**
     * Set Stop and wait time for rolling restart per batch, with the maximum interval of 5 minutes and the unit of seconds.
     * @param TimeWait Stop and wait time for rolling restart per batch, with the maximum interval of 5 minutes and the unit of seconds.
     */
    public void setTimeWait(Long TimeWait) {
        this.TimeWait = TimeWait;
    }

    /**
     * Get Operation failure processing policy. 0: Block upon failure, 1: Automatically skipping failure. 
     * @return DealOnFail Operation failure processing policy. 0: Block upon failure, 1: Automatically skipping failure.
     */
    public Long getDealOnFail() {
        return this.DealOnFail;
    }

    /**
     * Set Operation failure processing policy. 0: Block upon failure, 1: Automatically skipping failure.
     * @param DealOnFail Operation failure processing policy. 0: Block upon failure, 1: Automatically skipping failure.
     */
    public void setDealOnFail(Long DealOnFail) {
        this.DealOnFail = DealOnFail;
    }

    /**
     * Get Parameters required in the instruction.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Args Parameters required in the instruction.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Arg [] getArgs() {
        return this.Args;
    }

    /**
     * Set Parameters required in the instruction.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Args Parameters required in the instruction.
Note: This field may return null, indicating that no valid values can be obtained.
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

