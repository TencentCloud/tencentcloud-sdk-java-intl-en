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

public class CreateAutoScalingGroupRequest extends AbstractModel{

    /**
    * Auto scaling group name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 55 bytes and must be unique under your account.
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * Launch configuration ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Maximum number of instances. Value range: 0-2,000.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * Minimum number of instances. Value range: 0-2,000.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * VPC ID; if on a basic network, enter an empty string
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Default cooldown period in seconds. Default value: 300
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Long DefaultCooldown;

    /**
    * Desired number of instances. The number should be no larger than the maximum and no smaller than minimum number of instances
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * List of classic CLB IDs. Currently, the maximum length is 20. You cannot specify LoadBalancerIds and ForwardLoadBalancers at the same time.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Project ID of an instance in a scaling group. The default project is used if it’s left blank.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * List of application CLBs. Up to 50 CLBs are allowed. You cannot specify `loadBalancerIds` and `ForwardLoadBalancers` at the same time.
    */
    @SerializedName("ForwardLoadBalancers")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancers;

    /**
    * List of subnet IDs. A subnet must be specified in the VPC scenario. If multiple subnets are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created.
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Termination policy. Currently, the maximum length is 1. Value range: OLDEST_INSTANCE, NEWEST_INSTANCE. Default value: OLDEST_INSTANCE.
<br><li> OLDEST_INSTANCE: The oldest instance in the auto scaling group will be terminated first.
<br><li> NEWEST_INSTANCE: The newest instance in the auto scaling group will be terminated first.
    */
    @SerializedName("TerminationPolicies")
    @Expose
    private String [] TerminationPolicies;

    /**
    * List of availability zones. An availability zone must be specified in the basic network scenario. If multiple availability zones are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Retry policy. Value range: IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY. Default value: IMMEDIATE_RETRY.
<br><li> IMMEDIATE_RETRY: Retrying immediately in a short period of time and stopping after a number of consecutive failures (5).
<br><li> INCREMENTAL_INTERVALS: Retrying at incremental intervals, i.e., as the number of consecutive failures increases, the retry interval gradually increases, ranging from one second to one day.
<br><li> NO_RETRY: No retry until a user call or alarm message is received again.
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * Availability zone verification policy. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will succeed only if all availability zones (Zone) or subnets (SubnetId) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any availability zone (Zone) or subnet (SubnetId) is available; otherwise, an error will be reported.

Common reasons why an availability zone or subnet is unavailable include stock-out of CVM instances or CBS cloud disks in the availability zone, insufficient quota in the availability zone, or insufficient IPs in the subnet.
If an availability zone or subnet in Zones/SubnetIds does not exist, a verification error will be reported regardless of the value of ZonesCheckPolicy.
    */
    @SerializedName("ZonesCheckPolicy")
    @Expose
    private String ZonesCheckPolicy;

    /**
    * List of tag descriptions. In this parameter, you can specify the tags to be bound with a scaling group as well as corresponding resource instances. Each scaling group can have up to 30 tags.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Service settings such as unhealthy instance replacement.
    */
    @SerializedName("ServiceSettings")
    @Expose
    private ServiceSettings ServiceSettings;

    /**
    * The number of IPv6 addresses that an instance has. Valid values: 0 and 1. Default value: 0.
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * Multi-availability zone/subnet policy. Valid values: PRIORITY and EQUALITY. Default value: PRIORITY.
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li>EQUALITY: instances created for scale-out are distributed to multiple availability zones/subnets, so as to keep the number of instances in different availability zone/subnet in balance.

Notes: 
<br><li> When the scaling group is based on the classic network, this policy applies to multiple availability zones. When the scaling group is based on a VPC, this policy applies to multiple subnets, and you do not need to consider availability zones. For example, if you have four subnets (A, B, C, and D) and A, B, and C are in availability zone 1 and D is in availability zone 2, you only need to decide the order of the four subnets, without worrying about the issue of availability zones.
<br><li> This policy is applicable to multiple availability zones/subnets, but is not applicable to multiple models with launch configurations. Specify the models according to the model priority.
<br><li> When creating instances based on the PRIORITY policy, apply the multi-model policy and then apply the multi-availability zones/subnet policy. For example, if you have models A and B and subnets 1, 2, and 3, creation will be attempted in the following order: A1, A2, A3, B1, B2, and B3. If A1 is sold out, A2 (not B1) is tried next.
    */
    @SerializedName("MultiZoneSubnetPolicy")
    @Expose
    private String MultiZoneSubnetPolicy;

