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

public class ModifyAutoScalingGroupRequest extends AbstractModel {

    /**
    * <p>Scaling group ID. obtain available scaling group ids in the following ways:</p><li>query scaling group ids by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li><li>obtain scaling group ids by calling the <a href="https://www.tencentcloud.comom/document/api/377/20438?from_cn_redirect=1">DescribeAutoScalingGroups</a> api and retrieving AutoScalingGroupId from the returned information.</li>.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * <p>The scaling group name must be unique in your account. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 55 bytes.</p>.
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * <P>Default cooldown in seconds, value ranges from 0 to 3600, default value is 300.</p>.
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Long DefaultCooldown;

    /**
    * <P>Expected number of instances. value range [0,2000]. to meet the maximum value equal to or greater than the expected value, and the expected value equal to or greater than the minimum value.</p>.
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * <p>Launch configuration ID. obtain available launch configuration ids in the following ways:</p><li>query the launch configuration ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a>.</li><li>obtain the launch configuration ID by calling the <a href="https://www.tencentcloud.comom/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> api and retrieving the LaunchConfigurationId from the returned information.</li>.
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * <P>Maximum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <P>Minimum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * <p>Project ID. obtain this parameter by calling the `ProjectId` field in the return value of <a href="https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1">DescribeProject</a>. default value is 0, indicating usage of the default project.</p>.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>subnet ID list. valid vpc subnet ids can be obtained by logging in to the <a href="https://console.cloud.tencent.com/vpc/subnet">console</a> for querying. you can also call the API <a href="https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> and retrieve them from the SubnetId field in the API response.</p>.
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>Termination policy, whose maximum length is currently 1. valid values: OLDEST_INSTANCE and NEWEST_INSTANCE.</p><li> OLDEST_INSTANCE terminates the OLDEST INSTANCE in the scaling group first.</li><li> NEWEST_INSTANCE terminates the NEWEST INSTANCE in the scaling group first.</li>.
    */
    @SerializedName("TerminationPolicies")
    @Expose
    private String [] TerminationPolicies;

    /**
    * <p>vpc ID. when modifying the vpc, you need to change the SubnetIds parameter to the subnet of this vpc. effective VpcId can be queried by logging in to the <a href="https://console.cloud.tencent.com/vpc/vpc">console</a>; you can also call the <a href="https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1">DescribeVpc</a> api and get the VpcId field from the api response.</p>.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <P>AZ list</p>.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>RETRY policy, whose valid values include IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY, with the default value being IMMEDIATE_RETRY. a partially successful scaling operation is considered a failed activity.</p><li>IMMEDIATE_RETRY: RETRY immediately, attempting retries in rapid succession over a short period, and cease further retries after a certain number of consecutive failures (5 times).</li><li>INCREMENTAL_INTERVALS: INCREMENTAL interval RETRY, with the RETRY interval gradually increasing as the number of consecutive failures rises, ranging from seconds to 1 day.</li><li>NO_RETRY: NO RETRY until a user call or Alarm information is received again.</li>.
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * <p>Availability Zone validation policy. valid values include ALL and ANY. default value: ANY. it is effective when scaling group actual change resource-related fields (launch configuration, az, subnet) are modified.</p><li> ALL: verification passes if ALL azs (Zone) or subnets (SubnetId) are available. otherwise, a verification error will be reported.</li><li> ANY: verification passes if ANY AZ (Zone) or subnet (SubnetId) is available. otherwise, a verification error will be reported.</li><p>common causes for unavailable azs or subnets include CVM instancetype sold out in the az, CBS cloud disk sold out in the az, insufficient quota in the az, or insufficient IP addresses in the subnet.</p><p>if Zones/SubnetIds contain nonexistent azs or subnets, a verification error will be reported regardless of the values of ZonesCheckPolicy.</p>.
    */
    @SerializedName("ZonesCheckPolicy")
    @Expose
    private String ZonesCheckPolicy;

    /**
    * <P>Service settings, including cloud monitoring and unhealthy instance replacement.</p>.
    */
    @SerializedName("ServiceSettings")
    @Expose
    private ServiceSettings ServiceSettings;

    /**
    * <p>The instance has a configuration for the number of IPv6 addresses. valid values include 0 and 1. the default value is 0, which means the instance does not allocate an IPv6 address. you need to use a VPC that supports IPv6 and enable IPv6 CIDR in the subnet.</p>
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * <p>The multi-az/subnet policy, with values including PRIORITY and EQUALITY, defaults to PRIORITY.</p><li> PRIORITY: attempt to create instances taking the order of the az/subnet list as the PRIORITY. if instances can be successfully created in the az/subnet with the highest PRIORITY, they will always be created there.</li> <li> EQUALITY: instances added through scale-out will be distributed across multiple azs/subnets to ensure A relatively balanced number of instances in each az/subnet after expansion.</li> <p>points to consider:</p><li> when the scaling group is based on A classic network, this policy applies to multi-az. when the scaling group is based on A VPC network, this policy applies to multi-subnet, no longer considering AZ factors. for example, with four subnets labeled A, B, c, and D, where A, B, and c are in availability zone 1 and D is in availability zone 2, consider subnets A, B, c, and D for sorting, without considering availability zones 1 and 2.</li> <li> this policy applies to multi-az/subnet but is not applicable to the instancetypes parameter of the launch configuration. selection of multiple models is according to PRIORITY policy.</li> <li> when creating instances according to the PRIORITY policy, ensure the policy for multiple models first, then the policy for multi-az/subnet. for example, with multiple models A and B, and multiple subnets 1, 2, and 3, attempts will be made in the order A1, A2, A3, B1, B2, B3. if A1 is sold out, A2 will be attempted (not B1).</li>.
    */
    @SerializedName("MultiZoneSubnetPolicy")
    @Expose
    private String MultiZoneSubnetPolicy;

