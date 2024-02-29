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

public class AutoScalingGroup extends AbstractModel {

    /**
    * Auto scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Auto scaling group name
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * Current scaling group status. Valid values:<br>
<li>NORMAL: Normal<br>
<li>CVM_ABNORMAL: Abnormal launch configuration<br>
<li>LB_ABNORMAL: Abnormal load balancer<br>
<li>LB_LISTENER_ABNORMAL: Abnormal load balancer listener<br>
<li>LB_LOCATION_ABNORMAL: Abnormal forwarding configuration of the load balancer listener<br>
<li>VPC_ABNORMAL: VPC network error<br>
<li>SUBNET_ABNORMAL: VPC subnet exception<br>
<li>INSUFFICIENT_BALANCE: Insufficient account balance<br>
<li>LB_BACKEND_REGION_NOT_MATCH: The CLB backend and the AS service are not in the same region.<br>
<li>LB_BACKEND_VPC_NOT_MATCH: The CLB instance and the scaling group are not in the same VPC.
    */
    @SerializedName("AutoScalingGroupStatus")
    @Expose
    private String AutoScalingGroupStatus;

    /**
    * Creation time in UTC format
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Default cooldown period in seconds
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Long DefaultCooldown;

    /**
    * Desired number of instances
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * Enabled status. Value range: `ENABLED`, `DISABLED`
    */
    @SerializedName("EnabledStatus")
    @Expose
    private String EnabledStatus;

    /**
    * List of application load balancers
    */
    @SerializedName("ForwardLoadBalancerSet")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancerSet;

    /**
    * Number of instances
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Number of instances in `IN_SERVICE` status
    */
    @SerializedName("InServiceInstanceCount")
    @Expose
    private Long InServiceInstanceCount;

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
    * List of Classic load balancer IDs
    */
    @SerializedName("LoadBalancerIdSet")
    @Expose
    private String [] LoadBalancerIdSet;

    /**
    * Maximum number of instances
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * Minimum number of instances
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * List of subnet IDs
    */
    @SerializedName("SubnetIdSet")
    @Expose
    private String [] SubnetIdSet;

    /**
    * Termination policy
    */
    @SerializedName("TerminationPolicySet")
    @Expose
    private String [] TerminationPolicySet;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * List of availability zones
    */
    @SerializedName("ZoneSet")
    @Expose
    private String [] ZoneSet;

    /**
    * Retry policy
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * Whether the auto scaling group is performing a scaling activity. `IN_ACTIVITY` indicates yes, and `NOT_IN_ACTIVITY` indicates no.
    */
    @SerializedName("InActivityStatus")
    @Expose
    private String InActivityStatus;

    /**
    * List of auto scaling group tags
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Service settings
    */
    @SerializedName("ServiceSettings")
    @Expose
    private ServiceSettings ServiceSettings;

    /**
    * The number of IPv6 addresses that an instance has.
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * The policy applied when there are multiple availability zones/subnets
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li> EQUALITY: chooses the availability zone/subnet with the least instances for scale-out. This gives each availability zone/subnet an opportunity for scale-out and disperses the instances created during multiple scale-out operations across different availability zones/subnets.
    */
    @SerializedName("MultiZoneSubnetPolicy")
    @Expose
    private String MultiZoneSubnetPolicy;

    /**
    * Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).
    */
    @SerializedName("HealthCheckType")
    @Expose
    private String HealthCheckType;

    /**
    * Grace period of the CLB health check
    */
    @SerializedName("LoadBalancerHealthCheckGracePeriod")
    @Expose
    private Long LoadBalancerHealthCheckGracePeriod;

    /**
    * Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used.
    */
    @SerializedName("InstanceAllocationPolicy")
    @Expose
    private String InstanceAllocationPolicy;

    /**
    * Specifies how to assign pay-as-you-go instances and spot instances.
A valid value will be returned only when `InstanceAllocationPolicy` is set to `SPOT_MIXED`.
    */
    @SerializedName("SpotMixedAllocationPolicy")
    @Expose
    private SpotMixedAllocationPolicy SpotMixedAllocationPolicy;

