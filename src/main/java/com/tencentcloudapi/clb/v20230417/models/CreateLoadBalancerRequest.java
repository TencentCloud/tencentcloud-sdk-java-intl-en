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
package com.tencentcloudapi.clb.v20230417.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * <p>Network type of the Cloud Load Balancer instance:<br>OPEN: public network attribute, INTERNAL: private network attribute.</p>
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * <p>Type of the Cloud Load Balancer instance. 1: Common Cloud Load Balancer instance. Currently only support input 1.</p>
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * <p>The name of a Cloud Load Balancer instance takes effect only when creating an instance. Rule: 1-80 characters in internationally compatible languages, including English letters, Chinese characters, digits, hyphens "-", underscores "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden). Note: If the name is identical to that of an existing Cloud Load Balancer instance in the system, the system will automatically generate a name for the newly created CLB instance.</p>
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * <p>The network ID of the backend target device belonging to the Cloud Load Balancer, such as vpc-12345678, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> API. It defaults to DefaultVPC if this parameter is not specified. This parameter is required when creating a private network CLB instance.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>A subnet ID must be specified when you purchase a private network CLB instance under a VPC. The VIP of the private network CLB instance is generated in this subnet. This parameter is required when you create a private network CLB instance but not supported when you create a public network IPv4 CLB instance.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>The project ID associated with the Cloud Load Balancer instance can be obtained through the <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> API. If this parameter is left blank, it will be used as the default project.</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Applicable only to public network CLB. IP version, valid values: IPV4, IPV6, IPv6FullChain, case-insensitive, default value IPV4. Description: A value of IPV6 means IPV6 NAT64 version; a value of IPv6FullChain means IPv6 version.</p>
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * <p>Count of Cloud Load Balancers to create. Default value: 1.</p>
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * <p>Applicable only to public network IPv4 Cloud Load Balancer. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The primary AZ loads traffic. The secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. Currently, primary and secondary AZs are supported only for IPv4 CLB instances in Guangzhou, Shanghai, Nanjing, Beijing, Chengdu, Shenzhen Finance, Hong Kong (China), Seoul, Frankfurt, and Singapore regions. You can call the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API to query the primary AZ list of a region. [If you need to experience this feature, submit a ticket](https://console.cloud.tencent.com/workorder/category).</p>
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * <p>Applicable only to public network load balancing with IPv4 version. Availability zone ID. Designated availability zone to create a CLB instance, for example: ap-guangzhou-1.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Maximum outbound bandwidth under the network billing mode. It applies only to LCU-supported instances of the private network type and all instances of the public network type.</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>Applicable only to public network CLB. Currently, static single-line IP type is supported in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing regions. If you need to experience it, contact business manager to submit a request. After approval, just select CMCC, CUCC, or CTCC as the operator type. Only can be used BANDWIDTH_PACKAGE for network billing mode. If this parameter is not specified, use BGP by default. You can check ISPs supported in a region via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> api query.</p>
    */
    @SerializedName("VipIsp")
    @Expose
    private String VipIsp;

    /**
    * <p>When you purchase Cloud Load Balancer (CLB), you can tag it with up to 20 tag key-value pairs.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>Apply for a Cloud Load Balancer with a designated VIP. This parameter is optional. If this parameter is not specified, the VIP is assigned by system. This parameter is supported for IPv4 and IPv6 types but unsupported for IPv6 NAT64 type.<br>Note: When specifying a VIP to create a private network instance or a public IPv6 BGP instance, creation fails if the VIP is not within the specified VPC subnet or if the VIP is already occupied.</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) will only support billing by bandwidth package (BANDWIDTH_PACKAGE). The attributes of the bandwidth package determine the settlement method. For IPv6 CLB instances purchased by non-promoted users, if the ISP type is not BGP, the bandwidth package ID cannot be specified.</p>
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * <p>Dedicated instance info. This parameter is required when creating a private network CLB instance of exclusive type.</p>
    */
    @SerializedName("ExclusiveCluster")
    @Expose
    private ExclusiveCluster ExclusiveCluster;

    /**
    * <p>Performance capacity specification.</p><ul><li>If you need to create an LCU-supported instance, this parameter is required. Valid values:<ul><li> clb.c2.medium: Standard </li><li> clb.c3.small: Advanced 1 </li><li> clb.c3.medium: Advanced 2 </li><li> clb.c4.small: Super Large 1 </li><li> clb.c4.medium: Super Large 2 </li><li> clb.c4.large: Super Large 3 </li><li> clb.c4.xlarge: Super Large 4 </li></ul></li><li>For domestic site users, this parameter is not required when creating a shared instance. For international site users, the default purchased instance is standard if this parameter is not passed.</li></ul> For specification details, see [Instance Specifications Comparison](https://www.tencentcloud.com/document/product/214/84689?from_cn_redirect=1).
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * <p>A string used to ensure request idempotency. This string is generated by the customer and must be unique among different requests, with a maximum value of no more than 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Whether the cross-regional or cross-Vpc IP binding feature is supported.</p>
    */
    @SerializedName("SnatPro")
    @Expose
    private Boolean SnatPro;

    /**
    * <p>After enabling the cross-regional/cross-Vpc IP binding feature, create a SnatIp.</p>
    */
    @SerializedName("SnatIps")
    @Expose
    private SnatIp [] SnatIps;

    /**
    * <p>Tag of the Stgw exclusive cluster.</p>
    */
    @SerializedName("ClusterTag")
    @Expose
    private String ClusterTag;

    /**
    * <p>Applicable only to public network load balancing with IPv4 version. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The secondary AZ is the availability zone that needs to carry traffic after primary availability zone failure. You can query a region's list of primary/secondary AZs via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API. [If you need to trial the feature, submit a <a href="https://console.cloud.tencent.com/workorder/category">ticket application</a>]</p>
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
    * <p>Unique ID of EIP, such as eip-11112222, applicable only to private network CLB to bind EIP.</p>
    */
    @SerializedName("EipAddressId")
    @Expose
    private String EipAddressId;

    /**
    * <p>Allow CLB traffic to the Target. Enable (true): verify security groups on CLB; deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.</p>
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Boolean LoadBalancerPassToTarget;

    /**
    * <p>Network outbound</p>
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
    * <p>Prepaid billing attributes of the Cloud Load Balancer instance</p>
    */
    @SerializedName("LBChargePrepaid")
    @Expose
    private LBChargePrepaid LBChargePrepaid;

    /**
    * <p>Billing type of the CLB instance. Valid values: POSTPAID_BY_HOUR and PREPAID. Default value: POSTPAID_BY_HOUR.</p>
    */
    @SerializedName("LBChargeType")
    @Expose
    private String LBChargeType;

    /**
    * <p>L7 access log topic ID</p>
    */
    @SerializedName("AccessLogTopicId")
    @Expose
    private String AccessLogTopicId;

    /**
    * <p>Whether layer-7 advanced routing is enabled</p>
    */
    @SerializedName("AdvancedRoute")
    @Expose
    private Boolean AdvancedRoute;

    /**
    * <p>Availability zone affinity info</p>
    */
    @SerializedName("AvailableZoneAffinityInfo")
    @Expose
    private AvailableZoneAffinityInfo AvailableZoneAffinityInfo;

    /**
     * Get <p>Network type of the Cloud Load Balancer instance:<br>OPEN: public network attribute, INTERNAL: private network attribute.</p> 
     * @return LoadBalancerType <p>Network type of the Cloud Load Balancer instance:<br>OPEN: public network attribute, INTERNAL: private network attribute.</p>
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set <p>Network type of the Cloud Load Balancer instance:<br>OPEN: public network attribute, INTERNAL: private network attribute.</p>
     * @param LoadBalancerType <p>Network type of the Cloud Load Balancer instance:<br>OPEN: public network attribute, INTERNAL: private network attribute.</p>
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get <p>Type of the Cloud Load Balancer instance. 1: Common Cloud Load Balancer instance. Currently only support input 1.</p> 
     * @return Forward <p>Type of the Cloud Load Balancer instance. 1: Common Cloud Load Balancer instance. Currently only support input 1.</p>
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set <p>Type of the Cloud Load Balancer instance. 1: Common Cloud Load Balancer instance. Currently only support input 1.</p>
     * @param Forward <p>Type of the Cloud Load Balancer instance. 1: Common Cloud Load Balancer instance. Currently only support input 1.</p>
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get <p>The name of a Cloud Load Balancer instance takes effect only when creating an instance. Rule: 1-80 characters in internationally compatible languages, including English letters, Chinese characters, digits, hyphens "-", underscores "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden). Note: If the name is identical to that of an existing Cloud Load Balancer instance in the system, the system will automatically generate a name for the newly created CLB instance.</p> 
     * @return LoadBalancerName <p>The name of a Cloud Load Balancer instance takes effect only when creating an instance. Rule: 1-80 characters in internationally compatible languages, including English letters, Chinese characters, digits, hyphens "-", underscores "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden). Note: If the name is identical to that of an existing Cloud Load Balancer instance in the system, the system will automatically generate a name for the newly created CLB instance.</p>
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set <p>The name of a Cloud Load Balancer instance takes effect only when creating an instance. Rule: 1-80 characters in internationally compatible languages, including English letters, Chinese characters, digits, hyphens "-", underscores "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden). Note: If the name is identical to that of an existing Cloud Load Balancer instance in the system, the system will automatically generate a name for the newly created CLB instance.</p>
     * @param LoadBalancerName <p>The name of a Cloud Load Balancer instance takes effect only when creating an instance. Rule: 1-80 characters in internationally compatible languages, including English letters, Chinese characters, digits, hyphens "-", underscores "_", and other common characters (Unicode supplementary characters such as emojis and rare Chinese characters are forbidden). Note: If the name is identical to that of an existing Cloud Load Balancer instance in the system, the system will automatically generate a name for the newly created CLB instance.</p>
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get <p>The network ID of the backend target device belonging to the Cloud Load Balancer, such as vpc-12345678, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> API. It defaults to DefaultVPC if this parameter is not specified. This parameter is required when creating a private network CLB instance.</p> 
     * @return VpcId <p>The network ID of the backend target device belonging to the Cloud Load Balancer, such as vpc-12345678, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> API. It defaults to DefaultVPC if this parameter is not specified. This parameter is required when creating a private network CLB instance.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>The network ID of the backend target device belonging to the Cloud Load Balancer, such as vpc-12345678, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> API. It defaults to DefaultVPC if this parameter is not specified. This parameter is required when creating a private network CLB instance.</p>
     * @param VpcId <p>The network ID of the backend target device belonging to the Cloud Load Balancer, such as vpc-12345678, can be obtained through the <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">DescribeVpcs</a> API. It defaults to DefaultVPC if this parameter is not specified. This parameter is required when creating a private network CLB instance.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>A subnet ID must be specified when you purchase a private network CLB instance under a VPC. The VIP of the private network CLB instance is generated in this subnet. This parameter is required when you create a private network CLB instance but not supported when you create a public network IPv4 CLB instance.</p> 
     * @return SubnetId <p>A subnet ID must be specified when you purchase a private network CLB instance under a VPC. The VIP of the private network CLB instance is generated in this subnet. This parameter is required when you create a private network CLB instance but not supported when you create a public network IPv4 CLB instance.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>A subnet ID must be specified when you purchase a private network CLB instance under a VPC. The VIP of the private network CLB instance is generated in this subnet. This parameter is required when you create a private network CLB instance but not supported when you create a public network IPv4 CLB instance.</p>
     * @param SubnetId <p>A subnet ID must be specified when you purchase a private network CLB instance under a VPC. The VIP of the private network CLB instance is generated in this subnet. This parameter is required when you create a private network CLB instance but not supported when you create a public network IPv4 CLB instance.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>The project ID associated with the Cloud Load Balancer instance can be obtained through the <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> API. If this parameter is left blank, it will be used as the default project.</p> 
     * @return ProjectId <p>The project ID associated with the Cloud Load Balancer instance can be obtained through the <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> API. If this parameter is left blank, it will be used as the default project.</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>The project ID associated with the Cloud Load Balancer instance can be obtained through the <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> API. If this parameter is left blank, it will be used as the default project.</p>
     * @param ProjectId <p>The project ID associated with the Cloud Load Balancer instance can be obtained through the <a href="https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1">DescribeProject</a> API. If this parameter is left blank, it will be used as the default project.</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Applicable only to public network CLB. IP version, valid values: IPV4, IPV6, IPv6FullChain, case-insensitive, default value IPV4. Description: A value of IPV6 means IPV6 NAT64 version; a value of IPv6FullChain means IPv6 version.</p> 
     * @return AddressIPVersion <p>Applicable only to public network CLB. IP version, valid values: IPV4, IPV6, IPv6FullChain, case-insensitive, default value IPV4. Description: A value of IPV6 means IPV6 NAT64 version; a value of IPv6FullChain means IPv6 version.</p>
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set <p>Applicable only to public network CLB. IP version, valid values: IPV4, IPV6, IPv6FullChain, case-insensitive, default value IPV4. Description: A value of IPV6 means IPV6 NAT64 version; a value of IPv6FullChain means IPv6 version.</p>
     * @param AddressIPVersion <p>Applicable only to public network CLB. IP version, valid values: IPV4, IPV6, IPv6FullChain, case-insensitive, default value IPV4. Description: A value of IPV6 means IPV6 NAT64 version; a value of IPv6FullChain means IPv6 version.</p>
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get <p>Count of Cloud Load Balancers to create. Default value: 1.</p> 
     * @return Number <p>Count of Cloud Load Balancers to create. Default value: 1.</p>
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set <p>Count of Cloud Load Balancers to create. Default value: 1.</p>
     * @param Number <p>Count of Cloud Load Balancers to create. Default value: 1.</p>
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get <p>Applicable only to public network IPv4 Cloud Load Balancer. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The primary AZ loads traffic. The secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. Currently, primary and secondary AZs are supported only for IPv4 CLB instances in Guangzhou, Shanghai, Nanjing, Beijing, Chengdu, Shenzhen Finance, Hong Kong (China), Seoul, Frankfurt, and Singapore regions. You can call the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API to query the primary AZ list of a region. [If you need to experience this feature, submit a ticket](https://console.cloud.tencent.com/workorder/category).</p> 
     * @return MasterZoneId <p>Applicable only to public network IPv4 Cloud Load Balancer. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The primary AZ loads traffic. The secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. Currently, primary and secondary AZs are supported only for IPv4 CLB instances in Guangzhou, Shanghai, Nanjing, Beijing, Chengdu, Shenzhen Finance, Hong Kong (China), Seoul, Frankfurt, and Singapore regions. You can call the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API to query the primary AZ list of a region. [If you need to experience this feature, submit a ticket](https://console.cloud.tencent.com/workorder/category).</p>
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set <p>Applicable only to public network IPv4 Cloud Load Balancer. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The primary AZ loads traffic. The secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. Currently, primary and secondary AZs are supported only for IPv4 CLB instances in Guangzhou, Shanghai, Nanjing, Beijing, Chengdu, Shenzhen Finance, Hong Kong (China), Seoul, Frankfurt, and Singapore regions. You can call the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API to query the primary AZ list of a region. [If you need to experience this feature, submit a ticket](https://console.cloud.tencent.com/workorder/category).</p>
     * @param MasterZoneId <p>Applicable only to public network IPv4 Cloud Load Balancer. Sets the primary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The primary AZ loads traffic. The secondary AZ does not load traffic by default and is used only if the primary AZ becomes unavailable. Currently, primary and secondary AZs are supported only for IPv4 CLB instances in Guangzhou, Shanghai, Nanjing, Beijing, Chengdu, Shenzhen Finance, Hong Kong (China), Seoul, Frankfurt, and Singapore regions. You can call the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API to query the primary AZ list of a region. [If you need to experience this feature, submit a ticket](https://console.cloud.tencent.com/workorder/category).</p>
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get <p>Applicable only to public network load balancing with IPv4 version. Availability zone ID. Designated availability zone to create a CLB instance, for example: ap-guangzhou-1.</p> 
     * @return ZoneId <p>Applicable only to public network load balancing with IPv4 version. Availability zone ID. Designated availability zone to create a CLB instance, for example: ap-guangzhou-1.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Applicable only to public network load balancing with IPv4 version. Availability zone ID. Designated availability zone to create a CLB instance, for example: ap-guangzhou-1.</p>
     * @param ZoneId <p>Applicable only to public network load balancing with IPv4 version. Availability zone ID. Designated availability zone to create a CLB instance, for example: ap-guangzhou-1.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Maximum outbound bandwidth under the network billing mode. It applies only to LCU-supported instances of the private network type and all instances of the public network type.</p> 
     * @return InternetAccessible <p>Maximum outbound bandwidth under the network billing mode. It applies only to LCU-supported instances of the private network type and all instances of the public network type.</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>Maximum outbound bandwidth under the network billing mode. It applies only to LCU-supported instances of the private network type and all instances of the public network type.</p>
     * @param InternetAccessible <p>Maximum outbound bandwidth under the network billing mode. It applies only to LCU-supported instances of the private network type and all instances of the public network type.</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>Applicable only to public network CLB. Currently, static single-line IP type is supported in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing regions. If you need to experience it, contact business manager to submit a request. After approval, just select CMCC, CUCC, or CTCC as the operator type. Only can be used BANDWIDTH_PACKAGE for network billing mode. If this parameter is not specified, use BGP by default. You can check ISPs supported in a region via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> api query.</p> 
     * @return VipIsp <p>Applicable only to public network CLB. Currently, static single-line IP type is supported in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing regions. If you need to experience it, contact business manager to submit a request. After approval, just select CMCC, CUCC, or CTCC as the operator type. Only can be used BANDWIDTH_PACKAGE for network billing mode. If this parameter is not specified, use BGP by default. You can check ISPs supported in a region via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> api query.</p>
     */
    public String getVipIsp() {
        return this.VipIsp;
    }

    /**
     * Set <p>Applicable only to public network CLB. Currently, static single-line IP type is supported in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing regions. If you need to experience it, contact business manager to submit a request. After approval, just select CMCC, CUCC, or CTCC as the operator type. Only can be used BANDWIDTH_PACKAGE for network billing mode. If this parameter is not specified, use BGP by default. You can check ISPs supported in a region via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> api query.</p>
     * @param VipIsp <p>Applicable only to public network CLB. Currently, static single-line IP type is supported in Guangzhou, Shanghai, Nanjing, Jinan, Hangzhou, Fuzhou, Beijing, Shijiazhuang, Wuhan, Changsha, Chengdu, and Chongqing regions. If you need to experience it, contact business manager to submit a request. After approval, just select CMCC, CUCC, or CTCC as the operator type. Only can be used BANDWIDTH_PACKAGE for network billing mode. If this parameter is not specified, use BGP by default. You can check ISPs supported in a region via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> api query.</p>
     */
    public void setVipIsp(String VipIsp) {
        this.VipIsp = VipIsp;
    }

    /**
     * Get <p>When you purchase Cloud Load Balancer (CLB), you can tag it with up to 20 tag key-value pairs.</p> 
     * @return Tags <p>When you purchase Cloud Load Balancer (CLB), you can tag it with up to 20 tag key-value pairs.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>When you purchase Cloud Load Balancer (CLB), you can tag it with up to 20 tag key-value pairs.</p>
     * @param Tags <p>When you purchase Cloud Load Balancer (CLB), you can tag it with up to 20 tag key-value pairs.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Apply for a Cloud Load Balancer with a designated VIP. This parameter is optional. If this parameter is not specified, the VIP is assigned by system. This parameter is supported for IPv4 and IPv6 types but unsupported for IPv6 NAT64 type.<br>Note: When specifying a VIP to create a private network instance or a public IPv6 BGP instance, creation fails if the VIP is not within the specified VPC subnet or if the VIP is already occupied.</p> 
     * @return Vip <p>Apply for a Cloud Load Balancer with a designated VIP. This parameter is optional. If this parameter is not specified, the VIP is assigned by system. This parameter is supported for IPv4 and IPv6 types but unsupported for IPv6 NAT64 type.<br>Note: When specifying a VIP to create a private network instance or a public IPv6 BGP instance, creation fails if the VIP is not within the specified VPC subnet or if the VIP is already occupied.</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Apply for a Cloud Load Balancer with a designated VIP. This parameter is optional. If this parameter is not specified, the VIP is assigned by system. This parameter is supported for IPv4 and IPv6 types but unsupported for IPv6 NAT64 type.<br>Note: When specifying a VIP to create a private network instance or a public IPv6 BGP instance, creation fails if the VIP is not within the specified VPC subnet or if the VIP is already occupied.</p>
     * @param Vip <p>Apply for a Cloud Load Balancer with a designated VIP. This parameter is optional. If this parameter is not specified, the VIP is assigned by system. This parameter is supported for IPv4 and IPv6 types but unsupported for IPv6 NAT64 type.<br>Note: When specifying a VIP to create a private network instance or a public IPv6 BGP instance, creation fails if the VIP is not within the specified VPC subnet or if the VIP is already occupied.</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) will only support billing by bandwidth package (BANDWIDTH_PACKAGE). The attributes of the bandwidth package determine the settlement method. For IPv6 CLB instances purchased by non-promoted users, if the ISP type is not BGP, the bandwidth package ID cannot be specified.</p> 
     * @return BandwidthPackageId <p>Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) will only support billing by bandwidth package (BANDWIDTH_PACKAGE). The attributes of the bandwidth package determine the settlement method. For IPv6 CLB instances purchased by non-promoted users, if the ISP type is not BGP, the bandwidth package ID cannot be specified.</p>
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set <p>Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) will only support billing by bandwidth package (BANDWIDTH_PACKAGE). The attributes of the bandwidth package determine the settlement method. For IPv6 CLB instances purchased by non-promoted users, if the ISP type is not BGP, the bandwidth package ID cannot be specified.</p>
     * @param BandwidthPackageId <p>Bandwidth package ID. If this parameter is specified, the network billing mode (InternetAccessible.InternetChargeType) will only support billing by bandwidth package (BANDWIDTH_PACKAGE). The attributes of the bandwidth package determine the settlement method. For IPv6 CLB instances purchased by non-promoted users, if the ISP type is not BGP, the bandwidth package ID cannot be specified.</p>
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get <p>Dedicated instance info. This parameter is required when creating a private network CLB instance of exclusive type.</p> 
     * @return ExclusiveCluster <p>Dedicated instance info. This parameter is required when creating a private network CLB instance of exclusive type.</p>
     */
    public ExclusiveCluster getExclusiveCluster() {
        return this.ExclusiveCluster;
    }

    /**
     * Set <p>Dedicated instance info. This parameter is required when creating a private network CLB instance of exclusive type.</p>
     * @param ExclusiveCluster <p>Dedicated instance info. This parameter is required when creating a private network CLB instance of exclusive type.</p>
     */
    public void setExclusiveCluster(ExclusiveCluster ExclusiveCluster) {
        this.ExclusiveCluster = ExclusiveCluster;
    }

    /**
     * Get <p>Performance capacity specification.</p><ul><li>If you need to create an LCU-supported instance, this parameter is required. Valid values:<ul><li> clb.c2.medium: Standard </li><li> clb.c3.small: Advanced 1 </li><li> clb.c3.medium: Advanced 2 </li><li> clb.c4.small: Super Large 1 </li><li> clb.c4.medium: Super Large 2 </li><li> clb.c4.large: Super Large 3 </li><li> clb.c4.xlarge: Super Large 4 </li></ul></li><li>For domestic site users, this parameter is not required when creating a shared instance. For international site users, the default purchased instance is standard if this parameter is not passed.</li></ul> For specification details, see [Instance Specifications Comparison](https://www.tencentcloud.com/document/product/214/84689?from_cn_redirect=1). 
     * @return SlaType <p>Performance capacity specification.</p><ul><li>If you need to create an LCU-supported instance, this parameter is required. Valid values:<ul><li> clb.c2.medium: Standard </li><li> clb.c3.small: Advanced 1 </li><li> clb.c3.medium: Advanced 2 </li><li> clb.c4.small: Super Large 1 </li><li> clb.c4.medium: Super Large 2 </li><li> clb.c4.large: Super Large 3 </li><li> clb.c4.xlarge: Super Large 4 </li></ul></li><li>For domestic site users, this parameter is not required when creating a shared instance. For international site users, the default purchased instance is standard if this parameter is not passed.</li></ul> For specification details, see [Instance Specifications Comparison](https://www.tencentcloud.com/document/product/214/84689?from_cn_redirect=1).
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set <p>Performance capacity specification.</p><ul><li>If you need to create an LCU-supported instance, this parameter is required. Valid values:<ul><li> clb.c2.medium: Standard </li><li> clb.c3.small: Advanced 1 </li><li> clb.c3.medium: Advanced 2 </li><li> clb.c4.small: Super Large 1 </li><li> clb.c4.medium: Super Large 2 </li><li> clb.c4.large: Super Large 3 </li><li> clb.c4.xlarge: Super Large 4 </li></ul></li><li>For domestic site users, this parameter is not required when creating a shared instance. For international site users, the default purchased instance is standard if this parameter is not passed.</li></ul> For specification details, see [Instance Specifications Comparison](https://www.tencentcloud.com/document/product/214/84689?from_cn_redirect=1).
     * @param SlaType <p>Performance capacity specification.</p><ul><li>If you need to create an LCU-supported instance, this parameter is required. Valid values:<ul><li> clb.c2.medium: Standard </li><li> clb.c3.small: Advanced 1 </li><li> clb.c3.medium: Advanced 2 </li><li> clb.c4.small: Super Large 1 </li><li> clb.c4.medium: Super Large 2 </li><li> clb.c4.large: Super Large 3 </li><li> clb.c4.xlarge: Super Large 4 </li></ul></li><li>For domestic site users, this parameter is not required when creating a shared instance. For international site users, the default purchased instance is standard if this parameter is not passed.</li></ul> For specification details, see [Instance Specifications Comparison](https://www.tencentcloud.com/document/product/214/84689?from_cn_redirect=1).
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get <p>A string used to ensure request idempotency. This string is generated by the customer and must be unique among different requests, with a maximum value of no more than 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p> 
     * @return ClientToken <p>A string used to ensure request idempotency. This string is generated by the customer and must be unique among different requests, with a maximum value of no more than 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>A string used to ensure request idempotency. This string is generated by the customer and must be unique among different requests, with a maximum value of no more than 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p>
     * @param ClientToken <p>A string used to ensure request idempotency. This string is generated by the customer and must be unique among different requests, with a maximum value of no more than 64 ASCII characters. If not specified, request idempotency cannot be guaranteed.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Whether the cross-regional or cross-Vpc IP binding feature is supported.</p> 
     * @return SnatPro <p>Whether the cross-regional or cross-Vpc IP binding feature is supported.</p>
     */
    public Boolean getSnatPro() {
        return this.SnatPro;
    }

    /**
     * Set <p>Whether the cross-regional or cross-Vpc IP binding feature is supported.</p>
     * @param SnatPro <p>Whether the cross-regional or cross-Vpc IP binding feature is supported.</p>
     */
    public void setSnatPro(Boolean SnatPro) {
        this.SnatPro = SnatPro;
    }

    /**
     * Get <p>After enabling the cross-regional/cross-Vpc IP binding feature, create a SnatIp.</p> 
     * @return SnatIps <p>After enabling the cross-regional/cross-Vpc IP binding feature, create a SnatIp.</p>
     */
    public SnatIp [] getSnatIps() {
        return this.SnatIps;
    }

    /**
     * Set <p>After enabling the cross-regional/cross-Vpc IP binding feature, create a SnatIp.</p>
     * @param SnatIps <p>After enabling the cross-regional/cross-Vpc IP binding feature, create a SnatIp.</p>
     */
    public void setSnatIps(SnatIp [] SnatIps) {
        this.SnatIps = SnatIps;
    }

    /**
     * Get <p>Tag of the Stgw exclusive cluster.</p> 
     * @return ClusterTag <p>Tag of the Stgw exclusive cluster.</p>
     */
    public String getClusterTag() {
        return this.ClusterTag;
    }

    /**
     * Set <p>Tag of the Stgw exclusive cluster.</p>
     * @param ClusterTag <p>Tag of the Stgw exclusive cluster.</p>
     */
    public void setClusterTag(String ClusterTag) {
        this.ClusterTag = ClusterTag;
    }

    /**
     * Get <p>Applicable only to public network load balancing with IPv4 version. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The secondary AZ is the availability zone that needs to carry traffic after primary availability zone failure. You can query a region's list of primary/secondary AZs via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API. [If you need to trial the feature, submit a <a href="https://console.cloud.tencent.com/workorder/category">ticket application</a>]</p> 
     * @return SlaveZoneId <p>Applicable only to public network load balancing with IPv4 version. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The secondary AZ is the availability zone that needs to carry traffic after primary availability zone failure. You can query a region's list of primary/secondary AZs via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API. [If you need to trial the feature, submit a <a href="https://console.cloud.tencent.com/workorder/category">ticket application</a>]</p>
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set <p>Applicable only to public network load balancing with IPv4 version. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The secondary AZ is the availability zone that needs to carry traffic after primary availability zone failure. You can query a region's list of primary/secondary AZs via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API. [If you need to trial the feature, submit a <a href="https://console.cloud.tencent.com/workorder/category">ticket application</a>]</p>
     * @param SlaveZoneId <p>Applicable only to public network load balancing with IPv4 version. Sets the secondary AZ ID for cross-AZ disaster recovery, such as 100001 or ap-guangzhou-1.<br>Note: The secondary AZ is the availability zone that needs to carry traffic after primary availability zone failure. You can query a region's list of primary/secondary AZs via the <a href="https://www.tencentcloud.com/document/api/214/70213?from_cn_redirect=1">DescribeResources</a> API. [If you need to trial the feature, submit a <a href="https://console.cloud.tencent.com/workorder/category">ticket application</a>]</p>
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    /**
     * Get <p>Unique ID of EIP, such as eip-11112222, applicable only to private network CLB to bind EIP.</p> 
     * @return EipAddressId <p>Unique ID of EIP, such as eip-11112222, applicable only to private network CLB to bind EIP.</p>
     */
    public String getEipAddressId() {
        return this.EipAddressId;
    }

    /**
     * Set <p>Unique ID of EIP, such as eip-11112222, applicable only to private network CLB to bind EIP.</p>
     * @param EipAddressId <p>Unique ID of EIP, such as eip-11112222, applicable only to private network CLB to bind EIP.</p>
     */
    public void setEipAddressId(String EipAddressId) {
        this.EipAddressId = EipAddressId;
    }

    /**
     * Get <p>Allow CLB traffic to the Target. Enable (true): verify security groups on CLB; deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.</p> 
     * @return LoadBalancerPassToTarget <p>Allow CLB traffic to the Target. Enable (true): verify security groups on CLB; deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.</p>
     */
    public Boolean getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set <p>Allow CLB traffic to the Target. Enable (true): verify security groups on CLB; deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.</p>
     * @param LoadBalancerPassToTarget <p>Allow CLB traffic to the Target. Enable (true): verify security groups on CLB; deny CLB traffic to the Target (false): verify security groups on both CLB and backend instances.</p>
     */
    public void setLoadBalancerPassToTarget(Boolean LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get <p>Network outbound</p> 
     * @return Egress <p>Network outbound</p>
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set <p>Network outbound</p>
     * @param Egress <p>Network outbound</p>
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    /**
     * Get <p>Prepaid billing attributes of the Cloud Load Balancer instance</p> 
     * @return LBChargePrepaid <p>Prepaid billing attributes of the Cloud Load Balancer instance</p>
     */
    public LBChargePrepaid getLBChargePrepaid() {
        return this.LBChargePrepaid;
    }

    /**
     * Set <p>Prepaid billing attributes of the Cloud Load Balancer instance</p>
     * @param LBChargePrepaid <p>Prepaid billing attributes of the Cloud Load Balancer instance</p>
     */
    public void setLBChargePrepaid(LBChargePrepaid LBChargePrepaid) {
        this.LBChargePrepaid = LBChargePrepaid;
    }

    /**
     * Get <p>Billing type of the CLB instance. Valid values: POSTPAID_BY_HOUR and PREPAID. Default value: POSTPAID_BY_HOUR.</p> 
     * @return LBChargeType <p>Billing type of the CLB instance. Valid values: POSTPAID_BY_HOUR and PREPAID. Default value: POSTPAID_BY_HOUR.</p>
     */
    public String getLBChargeType() {
        return this.LBChargeType;
    }

    /**
     * Set <p>Billing type of the CLB instance. Valid values: POSTPAID_BY_HOUR and PREPAID. Default value: POSTPAID_BY_HOUR.</p>
     * @param LBChargeType <p>Billing type of the CLB instance. Valid values: POSTPAID_BY_HOUR and PREPAID. Default value: POSTPAID_BY_HOUR.</p>
     */
    public void setLBChargeType(String LBChargeType) {
        this.LBChargeType = LBChargeType;
    }

    /**
     * Get <p>L7 access log topic ID</p> 
     * @return AccessLogTopicId <p>L7 access log topic ID</p>
     */
    public String getAccessLogTopicId() {
        return this.AccessLogTopicId;
    }

    /**
     * Set <p>L7 access log topic ID</p>
     * @param AccessLogTopicId <p>L7 access log topic ID</p>
     */
    public void setAccessLogTopicId(String AccessLogTopicId) {
        this.AccessLogTopicId = AccessLogTopicId;
    }

    /**
     * Get <p>Whether layer-7 advanced routing is enabled</p> 
     * @return AdvancedRoute <p>Whether layer-7 advanced routing is enabled</p>
     */
    public Boolean getAdvancedRoute() {
        return this.AdvancedRoute;
    }

    /**
     * Set <p>Whether layer-7 advanced routing is enabled</p>
     * @param AdvancedRoute <p>Whether layer-7 advanced routing is enabled</p>
     */
    public void setAdvancedRoute(Boolean AdvancedRoute) {
        this.AdvancedRoute = AdvancedRoute;
    }

    /**
     * Get <p>Availability zone affinity info</p> 
     * @return AvailableZoneAffinityInfo <p>Availability zone affinity info</p>
     */
    public AvailableZoneAffinityInfo getAvailableZoneAffinityInfo() {
        return this.AvailableZoneAffinityInfo;
    }

    /**
     * Set <p>Availability zone affinity info</p>
     * @param AvailableZoneAffinityInfo <p>Availability zone affinity info</p>
     */
    public void setAvailableZoneAffinityInfo(AvailableZoneAffinityInfo AvailableZoneAffinityInfo) {
        this.AvailableZoneAffinityInfo = AvailableZoneAffinityInfo;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.MasterZoneId != null) {
            this.MasterZoneId = new String(source.MasterZoneId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.VipIsp != null) {
            this.VipIsp = new String(source.VipIsp);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.ExclusiveCluster != null) {
            this.ExclusiveCluster = new ExclusiveCluster(source.ExclusiveCluster);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.SnatPro != null) {
            this.SnatPro = new Boolean(source.SnatPro);
        }
        if (source.SnatIps != null) {
            this.SnatIps = new SnatIp[source.SnatIps.length];
            for (int i = 0; i < source.SnatIps.length; i++) {
                this.SnatIps[i] = new SnatIp(source.SnatIps[i]);
            }
        }
        if (source.ClusterTag != null) {
            this.ClusterTag = new String(source.ClusterTag);
        }
        if (source.SlaveZoneId != null) {
            this.SlaveZoneId = new String(source.SlaveZoneId);
        }
        if (source.EipAddressId != null) {
            this.EipAddressId = new String(source.EipAddressId);
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Boolean(source.LoadBalancerPassToTarget);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
        if (source.LBChargePrepaid != null) {
            this.LBChargePrepaid = new LBChargePrepaid(source.LBChargePrepaid);
        }
        if (source.LBChargeType != null) {
            this.LBChargeType = new String(source.LBChargeType);
        }
        if (source.AccessLogTopicId != null) {
            this.AccessLogTopicId = new String(source.AccessLogTopicId);
        }
        if (source.AdvancedRoute != null) {
            this.AdvancedRoute = new Boolean(source.AdvancedRoute);
        }
        if (source.AvailableZoneAffinityInfo != null) {
            this.AvailableZoneAffinityInfo = new AvailableZoneAffinityInfo(source.AvailableZoneAffinityInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "VipIsp", this.VipIsp);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamObj(map, prefix + "ExclusiveCluster.", this.ExclusiveCluster);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "SnatPro", this.SnatPro);
        this.setParamArrayObj(map, prefix + "SnatIps.", this.SnatIps);
        this.setParamSimple(map, prefix + "ClusterTag", this.ClusterTag);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);
        this.setParamSimple(map, prefix + "EipAddressId", this.EipAddressId);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "Egress", this.Egress);
        this.setParamObj(map, prefix + "LBChargePrepaid.", this.LBChargePrepaid);
        this.setParamSimple(map, prefix + "LBChargeType", this.LBChargeType);
        this.setParamSimple(map, prefix + "AccessLogTopicId", this.AccessLogTopicId);
        this.setParamSimple(map, prefix + "AdvancedRoute", this.AdvancedRoute);
        this.setParamObj(map, prefix + "AvailableZoneAffinityInfo.", this.AvailableZoneAffinityInfo);

    }
}