    /**
    * <p>Scaling group instance health check type, values are as follows:</p><li>CVM: determine whether an instance is unhealthy based on its network status. an unhealthy network status refers to an event where instances become unreachable via PING. for detailed criteria of judgment, refer to [instance health check](https://www.tencentcloud.comom/document/product/377/8553?from_cn_redirect=1).</li><li>CLB: determine whether an instance is unhealthy based on the health check status of CLB. for the principle of CLB health check, see [health check](https://www.tencentcloud.comom/document/product/214/6097?from_cn_redirect=1).</li>.
    */
    @SerializedName("HealthCheckType")
    @Expose
    private String HealthCheckType;

    /**
    * <p>Specifies the CLB health check grace period in seconds.</p><p>value range: [0, 7200].</p><p>default value: 0.</p>
    */
    @SerializedName("LoadBalancerHealthCheckGracePeriod")
    @Expose
    private Long LoadBalancerHealthCheckGracePeriod;

    /**
    * <p>Instance allocation policy. valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.</p><li> LAUNCH_CONFIGURATION represents the traditional startup CONFIGURATION mode.</li><li> SPOT_MIXED represents the SPOT hybrid mode. currently only support hybrid mode when the LAUNCH CONFIGURATION uses pay-as-you-go billing mode. in hybrid mode, the scaling group will scale out based on the SPOT model. the billing type of the associated LAUNCH CONFIGURATION cannot be modified when using hybrid mode.</li>.
    */
    @SerializedName("InstanceAllocationPolicy")
    @Expose
    private String InstanceAllocationPolicy;

    /**
    * <p>Allocation policy of instances for each billing type in SPOT hybrid mode.<br>available only when InstanceAllocationPolicy is set to SPOT_MIXED.</p>.
    */
    @SerializedName("SpotMixedAllocationPolicy")
    @Expose
    private SpotMixedAllocationPolicy SpotMixedAllocationPolicy;

    /**
    * <p>The capacity rebalancing feature is only applicable to spot instances within the scaling group. valid values:</p><li> TRUE: enable this feature. when spot instances within the scaling group are about to be automatically recycled by the spot instance service, AS initiates the termination process of spot instances. if a scale-in hook is configured, trigger before termination. after the termination process starts, AS asynchronously initiates scale-out to reach the expected number of instances.</li> <li> FALSE: disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>.
    */
    @SerializedName("CapacityRebalance")
    @Expose
    private Boolean CapacityRebalance;

    /**
    * <P>Instance name sequencing settings. once enabled, append incremental numeric sequence to the names of instances automatically created within the scaling group.</p>.
    */
    @SerializedName("InstanceNameIndexSettings")
    @Expose
    private InstanceNameIndexSettings InstanceNameIndexSettings;

    /**
    * <P>Instance hostname sequencing settings. once enabled, append incremental numeric sequence to the hostname of instances automatically created within the scaling group.</p>.
    */
    @SerializedName("HostNameIndexSettings")
    @Expose
    private HostNameIndexSettings HostNameIndexSettings;

    /**
    * <p>The concurrent scaling up functionality for matching expected numbers cannot be set when InstanceAllocationPolicy is in spot hybrid mode or when ScalingMode is in the scaling-prioritized startup mode. currently only two matching expected number scale-out activities are supported to run concurrently. other types of activities such as specified quantity scale-out or scale-in cannot be specified. set to FALSE indicates disabled.</p>.
    */
    @SerializedName("ConcurrentScaleOutForDesiredCapacity")
    @Expose
    private Boolean ConcurrentScaleOutForDesiredCapacity;

