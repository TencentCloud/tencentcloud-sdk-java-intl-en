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
    * Replacement mode of the unhealthy replacement service. valid values:.
RECREATE: rebuild an instance to replace the unhealthy instance.
RESET: performs a system reinstallation on unhealthy instances while keeping the data disk, private IP address, instance id, and other information unchanged. the instance login settings, hostname, enhanced services, and UserData remain consistent with the current launch configuration.
Default value: RECREATE.
    */
    @SerializedName("ReplaceMode")
    @Expose
    private String ReplaceMode;

    /**
    * Automatic instance Tag update. the default value is False. if this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (this feature takes effect for Tag creation and editing but not Tag deletion.) the update does not take effect immediately due to certain latency.
    */
    @SerializedName("AutoUpdateInstanceTags")
    @Expose
    private Boolean AutoUpdateInstanceTags;

    /**
    * Expected number of instances sync minimum and maximum value. default value is False. this parameter only takes effect in scenarios where the expected number is not passed in to modify scaling group api.
<Li>True: when modifying the maximum or minimum value, if a conflict exists with the current expected value, synchronously adjust the expected value. for example, if the input minimum value is 2 while the current expected value is 1, the expected value will be synchronously adjusted to 2.</li>.
<Li>False: if a conflict exists between the current expected value when modifying the maximum or minimum value, an error message indicates it is not allowed to be modified.</li>.
    */
    @SerializedName("DesiredCapacitySyncWithMaxMinSize")
    @Expose
    private Boolean DesiredCapacitySyncWithMaxMinSize;

    /**
    * Scaling in unhealthy instances first. If enabled, preferentially selects unhealthy instances during scale in. Default value: False.
    */
    @SerializedName("PriorityScaleInUnhealthy")
    @Expose
    private Boolean PriorityScaleInUnhealthy;

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
     * Get Replacement mode of the unhealthy replacement service. valid values:.
RECREATE: rebuild an instance to replace the unhealthy instance.
RESET: performs a system reinstallation on unhealthy instances while keeping the data disk, private IP address, instance id, and other information unchanged. the instance login settings, hostname, enhanced services, and UserData remain consistent with the current launch configuration.
Default value: RECREATE. 
     * @return ReplaceMode Replacement mode of the unhealthy replacement service. valid values:.
