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

public class StartStopServiceOrMonitorRequest extends AbstractModel {

    /**
    * The cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The operation type. Valid values:
<li>StartService: Start service</li>
<li>StopService: Stop service</li>
<li>StartMonitor: Start maintenance</li>
<li>StopMonitor: Stop maintenance</li>
<li>RestartService: Restart service. If this type is selected, "StrategyConfig" is required.</li>
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * The operation scope.
    */
    @SerializedName("OpScope")
    @Expose
    private OpScope OpScope;

    /**
    * The operation policy.
    */
    @SerializedName("StrategyConfig")
    @Expose
    private StrategyConfig StrategyConfig;

    /**
    * Parameters used for suspending services.
    */
    @SerializedName("StopParams")
    @Expose
    private StopParams StopParams;

    /**
    * This parameter is available only when OpType is <li>StopMonitor</li>. True indicates that the system enters the maintenance mode but still monitors processes without starting them.
    */
    @SerializedName("KeepMonitorButNotRecoverProcess")
    @Expose
    private Boolean KeepMonitorButNotRecoverProcess;

    /**
     * Get The cluster ID. 
     * @return InstanceId The cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The cluster ID.
     * @param InstanceId The cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The operation type. Valid values:
<li>StartService: Start service</li>
<li>StopService: Stop service</li>
<li>StartMonitor: Start maintenance</li>
<li>StopMonitor: Stop maintenance</li>
<li>RestartService: Restart service. If this type is selected, "StrategyConfig" is required.</li> 
     * @return OpType The operation type. Valid values:
<li>StartService: Start service</li>
<li>StopService: Stop service</li>
<li>StartMonitor: Start maintenance</li>
<li>StopMonitor: Stop maintenance</li>
<li>RestartService: Restart service. If this type is selected, "StrategyConfig" is required.</li>
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set The operation type. Valid values:
<li>StartService: Start service</li>
<li>StopService: Stop service</li>
<li>StartMonitor: Start maintenance</li>
<li>StopMonitor: Stop maintenance</li>
<li>RestartService: Restart service. If this type is selected, "StrategyConfig" is required.</li>
     * @param OpType The operation type. Valid values:
<li>StartService: Start service</li>
<li>StopService: Stop service</li>
<li>StartMonitor: Start maintenance</li>
<li>StopMonitor: Stop maintenance</li>
<li>RestartService: Restart service. If this type is selected, "StrategyConfig" is required.</li>
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get The operation scope. 
     * @return OpScope The operation scope.
     */
    public OpScope getOpScope() {
        return this.OpScope;
    }

    /**
     * Set The operation scope.
     * @param OpScope The operation scope.
     */
    public void setOpScope(OpScope OpScope) {
        this.OpScope = OpScope;
    }

    /**
     * Get The operation policy. 
     * @return StrategyConfig The operation policy.
     */
    public StrategyConfig getStrategyConfig() {
        return this.StrategyConfig;
    }

    /**
     * Set The operation policy.
     * @param StrategyConfig The operation policy.
     */
    public void setStrategyConfig(StrategyConfig StrategyConfig) {
        this.StrategyConfig = StrategyConfig;
    }

    /**
     * Get Parameters used for suspending services. 
     * @return StopParams Parameters used for suspending services.
     */
    public StopParams getStopParams() {
        return this.StopParams;
    }

    /**
     * Set Parameters used for suspending services.
     * @param StopParams Parameters used for suspending services.
     */
    public void setStopParams(StopParams StopParams) {
        this.StopParams = StopParams;
    }

    /**
     * Get This parameter is available only when OpType is <li>StopMonitor</li>. True indicates that the system enters the maintenance mode but still monitors processes without starting them. 
     * @return KeepMonitorButNotRecoverProcess This parameter is available only when OpType is <li>StopMonitor</li>. True indicates that the system enters the maintenance mode but still monitors processes without starting them.
     */
    public Boolean getKeepMonitorButNotRecoverProcess() {
        return this.KeepMonitorButNotRecoverProcess;
    }

    /**
     * Set This parameter is available only when OpType is <li>StopMonitor</li>. True indicates that the system enters the maintenance mode but still monitors processes without starting them.
     * @param KeepMonitorButNotRecoverProcess This parameter is available only when OpType is <li>StopMonitor</li>. True indicates that the system enters the maintenance mode but still monitors processes without starting them.
     */
    public void setKeepMonitorButNotRecoverProcess(Boolean KeepMonitorButNotRecoverProcess) {
        this.KeepMonitorButNotRecoverProcess = KeepMonitorButNotRecoverProcess;
    }

    public StartStopServiceOrMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartStopServiceOrMonitorRequest(StartStopServiceOrMonitorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OpType != null) {
            this.OpType = new String(source.OpType);
        }
        if (source.OpScope != null) {
            this.OpScope = new OpScope(source.OpScope);
        }
        if (source.StrategyConfig != null) {
            this.StrategyConfig = new StrategyConfig(source.StrategyConfig);
        }
        if (source.StopParams != null) {
            this.StopParams = new StopParams(source.StopParams);
        }
        if (source.KeepMonitorButNotRecoverProcess != null) {
            this.KeepMonitorButNotRecoverProcess = new Boolean(source.KeepMonitorButNotRecoverProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamObj(map, prefix + "OpScope.", this.OpScope);
        this.setParamObj(map, prefix + "StrategyConfig.", this.StrategyConfig);
        this.setParamObj(map, prefix + "StopParams.", this.StopParams);
        this.setParamSimple(map, prefix + "KeepMonitorButNotRecoverProcess", this.KeepMonitorButNotRecoverProcess);

    }
}

