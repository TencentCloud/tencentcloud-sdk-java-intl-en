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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StrategyConfig extends AbstractModel{

    /**
    * `0`: Disable rolling restart
`1`: Enable rolling restart
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RollingRestartSwitch")
    @Expose
    private Long RollingRestartSwitch;

    /**
    * The number of nodes to be restarted per batch in rolling restart, with a maximum value of 99,999.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * The wait time (in seconds) per batch in rolling restart, with a maximum value of 5 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeWait")
    @Expose
    private Long TimeWait;

    /**
    * The failure handling policy. Valid values: `0` (blocks the process) and `1` (skips).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealOnFail")
    @Expose
    private Long DealOnFail;

    /**
     * Get `0`: Disable rolling restart
`1`: Enable rolling restart
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RollingRestartSwitch `0`: Disable rolling restart
`1`: Enable rolling restart
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRollingRestartSwitch() {
        return this.RollingRestartSwitch;
    }

    /**
     * Set `0`: Disable rolling restart
`1`: Enable rolling restart
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RollingRestartSwitch `0`: Disable rolling restart
`1`: Enable rolling restart
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRollingRestartSwitch(Long RollingRestartSwitch) {
        this.RollingRestartSwitch = RollingRestartSwitch;
    }

    /**
     * Get The number of nodes to be restarted per batch in rolling restart, with a maximum value of 99,999.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BatchSize The number of nodes to be restarted per batch in rolling restart, with a maximum value of 99,999.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set The number of nodes to be restarted per batch in rolling restart, with a maximum value of 99,999.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BatchSize The number of nodes to be restarted per batch in rolling restart, with a maximum value of 99,999.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get The wait time (in seconds) per batch in rolling restart, with a maximum value of 5 minutes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeWait The wait time (in seconds) per batch in rolling restart, with a maximum value of 5 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTimeWait() {
        return this.TimeWait;
    }

    /**
     * Set The wait time (in seconds) per batch in rolling restart, with a maximum value of 5 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeWait The wait time (in seconds) per batch in rolling restart, with a maximum value of 5 minutes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeWait(Long TimeWait) {
        this.TimeWait = TimeWait;
    }

    /**
     * Get The failure handling policy. Valid values: `0` (blocks the process) and `1` (skips).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealOnFail The failure handling policy. Valid values: `0` (blocks the process) and `1` (skips).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDealOnFail() {
        return this.DealOnFail;
    }

    /**
     * Set The failure handling policy. Valid values: `0` (blocks the process) and `1` (skips).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealOnFail The failure handling policy. Valid values: `0` (blocks the process) and `1` (skips).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealOnFail(Long DealOnFail) {
        this.DealOnFail = DealOnFail;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RollingRestartSwitch", this.RollingRestartSwitch);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamSimple(map, prefix + "TimeWait", this.TimeWait);
        this.setParamSimple(map, prefix + "DealOnFail", this.DealOnFail);

    }
}