    /**
    * Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).<br>If the parameter is set to `CLB`, the scaling group will check both the network status and the CLB health check status. If the network check indicates unhealthy, the `HealthStatus` field will return `UNHEALTHY`. If the CLB health check indicates unhealthy, the `HealthStatus` field will return `CLB_UNHEALTHY`. If both checks indicate unhealthy, the `HealthStatus` field will return `UNHEALTHY|CLB_UNHEALTHY`. Default value: `CLB`.
    */
    @SerializedName("HealthCheckType")
    @Expose
    private String HealthCheckType;

    /**
    * Grace period of the CLB health check during which the `IN_SERVICE` instances added will not be marked as `CLB_UNHEALTHY`.<br>Valid range: 0-7200, in seconds. Default value: `0`.
    */
    @SerializedName("LoadBalancerHealthCheckGracePeriod")
    @Expose
    private Long LoadBalancerHealthCheckGracePeriod;

    /**
    * Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`; default value: `LAUNCH_CONFIGURATION`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used.
    */
    @SerializedName("InstanceAllocationPolicy")
    @Expose
    private String InstanceAllocationPolicy;

    /**
    * Specifies how to assign pay-as-you-go instances and spot instances.
This parameter is valid only when `InstanceAllocationPolicy ` is set to `SPOT_MIXED`.
    */
    @SerializedName("SpotMixedAllocationPolicy")
    @Expose
    private SpotMixedAllocationPolicy SpotMixedAllocationPolicy;

    /**
    * Indicates whether the capacity re-balancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. In this case, AS will add instances to meet the desired capacity only after the spot instances are terminated.

Default value: `False`.
    */
    @SerializedName("CapacityRebalance")
    @Expose
    private Boolean CapacityRebalance;