    /**
    * Indicates whether the capacity rebalancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. AS will add instances to meet the desired capacity only after the spot instances are terminated.
    */
    @SerializedName("CapacityRebalance")
    @Expose
    private Boolean CapacityRebalance;

    /**
    * Instance name sequencing settings.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceNameIndexSettings")
    @Expose
    private InstanceNameIndexSettings InstanceNameIndexSettings;

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
     * Get Current scaling group status. Valid values:<br>
<li>NORMAL: Normal<br>
<li>CVM_ABNORMAL: Abnormal launch configuration<br>
<li>LB_ABNORMAL: Abnormal load balancer<br>
<li>LB_LISTENER_ABNORMAL: Abnormal load balancer listener<br>
<li>LB_LOCATION_ABNORMAL: Abnormal forwarding configuration of the load balancer listener<br>
<li>VPC_ABNORMAL: VPC network error<br>
<li>SUBNET_ABNORMAL: VPC subnet exception<br>
<li>INSUFFICIENT_BALANCE: Insufficient account balance<br>
<li>LB_BACKEND_REGION_NOT_MATCH: The CLB backend and the AS service are not in the same region.<br>
<li>LB_BACKEND_VPC_NOT_MATCH: The CLB instance and the scaling group are not in the same VPC. 
     * @return AutoScalingGroupStatus Current scaling group status. Valid values:<br>
<li>NORMAL: Normal<br>
<li>CVM_ABNORMAL: Abnormal launch configuration<br>
<li>LB_ABNORMAL: Abnormal load balancer<br>
<li>LB_LISTENER_ABNORMAL: Abnormal load balancer listener<br>
<li>LB_LOCATION_ABNORMAL: Abnormal forwarding configuration of the load balancer listener<br>
<li>VPC_ABNORMAL: VPC network error<br>
<li>SUBNET_ABNORMAL: VPC subnet exception<br>
<li>INSUFFICIENT_BALANCE: Insufficient account balance<br>
<li>LB_BACKEND_REGION_NOT_MATCH: The CLB backend and the AS service are not in the same region.<br>
<li>LB_BACKEND_VPC_NOT_MATCH: The CLB instance and the scaling group are not in the same VPC.
     */
    public String getAutoScalingGroupStatus() {
        return this.AutoScalingGroupStatus;
    }

    /**
     * Set Current scaling group status. Valid values:<br>
<li>NORMAL: Normal<br>
<li>CVM_ABNORMAL: Abnormal launch configuration<br>
<li>LB_ABNORMAL: Abnormal load balancer<br>
<li>LB_LISTENER_ABNORMAL: Abnormal load balancer listener<br>
<li>LB_LOCATION_ABNORMAL: Abnormal forwarding configuration of the load balancer listener<br>
<li>VPC_ABNORMAL: VPC network error<br>
<li>SUBNET_ABNORMAL: VPC subnet exception<br>
<li>INSUFFICIENT_BALANCE: Insufficient account balance<br>
<li>LB_BACKEND_REGION_NOT_MATCH: The CLB backend and the AS service are not in the same region.<br>
<li>LB_BACKEND_VPC_NOT_MATCH: The CLB instance and the scaling group are not in the same VPC.
     * @param AutoScalingGroupStatus Current scaling group status. Valid values:<br>
<li>NORMAL: Normal<br>
<li>CVM_ABNORMAL: Abnormal launch configuration<br>
<li>LB_ABNORMAL: Abnormal load balancer<br>
<li>LB_LISTENER_ABNORMAL: Abnormal load balancer listener<br>
<li>LB_LOCATION_ABNORMAL: Abnormal forwarding configuration of the load balancer listener<br>
<li>VPC_ABNORMAL: VPC network error<br>
<li>SUBNET_ABNORMAL: VPC subnet exception<br>
<li>INSUFFICIENT_BALANCE: Insufficient account balance<br>
<li>LB_BACKEND_REGION_NOT_MATCH: The CLB backend and the AS service are not in the same region.<br>
<li>LB_BACKEND_VPC_NOT_MATCH: The CLB instance and the scaling group are not in the same VPC.
     */
    public void setAutoScalingGroupStatus(String AutoScalingGroupStatus) {
        this.AutoScalingGroupStatus = AutoScalingGroupStatus;
    }

