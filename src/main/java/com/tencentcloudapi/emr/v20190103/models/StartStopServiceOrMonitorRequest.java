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
    * Cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Operation type. Valid values:
<li>StartService: Start the service.</li>
<li>StopService: Stop the service.</li>
<li>StartMonitor: Exit maintenance.</li>
<li>StopMonitor: Enter maintenance.</li>
<li>RestartService: Restart the service. If RestartService is selected as the operation type, StrategyConfig (operation policy) is required.</li>
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * Operation scope.
    */
    @SerializedName("OpScope")
    @Expose
    private OpScope OpScope;

    /**
    * Operation policy.
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
    * This parameter is available only when OpType is <li>StopMonitor</li>. true indicates that the system enters the maintenance mode but still monitors processes without starting them.
    */
    @SerializedName("KeepMonitorButNotRecoverProcess")
    @Expose
    private Boolean KeepMonitorButNotRecoverProcess;

    /**
     * Get Cluster ID. 
     * @return InstanceId Cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID.
     * @param InstanceId Cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Operation type. Valid values:
<li>StartService: Start the service.</li>
<li>StopService: Stop the service.</li>
<li>StartMonitor: Exit maintenance.</li>
<li>StopMonitor: Enter maintenance.</li>
<li>RestartService: Restart the service. If RestartService is selected as the operation type, StrategyConfig (operation policy) is required.</li> 
     * @return OpType Operation type. Valid values:
<li>StartService: Start the service.</li>
<li>StopService: Stop the service.</li>
<li>StartMonitor: Exit maintenance.</li>
<li>StopMonitor: Enter maintenance.</li>
<li>RestartService: Restart the service. If RestartService is selected as the operation type, StrategyConfig (operation policy) is required.</li>
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set Operation type. Valid values:
<li>StartService: Start the service.</li>
<li>StopService: Stop the service.</li>
<li>StartMonitor: Exit maintenance.</li>
<li>StopMonitor: Enter maintenance.</li>
<li>RestartService: Restart the service. If RestartService is selected as the operation type, StrategyConfig (operation policy) is required.</li>
     * @param OpType Operation type. Valid values:
<li>StartService: Start the service.</li>
<li>StopService: Stop the service.</li>
<li>StartMonitor: Exit maintenance.</li>
<li>StopMonitor: Enter maintenance.</li>
<li>RestartService: Restart the service. If RestartService is selected as the operation type, StrategyConfig (operation policy) is required.</li>
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get Operation scope. 
     * @return OpScope Operation scope.
     */
    public OpScope getOpScope() {
        return this.OpScope;
    }

    /**
     * Set Operation scope.
     * @param OpScope Operation scope.
     */
    public void setOpScope(OpScope OpScope) {
        this.OpScope = OpScope;
    }

    /**
     * Get Operation policy. 
     * @return StrategyConfig Operation policy.
     */
    public StrategyConfig getStrategyConfig() {
        return this.StrategyConfig;
    }

    /**
     * Set Operation policy.
     * @param StrategyConfig Operation policy.
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
     * Get This parameter is available only when OpType is <li>StopMonitor</li>. true indicates that the system enters the maintenance mode but still monitors processes without starting them. 
     * @return KeepMonitorButNotRecoverProcess This parameter is available only when OpType is <li>StopMonitor</li>. true indicates that the system enters the maintenance mode but still monitors processes without starting them.
     */
    public Boolean getKeepMonitorButNotRecoverProcess() {
        return this.KeepMonitorButNotRecoverProcess;
    }

    /**
     * Set This parameter is available only when OpType is <li>StopMonitor</li>. true indicates that the system enters the maintenance mode but still monitors processes without starting them.
     * @param KeepMonitorButNotRecoverProcess This parameter is available only when OpType is <li>StopMonitor</li>. true indicates that the system enters the maintenance mode but still monitors processes without starting them.
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