    /**
     * Get <p>Scaling group ID. obtain available scaling group ids in the following ways:</p><li>query scaling group ids by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li><li>obtain scaling group ids by calling the <a href="https://www.tencentcloud.comom/document/api/377/20438?from_cn_redirect=1">DescribeAutoScalingGroups</a> api and retrieving AutoScalingGroupId from the returned information.</li>. 
     * @return AutoScalingGroupId <p>Scaling group ID. obtain available scaling group ids in the following ways:</p><li>query scaling group ids by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li><li>obtain scaling group ids by calling the <a href="https://www.tencentcloud.comom/document/api/377/20438?from_cn_redirect=1">DescribeAutoScalingGroups</a> api and retrieving AutoScalingGroupId from the returned information.</li>.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set <p>Scaling group ID. obtain available scaling group ids in the following ways:</p><li>query scaling group ids by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li><li>obtain scaling group ids by calling the <a href="https://www.tencentcloud.comom/document/api/377/20438?from_cn_redirect=1">DescribeAutoScalingGroups</a> api and retrieving AutoScalingGroupId from the returned information.</li>.
     * @param AutoScalingGroupId <p>Scaling group ID. obtain available scaling group ids in the following ways:</p><li>query scaling group ids by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/group">console</a>.</li><li>obtain scaling group ids by calling the <a href="https://www.tencentcloud.comom/document/api/377/20438?from_cn_redirect=1">DescribeAutoScalingGroups</a> api and retrieving AutoScalingGroupId from the returned information.</li>.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get <p>The scaling group name must be unique in your account. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 55 bytes.</p>. 
     * @return AutoScalingGroupName <p>The scaling group name must be unique in your account. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 55 bytes.</p>.
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set <p>The scaling group name must be unique in your account. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 55 bytes.</p>.
     * @param AutoScalingGroupName <p>The scaling group name must be unique in your account. name only supports chinese, english, digits, underscore, separator "-", and decimal point. the maximum length cannot exceed 55 bytes.</p>.
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get <P>Default cooldown in seconds, value ranges from 0 to 3600, default value is 300.</p>. 
     * @return DefaultCooldown <P>Default cooldown in seconds, value ranges from 0 to 3600, default value is 300.</p>.
     */
    public Long getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Set <P>Default cooldown in seconds, value ranges from 0 to 3600, default value is 300.</p>.
     * @param DefaultCooldown <P>Default cooldown in seconds, value ranges from 0 to 3600, default value is 300.</p>.
     */
    public void setDefaultCooldown(Long DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Get <P>Expected number of instances. value range [0,2000]. to meet the maximum value equal to or greater than the expected value, and the expected value equal to or greater than the minimum value.</p>. 
     * @return DesiredCapacity <P>Expected number of instances. value range [0,2000]. to meet the maximum value equal to or greater than the expected value, and the expected value equal to or greater than the minimum value.</p>.
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set <P>Expected number of instances. value range [0,2000]. to meet the maximum value equal to or greater than the expected value, and the expected value equal to or greater than the minimum value.</p>.
     * @param DesiredCapacity <P>Expected number of instances. value range [0,2000]. to meet the maximum value equal to or greater than the expected value, and the expected value equal to or greater than the minimum value.</p>.
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get <p>Launch configuration ID. obtain available launch configuration ids in the following ways:</p><li>query the launch configuration ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a>.</li><li>obtain the launch configuration ID by calling the <a href="https://www.tencentcloud.comom/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> api and retrieving the LaunchConfigurationId from the returned information.</li>. 
     * @return LaunchConfigurationId <p>Launch configuration ID. obtain available launch configuration ids in the following ways:</p><li>query the launch configuration ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a>.</li><li>obtain the launch configuration ID by calling the <a href="https://www.tencentcloud.comom/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> api and retrieving the LaunchConfigurationId from the returned information.</li>.
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set <p>Launch configuration ID. obtain available launch configuration ids in the following ways:</p><li>query the launch configuration ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a>.</li><li>obtain the launch configuration ID by calling the <a href="https://www.tencentcloud.comom/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> api and retrieving the LaunchConfigurationId from the returned information.</li>.
     * @param LaunchConfigurationId <p>Launch configuration ID. obtain available launch configuration ids in the following ways:</p><li>query the launch configuration ID by logging in to the <a href="https://console.cloud.tencent.com/autoscaling/config">console</a>.</li><li>obtain the launch configuration ID by calling the <a href="https://www.tencentcloud.comom/document/api/377/20445?from_cn_redirect=1">DescribeLaunchConfigurations</a> api and retrieving the LaunchConfigurationId from the returned information.</li>.
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get <P>Maximum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>. 
     * @return MaxSize <P>Maximum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <P>Maximum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>.
     * @param MaxSize <P>Maximum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <P>Minimum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>. 
     * @return MinSize <P>Minimum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set <P>Minimum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>.
     * @param MinSize <P>Minimum number of instances. value range: [0,2000]. to meet the requirement, the maximum value must be equal to or greater than the expected value, and the expected value must be equal to or greater than the minimum value.</p>.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get <p>Project ID. obtain this parameter by calling the `ProjectId` field in the return value of <a href="https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1">DescribeProject</a>. default value is 0, indicating usage of the default project.</p>. 
     * @return ProjectId <p>Project ID. obtain this parameter by calling the `ProjectId` field in the return value of <a href="https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1">DescribeProject</a>. default value is 0, indicating usage of the default project.</p>.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID. obtain this parameter by calling the `ProjectId` field in the return value of <a href="https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1">DescribeProject</a>. default value is 0, indicating usage of the default project.</p>.
     * @param ProjectId <p>Project ID. obtain this parameter by calling the `ProjectId` field in the return value of <a href="https://www.tencentcloud.comom/document/api/651/78725?from_cn_redirect=1">DescribeProject</a>. default value is 0, indicating usage of the default project.</p>.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>subnet ID list. valid vpc subnet ids can be obtained by logging in to the <a href="https://console.cloud.tencent.com/vpc/subnet">console</a> for querying. you can also call the API <a href="https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> and retrieve them from the SubnetId field in the API response.</p>. 
     * @return SubnetIds <p>subnet ID list. valid vpc subnet ids can be obtained by logging in to the <a href="https://console.cloud.tencent.com/vpc/subnet">console</a> for querying. you can also call the API <a href="https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> and retrieve them from the SubnetId field in the API response.</p>.
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>subnet ID list. valid vpc subnet ids can be obtained by logging in to the <a href="https://console.cloud.tencent.com/vpc/subnet">console</a> for querying. you can also call the API <a href="https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> and retrieve them from the SubnetId field in the API response.</p>.
     * @param SubnetIds <p>subnet ID list. valid vpc subnet ids can be obtained by logging in to the <a href="https://console.cloud.tencent.com/vpc/subnet">console</a> for querying. you can also call the API <a href="https://www.tencentcloud.comom/document/product/215/15784?from_cn_redirect=1">DescribeSubnets</a> and retrieve them from the SubnetId field in the API response.</p>.
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>Termination policy, whose maximum length is currently 1. valid values: OLDEST_INSTANCE and NEWEST_INSTANCE.</p><li> OLDEST_INSTANCE terminates the OLDEST INSTANCE in the scaling group first.</li><li> NEWEST_INSTANCE terminates the NEWEST INSTANCE in the scaling group first.</li>. 
     * @return TerminationPolicies <p>Termination policy, whose maximum length is currently 1. valid values: OLDEST_INSTANCE and NEWEST_INSTANCE.</p><li> OLDEST_INSTANCE terminates the OLDEST INSTANCE in the scaling group first.</li><li> NEWEST_INSTANCE terminates the NEWEST INSTANCE in the scaling group first.</li>.
     */
    public String [] getTerminationPolicies() {
        return this.TerminationPolicies;
    }

    /**
     * Set <p>Termination policy, whose maximum length is currently 1. valid values: OLDEST_INSTANCE and NEWEST_INSTANCE.</p><li> OLDEST_INSTANCE terminates the OLDEST INSTANCE in the scaling group first.</li><li> NEWEST_INSTANCE terminates the NEWEST INSTANCE in the scaling group first.</li>.
     * @param TerminationPolicies <p>Termination policy, whose maximum length is currently 1. valid values: OLDEST_INSTANCE and NEWEST_INSTANCE.</p><li> OLDEST_INSTANCE terminates the OLDEST INSTANCE in the scaling group first.</li><li> NEWEST_INSTANCE terminates the NEWEST INSTANCE in the scaling group first.</li>.
     */
    public void setTerminationPolicies(String [] TerminationPolicies) {
        this.TerminationPolicies = TerminationPolicies;
    }

    /**
     * Get <p>vpc ID. when modifying the vpc, you need to change the SubnetIds parameter to the subnet of this vpc. effective VpcId can be queried by logging in to the <a href="https://console.cloud.tencent.com/vpc/vpc">console</a>; you can also call the <a href="https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1">DescribeVpc</a> api and get the VpcId field from the api response.</p>. 
     * @return VpcId <p>vpc ID. when modifying the vpc, you need to change the SubnetIds parameter to the subnet of this vpc. effective VpcId can be queried by logging in to the <a href="https://console.cloud.tencent.com/vpc/vpc">console</a>; you can also call the <a href="https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1">DescribeVpc</a> api and get the VpcId field from the api response.</p>.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc ID. when modifying the vpc, you need to change the SubnetIds parameter to the subnet of this vpc. effective VpcId can be queried by logging in to the <a href="https://console.cloud.tencent.com/vpc/vpc">console</a>; you can also call the <a href="https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1">DescribeVpc</a> api and get the VpcId field from the api response.</p>.
     * @param VpcId <p>vpc ID. when modifying the vpc, you need to change the SubnetIds parameter to the subnet of this vpc. effective VpcId can be queried by logging in to the <a href="https://console.cloud.tencent.com/vpc/vpc">console</a>; you can also call the <a href="https://www.tencentcloud.comom/document/api/215/15778?from_cn_redirect=1">DescribeVpc</a> api and get the VpcId field from the api response.</p>.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <P>AZ list</p>. 
     * @return Zones <P>AZ list</p>.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <P>AZ list</p>.
     * @param Zones <P>AZ list</p>.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>RETRY policy, whose valid values include IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY, with the default value being IMMEDIATE_RETRY. a partially successful scaling operation is considered a failed activity.</p><li>IMMEDIATE_RETRY: RETRY immediately, attempting retries in rapid succession over a short period, and cease further retries after a certain number of consecutive failures (5 times).</li><li>INCREMENTAL_INTERVALS: INCREMENTAL interval RETRY, with the RETRY interval gradually increasing as the number of consecutive failures rises, ranging from seconds to 1 day.</li><li>NO_RETRY: NO RETRY until a user call or Alarm information is received again.</li>. 
     * @return RetryPolicy <p>RETRY policy, whose valid values include IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY, with the default value being IMMEDIATE_RETRY. a partially successful scaling operation is considered a failed activity.</p><li>IMMEDIATE_RETRY: RETRY immediately, attempting retries in rapid succession over a short period, and cease further retries after a certain number of consecutive failures (5 times).</li><li>INCREMENTAL_INTERVALS: INCREMENTAL interval RETRY, with the RETRY interval gradually increasing as the number of consecutive failures rises, ranging from seconds to 1 day.</li><li>NO_RETRY: NO RETRY until a user call or Alarm information is received again.</li>.
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set <p>RETRY policy, whose valid values include IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY, with the default value being IMMEDIATE_RETRY. a partially successful scaling operation is considered a failed activity.</p><li>IMMEDIATE_RETRY: RETRY immediately, attempting retries in rapid succession over a short period, and cease further retries after a certain number of consecutive failures (5 times).</li><li>INCREMENTAL_INTERVALS: INCREMENTAL interval RETRY, with the RETRY interval gradually increasing as the number of consecutive failures rises, ranging from seconds to 1 day.</li><li>NO_RETRY: NO RETRY until a user call or Alarm information is received again.</li>.
     * @param RetryPolicy <p>RETRY policy, whose valid values include IMMEDIATE_RETRY, INCREMENTAL_INTERVALS, and NO_RETRY, with the default value being IMMEDIATE_RETRY. a partially successful scaling operation is considered a failed activity.</p><li>IMMEDIATE_RETRY: RETRY immediately, attempting retries in rapid succession over a short period, and cease further retries after a certain number of consecutive failures (5 times).</li><li>INCREMENTAL_INTERVALS: INCREMENTAL interval RETRY, with the RETRY interval gradually increasing as the number of consecutive failures rises, ranging from seconds to 1 day.</li><li>NO_RETRY: NO RETRY until a user call or Alarm information is received again.</li>.
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get <p>Availability Zone validation policy. valid values include ALL and ANY. default value: ANY. it is effective when scaling group actual change resource-related fields (launch configuration, az, subnet) are modified.</p><li> ALL: verification passes if ALL azs (Zone) or subnets (SubnetId) are available. otherwise, a verification error will be reported.</li><li> ANY: verification passes if ANY AZ (Zone) or subnet (SubnetId) is available. otherwise, a verification error will be reported.</li><p>common causes for unavailable azs or subnets include CVM instancetype sold out in the az, CBS cloud disk sold out in the az, insufficient quota in the az, or insufficient IP addresses in the subnet.</p><p>if Zones/SubnetIds contain nonexistent azs or subnets, a verification error will be reported regardless of the values of ZonesCheckPolicy.</p>. 
     * @return ZonesCheckPolicy <p>Availability Zone validation policy. valid values include ALL and ANY. default value: ANY. it is effective when scaling group actual change resource-related fields (launch configuration, az, subnet) are modified.</p><li> ALL: verification passes if ALL azs (Zone) or subnets (SubnetId) are available. otherwise, a verification error will be reported.</li><li> ANY: verification passes if ANY AZ (Zone) or subnet (SubnetId) is available. otherwise, a verification error will be reported.</li><p>common causes for unavailable azs or subnets include CVM instancetype sold out in the az, CBS cloud disk sold out in the az, insufficient quota in the az, or insufficient IP addresses in the subnet.</p><p>if Zones/SubnetIds contain nonexistent azs or subnets, a verification error will be reported regardless of the values of ZonesCheckPolicy.</p>.
     */
    public String getZonesCheckPolicy() {
        return this.ZonesCheckPolicy;
    }

    /**
     * Set <p>Availability Zone validation policy. valid values include ALL and ANY. default value: ANY. it is effective when scaling group actual change resource-related fields (launch configuration, az, subnet) are modified.</p><li> ALL: verification passes if ALL azs (Zone) or subnets (SubnetId) are available. otherwise, a verification error will be reported.</li><li> ANY: verification passes if ANY AZ (Zone) or subnet (SubnetId) is available. otherwise, a verification error will be reported.</li><p>common causes for unavailable azs or subnets include CVM instancetype sold out in the az, CBS cloud disk sold out in the az, insufficient quota in the az, or insufficient IP addresses in the subnet.</p><p>if Zones/SubnetIds contain nonexistent azs or subnets, a verification error will be reported regardless of the values of ZonesCheckPolicy.</p>.
     * @param ZonesCheckPolicy <p>Availability Zone validation policy. valid values include ALL and ANY. default value: ANY. it is effective when scaling group actual change resource-related fields (launch configuration, az, subnet) are modified.</p><li> ALL: verification passes if ALL azs (Zone) or subnets (SubnetId) are available. otherwise, a verification error will be reported.</li><li> ANY: verification passes if ANY AZ (Zone) or subnet (SubnetId) is available. otherwise, a verification error will be reported.</li><p>common causes for unavailable azs or subnets include CVM instancetype sold out in the az, CBS cloud disk sold out in the az, insufficient quota in the az, or insufficient IP addresses in the subnet.</p><p>if Zones/SubnetIds contain nonexistent azs or subnets, a verification error will be reported regardless of the values of ZonesCheckPolicy.</p>.
     */
    public void setZonesCheckPolicy(String ZonesCheckPolicy) {
        this.ZonesCheckPolicy = ZonesCheckPolicy;
    }

    /**
     * Get <P>Service settings, including cloud monitoring and unhealthy instance replacement.</p>. 
     * @return ServiceSettings <P>Service settings, including cloud monitoring and unhealthy instance replacement.</p>.
     */
    public ServiceSettings getServiceSettings() {
        return this.ServiceSettings;
    }

    /**
     * Set <P>Service settings, including cloud monitoring and unhealthy instance replacement.</p>.
     * @param ServiceSettings <P>Service settings, including cloud monitoring and unhealthy instance replacement.</p>.
     */
    public void setServiceSettings(ServiceSettings ServiceSettings) {
        this.ServiceSettings = ServiceSettings;
    }

    /**
     * Get <p>The instance has a configuration for the number of IPv6 addresses. valid values include 0 and 1. the default value is 0, which means the instance does not allocate an IPv6 address. you need to use a VPC that supports IPv6 and enable IPv6 CIDR in the subnet.</p> 
     * @return Ipv6AddressCount <p>The instance has a configuration for the number of IPv6 addresses. valid values include 0 and 1. the default value is 0, which means the instance does not allocate an IPv6 address. you need to use a VPC that supports IPv6 and enable IPv6 CIDR in the subnet.</p>
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set <p>The instance has a configuration for the number of IPv6 addresses. valid values include 0 and 1. the default value is 0, which means the instance does not allocate an IPv6 address. you need to use a VPC that supports IPv6 and enable IPv6 CIDR in the subnet.</p>
     * @param Ipv6AddressCount <p>The instance has a configuration for the number of IPv6 addresses. valid values include 0 and 1. the default value is 0, which means the instance does not allocate an IPv6 address. you need to use a VPC that supports IPv6 and enable IPv6 CIDR in the subnet.</p>
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get <p>The multi-az/subnet policy, with values including PRIORITY and EQUALITY, defaults to PRIORITY.</p><li> PRIORITY: attempt to create instances taking the order of the az/subnet list as the PRIORITY. if instances can be successfully created in the az/subnet with the highest PRIORITY, they will always be created there.</li> <li> EQUALITY: instances added through scale-out will be distributed across multiple azs/subnets to ensure A relatively balanced number of instances in each az/subnet after expansion.</li> <p>points to consider:</p><li> when the scaling group is based on A classic network, this policy applies to multi-az. when the scaling group is based on A VPC network, this policy applies to multi-subnet, no longer considering AZ factors. for example, with four subnets labeled A, B, c, and D, where A, B, and c are in availability zone 1 and D is in availability zone 2, consider subnets A, B, c, and D for sorting, without considering availability zones 1 and 2.</li> <li> this policy applies to multi-az/subnet but is not applicable to the instancetypes parameter of the launch configuration. selection of multiple models is according to PRIORITY policy.</li> <li> when creating instances according to the PRIORITY policy, ensure the policy for multiple models first, then the policy for multi-az/subnet. for example, with multiple models A and B, and multiple subnets 1, 2, and 3, attempts will be made in the order A1, A2, A3, B1, B2, B3. if A1 is sold out, A2 will be attempted (not B1).</li>. 
     * @return MultiZoneSubnetPolicy <p>The multi-az/subnet policy, with values including PRIORITY and EQUALITY, defaults to PRIORITY.</p><li> PRIORITY: attempt to create instances taking the order of the az/subnet list as the PRIORITY. if instances can be successfully created in the az/subnet with the highest PRIORITY, they will always be created there.</li> <li> EQUALITY: instances added through scale-out will be distributed across multiple azs/subnets to ensure A relatively balanced number of instances in each az/subnet after expansion.</li> <p>points to consider:</p><li> when the scaling group is based on A classic network, this policy applies to multi-az. when the scaling group is based on A VPC network, this policy applies to multi-subnet, no longer considering AZ factors. for example, with four subnets labeled A, B, c, and D, where A, B, and c are in availability zone 1 and D is in availability zone 2, consider subnets A, B, c, and D for sorting, without considering availability zones 1 and 2.</li> <li> this policy applies to multi-az/subnet but is not applicable to the instancetypes parameter of the launch configuration. selection of multiple models is according to PRIORITY policy.</li> <li> when creating instances according to the PRIORITY policy, ensure the policy for multiple models first, then the policy for multi-az/subnet. for example, with multiple models A and B, and multiple subnets 1, 2, and 3, attempts will be made in the order A1, A2, A3, B1, B2, B3. if A1 is sold out, A2 will be attempted (not B1).</li>.
     */
    public String getMultiZoneSubnetPolicy() {
        return this.MultiZoneSubnetPolicy;
    }

    /**
     * Set <p>The multi-az/subnet policy, with values including PRIORITY and EQUALITY, defaults to PRIORITY.</p><li> PRIORITY: attempt to create instances taking the order of the az/subnet list as the PRIORITY. if instances can be successfully created in the az/subnet with the highest PRIORITY, they will always be created there.</li> <li> EQUALITY: instances added through scale-out will be distributed across multiple azs/subnets to ensure A relatively balanced number of instances in each az/subnet after expansion.</li> <p>points to consider:</p><li> when the scaling group is based on A classic network, this policy applies to multi-az. when the scaling group is based on A VPC network, this policy applies to multi-subnet, no longer considering AZ factors. for example, with four subnets labeled A, B, c, and D, where A, B, and c are in availability zone 1 and D is in availability zone 2, consider subnets A, B, c, and D for sorting, without considering availability zones 1 and 2.</li> <li> this policy applies to multi-az/subnet but is not applicable to the instancetypes parameter of the launch configuration. selection of multiple models is according to PRIORITY policy.</li> <li> when creating instances according to the PRIORITY policy, ensure the policy for multiple models first, then the policy for multi-az/subnet. for example, with multiple models A and B, and multiple subnets 1, 2, and 3, attempts will be made in the order A1, A2, A3, B1, B2, B3. if A1 is sold out, A2 will be attempted (not B1).</li>.
     * @param MultiZoneSubnetPolicy <p>The multi-az/subnet policy, with values including PRIORITY and EQUALITY, defaults to PRIORITY.</p><li> PRIORITY: attempt to create instances taking the order of the az/subnet list as the PRIORITY. if instances can be successfully created in the az/subnet with the highest PRIORITY, they will always be created there.</li> <li> EQUALITY: instances added through scale-out will be distributed across multiple azs/subnets to ensure A relatively balanced number of instances in each az/subnet after expansion.</li> <p>points to consider:</p><li> when the scaling group is based on A classic network, this policy applies to multi-az. when the scaling group is based on A VPC network, this policy applies to multi-subnet, no longer considering AZ factors. for example, with four subnets labeled A, B, c, and D, where A, B, and c are in availability zone 1 and D is in availability zone 2, consider subnets A, B, c, and D for sorting, without considering availability zones 1 and 2.</li> <li> this policy applies to multi-az/subnet but is not applicable to the instancetypes parameter of the launch configuration. selection of multiple models is according to PRIORITY policy.</li> <li> when creating instances according to the PRIORITY policy, ensure the policy for multiple models first, then the policy for multi-az/subnet. for example, with multiple models A and B, and multiple subnets 1, 2, and 3, attempts will be made in the order A1, A2, A3, B1, B2, B3. if A1 is sold out, A2 will be attempted (not B1).</li>.
     */
    public void setMultiZoneSubnetPolicy(String MultiZoneSubnetPolicy) {
        this.MultiZoneSubnetPolicy = MultiZoneSubnetPolicy;
    }

    /**
     * Get <p>Scaling group instance health check type, values are as follows:</p><li>CVM: determine whether an instance is unhealthy based on its network status. an unhealthy network status refers to an event where instances become unreachable via PING. for detailed criteria of judgment, refer to [instance health check](https://www.tencentcloud.comom/document/product/377/8553?from_cn_redirect=1).</li><li>CLB: determine whether an instance is unhealthy based on the health check status of CLB. for the principle of CLB health check, see [health check](https://www.tencentcloud.comom/document/product/214/6097?from_cn_redirect=1).</li>. 
     * @return HealthCheckType <p>Scaling group instance health check type, values are as follows:</p><li>CVM: determine whether an instance is unhealthy based on its network status. an unhealthy network status refers to an event where instances become unreachable via PING. for detailed criteria of judgment, refer to [instance health check](https://www.tencentcloud.comom/document/product/377/8553?from_cn_redirect=1).</li><li>CLB: determine whether an instance is unhealthy based on the health check status of CLB. for the principle of CLB health check, see [health check](https://www.tencentcloud.comom/document/product/214/6097?from_cn_redirect=1).</li>.
     */
    public String getHealthCheckType() {
        return this.HealthCheckType;
    }

    /**
     * Set <p>Scaling group instance health check type, values are as follows:</p><li>CVM: determine whether an instance is unhealthy based on its network status. an unhealthy network status refers to an event where instances become unreachable via PING. for detailed criteria of judgment, refer to [instance health check](https://www.tencentcloud.comom/document/product/377/8553?from_cn_redirect=1).</li><li>CLB: determine whether an instance is unhealthy based on the health check status of CLB. for the principle of CLB health check, see [health check](https://www.tencentcloud.comom/document/product/214/6097?from_cn_redirect=1).</li>.
     * @param HealthCheckType <p>Scaling group instance health check type, values are as follows:</p><li>CVM: determine whether an instance is unhealthy based on its network status. an unhealthy network status refers to an event where instances become unreachable via PING. for detailed criteria of judgment, refer to [instance health check](https://www.tencentcloud.comom/document/product/377/8553?from_cn_redirect=1).</li><li>CLB: determine whether an instance is unhealthy based on the health check status of CLB. for the principle of CLB health check, see [health check](https://www.tencentcloud.comom/document/product/214/6097?from_cn_redirect=1).</li>.
     */
    public void setHealthCheckType(String HealthCheckType) {
        this.HealthCheckType = HealthCheckType;
    }

    /**
     * Get <p>Specifies the CLB health check grace period in seconds.</p><p>value range: [0, 7200].</p><p>default value: 0.</p> 
     * @return LoadBalancerHealthCheckGracePeriod <p>Specifies the CLB health check grace period in seconds.</p><p>value range: [0, 7200].</p><p>default value: 0.</p>
     */
    public Long getLoadBalancerHealthCheckGracePeriod() {
        return this.LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Set <p>Specifies the CLB health check grace period in seconds.</p><p>value range: [0, 7200].</p><p>default value: 0.</p>
     * @param LoadBalancerHealthCheckGracePeriod <p>Specifies the CLB health check grace period in seconds.</p><p>value range: [0, 7200].</p><p>default value: 0.</p>
     */
    public void setLoadBalancerHealthCheckGracePeriod(Long LoadBalancerHealthCheckGracePeriod) {
        this.LoadBalancerHealthCheckGracePeriod = LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Get <p>Instance allocation policy. valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.</p><li> LAUNCH_CONFIGURATION represents the traditional startup CONFIGURATION mode.</li><li> SPOT_MIXED represents the SPOT hybrid mode. currently only support hybrid mode when the LAUNCH CONFIGURATION uses pay-as-you-go billing mode. in hybrid mode, the scaling group will scale out based on the SPOT model. the billing type of the associated LAUNCH CONFIGURATION cannot be modified when using hybrid mode.</li>. 
     * @return InstanceAllocationPolicy <p>Instance allocation policy. valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.</p><li> LAUNCH_CONFIGURATION represents the traditional startup CONFIGURATION mode.</li><li> SPOT_MIXED represents the SPOT hybrid mode. currently only support hybrid mode when the LAUNCH CONFIGURATION uses pay-as-you-go billing mode. in hybrid mode, the scaling group will scale out based on the SPOT model. the billing type of the associated LAUNCH CONFIGURATION cannot be modified when using hybrid mode.</li>.
     */
    public String getInstanceAllocationPolicy() {
        return this.InstanceAllocationPolicy;
    }

    /**
     * Set <p>Instance allocation policy. valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.</p><li> LAUNCH_CONFIGURATION represents the traditional startup CONFIGURATION mode.</li><li> SPOT_MIXED represents the SPOT hybrid mode. currently only support hybrid mode when the LAUNCH CONFIGURATION uses pay-as-you-go billing mode. in hybrid mode, the scaling group will scale out based on the SPOT model. the billing type of the associated LAUNCH CONFIGURATION cannot be modified when using hybrid mode.</li>.
     * @param InstanceAllocationPolicy <p>Instance allocation policy. valid values include LAUNCH_CONFIGURATION and SPOT_MIXED.</p><li> LAUNCH_CONFIGURATION represents the traditional startup CONFIGURATION mode.</li><li> SPOT_MIXED represents the SPOT hybrid mode. currently only support hybrid mode when the LAUNCH CONFIGURATION uses pay-as-you-go billing mode. in hybrid mode, the scaling group will scale out based on the SPOT model. the billing type of the associated LAUNCH CONFIGURATION cannot be modified when using hybrid mode.</li>.
     */
    public void setInstanceAllocationPolicy(String InstanceAllocationPolicy) {
        this.InstanceAllocationPolicy = InstanceAllocationPolicy;
    }

    /**
     * Get <p>Allocation policy of instances for each billing type in SPOT hybrid mode.<br>available only when InstanceAllocationPolicy is set to SPOT_MIXED.</p>. 
     * @return SpotMixedAllocationPolicy <p>Allocation policy of instances for each billing type in SPOT hybrid mode.<br>available only when InstanceAllocationPolicy is set to SPOT_MIXED.</p>.
     */
    public SpotMixedAllocationPolicy getSpotMixedAllocationPolicy() {
        return this.SpotMixedAllocationPolicy;
    }

    /**
     * Set <p>Allocation policy of instances for each billing type in SPOT hybrid mode.<br>available only when InstanceAllocationPolicy is set to SPOT_MIXED.</p>.
     * @param SpotMixedAllocationPolicy <p>Allocation policy of instances for each billing type in SPOT hybrid mode.<br>available only when InstanceAllocationPolicy is set to SPOT_MIXED.</p>.
     */
    public void setSpotMixedAllocationPolicy(SpotMixedAllocationPolicy SpotMixedAllocationPolicy) {
        this.SpotMixedAllocationPolicy = SpotMixedAllocationPolicy;
    }

    /**
     * Get <p>The capacity rebalancing feature is only applicable to spot instances within the scaling group. valid values:</p><li> TRUE: enable this feature. when spot instances within the scaling group are about to be automatically recycled by the spot instance service, AS initiates the termination process of spot instances. if a scale-in hook is configured, trigger before termination. after the termination process starts, AS asynchronously initiates scale-out to reach the expected number of instances.</li> <li> FALSE: disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>. 
     * @return CapacityRebalance <p>The capacity rebalancing feature is only applicable to spot instances within the scaling group. valid values:</p><li> TRUE: enable this feature. when spot instances within the scaling group are about to be automatically recycled by the spot instance service, AS initiates the termination process of spot instances. if a scale-in hook is configured, trigger before termination. after the termination process starts, AS asynchronously initiates scale-out to reach the expected number of instances.</li> <li> FALSE: disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>.
     */
    public Boolean getCapacityRebalance() {
        return this.CapacityRebalance;
    }

    /**
     * Set <p>The capacity rebalancing feature is only applicable to spot instances within the scaling group. valid values:</p><li> TRUE: enable this feature. when spot instances within the scaling group are about to be automatically recycled by the spot instance service, AS initiates the termination process of spot instances. if a scale-in hook is configured, trigger before termination. after the termination process starts, AS asynchronously initiates scale-out to reach the expected number of instances.</li> <li> FALSE: disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>.
     * @param CapacityRebalance <p>The capacity rebalancing feature is only applicable to spot instances within the scaling group. valid values:</p><li> TRUE: enable this feature. when spot instances within the scaling group are about to be automatically recycled by the spot instance service, AS initiates the termination process of spot instances. if a scale-in hook is configured, trigger before termination. after the termination process starts, AS asynchronously initiates scale-out to reach the expected number of instances.</li> <li> FALSE: disable this feature. AS waits for the spot instance to be terminated before scaling out to reach the number of instances expected by the scaling group.</li>.
     */
    public void setCapacityRebalance(Boolean CapacityRebalance) {
        this.CapacityRebalance = CapacityRebalance;
    }

    /**
     * Get <P>Instance name sequencing settings. once enabled, append incremental numeric sequence to the names of instances automatically created within the scaling group.</p>. 
     * @return InstanceNameIndexSettings <P>Instance name sequencing settings. once enabled, append incremental numeric sequence to the names of instances automatically created within the scaling group.</p>.
     */
    public InstanceNameIndexSettings getInstanceNameIndexSettings() {
        return this.InstanceNameIndexSettings;
    }

    /**
     * Set <P>Instance name sequencing settings. once enabled, append incremental numeric sequence to the names of instances automatically created within the scaling group.</p>.
     * @param InstanceNameIndexSettings <P>Instance name sequencing settings. once enabled, append incremental numeric sequence to the names of instances automatically created within the scaling group.</p>.
     */
    public void setInstanceNameIndexSettings(InstanceNameIndexSettings InstanceNameIndexSettings) {
        this.InstanceNameIndexSettings = InstanceNameIndexSettings;
    }

    /**
     * Get <P>Instance hostname sequencing settings. once enabled, append incremental numeric sequence to the hostname of instances automatically created within the scaling group.</p>. 
     * @return HostNameIndexSettings <P>Instance hostname sequencing settings. once enabled, append incremental numeric sequence to the hostname of instances automatically created within the scaling group.</p>.
     */
    public HostNameIndexSettings getHostNameIndexSettings() {
        return this.HostNameIndexSettings;
    }

    /**
     * Set <P>Instance hostname sequencing settings. once enabled, append incremental numeric sequence to the hostname of instances automatically created within the scaling group.</p>.
     * @param HostNameIndexSettings <P>Instance hostname sequencing settings. once enabled, append incremental numeric sequence to the hostname of instances automatically created within the scaling group.</p>.
     */
    public void setHostNameIndexSettings(HostNameIndexSettings HostNameIndexSettings) {
        this.HostNameIndexSettings = HostNameIndexSettings;
    }

    /**
     * Get <p>The concurrent scaling up functionality for matching expected numbers cannot be set when InstanceAllocationPolicy is in spot hybrid mode or when ScalingMode is in the scaling-prioritized startup mode. currently only two matching expected number scale-out activities are supported to run concurrently. other types of activities such as specified quantity scale-out or scale-in cannot be specified. set to FALSE indicates disabled.</p>. 
     * @return ConcurrentScaleOutForDesiredCapacity <p>The concurrent scaling up functionality for matching expected numbers cannot be set when InstanceAllocationPolicy is in spot hybrid mode or when ScalingMode is in the scaling-prioritized startup mode. currently only two matching expected number scale-out activities are supported to run concurrently. other types of activities such as specified quantity scale-out or scale-in cannot be specified. set to FALSE indicates disabled.</p>.
     */
    public Boolean getConcurrentScaleOutForDesiredCapacity() {
        return this.ConcurrentScaleOutForDesiredCapacity;
    }

    /**
     * Set <p>The concurrent scaling up functionality for matching expected numbers cannot be set when InstanceAllocationPolicy is in spot hybrid mode or when ScalingMode is in the scaling-prioritized startup mode. currently only two matching expected number scale-out activities are supported to run concurrently. other types of activities such as specified quantity scale-out or scale-in cannot be specified. set to FALSE indicates disabled.</p>.
     * @param ConcurrentScaleOutForDesiredCapacity <p>The concurrent scaling up functionality for matching expected numbers cannot be set when InstanceAllocationPolicy is in spot hybrid mode or when ScalingMode is in the scaling-prioritized startup mode. currently only two matching expected number scale-out activities are supported to run concurrently. other types of activities such as specified quantity scale-out or scale-in cannot be specified. set to FALSE indicates disabled.</p>.
     */
    public void setConcurrentScaleOutForDesiredCapacity(Boolean ConcurrentScaleOutForDesiredCapacity) {
        this.ConcurrentScaleOutForDesiredCapacity = ConcurrentScaleOutForDesiredCapacity;
    }

    public ModifyAutoScalingGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoScalingGroupRequest(ModifyAutoScalingGroupRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.AutoScalingGroupName != null) {
            this.AutoScalingGroupName = new String(source.AutoScalingGroupName);
        }
        if (source.DefaultCooldown != null) {
            this.DefaultCooldown = new Long(source.DefaultCooldown);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
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
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
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
        if (source.HostNameIndexSettings != null) {
            this.HostNameIndexSettings = new HostNameIndexSettings(source.HostNameIndexSettings);
        }
        if (source.ConcurrentScaleOutForDesiredCapacity != null) {
            this.ConcurrentScaleOutForDesiredCapacity = new Boolean(source.ConcurrentScaleOutForDesiredCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "TerminationPolicies.", this.TerminationPolicies);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "ZonesCheckPolicy", this.ZonesCheckPolicy);
        this.setParamObj(map, prefix + "ServiceSettings.", this.ServiceSettings);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamSimple(map, prefix + "MultiZoneSubnetPolicy", this.MultiZoneSubnetPolicy);
        this.setParamSimple(map, prefix + "HealthCheckType", this.HealthCheckType);
        this.setParamSimple(map, prefix + "LoadBalancerHealthCheckGracePeriod", this.LoadBalancerHealthCheckGracePeriod);
        this.setParamSimple(map, prefix + "InstanceAllocationPolicy", this.InstanceAllocationPolicy);
        this.setParamObj(map, prefix + "SpotMixedAllocationPolicy.", this.SpotMixedAllocationPolicy);
        this.setParamSimple(map, prefix + "CapacityRebalance", this.CapacityRebalance);
        this.setParamObj(map, prefix + "InstanceNameIndexSettings.", this.InstanceNameIndexSettings);
        this.setParamObj(map, prefix + "HostNameIndexSettings.", this.HostNameIndexSettings);
        this.setParamSimple(map, prefix + "ConcurrentScaleOutForDesiredCapacity", this.ConcurrentScaleOutForDesiredCapacity);

    }
}