    /**
     * Get Creation time in UTC format 
     * @return CreatedTime Creation time in UTC format
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time in UTC format
     * @param CreatedTime Creation time in UTC format
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Default cooldown period in seconds 
     * @return DefaultCooldown Default cooldown period in seconds
     */
    public Long getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Set Default cooldown period in seconds
     * @param DefaultCooldown Default cooldown period in seconds
     */
    public void setDefaultCooldown(Long DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Get Desired number of instances 
     * @return DesiredCapacity Desired number of instances
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set Desired number of instances
     * @param DesiredCapacity Desired number of instances
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get Enabled status. Value range: `ENABLED`, `DISABLED` 
     * @return EnabledStatus Enabled status. Value range: `ENABLED`, `DISABLED`
     */
    public String getEnabledStatus() {
        return this.EnabledStatus;
    }

    /**
     * Set Enabled status. Value range: `ENABLED`, `DISABLED`
     * @param EnabledStatus Enabled status. Value range: `ENABLED`, `DISABLED`
     */
    public void setEnabledStatus(String EnabledStatus) {
        this.EnabledStatus = EnabledStatus;
    }

    /**
     * Get List of application load balancers 
     * @return ForwardLoadBalancerSet List of application load balancers
     */
    public ForwardLoadBalancer [] getForwardLoadBalancerSet() {
        return this.ForwardLoadBalancerSet;
    }

    /**
     * Set List of application load balancers
     * @param ForwardLoadBalancerSet List of application load balancers
     */
    public void setForwardLoadBalancerSet(ForwardLoadBalancer [] ForwardLoadBalancerSet) {
        this.ForwardLoadBalancerSet = ForwardLoadBalancerSet;
    }

    /**
     * Get Number of instances 
     * @return InstanceCount Number of instances
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances
     * @param InstanceCount Number of instances
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Number of instances in `IN_SERVICE` status 
     * @return InServiceInstanceCount Number of instances in `IN_SERVICE` status
     */
    public Long getInServiceInstanceCount() {
        return this.InServiceInstanceCount;
    }

    /**
     * Set Number of instances in `IN_SERVICE` status
     * @param InServiceInstanceCount Number of instances in `IN_SERVICE` status
     */
    public void setInServiceInstanceCount(Long InServiceInstanceCount) {
        this.InServiceInstanceCount = InServiceInstanceCount;
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
     * Get List of Classic load balancer IDs 
     * @return LoadBalancerIdSet List of Classic load balancer IDs
     */
    public String [] getLoadBalancerIdSet() {
        return this.LoadBalancerIdSet;
    }

    /**
     * Set List of Classic load balancer IDs
     * @param LoadBalancerIdSet List of Classic load balancer IDs
     */
    public void setLoadBalancerIdSet(String [] LoadBalancerIdSet) {
        this.LoadBalancerIdSet = LoadBalancerIdSet;
    }

    /**
     * Get Maximum number of instances 
     * @return MaxSize Maximum number of instances
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum number of instances
     * @param MaxSize Maximum number of instances
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Minimum number of instances 
     * @return MinSize Minimum number of instances
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set Minimum number of instances
     * @param MinSize Minimum number of instances
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get List of subnet IDs 
     * @return SubnetIdSet List of subnet IDs
     */
    public String [] getSubnetIdSet() {
        return this.SubnetIdSet;
    }

    /**
     * Set List of subnet IDs
     * @param SubnetIdSet List of subnet IDs
     */
    public void setSubnetIdSet(String [] SubnetIdSet) {
        this.SubnetIdSet = SubnetIdSet;
    }

    /**
     * Get Termination policy 
     * @return TerminationPolicySet Termination policy
     */
    public String [] getTerminationPolicySet() {
        return this.TerminationPolicySet;
    }

    /**
     * Set Termination policy
     * @param TerminationPolicySet Termination policy
     */
    public void setTerminationPolicySet(String [] TerminationPolicySet) {
        this.TerminationPolicySet = TerminationPolicySet;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get List of availability zones 
     * @return ZoneSet List of availability zones
     */
    public String [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set List of availability zones
     * @param ZoneSet List of availability zones
     */
    public void setZoneSet(String [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Get Retry policy 
     * @return RetryPolicy Retry policy
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set Retry policy
     * @param RetryPolicy Retry policy
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get Whether the auto scaling group is performing a scaling activity. `IN_ACTIVITY` indicates yes, and `NOT_IN_ACTIVITY` indicates no. 
     * @return InActivityStatus Whether the auto scaling group is performing a scaling activity. `IN_ACTIVITY` indicates yes, and `NOT_IN_ACTIVITY` indicates no.
     */
    public String getInActivityStatus() {
        return this.InActivityStatus;
    }

    /**
     * Set Whether the auto scaling group is performing a scaling activity. `IN_ACTIVITY` indicates yes, and `NOT_IN_ACTIVITY` indicates no.
     * @param InActivityStatus Whether the auto scaling group is performing a scaling activity. `IN_ACTIVITY` indicates yes, and `NOT_IN_ACTIVITY` indicates no.
     */
    public void setInActivityStatus(String InActivityStatus) {
        this.InActivityStatus = InActivityStatus;
    }

    /**
     * Get List of auto scaling group tags 
     * @return Tags List of auto scaling group tags
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of auto scaling group tags
     * @param Tags List of auto scaling group tags
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Service settings 
     * @return ServiceSettings Service settings
     */
    public ServiceSettings getServiceSettings() {
        return this.ServiceSettings;
    }

    /**
     * Set Service settings
     * @param ServiceSettings Service settings
     */
    public void setServiceSettings(ServiceSettings ServiceSettings) {
        this.ServiceSettings = ServiceSettings;
    }

    /**
     * Get The number of IPv6 addresses that an instance has. 
     * @return Ipv6AddressCount The number of IPv6 addresses that an instance has.
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set The number of IPv6 addresses that an instance has.
     * @param Ipv6AddressCount The number of IPv6 addresses that an instance has.
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get The policy applied when there are multiple availability zones/subnets
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li> EQUALITY: chooses the availability zone/subnet with the least instances for scale-out. This gives each availability zone/subnet an opportunity for scale-out and disperses the instances created during multiple scale-out operations across different availability zones/subnets. 
     * @return MultiZoneSubnetPolicy The policy applied when there are multiple availability zones/subnets
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li> EQUALITY: chooses the availability zone/subnet with the least instances for scale-out. This gives each availability zone/subnet an opportunity for scale-out and disperses the instances created during multiple scale-out operations across different availability zones/subnets.
     */
    public String getMultiZoneSubnetPolicy() {
        return this.MultiZoneSubnetPolicy;
    }

    /**
     * Set The policy applied when there are multiple availability zones/subnets
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li> EQUALITY: chooses the availability zone/subnet with the least instances for scale-out. This gives each availability zone/subnet an opportunity for scale-out and disperses the instances created during multiple scale-out operations across different availability zones/subnets.
     * @param MultiZoneSubnetPolicy The policy applied when there are multiple availability zones/subnets
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li> EQUALITY: chooses the availability zone/subnet with the least instances for scale-out. This gives each availability zone/subnet an opportunity for scale-out and disperses the instances created during multiple scale-out operations across different availability zones/subnets.
     */
    public void setMultiZoneSubnetPolicy(String MultiZoneSubnetPolicy) {
        this.MultiZoneSubnetPolicy = MultiZoneSubnetPolicy;
    }

    /**
     * Get Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1). 
     * @return HealthCheckType Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).
     */
    public String getHealthCheckType() {
        return this.HealthCheckType;
    }

    /**
     * Set Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).
     * @param HealthCheckType Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).
     */
    public void setHealthCheckType(String HealthCheckType) {
        this.HealthCheckType = HealthCheckType;
    }

    /**
     * Get Grace period of the CLB health check 
     * @return LoadBalancerHealthCheckGracePeriod Grace period of the CLB health check
     */
    public Long getLoadBalancerHealthCheckGracePeriod() {
        return this.LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Set Grace period of the CLB health check
     * @param LoadBalancerHealthCheckGracePeriod Grace period of the CLB health check
     */
    public void setLoadBalancerHealthCheckGracePeriod(Long LoadBalancerHealthCheckGracePeriod) {
        this.LoadBalancerHealthCheckGracePeriod = LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Get Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used. 
     * @return InstanceAllocationPolicy Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used.
     */
    public String getInstanceAllocationPolicy() {
        return this.InstanceAllocationPolicy;
    }

    /**
     * Set Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used.
     * @param InstanceAllocationPolicy Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used.
     */
    public void setInstanceAllocationPolicy(String InstanceAllocationPolicy) {
        this.InstanceAllocationPolicy = InstanceAllocationPolicy;
    }

    /**
     * Get Specifies how to assign pay-as-you-go instances and spot instances.
A valid value will be returned only when `InstanceAllocationPolicy` is set to `SPOT_MIXED`. 
     * @return SpotMixedAllocationPolicy Specifies how to assign pay-as-you-go instances and spot instances.
A valid value will be returned only when `InstanceAllocationPolicy` is set to `SPOT_MIXED`.
     */
    public SpotMixedAllocationPolicy getSpotMixedAllocationPolicy() {
        return this.SpotMixedAllocationPolicy;
    }

    /**
     * Set Specifies how to assign pay-as-you-go instances and spot instances.
A valid value will be returned only when `InstanceAllocationPolicy` is set to `SPOT_MIXED`.
     * @param SpotMixedAllocationPolicy Specifies how to assign pay-as-you-go instances and spot instances.
A valid value will be returned only when `InstanceAllocationPolicy` is set to `SPOT_MIXED`.
     */
    public void setSpotMixedAllocationPolicy(SpotMixedAllocationPolicy SpotMixedAllocationPolicy) {
        this.SpotMixedAllocationPolicy = SpotMixedAllocationPolicy;
    }

    /**
     * Get Indicates whether the capacity rebalancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. AS will add instances to meet the desired capacity only after the spot instances are terminated. 
     * @return CapacityRebalance Indicates whether the capacity rebalancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. AS will add instances to meet the desired capacity only after the spot instances are terminated.
     */
    public Boolean getCapacityRebalance() {
        return this.CapacityRebalance;
    }

    /**
     * Set Indicates whether the capacity rebalancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. AS will add instances to meet the desired capacity only after the spot instances are terminated.
     * @param CapacityRebalance Indicates whether the capacity rebalancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. AS will add instances to meet the desired capacity only after the spot instances are terminated.
     */
    public void setCapacityRebalance(Boolean CapacityRebalance) {
        this.CapacityRebalance = CapacityRebalance;
    }

    /**
     * Get Instance name sequencing settings.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceNameIndexSettings Instance name sequencing settings.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public InstanceNameIndexSettings getInstanceNameIndexSettings() {
        return this.InstanceNameIndexSettings;
    }

    /**
     * Set Instance name sequencing settings.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceNameIndexSettings Instance name sequencing settings.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceNameIndexSettings(InstanceNameIndexSettings InstanceNameIndexSettings) {
        this.InstanceNameIndexSettings = InstanceNameIndexSettings;
    }

    public AutoScalingGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalingGroup(AutoScalingGroup source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.AutoScalingGroupName != null) {
            this.AutoScalingGroupName = new String(source.AutoScalingGroupName);
        }
        if (source.AutoScalingGroupStatus != null) {
            this.AutoScalingGroupStatus = new String(source.AutoScalingGroupStatus);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DefaultCooldown != null) {
            this.DefaultCooldown = new Long(source.DefaultCooldown);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.EnabledStatus != null) {
            this.EnabledStatus = new String(source.EnabledStatus);
        }
        if (source.ForwardLoadBalancerSet != null) {
            this.ForwardLoadBalancerSet = new ForwardLoadBalancer[source.ForwardLoadBalancerSet.length];
            for (int i = 0; i < source.ForwardLoadBalancerSet.length; i++) {
                this.ForwardLoadBalancerSet[i] = new ForwardLoadBalancer(source.ForwardLoadBalancerSet[i]);
            }
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.InServiceInstanceCount != null) {
            this.InServiceInstanceCount = new Long(source.InServiceInstanceCount);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.LoadBalancerIdSet != null) {
            this.LoadBalancerIdSet = new String[source.LoadBalancerIdSet.length];
            for (int i = 0; i < source.LoadBalancerIdSet.length; i++) {
                this.LoadBalancerIdSet[i] = new String(source.LoadBalancerIdSet[i]);
            }
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SubnetIdSet != null) {
            this.SubnetIdSet = new String[source.SubnetIdSet.length];
            for (int i = 0; i < source.SubnetIdSet.length; i++) {
                this.SubnetIdSet[i] = new String(source.SubnetIdSet[i]);
            }
        }
        if (source.TerminationPolicySet != null) {
            this.TerminationPolicySet = new String[source.TerminationPolicySet.length];
            for (int i = 0; i < source.TerminationPolicySet.length; i++) {
                this.TerminationPolicySet[i] = new String(source.TerminationPolicySet[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ZoneSet != null) {
            this.ZoneSet = new String[source.ZoneSet.length];
            for (int i = 0; i < source.ZoneSet.length; i++) {
                this.ZoneSet[i] = new String(source.ZoneSet[i]);
            }
        }
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new String(source.RetryPolicy);
        }
        if (source.InActivityStatus != null) {
            this.InActivityStatus = new String(source.InActivityStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ServiceSettings != null) {
            this.ServiceSettings = new ServiceSettings(source.ServiceSettings);
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
        if (source.MultiZoneSubnetPolicy != null) {
            this.MultiZoneSubnetPolicy = new String(source.MultiZoneSubnetPolicy);
        }
        if (source.HealthCheckType != null) {
            this.HealthCheckType = new String(source.HealthCheckType);
        }
        if (source.LoadBalancerHealthCheckGracePeriod != null) {
            this.LoadBalancerHealthCheckGracePeriod = new Long(source.LoadBalancerHealthCheckGracePeriod);
        }
        if (source.InstanceAllocationPolicy != null) {
            this.InstanceAllocationPolicy = new String(source.InstanceAllocationPolicy);
        }
        if (source.SpotMixedAllocationPolicy != null) {
            this.SpotMixedAllocationPolicy = new SpotMixedAllocationPolicy(source.SpotMixedAllocationPolicy);
        }
        if (source.CapacityRebalance != null) {
            this.CapacityRebalance = new Boolean(source.CapacityRebalance);
        }
        if (source.InstanceNameIndexSettings != null) {
            this.InstanceNameIndexSettings = new InstanceNameIndexSettings(source.InstanceNameIndexSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "AutoScalingGroupStatus", this.AutoScalingGroupStatus);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "EnabledStatus", this.EnabledStatus);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancerSet.", this.ForwardLoadBalancerSet);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InServiceInstanceCount", this.InServiceInstanceCount);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamArraySimple(map, prefix + "LoadBalancerIdSet.", this.LoadBalancerIdSet);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SubnetIdSet.", this.SubnetIdSet);
        this.setParamArraySimple(map, prefix + "TerminationPolicySet.", this.TerminationPolicySet);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "InActivityStatus", this.InActivityStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ServiceSettings.", this.ServiceSettings);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamSimple(map, prefix + "MultiZoneSubnetPolicy", this.MultiZoneSubnetPolicy);
        this.setParamSimple(map, prefix + "HealthCheckType", this.HealthCheckType);
        this.setParamSimple(map, prefix + "LoadBalancerHealthCheckGracePeriod", this.LoadBalancerHealthCheckGracePeriod);
        this.setParamSimple(map, prefix + "InstanceAllocationPolicy", this.InstanceAllocationPolicy);
        this.setParamObj(map, prefix + "SpotMixedAllocationPolicy.", this.SpotMixedAllocationPolicy);
        this.setParamSimple(map, prefix + "CapacityRebalance", this.CapacityRebalance);
        this.setParamObj(map, prefix + "InstanceNameIndexSettings.", this.InstanceNameIndexSettings);

    }
}

