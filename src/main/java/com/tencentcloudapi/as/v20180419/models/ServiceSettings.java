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
    * Replace mode of unhealthy replacement service. Valid values:
RECREATE: Rebuild an instance to replace the original unhealthy instance.
RESET: Performing a system reinstallation on unhealthy instances to keep information such as data disks, private IP addresses, and instance IDs unchanged. The instance login settings, HostName, enhanced services, and UserData will remain consistent with the current launch configuration.
Default value: RECREATE.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplaceMode")
    @Expose
    private String ReplaceMode;

    /**
    * Automatic instance tag update. The default value is false. If this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (This feature takes effect for tag creation and editing but not tag deletion.) The update does not take effect immediately due to certain latency.
    */
    @SerializedName("AutoUpdateInstanceTags")
    @Expose
    private Boolean AutoUpdateInstanceTags;

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

    /**
     * Get Replace mode of unhealthy replacement service. Valid values:
RECREATE: Rebuild an instance to replace the original unhealthy instance.
RESET: Performing a system reinstallation on unhealthy instances to keep information such as data disks, private IP addresses, and instance IDs unchanged. The instance login settings, HostName, enhanced services, and UserData will remain consistent with the current launch configuration.
Default value: RECREATE.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReplaceMode Replace mode of unhealthy replacement service. Valid values:
RECREATE: Rebuild an instance to replace the original unhealthy instance.
RESET: Performing a system reinstallation on unhealthy instances to keep information such as data disks, private IP addresses, and instance IDs unchanged. The instance login settings, HostName, enhanced services, and UserData will remain consistent with the current launch configuration.
Default value: RECREATE.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReplaceMode() {
        return this.ReplaceMode;
    }

    /**
     * Set Replace mode of unhealthy replacement service. Valid values:
RECREATE: Rebuild an instance to replace the original unhealthy instance.
RESET: Performing a system reinstallation on unhealthy instances to keep information such as data disks, private IP addresses, and instance IDs unchanged. The instance login settings, HostName, enhanced services, and UserData will remain consistent with the current launch configuration.
Default value: RECREATE.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReplaceMode Replace mode of unhealthy replacement service. Valid values:
RECREATE: Rebuild an instance to replace the original unhealthy instance.
RESET: Performing a system reinstallation on unhealthy instances to keep information such as data disks, private IP addresses, and instance IDs unchanged. The instance login settings, HostName, enhanced services, and UserData will remain consistent with the current launch configuration.
Default value: RECREATE.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplaceMode(String ReplaceMode) {
        this.ReplaceMode = ReplaceMode;
    }

    /**
     * Get Automatic instance tag update. The default value is false. If this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (This feature takes effect for tag creation and editing but not tag deletion.) The update does not take effect immediately due to certain latency. 
     * @return AutoUpdateInstanceTags Automatic instance tag update. The default value is false. If this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (This feature takes effect for tag creation and editing but not tag deletion.) The update does not take effect immediately due to certain latency.
     */
    public Boolean getAutoUpdateInstanceTags() {
        return this.AutoUpdateInstanceTags;
    }

    /**
     * Set Automatic instance tag update. The default value is false. If this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (This feature takes effect for tag creation and editing but not tag deletion.) The update does not take effect immediately due to certain latency.
     * @param AutoUpdateInstanceTags Automatic instance tag update. The default value is false. If this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (This feature takes effect for tag creation and editing but not tag deletion.) The update does not take effect immediately due to certain latency.
     */
    public void setAutoUpdateInstanceTags(Boolean AutoUpdateInstanceTags) {
        this.AutoUpdateInstanceTags = AutoUpdateInstanceTags;
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
        if (source.ReplaceMode != null) {
            this.ReplaceMode = new String(source.ReplaceMode);
        }
        if (source.AutoUpdateInstanceTags != null) {
            this.AutoUpdateInstanceTags = new Boolean(source.AutoUpdateInstanceTags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplaceMonitorUnhealthy", this.ReplaceMonitorUnhealthy);
        this.setParamSimple(map, prefix + "ScalingMode", this.ScalingMode);
        this.setParamSimple(map, prefix + "ReplaceLoadBalancerUnhealthy", this.ReplaceLoadBalancerUnhealthy);
        this.setParamSimple(map, prefix + "ReplaceMode", this.ReplaceMode);
        this.setParamSimple(map, prefix + "AutoUpdateInstanceTags", this.AutoUpdateInstanceTags);

    }
}

