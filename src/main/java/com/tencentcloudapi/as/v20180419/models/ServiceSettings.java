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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSettings extends AbstractModel {

    /**
    * Enables unhealthy instance replacement. If this feature is enabled, AS will replace instances that are flagged as unhealthy by Cloud Monitor. If this parameter is not specified, the value will be False by default.
    */
    @SerializedName("ReplaceMonitorUnhealthy")
    @Expose
    private Boolean ReplaceMonitorUnhealthy;

    /**
    * Valid values: 
CLASSIC_SCALING: this is the typical scaling method, which creates and terminates instances to perform scaling operations. 
WAKE_UP_STOPPED_SCALING: this scaling method first tries to start stopped instances. If the number of instances woken up is insufficient, the system creates new instances for scale-out. For scale-in, instances are terminated as in the typical method. You can use the StopAutoScalingInstances API to stop instances in the scaling group. Scale-out operations triggered by alarms will still create new instances.
Default value: CLASSIC_SCALING
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * Enable unhealthy instance replacement. If this feature is enabled, AS will replace instances that are found unhealthy in the CLB health check. If this parameter is not specified, the default value `False` will be used.
    */
    @SerializedName("ReplaceLoadBalancerUnhealthy")
    @Expose
    private Boolean ReplaceLoadBalancerUnhealthy;

    /**
     * Get Enables unhealthy instance replacement. If this feature is enabled, AS will replace instances that are flagged as unhealthy by Cloud Monitor. If this parameter is not specified, the value will be False by default. 
     * @return ReplaceMonitorUnhealthy Enables unhealthy instance replacement. If this feature is enabled, AS will replace instances that are flagged as unhealthy by Cloud Monitor. If this parameter is not specified, the value will be False by default.
     */
    public Boolean getReplaceMonitorUnhealthy() {
        return this.ReplaceMonitorUnhealthy;
    }

    /**
     * Set Enables unhealthy instance replacement. If this feature is enabled, AS will replace instances that are flagged as unhealthy by Cloud Monitor. If this parameter is not specified, the value will be False by default.
     * @param ReplaceMonitorUnhealthy Enables unhealthy instance replacement. If this feature is enabled, AS will replace instances that are flagged as unhealthy by Cloud Monitor. If this parameter is not specified, the value will be False by default.
     */
    public void setReplaceMonitorUnhealthy(Boolean ReplaceMonitorUnhealthy) {
        this.ReplaceMonitorUnhealthy = ReplaceMonitorUnhealthy;
    }

    /**
     * Get Valid values: 
CLASSIC_SCALING: this is the typical scaling method, which creates and terminates instances to perform scaling operations. 
WAKE_UP_STOPPED_SCALING: this scaling method first tries to start stopped instances. If the number of instances woken up is insufficient, the system creates new instances for scale-out. For scale-in, instances are terminated as in the typical method. You can use the StopAutoScalingInstances API to stop instances in the scaling group. Scale-out operations triggered by alarms will still create new instances.
Default value: CLASSIC_SCALING 
     * @return ScalingMode Valid values: 
CLASSIC_SCALING: this is the typical scaling method, which creates and terminates instances to perform scaling operations. 
WAKE_UP_STOPPED_SCALING: this scaling method first tries to start stopped instances. If the number of instances woken up is insufficient, the system creates new instances for scale-out. For scale-in, instances are terminated as in the typical method. You can use the StopAutoScalingInstances API to stop instances in the scaling group. Scale-out operations triggered by alarms will still create new instances.
Default value: CLASSIC_SCALING
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set Valid values: 
CLASSIC_SCALING: this is the typical scaling method, which creates and terminates instances to perform scaling operations. 
WAKE_UP_STOPPED_SCALING: this scaling method first tries to start stopped instances. If the number of instances woken up is insufficient, the system creates new instances for scale-out. For scale-in, instances are terminated as in the typical method. You can use the StopAutoScalingInstances API to stop instances in the scaling group. Scale-out operations triggered by alarms will still create new instances.
Default value: CLASSIC_SCALING
     * @param ScalingMode Valid values: 
CLASSIC_SCALING: this is the typical scaling method, which creates and terminates instances to perform scaling operations. 
WAKE_UP_STOPPED_SCALING: this scaling method first tries to start stopped instances. If the number of instances woken up is insufficient, the system creates new instances for scale-out. For scale-in, instances are terminated as in the typical method. You can use the StopAutoScalingInstances API to stop instances in the scaling group. Scale-out operations triggered by alarms will still create new instances.
Default value: CLASSIC_SCALING
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Get Enable unhealthy instance replacement. If this feature is enabled, AS will replace instances that are found unhealthy in the CLB health check. If this parameter is not specified, the default value `False` will be used. 
     * @return ReplaceLoadBalancerUnhealthy Enable unhealthy instance replacement. If this feature is enabled, AS will replace instances that are found unhealthy in the CLB health check. If this parameter is not specified, the default value `False` will be used.
     */
    public Boolean getReplaceLoadBalancerUnhealthy() {
        return this.ReplaceLoadBalancerUnhealthy;
    }

    /**
     * Set Enable unhealthy instance replacement. If this feature is enabled, AS will replace instances that are found unhealthy in the CLB health check. If this parameter is not specified, the default value `False` will be used.
     * @param ReplaceLoadBalancerUnhealthy Enable unhealthy instance replacement. If this feature is enabled, AS will replace instances that are found unhealthy in the CLB health check. If this parameter is not specified, the default value `False` will be used.
     */
    public void setReplaceLoadBalancerUnhealthy(Boolean ReplaceLoadBalancerUnhealthy) {
        this.ReplaceLoadBalancerUnhealthy = ReplaceLoadBalancerUnhealthy;
    }

    public ServiceSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceSettings(ServiceSettings source) {
        if (source.ReplaceMonitorUnhealthy != null) {
            this.ReplaceMonitorUnhealthy = new Boolean(source.ReplaceMonitorUnhealthy);
        }
        if (source.ScalingMode != null) {
            this.ScalingMode = new String(source.ScalingMode);
        }
        if (source.ReplaceLoadBalancerUnhealthy != null) {
            this.ReplaceLoadBalancerUnhealthy = new Boolean(source.ReplaceLoadBalancerUnhealthy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplaceMonitorUnhealthy", this.ReplaceMonitorUnhealthy);
        this.setParamSimple(map, prefix + "ScalingMode", this.ScalingMode);
        this.setParamSimple(map, prefix + "ReplaceLoadBalancerUnhealthy", this.ReplaceLoadBalancerUnhealthy);

    }
}

