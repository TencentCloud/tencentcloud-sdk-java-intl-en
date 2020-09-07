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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel{

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
    * Lifecycle status. Valid values:<br>
<li>IN_SERVICE: the instance is running.
<li>CREATING: the instance is being created.
<li>CREATION_FAILED: the instance fails to be created.
<li>TERMINATING: the instance is being terminated.
<li>TERMINATION_FAILED: the instance fails to be terminated.
<li>ATTACHING: the instance is being bound.
<li>DETACHING: the instance is being unbound.
<li>ATTACHING_LB: the instance is being bound to an LB.<li>DETACHING_LB: the instance is being unbound from an LB.
<li>STARTING: the instance is being started.
<li>START_FAILED: the instance fails to be started.
<li>STOPPING: the instance is being stopped.
<li>STOP_FAILED: the instance fails to be stopped.
<li>STOPPED: the instance is stopped.
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * Health status. Value range: HEALTHY, UNHEALTHY
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
    * Instance addition time
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
     * Get Lifecycle status. Valid values:<br>
<li>IN_SERVICE: the instance is running.
<li>CREATING: the instance is being created.
<li>CREATION_FAILED: the instance fails to be created.
<li>TERMINATING: the instance is being terminated.
<li>TERMINATION_FAILED: the instance fails to be terminated.
<li>ATTACHING: the instance is being bound.
<li>DETACHING: the instance is being unbound.
<li>ATTACHING_LB: the instance is being bound to an LB.<li>DETACHING_LB: the instance is being unbound from an LB.
<li>STARTING: the instance is being started.
<li>START_FAILED: the instance fails to be started.
<li>STOPPING: the instance is being stopped.
<li>STOP_FAILED: the instance fails to be stopped.
<li>STOPPED: the instance is stopped. 
     * @return LifeCycleState Lifecycle status. Valid values:<br>
<li>IN_SERVICE: the instance is running.
<li>CREATING: the instance is being created.
<li>CREATION_FAILED: the instance fails to be created.
<li>TERMINATING: the instance is being terminated.
<li>TERMINATION_FAILED: the instance fails to be terminated.
<li>ATTACHING: the instance is being bound.
<li>DETACHING: the instance is being unbound.
<li>ATTACHING_LB: the instance is being bound to an LB.<li>DETACHING_LB: the instance is being unbound from an LB.
<li>STARTING: the instance is being started.
<li>START_FAILED: the instance fails to be started.
<li>STOPPING: the instance is being stopped.
<li>STOP_FAILED: the instance fails to be stopped.
<li>STOPPED: the instance is stopped.
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Set Lifecycle status. Valid values:<br>
<li>IN_SERVICE: the instance is running.
<li>CREATING: the instance is being created.
<li>CREATION_FAILED: the instance fails to be created.
<li>TERMINATING: the instance is being terminated.
<li>TERMINATION_FAILED: the instance fails to be terminated.
<li>ATTACHING: the instance is being bound.
<li>DETACHING: the instance is being unbound.
<li>ATTACHING_LB: the instance is being bound to an LB.<li>DETACHING_LB: the instance is being unbound from an LB.
<li>STARTING: the instance is being started.
<li>START_FAILED: the instance fails to be started.
<li>STOPPING: the instance is being stopped.
<li>STOP_FAILED: the instance fails to be stopped.
<li>STOPPED: the instance is stopped.
     * @param LifeCycleState Lifecycle status. Valid values:<br>
<li>IN_SERVICE: the instance is running.
<li>CREATING: the instance is being created.
<li>CREATION_FAILED: the instance fails to be created.
<li>TERMINATING: the instance is being terminated.
<li>TERMINATION_FAILED: the instance fails to be terminated.
<li>ATTACHING: the instance is being bound.
<li>DETACHING: the instance is being unbound.
<li>ATTACHING_LB: the instance is being bound to an LB.<li>DETACHING_LB: the instance is being unbound from an LB.
<li>STARTING: the instance is being started.
<li>START_FAILED: the instance fails to be started.
<li>STOPPING: the instance is being stopped.
<li>STOP_FAILED: the instance fails to be stopped.
<li>STOPPED: the instance is stopped.
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Get Health status. Value range: HEALTHY, UNHEALTHY 
     * @return HealthStatus Health status. Value range: HEALTHY, UNHEALTHY
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set Health status. Value range: HEALTHY, UNHEALTHY
     * @param HealthStatus Health status. Value range: HEALTHY, UNHEALTHY
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
     * Get Instance addition time 
     * @return AddTime Instance addition time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Instance addition time
     * @param AddTime Instance addition time
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

    }
}