RECREATE: rebuild an instance to replace the unhealthy instance.
RESET: performs a system reinstallation on unhealthy instances while keeping the data disk, private IP address, instance id, and other information unchanged. the instance login settings, hostname, enhanced services, and UserData remain consistent with the current launch configuration.
Default value: RECREATE.
     */
    public String getReplaceMode() {
        return this.ReplaceMode;
    }

    /**
     * Set Replacement mode of the unhealthy replacement service. valid values:.
RECREATE: rebuild an instance to replace the unhealthy instance.
RESET: performs a system reinstallation on unhealthy instances while keeping the data disk, private IP address, instance id, and other information unchanged. the instance login settings, hostname, enhanced services, and UserData remain consistent with the current launch configuration.
Default value: RECREATE.
     * @param ReplaceMode Replacement mode of the unhealthy replacement service. valid values:.
RECREATE: rebuild an instance to replace the unhealthy instance.
RESET: performs a system reinstallation on unhealthy instances while keeping the data disk, private IP address, instance id, and other information unchanged. the instance login settings, hostname, enhanced services, and UserData remain consistent with the current launch configuration.
Default value: RECREATE.
     */
    public void setReplaceMode(String ReplaceMode) {
        this.ReplaceMode = ReplaceMode;
    }

    /**
     * Get Automatic instance Tag update. the default value is False. if this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (this feature takes effect for Tag creation and editing but not Tag deletion.) the update does not take effect immediately due to certain latency. 
     * @return AutoUpdateInstanceTags Automatic instance Tag update. the default value is False. if this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (this feature takes effect for Tag creation and editing but not Tag deletion.) the update does not take effect immediately due to certain latency.
     */
    public Boolean getAutoUpdateInstanceTags() {
        return this.AutoUpdateInstanceTags;
    }

    /**
     * Set Automatic instance Tag update. the default value is False. if this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (this feature takes effect for Tag creation and editing but not Tag deletion.) the update does not take effect immediately due to certain latency.
     * @param AutoUpdateInstanceTags Automatic instance Tag update. the default value is False. if this feature is enabled, tags of running instances in a scaling group will be updated as well if the scaling group tags are updated. (this feature takes effect for Tag creation and editing but not Tag deletion.) the update does not take effect immediately due to certain latency.
     */
    public void setAutoUpdateInstanceTags(Boolean AutoUpdateInstanceTags) {
        this.AutoUpdateInstanceTags = AutoUpdateInstanceTags;
    }

    /**
     * Get Expected number of instances sync minimum and maximum value. default value is False. this parameter only takes effect in scenarios where the expected number is not passed in to modify scaling group api.
<Li>True: when modifying the maximum or minimum value, if a conflict exists with the current expected value, synchronously adjust the expected value. for example, if the input minimum value is 2 while the current expected value is 1, the expected value will be synchronously adjusted to 2.</li>.
<Li>False: if a conflict exists between the current expected value when modifying the maximum or minimum value, an error message indicates it is not allowed to be modified.</li>. 
     * @return DesiredCapacitySyncWithMaxMinSize Expected number of instances sync minimum and maximum value. default value is False. this parameter only takes effect in scenarios where the expected number is not passed in to modify scaling group api.
<Li>True: when modifying the maximum or minimum value, if a conflict exists with the current expected value, synchronously adjust the expected value. for example, if the input minimum value is 2 while the current expected value is 1, the expected value will be synchronously adjusted to 2.</li>.
<Li>False: if a conflict exists between the current expected value when modifying the maximum or minimum value, an error message indicates it is not allowed to be modified.</li>.
     */
    public Boolean getDesiredCapacitySyncWithMaxMinSize() {
        return this.DesiredCapacitySyncWithMaxMinSize;
    }

    /**
     * Set Expected number of instances sync minimum and maximum value. default value is False. this parameter only takes effect in scenarios where the expected number is not passed in to modify scaling group api.
<Li>True: when modifying the maximum or minimum value, if a conflict exists with the current expected value, synchronously adjust the expected value. for example, if the input minimum value is 2 while the current expected value is 1, the expected value will be synchronously adjusted to 2.</li>.
<Li>False: if a conflict exists between the current expected value when modifying the maximum or minimum value, an error message indicates it is not allowed to be modified.</li>.
     * @param DesiredCapacitySyncWithMaxMinSize Expected number of instances sync minimum and maximum value. default value is False. this parameter only takes effect in scenarios where the expected number is not passed in to modify scaling group api.
<Li>True: when modifying the maximum or minimum value, if a conflict exists with the current expected value, synchronously adjust the expected value. for example, if the input minimum value is 2 while the current expected value is 1, the expected value will be synchronously adjusted to 2.</li>.
<Li>False: if a conflict exists between the current expected value when modifying the maximum or minimum value, an error message indicates it is not allowed to be modified.</li>.
     */
    public void setDesiredCapacitySyncWithMaxMinSize(Boolean DesiredCapacitySyncWithMaxMinSize) {
        this.DesiredCapacitySyncWithMaxMinSize = DesiredCapacitySyncWithMaxMinSize;
    }

    /**
     * Get Scaling in unhealthy instances first. If enabled, preferentially selects unhealthy instances during scale in. Default value: False. 
     * @return PriorityScaleInUnhealthy Scaling in unhealthy instances first. If enabled, preferentially selects unhealthy instances during scale in. Default value: False.
     */
    public Boolean getPriorityScaleInUnhealthy() {
        return this.PriorityScaleInUnhealthy;
    }

    /**
     * Set Scaling in unhealthy instances first. If enabled, preferentially selects unhealthy instances during scale in. Default value: False.
     * @param PriorityScaleInUnhealthy Scaling in unhealthy instances first. If enabled, preferentially selects unhealthy instances during scale in. Default value: False.
     */
    public void setPriorityScaleInUnhealthy(Boolean PriorityScaleInUnhealthy) {
        this.PriorityScaleInUnhealthy = PriorityScaleInUnhealthy;
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
        if (source.DesiredCapacitySyncWithMaxMinSize != null) {
            this.DesiredCapacitySyncWithMaxMinSize = new Boolean(source.DesiredCapacitySyncWithMaxMinSize);
        }
        if (source.PriorityScaleInUnhealthy != null) {
            this.PriorityScaleInUnhealthy = new Boolean(source.PriorityScaleInUnhealthy);
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
        this.setParamSimple(map, prefix + "DesiredCapacitySyncWithMaxMinSize", this.DesiredCapacitySyncWithMaxMinSize);
        this.setParamSimple(map, prefix + "PriorityScaleInUnhealthy", this.PriorityScaleInUnhealthy);

    }
}

