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

public class Instance extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Auto scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Launch configuration ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Launch configuration name
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * Lifecycle status. valid values are as follows:.
<Li>IN_SERVICE: running</li>.
<Li>CREATING: specifies the instance is being created.</li>.
<Li>CREATION_FAILED: creation failed.</li>.
<Li>`TERMINATING`: the instance is being terminated.</li>.
<Li>`TERMINATION_FAILED`: the instance fails to be terminated.</li>.
<Li>ATTACHING: binding</li>.
<Li>`ATTACH_FAILED`: the instance fails to be bound.</li>.
<Li>DETACHING: specifies the unbinding is in progress.</li>.
<Li>`DETACH_FAILED`: the instance fails to be unbound.</li>.
<Li>`ATTACHING_LB`: binding to lb</li>.
<Li>DETACHING_LB: the lb is being unbound.</li>.
<Li>`MODIFYING_LB`: the lb is being modified.</li>.
<Li>`STARTING`: the instance is being started up.</li>.
<Li>`START_FAILED`: the instance fails to be started up.</li>.
<Li>`STOPPING`: the instance is being shut down.</li>.
<Li>`STOP_FAILED`: the instance fails to be shut down.</li>.
<Li>`STOPPED`: the instance is shut down.</li>.
<Li>`IN_LAUNCHING_HOOK`: the lifecycle hook is being scaled out.</li>.
<Li>`IN_TERMINATING_HOOK`: the lifecycle hook is being scaled in.</li>.
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * Health status. valid values are as follows:.
<Li>HEALTHY: the instance is in Healthy status.</li>.
<Li>UNHEALTHY: instance ping unreachable</li>.
<Li>CLB_UNHEALTHY: the instance port listened by clb is unhealthy</li>.
    */
    @SerializedName("HealthStatus")
    @Expose
    private String HealthStatus;

    /**
    * Whether to add scale-in protection
    */
    @SerializedName("ProtectedFromScaleIn")
    @Expose
    private Boolean ProtectedFromScaleIn;

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Creation type. Value range: AUTO_CREATION, MANUAL_ATTACHING.
    */
    @SerializedName("CreationType")
    @Expose
    private String CreationType;

    /**
    * Instance join time is displayed in a format that conforms to the ISO8601 standard and uses UTC time.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Instance type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Version number
    */
    @SerializedName("VersionNumber")
    @Expose
    private Long VersionNumber;

    /**
    * Auto scaling group name
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * Preheat status. valid values are as follows:.
<Li>WAITING_ENTER_WARMUP: specifies the instance is waiting to enter preheating.</li>.
<Li>`NO_NEED_WARMUP`: warming up is not required.</li>.
<Li>IN_WARMUP: preheating.</li>.
<Li>AFTER_WARMUP: indicates the preheating is completed.</li>.
    */
    @SerializedName("WarmupStatus")
    @Expose
    private String WarmupStatus;

    /**
    * Placement group ID. Only one can be specified.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Auto scaling group ID 
     * @return AutoScalingGroupId Auto scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Auto scaling group ID
     * @param AutoScalingGroupId Auto scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Launch configuration ID 
     * @return LaunchConfigurationId Launch configuration ID
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set Launch configuration ID
     * @param LaunchConfigurationId Launch configuration ID
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get Launch configuration name 
     * @return LaunchConfigurationName Launch configuration name
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set Launch configuration name
     * @param LaunchConfigurationName Launch configuration name
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get Lifecycle status. valid values are as follows:.
<Li>IN_SERVICE: running</li>.
<Li>CREATING: specifies the instance is being created.</li>.
<Li>CREATION_FAILED: creation failed.</li>.
<Li>`TERMINATING`: the instance is being terminated.</li>.
<Li>`TERMINATION_FAILED`: the instance fails to be terminated.</li>.
<Li>ATTACHING: binding</li>.
<Li>`ATTACH_FAILED`: the instance fails to be bound.</li>.
<Li>DETACHING: specifies the unbinding is in progress.</li>.
<Li>`DETACH_FAILED`: the instance fails to be unbound.</li>.
<Li>`ATTACHING_LB`: binding to lb</li>.
<Li>DETACHING_LB: the lb is being unbound.</li>.
<Li>`MODIFYING_LB`: the lb is being modified.</li>.
<Li>`STARTING`: the instance is being started up.</li>.
<Li>`START_FAILED`: the instance fails to be started up.</li>.
<Li>`STOPPING`: the instance is being shut down.</li>.
<Li>`STOP_FAILED`: the instance fails to be shut down.</li>.
<Li>`STOPPED`: the instance is shut down.</li>.
<Li>`IN_LAUNCHING_HOOK`: the lifecycle hook is being scaled out.</li>.
<Li>`IN_TERMINATING_HOOK`: the lifecycle hook is being scaled in.</li>. 
     * @return LifeCycleState Lifecycle status. valid values are as follows:.
<Li>IN_SERVICE: running</li>.
<Li>CREATING: specifies the instance is being created.</li>.
<Li>CREATION_FAILED: creation failed.</li>.
<Li>`TERMINATING`: the instance is being terminated.</li>.
<Li>`TERMINATION_FAILED`: the instance fails to be terminated.</li>.
<Li>ATTACHING: binding</li>.
<Li>`ATTACH_FAILED`: the instance fails to be bound.</li>.
<Li>DETACHING: specifies the unbinding is in progress.</li>.
<Li>`DETACH_FAILED`: the instance fails to be unbound.</li>.
<Li>`ATTACHING_LB`: binding to lb</li>.
<Li>DETACHING_LB: the lb is being unbound.</li>.
<Li>`MODIFYING_LB`: the lb is being modified.</li>.
<Li>`STARTING`: the instance is being started up.</li>.
<Li>`START_FAILED`: the instance fails to be started up.</li>.
<Li>`STOPPING`: the instance is being shut down.</li>.
<Li>`STOP_FAILED`: the instance fails to be shut down.</li>.
<Li>`STOPPED`: the instance is shut down.</li>.
<Li>`IN_LAUNCHING_HOOK`: the lifecycle hook is being scaled out.</li>.
<Li>`IN_TERMINATING_HOOK`: the lifecycle hook is being scaled in.</li>.
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set Lifecycle status. valid values are as follows:.
<Li>IN_SERVICE: running</li>.
<Li>CREATING: specifies the instance is being created.</li>.
<Li>CREATION_FAILED: creation failed.</li>.
<Li>`TERMINATING`: the instance is being terminated.</li>.
<Li>`TERMINATION_FAILED`: the instance fails to be terminated.</li>.
<Li>ATTACHING: binding</li>.
<Li>`ATTACH_FAILED`: the instance fails to be bound.</li>.
<Li>DETACHING: specifies the unbinding is in progress.</li>.
<Li>`DETACH_FAILED`: the instance fails to be unbound.</li>.
<Li>`ATTACHING_LB`: binding to lb</li>.
<Li>DETACHING_LB: the lb is being unbound.</li>.
<Li>`MODIFYING_LB`: the lb is being modified.</li>.
<Li>`STARTING`: the instance is being started up.</li>.
<Li>`START_FAILED`: the instance fails to be started up.</li>.
<Li>`STOPPING`: the instance is being shut down.</li>.
<Li>`STOP_FAILED`: the instance fails to be shut down.</li>.
<Li>`STOPPED`: the instance is shut down.</li>.
<Li>`IN_LAUNCHING_HOOK`: the lifecycle hook is being scaled out.</li>.
<Li>`IN_TERMINATING_HOOK`: the lifecycle hook is being scaled in.</li>.
     * @param LifeCycleState Lifecycle status. valid values are as follows:.
<Li>IN_SERVICE: running</li>.
<Li>CREATING: specifies the instance is being created.</li>.
<Li>CREATION_FAILED: creation failed.</li>.
<Li>`TERMINATING`: the instance is being terminated.</li>.
<Li>`TERMINATION_FAILED`: the instance fails to be terminated.</li>.
<Li>ATTACHING: binding</li>.
<Li>`ATTACH_FAILED`: the instance fails to be bound.</li>.
<Li>DETACHING: specifies the unbinding is in progress.</li>.
<Li>`DETACH_FAILED`: the instance fails to be unbound.</li>.
<Li>`ATTACHING_LB`: binding to lb</li>.
<Li>DETACHING_LB: the lb is being unbound.</li>.
<Li>`MODIFYING_LB`: the lb is being modified.</li>.
<Li>`STARTING`: the instance is being started up.</li>.
<Li>`START_FAILED`: the instance fails to be started up.</li>.
<Li>`STOPPING`: the instance is being shut down.</li>.
<Li>`STOP_FAILED`: the instance fails to be shut down.</li>.
<Li>`STOPPED`: the instance is shut down.</li>.
<Li>`IN_LAUNCHING_HOOK`: the lifecycle hook is being scaled out.</li>.
<Li>`IN_TERMINATING_HOOK`: the lifecycle hook is being scaled in.</li>.
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get Health status. valid values are as follows:.
<Li>HEALTHY: the instance is in Healthy status.</li>.
<Li>UNHEALTHY: instance ping unreachable</li>.
<Li>CLB_UNHEALTHY: the instance port listened by clb is unhealthy</li>. 
     * @return HealthStatus Health status. valid values are as follows:.
<Li>HEALTHY: the instance is in Healthy status.</li>.
<Li>UNHEALTHY: instance ping unreachable</li>.
<Li>CLB_UNHEALTHY: the instance port listened by clb is unhealthy</li>.
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Health status. valid values are as follows:.
<Li>HEALTHY: the instance is in Healthy status.</li>.
<Li>UNHEALTHY: instance ping unreachable</li>.
<Li>CLB_UNHEALTHY: the instance port listened by clb is unhealthy</li>.
     * @param HealthStatus Health status. valid values are as follows:.
<Li>HEALTHY: the instance is in Healthy status.</li>.
<Li>UNHEALTHY: instance ping unreachable</li>.
<Li>CLB_UNHEALTHY: the instance port listened by clb is unhealthy</li>.
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Whether to add scale-in protection 
     * @return ProtectedFromScaleIn Whether to add scale-in protection
     */
    public Boolean getProtectedFromScaleIn() {
        return this.ProtectedFromScaleIn;
    }

    /**
     * Set Whether to add scale-in protection
     * @param ProtectedFromScaleIn Whether to add scale-in protection
     */
    public void setProtectedFromScaleIn(Boolean ProtectedFromScaleIn) {
        this.ProtectedFromScaleIn = ProtectedFromScaleIn;
    }

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Creation type. Value range: AUTO_CREATION, MANUAL_ATTACHING. 
     * @return CreationType Creation type. Value range: AUTO_CREATION, MANUAL_ATTACHING.
     */
    public String getCreationType() {
        return this.CreationType;
    }

    /**
     * Set Creation type. Value range: AUTO_CREATION, MANUAL_ATTACHING.
     * @param CreationType Creation type. Value range: AUTO_CREATION, MANUAL_ATTACHING.
     */
    public void setCreationType(String CreationType) {
        this.CreationType = CreationType;
    }

    /**
     * Get Instance join time is displayed in a format that conforms to the ISO8601 standard and uses UTC time. 
     * @return AddTime Instance join time is displayed in a format that conforms to the ISO8601 standard and uses UTC time.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Instance join time is displayed in a format that conforms to the ISO8601 standard and uses UTC time.
     * @param AddTime Instance join time is displayed in a format that conforms to the ISO8601 standard and uses UTC time.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Instance type 
     * @return InstanceType Instance type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type
     * @param InstanceType Instance type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Version number 
     * @return VersionNumber Version number
     */
    public Long getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set Version number
     * @param VersionNumber Version number
     */
    public void setVersionNumber(Long VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get Auto scaling group name 
     * @return AutoScalingGroupName Auto scaling group name
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set Auto scaling group name
     * @param AutoScalingGroupName Auto scaling group name
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get Preheat status. valid values are as follows:.
<Li>WAITING_ENTER_WARMUP: specifies the instance is waiting to enter preheating.</li>.
<Li>`NO_NEED_WARMUP`: warming up is not required.</li>.
<Li>IN_WARMUP: preheating.</li>.
<Li>AFTER_WARMUP: indicates the preheating is completed.</li>. 
     * @return WarmupStatus Preheat status. valid values are as follows:.
<Li>WAITING_ENTER_WARMUP: specifies the instance is waiting to enter preheating.</li>.
<Li>`NO_NEED_WARMUP`: warming up is not required.</li>.
<Li>IN_WARMUP: preheating.</li>.
<Li>AFTER_WARMUP: indicates the preheating is completed.</li>.
     */
    public String getWarmupStatus() {
        return this.WarmupStatus;
    }

    /**
     * Set Preheat status. valid values are as follows:.
<Li>WAITING_ENTER_WARMUP: specifies the instance is waiting to enter preheating.</li>.
<Li>`NO_NEED_WARMUP`: warming up is not required.</li>.
<Li>IN_WARMUP: preheating.</li>.
<Li>AFTER_WARMUP: indicates the preheating is completed.</li>.
     * @param WarmupStatus Preheat status. valid values are as follows:.
<Li>WAITING_ENTER_WARMUP: specifies the instance is waiting to enter preheating.</li>.
<Li>`NO_NEED_WARMUP`: warming up is not required.</li>.
<Li>IN_WARMUP: preheating.</li>.
<Li>AFTER_WARMUP: indicates the preheating is completed.</li>.
     */
    public void setWarmupStatus(String WarmupStatus) {
        this.WarmupStatus = WarmupStatus;
    }

    /**
     * Get Placement group ID. Only one can be specified. 
     * @return DisasterRecoverGroupIds Placement group ID. Only one can be specified.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set Placement group ID. Only one can be specified.
     * @param DisasterRecoverGroupIds Placement group ID. Only one can be specified.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.LifeCycleState != null) {
            this.LifeCycleState = new String(source.LifeCycleState);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new String(source.HealthStatus);
        }
        if (source.ProtectedFromScaleIn != null) {
            this.ProtectedFromScaleIn = new Boolean(source.ProtectedFromScaleIn);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CreationType != null) {
            this.CreationType = new String(source.CreationType);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new Long(source.VersionNumber);
        }
        if (source.AutoScalingGroupName != null) {
            this.AutoScalingGroupName = new String(source.AutoScalingGroupName);
        }
        if (source.WarmupStatus != null) {
            this.WarmupStatus = new String(source.WarmupStatus);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "ProtectedFromScaleIn", this.ProtectedFromScaleIn);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreationType", this.CreationType);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "WarmupStatus", this.WarmupStatus);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);

    }
}