    /**
     * Get Auto scaling group name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 55 bytes and must be unique under your account. 
     * @return AutoScalingGroupName Auto scaling group name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 55 bytes and must be unique under your account.
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set Auto scaling group name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 55 bytes and must be unique under your account.
     * @param AutoScalingGroupName Auto scaling group name, which can only contain letters, numbers, underscores, hyphens ("-"), and decimal points with a maximum length of 55 bytes and must be unique under your account.
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
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
     * Get Maximum number of instances. Value range: 0-2,000. 
     * @return MaxSize Maximum number of instances. Value range: 0-2,000.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum number of instances. Value range: 0-2,000.
     * @param MaxSize Maximum number of instances. Value range: 0-2,000.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Minimum number of instances. Value range: 0-2,000. 
     * @return MinSize Minimum number of instances. Value range: 0-2,000.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set Minimum number of instances. Value range: 0-2,000.
     * @param MinSize Minimum number of instances. Value range: 0-2,000.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get VPC ID; if on a basic network, enter an empty string 
     * @return VpcId VPC ID; if on a basic network, enter an empty string
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID; if on a basic network, enter an empty string
     * @param VpcId VPC ID; if on a basic network, enter an empty string
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Default cooldown period in seconds. Default value: 300 
     * @return DefaultCooldown Default cooldown period in seconds. Default value: 300
     */
    public Long getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Set Default cooldown period in seconds. Default value: 300
     * @param DefaultCooldown Default cooldown period in seconds. Default value: 300
     */
    public void setDefaultCooldown(Long DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Get Desired number of instances. The number should be no larger than the maximum and no smaller than minimum number of instances 
     * @return DesiredCapacity Desired number of instances. The number should be no larger than the maximum and no smaller than minimum number of instances
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set Desired number of instances. The number should be no larger than the maximum and no smaller than minimum number of instances
     * @param DesiredCapacity Desired number of instances. The number should be no larger than the maximum and no smaller than minimum number of instances
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get List of classic CLB IDs. Currently, the maximum length is 20. You cannot specify LoadBalancerIds and ForwardLoadBalancers at the same time. 
     * @return LoadBalancerIds List of classic CLB IDs. Currently, the maximum length is 20. You cannot specify LoadBalancerIds and ForwardLoadBalancers at the same time.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set List of classic CLB IDs. Currently, the maximum length is 20. You cannot specify LoadBalancerIds and ForwardLoadBalancers at the same time.
     * @param LoadBalancerIds List of classic CLB IDs. Currently, the maximum length is 20. You cannot specify LoadBalancerIds and ForwardLoadBalancers at the same time.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Project ID of an instance in a scaling group. The default project is used if it’s left blank. 
     * @return ProjectId Project ID of an instance in a scaling group. The default project is used if it’s left blank.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID of an instance in a scaling group. The default project is used if it’s left blank.
     * @param ProjectId Project ID of an instance in a scaling group. The default project is used if it’s left blank.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get List of application CLBs. Up to 50 CLBs are allowed. You cannot specify `loadBalancerIds` and `ForwardLoadBalancers` at the same time. 
     * @return ForwardLoadBalancers List of application CLBs. Up to 50 CLBs are allowed. You cannot specify `loadBalancerIds` and `ForwardLoadBalancers` at the same time.
     */
    public ForwardLoadBalancer [] getForwardLoadBalancers() {
        return this.ForwardLoadBalancers;
    }

    /**
     * Set List of application CLBs. Up to 50 CLBs are allowed. You cannot specify `loadBalancerIds` and `ForwardLoadBalancers` at the same time.
     * @param ForwardLoadBalancers List of application CLBs. Up to 50 CLBs are allowed. You cannot specify `loadBalancerIds` and `ForwardLoadBalancers` at the same time.
     */
    public void setForwardLoadBalancers(ForwardLoadBalancer [] ForwardLoadBalancers) {
        this.ForwardLoadBalancers = ForwardLoadBalancers;
    }

    /**
     * Get List of subnet IDs. A subnet must be specified in the VPC scenario. If multiple subnets are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created. 
     * @return SubnetIds List of subnet IDs. A subnet must be specified in the VPC scenario. If multiple subnets are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created.
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set List of subnet IDs. A subnet must be specified in the VPC scenario. If multiple subnets are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created.
     * @param SubnetIds List of subnet IDs. A subnet must be specified in the VPC scenario. If multiple subnets are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created.
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Termination policy. Currently, the maximum length is 1. Value range: OLDEST_INSTANCE, NEWEST_INSTANCE. Default value: OLDEST_INSTANCE.
<br><li> OLDEST_INSTANCE: The oldest instance in the auto scaling group will be terminated first.
<br><li> NEWEST_INSTANCE: The newest instance in the auto scaling group will be terminated first. 
     * @return TerminationPolicies Termination policy. Currently, the maximum length is 1. Value range: OLDEST_INSTANCE, NEWEST_INSTANCE. Default value: OLDEST_INSTANCE.
<br><li> OLDEST_INSTANCE: The oldest instance in the auto scaling group will be terminated first.
<br><li> NEWEST_INSTANCE: The newest instance in the auto scaling group will be terminated first.
     */
    public String [] getTerminationPolicies() {
        return this.TerminationPolicies;
    }

    /**
     * Set Termination policy. Currently, the maximum length is 1. Value range: OLDEST_INSTANCE, NEWEST_INSTANCE. Default value: OLDEST_INSTANCE.
<br><li> OLDEST_INSTANCE: The oldest instance in the auto scaling group will be terminated first.
<br><li> NEWEST_INSTANCE: The newest instance in the auto scaling group will be terminated first.
     * @param TerminationPolicies Termination policy. Currently, the maximum length is 1. Value range: OLDEST_INSTANCE, NEWEST_INSTANCE. Default value: OLDEST_INSTANCE.
<br><li> OLDEST_INSTANCE: The oldest instance in the auto scaling group will be terminated first.
<br><li> NEWEST_INSTANCE: The newest instance in the auto scaling group will be terminated first.
     */
    public void setTerminationPolicies(String [] TerminationPolicies) {
        this.TerminationPolicies = TerminationPolicies;
    }

    /**
     * Get List of availability zones. An availability zone must be specified in the basic network scenario. If multiple availability zones are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created. 
     * @return Zones List of availability zones. An availability zone must be specified in the basic network scenario. If multiple availability zones are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set List of availability zones. An availability zone must be specified in the basic network scenario. If multiple availability zones are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created.
     * @param Zones List of availability zones. An availability zone must be specified in the basic network scenario. If multiple availability zones are entered, their priority will be determined by the order in which they are entered, and they will be tried one by one until instances can be successfully created.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Retry policy. Value range: IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY. Default value: IMMEDIATE_RETRY.
<br><li> IMMEDIATE_RETRY: Retrying immediately in a short period of time and stopping after a number of consecutive failures (5).
<br><li> INCREMENTAL_INTERVALS: Retrying at incremental intervals, i.e., as the number of consecutive failures increases, the retry interval gradually increases, ranging from one second to one day.
<br><li> NO_RETRY: No retry until a user call or alarm message is received again. 
     * @return RetryPolicy Retry policy. Value range: IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY. Default value: IMMEDIATE_RETRY.
<br><li> IMMEDIATE_RETRY: Retrying immediately in a short period of time and stopping after a number of consecutive failures (5).
<br><li> INCREMENTAL_INTERVALS: Retrying at incremental intervals, i.e., as the number of consecutive failures increases, the retry interval gradually increases, ranging from one second to one day.
<br><li> NO_RETRY: No retry until a user call or alarm message is received again.
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set Retry policy. Value range: IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY. Default value: IMMEDIATE_RETRY.
<br><li> IMMEDIATE_RETRY: Retrying immediately in a short period of time and stopping after a number of consecutive failures (5).
<br><li> INCREMENTAL_INTERVALS: Retrying at incremental intervals, i.e., as the number of consecutive failures increases, the retry interval gradually increases, ranging from one second to one day.
<br><li> NO_RETRY: No retry until a user call or alarm message is received again.
     * @param RetryPolicy Retry policy. Value range: IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY. Default value: IMMEDIATE_RETRY.
<br><li> IMMEDIATE_RETRY: Retrying immediately in a short period of time and stopping after a number of consecutive failures (5).
<br><li> INCREMENTAL_INTERVALS: Retrying at incremental intervals, i.e., as the number of consecutive failures increases, the retry interval gradually increases, ranging from one second to one day.
<br><li> NO_RETRY: No retry until a user call or alarm message is received again.
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get Availability zone verification policy. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will succeed only if all availability zones (Zone) or subnets (SubnetId) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any availability zone (Zone) or subnet (SubnetId) is available; otherwise, an error will be reported.

Common reasons why an availability zone or subnet is unavailable include stock-out of CVM instances or CBS cloud disks in the availability zone, insufficient quota in the availability zone, or insufficient IPs in the subnet.
If an availability zone or subnet in Zones/SubnetIds does not exist, a verification error will be reported regardless of the value of ZonesCheckPolicy. 
     * @return ZonesCheckPolicy Availability zone verification policy. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will succeed only if all availability zones (Zone) or subnets (SubnetId) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any availability zone (Zone) or subnet (SubnetId) is available; otherwise, an error will be reported.

Common reasons why an availability zone or subnet is unavailable include stock-out of CVM instances or CBS cloud disks in the availability zone, insufficient quota in the availability zone, or insufficient IPs in the subnet.
If an availability zone or subnet in Zones/SubnetIds does not exist, a verification error will be reported regardless of the value of ZonesCheckPolicy.
     */
    public String getZonesCheckPolicy() {
        return this.ZonesCheckPolicy;
    }

    /**
     * Set Availability zone verification policy. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will succeed only if all availability zones (Zone) or subnets (SubnetId) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any availability zone (Zone) or subnet (SubnetId) is available; otherwise, an error will be reported.

Common reasons why an availability zone or subnet is unavailable include stock-out of CVM instances or CBS cloud disks in the availability zone, insufficient quota in the availability zone, or insufficient IPs in the subnet.
If an availability zone or subnet in Zones/SubnetIds does not exist, a verification error will be reported regardless of the value of ZonesCheckPolicy.
     * @param ZonesCheckPolicy Availability zone verification policy. Value range: ALL, ANY. Default value: ANY.
<br><li> ALL: The verification will succeed only if all availability zones (Zone) or subnets (SubnetId) are available; otherwise, an error will be reported.
<br><li> ANY: The verification will success if any availability zone (Zone) or subnet (SubnetId) is available; otherwise, an error will be reported.

Common reasons why an availability zone or subnet is unavailable include stock-out of CVM instances or CBS cloud disks in the availability zone, insufficient quota in the availability zone, or insufficient IPs in the subnet.
If an availability zone or subnet in Zones/SubnetIds does not exist, a verification error will be reported regardless of the value of ZonesCheckPolicy.
     */
    public void setZonesCheckPolicy(String ZonesCheckPolicy) {
        this.ZonesCheckPolicy = ZonesCheckPolicy;
    }

    /**
     * Get List of tag descriptions. In this parameter, you can specify the tags to be bound with a scaling group as well as corresponding resource instances. Each scaling group can have up to 30 tags. 
     * @return Tags List of tag descriptions. In this parameter, you can specify the tags to be bound with a scaling group as well as corresponding resource instances. Each scaling group can have up to 30 tags.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tag descriptions. In this parameter, you can specify the tags to be bound with a scaling group as well as corresponding resource instances. Each scaling group can have up to 30 tags.
     * @param Tags List of tag descriptions. In this parameter, you can specify the tags to be bound with a scaling group as well as corresponding resource instances. Each scaling group can have up to 30 tags.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Service settings such as unhealthy instance replacement. 
     * @return ServiceSettings Service settings such as unhealthy instance replacement.
     */
    public ServiceSettings getServiceSettings() {
        return this.ServiceSettings;
    }

    /**
     * Set Service settings such as unhealthy instance replacement.
     * @param ServiceSettings Service settings such as unhealthy instance replacement.
     */
    public void setServiceSettings(ServiceSettings ServiceSettings) {
        this.ServiceSettings = ServiceSettings;
    }

    /**
     * Get The number of IPv6 addresses that an instance has. Valid values: 0 and 1. Default value: 0. 
     * @return Ipv6AddressCount The number of IPv6 addresses that an instance has. Valid values: 0 and 1. Default value: 0.
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set The number of IPv6 addresses that an instance has. Valid values: 0 and 1. Default value: 0.
     * @param Ipv6AddressCount The number of IPv6 addresses that an instance has. Valid values: 0 and 1. Default value: 0.
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get Multi-availability zone/subnet policy. Valid values: PRIORITY and EQUALITY. Default value: PRIORITY.
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li>EQUALITY: instances created for scale-out are distributed to multiple availability zones/subnets, so as to keep the number of instances in different availability zone/subnet in balance.

Notes: 
<br><li> When the scaling group is based on the classic network, this policy applies to multiple availability zones. When the scaling group is based on a VPC, this policy applies to multiple subnets, and you do not need to consider availability zones. For example, if you have four subnets (A, B, C, and D) and A, B, and C are in availability zone 1 and D is in availability zone 2, you only need to decide the order of the four subnets, without worrying about the issue of availability zones.
<br><li> This policy is applicable to multiple availability zones/subnets, but is not applicable to multiple models with launch configurations. Specify the models according to the model priority.
<br><li> When creating instances based on the PRIORITY policy, apply the multi-model policy and then apply the multi-availability zones/subnet policy. For example, if you have models A and B and subnets 1, 2, and 3, creation will be attempted in the following order: A1, A2, A3, B1, B2, and B3. If A1 is sold out, A2 (not B1) is tried next. 
     * @return MultiZoneSubnetPolicy Multi-availability zone/subnet policy. Valid values: PRIORITY and EQUALITY. Default value: PRIORITY.
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li>EQUALITY: instances created for scale-out are distributed to multiple availability zones/subnets, so as to keep the number of instances in different availability zone/subnet in balance.

Notes: 
<br><li> When the scaling group is based on the classic network, this policy applies to multiple availability zones. When the scaling group is based on a VPC, this policy applies to multiple subnets, and you do not need to consider availability zones. For example, if you have four subnets (A, B, C, and D) and A, B, and C are in availability zone 1 and D is in availability zone 2, you only need to decide the order of the four subnets, without worrying about the issue of availability zones.
<br><li> This policy is applicable to multiple availability zones/subnets, but is not applicable to multiple models with launch configurations. Specify the models according to the model priority.
<br><li> When creating instances based on the PRIORITY policy, apply the multi-model policy and then apply the multi-availability zones/subnet policy. For example, if you have models A and B and subnets 1, 2, and 3, creation will be attempted in the following order: A1, A2, A3, B1, B2, and B3. If A1 is sold out, A2 (not B1) is tried next.
     */
    public String getMultiZoneSubnetPolicy() {
        return this.MultiZoneSubnetPolicy;
    }

    /**
     * Set Multi-availability zone/subnet policy. Valid values: PRIORITY and EQUALITY. Default value: PRIORITY.
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li>EQUALITY: instances created for scale-out are distributed to multiple availability zones/subnets, so as to keep the number of instances in different availability zone/subnet in balance.

Notes: 
<br><li> When the scaling group is based on the classic network, this policy applies to multiple availability zones. When the scaling group is based on a VPC, this policy applies to multiple subnets, and you do not need to consider availability zones. For example, if you have four subnets (A, B, C, and D) and A, B, and C are in availability zone 1 and D is in availability zone 2, you only need to decide the order of the four subnets, without worrying about the issue of availability zones.
<br><li> This policy is applicable to multiple availability zones/subnets, but is not applicable to multiple models with launch configurations. Specify the models according to the model priority.
<br><li> When creating instances based on the PRIORITY policy, apply the multi-model policy and then apply the multi-availability zones/subnet policy. For example, if you have models A and B and subnets 1, 2, and 3, creation will be attempted in the following order: A1, A2, A3, B1, B2, and B3. If A1 is sold out, A2 (not B1) is tried next.
     * @param MultiZoneSubnetPolicy Multi-availability zone/subnet policy. Valid values: PRIORITY and EQUALITY. Default value: PRIORITY.
<br><li> PRIORITY: when creating instances, choose the availability zone/subnet based on the order in the list from top to bottom. If the first instance is successfully created in the availability zone/subnet of the highest priority, all instances will be created in this availability zone/subnet.
<br><li>EQUALITY: instances created for scale-out are distributed to multiple availability zones/subnets, so as to keep the number of instances in different availability zone/subnet in balance.

Notes: 
<br><li> When the scaling group is based on the classic network, this policy applies to multiple availability zones. When the scaling group is based on a VPC, this policy applies to multiple subnets, and you do not need to consider availability zones. For example, if you have four subnets (A, B, C, and D) and A, B, and C are in availability zone 1 and D is in availability zone 2, you only need to decide the order of the four subnets, without worrying about the issue of availability zones.
<br><li> This policy is applicable to multiple availability zones/subnets, but is not applicable to multiple models with launch configurations. Specify the models according to the model priority.
<br><li> When creating instances based on the PRIORITY policy, apply the multi-model policy and then apply the multi-availability zones/subnet policy. For example, if you have models A and B and subnets 1, 2, and 3, creation will be attempted in the following order: A1, A2, A3, B1, B2, and B3. If A1 is sold out, A2 (not B1) is tried next.
     */
    public void setMultiZoneSubnetPolicy(String MultiZoneSubnetPolicy) {
        this.MultiZoneSubnetPolicy = MultiZoneSubnetPolicy;
    }

    /**
     * Get Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).<br>If the parameter is set to `CLB`, the scaling group will check both the network status and the CLB health check status. If the network check indicates unhealthy, the `HealthStatus` field will return `UNHEALTHY`. If the CLB health check indicates unhealthy, the `HealthStatus` field will return `CLB_UNHEALTHY`. If both checks indicate unhealthy, the `HealthStatus` field will return `UNHEALTHY|CLB_UNHEALTHY`. Default value: `CLB`. 
     * @return HealthCheckType Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).<br>If the parameter is set to `CLB`, the scaling group will check both the network status and the CLB health check status. If the network check indicates unhealthy, the `HealthStatus` field will return `UNHEALTHY`. If the CLB health check indicates unhealthy, the `HealthStatus` field will return `CLB_UNHEALTHY`. If both checks indicate unhealthy, the `HealthStatus` field will return `UNHEALTHY|CLB_UNHEALTHY`. Default value: `CLB`.
     */
    public String getHealthCheckType() {
        return this.HealthCheckType;
    }

    /**
     * Set Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).<br>If the parameter is set to `CLB`, the scaling group will check both the network status and the CLB health check status. If the network check indicates unhealthy, the `HealthStatus` field will return `UNHEALTHY`. If the CLB health check indicates unhealthy, the `HealthStatus` field will return `CLB_UNHEALTHY`. If both checks indicate unhealthy, the `HealthStatus` field will return `UNHEALTHY|CLB_UNHEALTHY`. Default value: `CLB`.
     * @param HealthCheckType Health check type of instances in a scaling group.<br><li>CVM: confirm whether an instance is healthy based on the network status. If the pinged instance is unreachable, the instance will be considered unhealthy. For more information, see [Instance Health Check](https://intl.cloud.tencent.com/document/product/377/8553?from_cn_redirect=1)<br><li>CLB: confirm whether an instance is healthy based on the CLB health check status. For more information, see [Health Check Overview](https://intl.cloud.tencent.com/document/product/214/6097?from_cn_redirect=1).<br>If the parameter is set to `CLB`, the scaling group will check both the network status and the CLB health check status. If the network check indicates unhealthy, the `HealthStatus` field will return `UNHEALTHY`. If the CLB health check indicates unhealthy, the `HealthStatus` field will return `CLB_UNHEALTHY`. If both checks indicate unhealthy, the `HealthStatus` field will return `UNHEALTHY|CLB_UNHEALTHY`. Default value: `CLB`.
     */
    public void setHealthCheckType(String HealthCheckType) {
        this.HealthCheckType = HealthCheckType;
    }

    /**
     * Get Grace period of the CLB health check during which the `IN_SERVICE` instances added will not be marked as `CLB_UNHEALTHY`.<br>Valid range: 0-7200, in seconds. Default value: `0`. 
     * @return LoadBalancerHealthCheckGracePeriod Grace period of the CLB health check during which the `IN_SERVICE` instances added will not be marked as `CLB_UNHEALTHY`.<br>Valid range: 0-7200, in seconds. Default value: `0`.
     */
    public Long getLoadBalancerHealthCheckGracePeriod() {
        return this.LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Set Grace period of the CLB health check during which the `IN_SERVICE` instances added will not be marked as `CLB_UNHEALTHY`.<br>Valid range: 0-7200, in seconds. Default value: `0`.
     * @param LoadBalancerHealthCheckGracePeriod Grace period of the CLB health check during which the `IN_SERVICE` instances added will not be marked as `CLB_UNHEALTHY`.<br>Valid range: 0-7200, in seconds. Default value: `0`.
     */
    public void setLoadBalancerHealthCheckGracePeriod(Long LoadBalancerHealthCheckGracePeriod) {
        this.LoadBalancerHealthCheckGracePeriod = LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Get Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`; default value: `LAUNCH_CONFIGURATION`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used. 
     * @return InstanceAllocationPolicy Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`; default value: `LAUNCH_CONFIGURATION`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used.
     */
    public String getInstanceAllocationPolicy() {
        return this.InstanceAllocationPolicy;
    }

    /**
     * Set Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`; default value: `LAUNCH_CONFIGURATION`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used.
     * @param InstanceAllocationPolicy Specifies how to assign instances. Valid values: `LAUNCH_CONFIGURATION` and `SPOT_MIXED`; default value: `LAUNCH_CONFIGURATION`.
<br><li>`LAUNCH_CONFIGURATION`: the launch configuration mode.
<br><li>`SPOT_MIXED`: a mixed instance mode. Currently, this mode is supported only when the launch configuration takes the pay-as-you-go billing mode. With this mode, the scaling group can provision a combination of pay-as-you-go instances and spot instances to meet the configured capacity. Note that the billing mode of the associated launch configuration cannot be modified when this mode is used.
     */
    public void setInstanceAllocationPolicy(String InstanceAllocationPolicy) {
        this.InstanceAllocationPolicy = InstanceAllocationPolicy;
    }

    /**
     * Get Specifies how to assign pay-as-you-go instances and spot instances.
This parameter is valid only when `InstanceAllocationPolicy ` is set to `SPOT_MIXED`. 
     * @return SpotMixedAllocationPolicy Specifies how to assign pay-as-you-go instances and spot instances.
This parameter is valid only when `InstanceAllocationPolicy ` is set to `SPOT_MIXED`.
     */
    public SpotMixedAllocationPolicy getSpotMixedAllocationPolicy() {
        return this.SpotMixedAllocationPolicy;
    }

    /**
     * Set Specifies how to assign pay-as-you-go instances and spot instances.
This parameter is valid only when `InstanceAllocationPolicy ` is set to `SPOT_MIXED`.
     * @param SpotMixedAllocationPolicy Specifies how to assign pay-as-you-go instances and spot instances.
This parameter is valid only when `InstanceAllocationPolicy ` is set to `SPOT_MIXED`.
     */
    public void setSpotMixedAllocationPolicy(SpotMixedAllocationPolicy SpotMixedAllocationPolicy) {
        this.SpotMixedAllocationPolicy = SpotMixedAllocationPolicy;
    }

    /**
     * Get Indicates whether the capacity re-balancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. In this case, AS will add instances to meet the desired capacity only after the spot instances are terminated.

Default value: `False`. 
     * @return CapacityRebalance Indicates whether the capacity re-balancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. In this case, AS will add instances to meet the desired capacity only after the spot instances are terminated.

Default value: `False`.
     */
    public Boolean getCapacityRebalance() {
        return this.CapacityRebalance;
    }

    /**
     * Set Indicates whether the capacity re-balancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. In this case, AS will add instances to meet the desired capacity only after the spot instances are terminated.

Default value: `False`.
     * @param CapacityRebalance Indicates whether the capacity re-balancing feature is enabled. This parameter is only valid for spot instances in the scaling group. Valid values:
<br><li>`TRUE`: yes. Before the spot instances in the scaling group are about to be automatically repossessed, AS will terminate them. The scale-in hook (if configured) will take effect before the termination. After the termination process starts, AS will asynchronously initiate a scaling activity to meet the desired capacity.
<br><li>`FALSE`: no. In this case, AS will add instances to meet the desired capacity only after the spot instances are terminated.

Default value: `False`.
     */
    public void setCapacityRebalance(Boolean CapacityRebalance) {
        this.CapacityRebalance = CapacityRebalance;
    }

    public CreateAutoScalingGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoScalingGroupRequest(CreateAutoScalingGroupRequest source) {
        if (source.AutoScalingGroupName != null) {
            this.AutoScalingGroupName = new String(source.AutoScalingGroupName);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.DefaultCooldown != null) {
            this.DefaultCooldown = new Long(source.DefaultCooldown);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ForwardLoadBalancers != null) {
            this.ForwardLoadBalancers = new ForwardLoadBalancer[source.ForwardLoadBalancers.length];
            for (int i = 0; i < source.ForwardLoadBalancers.length; i++) {
                this.ForwardLoadBalancers[i] = new ForwardLoadBalancer(source.ForwardLoadBalancers[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.TerminationPolicies != null) {
            this.TerminationPolicies = new String[source.TerminationPolicies.length];
            for (int i = 0; i < source.TerminationPolicies.length; i++) {
                this.TerminationPolicies[i] = new String(source.TerminationPolicies[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new String(source.RetryPolicy);
        }
        if (source.ZonesCheckPolicy != null) {
            this.ZonesCheckPolicy = new String(source.ZonesCheckPolicy);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancers.", this.ForwardLoadBalancers);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "TerminationPolicies.", this.TerminationPolicies);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "ZonesCheckPolicy", this.ZonesCheckPolicy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ServiceSettings.", this.ServiceSettings);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamSimple(map, prefix + "MultiZoneSubnetPolicy", this.MultiZoneSubnetPolicy);
        this.setParamSimple(map, prefix + "HealthCheckType", this.HealthCheckType);
        this.setParamSimple(map, prefix + "LoadBalancerHealthCheckGracePeriod", this.LoadBalancerHealthCheckGracePeriod);
        this.setParamSimple(map, prefix + "InstanceAllocationPolicy", this.InstanceAllocationPolicy);
        this.setParamObj(map, prefix + "SpotMixedAllocationPolicy.", this.SpotMixedAllocationPolicy);
        this.setParamSimple(map, prefix + "CapacityRebalance", this.CapacityRebalance);

    }
}

