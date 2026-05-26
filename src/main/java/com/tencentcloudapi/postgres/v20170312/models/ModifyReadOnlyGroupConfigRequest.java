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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReadOnlyGroupConfigRequest extends AbstractModel {

    /**
    * Read-Only group ID.
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60.
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * Whether to remove a read-only replica from an RO group if the delay between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes).
    */
    @SerializedName("ReplayLagEliminate")
    @Expose
    private Long ReplayLagEliminate;

    /**
    * Whether to remove a read-only replica from an RO group if the sync log size difference between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes).
    */
    @SerializedName("ReplayLatencyEliminate")
    @Expose
    private Long ReplayLatencyEliminate;

    /**
    * Delay log size threshold in MB. specifies a positive integer when enabling the delay log size configuration.
    */
    @SerializedName("MaxReplayLatency")
    @Expose
    private Long MaxReplayLatency;

    /**
    * Delay time size threshold, unit: s. when enabling the delay time configuration, manually input a positive integer.
    */
    @SerializedName("MaxReplayLag")
    @Expose
    private Long MaxReplayLag;

    /**
    * Whether to enable automatic load balancing. Valid values: `0` (disable), `1` (enable).
    */
    @SerializedName("Rebalance")
    @Expose
    private Long Rebalance;

    /**
    * Specifies the minimum number of instances to retain with delay removal. value range [0,100].
    */
    @SerializedName("MinDelayEliminateReserve")
    @Expose
    private Long MinDelayEliminateReserve;

    /**
     * Get Read-Only group ID. 
     * @return ReadOnlyGroupId Read-Only group ID.
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set Read-Only group ID.
     * @param ReadOnlyGroupId Read-Only group ID.
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60. 
     * @return ReadOnlyGroupName Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60.
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60.
     * @param ReadOnlyGroupName Read-Only group name. only supports chinese, english, digits, "_", or "-" with length less than 60.
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get Whether to remove a read-only replica from an RO group if the delay between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes). 
     * @return ReplayLagEliminate Whether to remove a read-only replica from an RO group if the delay between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes).
     */
    public Long getReplayLagEliminate() {
        return this.ReplayLagEliminate;
    }

    /**
     * Set Whether to remove a read-only replica from an RO group if the delay between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes).
     * @param ReplayLagEliminate Whether to remove a read-only replica from an RO group if the delay between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes).
     */
    public void setReplayLagEliminate(Long ReplayLagEliminate) {
        this.ReplayLagEliminate = ReplayLagEliminate;
    }

    /**
     * Get Whether to remove a read-only replica from an RO group if the sync log size difference between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes). 
     * @return ReplayLatencyEliminate Whether to remove a read-only replica from an RO group if the sync log size difference between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes).
     */
    public Long getReplayLatencyEliminate() {
        return this.ReplayLatencyEliminate;
    }

    /**
     * Set Whether to remove a read-only replica from an RO group if the sync log size difference between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes).
     * @param ReplayLatencyEliminate Whether to remove a read-only replica from an RO group if the sync log size difference between the read-only replica and the primary instance exceeds the threshold. Valid values: `0` (no), `1` (yes).
     */
    public void setReplayLatencyEliminate(Long ReplayLatencyEliminate) {
        this.ReplayLatencyEliminate = ReplayLatencyEliminate;
    }

    /**
     * Get Delay log size threshold in MB. specifies a positive integer when enabling the delay log size configuration. 
     * @return MaxReplayLatency Delay log size threshold in MB. specifies a positive integer when enabling the delay log size configuration.
     */
    public Long getMaxReplayLatency() {
        return this.MaxReplayLatency;
    }

    /**
     * Set Delay log size threshold in MB. specifies a positive integer when enabling the delay log size configuration.
     * @param MaxReplayLatency Delay log size threshold in MB. specifies a positive integer when enabling the delay log size configuration.
     */
    public void setMaxReplayLatency(Long MaxReplayLatency) {
        this.MaxReplayLatency = MaxReplayLatency;
    }

    /**
     * Get Delay time size threshold, unit: s. when enabling the delay time configuration, manually input a positive integer. 
     * @return MaxReplayLag Delay time size threshold, unit: s. when enabling the delay time configuration, manually input a positive integer.
     */
    public Long getMaxReplayLag() {
        return this.MaxReplayLag;
    }

    /**
     * Set Delay time size threshold, unit: s. when enabling the delay time configuration, manually input a positive integer.
     * @param MaxReplayLag Delay time size threshold, unit: s. when enabling the delay time configuration, manually input a positive integer.
     */
    public void setMaxReplayLag(Long MaxReplayLag) {
        this.MaxReplayLag = MaxReplayLag;
    }

    /**
     * Get Whether to enable automatic load balancing. Valid values: `0` (disable), `1` (enable). 
     * @return Rebalance Whether to enable automatic load balancing. Valid values: `0` (disable), `1` (enable).
     */
    public Long getRebalance() {
        return this.Rebalance;
    }

    /**
     * Set Whether to enable automatic load balancing. Valid values: `0` (disable), `1` (enable).
     * @param Rebalance Whether to enable automatic load balancing. Valid values: `0` (disable), `1` (enable).
     */
    public void setRebalance(Long Rebalance) {
        this.Rebalance = Rebalance;
    }

    /**
     * Get Specifies the minimum number of instances to retain with delay removal. value range [0,100]. 
     * @return MinDelayEliminateReserve Specifies the minimum number of instances to retain with delay removal. value range [0,100].
     */
    public Long getMinDelayEliminateReserve() {
        return this.MinDelayEliminateReserve;
    }

    /**
     * Set Specifies the minimum number of instances to retain with delay removal. value range [0,100].
     * @param MinDelayEliminateReserve Specifies the minimum number of instances to retain with delay removal. value range [0,100].
     */
    public void setMinDelayEliminateReserve(Long MinDelayEliminateReserve) {
        this.MinDelayEliminateReserve = MinDelayEliminateReserve;
    }

    public ModifyReadOnlyGroupConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReadOnlyGroupConfigRequest(ModifyReadOnlyGroupConfigRequest source) {
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.ReplayLagEliminate != null) {
            this.ReplayLagEliminate = new Long(source.ReplayLagEliminate);
        }
        if (source.ReplayLatencyEliminate != null) {
            this.ReplayLatencyEliminate = new Long(source.ReplayLatencyEliminate);
        }
        if (source.MaxReplayLatency != null) {
            this.MaxReplayLatency = new Long(source.MaxReplayLatency);
        }
        if (source.MaxReplayLag != null) {
            this.MaxReplayLag = new Long(source.MaxReplayLag);
        }
        if (source.Rebalance != null) {
            this.Rebalance = new Long(source.Rebalance);
        }
        if (source.MinDelayEliminateReserve != null) {
            this.MinDelayEliminateReserve = new Long(source.MinDelayEliminateReserve);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "ReplayLagEliminate", this.ReplayLagEliminate);
        this.setParamSimple(map, prefix + "ReplayLatencyEliminate", this.ReplayLatencyEliminate);
        this.setParamSimple(map, prefix + "MaxReplayLatency", this.MaxReplayLatency);
        this.setParamSimple(map, prefix + "MaxReplayLag", this.MaxReplayLag);
        this.setParamSimple(map, prefix + "Rebalance", this.Rebalance);
        this.setParamSimple(map, prefix + "MinDelayEliminateReserve", this.MinDelayEliminateReserve);

    }
}

