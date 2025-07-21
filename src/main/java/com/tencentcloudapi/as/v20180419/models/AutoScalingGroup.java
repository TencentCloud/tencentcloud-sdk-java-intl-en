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
    * Current status of the scaling group. Valid values:
<li>NORMAL: The scaling group is normal.</li>
<li>CVM_ABNORMAL: The launch configuration is abnormal.</li>
<li>LB_ABNORMAL: The CLB is abnormal.</li>
<li>LB_LISTENER_ABNORMAL: The CLB listener is abnormal.</li>
<li>LB_LOCATION_ABNORMAL: The forwarding configuration of the CLB listener is abnormal.</li>
<li>VPC_ABNORMAL: The VPC is abnormal.</li>
<li>SUBNET_ABNORMAL: The VPC subnet is abnormal.</li>
<li>INSUFFICIENT_BALANCE: The balance is insufficient.</li>
<li>LB_BACKEND_REGION_NOT_MATCH: The region of the CLB instance backend does not match that of the AS service.</li>
<li>LB_BACKEND_VPC_NOT_MATCH: The VPC of the CLB instance does not match that of the scaling group.</li>
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
    * Destruction policy. valid values are as follows:.
<Li>OLDEST_INSTANCE: terminate the oldest instance in the scaling group first, default value.</li>.
<Li>NEWEST_INSTANCE: terminate the newest instance in the scaling group first.</li>.
    */
    @SerializedName("TerminationPolicySet")
    @Expose
    private String [] TerminationPolicySet;

    /**
    * VPC ID.
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
    * Retry policy. a partially successful scaling operation is considered a failed activity. valid values are as follows:.
<Li>IMMEDIATE_RETRY: default value, means retry immediately, attempting retries in rapid succession over a short period. cease further retries after a certain number of consecutive failures (5).</li>.
<Li>INCREMENTAL_INTERVALS: specifies incremental interval retry. with the number of consecutive failures, the retry interval gradually increases. the first 10 retries are quick retry, and the follow-up retry interval gradually expands to 10 minutes, 30 minutes, 60 minutes, and one day.</li>.
<Li>NO_RETRY: there will be no retry until another user call or Alarm information is received.</li>.
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
    * The number of IPv6 addresses that an instance has. valid values: 0 and 1. default value: 0, which means the instance does not allocate an IPv6 address. use a private network that supports ip and enable IPv6 CIDR in the subnet. for usage restrictions, see [IPv6 usage limits](https://intl.cloud.tencent.com/document/product/1142/38369?from_cn_redirect=1).
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * Multi-AZ/subnet policy.
<li>PRIORITY: The instances are attempted to be created taking the order of the AZ/subnet list as the priority. If the highest-priority AZ/subnet can create instances successfully, instances can always be created in that AZ/subnet.</li>
<li>EQUALITY: Select the AZ/subnet with the least number of instances for scale-out. In this way, each AZ/subnet has an opportunity for scale-out. Instances produced from multiple scale-out operations will be distributed to multiple AZs/subnets.</li>
    */
    @SerializedName("MultiZoneSubnetPolicy")
    @Expose
    private String MultiZoneSubnetPolicy;

    /**
    * Scaling group instance health check type, whose valid values include:
<li>CVM: Determine whether an instance is unhealthy based on its network status. An unhealthy network status is indicated by an event where instances become unreachable via PING. Detailed criteria of judgment can be found in [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1).</li>
<li>CLB: Determine whether an instance is unhealthy based on the health check status of CLB. For principles behind CLB health checks, see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).</li>
    */
    @SerializedName("HealthCheckType")
    @Expose
    private String HealthCheckType;

    /**
    * Grace period of the CLB health check. the scaled-out instances IN `IN_SERVICE` will not be marked as `CLB_UNHEALTHY` within the specified time range.
Default value: 0. value range: [0, 7200]. measurement unit: seconds.
    */
    @SerializedName("LoadBalancerHealthCheckGracePeriod")
    @Expose
    private Long LoadBalancerHealthCheckGracePeriod;

    /**
    * Instance assignment policy, whose valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.
<li>LAUNCH_CONFIGURATION: Represent the traditional mode of assigning instances according to the launch configuration.</li>
<li>SPOT_MIXED: Represent the spot mixed mode. Currently, this mode is supported only when the launch configuration is set to the pay-as-you-go billing mode. In the mixed mode, the scaling group will scale out pay-as-you-go models or spot models based on the predefined settings. When the mixed mode is used, the billing type of the associated launch configuration cannot be modified.</li>
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
    * Capacity rebalancing feature, which is applicable only to spot instances within the scaling group. Valid values:
<li>TRUE: Enable this feature. When spot instances in the scaling group are about to be automatically recycled by the spot instance service, AS proactively initiates the termination process of the spot instances. If there is a configured scale-in hook, it will be triggered before termination. After the termination process starts, AS asynchronously initiates the scale-out to reach the expected number of instances.</li>
<li>FALSE: Disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>
    */
    @SerializedName("CapacityRebalance")
    @Expose
    private Boolean CapacityRebalance;

    /**
    * Instance name sequencing settings.
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
     * Get Current status of the scaling group. Valid values:
<li>NORMAL: The scaling group is normal.</li>
<li>CVM_ABNORMAL: The launch configuration is abnormal.</li>
<li>LB_ABNORMAL: The CLB is abnormal.</li>
<li>LB_LISTENER_ABNORMAL: The CLB listener is abnormal.</li>
<li>LB_LOCATION_ABNORMAL: The forwarding configuration of the CLB listener is abnormal.</li>
<li>VPC_ABNORMAL: The VPC is abnormal.</li>
<li>SUBNET_ABNORMAL: The VPC subnet is abnormal.</li>
<li>INSUFFICIENT_BALANCE: The balance is insufficient.</li>
<li>LB_BACKEND_REGION_NOT_MATCH: The region of the CLB instance backend does not match that of the AS service.</li>
<li>LB_BACKEND_VPC_NOT_MATCH: The VPC of the CLB instance does not match that of the scaling group.</li> 
     * @return AutoScalingGroupStatus Current status of the scaling group. Valid values:
<li>NORMAL: The scaling group is normal.</li>
<li>CVM_ABNORMAL: The launch configuration is abnormal.</li>
<li>LB_ABNORMAL: The CLB is abnormal.</li>
<li>LB_LISTENER_ABNORMAL: The CLB listener is abnormal.</li>
<li>LB_LOCATION_ABNORMAL: The forwarding configuration of the CLB listener is abnormal.</li>
<li>VPC_ABNORMAL: The VPC is abnormal.</li>
<li>SUBNET_ABNORMAL: The VPC subnet is abnormal.</li>
<li>INSUFFICIENT_BALANCE: The balance is insufficient.</li>
<li>LB_BACKEND_REGION_NOT_MATCH: The region of the CLB instance backend does not match that of the AS service.</li>
<li>LB_BACKEND_VPC_NOT_MATCH: The VPC of the CLB instance does not match that of the scaling group.</li>
     */
    public String getAutoScalingGroupStatus() {
        return this.AutoScalingGroupStatus;
    }

    /**
     * Set Current status of the scaling group. Valid values:
<li>NORMAL: The scaling group is normal.</li>
<li>CVM_ABNORMAL: The launch configuration is abnormal.</li>
<li>LB_ABNORMAL: The CLB is abnormal.</li>
<li>LB_LISTENER_ABNORMAL: The CLB listener is abnormal.</li>
<li>LB_LOCATION_ABNORMAL: The forwarding configuration of the CLB listener is abnormal.</li>
<li>VPC_ABNORMAL: The VPC is abnormal.</li>
<li>SUBNET_ABNORMAL: The VPC subnet is abnormal.</li>
<li>INSUFFICIENT_BALANCE: The balance is insufficient.</li>
<li>LB_BACKEND_REGION_NOT_MATCH: The region of the CLB instance backend does not match that of the AS service.</li>
<li>LB_BACKEND_VPC_NOT_MATCH: The VPC of the CLB instance does not match that of the scaling group.</li>
     * @param AutoScalingGroupStatus Current status of the scaling group. Valid values:
<li>NORMAL: The scaling group is normal.</li>
<li>CVM_ABNORMAL: The launch configuration is abnormal.</li>
<li>LB_ABNORMAL: The CLB is abnormal.</li>
<li>LB_LISTENER_ABNORMAL: The CLB listener is abnormal.</li>
<li>LB_LOCATION_ABNORMAL: The forwarding configuration of the CLB listener is abnormal.</li>
<li>VPC_ABNORMAL: The VPC is abnormal.</li>
<li>SUBNET_ABNORMAL: The VPC subnet is abnormal.</li>
<li>INSUFFICIENT_BALANCE: The balance is insufficient.</li>
<li>LB_BACKEND_REGION_NOT_MATCH: The region of the CLB instance backend does not match that of the AS service.</li>
<li>LB_BACKEND_VPC_NOT_MATCH: The VPC of the CLB instance does not match that of the scaling group.</li>
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
     * Get Destruction policy. valid values are as follows:.
<Li>OLDEST_INSTANCE: terminate the oldest instance in the scaling group first, default value.</li>.
<Li>NEWEST_INSTANCE: terminate the newest instance in the scaling group first.</li>. 
     * @return TerminationPolicySet Destruction policy. valid values are as follows:.
<Li>OLDEST_INSTANCE: terminate the oldest instance in the scaling group first, default value.</li>.
<Li>NEWEST_INSTANCE: terminate the newest instance in the scaling group first.</li>.
     */
    public String [] getTerminationPolicySet() {
        return this.TerminationPolicySet;
    }

    /**
     * Set Destruction policy. valid values are as follows:.
<Li>OLDEST_INSTANCE: terminate the oldest instance in the scaling group first, default value.</li>.
<Li>NEWEST_INSTANCE: terminate the newest instance in the scaling group first.</li>.
     * @param TerminationPolicySet Destruction policy. valid values are as follows:.
<Li>OLDEST_INSTANCE: terminate the oldest instance in the scaling group first, default value.</li>.
<Li>NEWEST_INSTANCE: terminate the newest instance in the scaling group first.</li>.
     */
    public void setTerminationPolicySet(String [] TerminationPolicySet) {
        this.TerminationPolicySet = TerminationPolicySet;
    }

    /**
     * Get VPC ID. 
     * @return VpcId VPC ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID.
     * @param VpcId VPC ID.
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
     * Get Retry policy. a partially successful scaling operation is considered a failed activity. valid values are as follows:.
<Li>IMMEDIATE_RETRY: default value, means retry immediately, attempting retries in rapid succession over a short period. cease further retries after a certain number of consecutive failures (5).</li>.
<Li>INCREMENTAL_INTERVALS: specifies incremental interval retry. with the number of consecutive failures, the retry interval gradually increases. the first 10 retries are quick retry, and the follow-up retry interval gradually expands to 10 minutes, 30 minutes, 60 minutes, and one day.</li>.
<Li>NO_RETRY: there will be no retry until another user call or Alarm information is received.</li>. 
     * @return RetryPolicy Retry policy. a partially successful scaling operation is considered a failed activity. valid values are as follows:.
<Li>IMMEDIATE_RETRY: default value, means retry immediately, attempting retries in rapid succession over a short period. cease further retries after a certain number of consecutive failures (5).</li>.
<Li>INCREMENTAL_INTERVALS: specifies incremental interval retry. with the number of consecutive failures, the retry interval gradually increases. the first 10 retries are quick retry, and the follow-up retry interval gradually expands to 10 minutes, 30 minutes, 60 minutes, and one day.</li>.
<Li>NO_RETRY: there will be no retry until another user call or Alarm information is received.</li>.
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set Retry policy. a partially successful scaling operation is considered a failed activity. valid values are as follows:.
<Li>IMMEDIATE_RETRY: default value, means retry immediately, attempting retries in rapid succession over a short period. cease further retries after a certain number of consecutive failures (5).</li>.
<Li>INCREMENTAL_INTERVALS: specifies incremental interval retry. with the number of consecutive failures, the retry interval gradually increases. the first 10 retries are quick retry, and the follow-up retry interval gradually expands to 10 minutes, 30 minutes, 60 minutes, and one day.</li>.
<Li>NO_RETRY: there will be no retry until another user call or Alarm information is received.</li>.
     * @param RetryPolicy Retry policy. a partially successful scaling operation is considered a failed activity. valid values are as follows:.
<Li>IMMEDIATE_RETRY: default value, means retry immediately, attempting retries in rapid succession over a short period. cease further retries after a certain number of consecutive failures (5).</li>.
<Li>INCREMENTAL_INTERVALS: specifies incremental interval retry. with the number of consecutive failures, the retry interval gradually increases. the first 10 retries are quick retry, and the follow-up retry interval gradually expands to 10 minutes, 30 minutes, 60 minutes, and one day.</li>.
<Li>NO_RETRY: there will be no retry until another user call or Alarm information is received.</li>.
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
     * Get The number of IPv6 addresses that an instance has. valid values: 0 and 1. default value: 0, which means the instance does not allocate an IPv6 address. use a private network that supports ip and enable IPv6 CIDR in the subnet. for usage restrictions, see [IPv6 usage limits](https://intl.cloud.tencent.com/document/product/1142/38369?from_cn_redirect=1). 
     * @return Ipv6AddressCount The number of IPv6 addresses that an instance has. valid values: 0 and 1. default value: 0, which means the instance does not allocate an IPv6 address. use a private network that supports ip and enable IPv6 CIDR in the subnet. for usage restrictions, see [IPv6 usage limits](https://intl.cloud.tencent.com/document/product/1142/38369?from_cn_redirect=1).
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set The number of IPv6 addresses that an instance has. valid values: 0 and 1. default value: 0, which means the instance does not allocate an IPv6 address. use a private network that supports ip and enable IPv6 CIDR in the subnet. for usage restrictions, see [IPv6 usage limits](https://intl.cloud.tencent.com/document/product/1142/38369?from_cn_redirect=1).
     * @param Ipv6AddressCount The number of IPv6 addresses that an instance has. valid values: 0 and 1. default value: 0, which means the instance does not allocate an IPv6 address. use a private network that supports ip and enable IPv6 CIDR in the subnet. for usage restrictions, see [IPv6 usage limits](https://intl.cloud.tencent.com/document/product/1142/38369?from_cn_redirect=1).
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get Multi-AZ/subnet policy.
<li>PRIORITY: The instances are attempted to be created taking the order of the AZ/subnet list as the priority. If the highest-priority AZ/subnet can create instances successfully, instances can always be created in that AZ/subnet.</li>
<li>EQUALITY: Select the AZ/subnet with the least number of instances for scale-out. In this way, each AZ/subnet has an opportunity for scale-out. Instances produced from multiple scale-out operations will be distributed to multiple AZs/subnets.</li> 
     * @return MultiZoneSubnetPolicy Multi-AZ/subnet policy.
<li>PRIORITY: The instances are attempted to be created taking the order of the AZ/subnet list as the priority. If the highest-priority AZ/subnet can create instances successfully, instances can always be created in that AZ/subnet.</li>
<li>EQUALITY: Select the AZ/subnet with the least number of instances for scale-out. In this way, each AZ/subnet has an opportunity for scale-out. Instances produced from multiple scale-out operations will be distributed to multiple AZs/subnets.</li>
     */
    public String getMultiZoneSubnetPolicy() {
        return this.MultiZoneSubnetPolicy;
    }

    /**
     * Set Multi-AZ/subnet policy.
<li>PRIORITY: The instances are attempted to be created taking the order of the AZ/subnet list as the priority. If the highest-priority AZ/subnet can create instances successfully, instances can always be created in that AZ/subnet.</li>
<li>EQUALITY: Select the AZ/subnet with the least number of instances for scale-out. In this way, each AZ/subnet has an opportunity for scale-out. Instances produced from multiple scale-out operations will be distributed to multiple AZs/subnets.</li>
     * @param MultiZoneSubnetPolicy Multi-AZ/subnet policy.
<li>PRIORITY: The instances are attempted to be created taking the order of the AZ/subnet list as the priority. If the highest-priority AZ/subnet can create instances successfully, instances can always be created in that AZ/subnet.</li>
<li>EQUALITY: Select the AZ/subnet with the least number of instances for scale-out. In this way, each AZ/subnet has an opportunity for scale-out. Instances produced from multiple scale-out operations will be distributed to multiple AZs/subnets.</li>
     */
    public void setMultiZoneSubnetPolicy(String MultiZoneSubnetPolicy) {
        this.MultiZoneSubnetPolicy = MultiZoneSubnetPolicy;
    }

    /**
     * Get Scaling group instance health check type, whose valid values include:
<li>CVM: Determine whether an instance is unhealthy based on its network status. An unhealthy network status is indicated by an event where instances become unreachable via PING. Detailed criteria of judgment can be found in [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1).</li>
<li>CLB: Determine whether an instance is unhealthy based on the health check status of CLB. For principles behind CLB health checks, see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).</li> 
     * @return HealthCheckType Scaling group instance health check type, whose valid values include:
<li>CVM: Determine whether an instance is unhealthy based on its network status. An unhealthy network status is indicated by an event where instances become unreachable via PING. Detailed criteria of judgment can be found in [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1).</li>
<li>CLB: Determine whether an instance is unhealthy based on the health check status of CLB. For principles behind CLB health checks, see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).</li>
     */
    public String getHealthCheckType() {
        return this.HealthCheckType;
    }

    /**
     * Set Scaling group instance health check type, whose valid values include:
<li>CVM: Determine whether an instance is unhealthy based on its network status. An unhealthy network status is indicated by an event where instances become unreachable via PING. Detailed criteria of judgment can be found in [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1).</li>
<li>CLB: Determine whether an instance is unhealthy based on the health check status of CLB. For principles behind CLB health checks, see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).</li>
     * @param HealthCheckType Scaling group instance health check type, whose valid values include:
<li>CVM: Determine whether an instance is unhealthy based on its network status. An unhealthy network status is indicated by an event where instances become unreachable via PING. Detailed criteria of judgment can be found in [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1).</li>
<li>CLB: Determine whether an instance is unhealthy based on the health check status of CLB. For principles behind CLB health checks, see [Health Check](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).</li>
     */
    public void setHealthCheckType(String HealthCheckType) {
        this.HealthCheckType = HealthCheckType;
    }

    /**
     * Get Grace period of the CLB health check. the scaled-out instances IN `IN_SERVICE` will not be marked as `CLB_UNHEALTHY` within the specified time range.
Default value: 0. value range: [0, 7200]. measurement unit: seconds. 
     * @return LoadBalancerHealthCheckGracePeriod Grace period of the CLB health check. the scaled-out instances IN `IN_SERVICE` will not be marked as `CLB_UNHEALTHY` within the specified time range.
Default value: 0. value range: [0, 7200]. measurement unit: seconds.
     */
    public Long getLoadBalancerHealthCheckGracePeriod() {
        return this.LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Set Grace period of the CLB health check. the scaled-out instances IN `IN_SERVICE` will not be marked as `CLB_UNHEALTHY` within the specified time range.
Default value: 0. value range: [0, 7200]. measurement unit: seconds.
     * @param LoadBalancerHealthCheckGracePeriod Grace period of the CLB health check. the scaled-out instances IN `IN_SERVICE` will not be marked as `CLB_UNHEALTHY` within the specified time range.
Default value: 0. value range: [0, 7200]. measurement unit: seconds.
     */
    public void setLoadBalancerHealthCheckGracePeriod(Long LoadBalancerHealthCheckGracePeriod) {
        this.LoadBalancerHealthCheckGracePeriod = LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Get Instance assignment policy, whose valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.
<li>LAUNCH_CONFIGURATION: Represent the traditional mode of assigning instances according to the launch configuration.</li>
<li>SPOT_MIXED: Represent the spot mixed mode. Currently, this mode is supported only when the launch configuration is set to the pay-as-you-go billing mode. In the mixed mode, the scaling group will scale out pay-as-you-go models or spot models based on the predefined settings. When the mixed mode is used, the billing type of the associated launch configuration cannot be modified.</li> 
     * @return InstanceAllocationPolicy Instance assignment policy, whose valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.
<li>LAUNCH_CONFIGURATION: Represent the traditional mode of assigning instances according to the launch configuration.</li>
<li>SPOT_MIXED: Represent the spot mixed mode. Currently, this mode is supported only when the launch configuration is set to the pay-as-you-go billing mode. In the mixed mode, the scaling group will scale out pay-as-you-go models or spot models based on the predefined settings. When the mixed mode is used, the billing type of the associated launch configuration cannot be modified.</li>
     */
    public String getInstanceAllocationPolicy() {
        return this.InstanceAllocationPolicy;
    }

    /**
     * Set Instance assignment policy, whose valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.
<li>LAUNCH_CONFIGURATION: Represent the traditional mode of assigning instances according to the launch configuration.</li>
<li>SPOT_MIXED: Represent the spot mixed mode. Currently, this mode is supported only when the launch configuration is set to the pay-as-you-go billing mode. In the mixed mode, the scaling group will scale out pay-as-you-go models or spot models based on the predefined settings. When the mixed mode is used, the billing type of the associated launch configuration cannot be modified.</li>
     * @param InstanceAllocationPolicy Instance assignment policy, whose valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.
<li>LAUNCH_CONFIGURATION: Represent the traditional mode of assigning instances according to the launch configuration.</li>
<li>SPOT_MIXED: Represent the spot mixed mode. Currently, this mode is supported only when the launch configuration is set to the pay-as-you-go billing mode. In the mixed mode, the scaling group will scale out pay-as-you-go models or spot models based on the predefined settings. When the mixed mode is used, the billing type of the associated launch configuration cannot be modified.</li>
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
     * Get Capacity rebalancing feature, which is applicable only to spot instances within the scaling group. Valid values:
<li>TRUE: Enable this feature. When spot instances in the scaling group are about to be automatically recycled by the spot instance service, AS proactively initiates the termination process of the spot instances. If there is a configured scale-in hook, it will be triggered before termination. After the termination process starts, AS asynchronously initiates the scale-out to reach the expected number of instances.</li>
<li>FALSE: Disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li> 
     * @return CapacityRebalance Capacity rebalancing feature, which is applicable only to spot instances within the scaling group. Valid values:
<li>TRUE: Enable this feature. When spot instances in the scaling group are about to be automatically recycled by the spot instance service, AS proactively initiates the termination process of the spot instances. If there is a configured scale-in hook, it will be triggered before termination. After the termination process starts, AS asynchronously initiates the scale-out to reach the expected number of instances.</li>
<li>FALSE: Disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>
     */
    public Boolean getCapacityRebalance() {
        return this.CapacityRebalance;
    }

    /**
     * Set Capacity rebalancing feature, which is applicable only to spot instances within the scaling group. Valid values:
<li>TRUE: Enable this feature. When spot instances in the scaling group are about to be automatically recycled by the spot instance service, AS proactively initiates the termination process of the spot instances. If there is a configured scale-in hook, it will be triggered before termination. After the termination process starts, AS asynchronously initiates the scale-out to reach the expected number of instances.</li>
<li>FALSE: Disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>
     * @param CapacityRebalance Capacity rebalancing feature, which is applicable only to spot instances within the scaling group. Valid values:
<li>TRUE: Enable this feature. When spot instances in the scaling group are about to be automatically recycled by the spot instance service, AS proactively initiates the termination process of the spot instances. If there is a configured scale-in hook, it will be triggered before termination. After the termination process starts, AS asynchronously initiates the scale-out to reach the expected number of instances.</li>
<li>FALSE: Disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>
     */
    public void setCapacityRebalance(Boolean CapacityRebalance) {
        this.CapacityRebalance = CapacityRebalance;
    }

    /**
     * Get Instance name sequencing settings. 
     * @return InstanceNameIndexSettings Instance name sequencing settings.
     */
    public InstanceNameIndexSettings getInstanceNameIndexSettings() {
        return this.InstanceNameIndexSettings;
    }

    /**
     * Set Instance name sequencing settings.
     * @param InstanceNameIndexSettings Instance name sequencing settings.
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

